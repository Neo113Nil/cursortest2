package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xc0 {
    public final TextView a;
    public a08 b;
    public a08 c;
    public a08 d;
    public a08 e;
    public a08 f;
    public a08 g;
    public a08 h;
    public final fd0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public xc0(TextView textView) {
        this.a = textView;
        this.i = new fd0(textView);
    }

    public static a08 c(Context context, xb0 xb0Var, int i) {
        ColorStateList f;
        synchronized (xb0Var) {
            f = xb0Var.a.f(i, context);
        }
        if (f == null) {
            return null;
        }
        a08 a08Var = new a08();
        a08Var.b = true;
        a08Var.c = f;
        return a08Var;
    }

    public final void a(Drawable drawable, a08 a08Var) {
        if (drawable == null || a08Var == null) {
            return;
        }
        int[] drawableState = this.a.getDrawableState();
        PorterDuff.Mode mode = xb0.b;
        t1g.h(drawable, a08Var, drawableState);
    }

    public final void b() {
        a08 a08Var = this.b;
        TextView textView = this.a;
        if (a08Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        a08 a08Var = this.h;
        if (a08Var != null) {
            return (ColorStateList) a08Var.c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        a08 a08Var = this.h;
        if (a08Var != null) {
            return (PorterDuff.Mode) a08Var.d;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        int i2;
        ColorStateList colorStateList;
        int resourceId;
        int i3;
        int resourceId2;
        TextView textView = this.a;
        Context context = textView.getContext();
        xb0 a = xb0.a();
        int[] iArr = dkf.h;
        l2a y = l2a.y(i, 0, context, attributeSet, iArr);
        bsk.p(textView, textView.getContext(), iArr, attributeSet, (TypedArray) y.c, i);
        TypedArray typedArray = (TypedArray) y.c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.b = c(context, a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.c = c(context, a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.d = c(context, a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.g = c(context, a, typedArray.getResourceId(6, 0));
        }
        y.F();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = dkf.y;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            l2a l2aVar = new l2a(context, obtainStyledAttributes);
            if (z3 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m(context, l2aVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = obtainStyledAttributes.hasValue(13) ? obtainStyledAttributes.getString(13) : null;
            l2aVar.F();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        l2a l2aVar2 = new l2a(context, obtainStyledAttributes2);
        if (!z3 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (Build.VERSION.SDK_INT >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        m(context, l2aVar2);
        l2aVar2.F();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            vc0.d(textView, str);
        }
        if (str2 != null) {
            uc0.b(textView, uc0.a(str2));
        }
        fd0 fd0Var = this.i;
        Context context2 = fd0Var.j;
        int[] iArr3 = dkf.i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = fd0Var.i;
        bsk.p(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            fd0Var.a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i4 = 0; i4 < length; i4++) {
                    iArr4[i4] = obtainTypedArray.getDimensionPixelSize(i4, -1);
                }
                fd0Var.f = fd0.b(iArr4);
                fd0Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!fd0Var.i()) {
            fd0Var.a = 0;
        } else if (fd0Var.a == 1) {
            if (!fd0Var.g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i3 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i3 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                fd0Var.j(dimension2, dimension3, dimension);
            }
            fd0Var.g();
        }
        if (lvk.c && fd0Var.a != 0) {
            int[] iArr5 = fd0Var.f;
            if (iArr5.length > 0) {
                if (vc0.a(textView) != -1.0f) {
                    vc0.b(textView, Math.round(fd0Var.d), Math.round(fd0Var.e), Math.round(fd0Var.c), 0);
                } else {
                    vc0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b = resourceId4 != -1 ? a.b(resourceId4, context) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b2 = resourceId5 != -1 ? a.b(resourceId5, context) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b3 = resourceId6 != -1 ? a.b(resourceId6, context) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b4 = resourceId7 != -1 ? a.b(resourceId7, context) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b5 = resourceId8 != -1 ? a.b(resourceId8, context) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b6 = resourceId9 != -1 ? a.b(resourceId9, context) : null;
        if (b5 != null || b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b5 == null) {
                b5 = compoundDrawablesRelative[0];
            }
            if (b2 == null) {
                b2 = compoundDrawablesRelative[1];
            }
            if (b6 == null) {
                b6 = compoundDrawablesRelative[2];
            }
            if (b4 == null) {
                b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b5, b2, b6, b4);
        } else if (b != null || b2 != null || b3 != null || b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b == null) {
                    b = compoundDrawables[0];
                }
                if (b2 == null) {
                    b2 = compoundDrawables[1];
                }
                if (b3 == null) {
                    b3 = compoundDrawables[2];
                }
                if (b4 == null) {
                    b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, b4);
            } else {
                if (b2 == null) {
                    b2 = compoundDrawablesRelative2[1];
                }
                if (b4 == null) {
                    b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b2, compoundDrawablesRelative2[2], b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = eq3.q(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(fb5.c(obtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i5 = peekValue.data;
                i2 = i5 & 15;
                f = TypedValue.complexToFloat(i5);
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != -1) {
                    i9a.I(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != -1) {
                    i9a.J(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i2 == -1) {
                        i9a.K(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        q9.H(textView, i2, f);
                        return;
                    } else {
                        i9a.K(textView, Math.round(TypedValue.applyDimension(i2, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            f = -1.0f;
        }
        i2 = -1;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
        }
        if (dimensionPixelSize2 != -1) {
        }
        if (f == -1.0f) {
        }
    }

    public final void g(int i, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, dkf.y);
        l2a l2aVar = new l2a(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        m(context, l2aVar);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            vc0.d(textView, string);
        }
        l2aVar.F();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void h(int i, int i2, int i3, int i4) {
        fd0 fd0Var = this.i;
        if (fd0Var.i()) {
            DisplayMetrics displayMetrics = fd0Var.j.getResources().getDisplayMetrics();
            fd0Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (fd0Var.g()) {
                fd0Var.a();
            }
        }
    }

    public final void i(int[] iArr, int i) {
        fd0 fd0Var = this.i;
        if (fd0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = fd0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                fd0Var.f = fd0.b(iArr2);
                if (!fd0Var.h()) {
                    zzl.i(Arrays.toString(iArr), "None of the preset sizes is valid: ");
                    return;
                }
            } else {
                fd0Var.g = false;
            }
            if (fd0Var.g()) {
                fd0Var.a();
            }
        }
    }

    public final void j(int i) {
        fd0 fd0Var = this.i;
        if (fd0Var.i()) {
            if (i == 0) {
                fd0Var.a = 0;
                fd0Var.d = -1.0f;
                fd0Var.e = -1.0f;
                fd0Var.c = -1.0f;
                fd0Var.f = new int[0];
                fd0Var.b = false;
                return;
            }
            if (i != 1) {
                a70.p(ljg.j(i, "Unknown auto-size text type: "));
                return;
            }
            DisplayMetrics displayMetrics = fd0Var.j.getResources().getDisplayMetrics();
            fd0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (fd0Var.g()) {
                fd0Var.a();
            }
        }
    }

    public final void k(ColorStateList colorStateList) {
        a08 a08Var = this.h;
        if (a08Var == null) {
            a08Var = new a08();
            this.h = a08Var;
        }
        a08 a08Var2 = a08Var;
        a08Var.c = colorStateList;
        a08Var.b = colorStateList != null;
        this.b = a08Var2;
        this.c = a08Var2;
        this.d = a08Var2;
        this.e = a08Var2;
        this.f = a08Var2;
        this.g = a08Var2;
    }

    public final void l(PorterDuff.Mode mode) {
        a08 a08Var = this.h;
        if (a08Var == null) {
            a08Var = new a08();
            this.h = a08Var;
        }
        a08 a08Var2 = a08Var;
        a08Var.d = mode;
        a08Var.a = mode != null;
        this.b = a08Var2;
        this.c = a08Var2;
        this.d = a08Var2;
        this.e = a08Var2;
        this.f = a08Var2;
        this.g = a08Var2;
    }

    public final void m(Context context, l2a l2aVar) {
        String string;
        int i = this.j;
        TypedArray typedArray = (TypedArray) l2aVar.c;
        this.j = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.k = i3;
            if (i3 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface s = l2aVar.s(i5, this.j, new sc0(this, i6, i7, new WeakReference(this.a)));
                if (s != null) {
                    if (i2 < 28 || this.k == -1) {
                        this.l = s;
                    } else {
                        this.l = wc0.a(Typeface.create(s, 0), this.k, (this.j & 2) != 0);
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            this.l = Typeface.create(string, this.j);
        } else {
            this.l = wc0.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        }
    }
}
