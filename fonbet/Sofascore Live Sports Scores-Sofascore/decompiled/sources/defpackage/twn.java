package defpackage;

import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzdk;
import com.google.android.gms.internal.play_billing.zzdq;
import com.ironsource.U3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class twn extends zzdq implements zzdk {
    public static final Object d = new Object();
    public static final nsa e = new nsa(3, zzcu.class);
    public static final boolean f;
    public static final wca g;
    public volatile Object a;
    public volatile iwn b;
    public volatile qwn c;

    static {
        boolean z;
        wca ownVar;
        Throwable th;
        Throwable th2;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f = z;
        String property = System.getProperty("java.runtime.name", "");
        Throwable th3 = null;
        if (property == null || property.contains(U3.d)) {
            try {
                ownVar = new pwn();
            } catch (Error | Exception e2) {
                try {
                    ownVar = new nwn();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    ownVar = new own();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                ownVar = new nwn();
            } catch (NoClassDefFoundError unused2) {
                ownVar = new own();
            }
        }
        th = null;
        th2 = null;
        g = ownVar;
        if (th != null) {
            nsa nsaVar = e;
            Logger b = nsaVar.b();
            Level level = Level.SEVERE;
            b.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            nsaVar.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(qwn qwnVar) {
        qwnVar.a = null;
        while (true) {
            qwn qwnVar2 = this.c;
            if (qwnVar2 != qwn.c) {
                qwn qwnVar3 = null;
                while (qwnVar2 != null) {
                    qwn qwnVar4 = qwnVar2.b;
                    if (qwnVar2.a != null) {
                        qwnVar3 = qwnVar2;
                    } else if (qwnVar3 != null) {
                        qwnVar3.b = qwnVar4;
                        if (qwnVar3.a == null) {
                            break;
                        }
                    } else if (!g.T(this, qwnVar2, qwnVar4)) {
                        break;
                    }
                    qwnVar2 = qwnVar4;
                }
                return;
            }
            return;
        }
    }
}
