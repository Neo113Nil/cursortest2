package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.facebook.shimmer.a;

/* loaded from: classes8.dex */
public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final b f57738a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f57739b;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a.b c0875a;
        Paint paint = new Paint();
        b bVar = new b();
        this.f57738a = bVar;
        this.f57739b = true;
        setWillNotDraw(false);
        bVar.setCallback(this);
        if (attributeSet == null) {
            a a11 = new a.C0875a().a();
            bVar.b(a11);
            if (a11.f57753n) {
                setLayerType(2, paint);
                return;
            } else {
                setLayerType(0, null);
                return;
            }
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D6.a.f6096a, 0, 0);
        try {
            if (obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.getBoolean(4, false)) {
                c0875a = new a.c();
                c0875a.f57760a.f57755p = false;
            } else {
                c0875a = new a.C0875a();
            }
            a a12 = c0875a.b(obtainStyledAttributes).a();
            bVar.b(a12);
            if (a12.f57753n) {
                setLayerType(2, paint);
            } else {
                setLayerType(0, null);
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void a() {
        this.f57738a.c();
    }

    public final void b() {
        this.f57738a.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f57739b) {
            this.f57738a.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57738a.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f57738a.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(@NonNull Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f57738a;
    }
}
