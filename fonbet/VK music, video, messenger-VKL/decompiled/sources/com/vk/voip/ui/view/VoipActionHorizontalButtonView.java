package com.vk.voip.ui.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.R$styleable;
import com.vkontakte.android.R;
import xsna.an10;
import xsna.baf0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.m33;
import xsna.p5x0;

/* compiled from: VoipActionHorizontalButtonView.kt */
/* loaded from: classes7.dex */
public final class VoipActionHorizontalButtonView extends ViewGroup {
    public static final int h = cn70.b(2);
    public static final int i = cn70.b(10);
    public static final int j = cn70.b(6);
    public static final int k = cn70.b(26);
    public static final int l = cn70.b(12);
    public static final int m = cn70.b(48);
    public final VKImageView b;
    public final AppCompatTextView c;
    public final ProgressBar d;
    public final View e;
    public final View f;
    public final View g;

    public VoipActionHorizontalButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.d, 0, 0);
        View.inflate(context, R.layout.voip_action_button_horizontal_view, this);
        View findViewById = findViewById(R.id.content);
        this.g = findViewById;
        VKImageView vKImageView = (VKImageView) findViewById(R.id.icon);
        this.b = vKImageView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.title);
        this.c = appCompatTextView;
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progress);
        this.d = progressBar;
        View findViewById2 = findViewById(R.id.marker_view_box);
        this.e = findViewById2;
        findViewById2.setClipToOutline(true);
        View findViewById3 = findViewById(R.id.badge);
        this.f = findViewById3;
        vKImageView.setImportantForAccessibility(2);
        appCompatTextView.setImportantForAccessibility(2);
        progressBar.setImportantForAccessibility(2);
        findViewById2.setImportantForAccessibility(2);
        findViewById3.setImportantForAccessibility(2);
        findViewById.setImportantForAccessibility(2);
        setupAttrsStyle(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    private final void setupAttrsStyle(TypedArray typedArray) {
        a(typedArray.getDrawable(0), null, false);
        setTitle(typedArray.getString(2));
    }

    public final void a(Drawable drawable, p5x0 p5x0Var, boolean z) {
        VKImageView vKImageView = this.b;
        if (drawable == null) {
            vKImageView.setVisibility(8);
            vKImageView.setImageDrawable(null);
        } else {
            vKImageView.setVisibility(0);
            if (!isInEditMode()) {
                if (p5x0Var == null) {
                    drawable = new baf0(drawable, dhr0.Y(R.attr.vk_ui_text_primary, getContext()));
                }
                vKImageView.setImageDrawable(drawable);
            }
            if (p5x0Var != null) {
                vKImageView.setBackground(p5x0Var);
                vKImageView.setClipToOutline(z);
            } else {
                vKImageView.setBackground(null);
            }
        }
        b();
    }

    public final void b() {
        this.e.setVisibility(this.b.getVisibility() == 0 || this.d.getVisibility() == 0 ? 0 : 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        View view = this.e;
        int measuredWidth = view.getMeasuredWidth();
        int i6 = i;
        AppCompatTextView appCompatTextView = this.c;
        int i7 = i4 - i2;
        int i8 = i5 - i3;
        int measuredWidth2 = (i7 - (appCompatTextView.getMeasuredWidth() + (measuredWidth + i6))) / 2;
        int measuredHeight = (i8 - view.getMeasuredHeight()) / 2;
        View view2 = this.f;
        view2.layout(i7 - view2.getMeasuredWidth(), 0, i7, view2.getMeasuredHeight());
        view.layout(measuredWidth2, measuredHeight, view.getMeasuredWidth() + measuredWidth2, view.getMeasuredHeight() + measuredHeight);
        int measuredHeight2 = (i8 - appCompatTextView.getMeasuredHeight()) / 2;
        int measuredWidth3 = view.getMeasuredWidth() + measuredWidth2 + i6;
        appCompatTextView.layout(measuredWidth3, measuredHeight2, appCompatTextView.getMeasuredWidth() + measuredWidth3, appCompatTextView.getMeasuredHeight() + measuredHeight2);
        int i9 = h;
        this.g.layout(i9, i9, i7 - i9, i8 - i9);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            size2 = m;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(k, 1073741824);
        View view = this.e;
        view.measure(makeMeasureSpec, makeMeasureSpec);
        int i4 = h * 2;
        AppCompatTextView appCompatTextView = this.c;
        int b = an10.b(appCompatTextView.getPaint().measureText(appCompatTextView.getText().toString()));
        int measuredWidth = view.getMeasuredWidth();
        int i5 = j;
        int i6 = (i5 * 2) + measuredWidth;
        int i7 = i;
        int i8 = i6 + i7 + i4 + b;
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            i8 = Math.max(i8, size);
        }
        appCompatTextView.measure(View.MeasureSpec.makeMeasureSpec(Math.min((((i8 - view.getMeasuredWidth()) - (i5 * 2)) - i7) - i4, b), 1073741824), i3);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(l, 1073741824);
        this.f.measure(makeMeasureSpec2, makeMeasureSpec2);
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i8 - i4, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i4, 1073741824));
        setMeasuredDimension(i8, size2);
    }

    public final void setBadgeVisible(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        float f = z ? 1.0f : 0.4f;
        this.b.setAlpha(f);
        this.c.setAlpha(f);
    }

    public final void setIcon(int i2) {
        Drawable a;
        if (i2 == 0) {
            a = null;
        } else {
            Context context = getContext();
            e3m.a aVar = e3m.a;
            a = m33.a(i2, context);
        }
        a(a, null, false);
    }

    public final void setIconNoTint(Drawable drawable) {
        VKImageView vKImageView = this.b;
        if (drawable == null) {
            vKImageView.setVisibility(8);
            vKImageView.setImageDrawable(null);
        } else {
            vKImageView.setVisibility(0);
            vKImageView.setImageDrawable(drawable);
        }
        b();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    public final void setProgressVisible(boolean z) {
        this.d.setVisibility(z ? 0 : 8);
        this.b.setVisibility(z ? 8 : 0);
        b();
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
        setContentDescription(charSequence);
    }

    public final void setTitleTextColor(ColorStateList colorStateList) {
        this.c.setTextColor(colorStateList);
    }

    public final void setTitle(int i2) {
        setTitle(i2 == 0 ? null : getContext().getString(i2));
    }
}
