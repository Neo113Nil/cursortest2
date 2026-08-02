package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class el5 extends dy0 {
    public final /* synthetic */ dy0 t;
    public final /* synthetic */ ThreadPoolExecutor u;

    public el5(dy0 dy0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.t = dy0Var;
        this.u = threadPoolExecutor;
    }

    @Override // defpackage.dy0
    public final void A(g7h g7hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.u;
        try {
            this.t.A(g7hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.dy0
    public final void z(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.u;
        try {
            this.t.z(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
