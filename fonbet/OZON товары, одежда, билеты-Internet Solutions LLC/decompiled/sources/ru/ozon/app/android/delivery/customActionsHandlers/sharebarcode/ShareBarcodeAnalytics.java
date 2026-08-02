package ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode;

import Sg.a;
import Sg.b;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001a\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/tracker/model/EventEntity$Widget;", "widget", "", "objectType", "propertiesTitle", "", "sendEvent", "(Lru/ozon/tracker/sendEvent/ActionType;Lru/ozon/tracker/model/EventEntity$Widget;Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/fragment/app/m;", "fragment", "init", "(Landroidx/fragment/app/m;)V", "shareButtonView", "(Ljava/lang/String;Ljava/lang/String;)V", "shareButtonClick", "widgetShareButtonView", "(Ljava/lang/String;)V", "widgetShareButtonClick", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareBarcodeAnalytics extends BaseAnalyticsModule {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics$Companion;", "", "<init>", "()V", "WIDGET_VERTICAL", "", "WIDGET_COMPONENT", "WIDGET_NAME", "WIDGET_OBJECT_TYPE", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareBarcodeAnalytics(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
    }

    private final void sendEvent(ActionType actionType, EventEntity.Widget widget, String objectType, String propertiesTitle) {
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, new ShareBarcodeAnalytics$sendEvent$1(this, new AnalyticsDataLayer.OzonTrackerEvent(actionType, new EventEntity.Obj(objectType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, propertiesTitle, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -262145, 16383, null), widget, null, 16, null)), null, null, 12, null);
    }

    static /* synthetic */ void sendEvent$default(ShareBarcodeAnalytics shareBarcodeAnalytics, ActionType actionType, EventEntity.Widget widget, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            widget = null;
        }
        shareBarcodeAnalytics.sendEvent(actionType, widget, str, str2);
    }

    public final void init(@NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        b.a(getAnalyticsScreenStorage(), fragment);
        getAnalyticsScreenStorage().c();
    }

    public final void shareButtonClick(String objectType, String propertiesTitle) {
        sendEvent$default(this, ActionType.CLICK.INSTANCE, null, objectType, propertiesTitle, 2, null);
    }

    public final void shareButtonView(String objectType, String propertiesTitle) {
        sendEvent$default(this, ActionType.VIEW.INSTANCE, null, objectType, propertiesTitle, 2, null);
    }

    public final void widgetShareButtonClick(String propertiesTitle) {
        sendEvent(ActionType.CLICK.INSTANCE, new EventEntity.Widget(null, "csma.commonBarcode", "csma", "commonBarcode", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048561, null), "barcode_share", propertiesTitle);
    }

    public final void widgetShareButtonView(String propertiesTitle) {
        sendEvent(ActionType.VIEW.INSTANCE, new EventEntity.Widget(null, "csma.commonBarcode", "csma", "commonBarcode", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048561, null), "barcode_share", propertiesTitle);
    }
}
