package Rh;

import Ph.N;
import Rh.B;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public final class x extends k implements y {
    public x(CoroutineContext coroutineContext, j jVar) {
        super(coroutineContext, jVar, true, true);
    }

    @Override // Ph.AbstractC1439a
    public void L0(Throwable th2, boolean z10) {
        if (O0().a(th2) || z10) {
            return;
        }
        N.a(get$context(), th2);
    }

    @Override // Ph.AbstractC1439a
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void M0(Unit unit) {
        B.a.a(O0(), null, 1, null);
    }

    @Override // Rh.y
    public /* bridge */ /* synthetic */ B d() {
        return d();
    }

    @Override // Ph.AbstractC1439a, Ph.I0, Ph.C0
    public boolean isActive() {
        return super.isActive();
    }
}
