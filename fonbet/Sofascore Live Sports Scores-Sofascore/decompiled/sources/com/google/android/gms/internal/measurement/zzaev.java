package com.google.android.gms.internal.measurement;

import defpackage.gan;
import defpackage.l2a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzaev {
    public final l2a a;

    public zzaev(zzagm zzagmVar, zzagm zzagmVar2, Object obj) {
        this.a = new l2a(24, zzagmVar, zzagmVar2, obj);
    }

    public static void a(zzada zzadaVar, l2a l2aVar, Object obj, Object obj2) {
        gan.e(zzadaVar, (zzagm) l2aVar.b, 1, obj);
        gan.e(zzadaVar, (zzagm) l2aVar.c, 2, obj2);
    }

    public static int b(l2a l2aVar, Object obj, Object obj2) {
        zzagm zzagmVar = (zzagm) l2aVar.b;
        zzagm zzagmVar2 = (zzagm) l2aVar.c;
        return gan.f(zzagmVar2, 2, obj2) + gan.f(zzagmVar, 1, obj);
    }
}
