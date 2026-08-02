package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers;

import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ValueAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ShellNavBarCornersManagerImpl$cornerAnimator$2 extends AbstractC7737t implements Function0<ValueAnimator> {
    final /* synthetic */ ShellNavBarCornersManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShellNavBarCornersManagerImpl$cornerAnimator$2(ShellNavBarCornersManagerImpl shellNavBarCornersManagerImpl) {
        super(0);
        this.this$0 = shellNavBarCornersManagerImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(ShellNavBarCornersManagerImpl shellNavBarCornersManagerImpl, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
        shellNavBarCornersManagerImpl.setCornerRadius(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        int defaultCornerRadius;
        defaultCornerRadius = this.this$0.getDefaultCornerRadius();
        ValueAnimator ofInt = ValueAnimator.ofInt(0, defaultCornerRadius);
        final ShellNavBarCornersManagerImpl shellNavBarCornersManagerImpl = this.this$0;
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.storefront.widgets.navbarv2.presentation.managers.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShellNavBarCornersManagerImpl$cornerAnimator$2.invoke$lambda$1$lambda$0(ShellNavBarCornersManagerImpl.this, valueAnimator);
            }
        });
        return ofInt;
    }
}
