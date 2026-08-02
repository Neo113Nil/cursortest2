package jg;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18516e = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f18517f = AtomicLongFieldUpdater.newUpdater(p.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final com.android.billingclient.api.a f18518g = new com.android.billingclient.api.a("REMOVE_FROZEN", 9);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f18519a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18520b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18521c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f18522d;

    public p(int i5, boolean z5) {
        this.f18519a = i5;
        this.f18520b = z5;
        int i10 = i5 - 1;
        this.f18521c = i10;
        this.f18522d = new AtomicReferenceArray(i5);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i5 & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18517f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i5 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f18521c;
            if (((i10 + 2) & i11) == (i5 & i11)) {
                return 1;
            }
            boolean z5 = this.f18520b;
            AtomicReferenceArray atomicReferenceArray = this.f18522d;
            if (z5 || atomicReferenceArray.get(i10 & i11) == null) {
                if (f18517f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i10 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i10 & i11, obj);
                    p pVar = this;
                    while ((atomicLongFieldUpdater.get(pVar) & 1152921504606846976L) != 0) {
                        pVar = pVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = pVar.f18522d;
                        int i12 = pVar.f18521c & i10;
                        Object obj2 = atomicReferenceArray2.get(i12);
                        if ((obj2 instanceof o) && ((o) obj2).f18515a == i10) {
                            atomicReferenceArray2.set(i12, obj);
                        } else {
                            pVar = null;
                        }
                        if (pVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f18519a;
                if (i13 < 1024 || ((i10 - i5) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f18517f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final p c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        p pVar;
        while (true) {
            atomicLongFieldUpdater = f18517f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                pVar = this;
                break;
            }
            long j6 = 1152921504606846976L | j;
            pVar = this;
            if (atomicLongFieldUpdater.compareAndSet(pVar, j, j6)) {
                j = j6;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18516e;
            p pVar2 = (p) atomicReferenceFieldUpdater.get(this);
            if (pVar2 != null) {
                return pVar2;
            }
            p pVar3 = new p(pVar.f18519a * 2, pVar.f18520b);
            int i5 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = pVar.f18521c;
                int i12 = i5 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = pVar.f18522d.get(i12);
                if (obj == null) {
                    obj = new o(i5);
                }
                pVar3.f18522d.set(pVar3.f18521c & i5, obj);
                i5++;
            }
            atomicLongFieldUpdater.set(pVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, pVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        p pVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f18517f;
            long j = atomicLongFieldUpdater.get(pVar);
            if ((j & 1152921504606846976L) != 0) {
                return f18518g;
            }
            int i5 = (int) (j & 1073741823);
            int i10 = pVar.f18521c;
            int i11 = i5 & i10;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = pVar.f18522d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z5 = pVar.f18520b;
            if (obj == null) {
                if (z5) {
                    break;
                }
            } else {
                if (obj instanceof o) {
                    break;
                }
                long j6 = (i5 + 1) & 1073741823;
                if (f18517f.compareAndSet(pVar, j, (j & (-1073741824)) | j6)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                pVar = this;
                if (z5) {
                    while (true) {
                        long j10 = atomicLongFieldUpdater.get(pVar);
                        int i12 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            pVar = pVar.c();
                        } else {
                            p pVar2 = pVar;
                            if (f18517f.compareAndSet(pVar2, j10, (j10 & (-1073741824)) | j6)) {
                                pVar2.f18522d.set(i12 & pVar2.f18521c, null);
                                pVar = null;
                            } else {
                                pVar = pVar2;
                            }
                        }
                        if (pVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
