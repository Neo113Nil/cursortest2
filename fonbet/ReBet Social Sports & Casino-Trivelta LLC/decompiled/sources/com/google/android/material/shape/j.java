package com.google.android.material.shape;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class j {
    public static e a(int i10) {
        return i10 != 0 ? i10 != 1 ? b() : new f() : new m();
    }

    public static e b() {
        return new m();
    }

    public static g c() {
        return new g();
    }

    public static void d(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof i) {
            ((i) background).e0(f10);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof i) {
            f(view, (i) background);
        }
    }

    public static void f(View view, i iVar) {
        if (iVar.V()) {
            iVar.j0(xa.o.h(view));
        }
    }
}
