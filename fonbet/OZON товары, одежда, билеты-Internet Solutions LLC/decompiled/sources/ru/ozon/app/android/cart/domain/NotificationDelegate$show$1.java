package ru.ozon.app.android.cart.domain;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.domain.utils.CartNotificationDelegateAnalyticUtils;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class NotificationDelegate$show$1 extends AbstractC7737t implements Function1<AtomAction, Boolean> {
    final /* synthetic */ String $userToken;
    final /* synthetic */ L $widgetId;
    final /* synthetic */ NotificationDelegate this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.cart.domain.NotificationDelegate$show$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function1<t, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, TokenizedAnalyticsExtensionsKt.class, "processClickEvents", "processClickEvents(Lru/ozon/composer/analytics/tokenized/TokenizedAnalytics;Lru/ozon/composer/analytics/tokenized/TokenizedEvent;Lru/ozon/composer/analytics/tokenized/CustomParamsModifier;)V", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
            invoke2(tVar);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            TokenizedAnalyticsExtensionsKt.processClickEvents$default((l) this.receiver, p02, null, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationDelegate$show$1(L l11, NotificationDelegate notificationDelegate, String str) {
        super(1);
        this.$widgetId = l11;
        this.this$0 = notificationDelegate;
        this.$userToken = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(AtomAction it) {
        ConfiguratorReferences configuratorReferences;
        boolean processActionAddToCart;
        Intrinsics.checkNotNullParameter(it, "it");
        CartNotificationDelegateAnalyticUtils cartNotificationDelegateAnalyticUtils = CartNotificationDelegateAnalyticUtils.INSTANCE;
        long j11 = this.$widgetId.f71786a;
        configuratorReferences = this.this$0.references;
        cartNotificationDelegateAnalyticUtils.sendClickAnalyticsIfNeed(it, j11, new AnonymousClass1(configuratorReferences.getTokenizedAnalytics()));
        processActionAddToCart = this.this$0.processActionAddToCart(it, this.$widgetId.f71786a, this.$userToken);
        return Boolean.valueOf(processActionAddToCart);
    }
}
