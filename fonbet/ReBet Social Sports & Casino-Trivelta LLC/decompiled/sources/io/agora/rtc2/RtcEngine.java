package io.agora.rtc2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.projection.MediaProjection;
import io.agora.base.VideoFrame;
import io.agora.mediaplayer.IMediaPlayer;
import io.agora.mediaplayer.IMediaPlayerCacheManager;
import io.agora.rtc2.Constants;
import io.agora.rtc2.audio.AdvancedAudioOptions;
import io.agora.rtc2.audio.AgoraRhythmPlayerConfig;
import io.agora.rtc2.audio.AudioTrackConfig;
import io.agora.rtc2.audio.IAudioSpectrumObserver;
import io.agora.rtc2.internal.AudioEncodedFrameObserverConfig;
import io.agora.rtc2.internal.AudioRecordingConfiguration;
import io.agora.rtc2.internal.EncryptionConfig;
import io.agora.rtc2.internal.LastmileProbeConfig;
import io.agora.rtc2.internal.RtcEngineImpl;
import io.agora.rtc2.live.LiveTranscoding;
import io.agora.rtc2.proxy.LocalAccessPointConfiguration;
import io.agora.rtc2.video.AgoraFocalLengthInfo;
import io.agora.rtc2.video.AgoraImage;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.rtc2.video.BeautyOptions;
import io.agora.rtc2.video.CameraCapturerConfiguration;
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
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class RtcEngine {
    protected static RtcEngineImpl mInstance;

    public static synchronized RtcEngine create(Context context, String str, IRtcEngineEventHandler iRtcEngineEventHandler) {
        synchronized (RtcEngine.class) {
            try {
                long nanoTime = System.nanoTime();
                if (context != null && RtcEngineImpl.initializeNativeLibs()) {
                    RtcEngineConfig rtcEngineConfig = new RtcEngineConfig();
                    rtcEngineConfig.mContext = context;
                    rtcEngineConfig.mAppId = str;
                    rtcEngineConfig.mEventHandler = iRtcEngineEventHandler;
                    RtcEngineImpl rtcEngineImpl = mInstance;
                    if (rtcEngineImpl == null) {
                        RtcEngineImpl rtcEngineImpl2 = new RtcEngineImpl(rtcEngineConfig);
                        mInstance = rtcEngineImpl2;
                        rtcEngineImpl2.recordCreateEngineTimeStamp(nanoTime, System.nanoTime());
                    } else {
                        rtcEngineImpl.reinitialize(rtcEngineConfig);
                    }
                    return mInstance;
                }
                return null;
            } finally {
            }
        }
    }

    public static synchronized void destroy() {
        synchronized (RtcEngine.class) {
            destroy(null);
        }
    }

    public static String getErrorDescription(int i10) {
        return !RtcEngineImpl.initializeNativeLibs() ? "" : RtcEngineImpl.nativeGetErrorDescription(i10);
    }

    @Deprecated
    public static String getMediaEngineVersion() {
        return !RtcEngineImpl.initializeNativeLibs() ? "" : RtcEngineImpl.nativeGetMediaEngineVersion();
    }

    @Deprecated
    public static int getRecommendedEncoderType() {
        return 0;
    }

    public static String getSdkVersion() {
        return !RtcEngineImpl.initializeNativeLibs() ? "" : RtcEngineImpl.nativeGetSdkVersion();
    }

    public void addHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        mInstance.addHandler(iRtcEngineEventHandler);
    }

    @Deprecated
    public abstract int addVideoWatermark(AgoraImage agoraImage);

    public abstract int addVideoWatermark(WatermarkConfig watermarkConfig);

    @Deprecated
    public abstract int addVideoWatermark(String str, WatermarkOptions watermarkOptions);

    public abstract int adjustAudioMixingPlayoutVolume(int i10);

    public abstract int adjustAudioMixingPublishVolume(int i10);

    public abstract int adjustAudioMixingVolume(int i10);

    public abstract int adjustCustomAudioPlayoutVolume(int i10, int i11);

    public abstract int adjustCustomAudioPublishVolume(int i10, int i11);

    public abstract int adjustPlaybackSignalVolume(int i10);

    public abstract int adjustRecordingSignalVolume(int i10);

    public abstract int adjustUserPlaybackSignalVolume(int i10, int i11);

    public abstract int clearVideoWatermarks();

    public abstract int complain(String str, String str2);

    public abstract int configRhythmPlayer(AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    public abstract int createCustomAudioTrack(Constants.AudioTrackType audioTrackType, AudioTrackConfig audioTrackConfig);

    public abstract int createCustomEncodedVideoTrack(EncodedVideoTrackOptions encodedVideoTrackOptions);

    public abstract int createCustomVideoTrack();

    public abstract int createDataStream(DataStreamConfig dataStreamConfig);

    public abstract int createDataStream(boolean z10, boolean z11);

    public abstract IMediaPlayer createMediaPlayer();

    public abstract AgoraMediaRecorder createMediaRecorder(RecorderStreamInfo recorderStreamInfo);

    public abstract IVideoEffectObject createVideoEffectObject(String str, Constants.MediaSourceType mediaSourceType);

    public abstract int destroyCustomAudioTrack(int i10);

    public abstract int destroyCustomEncodedVideoTrack(int i10);

    public abstract int destroyCustomVideoTrack(int i10);

    public abstract void destroyMediaRecorder(AgoraMediaRecorder agoraMediaRecorder);

    public abstract int destroyVideoEffectObject(IVideoEffectObject iVideoEffectObject);

    public abstract int disableAudio();

    public abstract int disableAudioSpectrumMonitor();

    public abstract int disableVideo();

    public abstract int enableAudio();

    public abstract int enableAudioSpectrumMonitor(int i10);

    public abstract int enableAudioVolumeIndication(int i10, int i11, boolean z10);

    public abstract int enableContentInspect(boolean z10, ContentInspectConfig contentInspectConfig);

    public abstract int enableCustomAudioLocalPlayback(int i10, boolean z10);

    @Deprecated
    public abstract int enableDualStreamMode(boolean z10);

    @Deprecated
    public abstract int enableDualStreamMode(boolean z10, SimulcastStreamConfig simulcastStreamConfig);

    public abstract int enableEncryption(boolean z10, EncryptionConfig encryptionConfig);

    public abstract int enableExtension(String str, String str2, ExtensionInfo extensionInfo, boolean z10);

    public abstract int enableExtension(String str, String str2, boolean z10);

    public abstract int enableExtension(String str, String str2, boolean z10, Constants.MediaSourceType mediaSourceType);

    public abstract int enableExternalAudioSourceLocalPlayback(boolean z10);

    public abstract int enableFaceDetection(boolean z10);

    @Deprecated
    public abstract boolean enableHighPerfWifiMode(boolean z10);

    public abstract int enableInEarMonitoring(boolean z10);

    public abstract int enableInEarMonitoring(boolean z10, int i10);

    public abstract int enableInstantMediaRendering();

    public abstract int enableLocalAudio(boolean z10);

    public abstract int enableLocalVideo(boolean z10);

    public abstract int enableSoundPositionIndication(boolean z10);

    public abstract int enableSpatialAudio(boolean z10);

    public abstract int enableVideo();

    public abstract int enableVideoImageSource(boolean z10, ImageTrackOptions imageTrackOptions);

    public abstract int enableVirtualBackground(boolean z10, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty);

    public abstract int enableVirtualBackground(boolean z10, VirtualBackgroundSource virtualBackgroundSource, SegmentationProperty segmentationProperty, Constants.MediaSourceType mediaSourceType);

    public abstract int enableVoiceAITuner(boolean z10, Constants.VOICE_AI_TUNER_TYPE voice_ai_tuner_type);

    public abstract int enableWebSdkInteroperability(boolean z10);

    public abstract DeviceInfo getAudioDeviceInfo();

    public abstract IAudioEffectManager getAudioEffectManager();

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract int getAudioMixingPlayoutVolume();

    public abstract int getAudioMixingPublishVolume();

    public abstract int getAudioTrackCount();

    public abstract String getCallId();

    public abstract float getCameraMaxZoomFactor();

    public abstract int getConnectionState();

    public abstract long getCurrentMonotonicTimeInMs();

    public abstract int getEffectCurrentPosition(int i10);

    public abstract int getEffectDuration(String str);

    public abstract double getEffectsVolume();

    public abstract String getExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3);

    public abstract String getExtensionProperty(String str, String str2, String str3);

    public abstract String getExtensionProperty(String str, String str2, String str3, Constants.MediaSourceType mediaSourceType);

    public abstract FaceShapeAreaOptions getFaceShapeAreaOptions(int i10);

    public abstract FaceShapeAreaOptions getFaceShapeAreaOptions(int i10, Constants.MediaSourceType mediaSourceType);

    public abstract FaceShapeBeautyOptions getFaceShapeBeautyOptions();

    public abstract FaceShapeBeautyOptions getFaceShapeBeautyOptions(Constants.MediaSourceType mediaSourceType);

    public abstract IH265Transcoder getH265Transcoder();

    public abstract IMediaPlayerCacheManager getMediaPlayerCacheManager();

    public abstract long getNativeHandle();

    public abstract long getNativeMediaPlayer(int i10);

    public abstract int getNetworkType();

    public abstract long getNtpWallTimeInMs();

    public abstract String getParameter(String str, String str2);

    public abstract String getParameters(String str);

    public abstract int getUserInfoByUid(int i10, UserInfo userInfo);

    public abstract int getUserInfoByUserAccount(String str, UserInfo userInfo);

    public abstract int getVolumeOfEffect(int i10);

    public abstract boolean isCameraAutoFocusFaceModeSupported();

    public abstract boolean isCameraExposurePositionSupported();

    public abstract boolean isCameraExposureSupported();

    public abstract boolean isCameraFaceDetectSupported();

    public abstract boolean isCameraFocusSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract boolean isFeatureAvailableOnDevice(int i10);

    public abstract boolean isSpeakerphoneEnabled();

    public abstract boolean isTextureEncodeSupported();

    public abstract int joinChannel(String str, String str2, int i10, ChannelMediaOptions channelMediaOptions);

    public abstract int joinChannel(String str, String str2, String str3, int i10);

    public abstract int joinChannelWithUserAccount(String str, String str2, String str3);

    public abstract int joinChannelWithUserAccount(String str, String str2, String str3, ChannelMediaOptions channelMediaOptions);

    public abstract int leaveChannel();

    public abstract int leaveChannel(LeaveChannelOptions leaveChannelOptions);

    public abstract int loadExtensionProvider(String str);

    @Deprecated
    public abstract void monitorBluetoothHeadsetEvent(boolean z10);

    @Deprecated
    public abstract void monitorHeadsetEvent(boolean z10);

    public abstract int muteAllRemoteAudioStreams(boolean z10);

    public abstract int muteAllRemoteVideoStreams(boolean z10);

    public abstract int muteLocalAudioStream(boolean z10);

    public abstract int muteLocalVideoStream(boolean z10);

    public abstract int muteRecordingSignal(boolean z10);

    public abstract int muteRemoteAudioStream(int i10, boolean z10);

    public abstract int muteRemoteVideoStream(int i10, boolean z10);

    public abstract int pauseAllChannelMediaRelay();

    public abstract int pauseAllEffects();

    public abstract int pauseAudio();

    public abstract int pauseAudioMixing();

    public abstract int pauseEffect(int i10);

    public abstract int playAllEffects(int i10, double d10, double d11, double d12, boolean z10);

    public abstract int playEffect(int i10, String str, int i11, double d10, double d11, double d12, boolean z10);

    public abstract int playEffect(int i10, String str, int i11, double d10, double d11, double d12, boolean z10, int i12);

    public abstract int preloadChannel(String str, String str2, int i10);

    public abstract int preloadChannelWithUserAccount(String str, String str2, String str3);

    public abstract int preloadEffect(int i10, String str);

    public abstract int preloadEffect(int i10, String str, int i11);

    public abstract int pullPlaybackAudioFrame(ByteBuffer byteBuffer, int i10);

    public abstract int pullPlaybackAudioFrame(byte[] bArr, int i10);

    @Deprecated
    public abstract int pushExternalAudioFrame(ByteBuffer byteBuffer, long j10, int i10);

    public abstract int pushExternalAudioFrame(ByteBuffer byteBuffer, long j10, int i10, int i11, Constants.BytesPerSample bytesPerSample, int i12);

    @Deprecated
    public abstract int pushExternalAudioFrame(byte[] bArr, long j10);

    public abstract int pushExternalAudioFrame(byte[] bArr, long j10, int i10, int i11, Constants.BytesPerSample bytesPerSample, int i12);

    @Deprecated
    public abstract int pushExternalEncodedVideoFrame(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo);

    public abstract int pushExternalEncodedVideoFrameById(ByteBuffer byteBuffer, EncodedVideoFrameInfo encodedVideoFrameInfo, int i10);

    @Deprecated
    public abstract boolean pushExternalVideoFrame(VideoFrame videoFrame);

    @Deprecated
    public abstract boolean pushExternalVideoFrame(AgoraVideoFrame agoraVideoFrame);

    public abstract int pushExternalVideoFrameById(VideoFrame videoFrame, int i10);

    public abstract int pushExternalVideoFrameById(AgoraVideoFrame agoraVideoFrame, int i10);

    public abstract AgoraFocalLengthInfo[] queryCameraFocalLengthCapability();

    public abstract CodecCapInfo[] queryCodecCapability();

    public abstract int queryDeviceScore();

    public abstract int queryHDRCapability(Constants.VIDEO_MODULE_TYPE video_module_type);

    public abstract int queryScreenCaptureCapability();

    public abstract int rate(String str, int i10, String str2);

    public abstract int registerAudioEncodedFrameObserver(AudioEncodedFrameObserverConfig audioEncodedFrameObserverConfig, IAudioEncodedFrameObserver iAudioEncodedFrameObserver);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int registerAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver);

    public abstract int registerExtension(String str, String str2, Constants.MediaSourceType mediaSourceType);

    public abstract int registerFaceInfoObserver(IFaceInfoObserver iFaceInfoObserver);

    public abstract int registerLocalUserAccount(String str, String str2);

    public abstract int registerMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i10);

    public abstract int registerVideoEncodedFrameObserver(IVideoEncodedFrameObserver iVideoEncodedFrameObserver);

    public abstract int registerVideoFrameObserver(IVideoFrameObserver iVideoFrameObserver);

    public void removeHandler(IRtcEngineEventHandler iRtcEngineEventHandler) {
        mInstance.removeHandler(iRtcEngineEventHandler);
    }

    public abstract int removeVideoWatermark(String str);

    public abstract int renewToken(String str);

    public abstract int resumeAllChannelMediaRelay();

    public abstract int resumeAllEffects();

    public abstract int resumeAudio();

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i10);

    public abstract int selectAudioTrack(int i10);

    public abstract int sendAudioMetadata(byte[] bArr);

    public abstract int sendCustomReportMessage(String str, String str2, String str3, String str4, int i10);

    public abstract int sendMediaControlMessage(int i10, byte[] bArr);

    public abstract int sendRdtMessage(int i10, int i11, byte[] bArr);

    public abstract int sendStreamMessage(int i10, byte[] bArr);

    public abstract int setAINSMode(boolean z10, int i10);

    public abstract int setAVSyncSource(String str, int i10);

    public abstract int setAdvancedAudioOptions(AdvancedAudioOptions advancedAudioOptions);

    public abstract int setAudioEffectParameters(int i10, int i11, int i12);

    public abstract int setAudioEffectPreset(int i10);

    public abstract int setAudioMixingDualMonoMode(Constants.AudioMixingDualMonoMode audioMixingDualMonoMode);

    public abstract int setAudioMixingPitch(int i10);

    public abstract int setAudioMixingPlaybackSpeed(int i10);

    public abstract int setAudioMixingPosition(int i10);

    public abstract int setAudioProfile(int i10);

    public abstract int setAudioProfile(int i10, int i11);

    public abstract int setAudioScenario(int i10);

    public abstract int setBeautyEffectOptions(boolean z10, BeautyOptions beautyOptions);

    public abstract int setBeautyEffectOptions(boolean z10, BeautyOptions beautyOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setCameraAutoFocusFaceModeEnabled(boolean z10);

    public abstract int setCameraCapturerConfiguration(CameraCapturerConfiguration cameraCapturerConfiguration);

    public abstract int setCameraExposureFactor(int i10);

    public abstract int setCameraExposurePosition(float f10, float f11);

    public abstract int setCameraFocusPositionInPreview(float f10, float f11);

    public abstract int setCameraTorchOn(boolean z10);

    public abstract int setCameraZoomFactor(float f10);

    public abstract int setChannelProfile(int i10);

    public abstract int setClientRole(int i10);

    public abstract int setClientRole(int i10, ClientRoleOptions clientRoleOptions);

    public abstract int setCloudProxy(int i10);

    public abstract int setColorEnhanceOptions(boolean z10, ColorEnhanceOptions colorEnhanceOptions);

    public abstract int setColorEnhanceOptions(boolean z10, ColorEnhanceOptions colorEnhanceOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setDefaultAudioRoutetoSpeakerphone(boolean z10);

    @Deprecated
    public abstract int setDirectCdnStreamingAudioConfiguration(int i10);

    @Deprecated
    public abstract int setDirectCdnStreamingVideoConfiguration(VideoEncoderConfiguration videoEncoderConfiguration);

    public abstract int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode);

    public abstract int setDualStreamMode(Constants.SimulcastStreamMode simulcastStreamMode, SimulcastStreamConfig simulcastStreamConfig);

    public abstract int setEarMonitoringAudioFrameParameters(int i10, int i11, int i12, int i13);

    public abstract int setEffectPosition(int i10, int i11);

    public abstract int setEffectsVolume(double d10);

    public abstract int setEnableSpeakerphone(boolean z10);

    public abstract int setExtensionProperty(String str, String str2, ExtensionInfo extensionInfo, String str3, String str4);

    public abstract int setExtensionProperty(String str, String str2, String str3, String str4);

    public abstract int setExtensionProperty(String str, String str2, String str3, String str4, Constants.MediaSourceType mediaSourceType);

    public abstract int setExtensionProviderProperty(String str, String str2, String str3);

    public abstract int setExternalAudioSink(boolean z10, int i10, int i11);

    @Deprecated
    public abstract int setExternalAudioSource(boolean z10, int i10, int i11);

    @Deprecated
    public abstract int setExternalAudioSource(boolean z10, int i10, int i11, boolean z11, boolean z12);

    public abstract int setExternalMediaProjection(MediaProjection mediaProjection);

    public abstract int setExternalRemoteEglContext(Object obj);

    public abstract int setExternalVideoSource(boolean z10, boolean z11, Constants.ExternalVideoSourceType externalVideoSourceType);

    public abstract int setExternalVideoSource(boolean z10, boolean z11, Constants.ExternalVideoSourceType externalVideoSourceType, EncodedVideoTrackOptions encodedVideoTrackOptions);

    public abstract int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions);

    public abstract int setFaceShapeAreaOptions(FaceShapeAreaOptions faceShapeAreaOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setFaceShapeBeautyOptions(boolean z10, FaceShapeBeautyOptions faceShapeBeautyOptions);

    public abstract int setFaceShapeBeautyOptions(boolean z10, FaceShapeBeautyOptions faceShapeBeautyOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setFilterEffectOptions(boolean z10, FilterEffectOptions filterEffectOptions);

    public abstract int setFilterEffectOptions(boolean z10, FilterEffectOptions filterEffectOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setHeadphoneEQParameters(int i10, int i11);

    public abstract int setHeadphoneEQPreset(int i10);

    public abstract int setHighPriorityUserList(int[] iArr, int i10);

    public abstract int setHighQualityAudioParameters(boolean z10, boolean z11, boolean z12);

    public abstract int setInEarMonitoringVolume(int i10);

    public abstract int setLocalAccessPoint(LocalAccessPointConfiguration localAccessPointConfiguration);

    @Deprecated
    public abstract int setLocalRenderMode(int i10);

    public abstract int setLocalRenderMode(int i10, int i11);

    public abstract int setLocalRenderTargetFps(Constants.VideoSourceType videoSourceType, int i10);

    @Deprecated
    public abstract int setLocalVideoMirrorMode(int i10);

    public abstract int setLocalVoiceEqualization(Constants.AUDIO_EQUALIZATION_BAND_FREQUENCY audio_equalization_band_frequency, int i10);

    public abstract int setLocalVoiceFormant(double d10);

    public abstract int setLocalVoicePitch(double d10);

    public abstract int setLocalVoiceReverb(Constants.AUDIO_REVERB_TYPE audio_reverb_type, int i10);

    public abstract int setLogFile(String str);

    public abstract int setLogFileSize(long j10);

    public abstract int setLogFilter(int i10);

    public abstract int setLogLevel(int i10);

    public abstract int setLowlightEnhanceOptions(boolean z10, LowLightEnhanceOptions lowLightEnhanceOptions);

    public abstract int setLowlightEnhanceOptions(boolean z10, LowLightEnhanceOptions lowLightEnhanceOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setMixedAudioFrameParameters(int i10, int i11, int i12);

    public abstract int setParameters(String str);

    public abstract int setPlaybackAudioFrameBeforeMixingParameters(int i10, int i11);

    public abstract int setPlaybackAudioFrameBeforeMixingParameters(int i10, int i11, int i12);

    public abstract int setPlaybackAudioFrameParameters(int i10, int i11, int i12, int i13);

    @Deprecated
    public abstract void setPreferHeadset(boolean z10);

    public abstract int setRecordingAudioFrameParameters(int i10, int i11, int i12, int i13);

    @Deprecated
    public abstract int setRemoteDefaultVideoStreamType(int i10);

    public abstract int setRemoteDefaultVideoStreamType(Constants.VideoStreamType videoStreamType);

    @Deprecated
    public abstract int setRemoteRenderMode(int i10, int i11);

    public abstract int setRemoteRenderMode(int i10, int i11, int i12);

    public abstract int setRemoteRenderTargetFps(int i10);

    @Deprecated
    public abstract int setRemoteSubscribeFallbackOption(int i10);

    public abstract int setRemoteSubscribeFallbackOption(Constants.StreamFallbackOptions streamFallbackOptions);

    public abstract int setRemoteUserPriority(int i10, int i11);

    public abstract int setRemoteUserSpatialAudioParams(int i10, SpatialAudioParams spatialAudioParams);

    @Deprecated
    public abstract int setRemoteVideoStreamType(int i10, int i11);

    public abstract int setRemoteVideoStreamType(int i10, Constants.VideoStreamType videoStreamType);

    public abstract int setRemoteVideoSubscriptionOptions(int i10, VideoSubscriptionOptions videoSubscriptionOptions);

    public abstract int setRemoteVoicePosition(int i10, double d10, double d11);

    public abstract int setRouteInCommunicationMode(int i10);

    public abstract int setScreenCaptureScenario(Constants.ScreenScenarioType screenScenarioType);

    public abstract int setSimulcastConfig(SimulcastConfig simulcastConfig);

    public abstract int setSubscribeAudioAllowlist(int[] iArr);

    public abstract int setSubscribeAudioBlocklist(int[] iArr);

    public abstract int setSubscribeVideoAllowlist(int[] iArr);

    public abstract int setSubscribeVideoBlocklist(int[] iArr);

    public abstract int setVideoDenoiserOptions(boolean z10, VideoDenoiserOptions videoDenoiserOptions);

    public abstract int setVideoDenoiserOptions(boolean z10, VideoDenoiserOptions videoDenoiserOptions, Constants.MediaSourceType mediaSourceType);

    public abstract int setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration);

    public abstract int setVideoQoEPreference(Constants.QoEPreference qoEPreference);

    public abstract int setVideoQualityParameters(boolean z10);

    public abstract int setVideoScenario(Constants.VideoScenario videoScenario);

    public abstract int setVoiceBeautifierParameters(int i10, int i11, int i12);

    public abstract int setVoiceBeautifierPreset(int i10);

    public abstract int setVoiceConversionParameters(int i10, int i11, int i12);

    public abstract int setVoiceConversionPreset(int i10);

    public abstract int setVolumeOfEffect(int i10, double d10);

    public abstract int setupAudioAttributes(AudioAttributes audioAttributes);

    public abstract int setupLocalVideo(VideoCanvas videoCanvas);

    public abstract int setupRemoteVideo(VideoCanvas videoCanvas);

    public abstract int startAudioMixing(String str, boolean z10, int i10);

    public abstract int startAudioMixing(String str, boolean z10, int i10, int i11);

    public abstract int startAudioRecording(AudioRecordingConfiguration audioRecordingConfiguration);

    public abstract int startAudioRecording(String str, int i10);

    public abstract int startCameraCapture(Constants.VideoSourceType videoSourceType, CameraCapturerConfiguration cameraCapturerConfiguration);

    @Deprecated
    public abstract int startDirectCdnStreaming(IDirectCdnStreamingEventHandler iDirectCdnStreamingEventHandler, String str, DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    public abstract int startEchoTest(EchoTestConfiguration echoTestConfiguration);

    public abstract int startLastmileProbeTest(LastmileProbeConfig lastmileProbeConfig);

    public abstract int startLocalAudioMixer(LocalAudioMixerConfiguration localAudioMixerConfiguration);

    public abstract int startLocalVideoTranscoder(LocalTranscoderConfiguration localTranscoderConfiguration);

    public abstract int startMediaRenderingTracing();

    public abstract int startOrUpdateChannelMediaRelay(ChannelMediaRelayConfiguration channelMediaRelayConfiguration);

    public abstract int startPlaybackDeviceTest(String str);

    public abstract int startPreview();

    public abstract int startPreview(Constants.VideoSourceType videoSourceType);

    public abstract int startRecordingDeviceTest(int i10);

    public abstract int startRhythmPlayer(String str, String str2, AgoraRhythmPlayerConfig agoraRhythmPlayerConfig);

    public abstract int startRtmpStreamWithTranscoding(String str, LiveTranscoding liveTranscoding);

    public abstract int startRtmpStreamWithoutTranscoding(String str);

    public abstract int startScreenCapture(ScreenCaptureParameters screenCaptureParameters);

    public abstract int stopAllEffects();

    public abstract int stopAudioMixing();

    public abstract int stopAudioRecording();

    public abstract int stopCameraCapture(Constants.VideoSourceType videoSourceType);

    public abstract int stopChannelMediaRelay();

    @Deprecated
    public abstract int stopDirectCdnStreaming();

    public abstract int stopEchoTest();

    public abstract int stopEffect(int i10);

    public abstract int stopLastmileProbeTest();

    public abstract int stopLocalAudioMixer();

    public abstract int stopLocalVideoTranscoder();

    public abstract int stopPlaybackDeviceTest();

    public abstract int stopPreview();

    public abstract int stopPreview(Constants.VideoSourceType videoSourceType);

    public abstract int stopRecordingDeviceTest();

    public abstract int stopRhythmPlayer();

    public abstract int stopRtmpStream(String str);

    public abstract int stopScreenCapture();

    public abstract int switchCamera();

    public abstract int switchCamera(String str);

    public abstract int takeSnapshot(int i10, SnapshotConfig snapshotConfig);

    public abstract int takeSnapshot(int i10, String str);

    public abstract int unRegisterAudioSpectrumObserver(IAudioSpectrumObserver iAudioSpectrumObserver);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i10);

    public abstract int unregisterMediaMetadataObserver(IMetadataObserver iMetadataObserver, int i10);

    public abstract int updateChannelMediaOptions(ChannelMediaOptions channelMediaOptions);

    @Deprecated
    public abstract int updateDirectCdnStreamingMediaOptions(DirectCdnStreamingMediaOptions directCdnStreamingMediaOptions);

    public abstract int updateLocalAudioMixerConfiguration(LocalAudioMixerConfiguration localAudioMixerConfiguration);

    public abstract int updateLocalTranscoderConfiguration(LocalTranscoderConfiguration localTranscoderConfiguration);

    public abstract int updatePreloadChannelToken(String str);

    public abstract int updateRtmpTranscoding(LiveTranscoding liveTranscoding);

    public abstract int updateScreenCaptureParameters(ScreenCaptureParameters screenCaptureParameters);

    public abstract String uploadLogFile();

    public abstract int writeLog(int i10, String str, Object... objArr);

    public static synchronized RtcEngine create(RtcEngineConfig rtcEngineConfig) {
        synchronized (RtcEngine.class) {
            try {
                long nanoTime = System.nanoTime();
                if (rtcEngineConfig != null && rtcEngineConfig.mContext != null && RtcEngineImpl.initializeNativeLibs(rtcEngineConfig.mNativeLibPath)) {
                    RtcEngineImpl rtcEngineImpl = mInstance;
                    if (rtcEngineImpl == null) {
                        RtcEngineImpl rtcEngineImpl2 = new RtcEngineImpl(rtcEngineConfig);
                        mInstance = rtcEngineImpl2;
                        rtcEngineImpl2.recordCreateEngineTimeStamp(nanoTime, System.nanoTime());
                    } else {
                        rtcEngineImpl.reinitialize(rtcEngineConfig);
                    }
                    return mInstance;
                }
                return null;
            } finally {
            }
        }
    }

    public static synchronized void destroy(IRtcEngineReleaseCallback iRtcEngineReleaseCallback) {
        synchronized (RtcEngine.class) {
            RtcEngineImpl rtcEngineImpl = mInstance;
            if (rtcEngineImpl == null) {
                return;
            }
            rtcEngineImpl.doDestroy(iRtcEngineReleaseCallback);
            mInstance = null;
            System.gc();
        }
    }
}
