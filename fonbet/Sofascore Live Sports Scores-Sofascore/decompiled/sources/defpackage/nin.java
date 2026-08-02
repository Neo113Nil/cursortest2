package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nin {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public fin r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(nin ninVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (ninVar != null) {
            if (!this.c && ninVar.c) {
                this.b = ninVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = ninVar.h;
            }
            if (this.i == -1) {
                this.i = ninVar.i;
            }
            if (this.a == null && (str = ninVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = ninVar.f;
            }
            if (this.g == -1) {
                this.g = ninVar.g;
            }
            if (this.n == -1) {
                this.n = ninVar.n;
            }
            if (this.o == null && (alignment2 = ninVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = ninVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = ninVar.q;
            }
            if (this.j == -1) {
                this.j = ninVar.j;
                this.k = ninVar.k;
            }
            if (this.r == null) {
                this.r = ninVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = ninVar.s;
            }
            if (this.t == null) {
                this.t = ninVar.t;
            }
            if (this.u == null) {
                this.u = ninVar.u;
            }
            if (this.v == null) {
                this.v = ninVar.v;
            }
            if (!this.e && ninVar.e) {
                this.d = ninVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = ninVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
