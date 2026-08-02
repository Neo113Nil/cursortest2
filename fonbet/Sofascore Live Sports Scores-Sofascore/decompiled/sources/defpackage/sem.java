package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sem extends SQLiteOpenHelper {
    public final Context a;
    public final ConcurrentHashMap b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sem(Context context, jwm jwmVar, kem kemVar) {
        super(context, r0.toString(), (SQLiteDatabase.CursorFactory) null, 1);
        StringBuilder r = mz1.r("events_" + kemVar.gm(), "_");
        r.append(c90.H());
        this.a = context;
        this.b = jwmVar.c;
        setWriteAheadLoggingEnabled(kemVar.wh());
    }

    public final void e(SQLiteDatabase sQLiteDatabase) {
        for (lum lumVar : this.b.values()) {
            try {
                sQLiteDatabase.execSQL(lumVar.c.gm());
                String oo = lumVar.c.oo();
                String str = "CREATE INDEX IF NOT EXISTS idx_" + oo + "_data_id ON " + oo + " (data_id);";
                String str2 = "CREATE INDEX IF NOT EXISTS idx_" + oo + "_create_time ON " + oo + " (create_time);";
                sQLiteDatabase.execSQL(str);
                sQLiteDatabase.execSQL(str2);
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_" + oo + "_priority ON " + oo + " (priority);");
            } catch (Exception unused) {
            }
        }
    }

    public final void f(SQLiteDatabase sQLiteDatabase) {
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(String.valueOf(((lum) it.next()).c.oo())));
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        try {
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                sQLiteDatabase.execSQL("PRAGMA synchronous = NORMAL;");
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        e(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            f(sQLiteDatabase);
            e(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i > i2) {
            f(sQLiteDatabase);
        }
        e(sQLiteDatabase);
    }
}
