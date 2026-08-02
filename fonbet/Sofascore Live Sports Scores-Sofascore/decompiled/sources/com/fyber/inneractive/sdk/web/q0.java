package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;
import defpackage.kql;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q0 implements kql {
    public final /* synthetic */ v0 a;

    public q0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // defpackage.kql
    public final void a() {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectSuccess", new Object[0]);
        v0 v0Var = this.a;
        v0Var.b.a(v0Var.c, new com.fyber.inneractive.sdk.ignite.g(v0Var.f, v0Var.d, v0Var.h.a));
        this.a.d("onShowInstallStarted();");
    }

    @Override // defpackage.kql
    public final void a(String str) {
        IAlog.a("InternalStoreWebpageController: onCancelError: onReconnectFailed: error: %s", str);
    }
}
