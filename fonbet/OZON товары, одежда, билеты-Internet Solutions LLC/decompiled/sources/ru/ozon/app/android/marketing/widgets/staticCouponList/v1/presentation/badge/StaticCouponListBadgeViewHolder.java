package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Sc.o;
import android.view.View;
import androidx.lifecycle.K;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListTimerFormatter;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;
import xe.B0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\rR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeViewHolder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapter$ViewHolder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeView;", "Landroid/view/View;", "view", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", DynamicElementDTO.TIMER, "<init>", "(Landroid/view/View;Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;)V", "", "subscribeTimer", "()V", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "state", "handleTimerState", "(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;)V", "onViewInVisibleBounds", "onViewOutOfVisibleBounds", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeViewBinder;", "viewBinder", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeViewBinder;", "getViewBinder", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeViewBinder;", "Lxe/B0;", "job", "Lxe/B0;", "LAe/h;", "timerFlow", "LAe/h;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListBadgeViewHolder extends StaticCouponListContentAdapter.ViewHolder<StaticCouponListVO.ContentItem.Badge, StaticCouponListBadgeView> {
    private B0 job;

    @NotNull
    private final TimerFlow<StaticCouponListTimerFormatter.Time> timer;
    private InterfaceC2395h<? extends TimerFlow.State<StaticCouponListTimerFormatter.Time>> timerFlow;

    @NotNull
    private final StaticCouponListBadgeViewBinder viewBinder;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "startSaleTimestamp", "", "endSaleTimestamp", "formatter", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListBadgeViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements InterfaceC6511n<Long, Long, StaticCouponListTimerFormatter, Unit> {
        AnonymousClass1() {
            super(3);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Unit invoke(Long l11, Long l12, StaticCouponListTimerFormatter staticCouponListTimerFormatter) {
            invoke(l11.longValue(), l12.longValue(), staticCouponListTimerFormatter);
            return Unit.f71690a;
        }

        public final void invoke(long j11, long j12, StaticCouponListTimerFormatter formatter) {
            Intrinsics.checkNotNullParameter(formatter, "formatter");
            StaticCouponListBadgeViewHolder staticCouponListBadgeViewHolder = StaticCouponListBadgeViewHolder.this;
            staticCouponListBadgeViewHolder.timerFlow = staticCouponListBadgeViewHolder.timer.getTimer(j11, j12, formatter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListBadgeViewHolder(@NotNull View view, @NotNull TimerFlow<StaticCouponListTimerFormatter.Time> timer) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(timer, "timer");
        this.timer = timer;
        this.viewBinder = new StaticCouponListBadgeViewBinder(view);
        getCurrentView().setOnStartTimerListener(new AnonymousClass1());
    }

    private final void handleTimerState(TimerFlow.State<StaticCouponListTimerFormatter.Time> state) {
        if (state instanceof TimerFlow.State.Expired) {
            getCurrentView().bindTimer(null, ((TimerFlow.State.Expired) state).getTimerProgress());
        } else {
            if (!(state instanceof TimerFlow.State.Running)) {
                throw new o();
            }
            TimerFlow.State.Running running = (TimerFlow.State.Running) state;
            getCurrentView().bindTimer((StaticCouponListTimerFormatter.Time) running.getFormatedTime(), running.getTimerProgress());
        }
    }

    private final void subscribeTimer() {
        InterfaceC2395h<? extends TimerFlow.State<StaticCouponListTimerFormatter.Time>> interfaceC2395h = this.timerFlow;
        this.job = interfaceC2395h != null ? C2399j.C(new C2408n0(interfaceC2395h, new StaticCouponListBadgeViewHolder$subscribeTimer$1(this)), K.a(this)) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object subscribeTimer$handleTimerState(StaticCouponListBadgeViewHolder staticCouponListBadgeViewHolder, TimerFlow.State state, d dVar) {
        staticCouponListBadgeViewHolder.handleTimerState(state);
        return Unit.f71690a;
    }

    @Override // jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        subscribeTimer();
        super.onViewInVisibleBounds();
    }

    @Override // jk0.j, lk0.b
    public void onViewOutOfVisibleBounds() {
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        this.job = null;
        super.onViewOutOfVisibleBounds();
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapter.ViewHolder
    @NotNull
    public StaticCouponListContentViewBinder<StaticCouponListVO.ContentItem.Badge, StaticCouponListBadgeView> getViewBinder() {
        return this.viewBinder;
    }
}
