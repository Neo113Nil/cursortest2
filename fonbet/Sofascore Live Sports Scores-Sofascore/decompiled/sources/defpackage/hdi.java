package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class hdi extends v7 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.v7
    public final boolean a(u7 u7Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(gdi.a);
        return true;
    }

    @Override // defpackage.v7
    public final rq3[] b(u7 u7Var) {
        this.a.set(null);
        return rd0.b;
    }
}
