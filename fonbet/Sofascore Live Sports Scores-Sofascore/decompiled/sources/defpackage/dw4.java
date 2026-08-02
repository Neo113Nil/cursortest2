package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class dw4 implements jw4, lqi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dw4(ji3 ji3Var, Iterable iterable, jv0 jv0Var, long j) {
        this.a = 2;
        this.b = ji3Var;
        this.e = iterable;
        this.d = jv0Var;
        this.c = j;
    }

    @Override // defpackage.jw4
    public ScheduledFuture a(t9d t9dVar) {
        int i = this.a;
        Object obj = this.d;
        long j = this.c;
        Object obj2 = this.e;
        iw4 iw4Var = (iw4) this.b;
        switch (i) {
            case 0:
                return iw4Var.b.schedule(new gw4(iw4Var, (Runnable) obj2, t9dVar, 1), j, (TimeUnit) obj);
            default:
                return iw4Var.b.schedule(new hw4(0, iw4Var, (Callable) obj2, t9dVar), j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.lqi
    public Object v() {
        ji3 ji3Var = (ji3) this.b;
        Iterable iterable = (Iterable) this.e;
        jv0 jv0Var = (jv0) this.d;
        mlg mlgVar = (mlg) ji3Var.d;
        mlgVar.getClass();
        if (iterable.iterator().hasNext()) {
            String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(mlg.p(iterable));
            SQLiteDatabase h = mlgVar.h();
            h.beginTransaction();
            try {
                h.compileStatement(concat).execute();
                Cursor rawQuery = h.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        mlgVar.m(rawQuery.getInt(0), qib.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                h.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                h.setTransactionSuccessful();
            } finally {
                h.endTransaction();
            }
        }
        mlgVar.j(new jlg(((wy2) ji3Var.g).getTime() + this.c, jv0Var));
        return null;
    }

    public /* synthetic */ dw4(iw4 iw4Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = iw4Var;
        this.e = obj;
        this.c = j;
        this.d = timeUnit;
    }
}
