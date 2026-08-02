package ta;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import ia.e;
import ia.m;
import xa.l;

/* renamed from: ta.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6455c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray i12 = l.i(context, null, m.MaterialAlertDialog, i10, i11, new int[0]);
        int dimensionPixelSize = i12.getDimensionPixelSize(m.f48721N2, context.getResources().getDimensionPixelSize(e.f48335c0));
        int dimensionPixelSize2 = i12.getDimensionPixelSize(m.f48731O2, context.getResources().getDimensionPixelSize(e.f48337d0));
        int dimensionPixelSize3 = i12.getDimensionPixelSize(m.f48711M2, context.getResources().getDimensionPixelSize(e.f48333b0));
        int dimensionPixelSize4 = i12.getDimensionPixelSize(m.f48701L2, context.getResources().getDimensionPixelSize(e.f48331a0));
        i12.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i13 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i13, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
