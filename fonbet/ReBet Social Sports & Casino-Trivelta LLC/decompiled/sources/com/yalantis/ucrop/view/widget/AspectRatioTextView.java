package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C2068x;
import com.yalantis.ucrop.model.AspectRatio;
import fd.b;
import fd.c;
import fd.i;
import java.util.Locale;
import l0.AbstractC5338c;

/* loaded from: classes4.dex */
public class AspectRatioTextView extends C2068x {

    /* renamed from: a, reason: collision with root package name */
    public final float f42365a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f42366b;

    /* renamed from: c, reason: collision with root package name */
    public Paint f42367c;

    /* renamed from: d, reason: collision with root package name */
    public int f42368d;

    /* renamed from: e, reason: collision with root package name */
    public float f42369e;

    /* renamed from: f, reason: collision with root package name */
    public String f42370f;

    /* renamed from: g, reason: collision with root package name */
    public float f42371g;

    /* renamed from: h, reason: collision with root package name */
    public float f42372h;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void i() {
        if (TextUtils.isEmpty(this.f42370f)) {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f42371g), Integer.valueOf((int) this.f42372h)));
        } else {
            setText(this.f42370f);
        }
    }

    public final void f(int i10) {
        Paint paint = this.f42367c;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i10, AbstractC5338c.getColor(getContext(), b.f46616k)}));
    }

    public float g(boolean z10) {
        if (z10) {
            j();
            i();
        }
        return this.f42369e;
    }

    public final void h(TypedArray typedArray) {
        setGravity(1);
        this.f42370f = typedArray.getString(i.f46667a);
        this.f42371g = typedArray.getFloat(i.f46668b, 0.0f);
        float f10 = typedArray.getFloat(i.f46669c, 0.0f);
        this.f42372h = f10;
        float f11 = this.f42371g;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.f42369e = 0.0f;
        } else {
            this.f42369e = f11 / f10;
        }
        this.f42368d = getContext().getResources().getDimensionPixelSize(c.f46626h);
        Paint paint = new Paint(1);
        this.f42367c = paint;
        paint.setStyle(Paint.Style.FILL);
        i();
        f(getResources().getColor(b.f46617l));
        typedArray.recycle();
    }

    public final void j() {
        if (this.f42369e != 0.0f) {
            float f10 = this.f42371g;
            float f11 = this.f42372h;
            this.f42371g = f11;
            this.f42372h = f10;
            this.f42369e = f11 / f10;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f42366b);
            Rect rect = this.f42366b;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i10 = this.f42368d;
            canvas.drawCircle(f10, f11 - (i10 * 1.5f), i10 / 2.0f, this.f42367c);
        }
    }

    public void setActiveColor(int i10) {
        f(i10);
        invalidate();
    }

    public void setAspectRatio(@NonNull AspectRatio aspectRatio) {
        this.f42370f = aspectRatio.a();
        this.f42371g = aspectRatio.b();
        float c10 = aspectRatio.c();
        this.f42372h = c10;
        float f10 = this.f42371g;
        if (f10 == 0.0f || c10 == 0.0f) {
            this.f42369e = 0.0f;
        } else {
            this.f42369e = f10 / c10;
        }
        i();
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42365a = 1.5f;
        this.f42366b = new Rect();
        h(context.obtainStyledAttributes(attributeSet, i.ucrop_AspectRatioTextView));
    }
}
