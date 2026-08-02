package com.vk.auth.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.gzs;
import xsna.hcu0;
import xsna.iah0;
import xsna.s3q0;

/* compiled from: VkAuthIncorrectLoginView.kt */
/* loaded from: classes15.dex */
public final class VkAuthIncorrectLoginView extends LinearLayout {
    public gzs<s3q0> b;

    public VkAuthIncorrectLoginView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        View.inflate(context, R.layout.vk_auth_incorrect_login_view, this);
        TextView textView = (TextView) findViewById(R.id.login_error_subtitle);
        int a = iah0.a(12);
        setPadding(a, a, a, a);
        setBackgroundResource(R.drawable.vk_auth_bg_error);
        String string = getContext().getString(R.string.vk_auth_incorrect_login_subtitle_reset);
        String string2 = getContext().getString(R.string.vk_auth_incorrect_login_subtitle, string);
        int f = e3m.f(R.attr.vk_ui_text_link_themed, getContext());
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string2);
        newSpannable.setSpan(new hcu0(f, this), string2.length() - string.length(), string2.length(), 33);
        if (textView != null) {
            textView.setText(newSpannable);
        }
        if (textView != null) {
            textView.setHighlightColor(0);
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public final void setResetClickListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }
}
