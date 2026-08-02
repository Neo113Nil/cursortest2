package Sh;

import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* renamed from: Sh.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C1579q {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10806a = AtomicReferenceFieldUpdater.newUpdater(C1579q.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10807b = AtomicReferenceFieldUpdater.newUpdater(C1579q.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10808c = AtomicReferenceFieldUpdater.newUpdater(C1579q.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean c(C1579q c1579q, int i10) {
        C1579q l10;
        do {
            l10 = l();
            if (l10 instanceof C1577o) {
                return (((C1577o) l10).f10805d & i10) == 0 && l10.c(c1579q, i10);
            }
        } while (!l10.d(c1579q, this));
        return true;
    }

    public final boolean d(C1579q c1579q, C1579q c1579q2) {
        f10807b.set(c1579q, this);
        f10806a.set(c1579q, c1579q2);
        if (!AbstractC4221b.a(f10806a, this, c1579q2, c1579q)) {
            return false;
        }
        c1579q.i(c1579q2);
        return true;
    }

    public final boolean e(C1579q c1579q) {
        f10807b.set(c1579q, this);
        f10806a.set(c1579q, this);
        while (j() == this) {
            if (AbstractC4221b.a(f10806a, this, this, c1579q)) {
                c1579q.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i10) {
        c(new C1577o(i10), i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (f0.AbstractC4221b.a(Sh.C1579q.f10806a, r3, r2, ((Sh.A) r4).f10760a) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0025, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1579q g() {
        while (true) {
            C1579q c1579q = (C1579q) f10807b.get(this);
            C1579q c1579q2 = c1579q;
            while (true) {
                C1579q c1579q3 = null;
                while (true) {
                    Object obj = f10806a.get(c1579q2);
                    if (obj == this) {
                        if (c1579q != c1579q2 && !AbstractC4221b.a(f10807b, this, c1579q, c1579q2)) {
                        }
                    } else {
                        if (p()) {
                            return null;
                        }
                        if (!(obj instanceof A)) {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            c1579q3 = c1579q2;
                            c1579q2 = (C1579q) obj;
                        } else {
                            if (c1579q3 != null) {
                                break;
                            }
                            c1579q2 = (C1579q) f10807b.get(c1579q2);
                        }
                    }
                }
                c1579q2 = c1579q3;
            }
        }
    }

    public final C1579q h(C1579q c1579q) {
        while (c1579q.p()) {
            c1579q = (C1579q) f10807b.get(c1579q);
        }
        return c1579q;
    }

    public final void i(C1579q c1579q) {
        C1579q c1579q2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10807b;
        do {
            c1579q2 = (C1579q) atomicReferenceFieldUpdater.get(c1579q);
            if (j() != c1579q) {
                return;
            }
        } while (!AbstractC4221b.a(f10807b, c1579q, c1579q2, this));
        if (p()) {
            c1579q.g();
        }
    }

    public final Object j() {
        return f10806a.get(this);
    }

    public final C1579q k() {
        C1579q c1579q;
        Object j10 = j();
        A a10 = j10 instanceof A ? (A) j10 : null;
        if (a10 != null && (c1579q = a10.f10760a) != null) {
            return c1579q;
        }
        Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C1579q) j10;
    }

    public final C1579q l() {
        C1579q g10 = g();
        return g10 == null ? h((C1579q) f10807b.get(this)) : g10;
    }

    public boolean p() {
        return j() instanceof A;
    }

    public boolean q() {
        return r() == null;
    }

    public final C1579q r() {
        Object j10;
        C1579q c1579q;
        do {
            j10 = j();
            if (j10 instanceof A) {
                return ((A) j10).f10760a;
            }
            if (j10 == this) {
                return (C1579q) j10;
            }
            Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c1579q = (C1579q) j10;
        } while (!AbstractC4221b.a(f10806a, this, j10, c1579q.s()));
        c1579q.g();
        return null;
    }

    public final A s() {
        A a10 = (A) f10808c.get(this);
        if (a10 != null) {
            return a10;
        }
        A a11 = new A(this);
        f10808c.set(this, a11);
        return a11;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: Sh.q.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return Ph.U.a(this.receiver);
            }
        } + '@' + Ph.U.b(this);
    }
}
