package defpackage;

import com.ironsource.U3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v1k extends gd8 implements RunnableFuture {
    public volatile x8a i;

    public v1k(Callable callable) {
        this.i = new u1k(this, callable);
    }

    @Override // defpackage.g4
    public final void c() {
        x8a x8aVar;
        if (p() && (x8aVar = this.i) != null) {
            x8aVar.d();
        }
        this.i = null;
    }

    @Override // defpackage.g4
    public final String j() {
        x8a x8aVar = this.i;
        if (x8aVar == null) {
            return super.j();
        }
        return "task=[" + x8aVar + U3.j.e;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        x8a x8aVar = this.i;
        if (x8aVar != null) {
            x8aVar.run();
        }
        this.i = null;
    }
}
