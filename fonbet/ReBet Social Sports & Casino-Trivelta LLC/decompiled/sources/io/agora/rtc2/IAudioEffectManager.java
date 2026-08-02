package io.agora.rtc2;

/* loaded from: classes3.dex */
public interface IAudioEffectManager {
    double getEffectsVolume();

    int pauseAllEffects();

    int pauseEffect(int i10);

    int playEffect(int i10, String str, int i11, double d10, double d11, double d12);

    int playEffect(int i10, String str, int i11, double d10, double d11, double d12, boolean z10);

    int playEffect(int i10, String str, int i11, double d10, double d11, double d12, boolean z10, int i12);

    int playEffectEx(RtcConnection rtcConnection, int i10, String str, int i11, double d10, double d11, double d12, boolean z10);

    int playEffectEx(RtcConnection rtcConnection, int i10, String str, int i11, double d10, double d11, double d12, boolean z10, int i12);

    int preloadEffect(int i10, String str);

    int preloadEffect(int i10, String str, int i11);

    int preloadEffectEx(RtcConnection rtcConnection, int i10, String str);

    int preloadEffectEx(RtcConnection rtcConnection, int i10, String str, int i11);

    int resumeAllEffects();

    int resumeEffect(int i10);

    int setEffectsVolume(double d10);

    int setVolumeOfEffect(int i10, double d10);

    int stopAllEffects();

    int stopEffect(int i10);

    int unloadEffect(int i10);
}
