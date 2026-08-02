package t4;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9750c {

    /* renamed from: f, reason: collision with root package name */
    private int f99122f;

    /* renamed from: h, reason: collision with root package name */
    private int f99124h;

    /* renamed from: o, reason: collision with root package name */
    private float f99131o;

    /* renamed from: a, reason: collision with root package name */
    private String f99117a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f99118b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f99119c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    private String f99120d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f99121e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f99123g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f99125i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f99126j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f99127k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f99128l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f99129m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f99130n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f99132p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f99133q = false;

    private static int B(int i11, int i12, String str, String str2) {
        if (str.isEmpty() || i11 == -1) {
            return i11;
        }
        if (str.equals(str2)) {
            return i11 + i12;
        }
        return -1;
    }

    public final void A() {
        this.f99127k = 1;
    }

    public final int a() {
        if (this.f99125i) {
            return this.f99124h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final boolean b() {
        return this.f99133q;
    }

    public final int c() {
        if (this.f99123g) {
            return this.f99122f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final String d() {
        return this.f99121e;
    }

    public final float e() {
        return this.f99131o;
    }

    public final int f() {
        return this.f99130n;
    }

    public final int g() {
        return this.f99132p;
    }

    public final int h(String str, String str2, Set<String> set, String str3) {
        if (this.f99117a.isEmpty() && this.f99118b.isEmpty() && this.f99119c.isEmpty() && this.f99120d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B11 = B(B(B(0, 1073741824, this.f99117a, str), 2, this.f99118b, str2), 4, this.f99120d, str3);
        if (B11 == -1 || !set.containsAll(this.f99119c)) {
            return 0;
        }
        return (this.f99119c.size() * 4) + B11;
    }

    public final int i() {
        int i11 = this.f99128l;
        if (i11 == -1 && this.f99129m == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f99129m == 1 ? 2 : 0);
    }

    public final boolean j() {
        return this.f99125i;
    }

    public final boolean k() {
        return this.f99123g;
    }

    public final boolean l() {
        return this.f99126j == 1;
    }

    public final boolean m() {
        return this.f99127k == 1;
    }

    public final void n(int i11) {
        this.f99124h = i11;
        this.f99125i = true;
    }

    public final void o() {
        this.f99128l = 1;
    }

    public final void p(boolean z11) {
        this.f99133q = z11;
    }

    public final void q(int i11) {
        this.f99122f = i11;
        this.f99123g = true;
    }

    public final void r(String str) {
        this.f99121e = O7.b.b(str);
    }

    public final void s(float f7) {
        this.f99131o = f7;
    }

    public final void t(int i11) {
        this.f99130n = i11;
    }

    public final void u() {
        this.f99129m = 1;
    }

    public final void v(int i11) {
        this.f99132p = i11;
    }

    public final void w(String[] strArr) {
        this.f99119c = new HashSet(Arrays.asList(strArr));
    }

    public final void x(String str) {
        this.f99117a = str;
    }

    public final void y(String str) {
        this.f99118b = str;
    }

    public final void z(String str) {
        this.f99120d = str;
    }
}
