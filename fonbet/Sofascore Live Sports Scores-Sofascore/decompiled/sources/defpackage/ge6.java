package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ge6 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public ge6(Context context, Looper looper) {
        this.c = new nzk(context.getApplicationContext());
        this.d = new zqi(new Handler(looper, null));
        this.e = new zqi(new Handler(Looper.getMainLooper(), null));
    }

    public static IOException a(ge6 ge6Var, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            ge6Var.h(iOException);
        }
        if (z3) {
            f26 f26Var = ((pof) ge6Var.c).d;
            if (iOException != null) {
                f26Var.getClass();
            } else {
                f26Var.getClass();
            }
        }
        if (z2) {
            f26 f26Var2 = ((pof) ge6Var.c).d;
            if (iOException != null) {
                f26Var2.getClass();
            } else {
                f26Var2.getClass();
            }
        }
        return ((pof) ge6Var.c).h(ge6Var, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public ee6 b(qzf qzfVar, boolean z) {
        qzfVar.getClass();
        this.a = z;
        yzf yzfVar = qzfVar.d;
        yzfVar.getClass();
        long contentLength = yzfVar.contentLength();
        ((pof) this.c).d.getClass();
        return new ee6(this, ((ie6) this.e).b(qzfVar, contentLength), contentLength, false);
    }

    public qof c() {
        he6 j = ((ie6) this.e).j();
        qof qofVar = j instanceof qof ? (qof) j : null;
        if (qofVar != null) {
            return qofVar;
        }
        a70.r("no connection for CONNECT tunnels");
        return null;
    }

    public hpf d(d2g d2gVar) {
        ge6 ge6Var;
        String a;
        long f;
        try {
            a = d2gVar.f.a("Content-Type");
            if (a == null) {
                a = null;
            }
            f = ((ie6) this.e).f(d2gVar);
            ge6Var = this;
        } catch (IOException e) {
            e = e;
            ge6Var = this;
        }
        try {
            return new hpf(a, f, new lof(new fe6(ge6Var, ((ie6) this.e).d(d2gVar), f, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((pof) ge6Var.c).d.getClass();
            ge6Var.h(iOException);
            throw iOException;
        }
    }

    public void e(final boolean z, final boolean z2) {
        zqi zqiVar = (zqi) this.d;
        int i = 1;
        if (z && z2) {
            zqiVar.e(new u12(i, this, z, z2));
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        zqi zqiVar2 = (zqi) this.e;
        zqiVar2.a.postDelayed(new ecg(28, this, atomicBoolean), 1000L);
        zqiVar.e(new Runnable() { // from class: mzk
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(false);
                ((nzk) ge6.this.c).a(z, z2);
            }
        });
    }

    public b2g f(boolean z) {
        try {
            b2g g = ((ie6) this.e).g(z);
            if (g == null) {
                return g;
            }
            g.n = this;
            return g;
        } catch (IOException e) {
            ((pof) this.c).d.getClass();
            h(e);
            throw e;
        }
    }

    public void g(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        if (this.a) {
            e(true, z);
        }
    }

    public void h(IOException iOException) {
        this.b = true;
        ((ie6) this.e).j().b((pof) this.c, iOException);
    }

    public fp4 i() {
        pof pofVar = (pof) this.c;
        if (pofVar.j) {
            a70.r("Check failed.");
            return null;
        }
        pofVar.j = true;
        pofVar.e.i();
        synchronized (pofVar) {
            if (pofVar.r == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (pofVar.n || pofVar.o) {
                throw new IllegalStateException("Check failed.");
            }
            if (pofVar.l) {
                throw new IllegalStateException("Check failed.");
            }
            if (!pofVar.m) {
                throw new IllegalStateException("Check failed.");
            }
            pofVar.m = false;
            pofVar.n = true;
            pofVar.o = true;
            Unit unit = Unit.a;
        }
        he6 j = ((ie6) this.e).j();
        j.getClass();
        qof qofVar = (qof) j;
        qofVar.e.setSoTimeout(0);
        qofVar.a();
        return new fp4(this);
    }

    public ge6(pof pofVar, je6 je6Var, ie6 ie6Var) {
        je6Var.getClass();
        this.c = pofVar;
        this.d = je6Var;
        this.e = ie6Var;
    }

    public ge6(Context context, String str, ffb ffbVar, boolean z, boolean z2) {
        context.getClass();
        ffbVar.getClass();
        this.c = context;
        this.d = str;
        this.e = ffbVar;
        this.a = z;
        this.b = z2;
    }
}
