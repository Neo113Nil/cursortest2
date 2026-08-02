package l5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i implements d, m5.c, c {

    /* renamed from: f, reason: collision with root package name */
    public static final b5.c f19379f = new b5.c("proto");

    /* renamed from: a, reason: collision with root package name */
    public final k f19380a;

    /* renamed from: b, reason: collision with root package name */
    public final n5.a f19381b;

    /* renamed from: c, reason: collision with root package name */
    public final n5.a f19382c;

    /* renamed from: d, reason: collision with root package name */
    public final a f19383d;

    /* renamed from: e, reason: collision with root package name */
    public final ff.a f19384e;

    public i(n5.a aVar, n5.a aVar2, a aVar3, k kVar, ff.a aVar4) {
        this.f19380a = kVar;
        this.f19381b = aVar;
        this.f19382c = aVar2;
        this.f19383d = aVar3;
        this.f19384e = aVar4;
    }

    public static Long k(SQLiteDatabase sQLiteDatabase, e5.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f8641a, String.valueOf(o5.a.a(iVar.f8643c))));
        byte[] bArr = iVar.f8642b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = query;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            query.close();
        }
    }

    public static String y(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f19371a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object z(Cursor cursor, g gVar) {
        try {
            return gVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase c() {
        k kVar = this.f19380a;
        Objects.requireNonNull(kVar);
        n5.a aVar = this.f19382c;
        long time = aVar.getTime();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.getTime() >= this.f19383d.f19368c + time) {
                    throw new m5.a("Timed out while trying to open db.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19380a.close();
    }

    public final Object n(g gVar) {
        SQLiteDatabase c2 = c();
        c2.beginTransaction();
        try {
            Object apply = gVar.apply(c2);
            c2.setTransactionSuccessful();
            return apply;
        } finally {
            c2.endTransaction();
        }
    }

    public final ArrayList r(SQLiteDatabase sQLiteDatabase, e5.i iVar, int i5) {
        ArrayList arrayList = new ArrayList();
        Long k6 = k(sQLiteDatabase, iVar);
        if (k6 == null) {
            return arrayList;
        }
        z(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{k6.toString()}, null, null, null, String.valueOf(i5)), new androidx.transition.i(this, arrayList, iVar, 12));
        return arrayList;
    }

    public final void t(long j, h5.c cVar, String str) {
        n(new j9.f(j, str, cVar));
    }

    public final Object w(m5.b bVar) {
        SQLiteDatabase c2 = c();
        n5.a aVar = this.f19382c;
        long time = aVar.getTime();
        while (true) {
            try {
                c2.beginTransaction();
                try {
                    Object i5 = bVar.i();
                    c2.setTransactionSuccessful();
                    return i5;
                } finally {
                    c2.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e7) {
                if (aVar.getTime() >= this.f19383d.f19368c + time) {
                    throw new m5.a("Timed out while trying to acquire the lock.", e7);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
