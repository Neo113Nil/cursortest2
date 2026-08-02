package androidx.lifecycle;

import Ph.C1452g0;
import Ph.M0;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2181f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f20386b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20387c;

    /* renamed from: a, reason: collision with root package name */
    public boolean f20385a = true;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f20388d = new ArrayDeque();

    public static final void d(C2181f c2181f, Runnable runnable) {
        c2181f.f(runnable);
    }

    public final boolean b() {
        return this.f20386b || !this.f20385a;
    }

    public final void c(CoroutineContext context, final Runnable runnable) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        M0 e22 = C1452g0.c().e2();
        if (e22.a2(context) || b()) {
            e22.Y1(context, new Runnable() { // from class: androidx.lifecycle.e
                @Override // java.lang.Runnable
                public final void run() {
                    C2181f.d(C2181f.this, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (this.f20387c) {
            return;
        }
        try {
            this.f20387c = true;
            while (!this.f20388d.isEmpty() && b()) {
                Runnable runnable = (Runnable) this.f20388d.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.f20387c = false;
        }
    }

    public final void f(Runnable runnable) {
        if (!this.f20388d.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        e();
    }

    public final void g() {
        this.f20386b = true;
        e();
    }

    public final void h() {
        this.f20385a = true;
    }

    public final void i() {
        if (this.f20385a) {
            if (this.f20386b) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.f20385a = false;
            e();
        }
    }
}
