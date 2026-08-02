package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;

/* loaded from: classes2.dex */
public final class Q extends AbstractC3127e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X f32387b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zak f32388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s10, InterfaceC3125d0 interfaceC3125d0, X x10, zak zakVar) {
        super(interfaceC3125d0);
        this.f32387b = x10;
        this.f32388c = zakVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3127e0
    public final void a() {
        X.B(this.f32387b, this.f32388c);
    }
}
