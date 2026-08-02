package ru.ozon.app.android.tabbar.ui.analytics;

import Sg.a;
import android.view.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalyticsImpl;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/tabbar/ui/analytics/TabBarAnalytics;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Landroid/view/MenuItem;", "tab", "", "position", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "badge", "", "sendAnalytics", "(Lru/ozon/tracker/sendEvent/ActionType;Landroid/view/MenuItem;ILru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "", "getAnalyticText", "(Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)Ljava/lang/String;", "sendClickEvent", "(Landroid/view/MenuItem;ILru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "sendLongTapEvent", "Lru/ozon/tracker/sendEvent/ActionType$Custom;", "longClickActionType", "Lru/ozon/tracker/sendEvent/ActionType$Custom;", "Companion", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TabBarAnalyticsImpl extends BaseAnalyticsModule implements TabBarAnalytics {

    @NotNull
    private final ActionType.Custom longClickActionType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabBarAnalyticsImpl(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.longClickActionType = new ActionType.Custom("longtap");
        analyticsScreenStorage.c();
    }

    private final String getAnalyticText(IndicatorDTO indicatorDTO) {
        if (indicatorDTO.getContent() == null || indicatorDTO.getContent() == IndicatorDTO.IndicatorContent.TEXT) {
            return indicatorDTO.getText();
        }
        return null;
    }

    private final void sendAnalytics(ActionType actionType, MenuItem tab, int position, IndicatorDTO badge) {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TAB_CLICK, new TabBarAnalyticsImpl$sendAnalytics$1(this, new AnalyticsDataLayer.OzonTrackerEvent(actionType, new EventEntity.Obj("ui", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), new EventEntity.Properties(null, null, null, null, null, null, null, null, Integer.valueOf(position + 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, String.valueOf(tab.getTitle()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, badge != null ? getAnalyticText(badge) : null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -262145, 16381, null), new EventEntity.Widget(null, "tabbar", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573, null), null, 16, null)), null, null, 12, null);
    }

    @Override // ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics
    public void sendClickEvent(@NotNull MenuItem tab, int position, IndicatorDTO badge) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        sendAnalytics(ActionType.CLICK.INSTANCE, tab, position, badge);
    }

    @Override // ru.ozon.app.android.tabbar.ui.analytics.TabBarAnalytics
    public void sendLongTapEvent(@NotNull MenuItem tab, int position, IndicatorDTO badge) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        sendAnalytics(this.longClickActionType, tab, position, badge);
    }
}
