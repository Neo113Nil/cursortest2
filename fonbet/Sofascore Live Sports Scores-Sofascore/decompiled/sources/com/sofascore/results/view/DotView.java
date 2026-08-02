package com.sofascore.results.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.results.R;
import defpackage.ujf;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sofascore/results/view/DotView;", "Landroid/view/View;", "", "filled", "", "setFilled", "(Z)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DotView extends View {
    public boolean a;
    public float b;
    public final Paint c;
    public final Paint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        this.a = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.c = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.d = paint2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ujf.g, 0, 0);
        int color = obtainStyledAttributes.getColor(0, context.getColor(R.color.secondary_default));
        paint.setColor(color);
        paint2.setColor(color);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        if (this.a) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.b, this.c);
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float f = this.b;
        Paint paint = this.d;
        canvas.drawCircle(width, height, f - (paint.getStrokeWidth() / 2.0f), paint);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > i2) {
            i = i2;
        }
        float f = i / 2.0f;
        this.b = f;
        this.d.setStrokeWidth(f / 2.0f);
    }

    public final void setFilled(boolean filled) {
        this.a = filled;
        invalidate();
    }
}
