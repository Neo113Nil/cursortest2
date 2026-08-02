package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListTimerFormatter;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class StaticCouponListBadgeViewHolder$subscribeTimer$1 extends C7719a implements Function2<TimerFlow.State<? extends StaticCouponListTimerFormatter.Time>, d<? super Unit>, Object> {
    StaticCouponListBadgeViewHolder$subscribeTimer$1(Object obj) {
        super(2, obj, StaticCouponListBadgeViewHolder.class, "handleTimerState", "handleTimerState(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(TimerFlow.State<? extends StaticCouponListTimerFormatter.Time> state, d<? super Unit> dVar) {
        return invoke2((TimerFlow.State<StaticCouponListTimerFormatter.Time>) state, dVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(TimerFlow.State<StaticCouponListTimerFormatter.Time> state, d<? super Unit> dVar) {
        Object subscribeTimer$handleTimerState;
        subscribeTimer$handleTimerState = StaticCouponListBadgeViewHolder.subscribeTimer$handleTimerState((StaticCouponListBadgeViewHolder) this.receiver, state, dVar);
        return subscribeTimer$handleTimerState;
    }
}
