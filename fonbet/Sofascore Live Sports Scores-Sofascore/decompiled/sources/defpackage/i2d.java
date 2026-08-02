package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class i2d implements kj2, kzk {
    public final lj2 a;
    public final /* synthetic */ j2d b;

    public i2d(j2d j2dVar, lj2 lj2Var) {
        this.b = j2dVar;
        this.a = lj2Var;
    }

    @Override // defpackage.kj2
    public final boolean a(Throwable th) {
        return this.a.a(th);
    }

    @Override // defpackage.kzk
    public final void b(z0h z0hVar, int i) {
        this.a.b(z0hVar, i);
    }

    @Override // defpackage.kj2
    public final ih2 c(Object obj, ct8 ct8Var) {
        j2d j2dVar = this.b;
        bba bbaVar = new bba(j2dVar, this);
        ih2 F = this.a.F((Unit) obj, bbaVar);
        if (F != null) {
            j2d.i.set(j2dVar, null);
        }
        return F;
    }

    @Override // defpackage.rq3
    public final CoroutineContext getContext() {
        return this.a.e;
    }

    @Override // defpackage.kj2
    public final void i(Object obj, ct8 ct8Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j2d.i;
        j2d j2dVar = this.b;
        atomicReferenceFieldUpdater.set(j2dVar, null);
        mnc mncVar = new mnc(11, j2dVar, this);
        lj2 lj2Var = this.a;
        lj2Var.C((Unit) obj, lj2Var.c, new kr1(mncVar, 18));
    }

    @Override // defpackage.kj2
    public final boolean isActive() {
        return this.a.r() instanceof oed;
    }

    @Override // defpackage.rq3
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }

    @Override // defpackage.kj2
    public final void s(Object obj) {
        this.a.s(obj);
    }
}
