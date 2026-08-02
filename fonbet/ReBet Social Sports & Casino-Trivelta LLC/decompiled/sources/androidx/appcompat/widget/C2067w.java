package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.k;
import androidx.core.view.AbstractC2082d0;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2067w {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f17368a;

    /* renamed from: b, reason: collision with root package name */
    public Y f17369b;

    /* renamed from: c, reason: collision with root package name */
    public Y f17370c;

    /* renamed from: d, reason: collision with root package name */
    public Y f17371d;

    /* renamed from: e, reason: collision with root package name */
    public Y f17372e;

    /* renamed from: f, reason: collision with root package name */
    public Y f17373f;

    /* renamed from: g, reason: collision with root package name */
    public Y f17374g;

    /* renamed from: h, reason: collision with root package name */
    public Y f17375h;

    /* renamed from: i, reason: collision with root package name */
    public final C2069y f17376i;

    /* renamed from: j, reason: collision with root package name */
    public int f17377j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f17378k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f17379l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17380m;

    /* renamed from: androidx.appcompat.widget.w$a */
    public class a extends k.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17381a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f17382b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f17383c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f17381a = i10;
            this.f17382b = i11;
            this.f17383c = weakReference;
        }

        @Override // androidx.core.content.res.k.e
        public void f(int i10) {
        }

        @Override // androidx.core.content.res.k.e
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f17381a) != -1) {
                typeface = e.a(typeface, i10, (this.f17382b & 2) != 0);
            }
            C2067w.this.n(this.f17383c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$b */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f17385a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f17386b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f17387c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f17385a = textView;
            this.f17386b = typeface;
            this.f17387c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17385a.setTypeface(this.f17386b, this.f17387c);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$c */
    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$d */
    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.w$e */
    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public C2067w(TextView textView) {
        this.f17368a = textView;
        this.f17376i = new C2069y(textView);
    }

    public static Y d(Context context, C2053h c2053h, int i10) {
        ColorStateList f10 = c2053h.f(context, i10);
        if (f10 == null) {
            return null;
        }
        Y y10 = new Y();
        y10.f17241d = true;
        y10.f17238a = f10;
        return y10;
    }

    public void A(int i10, float f10) {
        if (l0.f17341c || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f17376i.t(i10, f10);
    }

    public final void C(Context context, a0 a0Var) {
        String o10;
        this.f17377j = a0Var.k(l.j.f55357r2, this.f17377j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int k10 = a0Var.k(l.j.f55169A2, -1);
            this.f17378k = k10;
            if (k10 != -1) {
                this.f17377j &= 2;
            }
        }
        if (!a0Var.s(l.j.f55389z2) && !a0Var.s(l.j.f55173B2)) {
            if (a0Var.s(l.j.f55353q2)) {
                this.f17380m = false;
                int k11 = a0Var.k(l.j.f55353q2, 1);
                if (k11 == 1) {
                    this.f17379l = Typeface.SANS_SERIF;
                    return;
                } else if (k11 == 2) {
                    this.f17379l = Typeface.SERIF;
                    return;
                } else {
                    if (k11 != 3) {
                        return;
                    }
                    this.f17379l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f17379l = null;
        int i11 = a0Var.s(l.j.f55173B2) ? l.j.f55173B2 : l.j.f55389z2;
        int i12 = this.f17378k;
        int i13 = this.f17377j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = a0Var.j(i11, this.f17377j, new a(i12, i13, new WeakReference(this.f17368a)));
                if (j10 != null) {
                    if (i10 < 28 || this.f17378k == -1) {
                        this.f17379l = j10;
                    } else {
                        this.f17379l = e.a(Typeface.create(j10, 0), this.f17378k, (this.f17377j & 2) != 0);
                    }
                }
                this.f17380m = this.f17379l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f17379l != null || (o10 = a0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f17378k == -1) {
            this.f17379l = Typeface.create(o10, this.f17377j);
        } else {
            this.f17379l = e.a(Typeface.create(o10, 0), this.f17378k, (this.f17377j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, Y y10) {
        if (drawable == null || y10 == null) {
            return;
        }
        C2053h.i(drawable, y10, this.f17368a.getDrawableState());
    }

    public void b() {
        if (this.f17369b != null || this.f17370c != null || this.f17371d != null || this.f17372e != null) {
            Drawable[] compoundDrawables = this.f17368a.getCompoundDrawables();
            a(compoundDrawables[0], this.f17369b);
            a(compoundDrawables[1], this.f17370c);
            a(compoundDrawables[2], this.f17371d);
            a(compoundDrawables[3], this.f17372e);
        }
        if (this.f17373f == null && this.f17374g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f17368a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f17373f);
        a(compoundDrawablesRelative[2], this.f17374g);
    }

    public void c() {
        this.f17376i.a();
    }

    public int e() {
        return this.f17376i.f();
    }

    public int f() {
        return this.f17376i.g();
    }

    public int g() {
        return this.f17376i.h();
    }

    public int[] h() {
        return this.f17376i.i();
    }

    public int i() {
        return this.f17376i.j();
    }

    public ColorStateList j() {
        Y y10 = this.f17375h;
        if (y10 != null) {
            return y10.f17238a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        Y y10 = this.f17375h;
        if (y10 != null) {
            return y10.f17239b;
        }
        return null;
    }

    public boolean l() {
        return this.f17376i.n();
    }

    public void m(AttributeSet attributeSet, int i10) {
        boolean z10;
        boolean z11;
        String str;
        String str2;
        boolean z12;
        int i11;
        float f10;
        Context context = this.f17368a.getContext();
        C2053h b10 = C2053h.b();
        a0 v10 = a0.v(context, attributeSet, l.j.AppCompatTextHelper, i10, 0);
        TextView textView = this.f17368a;
        AbstractC2082d0.j0(textView, textView.getContext(), l.j.AppCompatTextHelper, attributeSet, v10.r(), i10, 0);
        int n10 = v10.n(l.j.f55222O, -1);
        if (v10.s(l.j.f55234R)) {
            this.f17369b = d(context, b10, v10.n(l.j.f55234R, 0));
        }
        if (v10.s(l.j.f55226P)) {
            this.f17370c = d(context, b10, v10.n(l.j.f55226P, 0));
        }
        if (v10.s(l.j.f55238S)) {
            this.f17371d = d(context, b10, v10.n(l.j.f55238S, 0));
        }
        if (v10.s(l.j.f55230Q)) {
            this.f17372e = d(context, b10, v10.n(l.j.f55230Q, 0));
        }
        if (v10.s(l.j.f55242T)) {
            this.f17373f = d(context, b10, v10.n(l.j.f55242T, 0));
        }
        if (v10.s(l.j.f55246U)) {
            this.f17374g = d(context, b10, v10.n(l.j.f55246U, 0));
        }
        v10.x();
        boolean z13 = this.f17368a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (n10 != -1) {
            a0 t10 = a0.t(context, n10, l.j.TextAppearance);
            if (z13 || !t10.s(l.j.f55181D2)) {
                z10 = false;
                z11 = false;
            } else {
                z10 = t10.a(l.j.f55181D2, false);
                z11 = true;
            }
            C(context, t10);
            int i12 = Build.VERSION.SDK_INT;
            str2 = t10.s(l.j.f55185E2) ? t10.o(l.j.f55185E2) : null;
            str = (i12 < 26 || !t10.s(l.j.f55177C2)) ? null : t10.o(l.j.f55177C2);
            t10.x();
        } else {
            z10 = false;
            z11 = false;
            str = null;
            str2 = null;
        }
        a0 v11 = a0.v(context, attributeSet, l.j.TextAppearance, i10, 0);
        if (z13 || !v11.s(l.j.f55181D2)) {
            z12 = z11;
        } else {
            z10 = v11.a(l.j.f55181D2, false);
            z12 = true;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (v11.s(l.j.f55185E2)) {
            str2 = v11.o(l.j.f55185E2);
        }
        if (i13 >= 26 && v11.s(l.j.f55177C2)) {
            str = v11.o(l.j.f55177C2);
        }
        if (i13 >= 28 && v11.s(l.j.f55348p2) && v11.f(l.j.f55348p2, -1) == 0) {
            this.f17368a.setTextSize(0, 0.0f);
        }
        C(context, v11);
        v11.x();
        if (!z13 && z12) {
            s(z10);
        }
        Typeface typeface = this.f17379l;
        if (typeface != null) {
            if (this.f17378k == -1) {
                this.f17368a.setTypeface(typeface, this.f17377j);
            } else {
                this.f17368a.setTypeface(typeface);
            }
        }
        if (str != null) {
            d.d(this.f17368a, str);
        }
        if (str2 != null) {
            c.b(this.f17368a, c.a(str2));
        }
        this.f17376i.o(attributeSet, i10);
        if (l0.f17341c && this.f17376i.j() != 0) {
            int[] i14 = this.f17376i.i();
            if (i14.length > 0) {
                if (d.a(this.f17368a) != -1.0f) {
                    d.b(this.f17368a, this.f17376i.g(), this.f17376i.f(), this.f17376i.h(), 0);
                } else {
                    d.c(this.f17368a, i14, 0);
                }
            }
        }
        a0 u10 = a0.u(context, attributeSet, l.j.AppCompatTextView);
        int n11 = u10.n(l.j.f55281c0, -1);
        Drawable c10 = n11 != -1 ? b10.c(context, n11) : null;
        int n12 = u10.n(l.j.f55306h0, -1);
        Drawable c11 = n12 != -1 ? b10.c(context, n12) : null;
        int n13 = u10.n(l.j.f55286d0, -1);
        Drawable c12 = n13 != -1 ? b10.c(context, n13) : null;
        int n14 = u10.n(l.j.f55271a0, -1);
        Drawable c13 = n14 != -1 ? b10.c(context, n14) : null;
        int n15 = u10.n(l.j.f55291e0, -1);
        Drawable c14 = n15 != -1 ? b10.c(context, n15) : null;
        int n16 = u10.n(l.j.f55276b0, -1);
        y(c10, c11, c12, c13, c14, n16 != -1 ? b10.c(context, n16) : null);
        if (u10.s(l.j.f55296f0)) {
            C0.j.f(this.f17368a, u10.c(l.j.f55296f0));
        }
        if (u10.s(l.j.f55301g0)) {
            C0.j.g(this.f17368a, I.e(u10.k(l.j.f55301g0, -1), null));
        }
        int f11 = u10.f(l.j.f55316j0, -1);
        int f12 = u10.f(l.j.f55321k0, -1);
        if (u10.s(l.j.f55326l0)) {
            TypedValue w10 = u10.w(l.j.f55326l0);
            if (w10 == null || w10.type != 5) {
                f10 = u10.f(l.j.f55326l0, -1);
                i11 = -1;
            } else {
                i11 = x0.i.a(w10.data);
                f10 = TypedValue.complexToFloat(w10.data);
            }
        } else {
            i11 = -1;
            f10 = -1.0f;
        }
        u10.x();
        if (f11 != -1) {
            C0.j.h(this.f17368a, f11);
        }
        if (f12 != -1) {
            C0.j.i(this.f17368a, f12);
        }
        if (f10 != -1.0f) {
            if (i11 == -1) {
                C0.j.j(this.f17368a, (int) f10);
            } else {
                C0.j.k(this.f17368a, i11, f10);
            }
        }
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f17380m) {
            this.f17379l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f17377j));
                } else {
                    textView.setTypeface(typeface, this.f17377j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (l0.f17341c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String o10;
        a0 t10 = a0.t(context, i10, l.j.TextAppearance);
        if (t10.s(l.j.f55181D2)) {
            s(t10.a(l.j.f55181D2, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (t10.s(l.j.f55348p2) && t10.f(l.j.f55348p2, -1) == 0) {
            this.f17368a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i11 >= 26 && t10.s(l.j.f55177C2) && (o10 = t10.o(l.j.f55177C2)) != null) {
            d.d(this.f17368a, o10);
        }
        t10.x();
        Typeface typeface = this.f17379l;
        if (typeface != null) {
            this.f17368a.setTypeface(typeface, this.f17377j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        A0.a.e(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f17368a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f17376i.p(i10, i11, i12, i13);
    }

    public void u(int[] iArr, int i10) {
        this.f17376i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f17376i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f17375h == null) {
            this.f17375h = new Y();
        }
        Y y10 = this.f17375h;
        y10.f17238a = colorStateList;
        y10.f17241d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f17375h == null) {
            this.f17375h = new Y();
        }
        Y y10 = this.f17375h;
        y10.f17239b = mode;
        y10.f17240c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f17368a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f17368a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f17368a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f17368a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f17368a.getCompoundDrawables();
        TextView textView2 = this.f17368a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        Y y10 = this.f17375h;
        this.f17369b = y10;
        this.f17370c = y10;
        this.f17371d = y10;
        this.f17372e = y10;
        this.f17373f = y10;
        this.f17374g = y10;
    }
}
