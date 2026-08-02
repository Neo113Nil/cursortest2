package com.vk.libvideo.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Trace;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.pvo0;
import xsna.s3q0;

/* compiled from: UpcomingIndicatorView.kt */
/* loaded from: classes3.dex */
public final class UpcomingIndicatorView extends AppCompatTextView {
    public UpcomingIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final void setUpcoming(int i) {
        Trace.beginSection("UpcomingIndicatorView.setUpcoming");
        try {
            setText(pvo0.i(true, i, false, false));
            s3q0 s3q0Var = s3q0.a;
        } finally {
            Trace.endSection();
        }
    }

    public UpcomingIndicatorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(iah0.b(6.0f));
        gradientDrawable.setColor(getContext().getColor(R.color.vk_black_alpha35));
        setBackground(gradientDrawable);
        int color = getContext().getColor(R.color.vk_white);
        setTextColor(color);
        setCompoundDrawablesRelativeWithIntrinsicBounds(R.drawable.vk_icon_clock_outline_12, 0, 0, 0);
        setCompoundDrawablePadding(iah0.a(4.0f));
        setCompoundDrawableTintList(ColorStateList.valueOf(color));
        int a = iah0.a(6);
        int a2 = iah0.a(2);
        setPadding(a, a2, a, a2);
    }
}
