package ru.ozon.app.android.domain.tiles.failedExternalLinkRetry.analytics;

import Sg.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.Event;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.modules.BaseAnalyticsModule;
import ru.ozon.app.android.analytics.plugins.PluginsManager;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.model.TrinityEventEntityKt;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/domain/tiles/failedExternalLinkRetry/analytics/FailedExternalLinkRetryAnalytics;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/tracker/sendEvent/ActionType;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", SelectionItemFormDTO.TITLE_FIELD_NAME, ImagesContract.URL, "", "sendAnalytics", "(Lru/ozon/tracker/sendEvent/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "sendClickEvent", "(Ljava/lang/String;Ljava/lang/String;)V", "sendViewEvent", "(Ljava/lang/String;)V", "Companion", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FailedExternalLinkRetryAnalytics extends BaseAnalyticsModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedExternalLinkRetryAnalytics(@NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        analyticsScreenStorage.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void sendAnalytics(ActionType actionType, String title, String url) {
        String str = null;
        Long l11 = null;
        String str2 = null;
        Long l12 = null;
        Long l13 = null;
        Long l14 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        EventEntity.Obj obj = new EventEntity.Obj("ui", null, null, str, null, null, null, null, l11, null, null, null, null, null, null, null, str2, null, null, l12, null, null, l13, null, l14, null, null, str3, null, str4, str5, 2147483646, null);
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Map map = null;
        BaseAnalyticsModule.sendEventAsync$default(this, Event.TRACKER_V2_EVENT, new FailedExternalLinkRetryAnalytics$sendAnalytics$1(this, new AnalyticsDataLayer.OzonTrackerEvent(actionType, obj, new EventEntity.Properties(objArr2, objArr3, str, objArr4, objArr5, objArr6, objArr7, l11, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, objArr14, str2, objArr15, objArr16, l12, objArr17, objArr18, l13, objArr19, l14, objArr20, objArr21, str3, objArr22, str4, str5, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, title, null, null, null, null, null, null, null, null, null, null, null, null, url, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2147221503, 16383, null), new EventEntity.Widget(objArr23, "communication.inAppPushWidget", 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l11, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, l12, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1048573, 0 == true ? 1 : 0), map, 16, 0 == true ? 1 : 0)), null, null, 12, null);
    }

    static /* synthetic */ void sendAnalytics$default(FailedExternalLinkRetryAnalytics failedExternalLinkRetryAnalytics, ActionType actionType, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        failedExternalLinkRetryAnalytics.sendAnalytics(actionType, str, str2);
    }

    public final void sendClickEvent(@NotNull String title, @NotNull String url) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(url, "url");
        sendAnalytics(ActionType.CLICK.INSTANCE, title, url);
    }

    public final void sendViewEvent(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        sendAnalytics$default(this, ActionType.VIEW.INSTANCE, title, null, 4, null);
    }
}
