package androidx.core.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.g2;
import androidx.core.view.z0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public static final int f1457r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final a f1458a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f1459b;

    /* renamed from: c, reason: collision with root package name */
    public final g2 f1460c;

    /* renamed from: d, reason: collision with root package name */
    public b f1461d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f1462e;

    /* renamed from: f, reason: collision with root package name */
    public final float[] f1463f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1464g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1465h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f1466i;
    public final float[] j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f1467k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1468l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1469m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1470n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1471o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1472p;
    public final g2 q;

    public e(g2 g2Var) {
        a aVar = new a();
        aVar.f1450e = Long.MIN_VALUE;
        aVar.f1452g = -1L;
        aVar.f1451f = 0L;
        this.f1458a = aVar;
        this.f1459b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1462e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1463f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1466i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1467k = fArr5;
        this.f1460c = g2Var;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f6) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f6 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f1464g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1465h = f1457r;
        aVar.f1446a = 500;
        aVar.f1447b = 500;
        this.q = g2Var;
    }

    public static float b(float f6, float f10, float f11) {
        return f6 > f11 ? f11 : f6 < f10 ? f10 : f6;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f6, float f10, float f11, int i5) {
        float f12;
        float interpolation;
        float b10 = b(this.f1462e[i5] * f10, 0.0f, this.f1463f[i5]);
        float c2 = c(f10 - f6, b10) - c(f6, b10);
        AccelerateInterpolator accelerateInterpolator = this.f1459b;
        if (c2 < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-c2);
        } else {
            if (c2 <= 0.0f) {
                f12 = 0.0f;
                if (f12 != 0.0f) {
                    return 0.0f;
                }
                float f13 = this.f1466i[i5];
                float f14 = this.j[i5];
                float f15 = this.f1467k[i5];
                float f16 = f13 * f11;
                return f12 > 0.0f ? b(f12 * f16, f14, f15) : -b((-f12) * f16, f14, f15);
            }
            interpolation = accelerateInterpolator.getInterpolation(c2);
        }
        f12 = b(interpolation, -1.0f, 1.0f);
        if (f12 != 0.0f) {
        }
    }

    public final float c(float f6, float f10) {
        if (f10 != 0.0f) {
            int i5 = this.f1464g;
            if (i5 == 0 || i5 == 1) {
                if (f6 < f10) {
                    if (f6 >= 0.0f) {
                        return 1.0f - (f6 / f10);
                    }
                    if (this.f1471o && i5 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i5 == 2 && f6 < 0.0f) {
                return f6 / (-f10);
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i5 = 0;
        if (this.f1469m) {
            this.f1471o = false;
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        a aVar = this.f1458a;
        int i10 = (int) (currentAnimationTimeMillis - aVar.f1450e);
        int i11 = aVar.f1447b;
        if (i10 > i11) {
            i5 = i11;
        } else if (i10 >= 0) {
            i5 = i10;
        }
        aVar.f1454i = i5;
        aVar.f1453h = aVar.a(currentAnimationTimeMillis);
        aVar.f1452g = currentAnimationTimeMillis;
    }

    public final boolean e() {
        g2 g2Var;
        int count;
        a aVar = this.f1458a;
        float f6 = aVar.f1449d;
        int abs = (int) (f6 / Math.abs(f6));
        Math.abs(aVar.f1448c);
        if (abs != 0 && (count = (g2Var = this.q).getCount()) != 0) {
            int childCount = g2Var.getChildCount();
            int firstVisiblePosition = g2Var.getFirstVisiblePosition();
            int i5 = firstVisiblePosition + childCount;
            if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && g2Var.getChildAt(0).getTop() >= 0)) : !(i5 >= count && g2Var.getChildAt(childCount - 1).getBottom() <= g2Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i5;
        int i10 = 0;
        if (this.f1472p) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                d();
                return false;
            }
            this.f1470n = true;
            this.f1468l = false;
            float x10 = motionEvent.getX();
            float width = view.getWidth();
            g2 g2Var = this.f1460c;
            float a7 = a(x10, width, g2Var.getWidth(), 0);
            float a10 = a(motionEvent.getY(), view.getHeight(), g2Var.getHeight(), 1);
            a aVar = this.f1458a;
            aVar.f1448c = a7;
            aVar.f1449d = a10;
            if (!this.f1471o && e()) {
                if (this.f1461d == null) {
                    this.f1461d = new b(i10, this);
                }
                this.f1471o = true;
                this.f1469m = true;
                if (this.f1468l || (i5 = this.f1465h) <= 0) {
                    this.f1461d.run();
                } else {
                    b bVar = this.f1461d;
                    long j = i5;
                    WeakHashMap weakHashMap = z0.f1413a;
                    g2Var.postOnAnimationDelayed(bVar, j);
                }
                this.f1468l = true;
            }
        }
        return false;
    }
}
