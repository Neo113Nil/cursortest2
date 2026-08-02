package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC3179c;

/* loaded from: classes2.dex */
public final class N extends AbstractC3127e0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c.InterfaceC0491c f32373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10, InterfaceC3125d0 interfaceC3125d0, AbstractC3179c.InterfaceC0491c interfaceC0491c) {
        super(interfaceC3125d0);
        this.f32373b = interfaceC0491c;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3127e0
    public final void a() {
        this.f32373b.a(new ConnectionResult(16, null));
    }
}
