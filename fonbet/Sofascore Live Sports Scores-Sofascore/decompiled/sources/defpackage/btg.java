package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class btg extends c3 implements mu3 {
    public final rq3 e;

    public btg(rq3 rq3Var, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.e = rq3Var;
    }

    @Override // defpackage.kea
    public final boolean U() {
        return true;
    }

    @Override // defpackage.mu3
    public final mu3 getCallerFrame() {
        rq3 rq3Var = this.e;
        if (rq3Var instanceof mu3) {
            return (mu3) rq3Var;
        }
        return null;
    }

    @Override // defpackage.kea
    public void u(Object obj) {
        t45.a(z9a.b(this.e), s9a.H(obj));
    }

    @Override // defpackage.kea
    public void v(Object obj) {
        this.e.resumeWith(s9a.H(obj));
    }

    public void m0() {
    }
}
