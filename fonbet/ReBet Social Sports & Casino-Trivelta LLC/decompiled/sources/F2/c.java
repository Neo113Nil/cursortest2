package F2;

import E2.j;
import E2.k;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.text.TextUtils;
import java.util.List;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements E2.g {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f3497a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f3496b = new a(null);

    @NotNull
    private static final String[] CONFLICT_VALUES = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    @NotNull
    private static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function4 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f3498d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar) {
            super(4);
            this.f3498d = jVar;
        }

        @Override // kotlin.jvm.functions.Function4
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor invoke(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f3498d;
            Intrinsics.checkNotNull(sQLiteQuery);
            jVar.k(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3497a = delegate;
    }

    public static final Cursor B(Function4 tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public static final Cursor J(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.checkNotNull(sQLiteQuery);
        query.k(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // E2.g
    public boolean F1() {
        return this.f3497a.inTransaction();
    }

    @Override // E2.g
    public boolean N1() {
        return E2.b.d(this.f3497a);
    }

    @Override // E2.g
    public k R0(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement compileStatement = this.f3497a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(compileStatement, "delegate.compileStatement(sql)");
        return new h(compileStatement);
    }

    @Override // E2.g
    public Cursor S(j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final b bVar = new b(query);
        Cursor rawQueryWithFactory = this.f3497a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: F2.b
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor B10;
                B10 = c.B(Function4.this, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                return B10;
            }
        }, query.d(), EMPTY_STRING_ARRAY, null);
        Intrinsics.checkNotNullExpressionValue(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    @Override // E2.g
    public void a0() {
        this.f3497a.setTransactionSuccessful();
    }

    @Override // E2.g
    public void b0(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f3497a.execSQL(sql, bindArgs);
    }

    @Override // E2.g
    public void c0() {
        this.f3497a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3497a.close();
    }

    @Override // E2.g
    public int i1(String table, int i10, ContentValues values, String str, Object[] objArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = values.size();
        int length = objArr == null ? size : objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder();
        sb2.append("UPDATE ");
        sb2.append(CONFLICT_VALUES[i10]);
        sb2.append(table);
        sb2.append(" SET ");
        int i11 = 0;
        for (String str2 : values.keySet()) {
            sb2.append(i11 > 0 ? "," : "");
            sb2.append(str2);
            objArr2[i11] = values.get(str2);
            sb2.append("=?");
            i11++;
        }
        if (objArr != null) {
            for (int i12 = size; i12 < length; i12++) {
                objArr2[i12] = objArr[i12 - size];
            }
        }
        if (!TextUtils.isEmpty(str)) {
            sb2.append(" WHERE ");
            sb2.append(str);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        k R02 = R0(sb3);
        E2.a.f2940b.b(R02, objArr2);
        return R02.G();
    }

    @Override // E2.g
    public boolean isOpen() {
        return this.f3497a.isOpen();
    }

    @Override // E2.g
    public String l() {
        return this.f3497a.getPath();
    }

    @Override // E2.g
    public void l0() {
        this.f3497a.endTransaction();
    }

    @Override // E2.g
    public Cursor p1(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return S(new E2.a(query));
    }

    public final boolean r(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.areEqual(this.f3497a, sqLiteDatabase);
    }

    @Override // E2.g
    public Cursor t0(final j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f3497a;
        String d10 = query.d();
        String[] strArr = EMPTY_STRING_ARRAY;
        Intrinsics.checkNotNull(cancellationSignal);
        return E2.b.e(sQLiteDatabase, d10, strArr, null, cancellationSignal, new SQLiteDatabase.CursorFactory() { // from class: F2.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase2, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                Cursor J10;
                J10 = c.J(j.this, sQLiteDatabase2, sQLiteCursorDriver, str, sQLiteQuery);
                return J10;
            }
        });
    }

    @Override // E2.g
    public void v() {
        this.f3497a.beginTransaction();
    }

    @Override // E2.g
    public List x() {
        return this.f3497a.getAttachedDbs();
    }

    @Override // E2.g
    public void z(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f3497a.execSQL(sql);
    }
}
