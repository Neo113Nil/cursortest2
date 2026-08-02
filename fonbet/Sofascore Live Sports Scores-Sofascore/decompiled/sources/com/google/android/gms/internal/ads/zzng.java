package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public interface zzng {
    static boolean d(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String a();

    int c(zzv zzvVar);

    int zza();

    int zzu();

    default void zzw() {
    }

    default void b(zznf zznfVar) {
    }
}
