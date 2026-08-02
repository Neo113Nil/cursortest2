package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import j7.C7292a;

/* loaded from: classes9.dex */
final class a extends c {
    @Override // com.google.android.material.tabs.c
    final void b(TabLayout tabLayout, View view, View view2, float f7, @NonNull Drawable drawable) {
        float cos;
        float f11;
        RectF a11 = c.a(tabLayout, view);
        RectF a12 = c.a(tabLayout, view2);
        if (a11.left < a12.left) {
            double d11 = (f7 * 3.141592653589793d) / 2.0d;
            f11 = (float) (1.0d - Math.cos(d11));
            cos = (float) Math.sin(d11);
        } else {
            double d12 = (f7 * 3.141592653589793d) / 2.0d;
            float sin = (float) Math.sin(d12);
            cos = (float) (1.0d - Math.cos(d12));
            f11 = sin;
        }
        drawable.setBounds(C7292a.c(f11, (int) a11.left, (int) a12.left), drawable.getBounds().top, C7292a.c(cos, (int) a11.right, (int) a12.right), drawable.getBounds().bottom);
    }
}
