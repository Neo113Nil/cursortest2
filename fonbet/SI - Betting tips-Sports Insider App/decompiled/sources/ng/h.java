package ng;

import androidx.appcompat.widget.c1;
import eg.c0;
import eg.f2;
import eg.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import jg.u;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20898c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20899d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20900e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f20901f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20902g = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f20903a;

    /* renamed from: b, reason: collision with root package name */
    public final eg.k f20904b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i5) {
        this.f20903a = i5;
        if (i5 <= 0) {
            throw new IllegalArgumentException(c1.i(i5, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(c1.i(i5, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i5;
        this.f20904b = new eg.k(2, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r1.a(kotlin.Unit.f19194a, r4.f20904b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c frame) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i5;
        do {
            atomicIntegerFieldUpdater = f20902g;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i5 = this.f20903a;
        } while (andDecrement > i5);
        if (andDecrement > 0) {
            return Unit.f19194a;
        }
        l p10 = c0.p(lf.d.b(frame));
        try {
            if (!b(p10)) {
                while (true) {
                    int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                    if (andDecrement2 <= i5) {
                        if (andDecrement2 > 0) {
                            break;
                        }
                        Intrinsics.checkNotNull(p10, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
                        if (b(p10)) {
                            break;
                        }
                    }
                }
            }
            Object r5 = p10.r();
            lf.a aVar = lf.a.f20034a;
            if (r5 == aVar) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (r5 != aVar) {
                r5 = Unit.f19194a;
            }
            return r5 == aVar ? r5 : Unit.f19194a;
        } catch (Throwable th2) {
            p10.A();
            throw th2;
        }
    }

    public final boolean b(f2 f2Var) {
        Object a7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20900e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f20901f.getAndIncrement(this);
        f fVar = f.f20896a;
        long j = andIncrement / j.f20910f;
        loop0: while (true) {
            a7 = jg.b.a(kVar, j, fVar);
            if (!jg.h.d(a7)) {
                u b10 = jg.h.b(a7);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f18527c >= b10.f18527c) {
                        break loop0;
                    }
                    if (!b10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (b10.f()) {
                                b10.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) jg.h.b(a7);
        AtomicReferenceArray atomicReferenceArray = kVar2.f20911e;
        int i5 = (int) (andIncrement % j.f20910f);
        while (!atomicReferenceArray.compareAndSet(i5, null, f2Var)) {
            if (atomicReferenceArray.get(i5) != null) {
                com.android.billingclient.api.a aVar = j.f20906b;
                com.android.billingclient.api.a aVar2 = j.f20907c;
                while (!atomicReferenceArray.compareAndSet(i5, aVar, aVar2)) {
                    if (atomicReferenceArray.get(i5) != aVar) {
                        return false;
                    }
                }
                Intrinsics.checkNotNull(f2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((eg.j) f2Var).a(Unit.f19194a, this.f20904b);
                return true;
            }
        }
        f2Var.b(kVar2, i5);
        return true;
    }

    public final void d() {
        int i5;
        Object a7;
        boolean z5;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f20902g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f20903a;
            if (andIncrement >= i10) {
                do {
                    i5 = atomicIntegerFieldUpdater.get(this);
                    if (i5 <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20898c;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f20899d.getAndIncrement(this);
            long j = andIncrement2 / j.f20910f;
            g gVar = g.f20897a;
            while (true) {
                a7 = jg.b.a(kVar, j, gVar);
                if (jg.h.d(a7)) {
                    break;
                }
                u b10 = jg.h.b(a7);
                while (true) {
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f18527c >= b10.f18527c) {
                        break;
                    }
                    if (!b10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, b10)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (b10.f()) {
                                b10.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                    }
                }
            }
            k kVar2 = (k) jg.h.b(a7);
            kVar2.b();
            AtomicReferenceArray atomicReferenceArray = kVar2.f20911e;
            z5 = false;
            if (kVar2.f18527c <= j) {
                int i11 = (int) (andIncrement2 % j.f20910f);
                Object andSet = atomicReferenceArray.getAndSet(i11, j.f20906b);
                if (andSet == null) {
                    int i12 = j.f20905a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (atomicReferenceArray.get(i11) == j.f20907c) {
                            z5 = true;
                            break;
                        }
                    }
                    com.android.billingclient.api.a aVar = j.f20906b;
                    com.android.billingclient.api.a aVar2 = j.f20908d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i11, aVar, aVar2)) {
                            if (atomicReferenceArray.get(i11) != aVar) {
                                break;
                            }
                        } else {
                            z5 = true;
                            break;
                        }
                    }
                    z5 = !z5;
                } else if (andSet != j.f20909e) {
                    if (!(andSet instanceof eg.j)) {
                        if (!(andSet instanceof mg.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((mg.e) ((mg.f) andSet)).g(this, Unit.f19194a) != 0) {
                        }
                        z5 = true;
                        break;
                        break;
                    }
                    Intrinsics.checkNotNull(andSet, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    eg.j jVar = (eg.j) andSet;
                    com.android.billingclient.api.a f6 = jVar.f(Unit.f19194a, this.f20904b);
                    if (f6 != null) {
                        jVar.i(f6);
                        z5 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z5);
    }
}
