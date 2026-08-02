package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mlo extends l4a {
    @Override // defpackage.l4a
    public final void V(klo kloVar, Set set) {
        synchronized (kloVar) {
            try {
                if (kloVar.h == null) {
                    kloVar.h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.l4a
    public final int W(klo kloVar) {
        int i;
        synchronized (kloVar) {
            i = kloVar.i - 1;
            kloVar.i = i;
        }
        return i;
    }
}
