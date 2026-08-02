package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import defpackage.v35;
import defpackage.yvn;
import java.util.Collections;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzeft implements zzinw {
    public final zzinv a;
    public final zzinv b;

    public zzeft(zzinv zzinvVar, zzinv zzinvVar2) {
        this.a = zzinvVar;
        this.b = zzinvVar2;
    }

    @Override // com.google.android.gms.internal.ads.zziol
    public final Object zzb() {
        zzfqi zzfqiVar = (zzfqi) this.a.zzb();
        CookieManager zza = com.google.android.gms.ads.internal.zzt.zzf().zza((Context) this.b.zzb());
        Objects.requireNonNull(zzfqiVar);
        v35 v35Var = new v35(zza, 11);
        zzhdi zzhdiVar = zzfqiVar.a;
        zzfpz c = new zzfpz(zzfqiVar, zzfqc.WEBVIEW_COOKIE, null, zzfqa.d, Collections.EMPTY_LIST, zzhdiVar.submit(v35Var)).c(1L);
        yvn yvnVar = new yvn(14);
        zzfqa zzfqaVar = c.f;
        zzhdi zzhdiVar2 = zzfqaVar.a;
        return new zzfpz(zzfqaVar, c.a, c.b, c.c, c.d, zzhcy.f(c.e, Exception.class, yvnVar, zzhdiVar2)).d();
    }
}
