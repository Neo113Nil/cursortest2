package com.vk.stories.design.view.sticker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.vkontakte.android.R;
import xsna.a900;
import xsna.e3m;
import xsna.hav0;
import xsna.t800;
import xsna.udy;
import xsna.upj0;

/* compiled from: TemplateButton.kt */
/* loaded from: classes6.dex */
public final class TemplateButton extends LinearLayout {
    public final LottieAnimationView b;
    public final View c;

    public TemplateButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        View.inflate(context, R.layout.pds_sticker_template_button_new, this);
        setOutlineProvider(hav0.c);
        setClipToOutline(true);
        this.c = findViewById(R.id.lottie_placeholder);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R.id.lottie_view);
        lottieAnimationView.V(new udy("**"), t800.I, new a900(new upj0(getWhiteColor())));
        this.b = lottieAnimationView;
    }

    private final int getWhiteColor() {
        Context context = getContext();
        e3m.a aVar = e3m.a;
        return context.getColor(R.color.vk_white);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.W();
    }
}
