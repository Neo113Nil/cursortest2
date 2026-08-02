package Ka;

import Ca.b;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C2068x;
import ia.c;
import ia.m;

/* loaded from: classes3.dex */
public class a extends C2068x {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean g(Context context) {
        return b.b(context, c.f48265v0, true);
    }

    public static int h(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.MaterialTextView, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(m.f49065w4, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int j(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = Ca.c.d(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    public static boolean k(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, m.MaterialTextView, i10, i11);
        int j10 = j(context, obtainStyledAttributes, m.f49075x4, m.f49085y4);
        obtainStyledAttributes.recycle();
        return j10 != -1;
    }

    public final void f(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, m.MaterialTextAppearance);
        int j10 = j(getContext(), obtainStyledAttributes, m.f49035t4, m.f49055v4);
        obtainStyledAttributes.recycle();
        if (j10 >= 0) {
            setLineHeight(j10);
        }
    }

    public final void i(AttributeSet attributeSet, int i10, int i11) {
        int h10;
        Context context = getContext();
        if (g(context)) {
            Resources.Theme theme = context.getTheme();
            if (k(context, theme, attributeSet, i10, i11) || (h10 = h(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            f(theme, h10);
        }
    }

    @Override // androidx.appcompat.widget.C2068x, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (g(context)) {
            f(context.getTheme(), i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        i(attributeSet, i10, 0);
    }
}
