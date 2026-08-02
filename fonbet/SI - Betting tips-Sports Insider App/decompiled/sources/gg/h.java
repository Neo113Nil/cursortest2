package gg;

import androidx.appcompat.widget.c1;
import eg.c0;
import eg.f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.d0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class h implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10064b = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10065c = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10066d = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10067e = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10068f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10069g = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10070h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10071i = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f10072a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public h(int i5) {
        this.f10072a = i5;
        if (i5 < 0) {
            throw new IllegalArgumentException(d9.e.f(i5, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        p pVar = j.f10074a;
        this.bufferEnd$volatile = i5 != 0 ? i5 != Integer.MAX_VALUE ? i5 : LongCompanionObject.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f10066d.get(this);
        p pVar2 = new p(0L, null, this, 3);
        this.sendSegment$volatile = pVar2;
        this.receiveSegment$volatile = pVar2;
        if (z()) {
            pVar2 = j.f10074a;
            Intrinsics.checkNotNull(pVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = pVar2;
        this._closeCause$volatile = j.f10090s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object C(h hVar, mf.c cVar) {
        f fVar;
        int i5;
        p pVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f10060c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f10060c = i10 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.f10058a;
                lf.a aVar = lf.a.f20034a;
                i5 = fVar2.f10060c;
                if (i5 == 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                    return ((o) obj).f10095a;
                }
                h8.b.B(obj);
                p pVar2 = (p) f10069g.get(hVar);
                while (!hVar.w()) {
                    long andIncrement = f10065c.getAndIncrement(hVar);
                    long j6 = j.f10075b;
                    long j10 = andIncrement / j6;
                    int i11 = (int) (andIncrement % j6);
                    if (pVar2.f18527c != j10) {
                        p p10 = hVar.p(j10, pVar2);
                        if (p10 == null) {
                            continue;
                        } else {
                            pVar = p10;
                        }
                    } else {
                        pVar = pVar2;
                    }
                    h hVar2 = hVar;
                    Object H = hVar2.H(pVar, i11, andIncrement, null);
                    if (H == j.f10085m) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (H != j.f10087o) {
                        if (H != j.f10086n) {
                            pVar.b();
                            return H;
                        }
                        fVar2.f10060c = 1;
                        Object D = hVar2.D(pVar, i11, andIncrement, fVar2);
                        return D == aVar ? aVar : D;
                    }
                    if (andIncrement < hVar2.t()) {
                        pVar.b();
                    }
                    hVar = hVar2;
                    pVar2 = pVar;
                }
                return new m(hVar.q());
            }
        }
        fVar = new f(hVar, cVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.f10058a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = fVar22.f10060c;
        if (i5 == 0) {
        }
    }

    public static final p a(h hVar, long j6, p pVar) {
        Object a7;
        h hVar2;
        p pVar2 = j.f10074a;
        i iVar = i.f10073a;
        loop0: while (true) {
            a7 = jg.b.a(pVar, j6, iVar);
            if (!jg.h.d(a7)) {
                jg.u b10 = jg.h.b(a7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10068f;
                    jg.u uVar = (jg.u) atomicReferenceFieldUpdater.get(hVar);
                    if (uVar.f18527c >= b10.f18527c) {
                        break loop0;
                    }
                    if (!b10.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, b10)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != uVar) {
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
        boolean d10 = jg.h.d(a7);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10065c;
        if (d10) {
            hVar.x();
            if (pVar.f18527c * j.f10075b < atomicLongFieldUpdater.get(hVar)) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) jg.h.b(a7);
            long j10 = pVar3.f18527c;
            if (j10 <= j6) {
                return pVar3;
            }
            long j11 = j.f10075b * j10;
            while (true) {
                long j12 = f10064b.get(hVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (f10064b.compareAndSet(hVar2, j12, (((int) (j12 >> 60)) << 60) + j13)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j10 * j.f10075b < atomicLongFieldUpdater.get(hVar2)) {
                pVar3.b();
            }
        }
        return null;
    }

    public static final void c(h hVar, Object obj, eg.l lVar) {
        Throwable s8 = hVar.s();
        gf.o oVar = gf.q.f10031a;
        lVar.resumeWith(h8.b.h(s8));
    }

    public static final int f(h hVar, p pVar, int i5, Object obj, long j6, Object obj2, boolean z5) {
        pVar.n(i5, obj);
        if (z5) {
            return hVar.I(pVar, i5, obj, j6, obj2, z5);
        }
        Object l6 = pVar.l(i5);
        if (l6 == null) {
            if (hVar.i(j6)) {
                if (pVar.k(i5, null, j.f10077d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (pVar.k(i5, null, obj2)) {
                    return 2;
                }
            }
        } else if (l6 instanceof f2) {
            pVar.n(i5, null);
            if (hVar.F(l6, obj)) {
                pVar.o(i5, j.f10082i);
                return 0;
            }
            com.android.billingclient.api.a aVar = j.f10083k;
            if (pVar.f10097f.getAndSet((i5 * 2) + 1, aVar) == aVar) {
                return 5;
            }
            pVar.m(i5, true);
            return 5;
        }
        return hVar.I(pVar, i5, obj, j6, obj2, z5);
    }

    public static void u(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10067e;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A(long j6, p pVar) {
        p pVar2;
        p pVar3;
        while (pVar.f18527c < j6 && (pVar3 = (p) pVar.c()) != null) {
            pVar = pVar3;
        }
        while (true) {
            if (!pVar.d() || (pVar2 = (p) pVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10070h;
                    jg.u uVar = (jg.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f18527c >= pVar.f18527c) {
                        return;
                    }
                    if (!pVar.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != uVar) {
                            if (pVar.f()) {
                                pVar.e();
                            }
                        }
                    }
                    if (uVar.f()) {
                        uVar.e();
                        return;
                    }
                    return;
                }
            }
            pVar = pVar2;
        }
    }

    public final Object B(Object obj, Continuation frame) {
        eg.l lVar = new eg.l(1, lf.d.b(frame));
        lVar.s();
        Throwable s8 = s();
        gf.o oVar = gf.q.f10031a;
        lVar.resumeWith(h8.b.h(s8));
        Object r5 = lVar.r();
        lf.a aVar = lf.a.f20034a;
        if (r5 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return r5 == aVar ? r5 : Unit.f19194a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(p pVar, int i5, long j6, mf.c cVar) {
        g frame;
        int i10;
        o oVar;
        p pVar2;
        if (cVar instanceof g) {
            frame = (g) cVar;
            int i11 = frame.f10063c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                frame.f10063c = i11 - Integer.MIN_VALUE;
                Object obj = frame.f10061a;
                lf.a aVar = lf.a.f20034a;
                i10 = frame.f10063c;
                if (i10 != 0) {
                    h8.b.B(obj);
                    frame.f10063c = 1;
                    eg.l p10 = c0.p(lf.d.b(frame));
                    try {
                        Intrinsics.checkNotNull(p10, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                        x xVar = new x(p10);
                        Object H = H(pVar, i5, j6, xVar);
                        if (H == j.f10085m) {
                            xVar.b(pVar, i5);
                        } else {
                            if (H == j.f10087o) {
                                if (j6 < t()) {
                                    pVar.b();
                                }
                                p pVar3 = (p) f10069g.get(this);
                                while (true) {
                                    if (w()) {
                                        gf.o oVar2 = gf.q.f10031a;
                                        p10.resumeWith(new o(new m(q())));
                                        break;
                                    }
                                    long andIncrement = f10065c.getAndIncrement(this);
                                    long j10 = j.f10075b;
                                    long j11 = andIncrement / j10;
                                    int i12 = (int) (andIncrement % j10);
                                    if (pVar3.f18527c != j11) {
                                        pVar2 = p(j11, pVar3);
                                        if (pVar2 == null) {
                                        }
                                    } else {
                                        pVar2 = pVar3;
                                    }
                                    Object H2 = H(pVar2, i12, andIncrement, xVar);
                                    if (H2 == j.f10085m) {
                                        xVar.b(pVar2, i12);
                                        break;
                                    }
                                    if (H2 == j.f10087o) {
                                        if (andIncrement < t()) {
                                            pVar2.b();
                                        }
                                        pVar3 = pVar2;
                                    } else {
                                        if (H2 == j.f10086n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        pVar2.b();
                                        oVar = new o(H2);
                                    }
                                }
                            } else {
                                pVar.b();
                                oVar = new o(H);
                            }
                            p10.a(oVar, null);
                        }
                        obj = p10.r();
                        if (obj == lf.a.f20034a) {
                            Intrinsics.checkNotNullParameter(frame, "frame");
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th2) {
                        p10.A();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return ((o) obj).f10095a;
            }
        }
        frame = new g(this, cVar);
        Object obj2 = frame.f10061a;
        lf.a aVar2 = lf.a.f20034a;
        i10 = frame.f10063c;
        if (i10 != 0) {
        }
        return ((o) obj2).f10095a;
    }

    public final void E(f2 f2Var, boolean z5) {
        if (f2Var instanceof eg.j) {
            Continuation continuation = (Continuation) f2Var;
            gf.o oVar = gf.q.f10031a;
            continuation.resumeWith(h8.b.h(z5 ? r() : s()));
            return;
        }
        if (f2Var instanceof x) {
            eg.l lVar = ((x) f2Var).f10106a;
            gf.o oVar2 = gf.q.f10031a;
            lVar.resumeWith(new o(new m(q())));
            return;
        }
        if (!(f2Var instanceof c)) {
            if (f2Var instanceof mg.f) {
                ((mg.e) ((mg.f) f2Var)).g(this, j.f10084l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + f2Var).toString());
            }
        }
        c cVar = (c) f2Var;
        eg.l lVar2 = cVar.f10054b;
        Intrinsics.checkNotNull(lVar2);
        cVar.f10054b = null;
        cVar.f10053a = j.f10084l;
        Throwable q = cVar.f10055c.q();
        if (q == null) {
            gf.o oVar3 = gf.q.f10031a;
            lVar2.resumeWith(Boolean.FALSE);
        } else {
            gf.o oVar4 = gf.q.f10031a;
            lVar2.resumeWith(h8.b.h(q));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof mg.f) {
            return ((mg.e) ((mg.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof x) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return j.a(((x) obj).f10106a, new o(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof eg.j) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return j.a((eg.j) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        c cVar = (c) obj;
        eg.l lVar = cVar.f10054b;
        Intrinsics.checkNotNull(lVar);
        cVar.f10054b = null;
        cVar.f10053a = obj2;
        return j.a(lVar, Boolean.TRUE, null);
    }

    public final boolean G(Object obj, p pVar, int i5) {
        mg.i iVar;
        if (obj instanceof eg.j) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return j.a((eg.j) obj, Unit.f19194a, null);
        }
        if (!(obj instanceof mg.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int g10 = ((mg.e) obj).g(this, Unit.f19194a);
        if (g10 == 0) {
            iVar = mg.i.f20735a;
        } else if (g10 == 1) {
            iVar = mg.i.f20736b;
        } else if (g10 == 2) {
            iVar = mg.i.f20737c;
        } else {
            if (g10 != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + g10).toString());
            }
            iVar = mg.i.f20738d;
        }
        if (iVar == mg.i.f20736b) {
            pVar.n(i5, null);
        }
        return iVar == mg.i.f20735a;
    }

    public final Object H(p pVar, int i5, long j6, Object obj) {
        Object l6 = pVar.l(i5);
        AtomicReferenceArray atomicReferenceArray = pVar.f10097f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10064b;
        if (l6 == null) {
            if (j6 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f10086n;
                }
                if (pVar.k(i5, l6, obj)) {
                    o();
                    return j.f10085m;
                }
            }
        } else if (l6 == j.f10077d && pVar.k(i5, l6, j.f10082i)) {
            o();
            Object obj2 = atomicReferenceArray.get(i5 * 2);
            pVar.n(i5, null);
            return obj2;
        }
        while (true) {
            Object l10 = pVar.l(i5);
            if (l10 == null || l10 == j.f10078e) {
                if (j6 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (pVar.k(i5, l10, j.f10081h)) {
                        o();
                        return j.f10087o;
                    }
                } else {
                    if (obj == null) {
                        return j.f10086n;
                    }
                    if (pVar.k(i5, l10, obj)) {
                        o();
                        return j.f10085m;
                    }
                }
            } else if (l10 != j.f10077d) {
                com.android.billingclient.api.a aVar = j.j;
                if (l10 == aVar) {
                    return j.f10087o;
                }
                if (l10 == j.f10081h) {
                    return j.f10087o;
                }
                if (l10 == j.f10084l) {
                    o();
                    return j.f10087o;
                }
                if (l10 != j.f10080g && pVar.k(i5, l10, j.f10079f)) {
                    boolean z5 = l10 instanceof a0;
                    if (z5) {
                        l10 = ((a0) l10).f10052a;
                    }
                    if (G(l10, pVar, i5)) {
                        pVar.o(i5, j.f10082i);
                        o();
                        Object obj3 = atomicReferenceArray.get(i5 * 2);
                        pVar.n(i5, null);
                        return obj3;
                    }
                    pVar.o(i5, aVar);
                    pVar.i();
                    if (z5) {
                        o();
                    }
                    return j.f10087o;
                }
            } else if (pVar.k(i5, l10, j.f10082i)) {
                o();
                Object obj4 = atomicReferenceArray.get(i5 * 2);
                pVar.n(i5, null);
                return obj4;
            }
        }
    }

    public final int I(p pVar, int i5, Object obj, long j6, Object obj2, boolean z5) {
        while (true) {
            Object l6 = pVar.l(i5);
            if (l6 == null) {
                if (!i(j6) || z5) {
                    if (z5) {
                        if (pVar.k(i5, null, j.j)) {
                            pVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (pVar.k(i5, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (pVar.k(i5, null, j.f10077d)) {
                    break;
                }
            } else {
                if (l6 != j.f10078e) {
                    com.android.billingclient.api.a aVar = j.f10083k;
                    if (l6 == aVar) {
                        pVar.n(i5, null);
                        return 5;
                    }
                    if (l6 == j.f10081h) {
                        pVar.n(i5, null);
                        return 5;
                    }
                    if (l6 == j.f10084l) {
                        pVar.n(i5, null);
                        x();
                        return 4;
                    }
                    pVar.n(i5, null);
                    if (l6 instanceof a0) {
                        l6 = ((a0) l6).f10052a;
                    }
                    if (F(l6, obj)) {
                        pVar.o(i5, j.f10082i);
                        return 0;
                    }
                    if (pVar.f10097f.getAndSet((i5 * 2) + 1, aVar) != aVar) {
                        pVar.m(i5, true);
                    }
                    return 5;
                }
                if (pVar.k(i5, l6, j.f10077d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void J(long j6) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        h hVar = this;
        if (hVar.z()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f10066d;
            if (atomicLongFieldUpdater.get(hVar) > j6) {
                break;
            } else {
                hVar = this;
            }
        }
        int i5 = j.f10076c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10067e;
            if (i10 < i5) {
                long j10 = atomicLongFieldUpdater.get(hVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j10 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(hVar);
                    long j13 = atomicLongFieldUpdater2.get(hVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z5 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z5) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j13, 4611686018427387904L + j14);
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // gg.y
    public final Object b(ig.o oVar) {
        return C(this, oVar);
    }

    @Override // gg.y
    public final com.google.firebase.messaging.x d() {
        d dVar = d.f10056a;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        vf.a aVar = (vf.a) TypeIntrinsics.beforeCheckcastToFunctionOfArity(dVar, 3);
        e eVar = e.f10057a;
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new com.google.firebase.messaging.x(this, aVar, (vf.a) TypeIntrinsics.beforeCheckcastToFunctionOfArity(eVar, 3), null);
    }

    @Override // gg.y
    public final Object e() {
        p pVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10065c;
        long j6 = atomicLongFieldUpdater.get(this);
        long j10 = f10064b.get(this);
        if (v(true, j10)) {
            return new m(q());
        }
        long j11 = j10 & 1152921504606846975L;
        n nVar = o.f10094b;
        if (j6 >= j11) {
            return nVar;
        }
        Object obj = j.f10083k;
        p pVar2 = (p) f10069g.get(this);
        while (!w()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j12 = j.f10075b;
            long j13 = andIncrement / j12;
            int i5 = (int) (andIncrement % j12);
            if (pVar2.f18527c != j13) {
                p p10 = p(j13, pVar2);
                if (p10 == null) {
                    continue;
                } else {
                    pVar = p10;
                }
            } else {
                pVar = pVar2;
            }
            Object H = H(pVar, i5, andIncrement, obj);
            p pVar3 = pVar;
            if (H == j.f10085m) {
                f2 f2Var = obj instanceof f2 ? (f2) obj : null;
                if (f2Var != null) {
                    f2Var.b(pVar3, i5);
                }
                J(andIncrement);
                pVar3.i();
                return nVar;
            }
            if (H != j.f10087o) {
                if (H == j.f10086n) {
                    throw new IllegalStateException("unexpected");
                }
                pVar3.b();
                return H;
            }
            if (andIncrement < t()) {
                pVar3.b();
            }
            pVar2 = pVar3;
        }
        return new m(q());
    }

    @Override // gg.z
    public Object g(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10064b;
        boolean z5 = false;
        long j6 = 1152921504606846975L;
        boolean z7 = v(false, atomicLongFieldUpdater.get(this)) ? false : !i(r1 & 1152921504606846975L);
        n nVar = o.f10094b;
        if (z7) {
            return nVar;
        }
        j1.n nVar2 = j.j;
        p pVar = (p) f10068f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = andIncrement & j6;
            boolean v5 = v(z5, andIncrement);
            int i5 = j.f10075b;
            long j11 = i5;
            long j12 = j10 / j11;
            int i10 = (int) (j10 % j11);
            if (pVar.f18527c != j12) {
                p a7 = a(this, j12, pVar);
                if (a7 != null) {
                    pVar = a7;
                } else {
                    if (v5) {
                        return new m(s());
                    }
                    z5 = false;
                    j6 = 1152921504606846975L;
                }
            }
            int f6 = f(this, pVar, i10, obj, j10, nVar2, v5);
            if (f6 == 0) {
                pVar.b();
                return Unit.f19194a;
            }
            if (f6 == 1) {
                return Unit.f19194a;
            }
            if (f6 == 2) {
                if (v5) {
                    pVar.i();
                    return new m(s());
                }
                f2 f2Var = nVar2 instanceof f2 ? (f2) nVar2 : null;
                if (f2Var != null) {
                    f2Var.b(pVar, i10 + i5);
                }
                pVar.i();
                return nVar;
            }
            if (f6 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (f6 == 4) {
                if (j10 < f10065c.get(this)) {
                    pVar.b();
                }
                return new m(s());
            }
            if (f6 == 5) {
                pVar.b();
            }
            z5 = false;
            j6 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x019a, code lost:
    
        return kotlin.Unit.f19194a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00c0, code lost:
    
        c(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017c A[RETURN] */
    @Override // gg.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(Object obj, Continuation frame) {
        int f6;
        Object r5;
        lf.a aVar;
        Object obj2;
        h hVar;
        p pVar;
        int i5;
        int i10;
        boolean z5;
        h hVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10068f;
        p pVar2 = (p) atomicReferenceFieldUpdater.get(hVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10064b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar2);
            long j6 = andIncrement & 1152921504606846975L;
            boolean v5 = hVar2.v(false, andIncrement);
            int i11 = j.f10075b;
            long j10 = i11;
            long j11 = j6 / j10;
            int i12 = (int) (j6 % j10);
            if (pVar2.f18527c != j11) {
                p a7 = a(hVar2, j11, pVar2);
                if (a7 != null) {
                    pVar2 = a7;
                } else if (v5) {
                    Object B = B(obj, frame);
                    if (B == lf.a.f20034a) {
                        return B;
                    }
                }
            }
            int f10 = f(hVar2, pVar2, i12, obj, j6, null, v5);
            if (f10 == 0) {
                pVar2.b();
                break;
            }
            if (f10 == 1) {
                break;
            }
            if (f10 != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10065c;
                if (f10 == 3) {
                    eg.l p10 = c0.p(lf.d.b(frame));
                    Object obj3 = obj;
                    try {
                        f6 = f(hVar2, pVar2, i12, obj3, j6, p10, false);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (f6 == 0) {
                            pVar2.b();
                            gf.o oVar = gf.q.f10031a;
                        } else if (f6 != 1) {
                            if (f6 != 2) {
                                if (f6 != 4) {
                                    String str = "unexpected";
                                    if (f6 != 5) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    pVar2.b();
                                    p pVar3 = (p) atomicReferenceFieldUpdater.get(hVar2);
                                    while (true) {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar2);
                                        long j12 = andIncrement2 & 1152921504606846975L;
                                        boolean v10 = hVar2.v(false, andIncrement2);
                                        int i13 = j.f10075b;
                                        AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                        long j13 = i13;
                                        String str2 = str;
                                        long j14 = j12 / j13;
                                        int i14 = (int) (j12 % j13);
                                        if (pVar3.f18527c != j14) {
                                            p a10 = a(hVar2, j14, pVar3);
                                            if (a10 != null) {
                                                i5 = i13;
                                                i10 = i14;
                                                z5 = v10;
                                                pVar = a10;
                                            } else {
                                                if (v10) {
                                                    break;
                                                }
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                            }
                                        } else {
                                            pVar = pVar3;
                                            i5 = i13;
                                            i10 = i14;
                                            z5 = v10;
                                        }
                                        int f11 = f(hVar2, pVar, i10, obj3, j12, p10, z5);
                                        Object obj4 = obj3;
                                        hVar = hVar2;
                                        p pVar4 = pVar;
                                        int i15 = i10;
                                        obj2 = obj4;
                                        if (f11 == 0) {
                                            pVar4.b();
                                            gf.o oVar2 = gf.q.f10031a;
                                            break;
                                        }
                                        if (f11 == 1) {
                                            gf.o oVar3 = gf.q.f10031a;
                                            break;
                                        }
                                        if (f11 != 2) {
                                            if (f11 == 3) {
                                                throw new IllegalStateException(str2);
                                            }
                                            if (f11 != 4) {
                                                if (f11 == 5) {
                                                    pVar4.b();
                                                }
                                                pVar3 = pVar4;
                                                hVar2 = hVar;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                str = str2;
                                                obj3 = obj2;
                                            } else if (j12 < atomicLongFieldUpdater2.get(hVar)) {
                                                pVar4.b();
                                            }
                                        } else if (z5) {
                                            pVar4.i();
                                        } else {
                                            p10.b(pVar4, i15 + i5);
                                        }
                                    }
                                } else {
                                    obj2 = obj3;
                                    hVar = hVar2;
                                    if (j6 < atomicLongFieldUpdater2.get(hVar)) {
                                        pVar2.b();
                                    }
                                }
                                c(hVar, obj2, p10);
                            } else {
                                p10.b(pVar2, i12 + i11);
                            }
                            r5 = p10.r();
                            aVar = lf.a.f20034a;
                            if (r5 == aVar) {
                                Intrinsics.checkNotNullParameter(frame, "frame");
                            }
                            if (r5 != aVar) {
                                r5 = Unit.f19194a;
                            }
                            if (r5 == aVar) {
                                return r5;
                            }
                        } else {
                            gf.o oVar4 = gf.q.f10031a;
                        }
                        p10.resumeWith(Unit.f19194a);
                        r5 = p10.r();
                        aVar = lf.a.f20034a;
                        if (r5 == aVar) {
                        }
                        if (r5 != aVar) {
                        }
                        if (r5 == aVar) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        p10.A();
                        throw th;
                    }
                } else if (f10 == 4) {
                    if (j6 < atomicLongFieldUpdater2.get(hVar2)) {
                        pVar2.b();
                    }
                    Object B2 = B(obj, frame);
                    if (B2 == lf.a.f20034a) {
                        return B2;
                    }
                } else if (f10 == 5) {
                    pVar2.b();
                }
            } else if (v5) {
                pVar2.i();
                Object B3 = B(obj, frame);
                if (B3 == lf.a.f20034a) {
                    return B3;
                }
            }
        }
    }

    public final boolean i(long j6) {
        return j6 < f10066d.get(this) || j6 < f10065c.get(this) + ((long) this.f10072a);
    }

    @Override // gg.y
    public final c iterator() {
        return new c(this);
    }

    public final boolean j(Throwable th2) {
        return l(th2, false);
    }

    @Override // gg.y
    public final void k(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[LOOP:2: B:17:0x003c->B:39:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[LOOP:3: B:22:0x006e->B:30:?, LOOP_LABEL: LOOP:3: B:22:0x006e->B:30:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004c A[LOOP:5: B:40:0x004c->B:48:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean l(Throwable th2, boolean z5) {
        h hVar;
        com.android.billingclient.api.a aVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z7;
        long j6;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10064b;
        if (z5) {
            do {
                j13 = atomicLongFieldUpdater.get(this);
                if (((int) (j13 >> 60)) == 0) {
                    p pVar = j.f10074a;
                    hVar = this;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j13, (j13 & 1152921504606846975L) + (1 << 60)));
            aVar = j.f10090s;
            while (true) {
                atomicReferenceFieldUpdater = f10071i;
                if (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, th2)) {
                    z7 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    z7 = false;
                    break;
                }
            }
            if (z5) {
                do {
                    j6 = atomicLongFieldUpdater.get(this);
                    int i5 = (int) (j6 >> 60);
                    if (i5 == 0) {
                        j10 = j6 & 1152921504606846975L;
                        j11 = 2;
                    } else {
                        if (i5 != 1) {
                            break;
                        }
                        j10 = j6 & 1152921504606846975L;
                        j11 = 3;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(hVar, j6, (j11 << 60) + j10));
            } else {
                do {
                    j12 = atomicLongFieldUpdater.get(this);
                } while (!atomicLongFieldUpdater.compareAndSet(hVar, j12, (3 << 60) + (j12 & 1152921504606846975L)));
            }
            x();
            if (z7) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = j;
                    obj = atomicReferenceFieldUpdater2.get(this);
                    com.android.billingclient.api.a aVar2 = obj == null ? j.q : j.f10089r;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, aVar2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    }
                }
                if (obj != null) {
                    ((Function1) obj).invoke(q());
                    return z7;
                }
            }
            return z7;
        }
        hVar = this;
        aVar = j.f10090s;
        while (true) {
            atomicReferenceFieldUpdater = f10071i;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, th2)) {
            }
        }
        if (z5) {
        }
        x();
        if (z7) {
        }
        return z7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008d, code lost:
    
        r1 = (gg.p) ((jg.c) jg.c.f18489b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p m(long j6) {
        Object obj;
        long j10;
        Object obj2 = f10070h.get(this);
        p pVar = (p) f10068f.get(this);
        if (pVar.f18527c > ((p) obj2).f18527c) {
            obj2 = pVar;
        }
        p pVar2 = (p) f10069g.get(this);
        if (pVar2.f18527c > ((p) obj2).f18527c) {
            obj2 = pVar2;
        }
        jg.c cVar = (jg.c) obj2;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = jg.c.f18488a;
            Object obj3 = atomicReferenceFieldUpdater.get(cVar);
            obj = null;
            com.android.billingclient.api.a aVar = jg.b.f18485a;
            if (obj3 == aVar) {
                break;
            }
            jg.c cVar2 = (jg.c) obj3;
            if (cVar2 == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, null, aVar)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != null) {
                        break;
                    }
                }
                break loop0;
            }
            cVar = cVar2;
        }
        p pVar3 = (p) cVar;
        if (y()) {
            p pVar4 = pVar3;
            loop2: do {
                int i5 = j.f10075b - 1;
                while (true) {
                    if (-1 >= i5) {
                        break;
                    }
                    j10 = (pVar4.f18527c * j.f10075b) + i5;
                    if (j10 < f10065c.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object l6 = pVar4.l(i5);
                        if (l6 != null && l6 != j.f10078e) {
                            if (l6 == j.f10077d) {
                                break loop2;
                            }
                        } else {
                            if (pVar4.k(i5, l6, j.f10084l)) {
                                pVar4.i();
                                break;
                            }
                        }
                    }
                    i5--;
                }
            } while (pVar4 != null);
            j10 = -1;
            if (j10 != -1) {
                n(j10);
            }
        }
        loop5: for (p pVar5 = pVar3; pVar5 != null; pVar5 = (p) ((jg.c) jg.c.f18489b.get(pVar5))) {
            for (int i10 = j.f10075b - 1; -1 < i10; i10--) {
                if ((pVar5.f18527c * j.f10075b) + i10 < j6) {
                    break loop5;
                }
                while (true) {
                    Object l10 = pVar5.l(i10);
                    if (l10 != null && l10 != j.f10078e) {
                        if (!(l10 instanceof a0)) {
                            if (!(l10 instanceof f2)) {
                                break;
                            }
                            if (pVar5.k(i10, l10, j.f10084l)) {
                                obj = jg.h.e(obj, l10);
                                pVar5.m(i10, true);
                                break;
                            }
                        } else {
                            if (pVar5.k(i10, l10, j.f10084l)) {
                                obj = jg.h.e(obj, ((a0) l10).f10052a);
                                pVar5.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (pVar5.k(i10, l10, j.f10084l)) {
                            pVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                E((f2) obj, true);
                return pVar3;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                E((f2) arrayList.get(size), true);
            }
        }
        return pVar3;
    }

    public final void n(long j6) {
        p pVar = (p) f10069g.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10065c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j6 < Math.max(this.f10072a + j10, f10066d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = j.f10075b;
                long j12 = j10 / j11;
                int i5 = (int) (j10 % j11);
                if (pVar.f18527c != j12) {
                    p p10 = p(j12, pVar);
                    if (p10 != null) {
                        pVar = p10;
                    }
                }
                p pVar2 = pVar;
                if (H(pVar2, i5, j10, null) != j.f10087o) {
                    pVar2.b();
                } else if (j10 < t()) {
                    pVar2.b();
                }
                pVar = pVar2;
            }
        }
    }

    public final void o() {
        Object a7;
        if (z()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10070h;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f10066d.getAndIncrement(this);
            long j6 = andIncrement / j.f10075b;
            if (t() <= andIncrement) {
                if (pVar.f18527c < j6 && pVar.c() != null) {
                    A(j6, pVar);
                }
                u(this);
                return;
            }
            if (pVar.f18527c != j6) {
                i iVar = i.f10073a;
                while (true) {
                    a7 = jg.b.a(pVar, j6, iVar);
                    if (!jg.h.d(a7)) {
                        jg.u b10 = jg.h.b(a7);
                        while (true) {
                            jg.u uVar = (jg.u) atomicReferenceFieldUpdater.get(this);
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
                    } else {
                        break;
                    }
                }
                p pVar2 = null;
                if (jg.h.d(a7)) {
                    x();
                    A(j6, pVar);
                    u(this);
                } else {
                    p pVar3 = (p) jg.h.b(a7);
                    long j10 = pVar3.f18527c;
                    if (j10 > j6) {
                        long j11 = j.f10075b;
                        if (f10066d.compareAndSet(this, 1 + andIncrement, j10 * j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f10067e;
                            if ((atomicLongFieldUpdater.addAndGet(this, (j10 * j11) - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            u(this);
                        }
                    } else {
                        pVar2 = pVar3;
                    }
                }
                if (pVar2 == null) {
                    continue;
                } else {
                    pVar = pVar2;
                }
            }
            int i5 = (int) (andIncrement % j.f10075b);
            Object l6 = pVar.l(i5);
            boolean z5 = l6 instanceof f2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f10065c;
            if (!z5 || andIncrement < atomicLongFieldUpdater2.get(this) || !pVar.k(i5, l6, j.f10080g)) {
                while (true) {
                    Object l10 = pVar.l(i5);
                    if (!(l10 instanceof f2)) {
                        if (l10 != j.j) {
                            if (l10 != null) {
                                if (l10 == j.f10077d || l10 == j.f10081h || l10 == j.f10082i || l10 == j.f10083k || l10 == j.f10084l) {
                                    break loop0;
                                }
                                if (l10 != j.f10079f) {
                                    throw new IllegalStateException(("Unexpected cell state: " + l10).toString());
                                }
                            } else if (pVar.k(i5, l10, j.f10078e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                        if (pVar.k(i5, l10, new a0((f2) l10))) {
                            break loop0;
                        }
                    } else if (pVar.k(i5, l10, j.f10080g)) {
                        if (G(l10, pVar, i5)) {
                            pVar.o(i5, j.f10077d);
                            break;
                        } else {
                            pVar.o(i5, j.j);
                            pVar.i();
                        }
                    }
                }
            } else if (G(l6, pVar, i5)) {
                pVar.o(i5, j.f10077d);
                break;
            } else {
                pVar.o(i5, j.j);
                pVar.i();
                u(this);
            }
        }
        u(this);
    }

    public final p p(long j6, p pVar) {
        Object a7;
        long j10;
        p pVar2 = j.f10074a;
        i iVar = i.f10073a;
        loop0: while (true) {
            a7 = jg.b.a(pVar, j6, iVar);
            if (!jg.h.d(a7)) {
                jg.u b10 = jg.h.b(a7);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10069g;
                    jg.u uVar = (jg.u) atomicReferenceFieldUpdater.get(this);
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
        if (jg.h.d(a7)) {
            x();
            if (pVar.f18527c * j.f10075b < t()) {
                pVar.b();
                return null;
            }
        } else {
            p pVar3 = (p) jg.h.b(a7);
            long j11 = pVar3.f18527c;
            if (!z() && j6 <= f10066d.get(this) / j.f10075b) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f10070h;
                    jg.u uVar2 = (jg.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f18527c >= j11 || !pVar3.j()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, pVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                            if (pVar3.f()) {
                                pVar3.e();
                            }
                        }
                    }
                    if (uVar2.f()) {
                        uVar2.e();
                    }
                }
            }
            if (j11 <= j6) {
                return pVar3;
            }
            long j12 = j11 * j.f10075b;
            do {
                j10 = f10065c.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!f10065c.compareAndSet(this, j10, j12));
            if (j11 * j.f10075b < t()) {
                pVar3.b();
            }
        }
        return null;
    }

    public final Throwable q() {
        return (Throwable) f10071i.get(this);
    }

    public final Throwable r() {
        Throwable q = q();
        return q == null ? new q("Channel was closed") : q;
    }

    public final Throwable s() {
        Throwable q = q();
        return q == null ? new r("Channel was closed") : q;
    }

    public final long t() {
        return f10064b.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b7, code lost:
    
        r16 = r7;
        r3 = (gg.p) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
    
        if (r3 != null) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z5;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i5 = (int) (f10064b.get(this) >> 60);
        if (i5 == 2) {
            sb2.append("closed,");
        } else if (i5 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f10072a + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z7 = true;
        List f6 = kotlin.collections.u.f(f10069g.get(this), f10068f.get(this), f10070h.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : f6) {
            if (((p) obj) != j.f10074a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j6 = ((p) next).f18527c;
            do {
                Object next2 = it.next();
                long j10 = ((p) next2).f18527c;
                if (j6 > j10) {
                    next = next2;
                    j6 = j10;
                }
            } while (it.hasNext());
        }
        p pVar = (p) next;
        long j11 = f10065c.get(this);
        long t3 = t();
        loop2: while (true) {
            int i11 = j.f10075b;
            int i12 = i10;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                long j12 = (pVar.f18527c * j.f10075b) + i12;
                if (j12 >= t3 && j12 >= j11) {
                    break loop2;
                }
                Object l6 = pVar.l(i12);
                boolean z10 = z7;
                Object obj2 = pVar.f10097f.get(i12 * 2);
                if (l6 instanceof eg.j) {
                    str = (j12 >= j11 || j12 < t3) ? (j12 >= t3 || j12 < j11) ? "cont" : "send" : "receive";
                } else if (l6 instanceof mg.f) {
                    str = (j12 >= j11 || j12 < t3) ? (j12 >= t3 || j12 < j11) ? "select" : "onSend" : "onReceive";
                } else if (l6 instanceof x) {
                    str = "receiveCatching";
                } else if (l6 instanceof a0) {
                    str = "EB(" + l6 + ')';
                } else if (Intrinsics.areEqual(l6, j.f10079f) || Intrinsics.areEqual(l6, j.f10080g)) {
                    str = "resuming_sender";
                } else {
                    if (l6 != null && !Intrinsics.areEqual(l6, j.f10078e) && !Intrinsics.areEqual(l6, j.f10082i) && !Intrinsics.areEqual(l6, j.f10081h) && !Intrinsics.areEqual(l6, j.f10083k) && !Intrinsics.areEqual(l6, j.j) && !Intrinsics.areEqual(l6, j.f10084l)) {
                        str = l6.toString();
                    }
                    i12++;
                    z7 = z10;
                }
                if (obj2 != null) {
                    sb2.append("(" + str + ',' + obj2 + "),");
                } else {
                    sb2.append(str + ',');
                }
                i12++;
                z7 = z10;
            }
            z7 = z5;
            i10 = 0;
        }
        if (d0.y(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0167, code lost:
    
        gg.h.f10065c.compareAndSet(r13, r7, r7 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (gg.p) ((jg.c) jg.c.f18489b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(boolean z5, long j6) {
        int i5 = (int) (j6 >> 60);
        if (i5 != 0 && i5 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f10065c;
            if (i5 == 2) {
                m(1152921504606846975L & j6);
                if (z5) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10069g;
                        p pVar = (p) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (t() <= j10) {
                            break;
                        }
                        long j11 = j.f10075b;
                        long j12 = j10 / j11;
                        if (pVar.f18527c != j12 && (pVar = p(j12, pVar)) == null) {
                            if (((p) atomicReferenceFieldUpdater.get(this)).f18527c < j12) {
                                break;
                            }
                        } else {
                            pVar.b();
                            int i10 = (int) (j10 % j11);
                            while (true) {
                                Object l6 = pVar.l(i10);
                                if (l6 == null || l6 == j.f10078e) {
                                    if (pVar.k(i10, l6, j.f10081h)) {
                                        o();
                                        break;
                                    }
                                } else {
                                    if (l6 == j.f10077d) {
                                        break;
                                    }
                                    if (l6 != j.j) {
                                        if (l6 != j.f10084l) {
                                            if (l6 != j.f10082i) {
                                                if (l6 != j.f10081h) {
                                                    if (l6 == j.f10080g) {
                                                        break;
                                                    }
                                                    if (l6 != j.f10079f && j10 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException(c1.i(i5, "unexpected close status: ").toString());
                }
                p m6 = m(1152921504606846975L & j6);
                Object obj = null;
                loop0: do {
                    int i11 = j.f10075b - 1;
                    while (true) {
                        if (-1 >= i11) {
                            break;
                        }
                        long j13 = (m6.f18527c * j.f10075b) + i11;
                        while (true) {
                            Object l10 = m6.l(i11);
                            if (l10 == j.f10082i) {
                                break loop0;
                            }
                            if (l10 == j.f10077d) {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (m6.k(i11, l10, j.f10084l)) {
                                    m6.n(i11, null);
                                    m6.i();
                                    break;
                                }
                            } else if (l10 != j.f10078e && l10 != null) {
                                if (!(l10 instanceof f2) && !(l10 instanceof a0)) {
                                    com.android.billingclient.api.a aVar = j.f10080g;
                                    if (l10 == aVar || l10 == j.f10079f) {
                                        break loop0;
                                    }
                                    if (l10 != aVar) {
                                        break;
                                    }
                                } else {
                                    if (j13 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    f2 f2Var = l10 instanceof a0 ? ((a0) l10).f10052a : (f2) l10;
                                    if (m6.k(i11, l10, j.f10084l)) {
                                        obj = jg.h.e(obj, f2Var);
                                        m6.n(i11, null);
                                        m6.i();
                                        break;
                                    }
                                }
                            } else if (m6.k(i11, l10, j.f10084l)) {
                                m6.i();
                                break;
                            }
                        }
                        i11--;
                    }
                } while (m6 != null);
                if (obj != null) {
                    if (obj instanceof ArrayList) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                        ArrayList arrayList = (ArrayList) obj;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            E((f2) arrayList.get(size), false);
                        }
                    } else {
                        E((f2) obj, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean w() {
        return v(true, f10064b.get(this));
    }

    public final boolean x() {
        return v(false, f10064b.get(this));
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j6 = f10066d.get(this);
        return j6 == 0 || j6 == LongCompanionObject.MAX_VALUE;
    }
}
