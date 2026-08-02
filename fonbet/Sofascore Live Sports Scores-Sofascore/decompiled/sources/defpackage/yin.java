package defpackage;

import com.google.android.gms.internal.wearable.zzbf;
import com.google.android.gms.internal.wearable.zzbp;
import com.ironsource.U3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class yin extends zzbp implements zzbf {
    public static final Object d = new Object();
    public static final nsa e = new nsa(2);
    public static final boolean f;
    public static final haa g;
    public volatile Object a;
    public volatile jin b;
    public volatile vin c;

    static {
        boolean z;
        haa tinVar;
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
                tinVar = new uin();
            } catch (Error | Exception e2) {
                try {
                    tinVar = new sin();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    tinVar = new tin();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                tinVar = new sin();
            } catch (NoClassDefFoundError unused2) {
                tinVar = new tin();
            }
        }
        th = null;
        th2 = null;
        g = tinVar;
        if (th != null) {
            nsa nsaVar = e;
            Logger b = nsaVar.b();
            Level level = Level.SEVERE;
            b.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            nsaVar.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void b(vin vinVar) {
        vinVar.a = null;
        while (true) {
            vin vinVar2 = this.c;
            if (vinVar2 != vin.c) {
                vin vinVar3 = null;
                while (vinVar2 != null) {
                    vin vinVar4 = vinVar2.b;
                    if (vinVar2.a != null) {
                        vinVar3 = vinVar2;
                    } else if (vinVar3 != null) {
                        vinVar3.b = vinVar4;
                        if (vinVar3.a == null) {
                            break;
                        }
                    } else if (!g.T(this, vinVar2, vinVar4)) {
                        break;
                    }
                    vinVar2 = vinVar4;
                }
                return;
            }
            return;
        }
    }
}
