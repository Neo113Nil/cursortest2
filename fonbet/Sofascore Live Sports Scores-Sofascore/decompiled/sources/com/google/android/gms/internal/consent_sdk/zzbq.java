package com.google.android.gms.internal.consent_sdk;

import defpackage.b1l;
import defpackage.nfk;
import defpackage.ofk;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbq {
    public final b1l a;
    public final Executor b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicReference d = new AtomicReference();

    public zzbq(b1l b1lVar, Executor executor) {
        this.a = b1lVar;
        this.b = executor;
    }

    public final void a(ofk ofkVar, nfk nfkVar, boolean z) {
        zzcz.a();
        zzbs zzbsVar = (zzbs) this.c.get();
        if (zzbsVar == null) {
            nfkVar.f(new zzg(3, "No available form can be built.").d());
            return;
        }
        zzbe e = ((zzay) this.a.zzb()).b(zzbsVar).r().e();
        e.n = z;
        e.b(ofkVar, nfkVar);
    }
}
