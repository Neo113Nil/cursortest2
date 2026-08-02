package s7;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzoo;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f23254b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e2 f23255c;

    public /* synthetic */ y1(e2 e2Var, AtomicReference atomicReference, int i5, boolean z5) {
        this.f23253a = i5;
        this.f23255c = e2Var;
        this.f23254b = atomicReference;
    }

    private final void a() {
        AtomicReference atomicReference = this.f23254b;
        synchronized (atomicReference) {
            try {
                try {
                    f1 f1Var = (f1) this.f23255c.f3328a;
                    atomicReference.set(f1Var.f22743d.p(f1Var.r().p(), x.f23180c0));
                } finally {
                    this.f23254b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        AtomicReference atomicReference = this.f23254b;
        synchronized (atomicReference) {
            try {
                try {
                    f1 f1Var = (f1) this.f23255c.f3328a;
                    atomicReference.set(Long.valueOf(f1Var.f22743d.q(f1Var.r().p(), x.f23183d0)));
                } finally {
                    this.f23254b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void c() {
        AtomicReference atomicReference = this.f23254b;
        synchronized (atomicReference) {
            try {
                try {
                    f1 f1Var = (f1) this.f23255c.f3328a;
                    atomicReference.set(Integer.valueOf(f1Var.f22743d.r(f1Var.r().p(), x.e0)));
                } finally {
                    this.f23254b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = this.f23254b;
        synchronized (atomicReference) {
            try {
                try {
                    f1 f1Var = (f1) this.f23255c.f3328a;
                    atomicReference.set(Double.valueOf(f1Var.f22743d.s(f1Var.r().p(), x.f23187f0)));
                } finally {
                    this.f23254b.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23253a) {
            case 0:
                AtomicReference atomicReference = this.f23254b;
                synchronized (atomicReference) {
                    try {
                        try {
                            f1 f1Var = (f1) this.f23255c.f3328a;
                            atomicReference.set(Boolean.valueOf(f1Var.f22743d.t(f1Var.r().p(), x.f23177b0)));
                        } finally {
                            this.f23254b.notify();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                a();
                return;
            case 2:
                b();
                return;
            case 3:
                c();
                return;
            case 4:
                d();
                return;
            case 5:
                e2 e2Var = this.f23255c;
                v0 v0Var = ((f1) e2Var.f3328a).f22744e;
                f1.k(v0Var);
                Bundle R = v0Var.f23134n.R();
                y2 p10 = ((f1) e2Var.f3328a).p();
                AtomicReference atomicReference2 = this.f23254b;
                p10.j();
                p10.k();
                p10.x(new androidx.appcompat.view.menu.f(p10, atomicReference2, p10.z(false), R, 8, false));
                return;
            default:
                y2 p11 = ((f1) this.f23255c.f3328a).p();
                zzoo c2 = zzoo.c(k2.SGTM_CLIENT);
                AtomicReference atomicReference3 = this.f23254b;
                p11.j();
                p11.k();
                p11.x(new androidx.appcompat.view.menu.f(p11, atomicReference3, p11.z(false), c2, 9, false));
                return;
        }
    }

    public y1(e2 e2Var, AtomicReference atomicReference, int i5) {
        this.f23253a = i5;
        switch (i5) {
            case 1:
                this.f23254b = atomicReference;
                Objects.requireNonNull(e2Var);
                this.f23255c = e2Var;
                break;
            case 2:
                this.f23254b = atomicReference;
                Objects.requireNonNull(e2Var);
                this.f23255c = e2Var;
                break;
            case 3:
                this.f23254b = atomicReference;
                Objects.requireNonNull(e2Var);
                this.f23255c = e2Var;
                break;
            case 4:
                this.f23254b = atomicReference;
                Objects.requireNonNull(e2Var);
                this.f23255c = e2Var;
                break;
            default:
                this.f23254b = atomicReference;
                Objects.requireNonNull(e2Var);
                this.f23255c = e2Var;
                break;
        }
    }
}
