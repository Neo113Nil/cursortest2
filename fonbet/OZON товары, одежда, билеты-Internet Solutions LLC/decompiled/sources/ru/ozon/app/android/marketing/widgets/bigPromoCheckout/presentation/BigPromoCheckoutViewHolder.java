package ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation;

import W10.c;
import WZ.l;
import WZ.t;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.common.timer.TimerWidgetTicker;
import ru.ozon.app.android.marketing.widgets.bigPromoCheckout.presentation.BigPromoCheckoutVO;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u0000 02\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00010B+\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010&\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\"\u001a\u00060 j\u0002`!2\u000e\u0010%\u001a\n\u0018\u00010#j\u0004\u0018\u0001`$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010+R$\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0014\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutView;", "mainView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutView;LWZ/l;Lru/ozon/app/android/storage/startupArgs/StartupArgsService;Lru/ozon/app/android/utils/AppType;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO$TimerBadgeVO;", DynamicElementDTO.TIMER, "", "bindTimer", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO$TimerBadgeVO;)V", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTickVO;", "tick", "onTick", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutTickVO;)V", "stopTimer", "()V", "item", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onDetach", "Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutView;", "LWZ/l;", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "", "timerTicker", "Lru/ozon/app/android/marketing/common/timer/TimerWidgetTicker;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BigPromoCheckoutViewHolder extends k<BigPromoCheckoutVO> {

    @NotNull
    private final BigPromoCheckoutView mainView;

    @NotNull
    private final StartupArgsService startupArgsService;
    private TimerWidgetTicker<Long, BigPromoCheckoutTickVO> timerTicker;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bigPromoCheckout/presentation/BigPromoCheckoutViewHolder$Companion;", "", "<init>", "()V", "TIMER_FORMAT", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigPromoCheckoutViewHolder(@NotNull BigPromoCheckoutView mainView, @NotNull l tokenizedAnalytics, @NotNull StartupArgsService startupArgsService, @NotNull AppType appType) {
        super(mainView);
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(startupArgsService, "startupArgsService");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.mainView = mainView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.startupArgsService = startupArgsService;
        mainView.setTimerRadius(appType == AppType.SELECT ? BigPromoCheckoutTimerView.INSTANCE.getCORNER_RADIUS_SELECT() : BigPromoCheckoutTimerView.INSTANCE.getCORNER_RADIUS());
    }

    private final void bindTimer(BigPromoCheckoutVO.TimerBadgeVO timer) {
        stopTimer();
        TimerWidgetTicker<Long, BigPromoCheckoutTickVO> timerWidgetTicker = new TimerWidgetTicker<>(0L, this, BigPromoCheckoutViewHolder$bindTimer$1.INSTANCE, new BigPromoCheckoutViewHolder$bindTimer$2(this), this.startupArgsService.getArgValue("STATIC_TIMERS"), 1, null);
        this.timerTicker = timerWidgetTicker;
        timerWidgetTicker.bind(Long.valueOf(timer.getTimestampEnd()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(BigPromoCheckoutTickVO tick) {
        BigPromoCheckoutTimerView timerView = this.mainView.getTimerView();
        if (tick.getIsFinished()) {
            stopTimer();
            this.mainView.onTimerLeft(getBoundData());
        } else {
            TextAtomV2View tickerTextView = timerView.getTickerTextView();
            String format = String.format(" %s:%s:%s", Arrays.copyOf(new Object[]{tick.getHours(), tick.getMinutes(), tick.getSeconds()}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            tickerTextView.setText(format);
        }
    }

    private final void stopTimer() {
        TimerWidgetTicker<Long, BigPromoCheckoutTickVO> timerWidgetTicker = this.timerTicker;
        if (timerWidgetTicker != null) {
            timerWidgetTicker.unbind();
        }
        this.timerTicker = null;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        stopTimer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BigPromoCheckoutVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.mainView.bind(item);
        BigPromoCheckoutVO.TimerBadgeVO timerBadge = item.getTimerBadge();
        if (timerBadge == null || timerBadge.getSecondsLeft() == null) {
            return;
        }
        Long secondsLeft = timerBadge.getSecondsLeft();
        if (secondsLeft != null && secondsLeft.longValue() == 0) {
            return;
        }
        bindTimer(timerBadge);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull BigPromoCheckoutVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
