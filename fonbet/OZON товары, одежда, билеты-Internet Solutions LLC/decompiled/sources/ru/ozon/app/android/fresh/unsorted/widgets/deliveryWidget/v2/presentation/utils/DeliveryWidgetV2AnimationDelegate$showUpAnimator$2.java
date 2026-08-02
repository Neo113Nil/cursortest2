package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ObjectAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class DeliveryWidgetV2AnimationDelegate$showUpAnimator$2 extends AbstractC7737t implements Function0<ObjectAnimator> {
    final /* synthetic */ DeliveryWidgetV2AnimationDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeliveryWidgetV2AnimationDelegate$showUpAnimator$2(DeliveryWidgetV2AnimationDelegate deliveryWidgetV2AnimationDelegate) {
        super(0);
        this.this$0 = deliveryWidgetV2AnimationDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ObjectAnimator invoke() {
        ConstraintLayout constraintLayout;
        int containerHeight;
        constraintLayout = this.this$0.root;
        Property property = View.TRANSLATION_Y;
        containerHeight = this.this$0.getContainerHeight();
        return ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) property, containerHeight, 0.0f);
    }
}
