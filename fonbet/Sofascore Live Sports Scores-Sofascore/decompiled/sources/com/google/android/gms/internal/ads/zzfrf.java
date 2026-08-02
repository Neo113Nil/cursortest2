package com.google.android.gms.internal.ads;

import defpackage.b1l;
import defpackage.ddb;
import defpackage.vlo;
import defpackage.yih;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfrf {
    public static void a(ddb ddbVar, zzfqw zzfqwVar) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            zzhcq r = zzhcq.r(ddbVar);
            b1l b1lVar = new b1l(zzfqwVar, 22);
            r.addListener(new vlo(0, r, b1lVar), zzcgj.h);
        }
    }

    public static int b(zzflw zzflwVar) {
        int zzg = com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzg(zzflwVar) - 1;
        return (zzg == 0 || zzg == 1) ? 7 : 23;
    }

    public static void c(ddb ddbVar, zzfrg zzfrgVar, zzfqw zzfqwVar, boolean z) {
        if (((Boolean) zzbla.c.c()).booleanValue()) {
            zzhcq r = zzhcq.r(ddbVar);
            yih yihVar = new yih(zzfrgVar, zzfqwVar, z, 16);
            r.addListener(new vlo(0, r, yihVar), zzcgj.h);
        }
    }
}
