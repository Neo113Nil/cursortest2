package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class l7p extends s6p {
    public static final cga j;
    public static final nsa k = new nsa(6, l7p.class);
    public volatile Set h;
    public volatile int i;

    static {
        Throwable th;
        cga k7pVar;
        try {
            k7pVar = new j7p();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            k7pVar = new k7p();
        }
        Throwable th3 = th;
        j = k7pVar;
        if (th3 != null) {
            k.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
