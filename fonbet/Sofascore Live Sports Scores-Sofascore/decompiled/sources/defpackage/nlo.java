package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class nlo extends blo {
    public static final l4a j;
    public static final nsa k = new nsa(4, nlo.class);
    public volatile Set h;
    public volatile int i;

    static {
        Throwable th;
        l4a mloVar;
        try {
            mloVar = new llo();
            th = null;
        } catch (Throwable th2) {
            th = th2;
            mloVar = new mlo();
        }
        Throwable th3 = th;
        j = mloVar;
        if (th3 != null) {
            k.b().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th3);
        }
    }
}
