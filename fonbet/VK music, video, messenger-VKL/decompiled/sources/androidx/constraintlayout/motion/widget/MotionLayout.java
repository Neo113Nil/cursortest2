package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import androidx.core.widget.NestedScrollView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.a2v;
import xsna.bg3;
import xsna.bgl0;
import xsna.c4m;
import xsna.ca30;
import xsna.d6j;
import xsna.da30;
import xsna.dzt0;
import xsna.e2v;
import xsna.ea30;
import xsna.emk;
import xsna.fb30;
import xsna.fey;
import xsna.fw3;
import xsna.gdp0;
import xsna.guo;
import xsna.hdp0;
import xsna.he6;
import xsna.i5s;
import xsna.kt6;
import xsna.la30;
import xsna.ma30;
import xsna.n2l;
import xsna.nt8;
import xsna.ruk0;
import xsna.u160;
import xsna.w0u0;
import xsna.xy9;
import xsna.ymk0;

/* loaded from: classes11.dex */
public class MotionLayout extends ConstraintLayout implements u160 {
    public static boolean H0;
    public int A;
    public j A0;
    public int B;
    public final f B0;
    public boolean C;
    public boolean C0;
    public final HashMap<View, ea30> D;
    public final RectF D0;
    public long E;
    public View E0;
    public float F;
    public Matrix F0;
    public float G;
    public final ArrayList<Integer> G0;
    public float H;
    public long I;
    public float J;
    public boolean K;
    public boolean L;
    public i M;
    public int N;
    public e O;
    public boolean P;
    public final bgl0 Q;
    public final d R;
    public c4m S;
    public int T;
    public int U;
    public boolean V;
    public float W;
    public float a0;
    public long b0;
    public float c0;
    public boolean d0;
    public ArrayList<la30> e0;
    public ArrayList<la30> f0;
    public CopyOnWriteArrayList<i> g0;
    public int h0;
    public long i0;
    public float j0;
    public int k0;
    public float l0;
    public boolean m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public androidx.constraintlayout.motion.widget.a t;
    public float t0;
    public ma30 u;
    public final nt8 u0;
    public Interpolator v;
    public boolean v0;
    public float w;
    public h w0;
    public int x;
    public he6 x0;
    public int y;
    public final Rect y0;
    public int z;
    public boolean z0;

    public class a implements Runnable {
        public final /* synthetic */ View b;

        public a(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.b.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MotionLayout.this.w0.a();
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[j.values().length];
            a = iArr;
            try {
                iArr[j.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[j.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[j.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[j.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class d extends ma30 {
        public float a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        public float c;

        public d() {
        }

        @Override // xsna.ma30
        public final float a() {
            return MotionLayout.this.w;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = this.a;
            MotionLayout motionLayout = MotionLayout.this;
            if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f3 = this.c;
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                motionLayout.w = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.b;
            }
            float f4 = this.c;
            if ((-f2) / f4 < f) {
                f = (-f2) / f4;
            }
            motionLayout.w = (f4 * f) + f2;
            return (((f4 * f) * f) / 2.0f) + (f2 * f) + this.b;
        }
    }

    public class e {
        public float[] a;
        public final int[] b;
        public final float[] c;
        public Path d;
        public final Paint e;
        public final Paint f;
        public final Paint g;
        public final Paint h;
        public final Paint i;
        public final float[] j;
        public int k;
        public final Rect l = new Rect();
        public final int m = 1;

        public e() {
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            this.f = paint2;
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.g = paint3;
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            this.h = paint4;
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint5 = new Paint();
            this.i = paint5;
            paint5.setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            this.c = new float[100];
            this.b = new int[50];
        }

        public final void a(Canvas canvas, int i, int i2, ea30 ea30Var) {
            Canvas canvas2;
            int i3;
            int i4;
            boolean z;
            float f;
            int[] iArr = this.b;
            boolean z2 = false;
            int i5 = 4;
            if (i == 4) {
                int i6 = 0;
                boolean z3 = false;
                boolean z4 = false;
                while (i6 < this.k) {
                    int i7 = iArr[i6];
                    boolean z5 = z3;
                    if (i7 == 1) {
                        z5 = true;
                    }
                    if (i7 == 0) {
                        z4 = true;
                    }
                    i6++;
                    z3 = z5;
                    z4 = z4;
                }
                if (z3) {
                    float[] fArr = this.a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
                }
                if (z4) {
                    b(canvas);
                }
            }
            if (i == 2) {
                float[] fArr2 = this.a;
                canvas2 = canvas;
                canvas2.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.g);
            } else {
                canvas2 = canvas;
            }
            if (i == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.a, this.e);
            View view = ea30Var.b;
            if (view != null) {
                i3 = view.getWidth();
                i4 = ea30Var.b.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i8 = 1;
            while (i8 < i2 - 1) {
                if (i == i5 && iArr[i8 - 1] == 0) {
                    z = z2;
                } else {
                    int i9 = i8 * 2;
                    float[] fArr3 = this.c;
                    float f2 = fArr3[i9];
                    float f3 = fArr3[i9 + 1];
                    this.d.reset();
                    z = z2;
                    this.d.moveTo(f2, f3 + 10.0f);
                    this.d.lineTo(f2 + 10.0f, f3);
                    this.d.lineTo(f2, f3 - 10.0f);
                    this.d.lineTo(f2 - 10.0f, f3);
                    this.d.close();
                    int i10 = i8 - 1;
                    ea30Var.u.get(i10);
                    Paint paint = this.i;
                    if (i == i5) {
                        int i11 = iArr[i10];
                        if (i11 == 1) {
                            d(canvas2, f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else if (i11 == 0) {
                            c(canvas2, f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else if (i11 == 2) {
                            f = f3;
                            e(canvas2, f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, i4);
                            canvas2.drawPath(this.d, paint);
                        }
                        f = f3;
                        canvas2.drawPath(this.d, paint);
                    } else {
                        f = f3;
                    }
                    if (i == 2) {
                        d(canvas2, f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i == 3) {
                        c(canvas2, f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    if (i == 6) {
                        e(canvas2, f2 - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3, i4);
                    }
                    canvas2.drawPath(this.d, paint);
                }
                i8++;
                z2 = z;
                i5 = 4;
            }
            boolean z6 = z2;
            float[] fArr4 = this.a;
            if (fArr4.length > 1) {
                float f4 = fArr4[z6 ? 1 : 0];
                float f5 = fArr4[1];
                Paint paint2 = this.f;
                canvas2.drawCircle(f4, f5, 8.0f, paint2);
                float[] fArr5 = this.a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, paint2);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            float min = Math.min(f, f3);
            float max = Math.max(f2, f4);
            float max2 = Math.max(f, f3);
            float max3 = Math.max(f2, f4);
            Paint paint = this.g;
            canvas.drawLine(min, max, max2, max3, paint);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), paint);
        }

        public final void c(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            int length = str.length();
            Rect rect = this.l;
            Paint paint = this.h;
            paint.getTextBounds(str, 0, length, rect);
            Rect rect2 = this.l;
            canvas.drawText(str, ((min2 / 2.0f) - (rect2.width() / 2)) + min, f2 - 20.0f, paint);
            float min3 = Math.min(f3, f5);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, min3, f2, paint2);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str2, 0, str2.length(), this.l);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (rect2.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), paint2);
        }

        public final void d(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f2 - f4) * f8) + ((f - f3) * f7)) / (hypot * hypot);
            float f10 = (f7 * f9) + f3;
            float f11 = (f9 * f8) + f4;
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            int length = str.length();
            Rect rect = this.l;
            Paint paint = this.h;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.l.width() / 2), -20.0f, paint);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        public final void e(Canvas canvas, float f, float f2, int i, int i2) {
            StringBuilder sb = new StringBuilder("");
            MotionLayout motionLayout = MotionLayout.this;
            sb.append(((int) ((((f - (i / 2)) * 100.0f) / (motionLayout.getWidth() - i)) + 0.5d)) / 100.0f);
            String sb2 = sb.toString();
            int length = sb2.length();
            Rect rect = this.l;
            Paint paint = this.h;
            paint.getTextBounds(sb2, 0, length, rect);
            Rect rect2 = this.l;
            canvas.drawText(sb2, ((f / 2.0f) - (rect2.width() / 2)) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2 - 20.0f, paint);
            float min = Math.min(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            Paint paint2 = this.g;
            canvas.drawLine(f, f2, min, f2, paint2);
            String str = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (motionLayout.getHeight() - i2)) + 0.5d)) / 100.0f);
            paint.getTextBounds(str, 0, str.length(), this.l);
            canvas.drawText(str, f + 5.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - ((f2 / 2.0f) - (rect2.height() / 2)), paint);
            canvas.drawLine(f, f2, f, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), paint2);
        }
    }

    public class f {
        public androidx.constraintlayout.core.widgets.d a = new androidx.constraintlayout.core.widgets.d();
        public androidx.constraintlayout.core.widgets.d b = new androidx.constraintlayout.core.widgets.d();
        public androidx.constraintlayout.widget.b c = null;
        public androidx.constraintlayout.widget.b d = null;
        public int e;
        public int f;

        public f() {
        }

        public static void c(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.core.widgets.d dVar2) {
            ArrayList<ConstraintWidget> arrayList = dVar.v0;
            HashMap<ConstraintWidget, ConstraintWidget> hashMap = new HashMap<>();
            hashMap.put(dVar, dVar2);
            dVar2.v0.clear();
            dVar2.k(dVar, hashMap);
            Iterator<ConstraintWidget> it = arrayList.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                ConstraintWidget aVar = next instanceof androidx.constraintlayout.core.widgets.a ? new androidx.constraintlayout.core.widgets.a() : next instanceof androidx.constraintlayout.core.widgets.f ? new androidx.constraintlayout.core.widgets.f() : next instanceof androidx.constraintlayout.core.widgets.e ? new androidx.constraintlayout.core.widgets.e() : next instanceof androidx.constraintlayout.core.widgets.h ? new androidx.constraintlayout.core.widgets.h() : next instanceof a2v ? new e2v() : new ConstraintWidget();
                dVar2.c(aVar);
                hashMap.put(next, aVar);
            }
            Iterator<ConstraintWidget> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                hashMap.get(next2).k(next2, hashMap);
            }
        }

        public static ConstraintWidget d(androidx.constraintlayout.core.widgets.d dVar, View view) {
            if (dVar.i0 == view) {
                return dVar;
            }
            ArrayList<ConstraintWidget> arrayList = dVar.v0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConstraintWidget constraintWidget = arrayList.get(i);
                if (constraintWidget.i0 == view) {
                    return constraintWidget;
                }
            }
            return null;
        }

        public final void a() {
            int i;
            SparseArray sparseArray;
            int[] iArr;
            int i2;
            View view;
            MotionLayout motionLayout = MotionLayout.this;
            int childCount = motionLayout.getChildCount();
            motionLayout.D.clear();
            SparseArray sparseArray2 = new SparseArray();
            int[] iArr2 = new int[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ea30 ea30Var = new ea30(childAt);
                int id = childAt.getId();
                iArr2[i3] = id;
                sparseArray2.put(id, ea30Var);
                motionLayout.D.put(childAt, ea30Var);
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt2 = motionLayout.getChildAt(i4);
                ea30 ea30Var2 = motionLayout.D.get(childAt2);
                if (ea30Var2 == null) {
                    i = childCount;
                    sparseArray = sparseArray2;
                    iArr = iArr2;
                    i2 = i4;
                } else {
                    ca30 ca30Var = ea30Var2.h;
                    fb30 fb30Var = ea30Var2.f;
                    if (this.c != null) {
                        ConstraintWidget d = d(this.a, childAt2);
                        if (d != null) {
                            Rect P4 = MotionLayout.P4(motionLayout, d);
                            androidx.constraintlayout.widget.b bVar = this.c;
                            iArr = iArr2;
                            int width = motionLayout.getWidth();
                            i2 = i4;
                            int height = motionLayout.getHeight();
                            sparseArray = sparseArray2;
                            int i5 = bVar.c;
                            i = childCount;
                            if (i5 != 0) {
                                ea30.f(P4, ea30Var2.a, i5, width, height);
                            }
                            fb30Var.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            fb30Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            ea30Var2.e(fb30Var);
                            view = childAt2;
                            fb30Var.d(P4.left, P4.top, P4.width(), P4.height());
                            b.a u = bVar.u(ea30Var2.c);
                            fb30Var.a(u);
                            b.c cVar = u.d;
                            ea30Var2.l = cVar.g;
                            ca30Var.d(P4, bVar, i5, ea30Var2.c);
                            ea30Var2.C = u.f.i;
                            ea30Var2.E = cVar.j;
                            ea30Var2.F = cVar.i;
                            Context context = ea30Var2.b.getContext();
                            int i6 = cVar.l;
                            ea30Var2.G = i6 != -2 ? i6 != -1 ? i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 4 ? i6 != 5 ? null : new OvershootInterpolator() : new BounceInterpolator() : new DecelerateInterpolator() : new AccelerateInterpolator() : new AccelerateDecelerateInterpolator() : new da30(guo.c(cVar.k)) : AnimationUtils.loadInterpolator(context, cVar.m);
                        } else {
                            i = childCount;
                            sparseArray = sparseArray2;
                            iArr = iArr2;
                            i2 = i4;
                            view = childAt2;
                            if (motionLayout.N != 0) {
                                Log.e("MotionLayout", n2l.b() + "no widget for  " + n2l.d(view) + " (" + view.getClass().getName() + ")");
                            }
                        }
                    } else {
                        i = childCount;
                        sparseArray = sparseArray2;
                        iArr = iArr2;
                        i2 = i4;
                        view = childAt2;
                    }
                    if (this.d != null) {
                        View view2 = view;
                        ConstraintWidget d2 = d(this.b, view2);
                        if (d2 != null) {
                            Rect P42 = MotionLayout.P4(motionLayout, d2);
                            androidx.constraintlayout.widget.b bVar2 = this.d;
                            int width2 = motionLayout.getWidth();
                            int height2 = motionLayout.getHeight();
                            fb30 fb30Var2 = ea30Var2.g;
                            int i7 = bVar2.c;
                            if (i7 != 0) {
                                ea30.f(P42, ea30Var2.a, i7, width2, height2);
                                P42 = ea30Var2.a;
                            }
                            fb30Var2.d = 1.0f;
                            fb30Var2.e = 1.0f;
                            ea30Var2.e(fb30Var2);
                            fb30Var2.d(P42.left, P42.top, P42.width(), P42.height());
                            fb30Var2.a(bVar2.u(ea30Var2.c));
                            ea30Var2.i.d(P42, bVar2, i7, ea30Var2.c);
                        } else if (motionLayout.N != 0) {
                            Log.e("MotionLayout", n2l.b() + "no widget for  " + n2l.d(view2) + " (" + view2.getClass().getName() + ")");
                        }
                    }
                }
                i4 = i2 + 1;
                iArr2 = iArr;
                sparseArray2 = sparseArray;
                childCount = i;
            }
            int[] iArr3 = iArr2;
            int i8 = childCount;
            int i9 = 0;
            while (true) {
                SparseArray sparseArray3 = sparseArray2;
                if (i9 >= i8) {
                    return;
                }
                sparseArray2 = sparseArray3;
                ea30 ea30Var3 = (ea30) sparseArray2.get(iArr3[i9]);
                int i10 = ea30Var3.f.l;
                if (i10 != -1) {
                    ea30 ea30Var4 = (ea30) sparseArray2.get(i10);
                    ea30Var3.f.f(ea30Var4, ea30Var4.f);
                    ea30Var3.g.f(ea30Var4, ea30Var4.g);
                }
                i9++;
            }
        }

        public final void b(int i, int i2) {
            MotionLayout motionLayout = MotionLayout.this;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            if (motionLayout.y == motionLayout.getStartState()) {
                androidx.constraintlayout.core.widgets.d dVar = this.b;
                androidx.constraintlayout.widget.b bVar = this.d;
                motionLayout.N4(dVar, optimizationLevel, (bVar == null || bVar.c == 0) ? i : i2, (bVar == null || bVar.c == 0) ? i2 : i);
                androidx.constraintlayout.widget.b bVar2 = this.c;
                if (bVar2 != null) {
                    androidx.constraintlayout.core.widgets.d dVar2 = this.a;
                    int i3 = bVar2.c;
                    int i4 = i3 == 0 ? i : i2;
                    if (i3 == 0) {
                        i = i2;
                    }
                    motionLayout.N4(dVar2, optimizationLevel, i4, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.b bVar3 = this.c;
            if (bVar3 != null) {
                androidx.constraintlayout.core.widgets.d dVar3 = this.a;
                int i5 = bVar3.c;
                motionLayout.N4(dVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
            }
            androidx.constraintlayout.core.widgets.d dVar4 = this.b;
            androidx.constraintlayout.widget.b bVar4 = this.d;
            int i6 = (bVar4 == null || bVar4.c == 0) ? i : i2;
            if (bVar4 == null || bVar4.c == 0) {
                i = i2;
            }
            motionLayout.N4(dVar4, optimizationLevel, i6, i);
        }

        public final void e(androidx.constraintlayout.widget.b bVar, androidx.constraintlayout.widget.b bVar2) {
            this.c = bVar;
            this.d = bVar2;
            this.a = new androidx.constraintlayout.core.widgets.d();
            androidx.constraintlayout.core.widgets.d dVar = new androidx.constraintlayout.core.widgets.d();
            this.b = dVar;
            androidx.constraintlayout.core.widgets.d dVar2 = this.a;
            boolean z = MotionLayout.H0;
            MotionLayout motionLayout = MotionLayout.this;
            androidx.constraintlayout.core.widgets.d dVar3 = motionLayout.d;
            kt6.b bVar3 = dVar3.z0;
            dVar2.z0 = bVar3;
            dVar2.x0.f = bVar3;
            kt6.b bVar4 = dVar3.z0;
            dVar.z0 = bVar4;
            dVar.x0.f = bVar4;
            dVar2.v0.clear();
            this.b.v0.clear();
            c(motionLayout.d, this.a);
            c(motionLayout.d, this.b);
            if (motionLayout.H > 0.5d) {
                if (bVar != null) {
                    g(this.a, bVar);
                }
                g(this.b, bVar2);
            } else {
                g(this.b, bVar2);
                if (bVar != null) {
                    g(this.a, bVar);
                }
            }
            this.a.A0 = motionLayout.J4();
            androidx.constraintlayout.core.widgets.d dVar4 = this.a;
            dVar4.w0.c(dVar4);
            this.b.A0 = motionLayout.J4();
            androidx.constraintlayout.core.widgets.d dVar5 = this.b;
            dVar5.w0.c(dVar5);
            ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    androidx.constraintlayout.core.widgets.d dVar6 = this.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar6.S(dimensionBehaviour);
                    this.b.S(dimensionBehaviour);
                }
                if (layoutParams.height == -2) {
                    androidx.constraintlayout.core.widgets.d dVar7 = this.a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    dVar7.U(dimensionBehaviour2);
                    this.b.U(dimensionBehaviour2);
                }
            }
        }

        public final void f() {
            androidx.constraintlayout.core.widgets.d dVar;
            boolean z;
            MotionLayout motionLayout = MotionLayout.this;
            int i = motionLayout.A;
            int i2 = motionLayout.B;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            motionLayout.r0 = mode;
            motionLayout.s0 = mode2;
            motionLayout.getOptimizationLevel();
            b(i, i2);
            int i3 = 0;
            if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                motionLayout.n0 = this.a.v();
                motionLayout.o0 = this.a.p();
                motionLayout.p0 = this.b.v();
                int p = this.b.p();
                motionLayout.q0 = p;
                motionLayout.m0 = (motionLayout.n0 == motionLayout.p0 && motionLayout.o0 == p) ? false : true;
            }
            int i4 = motionLayout.n0;
            int i5 = motionLayout.o0;
            int i6 = motionLayout.r0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                i4 = (int) ((motionLayout.t0 * (motionLayout.p0 - i4)) + i4);
            }
            int i7 = motionLayout.s0;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i5 = (int) ((motionLayout.t0 * (motionLayout.q0 - i5)) + i5);
            }
            androidx.constraintlayout.core.widgets.d dVar2 = this.a;
            if (dVar2.J0 || this.b.J0) {
                dVar = dVar2;
                z = true;
            } else {
                dVar = dVar2;
                z = false;
            }
            motionLayout.M4(i, i2, i4, i5, z, dVar.K0 || this.b.K0);
            HashMap<View, ea30> hashMap = motionLayout.D;
            int childCount = motionLayout.getChildCount();
            motionLayout.B0.a();
            motionLayout.L = true;
            SparseArray sparseArray = new SparseArray();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = motionLayout.getChildAt(i8);
                sparseArray.put(childAt.getId(), hashMap.get(childAt));
            }
            int width = motionLayout.getWidth();
            int height = motionLayout.getHeight();
            a.b bVar = motionLayout.t.c;
            int i9 = bVar != null ? bVar.p : -1;
            if (i9 != -1) {
                for (int i10 = 0; i10 < childCount; i10++) {
                    ea30 ea30Var = hashMap.get(motionLayout.getChildAt(i10));
                    if (ea30Var != null) {
                        ea30Var.B = i9;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[hashMap.size()];
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                ea30 ea30Var2 = hashMap.get(motionLayout.getChildAt(i12));
                int i13 = ea30Var2.f.l;
                if (i13 != -1) {
                    sparseBooleanArray.put(i13, true);
                    iArr[i11] = ea30Var2.f.l;
                    i11++;
                }
            }
            for (int i14 = 0; i14 < i11; i14++) {
                ea30 ea30Var3 = hashMap.get(motionLayout.findViewById(iArr[i14]));
                if (ea30Var3 != null) {
                    motionLayout.t.e(ea30Var3);
                    motionLayout.getNanoTime();
                    ea30Var3.g(width, height);
                }
            }
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = motionLayout.getChildAt(i15);
                ea30 ea30Var4 = hashMap.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && ea30Var4 != null) {
                    motionLayout.t.e(ea30Var4);
                    motionLayout.getNanoTime();
                    ea30Var4.g(width, height);
                }
            }
            a.b bVar2 = motionLayout.t.c;
            float f = bVar2 != null ? bVar2.i : 0.0f;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                boolean z2 = ((double) f) < ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                float abs = Math.abs(f);
                float f2 = -3.4028235E38f;
                float f3 = Float.MAX_VALUE;
                float f4 = -3.4028235E38f;
                float f5 = Float.MAX_VALUE;
                for (int i16 = 0; i16 < childCount; i16++) {
                    ea30 ea30Var5 = hashMap.get(motionLayout.getChildAt(i16));
                    if (!Float.isNaN(ea30Var5.l)) {
                        for (int i17 = 0; i17 < childCount; i17++) {
                            ea30 ea30Var6 = hashMap.get(motionLayout.getChildAt(i17));
                            if (!Float.isNaN(ea30Var6.l)) {
                                f3 = Math.min(f3, ea30Var6.l);
                                f2 = Math.max(f2, ea30Var6.l);
                            }
                        }
                        while (i3 < childCount) {
                            ea30 ea30Var7 = hashMap.get(motionLayout.getChildAt(i3));
                            if (!Float.isNaN(ea30Var7.l)) {
                                ea30Var7.n = 1.0f / (1.0f - abs);
                                if (z2) {
                                    ea30Var7.m = abs - (((f2 - ea30Var7.l) / (f2 - f3)) * abs);
                                } else {
                                    ea30Var7.m = abs - (((ea30Var7.l - f3) * abs) / (f2 - f3));
                                }
                            }
                            i3++;
                        }
                        return;
                    }
                    fb30 fb30Var = ea30Var5.g;
                    float f6 = fb30Var.f;
                    float f7 = fb30Var.g;
                    float f8 = z2 ? f7 - f6 : f7 + f6;
                    f5 = Math.min(f5, f8);
                    f4 = Math.max(f4, f8);
                }
                while (i3 < childCount) {
                    ea30 ea30Var8 = hashMap.get(motionLayout.getChildAt(i3));
                    fb30 fb30Var2 = ea30Var8.g;
                    float f9 = fb30Var2.f;
                    float f10 = fb30Var2.g;
                    float f11 = z2 ? f10 - f9 : f10 + f9;
                    ea30Var8.n = 1.0f / (1.0f - abs);
                    ea30Var8.m = abs - (((f11 - f5) * abs) / (f4 - f5));
                    i3++;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void g(androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.b bVar) {
            b.a aVar;
            b.a aVar2;
            SparseArray<ConstraintWidget> sparseArray = new SparseArray<>();
            c.a aVar3 = new c.a();
            sparseArray.clear();
            sparseArray.put(0, dVar);
            MotionLayout motionLayout = MotionLayout.this;
            sparseArray.put(motionLayout.getId(), dVar);
            if (bVar != null && bVar.c != 0) {
                androidx.constraintlayout.core.widgets.d dVar2 = this.b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
                boolean z = MotionLayout.H0;
                motionLayout.N4(dVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator<ConstraintWidget> it = dVar.v0.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                next.k0 = true;
                sparseArray.put(((View) next.i0).getId(), next);
            }
            Iterator<ConstraintWidget> it2 = dVar.v0.iterator();
            while (it2.hasNext()) {
                ConstraintWidget next2 = it2.next();
                View view = (View) next2.i0;
                int id = view.getId();
                HashMap<Integer, b.a> hashMap = bVar.f;
                if (hashMap.containsKey(Integer.valueOf(id)) && (aVar2 = hashMap.get(Integer.valueOf(id))) != null) {
                    aVar2.a(aVar3);
                }
                next2.W(bVar.u(view.getId()).e.c);
                next2.R(bVar.u(view.getId()).e.d);
                if (view instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar4 = (androidx.constraintlayout.widget.a) view;
                    int id2 = aVar4.getId();
                    HashMap<Integer, b.a> hashMap2 = bVar.f;
                    if (hashMap2.containsKey(Integer.valueOf(id2)) && (aVar = hashMap2.get(Integer.valueOf(id2))) != null && (next2 instanceof e2v)) {
                        aVar4.o(aVar, (e2v) next2, aVar3, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).t();
                    }
                }
                aVar3.resolveLayoutDirection(motionLayout.getLayoutDirection());
                boolean z2 = MotionLayout.H0;
                motionLayout.F4(false, view, next2, aVar3, sparseArray);
                if (bVar.u(view.getId()).c.c == 1) {
                    next2.j0 = view.getVisibility();
                } else {
                    next2.j0 = bVar.u(view.getId()).c.b;
                }
            }
            Iterator<ConstraintWidget> it3 = dVar.v0.iterator();
            while (it3.hasNext()) {
                ConstraintWidget next3 = it3.next();
                if (next3 instanceof androidx.constraintlayout.core.widgets.i) {
                    androidx.constraintlayout.widget.a aVar5 = (androidx.constraintlayout.widget.a) next3.i0;
                    a2v a2vVar = (a2v) next3;
                    aVar5.s(a2vVar, sparseArray);
                    androidx.constraintlayout.core.widgets.i iVar = (androidx.constraintlayout.core.widgets.i) a2vVar;
                    for (int i = 0; i < iVar.w0; i++) {
                        ConstraintWidget constraintWidget = iVar.v0[i];
                        if (constraintWidget != null) {
                            constraintWidget.H = true;
                        }
                    }
                }
            }
        }
    }

    public static class g {
        public static final g b = new g();
        public VelocityTracker a;
    }

    public class h {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;

        public h() {
        }

        public final void a() {
            int i = this.c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    motionLayout.k5(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        motionLayout.g5(i);
                    } else {
                        motionLayout.h5(i, i2);
                    }
                }
                motionLayout.setState(j.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                motionLayout.setProgress(this.a);
            } else {
                motionLayout.f5(this.a, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
            }
        }
    }

    public interface i {
        void a(int i, int i2);

        void b(float f, int i, int i2);

        void c(int i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class j {
        private static final /* synthetic */ j[] $VALUES;
        public static final j FINISHED;
        public static final j MOVING;
        public static final j SETUP;
        public static final j UNDEFINED;

        static {
            j jVar = new j("UNDEFINED", 0);
            UNDEFINED = jVar;
            j jVar2 = new j("SETUP", 1);
            SETUP = jVar2;
            j jVar3 = new j("MOVING", 2);
            MOVING = jVar3;
            j jVar4 = new j("FINISHED", 3);
            FINISHED = jVar4;
            $VALUES = new j[]{jVar, jVar2, jVar3, jVar4};
        }

        public j() {
            throw null;
        }

        public static j valueOf(String str) {
            return (j) Enum.valueOf(j.class, str);
        }

        public static j[] values() {
            return (j[]) $VALUES.clone();
        }
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.v = null;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = 0;
        this.B = 0;
        this.C = true;
        this.D = new HashMap<>();
        this.E = 0L;
        this.F = 1.0f;
        this.G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.J = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.L = false;
        this.N = 0;
        this.P = false;
        this.Q = new bgl0();
        this.R = new d();
        this.V = false;
        this.d0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = -1L;
        this.j0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.k0 = 0;
        this.l0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.m0 = false;
        this.u0 = new nt8(8);
        this.v0 = false;
        this.x0 = null;
        new HashMap();
        this.y0 = new Rect();
        this.z0 = false;
        this.A0 = j.UNDEFINED;
        this.B0 = new f();
        this.C0 = false;
        this.D0 = new RectF();
        this.E0 = null;
        this.F0 = null;
        this.G0 = new ArrayList<>();
        b5(attributeSet);
    }

    public static Rect P4(MotionLayout motionLayout, ConstraintWidget constraintWidget) {
        Rect rect = motionLayout.y0;
        rect.top = constraintWidget.x();
        rect.left = constraintWidget.w();
        rect.right = constraintWidget.v() + rect.left;
        rect.bottom = constraintWidget.p() + rect.top;
        return rect;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void L4(int i2) {
        this.l = null;
    }

    public final void Q4(float f2) {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        float f3 = this.H;
        float f4 = this.G;
        if (f3 != f4 && this.K) {
            this.H = f4;
        }
        float f5 = this.H;
        if (f5 == f2) {
            return;
        }
        this.P = false;
        this.J = f2;
        this.F = (aVar.c != null ? r3.h : aVar.j) / 1000.0f;
        setProgress(f2);
        this.u = null;
        this.v = this.t.d();
        this.K = false;
        this.E = getNanoTime();
        this.L = true;
        this.G = f5;
        this.H = f5;
        invalidate();
    }

    public final void T4(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ea30 ea30Var = this.D.get(getChildAt(i2));
            if (ea30Var != null && "button".equals(n2l.d(ea30Var.b)) && ea30Var.A != null) {
                int i3 = 0;
                while (true) {
                    fey[] feyVarArr = ea30Var.A;
                    if (i3 < feyVarArr.length) {
                        feyVarArr[i3].i(ea30Var.b, z ? -100.0f : 100.0f);
                        i3++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U4(boolean z) {
        boolean z2;
        char c2;
        int childCount;
        Interpolator interpolator;
        int i2;
        int i3;
        boolean z3;
        if (this.I == -1) {
            this.I = getNanoTime();
        }
        float f2 = this.H;
        if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 < 1.0f) {
            this.y = -1;
        }
        boolean z4 = false;
        if (this.d0 || (this.L && (z || this.J != f2))) {
            float signum = Math.signum(this.J - f2);
            long nanoTime = getNanoTime();
            ma30 ma30Var = this.u;
            float f3 = ma30Var == null ? (((nanoTime - this.I) * signum) * 1.0E-9f) / this.F : 0.0f;
            float f4 = this.H + f3;
            if (this.K) {
                f4 = this.J;
            }
            if ((signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 < this.J) && (signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 > this.J)) {
                z2 = false;
            } else {
                f4 = this.J;
                this.L = false;
                z2 = true;
            }
            this.H = f4;
            this.G = f4;
            this.I = nanoTime;
            if (ma30Var == null || z2) {
                this.w = f3;
            } else if (this.P) {
                float interpolation = ma30Var.getInterpolation((nanoTime - this.E) * 1.0E-9f);
                ma30 ma30Var2 = this.u;
                bgl0 bgl0Var = this.Q;
                c2 = ma30Var2 == bgl0Var ? bgl0Var.c.b() ? (char) 2 : (char) 1 : (char) 0;
                this.H = interpolation;
                this.I = nanoTime;
                ma30 ma30Var3 = this.u;
                if (ma30Var3 != null) {
                    float a2 = ma30Var3.a();
                    this.w = a2;
                    if (Math.abs(a2) * this.F <= 1.0E-5f && c2 == 2) {
                        this.L = false;
                    }
                    if (a2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && interpolation >= 1.0f) {
                        this.H = 1.0f;
                        this.L = false;
                        interpolation = 1.0f;
                    }
                    if (a2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && interpolation <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        this.L = false;
                        f4 = 0.0f;
                        if (Math.abs(this.w) > 1.0E-5f) {
                            setState(j.MOVING);
                        }
                        if (c2 != 1) {
                            if ((signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= this.J) || (signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= this.J)) {
                                f4 = this.J;
                                this.L = false;
                            }
                            if (f4 >= 1.0f || f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                this.L = false;
                                setState(j.FINISHED);
                            }
                        }
                        childCount = getChildCount();
                        this.d0 = false;
                        long nanoTime2 = getNanoTime();
                        this.t0 = f4;
                        Interpolator interpolator2 = this.v;
                        float interpolation2 = interpolator2 == null ? f4 : interpolator2.getInterpolation(f4);
                        interpolator = this.v;
                        if (interpolator != null) {
                            float interpolation3 = interpolator.getInterpolation((signum / this.F) + f4);
                            this.w = interpolation3;
                            this.w = interpolation3 - this.v.getInterpolation(f4);
                        }
                        for (i2 = 0; i2 < childCount; i2++) {
                            View childAt = getChildAt(i2);
                            ea30 ea30Var = this.D.get(childAt);
                            if (ea30Var != null) {
                                this.d0 = ea30Var.d(interpolation2, nanoTime2, childAt, this.u0) | this.d0;
                            }
                        }
                        boolean z5 = (signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= this.J) || (signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= this.J);
                        if (!this.d0 && !this.L && z5) {
                            setState(j.FINISHED);
                        }
                        if (this.m0) {
                            requestLayout();
                        }
                        this.d0 = (!z5) | this.d0;
                        if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i3 = this.x) != -1 && this.y != i3) {
                            this.y = i3;
                            this.t.b(i3).a(this);
                            setState(j.FINISHED);
                            z4 = true;
                        }
                        if (f4 >= 1.0d) {
                            int i4 = this.y;
                            int i5 = this.z;
                            if (i4 != i5) {
                                this.y = i5;
                                this.t.b(i5).a(this);
                                setState(j.FINISHED);
                                z4 = true;
                            }
                        }
                        if (!this.d0 || this.L) {
                            invalidate();
                        } else if ((signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == 1.0f) || (signum < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                            setState(j.FINISHED);
                        }
                        if (!this.d0 && !this.L && ((signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == 1.0f) || (signum < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))) {
                            c5();
                        }
                    }
                }
                f4 = interpolation;
                if (Math.abs(this.w) > 1.0E-5f) {
                }
                if (c2 != 1) {
                }
                childCount = getChildCount();
                this.d0 = false;
                long nanoTime22 = getNanoTime();
                this.t0 = f4;
                Interpolator interpolator22 = this.v;
                if (interpolator22 == null) {
                }
                interpolator = this.v;
                if (interpolator != null) {
                }
                while (i2 < childCount) {
                }
                if (signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
                if (!this.d0) {
                    setState(j.FINISHED);
                }
                if (this.m0) {
                }
                this.d0 = (!z5) | this.d0;
                if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.y = i3;
                    this.t.b(i3).a(this);
                    setState(j.FINISHED);
                    z4 = true;
                }
                if (f4 >= 1.0d) {
                }
                if (this.d0) {
                }
                invalidate();
                if (!this.d0) {
                    c5();
                }
            } else {
                float interpolation4 = ma30Var.getInterpolation(f4);
                ma30 ma30Var4 = this.u;
                if (ma30Var4 != null) {
                    this.w = ma30Var4.a();
                } else {
                    this.w = ((ma30Var4.getInterpolation(f4 + f3) - interpolation4) * signum) / f3;
                }
                f4 = interpolation4;
            }
            c2 = 0;
            if (Math.abs(this.w) > 1.0E-5f) {
            }
            if (c2 != 1) {
            }
            childCount = getChildCount();
            this.d0 = false;
            long nanoTime222 = getNanoTime();
            this.t0 = f4;
            Interpolator interpolator222 = this.v;
            if (interpolator222 == null) {
            }
            interpolator = this.v;
            if (interpolator != null) {
            }
            while (i2 < childCount) {
            }
            if (signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            if (!this.d0) {
            }
            if (this.m0) {
            }
            this.d0 = (!z5) | this.d0;
            if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            if (f4 >= 1.0d) {
            }
            if (this.d0) {
            }
            invalidate();
            if (!this.d0) {
            }
        }
        float f5 = this.H;
        if (f5 < 1.0f) {
            if (f5 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                int i6 = this.y;
                int i7 = this.x;
                z3 = i6 == i7 ? z4 : true;
                this.y = i7;
            }
            this.C0 |= z4;
            if (z4 && !this.v0) {
                requestLayout();
            }
            this.G = this.H;
        }
        int i8 = this.y;
        int i9 = this.z;
        z3 = i8 == i9 ? z4 : true;
        this.y = i9;
        z4 = z3;
        this.C0 |= z4;
        if (z4) {
            requestLayout();
        }
        this.G = this.H;
    }

    public final void V4() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.M == null && ((copyOnWriteArrayList = this.g0) == null || copyOnWriteArrayList.isEmpty())) || this.l0 == this.G) {
            return;
        }
        if (this.k0 != -1) {
            i iVar = this.M;
            if (iVar != null) {
                iVar.a(this.x, this.z);
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.g0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().a(this.x, this.z);
                }
            }
        }
        this.k0 = -1;
        float f2 = this.G;
        this.l0 = f2;
        i iVar2 = this.M;
        if (iVar2 != null) {
            iVar2.b(f2, this.x, this.z);
        }
        CopyOnWriteArrayList<i> copyOnWriteArrayList3 = this.g0;
        if (copyOnWriteArrayList3 != null) {
            Iterator<i> it2 = copyOnWriteArrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().b(this.G, this.x, this.z);
            }
        }
    }

    public final void X4() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if ((this.M != null || ((copyOnWriteArrayList = this.g0) != null && !copyOnWriteArrayList.isEmpty())) && this.k0 == -1) {
            this.k0 = this.y;
            ArrayList<Integer> arrayList = this.G0;
            int intValue = !arrayList.isEmpty() ? ((Integer) xy9.b(1, arrayList)).intValue() : -1;
            int i2 = this.y;
            if (intValue != i2 && i2 != -1) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        d5();
        he6 he6Var = this.x0;
        if (he6Var != null) {
            he6Var.run();
        }
    }

    public final void Y4(int i2, float f2, float f3, float f4, float[] fArr) {
        double[] dArr;
        View G4 = G4(i2);
        ea30 ea30Var = this.D.get(G4);
        if (ea30Var == null) {
            if (G4 == null) {
                return;
            }
            G4.getContext().getResources().getResourceName(i2);
            return;
        }
        float[] fArr2 = ea30Var.v;
        float a2 = ea30Var.a(fArr2, f2);
        emk[] emkVarArr = ea30Var.j;
        int i3 = 0;
        if (emkVarArr != null) {
            double d2 = a2;
            emkVarArr[0].e(d2, ea30Var.q);
            ea30Var.j[0].c(d2, ea30Var.p);
            float f5 = fArr2[0];
            while (true) {
                dArr = ea30Var.q;
                if (i3 >= dArr.length) {
                    break;
                }
                dArr[i3] = dArr[i3] * f5;
                i3++;
            }
            bg3 bg3Var = ea30Var.k;
            if (bg3Var != null) {
                double[] dArr2 = ea30Var.p;
                if (dArr2.length > 0) {
                    bg3Var.c(d2, dArr2);
                    ea30Var.k.e(d2, ea30Var.q);
                    fb30 fb30Var = ea30Var.f;
                    int[] iArr = ea30Var.o;
                    double[] dArr3 = ea30Var.q;
                    double[] dArr4 = ea30Var.p;
                    fb30Var.getClass();
                    fb30.e(f3, f4, fArr, iArr, dArr3, dArr4);
                }
            } else {
                fb30 fb30Var2 = ea30Var.f;
                int[] iArr2 = ea30Var.o;
                double[] dArr5 = ea30Var.p;
                fb30Var2.getClass();
                fb30.e(f3, f4, fArr, iArr2, dArr, dArr5);
            }
        } else {
            fb30 fb30Var3 = ea30Var.g;
            float f6 = fb30Var3.f;
            fb30 fb30Var4 = ea30Var.f;
            float f7 = f6 - fb30Var4.f;
            float f8 = fb30Var3.g - fb30Var4.g;
            float f9 = fb30Var3.h - fb30Var4.h;
            float f10 = (fb30Var3.i - fb30Var4.i) + f8;
            fArr[0] = ((f9 + f7) * f3) + ((1.0f - f3) * f7);
            fArr[1] = (f10 * f4) + ((1.0f - f4) * f8);
        }
        G4.getY();
    }

    public final androidx.constraintlayout.widget.b Z4(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            return null;
        }
        return aVar.b(i2);
    }

    @Override // xsna.u160
    public void a2(@NonNull View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.V || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.V = false;
    }

    public final boolean a5(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        boolean onTouchEvent;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (a5((r3.getLeft() + f2) - view.getScrollX(), (r3.getTop() + f3) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            RectF rectF = this.D0;
            rectF.set(f2, f3, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f3) - view.getTop());
            if (motionEvent.getAction() != 0 || rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                float f4 = -f2;
                float f5 = -f3;
                Matrix matrix = view.getMatrix();
                if (matrix.isIdentity()) {
                    motionEvent.offsetLocation(f4, f5);
                    onTouchEvent = view.onTouchEvent(motionEvent);
                    motionEvent.offsetLocation(-f4, -f5);
                } else {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(f4, f5);
                    if (this.F0 == null) {
                        this.F0 = new Matrix();
                    }
                    matrix.invert(this.F0);
                    obtain.transform(this.F0);
                    onTouchEvent = view.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (onTouchEvent) {
                    return true;
                }
            }
        }
        return z;
    }

    public final void b5(AttributeSet attributeSet) {
        androidx.constraintlayout.motion.widget.a aVar;
        H0 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.t = new androidx.constraintlayout.motion.widget.a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == 1) {
                    this.y = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == 4) {
                    this.J = obtainStyledAttributes.getFloat(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.L = true;
                } else if (index == 0) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == 5) {
                    if (this.N == 0) {
                        this.N = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == 3) {
                    this.N = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.t == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.t = null;
            }
        }
        if (this.N != 0) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.t;
            if (aVar2 == null) {
                Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            } else {
                int g2 = aVar2.g();
                androidx.constraintlayout.motion.widget.a aVar3 = this.t;
                androidx.constraintlayout.widget.b b2 = aVar3.b(aVar3.g());
                n2l.c(g2, getContext());
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (b2.v(childAt.getId()) == null) {
                        n2l.d(childAt);
                    }
                }
                Integer[] numArr = (Integer[]) b2.f.keySet().toArray(new Integer[0]);
                int length = numArr.length;
                int[] iArr = new int[length];
                for (int i4 = 0; i4 < length; i4++) {
                    iArr[i4] = numArr[i4].intValue();
                }
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr[i5];
                    n2l.c(i6, getContext());
                    findViewById(iArr[i5]);
                    int i7 = b2.u(i6).e.d;
                    int i8 = b2.u(i6).e.c;
                }
                SparseIntArray sparseIntArray = new SparseIntArray();
                SparseIntArray sparseIntArray2 = new SparseIntArray();
                Iterator<a.b> it = this.t.d.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    a.b bVar = this.t.c;
                    if (next.d == next.c) {
                        Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
                    }
                    int i9 = next.d;
                    int i10 = next.c;
                    String c2 = n2l.c(i9, getContext());
                    String c3 = n2l.c(i10, getContext());
                    if (sparseIntArray.get(i9) == i10) {
                        Log.e("MotionLayout", "CHECK: two transitions with the same start and end " + c2 + "->" + c3);
                    }
                    if (sparseIntArray2.get(i10) == i9) {
                        Log.e("MotionLayout", "CHECK: you can't have reverse transitions" + c2 + "->" + c3);
                    }
                    sparseIntArray.put(i9, i10);
                    sparseIntArray2.put(i10, i9);
                    if (this.t.b(i9) == null) {
                        Log.e("MotionLayout", " no such constraintSetStart " + c2);
                    }
                    if (this.t.b(i10) == null) {
                        Log.e("MotionLayout", " no such constraintSetEnd " + c2);
                    }
                }
            }
        }
        if (this.y != -1 || (aVar = this.t) == null) {
            return;
        }
        this.y = aVar.g();
        this.x = this.t.g();
        a.b bVar2 = this.t.c;
        this.z = bVar2 != null ? bVar2.c : -1;
    }

    @Override // xsna.t160
    public void c0(int i2, @NonNull View view) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null) {
            float f2 = this.c0;
            float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            float f4 = this.W / f2;
            float f5 = this.a0 / f2;
            a.b bVar2 = aVar.c;
            if (bVar2 == null || (bVar = bVar2.l) == null) {
                return;
            }
            bVar.m = false;
            MotionLayout motionLayout = bVar.r;
            float progress = motionLayout.getProgress();
            bVar.r.Y4(bVar.d, progress, bVar.h, bVar.g, bVar.n);
            float f6 = bVar.k;
            float[] fArr = bVar.n;
            float f7 = f6 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (f4 * f6) / fArr[0] : (f5 * bVar.l) / fArr[1];
            if (!Float.isNaN(f7)) {
                progress += f7 / 3.0f;
            }
            if (progress != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                boolean z = progress != 1.0f;
                int i3 = bVar.c;
                if ((i3 != 3) && z) {
                    if (progress >= 0.5d) {
                        f3 = 1.0f;
                    }
                    motionLayout.i5(f3, f7, i3);
                }
            }
        }
    }

    public final void c5() {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        View view;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            return;
        }
        if (aVar.a(this.y, this)) {
            requestLayout();
            return;
        }
        int i2 = this.y;
        if (i2 != -1) {
            androidx.constraintlayout.motion.widget.a aVar2 = this.t;
            ArrayList<a.b> arrayList = aVar2.f;
            ArrayList<a.b> arrayList2 = aVar2.d;
            Iterator<a.b> it = arrayList2.iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                if (next.m.size() > 0) {
                    Iterator<a.b.ViewOnClickListenerC0019a> it2 = next.m.iterator();
                    while (it2.hasNext()) {
                        it2.next().b(this);
                    }
                }
            }
            Iterator<a.b> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                a.b next2 = it3.next();
                if (next2.m.size() > 0) {
                    Iterator<a.b.ViewOnClickListenerC0019a> it4 = next2.m.iterator();
                    while (it4.hasNext()) {
                        it4.next().b(this);
                    }
                }
            }
            Iterator<a.b> it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                a.b next3 = it5.next();
                if (next3.m.size() > 0) {
                    Iterator<a.b.ViewOnClickListenerC0019a> it6 = next3.m.iterator();
                    while (it6.hasNext()) {
                        it6.next().a(this, i2, next3);
                    }
                }
            }
            Iterator<a.b> it7 = arrayList.iterator();
            while (it7.hasNext()) {
                a.b next4 = it7.next();
                if (next4.m.size() > 0) {
                    Iterator<a.b.ViewOnClickListenerC0019a> it8 = next4.m.iterator();
                    while (it8.hasNext()) {
                        it8.next().a(this, i2, next4);
                    }
                }
            }
        }
        if (!this.t.p() || (bVar = this.t.c) == null || (bVar2 = bVar.l) == null) {
            return;
        }
        MotionLayout motionLayout = bVar2.r;
        int i3 = bVar2.d;
        if (i3 != -1) {
            view = motionLayout.findViewById(i3);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + n2l.c(bVar2.d, motionLayout.getContext()));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new gdp0());
            nestedScrollView.setOnScrollChangeListener(new hdp0());
        }
    }

    public final void d5() {
        CopyOnWriteArrayList<i> copyOnWriteArrayList;
        if (this.M == null && ((copyOnWriteArrayList = this.g0) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        ArrayList<Integer> arrayList = this.G0;
        Iterator<Integer> it = arrayList.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            i iVar = this.M;
            if (iVar != null) {
                iVar.c(next.intValue());
            }
            CopyOnWriteArrayList<i> copyOnWriteArrayList2 = this.g0;
            if (copyOnWriteArrayList2 != null) {
                Iterator<i> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().c(next.intValue());
                }
            }
        }
        arrayList.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0370  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        Iterator<ea30> it;
        ArrayList<fb30> arrayList;
        int i2;
        e eVar;
        int i3;
        int i4;
        Paint paint;
        Paint paint2;
        int i5;
        int i6;
        ea30 ea30Var;
        e eVar2;
        int i7;
        Paint paint3;
        guo guoVar;
        Iterator<fb30> it2;
        double d2;
        bg3 bg3Var;
        Paint paint4;
        String resourceEntryName;
        androidx.constraintlayout.motion.widget.e eVar3;
        U4(false);
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null && (eVar3 = aVar.q) != null) {
            ArrayList<d.a> arrayList2 = eVar3.f;
            ArrayList<d.a> arrayList3 = eVar3.e;
            if (arrayList3 != null) {
                Iterator<d.a> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    it3.next().a();
                }
                eVar3.e.removeAll(arrayList2);
                arrayList2.clear();
                if (eVar3.e.isEmpty()) {
                    eVar3.e = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.t == null) {
            return;
        }
        if ((this.N & 1) == 1 && !isInEditMode()) {
            this.h0++;
            long nanoTime = getNanoTime();
            long j2 = this.i0;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.j0 = ((int) ((this.h0 / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.h0 = 0;
                    this.i0 = nanoTime;
                }
            } else {
                this.i0 = nanoTime;
            }
            Paint paint5 = new Paint();
            paint5.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.j0);
            sb.append(" fps ");
            int i8 = this.x;
            StringBuilder e2 = fw3.e(i5s.a(sb, i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8), " -> "));
            int i9 = this.z;
            e2.append(i9 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i9));
            e2.append(" (progress: ");
            e2.append(progress);
            e2.append(" ) state=");
            int i10 = this.y;
            if (i10 == -1) {
                resourceEntryName = StringUtils.UNDEFINED;
            } else {
                resourceEntryName = i10 != -1 ? getContext().getResources().getResourceEntryName(i10) : "UNDEFINED";
            }
            e2.append(resourceEntryName);
            String sb2 = e2.toString();
            paint5.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint5);
            paint5.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint5);
        }
        if (this.N > 1) {
            if (this.O == null) {
                this.O = new e();
            }
            e eVar4 = this.O;
            androidx.constraintlayout.motion.widget.a aVar2 = this.t;
            a.b bVar = aVar2.c;
            int i11 = bVar != null ? bVar.h : aVar2.j;
            int i12 = this.N;
            Paint paint6 = eVar4.g;
            Paint paint7 = eVar4.f;
            Paint paint8 = eVar4.i;
            int i13 = eVar4.m;
            Paint paint9 = eVar4.e;
            MotionLayout motionLayout = MotionLayout.this;
            HashMap<View, ea30> hashMap = this.D;
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            canvas.save();
            if (!motionLayout.isInEditMode() && (i12 & 1) == 2) {
                String str = motionLayout.getContext().getResources().getResourceName(motionLayout.z) + StringUtils.PROCESS_POSTFIX_DELIMITER + motionLayout.getProgress();
                canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, eVar4.h);
                canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint9);
            }
            Iterator<ea30> it4 = hashMap.values().iterator();
            while (it4.hasNext()) {
                ea30 next = it4.next();
                fb30 fb30Var = next.f;
                ArrayList<fb30> arrayList4 = next.u;
                int i14 = fb30Var.c;
                Iterator<fb30> it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    i14 = Math.max(i14, it5.next().c);
                }
                int max = Math.max(i14, next.g.c);
                if (i12 > 0 && max == 0) {
                    max = 1;
                }
                if (max != 0) {
                    float[] fArr = eVar4.c;
                    int[] iArr = eVar4.b;
                    if (fArr != null) {
                        it = it4;
                        double[] f2 = next.j[0].f();
                        if (iArr != null) {
                            Iterator<fb30> it6 = arrayList4.iterator();
                            int i15 = 0;
                            while (it6.hasNext()) {
                                iArr[i15] = it6.next().p;
                                i15++;
                                arrayList4 = arrayList4;
                            }
                        }
                        arrayList = arrayList4;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < f2.length) {
                            int i18 = i16;
                            float[] fArr2 = fArr;
                            double[] dArr = f2;
                            next.j[0].c(f2[i18], next.p);
                            next.f.c(dArr[i18], next.o, next.p, fArr2, i17);
                            i17 += 2;
                            i16 = i18 + 1;
                            fArr = fArr2;
                            f2 = dArr;
                        }
                        i2 = i17 / 2;
                    } else {
                        it = it4;
                        arrayList = arrayList4;
                        i2 = 0;
                    }
                    eVar4.k = i2;
                    if (max >= 1) {
                        int i19 = i11 / 16;
                        float[] fArr3 = eVar4.a;
                        if (fArr3 == null || fArr3.length != i19 * 2) {
                            eVar4.a = new float[i19 * 2];
                            eVar4.d = new Path();
                        }
                        float f3 = i13;
                        canvas.translate(f3, f3);
                        paint9.setColor(1996488704);
                        paint8.setColor(1996488704);
                        paint7.setColor(1996488704);
                        paint6.setColor(1996488704);
                        float[] fArr4 = eVar4.a;
                        float f4 = 1.0f / (i19 - 1);
                        float f5 = 1.0f;
                        HashMap<String, w0u0> hashMap2 = next.y;
                        w0u0 w0u0Var = hashMap2 == null ? null : hashMap2.get("translationX");
                        HashMap<String, w0u0> hashMap3 = next.y;
                        i3 = i11;
                        w0u0 w0u0Var2 = hashMap3 == null ? null : hashMap3.get("translationY");
                        i4 = i12;
                        HashMap<String, dzt0> hashMap4 = next.z;
                        dzt0 dzt0Var = hashMap4 == null ? null : hashMap4.get("translationX");
                        HashMap<String, dzt0> hashMap5 = next.z;
                        dzt0 dzt0Var2 = hashMap5 == null ? null : hashMap5.get("translationY");
                        int i20 = 0;
                        while (true) {
                            float f6 = Float.NaN;
                            i6 = i13;
                            if (i20 >= i19) {
                                break;
                            }
                            float f7 = i20 * f4;
                            int i21 = i19;
                            float f8 = next.n;
                            if (f8 != f5) {
                                float f9 = next.m;
                                if (f7 < f9) {
                                    f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                                if (f7 > f9) {
                                    i7 = i20;
                                    paint3 = paint6;
                                    if (f7 < 1.0d) {
                                        f7 = Math.min((f7 - f9) * f8, f5);
                                        double d3 = f7;
                                        guoVar = fb30Var.b;
                                        it2 = arrayList.iterator();
                                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        while (it2.hasNext()) {
                                            double d4 = d3;
                                            fb30 next2 = it2.next();
                                            guo guoVar2 = next2.b;
                                            if (guoVar2 != null) {
                                                float f11 = next2.d;
                                                if (f11 < f7) {
                                                    f10 = f11;
                                                    guoVar = guoVar2;
                                                } else if (Float.isNaN(f6)) {
                                                    f6 = next2.d;
                                                }
                                            }
                                            d3 = d4;
                                        }
                                        double d5 = d3;
                                        if (guoVar != null) {
                                            if (Float.isNaN(f6)) {
                                                f6 = 1.0f;
                                            }
                                            d2 = (((float) guoVar.a((f7 - f10) / r21)) * (f6 - f10)) + f10;
                                        } else {
                                            d2 = d5;
                                        }
                                        fb30 fb30Var2 = fb30Var;
                                        next.j[0].c(d2, next.p);
                                        bg3Var = next.k;
                                        if (bg3Var != null) {
                                            double[] dArr2 = next.p;
                                            paint4 = paint8;
                                            if (dArr2.length > 0) {
                                                bg3Var.c(d2, dArr2);
                                            }
                                        } else {
                                            paint4 = paint8;
                                        }
                                        int i22 = i7 * 2;
                                        next.f.c(d2, next.o, next.p, fArr4, i22);
                                        if (dzt0Var != null) {
                                            fArr4[i22] = dzt0Var.a(f7) + fArr4[i22];
                                        } else if (w0u0Var != null) {
                                            fArr4[i22] = w0u0Var.a(f7) + fArr4[i22];
                                        }
                                        if (dzt0Var2 != null) {
                                            int i23 = i22 + 1;
                                            fArr4[i23] = dzt0Var2.a(f7) + fArr4[i23];
                                        } else if (w0u0Var2 != null) {
                                            int i24 = i22 + 1;
                                            fArr4[i24] = w0u0Var2.a(f7) + fArr4[i24];
                                        }
                                        i20 = i7 + 1;
                                        i13 = i6;
                                        i19 = i21;
                                        paint6 = paint3;
                                        fb30Var = fb30Var2;
                                        paint8 = paint4;
                                        f5 = 1.0f;
                                    }
                                    double d32 = f7;
                                    guoVar = fb30Var.b;
                                    it2 = arrayList.iterator();
                                    float f102 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    while (it2.hasNext()) {
                                    }
                                    double d52 = d32;
                                    if (guoVar != null) {
                                    }
                                    fb30 fb30Var22 = fb30Var;
                                    next.j[0].c(d2, next.p);
                                    bg3Var = next.k;
                                    if (bg3Var != null) {
                                    }
                                    int i222 = i7 * 2;
                                    next.f.c(d2, next.o, next.p, fArr4, i222);
                                    if (dzt0Var != null) {
                                    }
                                    if (dzt0Var2 != null) {
                                    }
                                    i20 = i7 + 1;
                                    i13 = i6;
                                    i19 = i21;
                                    paint6 = paint3;
                                    fb30Var = fb30Var22;
                                    paint8 = paint4;
                                    f5 = 1.0f;
                                }
                            }
                            i7 = i20;
                            paint3 = paint6;
                            double d322 = f7;
                            guoVar = fb30Var.b;
                            it2 = arrayList.iterator();
                            float f1022 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            while (it2.hasNext()) {
                            }
                            double d522 = d322;
                            if (guoVar != null) {
                            }
                            fb30 fb30Var222 = fb30Var;
                            next.j[0].c(d2, next.p);
                            bg3Var = next.k;
                            if (bg3Var != null) {
                            }
                            int i2222 = i7 * 2;
                            next.f.c(d2, next.o, next.p, fArr4, i2222);
                            if (dzt0Var != null) {
                            }
                            if (dzt0Var2 != null) {
                            }
                            i20 = i7 + 1;
                            i13 = i6;
                            i19 = i21;
                            paint6 = paint3;
                            fb30Var = fb30Var222;
                            paint8 = paint4;
                            f5 = 1.0f;
                        }
                        fb30 fb30Var3 = fb30Var;
                        eVar4.a(canvas, max, eVar4.k, next);
                        paint9.setColor(-21965);
                        paint7.setColor(-2067046);
                        Paint paint10 = paint8;
                        paint10.setColor(-2067046);
                        paint = paint6;
                        paint.setColor(-13391360);
                        int i25 = i6;
                        float f12 = -i25;
                        canvas.translate(f12, f12);
                        eVar4.a(canvas, max, eVar4.k, next);
                        char c2 = 5;
                        if (max == 5) {
                            float[] fArr5 = eVar4.j;
                            eVar4.d.reset();
                            int i26 = 0;
                            while (i26 <= 50) {
                                char c3 = c2;
                                int i27 = i26;
                                next.j[0].c(next.a(null, i26 / 50), next.p);
                                int[] iArr2 = next.o;
                                double[] dArr3 = next.p;
                                fb30 fb30Var4 = fb30Var3;
                                float f13 = fb30Var4.f;
                                float f14 = fb30Var4.g;
                                float f15 = fb30Var4.h;
                                float f16 = fb30Var4.i;
                                float[] fArr6 = fArr5;
                                int i28 = i25;
                                int i29 = 0;
                                while (true) {
                                    ea30Var = next;
                                    if (i29 >= iArr2.length) {
                                        break;
                                    }
                                    Paint paint11 = paint10;
                                    float f17 = (float) dArr3[i29];
                                    int i30 = iArr2[i29];
                                    if (i30 == 1) {
                                        f13 = f17;
                                    } else if (i30 == 2) {
                                        f14 = f17;
                                    } else if (i30 == 3) {
                                        f15 = f17;
                                    } else if (i30 == 4) {
                                        f16 = f17;
                                    }
                                    i29++;
                                    next = ea30Var;
                                    paint10 = paint11;
                                }
                                Paint paint12 = paint10;
                                if (fb30Var4.n != null) {
                                    double d6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    double d7 = f13;
                                    eVar2 = eVar4;
                                    double d8 = f14;
                                    f13 = (float) (((Math.sin(d8) * d7) + d6) - (f15 / 2.0f));
                                    f14 = (float) ((d6 - (Math.cos(d8) * d7)) - (f16 / 2.0f));
                                } else {
                                    eVar2 = eVar4;
                                }
                                float f18 = f15 + f13;
                                float f19 = f16 + f14;
                                Float.isNaN(Float.NaN);
                                Float.isNaN(Float.NaN);
                                float f20 = f13 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                float f21 = f14 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                float f22 = f18 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                float f23 = f19 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                fArr6[0] = f20;
                                fArr6[1] = f21;
                                fArr6[2] = f22;
                                fArr6[3] = f21;
                                fArr6[4] = f22;
                                fArr6[c3] = f23;
                                fArr6[6] = f20;
                                fArr6[7] = f23;
                                eVar2.d.moveTo(f20, f21);
                                eVar2.d.lineTo(fArr6[2], fArr6[3]);
                                eVar2.d.lineTo(fArr6[4], fArr6[c3]);
                                eVar2.d.lineTo(fArr6[6], fArr6[7]);
                                eVar2.d.close();
                                i26 = i27 + 1;
                                eVar4 = eVar2;
                                fb30Var3 = fb30Var4;
                                c2 = c3;
                                fArr5 = fArr6;
                                next = ea30Var;
                                i25 = i28;
                                paint10 = paint12;
                            }
                            i5 = i25;
                            eVar = eVar4;
                            paint2 = paint10;
                            paint9.setColor(1140850688);
                            canvas.translate(2.0f, 2.0f);
                            canvas.drawPath(eVar.d, paint9);
                            canvas.translate(-2.0f, -2.0f);
                            paint9.setColor(-65536);
                            canvas.drawPath(eVar.d, paint9);
                            eVar4 = eVar;
                            paint6 = paint;
                            it4 = it;
                            i11 = i3;
                            i12 = i4;
                            i13 = i5;
                            paint8 = paint2;
                        } else {
                            i5 = i25;
                            eVar = eVar4;
                            paint2 = paint10;
                        }
                    } else {
                        eVar = eVar4;
                        i3 = i11;
                        i4 = i12;
                        paint = paint6;
                        paint2 = paint8;
                        i5 = i13;
                    }
                    eVar4 = eVar;
                    paint6 = paint;
                    it4 = it;
                    i11 = i3;
                    i12 = i4;
                    i13 = i5;
                    paint8 = paint2;
                }
            }
            canvas.restore();
        }
    }

    public final void e5() {
        this.B0.f();
        invalidate();
    }

    public final void f5(float f2, float f3) {
        if (!super.isAttachedToWindow()) {
            if (this.w0 == null) {
                this.w0 = new h();
            }
            h hVar = this.w0;
            hVar.a = f2;
            hVar.b = f3;
            return;
        }
        setProgress(f2);
        setState(j.MOVING);
        this.w = f3;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f4 = 1.0f;
            }
            Q4(f4);
        } else {
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 == 1.0f) {
                return;
            }
            if (f2 > 0.5f) {
                f4 = 1.0f;
            }
            Q4(f4);
        }
    }

    public final void g5(int i2) {
        setState(j.SETUP);
        this.y = i2;
        this.x = -1;
        this.z = -1;
        d6j d6jVar = this.l;
        if (d6jVar == null) {
            androidx.constraintlayout.motion.widget.a aVar = this.t;
            if (aVar != null) {
                aVar.b(i2).b(this);
                return;
            }
            return;
        }
        float f2 = -1;
        ConstraintLayout constraintLayout = d6jVar.a;
        SparseArray<d6j.a> sparseArray = d6jVar.d;
        int i3 = d6jVar.b;
        int i4 = 0;
        if (i3 != i2) {
            d6jVar.b = i2;
            d6j.a aVar2 = sparseArray.get(i2);
            ArrayList<d6j.b> arrayList = aVar2.b;
            while (true) {
                if (i4 >= arrayList.size()) {
                    i4 = -1;
                    break;
                } else if (arrayList.get(i4).a(f2, f2)) {
                    break;
                } else {
                    i4++;
                }
            }
            ArrayList<d6j.b> arrayList2 = aVar2.b;
            androidx.constraintlayout.widget.b bVar = i4 == -1 ? aVar2.d : arrayList2.get(i4).f;
            if (i4 != -1) {
                int i5 = arrayList2.get(i4).e;
            }
            if (bVar == null) {
                return;
            }
            d6jVar.c = i4;
            bVar.b(constraintLayout);
            return;
        }
        d6j.a valueAt = i2 == -1 ? sparseArray.valueAt(0) : sparseArray.get(i3);
        int i6 = d6jVar.c;
        if (i6 == -1 || !valueAt.b.get(i6).a(f2, f2)) {
            ArrayList<d6j.b> arrayList3 = valueAt.b;
            while (true) {
                if (i4 >= arrayList3.size()) {
                    i4 = -1;
                    break;
                } else if (arrayList3.get(i4).a(f2, f2)) {
                    break;
                } else {
                    i4++;
                }
            }
            ArrayList<d6j.b> arrayList4 = valueAt.b;
            if (d6jVar.c == i4) {
                return;
            }
            androidx.constraintlayout.widget.b bVar2 = i4 == -1 ? null : arrayList4.get(i4).f;
            if (i4 != -1) {
                int i7 = arrayList4.get(i4).e;
            }
            if (bVar2 == null) {
                return;
            }
            d6jVar.c = i4;
            bVar2.b(constraintLayout);
        }
    }

    public int[] getConstraintSetIds() {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            return null;
        }
        SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar.g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.y;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            return null;
        }
        return aVar.d;
    }

    public c4m getDesignTool() {
        if (this.S == null) {
            this.S = new c4m();
        }
        return this.S;
    }

    public int getEndState() {
        return this.z;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.H;
    }

    public androidx.constraintlayout.motion.widget.a getScene() {
        return this.t;
    }

    public int getStartState() {
        return this.x;
    }

    public float getTargetPosition() {
        return this.J;
    }

    public Bundle getTransitionState() {
        if (this.w0 == null) {
            this.w0 = new h();
        }
        h hVar = this.w0;
        MotionLayout motionLayout = MotionLayout.this;
        hVar.d = motionLayout.z;
        hVar.c = motionLayout.x;
        hVar.b = motionLayout.getVelocity();
        hVar.a = motionLayout.getProgress();
        h hVar2 = this.w0;
        hVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", hVar2.a);
        bundle.putFloat("motion.velocity", hVar2.b);
        bundle.putInt("motion.StartState", hVar2.c);
        bundle.putInt("motion.EndState", hVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null) {
            this.F = (aVar.c != null ? r2.h : aVar.j) / 1000.0f;
        }
        return (long) (this.F * 1000.0f);
    }

    public float getVelocity() {
        return this.w;
    }

    @Override // xsna.t160
    public boolean h4(@NonNull View view, @NonNull View view2, int i2, int i3) {
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        return (aVar == null || (bVar = aVar.c) == null || (bVar2 = bVar.l) == null || (bVar2.w & 2) != 0) ? false : true;
    }

    public final void h5(int i2, int i3) {
        if (!super.isAttachedToWindow()) {
            if (this.w0 == null) {
                this.w0 = new h();
            }
            h hVar = this.w0;
            hVar.c = i2;
            hVar.d = i3;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null) {
            this.x = i2;
            this.z = i3;
            aVar.o(i2, i3);
            this.B0.e(this.t.b(i2), this.t.b(i3));
            e5();
            this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Q4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (r20 != 7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0066, code lost:
    
        if ((((r19 * r5) - (((r2 * r5) * r5) / 2.0f)) + r1) > 1.0f) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0088, code lost:
    
        r2 = r17.H;
        r5 = r17.F;
        r6 = r17.t.f();
        r1 = r17.t.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0096, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0098, code lost:
    
        r1 = r1.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x009a, code lost:
    
        if (r1 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009c, code lost:
    
        r7 = r1.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00a1, code lost:
    
        r17.Q.b(r2, r3, r19, r5, r6, r7);
        r17.w = com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        r1 = r17.y;
        r17.J = r3;
        r17.y = r1;
        r17.u = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a0, code lost:
    
        r7 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0076, code lost:
    
        r1 = r17.H;
        r2 = r17.t.f();
        r8.a = r19;
        r8.b = r1;
        r8.c = r2;
        r17.u = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0074, code lost:
    
        if ((((((r2 * r5) * r5) / 2.0f) + (r19 * r5)) + r1) < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i5(float f2, float f3, int i2) {
        float f4;
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        androidx.constraintlayout.motion.widget.b bVar6;
        androidx.constraintlayout.motion.widget.b bVar7;
        float f5 = f2;
        if (this.t == null || this.H == f5) {
            return;
        }
        this.P = true;
        this.E = getNanoTime();
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        a.b bVar8 = aVar.c;
        float f6 = (bVar8 != null ? bVar8.h : aVar.j) / 1000.0f;
        this.F = f6;
        this.J = f5;
        this.L = true;
        bgl0 bgl0Var = this.Q;
        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            f4 = 1.0f;
            d dVar = this.R;
            if (i2 == 4) {
                float f8 = this.H;
                float f9 = aVar.f();
                dVar.a = f3;
                dVar.b = f8;
                dVar.c = f9;
                this.u = dVar;
            } else if (i2 == 5) {
                float f10 = this.H;
                float f11 = aVar.f();
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f12 = f3 / f11;
                } else {
                    float f13 = (-f3) / f11;
                }
            } else if (i2 != 6) {
            }
            this.K = false;
            this.E = getNanoTime();
            invalidate();
        }
        f4 = 1.0f;
        if (i2 == 1 || i2 == 7) {
            f5 = 0.0f;
        } else if (i2 == 2 || i2 == 6) {
            f5 = f4;
        }
        if (((bVar8 == null || (bVar7 = bVar8.l) == null) ? 0 : bVar7.D) == 0) {
            float f14 = this.H;
            float f15 = aVar.f();
            a.b bVar9 = this.t.c;
            if (bVar9 != null && (bVar6 = bVar9.l) != null) {
                f7 = bVar6.s;
            }
            this.Q.b(f14, f5, f3, f6, f15, f7);
        } else {
            float f16 = this.H;
            float f17 = (bVar8 == null || (bVar5 = bVar8.l) == null) ? 0.0f : bVar5.z;
            float f18 = (bVar8 == null || (bVar4 = bVar8.l) == null) ? 0.0f : bVar4.A;
            float f19 = (bVar8 == null || (bVar3 = bVar8.l) == null) ? 0.0f : bVar3.y;
            float f20 = (bVar8 == null || (bVar2 = bVar8.l) == null) ? 0.0f : bVar2.B;
            int i3 = (bVar8 == null || (bVar = bVar8.l) == null) ? 0 : bVar.C;
            if (bgl0Var.b == null) {
                ymk0 ymk0Var = new ymk0();
                ymk0Var.a = 0.5d;
                ymk0Var.i = 0;
                bgl0Var.b = ymk0Var;
            }
            ymk0 ymk0Var2 = bgl0Var.b;
            bgl0Var.c = ymk0Var2;
            ymk0Var2.c = f5;
            ymk0Var2.a = f19;
            ymk0Var2.e = f16;
            ymk0Var2.b = f18;
            ymk0Var2.g = f17;
            ymk0Var2.h = f20;
            ymk0Var2.i = i3;
            ymk0Var2.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i4 = this.y;
        this.J = f5;
        this.y = i4;
        this.u = bgl0Var;
        this.K = false;
        this.E = getNanoTime();
        invalidate();
    }

    public final void j5() {
        Q4(1.0f);
        this.x0 = null;
    }

    public void k5(int i2) {
        ruk0 ruk0Var;
        if (!super.isAttachedToWindow()) {
            if (this.w0 == null) {
                this.w0 = new h();
            }
            this.w0.d = i2;
            return;
        }
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null && (ruk0Var = aVar.b) != null) {
            int i3 = this.y;
            float f2 = -1;
            ruk0.a aVar2 = ruk0Var.b.get(i2);
            if (aVar2 == null) {
                i3 = i2;
            } else {
                ArrayList<ruk0.b> arrayList = aVar2.b;
                int i4 = aVar2.c;
                if (f2 != -1.0f && f2 != -1.0f) {
                    Iterator<ruk0.b> it = arrayList.iterator();
                    ruk0.b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            ruk0.b next = it.next();
                            if (next.a(f2, f2)) {
                                if (i3 == next.e) {
                                    break;
                                } else {
                                    bVar = next;
                                }
                            }
                        } else if (bVar != null) {
                            i3 = bVar.e;
                        }
                    }
                } else if (i4 != i3) {
                    Iterator<ruk0.b> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i3 == it2.next().e) {
                            break;
                        }
                    }
                    i3 = i4;
                }
            }
            if (i3 != -1) {
                i2 = i3;
            }
        }
        int i5 = this.y;
        if (i5 == i2) {
            return;
        }
        if (this.x == i2) {
            Q4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            return;
        }
        if (this.z == i2) {
            Q4(1.0f);
            return;
        }
        this.z = i2;
        if (i5 != -1) {
            h5(i5, i2);
            Q4(1.0f);
            this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            j5();
            return;
        }
        this.P = false;
        this.J = 1.0f;
        this.G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.I = getNanoTime();
        this.E = getNanoTime();
        this.K = false;
        this.u = null;
        androidx.constraintlayout.motion.widget.a aVar3 = this.t;
        this.F = (aVar3.c != null ? r6.h : aVar3.j) / 1000.0f;
        this.x = -1;
        aVar3.o(-1, this.z);
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        HashMap<View, ea30> hashMap = this.D;
        hashMap.clear();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            hashMap.put(childAt, new ea30(childAt));
            sparseArray.put(childAt.getId(), hashMap.get(childAt));
        }
        this.L = true;
        androidx.constraintlayout.widget.b b2 = this.t.b(i2);
        f fVar = this.B0;
        fVar.e(null, b2);
        e5();
        fVar.a();
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            View childAt2 = getChildAt(i7);
            ea30 ea30Var = hashMap.get(childAt2);
            if (ea30Var != null) {
                fb30 fb30Var = ea30Var.f;
                fb30Var.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                fb30Var.e = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                fb30Var.d(childAt2.getX(), childAt2.getY(), childAt2.getWidth(), childAt2.getHeight());
                ca30 ca30Var = ea30Var.h;
                ca30Var.getClass();
                childAt2.getX();
                childAt2.getY();
                childAt2.getWidth();
                childAt2.getHeight();
                ca30Var.b(childAt2);
            }
        }
        int width = getWidth();
        int height = getHeight();
        for (int i8 = 0; i8 < childCount; i8++) {
            ea30 ea30Var2 = hashMap.get(getChildAt(i8));
            if (ea30Var2 != null) {
                this.t.e(ea30Var2);
                getNanoTime();
                ea30Var2.g(width, height);
            }
        }
        a.b bVar2 = this.t.c;
        float f3 = bVar2 != null ? bVar2.i : 0.0f;
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            for (int i9 = 0; i9 < childCount; i9++) {
                fb30 fb30Var2 = hashMap.get(getChildAt(i9)).g;
                float f6 = fb30Var2.g + fb30Var2.f;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                ea30 ea30Var3 = hashMap.get(getChildAt(i10));
                fb30 fb30Var3 = ea30Var3.g;
                float f7 = fb30Var3.f;
                float f8 = fb30Var3.g;
                ea30Var3.n = 1.0f / (1.0f - f3);
                ea30Var3.m = f3 - ((((f7 + f8) - f4) * f3) / (f5 - f4));
            }
        }
        this.G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.L = true;
        invalidate();
    }

    @Override // xsna.t160
    public final void l0(@NonNull View view, @NonNull View view2, int i2, int i3) {
        this.b0 = getNanoTime();
        this.c0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.W = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void l5(int i2, androidx.constraintlayout.widget.b bVar) {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null) {
            aVar.g.put(i2, bVar);
        }
        this.B0.e(this.t.b(this.x), this.t.b(this.z));
        e5();
        if (this.y == i2) {
            bVar.b(this);
        }
    }

    public final void m5(int i2, androidx.constraintlayout.widget.b bVar, int i3) {
        if (this.t != null && this.y == i2) {
            l5(R.id.view_transition, Z4(i2));
            g5(R.id.view_transition);
            l5(i2, bVar);
            a.b bVar2 = new a.b(-1, this.t, R.id.view_transition, i2);
            bVar2.b(i3);
            setTransition(bVar2);
            j5();
        }
    }

    public final void n5(int i2, View... viewArr) {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            Log.e("MotionLayout", " no motionScene");
            return;
        }
        androidx.constraintlayout.motion.widget.e eVar = aVar.q;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.constraintlayout.motion.widget.d> it = eVar.b.iterator();
        androidx.constraintlayout.motion.widget.d dVar = null;
        while (it.hasNext()) {
            androidx.constraintlayout.motion.widget.d next = it.next();
            if (next.a == i2) {
                for (View view : viewArr) {
                    if (next.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    dVar = next;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = eVar.a;
                    int currentState = motionLayout.getCurrentState();
                    if (next.e != 2) {
                        if (currentState == -1) {
                            motionLayout.toString();
                        } else {
                            androidx.constraintlayout.widget.b Z4 = motionLayout.Z4(currentState);
                            if (Z4 != null) {
                                dVar = next;
                                dVar.a(eVar, eVar.a, currentState, Z4, viewArr2);
                            }
                        }
                        dVar = next;
                    } else {
                        dVar = next;
                        dVar.a(eVar, eVar.a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (dVar == null) {
            Log.e(eVar.d, " Could not find ViewTransition");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        a.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null && (i2 = this.y) != -1) {
            androidx.constraintlayout.widget.b b2 = aVar.b(i2);
            androidx.constraintlayout.motion.widget.a aVar2 = this.t;
            SparseArray<androidx.constraintlayout.widget.b> sparseArray = aVar2.g;
            loop0: for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                int keyAt = sparseArray.keyAt(i3);
                SparseIntArray sparseIntArray = aVar2.i;
                int i4 = sparseIntArray.get(keyAt);
                int size = sparseIntArray.size();
                while (i4 > 0) {
                    if (i4 != keyAt) {
                        int i5 = size - 1;
                        if (size >= 0) {
                            i4 = sparseIntArray.get(i4);
                            size = i5;
                        }
                    }
                    Log.e("MotionScene", "Cannot be derived from yourself");
                    break loop0;
                }
                aVar2.n(keyAt, this);
            }
            if (b2 != null) {
                b2.b(this);
            }
            this.x = this.y;
        }
        c5();
        h hVar = this.w0;
        if (hVar != null) {
            if (this.z0) {
                post(new b());
                return;
            } else {
                hVar.a();
                return;
            }
        }
        androidx.constraintlayout.motion.widget.a aVar3 = this.t;
        if (aVar3 == null || (bVar = aVar3.c) == null || bVar.n != 4) {
            return;
        }
        j5();
        setState(j.SETUP);
        setState(j.MOVING);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00eb  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        a.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        int i2;
        RectF b2;
        Iterator<View> it;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null || !this.C) {
            return false;
        }
        androidx.constraintlayout.motion.widget.e eVar = aVar.q;
        if (eVar != null) {
            ArrayList<androidx.constraintlayout.motion.widget.d> arrayList = eVar.b;
            MotionLayout motionLayout = eVar.a;
            int currentState = motionLayout.getCurrentState();
            if (currentState != -1) {
                if (eVar.c == null) {
                    eVar.c = new HashSet<>();
                    Iterator<androidx.constraintlayout.motion.widget.d> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        androidx.constraintlayout.motion.widget.d next = it2.next();
                        int childCount = motionLayout.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt = motionLayout.getChildAt(i3);
                            if (next.c(childAt)) {
                                childAt.getId();
                                eVar.c.add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<d.a> arrayList2 = eVar.e;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator<d.a> it3 = eVar.e.iterator();
                    while (it3.hasNext()) {
                        d.a next2 = it3.next();
                        Rect rect2 = next2.l;
                        if (action != 1) {
                            if (action == 2) {
                                next2.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !next2.h) {
                                    next2.b();
                                }
                            }
                        } else if (!next2.h) {
                            next2.b();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.widget.b Z4 = motionLayout.Z4(currentState);
                    Iterator<androidx.constraintlayout.motion.widget.d> it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        androidx.constraintlayout.motion.widget.d next3 = it4.next();
                        int i4 = next3.b;
                        if (i4 == 1) {
                            if (action == 0) {
                                it = eVar.c.iterator();
                                while (it.hasNext()) {
                                    View next4 = it.next();
                                    if (next3.c(next4)) {
                                        next4.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            next3.a(eVar, eVar.a, currentState, Z4, next4);
                                        }
                                    }
                                }
                            }
                        } else if (i4 == 2) {
                            if (action == 1) {
                                it = eVar.c.iterator();
                                while (it.hasNext()) {
                                }
                            }
                        } else if (i4 == 3 && action == 0) {
                            it = eVar.c.iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                bVar = this.t.c;
                if (bVar != null || bVar.o || (bVar2 = bVar.l) == null) {
                    return z;
                }
                if ((motionEvent.getAction() == 0 && (b2 = bVar2.b(this, new RectF())) != null && !b2.contains(motionEvent.getX(), motionEvent.getY())) || (i2 = bVar2.e) == -1) {
                    return z;
                }
                View view = this.E0;
                if (view == null || view.getId() != i2) {
                    this.E0 = findViewById(i2);
                }
                View view2 = this.E0;
                if (view2 == null) {
                    return z;
                }
                float left = view2.getLeft();
                float top = this.E0.getTop();
                float right = this.E0.getRight();
                float bottom = this.E0.getBottom();
                RectF rectF = this.D0;
                rectF.set(left, top, right, bottom);
                return (!rectF.contains(motionEvent.getX(), motionEvent.getY()) || a5((float) this.E0.getLeft(), (float) this.E0.getTop(), this.E0, motionEvent)) ? z : onTouchEvent(motionEvent);
            }
        }
        z = false;
        bVar = this.t.c;
        return bVar != null ? z : z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        MotionLayout motionLayout;
        this.v0 = true;
        try {
            if (this.t == null) {
                super.onLayout(z, i2, i3, i4, i5);
                this.v0 = false;
                return;
            }
            motionLayout = this;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            try {
                if (motionLayout.T == i6) {
                    if (motionLayout.U != i7) {
                    }
                    motionLayout.T = i6;
                    motionLayout.U = i7;
                    motionLayout.v0 = false;
                }
                e5();
                U4(true);
                motionLayout.T = i6;
                motionLayout.U = i7;
                motionLayout.v0 = false;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                motionLayout.v0 = false;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            motionLayout = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        boolean z;
        if (this.t == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.A == i2 && this.B == i3) ? false : true;
        if (this.C0) {
            this.C0 = false;
            c5();
            d5();
            z3 = true;
        }
        if (this.i) {
            z3 = true;
        }
        this.A = i2;
        this.B = i3;
        int g2 = this.t.g();
        a.b bVar = this.t.c;
        int i4 = bVar == null ? -1 : bVar.c;
        f fVar = this.B0;
        if ((!z3 && g2 == fVar.e && i4 == fVar.f) || this.x == -1) {
            if (z3) {
                super.onMeasure(i2, i3);
            }
            z = true;
        } else {
            super.onMeasure(i2, i3);
            fVar.e(this.t.b(g2), this.t.b(i4));
            fVar.f();
            fVar.e = g2;
            fVar.f = i4;
            z = false;
        }
        if (this.m0 || z) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingRight = getPaddingRight() + getPaddingLeft();
            androidx.constraintlayout.core.widgets.d dVar = this.d;
            int v = dVar.v() + paddingRight;
            int p = dVar.p() + paddingBottom;
            int i5 = this.r0;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                v = (int) ((this.t0 * (this.p0 - r2)) + this.n0);
                requestLayout();
            }
            int i6 = this.s0;
            if (i6 == Integer.MIN_VALUE || i6 == 0) {
                p = (int) ((this.t0 * (this.q0 - r1)) + this.o0);
                requestLayout();
            }
            setMeasuredDimension(v, p);
        }
        float signum = Math.signum(this.J - this.H);
        long nanoTime = getNanoTime();
        ma30 ma30Var = this.u;
        float f2 = this.H + (!(ma30Var instanceof bgl0) ? (((nanoTime - this.I) * signum) * 1.0E-9f) / this.F : 0.0f);
        if (this.K) {
            f2 = this.J;
        }
        if ((signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 < this.J) && (signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 > this.J)) {
            z2 = false;
        } else {
            f2 = this.J;
        }
        if (ma30Var != null && !z2) {
            f2 = this.P ? ma30Var.getInterpolation((nanoTime - this.E) * 1.0E-9f) : ma30Var.getInterpolation(f2);
        }
        if ((signum > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 >= this.J) || (signum <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= this.J)) {
            f2 = this.J;
        }
        this.t0 = f2;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator = this.v;
        if (interpolator != null) {
            f2 = interpolator.getInterpolation(f2);
        }
        float f3 = f2;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            ea30 ea30Var = this.D.get(childAt);
            if (ea30Var != null) {
                ea30Var.d(f3, nanoTime2, childAt, this.u0);
            }
        }
        if (this.m0) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(@NonNull View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null) {
            boolean J4 = J4();
            aVar.p = J4;
            a.b bVar2 = aVar.c;
            if (bVar2 == null || (bVar = bVar2.l) == null) {
                return;
            }
            bVar.c(J4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07b0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        g gVar;
        g gVar2;
        androidx.constraintlayout.motion.widget.b bVar;
        char c2;
        char c3;
        int i2;
        char c4;
        char c5;
        float right;
        float f2;
        int top;
        int bottom;
        int i3;
        float f3;
        float f4;
        int i4;
        boolean z;
        float[] fArr;
        float f5;
        ?? r20;
        a.b bVar2;
        MotionEvent motionEvent2;
        a.b bVar3;
        float f6;
        float f7;
        MotionEvent motionEvent3;
        RectF a2;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null || !this.C || !aVar.p()) {
            return super.onTouchEvent(motionEvent);
        }
        androidx.constraintlayout.motion.widget.a aVar2 = this.t;
        a.b bVar4 = aVar2.c;
        if (bVar4 != null && bVar4.o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        MotionLayout motionLayout = aVar2.a;
        RectF rectF = new RectF();
        if (aVar2.o == null) {
            motionLayout.getClass();
            VelocityTracker obtain = VelocityTracker.obtain();
            g gVar3 = g.b;
            gVar3.a = obtain;
            aVar2.o = gVar3;
        }
        VelocityTracker velocityTracker = aVar2.o.a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                aVar2.r = motionEvent.getRawX();
                aVar2.s = motionEvent.getRawY();
                aVar2.l = motionEvent;
                aVar2.m = false;
                androidx.constraintlayout.motion.widget.b bVar5 = aVar2.c.l;
                if (bVar5 != null) {
                    RectF a3 = bVar5.a(motionLayout, rectF);
                    if (a3 == null || a3.contains(aVar2.l.getX(), aVar2.l.getY())) {
                        RectF b2 = aVar2.c.l.b(motionLayout, rectF);
                        if (b2 == null || b2.contains(aVar2.l.getX(), aVar2.l.getY())) {
                            aVar2.n = false;
                        } else {
                            aVar2.n = true;
                        }
                        androidx.constraintlayout.motion.widget.b bVar6 = aVar2.c.l;
                        float f8 = aVar2.r;
                        float f9 = aVar2.s;
                        bVar6.p = f8;
                        bVar6.q = f9;
                    } else {
                        aVar2.l = null;
                        aVar2.m = true;
                    }
                }
            } else if (action == 2 && !aVar2.m) {
                float rawY = motionEvent.getRawY() - aVar2.s;
                float rawX = motionEvent.getRawX() - aVar2.r;
                if ((rawX != ConnectivityTracker.DEFAULT_UPLINK_BITRATE || rawY != ConnectivityTracker.DEFAULT_UPLINK_BITRATE) && (motionEvent2 = aVar2.l) != null) {
                    if (currentState != -1) {
                        ArrayList i5 = aVar2.i(currentState);
                        RectF rectF2 = new RectF();
                        Iterator it = i5.iterator();
                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        a.b bVar7 = null;
                        while (it.hasNext()) {
                            a.b bVar8 = (a.b) it.next();
                            if (!bVar8.o) {
                                androidx.constraintlayout.motion.widget.b bVar9 = bVar8.l;
                                if (bVar9 != null) {
                                    bVar9.c(aVar2.p);
                                    RectF b3 = bVar8.l.b(motionLayout, rectF2);
                                    if ((b3 == null || b3.contains(motionEvent2.getX(), motionEvent2.getY())) && ((a2 = bVar8.l.a(motionLayout, rectF2)) == null || a2.contains(motionEvent2.getX(), motionEvent2.getY()))) {
                                        androidx.constraintlayout.motion.widget.b bVar10 = bVar8.l;
                                        float f11 = (bVar10.l * rawY) + (bVar10.k * rawX);
                                        if (bVar10.j) {
                                            float x = motionEvent2.getX();
                                            bVar8.l.getClass();
                                            float y = motionEvent2.getY();
                                            bVar8.l.getClass();
                                            f6 = rawY;
                                            f7 = rawX;
                                            motionEvent3 = motionEvent2;
                                            f11 = ((float) (Math.atan2(rawY + r9, rawX + r7) - Math.atan2(x - 0.5f, y - 0.5f))) * 10.0f;
                                        } else {
                                            f6 = rawY;
                                            f7 = rawX;
                                            motionEvent3 = motionEvent2;
                                        }
                                        float f12 = f11 * (bVar8.c == currentState ? -1.0f : 1.1f);
                                        if (f12 > f10) {
                                            f10 = f12;
                                            bVar7 = bVar8;
                                        }
                                    }
                                } else {
                                    f6 = rawY;
                                    f7 = rawX;
                                    motionEvent3 = motionEvent2;
                                }
                                rawY = f6;
                                rawX = f7;
                                motionEvent2 = motionEvent3;
                            }
                        }
                        bVar3 = bVar7;
                    } else {
                        bVar3 = aVar2.c;
                    }
                    if (bVar3 != null) {
                        setTransition(bVar3);
                        RectF b4 = aVar2.c.l.b(motionLayout, rectF);
                        aVar2.n = (b4 == null || b4.contains(aVar2.l.getX(), aVar2.l.getY())) ? false : true;
                        androidx.constraintlayout.motion.widget.b bVar11 = aVar2.c.l;
                        float f13 = aVar2.r;
                        float f14 = aVar2.s;
                        bVar11.p = f13;
                        bVar11.q = f14;
                        bVar11.m = false;
                    }
                }
            }
            bVar2 = this.t.c;
            if ((bVar2.r & 4) == 0) {
                return bVar2.l.m;
            }
            return true;
        }
        if (!aVar2.m) {
            a.b bVar12 = aVar2.c;
            if (bVar12 != null && (bVar = bVar12.l) != null && !aVar2.n) {
                g gVar4 = aVar2.o;
                float[] fArr2 = bVar.n;
                MotionLayout motionLayout2 = bVar.r;
                if (bVar.j) {
                    int[] iArr = bVar.o;
                    VelocityTracker velocityTracker2 = gVar4.a;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                    int action2 = motionEvent.getAction();
                    if (action2 == 0) {
                        bVar.p = motionEvent.getRawX();
                        bVar.q = motionEvent.getRawY();
                        bVar.m = false;
                    } else if (action2 == 1) {
                        bVar.m = false;
                        VelocityTracker velocityTracker3 = gVar4.a;
                        if (velocityTracker3 != null) {
                            velocityTracker3.computeCurrentVelocity(16);
                        }
                        VelocityTracker velocityTracker4 = gVar4.a;
                        float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        VelocityTracker velocityTracker5 = gVar4.a;
                        float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float progress = motionLayout2.getProgress();
                        float width = motionLayout2.getWidth() / 2.0f;
                        float height = motionLayout2.getHeight() / 2.0f;
                        int i6 = bVar.i;
                        if (i6 != -1) {
                            View findViewById = motionLayout2.findViewById(i6);
                            motionLayout2.getLocationOnScreen(iArr);
                            right = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                            f2 = iArr[1];
                            top = findViewById.getTop();
                            bottom = findViewById.getBottom();
                        } else {
                            int i7 = bVar.d;
                            if (i7 != -1) {
                                View findViewById2 = motionLayout2.findViewById(motionLayout2.D.get(motionLayout2.findViewById(i7)).f.l);
                                motionLayout2.getLocationOnScreen(iArr);
                                right = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                f2 = iArr[1];
                                top = findViewById2.getTop();
                                bottom = findViewById2.getBottom();
                            }
                            float rawX2 = motionEvent.getRawX() - width;
                            double degrees = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX2));
                            i3 = bVar.d;
                            if (i3 == -1) {
                                f3 = 3.0f;
                                bVar.r.Y4(i3, progress, bVar.h, bVar.g, bVar.n);
                                fArr2[1] = (float) Math.toDegrees(fArr2[1]);
                            } else {
                                f3 = 3.0f;
                                fArr2[1] = 360.0f;
                            }
                            float degrees2 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r8, xVelocity + rawX2)) - degrees)) * 62.5f;
                            f4 = Float.isNaN(degrees2) ? (((degrees2 * f3) * bVar.v) / fArr2[1]) + progress : progress;
                            if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 != 1.0f && (i4 = bVar.c) != 3) {
                                float f15 = (degrees2 * bVar.v) / fArr2[1];
                                float f16 = ((double) f4) < 0.5d ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
                                if (i4 == 6) {
                                    if (progress + f15 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        f15 = Math.abs(f15);
                                    }
                                    f16 = 1.0f;
                                }
                                if (bVar.c == 7) {
                                    if (progress + f15 > 1.0f) {
                                        f15 = -Math.abs(f15);
                                    }
                                    f16 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                }
                                motionLayout2.i5(f16, f15 * f3, bVar.c);
                                if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= progress || 1.0f <= progress) {
                                    motionLayout2.setState(j.FINISHED);
                                }
                            } else if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT < f4 || 1.0f <= f4) {
                                motionLayout2.setState(j.FINISHED);
                            }
                        }
                        float f17 = f2 + ((bottom + top) / 2.0f);
                        width = right;
                        height = f17;
                        float rawX22 = motionEvent.getRawX() - width;
                        double degrees3 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height, rawX22));
                        i3 = bVar.d;
                        if (i3 == -1) {
                        }
                        float degrees22 = ((float) (Math.toDegrees(Math.atan2(yVelocity + r8, xVelocity + rawX22)) - degrees3)) * 62.5f;
                        if (Float.isNaN(degrees22)) {
                        }
                        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        }
                        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT < f4) {
                        }
                        motionLayout2.setState(j.FINISHED);
                    } else if (action2 == 2) {
                        motionEvent.getRawY();
                        motionEvent.getRawX();
                        float width2 = motionLayout2.getWidth() / 2.0f;
                        float height2 = motionLayout2.getHeight() / 2.0f;
                        int i8 = bVar.i;
                        if (i8 != -1) {
                            View findViewById3 = motionLayout2.findViewById(i8);
                            motionLayout2.getLocationOnScreen(iArr);
                            float right2 = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                            float bottom2 = iArr[1] + ((findViewById3.getBottom() + findViewById3.getTop()) / 2.0f);
                            width2 = right2;
                            height2 = bottom2;
                        } else {
                            int i9 = bVar.d;
                            if (i9 != -1) {
                                if (motionLayout2.findViewById(motionLayout2.D.get(motionLayout2.findViewById(i9)).f.l) == null) {
                                    Log.e("TouchResponse", "could not find view to animate to");
                                } else {
                                    motionLayout2.getLocationOnScreen(iArr);
                                    width2 = iArr[0] + ((r12.getRight() + r12.getLeft()) / 2.0f);
                                    height2 = ((r12.getBottom() + r12.getTop()) / 2.0f) + iArr[1];
                                }
                            }
                        }
                        float rawX3 = motionEvent.getRawX() - width2;
                        float rawY2 = motionEvent.getRawY() - height2;
                        float atan2 = (float) (((Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2) - Math.atan2(bVar.q - height2, bVar.p - width2)) * 180.0d) / 3.141592653589793d);
                        if (atan2 > 330.0f) {
                            atan2 -= 360.0f;
                        } else if (atan2 < -330.0f) {
                            atan2 += 360.0f;
                        }
                        if (Math.abs(atan2) > 0.01d || bVar.m) {
                            float progress2 = motionLayout2.getProgress();
                            if (bVar.m) {
                                z = true;
                            } else {
                                z = true;
                                bVar.m = true;
                                motionLayout2.setProgress(progress2);
                            }
                            int i10 = bVar.d;
                            if (i10 != -1) {
                                boolean z2 = z;
                                fArr = fArr2;
                                f5 = progress2;
                                bVar.r.Y4(i10, f5, bVar.h, bVar.g, bVar.n);
                                fArr[z2 ? 1 : 0] = (float) Math.toDegrees(fArr[z2 ? 1 : 0]);
                                r20 = z2;
                            } else {
                                fArr = fArr2;
                                f5 = progress2;
                                boolean z3 = z;
                                fArr[z3 ? 1 : 0] = 360.0f;
                                r20 = z3;
                            }
                            float max = Math.max(Math.min(((atan2 * bVar.v) / fArr[r20]) + f5, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            float progress3 = motionLayout2.getProgress();
                            if (max != progress3) {
                                if (progress3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || progress3 == 1.0f) {
                                    motionLayout2.T4(progress3 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                motionLayout2.setProgress(max);
                                VelocityTracker velocityTracker6 = gVar4.a;
                                if (velocityTracker6 != null) {
                                    velocityTracker6.computeCurrentVelocity(1000);
                                }
                                VelocityTracker velocityTracker7 = gVar4.a;
                                float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                VelocityTracker velocityTracker8 = gVar4.a;
                                double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                double d2 = xVelocity2;
                                motionLayout2.w = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d2) - r8) * Math.hypot(yVelocity2, d2)) / Math.hypot(rawX3, rawY2)));
                            } else {
                                motionLayout2.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                            bVar.p = motionEvent.getRawX();
                            bVar.q = motionEvent.getRawY();
                        }
                    }
                } else {
                    VelocityTracker velocityTracker9 = gVar4.a;
                    if (velocityTracker9 != null) {
                        velocityTracker9.addMovement(motionEvent);
                    }
                    int action3 = motionEvent.getAction();
                    if (action3 == 0) {
                        bVar.p = motionEvent.getRawX();
                        bVar.q = motionEvent.getRawY();
                        bVar.m = false;
                    } else if (action3 == 1) {
                        bVar.m = false;
                        VelocityTracker velocityTracker10 = gVar4.a;
                        if (velocityTracker10 != null) {
                            velocityTracker10.computeCurrentVelocity(1000);
                        }
                        VelocityTracker velocityTracker11 = gVar4.a;
                        float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        VelocityTracker velocityTracker12 = gVar4.a;
                        float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float progress4 = motionLayout2.getProgress();
                        int i11 = bVar.d;
                        if (i11 != -1) {
                            bVar.r.Y4(i11, progress4, bVar.h, bVar.g, bVar.n);
                            c2 = 1;
                            c3 = 0;
                        } else {
                            float min = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                            c2 = 1;
                            fArr2[1] = bVar.l * min;
                            c3 = 0;
                            fArr2[0] = min * bVar.k;
                        }
                        float f18 = bVar.k != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? xVelocity3 / fArr2[c3] : yVelocity3 / fArr2[c2];
                        float f19 = !Float.isNaN(f18) ? (f18 / 3.0f) + progress4 : progress4;
                        if (f19 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f19 != 1.0f && (i2 = bVar.c) != 3) {
                            float f20 = ((double) f19) < 0.5d ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f;
                            if (i2 == 6) {
                                if (progress4 + f18 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                    f18 = Math.abs(f18);
                                }
                                f20 = 1.0f;
                            }
                            if (bVar.c == 7) {
                                if (progress4 + f18 > 1.0f) {
                                    f18 = -Math.abs(f18);
                                }
                                f20 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                            motionLayout2.i5(f20, f18, bVar.c);
                            if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= progress4 || 1.0f <= progress4) {
                                motionLayout2.setState(j.FINISHED);
                            }
                        } else if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= f19 || 1.0f <= f19) {
                            motionLayout2.setState(j.FINISHED);
                        }
                    } else if (action3 == 2) {
                        float rawY3 = motionEvent.getRawY() - bVar.q;
                        float rawX4 = motionEvent.getRawX() - bVar.p;
                        if (Math.abs((bVar.l * rawY3) + (bVar.k * rawX4)) > bVar.x || bVar.m) {
                            float progress5 = motionLayout2.getProgress();
                            if (!bVar.m) {
                                bVar.m = true;
                                motionLayout2.setProgress(progress5);
                            }
                            int i12 = bVar.d;
                            if (i12 != -1) {
                                bVar.r.Y4(i12, progress5, bVar.h, bVar.g, bVar.n);
                                c4 = 1;
                                c5 = 0;
                            } else {
                                float min2 = Math.min(motionLayout2.getWidth(), motionLayout2.getHeight());
                                c4 = 1;
                                fArr2[1] = bVar.l * min2;
                                c5 = 0;
                                fArr2[0] = min2 * bVar.k;
                            }
                            if (Math.abs(((bVar.l * fArr2[c4]) + (bVar.k * fArr2[c5])) * bVar.v) < 0.01d) {
                                fArr2[0] = 0.01f;
                                fArr2[c4] = 0.01f;
                            }
                            float max2 = Math.max(Math.min(progress5 + (bVar.k != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? rawX4 / fArr2[0] : rawY3 / fArr2[c4]), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            if (bVar.c == 6) {
                                max2 = Math.max(max2, 0.01f);
                            }
                            if (bVar.c == 7) {
                                max2 = Math.min(max2, 0.99f);
                            }
                            float progress6 = motionLayout2.getProgress();
                            if (max2 != progress6) {
                                if (progress6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || progress6 == 1.0f) {
                                    motionLayout2.T4(progress6 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                }
                                motionLayout2.setProgress(max2);
                                VelocityTracker velocityTracker13 = gVar4.a;
                                if (velocityTracker13 != null) {
                                    velocityTracker13.computeCurrentVelocity(1000);
                                }
                                VelocityTracker velocityTracker14 = gVar4.a;
                                float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                VelocityTracker velocityTracker15 = gVar4.a;
                                motionLayout2.w = bVar.k != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? xVelocity4 / fArr2[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / fArr2[1];
                            } else {
                                motionLayout2.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                            bVar.p = motionEvent.getRawX();
                            bVar.q = motionEvent.getRawY();
                        }
                    }
                }
            }
            aVar2.r = motionEvent.getRawX();
            aVar2.s = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (gVar = aVar2.o) != null) {
                VelocityTracker velocityTracker16 = gVar.a;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    gVar2 = null;
                    gVar.a = null;
                } else {
                    gVar2 = null;
                }
                aVar2.o = gVar2;
                int i13 = this.y;
                if (i13 != -1) {
                    aVar2.a(i13, this);
                }
            }
        }
        bVar2 = this.t.c;
        if ((bVar2.r & 4) == 0) {
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof la30) {
            la30 la30Var = (la30) view;
            if (this.g0 == null) {
                this.g0 = new CopyOnWriteArrayList<>();
            }
            this.g0.add(la30Var);
            if (la30Var.j) {
                if (this.e0 == null) {
                    this.e0 = new ArrayList<>();
                }
                this.e0.add(la30Var);
            }
            if (la30Var.k) {
                if (this.f0 == null) {
                    this.f0 = new ArrayList<>();
                }
                this.f0.add(la30Var);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<la30> arrayList = this.e0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<la30> arrayList2 = this.f0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        androidx.constraintlayout.motion.widget.a aVar;
        a.b bVar;
        if (!this.m0 && this.y == -1 && (aVar = this.t) != null && (bVar = aVar.c) != null) {
            int i2 = bVar.q;
            if (i2 == 0) {
                return;
            }
            if (i2 == 2) {
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    this.D.get(getChildAt(i3)).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    @Override // xsna.t160
    public void s1(@NonNull View view, int i2, int i3, @NonNull int[] iArr, int i4) {
        a.b bVar;
        boolean z;
        float f2;
        float f3;
        boolean z2;
        androidx.constraintlayout.motion.widget.b bVar2;
        float f4;
        androidx.constraintlayout.motion.widget.b bVar3;
        androidx.constraintlayout.motion.widget.b bVar4;
        androidx.constraintlayout.motion.widget.b bVar5;
        int i5;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null || (bVar = aVar.c) == null || (z = bVar.o)) {
            return;
        }
        int i6 = -1;
        if (z || (bVar5 = bVar.l) == null || (i5 = bVar5.e) == -1 || view.getId() == i5) {
            a.b bVar6 = aVar.c;
            if ((bVar6 == null || (bVar4 = bVar6.l) == null) ? false : bVar4.u) {
                androidx.constraintlayout.motion.widget.b bVar7 = bVar.l;
                if (bVar7 != null && (bVar7.w & 4) != 0) {
                    i6 = i3;
                }
                float f5 = this.G;
                if ((f5 == 1.0f || f5 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && view.canScrollVertically(i6)) {
                    return;
                }
            }
            androidx.constraintlayout.motion.widget.b bVar8 = bVar.l;
            if (bVar8 == null || (bVar8.w & 1) == 0) {
                f2 = 1.0f;
                f3 = 0.0f;
            } else {
                float f6 = i2;
                float f7 = i3;
                a.b bVar9 = aVar.c;
                if (bVar9 == null || (bVar3 = bVar9.l) == null) {
                    f2 = 1.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                } else {
                    float[] fArr = bVar3.n;
                    f3 = 0.0f;
                    f2 = 1.0f;
                    bVar3.r.Y4(bVar3.d, bVar3.r.getProgress(), bVar3.h, bVar3.g, bVar3.n);
                    float f8 = bVar3.k;
                    if (f8 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        if (fArr[0] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fArr[0] = 1.0E-7f;
                        }
                        f4 = (f6 * f8) / fArr[0];
                    } else {
                        if (fArr[1] == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            fArr[1] = 1.0E-7f;
                        }
                        f4 = (f7 * bVar3.l) / fArr[1];
                    }
                }
                float f9 = this.H;
                if ((f9 <= f3 && f4 < f3) || (f9 >= f2 && f4 > f3)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new a(view));
                    return;
                }
            }
            float f10 = this.G;
            long nanoTime = getNanoTime();
            float f11 = i2;
            this.W = f11;
            float f12 = i3;
            this.a0 = f12;
            this.c0 = (float) ((nanoTime - this.b0) * 1.0E-9d);
            this.b0 = nanoTime;
            a.b bVar10 = aVar.c;
            if (bVar10 == null || (bVar2 = bVar10.l) == null) {
                z2 = 1;
            } else {
                float[] fArr2 = bVar2.n;
                MotionLayout motionLayout = bVar2.r;
                float progress = motionLayout.getProgress();
                if (!bVar2.m) {
                    bVar2.m = true;
                    motionLayout.setProgress(progress);
                }
                boolean z3 = true;
                bVar2.r.Y4(bVar2.d, progress, bVar2.h, bVar2.g, bVar2.n);
                if (Math.abs((bVar2.l * fArr2[1]) + (bVar2.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f13 = bVar2.k;
                float max = Math.max(Math.min(progress + (f13 != f3 ? (f11 * f13) / fArr2[0] : (f12 * bVar2.l) / fArr2[1]), f2), f3);
                z2 = z3;
                if (max != motionLayout.getProgress()) {
                    motionLayout.setProgress(max);
                    z2 = z3;
                }
            }
            if (f10 != this.G) {
                iArr[0] = i2;
                iArr[z2] = i3;
            }
            U4(false);
            if (iArr[0] == 0 && iArr[z2] == 0) {
                return;
            }
            this.V = z2;
        }
    }

    public void setDebugMode(int i2) {
        this.N = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.z0 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.C = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.t != null) {
            setState(j.MOVING);
            Interpolator d2 = this.t.d();
            if (d2 != null) {
                setProgress(d2.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<la30> arrayList = this.f0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f0.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<la30> arrayList = this.e0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.e0.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i2 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        }
        if (!super.isAttachedToWindow()) {
            if (this.w0 == null) {
                this.w0 = new h();
            }
            this.w0.a = f2;
            return;
        }
        if (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.H == 1.0f && this.y == this.z) {
                setState(j.MOVING);
            }
            this.y = this.x;
            if (this.H == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                setState(j.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.H == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.y == this.x) {
                setState(j.MOVING);
            }
            this.y = this.z;
            if (this.H == 1.0f) {
                setState(j.FINISHED);
            }
        } else {
            this.y = -1;
            setState(j.MOVING);
        }
        if (this.t == null) {
            return;
        }
        this.K = true;
        this.J = f2;
        this.G = f2;
        this.I = -1L;
        this.E = -1L;
        this.u = null;
        this.L = true;
        invalidate();
    }

    public void setScene(androidx.constraintlayout.motion.widget.a aVar) {
        androidx.constraintlayout.motion.widget.b bVar;
        this.t = aVar;
        boolean J4 = J4();
        aVar.p = J4;
        a.b bVar2 = aVar.c;
        if (bVar2 != null && (bVar = bVar2.l) != null) {
            bVar.c(J4);
        }
        e5();
    }

    public void setStartState(int i2) {
        if (super.isAttachedToWindow()) {
            this.y = i2;
            return;
        }
        if (this.w0 == null) {
            this.w0 = new h();
        }
        h hVar = this.w0;
        hVar.c = i2;
        hVar.d = i2;
    }

    public void setState(j jVar) {
        j jVar2 = j.FINISHED;
        if (jVar == jVar2 && this.y == -1) {
            return;
        }
        j jVar3 = this.A0;
        this.A0 = jVar;
        j jVar4 = j.MOVING;
        if (jVar3 == jVar4 && jVar == jVar4) {
            V4();
        }
        int i2 = c.a[jVar3.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3 && jVar == jVar2) {
                X4();
                return;
            }
            return;
        }
        if (jVar == jVar4) {
            V4();
        }
        if (jVar == jVar2) {
            X4();
        }
    }

    public void setTransition(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar != null) {
            a.b h2 = aVar.h(i2);
            this.x = h2.d;
            this.z = h2.c;
            if (!super.isAttachedToWindow()) {
                if (this.w0 == null) {
                    this.w0 = new h();
                }
                h hVar = this.w0;
                hVar.c = this.x;
                hVar.d = this.z;
                return;
            }
            int i3 = this.y;
            float f2 = i3 == this.x ? 0.0f : i3 == this.z ? 1.0f : Float.NaN;
            androidx.constraintlayout.motion.widget.a aVar2 = this.t;
            aVar2.c = h2;
            androidx.constraintlayout.motion.widget.b bVar = h2.l;
            if (bVar != null) {
                bVar.c(aVar2.p);
            }
            this.B0.e(this.t.b(this.x), this.t.b(this.z));
            e5();
            if (this.H != f2) {
                if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    T4(true);
                    this.t.b(this.x).b(this);
                } else if (f2 == 1.0f) {
                    T4(false);
                    this.t.b(this.z).b(this);
                }
            }
            this.H = Float.isNaN(f2) ? 0.0f : f2;
            if (!Float.isNaN(f2)) {
                setProgress(f2);
            } else {
                n2l.b();
                Q4(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    public void setTransitionDuration(int i2) {
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        if (aVar == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        a.b bVar = aVar.c;
        if (bVar != null) {
            bVar.b(i2);
        } else {
            aVar.j = i2;
        }
    }

    public void setTransitionListener(i iVar) {
        this.M = iVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.w0 == null) {
            this.w0 = new h();
        }
        h hVar = this.w0;
        hVar.getClass();
        hVar.a = bundle.getFloat("motion.progress");
        hVar.b = bundle.getFloat("motion.velocity");
        hVar.c = bundle.getInt("motion.StartState");
        hVar.d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.w0.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return n2l.c(this.x, context) + "->" + n2l.c(this.z, context) + " (pos:" + this.H + " Dpos/Dt:" + this.w;
    }

    public void setTransition(a.b bVar) {
        androidx.constraintlayout.motion.widget.b bVar2;
        androidx.constraintlayout.motion.widget.a aVar = this.t;
        aVar.c = bVar;
        if (bVar != null && (bVar2 = bVar.l) != null) {
            bVar2.c(aVar.p);
        }
        setState(j.SETUP);
        int i2 = this.y;
        a.b bVar3 = this.t.c;
        if (i2 == (bVar3 == null ? -1 : bVar3.c)) {
            this.H = 1.0f;
            this.G = 1.0f;
            this.J = 1.0f;
        } else {
            this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.J = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        this.I = (bVar.r & 1) != 0 ? -1L : getNanoTime();
        int g2 = this.t.g();
        androidx.constraintlayout.motion.widget.a aVar2 = this.t;
        a.b bVar4 = aVar2.c;
        int i3 = bVar4 != null ? bVar4.c : -1;
        if (g2 == this.x && i3 == this.z) {
            return;
        }
        this.x = g2;
        this.z = i3;
        aVar2.o(g2, i3);
        androidx.constraintlayout.widget.b b2 = this.t.b(this.x);
        androidx.constraintlayout.widget.b b3 = this.t.b(this.z);
        f fVar = this.B0;
        fVar.e(b2, b3);
        int i4 = this.x;
        int i5 = this.z;
        fVar.e = i4;
        fVar.f = i5;
        fVar.f();
        e5();
    }

    public MotionLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, 0);
        this.v = null;
        this.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = 0;
        this.B = 0;
        this.C = true;
        this.D = new HashMap<>();
        this.E = 0L;
        this.F = 1.0f;
        this.G = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.H = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.J = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.L = false;
        this.N = 0;
        this.P = false;
        this.Q = new bgl0();
        this.R = new d();
        this.V = false;
        this.d0 = false;
        this.e0 = null;
        this.f0 = null;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = -1L;
        this.j0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.k0 = 0;
        this.l0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.m0 = false;
        this.u0 = new nt8(8);
        this.v0 = false;
        this.x0 = null;
        new HashMap();
        this.y0 = new Rect();
        this.z0 = false;
        this.A0 = j.UNDEFINED;
        this.B0 = new f();
        this.C0 = false;
        this.D0 = new RectF();
        this.E0 = null;
        this.F0 = null;
        this.G0 = new ArrayList<>();
        b5(attributeSet);
    }

    @Override // xsna.t160
    public final void H0(@NonNull View view, int i2, int i3, int i4, int i5, int i6) {
    }
}
