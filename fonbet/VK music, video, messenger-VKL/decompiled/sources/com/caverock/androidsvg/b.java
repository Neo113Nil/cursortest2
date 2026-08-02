package com.caverock.androidsvg;

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
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import com.caverock.androidsvg.PreserveAspectRatio;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.shy;
import xsna.v11;

/* compiled from: SVGAndroidRenderer.java */
/* loaded from: classes12.dex */
public final class b {
    public static HashSet<String> g;
    public Canvas a;
    public SVG b;
    public h c;
    public Stack<h> d;
    public Stack<SVG.i0> e;
    public Stack<Matrix> f;

    /* compiled from: SVGAndroidRenderer.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[SVG.Style.LineJoin.values().length];
            c = iArr;
            try {
                iArr[SVG.Style.LineJoin.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[SVG.Style.LineJoin.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[SVG.Style.LineJoin.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[SVG.Style.LineCap.values().length];
            b = iArr2;
            try {
                iArr2[SVG.Style.LineCap.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[SVG.Style.LineCap.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[SVG.Style.LineCap.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[PreserveAspectRatio.Alignment.values().length];
            a = iArr3;
            try {
                iArr3[PreserveAspectRatio.Alignment.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[PreserveAspectRatio.Alignment.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: com.caverock.androidsvg.b$b, reason: collision with other inner class name */
    public class C0104b implements SVG.x {
        public final ArrayList a;
        public float b;
        public float c;
        public c d;
        public boolean e;
        public boolean f;
        public int g;
        public boolean h;

        public C0104b(b bVar, SVG.w wVar) {
            ArrayList arrayList = new ArrayList();
            this.a = arrayList;
            this.d = null;
            this.e = false;
            this.f = true;
            this.g = -1;
            if (wVar == null) {
                return;
            }
            wVar.h(this);
            if (this.h) {
                this.d.b((c) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void a(float f, float f2) {
            boolean z = this.h;
            ArrayList arrayList = this.a;
            if (z) {
                this.d.b((c) arrayList.get(this.g));
                arrayList.set(this.g, this.d);
                this.h = false;
            }
            c cVar = this.d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
            this.b = f;
            this.c = f2;
            this.d = new c(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.g = arrayList.size();
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            if (this.f || this.e) {
                this.d.a(f, f2);
                this.a.add(this.d);
                this.e = false;
            }
            this.d = new c(f5, f6, f5 - f3, f6 - f4);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void c(float f, float f2) {
            this.d.a(f, f2);
            this.a.add(this.d);
            c cVar = this.d;
            this.d = new c(f, f2, f - cVar.a, f2 - cVar.b);
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void close() {
            this.a.add(this.d);
            c(this.b, this.c);
            this.h = true;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            this.e = true;
            this.f = false;
            c cVar = this.d;
            b.a(cVar.a, cVar.b, f, f2, f3, z, z2, f4, f5, this);
            this.f = true;
            this.h = false;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void e(float f, float f2, float f3, float f4) {
            this.d.a(f, f2);
            this.a.add(this.d);
            this.d = new c(f3, f4, f3 - f, f4 - f2);
            this.h = false;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class c {
        public final float a;
        public final float b;
        public float c;
        public float d;
        public boolean e = false;

        public c(float f, float f2, float f3, float f4) {
            this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.a = f;
            this.b = f2;
            double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (sqrt != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                this.c = (float) (f3 / sqrt);
                this.d = (float) (f4 / sqrt);
            }
        }

        public final void a(float f, float f2) {
            float f3 = f - this.a;
            float f4 = f2 - this.b;
            double sqrt = Math.sqrt((f4 * f4) + (f3 * f3));
            if (sqrt != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                f3 = (float) (f3 / sqrt);
                f4 = (float) (f4 / sqrt);
            }
            float f5 = this.c;
            if (f3 != (-f5) || f4 != (-this.d)) {
                this.c = f5 + f3;
                this.d += f4;
            } else {
                this.e = true;
                this.c = -f4;
                this.d = f3;
            }
        }

        public final void b(c cVar) {
            float f = cVar.c;
            float f2 = this.c;
            if (f == (-f2)) {
                float f3 = cVar.d;
                if (f3 == (-this.d)) {
                    this.e = true;
                    this.c = -f3;
                    this.d = cVar.c;
                    return;
                }
            }
            this.c = f2 + f;
            this.d += cVar.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(this.a);
            sb.append(StringUtils.COMMA);
            sb.append(this.b);
            sb.append(" ");
            sb.append(this.c);
            sb.append(StringUtils.COMMA);
            return shy.c(this.d, ")", sb);
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class d implements SVG.x {
        public final Path a = new Path();
        public float b;
        public float c;

        public d(SVG.w wVar) {
            if (wVar == null) {
                return;
            }
            wVar.h(this);
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void a(float f, float f2) {
            this.a.moveTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
            this.a.cubicTo(f, f2, f3, f4, f5, f6);
            this.b = f5;
            this.c = f6;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void c(float f, float f2) {
            this.a.lineTo(f, f2);
            this.b = f;
            this.c = f2;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void close() {
            this.a.close();
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void d(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
            b.a(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
            this.b = f4;
            this.c = f5;
        }

        @Override // com.caverock.androidsvg.SVG.x
        public final void e(float f, float f2, float f3, float f4) {
            this.a.quadTo(f, f2, f3, f4);
            this.b = f3;
            this.c = f4;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class e extends f {
        public final Path d;

        public e(Path path, float f) {
            super(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.d = path;
        }

        @Override // com.caverock.androidsvg.b.f, com.caverock.androidsvg.b.j
        public final void b(String str) {
            b bVar = b.this;
            if (bVar.V()) {
                h hVar = bVar.c;
                if (hVar.b) {
                    bVar.a.drawTextOnPath(str, this.d, this.a, this.b, hVar.d);
                }
                h hVar2 = bVar.c;
                if (hVar2.c) {
                    bVar.a.drawTextOnPath(str, this.d, this.a, this.b, hVar2.e);
                }
            }
            this.a = bVar.c.d.measureText(str) + this.a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class f extends j {
        public float a;
        public float b;

        public f(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // com.caverock.androidsvg.b.j
        public void b(String str) {
            b bVar = b.this;
            if (bVar.V()) {
                h hVar = bVar.c;
                if (hVar.b) {
                    bVar.a.drawText(str, this.a, this.b, hVar.d);
                }
                h hVar2 = bVar.c;
                if (hVar2.c) {
                    bVar.a.drawText(str, this.a, this.b, hVar2.e);
                }
            }
            this.a = bVar.c.d.measureText(str) + this.a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class g extends j {
        public float a;
        public final float b;
        public final Path c;

        public g(float f, float f2, Path path) {
            this.a = f;
            this.b = f2;
            this.c = path;
        }

        @Override // com.caverock.androidsvg.b.j
        public final boolean a(SVG.x0 x0Var) {
            return !(x0Var instanceof SVG.y0);
        }

        @Override // com.caverock.androidsvg.b.j
        public final void b(String str) {
            String str2;
            b bVar = b.this;
            if (bVar.V()) {
                Path path = new Path();
                str2 = str;
                bVar.c.d.getTextPath(str2, 0, str.length(), this.a, this.b, path);
                this.c.addPath(path);
            } else {
                str2 = str;
            }
            this.a = bVar.c.d.measureText(str2) + this.a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class i extends j {
        public float a;
        public final float b;
        public final RectF c = new RectF();

        public i(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        @Override // com.caverock.androidsvg.b.j
        public final boolean a(SVG.x0 x0Var) {
            if (!(x0Var instanceof SVG.y0)) {
                return true;
            }
            SVG.y0 y0Var = (SVG.y0) x0Var;
            SVG.k0 f = x0Var.a.f(y0Var.n);
            if (f == null) {
                b.o("TextPath path reference '%s' not found", y0Var.n);
                return false;
            }
            SVG.v vVar = (SVG.v) f;
            d dVar = new d(vVar.o);
            Matrix matrix = vVar.n;
            Path path = dVar.a;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.c.union(rectF);
            return false;
        }

        @Override // com.caverock.androidsvg.b.j
        public final void b(String str) {
            b bVar = b.this;
            if (bVar.V()) {
                Rect rect = new Rect();
                bVar.c.d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.a, this.b);
                this.c.union(rectF);
            }
            this.a = bVar.c.d.measureText(str) + this.a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public abstract class j {
        public boolean a(SVG.x0 x0Var) {
            return true;
        }

        public abstract void b(String str);
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class k extends j {
        public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public k() {
        }

        @Override // com.caverock.androidsvg.b.j
        public final void b(String str) {
            this.a = b.this.c.d.measureText(str) + this.a;
        }
    }

    public static Path A(SVG.z zVar) {
        Path path = new Path();
        float[] fArr = zVar.o;
        path.moveTo(fArr[0], fArr[1]);
        int i2 = 2;
        while (true) {
            float[] fArr2 = zVar.o;
            if (i2 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i2], fArr2[i2 + 1]);
            i2 += 2;
        }
        if (zVar instanceof SVG.a0) {
            path.close();
        }
        if (zVar.h == null) {
            zVar.h = c(path);
        }
        return path;
    }

    public static void N(h hVar, boolean z, SVG.n0 n0Var) {
        int i2;
        SVG.Style style = hVar.a;
        float floatValue = (z ? style.e : style.g).floatValue();
        if (n0Var instanceof SVG.f) {
            i2 = ((SVG.f) n0Var).b;
        } else if (!(n0Var instanceof SVG.g)) {
            return;
        } else {
            i2 = hVar.a.o.b;
        }
        int i3 = i(floatValue, i2);
        if (z) {
            hVar.d.setColor(i3);
        } else {
            hVar.e.setColor(i3);
        }
    }

    public static void a(float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, SVG.x xVar) {
        if (f2 == f7 && f3 == f8) {
            return;
        }
        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            xVar.c(f7, f8);
            return;
        }
        float abs = Math.abs(f4);
        float abs2 = Math.abs(f5);
        double radians = Math.toRadians(f6 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (f3 - f8) / 2.0d;
        double d4 = (sin * d3) + (cos * d2);
        double d5 = (cos * d3) + ((-sin) * d2);
        double d6 = abs * abs;
        double d7 = abs2 * abs2;
        double d8 = d4 * d4;
        double d9 = d5 * d5;
        double d10 = (d9 / d7) + (d8 / d6);
        if (d10 > 0.99999d) {
            double sqrt = Math.sqrt(d10) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d6 = abs * abs;
            d7 = abs2 * abs2;
        }
        double d11 = z == z2 ? -1.0d : 1.0d;
        double d12 = d6 * d7;
        double d13 = d6 * d9;
        double d14 = d7 * d8;
        double d15 = ((d12 - d13) - d14) / (d13 + d14);
        if (d15 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d15 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d15) * d11;
        double d16 = abs;
        double d17 = abs2;
        double d18 = ((d16 * d5) / d17) * sqrt2;
        double d19 = sqrt2 * (-((d17 * d4) / d16));
        double d20 = ((cos * d18) - (sin * d19)) + ((f2 + f7) / 2.0d);
        double d21 = (cos * d19) + (sin * d18) + ((f3 + f8) / 2.0d);
        double d22 = (d4 - d18) / d16;
        double d23 = (d5 - d19) / d17;
        double d24 = ((-d4) - d18) / d16;
        double d25 = ((-d5) - d19) / d17;
        double d26 = (d23 * d23) + (d22 * d22);
        double acos = Math.acos(d22 / Math.sqrt(d26)) * (d23 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1.0d : 1.0d);
        double sqrt3 = ((d23 * d25) + (d22 * d24)) / Math.sqrt(((d25 * d25) + (d24 * d24)) * d26);
        double acos2 = ((d22 * d25) - (d23 * d24) < ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z2 && acos2 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            acos2 -= 6.283185307179586d;
        } else if (z2 && acos2 < ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            acos2 += 6.283185307179586d;
        }
        double d27 = acos2 % 6.283185307179586d;
        double d28 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d27) * 2.0d) / 3.141592653589793d);
        double d29 = d27 / ceil;
        double d30 = d29 / 2.0d;
        double sin2 = (Math.sin(d30) * 1.3333333333333333d) / (Math.cos(d30) + 1.0d);
        int i2 = ceil * 6;
        float[] fArr = new float[i2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < ceil) {
            double d31 = d28;
            double d32 = (i3 * d29) + d31;
            double cos2 = Math.cos(d32);
            double sin3 = Math.sin(d32);
            int i5 = i3;
            int i6 = i4;
            fArr[i6] = (float) (cos2 - (sin2 * sin3));
            fArr[i4 + 1] = (float) ((cos2 * sin2) + sin3);
            double d33 = d32 + d29;
            double cos3 = Math.cos(d33);
            double sin4 = Math.sin(d33);
            fArr[i6 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i6 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i6 + 4] = (float) cos3;
            i4 = i6 + 6;
            fArr[i6 + 5] = (float) sin4;
            i3 = i5 + 1;
            d28 = d31;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f6);
        matrix.postTranslate((float) d20, (float) d21);
        matrix.mapPoints(fArr);
        fArr[i2 - 2] = f7;
        fArr[i2 - 1] = f8;
        for (int i7 = 0; i7 < i2; i7 += 6) {
            xVar.b(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static SVG.b c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix e(SVG.b bVar, SVG.b bVar2, PreserveAspectRatio preserveAspectRatio) {
        PreserveAspectRatio.Alignment alignment;
        float f2;
        float f3;
        Matrix matrix = new Matrix();
        if (preserveAspectRatio != null && (alignment = preserveAspectRatio.a) != null) {
            float f4 = bVar.c / bVar2.c;
            float f5 = bVar.d / bVar2.d;
            float f6 = -bVar2.a;
            float f7 = -bVar2.b;
            if (preserveAspectRatio.equals(PreserveAspectRatio.c)) {
                matrix.preTranslate(bVar.a, bVar.b);
                matrix.preScale(f4, f5);
                matrix.preTranslate(f6, f7);
                return matrix;
            }
            float max = preserveAspectRatio.b == PreserveAspectRatio.Scale.slice ? Math.max(f4, f5) : Math.min(f4, f5);
            float f8 = bVar.c / max;
            float f9 = bVar.d / max;
            int[] iArr = a.a;
            switch (iArr[alignment.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f3 = (bVar2.c - f8) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f3 = bVar2.c - f8;
                    break;
            }
            f6 -= f3;
            int i2 = iArr[alignment.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                            }
                        }
                    }
                }
                f2 = bVar2.d - f9;
                f7 -= f2;
                matrix.preTranslate(bVar.a, bVar.b);
                matrix.preScale(max, max);
                matrix.preTranslate(f6, f7);
            }
            f2 = (bVar2.d - f9) / 2.0f;
            f7 -= f2;
            matrix.preTranslate(bVar.a, bVar.b);
            matrix.preScale(max, max);
            matrix.preTranslate(f6, f7);
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.C.SANS_SERIF_NAME) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface h(String str, Integer num, SVG.Style.FontStyle fontStyle) {
        char c2 = 0;
        boolean z = fontStyle == SVG.Style.FontStyle.Italic;
        int i2 = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 109326717:
                if (str.equals(C.SERIF_NAME)) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i2);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            case 3:
                return Typeface.create(Typeface.SERIF, i2);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i2);
            default:
                return null;
        }
    }

    public static int i(float f2, int i2) {
        int i3 = 255;
        int round = Math.round(((i2 >> 24) & 255) * f2);
        if (round < 0) {
            i3 = 0;
        } else if (round <= 255) {
            i3 = round;
        }
        return (i3 << 24) | (i2 & 16777215);
    }

    public static void o(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void q(SVG.j jVar, String str) {
        SVG.k0 f2 = jVar.a.f(str);
        if (f2 == null) {
            return;
        }
        if (!(f2 instanceof SVG.j)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (f2 == jVar) {
            o("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        SVG.j jVar2 = (SVG.j) f2;
        if (jVar.i == null) {
            jVar.i = jVar2.i;
        }
        if (jVar.j == null) {
            jVar.j = jVar2.j;
        }
        if (jVar.k == null) {
            jVar.k = jVar2.k;
        }
        if (jVar.h.isEmpty()) {
            jVar.h = jVar2.h;
        }
        try {
            if (jVar instanceof SVG.l0) {
                SVG.l0 l0Var = (SVG.l0) jVar;
                SVG.l0 l0Var2 = (SVG.l0) f2;
                if (l0Var.m == null) {
                    l0Var.m = l0Var2.m;
                }
                if (l0Var.n == null) {
                    l0Var.n = l0Var2.n;
                }
                if (l0Var.o == null) {
                    l0Var.o = l0Var2.o;
                }
                if (l0Var.p == null) {
                    l0Var.p = l0Var2.p;
                }
            } else {
                r((SVG.p0) jVar, (SVG.p0) f2);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = jVar2.l;
        if (str2 != null) {
            q(jVar, str2);
        }
    }

    public static void r(SVG.p0 p0Var, SVG.p0 p0Var2) {
        if (p0Var.m == null) {
            p0Var.m = p0Var2.m;
        }
        if (p0Var.n == null) {
            p0Var.n = p0Var2.n;
        }
        if (p0Var.o == null) {
            p0Var.o = p0Var2.o;
        }
        if (p0Var.p == null) {
            p0Var.p = p0Var2.p;
        }
        if (p0Var.q == null) {
            p0Var.q = p0Var2.q;
        }
    }

    public static void s(SVG.y yVar, String str) {
        SVG.k0 f2 = yVar.a.f(str);
        if (f2 == null) {
            return;
        }
        if (!(f2 instanceof SVG.y)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (f2 == yVar) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        SVG.y yVar2 = (SVG.y) f2;
        if (yVar.p == null) {
            yVar.p = yVar2.p;
        }
        if (yVar.q == null) {
            yVar.q = yVar2.q;
        }
        if (yVar.r == null) {
            yVar.r = yVar2.r;
        }
        if (yVar.s == null) {
            yVar.s = yVar2.s;
        }
        if (yVar.t == null) {
            yVar.t = yVar2.t;
        }
        if (yVar.u == null) {
            yVar.u = yVar2.u;
        }
        if (yVar.v == null) {
            yVar.v = yVar2.v;
        }
        if (yVar.i.isEmpty()) {
            yVar.i = yVar2.i;
        }
        if (yVar.o == null) {
            yVar.o = yVar2.o;
        }
        if (yVar.n == null) {
            yVar.n = yVar2.n;
        }
        String str2 = yVar2.w;
        if (str2 != null) {
            s(yVar, str2);
        }
    }

    public static boolean x(SVG.Style style, long j2) {
        return (style.b & j2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Path B(SVG.b0 b0Var) {
        float f2;
        float g2;
        float min;
        float f3;
        float g3;
        float f4;
        float f5;
        Path path;
        SVG.p pVar = b0Var.s;
        if (pVar == null && b0Var.t == null) {
            f2 = 0.0f;
        } else if (pVar == null) {
            f2 = b0Var.t.g(this);
        } else {
            if (b0Var.t != null) {
                f2 = pVar.f(this);
                g2 = b0Var.t.g(this);
                min = Math.min(f2, b0Var.q.f(this) / 2.0f);
                float min2 = Math.min(g2, b0Var.r.g(this) / 2.0f);
                SVG.p pVar2 = b0Var.o;
                f3 = pVar2 == null ? pVar2.f(this) : 0.0f;
                SVG.p pVar3 = b0Var.p;
                g3 = pVar3 == null ? pVar3.g(this) : 0.0f;
                float f6 = b0Var.q.f(this);
                float g4 = b0Var.r.g(this);
                if (b0Var.h == null) {
                    b0Var.h = new SVG.b(f3, g3, f6, g4);
                }
                f4 = f6 + f3;
                f5 = g3 + g4;
                path = new Path();
                if (min != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || min2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    path.moveTo(f3, g3);
                    path.lineTo(f4, g3);
                    path.lineTo(f4, f5);
                    path.lineTo(f3, f5);
                    path.lineTo(f3, g3);
                } else {
                    float f7 = min * 0.5522848f;
                    float f8 = 0.5522848f * min2;
                    float f9 = g3 + min2;
                    path.moveTo(f3, f9);
                    float f10 = f9 - f8;
                    float f11 = f3 + min;
                    float f12 = f11 - f7;
                    path.cubicTo(f3, f10, f12, g3, f11, g3);
                    float f13 = f4 - min;
                    path.lineTo(f13, g3);
                    float f14 = f13 + f7;
                    path.cubicTo(f14, g3, f4, f10, f4, f9);
                    float f15 = f5 - min2;
                    path.lineTo(f4, f15);
                    float f16 = f15 + f8;
                    path.cubicTo(f4, f16, f14, f5, f13, f5);
                    path.lineTo(f11, f5);
                    float f17 = f3;
                    path.cubicTo(f12, f5, f17, f16, f3, f15);
                    path.lineTo(f17, f9);
                }
                path.close();
                return path;
            }
            f2 = pVar.f(this);
        }
        g2 = f2;
        min = Math.min(f2, b0Var.q.f(this) / 2.0f);
        float min22 = Math.min(g2, b0Var.r.g(this) / 2.0f);
        SVG.p pVar22 = b0Var.o;
        if (pVar22 == null) {
        }
        SVG.p pVar32 = b0Var.p;
        if (pVar32 == null) {
        }
        float f62 = b0Var.q.f(this);
        float g42 = b0Var.r.g(this);
        if (b0Var.h == null) {
        }
        f4 = f62 + f3;
        f5 = g3 + g42;
        path = new Path();
        if (min != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
        path.moveTo(f3, g3);
        path.lineTo(f4, g3);
        path.lineTo(f4, f5);
        path.lineTo(f3, f5);
        path.lineTo(f3, g3);
        path.close();
        return path;
    }

    public final SVG.b C(SVG.p pVar, SVG.p pVar2, SVG.p pVar3, SVG.p pVar4) {
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = pVar != null ? pVar.f(this) : 0.0f;
        if (pVar2 != null) {
            f2 = pVar2.g(this);
        }
        h hVar = this.c;
        SVG.b bVar = hVar.g;
        if (bVar == null) {
            bVar = hVar.f;
        }
        return new SVG.b(f3, f2, pVar3 != null ? pVar3.f(this) : bVar.c, pVar4 != null ? pVar4.g(this) : bVar.d);
    }

    @TargetApi(19)
    public final Path D(SVG.j0 j0Var, boolean z) {
        Path path;
        Path b;
        this.d.push(this.c);
        h hVar = new h(this.c);
        this.c = hVar;
        T(hVar, j0Var);
        if (!k() || !V()) {
            this.c = this.d.pop();
            return null;
        }
        if (j0Var instanceof SVG.d1) {
            if (!z) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            SVG.d1 d1Var = (SVG.d1) j0Var;
            SVG.k0 f2 = j0Var.a.f(d1Var.o);
            if (f2 == null) {
                o("Use reference '%s' not found", d1Var.o);
                this.c = this.d.pop();
                return null;
            }
            if (!(f2 instanceof SVG.j0)) {
                this.c = this.d.pop();
                return null;
            }
            path = D((SVG.j0) f2, false);
            if (path != null) {
                if (d1Var.h == null) {
                    d1Var.h = c(path);
                }
                Matrix matrix = d1Var.n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.c.a.F != null && (b = b(j0Var, j0Var.h)) != null) {
                    path.op(b, Path.Op.INTERSECT);
                }
                this.c = this.d.pop();
                return path;
            }
            return null;
        }
        if (j0Var instanceof SVG.l) {
            SVG.l lVar = (SVG.l) j0Var;
            if (j0Var instanceof SVG.v) {
                d dVar = new d(((SVG.v) j0Var).o);
                SVG.b bVar = j0Var.h;
                Path path2 = dVar.a;
                if (bVar == null) {
                    j0Var.h = c(path2);
                }
                path = path2;
            } else {
                path = j0Var instanceof SVG.b0 ? B((SVG.b0) j0Var) : j0Var instanceof SVG.d ? y((SVG.d) j0Var) : j0Var instanceof SVG.i ? z((SVG.i) j0Var) : j0Var instanceof SVG.z ? A((SVG.z) j0Var) : null;
            }
            if (path != null) {
                if (lVar.h == null) {
                    lVar.h = c(path);
                }
                Matrix matrix2 = lVar.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                path.setFillType(w());
            }
            return null;
        }
        if (!(j0Var instanceof SVG.v0)) {
            o("Invalid %s element found in clipPath definition", j0Var.m());
            return null;
        }
        SVG.v0 v0Var = (SVG.v0) j0Var;
        ArrayList arrayList = v0Var.n;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f4 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.p) v0Var.n.get(0)).f(this);
        ArrayList arrayList2 = v0Var.o;
        float g2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.p) v0Var.o.get(0)).g(this);
        ArrayList arrayList3 = v0Var.p;
        float f5 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.p) v0Var.p.get(0)).f(this);
        ArrayList arrayList4 = v0Var.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f3 = ((SVG.p) v0Var.q.get(0)).g(this);
        }
        if (this.c.a.v != SVG.Style.TextAnchor.Start) {
            float d2 = d(v0Var);
            if (this.c.a.v == SVG.Style.TextAnchor.Middle) {
                d2 /= 2.0f;
            }
            f4 -= d2;
        }
        if (v0Var.h == null) {
            i iVar = new i(f4, g2);
            n(v0Var, iVar);
            RectF rectF = iVar.c;
            v0Var.h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar.c.height());
        }
        Path path3 = new Path();
        n(v0Var, new g(f4 + f5, g2 + f3, path3));
        Matrix matrix3 = v0Var.r;
        if (matrix3 != null) {
            path3.transform(matrix3);
        }
        path3.setFillType(w());
        path = path3;
        if (this.c.a.F != null) {
            path.op(b, Path.Op.INTERSECT);
        }
        this.c = this.d.pop();
        return path;
    }

    public final void E(SVG.b bVar) {
        Canvas canvas = this.a;
        if (this.c.a.H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2127f, 0.7151f, 0.0722f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT})));
            canvas.saveLayer(null, paint2, 31);
            SVG.s sVar = (SVG.s) this.b.f(this.c.a.H);
            L(sVar, bVar);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(sVar, bVar);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean F() {
        SVG.k0 f2;
        int i2 = 0;
        if (this.c.a.n.floatValue() >= 1.0f && this.c.a.H == null) {
            return false;
        }
        Canvas canvas = this.a;
        int floatValue = (int) (this.c.a.n.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i2 = 255;
            if (floatValue <= 255) {
                i2 = floatValue;
            }
        }
        canvas.saveLayerAlpha(null, i2, 31);
        this.d.push(this.c);
        h hVar = new h(this.c);
        this.c = hVar;
        String str = hVar.a.H;
        if (str != null && ((f2 = this.b.f(str)) == null || !(f2 instanceof SVG.s))) {
            o("Mask reference '%s' not found", this.c.a.H);
            this.c.a.H = null;
        }
        return true;
    }

    public final void G(SVG.e0 e0Var, SVG.b bVar, SVG.b bVar2, PreserveAspectRatio preserveAspectRatio) {
        Canvas canvas = this.a;
        if (bVar.c == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || bVar.d == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        if (preserveAspectRatio == null && (preserveAspectRatio = e0Var.n) == null) {
            preserveAspectRatio = PreserveAspectRatio.d;
        }
        T(this.c, e0Var);
        if (k()) {
            h hVar = this.c;
            hVar.f = bVar;
            if (!hVar.a.w.booleanValue()) {
                SVG.b bVar3 = this.c.f;
                M(bVar3.a, bVar3.b, bVar3.c, bVar3.d);
            }
            f(e0Var, this.c.f);
            if (bVar2 != null) {
                canvas.concat(e(this.c.f, bVar2, preserveAspectRatio));
                this.c.g = e0Var.o;
            } else {
                SVG.b bVar4 = this.c.f;
                canvas.translate(bVar4.a, bVar4.b);
            }
            boolean F = F();
            U();
            I(e0Var, true);
            if (F) {
                E(e0Var.h);
            }
            R(e0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(SVG.m0 m0Var) {
        SVG.p pVar;
        String str;
        int indexOf;
        Set<String> h2;
        SVG.p pVar2;
        Boolean bool;
        if (m0Var instanceof SVG.t) {
            return;
        }
        P();
        if ((m0Var instanceof SVG.k0) && (bool = ((SVG.k0) m0Var).d) != null) {
            this.c.h = bool.booleanValue();
        }
        if (m0Var instanceof SVG.e0) {
            SVG.e0 e0Var = (SVG.e0) m0Var;
            G(e0Var, C(e0Var.p, e0Var.q, e0Var.r, e0Var.s), e0Var.o, e0Var.n);
        } else {
            boolean z = m0Var instanceof SVG.d1;
            Bitmap bitmap = null;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (z) {
                SVG.d1 d1Var = (SVG.d1) m0Var;
                Canvas canvas = this.a;
                SVG.p pVar3 = d1Var.r;
                if ((pVar3 == null || !pVar3.j()) && ((pVar2 = d1Var.s) == null || !pVar2.j())) {
                    T(this.c, d1Var);
                    if (k()) {
                        SVG.m0 f3 = d1Var.a.f(d1Var.o);
                        if (f3 == null) {
                            o("Use reference '%s' not found", d1Var.o);
                        } else {
                            Matrix matrix = d1Var.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            SVG.p pVar4 = d1Var.p;
                            float f4 = pVar4 != null ? pVar4.f(this) : 0.0f;
                            SVG.p pVar5 = d1Var.q;
                            canvas.translate(f4, pVar5 != null ? pVar5.g(this) : 0.0f);
                            f(d1Var, d1Var.h);
                            boolean F = F();
                            this.e.push(d1Var);
                            this.f.push(this.a.getMatrix());
                            if (f3 instanceof SVG.e0) {
                                SVG.e0 e0Var2 = (SVG.e0) f3;
                                SVG.b C = C(null, null, d1Var.r, d1Var.s);
                                P();
                                G(e0Var2, C, e0Var2.o, e0Var2.n);
                                O();
                            } else if (f3 instanceof SVG.s0) {
                                SVG.p pVar6 = d1Var.r;
                                if (pVar6 == null) {
                                    pVar6 = new SVG.p(100.0f, SVG.c1.percent);
                                }
                                SVG.p pVar7 = d1Var.s;
                                if (pVar7 == null) {
                                    pVar7 = new SVG.p(100.0f, SVG.c1.percent);
                                }
                                SVG.b C2 = C(null, null, pVar6, pVar7);
                                P();
                                SVG.s0 s0Var = (SVG.s0) f3;
                                if (C2.c != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && C2.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    PreserveAspectRatio preserveAspectRatio = s0Var.n;
                                    if (preserveAspectRatio == null) {
                                        preserveAspectRatio = PreserveAspectRatio.d;
                                    }
                                    T(this.c, s0Var);
                                    h hVar = this.c;
                                    hVar.f = C2;
                                    if (!hVar.a.w.booleanValue()) {
                                        SVG.b bVar = this.c.f;
                                        M(bVar.a, bVar.b, bVar.c, bVar.d);
                                    }
                                    SVG.b bVar2 = s0Var.o;
                                    if (bVar2 != null) {
                                        canvas.concat(e(this.c.f, bVar2, preserveAspectRatio));
                                        this.c.g = s0Var.o;
                                    } else {
                                        SVG.b bVar3 = this.c.f;
                                        canvas.translate(bVar3.a, bVar3.b);
                                    }
                                    boolean F2 = F();
                                    I(s0Var, true);
                                    if (F2) {
                                        E(s0Var.h);
                                    }
                                    R(s0Var);
                                }
                                O();
                            } else {
                                H(f3);
                            }
                            this.e.pop();
                            this.f.pop();
                            if (F) {
                                E(d1Var.h);
                            }
                            R(d1Var);
                        }
                    }
                }
            } else if (m0Var instanceof SVG.r0) {
                SVG.r0 r0Var = (SVG.r0) m0Var;
                T(this.c, r0Var);
                if (k()) {
                    Matrix matrix2 = r0Var.n;
                    if (matrix2 != null) {
                        this.a.concat(matrix2);
                    }
                    f(r0Var, r0Var.h);
                    boolean F3 = F();
                    String language = Locale.getDefault().getLanguage();
                    Iterator<SVG.m0> it = r0Var.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SVG.m0 next = it.next();
                        if (next instanceof SVG.f0) {
                            SVG.f0 f0Var = (SVG.f0) next;
                            if (f0Var.f() == null && ((h2 = f0Var.h()) == null || (!h2.isEmpty() && h2.contains(language)))) {
                                Set<String> d2 = f0Var.d();
                                if (d2 != null) {
                                    if (g == null) {
                                        synchronized (b.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (!d2.isEmpty() && g.containsAll(d2)) {
                                    }
                                }
                                Set<String> g2 = f0Var.g();
                                if (g2 == null) {
                                    Set<String> l = f0Var.l();
                                    if (l == null) {
                                        H(next);
                                        break;
                                    }
                                    l.isEmpty();
                                } else {
                                    g2.isEmpty();
                                }
                            }
                        }
                    }
                    if (F3) {
                        E(r0Var.h);
                    }
                    R(r0Var);
                }
            } else if (m0Var instanceof SVG.m) {
                SVG.m mVar = (SVG.m) m0Var;
                T(this.c, mVar);
                if (k()) {
                    Matrix matrix3 = mVar.n;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    f(mVar, mVar.h);
                    boolean F4 = F();
                    I(mVar, true);
                    if (F4) {
                        E(mVar.h);
                    }
                    R(mVar);
                }
            } else {
                if (m0Var instanceof SVG.o) {
                    SVG.o oVar = (SVG.o) m0Var;
                    Canvas canvas2 = this.a;
                    SVG.p pVar8 = oVar.r;
                    if (pVar8 != null && !pVar8.j() && (pVar = oVar.s) != null && !pVar.j() && (str = oVar.o) != null) {
                        PreserveAspectRatio preserveAspectRatio2 = oVar.n;
                        if (preserveAspectRatio2 == null) {
                            preserveAspectRatio2 = PreserveAspectRatio.d;
                        }
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception e2) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
                            }
                        }
                        if (bitmap != null) {
                            SVG.b bVar4 = new SVG.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight());
                            T(this.c, oVar);
                            if (k() && V()) {
                                Matrix matrix4 = oVar.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                SVG.p pVar9 = oVar.p;
                                float f5 = pVar9 != null ? pVar9.f(this) : 0.0f;
                                SVG.p pVar10 = oVar.q;
                                float g3 = pVar10 != null ? pVar10.g(this) : 0.0f;
                                float f6 = oVar.r.f(this);
                                float f7 = oVar.s.f(this);
                                h hVar2 = this.c;
                                hVar2.f = new SVG.b(f5, g3, f6, f7);
                                if (!hVar2.a.w.booleanValue()) {
                                    SVG.b bVar5 = this.c.f;
                                    M(bVar5.a, bVar5.b, bVar5.c, bVar5.d);
                                }
                                oVar.h = this.c.f;
                                R(oVar);
                                f(oVar, oVar.h);
                                boolean F5 = F();
                                U();
                                canvas2.save();
                                canvas2.concat(e(this.c.f, bVar4, preserveAspectRatio2));
                                canvas2.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new Paint(this.c.a.N != SVG.Style.RenderQuality.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (F5) {
                                    E(oVar.h);
                                }
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.v) {
                    SVG.v vVar = (SVG.v) m0Var;
                    if (vVar.o != null) {
                        T(this.c, vVar);
                        if (k() && V()) {
                            h hVar3 = this.c;
                            if (hVar3.c || hVar3.b) {
                                Matrix matrix5 = vVar.n;
                                if (matrix5 != null) {
                                    this.a.concat(matrix5);
                                }
                                Path path = new d(vVar.o).a;
                                if (vVar.h == null) {
                                    vVar.h = c(path);
                                }
                                R(vVar);
                                g(vVar);
                                f(vVar, vVar.h);
                                boolean F6 = F();
                                h hVar4 = this.c;
                                if (hVar4.b) {
                                    SVG.Style.FillRule fillRule = hVar4.a.d;
                                    path.setFillType((fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    l(vVar, path);
                                }
                                if (this.c.c) {
                                    m(path);
                                }
                                K(vVar);
                                if (F6) {
                                    E(vVar.h);
                                }
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.b0) {
                    SVG.b0 b0Var = (SVG.b0) m0Var;
                    SVG.p pVar11 = b0Var.q;
                    if (pVar11 != null && b0Var.r != null && !pVar11.j() && !b0Var.r.j()) {
                        T(this.c, b0Var);
                        if (k() && V()) {
                            Matrix matrix6 = b0Var.n;
                            if (matrix6 != null) {
                                this.a.concat(matrix6);
                            }
                            Path B = B(b0Var);
                            R(b0Var);
                            g(b0Var);
                            f(b0Var, b0Var.h);
                            boolean F7 = F();
                            if (this.c.b) {
                                l(b0Var, B);
                            }
                            if (this.c.c) {
                                m(B);
                            }
                            if (F7) {
                                E(b0Var.h);
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.d) {
                    SVG.d dVar = (SVG.d) m0Var;
                    SVG.p pVar12 = dVar.q;
                    if (pVar12 != null && !pVar12.j()) {
                        T(this.c, dVar);
                        if (k() && V()) {
                            Matrix matrix7 = dVar.n;
                            if (matrix7 != null) {
                                this.a.concat(matrix7);
                            }
                            Path y = y(dVar);
                            R(dVar);
                            g(dVar);
                            f(dVar, dVar.h);
                            boolean F8 = F();
                            if (this.c.b) {
                                l(dVar, y);
                            }
                            if (this.c.c) {
                                m(y);
                            }
                            if (F8) {
                                E(dVar.h);
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.i) {
                    SVG.i iVar = (SVG.i) m0Var;
                    SVG.p pVar13 = iVar.q;
                    if (pVar13 != null && iVar.r != null && !pVar13.j() && !iVar.r.j()) {
                        T(this.c, iVar);
                        if (k() && V()) {
                            Matrix matrix8 = iVar.n;
                            if (matrix8 != null) {
                                this.a.concat(matrix8);
                            }
                            Path z2 = z(iVar);
                            R(iVar);
                            g(iVar);
                            f(iVar, iVar.h);
                            boolean F9 = F();
                            if (this.c.b) {
                                l(iVar, z2);
                            }
                            if (this.c.c) {
                                m(z2);
                            }
                            if (F9) {
                                E(iVar.h);
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.q) {
                    SVG.q qVar = (SVG.q) m0Var;
                    T(this.c, qVar);
                    if (k() && V() && this.c.c) {
                        Matrix matrix9 = qVar.n;
                        if (matrix9 != null) {
                            this.a.concat(matrix9);
                        }
                        SVG.p pVar14 = qVar.o;
                        float f8 = pVar14 == null ? 0.0f : pVar14.f(this);
                        SVG.p pVar15 = qVar.p;
                        float g4 = pVar15 == null ? 0.0f : pVar15.g(this);
                        SVG.p pVar16 = qVar.q;
                        float f9 = pVar16 == null ? 0.0f : pVar16.f(this);
                        SVG.p pVar17 = qVar.r;
                        if (pVar17 != null) {
                            f2 = pVar17.g(this);
                        }
                        if (qVar.h == null) {
                            qVar.h = new SVG.b(Math.min(f8, f9), Math.min(g4, f2), Math.abs(f9 - f8), Math.abs(f2 - g4));
                        }
                        Path path2 = new Path();
                        path2.moveTo(f8, g4);
                        path2.lineTo(f9, f2);
                        R(qVar);
                        g(qVar);
                        f(qVar, qVar.h);
                        boolean F10 = F();
                        m(path2);
                        K(qVar);
                        if (F10) {
                            E(qVar.h);
                        }
                    }
                } else if (m0Var instanceof SVG.a0) {
                    SVG.a0 a0Var = (SVG.a0) m0Var;
                    T(this.c, a0Var);
                    if (k() && V()) {
                        h hVar5 = this.c;
                        if (hVar5.c || hVar5.b) {
                            Matrix matrix10 = a0Var.n;
                            if (matrix10 != null) {
                                this.a.concat(matrix10);
                            }
                            if (a0Var.o.length >= 2) {
                                Path A = A(a0Var);
                                R(a0Var);
                                g(a0Var);
                                f(a0Var, a0Var.h);
                                boolean F11 = F();
                                if (this.c.b) {
                                    l(a0Var, A);
                                }
                                if (this.c.c) {
                                    m(A);
                                }
                                K(a0Var);
                                if (F11) {
                                    E(a0Var.h);
                                }
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.z) {
                    SVG.z zVar = (SVG.z) m0Var;
                    T(this.c, zVar);
                    if (k() && V()) {
                        h hVar6 = this.c;
                        if (hVar6.c || hVar6.b) {
                            Matrix matrix11 = zVar.n;
                            if (matrix11 != null) {
                                this.a.concat(matrix11);
                            }
                            if (zVar.o.length >= 2) {
                                Path A2 = A(zVar);
                                R(zVar);
                                SVG.Style.FillRule fillRule2 = this.c.a.d;
                                A2.setFillType((fillRule2 == null || fillRule2 != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                g(zVar);
                                f(zVar, zVar.h);
                                boolean F12 = F();
                                if (this.c.b) {
                                    l(zVar, A2);
                                }
                                if (this.c.c) {
                                    m(A2);
                                }
                                K(zVar);
                                if (F12) {
                                    E(zVar.h);
                                }
                            }
                        }
                    }
                } else if (m0Var instanceof SVG.v0) {
                    SVG.v0 v0Var = (SVG.v0) m0Var;
                    T(this.c, v0Var);
                    if (k()) {
                        Matrix matrix12 = v0Var.r;
                        if (matrix12 != null) {
                            this.a.concat(matrix12);
                        }
                        ArrayList arrayList = v0Var.n;
                        float f10 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((SVG.p) v0Var.n.get(0)).f(this);
                        ArrayList arrayList2 = v0Var.o;
                        float g5 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((SVG.p) v0Var.o.get(0)).g(this);
                        ArrayList arrayList3 = v0Var.p;
                        float f11 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.p) v0Var.p.get(0)).f(this);
                        ArrayList arrayList4 = v0Var.q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            f2 = ((SVG.p) v0Var.q.get(0)).g(this);
                        }
                        SVG.Style.TextAnchor v = v();
                        if (v != SVG.Style.TextAnchor.Start) {
                            float d3 = d(v0Var);
                            if (v == SVG.Style.TextAnchor.Middle) {
                                d3 /= 2.0f;
                            }
                            f10 -= d3;
                        }
                        if (v0Var.h == null) {
                            i iVar2 = new i(f10, g5);
                            n(v0Var, iVar2);
                            RectF rectF = iVar2.c;
                            v0Var.h = new SVG.b(rectF.left, rectF.top, rectF.width(), iVar2.c.height());
                        }
                        R(v0Var);
                        g(v0Var);
                        f(v0Var, v0Var.h);
                        boolean F13 = F();
                        n(v0Var, new f(f10 + f11, g5 + f2));
                        if (F13) {
                            E(v0Var.h);
                        }
                    }
                }
            }
        }
        O();
    }

    public final void I(SVG.g0 g0Var, boolean z) {
        if (z) {
            this.e.push(g0Var);
            this.f.push(this.a.getMatrix());
        }
        Iterator<SVG.m0> it = g0Var.i.iterator();
        while (it.hasNext()) {
            H(it.next());
        }
        if (z) {
            this.e.pop();
            this.f.pop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(SVG.r rVar, c cVar) {
        float f2;
        SVG.b bVar;
        boolean F;
        float f3;
        float f4;
        float f5;
        Canvas canvas = this.a;
        P();
        Float f6 = rVar.u;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f6 != null) {
            if (Float.isNaN(f6.floatValue())) {
                float f8 = cVar.c;
                if (f8 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || cVar.d != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f2 = (float) Math.toDegrees(Math.atan2(cVar.d, f8));
                }
            } else {
                f2 = rVar.u.floatValue();
            }
            float e2 = !rVar.p ? 1.0f : this.c.a.h.e();
            this.c = t(rVar);
            Matrix matrix = new Matrix();
            matrix.preTranslate(cVar.a, cVar.b);
            matrix.preRotate(f2);
            matrix.preScale(e2, e2);
            SVG.p pVar = rVar.q;
            float f9 = pVar == null ? pVar.f(this) : 0.0f;
            SVG.p pVar2 = rVar.r;
            float g2 = pVar2 == null ? pVar2.g(this) : 0.0f;
            SVG.p pVar3 = rVar.s;
            float f10 = pVar3 == null ? pVar3.f(this) : 3.0f;
            SVG.p pVar4 = rVar.t;
            float g3 = pVar4 != null ? pVar4.g(this) : 3.0f;
            bVar = rVar.o;
            if (bVar == null) {
                float f11 = f10 / bVar.c;
                float f12 = g3 / bVar.d;
                PreserveAspectRatio preserveAspectRatio = rVar.n;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.d;
                }
                boolean equals = preserveAspectRatio.equals(PreserveAspectRatio.c);
                PreserveAspectRatio.Alignment alignment = preserveAspectRatio.a;
                if (!equals) {
                    f11 = preserveAspectRatio.b == PreserveAspectRatio.Scale.slice ? Math.max(f11, f12) : Math.min(f11, f12);
                    f12 = f11;
                }
                matrix.preTranslate((-f9) * f11, (-g2) * f12);
                canvas.concat(matrix);
                SVG.b bVar2 = rVar.o;
                float f13 = bVar2.c * f11;
                float f14 = bVar2.d * f12;
                int[] iArr = a.a;
                switch (iArr[alignment.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f3 = (f10 - f13) / 2.0f;
                        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f3 = f10 - f13;
                        f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f3;
                        break;
                    default:
                        f4 = 0.0f;
                        break;
                }
                int i2 = iArr[alignment.ordinal()];
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                if (i2 != 7) {
                                }
                            }
                        }
                    }
                    f5 = g3 - f14;
                    f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f5;
                    if (!this.c.a.w.booleanValue()) {
                        M(f4, f7, f10, g3);
                    }
                    matrix.reset();
                    matrix.preScale(f11, f12);
                    canvas.concat(matrix);
                }
                f5 = (g3 - f14) / 2.0f;
                f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f5;
                if (!this.c.a.w.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f11, f12);
                canvas.concat(matrix);
            } else {
                matrix.preTranslate(-f9, -g2);
                canvas.concat(matrix);
                if (!this.c.a.w.booleanValue()) {
                    M(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f10, g3);
                }
            }
            F = F();
            I(rVar, false);
            if (F) {
                E(rVar.h);
            }
            O();
        }
        f2 = 0.0f;
        if (!rVar.p) {
        }
        this.c = t(rVar);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(cVar.a, cVar.b);
        matrix2.preRotate(f2);
        matrix2.preScale(e2, e2);
        SVG.p pVar5 = rVar.q;
        if (pVar5 == null) {
        }
        SVG.p pVar22 = rVar.r;
        if (pVar22 == null) {
        }
        SVG.p pVar32 = rVar.s;
        if (pVar32 == null) {
        }
        SVG.p pVar42 = rVar.t;
        if (pVar42 != null) {
        }
        bVar = rVar.o;
        if (bVar == null) {
        }
        F = F();
        I(rVar, false);
        if (F) {
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(SVG.l lVar) {
        SVG.r rVar;
        String str;
        SVG.r rVar2;
        String str2;
        SVG.r rVar3;
        boolean z;
        int i2;
        float f2;
        float f3;
        float f4;
        ArrayList arrayList;
        int size;
        int i3;
        SVG.Style style = this.c.a;
        String str3 = style.y;
        if (str3 == null && style.z == null && style.A == null) {
            return;
        }
        if (str3 != null) {
            SVG.k0 f5 = lVar.a.f(str3);
            if (f5 != null) {
                rVar = (SVG.r) f5;
                str = this.c.a.z;
                if (str != null) {
                    SVG.k0 f6 = lVar.a.f(str);
                    if (f6 != null) {
                        rVar2 = (SVG.r) f6;
                        str2 = this.c.a.A;
                        if (str2 != null) {
                            SVG.k0 f7 = lVar.a.f(str2);
                            if (f7 != null) {
                                rVar3 = (SVG.r) f7;
                                z = lVar instanceof SVG.v;
                                float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if (!z) {
                                    arrayList = new C0104b(this, ((SVG.v) lVar).o).a;
                                    f3 = 0.0f;
                                    i2 = 1;
                                } else if (lVar instanceof SVG.q) {
                                    SVG.q qVar = (SVG.q) lVar;
                                    SVG.p pVar = qVar.o;
                                    float f9 = pVar != null ? pVar.f(this) : 0.0f;
                                    SVG.p pVar2 = qVar.p;
                                    float g2 = pVar2 != null ? pVar2.g(this) : 0.0f;
                                    SVG.p pVar3 = qVar.q;
                                    float f10 = pVar3 != null ? pVar3.f(this) : 0.0f;
                                    SVG.p pVar4 = qVar.r;
                                    float g3 = pVar4 != null ? pVar4.g(this) : 0.0f;
                                    ArrayList arrayList2 = new ArrayList(2);
                                    float f11 = f10 - f9;
                                    i2 = 1;
                                    float f12 = g3 - g2;
                                    arrayList2.add(new c(f9, g2, f11, f12));
                                    arrayList2.add(new c(f10, g3, f11, f12));
                                    f3 = 0.0f;
                                    arrayList = arrayList2;
                                } else {
                                    i2 = 1;
                                    SVG.z zVar = (SVG.z) lVar;
                                    int length = zVar.o.length;
                                    if (length < 2) {
                                        arrayList = null;
                                        f3 = 0.0f;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        float[] fArr = zVar.o;
                                        c cVar = new c(fArr[0], fArr[1], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                        int i4 = 2;
                                        float f13 = 0.0f;
                                        float f14 = 0.0f;
                                        while (true) {
                                            f2 = cVar.b;
                                            f3 = f8;
                                            f4 = cVar.a;
                                            if (i4 >= length) {
                                                break;
                                            }
                                            float[] fArr2 = zVar.o;
                                            float f15 = fArr2[i4];
                                            float f16 = fArr2[i4 + 1];
                                            cVar.a(f15, f16);
                                            arrayList3.add(cVar);
                                            cVar = new c(f15, f16, f15 - f4, f16 - f2);
                                            i4 += 2;
                                            f14 = f16;
                                            f13 = f15;
                                            f8 = f3;
                                        }
                                        if (zVar instanceof SVG.a0) {
                                            float[] fArr3 = zVar.o;
                                            float f17 = fArr3[0];
                                            if (f13 != f17) {
                                                float f18 = fArr3[1];
                                                if (f14 != f18) {
                                                    cVar.a(f17, f18);
                                                    arrayList3.add(cVar);
                                                    c cVar2 = new c(f17, f18, f17 - f4, f18 - f2);
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
                                    SVG.Style style2 = this.c.a;
                                    style2.A = null;
                                    style2.z = null;
                                    style2.y = null;
                                    if (rVar != null) {
                                        J(rVar, (c) arrayList.get(0));
                                    }
                                    if (rVar2 != null && arrayList.size() > 2) {
                                        c cVar3 = (c) arrayList.get(0);
                                        c cVar4 = (c) arrayList.get(i2);
                                        i3 = 1;
                                        while (i3 < size - 1) {
                                            i3++;
                                            c cVar5 = (c) arrayList.get(i3);
                                            if (cVar4.e) {
                                                float f19 = cVar4.c;
                                                float f20 = cVar4.d;
                                                float f21 = cVar4.a;
                                                float f22 = f21 - cVar3.a;
                                                float f23 = cVar4.b;
                                                float f24 = ((f23 - cVar3.b) * f20) + (f22 * f19);
                                                if (f24 == f3) {
                                                    f24 = ((cVar5.a - f21) * f19) + ((cVar5.b - f23) * f20);
                                                }
                                                if (f24 <= f3 && (f24 != f3 || (f19 <= f3 && f20 < f3))) {
                                                    cVar4.c = -f19;
                                                    cVar4.d = -f20;
                                                }
                                            }
                                            J(rVar2, cVar4);
                                            cVar3 = cVar4;
                                            cVar4 = cVar5;
                                        }
                                    }
                                    if (rVar3 == null) {
                                        J(rVar3, (c) arrayList.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            o("Marker reference '%s' not found", this.c.a.A);
                        }
                        rVar3 = null;
                        z = lVar instanceof SVG.v;
                        float f82 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (!z) {
                        }
                        if (arrayList == null) {
                            return;
                        }
                        SVG.Style style22 = this.c.a;
                        style22.A = null;
                        style22.z = null;
                        style22.y = null;
                        if (rVar != null) {
                        }
                        if (rVar2 != null) {
                            c cVar32 = (c) arrayList.get(0);
                            c cVar42 = (c) arrayList.get(i2);
                            i3 = 1;
                            while (i3 < size - 1) {
                            }
                        }
                        if (rVar3 == null) {
                        }
                    } else {
                        o("Marker reference '%s' not found", this.c.a.z);
                    }
                }
                rVar2 = null;
                str2 = this.c.a.A;
                if (str2 != null) {
                }
                rVar3 = null;
                z = lVar instanceof SVG.v;
                float f822 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (!z) {
                }
                if (arrayList == null) {
                }
            } else {
                o("Marker reference '%s' not found", this.c.a.y);
            }
        }
        rVar = null;
        str = this.c.a.z;
        if (str != null) {
        }
        rVar2 = null;
        str2 = this.c.a.A;
        if (str2 != null) {
        }
        rVar3 = null;
        z = lVar instanceof SVG.v;
        float f8222 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (!z) {
        }
        if (arrayList == null) {
        }
    }

    public final void L(SVG.s sVar, SVG.b bVar) {
        float f2;
        float f3;
        Canvas canvas = this.a;
        Boolean bool = sVar.n;
        if (bool == null || !bool.booleanValue()) {
            SVG.p pVar = sVar.p;
            float b = pVar != null ? pVar.b(this, 1.0f) : 1.2f;
            SVG.p pVar2 = sVar.q;
            float b2 = pVar2 != null ? pVar2.b(this, 1.0f) : 1.2f;
            f2 = b * bVar.c;
            f3 = b2 * bVar.d;
        } else {
            SVG.p pVar3 = sVar.p;
            f2 = pVar3 != null ? pVar3.f(this) : bVar.c;
            SVG.p pVar4 = sVar.q;
            f3 = pVar4 != null ? pVar4.g(this) : bVar.d;
        }
        if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        P();
        h t = t(sVar);
        this.c = t;
        t.a.n = Float.valueOf(1.0f);
        boolean F = F();
        canvas.save();
        Boolean bool2 = sVar.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(bVar.a, bVar.b);
            canvas.scale(bVar.c, bVar.d);
        }
        I(sVar, false);
        canvas.restore();
        if (F) {
            E(bVar);
        }
        O();
    }

    public final void M(float f2, float f3, float f4, float f5) {
        float f6 = f4 + f2;
        float f7 = f5 + f3;
        SVG.c cVar = this.c.a.x;
        if (cVar != null) {
            f2 += cVar.d.f(this);
            f3 += this.c.a.x.a.g(this);
            f6 -= this.c.a.x.b.f(this);
            f7 -= this.c.a.x.c.g(this);
        }
        this.a.clipRect(f2, f3, f6, f7);
    }

    public final void O() {
        this.a.restore();
        this.c = this.d.pop();
    }

    public final void P() {
        this.a.save();
        this.d.push(this.c);
        this.c = new h(this.c);
    }

    public final String Q(String str, boolean z, boolean z2) {
        if (this.c.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void R(SVG.j0 j0Var) {
        if (j0Var.b == null || j0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f.peek().invert(matrix)) {
            SVG.b bVar = j0Var.h;
            float f2 = bVar.a;
            float f3 = bVar.b;
            float a2 = bVar.a();
            SVG.b bVar2 = j0Var.h;
            float f4 = bVar2.b;
            float a3 = bVar2.a();
            float b = j0Var.h.b();
            SVG.b bVar3 = j0Var.h;
            float[] fArr = {f2, f3, a2, f4, a3, b, bVar3.a, bVar3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f5 = fArr[0];
            float f6 = fArr[1];
            RectF rectF = new RectF(f5, f6, f5, f6);
            for (int i2 = 2; i2 <= 6; i2 += 2) {
                float f7 = fArr[i2];
                if (f7 < rectF.left) {
                    rectF.left = f7;
                }
                if (f7 > rectF.right) {
                    rectF.right = f7;
                }
                float f8 = fArr[i2 + 1];
                if (f8 < rectF.top) {
                    rectF.top = f8;
                }
                if (f8 > rectF.bottom) {
                    rectF.bottom = f8;
                }
            }
            SVG.j0 j0Var2 = (SVG.j0) this.e.peek();
            SVG.b bVar4 = j0Var2.h;
            if (bVar4 == null) {
                float f9 = rectF.left;
                float f10 = rectF.top;
                j0Var2.h = new SVG.b(f9, f10, rectF.right - f9, rectF.bottom - f10);
                return;
            }
            float f11 = rectF.left;
            float f12 = rectF.top;
            float f13 = rectF.right - f11;
            float f14 = rectF.bottom - f12;
            if (f11 < bVar4.a) {
                bVar4.a = f11;
            }
            if (f12 < bVar4.b) {
                bVar4.b = f12;
            }
            if (f11 + f13 > bVar4.a()) {
                bVar4.c = (f11 + f13) - bVar4.a;
            }
            if (f12 + f14 > bVar4.b()) {
                bVar4.d = (f12 + f14) - bVar4.b;
            }
        }
    }

    public final void S(h hVar, SVG.Style style) {
        if (x(style, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            hVar.a.o = style.o;
        }
        if (x(style, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            hVar.a.n = style.n;
        }
        boolean x = x(style, 1L);
        SVG.f fVar = SVG.f.d;
        if (x) {
            hVar.a.c = style.c;
            SVG.n0 n0Var = style.c;
            hVar.b = (n0Var == null || n0Var == fVar) ? false : true;
        }
        if (x(style, 4L)) {
            hVar.a.e = style.e;
        }
        if (x(style, 6149L)) {
            N(hVar, true, hVar.a.c);
        }
        if (x(style, 2L)) {
            hVar.a.d = style.d;
        }
        if (x(style, 8L)) {
            hVar.a.f = style.f;
            SVG.n0 n0Var2 = style.f;
            hVar.c = (n0Var2 == null || n0Var2 == fVar) ? false : true;
        }
        if (x(style, 16L)) {
            hVar.a.g = style.g;
        }
        if (x(style, 6168L)) {
            N(hVar, false, hVar.a.f);
        }
        if (x(style, 34359738368L)) {
            hVar.a.M = style.M;
        }
        if (x(style, 32L)) {
            SVG.Style style2 = hVar.a;
            SVG.p pVar = style.h;
            style2.h = pVar;
            hVar.e.setStrokeWidth(pVar.a(this));
        }
        if (x(style, 64L)) {
            SVG.Style style3 = hVar.a;
            Paint paint = hVar.e;
            style3.i = style.i;
            int i2 = a.b[style.i.ordinal()];
            if (i2 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (x(style, 128L)) {
            SVG.Style style4 = hVar.a;
            Paint paint2 = hVar.e;
            style4.j = style.j;
            int i3 = a.c[style.j.ordinal()];
            if (i3 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i3 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i3 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (x(style, 256L)) {
            hVar.a.k = style.k;
            hVar.e.setStrokeMiter(style.k.floatValue());
        }
        if (x(style, 512L)) {
            hVar.a.l = style.l;
        }
        if (x(style, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            hVar.a.m = style.m;
        }
        Typeface typeface = null;
        if (x(style, 1536L)) {
            SVG.Style style5 = hVar.a;
            Paint paint3 = hVar.e;
            SVG.p[] pVarArr = style5.l;
            if (pVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = pVarArr.length;
                int i4 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i4];
                float f2 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    float a2 = style5.l[i5 % length].a(this);
                    fArr[i5] = a2;
                    f2 += a2;
                }
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    paint3.setPathEffect(null);
                } else {
                    float a3 = style5.m.a(this);
                    if (a3 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        a3 = (a3 % f2) + f2;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, a3));
                }
            }
        }
        if (x(style, PlaybackStateCompat.ACTION_PREPARE)) {
            float textSize = this.c.d.getTextSize();
            hVar.a.q = style.q;
            hVar.d.setTextSize(style.q.b(this, textSize));
            hVar.e.setTextSize(style.q.b(this, textSize));
        }
        if (x(style, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            hVar.a.p = style.p;
        }
        if (x(style, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (style.r.intValue() == -1 && hVar.a.r.intValue() > 100) {
                SVG.Style style6 = hVar.a;
                style6.r = Integer.valueOf(style6.r.intValue() - 100);
            } else if (style.r.intValue() != 1 || hVar.a.r.intValue() >= 900) {
                hVar.a.r = style.r;
            } else {
                SVG.Style style7 = hVar.a;
                style7.r = v11.b(100, style7.r);
            }
        }
        if (x(style, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            hVar.a.s = style.s;
        }
        if (x(style, 106496L)) {
            SVG.Style style8 = hVar.a;
            ArrayList arrayList = style8.p;
            if (arrayList != null && this.b != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typeface = h((String) it.next(), style8.r, style8.s)) == null) {
                }
            }
            if (typeface == null) {
                typeface = h(C.SERIF_NAME, style8.r, style8.s);
            }
            hVar.d.setTypeface(typeface);
            hVar.e.setTypeface(typeface);
        }
        if (x(style, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            SVG.Style style9 = hVar.a;
            Paint paint4 = hVar.e;
            Paint paint5 = hVar.d;
            style9.t = style.t;
            SVG.Style.TextDecoration textDecoration = style.t;
            SVG.Style.TextDecoration textDecoration2 = SVG.Style.TextDecoration.LineThrough;
            paint5.setStrikeThruText(textDecoration == textDecoration2);
            SVG.Style.TextDecoration textDecoration3 = style.t;
            SVG.Style.TextDecoration textDecoration4 = SVG.Style.TextDecoration.Underline;
            paint5.setUnderlineText(textDecoration3 == textDecoration4);
            paint4.setStrikeThruText(style.t == textDecoration2);
            paint4.setUnderlineText(style.t == textDecoration4);
        }
        if (x(style, 68719476736L)) {
            hVar.a.u = style.u;
        }
        if (x(style, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            hVar.a.v = style.v;
        }
        if (x(style, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            hVar.a.w = style.w;
        }
        if (x(style, 2097152L)) {
            hVar.a.y = style.y;
        }
        if (x(style, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            hVar.a.z = style.z;
        }
        if (x(style, 8388608L)) {
            hVar.a.A = style.A;
        }
        if (x(style, 16777216L)) {
            hVar.a.B = style.B;
        }
        if (x(style, 33554432L)) {
            hVar.a.C = style.C;
        }
        if (x(style, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            hVar.a.x = style.x;
        }
        if (x(style, 268435456L)) {
            hVar.a.F = style.F;
        }
        if (x(style, 536870912L)) {
            hVar.a.G = style.G;
        }
        if (x(style, 1073741824L)) {
            hVar.a.H = style.H;
        }
        if (x(style, 67108864L)) {
            hVar.a.D = style.D;
        }
        if (x(style, 134217728L)) {
            hVar.a.E = style.E;
        }
        if (x(style, 8589934592L)) {
            hVar.a.K = style.K;
        }
        if (x(style, 17179869184L)) {
            hVar.a.L = style.L;
        }
        if (x(style, 137438953472L)) {
            hVar.a.N = style.N;
        }
    }

    public final void T(h hVar, SVG.k0 k0Var) {
        boolean z = k0Var.b == null;
        SVG.Style style = hVar.a;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        style.B = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        style.w = bool;
        style.x = null;
        style.F = null;
        style.n = valueOf;
        style.D = SVG.f.c;
        style.E = valueOf;
        style.H = null;
        style.I = null;
        style.J = valueOf;
        style.K = null;
        style.L = valueOf;
        style.M = SVG.Style.VectorEffect.None;
        SVG.Style style2 = k0Var.e;
        if (style2 != null) {
            S(hVar, style2);
        }
        ArrayList arrayList = this.b.b.a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.b.b.a.iterator();
            while (it.hasNext()) {
                a.p pVar = (a.p) it.next();
                if (com.caverock.androidsvg.a.g(pVar.a, k0Var)) {
                    S(hVar, pVar.b);
                }
            }
        }
        SVG.Style style3 = k0Var.f;
        if (style3 != null) {
            S(hVar, style3);
        }
    }

    public final void U() {
        int i2;
        SVG.Style style = this.c.a;
        SVG.n0 n0Var = style.K;
        if (n0Var instanceof SVG.f) {
            i2 = ((SVG.f) n0Var).b;
        } else if (!(n0Var instanceof SVG.g)) {
            return;
        } else {
            i2 = style.o.b;
        }
        Float f2 = style.L;
        if (f2 != null) {
            i2 = i(f2.floatValue(), i2);
        }
        this.a.drawColor(i2);
    }

    public final boolean V() {
        Boolean bool = this.c.a.C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    public final Path b(SVG.j0 j0Var, SVG.b bVar) {
        Path D;
        SVG.k0 f2 = j0Var.a.f(this.c.a.F);
        if (f2 == null) {
            o("ClipPath reference '%s' not found", this.c.a.F);
            return null;
        }
        SVG.e eVar = (SVG.e) f2;
        this.d.push(this.c);
        this.c = t(eVar);
        Boolean bool = eVar.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(bVar.a, bVar.b);
            matrix.preScale(bVar.c, bVar.d);
        }
        Matrix matrix2 = eVar.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (SVG.m0 m0Var : eVar.i) {
            if ((m0Var instanceof SVG.j0) && (D = D((SVG.j0) m0Var, true)) != null) {
                path.op(D, Path.Op.UNION);
            }
        }
        if (this.c.a.F != null) {
            if (eVar.h == null) {
                eVar.h = c(path);
            }
            Path b = b(eVar, eVar.h);
            if (b != null) {
                path.op(b, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = this.d.pop();
        return path;
    }

    public final float d(SVG.x0 x0Var) {
        k kVar = new k();
        n(x0Var, kVar);
        return kVar.a;
    }

    public final void f(SVG.j0 j0Var, SVG.b bVar) {
        Path b;
        if (this.c.a.F == null || (b = b(j0Var, bVar)) == null) {
            return;
        }
        this.a.clipPath(b);
    }

    public final void g(SVG.j0 j0Var) {
        SVG.n0 n0Var = this.c.a.c;
        if (n0Var instanceof SVG.u) {
            j(true, j0Var.h, (SVG.u) n0Var);
        }
        SVG.n0 n0Var2 = this.c.a.f;
        if (n0Var2 instanceof SVG.u) {
            j(false, j0Var.h, (SVG.u) n0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z, SVG.b bVar, SVG.u uVar) {
        float f2;
        float b;
        float f3;
        float f4;
        float b2;
        float f5;
        float b3;
        float f6;
        SVG.k0 f7 = this.b.f(uVar.b);
        if (f7 == null) {
            o("%s reference '%s' not found", z ? "Fill" : "Stroke", uVar.b);
            SVG.n0 n0Var = uVar.c;
            if (n0Var != null) {
                N(this.c, z, n0Var);
                return;
            } else if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        boolean z2 = f7 instanceof SVG.l0;
        SVG.f fVar = SVG.f.c;
        if (z2) {
            SVG.l0 l0Var = (SVG.l0) f7;
            String str = l0Var.l;
            if (str != null) {
                q(l0Var, str);
            }
            Boolean bool = l0Var.i;
            Object[] objArr = bool != null && bool.booleanValue();
            h hVar = this.c;
            Paint paint = z ? hVar.d : hVar.e;
            if (objArr == true) {
                h hVar2 = this.c;
                SVG.b bVar2 = hVar2.g;
                if (bVar2 == null) {
                    bVar2 = hVar2.f;
                }
                SVG.p pVar = l0Var.m;
                float f8 = pVar != null ? pVar.f(this) : 0.0f;
                SVG.p pVar2 = l0Var.n;
                b2 = pVar2 != null ? pVar2.g(this) : 0.0f;
                f4 = 256.0f;
                SVG.p pVar3 = l0Var.o;
                float f9 = pVar3 != null ? pVar3.f(this) : bVar2.c;
                SVG.p pVar4 = l0Var.p;
                f6 = f9;
                f5 = f8;
                b3 = pVar4 != null ? pVar4.g(this) : 0.0f;
            } else {
                f4 = 256.0f;
                SVG.p pVar5 = l0Var.m;
                float b4 = pVar5 != null ? pVar5.b(this, 1.0f) : 0.0f;
                SVG.p pVar6 = l0Var.n;
                b2 = pVar6 != null ? pVar6.b(this, 1.0f) : 0.0f;
                SVG.p pVar7 = l0Var.o;
                float b5 = pVar7 != null ? pVar7.b(this, 1.0f) : 1.0f;
                SVG.p pVar8 = l0Var.p;
                f5 = b4;
                b3 = pVar8 != null ? pVar8.b(this, 1.0f) : 0.0f;
                f6 = b5;
            }
            float f10 = b2;
            P();
            this.c = t(l0Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(bVar.a, bVar.b);
                matrix.preScale(bVar.c, bVar.d);
            }
            Matrix matrix2 = l0Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = l0Var.h.size();
            if (size == 0) {
                O();
                if (z) {
                    this.c.b = false;
                    return;
                } else {
                    this.c.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator<SVG.m0> it = l0Var.h.iterator();
            int i2 = 0;
            float f11 = -1.0f;
            while (it.hasNext()) {
                SVG.d0 d0Var = (SVG.d0) it.next();
                Float f12 = d0Var.h;
                float floatValue = f12 != null ? f12.floatValue() : 0.0f;
                if (i2 == 0 || floatValue >= f11) {
                    fArr[i2] = floatValue;
                    f11 = floatValue;
                } else {
                    fArr[i2] = f11;
                }
                P();
                T(this.c, d0Var);
                SVG.Style style = this.c.a;
                SVG.f fVar2 = (SVG.f) style.D;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                iArr[i2] = i(style.E.floatValue(), fVar2.b);
                i2++;
                O();
            }
            if ((f5 == f6 && f10 == b3) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG.k kVar = l0Var.k;
            if (kVar != null) {
                if (kVar == SVG.k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (kVar == SVG.k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            O();
            LinearGradient linearGradient = new LinearGradient(f5, f10, f6, b3, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (this.c.a.e.floatValue() * f4);
            paint.setAlpha(floatValue2 >= 0 ? floatValue2 > 255 ? 255 : floatValue2 : 0);
            return;
        }
        if (!(f7 instanceof SVG.p0)) {
            if (f7 instanceof SVG.c0) {
                SVG.c0 c0Var = (SVG.c0) f7;
                if (z) {
                    if (x(c0Var.e, 2147483648L)) {
                        h hVar3 = this.c;
                        SVG.Style style2 = hVar3.a;
                        SVG.n0 n0Var2 = c0Var.e.I;
                        style2.c = n0Var2;
                        hVar3.b = n0Var2 != null;
                    }
                    if (x(c0Var.e, 4294967296L)) {
                        this.c.a.e = c0Var.e.J;
                    }
                    if (x(c0Var.e, 6442450944L)) {
                        h hVar4 = this.c;
                        N(hVar4, z, hVar4.a.c);
                        return;
                    }
                    return;
                }
                if (x(c0Var.e, 2147483648L)) {
                    h hVar5 = this.c;
                    SVG.Style style3 = hVar5.a;
                    SVG.n0 n0Var3 = c0Var.e.I;
                    style3.f = n0Var3;
                    hVar5.c = n0Var3 != null;
                }
                if (x(c0Var.e, 4294967296L)) {
                    this.c.a.g = c0Var.e.J;
                }
                if (x(c0Var.e, 6442450944L)) {
                    h hVar6 = this.c;
                    N(hVar6, z, hVar6.a.f);
                    return;
                }
                return;
            }
            return;
        }
        SVG.p0 p0Var = (SVG.p0) f7;
        String str2 = p0Var.l;
        if (str2 != null) {
            q(p0Var, str2);
        }
        Boolean bool2 = p0Var.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        h hVar7 = this.c;
        Paint paint2 = z ? hVar7.d : hVar7.e;
        if (objArr2 == true) {
            SVG.p pVar9 = new SVG.p(50.0f, SVG.c1.percent);
            SVG.p pVar10 = p0Var.m;
            float f13 = pVar10 != null ? pVar10.f(this) : pVar9.f(this);
            SVG.p pVar11 = p0Var.n;
            float g2 = pVar11 != null ? pVar11.g(this) : pVar9.g(this);
            SVG.p pVar12 = p0Var.o;
            b = pVar12 != null ? pVar12.a(this) : pVar9.a(this);
            f2 = f13;
            f3 = g2;
        } else {
            SVG.p pVar13 = p0Var.m;
            float b6 = pVar13 != null ? pVar13.b(this, 1.0f) : 0.5f;
            SVG.p pVar14 = p0Var.n;
            float b7 = pVar14 != null ? pVar14.b(this, 1.0f) : 0.5f;
            SVG.p pVar15 = p0Var.o;
            f2 = b6;
            b = pVar15 != null ? pVar15.b(this, 1.0f) : 0.5f;
            f3 = b7;
        }
        P();
        this.c = t(p0Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(bVar.a, bVar.b);
            matrix3.preScale(bVar.c, bVar.d);
        }
        Matrix matrix4 = p0Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = p0Var.h.size();
        if (size2 == 0) {
            O();
            if (z) {
                this.c.b = false;
                return;
            } else {
                this.c.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator<SVG.m0> it2 = p0Var.h.iterator();
        int i3 = 0;
        float f14 = -1.0f;
        while (it2.hasNext()) {
            SVG.d0 d0Var2 = (SVG.d0) it2.next();
            Float f15 = d0Var2.h;
            float floatValue3 = f15 != null ? f15.floatValue() : 0.0f;
            if (i3 == 0 || floatValue3 >= f14) {
                fArr2[i3] = floatValue3;
                f14 = floatValue3;
            } else {
                fArr2[i3] = f14;
            }
            P();
            T(this.c, d0Var2);
            SVG.Style style4 = this.c.a;
            SVG.f fVar3 = (SVG.f) style4.D;
            if (fVar3 == null) {
                fVar3 = fVar;
            }
            iArr2[i3] = i(style4.E.floatValue(), fVar3.b);
            i3++;
            O();
        }
        if (b == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || size2 == 1) {
            O();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        SVG.k kVar2 = p0Var.k;
        if (kVar2 != null) {
            if (kVar2 == SVG.k.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (kVar2 == SVG.k.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        O();
        RadialGradient radialGradient = new RadialGradient(f2, f3, b, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (this.c.a.e.floatValue() * 256.0f);
        paint2.setAlpha(floatValue4 >= 0 ? floatValue4 > 255 ? 255 : floatValue4 : 0);
    }

    public final boolean k() {
        Boolean bool = this.c.a.B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(SVG.j0 j0Var, Path path) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        boolean z2;
        float floor;
        float b;
        boolean F;
        float f7;
        float f8;
        Canvas canvas = this.a;
        SVG.n0 n0Var = this.c.a.c;
        if (n0Var instanceof SVG.u) {
            SVG.k0 f9 = this.b.f(((SVG.u) n0Var).b);
            if (f9 instanceof SVG.y) {
                SVG.y yVar = (SVG.y) f9;
                Boolean bool = yVar.p;
                boolean z3 = bool != null && bool.booleanValue();
                String str = yVar.w;
                if (str != null) {
                    s(yVar, str);
                }
                if (z3) {
                    SVG.p pVar = yVar.s;
                    f2 = pVar != null ? pVar.f(this) : 0.0f;
                    SVG.p pVar2 = yVar.t;
                    f4 = pVar2 != null ? pVar2.g(this) : 0.0f;
                    SVG.p pVar3 = yVar.u;
                    f5 = pVar3 != null ? pVar3.f(this) : 0.0f;
                    SVG.p pVar4 = yVar.v;
                    f3 = pVar4 != null ? pVar4.g(this) : 0.0f;
                } else {
                    SVG.p pVar5 = yVar.s;
                    float b2 = pVar5 != null ? pVar5.b(this, 1.0f) : 0.0f;
                    SVG.p pVar6 = yVar.t;
                    float b3 = pVar6 != null ? pVar6.b(this, 1.0f) : 0.0f;
                    SVG.p pVar7 = yVar.u;
                    float b4 = pVar7 != null ? pVar7.b(this, 1.0f) : 0.0f;
                    SVG.p pVar8 = yVar.v;
                    float b5 = pVar8 != null ? pVar8.b(this, 1.0f) : 0.0f;
                    SVG.b bVar = j0Var.h;
                    float f10 = bVar.a;
                    float f11 = bVar.c;
                    f2 = (b2 * f11) + f10;
                    float f12 = bVar.b;
                    float f13 = bVar.d;
                    float f14 = b4 * f11;
                    f3 = b5 * f13;
                    f4 = (b3 * f13) + f12;
                    f5 = f14;
                }
                if (f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    return;
                }
                PreserveAspectRatio preserveAspectRatio = yVar.n;
                if (preserveAspectRatio == null) {
                    preserveAspectRatio = PreserveAspectRatio.d;
                }
                P();
                canvas.clipPath(path);
                h hVar = new h();
                S(hVar, SVG.Style.a());
                hVar.a.w = Boolean.FALSE;
                u(yVar, hVar);
                this.c = hVar;
                SVG.b bVar2 = j0Var.h;
                Matrix matrix = yVar.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (yVar.r.invert(matrix2)) {
                        SVG.b bVar3 = j0Var.h;
                        float f15 = bVar3.a;
                        float f16 = bVar3.b;
                        float a2 = bVar3.a();
                        z = true;
                        SVG.b bVar4 = j0Var.h;
                        z2 = false;
                        float f17 = bVar4.b;
                        float a3 = bVar4.a();
                        float b6 = j0Var.h.b();
                        SVG.b bVar5 = j0Var.h;
                        f6 = f2;
                        float[] fArr = {f15, f16, a2, f17, a3, b6, bVar5.a, bVar5.b()};
                        matrix2.mapPoints(fArr);
                        float f18 = fArr[0];
                        float f19 = fArr[1];
                        RectF rectF = new RectF(f18, f19, f18, f19);
                        for (int i2 = 2; i2 <= 6; i2 += 2) {
                            float f20 = fArr[i2];
                            if (f20 < rectF.left) {
                                rectF.left = f20;
                            }
                            if (f20 > rectF.right) {
                                rectF.right = f20;
                            }
                            float f21 = fArr[i2 + 1];
                            if (f21 < rectF.top) {
                                rectF.top = f21;
                            }
                            if (f21 > rectF.bottom) {
                                rectF.bottom = f21;
                            }
                        }
                        float f22 = rectF.left;
                        float f23 = rectF.top;
                        bVar2 = new SVG.b(f22, f23, rectF.right - f22, rectF.bottom - f23);
                        float floor2 = (((float) Math.floor((bVar2.a - f6) / f5)) * f5) + f6;
                        float a4 = bVar2.a();
                        b = bVar2.b();
                        SVG.b bVar6 = new SVG.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f3);
                        F = F();
                        for (floor = (((float) Math.floor((bVar2.b - f4) / f3)) * f3) + f4; floor < b; floor += f3) {
                            float f24 = floor2;
                            while (f24 < a4) {
                                bVar6.a = f24;
                                bVar6.b = floor;
                                P();
                                if (this.c.a.w.booleanValue()) {
                                    f7 = b;
                                    f8 = floor2;
                                } else {
                                    f7 = b;
                                    f8 = floor2;
                                    M(bVar6.a, bVar6.b, bVar6.c, bVar6.d);
                                }
                                SVG.b bVar7 = yVar.o;
                                if (bVar7 != null) {
                                    canvas.concat(e(bVar6, bVar7, preserveAspectRatio));
                                } else {
                                    Boolean bool2 = yVar.q;
                                    boolean z4 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                                    canvas.translate(f24, floor);
                                    if (!z4) {
                                        SVG.b bVar8 = j0Var.h;
                                        canvas.scale(bVar8.c, bVar8.d);
                                    }
                                }
                                Iterator<SVG.m0> it = yVar.i.iterator();
                                while (it.hasNext()) {
                                    H(it.next());
                                }
                                O();
                                f24 += f5;
                                b = f7;
                                floor2 = f8;
                            }
                        }
                        if (F) {
                            E(yVar.h);
                        }
                        O();
                        return;
                    }
                }
                f6 = f2;
                z = true;
                z2 = false;
                float floor22 = (((float) Math.floor((bVar2.a - f6) / f5)) * f5) + f6;
                float a42 = bVar2.a();
                b = bVar2.b();
                SVG.b bVar62 = new SVG.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f3);
                F = F();
                while (floor < b) {
                }
                if (F) {
                }
                O();
                return;
            }
        }
        canvas.drawPath(path, this.c.d);
    }

    public final void m(Path path) {
        Canvas canvas = this.a;
        h hVar = this.c;
        if (hVar.a.M != SVG.Style.VectorEffect.NonScalingStroke) {
            canvas.drawPath(path, hVar.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.c.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.c.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(SVG.x0 x0Var, j jVar) {
        float f2;
        float f3;
        float f4;
        SVG.Style.TextAnchor v;
        if (k()) {
            Iterator<SVG.m0> it = x0Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                SVG.m0 next = it.next();
                if (next instanceof SVG.b1) {
                    jVar.b(Q(((SVG.b1) next).c, z, !it.hasNext()));
                } else if (jVar.a((SVG.x0) next)) {
                    boolean z2 = next instanceof SVG.y0;
                    float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    if (z2) {
                        P();
                        SVG.y0 y0Var = (SVG.y0) next;
                        T(this.c, y0Var);
                        if (k() && V()) {
                            SVG.k0 f6 = y0Var.a.f(y0Var.n);
                            if (f6 == null) {
                                o("TextPath reference '%s' not found", y0Var.n);
                            } else {
                                SVG.v vVar = (SVG.v) f6;
                                d dVar = new d(vVar.o);
                                Matrix matrix = vVar.n;
                                Path path = dVar.a;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                SVG.p pVar = y0Var.o;
                                if (pVar != null) {
                                    f5 = pVar.b(this, pathMeasure.getLength());
                                }
                                SVG.Style.TextAnchor v2 = v();
                                if (v2 != SVG.Style.TextAnchor.Start) {
                                    float d2 = d(y0Var);
                                    if (v2 == SVG.Style.TextAnchor.Middle) {
                                        d2 /= 2.0f;
                                    }
                                    f5 -= d2;
                                }
                                g((SVG.j0) y0Var.p);
                                boolean F = F();
                                n(y0Var, new e(path, f5));
                                if (F) {
                                    E(y0Var.h);
                                }
                            }
                        }
                        O();
                    } else if (next instanceof SVG.u0) {
                        P();
                        SVG.u0 u0Var = (SVG.u0) next;
                        T(this.c, u0Var);
                        if (k()) {
                            ArrayList arrayList = u0Var.n;
                            boolean z3 = arrayList != null && arrayList.size() > 0;
                            boolean z4 = jVar instanceof f;
                            if (z4) {
                                float f7 = !z3 ? ((f) jVar).a : ((SVG.p) u0Var.n.get(0)).f(this);
                                ArrayList arrayList2 = u0Var.o;
                                f3 = (arrayList2 == null || arrayList2.size() == 0) ? ((f) jVar).b : ((SVG.p) u0Var.o.get(0)).g(this);
                                ArrayList arrayList3 = u0Var.p;
                                f4 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((SVG.p) u0Var.p.get(0)).f(this);
                                ArrayList arrayList4 = u0Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f5 = ((SVG.p) u0Var.q.get(0)).g(this);
                                }
                                float f8 = f7;
                                f2 = f5;
                                f5 = f8;
                            } else {
                                f2 = 0.0f;
                                f3 = 0.0f;
                                f4 = 0.0f;
                            }
                            if (z3 && (v = v()) != SVG.Style.TextAnchor.Start) {
                                float d3 = d(u0Var);
                                if (v == SVG.Style.TextAnchor.Middle) {
                                    d3 /= 2.0f;
                                }
                                f5 -= d3;
                            }
                            g((SVG.j0) u0Var.r);
                            if (z4) {
                                f fVar = (f) jVar;
                                fVar.a = f5 + f4;
                                fVar.b = f3 + f2;
                            }
                            boolean F2 = F();
                            n(u0Var, jVar);
                            if (F2) {
                                E(u0Var.h);
                            }
                        }
                        O();
                    } else if (next instanceof SVG.t0) {
                        P();
                        SVG.t0 t0Var = (SVG.t0) next;
                        T(this.c, t0Var);
                        if (k()) {
                            g((SVG.j0) t0Var.o);
                            SVG.k0 f9 = next.a.f(t0Var.n);
                            if (f9 == null || !(f9 instanceof SVG.x0)) {
                                o("Tref reference '%s' not found", t0Var.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                p((SVG.x0) f9, sb);
                                if (sb.length() > 0) {
                                    jVar.b(sb.toString());
                                }
                            }
                        }
                        O();
                    }
                }
                z = false;
            }
        }
    }

    public final void p(SVG.x0 x0Var, StringBuilder sb) {
        Iterator<SVG.m0> it = x0Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            SVG.m0 next = it.next();
            if (next instanceof SVG.x0) {
                p((SVG.x0) next, sb);
            } else if (next instanceof SVG.b1) {
                sb.append(Q(((SVG.b1) next).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final h t(SVG.k0 k0Var) {
        h hVar = new h();
        S(hVar, SVG.Style.a());
        u(k0Var, hVar);
        return hVar;
    }

    public final void u(SVG.m0 m0Var, h hVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (m0Var instanceof SVG.k0) {
                arrayList.add(0, (SVG.k0) m0Var);
            }
            Object obj = m0Var.b;
            if (obj == null) {
                break;
            } else {
                m0Var = (SVG.m0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T(hVar, (SVG.k0) it.next());
        }
        h hVar2 = this.c;
        hVar.g = hVar2.g;
        hVar.f = hVar2.f;
    }

    public final SVG.Style.TextAnchor v() {
        SVG.Style.TextAnchor textAnchor;
        SVG.Style style = this.c.a;
        if (style.u == SVG.Style.TextDirection.LTR || (textAnchor = style.v) == SVG.Style.TextAnchor.Middle) {
            return style.v;
        }
        SVG.Style.TextAnchor textAnchor2 = SVG.Style.TextAnchor.Start;
        return textAnchor == textAnchor2 ? SVG.Style.TextAnchor.End : textAnchor2;
    }

    public final Path.FillType w() {
        SVG.Style.FillRule fillRule = this.c.a.G;
        return (fillRule == null || fillRule != SVG.Style.FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path y(SVG.d dVar) {
        SVG.p pVar = dVar.o;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = pVar != null ? pVar.f(this) : 0.0f;
        SVG.p pVar2 = dVar.p;
        if (pVar2 != null) {
            f2 = pVar2.g(this);
        }
        float f4 = f2;
        float a2 = dVar.q.a(this);
        float f5 = f3 - a2;
        float f6 = f4 - a2;
        float f7 = f3 + a2;
        float f8 = f4 + a2;
        if (dVar.h == null) {
            float f9 = 2.0f * a2;
            dVar.h = new SVG.b(f5, f6, f9, f9);
        }
        float f10 = a2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f3, f6);
        float f11 = f3 + f10;
        float f12 = f4 - f10;
        path.cubicTo(f11, f6, f7, f12, f7, f4);
        float f13 = f4 + f10;
        path.cubicTo(f7, f13, f11, f8, f3, f8);
        float f14 = f3 - f10;
        path.cubicTo(f14, f8, f5, f13, f5, f4);
        path.cubicTo(f5, f12, f14, f6, f3, f6);
        path.close();
        return path;
    }

    public final Path z(SVG.i iVar) {
        SVG.p pVar = iVar.o;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = pVar != null ? pVar.f(this) : 0.0f;
        SVG.p pVar2 = iVar.p;
        if (pVar2 != null) {
            f2 = pVar2.g(this);
        }
        float f4 = f2;
        float f5 = iVar.q.f(this);
        float g2 = iVar.r.g(this);
        float f6 = f3 - f5;
        float f7 = f4 - g2;
        float f8 = f3 + f5;
        float f9 = f4 + g2;
        if (iVar.h == null) {
            iVar.h = new SVG.b(f6, f7, f5 * 2.0f, 2.0f * g2);
        }
        float f10 = f5 * 0.5522848f;
        float f11 = g2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(f3, f7);
        float f12 = f3 + f10;
        float f13 = f4 - f11;
        path.cubicTo(f12, f7, f8, f13, f8, f4);
        float f14 = f4 + f11;
        path.cubicTo(f8, f14, f12, f9, f3, f9);
        float f15 = f3 - f10;
        path.cubicTo(f15, f9, f6, f14, f6, f4);
        path.cubicTo(f6, f13, f15, f7, f3, f7);
        path.close();
        return path;
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class h {
        public final SVG.Style a;
        public boolean b;
        public boolean c;
        public final Paint d;
        public final Paint e;
        public SVG.b f;
        public SVG.b g;
        public boolean h;

        public h() {
            Paint paint = new Paint();
            this.d = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.e = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.a = SVG.Style.a();
        }

        public h(h hVar) {
            this.b = hVar.b;
            this.c = hVar.c;
            this.d = new Paint(hVar.d);
            this.e = new Paint(hVar.e);
            SVG.b bVar = hVar.f;
            if (bVar != null) {
                this.f = new SVG.b(bVar);
            }
            SVG.b bVar2 = hVar.g;
            if (bVar2 != null) {
                this.g = new SVG.b(bVar2);
            }
            this.h = hVar.h;
            try {
                this.a = (SVG.Style) hVar.a.clone();
            } catch (CloneNotSupportedException e) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
                this.a = SVG.Style.a();
            }
        }
    }
}
