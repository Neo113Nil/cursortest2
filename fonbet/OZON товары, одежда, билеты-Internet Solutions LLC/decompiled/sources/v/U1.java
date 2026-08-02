package v;

import B90.C2621x;
import C.InterfaceC2689i;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import v.C10132s;
import w.C10368u;
import z.C10949g;

/* loaded from: classes8.dex */
final class U1 {

    /* renamed from: a, reason: collision with root package name */
    private final C10132s f101104a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.V<Integer> f101105b = new androidx.lifecycle.V<>(0);

    /* renamed from: c, reason: collision with root package name */
    private final boolean f101106c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f101107d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f101108e;

    /* renamed from: f, reason: collision with root package name */
    b.a<Void> f101109f;

    /* renamed from: g, reason: collision with root package name */
    boolean f101110g;

    U1(@NonNull C10132s c10132s, @NonNull C10368u c10368u, @NonNull Executor executor) {
        this.f101104a = c10132s;
        this.f101107d = executor;
        this.f101106c = C10949g.a(new C2621x(c10368u));
        c10132s.t(new C10132s.c() { // from class: v.S1
            @Override // v.C10132s.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                U1 u12 = U1.this;
                if (u12.f101109f != null) {
                    Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
                    if ((num != null && num.intValue() == 2) == u12.f101110g) {
                        u12.f101109f.c(null);
                        u12.f101109f = null;
                    }
                }
                return false;
            }
        });
    }

    public static /* synthetic */ String a(final b.a aVar, final U1 u12, final boolean z11) {
        u12.getClass();
        u12.f101107d.execute(new Runnable() { // from class: v.T1
            @Override // java.lang.Runnable
            public final void run() {
                u12.c(aVar, z11);
            }
        });
        return "enableTorch: " + z11;
    }

    private static void e(@NonNull androidx.lifecycle.V v11, Integer num) {
        if (G.q.b()) {
            v11.setValue(num);
        } else {
            v11.postValue(num);
        }
    }

    final com.google.common.util.concurrent.m<Void> b(final boolean z11) {
        if (this.f101106c) {
            e(this.f101105b, Integer.valueOf(z11 ? 1 : 0));
            return androidx.concurrent.futures.b.a(new b.c() { // from class: v.R1
                @Override // androidx.concurrent.futures.b.c
                public final Object c(b.a aVar) {
                    return U1.a(aVar, U1.this, z11);
                }
            });
        }
        C.S.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
        return I.k.f(new IllegalStateException("No flash unit"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(b.a<Void> aVar, boolean z11) {
        if (!this.f101106c) {
            if (aVar != null) {
                aVar.e(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        boolean z12 = this.f101108e;
        androidx.lifecycle.V<Integer> v11 = this.f101105b;
        if (!z12) {
            e(v11, 0);
            if (aVar != null) {
                aVar.e(new InterfaceC2689i.a("Camera is not active."));
                return;
            }
            return;
        }
        this.f101110g = z11;
        this.f101104a.v(z11);
        e(v11, Integer.valueOf(z11 ? 1 : 0));
        b.a<Void> aVar2 = this.f101109f;
        if (aVar2 != null) {
            aVar2.e(new InterfaceC2689i.a("There is a new enableTorch being set"));
        }
        this.f101109f = aVar;
    }

    final void d(boolean z11) {
        if (this.f101108e == z11) {
            return;
        }
        this.f101108e = z11;
        if (z11) {
            return;
        }
        if (this.f101110g) {
            this.f101110g = false;
            this.f101104a.v(false);
            e(this.f101105b, 0);
        }
        b.a<Void> aVar = this.f101109f;
        if (aVar != null) {
            aVar.e(new InterfaceC2689i.a("Camera is not active."));
            this.f101109f = null;
        }
    }
}
