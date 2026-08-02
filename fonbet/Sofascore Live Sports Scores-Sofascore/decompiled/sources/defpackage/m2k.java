package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m2k {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public h9j r;
    public String t;
    public String u;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(m2k m2kVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (m2kVar != null) {
            if (!this.c && m2kVar.c) {
                this.b = m2kVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = m2kVar.h;
            }
            if (this.i == -1) {
                this.i = m2kVar.i;
            }
            if (this.a == null && (str = m2kVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = m2kVar.f;
            }
            if (this.g == -1) {
                this.g = m2kVar.g;
            }
            if (this.n == -1) {
                this.n = m2kVar.n;
            }
            if (this.o == null && (alignment2 = m2kVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = m2kVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = m2kVar.q;
            }
            if (this.j == -1) {
                this.j = m2kVar.j;
                this.k = m2kVar.k;
            }
            if (this.r == null) {
                this.r = m2kVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = m2kVar.s;
            }
            if (this.t == null) {
                this.t = m2kVar.t;
            }
            if (this.u == null) {
                this.u = m2kVar.u;
            }
            if (!this.e && m2kVar.e) {
                this.d = m2kVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = m2kVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
