package defpackage;

import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.setting.i;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class yl extends c4 {
    public static final fkf j;
    public static final nsa k = new nsa(0, yl.class);
    public volatile Set h;
    public volatile int i;

    static {
        Throwable th;
        fkf xlVar;
        try {
            xlVar = new wl(AtomicReferenceFieldUpdater.newUpdater(yl.class, Set.class, h.b), AtomicIntegerFieldUpdater.newUpdater(yl.class, i.a));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            xlVar = new xl();
        }
        j = xlVar;
        if (th != null) {
            k.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
