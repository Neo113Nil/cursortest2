package L2;

import android.view.View;

/* loaded from: classes.dex */
public abstract class N extends L {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f6780f = true;

    public static class a {
        public static void a(View view, int i10, int i11, int i12, int i13) {
            view.setLeftTopRightBottom(i10, i11, i12, i13);
        }
    }

    @Override // L2.I
    public void d(View view, int i10, int i11, int i12, int i13) {
        if (f6780f) {
            try {
                a.a(view, i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f6780f = false;
            }
        }
    }
}
