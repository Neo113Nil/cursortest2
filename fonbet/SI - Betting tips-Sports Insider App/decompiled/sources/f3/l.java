package f3;

import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9393a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.b f9394b;

    /* renamed from: c, reason: collision with root package name */
    public final eg.l f9395c;

    public l(g8.b futureToObserve, eg.l continuation, int i5) {
        this.f9393a = i5;
        switch (i5) {
            case 1:
                this.f9394b = futureToObserve;
                this.f9395c = continuation;
                break;
            default:
                Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
                Intrinsics.checkNotNullParameter(continuation, "continuation");
                this.f9394b = futureToObserve;
                this.f9395c = continuation;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = this.f9393a;
        g8.b bVar = this.f9394b;
        eg.l lVar = this.f9395c;
        switch (i5) {
            case 0:
                if (bVar.isCancelled()) {
                    lVar.n(null);
                    return;
                }
                try {
                    gf.o oVar = gf.q.f10031a;
                    boolean z5 = false;
                    while (true) {
                        try {
                            Object obj = bVar.get();
                            if (z5) {
                                Thread.currentThread().interrupt();
                            }
                            lVar.resumeWith(obj);
                            return;
                        } catch (InterruptedException unused) {
                            z5 = true;
                        } catch (Throwable th2) {
                            if (z5) {
                                Thread.currentThread().interrupt();
                            }
                            throw th2;
                        }
                    }
                } catch (ExecutionException e7) {
                    gf.o oVar2 = gf.q.f10031a;
                    Throwable cause = e7.getCause();
                    Intrinsics.checkNotNull(cause);
                    lVar.resumeWith(h8.b.h(cause));
                    return;
                }
            default:
                if (bVar.isCancelled()) {
                    lVar.n(null);
                    return;
                }
                try {
                    gf.o oVar3 = gf.q.f10031a;
                    lVar.resumeWith(u.g.h(bVar));
                    return;
                } catch (ExecutionException e9) {
                    Throwable cause2 = e9.getCause();
                    if (cause2 == null) {
                        Intrinsics.throwNpe();
                    }
                    gf.o oVar4 = gf.q.f10031a;
                    lVar.resumeWith(h8.b.h(cause2));
                    return;
                }
        }
    }
}
