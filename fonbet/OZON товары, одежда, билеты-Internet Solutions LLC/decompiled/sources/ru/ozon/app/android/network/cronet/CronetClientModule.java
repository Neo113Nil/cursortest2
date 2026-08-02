package ru.ozon.app.android.network.cronet;

import Ga.a;
import Ib.a;
import Oa.c;
import We.E;
import android.content.Context;
import com.vk.knet.cornet.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.NetworkBaseTimeoutSec;
import ru.ozon.app.android.network.cronet.CronetOkHttpClientProvider;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricListenersManager;
import ru.ozon.app.android.network.cronet.metrics.CronetMetricsKey;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.version.AppVersionService;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetClientModule;", "", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CronetClientModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019JM\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00062\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetClientModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/network/cronet/CronetSettingsProvider;", "cronetSettingsProvider", "Lru/ozon/app/android/network/cronet/CronetSettings;", "provideCronetSettings", "(Lru/ozon/app/android/network/cronet/CronetSettingsProvider;)Lru/ozon/app/android/network/cronet/CronetSettings;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "LWe/E;", "provideSimpleOkHttpClient", "(Lru/ozon/app/android/network/abtool/FeatureService;)LWe/E;", "Lru/ozon/app/android/network/cronet/CronetConfig;", "provideEmptyCronetConfig", "()Lru/ozon/app/android/network/cronet/CronetConfig;", "simpleOkHttpClient", "Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;", "cronetOkHttpClientProvider", "cronetConfig", "provideSimpleCronetOkHttpClient", "(LWe/E;Lru/ozon/app/android/network/cronet/CronetOkHttpClientProvider;Lru/ozon/app/android/network/cronet/CronetConfig;)LWe/E;", "Lcom/vk/knet/cornet/b;", "provideCronetHttpLogger", "()Lcom/vk/knet/cornet/b;", "Landroid/content/Context;", "appContext", "Lru/ozon/app/android/network/cronet/metrics/CronetMetricListenersManager;", "cronetMetricListenersManager", "Lru/ozon/app/android/network/version/AppVersionService;", "appVersionService", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "networkComponentConfig", "cronetSettings", "LIb/a;", "cronetHttpLogger", "Lru/ozon/app/android/network/cronet/CronetClient;", "provideCronetClient", "(Landroid/content/Context;Lru/ozon/app/android/network/cronet/metrics/CronetMetricListenersManager;Lru/ozon/app/android/network/version/AppVersionService;Lru/ozon/app/android/network/di/NetworkComponentConfig;Lru/ozon/app/android/network/cronet/CronetSettings;LIb/a;Lru/ozon/app/android/network/abtool/FeatureService;)Lru/ozon/app/android/network/cronet/CronetClient;", "", "IDLE_CONNECTION_TIMEOUT_SECONDS", "I", "", "CACHE_SIZE_BYTES", "J", "INFINITY_TIMEOUT_DAYS", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CronetClient provideCronetClient(@NotNull Context appContext, @NotNull CronetMetricListenersManager cronetMetricListenersManager, @NotNull AppVersionService appVersionService, @NotNull NetworkComponentConfig networkComponentConfig, @NotNull CronetSettings cronetSettings, @NotNull a<b> cronetHttpLogger, @NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(appContext, "appContext");
            Intrinsics.checkNotNullParameter(cronetMetricListenersManager, "cronetMetricListenersManager");
            Intrinsics.checkNotNullParameter(appVersionService, "appVersionService");
            Intrinsics.checkNotNullParameter(networkComponentConfig, "networkComponentConfig");
            Intrinsics.checkNotNullParameter(cronetSettings, "cronetSettings");
            Intrinsics.checkNotNullParameter(cronetHttpLogger, "cronetHttpLogger");
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            CronetClientModule$Companion$provideCronetClient$1 apply = new CronetClientModule$Companion$provideCronetClient$1(cronetSettings, networkComponentConfig, featureService, cronetMetricListenersManager, appVersionService, cronetHttpLogger, appContext);
            Intrinsics.checkNotNullParameter(appContext, "context");
            Intrinsics.checkNotNullParameter(apply, "apply");
            c.a aVar = new c.a(appContext);
            apply.invoke((CronetClientModule$Companion$provideCronetClient$1) aVar);
            return new CronetClient(a.b.a(aVar.a()));
        }

        @NotNull
        public final b provideCronetHttpLogger() {
            return new b() { // from class: ru.ozon.app.android.network.cronet.CronetClientModule$Companion$provideCronetHttpLogger$1
                @Override // com.vk.knet.cornet.b
                public void debug(b.a type, Object... obj) {
                    Intrinsics.checkNotNullParameter(type, "type");
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    Lm0.a.f17149a.d(type + " " + C7705l.P(obj, ",", null, null, null, 62), new Object[0]);
                }

                @Override // com.vk.knet.cornet.b
                public void error(Object... obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    Lm0.a.f17149a.d(C7705l.P(obj, ",", null, null, null, 62), new Object[0]);
                }

                @Override // com.vk.knet.cornet.b
                public void info(Object... obj) {
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    Lm0.a.f17149a.d(C7705l.P(obj, ",", null, null, null, 62), new Object[0]);
                }
            };
        }

        @NotNull
        public final CronetSettings provideCronetSettings(@NotNull CronetSettingsProvider cronetSettingsProvider) {
            Intrinsics.checkNotNullParameter(cronetSettingsProvider, "cronetSettingsProvider");
            return cronetSettingsProvider.provide();
        }

        @NotNull
        public final CronetConfig provideEmptyCronetConfig() {
            return new CronetConfig(CronetClientModule$Companion$provideEmptyCronetConfig$1.INSTANCE, new CronetMetricsKey() { // from class: ru.ozon.app.android.network.cronet.CronetClientModule$Companion$provideEmptyCronetConfig$2
            });
        }

        @NotNull
        public final E provideSimpleCronetOkHttpClient(@NotNull E simpleOkHttpClient, @NotNull CronetOkHttpClientProvider cronetOkHttpClientProvider, @NotNull CronetConfig cronetConfig) {
            Intrinsics.checkNotNullParameter(simpleOkHttpClient, "simpleOkHttpClient");
            Intrinsics.checkNotNullParameter(cronetOkHttpClientProvider, "cronetOkHttpClientProvider");
            Intrinsics.checkNotNullParameter(cronetConfig, "cronetConfig");
            return CronetOkHttpClientProvider.DefaultImpls.provide$default(cronetOkHttpClientProvider, simpleOkHttpClient, cronetConfig, null, null, null, null, null, null, 252, null);
        }

        @NotNull
        public final E provideSimpleOkHttpClient(@NotNull FeatureService featureService) {
            Intrinsics.checkNotNullParameter(featureService, "featureService");
            long longKey = featureService.getLongKey(NetworkBaseTimeoutSec.INSTANCE);
            E.a aVar = new E.a();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            aVar.f(0L, timeUnit);
            aVar.X(0L, timeUnit);
            aVar.b0(0L, timeUnit);
            aVar.d(longKey, timeUnit);
            aVar.l(false);
            return new E(aVar);
        }

        private Companion() {
        }
    }
}
