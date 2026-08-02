package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mlg implements Closeable {
    public static final kn5 f = new kn5("proto");
    public final ysg a;
    public final wy2 b;
    public final wy2 c;
    public final eu0 d;
    public final yff e;

    public mlg(wy2 wy2Var, wy2 wy2Var2, eu0 eu0Var, ysg ysgVar, yff yffVar) {
        this.a = ysgVar;
        this.b = wy2Var;
        this.c = wy2Var2;
        this.d = eu0Var;
        this.e = yffVar;
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, jv0 jv0Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(jv0Var.a, String.valueOf(m7f.a(jv0Var.c))));
        byte[] bArr = jv0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !query.moveToNext() ? null : Long.valueOf(query.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String p(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((su0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object t(Cursor cursor, klg klgVar) {
        try {
            return klgVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final SQLiteDatabase h() {
        ysg ysgVar = this.a;
        Objects.requireNonNull(ysgVar);
        wy2 wy2Var = this.c;
        long time = wy2Var.getTime();
        while (true) {
            try {
                return ysgVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (wy2Var.getTime() >= this.d.c + time) {
                    throw new kqi("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object j(klg klgVar) {
        SQLiteDatabase h = h();
        h.beginTransaction();
        try {
            Object apply = klgVar.apply(h);
            h.setTransactionSuccessful();
            return apply;
        } finally {
            h.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, jv0 jv0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long i2 = i(sQLiteDatabase, jv0Var);
        if (i2 == null) {
            return arrayList;
        }
        t(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{i2.toString()}, null, null, null, String.valueOf(i)), new li3(15, this, arrayList, jv0Var));
        return arrayList;
    }

    public final void m(long j, qib qibVar, String str) {
        j(new gi3(str, qibVar, j));
    }

    public final Object n(lqi lqiVar) {
        SQLiteDatabase h = h();
        wy2 wy2Var = this.c;
        long time = wy2Var.getTime();
        while (true) {
            try {
                h.beginTransaction();
                try {
                    Object v = lqiVar.v();
                    h.setTransactionSuccessful();
                    return v;
                } finally {
                    h.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (wy2Var.getTime() >= this.d.c + time) {
                    throw new kqi("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
