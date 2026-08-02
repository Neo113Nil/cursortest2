package com.vk.stories.design.view.stickerbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ao6;
import xsna.iah0;
import xsna.iqb0;
import xsna.s3q0;

/* compiled from: PollStickerButton.kt */
/* loaded from: classes6.dex */
public final class PollStickerButton extends ao6 {
    public PollStickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        TextView textView = new TextView(context);
        textView.setText(context.getString(R.string.sticker_button_title_poll));
        ao6.a(textView);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, iah0.a(8));
        iqb0 iqb0Var = new iqb0(context);
        linearLayout.addView(textView);
        linearLayout.addView(iqb0Var, new FrameLayout.LayoutParams(-1, iah0.a(38)));
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
