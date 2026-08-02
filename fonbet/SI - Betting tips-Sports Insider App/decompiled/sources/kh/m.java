package kh;

import gh.g0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final gh.f f19133a;

    /* renamed from: b, reason: collision with root package name */
    public volatile AtomicInteger f19134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f19135c;

    public m(p pVar, gh.f responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        this.f19135c = pVar;
        this.f19133a = responseCallback;
        this.f19134b = new AtomicInteger(0);
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0 g0Var;
        String str = "OkHttp " + this.f19135c.f19139b.f10206a.g();
        p pVar = this.f19135c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            pVar.f19142e.enter();
            boolean z5 = false;
            try {
                try {
                } catch (Throwable th2) {
                    pVar.f19138a.f10170a.s(this);
                    throw th2;
                }
            } catch (IOException e7) {
                e = e7;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                this.f19133a.a(pVar.h());
                g0Var = pVar.f19138a;
            } catch (IOException e9) {
                e = e9;
                z5 = true;
                if (z5) {
                    qh.e eVar = qh.e.f22190a;
                    qh.e.f22190a.j(4, "Callback failure for " + p.a(pVar), e);
                } else {
                    this.f19133a.b(pVar, e);
                }
                g0Var = pVar.f19138a;
                g0Var.f10170a.s(this);
            } catch (Throwable th4) {
                th = th4;
                z5 = true;
                pVar.cancel();
                if (!z5) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.f19133a.b(pVar, iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                g0Var = pVar.f19138a;
                g0Var.f10170a.s(this);
            }
            g0Var.f10170a.s(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
