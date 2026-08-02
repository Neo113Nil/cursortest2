package com.vk.stories.design.view.stickerbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ao6;
import xsna.dhr0;
import xsna.hav0;
import xsna.iah0;
import xsna.s3q0;

/* compiled from: OpinionStickerButton2.kt */
/* loaded from: classes6.dex */
public final class OpinionStickerButton2 extends ao6 {
    public OpinionStickerButton2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.sticker_button_title_opinion_single));
        ao6.a(textView);
        textView.setGravity(17);
        float f = 8;
        textView.setPadding(0, 0, 0, iah0.a(f));
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        textView2.setText(context.getString(R.string.sticker_button_subtitle_opinion));
        float f2 = 6;
        textView2.setPadding(iah0.a(f), iah0.a(f2), iah0.a(f), iah0.a(f2));
        textView2.setTextAppearance(R.style.VkUiTypography_Caption2_Unscaled);
        textView2.setTextColor(dhr0.Y(R.attr.vk_ui_text_secondary, context));
        textView2.setBackgroundColor(dhr0.Y(R.attr.vk_ui_background_secondary_alpha, context));
        textView2.setOutlineProvider(hav0.c);
        textView2.setClipToOutline(true);
        linearLayout.addView(textView);
        linearLayout.addView(textView2, new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        s3q0 s3q0Var = s3q0.a;
        addView(linearLayout, layoutParams);
    }

    @Override // xsna.ao6
    public int getButtonCornerRadius() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.vk_ui_border_radius_paper);
    }
}
