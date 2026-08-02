package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wr8 extends SQLiteOpenHelper {
    public static final /* synthetic */ int h = 0;
    public final Context a;
    public final t9d b;
    public final ffb c;
    public final boolean d;
    public boolean e;
    public final c8f f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr8(Context context, String str, final t9d t9dVar, final ffb ffbVar, boolean z) {
        super(context, str, null, ffbVar.b, new DatabaseErrorHandler() { // from class: tr8
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = wr8.h;
                sQLiteDatabase.getClass();
                rr8 k0 = fcp.k0(t9dVar, sQLiteDatabase);
                ffb.this.getClass();
                Objects.toString(k0);
                SQLiteDatabase sQLiteDatabase2 = k0.a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        ffb.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (list != null) {
                            Iterator<T> it = list.iterator();
                            while (it.hasNext()) {
                                Object obj = ((Pair) it.next()).second;
                                obj.getClass();
                                ffb.e((String) obj);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                ffb.e(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    k0.close();
                } catch (IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            }
        });
        context.getClass();
        ffbVar.getClass();
        this.a = context;
        this.b = t9dVar;
        this.c = ffbVar;
        this.d = z;
        this.f = new c8f(context.getCacheDir(), str == null ? fc6.C() : str, false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        c8f c8fVar = this.f;
        try {
            c8fVar.a(c8fVar.a);
            super.close();
            this.b.a = null;
            this.g = false;
        } finally {
            c8fVar.b();
        }
    }

    public final dni e(boolean z) {
        c8f c8fVar = this.f;
        try {
            c8fVar.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase f = f(z);
            if (!this.e) {
                rr8 k0 = fcp.k0(this.b, f);
                c8fVar.b();
                return k0;
            }
            close();
            dni e = e(z);
            c8fVar.b();
            return e;
        } catch (Throwable th) {
            c8fVar.b();
            throw th;
        }
    }

    public final SQLiteDatabase f(boolean z) {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof ur8) {
                    ur8 ur8Var = (ur8) th;
                    int ordinal = ur8Var.a.ordinal();
                    th = ur8Var.b;
                    if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                        throw th;
                    }
                    if (ordinal != 4) {
                        zzl.b();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (ur8 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.e;
        ffb ffbVar = this.c;
        if (!z && ffbVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            ffbVar.q(fcp.k0(this.b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new ur8(vr8.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            this.c.r(fcp.k0(this.b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new ur8(vr8.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.s(fcp.k0(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ur8(vr8.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                this.c.t(fcp.k0(this.b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new ur8(vr8.e, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.v(fcp.k0(this.b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ur8(vr8.c, th);
        }
    }
}
