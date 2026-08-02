package r6;

import B4.V;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import io.sentry.W2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import r6.C9176b;
import r6.C9179e;
import r6.C9181g;

/* renamed from: r6.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9207h {

    /* renamed from: g, reason: collision with root package name */
    private static HashSet<String> f83106g;

    /* renamed from: a, reason: collision with root package name */
    private Canvas f83107a;

    /* renamed from: b, reason: collision with root package name */
    private C9181g f83108b;

    /* renamed from: c, reason: collision with root package name */
    private C1413h f83109c;

    /* renamed from: d, reason: collision with root package name */
    private Stack<C1413h> f83110d;

    /* renamed from: e, reason: collision with root package name */
    private Stack<C9181g.J> f83111e;

    /* renamed from: f, reason: collision with root package name */
    private Stack<Matrix> f83112f;

    /* renamed from: r6.h$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83113a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83114b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f83115c;

        static {
            int[] iArr = new int[C9181g.E.d.values().length];
            f83115c = iArr;
            try {
                iArr[C9181g.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83115c[C9181g.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83115c[C9181g.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C9181g.E.c.values().length];
            f83114b = iArr2;
            try {
                iArr2[C9181g.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83114b[C9181g.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83114b[C9181g.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[C9179e.a.values().length];
            f83113a = iArr3;
            try {
                iArr3[C9179e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f83113a[C9179e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f83113a[C9179e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f83113a[C9179e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f83113a[C9179e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f83113a[C9179e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f83113a[C9179e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f83113a[C9179e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* renamed from: r6.h$b */
    private class b implements C9181g.InterfaceC9204x {

        /* renamed from: a, reason: collision with root package name */
        private ArrayList f83116a;

        /* renamed from: b, reason: collision with root package name */
        private float f83117b;

        /* renamed from: c, reason: collision with root package name */
        private float f83118c;

        /* renamed from: d, reason: collision with root package name */
        private c f83119d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f83120e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f83121f;

        /* renamed from: g, reason: collision with root package name */
        private int f83122g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f83123h;

        b(C9207h c9207h, C9181g.C9203w c9203w) {
            ArrayList arrayList = new ArrayList();
            this.f83116a = arrayList;
            this.f83119d = null;
            this.f83120e = false;
            this.f83121f = true;
            this.f83122g = -1;
            if (c9203w == null) {
                return;
            }
            c9203w.h(this);
            if (this.f83123h) {
                this.f83119d.b((c) arrayList.get(this.f83122g));
                arrayList.set(this.f83122g, this.f83119d);
                this.f83123h = false;
            }
            c cVar = this.f83119d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void a(float f7, float f11) {
            boolean z11 = this.f83123h;
            ArrayList arrayList = this.f83116a;
            if (z11) {
                this.f83119d.b((c) arrayList.get(this.f83122g));
                arrayList.set(this.f83122g, this.f83119d);
                this.f83123h = false;
            }
            c cVar = this.f83119d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
            this.f83117b = f7;
            this.f83118c = f11;
            this.f83119d = new c(f7, f11, 0.0f, 0.0f);
            this.f83122g = arrayList.size();
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void b(float f7, float f11) {
            this.f83119d.a(f7, f11);
            this.f83116a.add(this.f83119d);
            c cVar = this.f83119d;
            this.f83119d = new c(f7, f11, f7 - cVar.f83124a, f11 - cVar.f83125b);
            this.f83123h = false;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void c(float f7, float f11, float f12, float f13, float f14, float f15) {
            if (this.f83121f || this.f83120e) {
                this.f83119d.a(f7, f11);
                this.f83116a.add(this.f83119d);
                this.f83120e = false;
            }
            this.f83119d = new c(f14, f15, f14 - f12, f15 - f13);
            this.f83123h = false;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void close() {
            this.f83116a.add(this.f83119d);
            b(this.f83117b, this.f83118c);
            this.f83123h = true;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void d(float f7, float f11, float f12, float f13) {
            this.f83119d.a(f7, f11);
            this.f83116a.add(this.f83119d);
            this.f83119d = new c(f12, f13, f12 - f7, f13 - f11);
            this.f83123h = false;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void e(float f7, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
            this.f83120e = true;
            this.f83121f = false;
            c cVar = this.f83119d;
            C9207h.e(cVar.f83124a, cVar.f83125b, f7, f11, f12, z11, z12, f13, f14, this);
            this.f83121f = true;
            this.f83123h = false;
        }

        final ArrayList f() {
            return this.f83116a;
        }
    }

    /* renamed from: r6.h$c */
    private class c {

        /* renamed from: a, reason: collision with root package name */
        float f83124a;

        /* renamed from: b, reason: collision with root package name */
        float f83125b;

        /* renamed from: c, reason: collision with root package name */
        float f83126c;

        /* renamed from: d, reason: collision with root package name */
        float f83127d;

        /* renamed from: e, reason: collision with root package name */
        boolean f83128e = false;

        c(float f7, float f11, float f12, float f13) {
            this.f83126c = 0.0f;
            this.f83127d = 0.0f;
            this.f83124a = f7;
            this.f83125b = f11;
            double sqrt = Math.sqrt((f13 * f13) + (f12 * f12));
            if (sqrt != 0.0d) {
                this.f83126c = (float) (f12 / sqrt);
                this.f83127d = (float) (f13 / sqrt);
            }
        }

        final void a(float f7, float f11) {
            float f12 = f7 - this.f83124a;
            float f13 = f11 - this.f83125b;
            double sqrt = Math.sqrt((f13 * f13) + (f12 * f12));
            if (sqrt != 0.0d) {
                f12 = (float) (f12 / sqrt);
                f13 = (float) (f13 / sqrt);
            }
            float f14 = this.f83126c;
            if (f12 != (-f14) || f13 != (-this.f83127d)) {
                this.f83126c = f14 + f12;
                this.f83127d += f13;
            } else {
                this.f83128e = true;
                this.f83126c = -f13;
                this.f83127d = f12;
            }
        }

        final void b(c cVar) {
            float f7 = cVar.f83126c;
            float f11 = this.f83126c;
            if (f7 == (-f11)) {
                float f12 = cVar.f83127d;
                if (f12 == (-this.f83127d)) {
                    this.f83128e = true;
                    this.f83126c = -f12;
                    this.f83127d = cVar.f83126c;
                    return;
                }
            }
            this.f83126c = f11 + f7;
            this.f83127d += cVar.f83127d;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("(");
            sb2.append(this.f83124a);
            sb2.append(",");
            sb2.append(this.f83125b);
            sb2.append(" ");
            sb2.append(this.f83126c);
            sb2.append(",");
            return V.b(this.f83127d, ")", sb2);
        }
    }

    /* renamed from: r6.h$d */
    private class d implements C9181g.InterfaceC9204x {

        /* renamed from: a, reason: collision with root package name */
        Path f83129a = new Path();

        /* renamed from: b, reason: collision with root package name */
        float f83130b;

        /* renamed from: c, reason: collision with root package name */
        float f83131c;

        d(C9181g.C9203w c9203w) {
            if (c9203w == null) {
                return;
            }
            c9203w.h(this);
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void a(float f7, float f11) {
            this.f83129a.moveTo(f7, f11);
            this.f83130b = f7;
            this.f83131c = f11;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void b(float f7, float f11) {
            this.f83129a.lineTo(f7, f11);
            this.f83130b = f7;
            this.f83131c = f11;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void c(float f7, float f11, float f12, float f13, float f14, float f15) {
            this.f83129a.cubicTo(f7, f11, f12, f13, f14, f15);
            this.f83130b = f14;
            this.f83131c = f15;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void close() {
            this.f83129a.close();
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void d(float f7, float f11, float f12, float f13) {
            this.f83129a.quadTo(f7, f11, f12, f13);
            this.f83130b = f12;
            this.f83131c = f13;
        }

        @Override // r6.C9181g.InterfaceC9204x
        public final void e(float f7, float f11, float f12, boolean z11, boolean z12, float f13, float f14) {
            C9207h.e(this.f83130b, this.f83131c, f7, f11, f12, z11, z12, f13, f14, this);
            this.f83130b = f13;
            this.f83131c = f14;
        }
    }

    /* renamed from: r6.h$e */
    private class e extends f {

        /* renamed from: d, reason: collision with root package name */
        private Path f83132d;

        e(Path path, float f7) {
            super(f7, 0.0f);
            this.f83132d = path;
        }

        @Override // r6.C9207h.f, r6.C9207h.j
        public final void b(String str) {
            String str2;
            C9207h c9207h = C9207h.this;
            if (c9207h.d0()) {
                if (c9207h.f83109c.f83142b) {
                    str2 = str;
                    c9207h.f83107a.drawTextOnPath(str2, this.f83132d, this.f83134a, this.f83135b, c9207h.f83109c.f83144d);
                } else {
                    str2 = str;
                }
                if (c9207h.f83109c.f83143c) {
                    String str3 = str2;
                    c9207h.f83107a.drawTextOnPath(str3, this.f83132d, this.f83134a, this.f83135b, c9207h.f83109c.f83145e);
                }
            } else {
                str2 = str;
            }
            this.f83134a = c9207h.f83109c.f83144d.measureText(str2) + this.f83134a;
        }
    }

    /* renamed from: r6.h$f */
    private class f extends j {

        /* renamed from: a, reason: collision with root package name */
        float f83134a;

        /* renamed from: b, reason: collision with root package name */
        float f83135b;

        f(float f7, float f11) {
            this.f83134a = f7;
            this.f83135b = f11;
        }

        @Override // r6.C9207h.j
        public void b(String str) {
            C9207h c9207h = C9207h.this;
            if (c9207h.d0()) {
                if (c9207h.f83109c.f83142b) {
                    c9207h.f83107a.drawText(str, this.f83134a, this.f83135b, c9207h.f83109c.f83144d);
                }
                if (c9207h.f83109c.f83143c) {
                    c9207h.f83107a.drawText(str, this.f83134a, this.f83135b, c9207h.f83109c.f83145e);
                }
            }
            this.f83134a = c9207h.f83109c.f83144d.measureText(str) + this.f83134a;
        }
    }

    /* renamed from: r6.h$g */
    private class g extends j {

        /* renamed from: a, reason: collision with root package name */
        float f83137a;

        /* renamed from: b, reason: collision with root package name */
        float f83138b;

        /* renamed from: c, reason: collision with root package name */
        Path f83139c;

        g(float f7, float f11, Path path) {
            this.f83137a = f7;
            this.f83138b = f11;
            this.f83139c = path;
        }

        @Override // r6.C9207h.j
        public final boolean a(C9181g.Y y11) {
            if (!(y11 instanceof C9181g.Z)) {
                return true;
            }
            Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }

        @Override // r6.C9207h.j
        public final void b(String str) {
            String str2;
            C9207h c9207h = C9207h.this;
            if (c9207h.d0()) {
                Path path = new Path();
                str2 = str;
                c9207h.f83109c.f83144d.getTextPath(str2, 0, str.length(), this.f83137a, this.f83138b, path);
                this.f83139c.addPath(path);
            } else {
                str2 = str;
            }
            this.f83137a = c9207h.f83109c.f83144d.measureText(str2) + this.f83137a;
        }
    }

    /* renamed from: r6.h$i */
    private class i extends j {

        /* renamed from: a, reason: collision with root package name */
        float f83149a;

        /* renamed from: b, reason: collision with root package name */
        float f83150b;

        /* renamed from: c, reason: collision with root package name */
        RectF f83151c = new RectF();

        i(float f7, float f11) {
            this.f83149a = f7;
            this.f83150b = f11;
        }

        @Override // r6.C9207h.j
        public final boolean a(C9181g.Y y11) {
            if (!(y11 instanceof C9181g.Z)) {
                return true;
            }
            C9181g.Z z11 = (C9181g.Z) y11;
            C9181g.L m11 = y11.f83013a.m(z11.f83026n);
            if (m11 == null) {
                C9207h.s("TextPath path reference '%s' not found", z11.f83026n);
                return false;
            }
            C9181g.C9202v c9202v = (C9181g.C9202v) m11;
            Path path = new d(c9202v.f83092o).f83129a;
            Matrix matrix = c9202v.f83066n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f83151c.union(rectF);
            return false;
        }

        @Override // r6.C9207h.j
        public final void b(String str) {
            C9207h c9207h = C9207h.this;
            if (c9207h.d0()) {
                Rect rect = new Rect();
                c9207h.f83109c.f83144d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f83149a, this.f83150b);
                this.f83151c.union(rectF);
            }
            this.f83149a = c9207h.f83109c.f83144d.measureText(str) + this.f83149a;
        }
    }

    /* renamed from: r6.h$j */
    private abstract class j {
        public boolean a(C9181g.Y y11) {
            return true;
        }

        public abstract void b(String str);
    }

    /* renamed from: r6.h$k */
    private class k extends j {

        /* renamed from: a, reason: collision with root package name */
        float f83153a = 0.0f;

        k() {
        }

        @Override // r6.C9207h.j
        public final void b(String str) {
            this.f83153a = C9207h.this.f83109c.f83144d.measureText(str) + this.f83153a;
        }
    }

    C9207h(Canvas canvas) {
        this.f83107a = canvas;
    }

    private Path.FillType A() {
        C9181g.E.a aVar = this.f83109c.f83141a.f82955F;
        return (aVar == null || aVar != C9181g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    private static boolean E(C9181g.E e11, long j11) {
        return (e11.f82963a & j11) != 0;
    }

    private Path F(C9181g.C9185d c9185d) {
        C9181g.C9196p c9196p = c9185d.f83043o;
        float d11 = c9196p != null ? c9196p.d(this) : 0.0f;
        C9181g.C9196p c9196p2 = c9185d.f83044p;
        float e11 = c9196p2 != null ? c9196p2.e(this) : 0.0f;
        float a11 = c9185d.f83045q.a(this);
        float f7 = d11 - a11;
        float f11 = e11 - a11;
        float f12 = d11 + a11;
        float f13 = e11 + a11;
        if (c9185d.f83003h == null) {
            float f14 = 2.0f * a11;
            c9185d.f83003h = new C9181g.C9183b(f7, f11, f14, f14);
        }
        float f15 = a11 * 0.5522848f;
        Path path = new Path();
        path.moveTo(d11, f11);
        float f16 = d11 + f15;
        float f17 = e11 - f15;
        path.cubicTo(f16, f11, f12, f17, f12, e11);
        float f18 = e11 + f15;
        path.cubicTo(f12, f18, f16, f13, d11, f13);
        float f19 = d11 - f15;
        path.cubicTo(f19, f13, f7, f18, f7, e11);
        path.cubicTo(f7, f17, f19, f11, d11, f11);
        path.close();
        return path;
    }

    private Path G(C9181g.C9189i c9189i) {
        C9181g.C9196p c9196p = c9189i.f83057o;
        float d11 = c9196p != null ? c9196p.d(this) : 0.0f;
        C9181g.C9196p c9196p2 = c9189i.f83058p;
        float e11 = c9196p2 != null ? c9196p2.e(this) : 0.0f;
        float d12 = c9189i.f83059q.d(this);
        float e12 = c9189i.f83060r.e(this);
        float f7 = d11 - d12;
        float f11 = e11 - e12;
        float f12 = d11 + d12;
        float f13 = e11 + e12;
        if (c9189i.f83003h == null) {
            c9189i.f83003h = new C9181g.C9183b(f7, f11, d12 * 2.0f, 2.0f * e12);
        }
        float f14 = d12 * 0.5522848f;
        float f15 = e12 * 0.5522848f;
        Path path = new Path();
        path.moveTo(d11, f11);
        float f16 = d11 + f14;
        float f17 = e11 - f15;
        path.cubicTo(f16, f11, f12, f17, f12, e11);
        float f18 = e11 + f15;
        path.cubicTo(f12, f18, f16, f13, d11, f13);
        float f19 = d11 - f14;
        path.cubicTo(f19, f13, f7, f18, f7, e11);
        path.cubicTo(f7, f17, f19, f11, d11, f11);
        path.close();
        return path;
    }

    private static Path H(C9181g.C9206z c9206z) {
        Path path = new Path();
        float[] fArr = c9206z.f83105o;
        path.moveTo(fArr[0], fArr[1]);
        int i11 = 2;
        while (true) {
            float[] fArr2 = c9206z.f83105o;
            if (i11 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i11], fArr2[i11 + 1]);
            i11 += 2;
        }
        if (c9206z instanceof C9181g.A) {
            path.close();
        }
        if (c9206z.f83003h == null) {
            c9206z.f83003h = g(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Path I(C9181g.B b11) {
        float d11;
        float e11;
        float min;
        float d12;
        float e12;
        float f7;
        float f11;
        Path path;
        C9181g.C9196p c9196p = b11.f82947s;
        if (c9196p == null && b11.f82948t == null) {
            d11 = 0.0f;
        } else if (c9196p == null) {
            d11 = b11.f82948t.e(this);
        } else {
            if (b11.f82948t != null) {
                d11 = c9196p.d(this);
                e11 = b11.f82948t.e(this);
                min = Math.min(d11, b11.f82945q.d(this) / 2.0f);
                float min2 = Math.min(e11, b11.f82946r.e(this) / 2.0f);
                C9181g.C9196p c9196p2 = b11.f82943o;
                d12 = c9196p2 == null ? c9196p2.d(this) : 0.0f;
                C9181g.C9196p c9196p3 = b11.f82944p;
                e12 = c9196p3 == null ? c9196p3.e(this) : 0.0f;
                float d13 = b11.f82945q.d(this);
                float e13 = b11.f82946r.e(this);
                if (b11.f83003h == null) {
                    b11.f83003h = new C9181g.C9183b(d12, e12, d13, e13);
                }
                f7 = d13 + d12;
                f11 = e12 + e13;
                path = new Path();
                if (min != 0.0f || min2 == 0.0f) {
                    path.moveTo(d12, e12);
                    path.lineTo(f7, e12);
                    path.lineTo(f7, f11);
                    path.lineTo(d12, f11);
                    path.lineTo(d12, e12);
                } else {
                    float f12 = min * 0.5522848f;
                    float f13 = 0.5522848f * min2;
                    float f14 = e12 + min2;
                    path.moveTo(d12, f14);
                    float f15 = f14 - f13;
                    float f16 = d12 + min;
                    float f17 = f16 - f12;
                    path.cubicTo(d12, f15, f17, e12, f16, e12);
                    float f18 = f7 - min;
                    path.lineTo(f18, e12);
                    float f19 = f18 + f12;
                    path.cubicTo(f19, e12, f7, f15, f7, f14);
                    float f21 = f11 - min2;
                    path.lineTo(f7, f21);
                    float f22 = f21 + f13;
                    path.cubicTo(f7, f22, f19, f11, f18, f11);
                    path.lineTo(f16, f11);
                    float f23 = d12;
                    path.cubicTo(f17, f11, f23, f22, d12, f21);
                    path.lineTo(f23, f14);
                }
                path.close();
                return path;
            }
            d11 = c9196p.d(this);
        }
        e11 = d11;
        min = Math.min(d11, b11.f82945q.d(this) / 2.0f);
        float min22 = Math.min(e11, b11.f82946r.e(this) / 2.0f);
        C9181g.C9196p c9196p22 = b11.f82943o;
        if (c9196p22 == null) {
        }
        C9181g.C9196p c9196p32 = b11.f82944p;
        if (c9196p32 == null) {
        }
        float d132 = b11.f82945q.d(this);
        float e132 = b11.f82946r.e(this);
        if (b11.f83003h == null) {
        }
        f7 = d132 + d12;
        f11 = e12 + e132;
        path = new Path();
        if (min != 0.0f) {
        }
        path.moveTo(d12, e12);
        path.lineTo(f7, e12);
        path.lineTo(f7, f11);
        path.lineTo(d12, f11);
        path.lineTo(d12, e12);
        path.close();
        return path;
    }

    private C9181g.C9183b J(C9181g.C9196p c9196p, C9181g.C9196p c9196p2, C9181g.C9196p c9196p3, C9181g.C9196p c9196p4) {
        float d11 = c9196p != null ? c9196p.d(this) : 0.0f;
        float e11 = c9196p2 != null ? c9196p2.e(this) : 0.0f;
        C9181g.C9183b D11 = D();
        return new C9181g.C9183b(d11, e11, c9196p3 != null ? c9196p3.d(this) : D11.f83036c, c9196p4 != null ? c9196p4.e(this) : D11.f83037d);
    }

    @TargetApi(19)
    private Path K(C9181g.K k11, boolean z11) {
        Path path;
        Path f7;
        this.f83110d.push(this.f83109c);
        C1413h c1413h = new C1413h(this.f83109c);
        this.f83109c = c1413h;
        b0(k11, c1413h);
        if (!o() || !d0()) {
            this.f83109c = this.f83110d.pop();
            return null;
        }
        if (k11 instanceof C9181g.e0) {
            if (!z11) {
                s("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            C9181g.e0 e0Var = (C9181g.e0) k11;
            C9181g.L m11 = k11.f83013a.m(e0Var.f83048o);
            if (m11 == null) {
                s("Use reference '%s' not found", e0Var.f83048o);
                this.f83109c = this.f83110d.pop();
                return null;
            }
            if (!(m11 instanceof C9181g.K)) {
                this.f83109c = this.f83110d.pop();
                return null;
            }
            path = K((C9181g.K) m11, false);
            if (path != null) {
                if (e0Var.f83003h == null) {
                    e0Var.f83003h = g(path);
                }
                Matrix matrix = e0Var.f83067n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.f83109c.f83141a.f82954E != null && (f7 = f(k11, k11.f83003h)) != null) {
                    path.op(f7, Path.Op.INTERSECT);
                }
                this.f83109c = this.f83110d.pop();
                return path;
            }
            return null;
        }
        if (k11 instanceof C9181g.AbstractC9192l) {
            C9181g.AbstractC9192l abstractC9192l = (C9181g.AbstractC9192l) k11;
            if (k11 instanceof C9181g.C9202v) {
                path = new d(((C9181g.C9202v) k11).f83092o).f83129a;
                if (k11.f83003h == null) {
                    k11.f83003h = g(path);
                }
            } else {
                path = k11 instanceof C9181g.B ? I((C9181g.B) k11) : k11 instanceof C9181g.C9185d ? F((C9181g.C9185d) k11) : k11 instanceof C9181g.C9189i ? G((C9181g.C9189i) k11) : k11 instanceof C9181g.C9206z ? H((C9181g.C9206z) k11) : null;
            }
            if (path != null) {
                if (abstractC9192l.f83003h == null) {
                    abstractC9192l.f83003h = g(path);
                }
                Matrix matrix2 = abstractC9192l.f83066n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(A());
            }
            return null;
        }
        if (!(k11 instanceof C9181g.W)) {
            s("Invalid %s element found in clipPath definition", k11.n());
            return null;
        }
        C9181g.W w11 = (C9181g.W) k11;
        ArrayList arrayList = w11.f83030n;
        float f11 = 0.0f;
        float d11 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C9181g.C9196p) w11.f83030n.get(0)).d(this);
        ArrayList arrayList2 = w11.f83031o;
        float e11 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C9181g.C9196p) w11.f83031o.get(0)).e(this);
        ArrayList arrayList3 = w11.f83032p;
        float d12 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C9181g.C9196p) w11.f83032p.get(0)).d(this);
        ArrayList arrayList4 = w11.f83033q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f11 = ((C9181g.C9196p) w11.f83033q.get(0)).e(this);
        }
        if (this.f83109c.f83141a.f82983u != C9181g.E.f.Start) {
            float h11 = h(w11);
            if (this.f83109c.f83141a.f82983u == C9181g.E.f.Middle) {
                h11 /= 2.0f;
            }
            d11 -= h11;
        }
        if (w11.f83003h == null) {
            i iVar = new i(d11, e11);
            r(w11, iVar);
            RectF rectF = iVar.f83151c;
            w11.f83003h = new C9181g.C9183b(rectF.left, rectF.top, rectF.width(), iVar.f83151c.height());
        }
        Path path2 = new Path();
        r(w11, new g(d11 + d12, e11 + f11, path2));
        Matrix matrix3 = w11.f83025r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        path2.setFillType(A());
        path = path2;
        if (this.f83109c.f83141a.f82954E != null) {
            path.op(f7, Path.Op.INTERSECT);
        }
        this.f83109c = this.f83110d.pop();
        return path;
    }

    private void L(C9181g.C9183b c9183b) {
        if (this.f83109c.f83141a.f82956G != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f83107a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            C9181g.C9199s c9199s = (C9181g.C9199s) this.f83108b.m(this.f83109c.f83141a.f82956G);
            T(c9199s, c9183b);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            T(c9199s, c9183b);
            canvas.restore();
            canvas.restore();
        }
        W();
    }

    private boolean M() {
        C9181g.L m11;
        int i11 = 0;
        if (this.f83109c.f83141a.f82975m.floatValue() >= 1.0f && this.f83109c.f83141a.f82956G == null) {
            return false;
        }
        int floatValue = (int) (this.f83109c.f83141a.f82975m.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i11 = 255;
            if (floatValue <= 255) {
                i11 = floatValue;
            }
        }
        this.f83107a.saveLayerAlpha(null, i11, 31);
        this.f83110d.push(this.f83109c);
        C1413h c1413h = new C1413h(this.f83109c);
        this.f83109c = c1413h;
        String str = c1413h.f83141a.f82956G;
        if (str != null && ((m11 = this.f83108b.m(str)) == null || !(m11 instanceof C9181g.C9199s))) {
            s("Mask reference '%s' not found", this.f83109c.f83141a.f82956G);
            this.f83109c.f83141a.f82956G = null;
        }
        return true;
    }

    private void N(C9181g.F f7, C9181g.C9183b c9183b, C9181g.C9183b c9183b2, C9179e c9179e) {
        if (c9183b.f83036c == 0.0f || c9183b.f83037d == 0.0f) {
            return;
        }
        if (c9179e == null && (c9179e = f7.f83015n) == null) {
            c9179e = C9179e.f82935d;
        }
        b0(f7, this.f83109c);
        if (o()) {
            C1413h c1413h = this.f83109c;
            c1413h.f83146f = c9183b;
            if (!c1413h.f83141a.f82984v.booleanValue()) {
                C9181g.C9183b c9183b3 = this.f83109c.f83146f;
                U(c9183b3.f83034a, c9183b3.f83035b, c9183b3.f83036c, c9183b3.f83037d);
            }
            j(f7, this.f83109c.f83146f);
            Canvas canvas = this.f83107a;
            if (c9183b2 != null) {
                canvas.concat(i(this.f83109c.f83146f, c9183b2, c9179e));
                this.f83109c.f83147g = f7.f83021o;
            } else {
                C9181g.C9183b c9183b4 = this.f83109c.f83146f;
                canvas.translate(c9183b4.f83034a, c9183b4.f83035b);
            }
            boolean M11 = M();
            c0();
            P(f7, true);
            if (M11) {
                L(f7.f83003h);
            }
            Z(f7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void O(C9181g.N n11) {
        C9181g.C9196p c9196p;
        String str;
        int indexOf;
        Set<String> f7;
        C9181g.C9196p c9196p2;
        Boolean bool;
        if (n11 instanceof C9181g.InterfaceC9200t) {
            return;
        }
        X();
        if ((n11 instanceof C9181g.L) && (bool = ((C9181g.L) n11).f83005d) != null) {
            this.f83109c.f83148h = bool.booleanValue();
        }
        if (n11 instanceof C9181g.F) {
            C9181g.F f11 = (C9181g.F) n11;
            N(f11, J(f11.f82989p, f11.f82990q, f11.f82991r, f11.f82992s), f11.f83021o, f11.f83015n);
        } else {
            Bitmap bitmap = null;
            if (n11 instanceof C9181g.e0) {
                C9181g.e0 e0Var = (C9181g.e0) n11;
                C9181g.C9196p c9196p3 = e0Var.f83051r;
                if ((c9196p3 == null || !c9196p3.g()) && ((c9196p2 = e0Var.f83052s) == null || !c9196p2.g())) {
                    b0(e0Var, this.f83109c);
                    if (o()) {
                        C9181g.N m11 = e0Var.f83013a.m(e0Var.f83048o);
                        if (m11 == null) {
                            s("Use reference '%s' not found", e0Var.f83048o);
                        } else {
                            Matrix matrix = e0Var.f83067n;
                            Canvas canvas = this.f83107a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            C9181g.C9196p c9196p4 = e0Var.f83049p;
                            float d11 = c9196p4 != null ? c9196p4.d(this) : 0.0f;
                            C9181g.C9196p c9196p5 = e0Var.f83050q;
                            canvas.translate(d11, c9196p5 != null ? c9196p5.e(this) : 0.0f);
                            j(e0Var, e0Var.f83003h);
                            boolean M11 = M();
                            this.f83111e.push(e0Var);
                            this.f83112f.push(this.f83107a.getMatrix());
                            if (m11 instanceof C9181g.F) {
                                C9181g.F f12 = (C9181g.F) m11;
                                C9181g.C9183b J11 = J(null, null, e0Var.f83051r, e0Var.f83052s);
                                X();
                                N(f12, J11, f12.f83021o, f12.f83015n);
                                W();
                            } else if (m11 instanceof C9181g.T) {
                                C9181g.C9196p c9196p6 = e0Var.f83051r;
                                if (c9196p6 == null) {
                                    c9196p6 = new C9181g.C9196p(100.0f, C9181g.d0.percent);
                                }
                                C9181g.C9196p c9196p7 = e0Var.f83052s;
                                if (c9196p7 == null) {
                                    c9196p7 = new C9181g.C9196p(100.0f, C9181g.d0.percent);
                                }
                                C9181g.C9183b J12 = J(null, null, c9196p6, c9196p7);
                                X();
                                C9181g.T t2 = (C9181g.T) m11;
                                if (J12.f83036c != 0.0f && J12.f83037d != 0.0f) {
                                    C9179e c9179e = t2.f83015n;
                                    if (c9179e == null) {
                                        c9179e = C9179e.f82935d;
                                    }
                                    b0(t2, this.f83109c);
                                    C1413h c1413h = this.f83109c;
                                    c1413h.f83146f = J12;
                                    if (!c1413h.f83141a.f82984v.booleanValue()) {
                                        C9181g.C9183b c9183b = this.f83109c.f83146f;
                                        U(c9183b.f83034a, c9183b.f83035b, c9183b.f83036c, c9183b.f83037d);
                                    }
                                    C9181g.C9183b c9183b2 = t2.f83021o;
                                    if (c9183b2 != null) {
                                        canvas.concat(i(this.f83109c.f83146f, c9183b2, c9179e));
                                        this.f83109c.f83147g = t2.f83021o;
                                    } else {
                                        C9181g.C9183b c9183b3 = this.f83109c.f83146f;
                                        canvas.translate(c9183b3.f83034a, c9183b3.f83035b);
                                    }
                                    boolean M12 = M();
                                    P(t2, true);
                                    if (M12) {
                                        L(t2.f83003h);
                                    }
                                    Z(t2);
                                }
                                W();
                            } else {
                                O(m11);
                            }
                            this.f83111e.pop();
                            this.f83112f.pop();
                            if (M11) {
                                L(e0Var.f83003h);
                            }
                            Z(e0Var);
                        }
                    }
                }
            } else if (n11 instanceof C9181g.S) {
                C9181g.S s11 = (C9181g.S) n11;
                b0(s11, this.f83109c);
                if (o()) {
                    Matrix matrix2 = s11.f83067n;
                    if (matrix2 != null) {
                        this.f83107a.concat(matrix2);
                    }
                    j(s11, s11.f83003h);
                    boolean M13 = M();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = s11.f82993i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C9181g.N n12 = (C9181g.N) it.next();
                        if (n12 instanceof C9181g.G) {
                            C9181g.G g10 = (C9181g.G) n12;
                            if (g10.a() == null && ((f7 = g10.f()) == null || (!f7.isEmpty() && f7.contains(language)))) {
                                Set<String> requiredFeatures = g10.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f83106g == null) {
                                        synchronized (C9207h.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            f83106g = hashSet;
                                            hashSet.add("Structure");
                                            f83106g.add("BasicStructure");
                                            f83106g.add("ConditionalProcessing");
                                            f83106g.add("Image");
                                            f83106g.add("Style");
                                            f83106g.add("ViewportAttribute");
                                            f83106g.add("Shape");
                                            f83106g.add("BasicText");
                                            f83106g.add("PaintAttribute");
                                            f83106g.add("BasicPaintAttribute");
                                            f83106g.add("OpacityAttribute");
                                            f83106g.add("BasicGraphicsAttribute");
                                            f83106g.add("Marker");
                                            f83106g.add("Gradient");
                                            f83106g.add("Pattern");
                                            f83106g.add("Clip");
                                            f83106g.add("BasicClip");
                                            f83106g.add("Mask");
                                            f83106g.add("View");
                                        }
                                    }
                                    if (!requiredFeatures.isEmpty() && f83106g.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set<String> e11 = g10.e();
                                if (e11 == null) {
                                    Set<String> m12 = g10.m();
                                    if (m12 == null) {
                                        O(n12);
                                        break;
                                    }
                                    m12.isEmpty();
                                } else {
                                    e11.isEmpty();
                                }
                            }
                        }
                    }
                    if (M13) {
                        L(s11.f83003h);
                    }
                    Z(s11);
                }
            } else if (n11 instanceof C9181g.C9193m) {
                C9181g.C9193m c9193m = (C9181g.C9193m) n11;
                b0(c9193m, this.f83109c);
                if (o()) {
                    Matrix matrix3 = c9193m.f83067n;
                    if (matrix3 != null) {
                        this.f83107a.concat(matrix3);
                    }
                    j(c9193m, c9193m.f83003h);
                    boolean M14 = M();
                    P(c9193m, true);
                    if (M14) {
                        L(c9193m.f83003h);
                    }
                    Z(c9193m);
                }
            } else {
                if (n11 instanceof C9181g.C9195o) {
                    C9181g.C9195o c9195o = (C9181g.C9195o) n11;
                    C9181g.C9196p c9196p8 = c9195o.f83071r;
                    if (c9196p8 != null && !c9196p8.g() && (c9196p = c9195o.f83072s) != null && !c9196p.g() && (str = c9195o.f83068o) != null) {
                        C9179e c9179e2 = c9195o.f83015n;
                        if (c9179e2 == null) {
                            c9179e2 = C9179e.f82935d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception e12) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e12);
                            }
                        }
                        if (bitmap != null) {
                            C9181g.C9183b c9183b4 = new C9181g.C9183b(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                            b0(c9195o, this.f83109c);
                            if (o() && d0()) {
                                Matrix matrix4 = c9195o.f83073t;
                                Canvas canvas2 = this.f83107a;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                C9181g.C9196p c9196p9 = c9195o.f83069p;
                                float d12 = c9196p9 != null ? c9196p9.d(this) : 0.0f;
                                C9181g.C9196p c9196p10 = c9195o.f83070q;
                                float e13 = c9196p10 != null ? c9196p10.e(this) : 0.0f;
                                float d13 = c9195o.f83071r.d(this);
                                float d14 = c9195o.f83072s.d(this);
                                C1413h c1413h2 = this.f83109c;
                                c1413h2.f83146f = new C9181g.C9183b(d12, e13, d13, d14);
                                if (!c1413h2.f83141a.f82984v.booleanValue()) {
                                    C9181g.C9183b c9183b5 = this.f83109c.f83146f;
                                    U(c9183b5.f83034a, c9183b5.f83035b, c9183b5.f83036c, c9183b5.f83037d);
                                }
                                c9195o.f83003h = this.f83109c.f83146f;
                                Z(c9195o);
                                j(c9195o, c9195o.f83003h);
                                boolean M15 = M();
                                c0();
                                canvas2.save();
                                canvas2.concat(i(this.f83109c.f83146f, c9183b4, c9179e2));
                                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(this.f83109c.f83141a.f82962M != C9181g.E.e.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (M15) {
                                    L(c9195o.f83003h);
                                }
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.C9202v) {
                    C9181g.C9202v c9202v = (C9181g.C9202v) n11;
                    if (c9202v.f83092o != null) {
                        b0(c9202v, this.f83109c);
                        if (o() && d0()) {
                            C1413h c1413h3 = this.f83109c;
                            if (c1413h3.f83143c || c1413h3.f83142b) {
                                Matrix matrix5 = c9202v.f83066n;
                                if (matrix5 != null) {
                                    this.f83107a.concat(matrix5);
                                }
                                Path path = new d(c9202v.f83092o).f83129a;
                                if (c9202v.f83003h == null) {
                                    c9202v.f83003h = g(path);
                                }
                                Z(c9202v);
                                k(c9202v);
                                j(c9202v, c9202v.f83003h);
                                boolean M16 = M();
                                C1413h c1413h4 = this.f83109c;
                                if (c1413h4.f83142b) {
                                    C9181g.E.a aVar = c1413h4.f83141a.f82965c;
                                    path.setFillType((aVar == null || aVar != C9181g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    p(c9202v, path);
                                }
                                if (this.f83109c.f83143c) {
                                    q(path);
                                }
                                S(c9202v);
                                if (M16) {
                                    L(c9202v.f83003h);
                                }
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.B) {
                    C9181g.B b11 = (C9181g.B) n11;
                    C9181g.C9196p c9196p11 = b11.f82945q;
                    if (c9196p11 != null && b11.f82946r != null && !c9196p11.g() && !b11.f82946r.g()) {
                        b0(b11, this.f83109c);
                        if (o() && d0()) {
                            Matrix matrix6 = b11.f83066n;
                            if (matrix6 != null) {
                                this.f83107a.concat(matrix6);
                            }
                            Path I11 = I(b11);
                            Z(b11);
                            k(b11);
                            j(b11, b11.f83003h);
                            boolean M17 = M();
                            if (this.f83109c.f83142b) {
                                p(b11, I11);
                            }
                            if (this.f83109c.f83143c) {
                                q(I11);
                            }
                            if (M17) {
                                L(b11.f83003h);
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.C9185d) {
                    C9181g.C9185d c9185d = (C9181g.C9185d) n11;
                    C9181g.C9196p c9196p12 = c9185d.f83045q;
                    if (c9196p12 != null && !c9196p12.g()) {
                        b0(c9185d, this.f83109c);
                        if (o() && d0()) {
                            Matrix matrix7 = c9185d.f83066n;
                            if (matrix7 != null) {
                                this.f83107a.concat(matrix7);
                            }
                            Path F11 = F(c9185d);
                            Z(c9185d);
                            k(c9185d);
                            j(c9185d, c9185d.f83003h);
                            boolean M18 = M();
                            if (this.f83109c.f83142b) {
                                p(c9185d, F11);
                            }
                            if (this.f83109c.f83143c) {
                                q(F11);
                            }
                            if (M18) {
                                L(c9185d.f83003h);
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.C9189i) {
                    C9181g.C9189i c9189i = (C9181g.C9189i) n11;
                    C9181g.C9196p c9196p13 = c9189i.f83059q;
                    if (c9196p13 != null && c9189i.f83060r != null && !c9196p13.g() && !c9189i.f83060r.g()) {
                        b0(c9189i, this.f83109c);
                        if (o() && d0()) {
                            Matrix matrix8 = c9189i.f83066n;
                            if (matrix8 != null) {
                                this.f83107a.concat(matrix8);
                            }
                            Path G11 = G(c9189i);
                            Z(c9189i);
                            k(c9189i);
                            j(c9189i, c9189i.f83003h);
                            boolean M19 = M();
                            if (this.f83109c.f83142b) {
                                p(c9189i, G11);
                            }
                            if (this.f83109c.f83143c) {
                                q(G11);
                            }
                            if (M19) {
                                L(c9189i.f83003h);
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.C9197q) {
                    C9181g.C9197q c9197q = (C9181g.C9197q) n11;
                    b0(c9197q, this.f83109c);
                    if (o() && d0() && this.f83109c.f83143c) {
                        Matrix matrix9 = c9197q.f83066n;
                        if (matrix9 != null) {
                            this.f83107a.concat(matrix9);
                        }
                        C9181g.C9196p c9196p14 = c9197q.f83076o;
                        float d15 = c9196p14 == null ? 0.0f : c9196p14.d(this);
                        C9181g.C9196p c9196p15 = c9197q.f83077p;
                        float e14 = c9196p15 == null ? 0.0f : c9196p15.e(this);
                        C9181g.C9196p c9196p16 = c9197q.f83078q;
                        float d16 = c9196p16 == null ? 0.0f : c9196p16.d(this);
                        C9181g.C9196p c9196p17 = c9197q.f83079r;
                        r3 = c9196p17 != null ? c9196p17.e(this) : 0.0f;
                        if (c9197q.f83003h == null) {
                            c9197q.f83003h = new C9181g.C9183b(Math.min(d15, d16), Math.min(e14, r3), Math.abs(d16 - d15), Math.abs(r3 - e14));
                        }
                        Path path2 = new Path();
                        path2.moveTo(d15, e14);
                        path2.lineTo(d16, r3);
                        Z(c9197q);
                        k(c9197q);
                        j(c9197q, c9197q.f83003h);
                        boolean M21 = M();
                        q(path2);
                        S(c9197q);
                        if (M21) {
                            L(c9197q.f83003h);
                        }
                    }
                } else if (n11 instanceof C9181g.A) {
                    C9181g.A a11 = (C9181g.A) n11;
                    b0(a11, this.f83109c);
                    if (o() && d0()) {
                        C1413h c1413h5 = this.f83109c;
                        if (c1413h5.f83143c || c1413h5.f83142b) {
                            Matrix matrix10 = a11.f83066n;
                            if (matrix10 != null) {
                                this.f83107a.concat(matrix10);
                            }
                            if (a11.f83105o.length >= 2) {
                                Path H11 = H(a11);
                                Z(a11);
                                k(a11);
                                j(a11, a11.f83003h);
                                boolean M22 = M();
                                if (this.f83109c.f83142b) {
                                    p(a11, H11);
                                }
                                if (this.f83109c.f83143c) {
                                    q(H11);
                                }
                                S(a11);
                                if (M22) {
                                    L(a11.f83003h);
                                }
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.C9206z) {
                    C9181g.C9206z c9206z = (C9181g.C9206z) n11;
                    b0(c9206z, this.f83109c);
                    if (o() && d0()) {
                        C1413h c1413h6 = this.f83109c;
                        if (c1413h6.f83143c || c1413h6.f83142b) {
                            Matrix matrix11 = c9206z.f83066n;
                            if (matrix11 != null) {
                                this.f83107a.concat(matrix11);
                            }
                            if (c9206z.f83105o.length >= 2) {
                                Path H12 = H(c9206z);
                                Z(c9206z);
                                C9181g.E.a aVar2 = this.f83109c.f83141a.f82965c;
                                H12.setFillType((aVar2 == null || aVar2 != C9181g.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                k(c9206z);
                                j(c9206z, c9206z.f83003h);
                                boolean M23 = M();
                                if (this.f83109c.f83142b) {
                                    p(c9206z, H12);
                                }
                                if (this.f83109c.f83143c) {
                                    q(H12);
                                }
                                S(c9206z);
                                if (M23) {
                                    L(c9206z.f83003h);
                                }
                            }
                        }
                    }
                } else if (n11 instanceof C9181g.W) {
                    C9181g.W w11 = (C9181g.W) n11;
                    b0(w11, this.f83109c);
                    if (o()) {
                        Matrix matrix12 = w11.f83025r;
                        if (matrix12 != null) {
                            this.f83107a.concat(matrix12);
                        }
                        ArrayList arrayList = w11.f83030n;
                        float d17 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((C9181g.C9196p) w11.f83030n.get(0)).d(this);
                        ArrayList arrayList2 = w11.f83031o;
                        float e15 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((C9181g.C9196p) w11.f83031o.get(0)).e(this);
                        ArrayList arrayList3 = w11.f83032p;
                        float d18 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C9181g.C9196p) w11.f83032p.get(0)).d(this);
                        ArrayList arrayList4 = w11.f83033q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            r3 = ((C9181g.C9196p) w11.f83033q.get(0)).e(this);
                        }
                        C9181g.E.f z11 = z();
                        if (z11 != C9181g.E.f.Start) {
                            float h11 = h(w11);
                            if (z11 == C9181g.E.f.Middle) {
                                h11 /= 2.0f;
                            }
                            d17 -= h11;
                        }
                        if (w11.f83003h == null) {
                            i iVar = new i(d17, e15);
                            r(w11, iVar);
                            RectF rectF = iVar.f83151c;
                            w11.f83003h = new C9181g.C9183b(rectF.left, rectF.top, rectF.width(), iVar.f83151c.height());
                        }
                        Z(w11);
                        k(w11);
                        j(w11, w11.f83003h);
                        boolean M24 = M();
                        r(w11, new f(d17 + d18, e15 + r3));
                        if (M24) {
                            L(w11.f83003h);
                        }
                    }
                }
            }
        }
        W();
    }

    private void P(C9181g.H h11, boolean z11) {
        if (z11) {
            this.f83111e.push(h11);
            this.f83112f.push(this.f83107a.getMatrix());
        }
        Iterator it = h11.f82993i.iterator();
        while (it.hasNext()) {
            O((C9181g.N) it.next());
        }
        if (z11) {
            this.f83111e.pop();
            this.f83112f.pop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ff, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void R(C9181g.C9198r c9198r, c cVar) {
        float f7;
        C9181g.C9183b c9183b;
        boolean M11;
        float f11;
        float f12;
        float f13;
        X();
        Float f14 = c9198r.f83085u;
        float f15 = 0.0f;
        if (f14 != null) {
            if (Float.isNaN(f14.floatValue())) {
                float f16 = cVar.f83126c;
                if (f16 != 0.0f || cVar.f83127d != 0.0f) {
                    f7 = (float) Math.toDegrees(Math.atan2(cVar.f83127d, f16));
                }
            } else {
                f7 = c9198r.f83085u.floatValue();
            }
            float c11 = !c9198r.f83080p ? 1.0f : this.f83109c.f83141a.f82969g.c();
            this.f83109c = x(c9198r);
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.f83124a, cVar.f83125b);
            matrix.preRotate(f7);
            matrix.preScale(c11, c11);
            C9181g.C9196p c9196p = c9198r.f83081q;
            float d11 = c9196p == null ? c9196p.d(this) : 0.0f;
            C9181g.C9196p c9196p2 = c9198r.f83082r;
            float e11 = c9196p2 == null ? c9196p2.e(this) : 0.0f;
            C9181g.C9196p c9196p3 = c9198r.f83083s;
            float d12 = c9196p3 == null ? c9196p3.d(this) : 3.0f;
            C9181g.C9196p c9196p4 = c9198r.f83084t;
            float e12 = c9196p4 != null ? c9196p4.e(this) : 3.0f;
            c9183b = c9198r.f83021o;
            Canvas canvas = this.f83107a;
            if (c9183b == null) {
                float f17 = d12 / c9183b.f83036c;
                float f18 = e12 / c9183b.f83037d;
                C9179e c9179e = c9198r.f83015n;
                if (c9179e == null) {
                    c9179e = C9179e.f82935d;
                }
                if (!c9179e.equals(C9179e.f82934c)) {
                    f17 = c9179e.b() == C9179e.b.slice ? Math.max(f17, f18) : Math.min(f17, f18);
                    f18 = f17;
                }
                matrix.preTranslate((-d11) * f17, (-e11) * f18);
                canvas.concat(matrix);
                C9181g.C9183b c9183b2 = c9198r.f83021o;
                float f19 = c9183b2.f83036c * f17;
                float f21 = c9183b2.f83037d * f18;
                int[] iArr = a.f83113a;
                switch (iArr[c9179e.a().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f11 = (d12 - f19) / 2.0f;
                        f12 = 0.0f - f11;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f11 = d12 - f19;
                        f12 = 0.0f - f11;
                        break;
                    default:
                        f12 = 0.0f;
                        break;
                }
                int i11 = iArr[c9179e.a().ordinal()];
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 5) {
                            if (i11 != 6) {
                                if (i11 != 7) {
                                }
                            }
                        }
                    }
                    f13 = e12 - f21;
                    f15 = 0.0f - f13;
                    if (!this.f83109c.f83141a.f82984v.booleanValue()) {
                        U(f12, f15, d12, e12);
                    }
                    matrix.reset();
                    matrix.preScale(f17, f18);
                    canvas.concat(matrix);
                }
                f13 = (e12 - f21) / 2.0f;
                f15 = 0.0f - f13;
                if (!this.f83109c.f83141a.f82984v.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f17, f18);
                canvas.concat(matrix);
            } else {
                matrix.preTranslate(-d11, -e11);
                canvas.concat(matrix);
                if (!this.f83109c.f83141a.f82984v.booleanValue()) {
                    U(0.0f, 0.0f, d12, e12);
                }
            }
            M11 = M();
            P(c9198r, false);
            if (M11) {
                L(c9198r.f83003h);
            }
            W();
        }
        f7 = 0.0f;
        if (!c9198r.f83080p) {
        }
        this.f83109c = x(c9198r);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(cVar.f83124a, cVar.f83125b);
        matrix2.preRotate(f7);
        matrix2.preScale(c11, c11);
        C9181g.C9196p c9196p5 = c9198r.f83081q;
        if (c9196p5 == null) {
        }
        C9181g.C9196p c9196p22 = c9198r.f83082r;
        if (c9196p22 == null) {
        }
        C9181g.C9196p c9196p32 = c9198r.f83083s;
        if (c9196p32 == null) {
        }
        C9181g.C9196p c9196p42 = c9198r.f83084t;
        if (c9196p42 != null) {
        }
        c9183b = c9198r.f83021o;
        Canvas canvas2 = this.f83107a;
        if (c9183b == null) {
        }
        M11 = M();
        P(c9198r, false);
        if (M11) {
        }
        W();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void S(C9181g.AbstractC9192l abstractC9192l) {
        C9181g.C9198r c9198r;
        String str;
        C9181g.C9198r c9198r2;
        String str2;
        C9181g.C9198r c9198r3;
        int i11;
        float f7;
        float f11;
        float f12;
        ArrayList arrayList;
        int size;
        int i12;
        C9181g.E e11 = this.f83109c.f83141a;
        String str3 = e11.f82986x;
        if (str3 == null && e11.f82987y == null && e11.f82988z == null) {
            return;
        }
        if (str3 != null) {
            C9181g.L m11 = abstractC9192l.f83013a.m(str3);
            if (m11 != null) {
                c9198r = (C9181g.C9198r) m11;
                str = this.f83109c.f83141a.f82987y;
                if (str != null) {
                    C9181g.L m12 = abstractC9192l.f83013a.m(str);
                    if (m12 != null) {
                        c9198r2 = (C9181g.C9198r) m12;
                        str2 = this.f83109c.f83141a.f82988z;
                        if (str2 != null) {
                            C9181g.L m13 = abstractC9192l.f83013a.m(str2);
                            if (m13 != null) {
                                c9198r3 = (C9181g.C9198r) m13;
                                float f13 = 0.0f;
                                if (!(abstractC9192l instanceof C9181g.C9202v)) {
                                    arrayList = new b(this, ((C9181g.C9202v) abstractC9192l).f83092o).f();
                                    f11 = 0.0f;
                                    i11 = 1;
                                } else if (abstractC9192l instanceof C9181g.C9197q) {
                                    C9181g.C9197q c9197q = (C9181g.C9197q) abstractC9192l;
                                    C9181g.C9196p c9196p = c9197q.f83076o;
                                    float d11 = c9196p != null ? c9196p.d(this) : 0.0f;
                                    C9181g.C9196p c9196p2 = c9197q.f83077p;
                                    float e12 = c9196p2 != null ? c9196p2.e(this) : 0.0f;
                                    C9181g.C9196p c9196p3 = c9197q.f83078q;
                                    float d12 = c9196p3 != null ? c9196p3.d(this) : 0.0f;
                                    C9181g.C9196p c9196p4 = c9197q.f83079r;
                                    float e13 = c9196p4 != null ? c9196p4.e(this) : 0.0f;
                                    ArrayList arrayList2 = new ArrayList(2);
                                    float f14 = d12 - d11;
                                    i11 = 1;
                                    float f15 = e13 - e12;
                                    arrayList2.add(new c(d11, e12, f14, f15));
                                    arrayList2.add(new c(d12, e13, f14, f15));
                                    f11 = 0.0f;
                                    arrayList = arrayList2;
                                } else {
                                    i11 = 1;
                                    C9181g.C9206z c9206z = (C9181g.C9206z) abstractC9192l;
                                    int length = c9206z.f83105o.length;
                                    if (length < 2) {
                                        arrayList = null;
                                        f11 = 0.0f;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        float[] fArr = c9206z.f83105o;
                                        c cVar = new c(fArr[0], fArr[1], 0.0f, 0.0f);
                                        int i13 = 2;
                                        float f16 = 0.0f;
                                        float f17 = 0.0f;
                                        while (true) {
                                            f7 = cVar.f83125b;
                                            f11 = f13;
                                            f12 = cVar.f83124a;
                                            if (i13 >= length) {
                                                break;
                                            }
                                            float[] fArr2 = c9206z.f83105o;
                                            float f18 = fArr2[i13];
                                            float f19 = fArr2[i13 + 1];
                                            cVar.a(f18, f19);
                                            arrayList3.add(cVar);
                                            cVar = new c(f18, f19, f18 - f12, f19 - f7);
                                            i13 += 2;
                                            f17 = f19;
                                            f16 = f18;
                                            f13 = f11;
                                        }
                                        if (c9206z instanceof C9181g.A) {
                                            float[] fArr3 = c9206z.f83105o;
                                            float f21 = fArr3[0];
                                            if (f16 != f21) {
                                                float f22 = fArr3[1];
                                                if (f17 != f22) {
                                                    cVar.a(f21, f22);
                                                    arrayList3.add(cVar);
                                                    c cVar2 = new c(f21, f22, f21 - f12, f22 - f7);
                                                    cVar2.b((c) arrayList3.get(0));
                                                    arrayList3.add(cVar2);
                                                    arrayList3.set(0, cVar2);
                                                }
                                            }
                                        } else {
                                            arrayList3.add(cVar);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (arrayList == null && (size = arrayList.size()) != 0) {
                                    C9181g.E e14 = this.f83109c.f83141a;
                                    e14.f82988z = null;
                                    e14.f82987y = null;
                                    e14.f82986x = null;
                                    if (c9198r != null) {
                                        R(c9198r, (c) arrayList.get(0));
                                    }
                                    if (c9198r2 != null && arrayList.size() > 2) {
                                        c cVar3 = (c) arrayList.get(0);
                                        c cVar4 = (c) arrayList.get(i11);
                                        i12 = 1;
                                        while (i12 < size - 1) {
                                            i12++;
                                            c cVar5 = (c) arrayList.get(i12);
                                            if (cVar4.f83128e) {
                                                float f23 = cVar4.f83126c;
                                                float f24 = cVar4.f83127d;
                                                float f25 = cVar3.f83124a;
                                                float f26 = cVar4.f83124a;
                                                float f27 = cVar4.f83125b;
                                                float f28 = ((f27 - cVar3.f83125b) * f24) + ((f26 - f25) * f23);
                                                if (f28 == f11) {
                                                    f28 = ((cVar5.f83124a - f26) * f23) + ((cVar5.f83125b - f27) * f24);
                                                }
                                                if (f28 <= f11 && (f28 != f11 || (f23 <= f11 && f24 < f11))) {
                                                    cVar4.f83126c = -f23;
                                                    cVar4.f83127d = -f24;
                                                }
                                            }
                                            R(c9198r2, cVar4);
                                            cVar3 = cVar4;
                                            cVar4 = cVar5;
                                        }
                                    }
                                    if (c9198r3 == null) {
                                        R(c9198r3, (c) arrayList.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            s("Marker reference '%s' not found", this.f83109c.f83141a.f82988z);
                        }
                        c9198r3 = null;
                        float f132 = 0.0f;
                        if (!(abstractC9192l instanceof C9181g.C9202v)) {
                        }
                        if (arrayList == null) {
                            return;
                        }
                        C9181g.E e142 = this.f83109c.f83141a;
                        e142.f82988z = null;
                        e142.f82987y = null;
                        e142.f82986x = null;
                        if (c9198r != null) {
                        }
                        if (c9198r2 != null) {
                            c cVar32 = (c) arrayList.get(0);
                            c cVar42 = (c) arrayList.get(i11);
                            i12 = 1;
                            while (i12 < size - 1) {
                            }
                        }
                        if (c9198r3 == null) {
                        }
                    } else {
                        s("Marker reference '%s' not found", this.f83109c.f83141a.f82987y);
                    }
                }
                c9198r2 = null;
                str2 = this.f83109c.f83141a.f82988z;
                if (str2 != null) {
                }
                c9198r3 = null;
                float f1322 = 0.0f;
                if (!(abstractC9192l instanceof C9181g.C9202v)) {
                }
                if (arrayList == null) {
                }
            } else {
                s("Marker reference '%s' not found", this.f83109c.f83141a.f82986x);
            }
        }
        c9198r = null;
        str = this.f83109c.f83141a.f82987y;
        if (str != null) {
        }
        c9198r2 = null;
        str2 = this.f83109c.f83141a.f82988z;
        if (str2 != null) {
        }
        c9198r3 = null;
        float f13222 = 0.0f;
        if (!(abstractC9192l instanceof C9181g.C9202v)) {
        }
        if (arrayList == null) {
        }
    }

    private void T(C9181g.C9199s c9199s, C9181g.C9183b c9183b) {
        float f7;
        float f11;
        Boolean bool = c9199s.f83086n;
        if (bool == null || !bool.booleanValue()) {
            C9181g.C9196p c9196p = c9199s.f83088p;
            float b11 = c9196p != null ? c9196p.b(this, 1.0f) : 1.2f;
            C9181g.C9196p c9196p2 = c9199s.f83089q;
            float b12 = c9196p2 != null ? c9196p2.b(this, 1.0f) : 1.2f;
            f7 = b11 * c9183b.f83036c;
            f11 = b12 * c9183b.f83037d;
        } else {
            C9181g.C9196p c9196p3 = c9199s.f83088p;
            f7 = c9196p3 != null ? c9196p3.d(this) : c9183b.f83036c;
            C9181g.C9196p c9196p4 = c9199s.f83089q;
            f11 = c9196p4 != null ? c9196p4.e(this) : c9183b.f83037d;
        }
        if (f7 == 0.0f || f11 == 0.0f) {
            return;
        }
        X();
        C1413h x11 = x(c9199s);
        this.f83109c = x11;
        x11.f83141a.f82975m = Float.valueOf(1.0f);
        boolean M11 = M();
        Canvas canvas = this.f83107a;
        canvas.save();
        Boolean bool2 = c9199s.f83087o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c9183b.f83034a, c9183b.f83035b);
            canvas.scale(c9183b.f83036c, c9183b.f83037d);
        }
        P(c9199s, false);
        canvas.restore();
        if (M11) {
            L(c9183b);
        }
        W();
    }

    private void U(float f7, float f11, float f12, float f13) {
        float f14 = f12 + f7;
        float f15 = f13 + f11;
        C9181g.C9184c c9184c = this.f83109c.f83141a.f82985w;
        if (c9184c != null) {
            f7 += c9184c.f83041d.d(this);
            f11 += this.f83109c.f83141a.f82985w.f83038a.e(this);
            f14 -= this.f83109c.f83141a.f82985w.f83039b.d(this);
            f15 -= this.f83109c.f83141a.f82985w.f83040c.e(this);
        }
        this.f83107a.clipRect(f7, f11, f14, f15);
    }

    private static void V(C1413h c1413h, boolean z11, C9181g.O o11) {
        int i11;
        C9181g.E e11 = c1413h.f83141a;
        float floatValue = (z11 ? e11.f82966d : e11.f82968f).floatValue();
        if (o11 instanceof C9181g.C9187f) {
            i11 = ((C9181g.C9187f) o11).f83055a;
        } else if (!(o11 instanceof C9181g.C1412g)) {
            return;
        } else {
            i11 = c1413h.f83141a.f82976n.f83055a;
        }
        int m11 = m(floatValue, i11);
        if (z11) {
            c1413h.f83144d.setColor(m11);
        } else {
            c1413h.f83145e.setColor(m11);
        }
    }

    private void W() {
        this.f83107a.restore();
        this.f83109c = this.f83110d.pop();
    }

    private void X() {
        this.f83107a.save();
        this.f83110d.push(this.f83109c);
        this.f83109c = new C1413h(this.f83109c);
    }

    private String Y(String str, boolean z11, boolean z12) {
        if (this.f83109c.f83148h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z11) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z12) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private void Z(C9181g.K k11) {
        if (k11.f83014b == null || k11.f83003h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f83112f.peek().invert(matrix)) {
            C9181g.C9183b c9183b = k11.f83003h;
            float f7 = c9183b.f83034a;
            float f11 = c9183b.f83035b;
            float a11 = c9183b.a();
            C9181g.C9183b c9183b2 = k11.f83003h;
            float f12 = c9183b2.f83035b;
            float a12 = c9183b2.a();
            float b11 = k11.f83003h.b();
            C9181g.C9183b c9183b3 = k11.f83003h;
            float[] fArr = {f7, f11, a11, f12, a12, b11, c9183b3.f83034a, c9183b3.b()};
            matrix.preConcat(this.f83107a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i11 = 2; i11 <= 6; i11 += 2) {
                float f15 = fArr[i11];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i11 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            C9181g.K k12 = (C9181g.K) this.f83111e.peek();
            C9181g.C9183b c9183b4 = k12.f83003h;
            if (c9183b4 == null) {
                float f17 = rectF.left;
                float f18 = rectF.top;
                k12.f83003h = new C9181g.C9183b(f17, f18, rectF.right - f17, rectF.bottom - f18);
                return;
            }
            float f19 = rectF.left;
            float f21 = rectF.top;
            float f22 = rectF.right - f19;
            float f23 = rectF.bottom - f21;
            if (f19 < c9183b4.f83034a) {
                c9183b4.f83034a = f19;
            }
            if (f21 < c9183b4.f83035b) {
                c9183b4.f83035b = f21;
            }
            if (f19 + f22 > c9183b4.a()) {
                c9183b4.f83036c = (f19 + f22) - c9183b4.f83034a;
            }
            if (f21 + f23 > c9183b4.b()) {
                c9183b4.f83037d = (f21 + f23) - c9183b4.f83035b;
            }
        }
    }

    private void a0(C1413h c1413h, C9181g.E e11) {
        C9181g.E e12;
        if (E(e11, 4096L)) {
            c1413h.f83141a.f82976n = e11.f82976n;
        }
        if (E(e11, 2048L)) {
            c1413h.f83141a.f82975m = e11.f82975m;
        }
        boolean E11 = E(e11, 1L);
        C9181g.C9187f c9187f = C9181g.C9187f.f83054c;
        if (E11) {
            c1413h.f83141a.f82964b = e11.f82964b;
            C9181g.O o11 = e11.f82964b;
            c1413h.f83142b = (o11 == null || o11 == c9187f) ? false : true;
        }
        if (E(e11, 4L)) {
            c1413h.f83141a.f82966d = e11.f82966d;
        }
        if (E(e11, 6149L)) {
            V(c1413h, true, c1413h.f83141a.f82964b);
        }
        if (E(e11, 2L)) {
            c1413h.f83141a.f82965c = e11.f82965c;
        }
        if (E(e11, 8L)) {
            c1413h.f83141a.f82967e = e11.f82967e;
            C9181g.O o12 = e11.f82967e;
            c1413h.f83143c = (o12 == null || o12 == c9187f) ? false : true;
        }
        if (E(e11, 16L)) {
            c1413h.f83141a.f82968f = e11.f82968f;
        }
        if (E(e11, 6168L)) {
            V(c1413h, false, c1413h.f83141a.f82967e);
        }
        if (E(e11, 34359738368L)) {
            c1413h.f83141a.f82961L = e11.f82961L;
        }
        if (E(e11, 32L)) {
            C9181g.E e13 = c1413h.f83141a;
            C9181g.C9196p c9196p = e11.f82969g;
            e13.f82969g = c9196p;
            c1413h.f83145e.setStrokeWidth(c9196p.a(this));
        }
        if (E(e11, 64L)) {
            c1413h.f83141a.f82970h = e11.f82970h;
            int i11 = a.f83114b[e11.f82970h.ordinal()];
            Paint paint = c1413h.f83145e;
            if (i11 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i11 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i11 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (E(e11, 128L)) {
            c1413h.f83141a.f82971i = e11.f82971i;
            int i12 = a.f83115c[e11.f82971i.ordinal()];
            Paint paint2 = c1413h.f83145e;
            if (i12 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i12 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i12 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (E(e11, 256L)) {
            c1413h.f83141a.f82972j = e11.f82972j;
            c1413h.f83145e.setStrokeMiter(e11.f82972j.floatValue());
        }
        if (E(e11, 512L)) {
            c1413h.f83141a.f82973k = e11.f82973k;
        }
        if (E(e11, 1024L)) {
            c1413h.f83141a.f82974l = e11.f82974l;
        }
        Typeface typeface = null;
        if (E(e11, 1536L)) {
            C9181g.C9196p[] c9196pArr = c1413h.f83141a.f82973k;
            Paint paint3 = c1413h.f83145e;
            if (c9196pArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c9196pArr.length;
                int i13 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i13];
                int i14 = 0;
                float f7 = 0.0f;
                while (true) {
                    e12 = c1413h.f83141a;
                    if (i14 >= i13) {
                        break;
                    }
                    float a11 = e12.f82973k[i14 % length].a(this);
                    fArr[i14] = a11;
                    f7 += a11;
                    i14++;
                }
                if (f7 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float a12 = e12.f82974l.a(this);
                    if (a12 < 0.0f) {
                        a12 = (a12 % f7) + f7;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, a12));
                }
            }
        }
        if (E(e11, 16384L)) {
            float B11 = B();
            c1413h.f83141a.f82978p = e11.f82978p;
            c1413h.f83144d.setTextSize(e11.f82978p.b(this, B11));
            c1413h.f83145e.setTextSize(e11.f82978p.b(this, B11));
        }
        if (E(e11, 8192L)) {
            c1413h.f83141a.f82977o = e11.f82977o;
        }
        if (E(e11, 32768L)) {
            if (e11.f82979q.intValue() == -1 && c1413h.f83141a.f82979q.intValue() > 100) {
                C9181g.E e14 = c1413h.f83141a;
                e14.f82979q = Integer.valueOf(e14.f82979q.intValue() - 100);
            } else if (e11.f82979q.intValue() != 1 || c1413h.f83141a.f82979q.intValue() >= 900) {
                c1413h.f83141a.f82979q = e11.f82979q;
            } else {
                C9181g.E e15 = c1413h.f83141a;
                e15.f82979q = Integer.valueOf(e15.f82979q.intValue() + 100);
            }
        }
        if (E(e11, 65536L)) {
            c1413h.f83141a.f82980r = e11.f82980r;
        }
        if (E(e11, 106496L)) {
            C9181g.E e16 = c1413h.f83141a;
            ArrayList arrayList = e16.f82977o;
            if (arrayList != null && this.f83108b != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typeface = l((String) it.next(), e16.f82979q, e16.f82980r)) == null) {
                }
            }
            if (typeface == null) {
                typeface = l("serif", e16.f82979q, e16.f82980r);
            }
            c1413h.f83144d.setTypeface(typeface);
            c1413h.f83145e.setTypeface(typeface);
        }
        if (E(e11, 131072L)) {
            c1413h.f83141a.f82981s = e11.f82981s;
            Paint paint4 = c1413h.f83144d;
            C9181g.E.EnumC1411g enumC1411g = e11.f82981s;
            C9181g.E.EnumC1411g enumC1411g2 = C9181g.E.EnumC1411g.LineThrough;
            paint4.setStrikeThruText(enumC1411g == enumC1411g2);
            C9181g.E.EnumC1411g enumC1411g3 = e11.f82981s;
            C9181g.E.EnumC1411g enumC1411g4 = C9181g.E.EnumC1411g.Underline;
            paint4.setUnderlineText(enumC1411g3 == enumC1411g4);
            Paint paint5 = c1413h.f83145e;
            paint5.setStrikeThruText(e11.f82981s == enumC1411g2);
            paint5.setUnderlineText(e11.f82981s == enumC1411g4);
        }
        if (E(e11, 68719476736L)) {
            c1413h.f83141a.f82982t = e11.f82982t;
        }
        if (E(e11, 262144L)) {
            c1413h.f83141a.f82983u = e11.f82983u;
        }
        if (E(e11, 524288L)) {
            c1413h.f83141a.f82984v = e11.f82984v;
        }
        if (E(e11, 2097152L)) {
            c1413h.f83141a.f82986x = e11.f82986x;
        }
        if (E(e11, 4194304L)) {
            c1413h.f83141a.f82987y = e11.f82987y;
        }
        if (E(e11, 8388608L)) {
            c1413h.f83141a.f82988z = e11.f82988z;
        }
        if (E(e11, 16777216L)) {
            c1413h.f83141a.f82950A = e11.f82950A;
        }
        if (E(e11, 33554432L)) {
            c1413h.f83141a.f82951B = e11.f82951B;
        }
        if (E(e11, W2.MAX_EVENT_SIZE_BYTES)) {
            c1413h.f83141a.f82985w = e11.f82985w;
        }
        if (E(e11, 268435456L)) {
            c1413h.f83141a.f82954E = e11.f82954E;
        }
        if (E(e11, 536870912L)) {
            c1413h.f83141a.f82955F = e11.f82955F;
        }
        if (E(e11, 1073741824L)) {
            c1413h.f83141a.f82956G = e11.f82956G;
        }
        if (E(e11, 67108864L)) {
            c1413h.f83141a.f82952C = e11.f82952C;
        }
        if (E(e11, 134217728L)) {
            c1413h.f83141a.f82953D = e11.f82953D;
        }
        if (E(e11, 8589934592L)) {
            c1413h.f83141a.f82959J = e11.f82959J;
        }
        if (E(e11, 17179869184L)) {
            c1413h.f83141a.f82960K = e11.f82960K;
        }
        if (E(e11, 137438953472L)) {
            c1413h.f83141a.f82962M = e11.f82962M;
        }
    }

    private void b0(C9181g.L l11, C1413h c1413h) {
        boolean z11 = l11.f83014b == null;
        C9181g.E e11 = c1413h.f83141a;
        Boolean bool = Boolean.TRUE;
        e11.f82950A = bool;
        if (!z11) {
            bool = Boolean.FALSE;
        }
        e11.f82984v = bool;
        e11.f82985w = null;
        e11.f82954E = null;
        e11.f82975m = Float.valueOf(1.0f);
        e11.f82952C = C9181g.C9187f.f83053b;
        e11.f82953D = Float.valueOf(1.0f);
        e11.f82956G = null;
        e11.f82957H = null;
        e11.f82958I = Float.valueOf(1.0f);
        e11.f82959J = null;
        e11.f82960K = Float.valueOf(1.0f);
        e11.f82961L = C9181g.E.i.None;
        C9181g.E e12 = l11.f83006e;
        if (e12 != null) {
            a0(c1413h, e12);
        }
        if (this.f83108b.k()) {
            Iterator it = ((ArrayList) this.f83108b.c()).iterator();
            while (it.hasNext()) {
                C9176b.p pVar = (C9176b.p) it.next();
                if (C9176b.i(pVar.f82919a, l11)) {
                    a0(c1413h, pVar.f82920b);
                }
            }
        }
        C9181g.E e13 = l11.f83007f;
        if (e13 != null) {
            a0(c1413h, e13);
        }
    }

    private void c0() {
        int i11;
        C9181g.E e11 = this.f83109c.f83141a;
        C9181g.O o11 = e11.f82959J;
        if (o11 instanceof C9181g.C9187f) {
            i11 = ((C9181g.C9187f) o11).f83055a;
        } else if (!(o11 instanceof C9181g.C1412g)) {
            return;
        } else {
            i11 = e11.f82976n.f83055a;
        }
        Float f7 = e11.f82960K;
        if (f7 != null) {
            i11 = m(f7.floatValue(), i11);
        }
        this.f83107a.drawColor(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d0() {
        Boolean bool = this.f83109c.f83141a.f82951B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    static void e(float f7, float f11, float f12, float f13, float f14, boolean z11, boolean z12, float f15, float f16, C9181g.InterfaceC9204x interfaceC9204x) {
        if (f7 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC9204x.b(f15, f16);
            return;
        }
        float abs = Math.abs(f12);
        float abs2 = Math.abs(f13);
        double radians = Math.toRadians(f14 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d11 = (f7 - f15) / 2.0d;
        double d12 = (f11 - f16) / 2.0d;
        double d13 = (sin * d12) + (cos * d11);
        double d14 = (cos * d12) + ((-sin) * d11);
        double d15 = abs * abs;
        double d16 = abs2 * abs2;
        double d17 = d13 * d13;
        double d18 = d14 * d14;
        double d19 = (d18 / d16) + (d17 / d15);
        if (d19 > 0.99999d) {
            double sqrt = Math.sqrt(d19) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d15 = abs * abs;
            d16 = abs2 * abs2;
        }
        double d21 = z11 == z12 ? -1.0d : 1.0d;
        double d22 = d15 * d16;
        double d23 = d15 * d18;
        double d24 = d16 * d17;
        double d25 = ((d22 - d23) - d24) / (d23 + d24);
        if (d25 < 0.0d) {
            d25 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d25) * d21;
        double d26 = abs;
        double d27 = abs2;
        double d28 = ((d26 * d14) / d27) * sqrt2;
        double d29 = sqrt2 * (-((d27 * d13) / d26));
        double d31 = ((cos * d28) - (sin * d29)) + ((f7 + f15) / 2.0d);
        double d32 = (cos * d29) + (sin * d28) + ((f11 + f16) / 2.0d);
        double d33 = (d13 - d28) / d26;
        double d34 = (d14 - d29) / d27;
        double d35 = ((-d13) - d28) / d26;
        double d36 = ((-d14) - d29) / d27;
        double d37 = (d34 * d34) + (d33 * d33);
        double acos = Math.acos(d33 / Math.sqrt(d37)) * (d34 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d34 * d36) + (d33 * d35)) / Math.sqrt(((d36 * d36) + (d35 * d35)) * d37);
        double acos2 = ((d33 * d36) - (d34 * d35) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z12 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z12 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d38 = acos2 % 6.283185307179586d;
        double d39 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d38) * 2.0d) / 3.141592653589793d);
        double d41 = d38 / ceil;
        double d42 = d41 / 2.0d;
        double sin2 = (Math.sin(d42) * 1.3333333333333333d) / (Math.cos(d42) + 1.0d);
        int i11 = ceil * 6;
        float[] fArr = new float[i11];
        int i12 = 0;
        int i13 = 0;
        while (i12 < ceil) {
            double d43 = d39;
            double d44 = (i12 * d41) + d43;
            double cos2 = Math.cos(d44);
            double sin3 = Math.sin(d44);
            int i14 = i12;
            int i15 = i13;
            fArr[i15] = (float) (cos2 - (sin2 * sin3));
            fArr[i13 + 1] = (float) ((cos2 * sin2) + sin3);
            double d45 = d44 + d41;
            double cos3 = Math.cos(d45);
            double sin4 = Math.sin(d45);
            fArr[i15 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i15 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i15 + 4] = (float) cos3;
            i13 = i15 + 6;
            fArr[i15 + 5] = (float) sin4;
            i12 = i14 + 1;
            d39 = d43;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d31, (float) d32);
        matrix.mapPoints(fArr);
        fArr[i11 - 2] = f15;
        fArr[i11 - 1] = f16;
        for (int i16 = 0; i16 < i11; i16 += 6) {
            interfaceC9204x.c(fArr[i16], fArr[i16 + 1], fArr[i16 + 2], fArr[i16 + 3], fArr[i16 + 4], fArr[i16 + 5]);
        }
    }

    @TargetApi(19)
    private Path f(C9181g.K k11, C9181g.C9183b c9183b) {
        Path K11;
        C9181g.L m11 = k11.f83013a.m(this.f83109c.f83141a.f82954E);
        if (m11 == null) {
            s("ClipPath reference '%s' not found", this.f83109c.f83141a.f82954E);
            return null;
        }
        C9181g.C9186e c9186e = (C9181g.C9186e) m11;
        this.f83110d.push(this.f83109c);
        this.f83109c = x(c9186e);
        Boolean bool = c9186e.f83047o;
        boolean z11 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z11) {
            matrix.preTranslate(c9183b.f83034a, c9183b.f83035b);
            matrix.preScale(c9183b.f83036c, c9183b.f83037d);
        }
        Matrix matrix2 = c9186e.f83067n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        Iterator it = c9186e.f82993i.iterator();
        while (it.hasNext()) {
            C9181g.N n11 = (C9181g.N) it.next();
            if ((n11 instanceof C9181g.K) && (K11 = K((C9181g.K) n11, true)) != null) {
                path.op(K11, Path.Op.UNION);
            }
        }
        if (this.f83109c.f83141a.f82954E != null) {
            if (c9186e.f83003h == null) {
                c9186e.f83003h = g(path);
            }
            Path f7 = f(c9186e, c9186e.f83003h);
            if (f7 != null) {
                path.op(f7, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f83109c = this.f83110d.pop();
        return path;
    }

    private static C9181g.C9183b g(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C9181g.C9183b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    private float h(C9181g.Y y11) {
        k kVar = new k();
        r(y11, kVar);
        return kVar.f83153a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
    
        if (r11 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Matrix i(C9181g.C9183b c9183b, C9181g.C9183b c9183b2, C9179e c9179e) {
        float f7;
        float f11;
        Matrix matrix = new Matrix();
        if (c9179e != null && c9179e.a() != null) {
            float f12 = c9183b.f83036c / c9183b2.f83036c;
            float f13 = c9183b.f83037d / c9183b2.f83037d;
            float f14 = -c9183b2.f83034a;
            float f15 = -c9183b2.f83035b;
            if (c9179e.equals(C9179e.f82934c)) {
                matrix.preTranslate(c9183b.f83034a, c9183b.f83035b);
                matrix.preScale(f12, f13);
                matrix.preTranslate(f14, f15);
                return matrix;
            }
            float max = c9179e.b() == C9179e.b.slice ? Math.max(f12, f13) : Math.min(f12, f13);
            float f16 = c9183b.f83036c / max;
            float f17 = c9183b.f83037d / max;
            int[] iArr = a.f83113a;
            switch (iArr[c9179e.a().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f11 = (c9183b2.f83036c - f16) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f11 = c9183b2.f83036c - f16;
                    break;
            }
            f14 -= f11;
            int i11 = iArr[c9179e.a().ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 != 7) {
                            }
                        }
                    }
                }
                f7 = c9183b2.f83037d - f17;
                f15 -= f7;
                matrix.preTranslate(c9183b.f83034a, c9183b.f83035b);
                matrix.preScale(max, max);
                matrix.preTranslate(f14, f15);
            }
            f7 = (c9183b2.f83037d - f17) / 2.0f;
            f15 -= f7;
            matrix.preTranslate(c9183b.f83034a, c9183b.f83035b);
            matrix.preScale(max, max);
            matrix.preTranslate(f14, f15);
        }
        return matrix;
    }

    private void j(C9181g.K k11, C9181g.C9183b c9183b) {
        Path f7;
        if (this.f83109c.f83141a.f82954E == null || (f7 = f(k11, c9183b)) == null) {
            return;
        }
        this.f83107a.clipPath(f7);
    }

    private void k(C9181g.K k11) {
        C9181g.O o11 = this.f83109c.f83141a.f82964b;
        if (o11 instanceof C9181g.C9201u) {
            n(true, k11.f83003h, (C9181g.C9201u) o11);
        }
        C9181g.O o12 = this.f83109c.f83141a.f82967e;
        if (o12 instanceof C9181g.C9201u) {
            n(false, k11.f83003h, (C9181g.C9201u) o12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0047, code lost:
    
        if (r5.equals("fantasy") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface l(String str, Integer num, C9181g.E.b bVar) {
        char c11 = 2;
        boolean z11 = bVar == C9181g.E.b.Italic;
        int i11 = num.intValue() > 500 ? z11 ? 3 : 1 : z11 ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                if (str.equals("sans-serif")) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1081737434:
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i11);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i11);
            case 3:
                return Typeface.create(Typeface.SERIF, i11);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i11);
            default:
                return null;
        }
    }

    private static int m(float f7, int i11) {
        int i12 = 255;
        int round = Math.round(((i11 >> 24) & 255) * f7);
        if (round < 0) {
            i12 = 0;
        } else if (round <= 255) {
            i12 = round;
        }
        return (i12 << 24) | (i11 & 16777215);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void n(boolean z11, C9181g.C9183b c9183b, C9181g.C9201u c9201u) {
        float f7;
        float b11;
        float f11;
        float f12;
        float b12;
        float b13;
        float b14;
        float b15;
        C9181g.L m11 = this.f83108b.m(c9201u.f83090a);
        if (m11 == null) {
            s("%s reference '%s' not found", z11 ? "Fill" : "Stroke", c9201u.f83090a);
            C9181g.O o11 = c9201u.f83091b;
            if (o11 != null) {
                V(this.f83109c, z11, o11);
                return;
            } else if (z11) {
                this.f83109c.f83142b = false;
                return;
            } else {
                this.f83109c.f83143c = false;
                return;
            }
        }
        boolean z12 = m11 instanceof C9181g.M;
        C9181g.C9187f c9187f = C9181g.C9187f.f83053b;
        if (z12) {
            C9181g.M m12 = (C9181g.M) m11;
            String str = m12.f83065l;
            if (str != null) {
                u(m12, str);
            }
            Boolean bool = m12.f83062i;
            Object[] objArr = bool != null && bool.booleanValue();
            C1413h c1413h = this.f83109c;
            Paint paint = z11 ? c1413h.f83144d : c1413h.f83145e;
            if (objArr == true) {
                C9181g.C9183b D11 = D();
                C9181g.C9196p c9196p = m12.f83009m;
                b12 = c9196p != null ? c9196p.d(this) : 0.0f;
                C9181g.C9196p c9196p2 = m12.f83010n;
                b13 = c9196p2 != null ? c9196p2.e(this) : 0.0f;
                f12 = 256.0f;
                C9181g.C9196p c9196p3 = m12.f83011o;
                b14 = c9196p3 != null ? c9196p3.d(this) : D11.f83036c;
                C9181g.C9196p c9196p4 = m12.f83012p;
                if (c9196p4 != null) {
                    b15 = c9196p4.e(this);
                }
                b15 = 0.0f;
            } else {
                f12 = 256.0f;
                C9181g.C9196p c9196p5 = m12.f83009m;
                b12 = c9196p5 != null ? c9196p5.b(this, 1.0f) : 0.0f;
                C9181g.C9196p c9196p6 = m12.f83010n;
                b13 = c9196p6 != null ? c9196p6.b(this, 1.0f) : 0.0f;
                C9181g.C9196p c9196p7 = m12.f83011o;
                b14 = c9196p7 != null ? c9196p7.b(this, 1.0f) : 1.0f;
                C9181g.C9196p c9196p8 = m12.f83012p;
                if (c9196p8 != null) {
                    b15 = c9196p8.b(this, 1.0f);
                }
                b15 = 0.0f;
            }
            float f13 = b14;
            float f14 = b15;
            float f15 = b12;
            float f16 = b13;
            X();
            this.f83109c = x(m12);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(c9183b.f83034a, c9183b.f83035b);
                matrix.preScale(c9183b.f83036c, c9183b.f83037d);
            }
            Matrix matrix2 = m12.f83063j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = m12.f83061h.size();
            if (size == 0) {
                W();
                if (z11) {
                    this.f83109c.f83142b = false;
                    return;
                } else {
                    this.f83109c.f83143c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = m12.f83061h.iterator();
            int i11 = 0;
            float f17 = -1.0f;
            while (it.hasNext()) {
                C9181g.D d11 = (C9181g.D) ((C9181g.N) it.next());
                Float f18 = d11.f82949h;
                float floatValue = f18 != null ? f18.floatValue() : 0.0f;
                if (i11 == 0 || floatValue >= f17) {
                    fArr[i11] = floatValue;
                    f17 = floatValue;
                } else {
                    fArr[i11] = f17;
                }
                X();
                b0(d11, this.f83109c);
                C9181g.E e11 = this.f83109c.f83141a;
                C9181g.C9187f c9187f2 = (C9181g.C9187f) e11.f82952C;
                if (c9187f2 == null) {
                    c9187f2 = c9187f;
                }
                iArr[i11] = m(e11.f82953D.floatValue(), c9187f2.f83055a);
                i11++;
                W();
            }
            if ((f15 == f13 && f16 == f14) || size == 1) {
                W();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            C9181g.EnumC9191k enumC9191k = m12.f83064k;
            if (enumC9191k != null) {
                if (enumC9191k == C9181g.EnumC9191k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC9191k == C9181g.EnumC9191k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            W();
            LinearGradient linearGradient = new LinearGradient(f15, f16, f13, f14, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (this.f83109c.f83141a.f82966d.floatValue() * f12);
            paint.setAlpha(floatValue2 >= 0 ? floatValue2 > 255 ? 255 : floatValue2 : 0);
            return;
        }
        if (!(m11 instanceof C9181g.Q)) {
            if (m11 instanceof C9181g.C) {
                C9181g.C c11 = (C9181g.C) m11;
                if (z11) {
                    if (E(c11.f83006e, 2147483648L)) {
                        C1413h c1413h2 = this.f83109c;
                        C9181g.E e12 = c1413h2.f83141a;
                        C9181g.O o12 = c11.f83006e.f82957H;
                        e12.f82964b = o12;
                        c1413h2.f83142b = o12 != null;
                    }
                    if (E(c11.f83006e, 4294967296L)) {
                        this.f83109c.f83141a.f82966d = c11.f83006e.f82958I;
                    }
                    if (E(c11.f83006e, 6442450944L)) {
                        C1413h c1413h3 = this.f83109c;
                        V(c1413h3, z11, c1413h3.f83141a.f82964b);
                        return;
                    }
                    return;
                }
                if (E(c11.f83006e, 2147483648L)) {
                    C1413h c1413h4 = this.f83109c;
                    C9181g.E e13 = c1413h4.f83141a;
                    C9181g.O o13 = c11.f83006e.f82957H;
                    e13.f82967e = o13;
                    c1413h4.f83143c = o13 != null;
                }
                if (E(c11.f83006e, 4294967296L)) {
                    this.f83109c.f83141a.f82968f = c11.f83006e.f82958I;
                }
                if (E(c11.f83006e, 6442450944L)) {
                    C1413h c1413h5 = this.f83109c;
                    V(c1413h5, z11, c1413h5.f83141a.f82967e);
                    return;
                }
                return;
            }
            return;
        }
        C9181g.Q q11 = (C9181g.Q) m11;
        String str2 = q11.f83065l;
        if (str2 != null) {
            u(q11, str2);
        }
        Boolean bool2 = q11.f83062i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        C1413h c1413h6 = this.f83109c;
        Paint paint2 = z11 ? c1413h6.f83144d : c1413h6.f83145e;
        if (objArr2 == true) {
            C9181g.C9196p c9196p9 = new C9181g.C9196p(50.0f, C9181g.d0.percent);
            C9181g.C9196p c9196p10 = q11.f83016m;
            float d12 = c9196p10 != null ? c9196p10.d(this) : c9196p9.d(this);
            C9181g.C9196p c9196p11 = q11.f83017n;
            float e14 = c9196p11 != null ? c9196p11.e(this) : c9196p9.e(this);
            C9181g.C9196p c9196p12 = q11.f83018o;
            b11 = c9196p12 != null ? c9196p12.a(this) : c9196p9.a(this);
            f7 = d12;
            f11 = e14;
        } else {
            C9181g.C9196p c9196p13 = q11.f83016m;
            float b16 = c9196p13 != null ? c9196p13.b(this, 1.0f) : 0.5f;
            C9181g.C9196p c9196p14 = q11.f83017n;
            float b17 = c9196p14 != null ? c9196p14.b(this, 1.0f) : 0.5f;
            C9181g.C9196p c9196p15 = q11.f83018o;
            f7 = b16;
            b11 = c9196p15 != null ? c9196p15.b(this, 1.0f) : 0.5f;
            f11 = b17;
        }
        X();
        this.f83109c = x(q11);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(c9183b.f83034a, c9183b.f83035b);
            matrix3.preScale(c9183b.f83036c, c9183b.f83037d);
        }
        Matrix matrix4 = q11.f83063j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = q11.f83061h.size();
        if (size2 == 0) {
            W();
            if (z11) {
                this.f83109c.f83142b = false;
                return;
            } else {
                this.f83109c.f83143c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = q11.f83061h.iterator();
        int i12 = 0;
        float f19 = -1.0f;
        while (it2.hasNext()) {
            C9181g.D d13 = (C9181g.D) ((C9181g.N) it2.next());
            Float f21 = d13.f82949h;
            float floatValue3 = f21 != null ? f21.floatValue() : 0.0f;
            if (i12 == 0 || floatValue3 >= f19) {
                fArr2[i12] = floatValue3;
                f19 = floatValue3;
            } else {
                fArr2[i12] = f19;
            }
            X();
            b0(d13, this.f83109c);
            C9181g.E e15 = this.f83109c.f83141a;
            C9181g.C9187f c9187f3 = (C9181g.C9187f) e15.f82952C;
            if (c9187f3 == null) {
                c9187f3 = c9187f;
            }
            iArr2[i12] = m(e15.f82953D.floatValue(), c9187f3.f83055a);
            i12++;
            W();
        }
        if (b11 == 0.0f || size2 == 1) {
            W();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        C9181g.EnumC9191k enumC9191k2 = q11.f83064k;
        if (enumC9191k2 != null) {
            if (enumC9191k2 == C9181g.EnumC9191k.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (enumC9191k2 == C9181g.EnumC9191k.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        W();
        RadialGradient radialGradient = new RadialGradient(f7, f11, b11, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (this.f83109c.f83141a.f82966d.floatValue() * 256.0f);
        paint2.setAlpha(floatValue4 >= 0 ? floatValue4 > 255 ? 255 : floatValue4 : 0);
    }

    private boolean o() {
        Boolean bool = this.f83109c.f83141a.f82950A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void p(C9181g.K k11, Path path) {
        char c11;
        float f7;
        float f11;
        float f12;
        float f13;
        char c12;
        float floor;
        float b11;
        boolean M11;
        float f14;
        float f15;
        C9181g.O o11 = this.f83109c.f83141a.f82964b;
        boolean z11 = o11 instanceof C9181g.C9201u;
        Canvas canvas = this.f83107a;
        if (z11) {
            C9181g.L m11 = this.f83108b.m(((C9181g.C9201u) o11).f83090a);
            if (m11 instanceof C9181g.C9205y) {
                C9181g.C9205y c9205y = (C9181g.C9205y) m11;
                Boolean bool = c9205y.f83097p;
                boolean z12 = bool != null && bool.booleanValue();
                String str = c9205y.f83104w;
                if (str != null) {
                    w(c9205y, str);
                }
                if (z12) {
                    C9181g.C9196p c9196p = c9205y.f83100s;
                    f7 = c9196p != null ? c9196p.d(this) : 0.0f;
                    C9181g.C9196p c9196p2 = c9205y.f83101t;
                    f12 = c9196p2 != null ? c9196p2.e(this) : 0.0f;
                    C9181g.C9196p c9196p3 = c9205y.f83102u;
                    f13 = c9196p3 != null ? c9196p3.d(this) : 0.0f;
                    C9181g.C9196p c9196p4 = c9205y.f83103v;
                    f11 = c9196p4 != null ? c9196p4.e(this) : 0.0f;
                    c11 = 0;
                } else {
                    C9181g.C9196p c9196p5 = c9205y.f83100s;
                    float b12 = c9196p5 != null ? c9196p5.b(this, 1.0f) : 0.0f;
                    C9181g.C9196p c9196p6 = c9205y.f83101t;
                    float b13 = c9196p6 != null ? c9196p6.b(this, 1.0f) : 0.0f;
                    C9181g.C9196p c9196p7 = c9205y.f83102u;
                    float b14 = c9196p7 != null ? c9196p7.b(this, 1.0f) : 0.0f;
                    C9181g.C9196p c9196p8 = c9205y.f83103v;
                    float b15 = c9196p8 != null ? c9196p8.b(this, 1.0f) : 0.0f;
                    C9181g.C9183b c9183b = k11.f83003h;
                    float f16 = c9183b.f83034a;
                    c11 = 0;
                    float f17 = c9183b.f83036c;
                    f7 = (b12 * f17) + f16;
                    float f18 = c9183b.f83035b;
                    float f19 = c9183b.f83037d;
                    float f21 = f17 * b14;
                    f11 = b15 * f19;
                    f12 = (b13 * f19) + f18;
                    f13 = f21;
                }
                if (f13 == 0.0f || f11 == 0.0f) {
                    return;
                }
                C9179e c9179e = c9205y.f83015n;
                if (c9179e == null) {
                    c9179e = C9179e.f82935d;
                }
                X();
                canvas.clipPath(path);
                C1413h c1413h = new C1413h();
                a0(c1413h, C9181g.E.a());
                c1413h.f83141a.f82984v = Boolean.FALSE;
                y(c9205y, c1413h);
                this.f83109c = c1413h;
                C9181g.C9183b c9183b2 = k11.f83003h;
                Matrix matrix = c9205y.f83099r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (c9205y.f83099r.invert(matrix2)) {
                        C9181g.C9183b c9183b3 = k11.f83003h;
                        float f22 = c9183b3.f83034a;
                        float f23 = c9183b3.f83035b;
                        float a11 = c9183b3.a();
                        c12 = 1;
                        C9181g.C9183b c9183b4 = k11.f83003h;
                        float f24 = c9183b4.f83035b;
                        float a12 = c9183b4.a();
                        float b16 = k11.f83003h.b();
                        C9181g.C9183b c9183b5 = k11.f83003h;
                        float f25 = c9183b5.f83034a;
                        float b17 = c9183b5.b();
                        float[] fArr = new float[8];
                        fArr[c11] = f22;
                        fArr[1] = f23;
                        fArr[2] = a11;
                        fArr[3] = f24;
                        fArr[4] = a12;
                        fArr[5] = b16;
                        fArr[6] = f25;
                        fArr[7] = b17;
                        matrix2.mapPoints(fArr);
                        float f26 = fArr[c11];
                        float f27 = fArr[1];
                        RectF rectF = new RectF(f26, f27, f26, f27);
                        for (int i11 = 2; i11 <= 6; i11 += 2) {
                            float f28 = fArr[i11];
                            if (f28 < rectF.left) {
                                rectF.left = f28;
                            }
                            if (f28 > rectF.right) {
                                rectF.right = f28;
                            }
                            float f29 = fArr[i11 + 1];
                            if (f29 < rectF.top) {
                                rectF.top = f29;
                            }
                            if (f29 > rectF.bottom) {
                                rectF.bottom = f29;
                            }
                        }
                        float f31 = rectF.left;
                        float f32 = rectF.top;
                        c9183b2 = new C9181g.C9183b(f31, f32, rectF.right - f31, rectF.bottom - f32);
                        float floor2 = (((float) Math.floor((c9183b2.f83034a - f7) / f13)) * f13) + f7;
                        float a13 = c9183b2.a();
                        b11 = c9183b2.b();
                        C9181g.C9183b c9183b6 = new C9181g.C9183b(0.0f, 0.0f, f13, f11);
                        M11 = M();
                        for (floor = (((float) Math.floor((c9183b2.f83035b - f12) / f11)) * f11) + f12; floor < b11; floor += f11) {
                            float f33 = floor2;
                            while (f33 < a13) {
                                c9183b6.f83034a = f33;
                                c9183b6.f83035b = floor;
                                X();
                                if (this.f83109c.f83141a.f82984v.booleanValue()) {
                                    f14 = b11;
                                    f15 = floor2;
                                } else {
                                    f14 = b11;
                                    f15 = floor2;
                                    U(c9183b6.f83034a, c9183b6.f83035b, c9183b6.f83036c, c9183b6.f83037d);
                                }
                                C9181g.C9183b c9183b7 = c9205y.f83021o;
                                if (c9183b7 != null) {
                                    canvas.concat(i(c9183b6, c9183b7, c9179e));
                                } else {
                                    Boolean bool2 = c9205y.f83098q;
                                    char c13 = (bool2 == null || bool2.booleanValue()) ? c12 : c11;
                                    canvas.translate(f33, floor);
                                    if (c13 == 0) {
                                        C9181g.C9183b c9183b8 = k11.f83003h;
                                        canvas.scale(c9183b8.f83036c, c9183b8.f83037d);
                                    }
                                }
                                Iterator it = c9205y.f82993i.iterator();
                                while (it.hasNext()) {
                                    O((C9181g.N) it.next());
                                }
                                W();
                                f33 += f13;
                                b11 = f14;
                                floor2 = f15;
                            }
                        }
                        if (M11) {
                            L(c9205y.f83003h);
                        }
                        W();
                        return;
                    }
                }
                c12 = 1;
                float floor22 = (((float) Math.floor((c9183b2.f83034a - f7) / f13)) * f13) + f7;
                float a132 = c9183b2.a();
                b11 = c9183b2.b();
                C9181g.C9183b c9183b62 = new C9181g.C9183b(0.0f, 0.0f, f13, f11);
                M11 = M();
                while (floor < b11) {
                }
                if (M11) {
                }
                W();
                return;
            }
        }
        canvas.drawPath(path, this.f83109c.f83144d);
    }

    private void q(Path path) {
        C1413h c1413h = this.f83109c;
        C9181g.E.i iVar = c1413h.f83141a.f82961L;
        C9181g.E.i iVar2 = C9181g.E.i.NonScalingStroke;
        Canvas canvas = this.f83107a;
        if (iVar != iVar2) {
            canvas.drawPath(path, c1413h.f83145e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.f83109c.f83145e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f83109c.f83145e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private void r(C9181g.Y y11, j jVar) {
        float f7;
        float f11;
        float f12;
        C9181g.E.f z11;
        if (o()) {
            Iterator it = y11.f82993i.iterator();
            boolean z12 = true;
            while (it.hasNext()) {
                C9181g.N n11 = (C9181g.N) it.next();
                if (n11 instanceof C9181g.c0) {
                    jVar.b(Y(((C9181g.c0) n11).f83042c, z12, !it.hasNext()));
                } else if (jVar.a((C9181g.Y) n11)) {
                    if (n11 instanceof C9181g.Z) {
                        X();
                        C9181g.Z z13 = (C9181g.Z) n11;
                        b0(z13, this.f83109c);
                        if (o() && d0()) {
                            C9181g.L m11 = z13.f83013a.m(z13.f83026n);
                            if (m11 == null) {
                                s("TextPath reference '%s' not found", z13.f83026n);
                            } else {
                                C9181g.C9202v c9202v = (C9181g.C9202v) m11;
                                Path path = new d(c9202v.f83092o).f83129a;
                                Matrix matrix = c9202v.f83066n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                C9181g.C9196p c9196p = z13.f83027o;
                                r5 = c9196p != null ? c9196p.b(this, pathMeasure.getLength()) : 0.0f;
                                C9181g.E.f z14 = z();
                                if (z14 != C9181g.E.f.Start) {
                                    float h11 = h(z13);
                                    if (z14 == C9181g.E.f.Middle) {
                                        h11 /= 2.0f;
                                    }
                                    r5 -= h11;
                                }
                                k((C9181g.K) z13.b());
                                boolean M11 = M();
                                r(z13, new e(path, r5));
                                if (M11) {
                                    L(z13.f83003h);
                                }
                            }
                        }
                        W();
                    } else if (n11 instanceof C9181g.V) {
                        X();
                        C9181g.V v11 = (C9181g.V) n11;
                        b0(v11, this.f83109c);
                        if (o()) {
                            ArrayList arrayList = v11.f83030n;
                            boolean z15 = arrayList != null && arrayList.size() > 0;
                            boolean z16 = jVar instanceof f;
                            if (z16) {
                                float d11 = !z15 ? ((f) jVar).f83134a : ((C9181g.C9196p) v11.f83030n.get(0)).d(this);
                                ArrayList arrayList2 = v11.f83031o;
                                f11 = (arrayList2 == null || arrayList2.size() == 0) ? ((f) jVar).f83135b : ((C9181g.C9196p) v11.f83031o.get(0)).e(this);
                                ArrayList arrayList3 = v11.f83032p;
                                f12 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((C9181g.C9196p) v11.f83032p.get(0)).d(this);
                                ArrayList arrayList4 = v11.f83033q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    r5 = ((C9181g.C9196p) v11.f83033q.get(0)).e(this);
                                }
                                float f13 = d11;
                                f7 = r5;
                                r5 = f13;
                            } else {
                                f7 = 0.0f;
                                f11 = 0.0f;
                                f12 = 0.0f;
                            }
                            if (z15 && (z11 = z()) != C9181g.E.f.Start) {
                                float h12 = h(v11);
                                if (z11 == C9181g.E.f.Middle) {
                                    h12 /= 2.0f;
                                }
                                r5 -= h12;
                            }
                            k((C9181g.K) v11.b());
                            if (z16) {
                                f fVar = (f) jVar;
                                fVar.f83134a = r5 + f12;
                                fVar.f83135b = f11 + f7;
                            }
                            boolean M12 = M();
                            r(v11, jVar);
                            if (M12) {
                                L(v11.f83003h);
                            }
                        }
                        W();
                    } else if (n11 instanceof C9181g.U) {
                        X();
                        C9181g.U u11 = (C9181g.U) n11;
                        b0(u11, this.f83109c);
                        if (o()) {
                            k((C9181g.K) u11.b());
                            C9181g.L m12 = n11.f83013a.m(u11.f83022n);
                            if (m12 == null || !(m12 instanceof C9181g.Y)) {
                                s("Tref reference '%s' not found", u11.f83022n);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                t((C9181g.Y) m12, sb2);
                                if (sb2.length() > 0) {
                                    jVar.b(sb2.toString());
                                }
                            }
                        }
                        W();
                    }
                }
                z12 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    private void t(C9181g.Y y11, StringBuilder sb2) {
        Iterator it = y11.f82993i.iterator();
        boolean z11 = true;
        while (it.hasNext()) {
            C9181g.N n11 = (C9181g.N) it.next();
            if (n11 instanceof C9181g.Y) {
                t((C9181g.Y) n11, sb2);
            } else if (n11 instanceof C9181g.c0) {
                sb2.append(Y(((C9181g.c0) n11).f83042c, z11, !it.hasNext()));
            }
            z11 = false;
        }
    }

    private static void u(C9181g.AbstractC9190j abstractC9190j, String str) {
        C9181g.L m11 = abstractC9190j.f83013a.m(str);
        if (m11 == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(m11 instanceof C9181g.AbstractC9190j)) {
            s("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (m11 == abstractC9190j) {
            s("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        C9181g.AbstractC9190j abstractC9190j2 = (C9181g.AbstractC9190j) m11;
        if (abstractC9190j.f83062i == null) {
            abstractC9190j.f83062i = abstractC9190j2.f83062i;
        }
        if (abstractC9190j.f83063j == null) {
            abstractC9190j.f83063j = abstractC9190j2.f83063j;
        }
        if (abstractC9190j.f83064k == null) {
            abstractC9190j.f83064k = abstractC9190j2.f83064k;
        }
        if (abstractC9190j.f83061h.isEmpty()) {
            abstractC9190j.f83061h = abstractC9190j2.f83061h;
        }
        try {
            if (abstractC9190j instanceof C9181g.M) {
                C9181g.M m12 = (C9181g.M) abstractC9190j;
                C9181g.M m13 = (C9181g.M) m11;
                if (m12.f83009m == null) {
                    m12.f83009m = m13.f83009m;
                }
                if (m12.f83010n == null) {
                    m12.f83010n = m13.f83010n;
                }
                if (m12.f83011o == null) {
                    m12.f83011o = m13.f83011o;
                }
                if (m12.f83012p == null) {
                    m12.f83012p = m13.f83012p;
                }
            } else {
                v((C9181g.Q) abstractC9190j, (C9181g.Q) m11);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC9190j2.f83065l;
        if (str2 != null) {
            u(abstractC9190j, str2);
        }
    }

    private static void v(C9181g.Q q11, C9181g.Q q12) {
        if (q11.f83016m == null) {
            q11.f83016m = q12.f83016m;
        }
        if (q11.f83017n == null) {
            q11.f83017n = q12.f83017n;
        }
        if (q11.f83018o == null) {
            q11.f83018o = q12.f83018o;
        }
        if (q11.f83019p == null) {
            q11.f83019p = q12.f83019p;
        }
        if (q11.f83020q == null) {
            q11.f83020q = q12.f83020q;
        }
    }

    private static void w(C9181g.C9205y c9205y, String str) {
        C9181g.L m11 = c9205y.f83013a.m(str);
        if (m11 == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(m11 instanceof C9181g.C9205y)) {
            s("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (m11 == c9205y) {
            s("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        C9181g.C9205y c9205y2 = (C9181g.C9205y) m11;
        if (c9205y.f83097p == null) {
            c9205y.f83097p = c9205y2.f83097p;
        }
        if (c9205y.f83098q == null) {
            c9205y.f83098q = c9205y2.f83098q;
        }
        if (c9205y.f83099r == null) {
            c9205y.f83099r = c9205y2.f83099r;
        }
        if (c9205y.f83100s == null) {
            c9205y.f83100s = c9205y2.f83100s;
        }
        if (c9205y.f83101t == null) {
            c9205y.f83101t = c9205y2.f83101t;
        }
        if (c9205y.f83102u == null) {
            c9205y.f83102u = c9205y2.f83102u;
        }
        if (c9205y.f83103v == null) {
            c9205y.f83103v = c9205y2.f83103v;
        }
        if (c9205y.f82993i.isEmpty()) {
            c9205y.f82993i = c9205y2.f82993i;
        }
        if (c9205y.f83021o == null) {
            c9205y.f83021o = c9205y2.f83021o;
        }
        if (c9205y.f83015n == null) {
            c9205y.f83015n = c9205y2.f83015n;
        }
        String str2 = c9205y2.f83104w;
        if (str2 != null) {
            w(c9205y, str2);
        }
    }

    private C1413h x(C9181g.L l11) {
        C1413h c1413h = new C1413h();
        a0(c1413h, C9181g.E.a());
        y(l11, c1413h);
        return c1413h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [r6.g$N] */
    private void y(C9181g.L l11, C1413h c1413h) {
        ArrayList arrayList = new ArrayList();
        C9181g.L l12 = l11;
        while (true) {
            if (l12 instanceof C9181g.L) {
                arrayList.add(0, l12);
            }
            Object obj = l12.f83014b;
            if (obj == null) {
                break;
            } else {
                l12 = (C9181g.N) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0((C9181g.L) it.next(), c1413h);
        }
        C1413h c1413h2 = this.f83109c;
        c1413h.f83147g = c1413h2.f83147g;
        c1413h.f83146f = c1413h2.f83146f;
    }

    private C9181g.E.f z() {
        C9181g.E.f fVar;
        C9181g.E e11 = this.f83109c.f83141a;
        if (e11.f82982t == C9181g.E.h.LTR || (fVar = e11.f82983u) == C9181g.E.f.Middle) {
            return e11.f82983u;
        }
        C9181g.E.f fVar2 = C9181g.E.f.Start;
        return fVar == fVar2 ? C9181g.E.f.End : fVar2;
    }

    final float B() {
        return this.f83109c.f83144d.getTextSize();
    }

    final float C() {
        return this.f83109c.f83144d.getTextSize() / 2.0f;
    }

    final C9181g.C9183b D() {
        C1413h c1413h = this.f83109c;
        C9181g.C9183b c9183b = c1413h.f83147g;
        return c9183b != null ? c9183b : c1413h.f83146f;
    }

    final void Q(C9181g c9181g, C9180f c9180f) {
        this.f83108b = c9181g;
        C9181g.F j11 = c9181g.j();
        if (j11 == null) {
            Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
            return;
        }
        C9181g.C9183b c9183b = j11.f83021o;
        C9179e c9179e = j11.f83015n;
        C9176b.q qVar = c9180f.f82938a;
        if (qVar != null && qVar.f() > 0) {
            c9181g.a(c9180f.f82938a);
        }
        this.f83109c = new C1413h();
        this.f83110d = new Stack<>();
        a0(this.f83109c, C9181g.E.a());
        C1413h c1413h = this.f83109c;
        c1413h.f83146f = null;
        c1413h.f83148h = false;
        this.f83110d.push(new C1413h(c1413h));
        this.f83112f = new Stack<>();
        this.f83111e = new Stack<>();
        Boolean bool = j11.f83005d;
        if (bool != null) {
            this.f83109c.f83148h = bool.booleanValue();
        }
        X();
        C9181g.C9183b c9183b2 = new C9181g.C9183b(c9180f.f82939b);
        C9181g.C9196p c9196p = j11.f82991r;
        if (c9196p != null) {
            c9183b2.f83036c = c9196p.b(this, c9183b2.f83036c);
        }
        C9181g.C9196p c9196p2 = j11.f82992s;
        if (c9196p2 != null) {
            c9183b2.f83037d = c9196p2.b(this, c9183b2.f83037d);
        }
        N(j11, c9183b2, c9183b, c9179e);
        W();
        C9176b.q qVar2 = c9180f.f82938a;
        if (qVar2 == null || qVar2.f() <= 0) {
            return;
        }
        c9181g.b();
    }

    /* renamed from: r6.h$h, reason: collision with other inner class name */
    private class C1413h {

        /* renamed from: a, reason: collision with root package name */
        C9181g.E f83141a;

        /* renamed from: b, reason: collision with root package name */
        boolean f83142b;

        /* renamed from: c, reason: collision with root package name */
        boolean f83143c;

        /* renamed from: d, reason: collision with root package name */
        Paint f83144d;

        /* renamed from: e, reason: collision with root package name */
        Paint f83145e;

        /* renamed from: f, reason: collision with root package name */
        C9181g.C9183b f83146f;

        /* renamed from: g, reason: collision with root package name */
        C9181g.C9183b f83147g;

        /* renamed from: h, reason: collision with root package name */
        boolean f83148h;

        C1413h() {
            Paint paint = new Paint();
            this.f83144d = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f83145e = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f83141a = C9181g.E.a();
        }

        C1413h(C1413h c1413h) {
            this.f83142b = c1413h.f83142b;
            this.f83143c = c1413h.f83143c;
            this.f83144d = new Paint(c1413h.f83144d);
            this.f83145e = new Paint(c1413h.f83145e);
            C9181g.C9183b c9183b = c1413h.f83146f;
            if (c9183b != null) {
                this.f83146f = new C9181g.C9183b(c9183b);
            }
            C9181g.C9183b c9183b2 = c1413h.f83147g;
            if (c9183b2 != null) {
                this.f83147g = new C9181g.C9183b(c9183b2);
            }
            this.f83148h = c1413h.f83148h;
            try {
                this.f83141a = (C9181g.E) c1413h.f83141a.clone();
            } catch (CloneNotSupportedException e11) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e11);
                this.f83141a = C9181g.E.a();
            }
        }
    }
}
