package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.R$anim;
import ru.ozon.app.android.pdp.databinding.PdpItemPriceActionsCellBinding;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/view/animation/Animation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceActionItemViewHolder$animation$2 extends AbstractC7737t implements Function0<Animation> {
    final /* synthetic */ PriceActionItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceActionItemViewHolder$animation$2(PriceActionItemViewHolder priceActionItemViewHolder) {
        super(0);
        this.this$0 = priceActionItemViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Animation invoke() {
        PdpItemPriceActionsCellBinding pdpItemPriceActionsCellBinding;
        pdpItemPriceActionsCellBinding = this.this$0.binding;
        Animation loadAnimation = AnimationUtils.loadAnimation(pdpItemPriceActionsCellBinding.getConstraintLayout().getContext(), R$anim.animation_saleblock);
        final PriceActionItemViewHolder priceActionItemViewHolder = this.this$0;
        loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.recycler.PriceActionItemViewHolder$animation$2$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                View viewGradient;
                viewGradient = PriceActionItemViewHolder.this.getViewGradient();
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
