package jg;

import eg.r1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class u extends c implements r1 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18526d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f18527c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public u(long j, u uVar, int i5) {
        super(uVar);
        this.f18527c = j;
        this.cleanedAndPointers$volatile = i5 << 16;
    }

    @Override // jg.c
    public final boolean d() {
        return f18526d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f18526d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i5, CoroutineContext coroutineContext);

    public final void i() {
        if (f18526d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f18526d;
            i5 = atomicIntegerFieldUpdater.get(this);
            if (i5 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 65536 + i5));
        return true;
    }
}
