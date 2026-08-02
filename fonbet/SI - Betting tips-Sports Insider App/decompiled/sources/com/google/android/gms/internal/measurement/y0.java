package com.google.android.gms.internal.measurement;

import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5363e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j1 f5366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5367i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j1 j1Var, zzdf zzdfVar, String str, String str2) {
        super(j1Var, true);
        this.f5367i = zzdfVar;
        this.f5364f = str;
        this.f5365g = str2;
        Objects.requireNonNull(j1Var);
        this.f5366h = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f5363e) {
            case 0:
                l0 l0Var = this.f5366h.f5095e;
                g6.v.h(l0Var);
                l0Var.getConditionalUserProperties(this.f5364f, this.f5365g, (i0) this.f5367i);
                break;
            default:
                l0 l0Var2 = this.f5366h.f5095e;
                g6.v.h(l0Var2);
                l0Var2.setCurrentScreenByScionActivityInfo((zzdf) this.f5367i, this.f5364f, this.f5365g, this.f5052a);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.f5363e) {
            case 0:
                ((i0) this.f5367i).b(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(j1 j1Var, String str, String str2, i0 i0Var) {
        super(j1Var, true);
        this.f5364f = str;
        this.f5365g = str2;
        this.f5367i = i0Var;
        Objects.requireNonNull(j1Var);
        this.f5366h = j1Var;
    }
}
