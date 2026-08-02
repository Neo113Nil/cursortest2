package ru.ozon.app.android.cart.domain.network;

import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/domain/network/CartSyncTracking;", "", "LWZ/l;", "tokenizedAnalytics", "LSg/a;", "applicationAnalyticsScreenStorage", "<init>", "(LWZ/l;LSg/a;)V", "", "widgetId", "", "prepareAnalyticsToWidgetId", "(LWZ/l;J)V", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "sendAddToCartSyncAnalytics", "(Ljava/util/Map;)V", "LWZ/l;", "LSg/a;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartSyncTracking {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final RZ.c EMPTY_WIDGET_TOKEN = new RZ.c("");

    @NotNull
    private final Sg.a applicationAnalyticsScreenStorage;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/cart/domain/network/CartSyncTracking$Companion;", "", "<init>", "()V", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartSyncTracking(@NotNull l tokenizedAnalytics, @NotNull Sg.a applicationAnalyticsScreenStorage) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(applicationAnalyticsScreenStorage, "applicationAnalyticsScreenStorage");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.applicationAnalyticsScreenStorage = applicationAnalyticsScreenStorage;
    }

    private final void prepareAnalyticsToWidgetId(l lVar, long j11) {
        Rg.a a11 = this.applicationAnalyticsScreenStorage.a();
        String l11 = a11 != null ? a11.l() : null;
        if (l11 == null) {
            l11 = "";
        }
        lVar.b(U.i(new Pair(Long.valueOf(j11), EMPTY_WIDGET_TOKEN)));
        lVar.c(U.i(new Pair(Long.valueOf(j11), new RZ.b(null, l11, 0L))));
    }

    public final void sendAddToCartSyncAnalytics(Map<String, TokenizedTrackingInfo> trackingInfo) {
        t mapToTokenizedEvent$default;
        l lVar = this.tokenizedAnalytics;
        prepareAnalyticsToWidgetId(lVar, 0L);
        if (trackingInfo == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, 0L, null, 2, null)) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processAnyEvents$default(lVar, mapToTokenizedEvent$default, null, 2, null);
    }
}
