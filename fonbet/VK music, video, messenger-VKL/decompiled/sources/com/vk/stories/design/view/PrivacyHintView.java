package com.vk.stories.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.camera.editor.common.impl.R$styleable;
import com.vkontakte.android.R;
import xsna.e3m;
import xsna.iah0;

/* compiled from: PrivacyHintView.kt */
/* loaded from: classes6.dex */
public final class PrivacyHintView extends FrameLayout {
    public static final int e = iah0.a(16);
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public PrivacyHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(R.layout.view_privacy_hint, (ViewGroup) this, true);
        this.b = (ImageView) findViewById(R.id.privacy_image);
        this.c = (TextView) findViewById(R.id.privacy_hint_text);
        this.d = (TextView) findViewById(R.id.privacy_hint_setup_button);
        Context context2 = getContext();
        e3m.a aVar = e3m.a;
        setBackgroundColor(context2.getColor(R.color.vk_gray_850));
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a);
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                TextView textView = this.c;
                (textView == null ? null : textView).setText(string);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        ImageView imageView = this.b;
        if (imageView == null) {
            imageView = null;
        }
        int right = imageView.getRight() + e;
        TextView textView2 = this.c;
        if (textView2 == null) {
            textView2 = null;
        }
        int top = textView2.getTop();
        TextView textView3 = this.d;
        if (textView3 == null) {
            textView3 = null;
        }
        int left = textView3.getLeft();
        TextView textView4 = this.c;
        if (textView4 == null) {
            textView4 = null;
        }
        int paddingEnd = left - textView4.getPaddingEnd();
        TextView textView5 = this.c;
        textView.layout(right, top, paddingEnd, (textView5 != null ? textView5 : null).getBottom());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i) == 0 ? iah0.f().widthPixels : View.MeasureSpec.getSize(i);
        ImageView imageView = this.b;
        if (imageView == null) {
            imageView = null;
        }
        int measuredWidth = (size - imageView.getMeasuredWidth()) - (e * 2);
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        int measuredWidth2 = measuredWidth - textView.getMeasuredWidth();
        TextView textView2 = this.c;
        if (textView2 == null) {
            textView2 = null;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2 - textView2.getPaddingEnd(), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        TextView textView3 = this.c;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.measure(makeMeasureSpec, makeMeasureSpec2);
        TextView textView4 = this.c;
        if (textView4 == null) {
            textView4 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView4.getLayoutParams();
        TextView textView5 = this.c;
        int measuredHeight = (textView5 != null ? textView5 : null).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        if (measuredHeight > getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public final void setHintText(String str) {
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
    }

    public final void setSetupButtonClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setOnClickListener(onClickListener);
    }
}
