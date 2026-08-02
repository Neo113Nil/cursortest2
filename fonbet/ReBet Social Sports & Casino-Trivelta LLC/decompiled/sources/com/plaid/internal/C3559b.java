package com.plaid.internal;

import com.plaid.internal.InterfaceC3731r1;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.plaid.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3559b implements InterfaceC3731r1 {

    /* renamed from: a, reason: collision with root package name */
    public final C3604d f39825a;

    /* renamed from: b, reason: collision with root package name */
    public final C3657i7 f39826b;

    public C3559b(C3636g4 c3636g4) {
        this.f39825a = new C3604d(c3636g4);
        this.f39826b = new C3657i7(c3636g4);
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final void a() {
        this.f39825a.a();
        this.f39826b.a();
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final EnumC3801z isConnected() {
        return this.f39825a.isConnected();
    }

    @Override // com.plaid.internal.InterfaceC3731r1
    public final InterfaceC3731r1.b a(InterfaceC3731r1.a aVar) {
        boolean z10;
        try {
            z10 = new URL(aVar.f41011a).getProtocol().equals("https");
        } catch (MalformedURLException unused) {
            z10 = false;
        }
        if (z10) {
            return this.f39825a.a(aVar);
        }
        return this.f39826b.a(aVar);
    }
}
