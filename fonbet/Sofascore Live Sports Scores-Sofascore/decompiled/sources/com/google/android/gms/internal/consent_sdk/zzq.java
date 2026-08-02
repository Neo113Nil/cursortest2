package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import defpackage.gvo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzq implements zzth {
    public final zzti a;
    public final zztg b;

    public zzq(zzti zztiVar, zztg zztgVar) {
        this.a = zztiVar;
        this.b = zztgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zztm, com.google.android.gms.internal.ads.zzdom
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gvo zzb() {
        return new gvo(2, (Application) this.a.a, (zzaq) this.b.zzb());
    }
}
