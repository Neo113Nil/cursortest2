package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.d51;
import defpackage.g7a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ModalLayoutLandscape extends d51 {
    public View e;
    public View f;
    public View g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;

    public ModalLayoutLandscape(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i7 = this.k;
        int i8 = this.l;
        if (i7 < i8) {
            i6 = (i8 - i7) / 2;
            i5 = 0;
        } else {
            i5 = (i7 - i8) / 2;
            i6 = 0;
        }
        int i9 = i6 + paddingTop;
        int e = d51.e(this.e) + paddingLeft;
        this.e.layout(paddingLeft, i9, e, d51.d(this.e) + i9);
        int i10 = e + this.i;
        int i11 = paddingTop + i5;
        int d = d51.d(this.f) + i11;
        this.f.layout(i10, i11, measuredWidth, d);
        int i12 = d + (this.f.getVisibility() == 8 ? 0 : this.j);
        int d2 = d51.d(this.g) + i12;
        this.g.layout(i10, i12, measuredWidth, d2);
        int i13 = d2 + (this.g.getVisibility() != 8 ? this.j : 0);
        View view = this.h;
        view.layout(i10, i13, d51.e(view) + i10, d51.d(view) + i13);
    }

    @Override // defpackage.d51, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.e = c(R.id.image_view);
        this.f = c(R.id.message_title);
        this.g = c(R.id.body_scroll);
        this.h = c(R.id.button);
        int visibility = this.e.getVisibility();
        DisplayMetrics displayMetrics = this.c;
        int i3 = 0;
        this.i = visibility == 8 ? 0 : (int) Math.floor(TypedValue.applyDimension(1, 24.0f, displayMetrics));
        this.j = (int) Math.floor(TypedValue.applyDimension(1, 24.0f, displayMetrics));
        List asList = Arrays.asList(this.f, this.g, this.h);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int b = b(i);
        int a = a(i2) - paddingTop;
        int i4 = b - paddingRight;
        g7a.B(this.e, (int) (i4 * 0.4f), a);
        int e = d51.e(this.e);
        int i5 = i4 - (this.i + e);
        Iterator it = asList.iterator();
        int i6 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i6++;
            }
        }
        int max = Math.max(0, (i6 - 1) * this.j);
        int i7 = a - max;
        g7a.B(this.f, i5, i7);
        g7a.B(this.h, i5, i7);
        g7a.B(this.g, i5, (i7 - d51.d(this.f)) - d51.d(this.h));
        this.k = d51.d(this.e);
        this.l = max;
        Iterator it2 = asList.iterator();
        while (it2.hasNext()) {
            this.l = d51.d((View) it2.next()) + this.l;
        }
        int max2 = Math.max(this.k + paddingTop, this.l + paddingTop);
        Iterator it3 = asList.iterator();
        while (it3.hasNext()) {
            i3 = Math.max(d51.e((View) it3.next()), i3);
        }
        setMeasuredDimension(e + i3 + this.i + paddingRight, max2);
    }
}
