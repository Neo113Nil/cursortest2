package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class rem {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static synchronized void a(nem nemVar) {
        synchronized (rem.class) {
            try {
                rwm rwmVar = (rwm) a.remove(nemVar.nac());
                if (rwmVar != null) {
                    rwmVar.c = true;
                }
                nemVar.wh();
                nemVar.nac();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
