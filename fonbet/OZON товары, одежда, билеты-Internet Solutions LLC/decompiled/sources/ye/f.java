package ye;

import De.s;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10737n;
import xe.E0;
import xe.InterfaceC10724g0;
import xe.L0;
import xe.O0;

/* loaded from: classes.dex */
public final class f extends g {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f106584b;

    /* renamed from: c, reason: collision with root package name */
    private final String f106585c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f106586d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final f f106587e;

    private f(Handler handler, String str, boolean z11) {
        super(0);
        this.f106584b = handler;
        this.f106585c = str;
        this.f106586d = z11;
        this.f106587e = z11 ? this : new f(handler, str, true);
    }

    public static Unit D0(f fVar, e eVar) {
        fVar.f106584b.removeCallbacks(eVar);
        return Unit.f71690a;
    }

    private final void E0(CoroutineContext coroutineContext, Runnable runnable) {
        E0.b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b.f10879b.q(coroutineContext, runnable);
    }

    public static void z(f fVar, Runnable runnable) {
        fVar.f106584b.removeCallbacks(runnable);
    }

    public final f H0() {
        return this.f106587e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f106584b == this.f106584b && fVar.f106586d == this.f106586d;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f106584b) ^ (this.f106586d ? 1231 : 1237);
    }

    @Override // ye.g, xe.W
    @NotNull
    public final InterfaceC10724g0 k(long j11, @NotNull final Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        if (j11 > 4611686018427387903L) {
            j11 = 4611686018427387903L;
        }
        if (this.f106584b.postDelayed(runnable, j11)) {
            return new InterfaceC10724g0() { // from class: ye.c
                @Override // xe.InterfaceC10724g0
                public final void dispose() {
                    f.z(f.this, runnable);
                }
            };
        }
        E0(coroutineContext, runnable);
        return O0.f105413a;
    }

    @Override // xe.W
    public final void o(long j11, @NotNull C10737n c10737n) {
        final e eVar = new e(c10737n, this);
        if (j11 > 4611686018427387903L) {
            j11 = 4611686018427387903L;
        }
        if (this.f106584b.postDelayed(eVar, j11)) {
            c10737n.q(new Function1() { // from class: ye.d
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.D0(f.this, eVar);
                }
            });
        } else {
            E0(c10737n.getContext(), eVar);
        }
    }

    @Override // xe.I
    public final void q(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (this.f106584b.post(runnable)) {
            return;
        }
        E0(coroutineContext, runnable);
    }

    @Override // xe.I
    public final boolean t(@NotNull CoroutineContext coroutineContext) {
        return (this.f106586d && Intrinsics.d(Looper.myLooper(), this.f106584b.getLooper())) ? false : true;
    }

    @Override // xe.L0, xe.I
    @NotNull
    public final String toString() {
        L0 l02;
        String str;
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l03 = s.f6650a;
        if (this == l03) {
            str = "Dispatchers.Main";
        } else {
            try {
                l02 = l03.x();
            } catch (UnsupportedOperationException unused) {
                l02 = null;
            }
            str = this == l02 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f106585c;
        if (str2 == null) {
            str2 = this.f106584b.toString();
        }
        return this.f106586d ? U7.d.e(str2, ".immediate") : str2;
    }

    @Override // xe.L0
    public final L0 x() {
        return this.f106587e;
    }

    public f(Handler handler) {
        this(handler, null, false);
    }

    public f(@NotNull Handler handler, String str) {
        this(handler, str, false);
    }
}
