package r;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import r.C9088a;
import r.o;

/* loaded from: classes8.dex */
public class p extends w0 {

    /* renamed from: a, reason: collision with root package name */
    private Executor f82347a;

    /* renamed from: b, reason: collision with root package name */
    private o.a f82348b;

    /* renamed from: c, reason: collision with root package name */
    private o.d f82349c;

    /* renamed from: d, reason: collision with root package name */
    private o.c f82350d;

    /* renamed from: e, reason: collision with root package name */
    private C9088a f82351e;

    /* renamed from: f, reason: collision with root package name */
    private q f82352f;

    /* renamed from: g, reason: collision with root package name */
    private DialogInterface.OnClickListener f82353g;

    /* renamed from: h, reason: collision with root package name */
    private String f82354h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f82356j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f82357k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f82358l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f82359m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f82360n;

    /* renamed from: o, reason: collision with root package name */
    private V<o.b> f82361o;

    /* renamed from: p, reason: collision with root package name */
    private V<C9090c> f82362p;

    /* renamed from: q, reason: collision with root package name */
    private V<CharSequence> f82363q;

    /* renamed from: r, reason: collision with root package name */
    private V<Boolean> f82364r;

    /* renamed from: s, reason: collision with root package name */
    private V<Boolean> f82365s;

    /* renamed from: u, reason: collision with root package name */
    private V<Boolean> f82367u;

    /* renamed from: w, reason: collision with root package name */
    private V<Integer> f82369w;

    /* renamed from: x, reason: collision with root package name */
    private V<CharSequence> f82370x;

    /* renamed from: i, reason: collision with root package name */
    private int f82355i = 0;

    /* renamed from: t, reason: collision with root package name */
    private boolean f82366t = true;

    /* renamed from: v, reason: collision with root package name */
    private int f82368v = 0;

    final class a extends o.a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends C9088a.d {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<p> f82371a;

        b(p pVar) {
            this.f82371a = new WeakReference<>(pVar);
        }

        @Override // r.C9088a.d
        final void a(int i11, CharSequence charSequence) {
            WeakReference<p> weakReference = this.f82371a;
            if (weakReference.get() == null || weakReference.get().y0() || !weakReference.get().w0()) {
                return;
            }
            weakReference.get().G0(new C9090c(i11, charSequence));
        }

        @Override // r.C9088a.d
        final void b() {
            WeakReference<p> weakReference = this.f82371a;
            if (weakReference.get() == null || !weakReference.get().w0()) {
                return;
            }
            weakReference.get().H0(true);
        }

        @Override // r.C9088a.d
        final void c(@NonNull o.b bVar) {
            WeakReference<p> weakReference = this.f82371a;
            if (weakReference.get() == null || !weakReference.get().w0()) {
                return;
            }
            int i11 = -1;
            if (bVar.a() == -1) {
                o.c b11 = bVar.b();
                int d02 = weakReference.get().d0();
                if ((d02 & 32767) != 0 && !C9089b.b(d02)) {
                    i11 = 2;
                }
                bVar = new o.b(b11, i11);
            }
            weakReference.get().J0(bVar);
        }

        final void d(CharSequence charSequence) {
            WeakReference<p> weakReference = this.f82371a;
            if (weakReference.get() != null) {
                weakReference.get().I0(charSequence);
            }
        }
    }

    private static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f82372a = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f82372a.post(runnable);
        }
    }

    private static class d implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final WeakReference<p> f82373a;

        d(p pVar) {
            this.f82373a = new WeakReference<>(pVar);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            WeakReference<p> weakReference = this.f82373a;
            if (weakReference.get() != null) {
                weakReference.get().X0(true);
            }
        }
    }

    private static <T> void b1(V<T> v11, T t2) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            v11.setValue(t2);
        } else {
            v11.postValue(t2);
        }
    }

    @NonNull
    final V A0() {
        if (this.f82367u == null) {
            this.f82367u = new V<>();
        }
        return this.f82367u;
    }

    final boolean B0() {
        return this.f82366t;
    }

    final boolean C0() {
        return this.f82360n;
    }

    @NonNull
    final V D0() {
        if (this.f82365s == null) {
            this.f82365s = new V<>();
        }
        return this.f82365s;
    }

    final boolean E0() {
        return this.f82356j;
    }

    final void F0() {
        this.f82348b = null;
    }

    final void G0(C9090c c9090c) {
        if (this.f82362p == null) {
            this.f82362p = new V<>();
        }
        b1(this.f82362p, c9090c);
    }

    final void H0(boolean z11) {
        if (this.f82364r == null) {
            this.f82364r = new V<>();
        }
        b1(this.f82364r, Boolean.valueOf(z11));
    }

    final void I0(CharSequence charSequence) {
        if (this.f82363q == null) {
            this.f82363q = new V<>();
        }
        b1(this.f82363q, charSequence);
    }

    final void J0(o.b bVar) {
        if (this.f82361o == null) {
            this.f82361o = new V<>();
        }
        b1(this.f82361o, bVar);
    }

    final void K0(boolean z11) {
        this.f82357k = z11;
    }

    final void L0(int i11) {
        this.f82355i = i11;
    }

    final void M0(@NonNull o.a aVar) {
        this.f82348b = aVar;
    }

    final void N0(@NonNull Executor executor) {
        this.f82347a = executor;
    }

    final void O0(boolean z11) {
        this.f82358l = z11;
    }

    final void P0(o.c cVar) {
        this.f82350d = cVar;
    }

    final void Q0(boolean z11) {
        this.f82359m = z11;
    }

    final void R0(boolean z11) {
        if (this.f82367u == null) {
            this.f82367u = new V<>();
        }
        b1(this.f82367u, Boolean.valueOf(z11));
    }

    final void S0(boolean z11) {
        this.f82366t = z11;
    }

    final void T0(@NonNull CharSequence charSequence) {
        if (this.f82370x == null) {
            this.f82370x = new V<>();
        }
        b1(this.f82370x, charSequence);
    }

    final void U0(int i11) {
        this.f82368v = i11;
    }

    final void V0(int i11) {
        if (this.f82369w == null) {
            this.f82369w = new V<>();
        }
        b1(this.f82369w, Integer.valueOf(i11));
    }

    final void W0(boolean z11) {
        this.f82360n = z11;
    }

    final void X0(boolean z11) {
        if (this.f82365s == null) {
            this.f82365s = new V<>();
        }
        b1(this.f82365s, Boolean.valueOf(z11));
    }

    final void Y0(String str) {
        this.f82354h = str;
    }

    final void Z0(o.d dVar) {
        this.f82349c = dVar;
    }

    final void a1(boolean z11) {
        this.f82356j = z11;
    }

    final int d0() {
        o.d dVar = this.f82349c;
        if (dVar != null) {
            return C9089b.a(dVar, this.f82350d);
        }
        return 0;
    }

    @NonNull
    final C9088a e0() {
        if (this.f82351e == null) {
            this.f82351e = new C9088a(new b(this));
        }
        return this.f82351e;
    }

    @NonNull
    final V<C9090c> f0() {
        if (this.f82362p == null) {
            this.f82362p = new V<>();
        }
        return this.f82362p;
    }

    @NonNull
    final V g0() {
        if (this.f82363q == null) {
            this.f82363q = new V<>();
        }
        return this.f82363q;
    }

    @NonNull
    final V h0() {
        if (this.f82361o == null) {
            this.f82361o = new V<>();
        }
        return this.f82361o;
    }

    final int i0() {
        return this.f82355i;
    }

    @NonNull
    final q j0() {
        if (this.f82352f == null) {
            this.f82352f = new q();
        }
        return this.f82352f;
    }

    @NonNull
    final o.a k0() {
        if (this.f82348b == null) {
            this.f82348b = new a();
        }
        return this.f82348b;
    }

    @NonNull
    final Executor l0() {
        Executor executor = this.f82347a;
        return executor != null ? executor : new c();
    }

    final o.c m0() {
        return this.f82350d;
    }

    @NonNull
    final V n0() {
        if (this.f82370x == null) {
            this.f82370x = new V<>();
        }
        return this.f82370x;
    }

    final int p0() {
        return this.f82368v;
    }

    @NonNull
    final V q0() {
        if (this.f82369w == null) {
            this.f82369w = new V<>();
        }
        return this.f82369w;
    }

    @NonNull
    final DialogInterface.OnClickListener r0() {
        if (this.f82353g == null) {
            this.f82353g = new d(this);
        }
        return this.f82353g;
    }

    final CharSequence s0() {
        String str = this.f82354h;
        if (str != null) {
            return str;
        }
        o.d dVar = this.f82349c;
        if (dVar != null) {
            return dVar.b();
        }
        return null;
    }

    final CharSequence t0() {
        o.d dVar = this.f82349c;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    final CharSequence u0() {
        o.d dVar = this.f82349c;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @NonNull
    final V v0() {
        if (this.f82364r == null) {
            this.f82364r = new V<>();
        }
        return this.f82364r;
    }

    final boolean w0() {
        return this.f82357k;
    }

    final boolean x0() {
        o.d dVar = this.f82349c;
        return dVar == null || dVar.e();
    }

    final boolean y0() {
        return this.f82358l;
    }

    final boolean z0() {
        return this.f82359m;
    }
}
