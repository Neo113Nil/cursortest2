package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f4906f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j1 f4907g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(j1 j1Var, String str, int i5) {
        super(j1Var, true);
        this.f4905e = i5;
        this.f4906f = str;
        this.f4907g = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f4905e) {
            case 0:
                l0 l0Var = this.f4907g.f5095e;
                g6.v.h(l0Var);
                l0Var.beginAdUnitExposure(this.f4906f, this.f5053b);
                break;
            default:
                l0 l0Var2 = this.f4907g.f5095e;
                g6.v.h(l0Var2);
                l0Var2.endAdUnitExposure(this.f4906f, this.f5053b);
                break;
        }
    }
}
