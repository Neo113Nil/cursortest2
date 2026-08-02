package androidx.room;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import xsna.brm0;
import xsna.e43;
import xsna.epx;
import xsna.hm20;
import xsna.isj0;
import xsna.nm20;
import xsna.ozl;
import xsna.qin0;
import xsna.ro;
import xsna.s200;
import xsna.sin0;
import xsna.sl9;
import xsna.tin0;
import xsna.y57;

/* compiled from: RoomOpenHelper.android.kt */
@ozl
/* loaded from: classes.dex */
public final class m extends tin0.a {
    public androidx.room.b b;
    public final List<RoomDatabase.b> c;
    public final a d;
    public final String e;
    public final String f;

    /* compiled from: RoomOpenHelper.android.kt */
    @ozl
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(sin0 sin0Var);

        public abstract void b(sin0 sin0Var);

        public abstract void c();

        public abstract void d(sin0 sin0Var);

        public abstract void e(sin0 sin0Var);

        public abstract b f(sin0 sin0Var);
    }

    /* compiled from: RoomOpenHelper.android.kt */
    @ozl
    /* loaded from: classes12.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public m(androidx.room.b bVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.c = bVar.e;
        this.b = bVar;
        this.d = aVar;
        this.e = str;
        this.f = str2;
    }

    @Override // xsna.tin0.a
    public final void c(sin0 sin0Var) {
        Cursor query = sin0Var.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (query.moveToFirst()) {
                if (query.getInt(0) == 0) {
                    z = true;
                }
            }
            query.close();
            a aVar = this.d;
            aVar.a(sin0Var);
            if (!z) {
                b f = aVar.f(sin0Var);
                if (!f.a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + f.b);
                }
            }
            sin0Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sin0Var.execSQL(s200.t(this.e));
            aVar.c();
            List<RoomDatabase.b> list = this.c;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(sin0Var);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ro.e(query, th);
                throw th2;
            }
        }
    }

    @Override // xsna.tin0.a
    public final void d(sin0 sin0Var, int i, int i2) {
        f(sin0Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    @Override // xsna.tin0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(sin0 sin0Var) {
        boolean z;
        List<RoomDatabase.b> list;
        Cursor query = sin0Var.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0) {
                    z = true;
                    query.close();
                    a aVar = this.d;
                    String str = this.e;
                    if (z) {
                        b f = aVar.f(sin0Var);
                        if (!f.a) {
                            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + f.b);
                        }
                        sin0Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        sin0Var.execSQL(s200.t(str));
                    } else {
                        Cursor query2 = sin0Var.query(new isj0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                        try {
                            String string = query2.moveToFirst() ? query2.getString(0) : null;
                            query2.close();
                            if (!str.equals(string) && !this.f.equals(string)) {
                                throw new IllegalStateException(y57.a("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                            }
                        } finally {
                        }
                    }
                    aVar.d(sin0Var);
                    list = this.c;
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            ((RoomDatabase.b) it.next()).b(sin0Var);
                        }
                    }
                    this.b = null;
                }
            }
            z = false;
            query.close();
            a aVar2 = this.d;
            String str2 = this.e;
            if (z) {
            }
            aVar2.d(sin0Var);
            list = this.c;
            if (list != null) {
            }
            this.b = null;
        } finally {
        }
    }

    @Override // xsna.tin0.a
    public final void f(sin0 sin0Var, int i, int i2) {
        androidx.room.b bVar = this.b;
        a aVar = this.d;
        if (bVar != null) {
            RoomDatabase.c cVar = bVar.d;
            cVar.getClass();
            List<hm20> a2 = nm20.a(cVar, i, i2);
            if (a2 != null) {
                aVar.e(sin0Var);
                Iterator<T> it = a2.iterator();
                while (it.hasNext()) {
                    ((hm20) it.next()).a(new qin0(sin0Var));
                }
                b f = aVar.f(sin0Var);
                if (f.a) {
                    sin0Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sin0Var.execSQL(s200.t(this.e));
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + f.b);
                }
            }
        }
        androidx.room.b bVar2 = this.b;
        if (bVar2 == null || nm20.b(bVar2, i, i2)) {
            throw new IllegalStateException(sl9.c(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        }
        if (bVar2.s) {
            Cursor query = sin0Var.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ListBuilder e = e43.e();
                while (query.moveToNext()) {
                    String string = query.getString(0);
                    if (!brm0.B(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        e.add(new Pair(string, Boolean.valueOf(epx.f(query.getString(1), MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW))));
                    }
                }
                ListBuilder g = e.g();
                query.close();
                ListIterator listIterator = g.listIterator(0);
                while (true) {
                    ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
                    if (!aVar2.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) aVar2.next();
                    String str = (String) pair.d();
                    if (((Boolean) pair.g()).booleanValue()) {
                        sin0Var.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sin0Var.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            aVar.b(sin0Var);
        }
        List<RoomDatabase.b> list = this.c;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.b) it2.next()).getClass();
            }
        }
        aVar.a(sin0Var);
    }
}
