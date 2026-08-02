package ru.ozon.app.android.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.AuthAnalytics;
import ru.ozon.app.android.analytics.modules.DataLayerInitializer;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.analytics.plugins.base.AnalyticsPlugin;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/analytics/AnalyticsInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "pluginsManager", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "dataLayerInitializer", "Lru/ozon/app/android/analytics/modules/DataLayerInitializer;", "authAnalytics", "Lru/ozon/app/android/analytics/modules/AuthAnalytics;", "<init>", "(Lru/ozon/app/android/analytics/plugins/PluginsManager;Lru/ozon/app/android/analytics/modules/DataLayerInitializer;Lru/ozon/app/android/analytics/modules/AuthAnalytics;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsInitializer implements ActionInitializer {

    @NotNull
    private final AuthAnalytics authAnalytics;

    @NotNull
    private final DataLayerInitializer dataLayerInitializer;

    @NotNull
    private final PluginsManager pluginsManager;

    public AnalyticsInitializer(@NotNull PluginsManager pluginsManager, @NotNull DataLayerInitializer dataLayerInitializer, @NotNull AuthAnalytics authAnalytics) {
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(dataLayerInitializer, "dataLayerInitializer");
        Intrinsics.checkNotNullParameter(authAnalytics, "authAnalytics");
        this.pluginsManager = pluginsManager;
        this.dataLayerInitializer = dataLayerInitializer;
        this.authAnalytics = authAnalytics;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        this.authAnalytics.startObserveUser();
        AnalyticsPlugin findPlugin = this.pluginsManager.findPlugin(AnalyticsInitializer$init$1.INSTANCE);
        if (findPlugin != null) {
            this.dataLayerInitializer.setAfUid(findPlugin.getId());
        }
    }
}
