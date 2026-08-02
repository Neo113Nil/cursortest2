package com.vk.lists;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.fe90;
import xsna.krv0;
import xsna.tj0;

/* loaded from: classes3.dex */
public class DefaultEmptyView extends FrameLayout implements fe90 {
    public ImageView b;
    public TextView c;
    public int d;
    public int e;
    public int f;
    public int g;
    public CharSequence h;
    public boolean i;

    public DefaultEmptyView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        this.e = 0;
        this.f = R.string.liblists_empty_list;
        this.g = 0;
        this.h = null;
        this.i = true;
        b(context);
    }

    @Override // xsna.fe90
    public final void a() {
        setText(this.f);
        setImage(this.g);
    }

    public final void b(Context context) {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f = 32;
        int applyDimension = (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
        setPadding(applyDimension, 0, applyDimension, ((int) TypedValue.applyDimension(1, 56, context.getResources().getDisplayMetrics())) + ((int) tj0.a(1, f, context)));
        LayoutInflater.from(context).inflate(R.layout.vk_view_default_empty, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.image);
        TextView textView = (TextView) findViewById(R.id.text);
        this.c = textView;
        TypedValue typedValue = krv0.a;
        krv0.q(textView, R.attr.vk_ui_text_secondary);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if ((!TextUtils.isEmpty(this.h) || this.d != 0) && this.e != 0 && size > 0 && size2 > 0) {
            if (!this.i || size < size2) {
                this.b.setVisibility(0);
            } else {
                this.b.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setDefaultImage(int i) {
        this.g = i;
    }

    public void setDefaultText(int i) {
        this.f = i;
    }

    public void setImage(int i) {
        this.c.setCompoundDrawables(null, null, null, null);
        this.e = i;
        if (i == 0) {
            this.b.setVisibility(8);
        } else {
            try {
                this.b.setImageResource(i);
            } catch (OutOfMemoryError unused) {
            }
            this.b.setVisibility(0);
        }
    }

    public void setImageTint(int i) {
        this.b.setImageTintList(ColorStateList.valueOf(i));
    }

    @Override // xsna.fe90
    public void setText(int i) {
        this.d = i;
        if (i == 0) {
            this.c.setVisibility(8);
        } else {
            this.c.setText(i);
            this.c.setVisibility(0);
        }
    }

    public void setTextSize(float f) {
        this.c.setTextSize(f);
    }

    @Override // xsna.fe90
    public void setText(CharSequence charSequence) {
        this.h = charSequence;
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setText(charSequence);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
    }
}
