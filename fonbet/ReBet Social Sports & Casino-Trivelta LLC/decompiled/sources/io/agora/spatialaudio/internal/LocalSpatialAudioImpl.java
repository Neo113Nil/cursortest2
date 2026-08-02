package io.agora.spatialaudio.internal;

import com.facebook.hermes.intl.Constants;
import io.agora.rtc2.RtcConnection;
import io.agora.rtc2.RtcEngine;
import io.agora.spatialaudio.ILocalSpatialAudioEngine;
import io.agora.spatialaudio.LocalSpatialAudioConfig;
import io.agora.spatialaudio.RemoteVoicePositionInfo;
import io.agora.spatialaudio.SpatialAudioZone;
import java.util.Locale;

/* loaded from: classes3.dex */
public class LocalSpatialAudioImpl extends ILocalSpatialAudioEngine {
    private long mNativeHandle = 0;

    private boolean CheckRemoteVoicePositionInfo(RemoteVoicePositionInfo remoteVoicePositionInfo) {
        float[] fArr;
        if (remoteVoicePositionInfo == null || (fArr = remoteVoicePositionInfo.position) == null || fArr.length != 3) {
            return false;
        }
        if (remoteVoicePositionInfo.forward != null) {
            return true;
        }
        remoteVoicePositionInfo.forward = new float[]{0.0f, 0.0f, 0.0f};
        return true;
    }

    public static String getChannelId(RtcConnection rtcConnection) {
        if (rtcConnection != null) {
            return rtcConnection.channelId;
        }
        return null;
    }

    public static int getUserId(RtcConnection rtcConnection) {
        if (rtcConnection != null) {
            return rtcConnection.localUid;
        }
        return 0;
    }

    private native int nativeClearRemotePositions(long j10);

    private native int nativeClearRemotePositionsEx(long j10, String str, int i10);

    private static native int nativeDestroy(long j10);

    private native int nativeMuteRemoteAudioStream(long j10, int i10, boolean z10);

    private native long nativeObjectInit(LocalSpatialAudioConfig localSpatialAudioConfig, long j10);

    private native int nativeRemoveRemotePosition(long j10, int i10);

    private native int nativeRemoveRemotePositionEx(long j10, int i10, String str, int i11);

    private native int nativeSetParameters(long j10, String str);

    private native int nativeSetPlayerAttenuation(long j10, int i10, double d10, boolean z10);

    private native int nativeSetRemoteAudioAttenuation(long j10, int i10, double d10, boolean z10);

    private native int nativeSetZones(long j10, SpatialAudioZone[] spatialAudioZoneArr);

    private native int nativeUpdatePlayerPositionInfo(long j10, int i10, RemoteVoicePositionInfo remoteVoicePositionInfo);

    private native int nativeUpdateRemotePosition(long j10, int i10, float[] fArr, float[] fArr2);

    private native int nativeUpdateRemotePositionEx(long j10, int i10, float[] fArr, float[] fArr2, String str, int i11);

    private native int nativeUpdateSelfPosition(long j10, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    private native int nativeUpdateSelfPositionEx(long j10, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, String str, int i10);

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int clearRemotePositions() {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeClearRemotePositions(j10);
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int clearRemotePositionsEx(RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeClearRemotePositionsEx(j10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int initialize(LocalSpatialAudioConfig localSpatialAudioConfig) {
        RtcEngine rtcEngine = localSpatialAudioConfig.mRtcEngine;
        if (rtcEngine == null) {
            return -2;
        }
        long nativeObjectInit = nativeObjectInit(localSpatialAudioConfig, rtcEngine.getNativeHandle());
        this.mNativeHandle = nativeObjectInit;
        return nativeObjectInit == 0 ? -7 : 0;
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int muteAllRemoteAudioStreams(boolean z10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetParameters(j10, String.format(Locale.US, "{\"rtc.local_spatial_audio.mute_all_remote_audio_streams\":%s}", z10 ? "true" : Constants.CASEFIRST_FALSE));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int muteLocalAudioStream(boolean z10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetParameters(j10, String.format(Locale.US, "{\"rtc.local_spatial_audio.mute_local_stream\":%s}", z10 ? "true" : Constants.CASEFIRST_FALSE));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int muteRemoteAudioStream(int i10, boolean z10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeMuteRemoteAudioStream(j10, i10, z10);
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int release() {
        long j10 = this.mNativeHandle;
        if (j10 == 0) {
            return 0;
        }
        nativeDestroy(j10);
        this.mNativeHandle = 0L;
        return 0;
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int removeRemotePosition(int i10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeRemoveRemotePosition(j10, i10);
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int removeRemotePositionEx(int i10, RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeRemoveRemotePositionEx(j10, i10, getChannelId(rtcConnection), getUserId(rtcConnection));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setAudioRecvRange(float f10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetParameters(j10, String.format(Locale.US, "{\"rtc.local_spatial_audio.hear_range\":%f}", Float.valueOf(f10)));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setDistanceUnit(float f10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetParameters(j10, String.format(Locale.US, "{\"rtc.local_spatial_audio.distance_unit\":%f}", Float.valueOf(f10)));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setMaxAudioRecvCount(int i10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetParameters(j10, String.format(Locale.US, "{\"rtc.local_spatial_audio.max_hear_count\":%d}", Integer.valueOf(i10)));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setPlayerAttenuation(int i10, double d10, boolean z10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetPlayerAttenuation(j10, i10, d10, z10);
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int setRemoteAudioAttenuation(int i10, double d10, boolean z10) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        return nativeSetRemoteAudioAttenuation(j10, i10, d10, z10);
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setZones(SpatialAudioZone[] spatialAudioZoneArr) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        float[] fArr4;
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        if (spatialAudioZoneArr == null || spatialAudioZoneArr.length <= 0) {
            return nativeSetZones(j10, null);
        }
        for (SpatialAudioZone spatialAudioZone : spatialAudioZoneArr) {
            if (spatialAudioZone == null || (fArr = spatialAudioZone.position) == null || fArr.length != 3 || (fArr2 = spatialAudioZone.forward) == null || fArr2.length != 3 || (fArr3 = spatialAudioZone.right) == null || fArr3.length != 3 || (fArr4 = spatialAudioZone.up) == null || fArr4.length != 3) {
                return -2;
            }
        }
        return nativeSetZones(this.mNativeHandle, spatialAudioZoneArr);
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int updatePlayerPositionInfo(int i10, RemoteVoicePositionInfo remoteVoicePositionInfo) {
        float[] fArr;
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        if (remoteVoicePositionInfo == null || (fArr = remoteVoicePositionInfo.position) == null || fArr.length != 3) {
            return -2;
        }
        float[] fArr2 = remoteVoicePositionInfo.forward;
        if (fArr2 == null || fArr2.length == 3) {
            return nativeUpdatePlayerPositionInfo(j10, i10, remoteVoicePositionInfo);
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int updateRemotePosition(int i10, RemoteVoicePositionInfo remoteVoicePositionInfo) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        if (CheckRemoteVoicePositionInfo(remoteVoicePositionInfo)) {
            return nativeUpdateRemotePosition(this.mNativeHandle, i10, remoteVoicePositionInfo.position, remoteVoicePositionInfo.forward);
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int updateRemotePositionEx(int i10, RemoteVoicePositionInfo remoteVoicePositionInfo, RtcConnection rtcConnection) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        if (CheckRemoteVoicePositionInfo(remoteVoicePositionInfo)) {
            return nativeUpdateRemotePositionEx(this.mNativeHandle, i10, remoteVoicePositionInfo.position, remoteVoicePositionInfo.forward, getChannelId(rtcConnection), getUserId(rtcConnection));
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int updateSelfPosition(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        if (fArr.length == 3 && fArr2.length == 3 && fArr3.length == 3 && fArr4.length == 3) {
            return nativeUpdateSelfPosition(j10, fArr, fArr2, fArr3, fArr4);
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int updateSelfPositionEx(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, RtcConnection rtcConnection) {
        long j10 = this.mNativeHandle;
        if (0 == j10) {
            return -7;
        }
        if (fArr.length == 3 && fArr2.length == 3 && fArr3.length == 3 && fArr4.length == 3) {
            return nativeUpdateSelfPositionEx(j10, fArr, fArr2, fArr3, fArr4, getChannelId(rtcConnection), getUserId(rtcConnection));
        }
        return -2;
    }
}
