package defpackage;

import com.ironsource.U3;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q8p extends r7p implements RunnableFuture {
    public volatile p8p i;

    public q8p(Callable callable) {
        this.i = new p8p(this, callable);
    }

    @Override // defpackage.t6p
    public final void f() {
        p8p p8pVar;
        if (l() && (p8pVar = this.i) != null) {
            p8pVar.k();
        }
        this.i = null;
    }

    @Override // defpackage.t6p
    public final String g() {
        p8p p8pVar = this.i;
        if (p8pVar == null) {
            return super.g();
        }
        String h8pVar = p8pVar.toString();
        return wt3.m("task=[", h8pVar, new StringBuilder(h8pVar.length() + 7), U3.j.e);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        p8p p8pVar = this.i;
        if (p8pVar != null) {
            p8pVar.run();
        }
        this.i = null;
    }
}
