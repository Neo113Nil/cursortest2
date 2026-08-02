package A5;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import w5.EnumC6709e;
import y5.C6854a;
import z5.AbstractC6930a;

/* loaded from: classes2.dex */
public class H implements y5.d {

    /* renamed from: a, reason: collision with root package name */
    public final View f72a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f75d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC6709e f76e;

    /* renamed from: f, reason: collision with root package name */
    public final C6854a f77f;

    /* renamed from: g, reason: collision with root package name */
    public final float f78g;

    /* renamed from: h, reason: collision with root package name */
    public final float f79h;

    /* renamed from: i, reason: collision with root package name */
    public final float f80i;

    /* renamed from: j, reason: collision with root package name */
    public final float f81j;

    /* renamed from: k, reason: collision with root package name */
    public final float f82k;

    /* renamed from: l, reason: collision with root package name */
    public final float f83l;

    /* renamed from: m, reason: collision with root package name */
    public final float f84m;

    /* renamed from: n, reason: collision with root package name */
    public final String f85n;

    /* renamed from: o, reason: collision with root package name */
    public final int f86o;

    /* renamed from: p, reason: collision with root package name */
    public final int f87p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f88q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f89r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f90s;

    /* renamed from: t, reason: collision with root package name */
    public final y5.c f91t;

    /* renamed from: u, reason: collision with root package name */
    public final String f92u;

    /* renamed from: v, reason: collision with root package name */
    public final String f93v;

    public H(View view, String packageName, int i10, boolean z10, EnumC6709e visibility, C6854a viewPosition, float f10, float f11, float f12, float f13, float f14, float f15, float f16, String backgroundColor, int i11, int i12, boolean z11, boolean z12, boolean z13, y5.c cVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(viewPosition, "viewPosition");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.f72a = view;
        this.f73b = packageName;
        this.f74c = i10;
        this.f75d = z10;
        this.f76e = visibility;
        this.f77f = viewPosition;
        this.f78g = f10;
        this.f79h = f11;
        this.f80i = f12;
        this.f81j = f13;
        this.f82k = f14;
        this.f83l = f15;
        this.f84m = f16;
        this.f85n = backgroundColor;
        this.f86o = i11;
        this.f87p = i12;
        this.f88q = z11;
        this.f89r = z12;
        this.f90s = z13;
        this.f91t = cVar;
        this.f92u = AbstractC6930a.g(view);
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        this.f93v = name;
    }

    @Override // y5.d
    public String a() {
        return this.f92u;
    }

    @Override // y5.d
    public String b() {
        return this.f93v;
    }

    public final boolean c(Rect rect) {
        Object parent = this.f72a.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null || !view.getLocalVisibleRect(rect)) {
            return false;
        }
        C6854a j10 = AbstractC6930a.j(view);
        rect.offset((int) j10.a(), (int) j10.b());
        return rect.width() > 0 && rect.height() > 0;
    }

    public final View d() {
        return this.f72a;
    }

    public String e() {
        String obj;
        CharSequence contentDescription = this.f72a.getContentDescription();
        if (contentDescription == null || (obj = contentDescription.toString()) == null || StringsKt.isBlank(obj)) {
            return null;
        }
        return obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return Intrinsics.areEqual(this.f72a, h10.f72a) && Intrinsics.areEqual(this.f73b, h10.f73b) && Intrinsics.areEqual(b(), h10.b()) && this.f74c == h10.f74c && Intrinsics.areEqual(a(), h10.a()) && this.f75d == h10.f75d && this.f76e == h10.f76e && this.f78g == h10.f78g && this.f79h == h10.f79h && this.f80i == h10.f80i && this.f81j == h10.f81j && this.f82k == h10.f82k && this.f83l == h10.f83l && this.f84m == h10.f84m && Intrinsics.areEqual(this.f85n, h10.f85n) && this.f86o == h10.f86o && this.f87p == h10.f87p && this.f88q == h10.f88q && this.f89r == h10.f89r && this.f90s == h10.f90s && Intrinsics.areEqual(this.f91t, h10.f91t);
    }

    public boolean f(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        RectF i10 = i();
        Rect rect2 = new Rect();
        if (!c(rect2)) {
            return false;
        }
        rect.set(Math.max((int) i10.left, rect2.left), Math.max((int) i10.top, rect2.top), Math.min((int) i10.right, rect2.right), Math.min((int) i10.bottom, rect2.bottom));
        return rect.width() > 0 && rect.height() > 0;
    }

    public final boolean g() {
        return this.f88q;
    }

    public final boolean h() {
        return this.f76e == EnumC6709e.f67453b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((this.f72a.hashCode() * 31) + this.f73b.hashCode()) * 31) + b().hashCode()) * 31) + this.f74c) * 31) + a().hashCode()) * 31) + Boolean.hashCode(this.f75d)) * 31) + this.f76e.hashCode()) * 31) + Float.hashCode(this.f78g)) * 31) + Float.hashCode(this.f79h)) * 31) + Float.hashCode(this.f80i)) * 31) + Float.hashCode(this.f81j)) * 31) + Float.hashCode(this.f82k)) * 31) + Float.hashCode(this.f83l)) * 31) + Float.hashCode(this.f84m)) * 31) + this.f85n.hashCode()) * 31) + this.f86o) * 31) + this.f87p) * 31) + Boolean.hashCode(this.f88q)) * 31) + Boolean.hashCode(this.f89r)) * 31) + Boolean.hashCode(this.f90s)) * 31;
        y5.c cVar = this.f91t;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public RectF i() {
        return new RectF(this.f78g + this.f72a.getPaddingLeft(), this.f79h + this.f72a.getPaddingTop(), (this.f78g + this.f80i) - this.f72a.getPaddingRight(), (this.f79h + this.f81j) - this.f72a.getPaddingBottom());
    }

    public final void j(boolean z10) {
        this.f90s = z10;
    }

    public boolean k() {
        String string;
        Context context = this.f72a.getContext();
        if (context == null || (string = context.getString(Q4.t.f9357a)) == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f72a.getTag(), string) || Intrinsics.areEqual(this.f72a.getTag(Q4.s.f9356b), Boolean.TRUE) || this.f90s;
    }

    public String toString() {
        return "ViewMetadata(packageName='" + this.f73b + "', viewClassName='" + b() + "', id=" + this.f74c + ", viewId='" + a() + "', enabled=" + this.f75d + ", visibility=" + this.f76e + ", x=" + this.f78g + ", y=" + this.f79h + ", width=" + this.f80i + ", height=" + this.f81j + ", scaleX=" + this.f82k + ", scaleY=" + this.f83l + ", alpha=" + this.f84m + ", backgroundColor='" + this.f85n + "', scrollX=" + this.f86o + ", scrollY=" + this.f87p + ", isClickable=" + this.f88q + ", isLongClickable=" + this.f89r + ", isSecured=" + this.f90s + ", layoutParams=" + this.f91t + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ H(android.view.View r21, java.lang.String r22, int r23, boolean r24, w5.EnumC6709e r25, y5.C6854a r26, float r27, float r28, float r29, float r30, float r31, float r32, float r33, java.lang.String r34, int r35, int r36, boolean r37, boolean r38, boolean r39, y5.c r40, int r41, kotlin.jvm.internal.DefaultConstructorMarker r42) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A5.H.<init>(android.view.View, java.lang.String, int, boolean, w5.e, y5.a, float, float, float, float, float, float, float, java.lang.String, int, int, boolean, boolean, boolean, y5.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
