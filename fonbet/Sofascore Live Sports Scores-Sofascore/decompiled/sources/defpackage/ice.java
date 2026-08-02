package defpackage;

import java.util.ArrayDeque;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ice extends au3 {
    public final r45 c = new r45(0);

    @Override // defpackage.au3
    public final boolean e0(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        hs4 hs4Var = z45.a;
        if (rob.a.f.e0(coroutineContext)) {
            return true;
        }
        r45 r45Var = this.c;
        return !(r45Var.b || !r45Var.a);
    }

    @Override // defpackage.au3
    public final void i(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        hs4 hs4Var = z45.a;
        r69 r69Var = rob.a.f;
        boolean e0 = r69Var.e0(coroutineContext);
        r45 r45Var = this.c;
        if (e0 || r45Var.b || !r45Var.a) {
            r69Var.i(coroutineContext, new mc3(27, r45Var, runnable));
        } else if (((ArrayDeque) r45Var.d).offer(runnable)) {
            r45Var.a();
        } else {
            a70.r("cannot enqueue any more runnables");
        }
    }
}
