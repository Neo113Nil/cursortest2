package com.google.android.gms.internal.ads;

import defpackage.bm2;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzant {
    public static void a(zzanu zzanuVar, bm2 bm2Var) {
        for (int i = 0; i < zzanuVar.zza(); i++) {
            long zzb = zzanuVar.zzb(i);
            ArrayList b = zzanuVar.b(zzb);
            if (!b.isEmpty()) {
                if (i == zzanuVar.zza() - 1) {
                    defpackage.zzl.s();
                    return;
                } else {
                    long zzb2 = zzanuVar.zzb(i + 1) - zzanuVar.zzb(i);
                    if (zzb2 > 0) {
                        bm2Var.mo13zza(new zzanr(b, zzb, zzb2));
                    }
                }
            }
        }
    }
}
