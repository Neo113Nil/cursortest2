package m2;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h implements s2.c {

    /* renamed from: a, reason: collision with root package name */
    public final s2.c f20231a;

    public h(s2.c delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f20231a = delegate;
    }

    @Override // s2.c
    public final void B(int i5, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20231a.B(i5, value);
    }

    @Override // s2.c
    public final boolean E() {
        return this.f20231a.E();
    }

    @Override // s2.c
    public final String V(int i5) {
        return this.f20231a.V(i5);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        s2.c cVar = this.f20231a;
        cVar.reset();
        cVar.l();
    }

    @Override // s2.c
    public final void f(int i5, long j) {
        this.f20231a.f(i5, j);
    }

    @Override // s2.c
    public final void g(int i5, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f20231a.g(i5, value);
    }

    @Override // s2.c
    public final byte[] getBlob(int i5) {
        return this.f20231a.getBlob(i5);
    }

    @Override // s2.c
    public final int getColumnCount() {
        return this.f20231a.getColumnCount();
    }

    @Override // s2.c
    public final String getColumnName(int i5) {
        return this.f20231a.getColumnName(i5);
    }

    @Override // s2.c
    public final long getLong(int i5) {
        return this.f20231a.getLong(i5);
    }

    @Override // s2.c
    public final void h(int i5) {
        this.f20231a.h(i5);
    }

    @Override // s2.c
    public final boolean isNull(int i5) {
        return this.f20231a.isNull(i5);
    }

    @Override // s2.c
    public final void l() {
        this.f20231a.l();
    }

    @Override // s2.c
    public final boolean n0() {
        return this.f20231a.n0();
    }

    @Override // s2.c
    public final void reset() {
        this.f20231a.reset();
    }
}
