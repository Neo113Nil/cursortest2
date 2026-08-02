package Sh;

import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: Sh.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1580s {

    /* renamed from: e, reason: collision with root package name */
    public static final a f10810e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10811f = AtomicReferenceFieldUpdater.newUpdater(C1580s.class, Object.class, "_next$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f10812g = AtomicLongFieldUpdater.newUpdater(C1580s.class, "_state$volatile");

    /* renamed from: h, reason: collision with root package name */
    public static final G f10813h = new G("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f10814a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10815b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10816c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f10817d;

    /* renamed from: Sh.s$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | i10;
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (i10 << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        public a() {
        }
    }

    /* renamed from: Sh.s$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f10818a;

        public b(int i10) {
            this.f10818a = i10;
        }
    }

    public C1580s(int i10, boolean z10) {
        this.f10814a = i10;
        this.f10815b = z10;
        int i11 = i10 - 1;
        this.f10816c = i11;
        this.f10817d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10812g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return f10810e.a(j10);
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f10816c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            if (!this.f10815b && f().get(i11 & i12) != null) {
                int i13 = this.f10814a;
                if (i13 < 1024 || ((i11 - i10) & 1073741823) > (i13 >> 1)) {
                    break;
                }
            } else if (f10812g.compareAndSet(this, j10, f10810e.c(j10, (i11 + 1) & 1073741823))) {
                f().set(i11 & i12, obj);
                C1580s c1580s = this;
                while ((f10812g.get(c1580s) & 1152921504606846976L) != 0 && (c1580s = c1580s.l().e(i11, obj)) != null) {
                }
                return 0;
            }
        }
        return 1;
    }

    public final C1580s b(long j10) {
        C1580s c1580s = new C1580s(this.f10814a * 2, this.f10815b);
        int i10 = (int) (1073741823 & j10);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f10816c;
            if ((i10 & i12) == (i12 & i11)) {
                f10812g.set(c1580s, f10810e.d(j10, 1152921504606846976L));
                return c1580s;
            }
            Object obj = f().get(this.f10816c & i10);
            if (obj == null) {
                obj = new b(i10);
            }
            c1580s.f().set(c1580s.f10816c & i10, obj);
            i10++;
        }
    }

    public final C1580s c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10811f;
        while (true) {
            C1580s c1580s = (C1580s) atomicReferenceFieldUpdater.get(this);
            if (c1580s != null) {
                return c1580s;
            }
            AbstractC4221b.a(f10811f, this, null, b(j10));
        }
    }

    public final boolean d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10812g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final C1580s e(int i10, Object obj) {
        Object obj2 = f().get(this.f10816c & i10);
        if (!(obj2 instanceof b) || ((b) obj2).f10818a != i10) {
            return null;
        }
        f().set(i10 & this.f10816c, obj);
        return this;
    }

    public final /* synthetic */ AtomicReferenceArray f() {
        return this.f10817d;
    }

    public final int g() {
        long j10 = f10812g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j10))) & 1073741823;
    }

    public final boolean j() {
        long j10 = f10812g.get(this);
        return ((int) (1073741823 & j10)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final long k() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10812g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = 1152921504606846976L | j10;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    public final C1580s l() {
        return c(k());
    }

    public final Object m() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10812g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f10813h;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = this.f10816c;
            if ((((int) ((1152921503533105152L & j10) >> 30)) & i11) == (i11 & i10)) {
                return null;
            }
            Object obj = f().get(this.f10816c & i10);
            if (obj == null) {
                if (this.f10815b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i12 = (i10 + 1) & 1073741823;
                if (f10812g.compareAndSet(this, j10, f10810e.b(j10, i12))) {
                    f().set(this.f10816c & i10, null);
                    return obj;
                }
                if (this.f10815b) {
                    C1580s c1580s = this;
                    do {
                        c1580s = c1580s.n(i10, i12);
                    } while (c1580s != null);
                    return obj;
                }
            }
        }
    }

    public final C1580s n(int i10, int i11) {
        long j10;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10812g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            i12 = (int) (1073741823 & j10);
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f10812g.compareAndSet(this, j10, f10810e.b(j10, i11)));
        f().set(this.f10816c & i12, null);
        return null;
    }
}
