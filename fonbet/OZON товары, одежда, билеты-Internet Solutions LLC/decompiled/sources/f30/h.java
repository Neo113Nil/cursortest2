package f30;

import J4.r;
import J4.s;
import android.content.Context;
import f30.q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.analytic.db.GraylogDatabase;

/* loaded from: classes3.dex */
public final class h implements Jb.e<GraylogDatabase> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62519a;

    public h(Pc.a<Context> aVar) {
        this.f62519a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Context appContext = (Context) ((q.f) this.f62519a).get();
        Intrinsics.checkNotNullParameter(appContext, "context");
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        s.a a11 = r.a(GraylogDatabase.class, "fintech.graylog", appContext);
        a11.e();
        a11.f(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        return (GraylogDatabase) a11.d();
    }
}
