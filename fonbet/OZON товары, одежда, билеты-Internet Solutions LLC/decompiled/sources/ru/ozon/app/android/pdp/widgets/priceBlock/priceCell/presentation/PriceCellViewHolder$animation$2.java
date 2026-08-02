package ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$anim;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/view/animation/Animation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceCellViewHolder$animation$2 extends AbstractC7737t implements Function0<Animation> {
    final /* synthetic */ PriceCellViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCellViewHolder$animation$2(PriceCellViewHolder priceCellViewHolder) {
        super(0);
        this.this$0 = priceCellViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Animation invoke() {
        Animation loadAnimation = AnimationUtils.loadAnimation(this.this$0.getContext(), R$anim.animation_saleblock);
        final PriceCellViewHolder priceCellViewHolder = this.this$0;
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceCell.presentation.PriceCellViewHolder$animation$2$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                View viewGradient;
                viewGradient = PriceCellViewHolder.this.getViewGradient();
                viewGradient.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        return loadAnimation;
    }
}
