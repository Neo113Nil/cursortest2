package La;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;
import ia.c;
import l.AbstractC5335a;

/* loaded from: classes3.dex */
public abstract class a {
    private static final int[] ANDROID_THEME_OVERLAY_ATTRS = {R.attr.theme, AbstractC5335a.f54983P};
    private static final int[] MATERIAL_THEME_OVERLAY_ATTR = {c.f48210O};

    public static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_THEME_OVERLAY_ATTRS);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    public static int[] b(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        int[] iArr2 = new int[iArr.length];
        if (iArr.length > 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
            for (int i12 = 0; i12 < iArr.length; i12++) {
                iArr2[i12] = obtainStyledAttributes.getResourceId(i12, 0);
            }
            obtainStyledAttributes.recycle();
        }
        return iArr2;
    }

    public static int c(Context context, AttributeSet attributeSet, int i10, int i11) {
        return b(context, attributeSet, MATERIAL_THEME_OVERLAY_ATTR, i10, i11)[0];
    }

    public static Context d(Context context, AttributeSet attributeSet, int i10, int i11) {
        return e(context, attributeSet, i10, i11, new int[0]);
    }

    public static Context e(Context context, AttributeSet attributeSet, int i10, int i11, int[] iArr) {
        int c10 = c(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof d) && ((d) context).c() == c10;
        if (c10 == 0 || z10) {
            return context;
        }
        d dVar = new d(context, c10);
        for (int i12 : b(context, attributeSet, iArr, i10, i11)) {
            if (i12 != 0) {
                dVar.getTheme().applyStyle(i12, true);
            }
        }
        int a10 = a(context, attributeSet);
        if (a10 != 0) {
            dVar.getTheme().applyStyle(a10, true);
        }
        return dVar;
    }
}
