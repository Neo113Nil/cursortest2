package com.vk.poll.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.poll.R$styleable;
import com.vkontakte.android.R;
import xsna.cn70;
import xsna.f4m;
import xsna.izs;
import xsna.pht;
import xsna.s3q0;
import xsna.wg;

/* compiled from: PollEditViews.kt */
/* loaded from: classes17.dex */
public final class PollSettingView extends LinearLayout {
    public static final /* synthetic */ int d = 0;
    public final CheckBox b;
    public final TextView c;

    public PollSettingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        setBackgroundResource(R.drawable.highlight);
        LayoutInflater.from(getContext()).inflate(R.layout.poll_setting_item_view, this);
        this.b = (CheckBox) findViewById(R.id.poll_option_checkbox);
        TextView textView = (TextView) findViewById(R.id.poll_option_tv);
        f4m.s(cn70.b(10), textView);
        this.c = textView;
        setOnClickListener(new wg(this, 3));
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        try {
            textView.setText(obtainStyledAttributes.getString(0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setChecked(boolean z) {
        this.b.setChecked(z);
    }

    public final void setEnabledState(boolean z) {
        this.b.setEnabled(z);
        setEnabled(z);
        this.c.setEnabled(z);
        setOnClickListener(null);
    }

    public final void setOnCheckedChangeListener(izs<? super Boolean, s3q0> izsVar) {
        this.b.setOnCheckedChangeListener(new pht(izsVar, 1));
    }
}
