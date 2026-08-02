package f30;

import i30.C7004a;
import i30.C7005b;
import kotlin.jvm.internal.Intrinsics;
import m90.C8110a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;

/* loaded from: classes3.dex */
public final class b implements Y30.a<Y20.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AnalyticsConfig f62504a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7004a f62505b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8110a f62506c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C7005b f62507d;

    public b(@NotNull AnalyticsConfig analyticsConfig, @NotNull C7004a graylogConfig, @NotNull C8110a ozonTrackerPluginInterctor, @NotNull C7005b mobileHealthConfig) {
        Intrinsics.checkNotNullParameter(analyticsConfig, "analyticsConfig");
        Intrinsics.checkNotNullParameter(graylogConfig, "graylogConfig");
        Intrinsics.checkNotNullParameter(ozonTrackerPluginInterctor, "ozonTrackerPluginInterctor");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        this.f62504a = analyticsConfig;
        this.f62505b = graylogConfig;
        this.f62506c = ozonTrackerPluginInterctor;
        this.f62507d = mobileHealthConfig;
    }

    @Override // Y30.a
    public final Y20.a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        Z80.a aVar = (Z80.a) componentStorage.a(Z80.a.class);
        Z20.a aVar2 = (Z20.a) componentStorage.a(Z20.a.class);
        AnalyticsConfig analyticsConfig = this.f62504a;
        analyticsConfig.getClass();
        C7004a c7004a = this.f62505b;
        c7004a.getClass();
        C7005b c7005b = this.f62507d;
        c7005b.getClass();
        C8110a c8110a = this.f62506c;
        c8110a.getClass();
        return new q(bVar, analyticsConfig, aVar, c7004a, c8110a, c7005b, aVar2);
    }
}
