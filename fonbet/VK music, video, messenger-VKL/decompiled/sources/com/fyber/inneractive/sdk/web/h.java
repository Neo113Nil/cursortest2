package com.fyber.inneractive.sdk.web;

/* loaded from: classes12.dex */
public final class h implements f {
    public final String a;
    public final com.fyber.inneractive.sdk.util.g1 b;
    public final /* synthetic */ i c;

    public h(i iVar, String str, com.fyber.inneractive.sdk.util.g1 g1Var) {
        this.c = iVar;
        this.b = g1Var;
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String a() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final String c() {
        return "open";
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void d() {
        i iVar = this.c;
        String str = this.a;
        com.fyber.inneractive.sdk.util.g1 g1Var = this.b;
        j1 j1Var = iVar.g;
        if (j1Var != null) {
            com.fyber.inneractive.sdk.util.g0 g0Var = j1Var.a(str, g1Var).a;
        }
    }

    public final String toString() {
        return "action: open url: " + this.a;
    }

    @Override // com.fyber.inneractive.sdk.web.f
    public final void b() {
    }
}
