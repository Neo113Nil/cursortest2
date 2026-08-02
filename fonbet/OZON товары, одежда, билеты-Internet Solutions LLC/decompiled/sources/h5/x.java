package h5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import g5.C6627B;
import i5.C7009b;

/* loaded from: classes8.dex */
public final class x implements Runnable {

    /* renamed from: g, reason: collision with root package name */
    static final String f65004g = androidx.work.o.i("WorkForegroundRunnable");

    /* renamed from: a, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c<Void> f65005a = androidx.work.impl.utils.futures.c.k();

    /* renamed from: b, reason: collision with root package name */
    final Context f65006b;

    /* renamed from: c, reason: collision with root package name */
    final C6627B f65007c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.work.n f65008d;

    /* renamed from: e, reason: collision with root package name */
    final androidx.work.i f65009e;

    /* renamed from: f, reason: collision with root package name */
    final C7009b f65010f;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f65011a;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f65011a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            x xVar = x.this;
            androidx.work.impl.utils.futures.c<Void> cVar = xVar.f65005a;
            if (cVar.isCancelled()) {
                return;
            }
            try {
                androidx.work.h hVar = (androidx.work.h) this.f65011a.get();
                C6627B c6627b = xVar.f65007c;
                if (hVar == null) {
                    throw new IllegalStateException("Worker was marked important (" + c6627b.f63801c + ") but did not provide ForegroundInfo");
                }
                androidx.work.o.e().a(x.f65004g, "Updating notification for " + c6627b.f63801c);
                cVar.m(((z) xVar.f65009e).a(xVar.f65006b, xVar.f65008d.getId(), hVar));
            } catch (Throwable th2) {
                cVar.l(th2);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public x(@NonNull Context context, @NonNull C6627B c6627b, @NonNull androidx.work.n nVar, @NonNull androidx.work.i iVar, @NonNull C7009b c7009b) {
        this.f65006b = context;
        this.f65007c = c6627b;
        this.f65008d = nVar;
        this.f65009e = iVar;
        this.f65010f = c7009b;
    }

    @NonNull
    public final androidx.work.impl.utils.futures.c a() {
        return this.f65005a;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f65007c.f63815q || Build.VERSION.SDK_INT >= 31) {
            this.f65005a.j(null);
            return;
        }
        final androidx.work.impl.utils.futures.c k11 = androidx.work.impl.utils.futures.c.k();
        C7009b c7009b = this.f65010f;
        c7009b.b().execute(new Runnable() { // from class: h5.w
            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                boolean isCancelled = xVar.f65005a.isCancelled();
                androidx.work.impl.utils.futures.c cVar = k11;
                if (isCancelled) {
                    cVar.cancel(true);
                } else {
                    cVar.m(xVar.f65008d.getForegroundInfoAsync());
                }
            }
        });
        k11.a(new a(k11), c7009b.b());
    }
}
