package pd;

import hg.d1;
import java.util.TimerTask;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q extends TimerTask {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        d1 d1Var = da.r.f8343a;
        Long valueOf = Long.valueOf(scheduledExecutionTime() / 1000);
        d1Var.getClass();
        d1Var.k(null, valueOf);
    }
}
