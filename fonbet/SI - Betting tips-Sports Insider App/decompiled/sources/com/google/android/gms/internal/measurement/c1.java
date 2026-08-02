package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f4943f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j1 f4944g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(j1 j1Var, i0 i0Var, int i5) {
        super(j1Var, true);
        this.f4942e = i5;
        this.f4943f = i0Var;
        this.f4944g = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f4942e) {
            case 0:
                l0 l0Var = this.f4944g.f5095e;
                g6.v.h(l0Var);
                l0Var.getGmpAppId(this.f4943f);
                break;
            case 1:
                l0 l0Var2 = this.f4944g.f5095e;
                g6.v.h(l0Var2);
                l0Var2.getCachedAppInstanceId(this.f4943f);
                break;
            case 2:
                l0 l0Var3 = this.f4944g.f5095e;
                g6.v.h(l0Var3);
                l0Var3.generateEventId(this.f4943f);
                break;
            case 3:
                l0 l0Var4 = this.f4944g.f5095e;
                g6.v.h(l0Var4);
                l0Var4.getCurrentScreenName(this.f4943f);
                break;
            default:
                l0 l0Var5 = this.f4944g.f5095e;
                g6.v.h(l0Var5);
                l0Var5.getCurrentScreenClass(this.f4943f);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void b() {
        switch (this.f4942e) {
            case 0:
                this.f4943f.b(null);
                break;
            case 1:
                this.f4943f.b(null);
                break;
            case 2:
                this.f4943f.b(null);
                break;
            case 3:
                this.f4943f.b(null);
                break;
            default:
                this.f4943f.b(null);
                break;
        }
    }
}
