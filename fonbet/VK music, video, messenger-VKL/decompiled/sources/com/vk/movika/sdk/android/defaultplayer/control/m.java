package com.vk.movika.sdk.android.defaultplayer.control;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import xsna.nic;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                p.b((p) this.c, valueAnimator);
                break;
            case 1:
                nic nicVar = (nic) this.c;
                nicVar.getClass();
                nicVar.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                SelectRangeWaveFormView.a((SelectRangeWaveFormView) this.c, valueAnimator);
                break;
            default:
                VkOverlayCircleButton vkOverlayCircleButton = (VkOverlayCircleButton) this.c;
                ViewGroup.LayoutParams layoutParams = vkOverlayCircleButton.d.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                layoutParams.width = num != null ? num.intValue() : 0;
                vkOverlayCircleButton.d.setLayoutParams(layoutParams);
                break;
        }
    }
}
