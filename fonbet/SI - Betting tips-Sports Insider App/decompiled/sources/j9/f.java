package j9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements w7.a, m5.b, l5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18311c;

    public /* synthetic */ f(long j, Object obj, Object obj2) {
        this.f18310b = obj;
        this.f18311c = obj2;
        this.f18309a = j;
    }

    @Override // l5.g
    public Object apply(Object obj) {
        String str = (String) this.f18310b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i5 = ((h5.c) this.f18311c).f10375a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i5)});
        try {
            boolean z5 = rawQuery.getCount() > 0;
            rawQuery.close();
            long j = this.f18309a;
            if (z5) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i5)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i5));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            rawQuery.close();
            throw th2;
        }
    }

    @Override // w7.a
    public Object f(Task task) {
        return ((h) this.f18310b).b(task, this.f18309a, (HashMap) this.f18311c);
    }

    @Override // m5.b
    public Object i() {
        k5.h hVar = (k5.h) this.f18310b;
        e5.i iVar = (e5.i) this.f18311c;
        l5.d dVar = hVar.f18835c;
        long time = hVar.f18839g.getTime() + this.f18309a;
        l5.i iVar2 = (l5.i) dVar;
        iVar2.getClass();
        iVar2.n(new io.sentry.instrumentation.file.c(time, iVar));
        return null;
    }

    public /* synthetic */ f(h hVar, long j, HashMap hashMap) {
        this.f18310b = hVar;
        this.f18309a = j;
        this.f18311c = hashMap;
    }
}
