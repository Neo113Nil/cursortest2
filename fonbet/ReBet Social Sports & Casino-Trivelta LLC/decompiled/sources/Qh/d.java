package Qh;

import Ph.C1452g0;
import Ph.F0;
import Ph.InterfaceC1456i0;
import Ph.InterfaceC1465n;
import Ph.P0;
import Ph.Z;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.DurationKt;

/* loaded from: classes5.dex */
public final class d extends e implements Z {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f9755b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9756c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9757d;

    /* renamed from: e, reason: collision with root package name */
    public final d f9758e;

    public d(Handler handler, String str, boolean z10) {
        super(null);
        this.f9755b = handler;
        this.f9756c = str;
        this.f9757d = z10;
        this.f9758e = z10 ? this : new d(handler, str, true);
    }

    public static final void l2(d dVar, Runnable runnable) {
        dVar.f9755b.removeCallbacks(runnable);
    }

    public static final void m2(InterfaceC1465n interfaceC1465n, d dVar) {
        interfaceC1465n.b(dVar, Unit.INSTANCE);
    }

    public static final Unit n2(d dVar, Runnable runnable, Throwable th2) {
        dVar.f9755b.removeCallbacks(runnable);
        return Unit.INSTANCE;
    }

    @Override // Ph.Z
    public InterfaceC1456i0 J(long j10, final Runnable runnable, CoroutineContext coroutineContext) {
        if (this.f9755b.postDelayed(runnable, RangesKt.coerceAtMost(j10, DurationKt.MAX_MILLIS))) {
            return new InterfaceC1456i0() { // from class: Qh.a
                @Override // Ph.InterfaceC1456i0
                public final void dispose() {
                    d.l2(d.this, runnable);
                }
            };
        }
        j2(coroutineContext, runnable);
        return P0.f9046a;
    }

    @Override // Ph.L
    public void Y1(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f9755b.post(runnable)) {
            return;
        }
        j2(coroutineContext, runnable);
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext coroutineContext) {
        return (this.f9757d && Intrinsics.areEqual(Looper.myLooper(), this.f9755b.getLooper())) ? false : true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f9755b == this.f9755b && dVar.f9757d == this.f9757d;
    }

    public int hashCode() {
        return System.identityHashCode(this.f9755b) ^ (this.f9757d ? 1231 : 1237);
    }

    public final void j2(CoroutineContext coroutineContext, Runnable runnable) {
        F0.d(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1452g0.b().Y1(coroutineContext, runnable);
    }

    @Override // Ph.M0
    /* renamed from: k2, reason: merged with bridge method [inline-methods] */
    public d e2() {
        return this.f9758e;
    }

    @Override // Ph.M0, Ph.L
    public String toString() {
        String f22 = f2();
        if (f22 != null) {
            return f22;
        }
        String str = this.f9756c;
        if (str == null) {
            str = this.f9755b.toString();
        }
        if (!this.f9757d) {
            return str;
        }
        return str + ".immediate";
    }

    @Override // Ph.Z
    public void w0(long j10, final InterfaceC1465n interfaceC1465n) {
        final Runnable runnable = new Runnable() { // from class: Qh.b
            @Override // java.lang.Runnable
            public final void run() {
                d.m2(InterfaceC1465n.this, this);
            }
        };
        if (this.f9755b.postDelayed(runnable, RangesKt.coerceAtMost(j10, DurationKt.MAX_MILLIS))) {
            interfaceC1465n.c(new Function1() { // from class: Qh.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit n22;
                    n22 = d.n2(d.this, runnable, (Throwable) obj);
                    return n22;
                }
            });
        } else {
            j2(interfaceC1465n.get$context(), runnable);
        }
    }

    public /* synthetic */ d(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
