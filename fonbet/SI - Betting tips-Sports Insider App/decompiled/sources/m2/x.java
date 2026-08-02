package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements s2.c {

    /* renamed from: a, reason: collision with root package name */
    public final s2.c f20292a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f20294c;

    public x(d0 d0Var, s2.c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f20294c = d0Var;
        this.f20292a = delegate;
        this.f20293b = l2.b.a();
    }

    @Override // s2.c
    public final void B(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.B(i5, value);
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // s2.c
    public final boolean E() {
        return getLong(0) != 0;
    }

    @Override // s2.c
    public final String V(int i5) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.V(i5);
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.close();
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // s2.c
    public final void f(int i5, long j) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.f(i5, j);
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // s2.c
    public final void g(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.g(i5, value);
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // s2.c
    public final byte[] getBlob(int i5) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.getBlob(i5);
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // s2.c
    public final int getColumnCount() {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.getColumnCount();
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // s2.c
    public final String getColumnName(int i5) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.getColumnName(i5);
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // s2.c
    public final long getLong(int i5) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.getLong(i5);
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // s2.c
    public final void h(int i5) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.h(i5);
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // s2.c
    public final boolean isNull(int i5) {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.isNull(i5);
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // s2.c
    public final void l() {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.l();
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override // s2.c
    public final boolean n0() {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            return this.f20292a.n0();
        }
        h8.b.C(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override // s2.c
    public final void reset() {
        if (this.f20294c.f20206e) {
            h8.b.C(21, "Statement is recycled");
            throw null;
        }
        if (this.f20293b == l2.b.a()) {
            this.f20292a.reset();
        } else {
            h8.b.C(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
