package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class vk9 extends wk9 {
    public final ch2 d;
    public final boolean e;

    public vk9(u84 u84Var, yg2 yg2Var, qs3 qs3Var, ch2 ch2Var, boolean z) {
        super(u84Var, yg2Var, qs3Var);
        this.d = ch2Var;
        this.e = z;
    }

    @Override // defpackage.wk9
    public final Object a(dod dodVar, Object[] objArr) {
        zg2 zg2Var = (zg2) this.d.k(dodVar);
        rq3 rq3Var = (rq3) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return x2a.t(zg2Var, rq3Var);
                }
                try {
                    zg2Var.getClass();
                    return x2a.u(zg2Var, rq3Var);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            x2a.T(rq3Var, th);
            return lu3.a;
        }
    }
}
