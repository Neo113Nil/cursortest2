package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Y6 extends SQLiteOpenHelper implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final String f13211a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicLogger f13212b;

    /* renamed from: c, reason: collision with root package name */
    public final C0239in f13213c;

    public Y6(Context context, String str, C0239in c0239in, PublicLogger publicLogger) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, AbstractC0572w5.f14821b);
        this.f13213c = c0239in;
        this.f13211a = str;
        this.f13212b = publicLogger;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th2) {
            this.f13212b.error(th2, "Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f13211a);
            Qj qj = AbstractC0387oj.f14425a;
            qj.getClass();
            qj.a(new C0412pj("db_read_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th2) {
            this.f13212b.error(th2, "Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f13211a);
            Qj qj = AbstractC0387oj.f14425a;
            qj.getClass();
            qj.a(new C0412pj("db_write_error", th2));
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f13213c.f13980a.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        C0239in c0239in = this.f13213c;
        if (i5 <= i10) {
            c0239in.getClass();
            return;
        }
        try {
            c0239in.f13981b.runScript(sQLiteDatabase);
        } catch (Throwable unused) {
        }
        try {
            c0239in.f13980a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        C0239in c0239in = this.f13213c;
        c0239in.getClass();
        try {
            InterfaceC0265jn interfaceC0265jn = c0239in.f13983d;
            if (interfaceC0265jn == null || interfaceC0265jn.a(sQLiteDatabase)) {
                return;
            }
            try {
                c0239in.f13981b.runScript(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            c0239in.f13980a.runScript(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // android.database.sqlite.SQLiteOpenHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        boolean z5;
        C0239in c0239in = this.f13213c;
        c0239in.getClass();
        if (i10 > i5) {
            for (int i11 = i5 + 1; i11 <= i10; i11++) {
                try {
                    Collection collection = (Collection) c0239in.f13982c.f14468a.get(Integer.valueOf(i11));
                    if (collection != null) {
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            ((DatabaseScript) it.next()).runScript(sQLiteDatabase);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            z5 = false;
            if (!z5 && !(!c0239in.f13983d.a(sQLiteDatabase))) {
                try {
                    c0239in.f13981b.runScript(sQLiteDatabase);
                } catch (Throwable unused2) {
                }
                try {
                    c0239in.f13980a.runScript(sQLiteDatabase);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            return;
        }
        z5 = true;
        if (!(z5 | (c0239in.f13983d.a(sQLiteDatabase) ^ true))) {
        }
    }
}
