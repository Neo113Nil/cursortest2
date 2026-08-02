package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.viewmodel.HotelsBookTotalV3StickyViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class HotelsBookTotalV3StickyWidgetViewHolder$subscribeKeyboardVisibility$1 extends C7719a implements Function2<Boolean, d<? super Unit>, Object> {
    HotelsBookTotalV3StickyWidgetViewHolder$subscribeKeyboardVisibility$1(Object obj) {
        super(2, obj, HotelsBookTotalV3StickyViewModel.class, "onKeyboardVisibilityChanged", "onKeyboardVisibilityChanged(Z)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
        return invoke(bool.booleanValue(), dVar);
    }

    public final Object invoke(boolean z11, d<? super Unit> dVar) {
        Object subscribeKeyboardVisibility$onKeyboardVisibilityChanged;
        subscribeKeyboardVisibility$onKeyboardVisibilityChanged = HotelsBookTotalV3StickyWidgetViewHolder.subscribeKeyboardVisibility$onKeyboardVisibilityChanged((HotelsBookTotalV3StickyViewModel) this.receiver, z11, dVar);
        return subscribeKeyboardVisibility$onKeyboardVisibilityChanged;
    }
}
