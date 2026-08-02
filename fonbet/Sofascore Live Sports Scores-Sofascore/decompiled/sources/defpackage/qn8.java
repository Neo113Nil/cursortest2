package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qn8 extends de {
    public final /* synthetic */ AtomicReference a;

    public qn8(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.de
    public final void a(Object obj, ok3 ok3Var) {
        de deVar = (de) this.a.get();
        if (deVar != null) {
            deVar.a(obj, ok3Var);
        } else {
            a70.r("Operation cannot be started before fragment is in created state");
        }
    }
}
