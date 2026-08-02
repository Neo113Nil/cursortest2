package defpackage;

import com.google.android.gms.internal.ads.zzhbr;
import com.google.android.gms.internal.ads.zzhea;
import com.ironsource.U3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class glo extends zzhea implements ddb {
    public static final Object d = new Object();
    public static final nsa e = new nsa(4, zzhbr.class);
    public static final boolean f;
    public static final w3a g;
    public volatile Object a;
    public volatile zko b;
    public volatile flo c;

    static {
        boolean z;
        w3a dloVar;
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
                dloVar = new elo();
            } catch (Error | Exception e2) {
                try {
                    dloVar = new clo();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    dloVar = new dlo();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                dloVar = new clo();
            } catch (NoClassDefFoundError unused2) {
                dloVar = new dlo();
            }
        }
        th = null;
        th2 = null;
        g = dloVar;
        if (th != null) {
            nsa nsaVar = e;
            Logger b = nsaVar.b();
            Level level = Level.SEVERE;
            b.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            nsaVar.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(flo floVar) {
        floVar.a = null;
        while (true) {
            flo floVar2 = this.c;
            if (floVar2 != flo.c) {
                flo floVar3 = null;
                while (floVar2 != null) {
                    flo floVar4 = floVar2.b;
                    if (floVar2.a != null) {
                        floVar3 = floVar2;
                    } else if (floVar3 != null) {
                        floVar3.b = floVar4;
                        if (floVar3.a == null) {
                            break;
                        }
                    } else if (!g.Z(this, floVar2, floVar4)) {
                        break;
                    }
                    floVar2 = floVar4;
                }
                return;
            }
            return;
        }
    }
}
