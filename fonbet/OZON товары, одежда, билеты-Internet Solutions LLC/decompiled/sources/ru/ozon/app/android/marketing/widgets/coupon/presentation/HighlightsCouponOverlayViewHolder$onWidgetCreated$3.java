package ru.ozon.app.android.marketing.widgets.coupon.presentation;

import Sc.s;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder$onWidgetCreated$3", f = "HighlightsCouponOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class HighlightsCouponOverlayViewHolder$onWidgetCreated$3 extends j implements Function2<Set<? extends String>, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ HighlightsCouponOverlayViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HighlightsCouponOverlayViewHolder$onWidgetCreated$3(HighlightsCouponOverlayViewHolder highlightsCouponOverlayViewHolder, d<? super HighlightsCouponOverlayViewHolder$onWidgetCreated$3> dVar) {
        super(2, dVar);
        this.this$0 = highlightsCouponOverlayViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new HighlightsCouponOverlayViewHolder$onWidgetCreated$3(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Set<? extends String> set, d<? super Unit> dVar) {
        return invoke2((Set<String>) set, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CouponBinder couponBinder;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        couponBinder = this.this$0.couponBinder;
        couponBinder.setApplied(true);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Set<String> set, d<? super Unit> dVar) {
        return ((HighlightsCouponOverlayViewHolder$onWidgetCreated$3) create(set, dVar)).invokeSuspend(Unit.f71690a);
    }
}
