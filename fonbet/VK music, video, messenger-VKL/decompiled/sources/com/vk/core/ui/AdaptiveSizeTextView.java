package com.vk.core.ui;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.TextViewColorStateListAndAlphaSupportPreV23;
import xsna.iah0;
import xsna.u11;

/* compiled from: AdaptiveSizeTextView.kt */
/* loaded from: classes17.dex */
public final class AdaptiveSizeTextView extends TextViewColorStateListAndAlphaSupportPreV23 {
    public final TextPaint c;
    public final b d;
    public int e;
    public int f;
    public a g;
    public a h;

    /* compiled from: AdaptiveSizeTextView.kt */
    public static final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }
    }

    /* compiled from: AdaptiveSizeTextView.kt */
    public static final class b {
        public int a;
        public float b;
        public float c;
    }

    public AdaptiveSizeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (Object) null);
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        b bVar = new b();
        bVar.a = 0;
        bVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = bVar;
        textPaint.setTypeface(getTypeface());
    }

    public final b e(int i) {
        a aVar = this.g;
        a aVar2 = this.h;
        b bVar = this.d;
        if (aVar == null || aVar2 == null) {
            bVar.a = getMeasuredHeight();
            bVar.b = getTextSize();
            bVar.c = getLineSpacingExtra();
        } else {
            float f = aVar2.a;
            float f2 = 1.0f + f;
            int i2 = 0;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            while (true) {
                f2--;
                float f4 = aVar.a;
                if (f2 <= f4) {
                    f2 = f4;
                    break;
                }
                float f5 = aVar.b;
                float b2 = u11.b(aVar2.b, f5, f2 / (f - f4), f5);
                float y = (int) iah0.y(f2);
                TextPaint textPaint = this.c;
                textPaint.setTextSize(y);
                i2 = new StaticLayout(getText(), textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, b2, true).getHeight();
                if (i2 <= this.f) {
                    f3 = b2;
                    break;
                }
                f3 = b2;
            }
            bVar.b = f2;
            bVar.a = i2;
            bVar.c = f3;
        }
        return bVar;
    }

    public final a getMaxSizeParams() {
        return this.h;
    }

    public final a getMinSizeParams() {
        return this.g;
    }

    public final int getPreferredHeight() {
        return this.f;
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        CharSequence text;
        super.layout(i, i2, i3, i4);
        int i5 = i3 - i;
        if (i5 != this.e) {
            this.e = i5;
            if (this.f <= 0 || (text = getText()) == null || text.length() == 0) {
                return;
            }
            b e = e(getMeasuredWidth());
            setTextSize(2, e.b);
            setLineSpacing(e.c - ((getLineHeight() - getTextSize()) / 2), 1.0f);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        CharSequence text;
        super.onMeasure(i, i2);
        if (this.f <= 0 || (text = getText()) == null || text.length() == 0) {
            return;
        }
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingLeft();
        b e = e(size);
        setTextSize(2, e.b);
        setLineSpacing(e.c - ((getLineHeight() - getTextSize()) / 2), 1.0f);
        setMeasuredDimension(size, e.a);
    }

    public final void setMaxSizeParams(a aVar) {
        this.h = aVar;
    }

    public final void setMinSizeParams(a aVar) {
        this.g = aVar;
    }

    public final void setPreferredHeight(int i) {
        this.f = i;
    }
}
