package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3548z {

    /* renamed from: A, reason: collision with root package name */
    public int f38978A;

    /* renamed from: B, reason: collision with root package name */
    public int f38979B;

    /* renamed from: C, reason: collision with root package name */
    public int f38980C;

    /* renamed from: D, reason: collision with root package name */
    public int f38981D;

    /* renamed from: E, reason: collision with root package name */
    public int f38982E;

    /* renamed from: F, reason: collision with root package name */
    public int f38983F;

    /* renamed from: G, reason: collision with root package name */
    public int f38984G;

    /* renamed from: H, reason: collision with root package name */
    public final float f38985H;

    /* renamed from: I, reason: collision with root package name */
    public final float f38986I;

    /* renamed from: J, reason: collision with root package name */
    public final float f38987J;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f38988a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f38989b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f38990c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f38991d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f38992e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f38993f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f38994g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f38995h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f38996i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f38997j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f38998k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f38999l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f39000m;
    private SVGLength[] mDXs;
    private SVGLength[] mDYs;
    private double[] mRs;
    private SVGLength[] mXs;
    private SVGLength[] mYs;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f39001n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f39002o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f39003p;

    /* renamed from: q, reason: collision with root package name */
    public double f39004q;

    /* renamed from: r, reason: collision with root package name */
    public C3546x f39005r;

    /* renamed from: s, reason: collision with root package name */
    public double f39006s;

    /* renamed from: t, reason: collision with root package name */
    public double f39007t;

    /* renamed from: u, reason: collision with root package name */
    public double f39008u;

    /* renamed from: v, reason: collision with root package name */
    public double f39009v;

    /* renamed from: w, reason: collision with root package name */
    public int f39010w;

    /* renamed from: x, reason: collision with root package name */
    public int f39011x;

    /* renamed from: y, reason: collision with root package name */
    public int f39012y;

    /* renamed from: z, reason: collision with root package name */
    public int f39013z;

    public C3548z(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        this.f38988a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f38989b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f38990c = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f38991d = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        this.f38992e = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        this.f38993f = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        this.f38994g = arrayList7;
        ArrayList arrayList8 = new ArrayList();
        this.f38995h = arrayList8;
        ArrayList arrayList9 = new ArrayList();
        this.f38996i = arrayList9;
        ArrayList arrayList10 = new ArrayList();
        this.f38997j = arrayList10;
        ArrayList arrayList11 = new ArrayList();
        this.f38998k = arrayList11;
        this.f38999l = new ArrayList();
        this.f39000m = new ArrayList();
        this.f39001n = new ArrayList();
        this.f39002o = new ArrayList();
        this.f39003p = new ArrayList();
        this.f39004q = 12.0d;
        this.f39005r = C3546x.f38956p;
        SVGLength[] sVGLengthArr = new SVGLength[0];
        this.mXs = sVGLengthArr;
        this.mYs = new SVGLength[0];
        this.mDXs = new SVGLength[0];
        this.mDYs = new SVGLength[0];
        this.mRs = new double[]{0.0d};
        this.f38979B = -1;
        this.f38980C = -1;
        this.f38981D = -1;
        this.f38982E = -1;
        this.f38983F = -1;
        this.f38985H = f10;
        this.f38986I = f11;
        this.f38987J = f12;
        arrayList2.add(sVGLengthArr);
        arrayList3.add(this.mYs);
        arrayList4.add(this.mDXs);
        arrayList5.add(this.mDYs);
        arrayList6.add(this.mRs);
        arrayList7.add(Integer.valueOf(this.f38979B));
        arrayList8.add(Integer.valueOf(this.f38980C));
        arrayList9.add(Integer.valueOf(this.f38981D));
        arrayList10.add(Integer.valueOf(this.f38982E));
        arrayList11.add(Integer.valueOf(this.f38983F));
        arrayList.add(this.f39005r);
        q();
    }

    public static void h(ArrayList arrayList, int i10) {
        while (i10 >= 0) {
            arrayList.set(i10, Integer.valueOf(((Integer) arrayList.get(i10)).intValue() + 1));
            i10--;
        }
    }

    public final double[] a(ArrayList arrayList) {
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((SVGLength) arrayList.get(i10)).f38736a;
        }
        return dArr;
    }

    public C3546x b() {
        return this.f39005r;
    }

    public double c() {
        return this.f39004q;
    }

    public float d() {
        return this.f38987J;
    }

    public final SVGLength[] e(ArrayList arrayList) {
        int size = arrayList.size();
        SVGLength[] sVGLengthArr = new SVGLength[size];
        for (int i10 = 0; i10 < size; i10++) {
            sVGLengthArr[i10] = (SVGLength) arrayList.get(i10);
        }
        return sVGLengthArr;
    }

    public final C3546x f(B b10) {
        if (this.f38984G > 0) {
            return this.f39005r;
        }
        for (B parentTextRoot = b10.getParentTextRoot(); parentTextRoot != null; parentTextRoot = parentTextRoot.getParentTextRoot()) {
            C3546x b11 = parentTextRoot.q().b();
            if (b11 != C3546x.f38956p) {
                return b11;
            }
        }
        return C3546x.f38956p;
    }

    public float g() {
        return this.f38986I;
    }

    public double i() {
        h(this.f38996i, this.f39012y);
        int i10 = this.f38981D + 1;
        SVGLength[] sVGLengthArr = this.mDXs;
        if (i10 < sVGLengthArr.length) {
            this.f38981D = i10;
            this.f39008u += M.a(sVGLengthArr[i10], this.f38986I, 0.0d, this.f38985H, this.f39004q);
        }
        return this.f39008u;
    }

    public double j() {
        h(this.f38997j, this.f39013z);
        int i10 = this.f38982E + 1;
        SVGLength[] sVGLengthArr = this.mDYs;
        if (i10 < sVGLengthArr.length) {
            this.f38982E = i10;
            this.f39009v += M.a(sVGLengthArr[i10], this.f38987J, 0.0d, this.f38985H, this.f39004q);
        }
        return this.f39009v;
    }

    public double k() {
        h(this.f38998k, this.f38978A);
        int min = Math.min(this.f38983F + 1, this.mRs.length - 1);
        this.f38983F = min;
        return this.mRs[min];
    }

    public double l(double d10) {
        h(this.f38994g, this.f39010w);
        int i10 = this.f38979B + 1;
        SVGLength[] sVGLengthArr = this.mXs;
        if (i10 < sVGLengthArr.length) {
            this.f39008u = 0.0d;
            this.f38979B = i10;
            this.f39006s = M.a(sVGLengthArr[i10], this.f38986I, 0.0d, this.f38985H, this.f39004q);
        }
        double d11 = this.f39006s + d10;
        this.f39006s = d11;
        return d11;
    }

    public double m() {
        h(this.f38995h, this.f39011x);
        int i10 = this.f38980C + 1;
        SVGLength[] sVGLengthArr = this.mYs;
        if (i10 < sVGLengthArr.length) {
            this.f39009v = 0.0d;
            this.f38980C = i10;
            this.f39007t = M.a(sVGLengthArr[i10], this.f38987J, 0.0d, this.f38985H, this.f39004q);
        }
        return this.f39007t;
    }

    public void n() {
        this.f38988a.remove(this.f38984G);
        this.f38999l.remove(this.f38984G);
        this.f39000m.remove(this.f38984G);
        this.f39001n.remove(this.f38984G);
        this.f39002o.remove(this.f38984G);
        this.f39003p.remove(this.f38984G);
        int i10 = this.f38984G - 1;
        this.f38984G = i10;
        int i11 = this.f39010w;
        int i12 = this.f39011x;
        int i13 = this.f39012y;
        int i14 = this.f39013z;
        int i15 = this.f38978A;
        this.f39005r = (C3546x) this.f38988a.get(i10);
        this.f39010w = ((Integer) this.f38999l.get(this.f38984G)).intValue();
        this.f39011x = ((Integer) this.f39000m.get(this.f38984G)).intValue();
        this.f39012y = ((Integer) this.f39001n.get(this.f38984G)).intValue();
        this.f39013z = ((Integer) this.f39002o.get(this.f38984G)).intValue();
        this.f38978A = ((Integer) this.f39003p.get(this.f38984G)).intValue();
        if (i11 != this.f39010w) {
            this.f38989b.remove(i11);
            this.mXs = (SVGLength[]) this.f38989b.get(this.f39010w);
            this.f38979B = ((Integer) this.f38994g.get(this.f39010w)).intValue();
        }
        if (i12 != this.f39011x) {
            this.f38990c.remove(i12);
            this.mYs = (SVGLength[]) this.f38990c.get(this.f39011x);
            this.f38980C = ((Integer) this.f38995h.get(this.f39011x)).intValue();
        }
        if (i13 != this.f39012y) {
            this.f38991d.remove(i13);
            this.mDXs = (SVGLength[]) this.f38991d.get(this.f39012y);
            this.f38981D = ((Integer) this.f38996i.get(this.f39012y)).intValue();
        }
        if (i14 != this.f39013z) {
            this.f38992e.remove(i14);
            this.mDYs = (SVGLength[]) this.f38992e.get(this.f39013z);
            this.f38982E = ((Integer) this.f38997j.get(this.f39013z)).intValue();
        }
        if (i15 != this.f38978A) {
            this.f38993f.remove(i15);
            this.mRs = (double[]) this.f38993f.get(this.f38978A);
            this.f38983F = ((Integer) this.f38998k.get(this.f38978A)).intValue();
        }
    }

    public void o(B b10, ReadableMap readableMap) {
        r(b10, readableMap);
        q();
    }

    public void p(boolean z10, o0 o0Var, ReadableMap readableMap, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        if (z10) {
            s();
        }
        r(o0Var, readableMap);
        if (arrayList != null && arrayList.size() != 0) {
            this.f39010w++;
            this.f38979B = -1;
            this.f38994g.add(-1);
            SVGLength[] e10 = e(arrayList);
            this.mXs = e10;
            this.f38989b.add(e10);
        }
        if (arrayList2 != null && arrayList2.size() != 0) {
            this.f39011x++;
            this.f38980C = -1;
            this.f38995h.add(-1);
            SVGLength[] e11 = e(arrayList2);
            this.mYs = e11;
            this.f38990c.add(e11);
        }
        if (arrayList3 != null && arrayList3.size() != 0) {
            this.f39012y++;
            this.f38981D = -1;
            this.f38996i.add(-1);
            SVGLength[] e12 = e(arrayList3);
            this.mDXs = e12;
            this.f38991d.add(e12);
        }
        if (arrayList4 != null && arrayList4.size() != 0) {
            this.f39013z++;
            this.f38982E = -1;
            this.f38997j.add(-1);
            SVGLength[] e13 = e(arrayList4);
            this.mDYs = e13;
            this.f38992e.add(e13);
        }
        if (arrayList5 != null && arrayList5.size() != 0) {
            this.f38978A++;
            this.f38983F = -1;
            this.f38998k.add(-1);
            double[] a10 = a(arrayList5);
            this.mRs = a10;
            this.f38993f.add(a10);
        }
        q();
    }

    public final void q() {
        this.f38999l.add(Integer.valueOf(this.f39010w));
        this.f39000m.add(Integer.valueOf(this.f39011x));
        this.f39001n.add(Integer.valueOf(this.f39012y));
        this.f39002o.add(Integer.valueOf(this.f39013z));
        this.f39003p.add(Integer.valueOf(this.f38978A));
    }

    public final void r(B b10, ReadableMap readableMap) {
        C3546x f10 = f(b10);
        this.f38984G++;
        if (readableMap == null) {
            this.f38988a.add(f10);
            return;
        }
        C3546x c3546x = new C3546x(readableMap, f10, this.f38985H);
        this.f39004q = c3546x.f38957a;
        this.f38988a.add(c3546x);
        this.f39005r = c3546x;
    }

    public final void s() {
        this.f38978A = 0;
        this.f39013z = 0;
        this.f39012y = 0;
        this.f39011x = 0;
        this.f39010w = 0;
        this.f38983F = -1;
        this.f38982E = -1;
        this.f38981D = -1;
        this.f38980C = -1;
        this.f38979B = -1;
        this.f39009v = 0.0d;
        this.f39008u = 0.0d;
        this.f39007t = 0.0d;
        this.f39006s = 0.0d;
    }
}
