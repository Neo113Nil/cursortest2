package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryWidget/v4/presentation/ProgressAnimationHelper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV4View$animationHelper$2 extends AbstractC7737t implements Function0<ProgressAnimationHelper> {
    final /* synthetic */ DeliveryWidgetV4View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV4View$animationHelper$2(DeliveryWidgetV4View deliveryWidgetV4View) {
        super(0);
        this.this$0 = deliveryWidgetV4View;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ProgressAnimationHelper invoke() {
        FrameLayout frameLayout;
        View view;
        frameLayout = this.this$0.progressContainer;
        View view2 = this.this$0.progressView;
        view = this.this$0.progressBackgroundView;
        return new ProgressAnimationHelper(frameLayout, view2, view);
    }
}
