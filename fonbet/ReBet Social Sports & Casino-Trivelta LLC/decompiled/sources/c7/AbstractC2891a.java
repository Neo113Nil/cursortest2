package c7;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: c7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2891a {

    /* renamed from: c7.a$a, reason: collision with other inner class name */
    public static class C0443a {

        /* renamed from: a, reason: collision with root package name */
        public int f27608a;

        /* renamed from: b, reason: collision with root package name */
        public int f27609b;
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == -2;
    }

    public static void b(C0443a c0443a, float f10, ViewGroup.LayoutParams layoutParams, int i10, int i11) {
        if (f10 <= 0.0f || layoutParams == null) {
            return;
        }
        if (a(layoutParams.height)) {
            c0443a.f27609b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0443a.f27608a) - i10) / f10) + i11), c0443a.f27609b), 1073741824);
        } else if (a(layoutParams.width)) {
            c0443a.f27608a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) (((View.MeasureSpec.getSize(c0443a.f27609b) - i11) * f10) + i10), c0443a.f27608a), 1073741824);
        }
    }
}
