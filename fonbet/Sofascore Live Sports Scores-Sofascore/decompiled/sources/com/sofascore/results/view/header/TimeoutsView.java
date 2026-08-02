package com.sofascore.results.view.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.sofascore.results.R;
import defpackage.ao2;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/view/header/TimeoutsView;", "Landroid/view/View;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TimeoutsView extends View {
    public final int a;
    public final int b;
    public final int c;
    public final Paint d;
    public final Paint e;
    public int f;
    public int g;
    public final Rect h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeoutsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        context.getClass();
        this.a = ao2.s(4, context);
        this.b = ao2.s(4, context);
        this.c = ao2.s(2, context);
        Paint paint = new Paint();
        paint.setColor(context.getColor(R.color.stayDarkSecondary));
        this.d = paint;
        Paint paint2 = new Paint();
        paint2.setColor(context.getColor(R.color.on_color_highlight_1));
        this.e = paint2;
        this.h = new Rect();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        int i = this.f;
        int i2 = 0;
        while (i2 < i) {
            Rect rect = this.h;
            rect.offsetTo((rect.width() + this.c) * i2, getPaddingTop());
            canvas.drawRect(rect, i2 < this.g ? this.d : this.e);
            i2++;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.c;
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            int i5 = this.f;
            int i6 = this.b * i5;
            int i7 = i5 - 1;
            if (i7 < 0) {
                i7 = 0;
            }
            size = getPaddingRight() + getPaddingLeft() + (i7 * i4) + i6;
        }
        if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop() + this.a;
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        if (this.f > 0) {
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i8 = this.f;
            i3 = (paddingLeft - ((i8 - 1) * i4)) / i8;
        } else {
            i3 = 0;
        }
        this.h.set(0, 0, i3, paddingTop);
        setMeasuredDimension(size, size2);
    }
}
