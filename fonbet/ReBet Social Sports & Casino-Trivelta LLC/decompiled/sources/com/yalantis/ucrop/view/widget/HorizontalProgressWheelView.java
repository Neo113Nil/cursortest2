package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import fd.b;
import fd.c;
import l0.AbstractC5338c;

/* loaded from: classes4.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f42373a;

    /* renamed from: b, reason: collision with root package name */
    public a f42374b;

    /* renamed from: c, reason: collision with root package name */
    public float f42375c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f42376d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f42377e;

    /* renamed from: f, reason: collision with root package name */
    public int f42378f;

    /* renamed from: g, reason: collision with root package name */
    public int f42379g;

    /* renamed from: h, reason: collision with root package name */
    public int f42380h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f42381i;

    /* renamed from: j, reason: collision with root package name */
    public float f42382j;

    /* renamed from: k, reason: collision with root package name */
    public int f42383k;

    public interface a {
        void a();

        void b();

        void c(float f10, float f11);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        this.f42383k = AbstractC5338c.getColor(getContext(), b.f46618m);
        this.f42378f = getContext().getResources().getDimensionPixelSize(c.f46627i);
        this.f42379g = getContext().getResources().getDimensionPixelSize(c.f46624f);
        this.f42380h = getContext().getResources().getDimensionPixelSize(c.f46625g);
        Paint paint = new Paint(1);
        this.f42376d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f42376d.setStrokeWidth(this.f42378f);
        this.f42376d.setColor(getResources().getColor(b.f46612g));
        Paint paint2 = new Paint(this.f42376d);
        this.f42377e = paint2;
        paint2.setColor(this.f42383k);
        this.f42377e.setStrokeCap(Paint.Cap.ROUND);
        this.f42377e.setStrokeWidth(getContext().getResources().getDimensionPixelSize(c.f46628j));
    }

    public final void b(MotionEvent motionEvent, float f10) {
        this.f42382j -= f10;
        postInvalidate();
        this.f42375c = motionEvent.getX();
        a aVar = this.f42374b;
        if (aVar != null) {
            aVar.c(-f10, this.f42382j);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f42373a);
        int width = this.f42373a.width() / (this.f42378f + this.f42380h);
        float f10 = this.f42382j % (r3 + r2);
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = width / 4;
            if (i10 < i11) {
                this.f42376d.setAlpha((int) ((i10 / i11) * 255.0f));
            } else if (i10 > (width * 3) / 4) {
                this.f42376d.setAlpha((int) (((width - i10) / i11) * 255.0f));
            } else {
                this.f42376d.setAlpha(255);
            }
            float f11 = -f10;
            Rect rect = this.f42373a;
            Rect rect2 = this.f42373a;
            canvas.drawLine(rect.left + f11 + ((this.f42378f + this.f42380h) * i10), rect.centerY() - (this.f42379g / 4.0f), f11 + rect2.left + ((this.f42378f + this.f42380h) * i10), rect2.centerY() + (this.f42379g / 4.0f), this.f42376d);
        }
        canvas.drawLine(this.f42373a.centerX(), this.f42373a.centerY() - (this.f42379g / 2.0f), this.f42373a.centerX(), (this.f42379g / 2.0f) + this.f42373a.centerY(), this.f42377e);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f42375c = motionEvent.getX();
        } else if (action == 1) {
            a aVar = this.f42374b;
            if (aVar != null) {
                this.f42381i = false;
                aVar.a();
            }
        } else if (action == 2) {
            float x10 = motionEvent.getX() - this.f42375c;
            if (x10 != 0.0f) {
                if (!this.f42381i) {
                    this.f42381i = true;
                    a aVar2 = this.f42374b;
                    if (aVar2 != null) {
                        aVar2.b();
                    }
                }
                b(motionEvent, x10);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i10) {
        this.f42383k = i10;
        this.f42377e.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(a aVar) {
        this.f42374b = aVar;
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42373a = new Rect();
        a();
    }
}
