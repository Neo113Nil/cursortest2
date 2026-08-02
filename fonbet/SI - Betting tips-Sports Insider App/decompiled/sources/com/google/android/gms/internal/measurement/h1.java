package com.google.android.gms.internal.measurement;

import android.app.Activity;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h1 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5069e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f5070f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i1 f5071g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, Activity activity, int i5) {
        super(i1Var.f5083a, true);
        this.f5069e = i5;
        switch (i5) {
            case 1:
                this.f5070f = activity;
                this.f5071g = i1Var;
                super(i1Var.f5083a, true);
                break;
            case 2:
                this.f5070f = activity;
                this.f5071g = i1Var;
                super(i1Var.f5083a, true);
                break;
            case 3:
                this.f5070f = activity;
                this.f5071g = i1Var;
                super(i1Var.f5083a, true);
                break;
            case 4:
                this.f5070f = activity;
                this.f5071g = i1Var;
                super(i1Var.f5083a, true);
                break;
            default:
                this.f5070f = activity;
                this.f5071g = i1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f5069e) {
            case 0:
                l0 l0Var = this.f5071g.f5083a.f5095e;
                g6.v.h(l0Var);
                l0Var.onActivityStartedByScionActivityInfo(zzdf.c(this.f5070f), this.f5053b);
                break;
            case 1:
                l0 l0Var2 = this.f5071g.f5083a.f5095e;
                g6.v.h(l0Var2);
                l0Var2.onActivityResumedByScionActivityInfo(zzdf.c(this.f5070f), this.f5053b);
                break;
            case 2:
                l0 l0Var3 = this.f5071g.f5083a.f5095e;
                g6.v.h(l0Var3);
                l0Var3.onActivityPausedByScionActivityInfo(zzdf.c(this.f5070f), this.f5053b);
                break;
            case 3:
                l0 l0Var4 = this.f5071g.f5083a.f5095e;
                g6.v.h(l0Var4);
                l0Var4.onActivityStoppedByScionActivityInfo(zzdf.c(this.f5070f), this.f5053b);
                break;
            default:
                l0 l0Var5 = this.f5071g.f5083a.f5095e;
                g6.v.h(l0Var5);
                l0Var5.onActivityDestroyedByScionActivityInfo(zzdf.c(this.f5070f), this.f5053b);
                break;
        }
    }
}
