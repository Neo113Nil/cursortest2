package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import j7.C7292a;

/* loaded from: classes9.dex */
final class b extends c {
    @Override // com.google.android.material.tabs.c
    final void b(TabLayout tabLayout, View view, View view2, float f7, @NonNull Drawable drawable) {
        if (f7 >= 0.5f) {
            view = view2;
        }
        RectF a11 = c.a(tabLayout, view);
        float b11 = f7 < 0.5f ? C7292a.b(1.0f, 0.0f, 0.0f, 0.5f, f7) : C7292a.b(0.0f, 1.0f, 0.5f, 1.0f, f7);
        drawable.setBounds((int) a11.left, drawable.getBounds().top, (int) a11.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b11 * 255.0f));
    }
}
