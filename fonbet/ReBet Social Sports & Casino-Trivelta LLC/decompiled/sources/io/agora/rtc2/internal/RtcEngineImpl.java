package io.agora.rtc2.internal;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.projection.MediaProjection;
import android.net.wifi.WifiManager;
import android.opengl.EGL14;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.plaid.internal.EnumC3631g;
import io.agora.base.ColorSpace;
import io.agora.base.VideoFrame;
import io.agora.base.internal.BuildConfig;
import io.agora.base.internal.CalledByNative;
import io.agora.base.internal.video.EglBase10;
import io.agora.base.internal.video.EglBase14;
import io.agora.mediaplayer.IMediaPlayer;
import io.agora.mediaplayer.IMediaPlayerAudioFrameObserver;
import io.agora.mediaplayer.IMediaPlayerCacheManager;
import io.agora.mediaplayer.IMediaPlayerObserver;
import io.agora.mediaplayer.IMediaPlayerVideoFrameObserver;
import io.agora.mediaplayer.data.MediaPlayerSource;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.rtc2.AgoraMediaRecorder;
import io.agora.rtc2.ChannelMediaOptions;
import io.agora.rtc2.ClientRoleOptions;
import io.agora.rtc2.Constants;
import io.agora.rtc2.DataStreamConfig;
import io.agora.rtc2.DeviceInfo;
import io.agora.rtc2.DirectCdnStreamingMediaOptions;
import io.agora.rtc2.EchoTestConfiguration;
import io.agora.rtc2.EncodedVideoTrackOptions;
import io.agora.rtc2.ExtensionInfo;
import io.agora.rtc2.IAudioEffectManager;
import io.agora.rtc2.IAudioEncodedFrameObserver;
import io.agora.rtc2.IAudioFrameObserver;
import io.agora.rtc2.IDirectCdnStreamingEventHandler;
import io.agora.rtc2.IH265Transcoder;
import io.agora.rtc2.IH265TranscoderObserver;
import io.agora.rtc2.IMediaRecorderCallback;
import io.agora.rtc2.IMetadataObserver;
import io.agora.rtc2.IRtcEngineEventHandler;
import io.agora.rtc2.IRtcEngineReleaseCallback;
import io.agora.rtc2.IVideoEffectObject;
import io.agora.rtc2.LeaveChannelOptions;
import io.agora.rtc2.LocalAudioMixerConfiguration;
import io.agora.rtc2.LocalTranscoderConfiguration;
import io.agora.rtc2.RecorderStreamInfo;
import io.agora.rtc2.RtcConnection;
import io.agora.rtc2.RtcEngineConfig;
import io.agora.rtc2.RtcEngineInternal;
import io.agora.rtc2.ScreenCaptureParameters;
import io.agora.rtc2.SimulcastConfig;
import io.agora.rtc2.SimulcastStreamConfig;
import io.agora.rtc2.SpatialAudioParams;
import io.agora.rtc2.UserInfo;
import io.agora.rtc2.audio.AdvancedAudioOptions;
import io.agora.rtc2.audio.AgoraRhythmPlayerConfig;
import io.agora.rtc2.audio.AudioTrackConfig;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.rtc2.internal.RtcEngineMessage;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.proxy.LocalAccessPointConfiguration;
import io.agora.rtc2.video.AgoraFocalLengthInfo;
import io.agora.rtc2.video.AgoraImage;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.rtc2.video.BeautyOptions;
import io.agora.rtc2.video.CameraCapturerConfiguration;
import io.agora.rtc2.video.ChannelMediaInfo;
import io.agora.rtc2.video.ChannelMediaRelayConfiguration;
import io.agora.rtc2.video.CodecCapInfo;
import io.agora.rtc2.video.ColorEnhanceOptions;
import io.agora.rtc2.video.ContentInspectConfig;
import io.agora.rtc2.video.EncodedVideoFrameInfo;
import io.agora.rtc2.video.FaceShapeAreaOptions;
import io.agora.rtc2.video.FaceShapeBeautyOptions;
import io.agora.rtc2.video.FilterEffectOptions;
import io.agora.rtc2.video.IFaceInfoObserver;
import io.agora.rtc2.video.IVideoEncodedFrameObserver;
import io.agora.rtc2.video.IVideoFrameObserver;
import io.agora.rtc2.video.ImageTrackOptions;
import io.agora.rtc2.video.LowLightEnhanceOptions;
import io.agora.rtc2.video.SegmentationProperty;
import io.agora.rtc2.video.SnapshotConfig;
import io.agora.rtc2.video.VideoCanvas;
import io.agora.rtc2.video.VideoDenoiserOptions;
import io.agora.rtc2.video.VideoEncoderConfiguration;
import io.agora.rtc2.video.VideoSubscriptionOptions;
import io.agora.rtc2.video.VirtualBackgroundSource;
import io.agora.rtc2.video.WatermarkConfig;
import io.agora.rtc2.video.WatermarkOptions;
import io.agora.utils2.internal.CommonUtility;
import io.agora.utils2.internal.Logging;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* loaded from: classes3.dex */
public class RtcEngineImpl extends RtcEngineInternal implements IAudioEffectManager {
    public static final String TAG = "RtcEngine";
    private static ConcurrentHashMap<String, ExtensionLoadState> mLoadedExtensions = new ConcurrentHashMap<>();
    static String nativeLibraryName = "agora-rtc-sdk";
    static String nativeLibraryPrefix = "lib";
    static String nativeLibrarySurffix = ".so";
    private static boolean sLibLoaded = false;
    private WeakReference<Context> mContext;
    private long mNativeHandle;
    private int mExSourceAudioSampleRate = 0;
    private int mExSourceAudioChannels = 0;
    private int mExSinkAudioSampleRate = 0;
    private int mExSinkAudioChannels = 0;
    private int mPushVideoFrameInvalidCnt = 0;
    private final ConcurrentHashMap<IRtcEngineEventHandler, RtcEngineEventHandlerProxy> mRtcHandlers = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Pair<String, Object>, ArrayList<RtcEngineEventHandlerProxy>> mRtcExHandlerMap = new ConcurrentHashMap<>();
    private WifiManager.WifiLock mWifiLock = null;

    public enum ExtensionLoadState {
        LOADED,
        LOAD_FAIL
    }

    public static class InitResult {
        private long nativeHandle;
        private int retVal;

        @CalledByNative("InitResult")
        public InitResult(int i10, long j10) {
            this.retVal = i10;
            this.nativeHandle = j10;
        }
    }

    public RtcEngineImpl(RtcEngineConfig rtcEngineConfig) {
        this.mNativeHandle = 0L;
        this.mContext = null;
        for (String str : rtcEngineConfig.mExtensionList) {
            Log.i(TAG, "load extension: " + str);
            safeLoadLibrary(rtcEngineConfig.mNativeLibPath, str);
        }
        this.mContext = new WeakReference<>(rtcEngineConfig.mContext);
        addHandler(rtcEngineConfig.mEventHandler);
        InitResult initResult = (InitResult) nativeObjectInit(rtcEngineConfig);
        if (initResult.retVal != 0) {
            throw new IllegalArgumentException(String.format(Locale.getDefault(), "cannot initialize Agora Rtc Engine, error=%d", Integer.valueOf(Math.abs(initResult.retVal))));
        }
        this.mNativeHandle = initResult.nativeHandle;
    }

    private void addHandlerExKey(Pair<String, Object> pair, IRtcEngineEventHandler iRtcEngineEventHandler) {
        ArrayList<RtcEngineEventHandlerProxy> arrayList = this.mRtcExHandlerMap.get(pair);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<RtcEngineEventHandlerProxy> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RtcEngineEventHandlerProxy next = it.next();
            if (next.getHandler() == iRtcEngineEventHandler) {
                arrayList.remove(next);
                break;
            }
        }
        arrayList.add(new RtcEngineEventHandlerProxy(iRtcEngineEventHandler));
        this.mRtcExHandlerMap.put(pair, arrayList);
    }

    private boolean checkRelayConfiguration(ChannelMediaRelayConfiguration channelMediaRelayConfiguration) {
        if (channelMediaRelayConfiguration == null || channelMediaRelayConfiguration.getSrcChannelMediaInfo() == null || channelMediaRelayConfiguration.getDestChannelMediaInfos() == null || channelMediaRelayConfiguration.getDestChannelMediaInfos().isEmpty()) {
            return false;
        }
        for (ChannelMediaInfo channelMediaInfo : channelMediaRelayConfiguration.getDestChannelMediaInfos().values()) {
            if (channelMediaInfo == null || TextUtils.isEmpty(channelMediaInfo.getChannelName())) {
                return false;
            }
        }
        return true;
    }

    private void doMonitorSystemEvent(Context context) {
        WifiManager.WifiLock wifiLock;
        if (CommonUtility.getInstance(context).getNetworkType() == 2 && (wifiLock = this.mWifiLock) != null) {
            wifiLock.acquire();
            Logging.i(TAG, "hp connection mode detected");
        }
    }

    private void doStopMonitorSystemEvent() {
        WifiManager.WifiLock wifiLock = this.mWifiLock;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.mWifiLock.release();
        Logging.i(TAG, "hp connection mode ended");
    }

    private static String formatString(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String getChannelId(RtcConnection rtcConnection) {
        if (rtcConnection != null) {
            return rtcConnection.channelId;
        }
        return null;
    }

    public static String getNativeLibFullPath(String str, String str2) {
        String str3 = nativeLibraryPrefix + str2 + nativeLibrarySurffix;
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String str4 = File.separator;
        if (str.endsWith(str4)) {
            return str + str3;
        }
        return str + str4 + str3;
    }

    private int[] getRect(Rect rect) {
        if (rect == null) {
            return null;
        }
        int i10 = rect.left;
        int i11 = rect.top;
        return new int[]{i10, i11, rect.right - i10, rect.bottom - i11};
    }

    public static int getUserId(RtcConnection rtcConnection) {
        if (rtcConnection != null) {
            return rtcConnection.localUid;
        }
        return 0;
    }

    public static synchronized boolean initializeNativeLibs() {
        boolean initializeNativeLibs;
        synchronized (RtcEngineImpl.class) {
            initializeNativeLibs = initializeNativeLibs(null);
        }
        return initializeNativeLibs;
    }

    private native int nativeAddOrUpdateVideoEffect(long j10, int i10, String str);

    private native int nativeAddVideoWatermark(long j10, String str, boolean z10, int[] iArr, int[] iArr2);

    private native int nativeAddVideoWatermark2(long j10, WatermarkConfig watermarkConfig);

    private native int nativeAddVideoWatermark2Ex(long j10, WatermarkConfig watermarkConfig, String str, int i10);

    private native int nativeAddVideoWatermarkEx(long j10, String str, boolean z10, int[] iArr, int[] iArr2, String str2, int i10);

    private native int nativeAdjustAudioMixingPlayoutVolume(long j10, int i10);

    private native int nativeAdjustAudioMixingPublishVolume(long j10, int i10);

    private native int nativeAdjustAudioMixingVolume(long j10, int i10);

    private native int nativeAdjustCustomAudioPlayoutVolume(long j10, int i10, int i11);

    private native int nativeAdjustCustomAudioPublishVolume(long j10, int i10, int i11);

    private native int nativeAdjustPlaybackSignalVolume(long j10, int i10);

    private native int nativeAdjustRecordingSignalVolume(long j10, int i10, String str, int i11);

    private native int nativeAdjustUserPlaybackSignalVolume(long j10, int i10, int i11, String str, int i12);

    private native int nativeClearVideoWatermarkEx(long j10, String str, int i10);

    private native int nativeClearVideoWatermarks(long j10);

    private native int nativeComplain(long j10, String str, String str2);

    private native int nativeConfigRhythmPlayer(long j10, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    private native int nativeCreateCustomAudioTrack(long j10, int i10, boolean z10, boolean z11);

    private native int nativeCreateCustomEncodedVideoTrack(long j10, EncodedVideoTrackOptions encodedVideoTrackOptions);

    private native int nativeCreateCustomVideoTrack(long j10);

    private native int nativeCreateDataStream(long j10, boolean z10, boolean z11, String str, int i10);

    private native int nativeCreateDataStream2(long j10, boolean z10, boolean z11, String str, int i10);

    private native int nativeCreateH265Transcoder(long j10);

    private native int nativeCreateMediaPlayer(long j10);

    private native int nativeCreateVideoEffectObject(long j10, String str, int i10);

    private static native int nativeDestroy(long j10, Object obj);

    private native int nativeDestroyCustomAudioTrack(long j10, int i10);

    private native int nativeDestroyCustomEncodedVideoTrack(long j10, int i10);

    private native int nativeDestroyCustomVideoTrack(long j10, int i10);

    private native int nativeDestroyVideoEffectObject(long j10);

    private native int nativeDisableAudioSpectrumMonitor(long j10);

    private native int nativeDisableVideo(long j10);

    private native int nativeEnableAudio(long j10, boolean z10);

    private native int nativeEnableAudioSpectrumMonitor(long j10, int i10);

    private native int nativeEnableAudioVolumeIndication(long j10, int i10, int i11, boolean z10, String str, int i12);

    private native int nativeEnableContentInspect(long j10, boolean z10, byte[] bArr, String str, int i10);

    private native int nativeEnableCustomAudioLocalPlayback(long j10, int i10, boolean z10);

    private native int nativeEnableDualStreamModeEx(long j10, boolean z10, SimulcastStreamConfig simulcastStreamConfig, String str, int i10);

    private native int nativeEnableEncryption(long j10, boolean z10, int i10, String str, byte[] bArr, boolean z11);

    private native int nativeEnableEncryptionEx(long j10, boolean z10, int i10, String str, byte[] bArr, boolean z11, String str2, int i11);

    private native int nativeEnableExtension(long j10, String str, String str2, boolean z10, int i10);

    private native int nativeEnableExtension2(long j10, String str, String str2, boolean z10, int i10, int i11, String str3, int i12);

    private native int nativeEnableExternalAudioSourceLocalPlayback(long j10, boolean z10);

    private native int nativeEnableFaceDetection(long j10, boolean z10);

    private native int nativeEnableInEarMonitoring(long j10, boolean z10, int i10);

    private native int nativeEnableInstantMediaRendering(long j10);

    private native int nativeEnableLocalAudio(long j10, boolean z10);

    private native int nativeEnableLocalVideo(long j10, boolean z10);

    private native int nativeEnableSoundPositionIndication(long j10, boolean z10);

    private native int nativeEnableSpatialAudio(long j10, boolean z10);

    private native int nativeEnableVideo(long j10);

    private native int nativeEnableVideoImageSource(long j10, boolean z10, String str, int i10, int i11);

    private native int nativeEnableVirtualBackground(long j10, boolean z10, int i10, int i11, String str, int i12, int i13, float f10, int i14, int i15);

    private native int nativeEnableVoiceAITuner(long j10, boolean z10, int i10);

    private native DeviceInfo nativeGetAudioDeviceInfo(long j10);

    private native int nativeGetAudioMixingCurrentPosition(long j10);

    private native int nativeGetAudioMixingDuration(long j10);

    private native int nativeGetAudioMixingPlayoutVolume(long j10);

    private native int nativeGetAudioMixingPublishVolume(long j10);

    private native int nativeGetAudioTrackCount(long j10);

    private native String nativeGetCallId(long j10);

    private native String nativeGetCallIdEx(long j10, String str, int i10);

    private native boolean nativeGetCameraAutoFocusFaceModeSupported(long j10);

    private native boolean nativeGetCameraExposurePositionSupported(long j10);

    private native boolean nativeGetCameraExposureSupported(long j10);

    private native boolean nativeGetCameraFaceDetectSupported(long j10);

    private native boolean nativeGetCameraFocusSupported(long j10);

    private native float nativeGetCameraMaxZoomFactor(long j10);

    private native boolean nativeGetCameraTorchSupported(long j10);

    private native boolean nativeGetCameraZoomSupported(long j10);

    private native int nativeGetConnectionState(long j10, String str, int i10);

    private native long nativeGetCurrentMonotonicTimeInMs(long j10);

    private native int nativeGetEffectCurrentPosition(long j10, int i10);

    private native int nativeGetEffectDuration(long j10, String str);

    private native double nativeGetEffectsVolume(long j10);

    public static native String nativeGetErrorDescription(int i10);

    private native String nativeGetExtensionProperty(long j10, String str, String str2, String str3, int i10);

    private native String nativeGetExtensionProperty2(long j10, String str, String str2, String str3, int i10, int i11, String str4, int i12);

    private native FaceShapeAreaOptions nativeGetFaceShapeAreaOptions(long j10, int i10, int i11);

    private native FaceShapeBeautyOptions nativeGetFaceShapeBeautyOptions(long j10, int i10);

    public static native String nativeGetMediaEngineVersion();

    private native long nativeGetMediaPlayer(long j10, int i10);

    private native int nativeGetNetworkType(long j10);

    private native long nativeGetNtpWallTimeInMs(long j10);

    private native String nativeGetParameter(long j10, String str, String str2);

    private native String nativeGetParameters(long j10, String str);

    private native String nativeGetProfile(long j10);

    private native long nativeGetRtcEngine(long j10);

    public static native String nativeGetSdkVersion();

    private native int nativeGetUserInfoByUid(long j10, int i10, UserInfo userInfo);

    private native int nativeGetUserInfoByUidEx(long j10, int i10, UserInfo userInfo, String str, int i11);

    private native int nativeGetUserInfoByUserAccount(long j10, String str, UserInfo userInfo);

    private native int nativeGetUserInfoByUserAccountEx(long j10, String str, UserInfo userInfo, String str2, int i10);

    private native boolean nativeGetVideoEffectBoolParam(long j10, String str, String str2);

    private native float nativeGetVideoEffectFloatParam(long j10, String str, String str2);

    private native int nativeGetVideoEffectIntParam(long j10, String str, String str2);

    private native int nativeGetVolumeOfEffect(long j10, int i10);

    private native int nativeH265TranscoderEnableTranscode(long j10, String str, String str2, int i10);

    private native int nativeH265TranscoderQueryChannel(long j10, String str, String str2, int i10);

    private native int nativeH265TranscoderRegisterObserver(long j10, IH265TranscoderObserver iH265TranscoderObserver);

    private native int nativeH265TranscoderTriggerTranscode(long j10, String str, String str2, int i10);

    private native int nativeH265TranscoderUnregisterObserver(long j10, IH265TranscoderObserver iH265TranscoderObserver);

    private native int nativeInitMediaPlayerCacheManager(long j10);

    private native boolean nativeIsFeatureAvailableOnDevice(long j10, int i10);

    private native boolean nativeIsSpeakerphoneEnabled(long j10);

    private native int nativeJoinChannel(long j10, String str, String str2, String str3, int i10);

    private native int nativeJoinChannel2(long j10, String str, String str2, int i10, ChannelMediaOptions channelMediaOptions);

    private native int nativeJoinChannelEx(long j10, String str, String str2, int i10, ChannelMediaOptions channelMediaOptions);

    private native int nativeJoinChannelWithUserAccount(long j10, String str, String str2, String str3, ChannelMediaOptions channelMediaOptions);

    private native int nativeJoinChannelWithUserAccountEx(long j10, String str, String str2, String str3, ChannelMediaOptions channelMediaOptions);

    private native int nativeLeaveChannel(long j10, LeaveChannelOptions leaveChannelOptions);

    private native int nativeLeaveChannelEx(long j10, String str, int i10, LeaveChannelOptions leaveChannelOptions);

    private native int nativeLeaveChannelWithUserAccountEx(long j10, String str, String str2, LeaveChannelOptions leaveChannelOptions);

    private native int nativeLoadExtensionProvider(long j10, String str);

    private native String nativeMakeQualityReportUrl(long j10, String str, String str2, String str3, int i10);

    private native int nativeMediaPlayerAdjustPlayoutVolume(long j10, int i10, int i11);

    private native int nativeMediaPlayerAdjustPublishSignalVolume(long j10, int i10, int i11);

    private native int nativeMediaPlayerChangePlaybackSpeed(long j10, int i10, int i11);

    private native int nativeMediaPlayerDestroy(long j10, int i10);

    private native int nativeMediaPlayerEnableAutoRemoveCache(long j10, boolean z10);

    private native int nativeMediaPlayerEnableAutoSwitchAgoraCDN(long j10, int i10, boolean z10);

    private native int nativeMediaPlayerGetAgoraCDNLineCount(long j10, int i10);

    private native int nativeMediaPlayerGetAudioBufferDelay(long j10, int i10);

    private native String nativeMediaPlayerGetCacheDir(long j10);

    private native int nativeMediaPlayerGetCacheFileCount(long j10);

    private native int nativeMediaPlayerGetCurrentAgoraCDNIndex(long j10, int i10);

    private native long nativeMediaPlayerGetDuration(long j10, int i10);

    private native int nativeMediaPlayerGetMaxCacheFileCount(long j10);

    private native long nativeMediaPlayerGetMaxCacheFileSize(long j10);

    private native boolean nativeMediaPlayerGetMute(long j10, int i10);

    private native long nativeMediaPlayerGetPlayPosition(long j10, int i10);

    private native String nativeMediaPlayerGetPlaySrc(long j10, int i10);

    private native int nativeMediaPlayerGetPlayoutVolume(long j10, int i10);

    private native int nativeMediaPlayerGetPublishSignalVolume(long j10, int i10);

    private native int nativeMediaPlayerGetState(long j10, int i10);

    private native int nativeMediaPlayerGetStreamCount(long j10, int i10);

    private native MediaStreamInfo nativeMediaPlayerGetStreamInfo(long j10, int i10, int i11);

    private native int nativeMediaPlayerMute(long j10, int i10, boolean z10);

    private native int nativeMediaPlayerOpen(long j10, int i10, String str, long j11);

    private native int nativeMediaPlayerOpenWithAgoraCDNSrc(long j10, int i10, String str, long j11);

    private native int nativeMediaPlayerOpenWithSource(long j10, int i10, MediaPlayerSource mediaPlayerSource);

    private native int nativeMediaPlayerPause(long j10, int i10);

    private native int nativeMediaPlayerPlay(long j10, int i10);

    private native int nativeMediaPlayerPlayPreloadedSrc(long j10, int i10, String str);

    private native int nativeMediaPlayerPreloadSrc(long j10, int i10, String str, long j11);

    private native int nativeMediaPlayerRegisterAudioFrameObserver(long j10, int i10, IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i11);

    private native int nativeMediaPlayerRegisterPlayerObserver(long j10, int i10, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeMediaPlayerRegisterVideoFrameObserver(long j10, int i10, IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver);

    private native int nativeMediaPlayerRemoveAllCaches(long j10);

    private native int nativeMediaPlayerRemoveCacheByUri(long j10, String str);

    private native int nativeMediaPlayerRemoveOldCache(long j10);

    private native int nativeMediaPlayerRenewAgoraCDNSrcToken(long j10, int i10, String str, long j11);

    private native int nativeMediaPlayerResume(long j10, int i10);

    private native int nativeMediaPlayerSeek(long j10, int i10, long j11);

    private native int nativeMediaPlayerSelectAudioTrack(long j10, int i10, int i11);

    private native int nativeMediaPlayerSelectInternalSubtitle(long j10, int i10, int i11);

    private native int nativeMediaPlayerSelectMultiAudioTrack(long j10, int i10, int i11, int i12);

    private native int nativeMediaPlayerSetAudioDualMonoMode(long j10, int i10, int i11);

    private native int nativeMediaPlayerSetAudioPitch(long j10, int i10, int i11);

    private native int nativeMediaPlayerSetCacheDir(long j10, String str);

    private native int nativeMediaPlayerSetExternalSubtitle(long j10, int i10, String str);

    private native int nativeMediaPlayerSetLoopCount(long j10, int i10, int i11);

    private native int nativeMediaPlayerSetMaxCacheFileCount(long j10, int i10);

    private native int nativeMediaPlayerSetMaxCacheFileSize(long j10, long j11);

    private native int nativeMediaPlayerSetPlayerOption(long j10, int i10, String str, int i11);

    private native int nativeMediaPlayerSetPlayerOptionString(long j10, int i10, String str, String str2);

    private native int nativeMediaPlayerSetRenderMode(long j10, int i10, int i11);

    private native int nativeMediaPlayerSetSpatialAudioParams(long j10, int i10, SpatialAudioParams spatialAudioParams);

    private native int nativeMediaPlayerSetView(long j10, int i10, View view);

    private native int nativeMediaPlayerStop(long j10, int i10);

    private native int nativeMediaPlayerSwitchAgoraCDNLineByIndex(long j10, int i10, int i11);

    private native int nativeMediaPlayerSwitchAgoraCDNSrc(long j10, int i10, String str, boolean z10);

    private native int nativeMediaPlayerSwitchSrc(long j10, int i10, String str, boolean z10);

    private native int nativeMediaPlayerTakeScreenshot(long j10, int i10, String str);

    private native int nativeMediaPlayerUnRegisterPlayerObserver(long j10, int i10, IMediaPlayerObserver iMediaPlayerObserver);

    private native int nativeMediaPlayerUnloadSrc(long j10, int i10, String str);

    private native int nativeMuteAllRemoteAudioStreams(long j10, boolean z10, String str, int i10);

    private native int nativeMuteAllRemoteVideoStreams(long j10, boolean z10, String str, int i10);

    private native int nativeMuteLocalAudioStream(long j10, boolean z10, String str, int i10);

    private native int nativeMuteLocalVideoStream(long j10, boolean z10, String str, int i10);

    private native int nativeMuteRecordingSignal(long j10, boolean z10, String str, int i10);

    private native int nativeMuteRemoteAudioStream(long j10, int i10, boolean z10, String str, int i11);

    private native int nativeMuteRemoteVideoStream(long j10, int i10, boolean z10, String str, int i11);

    private native Object nativeObjectInit(RtcEngineConfig rtcEngineConfig);

    private native int nativePauseAllChannelMediaRelay(long j10, String str, int i10);

    private native int nativePauseAllEffects(long j10);

    private native int nativePauseAudio(long j10);

    private native int nativePauseAudioMixing(long j10);

    private native int nativePauseEffect(long j10, int i10);

    private native int nativePerformVideoEffectAction(long j10, int i10, int i11);

    private native int nativePlayAllEffects(long j10, int i10, double d10, double d11, double d12, boolean z10);

    private native int nativePlayEffectWithFilePath(long j10, int i10, String str, int i11, double d10, double d11, double d12, boolean z10, int i12, String str2, int i13);

    private native int nativePreloadChannel(long j10, String str, String str2, int i10);

    private native int nativePreloadChannelWithUserAccount(long j10, String str, String str2, String str3);

    private native int nativePreloadEffect(long j10, int i10, String str, int i11, String str2, int i12);

    private native int nativePullAudioFrame(long j10, ByteBuffer byteBuffer, int i10, int i11, int i12);

    private native int nativePushExternalAgoraVideoFrame(long j10, int i10, byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, EGLContext eGLContext, android.opengl.EGLContext eGLContext2, long j12, float[] fArr, int i18, int i19);

    private native int nativePushExternalAudioFrameRawData(long j10, ByteBuffer byteBuffer, long j11, int i10, int i11, int i12, int i13);

    private native int nativePushExternalEncodedVideoFrame(long j10, ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo, int i10);

    private native AgoraFocalLengthInfo[] nativeQueryCameraFocalLengthCapability(long j10);

    private native CodecCapInfo[] nativeQueryCodecCapability(long j10);

    private native int nativeQueryDeviceScore(long j10);

    private native int nativeQueryHDRCapability(long j10, int i10);

    private native int nativeQueryScreenCaptureCapability(long j10);

    private native int nativeRate(long j10, String str, int i10, String str2);

    private native int nativeRecordCreateEngineTimeStamp(long j10, long j11, long j12);

    private native int nativeRegisterAudioFrameObserver(long j10, IAudioFrameObserver iAudioFrameObserver);

    private native int nativeRegisterAudioSpectrumObserver(long j10, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeRegisterExtension(long j10, String str, String str2, int i10);

    private native int nativeRegisterFaceInfoObserver(long j10, IFaceInfoObserver iFaceInfoObserver);

    private native int nativeRegisterLocalUserAccount(long j10, String str, String str2);

    private native int nativeRegisterMediaMetadataObserver(long j10, Object obj, int i10);

    private native int nativeRegisterMediaPlayerAudioSpectrumObserver(long j10, int i10, IAudioSpectrumObserver iAudioSpectrumObserver, int i11);

    private native int nativeRegisterVideoEncodedFrameObserver(long j10, IVideoEncodedFrameObserver iVideoEncodedFrameObserver);

    private native int nativeRegisterVideoFrameObserver(long j10, IVideoFrameObserver iVideoFrameObserver);

    private native int nativeReleaseRecorder(long j10, int i10, String str, int i11);

    private native int nativeRemoveVideoEffect(long j10, int i10);

    private native int nativeRemoveVideoWatermark(long j10, String str);

    private native int nativeRemoveVideoWatermarkEx(long j10, String str, String str2, int i10);

    private native int nativeRenewToken(long j10, String str);

    private native int nativeResumeAllChannelMediaRelay(long j10, String str, int i10);

    private native int nativeResumeAllEffects(long j10);

    private native int nativeResumeAudio(long j10);

    private native int nativeResumeAudioMixing(long j10);

    private native int nativeResumeEffect(long j10, int i10);

    private native int nativeSelectAudioTrack(long j10, int i10);

    private native int nativeSendAudioMetadata(long j10, byte[] bArr, String str, int i10);

    private native int nativeSendCustomReportMessage(long j10, String str, String str2, String str3, String str4, int i10, String str5, int i11);

    private native int nativeSendMediaControlMessage(long j10, int i10, byte[] bArr, String str, int i11);

    private native int nativeSendRdtMessage(long j10, int i10, int i11, byte[] bArr, String str, int i12);

    private native int nativeSendStreamMessage(long j10, int i10, byte[] bArr, String str, int i11);

    private native int nativeSetAVSyncSource(long j10, String str, int i10);

    private native int nativeSetAdvancedAudioOptions(long j10, int i10);

    private native int nativeSetApiCallMode(long j10, int i10);

    private native int nativeSetAudioEffectParameters(long j10, int i10, int i11, int i12);

    private native int nativeSetAudioEffectPreset(long j10, int i10);

    private native int nativeSetAudioMixingDualMonoMode(long j10, int i10);

    private native int nativeSetAudioMixingPitch(long j10, int i10);

    private native int nativeSetAudioMixingPlaybackSpeed(long j10, int i10);

    private native int nativeSetAudioMixingPosition(long j10, int i10);

    private native int nativeSetAudioProfile(long j10, int i10);

    private native int nativeSetAudioProfileScenario(long j10, int i10, int i11);

    private native int nativeSetAudioScenario(long j10, int i10);

    private native int nativeSetBeautyEffectOptions(long j10, boolean z10, int i10, float f10, float f11, float f12, float f13, int i11);

    private native int nativeSetCameraAutoFocusFaceModeEnabled(long j10, boolean z10);

    private native int nativeSetCameraCapturerConfiguration(long j10, CameraCapturerConfiguration cameraCapturerConfiguration);

    private native int nativeSetCameraExposureFactor(long j10, int i10);

    private native int nativeSetCameraExposurePosition(long j10, float f10, float f11);

    private native int nativeSetCameraFocusPositionInPreview(long j10, float f10, float f11);

    private native int nativeSetCameraTorchOn(long j10, boolean z10);

    private native int nativeSetCameraZoomFactor(long j10, float f10);

    private native int nativeSetChannelProfile(long j10, int i10);

    private native int nativeSetClientRole(long j10, int i10, Object obj);

    private native int nativeSetCloudProxy(long j10, int i10);

    private native int nativeSetColorEnhanceOptions(long j10, boolean z10, float f10, float f11, int i10);

    private native int nativeSetDefaultAudioRoutetoSpeakerphone(long j10, boolean z10);

    private native int nativeSetDirectCdnStreamingAudioConfiguration(long j10, int i10);

    private native int nativeSetDirectCdnStreamingVideoConfiguration(long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    private native int nativeSetDualStreamModeEx(long j10, int i10, SimulcastStreamConfig simulcastStreamConfig, String str, int i11);

    private native int nativeSetEarMonitoringAudioFrameParameters(long j10, int i10, int i11, int i12, int i13);

    private native int nativeSetEffectPosition(long j10, int i10, int i11);

    private native int nativeSetEffectsVolume(long j10, double d10);

    private native int nativeSetEnableSpeakerphone(long j10, boolean z10);

    private native int nativeSetExtensionProperty(long j10, String str, String str2, String str3, String str4, int i10);

    private native int nativeSetExtensionProperty2(long j10, String str, String str2, String str3, String str4, int i10, int i11, String str5, int i12);

    private native int nativeSetExtensionProviderProperty(long j10, String str, String str2, String str3);

    private native int nativeSetExternalAudioSink(long j10, boolean z10, int i10, int i11);

    private native int nativeSetExternalAudioSource(long j10, boolean z10, int i10, int i11, boolean z11, boolean z12);

    private native int nativeSetExternalMediaProjection(long j10, MediaProjection mediaProjection);

    private native int nativeSetExternalRemoteEglContext(long j10, Object obj);

    private native int nativeSetExternalVideoSource(long j10, boolean z10, boolean z11, int i10, EncodedVideoTrackOptions encodedVideoTrackOptions);

    private native int nativeSetFaceShapeAreaOptions(long j10, int i10, int i11, int i12);

    private native int nativeSetFaceShapeBeautyOptions(long j10, boolean z10, int i10, int i11, int i12);

    private native int nativeSetFilterEffectOptions(long j10, boolean z10, String str, float f10, int i10);

    private native int nativeSetHeadphoneEQParameters(long j10, int i10, int i11);

    private native int nativeSetHeadphoneEQPreset(long j10, int i10);

    private native int nativeSetHighPriorityUserList(long j10, int[] iArr, int i10, String str, int i11);

    private native int nativeSetInEarMonitoringVolume(long j10, int i10);

    private native int nativeSetLocalAccessPoint(long j10, ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, int i10, Object obj, boolean z10);

    private native int nativeSetLocalRenderMode(long j10, int i10, int i11);

    private native int nativeSetLocalVideoMirrorMode(long j10, int i10);

    private native int nativeSetLocalVoiceEqualization(long j10, int i10, int i11);

    private native int nativeSetLocalVoiceFormant(long j10, double d10);

    private native int nativeSetLocalVoicePitch(long j10, double d10);

    private native int nativeSetLocalVoiceReverb(long j10, int i10, int i11);

    private native int nativeSetLogFile(long j10, String str);

    private native int nativeSetLogFileSize(long j10, long j11);

    private native int nativeSetLogFilter(long j10, int i10);

    private native int nativeSetLogLevel(long j10, int i10);

    private native int nativeSetLowlightEnhanceOptions(long j10, boolean z10, int i10, int i11, int i12);

    private native int nativeSetMediaRecorderObserver(long j10, Object obj, int i10, String str, boolean z10, int i11);

    private native int nativeSetMixedAudioFrameParameters(long j10, int i10, int i11, int i12);

    private native int nativeSetParameters(long j10, String str);

    private native int nativeSetParametersEx(long j10, String str, String str2, int i10);

    private native int nativeSetPlaybackAudioFrameBeforeMixingParameters(long j10, int i10, int i11, int i12);

    private native int nativeSetPlaybackAudioFrameParameters(long j10, int i10, int i11, int i12, int i13);

    private native int nativeSetProfile(long j10, String str, boolean z10);

    private native int nativeSetRecordingAudioFrameParameters(long j10, int i10, int i11, int i12, int i13);

    private native int nativeSetRemoteDefaultVideoStreamType(long j10, int i10);

    private native int nativeSetRemoteRenderMode(long j10, int i10, int i11, int i12, String str, int i13);

    private native int nativeSetRemoteSubscribeFallbackOption(long j10, int i10);

    private native int nativeSetRemoteUserPriority(long j10, int i10, int i11);

    private native int nativeSetRemoteUserSpatialAudioParams(long j10, int i10, SpatialAudioParams spatialAudioParams, String str, int i11);

    private native int nativeSetRemoteVideoStreamType(long j10, int i10, int i11, String str, int i12);

    private native int nativeSetRemoteVideoSubscriptionOptions(long j10, int i10, VideoSubscriptionOptions videoSubscriptionOptions, String str, int i11);

    private native int nativeSetRemoteVoicePosition(long j10, int i10, double d10, double d11, String str, int i11);

    private native int nativeSetRouteInCommunicationMode(long j10, int i10);

    private native int nativeSetScreenCaptureScenario(long j10, int i10);

    private native int nativeSetSimulcastConfigEx(long j10, SimulcastConfig.StreamLayerConfig[] streamLayerConfigArr, boolean z10, String str, int i10);

    private native int nativeSetSubscribeAudioBlacklist(long j10, int[] iArr, String str, int i10);

    private native int nativeSetSubscribeAudioWhitelist(long j10, int[] iArr, String str, int i10);

    private native int nativeSetSubscribeVideoBlacklist(long j10, int[] iArr, String str, int i10);

    private native int nativeSetSubscribeVideoWhitelist(long j10, int[] iArr, String str, int i10);

    private native int nativeSetVideoDenoiserOptions(long j10, boolean z10, int i10, int i11, int i12);

    private native int nativeSetVideoEffectBoolParam(long j10, String str, String str2, boolean z10);

    private native int nativeSetVideoEffectFloatParam(long j10, String str, String str2, float f10);

    private native int nativeSetVideoEffectIntParam(long j10, String str, String str2, int i10);

    private native int nativeSetVideoEncoderConfiguration(long j10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, int i20, String str, int i21);

    private native int nativeSetVoiceBeautifierParameters(long j10, int i10, int i11, int i12);

    private native int nativeSetVoiceBeautifierPreset(long j10, int i10);

    private native int nativeSetVoiceConversionParameters(long j10, int i10, int i11, int i12);

    private native int nativeSetVoiceConversionPreset(long j10, int i10);

    private native int nativeSetVolumeOfEffect(long j10, int i10, double d10);

    private native int nativeSetupAudioAttributeContext(long j10, AudioAttributes audioAttributes);

    private native int nativeSetupLocalVideo(long j10, View view, SurfaceTexture surfaceTexture, int i10, int i11, int i12, int i13, int[] iArr, int i14, boolean z10, int i15, int i16);

    private native int nativeSetupRemoteVideo(long j10, View view, SurfaceTexture surfaceTexture, int i10, int i11, int i12, int i13, int[] iArr, int i14, boolean z10, String str, int i15, int i16);

    private native int nativeStartAudioMixing(long j10, String str, boolean z10, int i10, int i11);

    private native int nativeStartAudioRecording(long j10, String str, int i10);

    private native int nativeStartAudioRecording2(long j10, String str, boolean z10, int i10, int i11, int i12, int i13);

    private native int nativeStartCameraCapture(long j10, int i10, CameraCapturerConfiguration cameraCapturerConfiguration);

    private native int nativeStartDirectCdnStreaming(long j10, Object obj, String str, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    private native int nativeStartEchoTestWithConfig(long j10, View view, boolean z10, boolean z11, String str, String str2, int i10);

    private native int nativeStartLastmileProbeTest(long j10, boolean z10, boolean z11, int i10, int i11);

    private native int nativeStartLocalAudioMixer(long j10, byte[] bArr);

    private native int nativeStartLocalVideoTranscoder(long j10, byte[] bArr);

    private native int nativeStartMediaRenderingTracing(long j10);

    private native int nativeStartMediaRenderingTracingEx(long j10, String str, int i10);

    private native int nativeStartOrUpdateChannelMediaRelay(long j10, ChannelMediaInfo channelMediaInfo, ChannelMediaInfo[] channelMediaInfoArr, String str, int i10);

    private native int nativeStartPlaybackDeviceTest(long j10, String str);

    private native int nativeStartPreview(long j10);

    private native int nativeStartPreviewForSourceType(long j10, int i10);

    private native int nativeStartRecording(long j10, String str, int i10, int i11, int i12, int i13, int i14, String str2, boolean z10, int i15, int i16, int i17, int i18, int i19, int i20, int i21);

    private native int nativeStartRecordingDeviceTest(long j10, int i10);

    private native int nativeStartRhythmPlayer(long j10, String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    private native int nativeStartRtmpStreamWithTranscoding(long j10, String str, byte[] bArr, String str2, int i10);

    private native int nativeStartRtmpStreamWithoutTranscoding(long j10, String str, String str2, int i10);

    private native int nativeStartScreenCapture(long j10, ScreenCaptureParameters screenCaptureParameters);

    private native int nativeStopAllEffects(long j10);

    private native int nativeStopAudioMixing(long j10);

    private native int nativeStopAudioRecording(long j10);

    private native int nativeStopCameraCapture(long j10, int i10);

    private native int nativeStopChannelMediaRelay(long j10, String str, int i10);

    private native int nativeStopDirectCdnStreaming(long j10);

    private native int nativeStopEchoTest(long j10);

    private native int nativeStopEffect(long j10, int i10);

    private native int nativeStopLastmileProbeTest(long j10);

    private native int nativeStopLocalAudioMixer(long j10);

    private native int nativeStopLocalVideoTranscoder(long j10);

    private native int nativeStopPlaybackDeviceTest(long j10);

    private native int nativeStopPreview(long j10);

    private native int nativeStopPreviewForSourceType(long j10, int i10);

    private native int nativeStopRecording(long j10, int i10, String str, boolean z10, int i11);

    private native int nativeStopRecordingDeviceTest(long j10);

    private native int nativeStopRhythmPlayer(long j10);

    private native int nativeStopRtmpStream(long j10, String str, String str2, int i10);

    private native int nativeStopScreenCapture(long j10);

    private native int nativeSwitchCamera(long j10);

    private native int nativeSwitchCameraId(long j10, String str);

    private native int nativeTakeSnapshot(long j10, int i10, String str, String str2, int i11);

    private native int nativeTakeSnapshot2(long j10, int i10, String str, int i11, String str2, int i12);

    private native int nativeUnRegisterAudioSpectrumObserver(long j10, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeUnRegisterMediaPlayerAudioSpectrumObserver(long j10, int i10, IAudioSpectrumObserver iAudioSpectrumObserver);

    private native int nativeUnloadAllEffects(long j10);

    private native int nativeUnloadEffect(long j10, int i10);

    private native int nativeUnregisterMediaMetadataObserver(long j10, Object obj, int i10);

    private native int nativeUpdateChannelMediaOptions(long j10, ChannelMediaOptions channelMediaOptions, String str, int i10);

    private native int nativeUpdateDirectCdnStreamingMediaOptions(long j10, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    private native int nativeUpdateLocalAudioMixerConfiguration(long j10, byte[] bArr);

    private native int nativeUpdateLocalTranscoderConfiguration(long j10, byte[] bArr);

    private native int nativeUpdatePreloadChannelToken(long j10, String str);

    private native int nativeUpdateRtmpTranscoding(long j10, byte[] bArr, String str, int i10);

    private native int nativeUpdateScreenCaptureParameters(long j10, ScreenCaptureParameters screenCaptureParameters);

    private native String nativeUploadLogFile(long j10);

    private native int nativeWriteLog(long j10, int i10, String str);

    private native int nativeregisterAudioEncodedFrameObserver(long j10, IAudioEncodedFrameObserver iAudioEncodedFrameObserver, int i10, int i11);

    private native int nativesetAINSMode(long j10, boolean z10, int i10);

    private native int nativesetLocalRenderTargetFps(long j10, int i10, int i11);

    private native int nativesetRemoteRenderTargetFps(long j10, int i10);

    private native int nativesetVideoQoEPreference(long j10, int i10);

    private native int nativesetVideoScenario(long j10, int i10);

    @CalledByNative
    private void onLogEvent(int i10, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean safeLoadLibrary(String str, String str2) {
        String message;
        boolean z10 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                System.loadLibrary(str2);
            } else {
                System.load(getNativeLibFullPath(str, str2));
            }
            z10 = true;
            message = null;
        } catch (NullPointerException e10) {
            e = e10;
            message = e.getMessage();
            if (!z10) {
            }
            return z10;
        } catch (SecurityException e11) {
            e = e11;
            message = e.getMessage();
            if (!z10) {
            }
            return z10;
        } catch (Exception e12) {
            e = e12;
            message = e.getMessage();
            if (!z10) {
            }
            return z10;
        } catch (UnsatisfiedLinkError e13) {
            e = e13;
            message = e.getMessage();
            if (!z10) {
            }
            return z10;
        }
        if (!z10) {
            Log.i(TAG, "failed to load library " + str2 + " from " + str + " msg: " + message);
        }
        return z10;
    }

    private int setParameter(String str, int i10) {
        return setParameters(formatString("{\"%s\":%d}", str, Integer.valueOf(i10)));
    }

    private int setParameterObject(String str, String str2) {
        return setParameters(formatString("{\"%s\":%s}", str, str2));
    }

    private int setUidCompatibleMode(boolean z10) {
        return setParameter("rtc.api.set_uid_compatible_mode", z10);
    }

    private static String toStringUserId(int i10) {
        return RtcEngineMessage.toStringUserId(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int validatePushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (agoraVideoFrame == null) {
            return -2;
        }
        int i16 = agoraVideoFrame.format;
        if (i16 == 10 || i16 == 11) {
            return 0;
        }
        byte[] bArr = agoraVideoFrame.buf;
        if (bArr == null || bArr.length == 0) {
            return -2;
        }
        if (i16 == 1) {
            int i17 = agoraVideoFrame.stride;
            i11 = (i17 + 1) / 2;
            int i18 = agoraVideoFrame.height;
            i14 = (i17 * i18) + (((i18 + 1) / 2) * i11 * 2);
            i15 = (agoraVideoFrame.cropRight + 1) / 2;
        } else {
            if (i16 == 2 || i16 == 4) {
                int i19 = agoraVideoFrame.stride;
                i10 = (((agoraVideoFrame.height * i19) * 4) - agoraVideoFrame.cropRight) - (agoraVideoFrame.cropBottom * i19);
                return bArr.length < i10 ? -2 : 0;
            }
            if (i16 == 3) {
                int i20 = agoraVideoFrame.stride;
                i11 = i20 % 2 == 0 ? i20 : i20 + 1;
                int i21 = agoraVideoFrame.height;
                i14 = (i20 * i21) + (((i21 + 1) / 2) * i11);
                i15 = agoraVideoFrame.cropRight;
            } else {
                if (i16 != 16) {
                    return -2;
                }
                int i22 = agoraVideoFrame.stride;
                i11 = (i22 + 1) / 2;
                int i23 = agoraVideoFrame.height;
                i12 = ((i22 * i23) + ((i23 * i11) * 2)) - ((agoraVideoFrame.cropRight + 1) / 2);
                i13 = agoraVideoFrame.cropBottom;
                i10 = i12 - (i13 * i11);
                if (bArr.length < i10) {
                }
            }
        }
        i12 = i14 - i15;
        i13 = (agoraVideoFrame.cropBottom + 1) / 2;
        i10 = i12 - (i13 * i11);
        if (bArr.length < i10) {
        }
    }

    private boolean validateVideoRendererView(VideoCanvas videoCanvas) {
        if (videoCanvas == null) {
            return false;
        }
        View view = videoCanvas.view;
        if (view == null && videoCanvas.surfaceTexture == null) {
            return true;
        }
        return view != null ? (view instanceof SurfaceView) || (view instanceof TextureView) : Objects.nonNull(videoCanvas.surfaceTexture);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized void addHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (iRtcEngineEventHandler != null) {
            this.mRtcHandlers.put(iRtcEngineEventHandler, new RtcEngineEventHandlerProxy(iRtcEngineEventHandler));
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized void addHandlerEx(IRtcEngineEventHandler iRtcEngineEventHandler, RtcConnection rtcConnection) {
        if (iRtcEngineEventHandler == null || rtcConnection == null) {
            return;
        }
        addHandlerExKey(Pair.create(getChannelId(rtcConnection), Integer.valueOf(getUserId(rtcConnection))), iRtcEngineEventHandler);
    }

    public synchronized int addOrUpdateVideoEffect(int i10, String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAddOrUpdateVideoEffect(j10, i10, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int addVideoWatermark(AgoraImage agoraImage) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (agoraImage != null && !TextUtils.isEmpty(agoraImage.url)) {
            WatermarkOptions watermarkOptions = new WatermarkOptions();
            String str = agoraImage.url;
            watermarkOptions.visibleInPreview = false;
            WatermarkOptions.Rectangle rectangle = new WatermarkOptions.Rectangle(agoraImage.f49179x, agoraImage.f49180y, agoraImage.width, agoraImage.height);
            watermarkOptions.positionInLandscapeMode = rectangle;
            watermarkOptions.positionInPortraitMode = rectangle;
            return addVideoWatermark(str, watermarkOptions);
        }
        return -2;
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int addVideoWatermarkEx(WatermarkConfig watermarkConfig, RtcConnection rtcConnection) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(watermarkConfig.f49183id) || watermarkConfig.options == null) {
                    return -2;
                }
                if (rtcConnection != null) {
                    return nativeAddVideoWatermark2Ex(this.mNativeHandle, watermarkConfig, getChannelId(rtcConnection), getUserId(rtcConnection));
                }
                try {
                    return nativeAddVideoWatermark2(this.mNativeHandle, watermarkConfig);
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustAudioMixingPlayoutVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAdjustAudioMixingPlayoutVolume(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustAudioMixingPublishVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAdjustAudioMixingPublishVolume(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustAudioMixingVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAdjustAudioMixingVolume(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustCustomAudioPlayoutVolume(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAdjustCustomAudioPlayoutVolume(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustCustomAudioPublishVolume(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAdjustCustomAudioPublishVolume(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustPlaybackSignalVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeAdjustPlaybackSignalVolume(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustRecordingSignalVolume(int i10) {
        return adjustRecordingSignalVolumeEx(i10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int adjustRecordingSignalVolumeEx(int i10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeAdjustRecordingSignalVolume(j10, i10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int adjustUserPlaybackSignalVolume(int i10, int i11) {
        return adjustUserPlaybackSignalVolumeEx(i10, i11, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int adjustUserPlaybackSignalVolumeEx(int i10, int i11, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeAdjustUserPlaybackSignalVolume(j10, i10, i11, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void allowCaptureCurrentApp(ScreenCaptureParameters screenCaptureParameters) {
        if (Build.VERSION.SDK_INT >= 29 && this.mContext.get() != null) {
            ((AudioManager) getContext().getSystemService("audio")).setAllowedCapturePolicy(screenCaptureParameters.audioCaptureParameters.allowCaptureCurrentApp ? 1 : 3);
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int clearVideoWatermarkEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeClearVideoWatermarkEx(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int clearVideoWatermarks() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeClearVideoWatermarks(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int complain(String str, String str2) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeComplain(j10, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int configRhythmPlayer(AgoraRhythmPlayerConfig agoraRhythmPlayerConfig) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (agoraRhythmPlayerConfig == null) {
            return -2;
        }
        return nativeConfigRhythmPlayer(j10, agoraRhythmPlayerConfig);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createCustomAudioTrack(Constants.AudioTrackType audioTrackType, AudioTrackConfig audioTrackConfig) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeCreateCustomAudioTrack(j10, Constants.AudioTrackType.getValue(audioTrackType), audioTrackConfig.enableLocalPlayback, audioTrackConfig.enableAudioProcessing);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createCustomEncodedVideoTrack(EncodedVideoTrackOptions encodedVideoTrackOptions) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeCreateCustomEncodedVideoTrack(j10, encodedVideoTrackOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createCustomVideoTrack() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeCreateCustomVideoTrack(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createDataStream(DataStreamConfig dataStreamConfig) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return createDataStreamEx(dataStreamConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int createDataStreamEx(DataStreamConfig dataStreamConfig, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeCreateDataStream2(j10, dataStreamConfig.ordered, dataStreamConfig.syncWithAudio, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized IMediaPlayer createMediaPlayer() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        int nativeCreateMediaPlayer = nativeCreateMediaPlayer(j10);
        if (nativeCreateMediaPlayer < 0) {
            return null;
        }
        return new MediaPlayerImpl(this, nativeCreateMediaPlayer);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized AgoraMediaRecorder createMediaRecorder(RecorderStreamInfo recorderStreamInfo) {
        if (this.mNativeHandle == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        if (recorderStreamInfo == null) {
            Logging.e(TAG, "RecorderStreamInfo is null, return");
            return null;
        }
        return new AgoraMediaRecorder(this, recorderStreamInfo);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized IVideoEffectObject createVideoEffectObject(String str, Constants.MediaSourceType mediaSourceType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        if (nativeCreateVideoEffectObject(j10, str, Constants.MediaSourceType.getValue(mediaSourceType)) != 0) {
            Logging.e(TAG, "Failed to create video effect object!");
            return null;
        }
        return new VideoEffectObjectImpl(this, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyCustomAudioTrack(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeDestroyCustomAudioTrack(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyCustomEncodedVideoTrack(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeDestroyCustomEncodedVideoTrack(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyCustomVideoTrack(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeDestroyCustomVideoTrack(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized void destroyMediaRecorder(AgoraMediaRecorder agoraMediaRecorder) {
        if (this.mNativeHandle != 0 && agoraMediaRecorder != null) {
            agoraMediaRecorder.release();
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int destroyVideoEffectObject(IVideoEffectObject iVideoEffectObject) {
        long j10 = this.mNativeHandle;
        if (j10 != 0 && iVideoEffectObject != null) {
            return nativeDestroyVideoEffectObject(j10);
        }
        return -7;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int disableAudio() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableAudio(j10, false);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int disableAudioSpectrumMonitor() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeDisableAudioSpectrumMonitor(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int disableVideo() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeDisableVideo(j10);
    }

    public synchronized void doDestroy(IRtcEngineReleaseCallback iRtcEngineReleaseCallback) {
        MediaPlayerCacheManagerImpl.destroyMediaPlayerCacheManager();
        H265TranscoderImpl.destroyInstance();
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeDestroy(j10, iRtcEngineReleaseCallback);
            this.mNativeHandle = 0L;
            sLibLoaded = false;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableAudio() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableAudio(j10, true);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableAudioSpectrumMonitor(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableAudioSpectrumMonitor(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableAudioVolumeIndication(int i10, int i11, boolean z10) {
        return enableAudioVolumeIndicationEx(i10, i11, z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableAudioVolumeIndicationEx(int i10, int i11, boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeEnableAudioVolumeIndication(j10, i10, i11, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableContentInspect(boolean z10, ContentInspectConfig contentInspectConfig) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return enableContentInspectEx(z10, contentInspectConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableContentInspectEx(boolean z10, ContentInspectConfig contentInspectConfig, RtcConnection rtcConnection) {
        Throwable th2;
        byte[] bArr;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!z10) {
                    bArr = null;
                } else {
                    if (contentInspectConfig == null) {
                        return -7;
                    }
                    try {
                        bArr = new RtcEngineMessage.PContentInspectConfig().marshall(contentInspectConfig);
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return nativeEnableContentInspect(this.mNativeHandle, z10, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableCustomAudioLocalPlayback(int i10, boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableCustomAudioLocalPlayback(j10, i10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableDualStreamMode(boolean z10) {
        return enableDualStreamMode(z10, new SimulcastStreamConfig());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableDualStreamModeEx(boolean z10, SimulcastStreamConfig simulcastStreamConfig, RtcConnection rtcConnection) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (simulcastStreamConfig == null) {
                    try {
                        simulcastStreamConfig = new SimulcastStreamConfig();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return nativeEnableDualStreamModeEx(this.mNativeHandle, z10, simulcastStreamConfig, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableEncryption(boolean z10, EncryptionConfig encryptionConfig) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeEnableEncryption(j10, z10, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey, encryptionConfig.encryptionKdfSalt, encryptionConfig.datastreamEncryptionEnabled);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int enableEncryptionEx(boolean z10, EncryptionConfig encryptionConfig, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeEnableEncryptionEx(j10, z10, encryptionConfig.encryptionMode.getValue(), encryptionConfig.encryptionKey, encryptionConfig.encryptionKdfSalt, encryptionConfig.datastreamEncryptionEnabled, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExtension(String str, String str2, ExtensionInfo extensionInfo, boolean z10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                if (extensionInfo == null) {
                    return -2;
                }
                return nativeEnableExtension2(j10, str, str2, z10, Constants.MediaSourceType.getValue(extensionInfo.mediaSourceType), extensionInfo.remoteUid, extensionInfo.channelId, extensionInfo.localUid);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExternalAudioSourceLocalPlayback(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableExternalAudioSourceLocalPlayback(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableFaceDetection(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableFaceDetection(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean enableHighPerfWifiMode(boolean z10) {
        Context context = this.mContext.get();
        if (context == null) {
            return false;
        }
        if (!z10) {
            this.mWifiLock = null;
        } else {
            if (context.checkPermission("android.permission.WAKE_LOCK", Process.myPid(), Process.myUid()) != 0) {
                Logging.w(TAG, "Failed to enableHighPerfWifiMode, permission WAKE_LOCK not granted ");
                this.mWifiLock = null;
                return false;
            }
            if (this.mWifiLock == null) {
                this.mWifiLock = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).createWifiLock(3, "agora.voip.lock");
            }
        }
        return true;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableInEarMonitoring(boolean z10) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return enableInEarMonitoring(z10, 1);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableInstantMediaRendering() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableInstantMediaRendering(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableLocalAudio(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableLocalAudio(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableLocalVideo(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableLocalVideo(j10, z10);
    }

    public synchronized int enableRemoteVideo(boolean z10, int i10) {
        return setParameterObject("che.video.peer.receive", formatString("{\"enable\":%b, \"uid\":\"%s\"}", Boolean.valueOf(z10), toStringUserId(i10)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableSoundPositionIndication(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableSoundPositionIndication(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableSpatialAudio(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableSpatialAudio(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int enableTransportQualityIndication(boolean z10) {
        return setParameter("rtc.transport_quality_indication", z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVideo() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableVideo(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
    
        if (r11.getFps() > 0) goto L21;
     */
    @Override // io.agora.rtc2.RtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized int enableVideoImageSource(boolean z10, ImageTrackOptions imageTrackOptions) {
        Throwable th2;
        int i10;
        int i11;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (z10) {
                    if (imageTrackOptions != null) {
                        try {
                            if (!TextUtils.isEmpty(imageTrackOptions.getImageUrl())) {
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    return -2;
                }
                String str = "";
                int value = VideoEncoderConfiguration.MIRROR_MODE_TYPE.MIRROR_MODE_DISABLED.getValue();
                if (imageTrackOptions != null) {
                    str = imageTrackOptions.getImageUrl();
                    int fps = imageTrackOptions.getFps();
                    i11 = imageTrackOptions.getMirrorMode();
                    i10 = fps;
                } else {
                    i10 = 0;
                    i11 = value;
                }
                return nativeEnableVideoImageSource(this.mNativeHandle, z10, str, i10, i11);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVirtualBackground(boolean z10, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty) {
        return enableVirtualBackground(z10, virtualBackgroundSource, segmentationProperty, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVoiceAITuner(boolean z10, Constants.VOICE_AI_TUNER_TYPE voice_ai_tuner_type) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (voice_ai_tuner_type == null) {
            return -2;
        }
        return nativeEnableVoiceAITuner(j10, z10, voice_ai_tuner_type.getValue());
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableWebSdkInteroperability(boolean z10) {
        return setParameters(String.format("{\"rtc.video.web_h264_interop_enable\":%b,\"che.video.web_h264_interop_enable\":%b}", Boolean.valueOf(z10), Boolean.valueOf(z10)));
    }

    public synchronized void finalize() {
        long j10 = this.mNativeHandle;
        if (j10 != 0) {
            nativeDestroy(j10, null);
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized DeviceInfo getAudioDeviceInfo() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetAudioDeviceInfo(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public IAudioEffectManager getAudioEffectManager() {
        return this;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingCurrentPosition() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetAudioMixingCurrentPosition(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingDuration() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetAudioMixingDuration(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingPlayoutVolume() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetAudioMixingPlayoutVolume(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioMixingPublishVolume() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetAudioMixingPublishVolume(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getAudioTrackCount() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetAudioTrackCount(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getCallId() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetCallId(j10);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized String getCallIdEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetCallIdEx(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized float getCameraMaxZoomFactor() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 1.0f;
        }
        return nativeGetCameraMaxZoomFactor(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getConnectionState() {
        return getConnectionStateEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int getConnectionStateEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetConnectionState(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    public Context getContext() {
        return this.mContext.get();
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getCurrentMonotonicTimeInMs() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7L;
        }
        return nativeGetCurrentMonotonicTimeInMs(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getEffectCurrentPosition(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetEffectCurrentPosition(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getEffectDuration(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetEffectDuration(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized double getEffectsVolume() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return 0.0d;
        }
        return nativeGetEffectsVolume(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0 || extensionInfo == null) {
                    return null;
                }
                return nativeGetExtensionProperty2(j10, str, str2, str3, Constants.MediaSourceType.getValue(extensionInfo.mediaSourceType), extensionInfo.remoteUid, extensionInfo.channelId, extensionInfo.localUid);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeAreaOptions getFaceShapeAreaOptions(int i10) {
        return getFaceShapeAreaOptions(i10, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeBeautyOptions getFaceShapeBeautyOptions() {
        return getFaceShapeBeautyOptions(Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized IH265Transcoder getH265Transcoder() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeCreateH265Transcoder(j10) >= 0 ? H265TranscoderImpl.getInstance(this) : null;
    }

    @Override // io.agora.rtc2.RtcEngine
    public IMediaPlayerCacheManager getMediaPlayerCacheManager() {
        if (this.mNativeHandle == 0) {
            Logging.e(TAG, "mNativeHandle is not init");
            return null;
        }
        IMediaPlayerCacheManager mediaPlayerCacheManager = MediaPlayerCacheManagerImpl.getMediaPlayerCacheManager(this);
        if (mediaPlayerCacheManager == null) {
            Logging.e(TAG, "mediaPlayerCacheManager is not init");
        }
        return mediaPlayerCacheManager;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getNativeHandle() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 0L;
        }
        return nativeGetRtcEngine(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getNativeMediaPlayer(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 0L;
        }
        return nativeGetMediaPlayer(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getNetworkType() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetNetworkType(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized long getNtpWallTimeInMs() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 0L;
        }
        return nativeGetNtpWallTimeInMs(j10);
    }

    public int getOSVersion() {
        return Build.VERSION.SDK_INT;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getParameter(String str, String str2) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetParameter(j10, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getParameters(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetParameters(j10, str);
    }

    public synchronized String getProfile() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeGetProfile(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getUserInfoByUid(int i10, UserInfo userInfo) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (userInfo == null) {
            Logging.e(TAG, "Failed to getUserInfoByUid, userInfo null");
            return -2;
        }
        return nativeGetUserInfoByUid(j10, i10, userInfo);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int getUserInfoByUidEx(int i10, UserInfo userInfo, RtcConnection rtcConnection) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (userInfo == null) {
                    try {
                        Logging.e(TAG, "Failed to getUserInfoByUidEx, userInfo null");
                        return -2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (rtcConnection == null) {
                    return -2;
                }
                return nativeGetUserInfoByUidEx(this.mNativeHandle, i10, userInfo, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getUserInfoByUserAccount(String str, UserInfo userInfo) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (userInfo == null) {
            Logging.e(TAG, "Failed to getUserInfoByUserAccount, userInfo null");
            return -2;
        }
        return nativeGetUserInfoByUserAccount(j10, str, userInfo);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int getUserInfoByUserAccountEx(String str, UserInfo userInfo, RtcConnection rtcConnection) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (userInfo == null) {
                    try {
                        Logging.e(TAG, "Failed to getUserInfoByUserAccountEx, userInfo null");
                        return -2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (rtcConnection == null) {
                    return -2;
                }
                return nativeGetUserInfoByUserAccountEx(this.mNativeHandle, str, userInfo, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized boolean getVideoEffectBoolParam(String str, String str2) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return false;
        }
        return nativeGetVideoEffectBoolParam(j10, str, str2);
    }

    public synchronized float getVideoEffectFloatParam(String str, String str2) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 0.0f;
        }
        return nativeGetVideoEffectFloatParam(j10, str, str2);
    }

    public synchronized int getVideoEffectIntParam(String str, String str2) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 0;
        }
        return nativeGetVideoEffectIntParam(j10, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int getVolumeOfEffect(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeGetVolumeOfEffect(j10, i10);
    }

    public synchronized int h265TranscoderEnableTranscode(String str, String str2, int i10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeH265TranscoderEnableTranscode(j10, str, str2, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int h265TranscoderQueryChannel(String str, String str2, int i10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeH265TranscoderQueryChannel(j10, str, str2, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int h265TranscoderRegisterObserver(IH265TranscoderObserver iH265TranscoderObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeH265TranscoderRegisterObserver(j10, iH265TranscoderObserver);
    }

    public synchronized int h265TranscoderTriggerTranscode(String str, String str2, int i10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeH265TranscoderTriggerTranscode(j10, str, str2, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int h265TranscoderUnregisterObserver(IH265TranscoderObserver iH265TranscoderObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeH265TranscoderUnregisterObserver(j10, iH265TranscoderObserver);
    }

    public synchronized int initMediaPlayerCacheManager() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeInitMediaPlayerCacheManager(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraAutoFocusFaceModeSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraAutoFocusFaceModeSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraExposurePositionSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraExposurePositionSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraExposureSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraExposureSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraFaceDetectSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraFaceDetectSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraFocusSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraFocusSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraTorchSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraTorchSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isCameraZoomSupported() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return false;
        }
        return nativeGetCameraZoomSupported(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isFeatureAvailableOnDevice(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return false;
        }
        return nativeIsFeatureAvailableOnDevice(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isSpeakerphoneEnabled() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return false;
        }
        return nativeIsSpeakerphoneEnabled(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean isTextureEncodeSupported() {
        return true;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannel(String str, String str2, int i10, ChannelMediaOptions channelMediaOptions) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeJoinChannel2(j10, str, str2, i10, channelMediaOptions);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int joinChannelEx(String str, RtcConnection rtcConnection, ChannelMediaOptions channelMediaOptions, IRtcEngineEventHandler iRtcEngineEventHandler) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                String channelId = getChannelId(rtcConnection);
                if (channelId == null || channelId.isEmpty()) {
                    return -2;
                }
                int userId = getUserId(rtcConnection);
                int nativeJoinChannelEx = nativeJoinChannelEx(this.mNativeHandle, str, channelId, userId, channelMediaOptions);
                if (nativeJoinChannelEx == 0 && iRtcEngineEventHandler != null) {
                    this.mRtcExHandlerMap.remove(Pair.create(channelId, Integer.valueOf(userId)));
                    addHandlerEx(iRtcEngineEventHandler, rtcConnection);
                }
                return nativeJoinChannelEx;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannelWithUserAccount(String str, String str2, String str3) {
        return joinChannelWithUserAccount(str, str2, str3, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int joinChannelWithUserAccountEx(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions, IRtcEngineEventHandler iRtcEngineEventHandler) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                int nativeJoinChannelWithUserAccountEx = nativeJoinChannelWithUserAccountEx(j10, str, str2, str3, channelMediaOptions);
                if (nativeJoinChannelWithUserAccountEx == 0) {
                    this.mRtcExHandlerMap.remove(Pair.create(str2, str3));
                    addHandlerExKey(Pair.create(str2, str3), iRtcEngineEventHandler);
                }
                return nativeJoinChannelWithUserAccountEx;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int leaveChannel() {
        return leaveChannel(new LeaveChannelOptions());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int leaveChannelEx(RtcConnection rtcConnection) {
        return leaveChannelEx(rtcConnection, new LeaveChannelOptions());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public int leaveChannelWithUserAccountEx(String str, String str2) {
        return leaveChannelWithUserAccountEx(str, str2, new LeaveChannelOptions());
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int loadExtensionProvider(String str) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        ExtensionLoadState extensionLoadState = mLoadedExtensions.get(str);
        ExtensionLoadState extensionLoadState2 = ExtensionLoadState.LOADED;
        if (extensionLoadState == extensionLoadState2) {
            return 0;
        }
        int nativeLoadExtensionProvider = nativeLoadExtensionProvider(this.mNativeHandle, str);
        ConcurrentHashMap<String, ExtensionLoadState> concurrentHashMap = mLoadedExtensions;
        if (nativeLoadExtensionProvider != 0) {
            extensionLoadState2 = ExtensionLoadState.LOAD_FAIL;
        }
        concurrentHashMap.put(str, extensionLoadState2);
        return nativeLoadExtensionProvider;
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized String makeQualityReportUrl(String str, String str2, String str3, int i10) {
        Throwable th2;
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeMakeQualityReportUrl(j10, str, str2, str3, i10);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerAdjustPlayoutVolume(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerAdjustPlayoutVolume)");
            return -7;
        }
        return nativeMediaPlayerAdjustPlayoutVolume(j10, i10, i11);
    }

    public synchronized int mediaPlayerAdjustPublishSignalVolume(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerAdjustPublishSignalVolume)");
            return -7;
        }
        return nativeMediaPlayerAdjustPublishSignalVolume(j10, i10, i11);
    }

    public synchronized int mediaPlayerCacheEnableAutoRemoveCache(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerEnableAutoRemoveCache(j10, z10);
    }

    public synchronized String mediaPlayerCacheGetCacheDir() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeMediaPlayerGetCacheDir(j10);
    }

    public synchronized int mediaPlayerCacheGetCacheFileCount() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerGetCacheFileCount(j10);
    }

    public synchronized int mediaPlayerCacheGetMaxCacheFileCount() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerGetMaxCacheFileCount(j10);
    }

    public synchronized long mediaPlayerCacheGetMaxCacheFileSize() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7L;
        }
        return nativeMediaPlayerGetMaxCacheFileSize(j10);
    }

    public synchronized int mediaPlayerCacheRemoveAllCaches() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerRemoveAllCaches(j10);
    }

    public synchronized int mediaPlayerCacheRemoveCacheByUri(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerRemoveCacheByUri(j10, str);
    }

    public synchronized int mediaPlayerCacheRemoveOldCache() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerRemoveOldCache(j10);
    }

    public synchronized int mediaPlayerCacheSetCacheDir(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerSetCacheDir(j10, str);
    }

    public synchronized int mediaPlayerCacheSetMaxCacheFileCount(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerSetMaxCacheFileCount(j10, i10);
    }

    public synchronized int mediaPlayerCacheSetMaxCacheFileSize(long j10) {
        long j11 = this.mNativeHandle;
        if (j11 == 0) {
            return -7;
        }
        return nativeMediaPlayerSetMaxCacheFileSize(j11, j10);
    }

    public synchronized int mediaPlayerChangePlaybackSpeed(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerChangePlaybackSpeed)");
            return -7;
        }
        return nativeMediaPlayerChangePlaybackSpeed(j10, i10, i11);
    }

    public synchronized int mediaPlayerDestroy(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSourceDestroy)");
            return -7;
        }
        return nativeMediaPlayerDestroy(j10, i10);
    }

    public synchronized int mediaPlayerEnableAutoSwitchAgoraCDN(int i10, boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerEnableAutoSwitchAgoraCDN(j10, i10, z10);
    }

    public synchronized int mediaPlayerGetAgoraCDNLineCount(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerGetAgoraCDNLineCount(j10, i10);
    }

    public synchronized int mediaPlayerGetAudioBufferDelay(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetAudioBufferDelay)");
            return -7;
        }
        return nativeMediaPlayerGetAudioBufferDelay(j10, i10);
    }

    public synchronized int mediaPlayerGetCurrentAgoraCDNIndex(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerGetCurrentAgoraCDNIndex(j10, i10);
    }

    public synchronized long mediaPlayerGetDuration(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetDuration)");
            return -7L;
        }
        return nativeMediaPlayerGetDuration(j10, i10);
    }

    public synchronized boolean mediaPlayerGetMute(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerIsMuted)");
            return false;
        }
        return nativeMediaPlayerGetMute(j10, i10);
    }

    public synchronized long mediaPlayerGetPlayPosition(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPlayPosition)");
            return -7L;
        }
        return nativeMediaPlayerGetPlayPosition(j10, i10);
    }

    public synchronized String mediaPlayerGetPlaySrc(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPlaySrc)");
            return null;
        }
        return nativeMediaPlayerGetPlaySrc(j10, i10);
    }

    public synchronized int mediaPlayerGetPlayoutVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPlayoutVolume)");
            return -7;
        }
        return nativeMediaPlayerGetPlayoutVolume(j10, i10);
    }

    public synchronized int mediaPlayerGetPublishSignalVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetPublishSignalVolume)");
            return -7;
        }
        return nativeMediaPlayerGetPublishSignalVolume(j10, i10);
    }

    public synchronized int mediaPlayerGetState(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetState)");
            return -7;
        }
        return nativeMediaPlayerGetState(j10, i10);
    }

    public synchronized int mediaPlayerGetStreamCount(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetStreamCount)");
            return -7;
        }
        return nativeMediaPlayerGetStreamCount(j10, i10);
    }

    public synchronized MediaStreamInfo mediaPlayerGetStreamInfo(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerGetStreamInfo)");
            return null;
        }
        return nativeMediaPlayerGetStreamInfo(j10, i10, i11);
    }

    public synchronized int mediaPlayerMute(int i10, boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerMute)");
            return -7;
        }
        return nativeMediaPlayerMute(j10, i10, z10);
    }

    public synchronized int mediaPlayerOpen(int i10, String str, long j10) {
        Throwable th2;
        try {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativeMediaPlayerOpen(j11, i10, str, j10);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerOpen)");
                    return -7;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerOpenWithAgoraCDNSrc(int i10, String str, long j10) {
        try {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    return -7;
                }
                return nativeMediaPlayerOpenWithAgoraCDNSrc(j11, i10, str, j10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int mediaPlayerOpenWithMediaSource(int i10, MediaPlayerSource mediaPlayerSource) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerOpenWithSource(j10, i10, mediaPlayerSource);
    }

    public synchronized int mediaPlayerPause(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerPause)");
            return -7;
        }
        return nativeMediaPlayerPause(j10, i10);
    }

    public synchronized int mediaPlayerPlay(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerPlay)");
            return -7;
        }
        return nativeMediaPlayerPlay(j10, i10);
    }

    public synchronized int mediaPlayerPlayPreloadedSrc(int i10, String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerPlayPreloadedSrc(j10, i10, str);
    }

    public synchronized int mediaPlayerPreloadSrc(int i10, String str, long j10) {
        try {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    return -7;
                }
                return nativeMediaPlayerPreloadSrc(j11, i10, str, j10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int mediaPlayerRegisterAudioFrameObserver(int i10, IMediaPlayerAudioFrameObserver iMediaPlayerAudioFrameObserver, int i11) {
        Throwable th2;
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeMediaPlayerRegisterAudioFrameObserver(j10, i10, iMediaPlayerAudioFrameObserver, i11);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerRegisterAudioFrameObserver)");
                    return -7;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerRegisterPlayerObserver(int i10, IMediaPlayerObserver iMediaPlayerObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerRegisterPlayerObserver)");
            return -7;
        }
        return nativeMediaPlayerRegisterPlayerObserver(j10, i10, iMediaPlayerObserver);
    }

    public synchronized int mediaPlayerRegisterVideoFrameObserver(int i10, IMediaPlayerVideoFrameObserver iMediaPlayerVideoFrameObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerRegisterVideoFrameObserver)");
            return -7;
        }
        return nativeMediaPlayerRegisterVideoFrameObserver(j10, i10, iMediaPlayerVideoFrameObserver);
    }

    public synchronized int mediaPlayerRenewAgoraCDNSrcToken(int i10, String str, long j10) {
        try {
            try {
                long j11 = this.mNativeHandle;
                if (j11 == 0) {
                    return -7;
                }
                return nativeMediaPlayerRenewAgoraCDNSrcToken(j11, i10, str, j10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int mediaPlayerResume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerResume)");
            return -7;
        }
        return nativeMediaPlayerResume(j10, i10);
    }

    public synchronized int mediaPlayerSeek(int i10, long j10) {
        Throwable th2;
        try {
            try {
                long j11 = this.mNativeHandle;
                if (j11 != 0) {
                    return nativeMediaPlayerSeek(j11, i10, j10);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSeek)");
                    return -7;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerSelectAudioTrack(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSelectAudioTrack)");
            return -7;
        }
        return nativeMediaPlayerSelectAudioTrack(j10, i10, i11);
    }

    public synchronized int mediaPlayerSelectInternalSubtitle(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSelectInternalSubtitle)");
            return -7;
        }
        return nativeMediaPlayerSelectInternalSubtitle(j10, i10, i11);
    }

    public synchronized int mediaPlayerSelectMultiAudioTrack(int i10, int i11, int i12) {
        Throwable th2;
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeMediaPlayerSelectMultiAudioTrack(j10, i10, i11, i12);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSelectAudioTrack)");
                    return -7;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerSetAudioDualMonoMode(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetAudioDualMonoMode)");
            return -7;
        }
        return nativeMediaPlayerSetAudioDualMonoMode(j10, i10, i11);
    }

    public synchronized int mediaPlayerSetAudioPitch(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetAudioPitch)");
            return -7;
        }
        return nativeMediaPlayerSetAudioPitch(j10, i10, i11);
    }

    public synchronized int mediaPlayerSetExternalSubtitle(int i10, String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetExternalSubtitle)");
            return -7;
        }
        return nativeMediaPlayerSetExternalSubtitle(j10, i10, str);
    }

    public synchronized int mediaPlayerSetLoopCount(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetLoopCount)");
            return -7;
        }
        return nativeMediaPlayerSetLoopCount(j10, i10, i11);
    }

    public synchronized int mediaPlayerSetPlayerOption(int i10, String str, int i11) {
        Throwable th2;
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeMediaPlayerSetPlayerOption(j10, i10, str, i11);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetPlayerOption)");
                    return -7;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerSetPlayerOptionString(int i10, String str, String str2) {
        Throwable th2;
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 != 0) {
                    return nativeMediaPlayerSetPlayerOptionString(j10, i10, str, str2);
                }
                try {
                    Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetPlayerOption)");
                    return -7;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public synchronized int mediaPlayerSetRenderMode(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetRenderMode)");
            return -7;
        }
        return nativeMediaPlayerSetRenderMode(j10, i10, i11);
    }

    public synchronized int mediaPlayerSetSpatialAudioParams(int i10, SpatialAudioParams spatialAudioParams) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetSpatialAudioParams)");
            return -7;
        }
        return nativeMediaPlayerSetSpatialAudioParams(j10, i10, spatialAudioParams);
    }

    public synchronized int mediaPlayerSetView(int i10, View view) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerSetView)");
            return -7;
        }
        return nativeMediaPlayerSetView(j10, i10, view);
    }

    public synchronized int mediaPlayerStop(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerStop)");
            return -7;
        }
        return nativeMediaPlayerStop(j10, i10);
    }

    public synchronized int mediaPlayerSwitchAgoraCDNLineByIndex(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerSwitchAgoraCDNLineByIndex(j10, i10, i11);
    }

    public synchronized int mediaPlayerSwitchAgoraCDNSrc(int i10, String str, boolean z10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMediaPlayerSwitchAgoraCDNSrc(j10, i10, str, z10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int mediaPlayerSwitchSrc(int i10, String str, boolean z10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMediaPlayerSwitchSrc(j10, i10, str, z10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int mediaPlayerTakeScreenshot(int i10, String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerTakeScreenshot)");
            return -7;
        }
        return nativeMediaPlayerTakeScreenshot(j10, i10, str);
    }

    public synchronized int mediaPlayerUnRegisterPlayerObserver(int i10, IMediaPlayerObserver iMediaPlayerObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerUnRegisterPlayerObserver)");
            return -7;
        }
        return nativeMediaPlayerUnRegisterPlayerObserver(j10, i10, iMediaPlayerObserver);
    }

    public synchronized int mediaPlayerUnloadSrc(int i10, String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeMediaPlayerUnloadSrc(j10, i10, str);
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int monitorAudioRouteChange(boolean z10) {
        Logging.i("API call monitorAudioRouteChange:" + z10);
        return 0;
    }

    @Override // io.agora.rtc2.RtcEngine
    @TargetApi(11)
    @Deprecated
    public synchronized void monitorBluetoothHeadsetEvent(boolean z10) {
        Logging.i(TAG, "enter monitorBluetoothHeadsetEvent:" + z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized void monitorHeadsetEvent(boolean z10) {
        Logging.i(TAG, "enter monitorHeadsetEvent:" + z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteAllRemoteAudioStreams(boolean z10) {
        return muteAllRemoteAudioStreamsEx(z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteAllRemoteAudioStreamsEx(boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteAllRemoteAudioStreams(j10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteAllRemoteVideoStreams(boolean z10) {
        return muteAllRemoteVideoStreamsEx(z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteAllRemoteVideoStreamsEx(boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteAllRemoteVideoStreams(j10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteLocalAudioStream(boolean z10) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return muteLocalAudioStreamEx(z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteLocalAudioStreamEx(boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteLocalAudioStream(j10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteLocalVideoStream(boolean z10) {
        return muteLocalVideoStreamEx(z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteLocalVideoStreamEx(boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteLocalVideoStream(j10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteRecordingSignal(boolean z10) {
        return muteRecordingSignalEx(z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteRecordingSignalEx(boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteRecordingSignal(j10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteRemoteAudioStream(int i10, boolean z10) {
        return muteRemoteAudioStreamEx(i10, z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteRemoteAudioStreamEx(int i10, boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteRemoteAudioStream(j10, i10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int muteRemoteVideoStream(int i10, boolean z10) {
        return muteRemoteVideoStreamEx(i10, z10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int muteRemoteVideoStreamEx(int i10, boolean z10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeMuteRemoteVideoStream(j10, i10, z10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public native int nativePushExternalVideoFrame(long j10, VideoFrame videoFrame, int i10);

    @CalledByNative
    public void onEvent(int i10, byte[] bArr) {
        Iterator<Map.Entry<IRtcEngineEventHandler, RtcEngineEventHandlerProxy>> it = this.mRtcHandlers.entrySet().iterator();
        while (it.hasNext()) {
            RtcEngineEventHandlerProxy value = it.next().getValue();
            if (value == null) {
                it.remove();
            } else {
                value.handleEvent(i10, bArr);
            }
        }
    }

    @CalledByNative
    public void onEventEx(String str, int i10, String str2, int i11, byte[] bArr) {
        ArrayList<RtcEngineEventHandlerProxy> arrayList = !TextUtils.isEmpty(str2) ? this.mRtcExHandlerMap.get(Pair.create(str, str2)) : null;
        if (arrayList == null) {
            arrayList = this.mRtcExHandlerMap.get(Pair.create(str, Integer.valueOf(i10)));
        }
        if (arrayList != null) {
            Iterator<RtcEngineEventHandlerProxy> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().handleEvent(i11, bArr);
            }
        } else {
            Log.e(TAG, "onEventEx: can't find exhandler for channelId=" + str + " uid=" + i10);
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pauseAllChannelMediaRelay() {
        return pauseAllChannelMediaRelayEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int pauseAllChannelMediaRelayEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePauseAllChannelMediaRelay(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int pauseAllEffects() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePauseAllEffects(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pauseAudio() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePauseAudio(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pauseAudioMixing() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePauseAudioMixing(j10);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int pauseEffect(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePauseEffect(j10, i10);
    }

    public synchronized int performVideoEffectAction(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePerformVideoEffectAction(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int playAllEffects(int i10, double d10, double d11, double d12, boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePlayAllEffects(j10, i10, d10, d11, d12, z10);
    }

    @Override // io.agora.rtc2.IAudioEffectManager
    @Deprecated
    public synchronized int playEffect(int i10, String str, int i11, double d10, double d11, double d12) {
        return playEffect(i10, str, i11, d10, d11, d12, false);
    }

    @Override // io.agora.rtc2.RtcEngineEx, io.agora.rtc2.IAudioEffectManager
    public int playEffectEx(RtcConnection rtcConnection, int i10, String str, int i11, double d10, double d11, double d12, boolean z10) {
        return playEffectEx(rtcConnection, i10, str, i11, d10, d11, d12, z10, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int preloadChannel(String str, String str2, int i10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativePreloadChannel(j10, str, str2, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int preloadChannelWithUserAccount(String str, String str2, String str3) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativePreloadChannelWithUserAccount(j10, str, str2, str3);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int preloadEffect(int i10, String str) {
        return preloadEffect(i10, str, 0);
    }

    @Override // io.agora.rtc2.RtcEngineEx, io.agora.rtc2.IAudioEffectManager
    public int preloadEffectEx(RtcConnection rtcConnection, int i10, String str) {
        return preloadEffectEx(rtcConnection, i10, str, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pullPlaybackAudioFrame(ByteBuffer byteBuffer, int i10) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (byteBuffer == null || byteBuffer.capacity() != i10) {
                    return -2;
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("data must be direct buffer!");
                }
                return nativePullAudioFrame(this.mNativeHandle, byteBuffer, i10, this.mExSinkAudioSampleRate, this.mExSinkAudioChannels);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(ByteBuffer byteBuffer, long j10, int i10) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("data must be direct buffer!");
                }
                return nativePushExternalAudioFrameRawData(this.mNativeHandle, byteBuffer, j10, this.mExSourceAudioSampleRate, 2, this.mExSourceAudioChannels, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalEncodedVideoFrame(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo) {
        return pushExternalEncodedVideoFrameById(byteBuffer, encodedVideoFrameInfo, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalEncodedVideoFrameById(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo, int i10) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!byteBuffer.isDirect()) {
                    throw new IllegalArgumentException("data must be direct buffer!");
                }
                return nativePushExternalEncodedVideoFrame(this.mNativeHandle, byteBuffer, encodedVideoFrameInfo, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean pushExternalVideoFrame(VideoFrame videoFrame) {
        int pushExternalVideoFrameById = pushExternalVideoFrameById(videoFrame, 0);
        if (pushExternalVideoFrameById == 0) {
            return true;
        }
        Logging.e(TAG, "Failed to pushExternalVideoFrame, " + pushExternalVideoFrameById);
        return false;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalVideoFrameById(VideoFrame videoFrame, int i10) {
        try {
            if (this.mNativeHandle == 0) {
                return -7;
            }
            if (videoFrame == null) {
                return -2;
            }
            if (!(videoFrame.getBuffer() instanceof VideoFrame.I010Buffer)) {
                if (videoFrame.getBuffer() instanceof VideoFrame.P010Buffer) {
                }
                return nativePushExternalVideoFrame(this.mNativeHandle, videoFrame, i10);
            }
            ColorSpace.Transfer transfer = videoFrame.getColorSpace().getTransfer();
            if (transfer != ColorSpace.Transfer.SMPTEST2084 && transfer != ColorSpace.Transfer.ARIB_STD_B67) {
                return -2;
            }
            return nativePushExternalVideoFrame(this.mNativeHandle, videoFrame, i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized AgoraFocalLengthInfo[] queryCameraFocalLengthCapability() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeQueryCameraFocalLengthCapability(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized CodecCapInfo[] queryCodecCapability() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeQueryCodecCapability(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int queryDeviceScore() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeQueryDeviceScore(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public int queryHDRCapability(Constants.VIDEO_MODULE_TYPE video_module_type) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeQueryHDRCapability(j10, Constants.VIDEO_MODULE_TYPE.getValue(video_module_type));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int queryScreenCaptureCapability() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeQueryScreenCaptureCapability(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int rate(String str, int i10, String str2) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeRate(j10, str, i10, str2);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized void recordCreateEngineTimeStamp(long j10, long j11) {
        try {
            try {
                if (this.mNativeHandle != 0) {
                    long nanoTime = System.nanoTime();
                    nativeRecordCreateEngineTimeStamp(this.mNativeHandle, nanoTime - j10, nanoTime - j11);
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerAudioEncodedFrameObserver(AudioEncodedFrameObserverConfig audioEncodedFrameObserverConfig, IAudioEncodedFrameObserver iAudioEncodedFrameObserver) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (audioEncodedFrameObserverConfig == null) {
                    try {
                        audioEncodedFrameObserverConfig = new AudioEncodedFrameObserverConfig();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return nativeregisterAudioEncodedFrameObserver(this.mNativeHandle, iAudioEncodedFrameObserver, audioEncodedFrameObserverConfig.postionType, audioEncodedFrameObserverConfig.encodingType);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRegisterAudioFrameObserver(j10, iAudioFrameObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRegisterAudioSpectrumObserver(j10, iAudioSpectrumObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerExtension(String str, String str2, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeRegisterExtension(j10, str, str2, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerFaceInfoObserver(IFaceInfoObserver iFaceInfoObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRegisterFaceInfoObserver(j10, iFaceInfoObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerLocalUserAccount(String str, String str2) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRegisterLocalUserAccount(j10, str, str2);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (iMetadataObserver == null) {
            Logging.e(TAG, "Failed to registerMediaMetadataObserver, observer is null");
            return -2;
        }
        return nativeRegisterMediaMetadataObserver(j10, iMetadataObserver, i10);
    }

    public synchronized int registerMediaPlayerAudioSpectrumObserver(int i10, IAudioSpectrumObserver iAudioSpectrumObserver, int i11) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeRegisterMediaPlayerAudioSpectrumObserver(j10, i10, iAudioSpectrumObserver, i11);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerVideoEncodedFrameObserver(IVideoEncodedFrameObserver iVideoEncodedFrameObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRegisterVideoEncodedFrameObserver(j10, iVideoEncodedFrameObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int registerVideoFrameObserver(IVideoFrameObserver iVideoFrameObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRegisterVideoFrameObserver(j10, iVideoFrameObserver);
    }

    public synchronized void reinitialize(RtcEngineConfig rtcEngineConfig) {
        this.mRtcHandlers.clear();
        addHandler(rtcEngineConfig.mEventHandler);
    }

    public int releaseRecorder(String str, int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeReleaseRecorder(j10, i10, str, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized void removeHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        if (iRtcEngineEventHandler != null) {
            this.mRtcHandlers.remove(iRtcEngineEventHandler);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        r5.remove(r1);
     */
    @Override // io.agora.rtc2.RtcEngineEx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void removeHandlerEx(IRtcEngineEventHandler iRtcEngineEventHandler, RtcConnection rtcConnection) {
        if (iRtcEngineEventHandler == null || rtcConnection == null) {
            return;
        }
        ArrayList<RtcEngineEventHandlerProxy> arrayList = this.mRtcExHandlerMap.get(Pair.create(getChannelId(rtcConnection), Integer.valueOf(getUserId(rtcConnection))));
        if (arrayList != null) {
            Iterator<RtcEngineEventHandlerProxy> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                RtcEngineEventHandlerProxy next = it.next();
                if (next.getHandler() == iRtcEngineEventHandler) {
                    break;
                }
            }
        }
    }

    public synchronized int removeVideoEffect(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeRemoveVideoEffect(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int removeVideoWatermark(String str) {
        return removeVideoWatermarkEx(str, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int removeVideoWatermarkEx(String str, RtcConnection rtcConnection) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(str)) {
                    return -2;
                }
                if (rtcConnection != null) {
                    return nativeRemoveVideoWatermarkEx(this.mNativeHandle, str, getChannelId(rtcConnection), getUserId(rtcConnection));
                }
                try {
                    return nativeRemoveVideoWatermark(this.mNativeHandle, str);
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int renewToken(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (str == null) {
            return -2;
        }
        return nativeRenewToken(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int resumeAllChannelMediaRelay() {
        return resumeAllChannelMediaRelayEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int resumeAllChannelMediaRelayEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeResumeAllChannelMediaRelay(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int resumeAllEffects() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeResumeAllEffects(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int resumeAudio() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeResumeAudio(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int resumeAudioMixing() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeResumeAudioMixing(j10);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int resumeEffect(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeResumeEffect(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int selectAudioTrack(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSelectAudioTrack(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public int sendAudioMetadata(byte[] bArr) {
        return sendAudioMetadataEx(bArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendAudioMetadataEx(byte[] bArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSendAudioMetadata(j10, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int sendCustomReportMessage(String str, String str2, String str3, String str4, int i10) {
        return sendCustomReportMessageEx(str, str2, str3, str4, i10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendCustomReportMessageEx(String str, String str2, String str3, String str4, int i10, RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSendCustomReportMessage(j10, str, str2, str3, str4, i10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int sendMediaControlMessage(int i10, byte[] bArr) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return sendMediaControlMessageEx(i10, bArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendMediaControlMessageEx(int i10, byte[] bArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSendMediaControlMessage(j10, i10, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int sendRdtMessage(int i10, int i11, byte[] bArr) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return sendRdtMessageEx(i10, i11, bArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendRdtMessageEx(int i10, int i11, byte[] bArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSendRdtMessage(j10, i10, i11, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int sendStreamMessage(int i10, byte[] bArr) {
        return sendStreamMessageEx(i10, bArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int sendStreamMessageEx(int i10, byte[] bArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSendStreamMessage(j10, i10, bArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAINSMode(boolean z10, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativesetAINSMode(j10, z10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAVSyncSource(String str, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAVSyncSource(j10, str, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAdvancedAudioOptions(AdvancedAudioOptions advancedAudioOptions) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAdvancedAudioOptions(j10, advancedAudioOptions.audioProcessingChannels.getValue());
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setApiCallMode(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetApiCallMode(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioEffectParameters(int i10, int i11, int i12) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetAudioEffectParameters(j10, i10, i11, i12);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioEffectPreset(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioEffectPreset(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode audioMixingDualMonoMode) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioMixingDualMonoMode(j10, Constants.AudioMixingDualMonoMode.getValue(audioMixingDualMonoMode));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingPitch(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioMixingPitch(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingPlaybackSpeed(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioMixingPlaybackSpeed(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioMixingPosition(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioMixingPosition(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioProfile(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioProfile(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioScenario(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioScenario(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setBeautyEffectOptions(boolean z10, BeautyOptions beautyOptions) {
        return setBeautyEffectOptions(z10, beautyOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraAutoFocusFaceModeEnabled(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCameraAutoFocusFaceModeEnabled(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraCapturerConfiguration(CameraCapturerConfiguration cameraCapturerConfiguration) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (cameraCapturerConfiguration == null) {
            Logging.e(TAG, "CameraCapturerConfiguration is null");
            return -2;
        }
        return nativeSetCameraCapturerConfiguration(j10, cameraCapturerConfiguration);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraExposureFactor(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCameraExposureFactor(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraExposurePosition(float f10, float f11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCameraExposurePosition(j10, f10, f11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraFocusPositionInPreview(float f10, float f11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCameraFocusPositionInPreview(j10, f10, f11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraTorchOn(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCameraTorchOn(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCameraZoomFactor(float f10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCameraZoomFactor(j10, f10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setChannelProfile(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetChannelProfile(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setClientRole(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetClientRole(j10, i10, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setCloudProxy(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetCloudProxy(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setColorEnhanceOptions(boolean z10, ColorEnhanceOptions colorEnhanceOptions) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        return setColorEnhanceOptions(z10, colorEnhanceOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDefaultAudioRoutetoSpeakerphone(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetDefaultAudioRoutetoSpeakerphone(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDirectCdnStreamingAudioConfiguration(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetDirectCdnStreamingAudioConfiguration(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDirectCdnStreamingVideoConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                VideoEncoderConfiguration.VideoDimensions videoDimensions = videoEncoderConfiguration.dimensions;
                return nativeSetDirectCdnStreamingVideoConfiguration(j10, videoDimensions.width, videoDimensions.height, videoEncoderConfiguration.frameRate, videoEncoderConfiguration.bitrate, videoEncoderConfiguration.minBitrate, videoEncoderConfiguration.orientationMode.getValue(), videoEncoderConfiguration.mirrorMode.getValue(), videoEncoderConfiguration.degradationPrefer.getValue());
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode) {
        return setDualStreamMode(simulcastStreamMode, new SimulcastStreamConfig());
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setDualStreamModeEx(Constants.SimulcastStreamMode simulcastStreamMode, SimulcastStreamConfig simulcastStreamConfig, RtcConnection rtcConnection) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (simulcastStreamConfig == null) {
                    try {
                        simulcastStreamConfig = new SimulcastStreamConfig();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return nativeSetDualStreamModeEx(this.mNativeHandle, Constants.SimulcastStreamMode.getValue(simulcastStreamMode), simulcastStreamConfig, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setEarMonitoringAudioFrameParameters(int i10, int i11, int i12, int i13) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetEarMonitoringAudioFrameParameters(j10, i10, i11, i12, i13);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setEffectPosition(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetEffectPosition(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int setEffectsVolume(double d10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetEffectsVolume(j10, d10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setEnableSpeakerphone(boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetEnableSpeakerphone(j10, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3, String str4) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (extensionInfo == null) {
            return -2;
        }
        return nativeSetExtensionProperty2(j10, str, str2, str3, str4, Constants.MediaSourceType.getValue(extensionInfo.mediaSourceType), extensionInfo.remoteUid, extensionInfo.channelId, extensionInfo.localUid);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProviderProperty(String str, String str2, String str3) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetExtensionProviderProperty(j10, str, str2, str3);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalAudioSink(boolean z10, int i10, int i11) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                this.mExSinkAudioSampleRate = i10;
                this.mExSinkAudioChannels = i11;
                return nativeSetExternalAudioSink(j10, z10, i10, i11);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalAudioSource(boolean z10, int i10, int i11) {
        return setExternalAudioSource(z10, i10, i11, false, true);
    }

    @Override // io.agora.rtc2.RtcEngine
    public int setExternalMediaProjection(MediaProjection mediaProjection) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (mediaProjection == null) {
            Logging.w(TAG, "setExternalMediaProjection null");
        }
        return nativeSetExternalMediaProjection(this.mNativeHandle, mediaProjection);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    @Override // io.agora.rtc2.RtcEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int setExternalRemoteEglContext(Object obj) {
        boolean z10;
        android.opengl.EGLContext eGLContext;
        EGLContext eGLContext2;
        boolean equals;
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (obj != null) {
            if (obj instanceof EglBase10.Context) {
                eGLContext2 = ((EglBase10.Context) obj).getEglContext();
            } else {
                if (obj instanceof EglBase14.Context) {
                    eGLContext = ((EglBase14.Context) obj).getEglContext();
                } else if (obj instanceof EGLContext) {
                    eGLContext2 = (EGLContext) obj;
                } else if (obj instanceof android.opengl.EGLContext) {
                    eGLContext = (android.opengl.EGLContext) obj;
                } else {
                    z10 = false;
                    if (!z10) {
                        Logging.e(TAG, "setExternalRemoteEglContext failure, eglContext Invalid.");
                        return -1;
                    }
                }
                equals = eGLContext.equals(EGL14.EGL_NO_CONTEXT);
                z10 = !equals;
                if (!z10) {
                }
            }
            equals = eGLContext2.equals(EGL10.EGL_NO_CONTEXT);
            z10 = !equals;
            if (!z10) {
            }
        }
        synchronized (this) {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetExternalRemoteEglContext(j10, obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalVideoSource(boolean z10, boolean z11, Constants.ExternalVideoSourceType externalVideoSourceType) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return setExternalVideoSource(z10, z11, externalVideoSourceType, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions) {
        return setFaceShapeAreaOptions(faceShapeAreaOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeBeautyOptions(boolean z10, FaceShapeBeautyOptions faceShapeBeautyOptions) {
        return setFaceShapeBeautyOptions(z10, faceShapeBeautyOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFilterEffectOptions(boolean z10, FilterEffectOptions filterEffectOptions) {
        return setFilterEffectOptions(z10, filterEffectOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHeadphoneEQParameters(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetHeadphoneEQParameters(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHeadphoneEQPreset(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetHeadphoneEQPreset(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHighPriorityUserList(int[] iArr, int i10) {
        return setHighPriorityUserListEx(iArr, i10, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setHighPriorityUserListEx(int[] iArr, int i10, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetHighPriorityUserList(j10, iArr, i10, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setHighQualityAudioParameters(boolean z10, boolean z11, boolean z12) {
        return setParameterObject("che.audio.codec.hq", formatString("{\"fullband\":%b,\"stereo\":%b,\"fullBitrate\":%b}", Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setInEarMonitoringVolume(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetInEarMonitoringVolume(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalAccessPoint(LocalAccessPointConfiguration localAccessPointConfiguration) {
        Throwable th2;
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (localAccessPointConfiguration.ipList == null) {
                    try {
                        localAccessPointConfiguration.ipList = new ArrayList<>();
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                if (localAccessPointConfiguration.domainList == null) {
                    localAccessPointConfiguration.domainList = new ArrayList<>();
                }
                if (localAccessPointConfiguration.verifyDomainName == null) {
                    localAccessPointConfiguration.verifyDomainName = "";
                }
                if (localAccessPointConfiguration.advancedConfig == null) {
                    localAccessPointConfiguration.advancedConfig = new LocalAccessPointConfiguration.AdvancedConfigInfo();
                }
                return nativeSetLocalAccessPoint(this.mNativeHandle, localAccessPointConfiguration.ipList, localAccessPointConfiguration.domainList, localAccessPointConfiguration.verifyDomainName, localAccessPointConfiguration.mode, localAccessPointConfiguration.advancedConfig, localAccessPointConfiguration.disableAut);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setLocalRenderMode(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLocalRenderMode(j10, i10, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalRenderTargetFps(Constants.VideoSourceType videoSourceType, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativesetLocalRenderTargetFps(j10, Constants.VideoSourceType.getValue(videoSourceType), i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setLocalVideoMirrorMode(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            return -2;
        }
        return nativeSetLocalVideoMirrorMode(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoiceEqualization(Constants.AUDIO_EQUALIZATION_BAND_FREQUENCY audio_equalization_band_frequency, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (audio_equalization_band_frequency == null) {
            return -2;
        }
        return nativeSetLocalVoiceEqualization(j10, audio_equalization_band_frequency.getValue(), i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoiceFormant(double d10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLocalVoiceFormant(j10, d10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoicePitch(double d10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLocalVoicePitch(j10, d10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalVoiceReverb(Constants.AUDIO_REVERB_TYPE audio_reverb_type, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (audio_reverb_type == null) {
            return -2;
        }
        return nativeSetLocalVoiceReverb(j10, audio_reverb_type.getValue(), i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogFile(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLogFile(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogFileSize(long j10) {
        long j11 = this.mNativeHandle;
        if (j11 == 0) {
            return -7;
        }
        return nativeSetLogFileSize(j11, j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogFilter(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLogFilter(j10, i10 & Constants.LOG_FILTER_DEBUG);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLogLevel(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLogLevel(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLowlightEnhanceOptions(boolean z10, LowLightEnhanceOptions lowLightEnhanceOptions) {
        return setLowlightEnhanceOptions(z10, lowLightEnhanceOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    public int setMediaRecorderObserver(IMediaRecorderCallback iMediaRecorderCallback, int i10, String str, boolean z10, int i11) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        Logging.e("setMediaRecorderObserver streamtype is " + i11 + " channelId" + str);
        return nativeSetMediaRecorderObserver(this.mNativeHandle, iMediaRecorderCallback, i10, str, z10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setMixedAudioFrameParameters(int i10, int i11, int i12) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetMixedAudioFrameParameters(j10, i10, i11, i12);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setParameters(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetParameters(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setParametersEx(String str, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetParametersEx(j10, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setPlaybackAudioFrameBeforeMixingParameters(int i10, int i11) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return setPlaybackAudioFrameBeforeMixingParameters(i10, i11, (i10 / 100) * i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setPlaybackAudioFrameParameters(int i10, int i11, int i12, int i13) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetPlaybackAudioFrameParameters(j10, i10, i11, i12, i13);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized void setPreferHeadset(boolean z10) {
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setProfile(String str, boolean z10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetProfile(j10, str, z10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRecordingAudioFrameParameters(int i10, int i11, int i12, int i13) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetRecordingAudioFrameParameters(j10, i10, i11, i12, i13);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteDefaultVideoStreamType(int i10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return setRemoteDefaultVideoStreamType(i10 == 0 ? Constants.VideoStreamType.VIDEO_STREAM_HIGH : Constants.VideoStreamType.VIDEO_STREAM_LOW);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteRenderMode(int i10, int i11) {
        return setRemoteRenderModeEx(i10, i11, 2, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteRenderModeEx(int i10, int i11, int i12, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetRemoteRenderMode(j10, i10, i11, i12, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteRenderTargetFps(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativesetRemoteRenderTargetFps(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteSubscribeFallbackOption(int i10) {
        Constants.StreamFallbackOptions streamFallbackOptions;
        Constants.StreamFallbackOptions[] values = Constants.StreamFallbackOptions.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                streamFallbackOptions = null;
                break;
            }
            streamFallbackOptions = values[i11];
            if (streamFallbackOptions.getValue() == i10) {
                break;
            }
            i11++;
        }
        if (streamFallbackOptions == null) {
            return -2;
        }
        return setRemoteSubscribeFallbackOption(streamFallbackOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteUserPriority(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetRemoteUserPriority(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteUserSpatialAudioParams(int i10, SpatialAudioParams spatialAudioParams) {
        return setRemoteUserSpatialAudioParamsEx(i10, spatialAudioParams, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteUserSpatialAudioParamsEx(int i10, SpatialAudioParams spatialAudioParams, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                if (spatialAudioParams == null) {
                    return -2;
                }
                return nativeSetRemoteUserSpatialAudioParams(j10, i10, spatialAudioParams, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    @Deprecated
    public synchronized int setRemoteVideoStreamType(int i10, int i11) {
        return setRemoteVideoStreamTypeEx(i10, i11, (RtcConnection) null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    @Deprecated
    public synchronized int setRemoteVideoStreamTypeEx(int i10, int i11, RtcConnection rtcConnection) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return setRemoteVideoStreamTypeEx(i10, i11 == 0 ? Constants.VideoStreamType.VIDEO_STREAM_HIGH : Constants.VideoStreamType.VIDEO_STREAM_LOW, rtcConnection);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteVideoSubscriptionOptions(int i10, VideoSubscriptionOptions videoSubscriptionOptions) {
        return setRemoteVideoSubscriptionOptionsEx(i10, videoSubscriptionOptions, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteVideoSubscriptionOptionsEx(int i10, VideoSubscriptionOptions videoSubscriptionOptions, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                if (videoSubscriptionOptions == null) {
                    return -2;
                }
                return nativeSetRemoteVideoSubscriptionOptions(j10, i10, videoSubscriptionOptions, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteVoicePosition(int i10, double d10, double d11) {
        return setRemoteVoicePositionEx(i10, d10, d11, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteVoicePositionEx(int i10, double d10, double d11, RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetRemoteVoicePosition(j10, i10, d10, d11, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRouteInCommunicationMode(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetRouteInCommunicationMode(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setScreenCaptureScenario(Constants.ScreenScenarioType screenScenarioType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetScreenCaptureScenario(j10, Constants.ScreenScenarioType.getValue(screenScenarioType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSimulcastConfig(SimulcastConfig simulcastConfig) {
        return setSimulcastConfigEx(simulcastConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSimulcastConfigEx(SimulcastConfig simulcastConfig, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                if (simulcastConfig == null) {
                    return -2;
                }
                return nativeSetSimulcastConfigEx(j10, simulcastConfig.configs, simulcastConfig.publishFallbackEnable, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeAudioAllowlist(int[] iArr) {
        return setSubscribeAudioAllowlistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeAudioAllowlistEx(int[] iArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetSubscribeAudioWhitelist(j10, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeAudioBlocklist(int[] iArr) {
        return setSubscribeAudioBlocklistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeAudioBlocklistEx(int[] iArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetSubscribeAudioBlacklist(j10, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeVideoAllowlist(int[] iArr) {
        return setSubscribeVideoAllowlistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeVideoAllowlistEx(int[] iArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetSubscribeVideoWhitelist(j10, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setSubscribeVideoBlocklist(int[] iArr) {
        return setSubscribeVideoBlocklistEx(iArr, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setSubscribeVideoBlocklistEx(int[] iArr, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetSubscribeVideoBlacklist(j10, iArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setTextureId(int i10, android.opengl.EGLContext eGLContext, int i11, int i12, long j10) {
        return -4;
    }

    public synchronized int setTextureIdWithMatrix(int i10, android.opengl.EGLContext eGLContext, int i11, int i12, int i13, long j10, float[] fArr) {
        return -4;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoDenoiserOptions(boolean z10, VideoDenoiserOptions videoDenoiserOptions) {
        return setVideoDenoiserOptions(z10, videoDenoiserOptions, Constants.MediaSourceType.PRIMARY_CAMERA_SOURCE);
    }

    public synchronized int setVideoEffectBoolParam(String str, String str2, boolean z10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVideoEffectBoolParam(j10, str, str2, z10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int setVideoEffectFloatParam(String str, String str2, float f10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVideoEffectFloatParam(j10, str, str2, f10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public synchronized int setVideoEffectIntParam(String str, String str2, int i10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVideoEffectIntParam(j10, str, str2, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        return setVideoEncoderConfigurationEx(videoEncoderConfiguration, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setVideoEncoderConfigurationEx(VideoEncoderConfiguration videoEncoderConfiguration, RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        VideoEncoderConfiguration.VideoDimensions videoDimensions = videoEncoderConfiguration.dimensions;
        return nativeSetVideoEncoderConfiguration(j10, videoDimensions.width, videoDimensions.height, videoEncoderConfiguration.frameRate, videoEncoderConfiguration.bitrate, videoEncoderConfiguration.minBitrate, videoEncoderConfiguration.orientationMode.getValue(), videoEncoderConfiguration.mirrorMode.getValue(), videoEncoderConfiguration.degradationPrefer.getValue(), videoEncoderConfiguration.advanceOptions.compressionPreference.getValue(), videoEncoderConfiguration.advanceOptions.encodingPreference.getValue(), videoEncoderConfiguration.advanceOptions.encodeAlpha, videoEncoderConfiguration.codecType.getValue(), getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoQoEPreference(Constants.QoEPreference qoEPreference) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativesetVideoQoEPreference(j10, Constants.QoEPreference.getValue(qoEPreference));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoQualityParameters(boolean z10) {
        return setParameters(String.format("{\"rtc.video.prefer_frame_rate\":%b,\"che.video.prefer_frame_rate\":%b}", Boolean.valueOf(z10), Boolean.valueOf(z10)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoScenario(Constants.VideoScenario videoScenario) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativesetVideoScenario(j10, Constants.VideoScenario.getValue(videoScenario));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceBeautifierParameters(int i10, int i11, int i12) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVoiceBeautifierParameters(j10, i10, i11, i12);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceBeautifierPreset(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetVoiceBeautifierPreset(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceConversionParameters(int i10, int i11, int i12) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVoiceConversionParameters(j10, i10, i11, i12);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVoiceConversionPreset(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetVoiceConversionPreset(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int setVolumeOfEffect(int i10, double d10) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVolumeOfEffect(j10, i10, d10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setupAudioAttributes(AudioAttributes audioAttributes) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetupAudioAttributeContext(j10, audioAttributes);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setupLocalVideo(VideoCanvas videoCanvas) {
        int[] iArr;
        try {
            long j10 = this.mNativeHandle;
            if (j10 == 0) {
                return -7;
            }
            if (videoCanvas == null) {
                return nativeSetupLocalVideo(j10, null, null, 1, 0, 0, 0, null, 1, false, Constants.VideoModulePosition.getValue(Constants.VideoModulePosition.VIDEO_MODULE_POSITION_POST_CAPTURER), 0);
            }
            if (!validateVideoRendererView(videoCanvas)) {
                return -2;
            }
            Rect rect = videoCanvas.rect;
            if (rect != null) {
                int i10 = rect.left;
                int i11 = rect.top;
                iArr = new int[]{i10, i11, rect.right - i10, rect.bottom - i11};
            } else {
                iArr = null;
            }
            return nativeSetupLocalVideo(this.mNativeHandle, videoCanvas.view, videoCanvas.surfaceTexture, videoCanvas.renderMode, videoCanvas.mirrorMode, videoCanvas.sourceType, videoCanvas.mediaPlayerId, iArr, videoCanvas.setupMode, videoCanvas.enableAlphaMask, Constants.VideoModulePosition.getValue(videoCanvas.position), videoCanvas.backgroundColor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setupRemoteVideo(VideoCanvas videoCanvas) {
        return setupRemoteVideoEx(videoCanvas, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setupRemoteVideoEx(VideoCanvas videoCanvas, RtcConnection rtcConnection) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (videoCanvas == null) {
            return -2;
        }
        if (!validateVideoRendererView(videoCanvas)) {
            return -2;
        }
        if (videoCanvas.uid == 0) {
            return -1;
        }
        return nativeSetupRemoteVideo(this.mNativeHandle, videoCanvas.view, videoCanvas.surfaceTexture, videoCanvas.renderMode, videoCanvas.mirrorMode, videoCanvas.uid, videoCanvas.subviewUid, getRect(videoCanvas.rect), videoCanvas.setupMode, videoCanvas.enableAlphaMask, getChannelId(rtcConnection), getUserId(rtcConnection), videoCanvas.backgroundColor);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioMixing(String str, boolean z10, int i10) {
        return startAudioMixing(str, z10, i10, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioRecording(AudioRecordingConfiguration audioRecordingConfiguration) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(audioRecordingConfiguration.filePath)) {
                    return -2;
                }
                return nativeStartAudioRecording2(this.mNativeHandle, audioRecordingConfiguration.filePath, audioRecordingConfiguration.codec, audioRecordingConfiguration.sampleRate, audioRecordingConfiguration.fileRecordOption, audioRecordingConfiguration.quality, audioRecordingConfiguration.recordingChannel);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startCameraCapture(Constants.VideoSourceType videoSourceType, CameraCapturerConfiguration cameraCapturerConfiguration) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (cameraCapturerConfiguration == null) {
            return -2;
        }
        return nativeStartCameraCapture(j10, Constants.VideoSourceType.getValue(videoSourceType), cameraCapturerConfiguration);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startDirectCdnStreaming(IDirectCdnStreamingEventHandler iDirectCdnStreamingEventHandler, String str, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeStartDirectCdnStreaming(j10, iDirectCdnStreamingEventHandler, str, directCdnStreamingMediaOptions);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startEchoTest(EchoTestConfiguration echoTestConfiguration) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                Context context = this.mContext.get();
                if (context == null) {
                    return -7;
                }
                doMonitorSystemEvent(context);
                return nativeStartEchoTestWithConfig(this.mNativeHandle, echoTestConfiguration.view, echoTestConfiguration.enableAudio, echoTestConfiguration.enableVideo, echoTestConfiguration.token, echoTestConfiguration.channelId, echoTestConfiguration.intervalInSeconds);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startLastmileProbeTest(LastmileProbeConfig lastmileProbeConfig) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                Context context = this.mContext.get();
                if (context == null) {
                    return -7;
                }
                doMonitorSystemEvent(context);
                return nativeStartLastmileProbeTest(this.mNativeHandle, lastmileProbeConfig.probeUplink, lastmileProbeConfig.probeDownlink, lastmileProbeConfig.expectedUplinkBitrate, lastmileProbeConfig.expectedDownlinkBitrate);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startLocalAudioMixer(LocalAudioMixerConfiguration localAudioMixerConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeStartLocalAudioMixer(this.mNativeHandle, new RtcEngineMessage.PLocalAudioMixedTrackConfiguration().marshall(localAudioMixerConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startLocalVideoTranscoder(LocalTranscoderConfiguration localTranscoderConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeStartLocalVideoTranscoder(this.mNativeHandle, new RtcEngineMessage.PLocalLiveTranscoderConfiguration().marshall(localTranscoderConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startMediaRenderingTracing() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartMediaRenderingTracing(j10);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startMediaRenderingTracingEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartMediaRenderingTracingEx(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startOrUpdateChannelMediaRelay(ChannelMediaRelayConfiguration channelMediaRelayConfiguration) {
        return startOrUpdateChannelMediaRelayEx(channelMediaRelayConfiguration, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startOrUpdateChannelMediaRelayEx(ChannelMediaRelayConfiguration channelMediaRelayConfiguration, RtcConnection rtcConnection) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (!checkRelayConfiguration(channelMediaRelayConfiguration)) {
                    return -2;
                }
                Map<String, ChannelMediaInfo> destChannelMediaInfos = channelMediaRelayConfiguration.getDestChannelMediaInfos();
                ChannelMediaInfo[] channelMediaInfoArr = new ChannelMediaInfo[destChannelMediaInfos.size()];
                destChannelMediaInfos.values().toArray(channelMediaInfoArr);
                return nativeStartOrUpdateChannelMediaRelay(this.mNativeHandle, channelMediaRelayConfiguration.getSrcChannelMediaInfo(), channelMediaInfoArr, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startPlaybackDeviceTest(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartPlaybackDeviceTest(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startPreview() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartPreview(j10);
    }

    public int startRecording(String str, int i10, int i11, int i12, int i13, int i14, String str2, boolean z10, int i15, int i16, int i17, int i18, int i19, int i20, int i21) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartRecording(j10, str, i10, i11, i12, i13, i14, str2, z10, i15, i16, i17, i18, i19, i20, i21);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRecordingDeviceTest(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartRecordingDeviceTest(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRhythmPlayer(String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || agoraRhythmPlayerConfig == null) {
                    return -2;
                }
                return nativeStartRhythmPlayer(this.mNativeHandle, str, str2, agoraRhythmPlayerConfig);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRtmpStreamWithTranscoding(String str, LiveTranscoding liveTranscoding) {
        return startRtmpStreamWithTranscodingEx(str, liveTranscoding, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startRtmpStreamWithTranscodingEx(String str, LiveTranscoding liveTranscoding, RtcConnection rtcConnection) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (liveTranscoding == null) {
                    return -2;
                }
                return nativeStartRtmpStreamWithTranscoding(this.mNativeHandle, str, new RtcEngineMessage.PLiveTranscoding().marshall(liveTranscoding), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startRtmpStreamWithoutTranscoding(String str) {
        return startRtmpStreamWithoutTranscodingEx(str, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int startRtmpStreamWithoutTranscodingEx(String str, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeStartRtmpStreamWithoutTranscoding(j10, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startScreenCapture(ScreenCaptureParameters screenCaptureParameters) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (screenCaptureParameters == null) {
            Logging.e(TAG, "Failed to startScreenCapture, parameters null");
            return -2;
        }
        if (getOSVersion() < 21) {
            Logging.e("current android version not support for screen capture!");
            return -2;
        }
        int i10 = 0;
        if (getOSVersion() < 29 && screenCaptureParameters.captureAudio) {
            Logging.e("current android version not support for capture audio!");
            screenCaptureParameters.captureAudio = false;
            i10 = -3;
        }
        if (screenCaptureParameters.captureAudio) {
            allowCaptureCurrentApp(screenCaptureParameters);
        }
        int nativeStartScreenCapture = nativeStartScreenCapture(this.mNativeHandle, screenCaptureParameters);
        return nativeStartScreenCapture != 0 ? nativeStartScreenCapture : i10;
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int stopAllEffects() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopAllEffects(j10);
    }

    public synchronized int stopAllRemoteVideo() {
        return setParameter("che.video.peer.stop_all_renders", true);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopAudioMixing() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopAudioMixing(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopAudioRecording() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopAudioRecording(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopCameraCapture(Constants.VideoSourceType videoSourceType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopCameraCapture(j10, Constants.VideoSourceType.getValue(videoSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopChannelMediaRelay() {
        return stopChannelMediaRelayEx(null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int stopChannelMediaRelayEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopChannelMediaRelay(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopDirectCdnStreaming() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopDirectCdnStreaming(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopEchoTest() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopEchoTest(j10);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int stopEffect(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopEffect(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopLastmileProbeTest() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopLastmileProbeTest(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopLocalAudioMixer() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopLocalAudioMixer(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopLocalVideoTranscoder() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopLocalVideoTranscoder(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopPlaybackDeviceTest() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopPlaybackDeviceTest(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopPreview() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopPreview(j10);
    }

    public int stopRecording(String str, int i10, boolean z10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopRecording(j10, i10, str, z10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopRecordingDeviceTest() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopRecordingDeviceTest(j10);
    }

    public synchronized int stopRemoteVideo(int i10) {
        return setParameter("che.video.peer.stop_video", toStringUserId(i10));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopRhythmPlayer() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopRhythmPlayer(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopRtmpStream(String str) {
        return stopRtmpStreamEx(str, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int stopRtmpStreamEx(String str, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeStopRtmpStream(j10, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopScreenCapture() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopScreenCapture(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int switchCamera() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSwitchCamera(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int takeSnapshot(int i10, SnapshotConfig snapshotConfig) {
        return takeSnapshotEx((RtcConnection) null, i10, snapshotConfig);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int takeSnapshotEx(RtcConnection rtcConnection, int i10, SnapshotConfig snapshotConfig) {
        Throwable th2;
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                if (snapshotConfig.filePath == null) {
                    try {
                        snapshotConfig.filePath = "";
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                return nativeTakeSnapshot2(j10, i10, snapshotConfig.filePath, Constants.VideoModulePosition.getValue(snapshotConfig.position), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int unRegisterAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeUnRegisterAudioSpectrumObserver(j10, iAudioSpectrumObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int unloadAllEffects() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeUnloadAllEffects(j10);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int unloadEffect(int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeUnloadEffect(j10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int unregisterMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        if (iMetadataObserver == null) {
            Logging.e(TAG, "Failed to unRegisterMediaMetadataObserver, observer null");
            return -2;
        }
        return nativeUnregisterMediaMetadataObserver(j10, iMetadataObserver, i10);
    }

    public synchronized int unregisterMediaPlayerAudioSpectrumObserver(int i10, IAudioSpectrumObserver iAudioSpectrumObserver) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed (mediaPlayerUnRegisterPlayerObserver)");
            return -7;
        }
        return nativeUnRegisterMediaPlayerAudioSpectrumObserver(j10, i10, iAudioSpectrumObserver);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateChannelMediaOptions(ChannelMediaOptions channelMediaOptions) {
        return updateChannelMediaOptionsEx(channelMediaOptions, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int updateChannelMediaOptionsEx(ChannelMediaOptions channelMediaOptions, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeUpdateChannelMediaOptions(j10, channelMediaOptions, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateDirectCdnStreamingMediaOptions(DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeUpdateDirectCdnStreamingMediaOptions(j10, directCdnStreamingMediaOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateLocalAudioMixerConfiguration(LocalAudioMixerConfiguration localAudioMixerConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeUpdateLocalAudioMixerConfiguration(this.mNativeHandle, new RtcEngineMessage.PLocalAudioMixedTrackConfiguration().marshall(localAudioMixerConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateLocalTranscoderConfiguration(LocalTranscoderConfiguration localTranscoderConfiguration) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeUpdateLocalTranscoderConfiguration(this.mNativeHandle, new RtcEngineMessage.PLocalLiveTranscoderConfiguration().marshall(localTranscoderConfiguration));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updatePreloadChannelToken(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeUpdatePreloadChannelToken(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateRtmpTranscoding(LiveTranscoding liveTranscoding) {
        return updateRtmpTranscodingEx(liveTranscoding, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int updateRtmpTranscodingEx(LiveTranscoding liveTranscoding, RtcConnection rtcConnection) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (liveTranscoding == null) {
                    return -2;
                }
                return nativeUpdateRtmpTranscoding(this.mNativeHandle, new RtcEngineMessage.PLiveTranscoding().marshall(liveTranscoding), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int updateScreenCaptureParameters(ScreenCaptureParameters screenCaptureParameters) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (screenCaptureParameters == null) {
            Logging.e(TAG, "Failed to updateScreenCaptureParameters, parameters null");
            return -2;
        }
        if (getOSVersion() < 21) {
            Logging.e("current android version not support for screen capture!");
            return -2;
        }
        int i10 = 0;
        if (getOSVersion() < 29 && screenCaptureParameters.captureAudio) {
            Logging.e("current android version not support for capture audio!");
            screenCaptureParameters.captureAudio = false;
            i10 = -3;
        }
        if (screenCaptureParameters.captureAudio) {
            allowCaptureCurrentApp(screenCaptureParameters);
        }
        int nativeUpdateScreenCaptureParameters = nativeUpdateScreenCaptureParameters(this.mNativeHandle, screenCaptureParameters);
        return nativeUpdateScreenCaptureParameters != 0 ? nativeUpdateScreenCaptureParameters : i10;
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int updateSharedContext(android.opengl.EGLContext eGLContext) {
        return -4;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String uploadLogFile() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            Logging.e(TAG, "RtcEngine does not initialize or it may be destroyed");
            return null;
        }
        return nativeUploadLogFile(j10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int writeLog(int i10, String str, Object... objArr) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        return nativeWriteLog(this.mNativeHandle, i10, String.format(str, objArr));
    }

    private int[] getRect(WatermarkOptions.Rectangle rectangle) {
        int[] iArr = new int[4];
        if (rectangle != null) {
            iArr[0] = rectangle.f49184x;
            iArr[1] = rectangle.f49185y;
            iArr[2] = rectangle.width;
            iArr[3] = rectangle.height;
        }
        return iArr;
    }

    public static synchronized boolean initializeNativeLibs(String str) {
        synchronized (RtcEngineImpl.class) {
            if (!sLibLoaded) {
                int i10 = 0;
                while (true) {
                    List<String> list = BuildConfig.so_list;
                    if (i10 >= list.size()) {
                        sLibLoaded = safeLoadLibrary(str, nativeLibraryName);
                        break;
                    }
                    boolean safeLoadLibrary = safeLoadLibrary(str, list.get(i10));
                    sLibLoaded = safeLoadLibrary;
                    if (!safeLoadLibrary) {
                        return safeLoadLibrary;
                    }
                    i10++;
                }
            }
            return sLibLoaded;
        }
    }

    private int setParameter(String str, String str2) {
        return setParameters(formatString("{\"%s\":\"%s\"}", str, str2));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int addVideoWatermark(WatermarkConfig watermarkConfig) {
        return addVideoWatermarkEx(watermarkConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int addVideoWatermarkEx(String str, WatermarkOptions watermarkOptions, RtcConnection rtcConnection) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (str == null || TextUtils.isEmpty(str) || watermarkOptions == null) {
                    return -2;
                }
                int[] rect = getRect(watermarkOptions.positionInLandscapeMode);
                int[] rect2 = getRect(watermarkOptions.positionInPortraitMode);
                if (rtcConnection == null) {
                    return nativeAddVideoWatermark(this.mNativeHandle, str, watermarkOptions.visibleInPreview, rect, rect2);
                }
                return nativeAddVideoWatermarkEx(this.mNativeHandle, str, watermarkOptions.visibleInPreview, rect, rect2, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int createDataStream(boolean z10, boolean z11) {
        return createDataStreamEx(z10, z11, null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int createDataStreamEx(boolean z10, boolean z11, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeCreateDataStream(j10, z10, z11, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableDualStreamMode(boolean z10, SimulcastStreamConfig simulcastStreamConfig) {
        return enableDualStreamModeEx(z10, simulcastStreamConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExtension(String str, String str2, boolean z10) {
        return enableExtension(str, str2, z10, Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableInEarMonitoring(boolean z10, int i10) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeEnableInEarMonitoring(j10, z10, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableVirtualBackground(boolean z10, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty, Constants.MediaSourceType mediaSourceType) {
        SegmentationProperty segmentationProperty2;
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (virtualBackgroundSource == null) {
            if (z10) {
                return -2;
            }
            virtualBackgroundSource = new VirtualBackgroundSource();
        }
        if (segmentationProperty != null) {
            segmentationProperty2 = segmentationProperty;
        } else {
            if (z10) {
                return -2;
            }
            segmentationProperty2 = new SegmentationProperty();
        }
        return nativeEnableVirtualBackground(this.mNativeHandle, z10, virtualBackgroundSource.backgroundSourceType, virtualBackgroundSource.color, virtualBackgroundSource.source, virtualBackgroundSource.blurDegree, segmentationProperty2.modelType, segmentationProperty2.greenCapacity, segmentationProperty2.screenColorType, Constants.MediaSourceType.getValue(mediaSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getExtensionProperty(String str, String str2, String str3) {
        return getExtensionProperty(str, str2, str3, Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeAreaOptions getFaceShapeAreaOptions(int i10, Constants.MediaSourceType mediaSourceType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetFaceShapeAreaOptions(j10, i10, Constants.MediaSourceType.getValue(mediaSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized FaceShapeBeautyOptions getFaceShapeBeautyOptions(Constants.MediaSourceType mediaSourceType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return null;
        }
        return nativeGetFaceShapeBeautyOptions(j10, Constants.MediaSourceType.getValue(mediaSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannel(String str, String str2, String str3, int i10) {
        try {
            try {
                Context context = this.mContext.get();
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (context == null) {
                    return -7;
                }
                doMonitorSystemEvent(context);
                return nativeJoinChannel(this.mNativeHandle, str, str2, str3, i10);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int joinChannelWithUserAccount(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeJoinChannelWithUserAccount(j10, str, str2, str3, channelMediaOptions);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int leaveChannel(LeaveChannelOptions leaveChannelOptions) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        doStopMonitorSystemEvent();
        return nativeLeaveChannel(this.mNativeHandle, leaveChannelOptions);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int leaveChannelEx(RtcConnection rtcConnection, LeaveChannelOptions leaveChannelOptions) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeLeaveChannelEx(j10, getChannelId(rtcConnection), getUserId(rtcConnection), leaveChannelOptions);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public int leaveChannelWithUserAccountEx(String str, String str2, LeaveChannelOptions leaveChannelOptions) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeLeaveChannelWithUserAccountEx(j10, str, str2, leaveChannelOptions);
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int playEffect(int i10, String str, int i11, double d10, double d11, double d12, boolean z10) {
        return playEffect(i10, str, i11, d10, d11, d12, z10, 0);
    }

    @Override // io.agora.rtc2.RtcEngineEx, io.agora.rtc2.IAudioEffectManager
    public int playEffectEx(RtcConnection rtcConnection, int i10, String str, int i11, double d10, double d11, double d12, boolean z10, int i12) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativePlayEffectWithFilePath(j10, i10, str, i11, d10, d11, d12, z10, i12, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public int preloadEffect(int i10, String str, int i11) {
        return preloadEffectEx(null, i10, str, i11);
    }

    @Override // io.agora.rtc2.RtcEngineEx, io.agora.rtc2.IAudioEffectManager
    public synchronized int preloadEffectEx(RtcConnection rtcConnection, int i10, String str, int i11) {
        try {
            try {
                if (this.mNativeHandle == 0) {
                    return -7;
                }
                if (TextUtils.isEmpty(str)) {
                    return -2;
                }
                return nativePreloadEffect(this.mNativeHandle, i10, str, i11, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pullPlaybackAudioFrame(byte[] bArr, int i10) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (bArr != null && bArr.length == i10) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i10);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            int pullPlaybackAudioFrame = pullPlaybackAudioFrame(allocateDirect, i10);
            if (pullPlaybackAudioFrame == 0) {
                allocateDirect.get(bArr, 0, i10);
            }
            return pullPlaybackAudioFrame;
        }
        return -2;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(ByteBuffer byteBuffer, long j10, int i10, int i11, Constants.BytesPerSample bytesPerSample, int i12) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("data must be direct buffer!");
        }
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, byteBuffer, j10, i10, Constants.BytesPerSample.getValue(bytesPerSample), i11, i12);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame) {
        return pushExternalVideoFrameById(agoraVideoFrame, 0) == 0;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalVideoFrameById(AgoraVideoFrame agoraVideoFrame, int i10) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        int validatePushExternalVideoFrame = validatePushExternalVideoFrame(agoraVideoFrame);
        if (validatePushExternalVideoFrame == 0) {
            return nativePushExternalAgoraVideoFrame(this.mNativeHandle, agoraVideoFrame.format, agoraVideoFrame.buf, agoraVideoFrame.stride, agoraVideoFrame.height, agoraVideoFrame.cropLeft, agoraVideoFrame.cropTop, agoraVideoFrame.cropRight, agoraVideoFrame.cropBottom, agoraVideoFrame.rotation, agoraVideoFrame.timeStamp, agoraVideoFrame.eglContext10, agoraVideoFrame.eglContext14, agoraVideoFrame.textureID, agoraVideoFrame.transform, agoraVideoFrame.alphaStitchMode.value(), i10);
        }
        int i11 = this.mPushVideoFrameInvalidCnt + 1;
        this.mPushVideoFrameInvalidCnt = i11;
        if (i11 % EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE == 1) {
            Logging.e(TAG, "failed to push video frame: " + agoraVideoFrame);
        }
        return validatePushExternalVideoFrame;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setAudioProfile(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetAudioProfileScenario(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setBeautyEffectOptions(boolean z10, BeautyOptions beautyOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetBeautyEffectOptions(j10, z10, beautyOptions.lighteningContrastLevel, beautyOptions.lighteningLevel, beautyOptions.smoothnessLevel, beautyOptions.rednessLevel, beautyOptions.sharpnessLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setClientRole(int i10, ClientRoleOptions clientRoleOptions) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetClientRole(j10, i10, clientRoleOptions);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setColorEnhanceOptions(boolean z10, ColorEnhanceOptions colorEnhanceOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetColorEnhanceOptions(j10, z10, colorEnhanceOptions.strengthLevel, colorEnhanceOptions.skinProtectLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode, SimulcastStreamConfig simulcastStreamConfig) {
        return setDualStreamModeEx(simulcastStreamMode, simulcastStreamConfig, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProperty(String str, String str2, String str3, String str4) {
        try {
            try {
                return setExtensionProperty(str, str2, str3, str4, Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalAudioSource(boolean z10, int i10, int i11, boolean z11, boolean z12) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                this.mExSourceAudioSampleRate = i10;
                this.mExSourceAudioChannels = i11;
                return nativeSetExternalAudioSource(j10, z10, i10, i11, z11, z12);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExternalVideoSource(boolean z10, boolean z11, Constants.ExternalVideoSourceType externalVideoSourceType, EncodedVideoTrackOptions encodedVideoTrackOptions) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetExternalVideoSource(j10, z10, z11, Constants.ExternalVideoSourceType.getValue(externalVideoSourceType), encodedVideoTrackOptions);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetFaceShapeAreaOptions(j10, faceShapeAreaOptions.shapeArea, faceShapeAreaOptions.shapeIntensity, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFaceShapeBeautyOptions(boolean z10, FaceShapeBeautyOptions faceShapeBeautyOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetFaceShapeBeautyOptions(j10, z10, faceShapeBeautyOptions.shapeStyle, faceShapeBeautyOptions.styleIntensity, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setFilterEffectOptions(boolean z10, FilterEffectOptions filterEffectOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetFilterEffectOptions(j10, z10, filterEffectOptions.path, filterEffectOptions.strength, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLocalRenderMode(int i10, int i11) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSetLocalRenderMode(j10, i10, i11);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setLowlightEnhanceOptions(boolean z10, LowLightEnhanceOptions lowLightEnhanceOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetLowlightEnhanceOptions(j10, z10, lowLightEnhanceOptions.lowlightEnhanceMode, lowLightEnhanceOptions.lowlightEnhanceLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setPlaybackAudioFrameBeforeMixingParameters(int i10, int i11, int i12) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetPlaybackAudioFrameBeforeMixingParameters(j10, i10, i11, i12);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteDefaultVideoStreamType(Constants.VideoStreamType videoStreamType) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        setParameter("rtc.video.set_remote_default_video_stream_type", videoStreamType.getValue());
        return nativeSetRemoteDefaultVideoStreamType(this.mNativeHandle, videoStreamType.getValue());
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteRenderMode(int i10, int i11, int i12) {
        return setRemoteRenderModeEx(i10, i11, i12, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteSubscribeFallbackOption(Constants.StreamFallbackOptions streamFallbackOptions) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (streamFallbackOptions.getValue() >= Constants.StreamFallbackOptions.STREAM_FALLBACK_OPTION_DISABLED.getValue() && streamFallbackOptions.getValue() <= Constants.StreamFallbackOptions.STREAM_FALLBACK_OPTION_VIDEO_STREAM_LAYER_6.getValue()) {
            setParameter("rtc.remote_subscribe_fallback_option", streamFallbackOptions.getValue());
            return nativeSetRemoteSubscribeFallbackOption(this.mNativeHandle, streamFallbackOptions.getValue());
        }
        return -2;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setRemoteVideoStreamType(int i10, Constants.VideoStreamType videoStreamType) {
        return setRemoteVideoStreamTypeEx(i10, videoStreamType, (RtcConnection) null);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int setRemoteVideoStreamTypeEx(int i10, Constants.VideoStreamType videoStreamType, RtcConnection rtcConnection) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetRemoteVideoStreamType(j10, i10, videoStreamType.getValue(), getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int setTextureId(int i10, EGLContext eGLContext, int i11, int i12, long j10) {
        return -4;
    }

    public synchronized int setTextureIdWithMatrix(int i10, EGLContext eGLContext, int i11, int i12, int i13, long j10, float[] fArr) {
        return -4;
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setVideoDenoiserOptions(boolean z10, VideoDenoiserOptions videoDenoiserOptions, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetVideoDenoiserOptions(j10, z10, videoDenoiserOptions.denoiserMode, videoDenoiserOptions.denoiserLevel, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioMixing(String str, boolean z10, int i10, int i11) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeStartAudioMixing(j10, str, z10, i10, i11);
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startAudioRecording(String str, int i10) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (TextUtils.isEmpty(str)) {
            return -2;
        }
        return nativeStartAudioRecording(this.mNativeHandle, str, i10);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int startPreview(Constants.VideoSourceType videoSourceType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStartPreviewForSourceType(j10, Constants.VideoSourceType.getValue(videoSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int stopPreview(Constants.VideoSourceType videoSourceType) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeStopPreviewForSourceType(j10, Constants.VideoSourceType.getValue(videoSourceType));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int switchCamera(String str) {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return -7;
        }
        return nativeSwitchCameraId(j10, str);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int takeSnapshot(int i10, String str) {
        return takeSnapshotEx((RtcConnection) null, i10, str);
    }

    @Override // io.agora.rtc2.RtcEngineEx
    public synchronized int takeSnapshotEx(RtcConnection rtcConnection, int i10, String str) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeTakeSnapshot(j10, i10, str, getChannelId(rtcConnection), getUserId(rtcConnection));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // io.agora.rtc2.RtcEngineInternal
    public synchronized int updateSharedContext(EGLContext eGLContext) {
        return -4;
    }

    private int setParameter(String str, boolean z10) {
        return setParameters(formatString("{\"%s\":%b}", str, Boolean.valueOf(z10)));
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int addVideoWatermark(String str, WatermarkOptions watermarkOptions) {
        return addVideoWatermarkEx(str, watermarkOptions, null);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int enableExtension(String str, String str2, boolean z10, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeEnableExtension(j10, str, str2, z10, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized String getExtensionProperty(String str, String str2, String str3, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return null;
                }
                return nativeGetExtensionProperty(j10, str, str2, str3, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine, io.agora.rtc2.IAudioEffectManager
    public synchronized int playEffect(int i10, String str, int i11, double d10, double d11, double d12, boolean z10, int i12) {
        return playEffectEx(null, i10, str, i11, d10, d11, d12, z10, i12);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(byte[] bArr, long j10) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (bArr == null) {
            return -2;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.put(bArr, 0, bArr.length);
        allocateDirect.flip();
        return pushExternalAudioFrame(allocateDirect, j10, 0);
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int setExtensionProperty(String str, String str2, String str3, String str4, Constants.MediaSourceType mediaSourceType) {
        try {
            try {
                long j10 = this.mNativeHandle;
                if (j10 == 0) {
                    return -7;
                }
                return nativeSetExtensionProperty(j10, str, str2, str3, str4, Constants.MediaSourceType.getValue(mediaSourceType));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    @Override // io.agora.rtc2.RtcEngine
    public synchronized int pushExternalAudioFrame(byte[] bArr, long j10, int i10, int i11, Constants.BytesPerSample bytesPerSample, int i12) {
        if (this.mNativeHandle == 0) {
            return -7;
        }
        if (bArr == null) {
            return -2;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.put(bArr, 0, bArr.length);
        allocateDirect.flip();
        return nativePushExternalAudioFrameRawData(this.mNativeHandle, allocateDirect, j10, i10, Constants.BytesPerSample.getValue(bytesPerSample), i11, i12);
    }
}
