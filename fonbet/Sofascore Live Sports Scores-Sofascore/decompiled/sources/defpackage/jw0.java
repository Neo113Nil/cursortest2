package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jw0 extends cea {
    public static final /* synthetic */ long h = rh0.a.objectFieldOffset(jw0.class.getDeclaredField("_disposer$volatile"));
    private volatile /* synthetic */ Object _disposer$volatile;
    public final lj2 e;
    public q55 f;
    public final /* synthetic */ lw0 g;

    public jw0(lw0 lw0Var, lj2 lj2Var) {
        this.g = lw0Var;
        this.e = lj2Var;
    }

    @Override // defpackage.cea
    public final boolean l() {
        return false;
    }

    @Override // defpackage.cea
    public final void m(Throwable th) {
        lj2 lj2Var = this.e;
        if (th != null) {
            ih2 F = lj2Var.F(new eb3(th, false), null);
            if (F != null) {
                lj2Var.s(F);
                kw0 kw0Var = (kw0) rh0.a.getObjectVolatile(this, h);
                if (kw0Var != null) {
                    kw0Var.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = lw0.b;
        lw0 lw0Var = this.g;
        if (atomicIntegerFieldUpdater.decrementAndGet(lw0Var) == 0) {
            zu4[] zu4VarArr = lw0Var.a;
            ArrayList arrayList = new ArrayList(zu4VarArr.length);
            for (zu4 zu4Var : zu4VarArr) {
                arrayList.add(zu4Var.h());
            }
            p2g p2gVar = w2g.b;
            lj2Var.resumeWith(arrayList);
        }
    }
}
