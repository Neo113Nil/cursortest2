package com.google.android.material.datepicker;

import android.view.View;
import androidx.core.view.C5353y0;

/* loaded from: classes9.dex */
final class q implements androidx.core.view.D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f58297a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f58298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f58299c;

    q(View view, int i11, int i12) {
        this.f58297a = i11;
        this.f58298b = view;
        this.f58299c = i12;
    }

    @Override // androidx.core.view.D
    public final C5353y0 onApplyWindowInsets(View view, C5353y0 c5353y0) {
        int i11 = c5353y0.f(7).f42127b;
        View view2 = this.f58298b;
        int i12 = this.f58297a;
        if (i12 >= 0) {
            view2.getLayoutParams().height = i12 + i11;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f58299c + i11, view2.getPaddingRight(), view2.getPaddingBottom());
        return c5353y0;
    }
}
