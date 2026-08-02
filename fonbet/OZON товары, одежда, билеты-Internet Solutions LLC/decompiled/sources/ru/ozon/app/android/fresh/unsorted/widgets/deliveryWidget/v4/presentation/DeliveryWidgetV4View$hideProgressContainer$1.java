package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV4View$hideProgressContainer$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DeliveryWidgetV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV4View$hideProgressContainer$1(DeliveryWidgetV4View deliveryWidgetV4View) {
        super(0);
        this.this$0 = deliveryWidgetV4View;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View view;
        view = this.this$0.progressBackgroundView;
        ViewExtKt.gone(view);
        ViewExtKt.gone(this.this$0.progressView);
        View view2 = this.this$0.progressView;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = 0;
        view2.setLayoutParams(layoutParams2);
    }
}
