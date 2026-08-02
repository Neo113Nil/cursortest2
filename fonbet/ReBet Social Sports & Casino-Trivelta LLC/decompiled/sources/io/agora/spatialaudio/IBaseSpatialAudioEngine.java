package io.agora.spatialaudio;

import io.agora.rtc2.RtcConnection;

/* loaded from: classes3.dex */
public abstract class IBaseSpatialAudioEngine {
    public abstract int clearRemotePositions();

    public abstract int muteAllRemoteAudioStreams(boolean z10);

    public abstract int muteLocalAudioStream(boolean z10);

    public abstract int muteRemoteAudioStream(int i10, boolean z10);

    public abstract int release();

    public abstract int setAudioRecvRange(float f10);

    public abstract int setDistanceUnit(float f10);

    public abstract int setMaxAudioRecvCount(int i10);

    public abstract int setPlayerAttenuation(int i10, double d10, boolean z10);

    public abstract int setZones(SpatialAudioZone[] spatialAudioZoneArr);

    public abstract int updatePlayerPositionInfo(int i10, RemoteVoicePositionInfo remoteVoicePositionInfo);

    public abstract int updateSelfPosition(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    public abstract int updateSelfPositionEx(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, RtcConnection rtcConnection);
}
