package v;

import C.InterfaceC2689i;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import u.C9887a;
import v.C10132s;
import w.C10368u;

/* loaded from: classes8.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name */
    private final C10132s f101197a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f101198b;

    /* renamed from: c, reason: collision with root package name */
    private final b2 f101199c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.V<C.v0> f101200d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    final b f101201e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f101202f = false;

    /* renamed from: g, reason: collision with root package name */
    private C10132s.c f101203g = new a();

    final class a implements C10132s.c {
        a() {
        }

        @Override // v.C10132s.c
        public final boolean a(@NonNull TotalCaptureResult totalCaptureResult) {
            a2.this.f101201e.a(totalCaptureResult);
            return false;
        }
    }

    interface b {
        void a(@NonNull TotalCaptureResult totalCaptureResult);

        void b(float f7, @NonNull b.a<Void> aVar);

        void c();

        void d(@NonNull C9887a.C2193a c2193a);

        @NonNull
        Rect e();

        float getMaxZoom();

        float getMinZoom();
    }

    a2(@NonNull C10132s c10132s, @NonNull C10368u c10368u, @NonNull Executor executor) {
        Range range;
        b c10085c;
        CameraCharacteristics.Key key;
        this.f101197a = c10132s;
        this.f101198b = executor;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) c10368u.a(key);
            } catch (AssertionError e11) {
                C.S.l("ZoomControl", "AssertionError, fail to get camera characteristic.", e11);
                range = null;
            }
            if (range != null) {
                c10085c = new C10085c(c10368u);
                this.f101201e = c10085c;
                b2 b2Var = new b2(c10085c.getMaxZoom(), c10085c.getMinZoom());
                this.f101199c = b2Var;
                b2Var.f(1.0f);
                this.f101200d = new androidx.lifecycle.V<>(J.g.e(b2Var));
                c10132s.t(this.f101203g);
            }
        }
        c10085c = new Z0(c10368u);
        this.f101201e = c10085c;
        b2 b2Var2 = new b2(c10085c.getMaxZoom(), c10085c.getMinZoom());
        this.f101199c = b2Var2;
        b2Var2.f(1.0f);
        this.f101200d = new androidx.lifecycle.V<>(J.g.e(b2Var2));
        c10132s.t(this.f101203g);
    }

    public static /* synthetic */ void c(final C.v0 v0Var, final b.a aVar, final a2 a2Var) {
        a2Var.getClass();
        a2Var.f101198b.execute(new Runnable() { // from class: v.Z1
            @Override // java.lang.Runnable
            public final void run() {
                a2Var.h(aVar, v0Var);
            }
        });
    }

    public static /* synthetic */ void d(final C.v0 v0Var, final b.a aVar, final a2 a2Var) {
        a2Var.getClass();
        a2Var.f101198b.execute(new Runnable() { // from class: v.Y1
            @Override // java.lang.Runnable
            public final void run() {
                a2Var.h(aVar, v0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(@NonNull b.a<Void> aVar, @NonNull C.v0 v0Var) {
        C.v0 e11;
        if (this.f101202f) {
            this.f101201e.b(v0Var.d(), aVar);
            this.f101197a.R();
            return;
        }
        synchronized (this.f101199c) {
            this.f101199c.f(1.0f);
            e11 = J.g.e(this.f101199c);
        }
        i(e11);
        aVar.e(new InterfaceC2689i.a("Camera is not active."));
    }

    private void i(C.v0 v0Var) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        androidx.lifecycle.V<C.v0> v11 = this.f101200d;
        if (myLooper == mainLooper) {
            v11.setValue(v0Var);
        } else {
            v11.postValue(v0Var);
        }
    }

    final void e(boolean z11) {
        C.v0 e11;
        if (this.f101202f == z11) {
            return;
        }
        this.f101202f = z11;
        if (z11) {
            return;
        }
        synchronized (this.f101199c) {
            this.f101199c.f(1.0f);
            e11 = J.g.e(this.f101199c);
        }
        i(e11);
        this.f101201e.c();
        this.f101197a.R();
    }

    @NonNull
    final com.google.common.util.concurrent.m<Void> f(float f7) {
        C.v0 e11;
        synchronized (this.f101199c) {
            try {
                this.f101199c.e(f7);
                e11 = J.g.e(this.f101199c);
            } catch (IllegalArgumentException e12) {
                return I.k.f(e12);
            }
        }
        i(e11);
        return androidx.concurrent.futures.b.a(new C10133s0(1, this, e11));
    }

    @NonNull
    final com.google.common.util.concurrent.m<Void> g(float f7) {
        final C.v0 e11;
        synchronized (this.f101199c) {
            try {
                this.f101199c.f(f7);
                e11 = J.g.e(this.f101199c);
            } catch (IllegalArgumentException e12) {
                return I.k.f(e12);
            }
        }
        i(e11);
        return androidx.concurrent.futures.b.a(new b.c() { // from class: v.X1
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                a2.d(e11, aVar, a2.this);
                return "setZoomRatio";
            }
        });
    }
}
