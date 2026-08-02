package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class o0 extends m0 {
    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public n0 g(Object obj) {
        return ((AbstractC2147w) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(n0 n0Var) {
        return n0Var.d();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(n0 n0Var) {
        return n0Var.e();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public n0 k(n0 n0Var, n0 n0Var2) {
        return n0.c().equals(n0Var2) ? n0Var : n0.c().equals(n0Var) ? n0.j(n0Var, n0Var2) : n0Var.i(n0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public n0 n() {
        return n0.k();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, n0 n0Var) {
        p(obj, n0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, n0 n0Var) {
        ((AbstractC2147w) obj).unknownFields = n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public n0 r(n0 n0Var) {
        n0Var.h();
        return n0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(n0 n0Var, s0 s0Var) {
        n0Var.p(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(n0 n0Var, s0 s0Var) {
        n0Var.r(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public boolean q(e0 e0Var) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(n0 n0Var, int i10, int i11) {
        n0Var.n(r0.c(i10, 5), Integer.valueOf(i11));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(n0 n0Var, int i10, long j10) {
        n0Var.n(r0.c(i10, 1), Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(n0 n0Var, int i10, n0 n0Var2) {
        n0Var.n(r0.c(i10, 3), n0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(n0 n0Var, int i10, AbstractC2132g abstractC2132g) {
        n0Var.n(r0.c(i10, 2), abstractC2132g);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(n0 n0Var, int i10, long j10) {
        n0Var.n(r0.c(i10, 0), Long.valueOf(j10));
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public n0 f(Object obj) {
        n0 g10 = g(obj);
        if (g10 != n0.c()) {
            return g10;
        }
        n0 k10 = n0.k();
        p(obj, k10);
        return k10;
    }
}
