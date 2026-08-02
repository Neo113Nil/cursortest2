package n2;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public int f56958f;

    /* renamed from: h, reason: collision with root package name */
    public int f56960h;

    /* renamed from: o, reason: collision with root package name */
    public float f56967o;

    /* renamed from: a, reason: collision with root package name */
    public String f56953a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f56954b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f56955c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public String f56956d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f56957e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f56959g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f56961i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f56962j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f56963k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f56964l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f56965m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f56966n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f56968p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f56969q = false;

    public static int B(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public c A(boolean z10) {
        this.f56963k = z10 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f56961i) {
            return this.f56960h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f56969q;
    }

    public int c() {
        if (this.f56959g) {
            return this.f56958f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f56957e;
    }

    public float e() {
        return this.f56967o;
    }

    public int f() {
        return this.f56966n;
    }

    public int g() {
        return this.f56968p;
    }

    public int h(String str, String str2, Set set, String str3) {
        if (this.f56953a.isEmpty() && this.f56954b.isEmpty() && this.f56955c.isEmpty() && this.f56956d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B10 = B(B(B(0, this.f56953a, str, 1073741824), this.f56954b, str2, 2), this.f56956d, str3, 4);
        if (B10 == -1 || !set.containsAll(this.f56955c)) {
            return 0;
        }
        return B10 + (this.f56955c.size() * 4);
    }

    public int i() {
        int i10 = this.f56964l;
        if (i10 == -1 && this.f56965m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f56965m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f56961i;
    }

    public boolean k() {
        return this.f56959g;
    }

    public boolean l() {
        return this.f56962j == 1;
    }

    public boolean m() {
        return this.f56963k == 1;
    }

    public c n(int i10) {
        this.f56960h = i10;
        this.f56961i = true;
        return this;
    }

    public c o(boolean z10) {
        this.f56964l = z10 ? 1 : 0;
        return this;
    }

    public c p(boolean z10) {
        this.f56969q = z10;
        return this;
    }

    public c q(int i10) {
        this.f56958f = i10;
        this.f56959g = true;
        return this;
    }

    public c r(String str) {
        this.f56957e = str == null ? null : Ra.c.e(str);
        return this;
    }

    public c s(float f10) {
        this.f56967o = f10;
        return this;
    }

    public c t(int i10) {
        this.f56966n = i10;
        return this;
    }

    public c u(boolean z10) {
        this.f56965m = z10 ? 1 : 0;
        return this;
    }

    public c v(int i10) {
        this.f56968p = i10;
        return this;
    }

    public void w(String[] strArr) {
        this.f56955c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f56953a = str;
    }

    public void y(String str) {
        this.f56954b = str;
    }

    public void z(String str) {
        this.f56956d = str;
    }
}
