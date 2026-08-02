package v;

import B90.C2621x;
import C.r;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import androidx.camera.core.impl.InterfaceC5084b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import v.Q;
import w.C10340H;
import w.C10348a;
import w.C10368u;
import z.C10949g;

/* loaded from: classes8.dex */
public final class Q implements androidx.camera.core.impl.H {

    /* renamed from: a, reason: collision with root package name */
    private final String f101057a;

    /* renamed from: b, reason: collision with root package name */
    private final C10368u f101058b;

    /* renamed from: c, reason: collision with root package name */
    private final B.h f101059c;

    /* renamed from: e, reason: collision with root package name */
    private C10132s f101061e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final a<C.r> f101062f;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    private final androidx.camera.core.impl.I0 f101064h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final C0 f101065i;

    /* renamed from: d, reason: collision with root package name */
    private final Object f101060d = new Object();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList f101063g = null;

    static class a<T> extends androidx.lifecycle.T<T> {

        /* renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.V f101066b;

        /* renamed from: c, reason: collision with root package name */
        private final T f101067c;

        a(T t2) {
            this.f101067c = t2;
        }

        @Override // androidx.lifecycle.T
        public final <S> void a(@NonNull androidx.lifecycle.P<S> p11, @NonNull androidx.lifecycle.W<? super S> w11) {
            throw new UnsupportedOperationException();
        }

        final void c(@NonNull androidx.lifecycle.V v11) {
            androidx.lifecycle.V v12 = this.f101066b;
            if (v12 != null) {
                b(v12);
            }
            this.f101066b = v11;
            super.a(v11, new androidx.lifecycle.W() { // from class: v.P
                @Override // androidx.lifecycle.W
                public final void onChanged(Object obj) {
                    Q.a.this.setValue(obj);
                }
            });
        }

        @Override // androidx.lifecycle.P
        public final T getValue() {
            androidx.lifecycle.V v11 = this.f101066b;
            return v11 == null ? this.f101067c : v11.getValue();
        }
    }

    public Q(@NonNull String str, @NonNull C10340H c10340h) throws C10348a {
        str.getClass();
        this.f101057a = str;
        C10368u b11 = c10340h.b(str);
        this.f101058b = b11;
        this.f101059c = new B.h(this);
        androidx.camera.core.impl.I0 a11 = androidx.camera.camera2.internal.compat.quirk.a.a(b11);
        this.f101064h = a11;
        this.f101065i = new C0(str, a11);
        this.f101062f = new a<>(C.r.a(r.b.CLOSED));
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final Set<C.A> a() {
        return x.c.a(this.f101058b).c();
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final String b() {
        return this.f101057a;
    }

    @Override // C.InterfaceC2694n
    @NonNull
    public final androidx.lifecycle.P<C.r> c() {
        return this.f101062f;
    }

    @Override // androidx.camera.core.impl.H
    public final void d(@NonNull Executor executor, @NonNull AbstractC5111p abstractC5111p) {
        synchronized (this.f101060d) {
            try {
                C10132s c10132s = this.f101061e;
                if (c10132s != null) {
                    c10132s.f101339c.execute(new W.D(c10132s, executor, abstractC5111p, 1));
                } else {
                    if (this.f101063g == null) {
                        this.f101063g = new ArrayList();
                    }
                    this.f101063g.add(new Pair(abstractC5111p, executor));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.InterfaceC2694n
    public final int e() {
        Integer num = (Integer) this.f101058b.a(CameraCharacteristics.LENS_FACING);
        x2.i.a("Unable to get the lens facing of the camera.", num != null);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(T7.E.a(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    @Override // androidx.camera.core.impl.H
    public final void f(@NonNull final AbstractC5111p abstractC5111p) {
        synchronized (this.f101060d) {
            try {
                final C10132s c10132s = this.f101061e;
                if (c10132s != null) {
                    c10132s.f101339c.execute(new Runnable() { // from class: v.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            C10132s.q(C10132s.this, abstractC5111p);
                        }
                    });
                    return;
                }
                ArrayList arrayList = this.f101063g;
                if (arrayList == null) {
                    return;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC5111p) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.InterfaceC2694n
    public final int g(int i11) {
        Integer num = (Integer) this.f101058b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return G.c.b(G.c.f(i11), num.intValue(), 1 == e());
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final InterfaceC5084b0 h() {
        return this.f101065i;
    }

    @Override // C.InterfaceC2694n
    public final int i() {
        return g(0);
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final List<Size> j(int i11) {
        Size[] a11 = this.f101058b.b().a(i11);
        return a11 != null ? Arrays.asList(a11) : Collections.EMPTY_LIST;
    }

    @Override // C.InterfaceC2694n
    public final boolean k() {
        C10368u c10368u = this.f101058b;
        Objects.requireNonNull(c10368u);
        return C10949g.a(new C2621x(c10368u));
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final androidx.camera.core.impl.I0 l() {
        return this.f101064h;
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final List<Size> m(int i11) {
        Size[] c11 = this.f101058b.b().c(i11);
        return c11 != null ? Arrays.asList(c11) : Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.core.impl.H
    public final boolean n() {
        int[] iArr = (int[]) this.f101058b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i11 : iArr) {
                if (i11 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.H
    @NonNull
    public final androidx.camera.core.impl.Y0 p() {
        Integer num = (Integer) this.f101058b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? androidx.camera.core.impl.Y0.UPTIME : androidx.camera.core.impl.Y0.REALTIME;
    }

    @Override // C.InterfaceC2694n
    @NonNull
    public final String q() {
        Integer num = (Integer) this.f101058b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @NonNull
    public final B.h r() {
        return this.f101059c;
    }

    @NonNull
    public final C10368u s() {
        return this.f101058b;
    }

    final void t(@NonNull C10132s c10132s) {
        synchronized (this.f101060d) {
            try {
                this.f101061e = c10132s;
                ArrayList arrayList = this.f101063g;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C10132s c10132s2 = this.f101061e;
                        Executor executor = (Executor) pair.second;
                        AbstractC5111p abstractC5111p = (AbstractC5111p) pair.first;
                        c10132s2.getClass();
                        c10132s2.f101339c.execute(new W.D(c10132s2, executor, abstractC5111p, 1));
                    }
                    this.f101063g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Integer num = (Integer) this.f101058b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        C.S.e("Camera2CameraInfo", "Device Level: " + (intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? intValue != 4 ? Ej.b.a(intValue, "Unknown value: ") : "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL" : "INFO_SUPPORTED_HARDWARE_LEVEL_3" : "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY" : "INFO_SUPPORTED_HARDWARE_LEVEL_FULL" : "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED"));
    }

    final void u(@NonNull androidx.lifecycle.V v11) {
        this.f101062f.c(v11);
    }
}
