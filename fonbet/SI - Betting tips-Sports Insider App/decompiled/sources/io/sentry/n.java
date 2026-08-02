package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16659b;

    public /* synthetic */ n(int i5, Object obj) {
        this.f16658a = i5;
        this.f16659b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f16658a) {
            case 0:
                Iterator it = ((q) this.f16659b).f16966d.iterator();
                while (it.hasNext()) {
                    ((x0) it.next()).c();
                }
                break;
            case 1:
                io.sentry.android.core.v0 v0Var = (io.sentry.android.core.v0) this.f16659b;
                y3 y3Var = v0Var.f15870f;
                if (v0Var.f15871g) {
                    y3Var.p();
                }
                y3Var.m().getReplayController().stop();
                y3Var.m().getContinuousProfiler().a(false);
                break;
            default:
                e5.j jVar = (e5.j) this.f16659b;
                Iterator it2 = ((CopyOnWriteArrayList) jVar.f8648e).iterator();
                while (it2.hasNext()) {
                    ((io.sentry.transport.o) it2.next()).C(jVar);
                }
                break;
        }
    }
}
