package io.sentry;

import java.util.TimerTask;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h6 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j6 f16479b;

    public /* synthetic */ h6(j6 j6Var, int i5) {
        this.f16478a = i5;
        this.f16479b = j6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f16478a) {
            case 0:
                j6 j6Var = this.f16479b;
                q6 status = j6Var.getStatus();
                if (status == null) {
                    status = q6.OK;
                }
                j6Var.x(status, null);
                j6Var.f16578l.set(false);
                break;
            default:
                j6 j6Var2 = this.f16479b;
                q6 status2 = j6Var2.getStatus();
                if (status2 == null) {
                    status2 = q6.DEADLINE_EXCEEDED;
                }
                j6Var2.e(status2, j6Var2.f16583r.f17239g != null, null);
                j6Var2.f16579m.set(false);
                break;
        }
    }
}
