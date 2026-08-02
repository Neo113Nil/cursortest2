package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import com.unity3d.services.UnityAdsConstants;
import java.util.function.Consumer;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xe3 implements ScrollCaptureCallback {
    public final s3h a;
    public final x6a b;
    public final xo3 c;
    public final xy d;
    public final ad2 e;
    public final ef9 f;

    public xe3(s3h s3hVar, x6a x6aVar, ad2 ad2Var, xo3 xo3Var, xy xyVar) {
        this.a = s3hVar;
        this.b = x6aVar;
        this.c = xo3Var;
        this.d = xyVar;
        this.e = s9a.F(ad2Var, o35.a);
        this.f = new ef9(x6aVar.b(), new we3(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        if (r3 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScrollCaptureSession scrollCaptureSession, x6a x6aVar, sq3 sq3Var) {
        ve3 ve3Var;
        lu3 lu3Var;
        int i;
        int i2;
        int i3;
        Object b;
        ry ryVar;
        ScrollCaptureSession scrollCaptureSession2;
        x6a x6aVar2;
        int i4;
        int i5;
        int c;
        int c2;
        if (sq3Var instanceof ve3) {
            ve3Var = (ve3) sq3Var;
            int i6 = ve3Var.x;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ve3Var.x = i6 - Integer.MIN_VALUE;
                Object obj = ve3Var.v;
                lu3Var = lu3.a;
                i = ve3Var.x;
                ef9 ef9Var = this.f;
                if (i != 0) {
                    y6a.M(obj);
                    i2 = x6aVar.b;
                    i3 = x6aVar.d;
                    ve3Var.r = scrollCaptureSession;
                    ve3Var.s = x6aVar;
                    ve3Var.t = i2;
                    ve3Var.u = i3;
                    ve3Var.x = 1;
                    int i7 = ef9Var.a;
                    if (i2 > i3) {
                        ogj.h(dmi.k(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        ogj.h(dmi.k(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = ef9Var.b;
                    if (f < f2 || i3 > i7 + f2) {
                        b = ef9Var.b((((i8 / 2) + i2) - (i7 / 2)) - f2, ve3Var);
                        if (b != lu3Var) {
                            b = Unit.a;
                        }
                        if (b != lu3Var) {
                            b = Unit.a;
                        }
                    } else {
                        b = Unit.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = ve3Var.u;
                        i4 = ve3Var.t;
                        x6aVar2 = ve3Var.s;
                        scrollCaptureSession2 = (ScrollCaptureSession) ve3Var.r;
                        y6a.M(obj);
                        c = llf.c(i4 - wzb.b(ef9Var.b), 0, ef9Var.a);
                        c2 = llf.c(i5 - wzb.b(ef9Var.b), 0, ef9Var.a);
                        int i9 = x6aVar2.a;
                        int i10 = x6aVar2.c;
                        if (c != c2) {
                            return x6a.e;
                        }
                        Canvas lockHardwareCanvas = scrollCaptureSession2.getSurface().lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -c);
                            x6a x6aVar3 = this.b;
                            lockHardwareCanvas.translate(-x6aVar3.a, -x6aVar3.b);
                            this.d.getRootView().draw(lockHardwareCanvas);
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            int b2 = wzb.b(ef9Var.b);
                            return new x6a(i9, c + b2, i10, c2 + b2);
                        } catch (Throwable th) {
                            scrollCaptureSession2.getSurface().unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = ve3Var.u;
                    int i12 = ve3Var.t;
                    x6a x6aVar4 = ve3Var.s;
                    ScrollCaptureSession scrollCaptureSession3 = (ScrollCaptureSession) ve3Var.r;
                    y6a.M(obj);
                    i2 = i12;
                    x6aVar = x6aVar4;
                    i3 = i11;
                    scrollCaptureSession = scrollCaptureSession3;
                }
                ryVar = ry.J;
                ve3Var.r = scrollCaptureSession;
                ve3Var.s = x6aVar;
                ve3Var.t = i2;
                ve3Var.u = i3;
                ve3Var.x = 2;
                if (bea.y(ve3Var.getContext()).p(ryVar, ve3Var) != lu3Var) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    x6aVar2 = x6aVar;
                    i4 = i2;
                    i5 = i3;
                    c = llf.c(i4 - wzb.b(ef9Var.b), 0, ef9Var.a);
                    c2 = llf.c(i5 - wzb.b(ef9Var.b), 0, ef9Var.a);
                    int i92 = x6aVar2.a;
                    int i102 = x6aVar2.c;
                    if (c != c2) {
                    }
                }
                return lu3Var;
            }
        }
        ve3Var = new ve3(this, sq3Var);
        Object obj2 = ve3Var.v;
        lu3Var = lu3.a;
        i = ve3Var.x;
        ef9 ef9Var2 = this.f;
        if (i != 0) {
        }
        ryVar = ry.J;
        ve3Var.r = scrollCaptureSession;
        ve3Var.s = x6aVar;
        ve3Var.t = i2;
        ve3Var.u = i3;
        ve3Var.x = 2;
        if (bea.y(ve3Var.getContext()).p(ryVar, ve3Var) != lu3Var) {
        }
        return lu3Var;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        xw3.L(this.e, eed.b, null, new hy1(this, runnable, null, 16), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        g9i L = xw3.L(this.e, null, null, new u1(this, scrollCaptureSession, rect, consumer, null, 11), 3);
        L.n(new oo(cancellationSignal, 10));
        cancellationSignal.setOnCancelListener(new ye3(L, 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(wba.M(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        ((eoh) ((e1d) this.c.b)).setValue(Boolean.TRUE);
        runnable.run();
    }
}
