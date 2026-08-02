package ru.ozon.app.android.fresh.unsorted.widgets.bottomCartWidget.presentation.overlay;

import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ValueAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BottomCartWidgetOverlayHolder$slideUp$2 extends AbstractC7737t implements Function0<ValueAnimator> {
    final /* synthetic */ BottomCartWidgetOverlayHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BottomCartWidgetOverlayHolder$slideUp$2(BottomCartWidgetOverlayHolder bottomCartWidgetOverlayHolder) {
        super(0);
        this.this$0 = bottomCartWidgetOverlayHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        int containerHeight;
        ValueAnimator.AnimatorUpdateListener slideListener;
        containerHeight = this.this$0.getContainerHeight();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, containerHeight);
        slideListener = this.this$0.getSlideListener();
        ofInt.addUpdateListener(slideListener);
        return ofInt;
    }
}
