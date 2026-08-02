package com.google.gson.internal;

import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import m1.InterfaceC8038i;
import ng0.C8593a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements o, InterfaceC8038i, InterfaceC7217w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f59957a;

    public /* synthetic */ d(Object obj) {
        this.f59957a = obj;
    }

    @Override // m1.InterfaceC8038i
    public double c(double d11) {
        return m1.p.n((m1.p) this.f59957a, d11);
    }

    @Override // io.sentry.InterfaceC7217w1
    public void e(U u11) {
        C8593a.c((C8593a) this.f59957a, u11);
    }

    @Override // com.google.gson.internal.o
    public Object f() {
        throw new com.google.gson.j((String) this.f59957a);
    }
}
