package defpackage;

import android.database.Cursor;
import com.blaze.blazesdk.analytics.AnalyticsTrackLocal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w implements Callable {
    public final /* synthetic */ r6g a;
    public final /* synthetic */ jx0 b;

    public w(jx0 jx0Var, r6g r6gVar) {
        this.b = jx0Var;
        this.a = r6gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        k6g k6gVar = this.b.a;
        r6g r6gVar = this.a;
        Cursor V = gz8.V(k6gVar, r6gVar);
        try {
            int F = xw3.F(V, "id");
            int F2 = xw3.F(V, "request");
            int F3 = xw3.F(V, "response");
            int F4 = xw3.F(V, "type");
            ArrayList arrayList = new ArrayList(V.getCount());
            while (V.moveToNext()) {
                arrayList.add(new AnalyticsTrackLocal(V.getLong(F), V.isNull(F2) ? null : V.getString(F2), V.isNull(F3) ? null : V.getString(F3), V.isNull(F4) ? null : V.getString(F4)));
            }
            return arrayList;
        } finally {
            V.close();
            r6gVar.release();
        }
    }
}
