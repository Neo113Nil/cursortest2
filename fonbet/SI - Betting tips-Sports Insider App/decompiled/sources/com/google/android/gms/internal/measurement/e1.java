package com.google.android.gms.internal.measurement;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5024g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0 f5025h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j1 f5026i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j1 j1Var, String str, String str2, boolean z5, i0 i0Var) {
        super(j1Var, true);
        this.f5022e = str;
        this.f5023f = str2;
        this.f5024g = z5;
        this.f5025h = i0Var;
        Objects.requireNonNull(j1Var);
        this.f5026i = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        l0 l0Var = this.f5026i.f5095e;
        g6.v.h(l0Var);
        l0Var.getUserProperties(this.f5022e, this.f5023f, this.f5024g, this.f5025h);
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void b() {
        this.f5025h.b(null);
    }
}
