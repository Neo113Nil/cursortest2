package com.vk.attachpicker.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* compiled from: AspectRatioDelegate.java */
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: AspectRatioDelegate.java */
    /* renamed from: com.vk.attachpicker.widget.a$a, reason: collision with other inner class name */
    public static class C0396a {
        public final int a;
        public final int b;

        public C0396a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    @NonNull
    public static C0396a a(float f, int i, int i2, int i3, boolean z) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = i3 == 0 ? size : Math.min(size, i3);
        float f2 = size2;
        float f3 = size / f2;
        if (f == 1.0f) {
            int min2 = Math.min(min, size2);
            size2 = Math.min(min, size2);
            min = min2;
        } else if (!z || (f <= 1.0f ? f3 < f : f3 <= f)) {
            size2 = (int) (min / f);
        } else {
            min = (int) (f2 * f);
        }
        return new C0396a(min, size2);
    }
}
