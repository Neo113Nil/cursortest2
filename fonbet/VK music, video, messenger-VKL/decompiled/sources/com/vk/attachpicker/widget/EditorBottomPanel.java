package com.vk.attachpicker.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.appfeature.attachpicker.R$styleable;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.t3p;

/* loaded from: classes15.dex */
public class EditorBottomPanel extends FrameLayout {
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final FrameLayout e;
    public final View f;

    public EditorBottomPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnClickListener(new t3p());
        LayoutInflater.from(context).inflate(R.layout.picker_layout_editor_bottom_panel, this);
        this.d = (TextView) findViewById(R.id.tv_title);
        this.b = (ImageView) findViewById(R.id.iv_cancel);
        this.c = (ImageView) findViewById(R.id.iv_apply);
        this.e = (FrameLayout) findViewById(R.id.fl_center_view_container);
        this.f = findViewById(R.id.divider);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                boolean z = obtainStyledAttributes.getBoolean(0, true);
                if (resourceId != 0) {
                    this.d.setText(resourceId);
                }
                if (z) {
                    return;
                }
                this.c.setVisibility(4);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setCenterView(View view) {
        view.setMinimumWidth(iah0.a(48));
        this.e.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 17;
        this.e.addView(view, layoutParams);
    }

    public void setDividerVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public void setLeftButtonResId(int i) {
        this.b.setImageResource(i);
    }

    public void setLeftButtonTint(int i) {
        this.b.setColorFilter(i);
    }

    public void setOnApplyClickListener(View.OnClickListener onClickListener) {
        this.c.setOnClickListener(onClickListener);
    }

    public void setOnCancelClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setRightButtonResId(int i) {
        this.c.setImageResource(i);
    }

    public void setRightButtonTint(int i) {
        this.c.setColorFilter(i);
    }
}
