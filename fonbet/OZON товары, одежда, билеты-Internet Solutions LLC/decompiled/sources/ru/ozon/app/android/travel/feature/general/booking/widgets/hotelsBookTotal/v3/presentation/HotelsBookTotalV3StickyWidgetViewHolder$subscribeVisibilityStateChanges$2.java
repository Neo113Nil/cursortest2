package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$2 extends C7719a implements Function2<HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState, d<? super Unit>, Object> {
    HotelsBookTotalV3StickyWidgetViewHolder$subscribeVisibilityStateChanges$2(Object obj) {
        super(2, obj, HotelsBookTotalV3StickyWidgetViewHolder.class, "handleVisibility", "handleVisibility(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/viewmodel/HotelsBookTotalV3StickyViewModel$StickyContainerVisibilityState;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(HotelsBookTotalV3StickyViewModel.StickyContainerVisibilityState stickyContainerVisibilityState, d<? super Unit> dVar) {
        Object subscribeVisibilityStateChanges$handleVisibility;
        subscribeVisibilityStateChanges$handleVisibility = HotelsBookTotalV3StickyWidgetViewHolder.subscribeVisibilityStateChanges$handleVisibility((HotelsBookTotalV3StickyWidgetViewHolder) this.receiver, stickyContainerVisibilityState, dVar);
        return subscribeVisibilityStateChanges$handleVisibility;
    }
}
