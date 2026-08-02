package f30;

import J4.r;
import J4.s;
import android.content.Context;
import f30.q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.analytic.db.MobileHealthDatabase;

/* loaded from: classes3.dex */
public final class l implements Jb.e<MobileHealthDatabase> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62529a;

    public l(Pc.a<Context> aVar) {
        this.f62529a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context appContext = (Context) ((q.f) this.f62529a).get();
        Intrinsics.checkNotNullParameter(appContext, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        s.a a11 = r.a(MobileHealthDatabase.class, "fintech.mobile_health", appContext);
        a11.e();
        return (MobileHealthDatabase) a11.d();
    }
}
