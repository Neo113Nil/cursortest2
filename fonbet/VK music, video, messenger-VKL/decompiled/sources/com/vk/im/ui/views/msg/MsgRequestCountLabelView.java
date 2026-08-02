package com.vk.im.ui.views.msg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.enj;
import xsna.iah0;
import xsna.qcy;

/* compiled from: MsgRequestCountLabelView.kt */
/* loaded from: classes2.dex */
public final class MsgRequestCountLabelView extends LinearLayout {
    public TextView b;
    public AppCompatImageView c;
    public int d;

    public MsgRequestCountLabelView(Context context) {
        super(context);
        b(this, context, null, 0, 14);
    }

    public static /* synthetic */ void b(MsgRequestCountLabelView msgRequestCountLabelView, Context context, AttributeSet attributeSet, int i, int i2) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        msgRequestCountLabelView.a(context, attributeSet, i, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i, int i2) {
        setOrientation(0);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        textView.setLayoutParams(layoutParams);
        textView.setIncludeFontPadding(false);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        this.b = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388627;
        layoutParams2.setMarginStart(iah0.a(4));
        appCompatImageView.setLayoutParams(layoutParams2);
        appCompatImageView.setImportantForAccessibility(2);
        appCompatImageView.setContentDescription(null);
        this.c = appCompatImageView;
        TextView textView2 = this.b;
        if (textView2 == null) {
            textView2 = null;
        }
        addView(textView2);
        AppCompatImageView appCompatImageView2 = this.c;
        if (appCompatImageView2 == null) {
            appCompatImageView2 = null;
        }
        addView(appCompatImageView2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.v, i, i2);
        setCount(0);
        TextView textView3 = this.b;
        if (textView3 == null) {
            textView3 = null;
        }
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        qcy<Object>[] qcyVarArr = bwt0.a;
        textView3.setTextAppearance(resourceId);
        AppCompatImageView appCompatImageView3 = this.c;
        if (appCompatImageView3 == null) {
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageDrawable(obtainStyledAttributes.getDrawable(0));
        AppCompatImageView appCompatImageView4 = this.c;
        if (appCompatImageView4 == null) {
            appCompatImageView4 = null;
        }
        bwt0.r0(obtainStyledAttributes.getDimensionPixelSize(3, 16), appCompatImageView4);
        AppCompatImageView appCompatImageView5 = this.c;
        if (appCompatImageView5 == null) {
            appCompatImageView5 = null;
        }
        bwt0.c0(obtainStyledAttributes.getDimensionPixelSize(1, 16), appCompatImageView5);
        if (obtainStyledAttributes.hasValue(2)) {
            AppCompatImageView appCompatImageView6 = this.c;
            bwt0.o0(appCompatImageView6 != null ? appCompatImageView6 : null, obtainStyledAttributes.getColor(2, -16777216));
        }
        obtainStyledAttributes.recycle();
    }

    public final int getCount() {
        return this.d;
    }

    public final Drawable getIcon() {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getDrawable();
    }

    public final int getIconHeight() {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getLayoutParams().height;
    }

    public final int getIconWidth() {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        return appCompatImageView.getLayoutParams().width;
    }

    public final void setCount(int i) {
        this.d = i;
        String f = enj.f(R.plurals.vkim_msg_request_label, i, getContext());
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setText(f);
        setContentDescription(f);
    }

    public final void setIcon(Drawable drawable) {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        appCompatImageView.setImageDrawable(drawable);
    }

    public final void setIconHeight(int i) {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        bwt0.c0(i, appCompatImageView);
    }

    public final void setIconWidth(int i) {
        AppCompatImageView appCompatImageView = this.c;
        if (appCompatImageView == null) {
            appCompatImageView = null;
        }
        bwt0.r0(i, appCompatImageView);
    }

    public MsgRequestCountLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(this, context, attributeSet, 0, 12);
    }

    public MsgRequestCountLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(this, context, attributeSet, i, 8);
    }

    public MsgRequestCountLabelView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet, i, i2);
    }
}
