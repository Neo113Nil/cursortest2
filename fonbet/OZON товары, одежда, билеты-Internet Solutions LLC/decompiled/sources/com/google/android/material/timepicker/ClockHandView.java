package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.Y;
import i7.C7017a;
import java.util.ArrayList;
import java.util.Iterator;
import ru.ozon.app.android.R;

/* loaded from: classes9.dex */
class ClockHandView extends View {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f58816a;

    /* renamed from: b, reason: collision with root package name */
    private final int f58817b;

    /* renamed from: c, reason: collision with root package name */
    private final float f58818c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f58819d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f58820e;

    /* renamed from: f, reason: collision with root package name */
    private final int f58821f;

    /* renamed from: g, reason: collision with root package name */
    private float f58822g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f58823h;

    /* renamed from: i, reason: collision with root package name */
    private double f58824i;

    /* renamed from: j, reason: collision with root package name */
    private int f58825j;

    public interface a {
        void a(float f7);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f58816a = new ArrayList();
        Paint paint = new Paint();
        this.f58819d = paint;
        this.f58820e = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7017a.f65944j, R.attr.materialClockStyle, R.style.Widget_MaterialComponents_TimePicker_Clock);
        this.f58825j = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f58817b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f58821f = getResources().getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f58818c = r4.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        e(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        int i11 = Y.f42258g;
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public final void a(a aVar) {
        this.f58816a.add(aVar);
    }

    public final RectF b() {
        return this.f58820e;
    }

    public final int c() {
        return this.f58817b;
    }

    public final void d(int i11) {
        this.f58825j = i11;
        invalidate();
    }

    public final void e(float f7) {
        float f11 = f7 % 360.0f;
        this.f58822g = f11;
        this.f58824i = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        float cos = (this.f58825j * ((float) Math.cos(this.f58824i))) + (getWidth() / 2);
        float sin = (this.f58825j * ((float) Math.sin(this.f58824i))) + height;
        float f12 = this.f58817b;
        this.f58820e.set(cos - f12, sin - f12, cos + f12, sin + f12);
        Iterator it = this.f58816a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(f11);
        }
        invalidate();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float cos = (this.f58825j * ((float) Math.cos(this.f58824i))) + width;
        float f7 = height;
        float sin = (this.f58825j * ((float) Math.sin(this.f58824i))) + f7;
        Paint paint = this.f58819d;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f58817b, paint);
        double sin2 = Math.sin(this.f58824i);
        double cos2 = Math.cos(this.f58824i);
        paint.setStrokeWidth(this.f58821f);
        canvas.drawLine(width, f7, r1 + ((int) (cos2 * r5)), height + ((int) (r5 * sin2)), paint);
        canvas.drawCircle(width, f7, this.f58818c, paint);
    }

    @Override // android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        e(this.f58822g);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        boolean z13 = false;
        if (actionMasked == 0) {
            this.f58823h = false;
            z11 = true;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z12 = this.f58823h;
            z11 = false;
        } else {
            z12 = false;
            z11 = false;
        }
        boolean z14 = this.f58823h;
        int degrees = (int) Math.toDegrees(Math.atan2(y11 - (getHeight() / 2), x11 - (getWidth() / 2)));
        int i11 = degrees + 90;
        if (i11 < 0) {
            i11 = degrees + 450;
        }
        float f7 = i11;
        boolean z15 = this.f58822g != f7;
        if (!z11 || !z15) {
            if (z15 || z12) {
                e(f7);
            }
            this.f58823h = z14 | z13;
            return true;
        }
        z13 = true;
        this.f58823h = z14 | z13;
        return true;
    }
}
