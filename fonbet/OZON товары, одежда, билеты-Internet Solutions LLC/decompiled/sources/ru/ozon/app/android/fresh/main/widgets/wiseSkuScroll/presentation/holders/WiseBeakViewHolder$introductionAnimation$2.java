package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseBeakViewHolder$animationStateListener$2;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ValueAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WiseBeakViewHolder$introductionAnimation$2 extends AbstractC7737t implements Function0<ValueAnimator> {
    final /* synthetic */ WiseBeakViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WiseBeakViewHolder$introductionAnimation$2(WiseBeakViewHolder wiseBeakViewHolder) {
        super(0);
        this.this$0 = wiseBeakViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(Function1 function1, ValueAnimator p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        function1.invoke(p02);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ValueAnimator invoke() {
        DecelerateInterpolator defaultInterpolator;
        final Function1 function1;
        WiseBeakViewHolder$animationStateListener$2.AnonymousClass1 animationStateListener;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 0.66f, 0.0f);
        WiseBeakViewHolder wiseBeakViewHolder = this.this$0;
        ofFloat.setDuration(400L);
        defaultInterpolator = wiseBeakViewHolder.getDefaultInterpolator();
        ofFloat.setInterpolator(defaultInterpolator);
        function1 = wiseBeakViewHolder.animationUpdateListener;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                WiseBeakViewHolder$introductionAnimation$2.invoke$lambda$1$lambda$0(Function1.this, valueAnimator);
            }
        });
        animationStateListener = wiseBeakViewHolder.getAnimationStateListener();
        ofFloat.addListener(animationStateListener);
        return ofFloat;
    }
}
