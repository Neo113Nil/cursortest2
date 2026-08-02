package defpackage;

import com.google.android.gms.common.api.internal.BackgroundDetector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class p38 implements BackgroundDetector.BackgroundStateChangeListener {
    public static final AtomicReference a = new AtomicReference();

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void a(boolean z) {
        synchronized (r38.k) {
            try {
                Iterator it = new ArrayList(r38.l.values()).iterator();
                while (it.hasNext()) {
                    r38 r38Var = (r38) it.next();
                    if (r38Var.e.get()) {
                        Iterator it2 = r38Var.i.iterator();
                        while (it2.hasNext()) {
                            r38 r38Var2 = ((o38) it2.next()).a;
                            if (!z) {
                                ((op4) r38Var2.h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
