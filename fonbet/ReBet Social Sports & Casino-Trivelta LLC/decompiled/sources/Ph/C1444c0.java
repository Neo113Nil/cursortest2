package Ph;

import Sh.AbstractC1572j;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* renamed from: Ph.c0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1444c0 extends Sh.C {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9064e = AtomicIntegerFieldUpdater.newUpdater(C1444c0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C1444c0(CoroutineContext coroutineContext, Continuation continuation) {
        super(coroutineContext, continuation);
    }

    @Override // Sh.C, Ph.AbstractC1439a
    public void K0(Object obj) {
        if (R0()) {
            return;
        }
        AbstractC1572j.b(IntrinsicsKt.intercepted(this.f10761d), E.a(obj, this.f10761d));
    }

    public final Object P0() {
        if (S0()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object h10 = J0.h(V());
        if (h10 instanceof C) {
            throw ((C) h10).f9000a;
        }
        return h10;
    }

    public final boolean R0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9064e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f9064e.compareAndSet(this, 0, 2));
        return true;
    }

    public final boolean S0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9064e;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f9064e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // Sh.C, Ph.I0
    public void y(Object obj) {
        K0(obj);
    }
}
