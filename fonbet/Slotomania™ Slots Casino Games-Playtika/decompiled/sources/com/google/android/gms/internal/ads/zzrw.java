package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public interface zzrw {
    void zzA();

    void zzB();

    void zzC();

    default void zzD() {
    }

    void zza(zzrt zzrtVar);

    default void zzb(zzpz zzpzVar) {
    }

    default void zzc(zzdo zzdoVar) {
    }

    boolean zzd(zzv zzvVar);

    int zze(zzv zzvVar);

    default zzqm zzf(zzv zzvVar) {
        throw null;
    }

    long zzg(boolean z);

    void zzh(zzv zzvVar, int i, int[] iArr) throws zzrr;

    void zzi();

    void zzj();

    boolean zzk(ByteBuffer byteBuffer, long j, int i) throws zzrs, zzrv;

    void zzl() throws zzrv;

    boolean zzm();

    boolean zzn();

    void zzo(zzav zzavVar);

    zzav zzp();

    void zzq(boolean z);

    void zzr(zzd zzdVar);

    default zzqb zzs() {
        throw null;
    }

    void zzt(int i);

    void zzu(zze zzeVar);

    default void zzv(AudioDeviceInfo audioDeviceInfo) {
    }

    default void zzw(int i) {
    }

    long zzx();

    default void zzy(int i, int i2) {
    }

    void zzz(float f);
}
