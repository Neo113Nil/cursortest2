package ru.ozon.app.android.marketing.widgets.blackfridaycounter.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.marketing.databinding.WidgetBlackFridayCounterBinding;
import ru.ozon.uni.android.component.layout.AsyncFrameLayout;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/uni/android/component/layout/AsyncFrameLayout;", "inflatedView", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BlackFridayCounterViewHolder$asyncRatioFrameLayout$1$1 extends AbstractC7737t implements Function2<AsyncFrameLayout, View, Unit> {
    final /* synthetic */ BlackFridayCounterViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackFridayCounterViewHolder$asyncRatioFrameLayout$1$1(BlackFridayCounterViewHolder blackFridayCounterViewHolder) {
        super(2);
        this.this$0 = blackFridayCounterViewHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AsyncFrameLayout asyncFrameLayout, View view) {
        invoke2(asyncFrameLayout, view);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AsyncFrameLayout invokeWhenInflated, View inflatedView) {
        Intrinsics.checkNotNullParameter(invokeWhenInflated, "$this$invokeWhenInflated");
        Intrinsics.checkNotNullParameter(inflatedView, "inflatedView");
        this.this$0.binding = WidgetBlackFridayCounterBinding.bind(inflatedView);
    }
}
