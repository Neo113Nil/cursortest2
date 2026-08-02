package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 extends p0 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final o0 f5525b = new o0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f5526c = new o0(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5527a;

    public /* synthetic */ o0(int i5) {
        this.f5527a = i5;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f5527a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                q0 q0Var = (q0) obj;
                q0 q0Var2 = (q0) obj2;
                return u.f5591a.b(q0Var.f5551a, q0Var2.f5551a).b(q0Var.f5552b, q0Var2.f5552b).a();
        }
    }

    public String toString() {
        switch (this.f5527a) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
