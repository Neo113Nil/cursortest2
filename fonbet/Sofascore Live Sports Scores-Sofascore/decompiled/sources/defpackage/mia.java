package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oia b;

    public /* synthetic */ mia(oia oiaVar, int i) {
        this.a = i;
        this.b = oiaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oia oiaVar;
        boolean z;
        long nextLong;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        oiaVar = this.b;
                        if (oiaVar.d != 6) {
                            oiaVar.d = 6;
                        } else {
                            z2 = false;
                        }
                    } finally {
                    }
                }
                if (z2) {
                    ((ood) oiaVar.c.a).p(xei.m.h("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        oia oiaVar2 = this.b;
                        oiaVar2.f = null;
                        int i = oiaVar2.d;
                        if (i == 2) {
                            oiaVar2.d = 4;
                            oiaVar2.e = oiaVar2.a.schedule(oiaVar2.g, oiaVar2.j, TimeUnit.NANOSECONDS);
                            z = true;
                        } else {
                            if (i == 3) {
                                oiaVar2.f = oiaVar2.a.schedule(oiaVar2.h, oiaVar2.i - oiaVar2.b.a(), TimeUnit.NANOSECONDS);
                                this.b.d = 2;
                            }
                            z = false;
                        }
                    } finally {
                    }
                }
                if (z) {
                    t9d t9dVar = this.b.c;
                    ood oodVar = (ood) t9dVar.a;
                    nia niaVar = new nia(t9dVar);
                    f35 f35Var = f35.a;
                    synchronized (oodVar.k) {
                        try {
                            z1a.E(oodVar.i != null);
                            if (oodVar.y) {
                                zei j = oodVar.j();
                                Logger logger = ch9.g;
                                try {
                                    f35Var.execute(new bh9(niaVar, j));
                                } catch (Throwable th) {
                                    ch9.g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                }
                                return;
                            }
                            ch9 ch9Var = oodVar.x;
                            if (ch9Var != null) {
                                nextLong = 0;
                                z2 = false;
                            } else {
                                nextLong = oodVar.d.nextLong();
                                jfi jfiVar = (jfi) oodVar.e.get();
                                jfiVar.b();
                                ch9 ch9Var2 = new ch9(nextLong, jfiVar);
                                oodVar.x = ch9Var2;
                                oodVar.L.getClass();
                                ch9Var = ch9Var2;
                            }
                            if (z2) {
                                oodVar.i.g((int) (nextLong >>> 32), (int) nextLong, false);
                            }
                            synchronized (ch9Var) {
                                try {
                                    if (!ch9Var.d) {
                                        ch9Var.c.put(niaVar, f35Var);
                                        return;
                                    }
                                    zei zeiVar = ch9Var.e;
                                    bh9 bh9Var = zeiVar != null ? new bh9(niaVar, zeiVar) : new bh9(niaVar, ch9Var.f);
                                    try {
                                        f35Var.execute(bh9Var);
                                        return;
                                    } catch (Throwable th2) {
                                        ch9.g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
