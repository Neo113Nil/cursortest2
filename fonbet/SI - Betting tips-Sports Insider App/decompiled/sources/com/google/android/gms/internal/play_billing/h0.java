package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 extends l implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f5462b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f5463c;

    /* renamed from: a, reason: collision with root package name */
    public final transient d0 f5464a;

    static {
        a0 a0Var = d0.f5420b;
        f5462b = new h0(s0.f5567e);
        Object[] objArr = {q0.f5550c};
        for (int i5 = 0; i5 < 1; i5++) {
            if (objArr[i5] == null) {
                throw new NullPointerException(androidx.appcompat.widget.c1.i(i5, "at index "));
            }
        }
        f5463c = new h0(d0.i(1, objArr));
    }

    public h0(d0 d0Var) {
        this.f5464a = d0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.l
    public final /* bridge */ /* synthetic */ j0 a() {
        d0 d0Var = this.f5464a;
        return d0Var.isEmpty() ? y0.f5645i : new z0(d0Var, o0.f5526c);
    }
}
