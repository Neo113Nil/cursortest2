package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j1 f5331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f5332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(j1 j1Var, Object obj, int i5) {
        super(j1Var, true);
        this.f5330e = i5;
        this.f5332g = obj;
        this.f5331f = j1Var;
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f5330e) {
            case 0:
                l0 l0Var = this.f5331f.f5095e;
                g6.v.h(l0Var);
                l0Var.setUserProperty("fcm", "_ln", new t6.b(this.f5332g), true, this.f5052a);
                break;
            case 1:
                l0 l0Var2 = this.f5331f.f5095e;
                g6.v.h(l0Var2);
                l0Var2.setConditionalUserProperty((Bundle) this.f5332g, this.f5052a);
                break;
            case 2:
                l0 l0Var3 = this.f5331f.f5095e;
                g6.v.h(l0Var3);
                l0Var3.retrieveAndUploadBatches(new b1(this, (s7.w0) this.f5332g));
                break;
            default:
                l0 l0Var4 = this.f5331f.f5095e;
                g6.v.h(l0Var4);
                l0Var4.logHealthData(5, "Error with data collection. Data lost.", new t6.b((Exception) this.f5332g), new t6.b(null), new t6.b(null));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j1 j1Var, Bundle bundle) {
        super(j1Var, true);
        this.f5330e = 1;
        this.f5332g = bundle;
        Objects.requireNonNull(j1Var);
        this.f5331f = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j1 j1Var, Exception exc) {
        super(j1Var, false);
        this.f5330e = 3;
        this.f5332g = exc;
        this.f5331f = j1Var;
    }
}
