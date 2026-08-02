package F2;

import E2.h;
import F2.d;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class d implements E2.h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f3499h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3500a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3501b;

    /* renamed from: c, reason: collision with root package name */
    public final h.a f3502c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3503d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3504e;

    /* renamed from: f, reason: collision with root package name */
    public final Lazy f3505f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3506g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public F2.c f3507a;

        public b(F2.c cVar) {
            this.f3507a = cVar;
        }

        public final F2.c a() {
            return this.f3507a;
        }

        public final void b(F2.c cVar) {
            this.f3507a = cVar;
        }
    }

    public static final class c extends SQLiteOpenHelper {

        /* renamed from: h, reason: collision with root package name */
        public static final C0076c f3508h = new C0076c(null);

        /* renamed from: a, reason: collision with root package name */
        public final Context f3509a;

        /* renamed from: b, reason: collision with root package name */
        public final b f3510b;

        /* renamed from: c, reason: collision with root package name */
        public final h.a f3511c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f3512d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f3513e;

        /* renamed from: f, reason: collision with root package name */
        public final G2.a f3514f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f3515g;

        public static final class a extends RuntimeException {

            /* renamed from: a, reason: collision with root package name */
            public final b f3516a;

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f3517b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f3516a = callbackName;
                this.f3517b = cause;
            }

            public final b a() {
                return this.f3516a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f3517b;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* renamed from: F2.d$c$c, reason: collision with other inner class name */
        public static final class C0076c {
            public /* synthetic */ C0076c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final F2.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                F2.c a10 = refHolder.a();
                if (a10 != null && a10.r(sqLiteDatabase)) {
                    return a10;
                }
                F2.c cVar = new F2.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }

            public C0076c() {
            }
        }

        /* renamed from: F2.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0077d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, final b dbRef, final h.a callback, boolean z10) {
            super(context, str, null, callback.f2948a, new DatabaseErrorHandler() { // from class: F2.e
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    d.c.k(h.a.this, dbRef, sQLiteDatabase);
                }
            });
            String str2;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f3509a = context;
            this.f3510b = dbRef;
            this.f3511c = callback;
            this.f3512d = z10;
            if (str == null) {
                str2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(str2, "randomUUID().toString()");
            } else {
                str2 = str;
            }
            this.f3514f = new G2.a(str2, context.getCacheDir(), false);
        }

        public static final void k(h.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0076c c0076c = f3508h;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0076c.a(dbRef, dbObj));
        }

        public final F2.c B(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f3508h.a(this.f3510b, sqLiteDatabase);
        }

        public final SQLiteDatabase J(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase U(boolean z10) {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f3515g;
            if (databaseName != null && !z11 && (parentFile = this.f3509a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return J(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return J(z10);
                } catch (Throwable th2) {
                    super.close();
                    if (th2 instanceof a) {
                        a aVar = th2;
                        Throwable cause = aVar.getCause();
                        int i10 = C0077d.$EnumSwitchMapping$0[aVar.a().ordinal()];
                        if (i10 == 1) {
                            throw cause;
                        }
                        if (i10 == 2) {
                            throw cause;
                        }
                        if (i10 == 3) {
                            throw cause;
                        }
                        if (i10 == 4) {
                            throw cause;
                        }
                        if (!(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else {
                        if (!(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                        if (databaseName == null || !this.f3512d) {
                            throw th2;
                        }
                    }
                    this.f3509a.deleteDatabase(databaseName);
                    try {
                        return J(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                G2.a.c(this.f3514f, false, 1, null);
                super.close();
                this.f3510b.b(null);
                this.f3515g = false;
            } finally {
                this.f3514f.d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f3513e && this.f3511c.f2948a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f3511c.b(B(db2));
            } catch (Throwable th2) {
                throw new a(b.ON_CONFIGURE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f3511c.d(B(sqLiteDatabase));
            } catch (Throwable th2) {
                throw new a(b.ON_CREATE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f3513e = true;
            try {
                this.f3511c.e(B(db2), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_DOWNGRADE, th2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f3513e) {
                try {
                    this.f3511c.f(B(db2));
                } catch (Throwable th2) {
                    throw new a(b.ON_OPEN, th2);
                }
            }
            this.f3515g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f3513e = true;
            try {
                this.f3511c.g(B(sqLiteDatabase), i10, i11);
            } catch (Throwable th2) {
                throw new a(b.ON_UPGRADE, th2);
            }
        }

        public final E2.g r(boolean z10) {
            E2.g B10;
            try {
                this.f3514f.b((this.f3515g || getDatabaseName() == null) ? false : true);
                this.f3513e = false;
                SQLiteDatabase U10 = U(z10);
                if (this.f3513e) {
                    close();
                    B10 = r(z10);
                } else {
                    B10 = B(U10);
                }
                this.f3514f.d();
                return B10;
            } catch (Throwable th2) {
                this.f3514f.d();
                throw th2;
            }
        }
    }

    /* renamed from: F2.d$d, reason: collision with other inner class name */
    public static final class C0078d extends Lambda implements Function0 {
        public C0078d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f3501b == null || !d.this.f3503d) {
                cVar = new c(d.this.f3500a, d.this.f3501b, new b(null), d.this.f3502c, d.this.f3504e);
            } else {
                cVar = new c(d.this.f3500a, new File(E2.d.a(d.this.f3500a), d.this.f3501b).getAbsolutePath(), new b(null), d.this.f3502c, d.this.f3504e);
            }
            E2.b.f(cVar, d.this.f3506g);
            return cVar;
        }
    }

    public d(Context context, String str, h.a callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f3500a = context;
        this.f3501b = str;
        this.f3502c = callback;
        this.f3503d = z10;
        this.f3504e = z11;
        this.f3505f = LazyKt.lazy(new C0078d());
    }

    @Override // E2.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3505f.isInitialized()) {
            w0().close();
        }
    }

    @Override // E2.h
    public String getDatabaseName() {
        return this.f3501b;
    }

    @Override // E2.h
    public E2.g getWritableDatabase() {
        return w0().r(true);
    }

    @Override // E2.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f3505f.isInitialized()) {
            E2.b.f(w0(), z10);
        }
        this.f3506g = z10;
    }

    public final c w0() {
        return (c) this.f3505f.getValue();
    }
}
