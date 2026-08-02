package ru.ozon.app.android.favorites.data.utils;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.NonViewFilter;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¨\u0006\b"}, d2 = {"sendAnalytic", "", "Lru/ozon/app/android/favorites/data/utils/AnalyticRefs;", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "", "trackingInfoDTO", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AnalyticUtilsKt {
    public static final void sendAnalytic(@NotNull AnalyticRefs analyticRefs, @NotNull String actionType, Map<String, TokenizedTrackingInfo> map) {
        t mapToTokenizedEvent;
        l tokenizedAnalytics;
        Intrinsics.checkNotNullParameter(analyticRefs, "<this>");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        if (map == null || (mapToTokenizedEvent = TrackingInfoMapperKt.mapToTokenizedEvent(map, analyticRefs.getVoId(), actionType)) == null || (tokenizedAnalytics = analyticRefs.getTokenizedAnalytics()) == null) {
            return;
        }
        tokenizedAnalytics.f(mapToTokenizedEvent, NonViewFilter.INSTANCE, null);
    }
}
