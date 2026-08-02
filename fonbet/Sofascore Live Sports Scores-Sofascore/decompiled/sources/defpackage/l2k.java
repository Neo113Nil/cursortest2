package defpackage;

import android.text.Layout;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l2k {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public g9j r;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(l2k l2kVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (l2kVar != null) {
            if (!this.c && l2kVar.c) {
                this.b = l2kVar.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = l2kVar.h;
            }
            if (this.i == -1) {
                this.i = l2kVar.i;
            }
            if (this.a == null && (str = l2kVar.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = l2kVar.f;
            }
            if (this.g == -1) {
                this.g = l2kVar.g;
            }
            if (this.n == -1) {
                this.n = l2kVar.n;
            }
            if (this.o == null && (alignment2 = l2kVar.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = l2kVar.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = l2kVar.q;
            }
            if (this.j == -1) {
                this.j = l2kVar.j;
                this.k = l2kVar.k;
            }
            if (this.r == null) {
                this.r = l2kVar.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = l2kVar.s;
            }
            if (!this.e && l2kVar.e) {
                this.d = l2kVar.d;
                this.e = true;
            }
            if (this.m != -1 || (i = l2kVar.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
