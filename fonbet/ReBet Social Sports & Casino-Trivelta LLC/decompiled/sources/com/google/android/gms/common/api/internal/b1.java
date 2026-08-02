package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.f;

/* loaded from: classes2.dex */
public final class b1 implements f.c {

    /* renamed from: a, reason: collision with root package name */
    public final int f32441a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.api.f f32442b;

    /* renamed from: c, reason: collision with root package name */
    public final f.c f32443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1 f32444d;

    public b1(c1 c1Var, int i10, com.google.android.gms.common.api.f fVar, f.c cVar) {
        this.f32444d = c1Var;
        this.f32441a = i10;
        this.f32442b = fVar;
        this.f32443c = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3146o
    public final void c(ConnectionResult connectionResult) {
        "beginFailureResolution for ".concat(String.valueOf(connectionResult));
        this.f32444d.h(connectionResult, this.f32441a);
    }
}
