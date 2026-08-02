package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.presentation.HotelsCheckoutTitleVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsCheckoutTitle.v1.view.HotelsCheckoutTitleView;
import ru.ozon.app.android.travel.utils.utils.TimerHelper;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\"R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/view/HotelsCheckoutTitleView;", "hotelsCheckoutTitleView", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/view/HotelsCheckoutTitleView;LWZ/l;)V", "", "leftTime", "", "updateTimer", "(J)V", "startTimer", "()V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/presentation/HotelsCheckoutTitleVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsCheckoutTitle/v1/view/HotelsCheckoutTitleView;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", DynamicElementDTO.TIMER, "Lru/ozon/app/android/travel/utils/utils/TimerHelper;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsCheckoutTitleWidgetViewHolder extends k<HotelsCheckoutTitleVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HotelsCheckoutTitleView hotelsCheckoutTitleView;
    private TimerHelper timer;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelsCheckoutTitleWidgetViewHolder(@NotNull ComposerReferences references, @NotNull HotelsCheckoutTitleView hotelsCheckoutTitleView, @NotNull l tokenizedAnalytics) {
        super(hotelsCheckoutTitleView);
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(hotelsCheckoutTitleView, "hotelsCheckoutTitleView");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.hotelsCheckoutTitleView = hotelsCheckoutTitleView;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.actionHandler = new ActionHandler.Builder(references, this).buildHandler();
    }

    private final void startTimer() {
        TimerHelper timerHelper;
        TimerHelper timerHelper2 = this.timer;
        if (timerHelper2 != null) {
            timerHelper2.stopTimer();
        }
        this.timer = new TimerHelper(getLifecycle());
        HotelsCheckoutTitleVO boundData = getBoundData();
        if ((boundData != null ? boundData.getDeadline() : null) != null) {
            TimerHelper timerHelper3 = this.timer;
            if (timerHelper3 != null) {
                HotelsCheckoutTitleVO boundData2 = getBoundData();
                timerHelper3.startTimer(boundData2 != null ? boundData2.getDeadline() : null, HotelsCheckoutTitleWidgetViewHolder$startTimer$1.INSTANCE, new HotelsCheckoutTitleWidgetViewHolder$startTimer$2(this));
                return;
            }
            return;
        }
        HotelsCheckoutTitleVO boundData3 = getBoundData();
        if ((boundData3 != null ? boundData3.getEndTime() : null) == null || (timerHelper = this.timer) == null) {
            return;
        }
        HotelsCheckoutTitleVO boundData4 = getBoundData();
        timerHelper.startTimer(boundData4 != null ? boundData4.getEndTime() : null, HotelsCheckoutTitleWidgetViewHolder$startTimer$3.INSTANCE, new HotelsCheckoutTitleWidgetViewHolder$startTimer$4(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer(long leftTime) {
        HotelsCheckoutTitleVO.CustomBadge badge;
        TextDTO title;
        HotelsCheckoutTitleView hotelsCheckoutTitleView = this.hotelsCheckoutTitleView;
        HotelsCheckoutTitleVO boundData = getBoundData();
        hotelsCheckoutTitleView.updateTimerTitle(String.valueOf((boundData == null || (badge = boundData.getBadge()) == null || (title = badge.getTitle()) == null) ? null : title.getText()), leftTime);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        startTimer();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        TimerHelper timerHelper = this.timer;
        if (timerHelper != null) {
            timerHelper.stopTimer();
        }
        this.timer = null;
        super.onViewOutOfVisibleBounds();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HotelsCheckoutTitleVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.hotelsCheckoutTitleView.bind(item, this.actionHandler);
        if (isInVisibleBounds()) {
            startTimer();
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HotelsCheckoutTitleVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
