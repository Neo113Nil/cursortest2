package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j6h extends vha {
    @Override // defpackage.vha
    public final boolean J(k6h k6hVar) {
        synchronized (k6hVar) {
            try {
                if (k6hVar.c != 0) {
                    return false;
                }
                k6hVar.c = -1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.vha
    public final void K(k6h k6hVar) {
        synchronized (k6hVar) {
            k6hVar.c = 0;
        }
    }
}
