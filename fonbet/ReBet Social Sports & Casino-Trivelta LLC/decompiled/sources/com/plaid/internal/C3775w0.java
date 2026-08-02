package com.plaid.internal;

/* renamed from: com.plaid.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3775w0 implements InterfaceC3675k7 {

    /* renamed from: a, reason: collision with root package name */
    public final C3766v0 f41157a;

    public C3775w0(C3766v0 c3766v0) {
        this.f41157a = c3766v0;
    }

    @Override // com.plaid.internal.InterfaceC3675k7
    public final C3640h a(Object obj, C3712p c3712p) {
        try {
            InterfaceC3731r1 a10 = ((B1) obj).a();
            return a10 != null ? C3640h.a(a10) : C3640h.a(this.f41157a.a());
        } catch (C3721q e10) {
            return C3640h.a((Exception) e10);
        }
    }
}
