package u2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import gf.k;
import gf.l;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import pd.v;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements t2.a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f24017b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f24018c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Object f24019d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f24020e;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f24021a;

    static {
        l lVar = l.f10027a;
        f24019d = k.a(lVar, new v(18));
        f24020e = k.a(lVar, new v(19));
    }

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f24021a = delegate;
    }

    @Override // t2.a
    public final boolean D() {
        return this.f24021a.enableWriteAheadLogging();
    }

    @Override // t2.a
    public final void F(Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f24021a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    @Override // t2.a
    public final void G() {
        this.f24021a.setTransactionSuccessful();
    }

    @Override // t2.a
    public final void I() {
        this.f24021a.beginTransactionNonExclusive();
    }

    @Override // t2.a
    public final void S() {
        this.f24021a.endTransaction();
    }

    @Override // t2.a
    public final Cursor Z(r7.a query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final a aVar = new a(query);
        Cursor rawQueryWithFactory = this.f24021a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: u2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                r7.a aVar2 = a.this.f24015a;
                SQLiteCursorDriver sQLiteCursorDriver2 = sQLiteCursorDriver;
                Intrinsics.checkNotNull(sQLiteQuery);
                i statement = new i(sQLiteQuery);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(statement, "statement");
                v2.e eVar = (v2.e) aVar2.f22318b;
                int length = eVar.f24400d.length;
                for (int i5 = 1; i5 < length; i5++) {
                    int i10 = eVar.f24400d[i5];
                    if (i10 == 1) {
                        statement.f(i5, eVar.f24401e[i5]);
                    } else if (i10 == 2) {
                        statement.v(i5, eVar.f24402f[i5]);
                    } else if (i10 == 3) {
                        String str2 = eVar.f24403g[i5];
                        Intrinsics.checkNotNull(str2);
                        statement.q(i5, str2);
                    } else if (i10 == 4) {
                        byte[] bArr = eVar.f24404h[i5];
                        Intrinsics.checkNotNull(bArr);
                        statement.g(i5, bArr);
                    } else if (i10 == 5) {
                        statement.h(i5);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver2, str, sQLiteQuery);
            }
        }, ((v2.e) query.f22318b).f24407b, f24018c, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "rawQueryWithFactory(...)");
        return rawQueryWithFactory;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24021a.close();
    }

    @Override // t2.a
    public final boolean g0() {
        return this.f24021a.isWriteAheadLoggingEnabled();
    }

    @Override // t2.a
    public final boolean isOpen() {
        return this.f24021a.isOpen();
    }

    @Override // t2.a
    public final boolean j() {
        return this.f24021a.inTransaction();
    }

    @Override // t2.a
    public final void m() {
        this.f24021a.beginTransaction();
    }

    @Override // t2.a
    public final void o() {
        this.f24021a.disableWriteAheadLogging();
    }

    @Override // t2.a
    public final void p(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f24021a.execSQL(sql);
    }

    @Override // t2.a
    public final int p0(ContentValues values, Object[] objArr) {
        Intrinsics.checkNotNullParameter("WorkSpec", "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f24017b[3]);
        sb2.append("WorkSpec SET ");
        int i5 = 0;
        int i10 = 0;
        for (String str : values.keySet()) {
            sb2.append(i10 > 0 ? StringUtils.COMMA : "");
            sb2.append(str);
            objArr2[i10] = values.get(str);
            sb2.append("=?");
            i10++;
        }
        for (int i11 = size; i11 < length; i11++) {
            objArr2[i11] = objArr[i11 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        t2.e statement = s(sb2.toString());
        Intrinsics.checkNotNullParameter(statement, "statement");
        while (i5 < length) {
            Object obj = objArr2[i5];
            i5++;
            if (obj == null) {
                ((i) statement).h(i5);
            } else if (obj instanceof byte[]) {
                ((i) statement).g(i5, (byte[]) obj);
            } else if (obj instanceof Float) {
                ((i) statement).v(i5, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                ((i) statement).v(i5, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                ((i) statement).f(i5, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ((i) statement).f(i5, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ((i) statement).f(i5, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ((i) statement).f(i5, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ((i) statement).q(i5, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i5 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ((i) statement).f(i5, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((j) statement).f24048b.executeUpdateDelete();
    }

    @Override // t2.a
    public final t2.f s(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f24021a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "compileStatement(...)");
        return new j(compileStatement);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [gf.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [gf.i, java.lang.Object] */
    @Override // t2.a
    public final void x() {
        ?? r22 = f24020e;
        if (((Method) r22.getValue()) != null) {
            ?? r32 = f24019d;
            if (((Method) r32.getValue()) != null) {
                Method method = (Method) r22.getValue();
                Intrinsics.checkNotNull(method);
                Method method2 = (Method) r32.getValue();
                Intrinsics.checkNotNull(method2);
                Object invoke = method2.invoke(this.f24021a, null);
                if (invoke == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                method.invoke(invoke, 0, null, 0, null);
                return;
            }
        }
        m();
    }
}
