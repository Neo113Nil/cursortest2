package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class L6 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f12508a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock.WriteLock f12509b;

    /* renamed from: c, reason: collision with root package name */
    public final Y6 f12510c;

    /* renamed from: d, reason: collision with root package name */
    public final K6 f12511d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f12512e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f12513f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f12514g;

    /* renamed from: h, reason: collision with root package name */
    public final X4 f12515h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicLong f12516i;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final H6 f12517k;

    /* renamed from: l, reason: collision with root package name */
    public final C0146f7 f12518l;

    static {
        HashSet hashSet = new HashSet();
        EnumC0047bb enumC0047bb = EnumC0047bb.EVENT_TYPE_UNDEFINED;
        hashSet.add(0);
        hashSet.add(6400);
    }

    public L6(X4 x42, Y6 y62, H6 h62, C0146f7 c0146f7) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f12508a = reentrantReadWriteLock.readLock();
        this.f12509b = reentrantReadWriteLock.writeLock();
        this.f12512e = new Object();
        this.f12513f = new ArrayList(3);
        AtomicLong atomicLong = new AtomicLong();
        this.f12516i = atomicLong;
        this.j = new ArrayList();
        this.f12510c = y62;
        this.f12514g = x42.getContext();
        this.f12515h = x42;
        this.f12517k = h62;
        this.f12518l = c0146f7;
        atomicLong.set(b());
        K6 k6 = new K6(this, x42);
        this.f12511d = k6;
        k6.setName(a(x42));
    }

    public final long a() {
        this.f12508a.lock();
        try {
            return this.f12516i.get();
        } finally {
            this.f12508a.unlock();
        }
    }

    public final long b() {
        long j;
        SQLiteDatabase readableDatabase;
        this.f12508a.lock();
        try {
            readableDatabase = this.f12510c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            j = DBUtils.queryRowsCount(readableDatabase, "events");
            this.f12508a.unlock();
            return j;
        }
        j = 0;
        this.f12508a.unlock();
        return j;
    }

    public final void c() {
        Cursor cursor;
        Cursor cursor2;
        this.f12508a.lock();
        Cursor cursor3 = null;
        try {
            SQLiteDatabase readableDatabase = this.f12510c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor2 = readableDatabase.rawQuery(" SELECT DISTINCT id From sessions order by id asc ", new String[0]);
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("All sessions in db: ");
                    while (cursor2.moveToNext()) {
                        stringBuffer.append(cursor2.getString(0));
                        stringBuffer.append(", ");
                    }
                    cursor3 = readableDatabase.rawQuery(" SELECT DISTINCT session_id From events order by session_id asc ", new String[0]);
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("All sessions in reports db: ");
                    while (cursor3.moveToNext()) {
                        stringBuffer2.append(cursor3.getString(0));
                        stringBuffer2.append(", ");
                    }
                } catch (Throwable unused) {
                    cursor = cursor3;
                    cursor3 = cursor2;
                    cursor2 = cursor3;
                    cursor3 = cursor;
                    this.f12508a.unlock();
                    lo.a(cursor2);
                    lo.a(cursor3);
                }
            } else {
                cursor2 = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        this.f12508a.unlock();
        lo.a(cursor2);
        lo.a(cursor3);
    }

    public final void d() {
        this.f12511d.start();
    }

    public final long a(Set set) {
        this.f12508a.lock();
        Cursor cursor = null;
        long j = 0;
        try {
            SQLiteDatabase readableDatabase = this.f12510c.getReadableDatabase();
            if (readableDatabase != null) {
                StringBuilder sb2 = new StringBuilder("SELECT count() FROM events");
                if (!set.isEmpty()) {
                    sb2.append(" WHERE ");
                }
                Iterator it = set.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    if (i5 > 0) {
                        sb2.append(" OR ");
                    }
                    sb2.append("type == " + num);
                    i5++;
                }
                cursor = readableDatabase.rawQuery(sb2.toString(), null);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
            }
        } catch (Throwable unused) {
        }
        lo.a(cursor);
        this.f12508a.unlock();
        return j;
    }

    public final void a(S8 s8) {
        this.j.add(s8);
    }

    public static String a(Ea ea2) {
        return "DatabaseWorker [" + ea2.b().e() + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j, Vk vk, long j6) {
        JSONObject jSONObject;
        boolean b10;
        C0499t7 c0499t7 = new C0499t7(null, 1, 0 == true ? 1 : 0);
        C0285kh c0285kh = (C0285kh) this.f12515h.f13151k.a();
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j6);
        try {
            jSONObject = new JSONObject().put("dId", c0285kh.getDeviceId()).put("uId", c0285kh.getUuid()).put("appVer", c0285kh.getAppVersion()).put("appBuild", c0285kh.getAppBuildNumber()).put("kitBuildType", c0285kh.getAnalyticsSdkBuildType()).put("osVer", c0285kh.getOsVersion()).put("osApiLev", c0285kh.getOsApiLevel()).put("lang", c0285kh.getLocale()).put("root", c0285kh.getDeviceRootStatus()).put("app_debuggable", ((N5) c0285kh).f12626a).put(CommonUrlParts.APP_FRAMEWORK, c0285kh.getAppFramework()).put("attribution_id", c0285kh.f14137r).put("analyticsSdkVersionName", c0285kh.getAnalyticsSdkVersionName()).put("kitBuildNumber", c0285kh.getAnalyticsSdkBuildNumber());
        } catch (Throwable unused) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        Long valueOf3 = Long.valueOf(In.a());
        Xj xj = Wj.f13112a;
        synchronized (xj) {
            b10 = xj.f13195b.b(true);
        }
        ContentValues fromModel = c0499t7.fromModel(new C0474s7(valueOf, vk, jSONObject2, new C0449r7(valueOf2, valueOf3, Boolean.valueOf(b10))));
        if (fromModel == null) {
            return;
        }
        this.f12509b.lock();
        try {
            SQLiteDatabase writableDatabase = this.f12510c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.insertOrThrow("sessions", null, fromModel);
            }
        } catch (Throwable unused2) {
        }
        this.f12509b.unlock();
    }

    public final void a(ContentValues contentValues) {
        synchronized (this.f12512e) {
            this.f12513f.add(contentValues);
        }
        synchronized (this.f12511d) {
            this.f12511d.notifyAll();
        }
    }

    public final int a(SQLiteDatabase sQLiteDatabase) {
        try {
            return this.f12517k.a(sQLiteDatabase, String.format("id IN (SELECT id FROM events ORDER BY CASE WHEN type IN (%1$s) THEN 2 WHEN type IN (%2$s) THEN 1 ELSE 0 END, id LIMIT (SELECT count() FROM events) / %3$s)", TextUtils.join(", ", AbstractC0576w9.f14833i), TextUtils.join(", ", AbstractC0576w9.j), 10), 2, this.f12515h.f13143b.f12771b, true).f12219b;
        } catch (Throwable th2) {
            Qj qj = AbstractC0387oj.f14425a;
            qj.getClass();
            qj.a(new C0412pj("deleteExcessiveReports exception", th2));
            return 0;
        }
    }

    public final void a(long j, int i5, int i10, boolean z5) {
        if (i10 <= 0) {
            return;
        }
        this.f12509b.lock();
        try {
            String format = String.format(Locale.US, "%1$s = %2$s AND %3$s = %4$s AND %5$s <= (SELECT %5$s FROM %6$s WHERE %1$s = %2$s AND %3$s = %4$s ORDER BY %5$s ASC LIMIT %7$s, 1)", "session_id", Long.toString(j), "session_type", Integer.toString(i5), "id", "events", Integer.toString(i10 - 1));
            SQLiteDatabase writableDatabase = this.f12510c.getWritableDatabase();
            if (writableDatabase != null) {
                F6 a7 = this.f12517k.a(writableDatabase, format, 1, this.f12515h.f13143b.f12771b, z5);
                if (a7.f12218a != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = a7.f12218a.iterator();
                    while (it.hasNext()) {
                        Integer asInteger = ((ContentValues) it.next()).getAsInteger("type");
                        asInteger.intValue();
                        arrayList.add(asInteger);
                    }
                    Iterator it2 = this.j.iterator();
                    while (it2.hasNext()) {
                        ((S8) it2.next()).b(arrayList);
                    }
                }
                List list = a7.f12218a;
                if (list != null) {
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        a((ContentValues) list.get(i11), "Event removed from db");
                    }
                }
                this.f12516i.addAndGet(-a7.f12219b);
            }
        } catch (Throwable unused) {
        }
        this.f12509b.unlock();
    }

    public final ContentValues a(long j, Vk vk) {
        ContentValues contentValues = new ContentValues();
        this.f12508a.lock();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.f12510c.getReadableDatabase();
            if (readableDatabase != null) {
                Locale locale = Locale.US;
                cursor = readableDatabase.rawQuery("SELECT report_request_parameters FROM sessions WHERE id = " + j + " AND type = " + vk.f13072a + " ORDER BY id DESC LIMIT 1", null);
                if (cursor.moveToNext()) {
                    ContentValues contentValues2 = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursor, contentValues2);
                    contentValues = contentValues2;
                }
            }
        } catch (Throwable unused) {
        }
        lo.a(cursor);
        this.f12508a.unlock();
        return contentValues;
    }

    public static String a(LinkedHashMap linkedHashMap) {
        StringBuilder sb2 = new StringBuilder("id >= ?");
        for (String str : linkedHashMap.keySet()) {
            sb2.append(sb2.length() > 0 ? " AND " : "");
            sb2.append(str + " = ? ");
        }
        if (TextUtils.isEmpty(sb2.toString())) {
            return null;
        }
        return sb2.toString();
    }

    public static String[] a(String[] strArr, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(strArr));
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getValue());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ContentValues contentValues, String str) {
        Integer asInteger = contentValues.getAsInteger("type");
        if (AbstractC0576w9.f14828d.contains(EnumC0047bb.a(asInteger != null ? asInteger.intValue() : -1))) {
            C0120e7 model = new C0146f7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
            PublicLogger publicLogger = this.f12515h.f13153m;
            EnumC0047bb enumC0047bb = model.f13645d;
            C0095d7 c0095d7 = model.f13648g;
            publicLogger.info(Qf.a(str, enumC0047bb, c0095d7.f13566b, c0095d7.f13567c), new Object[0]);
        }
    }

    public static boolean a(L6 l6) {
        boolean isEmpty;
        synchronized (l6.f12512e) {
            isEmpty = l6.f12513f.isEmpty();
        }
        return isEmpty;
    }
}
