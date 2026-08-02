package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f780a;

    /* renamed from: b, reason: collision with root package name */
    public a4 f781b;

    /* renamed from: c, reason: collision with root package name */
    public a4 f782c;

    /* renamed from: d, reason: collision with root package name */
    public a4 f783d;

    /* renamed from: e, reason: collision with root package name */
    public a4 f784e;

    /* renamed from: f, reason: collision with root package name */
    public a4 f785f;

    /* renamed from: g, reason: collision with root package name */
    public a4 f786g;

    /* renamed from: h, reason: collision with root package name */
    public a4 f787h;

    /* renamed from: i, reason: collision with root package name */
    public final s1 f788i;
    public int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f789k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f790l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f791m;

    public j1(TextView textView) {
        this.f780a = textView;
        this.f788i = new s1(textView);
    }

    public static a4 c(Context context, b0 b0Var, int i5) {
        ColorStateList i10;
        synchronized (b0Var) {
            i10 = b0Var.f703a.i(context, i5);
        }
        if (i10 == null) {
            return null;
        }
        a4 a4Var = new a4();
        a4Var.f696b = true;
        a4Var.f697c = i10;
        return a4Var;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i5 >= 30) {
            r0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i5 >= 30) {
            r0.a.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            r0.b.c(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            r0.b.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            r0.b.c(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int min = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (i16 * 0.8d)));
        int min2 = Math.min(i12, i16 - min);
        int i17 = i12 - min2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + min) - 1))) {
            min--;
        }
        int i18 = min2 + i15;
        r0.b.c(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + min2), text.subSequence(i10, min + i10)) : text.subSequence(i17, i18 + min + i17), min2, i18);
    }

    public final void a(Drawable drawable, a4 a4Var) {
        if (drawable == null || a4Var == null) {
            return;
        }
        b0.e(drawable, a4Var, this.f780a.getDrawableState());
    }

    public final void b() {
        a4 a4Var = this.f781b;
        TextView textView = this.f780a;
        if (a4Var != null || this.f782c != null || this.f783d != null || this.f784e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f781b);
            a(compoundDrawables[1], this.f782c);
            a(compoundDrawables[2], this.f783d);
            a(compoundDrawables[3], this.f784e);
        }
        if (this.f785f == null && this.f786g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f785f);
        a(compoundDrawablesRelative[2], this.f786g);
    }

    public final ColorStateList d() {
        a4 a4Var = this.f787h;
        if (a4Var != null) {
            return (ColorStateList) a4Var.f697c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        a4 a4Var = this.f787h;
        if (a4Var != null) {
            return (PorterDuff.Mode) a4Var.f698d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AttributeSet attributeSet, int i5) {
        boolean z5;
        boolean z7;
        String str;
        String str2;
        int i10;
        float f6;
        int i11;
        ColorStateList colorStateList;
        int resourceId;
        int i12;
        int resourceId2;
        TextView textView = this.f780a;
        Context context = textView.getContext();
        b0 a7 = b0.a();
        int[] iArr = i.a.f10837h;
        c4 f10 = c4.f(context, attributeSet, iArr, i5, 0);
        androidx.core.view.z0.n(textView, textView.getContext(), iArr, attributeSet, f10.f722b, i5);
        TypedArray typedArray = f10.f722b;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f781b = c(context, a7, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f782c = c(context, a7, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f783d = c(context, a7, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f784e = c(context, a7, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f785f = c(context, a7, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f786g = c(context, a7, typedArray.getResourceId(6, 0));
        }
        f10.g();
        boolean z10 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = i.a.f10852y;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            c4 c4Var = new c4(context, obtainStyledAttributes);
            if (z10 || !obtainStyledAttributes.hasValue(14)) {
                z5 = false;
                z7 = false;
            } else {
                z7 = obtainStyledAttributes.getBoolean(14, false);
                z5 = true;
            }
            n(context, c4Var);
            int i13 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i13 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c4Var.g();
        } else {
            z5 = false;
            z7 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i5, 0);
        c4 c4Var2 = new c4(context, obtainStyledAttributes2);
        if (!z10 && obtainStyledAttributes2.hasValue(14)) {
            z7 = obtainStyledAttributes2.getBoolean(14, false);
            z5 = true;
        }
        boolean z11 = z7;
        int i14 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i14 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i14 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c4Var2);
        c4Var2.g();
        if (!z10 && z5) {
            textView.setAllCaps(z11);
        }
        Typeface typeface = this.f790l;
        if (typeface != null) {
            if (this.f789k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            h1.d(textView, str);
        }
        if (str3 != null) {
            if (i14 >= 24) {
                g1.b(textView, g1.a(str3));
            } else {
                textView.setTextLocale(f1.a(str3.split(StringUtils.COMMA)[0]));
            }
        }
        s1 s1Var = this.f788i;
        Context context2 = s1Var.j;
        int[] iArr3 = i.a.f10838i;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i5, 0);
        TextView textView2 = s1Var.f915i;
        androidx.core.view.z0.n(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i5);
        if (obtainStyledAttributes3.hasValue(5)) {
            s1Var.f907a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = obtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                s1Var.f912f = s1.b(iArr4);
                s1Var.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!s1Var.j()) {
            s1Var.f907a = 0;
        } else if (s1Var.f907a == 1) {
            if (!s1Var.f913g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i12 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i12 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i12, 112.0f, displayMetrics);
                }
                float f11 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                s1Var.k(dimension2, f11, dimension);
            }
            s1Var.h();
        }
        if (u4.f984c && s1Var.f907a != 0) {
            int[] iArr5 = s1Var.f912f;
            if (iArr5.length > 0) {
                if (h1.a(textView) != -1.0f) {
                    h1.b(textView, Math.round(s1Var.f910d), Math.round(s1Var.f911e), Math.round(s1Var.f909c), 0);
                } else {
                    h1.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b10 = resourceId4 != -1 ? a7.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b11 = resourceId5 != -1 ? a7.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b12 = resourceId6 != -1 ? a7.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b13 = resourceId7 != -1 ? a7.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b14 = resourceId8 != -1 ? a7.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b15 = resourceId9 != -1 ? a7.b(context, resourceId9) : null;
        if (b14 != null || b15 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (b14 == null) {
                b14 = compoundDrawablesRelative[0];
            }
            if (b11 == null) {
                b11 = compoundDrawablesRelative[1];
            }
            if (b15 == null) {
                b15 = compoundDrawablesRelative[2];
            }
            if (b13 == null) {
                b13 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(b14, b11, b15, b13);
        } else if (b10 != null || b11 != null || b12 != null || b13 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b10 == null) {
                    b10 = compoundDrawables[0];
                }
                if (b11 == null) {
                    b11 = compoundDrawables[1];
                }
                if (b12 == null) {
                    b12 = compoundDrawables[2];
                }
                if (b13 == null) {
                    b13 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b10, b11, b12, b13);
            } else {
                if (b11 == null) {
                    b11 = compoundDrawablesRelative2[1];
                }
                if (b13 == null) {
                    b13 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, b11, compoundDrawablesRelative2[2], b13);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = d0.c.c(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else if (textView instanceof androidx.core.widget.m) {
                ((androidx.core.widget.m) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode c2 = z1.c(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(c2);
            } else if (textView instanceof androidx.core.widget.m) {
                ((androidx.core.widget.m) textView).setSupportCompoundDrawablesTintMode(c2);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i16 = peekValue.data;
                int i17 = i16 & 15;
                f6 = TypedValue.complexToFloat(i16);
                i11 = i17;
                i10 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i10) {
                    com.google.android.play.core.appupdate.b.E(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i10) {
                    com.google.android.play.core.appupdate.b.F(textView, dimensionPixelSize2);
                }
                if (f6 == -1.0f) {
                    if (i11 == i10) {
                        com.google.android.play.core.appupdate.b.G(textView, (int) f6);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        androidx.core.view.h0.m(textView, i11, f6);
                        return;
                    } else {
                        com.google.android.play.core.appupdate.b.G(textView, Math.round(TypedValue.applyDimension(i11, f6, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i10 = -1;
            f6 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i10 = -1;
            f6 = -1.0f;
        }
        i11 = i10;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i10) {
        }
        if (dimensionPixelSize2 != i10) {
        }
        if (f6 == -1.0f) {
        }
    }

    public final void g(Context context, int i5) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i5, i.a.f10852y);
        c4 c4Var = new c4(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f780a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c4Var);
        if (i10 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            h1.d(textView, string);
        }
        c4Var.g();
        Typeface typeface = this.f790l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(int i5, int i10, int i11, int i12) {
        s1 s1Var = this.f788i;
        if (s1Var.j()) {
            DisplayMetrics displayMetrics = s1Var.j.getResources().getDisplayMetrics();
            s1Var.k(TypedValue.applyDimension(i12, i5, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (s1Var.h()) {
                s1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i5) {
        s1 s1Var = this.f788i;
        if (s1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i5 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = s1Var.j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArr2[i10] = Math.round(TypedValue.applyDimension(i5, iArr[i10], displayMetrics));
                    }
                }
                s1Var.f912f = s1.b(iArr2);
                if (!s1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                s1Var.f913g = false;
            }
            if (s1Var.h()) {
                s1Var.a();
            }
        }
    }

    public final void k(int i5) {
        s1 s1Var = this.f788i;
        if (s1Var.j()) {
            if (i5 == 0) {
                s1Var.f907a = 0;
                s1Var.f910d = -1.0f;
                s1Var.f911e = -1.0f;
                s1Var.f909c = -1.0f;
                s1Var.f912f = new int[0];
                s1Var.f908b = false;
                return;
            }
            if (i5 != 1) {
                throw new IllegalArgumentException(c1.i(i5, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = s1Var.j.getResources().getDisplayMetrics();
            s1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (s1Var.h()) {
                s1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.f787h == null) {
            this.f787h = new a4();
        }
        a4 a4Var = this.f787h;
        a4Var.f697c = colorStateList;
        a4Var.f696b = colorStateList != null;
        this.f781b = a4Var;
        this.f782c = a4Var;
        this.f783d = a4Var;
        this.f784e = a4Var;
        this.f785f = a4Var;
        this.f786g = a4Var;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.f787h == null) {
            this.f787h = new a4();
        }
        a4 a4Var = this.f787h;
        a4Var.f698d = mode;
        a4Var.f695a = mode != null;
        this.f781b = a4Var;
        this.f782c = a4Var;
        this.f783d = a4Var;
        this.f784e = a4Var;
        this.f785f = a4Var;
        this.f786g = a4Var;
    }

    public final void n(Context context, c4 c4Var) {
        String string;
        int i5 = this.j;
        TypedArray typedArray = c4Var.f722b;
        this.j = typedArray.getInt(2, i5);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f789k = i11;
            if (i11 != -1) {
                this.j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f791m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f790l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f790l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f790l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f790l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f789k;
        int i15 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface d10 = c4Var.d(i13, this.j, new d1(this, i14, i15, new WeakReference(this.f780a)));
                if (d10 != null) {
                    if (i10 < 28 || this.f789k == -1) {
                        this.f790l = d10;
                    } else {
                        this.f790l = i1.a(Typeface.create(d10, 0), this.f789k, (this.j & 2) != 0);
                    }
                }
                this.f791m = this.f790l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f790l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f789k == -1) {
            this.f790l = Typeface.create(string, this.j);
        } else {
            this.f790l = i1.a(Typeface.create(string, 0), this.f789k, (this.j & 2) != 0);
        }
    }
}
