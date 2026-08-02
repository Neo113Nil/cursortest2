package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class StaticCouponListViewHolder$onAttachViewModel$1 extends C7719a implements Function2<StaticCouponListWidgetViewModel.Result, d<? super Unit>, Object> {
    StaticCouponListViewHolder$onAttachViewModel$1(Object obj) {
        super(2, obj, StaticCouponListViewHolder.class, "handleComposerActionResult", "handleComposerActionResult(Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel$Result;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(StaticCouponListWidgetViewModel.Result result, d<? super Unit> dVar) {
        Object onAttachViewModel$handleComposerActionResult;
        onAttachViewModel$handleComposerActionResult = StaticCouponListViewHolder.onAttachViewModel$handleComposerActionResult((StaticCouponListViewHolder) this.receiver, result, dVar);
        return onAttachViewModel$handleComposerActionResult;
    }
}
