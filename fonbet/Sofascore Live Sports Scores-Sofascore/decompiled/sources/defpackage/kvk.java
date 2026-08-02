package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class kvk {
    public static final mvk a;
    public static final e51 b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new nvk();
        } else {
            a = new mvk();
        }
        b = new e51(18, "translationAlpha", Float.class);
        new e51(19, "clipBounds", Rect.class);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.o0(view, i, i2, i3, i4);
    }

    public static void b(int i, View view) {
        a.p0(i, view);
    }
}
