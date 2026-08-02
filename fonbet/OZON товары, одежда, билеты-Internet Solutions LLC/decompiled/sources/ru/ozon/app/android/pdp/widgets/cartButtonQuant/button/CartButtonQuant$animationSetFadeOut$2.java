package ru.ozon.app.android.pdp.widgets.cartButtonQuant.button;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/animation/AnimationSet;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonQuant$animationSetFadeOut$2 extends AbstractC7737t implements Function0<AnimationSet> {
    public static final CartButtonQuant$animationSetFadeOut$2 INSTANCE = new CartButtonQuant$animationSetFadeOut$2();

    CartButtonQuant$animationSetFadeOut$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final AnimationSet invoke() {
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animationSet;
    }
}
