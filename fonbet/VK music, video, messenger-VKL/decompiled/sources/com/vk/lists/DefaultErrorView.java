package com.vk.lists;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ee;
import xsna.krv0;
import xsna.nel;

/* loaded from: classes3.dex */
public class DefaultErrorView extends ee {
    public long d;
    public LinearLayout e;
    public TextView f;
    public TextView g;

    public DefaultErrorView(Context context) {
        super(context);
        this.d = 0L;
        c(context);
    }

    @Override // xsna.ee
    public void b() {
        this.f.setText(R.string.vk_common_network_error);
        this.g.setVisibility(0);
    }

    public final void c(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(getLayoutId(), (ViewGroup) null);
        this.e = linearLayout;
        addView(linearLayout, getContainerLayoutParams());
        this.f = (TextView) findViewById(R.id.error_text);
        TextView textView = (TextView) findViewById(R.id.error_retry);
        this.g = textView;
        textView.setOnClickListener(new nel(this));
    }

    public LinearLayout getContainer() {
        return this.e;
    }

    public ViewGroup.LayoutParams getContainerLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2, 17);
    }

    public TextView getErrorButton() {
        return this.g;
    }

    public TextView getErrorText() {
        return this.f;
    }

    public int getLayoutId() {
        return R.layout.vk_error_screen;
    }

    @Override // xsna.ee
    public void setActionTitle(int i) {
        this.g.setText(i);
    }

    @Override // xsna.ee
    public void setMessage(CharSequence charSequence) {
        this.f.setText(charSequence);
    }

    public void setMessageColor(int i) {
        TypedValue typedValue = krv0.a;
        krv0.q(this.f, i);
    }

    public void setMessageColorAtr(int i) {
        TypedValue typedValue = krv0.a;
        krv0.q(this.g, i);
    }

    @Override // xsna.ee
    public void setRetryBtnVisible(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    public DefaultErrorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0L;
        c(context);
    }

    public DefaultErrorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.d = 0L;
        c(context);
    }
}
