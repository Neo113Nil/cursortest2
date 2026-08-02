package defpackage;

import android.content.Context;
import android.content.Intent;
import com.ironsource.Ua;
import com.mbridge.msdk.MBridgeConstans;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d6g {
    public boolean a;
    public boolean b;
    public final hg4 c;
    public final o6g d;
    public final List e;
    public final ak3 f;
    public final fni g;
    public dni h;

    public d6g(hg4 hg4Var, o6g o6gVar, p1 p1Var) {
        int i;
        ak3 dk3Var;
        hg4Var.getClass();
        this.c = hg4Var;
        this.d = o6gVar;
        List list = hg4Var.e;
        i6g i6gVar = hg4Var.g;
        eni eniVar = hg4Var.c;
        hlg hlgVar = hg4Var.t;
        String str = hg4Var.b;
        this.e = list == null ? km5.a : list;
        fni fniVar = null;
        if (hlgVar != null) {
            this.g = null;
            if (hlgVar.o()) {
                dk3Var = new rae(new z41(this, hlgVar), str == null ? ":memory:" : str, p1Var);
            } else if (str == null) {
                dk3Var = new dk3(new z41(this, hlgVar));
            } else {
                z41 z41Var = new z41(this, hlgVar);
                int ordinal = i6gVar.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        pvd.B(i6gVar, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int ordinal2 = i6gVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    pvd.B(i6gVar, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                dk3Var = new dk3(z41Var, str, i);
            }
            this.f = dk3Var;
        } else {
            if (eniVar == null) {
                a70.p("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = hg4Var.a;
            context.getClass();
            fniVar = eniVar.a(new ge6(context, str, new b6g(this, o6gVar.a), false, false));
            this.g = fniVar;
            this.f = new rae(new by9(fniVar), str == null ? ":memory:" : str, p1Var);
        }
        boolean z = i6gVar == i6g.b;
        if (fniVar != null) {
            fniVar.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(glg glgVar) {
        nlg V0 = glgVar.V0("PRAGMA busy_timeout");
        try {
            V0.U0();
            long j = V0.getLong(0);
            o1j.t(V0, null);
            if (j < Ua.C) {
                b0a.F(glgVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o1j.t(V0, th);
                throw th2;
            }
        }
    }

    public final void b(glg glgVar) {
        Object u2gVar;
        a(glgVar);
        hg4 hg4Var = this.c;
        i6g i6gVar = hg4Var.g;
        i6g i6gVar2 = i6g.b;
        if (i6gVar == i6gVar2) {
            b0a.F(glgVar, "PRAGMA journal_mode = WAL");
        } else {
            b0a.F(glgVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (hg4Var.g == i6gVar2) {
            b0a.F(glgVar, "PRAGMA synchronous = NORMAL");
        } else {
            b0a.F(glgVar, "PRAGMA synchronous = FULL");
        }
        nlg V0 = glgVar.V0("PRAGMA user_version");
        try {
            V0.U0();
            int i = (int) V0.getLong(0);
            o1j.t(V0, null);
            o6g o6gVar = this.d;
            int i2 = o6gVar.a;
            int i3 = o6gVar.a;
            if (i != i2) {
                b0a.F(glgVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    p2g p2gVar = w2g.b;
                    if (i == 0) {
                        c(glgVar);
                    } else {
                        d(glgVar, i, i3);
                    }
                    b0a.F(glgVar, "PRAGMA user_version = " + i3);
                    u2gVar = Unit.a;
                } catch (Throwable th) {
                    p2g p2gVar2 = w2g.b;
                    u2gVar = new u2g(th);
                }
                if (!(u2gVar instanceof u2g)) {
                    b0a.F(glgVar, "END TRANSACTION");
                }
                Throwable a = w2g.a(u2gVar);
                if (a != null) {
                    b0a.F(glgVar, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            e(glgVar);
        } finally {
        }
    }

    public final void c(glg glgVar) {
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (V0.U0()) {
                if (V0.getLong(0) == 0) {
                    z = true;
                }
            }
            o1j.t(V0, null);
            o6g o6gVar = this.d;
            o6gVar.a(glgVar);
            if (!z) {
                n6g g = o6gVar.g(glgVar);
                if (!g.b) {
                    pvd.z(g.c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            b0a.F(glgVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + o6gVar.b + "')");
            o6gVar.c(glgVar);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((g6g) it.next()).getClass();
                if (glgVar instanceof cni) {
                    ((cni) glgVar).a.getClass();
                }
            }
        } finally {
        }
    }

    public final void d(glg glgVar, int i, int i2) {
        glgVar.getClass();
        hg4 hg4Var = this.c;
        List J = aik.J(hg4Var.d, i, i2);
        o6g o6gVar = this.d;
        if (J != null) {
            o6gVar.f(glgVar);
            Iterator it = J.iterator();
            while (it.hasNext()) {
                ((njc) it.next()).a(glgVar);
            }
            n6g g = o6gVar.g(glgVar);
            if (!g.b) {
                pvd.z(g.c, "Migration didn't properly handle: ");
                return;
            }
            o6gVar.e(glgVar);
            b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            b0a.F(glgVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + o6gVar.b + "')");
            return;
        }
        if (aik.X(hg4Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (hg4Var.s) {
            nlg V0 = glgVar.V0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                xbb b = a.b();
                while (V0.U0()) {
                    String F0 = V0.F0(0);
                    if (!c.v(F0, "sqlite_", false) && !F0.equals("android_metadata")) {
                        b.add(new Pair(F0, Boolean.valueOf(Intrinsics.c(V0.F0(1), MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW))));
                    }
                }
                xbb a = a.a(b);
                o1j.t(V0, null);
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) hc9Var.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        b0a.F(glgVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        b0a.F(glgVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } finally {
            }
        } else {
            o6gVar.b(glgVar);
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((g6g) it2.next()).getClass();
            if (glgVar instanceof cni) {
                ((cni) glgVar).a.getClass();
            }
        }
        o6gVar.a(glgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(glg glgVar) {
        boolean z;
        Object u2gVar;
        n6g g;
        glgVar.getClass();
        nlg V0 = glgVar.V0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (V0.U0()) {
                if (V0.getLong(0) != 0) {
                    z = true;
                    o1j.t(V0, null);
                    o6g o6gVar = this.d;
                    if (z) {
                        b0a.F(glgVar, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            p2g p2gVar = w2g.b;
                            g = o6gVar.g(glgVar);
                        } catch (Throwable th) {
                            p2g p2gVar2 = w2g.b;
                            u2gVar = new u2g(th);
                        }
                        if (!g.b) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g.c).toString());
                        }
                        o6gVar.e(glgVar);
                        b0a.F(glgVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        b0a.F(glgVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + o6gVar.b + "')");
                        u2gVar = Unit.a;
                        if (!(u2gVar instanceof u2g)) {
                            b0a.F(glgVar, "END TRANSACTION");
                        }
                        Throwable a = w2g.a(u2gVar);
                        if (a != null) {
                            b0a.F(glgVar, "ROLLBACK TRANSACTION");
                            throw a;
                        }
                    } else {
                        V0 = glgVar.V0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String F0 = V0.U0() ? V0.F0(0) : null;
                            o1j.t(V0, null);
                            if (!o6gVar.b.equals(F0) && !o6gVar.c.equals(F0)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + o6gVar.b + ", found: " + F0).toString());
                            }
                        } finally {
                        }
                    }
                    o6gVar.d(glgVar);
                    for (g6g g6gVar : this.e) {
                        g6gVar.getClass();
                        if (glgVar instanceof cni) {
                            g6gVar.a(((cni) glgVar).a);
                        }
                    }
                    this.a = true;
                }
            }
            z = false;
            o1j.t(V0, null);
            o6g o6gVar2 = this.d;
            if (z) {
            }
            o6gVar2.d(glgVar);
            while (r0.hasNext()) {
            }
            this.a = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public d6g(hg4 hg4Var, mme mmeVar, p1 p1Var) {
        hg4Var.getClass();
        i6g i6gVar = hg4Var.g;
        this.c = hg4Var;
        this.d = new a6g(-1, "", "");
        List list = hg4Var.e;
        this.e = list == null ? km5.a : list;
        ArrayList x0 = CollectionsKt.x0(list == null ? km5.a : list, new c6g(new mme(this, 25)));
        Context context = hg4Var.a;
        String str = hg4Var.b;
        eni eniVar = hg4Var.c;
        jga jgaVar = hg4Var.d;
        boolean z = hg4Var.f;
        Executor executor = hg4Var.h;
        Executor executor2 = hg4Var.i;
        Intent intent = hg4Var.j;
        boolean z2 = hg4Var.k;
        boolean z3 = hg4Var.l;
        Set set = hg4Var.m;
        String str2 = hg4Var.n;
        File file = hg4Var.o;
        Callable callable = hg4Var.p;
        List list2 = hg4Var.q;
        List list3 = hg4Var.r;
        boolean z4 = hg4Var.s;
        hlg hlgVar = hg4Var.t;
        CoroutineContext coroutineContext = hg4Var.u;
        context.getClass();
        executor.getClass();
        executor2.getClass();
        fni fniVar = (fni) mmeVar.invoke(new hg4(context, str, eniVar, jgaVar, x0, z, i6gVar, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, hlgVar, coroutineContext));
        this.g = fniVar;
        by9 by9Var = new by9(fniVar);
        String str3 = hg4Var.b;
        this.f = new rae(by9Var, str3 == null ? ":memory:" : str3, p1Var);
        boolean z5 = i6gVar == i6g.b;
        if (fniVar != null) {
            fniVar.setWriteAheadLoggingEnabled(z5);
        }
    }
}
