package ru.ozon.app.android.action.v2.analytic;

import O7.h;
import RZ.b;
import W10.c;
import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0010\u001a\u00020\u000f2\n\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JK\u0010\u0012\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\n2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegateImpl;", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "widgetTrackingData", "", "", "trackingPayloads", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "", "trackEvent", "(LW10/c;Ljava/util/Map;Ljava/util/Map;)V", "sendAnalytics", "(Ljava/util/Map;Ljava/util/Map;LW10/c;)V", "LWZ/l;", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionAnalyticDelegateImpl implements ActionAnalyticDelegate {

    @NotNull
    private final l tokenizedAnalytics;

    public ActionAnalyticDelegateImpl(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
        tokenizedAnalytics.h();
    }

    private final void trackEvent(c widgetTrackingData, Map<String, String> trackingPayloads, Map<String, TokenizedTrackingInfo> trackingInfo) {
        String c11;
        String d11 = widgetTrackingData.d();
        if (d11 == null || (c11 = widgetTrackingData.c()) == null) {
            return;
        }
        long hashCode = c11.hashCode();
        t k11 = h.k(trackingInfo, Long.valueOf(hashCode));
        b b11 = widgetTrackingData.b();
        Map<Long, b> i11 = b11 != null ? U.i(new Pair(Long.valueOf(hashCode), b11)) : U.c();
        Map<Long, RZ.c> i12 = U.i(new Pair(Long.valueOf(hashCode), new RZ.c(d11)));
        this.tokenizedAnalytics.c(i11);
        this.tokenizedAnalytics.b(i12);
        this.tokenizedAnalytics.e(trackingPayloads);
        TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.tokenizedAnalytics, k11, null, 2, null);
        this.tokenizedAnalytics.d();
    }

    @Override // ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate
    public void sendAnalytics(Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, String> trackingPayloads, c widgetTrackingData) {
        if (trackingInfo == null || widgetTrackingData == null) {
            return;
        }
        if (trackingPayloads == null) {
            trackingPayloads = U.c();
        }
        trackEvent(widgetTrackingData, trackingPayloads, trackingInfo);
    }
}
