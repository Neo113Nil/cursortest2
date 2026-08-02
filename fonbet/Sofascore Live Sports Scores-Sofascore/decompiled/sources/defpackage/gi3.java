package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class gi3 implements Continuation, yu4, klg, lqi {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gi3(Object obj, long j, Object obj2) {
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    @Override // defpackage.klg
    public Object apply(Object obj) {
        String str = (String) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i = ((qib) this.c).a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
        try {
            boolean z = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.a;
            if (z) {
                sQLiteDatabase.execSQL(vxd.m("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.yu4
    public void b(vff vffVar) {
        ((ow3) vffVar.get()).a.a(new gi3((String) this.b, this.a, (ev0) this.c));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((ji3) this.b).d(task, this.a, (HashMap) this.c);
    }

    @Override // defpackage.lqi
    public Object v() {
        ji3 ji3Var = (ji3) this.b;
        jv0 jv0Var = (jv0) this.c;
        mlg mlgVar = (mlg) ji3Var.d;
        long time = ((wy2) ji3Var.g).getTime() + this.a;
        mlgVar.getClass();
        mlgVar.j(new jlg(time, jv0Var));
        return null;
    }

    public /* synthetic */ gi3(Object obj, Object obj2, long j) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }
}
