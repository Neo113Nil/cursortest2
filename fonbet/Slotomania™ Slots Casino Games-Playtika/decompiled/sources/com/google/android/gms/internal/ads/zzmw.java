package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public interface zzmw {
    static boolean zzac(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String zzU();

    int zza();

    int zzad(zzv zzvVar) throws zzje;

    int zzu() throws zzje;

    default void zzv(zzmv zzmvVar) {
    }

    default void zzw() {
    }
}
