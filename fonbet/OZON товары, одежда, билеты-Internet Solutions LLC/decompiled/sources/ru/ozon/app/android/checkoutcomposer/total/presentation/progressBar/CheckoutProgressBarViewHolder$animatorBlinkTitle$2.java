package ru.ozon.app.android.checkoutcomposer.total.presentation.progressBar;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkout.databinding.HighloadProgressBarBinding;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/animation/ObjectAnimator;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/animation/ObjectAnimator;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CheckoutProgressBarViewHolder$animatorBlinkTitle$2 extends AbstractC7737t implements Function0<ObjectAnimator> {
    final /* synthetic */ CheckoutProgressBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CheckoutProgressBarViewHolder$animatorBlinkTitle$2(CheckoutProgressBarViewHolder checkoutProgressBarViewHolder) {
        super(0);
        this.this$0 = checkoutProgressBarViewHolder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ObjectAnimator invoke() {
        HighloadProgressBarBinding highloadProgressBarBinding;
        highloadProgressBarBinding = this.this$0.binding;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(highloadProgressBarBinding.titleTextAtomView, (Property<TextAtomView, Float>) View.ALPHA, 0.3f, 1.0f);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setDuration(1200L);
        return ofFloat;
    }
}
