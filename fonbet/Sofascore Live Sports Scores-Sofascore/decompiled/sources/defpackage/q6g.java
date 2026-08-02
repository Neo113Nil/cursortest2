package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q6g extends ffb {
    public hg4 g;
    public final List h;
    public final ffb i;
    public final String j;
    public final String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6g(hg4 hg4Var, ffb ffbVar, String str, String str2) {
        super(ffbVar.b, 7);
        hg4Var.getClass();
        this.h = hg4Var.e;
        this.g = hg4Var;
        this.i = ffbVar;
        this.j = str;
        this.k = str2;
    }

    @Override // defpackage.ffb
    public final void r(rr8 rr8Var) {
        Cursor B = rr8Var.B(new y3g("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", (Object[]) null));
        try {
            boolean z = false;
            if (B.moveToFirst()) {
                if (B.getInt(0) == 0) {
                    z = true;
                }
            }
            B.close();
            ffb ffbVar = this.i;
            ffbVar.d(rr8Var);
            if (!z) {
                n6g w = ffbVar.w(rr8Var);
                if (!w.b) {
                    sw9.i(w.c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = rr8Var.a;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.j + "')");
            ffbVar.r(rr8Var);
            List list = this.h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((g6g) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                n4o.x(B, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ffb
    public final void s(rr8 rr8Var, int i, int i2) {
        v(rr8Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    @Override // defpackage.ffb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(rr8 rr8Var) {
        boolean z;
        List list;
        Cursor B = rr8Var.B(new y3g("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'", (Object[]) null));
        try {
            if (B.moveToFirst()) {
                if (B.getInt(0) != 0) {
                    z = true;
                    B.close();
                    ffb ffbVar = this.i;
                    String str = this.j;
                    if (z) {
                        n6g w = ffbVar.w(rr8Var);
                        if (!w.b) {
                            sw9.i(w.c, "Pre-packaged database has an invalid schema: ");
                            return;
                        }
                        SQLiteDatabase sQLiteDatabase = rr8Var.a;
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
                    } else {
                        B = rr8Var.B(new y3g("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (Object[]) null));
                        try {
                            String string = B.moveToFirst() ? B.getString(0) : null;
                            B.close();
                            if (!str.equals(string) && !this.k.equals(string)) {
                                a70.r(fc6.n("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ", str, ", found: ", string));
                                return;
                            }
                        } finally {
                        }
                    }
                    ffbVar.t(rr8Var);
                    list = this.h;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((g6g) it.next()).a(rr8Var);
                        }
                    }
                    this.g = null;
                }
            }
            z = false;
            B.close();
            ffb ffbVar2 = this.i;
            String str2 = this.j;
            if (z) {
            }
            ffbVar2.t(rr8Var);
            list = this.h;
            if (list != null) {
            }
            this.g = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.ffb
    public final void v(rr8 rr8Var, int i, int i2) {
        List J;
        SQLiteDatabase sQLiteDatabase = rr8Var.a;
        hg4 hg4Var = this.g;
        ffb ffbVar = this.i;
        if (hg4Var != null && (J = aik.J(hg4Var.d, i, i2)) != null) {
            ffbVar.u(rr8Var);
            Iterator it = J.iterator();
            while (it.hasNext()) {
                ((njc) it.next()).a(new cni(rr8Var));
            }
            n6g w = ffbVar.w(rr8Var);
            if (!w.b) {
                sw9.i(w.c, "Migration didn't properly handle: ");
                return;
            }
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.j + "')");
            return;
        }
        hg4 hg4Var2 = this.g;
        if (hg4Var2 == null || aik.X(hg4Var2, i, i2)) {
            a70.r(lnb.j(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (hg4Var2.s) {
            Cursor B = rr8Var.B(new y3g("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", (Object[]) null));
            try {
                xbb b = a.b();
                while (B.moveToNext()) {
                    String string = B.getString(0);
                    string.getClass();
                    if (!c.v(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        b.add(new Pair(string, Boolean.valueOf(Intrinsics.c(B.getString(1), MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW))));
                    }
                }
                xbb a = a.a(b);
                B.close();
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) hc9Var.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            ffbVar.f(rr8Var);
        }
        List list = this.h;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((g6g) it2.next()).getClass();
            }
        }
        ffbVar.d(rr8Var);
    }

    @Override // defpackage.ffb
    public final void q(rr8 rr8Var) {
    }
}
