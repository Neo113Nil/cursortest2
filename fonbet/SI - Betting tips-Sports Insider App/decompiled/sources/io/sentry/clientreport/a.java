package io.sentry.clientreport;

import android.app.ApplicationExitInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.appcompat.app.v0;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.x;
import e5.i;
import io.sentry.l;
import io.sentry.u3;
import io.sentry.util.m;
import io.sentry.z0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements io.sentry.util.e, u3, o8.d, l5.g, n0.c, g.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16276a;

    public /* synthetic */ a(int i5) {
        this.f16276a = i5;
    }

    public static /* bridge */ /* synthetic */ ApplicationExitInfo d(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    @Override // g.a
    public void a(Object obj) {
        Boolean it = (Boolean) obj;
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // l5.g
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            Cursor cursor = rawQuery;
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                v0 a7 = i.a();
                a7.Y(cursor.getString(1));
                a7.f366d = o5.a.b(cursor.getInt(2));
                String string = cursor.getString(3);
                a7.f365c = string == null ? null : Base64.decode(string, 0);
                arrayList.add(a7.d());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // io.sentry.util.e
    public Object b() {
        switch (this.f16276a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (e eVar : e.values()) {
                    for (l lVar : l.values()) {
                        concurrentHashMap.put(new d(eVar.getReason(), lVar.getCategory()), new AtomicLong(0L));
                    }
                }
                return DesugarCollections.unmodifiableMap(concurrentHashMap);
            default:
                return io.sentry.config.a.n();
        }
    }

    @Override // n0.c
    public boolean c() {
        return false;
    }

    @Override // io.sentry.u3
    public void g(z0 z0Var) {
        z0Var.I(new m(z0Var));
    }

    @Override // o8.d
    public Object h(x xVar) {
        j8.a lambda$getComponents$0;
        switch (this.f16276a) {
            case 8:
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(xVar);
                return lambda$getComponents$0;
            case 28:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6054a.get();
            default:
                return (ScheduledExecutorService) ExecutorsRegistrar.f6056c.get();
        }
    }
}
