package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetBottomCartBinding;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ObjectAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BottomCartWidgetViewHolder$buttonShowAlphaAnimator$2 extends AbstractC7737t implements Function0<ObjectAnimator> {
    final /* synthetic */ BottomCartWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetViewHolder$buttonShowAlphaAnimator$2(BottomCartWidgetViewHolder bottomCartWidgetViewHolder) {
        super(0);
        this.this$0 = bottomCartWidgetViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ObjectAnimator invoke() {
        WidgetBottomCartBinding widgetBottomCartBinding;
        widgetBottomCartBinding = this.this$0.binding;
        return ObjectAnimator.ofFloat(widgetBottomCartBinding.cartButton, (Property<ButtonV3View, Float>) View.ALPHA, 0.0f, 1.0f);
    }
}
