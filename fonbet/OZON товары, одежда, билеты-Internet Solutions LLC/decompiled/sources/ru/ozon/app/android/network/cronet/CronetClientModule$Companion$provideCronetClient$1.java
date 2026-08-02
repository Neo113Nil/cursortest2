package ru.ozon.app.android.network.cronet;

import Ib.a;
import Oa.c;
import Qa.AbstractC3855a;
import Ra.b;
import Wa.e;
import android.content.Context;
import com.vk.knet.cornet.b;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.CronetMaxConcurrentRequests;
import ru.ozon.app.android.network.auth.flags.CronetMaxConcurrentRequestsPerHost;
import ru.ozon.app.android.network.auth.flags.CronetReleasingThreadsEnabled;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricListenersManager;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.version.AppVersionService;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LOa/c$a;", "", "invoke", "(LOa/c$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CronetClientModule$Companion$provideCronetClient$1 extends AbstractC7737t implements Function1<c.a, Unit> {
    final /* synthetic */ Context $appContext;
    final /* synthetic */ AppVersionService $appVersionService;
    final /* synthetic */ a<b> $cronetHttpLogger;
    final /* synthetic */ CronetMetricListenersManager $cronetMetricListenersManager;
    final /* synthetic */ CronetSettings $cronetSettings;
    final /* synthetic */ FeatureService $featureService;
    final /* synthetic */ NetworkComponentConfig $networkComponentConfig;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LRa/b$a;", "invoke", "(LRa/b$a;)LRa/b$a;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.app.android.network.cronet.CronetClientModule$Companion$provideCronetClient$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<b.a, b.a> {
        final /* synthetic */ Context $appContext;
        final /* synthetic */ AppVersionService $appVersionService;
        final /* synthetic */ a<com.vk.knet.cornet.b> $cronetHttpLogger;
        final /* synthetic */ CronetMetricListenersManager $cronetMetricListenersManager;
        final /* synthetic */ CronetSettings $cronetSettings;
        final /* synthetic */ FeatureService $featureService;
        final /* synthetic */ NetworkComponentConfig $networkComponentConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CronetSettings cronetSettings, NetworkComponentConfig networkComponentConfig, FeatureService featureService, CronetMetricListenersManager cronetMetricListenersManager, AppVersionService appVersionService, a<com.vk.knet.cornet.b> aVar, Context context) {
            super(1);
            this.$cronetSettings = cronetSettings;
            this.$networkComponentConfig = networkComponentConfig;
            this.$featureService = featureService;
            this.$cronetMetricListenersManager = cronetMetricListenersManager;
            this.$appVersionService = appVersionService;
            this.$cronetHttpLogger = aVar;
            this.$appContext = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public final b.a invoke(b.a client) {
            Intrinsics.checkNotNullParameter(client, "$this$client");
            client.f();
            client.g(new Qa.c(this.$cronetSettings.getEnableHints() ? C7714v.a0(new Ja.a(this.$networkComponentConfig.getAppDomain().d())) : K.f71697a, this.$cronetSettings.getDisableTlsZeroRtt(), this.$cronetSettings.getMaxServerConfigs(), 14328));
            client.j(this.$featureService.getBooleanKey(CronetReleasingThreadsEnabled.INSTANCE));
            client.h(this.$featureService.getIntKey(CronetMaxConcurrentRequests.INSTANCE));
            client.i(this.$featureService.getIntKey(CronetMaxConcurrentRequestsPerHost.INSTANCE));
            client.m();
            client.b(this.$cronetMetricListenersManager);
            client.c();
            client.n(this.$appVersionService.getUserAgent());
            if (BuildUtils.INSTANCE.isQaFlavor()) {
                com.vk.knet.cornet.b bVar = this.$cronetHttpLogger.get();
                Intrinsics.checkNotNullExpressionValue(bVar, "get(...)");
                e.c(bVar);
            }
            if (this.$cronetSettings.getCacheConnection()) {
                File cacheDir = this.$appContext.getCacheDir();
                Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
                client.l(new AbstractC3855a.C0457a(cacheDir));
            }
            TimeUnit timeUnit = TimeUnit.DAYS;
            client.e();
            client.o();
            client.k();
            return client;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CronetClientModule$Companion$provideCronetClient$1(CronetSettings cronetSettings, NetworkComponentConfig networkComponentConfig, FeatureService featureService, CronetMetricListenersManager cronetMetricListenersManager, AppVersionService appVersionService, a<com.vk.knet.cornet.b> aVar, Context context) {
        super(1);
        this.$cronetSettings = cronetSettings;
        this.$networkComponentConfig = networkComponentConfig;
        this.$featureService = featureService;
        this.$cronetMetricListenersManager = cronetMetricListenersManager;
        this.$appVersionService = appVersionService;
        this.$cronetHttpLogger = aVar;
        this.$appContext = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(c.a aVar) {
        invoke2(aVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(c.a Build) {
        Intrinsics.checkNotNullParameter(Build, "$this$Build");
        Build.b(new AnonymousClass1(this.$cronetSettings, this.$networkComponentConfig, this.$featureService, this.$cronetMetricListenersManager, this.$appVersionService, this.$cronetHttpLogger, this.$appContext));
    }
}
