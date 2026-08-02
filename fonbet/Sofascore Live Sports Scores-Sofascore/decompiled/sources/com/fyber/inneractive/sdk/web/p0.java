package com.fyber.inneractive.sdk.web;

import defpackage.kql;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class p0 implements kql {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ v0 c;

    public p0(v0 v0Var, String str, String str2) {
        this.c = v0Var;
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.kql
    public final void a() {
        v0 v0Var = this.c;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.a));
        this.c.d("onShowInstallStarted();");
    }

    @Override // defpackage.kql
    public final void a(String str) {
        v0 v0Var = this.c;
        v0Var.b.m();
        v0Var.d("onInstallationFailed();");
        v0 v0Var2 = this.c;
        v0Var2.h.a(com.fyber.inneractive.sdk.network.t.IGNITE_FLOW_FAILED_TO_INSTALL_APP, this.a, this.b, v0Var2.d);
    }
}
