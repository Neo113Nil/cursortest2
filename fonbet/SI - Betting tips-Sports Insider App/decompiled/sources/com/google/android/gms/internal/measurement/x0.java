package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import j$.util.Objects;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x0 extends g1 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f5346f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f5347g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f5348h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j1 f5349i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(j1 j1Var, String str, String str2, Bundle bundle, int i5) {
        super(j1Var, true);
        this.f5345e = i5;
        switch (i5) {
            case 1:
                this.f5346f = str;
                this.f5347g = str2;
                this.f5348h = bundle;
                Objects.requireNonNull(j1Var);
                this.f5349i = j1Var;
                super(j1Var, true);
                break;
            default:
                this.f5346f = str;
                this.f5347g = str2;
                this.f5348h = bundle;
                Objects.requireNonNull(j1Var);
                this.f5349i = j1Var;
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public final void a() {
        switch (this.f5345e) {
            case 0:
                l0 l0Var = this.f5349i.f5095e;
                g6.v.h(l0Var);
                l0Var.clearConditionalUserProperty(this.f5346f, this.f5347g, this.f5348h);
                break;
            default:
                long j = this.f5052a;
                l0 l0Var2 = this.f5349i.f5095e;
                g6.v.h(l0Var2);
                l0Var2.logEvent(this.f5346f, this.f5347g, this.f5348h, true, true, j);
                break;
        }
    }
}
