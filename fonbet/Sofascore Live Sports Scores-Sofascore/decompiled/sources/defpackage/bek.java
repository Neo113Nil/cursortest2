package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bek implements lqi {
    public final /* synthetic */ int a;
    public final /* synthetic */ mlg b;

    public /* synthetic */ bek(mlg mlgVar, int i) {
        this.a = i;
        this.b = mlgVar;
    }

    @Override // defpackage.lqi
    public final Object v() {
        SQLiteDatabase h;
        int i = this.a;
        mlg mlgVar = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                mlgVar.getClass();
                int i2 = qx2.e;
                g7h g7hVar = new g7h(6, z);
                g7hVar.c = null;
                g7hVar.d = new ArrayList();
                g7hVar.e = null;
                g7hVar.b = "";
                HashMap hashMap = new HashMap();
                h = mlgVar.h();
                h.beginTransaction();
                try {
                    qx2 qx2Var = (qx2) mlg.t(h.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new li3(16, mlgVar, hashMap, g7hVar));
                    h.setTransactionSuccessful();
                    return qx2Var;
                } finally {
                }
            default:
                long time = mlgVar.b.getTime() - mlgVar.d.d;
                h = mlgVar.h();
                h.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(time)};
                    Cursor rawQuery = h.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            mlgVar.m(rawQuery.getInt(0), qib.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = h.delete("events", "timestamp_ms < ?", strArr);
                    h.setTransactionSuccessful();
                    h.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
        }
    }
}
