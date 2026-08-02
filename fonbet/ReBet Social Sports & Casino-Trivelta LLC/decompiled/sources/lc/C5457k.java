package lc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import io.sentry.F3;

/* renamed from: lc.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5457k extends SQLiteOpenHelper {

    /* renamed from: d, reason: collision with root package name */
    public static C5457k f55817d;

    /* renamed from: a, reason: collision with root package name */
    public Context f55818a;

    /* renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f55819b;

    /* renamed from: c, reason: collision with root package name */
    public long f55820c;

    public C5457k(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f55820c = AbstractC5456j.f55816a.longValue() * F3.MAX_EVENT_SIZE_BYTES;
        this.f55818a = context;
    }

    public static C5457k U(Context context) {
        if (f55817d == null) {
            f55817d = new C5457k(context.getApplicationContext());
        }
        return f55817d;
    }

    public synchronized boolean B() {
        SQLiteDatabase sQLiteDatabase = this.f55819b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return true;
        }
        SQLiteException e10 = null;
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 > 0) {
                try {
                    r();
                } catch (SQLiteException e11) {
                    e10 = e11;
                    try {
                        Thread.sleep(30L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            this.f55819b = getWritableDatabase();
        }
        SQLiteDatabase sQLiteDatabase2 = this.f55819b;
        if (sQLiteDatabase2 == null) {
            throw e10;
        }
        sQLiteDatabase2.setMaximumSize(this.f55820c);
        return true;
    }

    public synchronized SQLiteDatabase J() {
        B();
        return this.f55819b;
    }

    public synchronized void d() {
        J().delete("catalystLocalStorage", null, null);
    }

    public synchronized void k() {
        SQLiteDatabase sQLiteDatabase = this.f55819b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f55819b.close();
            this.f55819b = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 != i11) {
            r();
            onCreate(sQLiteDatabase);
        }
    }

    public final synchronized boolean r() {
        k();
        return this.f55818a.deleteDatabase("RKStorage");
    }
}
