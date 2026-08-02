package u2;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import com.android.billingclient.api.l0;
import f3.x;
import gf.m;
import io.sentry.android.core.w0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k2.r;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f24032h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f24033a;

    /* renamed from: b, reason: collision with root package name */
    public final r7.a f24034b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f24035c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24036d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24037e;

    /* renamed from: f, reason: collision with root package name */
    public final w2.a f24038f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24039g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final r7.a dbRef, final l0 callback, boolean z5) {
        super(context, str, null, callback.f4044b, new DatabaseErrorHandler() { // from class: u2.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i5 = g.f24032h;
                Intrinsics.checkNotNull(sQLiteDatabase);
                c db2 = x.f0(dbRef, sQLiteDatabase);
                l0.this.getClass();
                Intrinsics.checkNotNullParameter(db2, "db");
                w0.d("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
                SQLiteDatabase sQLiteDatabase2 = db2.f24021a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        l0.c(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db2.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object second = ((Pair) it.next()).second;
                            Intrinsics.checkNotNullExpressionValue(second, "second");
                            l0.c((String) second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            l0.c(path2);
                        }
                    }
                }
            }
        });
        String str2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dbRef, "dbRef");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f24033a = context;
        this.f24034b = dbRef;
        this.f24035c = callback;
        this.f24036d = z5;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str2, "toString(...)");
        } else {
            str2 = str;
        }
        this.f24038f = new w2.a(str2, context.getCacheDir(), false);
    }

    public final t2.a c(boolean z5) {
        w2.a aVar = this.f24038f;
        try {
            aVar.a((this.f24039g || getDatabaseName() == null) ? false : true);
            this.f24037e = false;
            SQLiteDatabase n9 = n(z5);
            if (!this.f24037e) {
                c k6 = k(n9);
                aVar.b();
                return k6;
            }
            close();
            t2.a c2 = c(z5);
            aVar.b();
            return c2;
        } catch (Throwable th2) {
            aVar.b();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        w2.a aVar = this.f24038f;
        try {
            aVar.a(aVar.f24954a);
            super.close();
            this.f24034b.f22318b = null;
            this.f24039g = false;
        } finally {
            aVar.b();
        }
    }

    public final c k(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return x.f0(this.f24034b, sqLiteDatabase);
    }

    public final SQLiteDatabase n(boolean z5) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z7 = this.f24039g;
        Context context = this.f24033a;
        if (databaseName != null && !z7 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                w0.m("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z5) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.checkNotNull(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            Intrinsics.checkNotNull(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z5) {
                    readableDatabase2 = getWritableDatabase();
                    Intrinsics.checkNotNull(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    Intrinsics.checkNotNull(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int ordinal = eVar.f24024a.ordinal();
                    th = eVar.f24025b;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        throw new m();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f24036d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z5) {
                        readableDatabase = getWritableDatabase();
                        Intrinsics.checkNotNull(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        Intrinsics.checkNotNull(readableDatabase);
                    }
                    return readableDatabase;
                } catch (e e7) {
                    throw e7.f24025b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        boolean z5 = this.f24037e;
        l0 l0Var = this.f24035c;
        if (!z5 && l0Var.f4044b != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            c db3 = k(db2);
            l0Var.getClass();
            Intrinsics.checkNotNullParameter(db3, "db");
        } catch (Throwable th2) {
            throw new e(f.f24026a, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        try {
            l0 l0Var = this.f24035c;
            c db2 = k(sqLiteDatabase);
            l0Var.getClass();
            Intrinsics.checkNotNullParameter(db2, "db");
            ((r) l0Var.f4045c).j(new v2.a(db2));
        } catch (Throwable th2) {
            throw new e(f.f24027b, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i5, int i10) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.f24037e = true;
        try {
            l0 l0Var = this.f24035c;
            c db3 = k(db2);
            l0Var.getClass();
            Intrinsics.checkNotNullParameter(db3, "db");
            l0Var.f(db3, i5, i10);
        } catch (Throwable th2) {
            throw new e(f.f24029d, th2);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        if (!this.f24037e) {
            try {
                l0 l0Var = this.f24035c;
                c db3 = k(db2);
                l0Var.getClass();
                Intrinsics.checkNotNullParameter(db3, "db");
                r rVar = (r) l0Var.f4045c;
                rVar.l(new v2.a(db3));
                rVar.f18754h = db3;
            } catch (Throwable th2) {
                throw new e(f.f24030e, th2);
            }
        }
        this.f24039g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i5, int i10) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        this.f24037e = true;
        try {
            this.f24035c.f(k(sqLiteDatabase), i5, i10);
        } catch (Throwable th2) {
            throw new e(f.f24028c, th2);
        }
    }
}
