package f30;

import android.content.Context;
import com.squareup.moshi.Moshi;
import f30.q;
import g30.InterfaceC6618a;
import h30.C6793a;
import kotlin.jvm.internal.Intrinsics;
import n30.C8438b;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;

/* loaded from: classes3.dex */
public final class p implements Jb.e<InterfaceC6618a> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62550a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C6793a> f62551b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f62552c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<C8438b> f62553d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<S30.a> f62554e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<j30.c> f62555f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<k30.g> f62556g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<Moshi> f62557h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<c30.j> f62558i;

    public p(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8) {
        this.f62550a = aVar;
        this.f62551b = aVar2;
        this.f62552c = fVar;
        this.f62553d = aVar3;
        this.f62554e = aVar4;
        this.f62555f = aVar5;
        this.f62556g = aVar6;
        this.f62557h = aVar7;
        this.f62558i = aVar8;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((q.f) this.f62550a).get();
        C6793a appsFlyer = this.f62551b.get();
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) this.f62552c.get();
        C8438b ozonTrackerPlugin = this.f62553d.get();
        S30.a applicationInfoDataSource = (S30.a) ((q.a) this.f62554e).get();
        j30.c graylogInteractor = this.f62555f.get();
        k30.g mobileHealthInteractor = this.f62556g.get();
        Moshi moshi = this.f62557h.get();
        c30.j networkInfoProvider = (c30.j) ((q.j) this.f62558i).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        Intrinsics.checkNotNullParameter(analyticsConfig, "analyticsConfig");
        Intrinsics.checkNotNullParameter(ozonTrackerPlugin, "ozonTrackerPlugin");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(graylogInteractor, "graylogInteractor");
        Intrinsics.checkNotNullParameter(mobileHealthInteractor, "mobileHealthInteractor");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        return new g30.d(context, appsFlyer, analyticsConfig, ozonTrackerPlugin, applicationInfoDataSource, graylogInteractor, mobileHealthInteractor, networkInfoProvider, moshi);
    }
}
