package eg;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final w f9195a;

    public l0(w wVar) {
        this.f9195a = wVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f19227a;
        w wVar = this.f9195a;
        if (jg.h.h(wVar, gVar)) {
            jg.h.g(wVar, gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f9195a.toString();
    }
}
