package o9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.twilio.voice.EventKeys;
import d9.C4040c;
import d9.EnumC4042e;
import g9.i;
import j9.C5102a;
import j9.C5103b;
import j9.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import k9.AbstractC5213a;
import p9.C6057a;
import p9.InterfaceC6058b;
import q9.InterfaceC6129a;
import r9.AbstractC6212a;

/* loaded from: classes2.dex */
public class M implements InterfaceC5842d, InterfaceC6058b, InterfaceC5841c {

    /* renamed from: f, reason: collision with root package name */
    public static final C4040c f59498f = C4040c.b("proto");

    /* renamed from: a, reason: collision with root package name */
    public final U f59499a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6129a f59500b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC6129a f59501c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5843e f59502d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider f59503e;

    public interface b {
        Object apply(Object obj);
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f59504a;

        /* renamed from: b, reason: collision with root package name */
        public final String f59505b;

        public c(String str, String str2) {
            this.f59504a = str;
            this.f59505b = str2;
        }
    }

    public interface d {
        Object a();
    }

    public M(InterfaceC6129a interfaceC6129a, InterfaceC6129a interfaceC6129a2, AbstractC5843e abstractC5843e, U u10, Provider provider) {
        this.f59499a = u10;
        this.f59500b = interfaceC6129a;
        this.f59501c = interfaceC6129a2;
        this.f59502d = abstractC5843e;
        this.f59503e = provider;
    }

    public static /* synthetic */ SQLiteDatabase A0(Throwable th2) {
        throw new C6057a("Timed out while trying to open db.", th2);
    }

    public static byte[] C2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Object D0(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.r(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static C4040c G2(String str) {
        return str == null ? f59498f : C4040c.b(str);
    }

    public static String H2(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((AbstractC5849k) it.next()).c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object I2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ j9.f J(long j10, Cursor cursor) {
        cursor.moveToNext();
        return j9.f.c().c(cursor.getLong(0)).b(j10).a();
    }

    public static /* synthetic */ byte[] T1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i10 += blob.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            byte[] bArr2 = (byte[]) arrayList.get(i12);
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List U(M m10, g9.o oVar, SQLiteDatabase sQLiteDatabase) {
        List A22 = m10.A2(sQLiteDatabase, oVar, m10.f59502d.d());
        for (EnumC4042e enumC4042e : EnumC4042e.values()) {
            if (enumC4042e != oVar.d()) {
                int d10 = m10.f59502d.d() - A22.size();
                if (d10 <= 0) {
                    break;
                }
                A22.addAll(m10.A2(sQLiteDatabase, oVar.f(enumC4042e), d10));
            }
        }
        return m10.z2(A22, m10.B2(sQLiteDatabase, A22));
    }

    public static /* synthetic */ List Y1(SQLiteDatabase sQLiteDatabase) {
        return (List) I2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: o9.J
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.w0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ C5102a Z1(M m10, Map map, C5102a.C0779a c0779a, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b n22 = m10.n2(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(j9.c.c().c(n22).b(j10).a());
        }
        m10.D2(c0779a, map);
        c0779a.e(m10.v2());
        c0779a.d(m10.s2());
        c0779a.c((String) m10.f59503e.get());
        return c0779a.b();
    }

    public static /* synthetic */ Long b2(M m10, g9.i iVar, g9.o oVar, SQLiteDatabase sQLiteDatabase) {
        if (m10.y2()) {
            m10.r(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long p22 = m10.p2(sQLiteDatabase, oVar);
        int e10 = m10.f59502d.e();
        byte[] a10 = iVar.e().a();
        boolean z10 = a10.length <= e10;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(p22));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put(EventKeys.ERROR_CODE, iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put(EventKeys.PAYLOAD, z10 ? a10 : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int ceil = (int) Math.ceil(a10.length / e10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(a10, (i10 - 1) * e10, Math.min(i10 * e10, a10.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put(EventKeys.VALUE_KEY, (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    public static /* synthetic */ Object c2(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long d2(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object e2(Throwable th2) {
        throw new C6057a("Timed out while trying to acquire the lock.", th2);
    }

    public static /* synthetic */ Object f2(String str, c.b bVar, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) I2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: o9.y
            @Override // o9.M.b
            public final Object apply(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put(EventKeys.REASON, Integer.valueOf(bVar.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object g2(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j10));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j10), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ Integer h2(final M m10, long j10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        String[] strArr = {String.valueOf(j10)};
        I2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: o9.r
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.D0(M.this, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object i2(M m10, List list, g9.o oVar, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            i.a k10 = g9.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z10) {
                k10.h(new g9.h(G2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                k10.h(new g9.h(G2(cursor.getString(4)), m10.E2(j10)));
            }
            if (!cursor.isNull(6)) {
                k10.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC5849k.a(j10, oVar, k10.d()));
        }
        return null;
    }

    public static /* synthetic */ Object j2(M m10, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + m10.f59500b.a()).execute();
        return null;
    }

    public static /* synthetic */ C5102a k2(final M m10, String str, final Map map, final C5102a.C0779a c0779a, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        return (C5102a) I2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: o9.A
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.Z1(M.this, map, c0779a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long l2(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ Object m1(final M m10, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m10.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        I2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: o9.u
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.z0(M.this, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ j9.f m2(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (j9.f) I2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: o9.D
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.J(j10, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Boolean n1(M m10, g9.o oVar, SQLiteDatabase sQLiteDatabase) {
        Long w22 = m10.w2(sQLiteDatabase, oVar);
        return w22 == null ? Boolean.FALSE : (Boolean) I2(m10.r2().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{w22.toString()}), new b() { // from class: o9.t
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ List w0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(g9.o.a().b(cursor.getString(1)).d(AbstractC6212a.b(cursor.getInt(2))).c(C2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object y1(long j10, g9.o oVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(AbstractC6212a.a(oVar.d()))}) < 1) {
            contentValues.put("backend_name", oVar.b());
            contentValues.put(EventKeys.PRIORITY, Integer.valueOf(AbstractC6212a.a(oVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object z0(M m10, Cursor cursor) {
        m10.getClass();
        while (cursor.moveToNext()) {
            m10.r(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final List A2(SQLiteDatabase sQLiteDatabase, final g9.o oVar, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long w22 = w2(sQLiteDatabase, oVar);
        if (w22 == null) {
            return arrayList;
        }
        I2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", EventKeys.PAYLOAD, EventKeys.ERROR_CODE, "inline"}, "context_id = ?", new String[]{w22.toString()}, null, null, null, String.valueOf(i10)), new b() { // from class: o9.v
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.i2(M.this, arrayList, oVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // o9.InterfaceC5841c
    public C5102a B() {
        final C5102a.C0779a e10 = C5102a.e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C5102a) x2(new b() { // from class: o9.s
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.k2(M.this, str, hashMap, e10, (SQLiteDatabase) obj);
            }
        });
    }

    public final Map B2(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((AbstractC5849k) list.get(i10)).c());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        I2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", EventKeys.VALUE_KEY}, sb2.toString(), null, null, null, null), new b() { // from class: o9.z
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.g2(hashMap, (Cursor) obj);
            }
        });
        return hashMap;
    }

    @Override // o9.InterfaceC5842d
    public long C0(g9.o oVar) {
        return ((Long) I2(r2().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{oVar.b(), String.valueOf(AbstractC6212a.a(oVar.d()))}), new b() { // from class: o9.H
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.l2((Cursor) obj);
            }
        })).longValue();
    }

    public final void D2(C5102a.C0779a c0779a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0779a.a(j9.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] E2(long j10) {
        return (byte[]) I2(r2().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new b() { // from class: o9.B
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.T1((Cursor) obj);
            }
        });
    }

    @Override // o9.InterfaceC5842d
    public void F0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + H2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            x2(new b() { // from class: o9.K
                @Override // o9.M.b
                public final Object apply(Object obj) {
                    return M.m1(M.this, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public final Object F2(d dVar, b bVar) {
        long a10 = this.f59501c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f59501c.a() >= this.f59502d.b() + a10) {
                    return bVar.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // o9.InterfaceC5842d
    public Iterable H0(final g9.o oVar) {
        return (Iterable) x2(new b() { // from class: o9.L
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.U(M.this, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // o9.InterfaceC5842d
    public boolean K(final g9.o oVar) {
        return ((Boolean) x2(new b() { // from class: o9.n
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.n1(M.this, oVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // o9.InterfaceC5842d
    public AbstractC5849k L0(final g9.o oVar, final g9.i iVar) {
        AbstractC5213a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", oVar.d(), iVar.j(), oVar.b());
        long longValue = ((Long) x2(new b() { // from class: o9.m
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.b2(M.this, iVar, oVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC5849k.a(longValue, oVar, iVar);
    }

    @Override // o9.InterfaceC5842d
    public Iterable Q() {
        return (Iterable) x2(new b() { // from class: o9.G
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.Y1((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f59499a.close();
    }

    @Override // p9.InterfaceC6058b
    public Object d(InterfaceC6058b.a aVar) {
        SQLiteDatabase r22 = r2();
        o2(r22);
        try {
            Object execute = aVar.execute();
            r22.setTransactionSuccessful();
            return execute;
        } finally {
            r22.endTransaction();
        }
    }

    @Override // o9.InterfaceC5842d
    public int f() {
        final long a10 = this.f59500b.a() - this.f59502d.c();
        return ((Integer) x2(new b() { // from class: o9.I
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.h2(M.this, a10, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // o9.InterfaceC5841c
    public void k() {
        x2(new b() { // from class: o9.p
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.j2(M.this, (SQLiteDatabase) obj);
            }
        });
    }

    public final c.b n2(int i10) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i10 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i10 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i10 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i10 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i10 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i10 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i10 == bVar7.getNumber()) {
            return bVar7;
        }
        AbstractC5213a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return bVar;
    }

    public final void o2(final SQLiteDatabase sQLiteDatabase) {
        F2(new d() { // from class: o9.l
            @Override // o9.M.d
            public final Object a() {
                return M.c2(sQLiteDatabase);
            }
        }, new b() { // from class: o9.w
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.e2((Throwable) obj);
            }
        });
    }

    public final long p2(SQLiteDatabase sQLiteDatabase, g9.o oVar) {
        Long w22 = w2(sQLiteDatabase, oVar);
        if (w22 != null) {
            return w22.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", oVar.b());
        contentValues.put(EventKeys.PRIORITY, Integer.valueOf(AbstractC6212a.a(oVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (oVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(oVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long q2() {
        return t2() * u2();
    }

    @Override // o9.InterfaceC5841c
    public void r(final long j10, final c.b bVar, final String str) {
        x2(new b() { // from class: o9.q
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.f2(str, bVar, j10, (SQLiteDatabase) obj);
            }
        });
    }

    public SQLiteDatabase r2() {
        final U u10 = this.f59499a;
        Objects.requireNonNull(u10);
        return (SQLiteDatabase) F2(new d() { // from class: o9.E
            @Override // o9.M.d
            public final Object a() {
                return U.this.getWritableDatabase();
            }
        }, new b() { // from class: o9.F
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.A0((Throwable) obj);
            }
        });
    }

    public final C5103b s2() {
        return C5103b.b().b(j9.e.c().b(q2()).c(AbstractC5843e.f59537a.f()).a()).a();
    }

    public final long t2() {
        return r2().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long u2() {
        return r2().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final j9.f v2() {
        final long a10 = this.f59500b.a();
        return (j9.f) x2(new b() { // from class: o9.C
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.m2(a10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // o9.InterfaceC5842d
    public void w(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            r2().compileStatement("DELETE FROM events WHERE _id in " + H2(iterable)).execute();
        }
    }

    public final Long w2(SQLiteDatabase sQLiteDatabase, g9.o oVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(oVar.b(), String.valueOf(AbstractC6212a.a(oVar.d()))));
        if (oVar.c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(oVar.c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) I2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: o9.x
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.d2((Cursor) obj);
            }
        });
    }

    public Object x2(b bVar) {
        SQLiteDatabase r22 = r2();
        r22.beginTransaction();
        try {
            Object apply = bVar.apply(r22);
            r22.setTransactionSuccessful();
            return apply;
        } finally {
            r22.endTransaction();
        }
    }

    public final boolean y2() {
        return t2() * u2() >= this.f59502d.f();
    }

    @Override // o9.InterfaceC5842d
    public void z1(final g9.o oVar, final long j10) {
        x2(new b() { // from class: o9.o
            @Override // o9.M.b
            public final Object apply(Object obj) {
                return M.y1(j10, oVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final List z2(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC5849k abstractC5849k = (AbstractC5849k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC5849k.c()))) {
                i.a l10 = abstractC5849k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC5849k.c()))) {
                    l10.c(cVar.f59504a, cVar.f59505b);
                }
                listIterator.set(AbstractC5849k.a(abstractC5849k.c(), abstractC5849k.d(), l10.d()));
            }
        }
        return list;
    }
}
