package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public final class j1 implements f.b, f.c {

    /* renamed from: a, reason: collision with root package name */
    public final C3117a f32525a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32526b;

    /* renamed from: c, reason: collision with root package name */
    public k1 f32527c;

    public j1(C3117a c3117a, boolean z10) {
        this.f32525a = c3117a;
        this.f32526b = z10;
    }

    public final void a(k1 k1Var) {
        this.f32527c = k1Var;
    }

    public final k1 b() {
        AbstractC3191o.n(this.f32527c, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        return this.f32527c;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3146o
    public final void c(ConnectionResult connectionResult) {
        b().i0(connectionResult, this.f32525a, this.f32526b);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void g(Bundle bundle) {
        b().g(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3128f
    public final void i(int i10) {
        b().i(i10);
    }
}
