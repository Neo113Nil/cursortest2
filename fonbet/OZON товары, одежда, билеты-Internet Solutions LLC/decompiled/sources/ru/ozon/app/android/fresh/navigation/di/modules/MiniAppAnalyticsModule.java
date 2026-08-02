package ru.ozon.app.android.fresh.navigation.di.modules;

import Sg.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.MiniAppAnalytics;
import ru.ozon.app.android.analytics.modules.MiniAppAnalyticsImpl;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/modules/MiniAppAnalyticsModule;", "", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MiniAppAnalyticsModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\b\u0001\u0010\n\u001a\u00060\bj\u0002`\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/modules/MiniAppAnalyticsModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "Lru/ozon/app/android/analytics/modules/MiniAppAnalytics;", "provideMiniAppAnalytics", "(Lru/ozon/app/android/analytics/plugins/PluginsManager;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;LSg/a;)Lru/ozon/app/android/analytics/modules/MiniAppAnalytics;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MiniAppAnalytics provideMiniAppAnalytics(@NotNull PluginsManager pluginsManager, @NotNull AnalyticsDataLayer dataLayer, @NotNull a analyticsScreenStorage) {
            Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
            Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
            Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
            return new MiniAppAnalyticsImpl(pluginsManager, dataLayer, analyticsScreenStorage);
        }

        private Companion() {
        }
    }
}
