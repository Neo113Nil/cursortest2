package defpackage;

import com.google.android.gms.internal.cast.zzwx;
import com.ironsource.U3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class iap extends zzwx implements ddb {
    public static final Object d = new Object();
    public static final nsa e = new nsa(7);
    public static final boolean f;
    public static final sha g;
    public volatile Object a;
    public volatile dap b;
    public volatile hap c;

    static {
        boolean z;
        sha fapVar;
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
                fapVar = new gap();
            } catch (Error | Exception e2) {
                try {
                    fapVar = new eap();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    fapVar = new fap();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                fapVar = new eap();
            } catch (NoClassDefFoundError unused2) {
                fapVar = new fap();
            }
        }
        th = null;
        th2 = null;
        g = fapVar;
        if (th != null) {
            nsa nsaVar = e;
            Logger b = nsaVar.b();
            Level level = Level.SEVERE;
            b.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            nsaVar.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(hap hapVar) {
        hapVar.a = null;
        while (true) {
            hap hapVar2 = this.c;
            if (hapVar2 != hap.c) {
                hap hapVar3 = null;
                while (hapVar2 != null) {
                    hap hapVar4 = hapVar2.b;
                    if (hapVar2.a != null) {
                        hapVar3 = hapVar2;
                    } else if (hapVar3 != null) {
                        hapVar3.b = hapVar4;
                        if (hapVar3.a == null) {
                            break;
                        }
                    } else if (!g.c0(this, hapVar2, hapVar4)) {
                        break;
                    }
                    hapVar2 = hapVar4;
                }
                return;
            }
            return;
        }
    }
}
