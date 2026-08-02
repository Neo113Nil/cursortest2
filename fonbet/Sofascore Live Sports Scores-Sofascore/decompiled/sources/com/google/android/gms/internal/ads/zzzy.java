package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzzy extends zzaaa {
    public static void a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzgxj zzgxjVar = (zzgxj) arrayList.get(i2);
            if (zzgxjVar != null) {
                zzgxjVar.c(new zzzw(j, jArr[i2]));
            }
        }
    }
}
