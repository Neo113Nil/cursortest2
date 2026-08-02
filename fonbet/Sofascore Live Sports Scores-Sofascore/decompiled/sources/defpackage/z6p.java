package defpackage;

import com.ironsource.U3;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class z6p extends z8p implements ddb {
    public static final Object d = new Object();
    public static final nsa e = new nsa(6, t6p.class);
    public static final boolean f;
    public static final u6p g;
    public volatile Object a;
    public volatile q6p b;
    public volatile y6p c;

    static {
        boolean z;
        u6p w6pVar;
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
                w6pVar = new x6p();
            } catch (Error | Exception e2) {
                try {
                    w6pVar = new v6p();
                } catch (Error | Exception e3) {
                    th3 = e3;
                    w6pVar = new w6p();
                }
                th = th3;
                th2 = e2;
            }
        } else {
            try {
                w6pVar = new v6p();
            } catch (NoClassDefFoundError unused2) {
                w6pVar = new w6p();
            }
        }
        th = null;
        th2 = null;
        g = w6pVar;
        if (th != null) {
            nsa nsaVar = e;
            Logger b = nsaVar.b();
            Level level = Level.SEVERE;
            b.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            nsaVar.b().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public final void c(y6p y6pVar) {
        y6pVar.a = null;
        while (true) {
            y6p y6pVar2 = this.c;
            if (y6pVar2 != y6p.c) {
                y6p y6pVar3 = null;
                while (y6pVar2 != null) {
                    y6p y6pVar4 = y6pVar2.b;
                    if (y6pVar2.a != null) {
                        y6pVar3 = y6pVar2;
                    } else if (y6pVar3 != null) {
                        y6pVar3.b = y6pVar4;
                        if (y6pVar3.a == null) {
                            break;
                        }
                    } else if (!g.c(this, y6pVar2, y6pVar4)) {
                        break;
                    }
                    y6pVar2 = y6pVar4;
                }
                return;
            }
            return;
        }
    }
}
