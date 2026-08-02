package Sh;

import Ph.Q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public abstract class D extends AbstractC1565c implements Q0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10762d = AtomicIntegerFieldUpdater.newUpdater(D.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f10763c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public D(long j10, D d10, int i10) {
        super(d10);
        this.f10763c = j10;
        this.cleanedAndPointers$volatile = i10 << 16;
    }

    @Override // Sh.AbstractC1565c
    public boolean k() {
        return f10762d.get(this) == r() && !l();
    }

    public final boolean p() {
        return f10762d.addAndGet(this, -65536) == r() && !l();
    }

    public abstract int r();

    public abstract void s(int i10, Throwable th2, CoroutineContext coroutineContext);

    public final void t() {
        if (f10762d.incrementAndGet(this) == r()) {
            n();
        }
    }

    public final boolean u() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10762d;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 == r() && !l()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, PKIFailureInfo.notAuthorized + i10));
        return true;
    }
}
