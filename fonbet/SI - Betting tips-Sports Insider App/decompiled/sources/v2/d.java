package v2;

import gf.m;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24398d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Object f24399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t2.a db2, String sql, c operation) {
        super(db2, sql);
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(operation, "operation");
        this.f24399e = operation;
    }

    @Override // s2.c
    public final void B(int i5, String value) {
        switch (this.f24398d) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                ((e) this.f24399e).B(i5, value);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                c();
                ((t2.f) this.f24399e).q(i5, value);
                return;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                c();
                h8.b.C(25, "column index out of range");
                throw null;
        }
    }

    @Override // v2.f, s2.c
    public boolean E() {
        switch (this.f24398d) {
            case 0:
                return ((e) this.f24399e).E();
            default:
                return super.E();
        }
    }

    @Override // s2.c
    public final String V(int i5) {
        switch (this.f24398d) {
            case 0:
                return ((e) this.f24399e).V(i5);
            case 1:
                c();
                h8.b.C(21, "no row");
                throw null;
            default:
                c();
                h8.b.C(21, "no row");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f24398d) {
            case 0:
                ((e) this.f24399e).close();
                break;
            case 1:
                ((t2.f) this.f24399e).close();
                this.f24408c = true;
                break;
            default:
                this.f24408c = true;
                break;
        }
    }

    @Override // s2.c
    public final void f(int i5, long j) {
        switch (this.f24398d) {
            case 0:
                ((e) this.f24399e).f(i5, j);
                return;
            case 1:
                c();
                ((t2.f) this.f24399e).f(i5, j);
                return;
            default:
                c();
                h8.b.C(25, "column index out of range");
                throw null;
        }
    }

    @Override // s2.c
    public final void g(int i5, byte[] value) {
        switch (this.f24398d) {
            case 0:
                Intrinsics.checkNotNullParameter(value, "value");
                ((e) this.f24399e).g(i5, value);
                return;
            case 1:
                Intrinsics.checkNotNullParameter(value, "value");
                c();
                ((t2.f) this.f24399e).g(i5, value);
                return;
            default:
                Intrinsics.checkNotNullParameter(value, "value");
                c();
                h8.b.C(25, "column index out of range");
                throw null;
        }
    }

    @Override // s2.c
    public final byte[] getBlob(int i5) {
        switch (this.f24398d) {
            case 0:
                return ((e) this.f24399e).getBlob(i5);
            case 1:
                c();
                h8.b.C(21, "no row");
                throw null;
            default:
                c();
                h8.b.C(21, "no row");
                throw null;
        }
    }

    @Override // s2.c
    public final int getColumnCount() {
        switch (this.f24398d) {
            case 0:
                break;
            case 1:
                c();
                break;
            default:
                c();
                break;
        }
        return 0;
    }

    @Override // s2.c
    public final String getColumnName(int i5) {
        switch (this.f24398d) {
            case 0:
                return ((e) this.f24399e).getColumnName(i5);
            case 1:
                c();
                h8.b.C(21, "no row");
                throw null;
            default:
                c();
                h8.b.C(21, "no row");
                throw null;
        }
    }

    @Override // s2.c
    public final long getLong(int i5) {
        switch (this.f24398d) {
            case 0:
                return ((e) this.f24399e).getLong(i5);
            case 1:
                c();
                h8.b.C(21, "no row");
                throw null;
            default:
                c();
                h8.b.C(21, "no row");
                throw null;
        }
    }

    @Override // s2.c
    public final void h(int i5) {
        switch (this.f24398d) {
            case 0:
                ((e) this.f24399e).h(i5);
                return;
            case 1:
                c();
                ((t2.f) this.f24399e).h(i5);
                return;
            default:
                c();
                h8.b.C(25, "column index out of range");
                throw null;
        }
    }

    @Override // s2.c
    public final boolean isNull(int i5) {
        switch (this.f24398d) {
            case 0:
                return ((e) this.f24399e).isNull(i5);
            case 1:
                c();
                h8.b.C(21, "no row");
                throw null;
            default:
                c();
                h8.b.C(21, "no row");
                throw null;
        }
    }

    @Override // v2.f, s2.c
    public void l() {
        switch (this.f24398d) {
            case 0:
                ((e) this.f24399e).l();
                break;
            case 1:
                c();
                ((t2.f) this.f24399e).l();
                break;
            default:
                super.l();
                break;
        }
    }

    @Override // s2.c
    public final boolean n0() {
        switch (this.f24398d) {
            case 0:
                e eVar = (e) this.f24399e;
                boolean n02 = eVar.n0();
                boolean j = z.j(eVar.V(0), "wal", true);
                t2.a aVar = this.f24406a;
                if (j) {
                    aVar.D();
                } else {
                    aVar.o();
                }
                return n02;
            case 1:
                c();
                ((t2.f) this.f24399e).i();
                return false;
            default:
                int ordinal = ((c) this.f24399e).ordinal();
                t2.a aVar2 = this.f24406a;
                if (ordinal == 0) {
                    aVar2.G();
                    aVar2.S();
                    return false;
                }
                if (ordinal == 1) {
                    aVar2.S();
                    return false;
                }
                if (ordinal == 2) {
                    aVar2.m();
                    return false;
                }
                if (ordinal == 3) {
                    aVar2.I();
                    return false;
                }
                if (ordinal != 4) {
                    throw new m();
                }
                aVar2.x();
                return false;
        }
    }

    @Override // v2.f, s2.c
    public void reset() {
        switch (this.f24398d) {
            case 0:
                ((e) this.f24399e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t2.a db2, String sql, e delegate) {
        super(db2, sql);
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f24399e = delegate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t2.a db2, String sql) {
        super(db2, sql);
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f24399e = db2.s(sql);
    }
}
