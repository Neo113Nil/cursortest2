package com.google.android.gms.internal.ads;

import defpackage.ddb;
import defpackage.ohn;
import defpackage.v35;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzejx {
    public final zzejt a;
    public final zzhdi b;

    public zzejx(zzejt zzejtVar, zzhdi zzhdiVar) {
        this.a = zzejtVar;
        this.b = zzhdiVar;
    }

    public final void a(zzfpi zzfpiVar) {
        v35 v35Var = new v35(this.a, 12);
        zzhdi zzhdiVar = this.b;
        ddb submit = zzhdiVar.submit(v35Var);
        submit.addListener(new vlo(0, submit, new ohn(14, this, zzfpiVar)), zzhdiVar);
    }
}
