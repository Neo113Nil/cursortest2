package ru.ozon.app.android.action.analytics;

import Sc.InterfaceC4008j;
import Sc.k;
import Sg.a;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR!\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lru/ozon/app/android/action/analytics/ActionUsageAnalytics;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "behavior", "convertBehavior", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsData;", "usageAnalyticsData", "", "shouldTrack$action_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsData;)Z", "shouldTrack", "Lru/ozon/composer/ui/widget/l;", "widgetViewItem", "", "trackActionInvocation$action_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/action/analytics/ActionUsageAnalyticsData;Lru/ozon/composer/ui/widget/l;)V", "trackActionInvocation", "Lru/ozon/app/android/network/abtool/FeatureService;", "", "targetBehaviors$delegate", "LSc/j;", "getTargetBehaviors", "()Ljava/util/Set;", "targetBehaviors", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionUsageAnalytics extends BaseAnalyticsModule {

    @NotNull
    private final FeatureService featureService;

    /* renamed from: targetBehaviors$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j targetBehaviors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionUsageAnalytics(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage, @NotNull FeatureService featureService) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.featureService = featureService;
        this.targetBehaviors = k.b(new ActionUsageAnalytics$targetBehaviors$2(this));
        analyticsScreenStorage.c();
    }

    private final String convertBehavior(String behavior) {
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = behavior.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return h.X(lowerCase, "behavior_type_", "", false);
    }

    private final Set<String> getTargetBehaviors() {
        return (Set) this.targetBehaviors.getValue();
    }

    public final boolean shouldTrack$action_prodGoogleAllVendorsRelease(@NotNull ActionUsageAnalyticsData usageAnalyticsData) {
        String str;
        Intrinsics.checkNotNullParameter(usageAnalyticsData, "usageAnalyticsData");
        String actionBehavior = usageAnalyticsData.getActionBehavior();
        if (actionBehavior == null || (str = convertBehavior(actionBehavior)) == null) {
            str = "empty_behavior";
        }
        return getTargetBehaviors().contains(str);
    }

    public final void trackActionInvocation$action_prodGoogleAllVendorsRelease(@NotNull ActionUsageAnalyticsData usageAnalyticsData, l widgetViewItem) {
        Intrinsics.checkNotNullParameter(usageAnalyticsData, "usageAnalyticsData");
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, new ActionUsageAnalytics$trackActionInvocation$1(this, widgetViewItem, usageAnalyticsData), null, null, 12, null);
    }
}
