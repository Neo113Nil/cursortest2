package com.vk.stories.design.view.live;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.story.avatar.R$styleable;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.iah0;
import xsna.m33;

/* compiled from: LiveShine.kt */
/* loaded from: classes6.dex */
public final class LiveShine extends FrameLayout {
    public final View b;
    public final float c;
    public final float d;
    public final Path e;

    public LiveShine(Context context) {
        this(context, null, 0, 14, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.e;
        if (!path.isEmpty()) {
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        Path path = this.e;
        path.reset();
        float f = this.d;
        float f2 = this.c;
        path.addRoundRect(f, f, i - f, i2 - f, f2, f2, Path.Direction.CW);
        super.onSizeChanged(i, i2, i3, i4);
    }

    public LiveShine(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public LiveShine(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ LiveShine(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public LiveShine(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        Drawable a;
        View view = new View(context);
        this.b = view;
        this.e = new Path();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, i, i2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, iah0.a(32.0f));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(1, iah0.a(20.0f));
        this.c = obtainStyledAttributes.getDimensionPixelSize(4, iah0.a(7.0f));
        this.d = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        if (obtainStyledAttributes.hasValue(2)) {
            a = obtainStyledAttributes.getDrawable(2);
        } else {
            a = m33.a(R.drawable.vk_icon_live_badge_20, context);
        }
        view.setBackground(a);
        obtainStyledAttributes.recycle();
        int i3 = dimensionPixelSize3 * 2;
        addView(view, new FrameLayout.LayoutParams(dimensionPixelSize - i3, dimensionPixelSize2 - i3));
        bwt0.e0(view, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
    }
}
