package og;

import android.content.res.Resources;

/* loaded from: classes4.dex */
public abstract class k {
    public static final int a(float f10) {
        return (int) (f10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final int b(int i10) {
        return (int) (i10 * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final float c(float f10) {
        return f10 * Resources.getSystem().getDisplayMetrics().density;
    }

    public static final float d(int i10) {
        return i10 * Resources.getSystem().getDisplayMetrics().density;
    }
}
