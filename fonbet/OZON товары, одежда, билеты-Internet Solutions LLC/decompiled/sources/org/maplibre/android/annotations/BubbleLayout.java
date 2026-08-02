package org.maplibre.android.annotations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import org.maplibre.android.e;

@Deprecated
/* loaded from: classes10.dex */
public class BubbleLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private a f79574a;

    /* renamed from: b, reason: collision with root package name */
    private float f79575b;

    /* renamed from: c, reason: collision with root package name */
    private float f79576c;

    /* renamed from: d, reason: collision with root package name */
    private float f79577d;

    /* renamed from: e, reason: collision with root package name */
    private float f79578e;

    /* renamed from: f, reason: collision with root package name */
    private b f79579f;

    /* renamed from: g, reason: collision with root package name */
    private int f79580g;

    /* renamed from: h, reason: collision with root package name */
    private float f79581h;

    /* renamed from: i, reason: collision with root package name */
    private int f79582i;

    public BubbleLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f79622a);
        this.f79574a = new a(obtainStyledAttributes.getInt(0, 0));
        this.f79575b = obtainStyledAttributes.getDimension(3, (context.getResources().getDisplayMetrics().densityDpi / 160) * 8.0f);
        this.f79576c = obtainStyledAttributes.getDimension(1, 8.0f * (context.getResources().getDisplayMetrics().densityDpi / 160));
        this.f79577d = obtainStyledAttributes.getDimension(2, 12.0f * (context.getResources().getDisplayMetrics().densityDpi / 160));
        this.f79578e = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f79580g = obtainStyledAttributes.getColor(4, -1);
        this.f79581h = obtainStyledAttributes.getDimension(7, -1.0f);
        this.f79582i = obtainStyledAttributes.getColor(6, -7829368);
        obtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int a11 = this.f79574a.a();
        float f7 = this.f79575b;
        if (a11 == 0) {
            paddingLeft = (int) (paddingLeft + f7);
        } else if (a11 != 1) {
            float f11 = this.f79576c;
            if (a11 == 2) {
                paddingTop = (int) (paddingTop + f11);
            } else if (a11 == 3) {
                paddingBottom = (int) (paddingBottom + f11);
            }
        } else {
            paddingRight = (int) (paddingRight + f7);
        }
        float f12 = this.f79581h;
        if (f12 > 0.0f) {
            paddingLeft = (int) (paddingLeft + f12);
            paddingRight = (int) (paddingRight + f12);
            paddingTop = (int) (paddingTop + f12);
            paddingBottom = (int) (paddingBottom + f12);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    @NonNull
    public final void b(float f7) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int a11 = this.f79574a.a();
        float f11 = this.f79575b;
        if (a11 == 0) {
            paddingLeft = (int) (paddingLeft - f11);
        } else if (a11 != 1) {
            float f12 = this.f79576c;
            if (a11 == 2) {
                paddingTop = (int) (paddingTop - f12);
            } else if (a11 == 3) {
                paddingBottom = (int) (paddingBottom - f12);
            }
        } else {
            paddingRight = (int) (paddingRight - f11);
        }
        float f13 = this.f79581h;
        if (f13 > 0.0f) {
            paddingLeft = (int) (paddingLeft - f13);
            paddingRight = (int) (paddingRight - f13);
            paddingTop = (int) (paddingTop - f13);
            paddingBottom = (int) (paddingBottom - f13);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        this.f79577d = f7;
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(@NonNull Canvas canvas) {
        b bVar = this.f79579f;
        if (bVar != null) {
            bVar.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        int width = getWidth();
        int height = getHeight();
        if (width < 0 || height < 0) {
            return;
        }
        float f7 = 0;
        this.f79579f = new b(new RectF(f7, f7, width, height), this.f79574a, this.f79575b, this.f79576c, this.f79577d, this.f79578e, this.f79580g, this.f79581h, this.f79582i);
    }
}
