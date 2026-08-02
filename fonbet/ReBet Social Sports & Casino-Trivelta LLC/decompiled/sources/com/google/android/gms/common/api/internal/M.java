package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class M extends AbstractC3127e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f32369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f32370c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o10, InterfaceC3125d0 interfaceC3125d0, ConnectionResult connectionResult) {
        super(interfaceC3125d0);
        this.f32370c = o10;
        this.f32369b = connectionResult;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3127e0
    public final void a() {
        this.f32370c.f32375c.l(this.f32369b);
    }
}
