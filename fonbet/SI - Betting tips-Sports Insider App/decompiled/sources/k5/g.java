package k5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import e5.i;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements m5.b, p8.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18828a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f18829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f18831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f18832e;

    public /* synthetic */ g(h hVar, Iterable iterable, i iVar, long j) {
        this.f18828a = 0;
        this.f18830c = hVar;
        this.f18831d = iterable;
        this.f18832e = iVar;
        this.f18829b = j;
    }

    @Override // p8.f
    public ScheduledFuture a(i2.d dVar) {
        switch (this.f18828a) {
            case 1:
                p8.e eVar = (p8.e) this.f18830c;
                Runnable runnable = (Runnable) this.f18831d;
                return eVar.f21550b.schedule(new p8.d(eVar, runnable, dVar, 1), this.f18829b, (TimeUnit) this.f18832e);
            default:
                p8.e eVar2 = (p8.e) this.f18830c;
                Callable callable = (Callable) this.f18831d;
                return eVar2.f21550b.schedule(new f3.e(eVar2, callable, dVar, 1), this.f18829b, (TimeUnit) this.f18832e);
        }
    }

    @Override // m5.b
    public Object i() {
        h hVar = (h) this.f18830c;
        Iterable iterable = (Iterable) this.f18831d;
        i iVar = (i) this.f18832e;
        l5.i iVar2 = (l5.i) hVar.f18835c;
        iVar2.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + l5.i.y(iterable);
            SQLiteDatabase c2 = iVar2.c();
            c2.beginTransaction();
            try {
                c2.compileStatement(str).execute();
                Cursor rawQuery = c2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = rawQuery;
                    while (cursor.moveToNext()) {
                        iVar2.t(cursor.getInt(0), h5.c.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    rawQuery.close();
                    c2.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    c2.setTransactionSuccessful();
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            } finally {
                c2.endTransaction();
            }
        }
        iVar2.n(new io.sentry.instrumentation.file.c(hVar.f18839g.getTime() + this.f18829b, iVar));
        return null;
    }

    public /* synthetic */ g(p8.e eVar, Object obj, long j, TimeUnit timeUnit, int i5) {
        this.f18828a = i5;
        this.f18830c = eVar;
        this.f18831d = obj;
        this.f18829b = j;
        this.f18832e = timeUnit;
    }
}
