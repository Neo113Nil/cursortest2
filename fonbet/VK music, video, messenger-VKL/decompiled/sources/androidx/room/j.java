package androidx.room;

import androidx.room.RoomDatabase;
import androidx.room.a;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.l;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hyg0;
import xsna.j5g;
import xsna.jyg0;
import xsna.o45;
import xsna.ph60;
import xsna.pli;
import xsna.qin0;
import xsna.rin0;
import xsna.sin0;
import xsna.tin0;
import xsna.vlg0;

/* compiled from: RoomConnectionManager.android.kt */
/* loaded from: classes.dex */
public final class j extends androidx.room.a {
    public final androidx.room.b c;
    public final l d;
    public final List<RoomDatabase.b> e;
    public final ConnectionPool f;
    public sin0 g;

    /* compiled from: RoomConnectionManager.android.kt */
    public static final class a extends l {
        @Override // androidx.room.l
        public final void a(hyg0 hyg0Var) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.l
        public final void b(hyg0 hyg0Var) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.l
        public final void c() {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.l
        public final void d(hyg0 hyg0Var) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.l
        public final void e() {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.l
        public final void f(hyg0 hyg0Var) {
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.l
        public final l.a g(hyg0 hyg0Var) {
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* compiled from: RoomConnectionManager.android.kt */
    public final class b extends tin0.a {
        public b(int i) {
            super(i);
        }

        @Override // xsna.tin0.a
        public final void c(sin0 sin0Var) {
            j.this.f(new qin0(sin0Var));
        }

        @Override // xsna.tin0.a
        public final void d(sin0 sin0Var, int i, int i2) {
            f(sin0Var, i, i2);
        }

        @Override // xsna.tin0.a
        public final void e(sin0 sin0Var) {
            qin0 qin0Var = new qin0(sin0Var);
            j jVar = j.this;
            jVar.h(qin0Var);
            jVar.g = sin0Var;
        }

        @Override // xsna.tin0.a
        public final void f(sin0 sin0Var, int i, int i2) {
            j.this.g(new qin0(sin0Var), i, i2);
        }
    }

    public j(androidx.room.b bVar, l lVar) {
        int i;
        androidx.room.coroutines.c p;
        RoomDatabase.JournalMode journalMode = bVar.g;
        tin0.c cVar = bVar.c;
        this.c = bVar;
        this.d = lVar;
        List<RoomDatabase.b> list = bVar.e;
        this.e = list == null ? EmptyList.b : list;
        jyg0 jyg0Var = bVar.t;
        if (jyg0Var != null) {
            String str = bVar.b;
            if (str == null) {
                p = pli.q(new a.C0084a(this, jyg0Var));
            } else {
                a.C0084a c0084a = new a.C0084a(this, jyg0Var);
                int[] iArr = a.b.$EnumSwitchMapping$0;
                int i2 = iArr[journalMode.ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + journalMode + '\'').toString());
                    }
                    i = 4;
                }
                int i3 = iArr[journalMode.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + journalMode + '\'').toString());
                }
                p = pli.p(c0084a, str, i);
            }
            this.f = p;
        } else {
            if (cVar == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.f = new rin0(new ph60(cVar.create(new tin0.b(bVar.a, bVar.b, new b(lVar.a), false, false))));
        }
        boolean z = journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        tin0 j = j();
        if (j != null) {
            j.setWriteAheadLoggingEnabled(z);
        }
    }

    @Override // androidx.room.a
    public final List<RoomDatabase.b> c() {
        return this.e;
    }

    @Override // androidx.room.a
    public final androidx.room.b d() {
        return this.c;
    }

    @Override // androidx.room.a
    public final l e() {
        return this.d;
    }

    public final tin0 j() {
        ph60 ph60Var;
        ConnectionPool connectionPool = this.f;
        rin0 rin0Var = connectionPool instanceof rin0 ? (rin0) connectionPool : null;
        if (rin0Var == null || (ph60Var = rin0Var.b) == null) {
            return null;
        }
        return (tin0) ph60Var.b;
    }

    public j(androidx.room.b bVar, o45 o45Var) {
        this.c = bVar;
        this.d = new a(-1, "", "");
        List list = bVar.e;
        this.e = list == null ? EmptyList.b : list;
        this.f = new rin0(new ph60(((RoomDatabase) o45Var.c).g(new androidx.room.b(bVar.a, bVar.b, bVar.c, bVar.d, j5g.v0(new k(new vlg0(this, 0)), list == null ? EmptyList.b : list), bVar.f, bVar.g, bVar.h, bVar.i, bVar.j, bVar.k, bVar.l, bVar.m, bVar.n, bVar.o, bVar.p, bVar.q, bVar.r, bVar.s, bVar.t, bVar.u))));
        boolean z = bVar.g == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        tin0 j = j();
        if (j != null) {
            j.setWriteAheadLoggingEnabled(z);
        }
    }
}
