package androidx.room;

import androidx.room.RoomDatabase;
import androidx.room.l;
import com.mbridge.msdk.MBridgeConstans;
import io.requery.android.database.sqlite.SQLiteDatabaseConfiguration;
import java.nio.channels.FileChannel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import xsna.brm0;
import xsna.e43;
import xsna.epx;
import xsna.hm20;
import xsna.hyg0;
import xsna.i9r;
import xsna.jyg0;
import xsna.nm20;
import xsna.p7i;
import xsna.qin0;
import xsna.qyg0;
import xsna.s200;
import xsna.s3q0;
import xsna.yfb;
import xsna.z2q;

/* compiled from: RoomConnectionManager.kt */
/* loaded from: classes.dex */
public abstract class a {
    public boolean a;
    public boolean b;

    /* compiled from: RoomConnectionManager.kt */
    /* renamed from: androidx.room.a$a, reason: collision with other inner class name */
    /* loaded from: classes12.dex */
    public final class C0084a implements jyg0 {
        public final jyg0 b;
        public final /* synthetic */ j c;

        public C0084a(j jVar, jyg0 jyg0Var) {
            this.c = jVar;
            this.b = jyg0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:61:0x00b0 A[Catch: all -> 0x00b1, TRY_ENTER, TryCatch #0 {all -> 0x00b1, blocks: (B:61:0x00b0, B:62:0x00b3, B:63:0x00cb), top: B:59:0x00ae }] */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00b3 A[Catch: all -> 0x00b1, TryCatch #0 {all -> 0x00b1, blocks: (B:61:0x00b0, B:62:0x00b3, B:63:0x00cb), top: B:59:0x00ae }] */
        @Override // xsna.jyg0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final hyg0 open(String str) {
            FileChannel fileChannel;
            FileChannel fileChannel2;
            boolean equals = str.equals(SQLiteDatabaseConfiguration.MEMORY_DB_PATH);
            j jVar = this.c;
            if (!equals) {
                str = jVar.c.a.getDatabasePath(str).getAbsolutePath();
            }
            boolean z = true;
            z2q z2qVar = new z2q(str, (jVar.a || jVar.b || epx.f(str, SQLiteDatabaseConfiguration.MEMORY_DB_PATH)) ? false : true);
            ReentrantLock reentrantLock = z2qVar.a;
            reentrantLock.lock();
            i9r i9rVar = z2qVar.b;
            if (i9rVar != null) {
                try {
                    i9rVar.a();
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    try {
                        if (!z) {
                            throw th;
                        }
                        throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            }
            try {
                try {
                    if (jVar.b) {
                        throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                    }
                    hyg0 open = this.b.open(str);
                    if (jVar.a) {
                        if (jVar.d().g == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
                            p7i.e(open, "PRAGMA synchronous = NORMAL");
                        } else {
                            p7i.e(open, "PRAGMA synchronous = FULL");
                        }
                        a.b(open);
                        jVar.e().d(open);
                    } else {
                        try {
                            jVar.b = true;
                            a.a(jVar, open);
                            jVar.b = false;
                        } catch (Throwable th2) {
                            jVar.b = false;
                            throw th2;
                        }
                    }
                    if (i9rVar != null && (fileChannel2 = (FileChannel) i9rVar.b) != null) {
                        try {
                            fileChannel2.close();
                            i9rVar.b = null;
                        } finally {
                        }
                    }
                    return open;
                } catch (Throwable th3) {
                    if (i9rVar != null && (fileChannel = (FileChannel) i9rVar.b) != null) {
                        try {
                            fileChannel.close();
                            i9rVar.b = null;
                        } finally {
                        }
                    }
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                if (!z) {
                }
            }
        }
    }

    /* compiled from: RoomConnectionManager.kt */
    /* loaded from: classes12.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[RoomDatabase.JournalMode.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(j jVar, hyg0 hyg0Var) {
        Object failure;
        l lVar = jVar.d;
        RoomDatabase.JournalMode journalMode = jVar.c.g;
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        if (journalMode == journalMode2) {
            p7i.e(hyg0Var, "PRAGMA journal_mode = WAL");
        } else {
            p7i.e(hyg0Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (jVar.d().g == journalMode2) {
            p7i.e(hyg0Var, "PRAGMA synchronous = NORMAL");
        } else {
            p7i.e(hyg0Var, "PRAGMA synchronous = FULL");
        }
        b(hyg0Var);
        qyg0 V0 = hyg0Var.V0("PRAGMA user_version");
        try {
            V0.step();
            int i = (int) V0.getLong(0);
            yfb.d(V0, null);
            if (i != lVar.a) {
                p7i.e(hyg0Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        jVar.f(hyg0Var);
                    } else {
                        jVar.g(hyg0Var, i, lVar.a);
                    }
                    p7i.e(hyg0Var, "PRAGMA user_version = " + lVar.a);
                    failure = s3q0.a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    p7i.e(hyg0Var, "END TRANSACTION");
                }
                Throwable a = Result.a(failure);
                if (a != null) {
                    p7i.e(hyg0Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            jVar.h(hyg0Var);
        } finally {
        }
    }

    public static void b(hyg0 hyg0Var) {
        qyg0 V0 = hyg0Var.V0("PRAGMA busy_timeout");
        try {
            V0.step();
            long j = V0.getLong(0);
            yfb.d(V0, null);
            if (j < 3000) {
                p7i.e(hyg0Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                yfb.d(V0, th);
                throw th2;
            }
        }
    }

    public abstract List<RoomDatabase.b> c();

    public abstract androidx.room.b d();

    public abstract l e();

    public final void f(hyg0 hyg0Var) {
        qyg0 V0 = hyg0Var.V0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (V0.step()) {
                if (V0.getLong(0) == 0) {
                    z = true;
                }
            }
            yfb.d(V0, null);
            e().a(hyg0Var);
            if (!z) {
                l.a g = e().g(hyg0Var);
                if (!g.a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g.b).toString());
                }
            }
            i(hyg0Var);
            e().c();
            for (RoomDatabase.b bVar : c()) {
                bVar.getClass();
                if (hyg0Var instanceof qin0) {
                    bVar.a(((qin0) hyg0Var).b);
                }
            }
        } finally {
        }
    }

    public final void g(hyg0 hyg0Var, int i, int i2) {
        List<hm20> a = nm20.a(d().d, i, i2);
        if (a != null) {
            e().f(hyg0Var);
            Iterator<T> it = a.iterator();
            while (it.hasNext()) {
                ((hm20) it.next()).a(hyg0Var);
            }
            l.a g = e().g(hyg0Var);
            if (g.a) {
                e().e();
                i(hyg0Var);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + g.b).toString());
            }
        }
        if (nm20.b(d(), i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (d().s) {
            qyg0 V0 = hyg0Var.V0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ListBuilder e = e43.e();
                while (V0.step()) {
                    String l2 = V0.l2(0);
                    if (!brm0.B(l2, "sqlite_", false) && !l2.equals("android_metadata")) {
                        e.add(new Pair(l2, Boolean.valueOf(epx.f(V0.l2(1), MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW))));
                    }
                }
                ListBuilder g2 = e.g();
                yfb.d(V0, null);
                ListIterator listIterator = g2.listIterator(0);
                while (true) {
                    ListBuilder.a aVar = (ListBuilder.a) listIterator;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) aVar.next();
                    String str = (String) pair.d();
                    if (((Boolean) pair.g()).booleanValue()) {
                        p7i.e(hyg0Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        p7i.e(hyg0Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            e().b(hyg0Var);
        }
        Iterator<T> it2 = c().iterator();
        while (it2.hasNext()) {
            ((RoomDatabase.b) it2.next()).getClass();
        }
        e().a(hyg0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(hyg0 hyg0Var) {
        boolean z;
        Object failure;
        l.a g;
        qyg0 V0 = hyg0Var.V0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (V0.step()) {
                if (V0.getLong(0) != 0) {
                    z = true;
                    yfb.d(V0, null);
                    if (z) {
                        p7i.e(hyg0Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            g = e().g(hyg0Var);
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        if (!g.a) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + g.b).toString());
                        }
                        e().e();
                        i(hyg0Var);
                        failure = s3q0.a;
                        if (!(failure instanceof Result.Failure)) {
                            p7i.e(hyg0Var, "END TRANSACTION");
                        }
                        Throwable a = Result.a(failure);
                        if (a != null) {
                            p7i.e(hyg0Var, "ROLLBACK TRANSACTION");
                            throw a;
                        }
                    } else {
                        V0 = hyg0Var.V0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String l2 = V0.step() ? V0.l2(0) : null;
                            yfb.d(V0, null);
                            if (!e().b.equals(l2) && !e().c.equals(l2)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + e().b + ", found: " + l2).toString());
                            }
                        } finally {
                        }
                    }
                    e().d(hyg0Var);
                    for (RoomDatabase.b bVar : c()) {
                        bVar.getClass();
                        if (hyg0Var instanceof qin0) {
                            bVar.b(((qin0) hyg0Var).b);
                        }
                    }
                    this.a = true;
                }
            }
            z = false;
            yfb.d(V0, null);
            if (z) {
            }
            e().d(hyg0Var);
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

    public final void i(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, s200.t(e().b));
    }
}
