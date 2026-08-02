package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class pja {
    public static zwh b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final wj9 c = wj9.J("t", "s", "e", "o", i.a, h.b, "to", "ti");
    public static final wj9 d = wj9.J("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = pkc.b(pointF.x, -1.0f, 1.0f);
        pointF.y = pkc.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = pkc.b(pointF2.x, -1.0f, 1.0f);
        float b2 = pkc.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b2;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = vik.a;
        int i = f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) (527.0f * f) : 17;
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * f3);
        }
        if (b2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i = (int) (i * 31 * b2);
        }
        synchronized (pja.class) {
            zwh zwhVar = b;
            if (zwhVar == null) {
                zwhVar = new zwh(0);
                b = zwhVar;
            }
            weakReference = (WeakReference) gz8.C(zwhVar, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (pja.class) {
                b.d(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.animation.Interpolator] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.animation.Interpolator] */
    public static nja b(wga wgaVar, plb plbVar, float f, lkk lkkVar, boolean z, boolean z2) {
        Object obj;
        LinearInterpolator a2;
        Interpolator a3;
        Interpolator a4;
        Object obj2;
        wj9 wj9Var;
        wj9 wj9Var2;
        PointF pointF;
        wj9 wj9Var3 = c;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            wj9 wj9Var4 = wj9Var3;
            if (!z) {
                return new nja(lkkVar.i(wgaVar, f));
            }
            wgaVar.k();
            PointF pointF2 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            PointF pointF5 = null;
            boolean z3 = false;
            Object obj3 = null;
            float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            Object obj4 = null;
            while (wgaVar.t()) {
                wj9 wj9Var5 = wj9Var4;
                switch (wgaVar.e0(wj9Var5)) {
                    case 0:
                        wj9Var4 = wj9Var5;
                        f2 = (float) wgaVar.H();
                        continue;
                    case 1:
                        obj3 = lkkVar.i(wgaVar, f);
                        break;
                    case 2:
                        obj4 = lkkVar.i(wgaVar, f);
                        break;
                    case 3:
                        pointF5 = nha.b(wgaVar, 1.0f);
                        break;
                    case 4:
                        pointF2 = nha.b(wgaVar, 1.0f);
                        break;
                    case 5:
                        if (wgaVar.M() != 1) {
                            z3 = false;
                            break;
                        } else {
                            z3 = true;
                            break;
                        }
                    case 6:
                        pointF3 = nha.b(wgaVar, f);
                        break;
                    case 7:
                        pointF4 = nha.b(wgaVar, f);
                        break;
                    default:
                        wgaVar.g0();
                        break;
                }
                wj9Var4 = wj9Var5;
            }
            wgaVar.n();
            if (z3) {
                obj = obj3;
            } else {
                if (pointF5 != null && pointF2 != null) {
                    a2 = a(pointF5, pointF2);
                    obj = obj4;
                    nja njaVar = new nja(plbVar, obj3, obj, a2, f2, (Float) null);
                    njaVar.o = pointF3;
                    njaVar.p = pointF4;
                    return njaVar;
                }
                obj = obj4;
            }
            a2 = linearInterpolator;
            nja njaVar2 = new nja(plbVar, obj3, obj, a2, f2, (Float) null);
            njaVar2.o = pointF3;
            njaVar2.p = pointF4;
            return njaVar2;
        }
        wgaVar.k();
        PointF pointF6 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        boolean z4 = false;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        Object obj5 = null;
        PointF pointF12 = null;
        PointF pointF13 = null;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Object obj6 = null;
        while (wgaVar.t()) {
            int e0 = wgaVar.e0(wj9Var3);
            wj9 wj9Var6 = d;
            LinearInterpolator linearInterpolator2 = linearInterpolator;
            switch (e0) {
                case 0:
                    wj9Var = wj9Var3;
                    f3 = (float) wgaVar.H();
                    linearInterpolator = linearInterpolator2;
                    wj9Var3 = wj9Var;
                    break;
                case 1:
                    wj9Var = wj9Var3;
                    obj5 = lkkVar.i(wgaVar, f);
                    linearInterpolator = linearInterpolator2;
                    wj9Var3 = wj9Var;
                    break;
                case 2:
                    wj9Var = wj9Var3;
                    obj6 = lkkVar.i(wgaVar, f);
                    linearInterpolator = linearInterpolator2;
                    wj9Var3 = wj9Var;
                    break;
                case 3:
                    wj9Var = wj9Var3;
                    boolean z5 = z4;
                    Object obj7 = obj5;
                    PointF pointF14 = pointF12;
                    if (wgaVar.Z() == 3) {
                        wgaVar.k();
                        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f7 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (wgaVar.t()) {
                            int e02 = wgaVar.e0(wj9Var6);
                            if (e02 != 0) {
                                if (e02 != 1) {
                                    wgaVar.g0();
                                } else if (wgaVar.Z() == 7) {
                                    f7 = (float) wgaVar.H();
                                    f5 = f7;
                                } else {
                                    wgaVar.h();
                                    f5 = (float) wgaVar.H();
                                    f7 = wgaVar.Z() == 7 ? (float) wgaVar.H() : f5;
                                    wgaVar.m();
                                }
                            } else if (wgaVar.Z() == 7) {
                                f6 = (float) wgaVar.H();
                                f4 = f6;
                            } else {
                                wgaVar.h();
                                f4 = (float) wgaVar.H();
                                f6 = wgaVar.Z() == 7 ? (float) wgaVar.H() : f4;
                                wgaVar.m();
                            }
                        }
                        PointF pointF15 = new PointF(f4, f5);
                        pointF12 = new PointF(f6, f7);
                        wgaVar.n();
                        pointF11 = pointF15;
                    } else {
                        pointF9 = nha.b(wgaVar, f);
                        pointF12 = pointF14;
                    }
                    z4 = z5;
                    linearInterpolator = linearInterpolator2;
                    obj5 = obj7;
                    wj9Var3 = wj9Var;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (wgaVar.Z() == 3) {
                        wgaVar.k();
                        float f8 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        float f11 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        while (wgaVar.t()) {
                            Object obj8 = obj5;
                            int e03 = wgaVar.e0(wj9Var6);
                            if (e03 != 0) {
                                wj9Var2 = wj9Var3;
                                if (e03 != 1) {
                                    wgaVar.g0();
                                } else if (wgaVar.Z() == 7) {
                                    f11 = (float) wgaVar.H();
                                    pointF12 = pointF12;
                                    f9 = f11;
                                } else {
                                    pointF = pointF12;
                                    wgaVar.h();
                                    f9 = (float) wgaVar.H();
                                    f11 = wgaVar.Z() == 7 ? (float) wgaVar.H() : f9;
                                    wgaVar.m();
                                    pointF12 = pointF;
                                }
                            } else {
                                wj9Var2 = wj9Var3;
                                pointF = pointF12;
                                if (wgaVar.Z() == 7) {
                                    f10 = (float) wgaVar.H();
                                    pointF12 = pointF;
                                    f8 = f10;
                                } else {
                                    wgaVar.h();
                                    f8 = (float) wgaVar.H();
                                    f10 = wgaVar.Z() == 7 ? (float) wgaVar.H() : f8;
                                    wgaVar.m();
                                    pointF12 = pointF;
                                }
                            }
                            obj5 = obj8;
                            wj9Var3 = wj9Var2;
                        }
                        wj9Var = wj9Var3;
                        PointF pointF16 = new PointF(f8, f9);
                        pointF6 = new PointF(f10, f11);
                        wgaVar.n();
                        pointF13 = pointF16;
                    } else {
                        wj9Var = wj9Var3;
                        pointF10 = nha.b(wgaVar, f);
                    }
                    z4 = z6;
                    linearInterpolator = linearInterpolator2;
                    wj9Var3 = wj9Var;
                    break;
                case 5:
                    z4 = wgaVar.M() == 1;
                    linearInterpolator = linearInterpolator2;
                    break;
                case 6:
                    pointF7 = nha.b(wgaVar, f);
                    linearInterpolator = linearInterpolator2;
                    break;
                case 7:
                    pointF8 = nha.b(wgaVar, f);
                    linearInterpolator = linearInterpolator2;
                    break;
                default:
                    wgaVar.g0();
                    linearInterpolator = linearInterpolator2;
                    break;
            }
        }
        LinearInterpolator linearInterpolator3 = linearInterpolator;
        boolean z7 = z4;
        Object obj9 = obj5;
        PointF pointF17 = pointF12;
        wgaVar.n();
        if (z7) {
            obj2 = obj9;
        } else {
            if (pointF9 != null && pointF10 != null) {
                linearInterpolator3 = a(pointF9, pointF10);
            } else if (pointF11 != null && pointF17 != null && pointF13 != null && pointF6 != null) {
                a3 = a(pointF11, pointF13);
                a4 = a(pointF17, pointF6);
                obj2 = obj6;
                linearInterpolator3 = null;
                nja njaVar3 = (a3 != null || a4 == null) ? new nja(plbVar, obj9, obj2, linearInterpolator3, f3, (Float) null) : new nja(plbVar, obj9, obj2, a3, a4, f3);
                njaVar3.o = pointF7;
                njaVar3.p = pointF8;
                return njaVar3;
            }
            obj2 = obj6;
        }
        a3 = null;
        a4 = null;
        if (a3 != null) {
        }
        njaVar3.o = pointF7;
        njaVar3.p = pointF8;
        return njaVar3;
    }
}
