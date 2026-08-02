package io.agora.spatialaudio;

import io.agora.rtc2.RtcConnection;
import io.agora.spatialaudio.internal.LocalSpatialAudioImpl;

/* loaded from: classes3.dex */
public abstract class ILocalSpatialAudioEngine extends IBaseSpatialAudioEngine {
    private static ILocalSpatialAudioEngine mInstance;

    public static synchronized ILocalSpatialAudioEngine create() {
        ILocalSpatialAudioEngine iLocalSpatialAudioEngine;
        synchronized (ILocalSpatialAudioEngine.class) {
            try {
                if (mInstance == null) {
                    mInstance = new LocalSpatialAudioImpl();
                }
                iLocalSpatialAudioEngine = mInstance;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iLocalSpatialAudioEngine;
    }

    public static synchronized void destroy() {
        synchronized (ILocalSpatialAudioEngine.class) {
            ILocalSpatialAudioEngine iLocalSpatialAudioEngine = mInstance;
            if (iLocalSpatialAudioEngine == null) {
                return;
            }
            iLocalSpatialAudioEngine.release();
            mInstance = null;
        }
    }

    public abstract int clearRemotePositionsEx(RtcConnection rtcConnection);

    public abstract int initialize(LocalSpatialAudioConfig localSpatialAudioConfig);

    public abstract int removeRemotePosition(int i10);

    public abstract int removeRemotePositionEx(int i10, RtcConnection rtcConnection);

    public abstract int setRemoteAudioAttenuation(int i10, double d10, boolean z10);

    public abstract int updateRemotePosition(int i10, RemoteVoicePositionInfo remoteVoicePositionInfo);

    public abstract int updateRemotePositionEx(int i10, RemoteVoicePositionInfo remoteVoicePositionInfo, RtcConnection rtcConnection);
}
