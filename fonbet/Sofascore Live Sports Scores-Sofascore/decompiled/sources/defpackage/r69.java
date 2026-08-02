package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r69 extends au3 implements iv4 {
    public final Handler c;
    public final String d;
    public final boolean e;
    public final r69 f;

    public r69(Handler handler, String str, boolean z) {
        this.c = handler;
        this.d = str;
        this.e = z;
        this.f = z ? this : new r69(handler, str, true);
    }

    @Override // defpackage.au3
    public final boolean e0(CoroutineContext coroutineContext) {
        return (this.e && Intrinsics.c(Looper.myLooper(), this.c.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r69)) {
            return false;
        }
        r69 r69Var = (r69) obj;
        return r69Var.c == this.c && r69Var.e == this.e;
    }

    @Override // defpackage.iv4
    public final void f(long j, lj2 lj2Var) {
        yq5 yq5Var = new yq5(8, lj2Var, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(yq5Var, j)) {
            lj2Var.v(new uf8(3, this, yq5Var));
        } else {
            g0(lj2Var.e, yq5Var);
        }
    }

    @Override // defpackage.au3
    public final au3 f0(int i) {
        oea.j(i);
        return this;
    }

    @Override // defpackage.iv4
    public final q55 g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.c.postDelayed(runnable, j)) {
            return new q69(0, this, runnable);
        }
        g0(coroutineContext, runnable);
        return ged.a;
    }

    public final void g0(CoroutineContext coroutineContext, Runnable runnable) {
        bea.p(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        hs4 hs4Var = z45.a;
        hq4.c.i(coroutineContext, runnable);
    }

    public final int hashCode() {
        return (this.e ? 1231 : 1237) ^ System.identityHashCode(this.c);
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        if (this.c.post(runnable)) {
            return;
        }
        g0(coroutineContext, runnable);
    }

    @Override // defpackage.au3
    public final String toString() {
        r69 r69Var;
        String str;
        hs4 hs4Var = z45.a;
        r69 r69Var2 = rob.a;
        if (this == r69Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                r69Var = r69Var2.f;
            } catch (UnsupportedOperationException unused) {
                r69Var = null;
            }
            str = this == r69Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.d;
        if (str2 == null) {
            str2 = this.c.toString();
        }
        return this.e ? dmi.y(str2, ".immediate") : str2;
    }

    public r69(Handler handler) {
        this(handler, null, false);
    }
}
