package j1;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends k2.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2.x f18213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f18214b;

    public l(k2.x xVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f18213a = xVar;
        this.f18214b = threadPoolExecutor;
    }

    @Override // k2.x
    public final void y(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f18214b;
        try {
            this.f18213a.y(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // k2.x
    public final void z(com.google.firebase.messaging.x xVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f18214b;
        try {
            this.f18213a.z(xVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
