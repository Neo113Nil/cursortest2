package com.google.android.gms.internal.ads;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zzqd extends AudioDeviceCallback {
    final /* synthetic */ zzqh zza;

    /* synthetic */ zzqd(zzqh zzqhVar, byte[] bArr) {
        Objects.requireNonNull(zzqhVar);
        this.zza = zzqhVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.zza.zzi();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        String str = zzfk.zza;
        int length = audioDeviceInfoArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            zzqh zzqhVar = this.zza;
            if (Objects.equals(audioDeviceInfoArr[i], zzqhVar.zzj())) {
                zzqhVar.zzk(null);
                break;
            }
            i++;
        }
        this.zza.zzi();
    }
}
