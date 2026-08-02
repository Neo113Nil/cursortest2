package defpackage;

import com.google.protobuf.MessageLite;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ex2 extends wkn {
    public static final Logger E = Logger.getLogger(ex2.class.getName());
    public static final double F;
    public boolean A;
    public final ggf B;
    public final ScheduledExecutorService C;
    public om4 D = om4.d;
    public final ujg p;
    public final Executor q;
    public final boolean r;
    public final x6k s;
    public final bq3 t;
    public volatile ScheduledFuture u;
    public final boolean v;
    public jh2 w;
    public yx2 x;
    public volatile boolean y;
    public boolean z;

    static {
        "gzip".getBytes(Charset.forName(C.ASCII_NAME));
        F = 1.0E9d;
    }

    public ex2(ujg ujgVar, Executor executor, jh2 jh2Var, ggf ggfVar, ScheduledExecutorService scheduledExecutorService, x6k x6kVar) {
        gh3 gh3Var = gh3.b;
        this.p = ujgVar;
        Object obj = ujgVar.b;
        System.identityHashCode(this);
        jde.a.getClass();
        if (executor == f35.a) {
            this.q = new w5h();
            this.r = true;
        } else {
            this.q = new k6h(executor);
            this.r = false;
        }
        this.s = x6kVar;
        this.t = bq3.b();
        this.v = true;
        this.w = jh2Var;
        this.B = ggfVar;
        this.C = scheduledExecutorService;
    }

    @Override // defpackage.wkn
    public final void D() {
        jde.c();
        try {
            jde.a();
            z1a.D("Not started", this.x != null);
            z1a.D("call was cancelled", !this.z);
            z1a.D("call already half-closed", !this.A);
            this.A = true;
            this.x.t();
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wkn
    public final void L() {
        jde.c();
        try {
            jde.a();
            z1a.D("Not started", this.x != null);
            this.x.H();
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wkn
    public final void N(Object obj) {
        jde.c();
        try {
            jde.a();
            W(obj);
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.wkn
    public final void P(c5n c5nVar, qic qicVar) {
        jde.c();
        try {
            jde.a();
            X(c5nVar, qicVar);
            jde.a.getClass();
        } catch (Throwable th) {
            try {
                jde.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void U(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            E.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.z) {
            return;
        }
        this.z = true;
        try {
            if (this.x != null) {
                xei xeiVar = xei.f;
                xei h = str != null ? xeiVar.h(str) : xeiVar.h("Call cancelled without message");
                if (th != null) {
                    h = h.g(th);
                }
                this.x.l(h);
            }
            V();
        } catch (Throwable th2) {
            V();
            throw th2;
        }
    }

    public final void V() {
        this.t.getClass();
        ScheduledFuture scheduledFuture = this.u;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void W(Object obj) {
        z1a.D("Not started", this.x != null);
        z1a.D("call was cancelled", !this.z);
        z1a.D("call was half-closed", !this.A);
        try {
            yx2 yx2Var = this.x;
            if (yx2Var instanceof grb) {
                ((grb) yx2Var).n(obj);
            } else {
                yx2Var.k(new zef((MessageLite) obj, ((aff) this.p.d).a));
            }
            if (this.v) {
                return;
            }
            this.x.flush();
        } catch (Error e) {
            this.x.l(xei.f.h("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.x.l(xei.f.g(e2).h("Failed to stream message"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0059, code lost:
    
        if ((r14.a - r13.a) < 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(c5n c5nVar, qic qicVar) {
        ih2 ih2Var;
        long j;
        jh2 jh2Var;
        yx2 grbVar;
        yx2 yx2Var;
        mx9 mx9Var = mx9.b;
        int i = 0;
        z1a.D("Already started", this.x == null);
        z1a.D("call was cancelled", !this.z);
        this.t.getClass();
        jh2 jh2Var2 = this.w;
        ih2 ih2Var2 = wrb.g;
        wrb wrbVar = (wrb) jh2Var2.a(ih2Var2);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (wrbVar == null) {
            ih2Var = ih2Var2;
            j = 0;
        } else {
            Integer num = wrbVar.d;
            Integer num2 = wrbVar.c;
            Long l = wrbVar.a;
            if (l != null) {
                long longValue = l.longValue();
                if (timeUnit == null) {
                    yhk.s("units");
                    return;
                }
                hl4 hl4Var = new hl4(longValue);
                jh2 jh2Var3 = this.w;
                hl4 hl4Var2 = jh2Var3.a;
                ih2Var = ih2Var2;
                if (hl4Var2 != null) {
                    j = 0;
                } else {
                    j = 0;
                }
                jh2Var3.getClass();
                nc3 b = jh2.b(jh2Var3);
                b.a = hl4Var;
                this.w = new jh2(b);
            } else {
                ih2Var = ih2Var2;
                j = 0;
            }
            Boolean bool = wrbVar.b;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                jh2 jh2Var4 = this.w;
                jh2Var4.getClass();
                if (booleanValue) {
                    nc3 b2 = jh2.b(jh2Var4);
                    b2.e = Boolean.TRUE;
                    jh2Var = new jh2(b2);
                } else {
                    nc3 b3 = jh2.b(jh2Var4);
                    b3.e = Boolean.FALSE;
                    jh2Var = new jh2(b3);
                }
                this.w = jh2Var;
            }
            if (num2 != null) {
                jh2 jh2Var5 = this.w;
                Integer num3 = jh2Var5.f;
                if (num3 != null) {
                    int min = Math.min(num3.intValue(), num2.intValue());
                    z1a.o(min, "invalid maxsize %s", min >= 0);
                    nc3 b4 = jh2.b(jh2Var5);
                    b4.f = Integer.valueOf(min);
                    this.w = new jh2(b4);
                } else {
                    int intValue = num2.intValue();
                    z1a.o(intValue, "invalid maxsize %s", intValue >= 0);
                    nc3 b5 = jh2.b(jh2Var5);
                    b5.f = num2;
                    this.w = new jh2(b5);
                }
            }
            if (num != null) {
                jh2 jh2Var6 = this.w;
                Integer num4 = jh2Var6.g;
                if (num4 != null) {
                    int min2 = Math.min(num4.intValue(), num.intValue());
                    z1a.o(min2, "invalid maxsize %s", min2 >= 0);
                    nc3 b6 = jh2.b(jh2Var6);
                    b6.g = Integer.valueOf(min2);
                    this.w = new jh2(b6);
                } else {
                    int intValue2 = num.intValue();
                    z1a.o(intValue2, "invalid maxsize %s", intValue2 >= 0);
                    nc3 b7 = jh2.b(jh2Var6);
                    b7.g = num;
                    this.w = new jh2(b7);
                }
            }
        }
        this.w.getClass();
        om4 om4Var = this.D;
        qicVar.a(n49.h);
        qicVar.a(n49.d);
        mic micVar = n49.e;
        qicVar.a(micVar);
        byte[] bArr = om4Var.b;
        if (bArr.length != 0) {
            qicVar.e(micVar, bArr);
        }
        qicVar.a(n49.f);
        qicVar.a(n49.g);
        hl4 hl4Var3 = this.w.a;
        this.t.getClass();
        hl4 hl4Var4 = hl4Var3 == null ? null : hl4Var3;
        if (hl4Var4 == null || !hl4Var4.a()) {
            this.t.getClass();
            hl4 hl4Var5 = this.w.a;
            Logger logger = E;
            if (logger.isLoggable(Level.FINE) && hl4Var4 != null && hl4Var4.equals(null)) {
                long max = Math.max(j, hl4Var4.b());
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder(vxd.m("Call timeout set to '", max, "' ns, due to context deadline."));
                if (hl4Var5 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(" Explicit call timeout was '" + hl4Var5.b() + "' ns.");
                }
                logger.fine(sb.toString());
            }
            ggf ggfVar = this.B;
            ujg ujgVar = this.p;
            jh2 jh2Var7 = this.w;
            bq3 bq3Var = this.t;
            if (((qrb) ggfVar.a).W) {
                wrb wrbVar2 = (wrb) jh2Var7.a(ih2Var);
                grbVar = new grb(ggfVar, ujgVar, qicVar, jh2Var7, wrbVar2 == null ? null : wrbVar2.e, wrbVar2 == null ? null : wrbVar2.f, bq3Var);
            } else {
                dy2 e = ggfVar.e(new kge(ujgVar, qicVar, jh2Var7));
                bq3 a = bq3Var.a();
                try {
                    grbVar = e.d(ujgVar, qicVar, jh2Var7, n49.c(jh2Var7, qicVar, 0, false));
                } finally {
                    bq3Var.c(a);
                }
            }
            yx2Var = grbVar;
            this.x = yx2Var;
        } else {
            cy2[] c = n49.c(this.w, qicVar, 0, false);
            hl4 hl4Var6 = this.w.a;
            this.t.getClass();
            String str = hl4Var6 == null ? "Context" : "CallOptions";
            Long l2 = (Long) this.w.a(cy2.a);
            double b8 = hl4Var4.b();
            double d = F;
            yx2Var = new ln6(xei.h.h(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(b8 / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), zx2.a, c);
            this.x = yx2Var;
        }
        if (this.r) {
            yx2Var.o();
        }
        this.w.getClass();
        Integer num5 = this.w.f;
        if (num5 != null) {
            this.x.m(num5.intValue());
        }
        Integer num6 = this.w.g;
        if (num6 != null) {
            this.x.d(num6.intValue());
        }
        if (hl4Var4 != null) {
            this.x.s(hl4Var4);
        }
        this.x.c(mx9Var);
        this.x.r(this.D);
        ((sjb) this.s.b).i();
        System.currentTimeMillis();
        this.x.w(new hcc(this, c5nVar));
        this.t.getClass();
        Logger logger2 = bq3.a;
        if (hl4Var4 != null) {
            this.t.getClass();
            if (!hl4Var4.equals(null) && this.C != null) {
                long b9 = hl4Var4.b();
                this.u = this.C.schedule(new sib(new dx2(this, b9, i)), b9, timeUnit);
            }
        }
        if (this.y) {
            V();
        }
    }

    @Override // defpackage.wkn
    public final void q(String str, Throwable th) {
        jde.c();
        try {
            jde.a();
            U(str, th);
            jde.a.getClass();
        } catch (Throwable th2) {
            try {
                jde.a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String toString() {
        en0 I = qea.I(this);
        I.e(this.p, "method");
        return I.toString();
    }
}
