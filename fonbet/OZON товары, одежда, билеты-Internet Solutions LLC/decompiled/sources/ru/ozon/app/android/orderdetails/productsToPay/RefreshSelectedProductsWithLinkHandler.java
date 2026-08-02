package ru.ozon.app.android.orderdetails.productsToPay;

import Tl.b;
import WZ.l;
import WZ.t;
import i10.h;
import i10.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler;", "", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "widgetId", "", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/Long;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RefreshSelectedProductsWithLinkHandler {

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/RefreshSelectedProductsWithLinkHandler$Companion;", "", "<init>", "()V", "ACTION_REFRESH_SELECTED_PRODUCTS_WITH_LINK", "", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RefreshSelectedProductsWithLinkHandler(@NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    public final void handle(@NotNull AtomAction.Click action, Long widgetId) {
        t mapToTokenizedEvent$default;
        if (b.i(action, "action", "refreshSelectedProductsWithLink")) {
            Map<String, TokenizedTrackingInfo> trackingInfo = action.getTrackingInfo();
            if (trackingInfo != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, widgetId, null, 2, null)) != null) {
                TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.tokenizedAnalytics, mapToTokenizedEvent$default, null, 2, null);
            }
            InterfaceC7851b.a.a(this.refs.getController(), action.getLink(), action.getParams(), null, new h.b(null, new l.a.b(0L, null, 3), 1), 4);
        }
    }
}
