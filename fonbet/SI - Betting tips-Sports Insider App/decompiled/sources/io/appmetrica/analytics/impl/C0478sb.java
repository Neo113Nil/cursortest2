package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478sb implements Ha, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14623a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f14624b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final String f14625c = "preferences";

    /* renamed from: d, reason: collision with root package name */
    public final C0453rb f14626d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f14627e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0623y6 f14628f;

    public C0478sb(InterfaceC0623y6 interfaceC0623y6) {
        this.f14628f = interfaceC0623y6;
        Locale locale = Locale.US;
        C0453rb c0453rb = new C0453rb(this, androidx.appcompat.widget.c1.i(ThreadFactoryC0655zd.a(), "IAA-DW-"));
        this.f14626d = c0453rb;
        c0453rb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C0478sb c0478sb) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        c0478sb.getClass();
        Cursor cursor = null;
        try {
            sQLiteDatabase = c0478sb.f14628f.a();
            if (sQLiteDatabase != null) {
                try {
                    Cursor query = sQLiteDatabase.query(c0478sb.f14625c, new String[]{"key", "value", "type"}, null, null, null, null, null);
                    while (query.moveToNext()) {
                        try {
                            String string = query.getString(query.getColumnIndexOrThrow("key"));
                            String string2 = query.getString(query.getColumnIndexOrThrow("value"));
                            int i5 = query.getInt(query.getColumnIndexOrThrow("type"));
                            if (!TextUtils.isEmpty(string)) {
                                if (i5 != 1) {
                                    if (i5 == 2) {
                                        str = ParseUtils.parseInt(string2);
                                    } else if (i5 != 3) {
                                        str = string2;
                                        if (i5 != 4) {
                                            if (i5 == 5) {
                                                str = ParseUtils.parseFloat(string2);
                                            }
                                            str = null;
                                        }
                                    } else {
                                        str = ParseUtils.parseLong(string2);
                                    }
                                    if (str == null) {
                                        c0478sb.f14623a.put(string, str);
                                    }
                                } else {
                                    if ("true".equals(string2)) {
                                        str = Boolean.TRUE;
                                    } else {
                                        if ("false".equals(string2)) {
                                            str = Boolean.FALSE;
                                        }
                                        str = null;
                                    }
                                    if (str == null) {
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    cursor = query;
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
            sQLiteDatabase = null;
        }
        lo.a(cursor);
        c0478sb.f14628f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final void b() {
        synchronized (this.f14626d) {
            this.f14626d.notifyAll();
        }
    }

    public final void c() {
        if (this.f14627e) {
            return;
        }
        try {
            this.f14623a.wait();
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f14626d.isRunning()) {
            this.f14626d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean getBoolean(String str, boolean z5) {
        Object b10 = b(str);
        return b10 instanceof Boolean ? ((Boolean) b10).booleanValue() : z5;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final int getInt(String str, int i5) {
        Object b10 = b(str);
        return b10 instanceof Integer ? ((Integer) b10).intValue() : i5;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final long getLong(String str, long j) {
        Object b10 = b(str);
        return b10 instanceof Long ? ((Long) b10).longValue() : j;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final String getString(String str, String str2) {
        Object b10 = b(str);
        return b10 instanceof String ? (String) b10 : str2;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha remove(String str) {
        synchronized (this.f14623a) {
            c();
            this.f14623a.remove(str);
        }
        synchronized (this.f14626d) {
            this.f14624b.put(str, this);
            this.f14626d.notifyAll();
        }
        return this;
    }

    public final Object b(String str) {
        Object obj;
        synchronized (this.f14623a) {
            c();
            obj = this.f14623a.get(str);
        }
        return obj;
    }

    public static void a(C0478sb c0478sb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c0478sb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i5 = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            contentValues.put("key", str);
            if (value == c0478sb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i5] = contentValues;
            i5++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c0478sb.f14628f.a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i10 = 0; i10 < size; i10++) {
                        ContentValues contentValues2 = contentValuesArr[i10];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c0478sb.f14625c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c0478sb.f14625c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c0478sb.f14628f.a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c0478sb.f14628f.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized Ha a(String str, String str2) {
        a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, long j) {
        a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final synchronized Ha a(int i5, String str) {
        a(str, Integer.valueOf(i5));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, boolean z5) {
        a(str, Boolean.valueOf(z5));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Ha a(String str, float f6) {
        a(str, Float.valueOf(f6));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final boolean a(String str) {
        boolean containsKey;
        synchronized (this.f14623a) {
            c();
            containsKey = this.f14623a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.Ha
    public final Set a() {
        HashSet hashSet;
        synchronized (this.f14623a) {
            hashSet = new HashSet(this.f14623a.keySet());
        }
        return hashSet;
    }

    public final void a(String str, Object obj) {
        synchronized (this.f14623a) {
            c();
            this.f14623a.put(str, obj);
        }
        synchronized (this.f14626d) {
            this.f14624b.put(str, obj);
            this.f14626d.notifyAll();
        }
    }
}
