package com.plaid.internal;

import com.plaid.internal.A7;

/* renamed from: com.plaid.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3658j implements B1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3703o f40686a;

    public C3658j(C3703o c3703o) {
        this.f40686a = c3703o;
    }

    @Override // com.plaid.internal.B1
    public final InterfaceC3731r1 a() {
        A7 a72 = this.f40686a.f40879f;
        A7.a aVar = a72.f39156a;
        if (aVar == null) {
            A7.f39155d.a(W3.DEBUG, "no cached http client available", new Object[0]);
            return null;
        }
        if (aVar.f39159a.isConnected() == EnumC3801z.YES) {
            A7.f39155d.a(W3.DEBUG, "use cached http client (still connected)", new Object[0]);
            return a72.f39156a.f39159a;
        }
        A7.f39155d.a(W3.DEBUG, "discard cached http client (disconnected)", new Object[0]);
        return null;
    }
}
