package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.fs2;
import xsna.iah0;

/* compiled from: EmptyViewForList.kt */
/* loaded from: classes2.dex */
public final class EmptyViewForList extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public Drawable b;
    public final int c;
    public CharSequence d;
    public final int e;
    public final int f;
    public ImageView g;
    public TextView h;

    public EmptyViewForList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = -1;
        this.d = "";
        float f = 16;
        this.e = iah0.a(f);
        this.f = -16777216;
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.l);
            this.b = obtainStyledAttributes.getDrawable(0);
            this.c = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getString(2);
            this.e = obtainStyledAttributes.getDimensionPixelSize(4, iah0.a(f));
            this.f = obtainStyledAttributes.getColor(3, -16777216);
            obtainStyledAttributes.recycle();
        }
    }

    public final void a(Drawable drawable, Integer num) {
        this.b = drawable;
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
        if (num != null) {
            ImageView imageView2 = this.g;
            dhr0.a.j0(imageView2 != null ? imageView2 : null, num.intValue(), PorterDuff.Mode.SRC_IN);
        }
        b();
    }

    public final void b() {
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(this.c);
        layoutParams.width = dimensionPixelSize;
        layoutParams.height = dimensionPixelSize;
        ImageView imageView2 = this.g;
        (imageView2 != null ? imageView2 : null).setLayoutParams(layoutParams);
    }

    public final CharSequence getText() {
        return this.d;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.vkim_empty_view_for_list_include, (ViewGroup) this, true);
        this.g = (ImageView) findViewById(R.id.empty_icon);
        this.h = (TextView) findViewById(R.id.empty_info);
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(this.b);
        b();
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(this.d);
        TextView textView2 = this.h;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setTextColor(this.f);
        TextView textView3 = this.h;
        (textView3 != null ? textView3 : null).setTextSize(0, this.e);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        if (z) {
            post(new fs2(this, 6));
        }
    }

    public final void setText(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        textView.setText(charSequence);
    }
}
