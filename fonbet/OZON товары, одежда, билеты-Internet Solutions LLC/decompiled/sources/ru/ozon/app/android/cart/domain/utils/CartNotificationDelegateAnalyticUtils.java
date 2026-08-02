package ru.ozon.app.android.cart.domain.utils;

import RZ.b;
import RZ.c;
import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\u00020\r*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJC\u0010\u0012\u001a\u00020\u0010*\u00020\u00102\n\u0010\u0011\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0015\u001a\u00020\u0014*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u001c\u001a\u0012\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/cart/domain/utils/CartNotificationDelegateAnalyticUtils;", "", "<init>", "()V", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "", "widgetId", "", "userToken", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "ru/ozon/app/android/cart/domain/utils/CartNotificationDelegateAnalyticUtils$trackViewOnShow$1", "trackViewOnShow", "(LWZ/l;JLjava/lang/String;Ljava/util/Map;)Lru/ozon/app/android/cart/domain/utils/CartNotificationDelegateAnalyticUtils$trackViewOnShow$1;", "Lru/ozon/uni/android/notificationbar/NotificationBar;", "tokenizedAnalytics", "setTrackingViewEvent", "(Lru/ozon/uni/android/notificationbar/NotificationBar;LWZ/l;JLjava/lang/String;Ljava/util/Map;)Lru/ozon/uni/android/notificationbar/NotificationBar;", "", "prepareAnalyticsToWidgetId", "(LWZ/l;JLjava/lang/String;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "onClickEvent", "sendClickAnalyticsIfNeed", "(Lru/ozon/uni/atoms/af/AtomAction;JLkotlin/jvm/functions/Function1;)V", "LRZ/c;", "EMPTY_WIDGET_TOKEN", "LRZ/c;", "getEMPTY_WIDGET_TOKEN", "()LRZ/c;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartNotificationDelegateAnalyticUtils {

    @NotNull
    public static final CartNotificationDelegateAnalyticUtils INSTANCE = new CartNotificationDelegateAnalyticUtils();

    @NotNull
    private static final c EMPTY_WIDGET_TOKEN = new c("");

    private CartNotificationDelegateAnalyticUtils() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.cart.domain.utils.CartNotificationDelegateAnalyticUtils$trackViewOnShow$1] */
    private final CartNotificationDelegateAnalyticUtils$trackViewOnShow$1 trackViewOnShow(final l lVar, final long j11, final String str, final Map<String, TokenizedTrackingInfo> map) {
        return new NotificationBar.Callback() { // from class: ru.ozon.app.android.cart.domain.utils.CartNotificationDelegateAnalyticUtils$trackViewOnShow$1
            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onDismissed(NotificationBar notificationBar, NotificationBar.DismissReason dismissReason) {
                NotificationBar.Callback.DefaultImpls.onDismissed(this, notificationBar, dismissReason);
            }

            @Override // ru.ozon.uni.android.notificationbar.NotificationBar.Callback
            public void onShown(NotificationBar notificationBar) {
                Intrinsics.checkNotNullParameter(notificationBar, "notificationBar");
                CartNotificationDelegateAnalyticUtils.INSTANCE.prepareAnalyticsToWidgetId(l.this, j11, str);
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(l.this, TrackingInfoMapperKt.mapToTokenizedEvent$default(map, Long.valueOf(j11), null, 2, null), null, 2, null);
            }
        };
    }

    public final void prepareAnalyticsToWidgetId(@NotNull l lVar, long j11, @NotNull String userToken) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        lVar.b(U.i(new Pair(Long.valueOf(j11), EMPTY_WIDGET_TOKEN)));
        lVar.c(U.i(new Pair(Long.valueOf(j11), new b(null, userToken, 0L))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void sendClickAnalyticsIfNeed(@NotNull AtomAction action, long widgetId, @NotNull Function1<? super t, Unit> onClickEvent) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        t mapToTokenizedEvent$default;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(onClickEvent, "onClickEvent");
        if ((!(action instanceof AtomAction.Move) && !(action instanceof AtomAction.DismissRedirect) && !(action instanceof AtomAction.Click)) || (trackingInfo = ((AtomAction.SendAnalytics) action).getTrackingInfo()) == null || (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null)) == null) {
            return;
        }
        onClickEvent.invoke(mapToTokenizedEvent$default);
    }

    @NotNull
    public final NotificationBar setTrackingViewEvent(@NotNull NotificationBar notificationBar, @NotNull l tokenizedAnalytics, long j11, @NotNull String userToken, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(notificationBar, "<this>");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(userToken, "userToken");
        if (map != null) {
            notificationBar.addCallback(INSTANCE.trackViewOnShow(tokenizedAnalytics, j11, userToken, map));
        }
        return notificationBar;
    }
}
