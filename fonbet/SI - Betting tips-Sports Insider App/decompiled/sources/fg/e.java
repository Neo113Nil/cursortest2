package fg;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.t;
import eg.e1;
import eg.h0;
import eg.l;
import eg.m0;
import eg.o0;
import eg.q1;
import eg.w;
import eg.x;
import java.util.concurrent.CancellationException;
import jg.h;
import jg.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class e extends w implements h0 {

    /* renamed from: c, reason: collision with root package name */
    public final Handler f9622c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9623d;

    /* renamed from: e, reason: collision with root package name */
    public final e f9624e;

    public e(Handler handler, boolean z5) {
        this.f9622c = handler;
        this.f9623d = z5;
        this.f9624e = z5 ? this : new e(handler, true);
    }

    @Override // eg.h0
    public final o0 C(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9622c.postDelayed(runnable, j)) {
            return new o0() { // from class: fg.c
                @Override // eg.o0
                public final void b() {
                    e.this.f9622c.removeCallbacks(runnable);
                }
            };
        }
        i0(coroutineContext, runnable);
        return q1.f9213a;
    }

    @Override // eg.h0
    public final void N(long j, l lVar) {
        t tVar = new t(13, lVar, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9622c.postDelayed(tVar, j)) {
            lVar.u(new d(0, this, tVar));
        } else {
            i0(lVar.f9194e, tVar);
        }
    }

    @Override // eg.w
    public final void c0(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.f9622c.post(runnable)) {
            return;
        }
        i0(coroutineContext, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f9622c == this.f9622c && eVar.f9623d == this.f9623d;
    }

    @Override // eg.w
    public final boolean f0(CoroutineContext coroutineContext) {
        return (this.f9623d && Intrinsics.areEqual(Looper.myLooper(), this.f9622c.getLooper())) ? false : true;
    }

    @Override // eg.w
    public w h0(int i5) {
        h.a(i5);
        return this;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9622c) ^ (this.f9623d ? 1231 : 1237);
    }

    public final void i0(CoroutineContext coroutineContext, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        e1 e1Var = (e1) coroutineContext.r(x.f9237b);
        if (e1Var != null) {
            e1Var.k(cancellationException);
        }
        lg.e eVar = m0.f9201a;
        lg.d.f20063c.c0(coroutineContext, runnable);
    }

    @Override // eg.w
    public final String toString() {
        e eVar;
        String str;
        lg.e eVar2 = m0.f9201a;
        e eVar3 = q.f18523a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f9624e;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String handler = this.f9622c.toString();
        return this.f9623d ? k.l(handler, ".immediate") : handler;
    }
}
