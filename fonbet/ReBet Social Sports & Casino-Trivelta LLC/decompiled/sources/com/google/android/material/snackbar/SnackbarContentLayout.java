package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ia.c;
import ia.e;
import ia.g;
import ja.AbstractC5104a;
import sa.AbstractC6344a;
import za.h;

/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements Ha.a {

    /* renamed from: a, reason: collision with root package name */
    public TextView f36124a;

    /* renamed from: b, reason: collision with root package name */
    public Button f36125b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f36126c;

    /* renamed from: d, reason: collision with root package name */
    public int f36127d;

    public SnackbarContentLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36126c = h.g(context, c.f48225b0, AbstractC5104a.f53859b);
    }

    public static void d(View view, int i10, int i11) {
        if (view.isPaddingRelative()) {
            view.setPaddingRelative(view.getPaddingStart(), i10, view.getPaddingEnd(), i11);
        } else {
            view.setPadding(view.getPaddingLeft(), i10, view.getPaddingRight(), i11);
        }
    }

    @Override // Ha.a
    public void a(int i10, int i11) {
        this.f36124a.setAlpha(0.0f);
        long j10 = i11;
        long j11 = i10;
        this.f36124a.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f36126c).setStartDelay(j11).start();
        if (this.f36125b.getVisibility() == 0) {
            this.f36125b.setAlpha(0.0f);
            this.f36125b.animate().alpha(1.0f).setDuration(j10).setInterpolator(this.f36126c).setStartDelay(j11).start();
        }
    }

    @Override // Ha.a
    public void b(int i10, int i11) {
        this.f36124a.setAlpha(1.0f);
        long j10 = i11;
        long j11 = i10;
        this.f36124a.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f36126c).setStartDelay(j11).start();
        if (this.f36125b.getVisibility() == 0) {
            this.f36125b.setAlpha(1.0f);
            this.f36125b.animate().alpha(0.0f).setDuration(j10).setInterpolator(this.f36126c).setStartDelay(j11).start();
        }
    }

    public void c(float f10) {
        if (f10 != 1.0f) {
            this.f36125b.setTextColor(AbstractC6344a.j(AbstractC6344a.d(this, c.f48260t), this.f36125b.getCurrentTextColor(), f10));
        }
    }

    public final boolean e(int i10, int i11, int i12) {
        boolean z10;
        if (i10 != getOrientation()) {
            setOrientation(i10);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f36124a.getPaddingTop() == i11 && this.f36124a.getPaddingBottom() == i12) {
            return z10;
        }
        d(this.f36124a, i11, i12);
        return true;
    }

    public Button getActionView() {
        return this.f36125b;
    }

    public TextView getMessageView() {
        return this.f36124a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f36124a = (TextView) findViewById(g.f48428e0);
        this.f36125b = (Button) findViewById(g.f48426d0);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(e.f48358o);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(e.f48356n);
        Layout layout = this.f36124a.getLayout();
        boolean z10 = layout != null && layout.getLineCount() > 1;
        if (!z10 || this.f36127d <= 0 || this.f36125b.getMeasuredWidth() <= this.f36127d) {
            if (!z10) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setMaxInlineActionWidth(int i10) {
        this.f36127d = i10;
    }
}
