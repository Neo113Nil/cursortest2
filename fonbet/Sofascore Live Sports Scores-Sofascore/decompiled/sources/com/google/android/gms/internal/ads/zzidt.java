package com.google.android.gms.internal.ads;

import defpackage.dpo;
import defpackage.hbo;
import java.io.FileInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzidt implements zzihe {
    static {
        zziew zziewVar = zziew.b;
        int i = dpo.a;
    }

    @Override // com.google.android.gms.internal.ads.zzihe
    public final zzifm a(FileInputStream fileInputStream, zziew zziewVar) {
        zziem e = zziem.e(fileInputStream);
        zzifm q = zzifm.q(((zzifh) this).a, e, zziewVar);
        e.k(0);
        if (zzifm.A(q, true)) {
            return q;
        }
        hbo.i(new zzihz().getMessage());
        return null;
    }
}
