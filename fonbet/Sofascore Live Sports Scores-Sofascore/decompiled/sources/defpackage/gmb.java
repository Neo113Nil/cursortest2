package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gmb extends Drawable implements Drawable.Callback, Animatable {
    public static final List Q = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    public static final ThreadPoolExecutor R = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new rmb());
    public Rect A;
    public RectF B;
    public ska C;
    public Rect D;
    public Rect E;
    public RectF F;
    public RectF G;
    public Matrix H;
    public final float[] I;
    public Matrix J;
    public boolean K;
    public bl0 L;
    public final Semaphore M;
    public final yp8 N;
    public float O;
    public int P;
    public plb a;
    public final smb b;
    public final boolean c;
    public boolean d;
    public boolean e;
    public final ArrayList f;
    public ejg g;
    public String h;
    public p03 i;
    public Map j;
    public String k;
    public final cqa l;
    public boolean m;
    public boolean n;
    public tg3 o;
    public int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public myf v;
    public boolean w;
    public final Matrix x;
    public Bitmap y;
    public Canvas z;

    public gmb() {
        smb smbVar = new smb();
        this.b = smbVar;
        this.c = true;
        this.d = false;
        this.e = false;
        this.P = 1;
        this.f = new ArrayList();
        this.l = new cqa(1);
        this.m = false;
        this.n = true;
        this.p = 255;
        this.u = false;
        this.v = myf.a;
        this.w = false;
        this.x = new Matrix();
        this.I = new float[9];
        this.K = false;
        s2 s2Var = new s2(this, 12);
        this.M = new Semaphore(1);
        this.N = new yp8(this, 11);
        this.O = -3.4028235E38f;
        smbVar.addUpdateListener(s2Var);
    }

    public static void f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public static boolean i(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    public final void a(final aja ajaVar, final Object obj, final wj9 wj9Var) {
        tg3 tg3Var = this.o;
        if (tg3Var == null) {
            this.f.add(new fmb() { // from class: bmb
                @Override // defpackage.fmb
                public final void run() {
                    gmb.this.a(ajaVar, obj, wj9Var);
                }
            });
            return;
        }
        boolean z = true;
        if (ajaVar == aja.c) {
            tg3Var.d(wj9Var, obj);
        } else {
            bja bjaVar = ajaVar.b;
            if (bjaVar != null) {
                bjaVar.d(wj9Var, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.o.c(ajaVar, 0, arrayList, new aja(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((aja) arrayList.get(i)).b.d(wj9Var, obj);
                }
                z = true ^ arrayList.isEmpty();
            }
        }
        if (z) {
            invalidateSelf();
            if (obj == nmb.C) {
                u(this.b.a());
            }
        }
    }

    public final boolean b(Context context) {
        if (this.d) {
            return true;
        }
        if (!this.c) {
            return false;
        }
        if (context == null) {
            return true;
        }
        Matrix matrix = vik.a;
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void c() {
        plb plbVar = this.a;
        if (plbVar == null) {
            return;
        }
        wj9 wj9Var = nla.a;
        Rect rect = plbVar.k;
        List list = Collections.EMPTY_LIST;
        tg3 tg3Var = new tg3(this, new mla(list, plbVar, "__container", -1L, 1, -1L, null, list, new x50(), 0, 0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, rect.width(), rect.height(), null, null, list, 1, null, false, null, null, 1), plbVar.j, plbVar);
        this.o = tg3Var;
        if (this.r) {
            tg3Var.q(true);
        }
        this.o.L = this.n;
    }

    public final void d() {
        smb smbVar = this.b;
        if (smbVar.m) {
            smbVar.cancel();
            if (!isVisible()) {
                this.P = 1;
            }
        }
        this.a = null;
        this.o = null;
        this.g = null;
        this.O = -3.4028235E38f;
        smbVar.l = null;
        smbVar.j = -2.1474836E9f;
        smbVar.k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        tg3 tg3Var = this.o;
        if (tg3Var == null) {
            return;
        }
        bl0 bl0Var = this.L;
        if (bl0Var == null) {
            bl0Var = bl0.a;
        }
        boolean z = bl0Var == bl0.b;
        yp8 yp8Var = this.N;
        ThreadPoolExecutor threadPoolExecutor = R;
        smb smbVar = this.b;
        Semaphore semaphore = this.M;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (tg3Var.K == smbVar.a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (tg3Var.K != smbVar.a()) {
                        threadPoolExecutor.execute(yp8Var);
                    }
                }
                throw th;
            }
        }
        if (z && v()) {
            u(smbVar.a());
        }
        boolean z2 = this.e;
        boolean z3 = this.w;
        if (z2) {
            try {
                if (z3) {
                    l(canvas, tg3Var);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused2) {
                ajb.a.getClass();
            }
        } else if (z3) {
            l(canvas, tg3Var);
        } else {
            g(canvas);
        }
        this.K = false;
        if (z) {
            semaphore.release();
            if (tg3Var.K == smbVar.a()) {
                return;
            }
            threadPoolExecutor.execute(yp8Var);
        }
    }

    public final void e() {
        plb plbVar = this.a;
        if (plbVar == null) {
            return;
        }
        myf myfVar = this.v;
        int i = Build.VERSION.SDK_INT;
        boolean z = plbVar.o;
        int i2 = plbVar.p;
        int ordinal = myfVar.ordinal();
        boolean z2 = false;
        if (ordinal != 1 && (ordinal == 2 || ((z && i < 28) || i2 > 4))) {
            z2 = true;
        }
        this.w = z2;
    }

    public final void g(Canvas canvas) {
        tg3 tg3Var = this.o;
        plb plbVar = this.a;
        if (tg3Var == null || plbVar == null) {
            return;
        }
        Matrix matrix = this.x;
        matrix.reset();
        if (!getBounds().isEmpty()) {
            matrix.preTranslate(r3.left, r3.top);
            matrix.preScale(r3.width() / plbVar.k.width(), r3.height() / plbVar.k.height());
        }
        tg3Var.g(canvas, matrix, this.p, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        plb plbVar = this.a;
        if (plbVar == null) {
            return -1;
        }
        return plbVar.k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        plb plbVar = this.a;
        if (plbVar == null) {
            return -1;
        }
        return plbVar.k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final Context h() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.K) {
            return;
        }
        this.K = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        smb smbVar = this.b;
        if (smbVar == null) {
            return false;
        }
        return smbVar.m;
    }

    public final void j() {
        this.f.clear();
        smb smbVar = this.b;
        smbVar.h(true);
        Iterator it = smbVar.c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(smbVar);
        }
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final void k() {
        if (this.o == null) {
            this.f.add(new emb(this, 1));
            return;
        }
        e();
        boolean b = b(h());
        smb smbVar = this.b;
        if (b || smbVar.getRepeatCount() == 0) {
            if (isVisible()) {
                smbVar.m = true;
                boolean e = smbVar.e();
                Iterator it = smbVar.b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(smbVar, e);
                }
                smbVar.i((int) (smbVar.e() ? smbVar.b() : smbVar.c()));
                smbVar.f = 0L;
                smbVar.i = 0;
                if (smbVar.m) {
                    smbVar.h(false);
                    Choreographer.getInstance().postFrameCallback(smbVar);
                }
                this.P = 1;
            } else {
                this.P = 2;
            }
        }
        if (b(h())) {
            return;
        }
        Iterator it2 = Q.iterator();
        yub yubVar = null;
        while (it2.hasNext()) {
            yubVar = this.a.d((String) it2.next());
            if (yubVar != null) {
                break;
            }
        }
        if (yubVar != null) {
            o((int) yubVar.b);
        } else {
            o((int) (smbVar.d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? smbVar.c() : smbVar.b()));
        }
        smbVar.h(true);
        smbVar.f(smbVar.e());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(Canvas canvas, tg3 tg3Var) {
        boolean z;
        RectF rectF;
        if (this.a == null || tg3Var == null) {
            return;
        }
        if (this.z == null) {
            this.z = new Canvas();
            this.G = new RectF();
            this.H = new Matrix();
            this.J = new Matrix();
            this.A = new Rect();
            this.B = new RectF();
            this.C = new ska();
            this.D = new Rect();
            this.E = new Rect();
            this.F = new RectF();
        }
        canvas.getMatrix(this.H);
        canvas.getClipBounds(this.A);
        Rect rect = this.A;
        this.B.set(rect.left, rect.top, rect.right, rect.bottom);
        this.H.mapRect(this.B);
        f(this.A, this.B);
        boolean z2 = this.n;
        RectF rectF2 = this.G;
        if (z2) {
            rectF2.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            tg3Var.e(rectF2, null, false);
        }
        this.H.mapRect(this.G);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        RectF rectF3 = this.G;
        rectF3.set(rectF3.left * width, rectF3.top * height, rectF3.right * width, rectF3.bottom * height);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
                if (!z) {
                    RectF rectF4 = this.G;
                    Rect rect2 = this.A;
                    rectF4.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
                }
                rectF = this.G;
                if (i(rectF.left) || !i(rectF.top) || !i(rectF.right) || !i(rectF.bottom)) {
                    ajb.b("Skipping software rendering: transformed bounds contain non-finite values.");
                }
                int ceil = (int) Math.ceil(this.G.width());
                int ceil2 = (int) Math.ceil(this.G.height());
                if (ceil <= 0 || ceil2 <= 0) {
                    ajb.b("Skipping software rendering: transformed bounds have negative values.");
                    return;
                }
                long j = ceil * ceil2;
                if (j > 50000000) {
                    ajb.b("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
                    return;
                }
                Bitmap bitmap = this.y;
                if (bitmap == null || bitmap.getWidth() < ceil || this.y.getHeight() < ceil2) {
                    Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                    this.y = createBitmap;
                    this.z.setBitmap(createBitmap);
                    this.K = true;
                } else if (this.y.getWidth() > ceil || this.y.getHeight() > ceil2) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(this.y, 0, 0, ceil, ceil2);
                    this.y = createBitmap2;
                    this.z.setBitmap(createBitmap2);
                    this.K = true;
                }
                if (this.K) {
                    Matrix matrix = this.H;
                    float[] fArr = this.I;
                    matrix.getValues(fArr);
                    float f = fArr[0];
                    float f2 = fArr[4];
                    Matrix matrix2 = this.H;
                    Matrix matrix3 = this.x;
                    matrix3.set(matrix2);
                    matrix3.preScale(width, height);
                    RectF rectF5 = this.G;
                    matrix3.postTranslate(-rectF5.left, -rectF5.top);
                    matrix3.postScale(1.0f / f, 1.0f / f2);
                    this.y.eraseColor(0);
                    this.z.setMatrix(vik.a);
                    this.z.scale(f, f2);
                    tg3Var.g(this.z, matrix3, this.p, null);
                    this.H.invert(this.J);
                    this.J.mapRect(this.F, this.G);
                    f(this.E, this.F);
                }
                this.D.set(0, 0, ceil, ceil2);
                canvas.drawBitmap(this.y, this.D, this.E, this.C);
                return;
            }
        }
        z = false;
        if (!z) {
        }
        rectF = this.G;
        if (i(rectF.left)) {
        }
        ajb.b("Skipping software rendering: transformed bounds contain non-finite values.");
    }

    public final void m() {
        if (this.o == null) {
            this.f.add(new emb(this, 0));
            return;
        }
        e();
        boolean b = b(h());
        smb smbVar = this.b;
        if (b || smbVar.getRepeatCount() == 0) {
            if (isVisible()) {
                smbVar.m = true;
                smbVar.h(false);
                Choreographer.getInstance().postFrameCallback(smbVar);
                smbVar.f = 0L;
                if (smbVar.e() && smbVar.h == smbVar.c()) {
                    smbVar.i(smbVar.b());
                } else if (!smbVar.e() && smbVar.h == smbVar.b()) {
                    smbVar.i(smbVar.c());
                }
                Iterator it = smbVar.c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(smbVar);
                }
                this.P = 1;
            } else {
                this.P = 3;
            }
        }
        if (b(h())) {
            return;
        }
        o((int) (smbVar.d < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? smbVar.c() : smbVar.b()));
        smbVar.h(true);
        smbVar.f(smbVar.e());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final boolean n(plb plbVar) {
        if (this.a == plbVar) {
            return false;
        }
        this.K = true;
        d();
        this.a = plbVar;
        c();
        smb smbVar = this.b;
        boolean z = smbVar.l == null;
        smbVar.l = plbVar;
        if (z) {
            smbVar.j(Math.max(smbVar.j, plbVar.l), Math.min(smbVar.k, plbVar.m));
        } else {
            smbVar.j((int) plbVar.l, (int) plbVar.m);
        }
        float f = smbVar.h;
        smbVar.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        smbVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        smbVar.i((int) f);
        smbVar.g();
        u(smbVar.getAnimatedFraction());
        ArrayList arrayList = this.f;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            fmb fmbVar = (fmb) it.next();
            if (fmbVar != null) {
                fmbVar.run();
            }
            it.remove();
        }
        arrayList.clear();
        plbVar.a.a = this.q;
        e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public final void o(int i) {
        if (this.a != null) {
            this.b.i(i);
        } else {
            this.f.add(new amb(this, i, 2));
        }
    }

    public final void p(int i) {
        if (this.a == null) {
            this.f.add(new amb(this, i, 0));
        } else {
            smb smbVar = this.b;
            smbVar.j(smbVar.j, i + 0.99f);
        }
    }

    public final void q(String str) {
        plb plbVar = this.a;
        if (plbVar == null) {
            this.f.add(new zlb(this, str, 1));
            return;
        }
        yub d = plbVar.d(str);
        if (d != null) {
            p((int) (d.b + d.c));
        } else {
            a70.p(lnb.o("Cannot find marker with name ", str, "."));
        }
    }

    public final void r(String str) {
        plb plbVar = this.a;
        ArrayList arrayList = this.f;
        if (plbVar == null) {
            arrayList.add(new zlb(this, str, 0));
            return;
        }
        yub d = plbVar.d(str);
        if (d == null) {
            a70.p(lnb.o("Cannot find marker with name ", str, "."));
            return;
        }
        int i = (int) d.b;
        int i2 = ((int) d.c) + i;
        if (this.a == null) {
            arrayList.add(new dmb(this, i, i2));
        } else {
            this.b.j(i, i2 + 0.99f);
        }
    }

    public final void s(int i) {
        if (this.a == null) {
            this.f.add(new amb(this, i, 1));
        } else {
            this.b.j(i, (int) r2.k);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        ajb.b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            int i = this.P;
            if (i == 2) {
                k();
                return visible;
            }
            if (i == 3) {
                m();
                return visible;
            }
        } else {
            if (this.b.m) {
                j();
                this.P = 3;
                return visible;
            }
            if (isVisible) {
                this.P = 1;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        k();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f.clear();
        smb smbVar = this.b;
        smbVar.h(true);
        smbVar.f(smbVar.e());
        if (isVisible()) {
            return;
        }
        this.P = 1;
    }

    public final void t(String str) {
        plb plbVar = this.a;
        if (plbVar == null) {
            this.f.add(new zlb(this, str, 2));
            return;
        }
        yub d = plbVar.d(str);
        if (d != null) {
            s((int) d.b);
        } else {
            a70.p(lnb.o("Cannot find marker with name ", str, "."));
        }
    }

    public final void u(float f) {
        plb plbVar = this.a;
        if (plbVar == null) {
            this.f.add(new cmb(this, f, 2));
        } else {
            this.b.i(pkc.f(plbVar.l, plbVar.m, f));
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public final boolean v() {
        plb plbVar = this.a;
        if (plbVar == null) {
            return false;
        }
        float f = this.O;
        float a = this.b.a();
        this.O = a;
        return Math.abs(a - f) * plbVar.b() >= 50.0f;
    }
}
