package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class lib {
    public static final ih2 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = rh0.a;
        f = unsafe.objectFieldOffset(lib.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(lib.class.getDeclaredField("_state$volatile"));
        e = new ih2("REMOVE_FROZEN", 5);
    }

    public lib(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            a70.r("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        a70.r("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        lib libVar = this;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(libVar, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                return (2305843009213693952L & longVolatile) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = libVar.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = libVar.b;
            AtomicReferenceArray atomicReferenceArray = libVar.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                if (unsafe.compareAndSwapLong(libVar, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    lib libVar2 = this;
                    while ((rh0.a.getLongVolatile(libVar2, j) & 1152921504606846976L) != 0) {
                        libVar2 = libVar2.c();
                        AtomicReferenceArray atomicReferenceArray2 = libVar2.d;
                        int i4 = libVar2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof kib) && ((kib) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            libVar2 = null;
                        }
                        if (libVar2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                libVar = this;
            } else {
                int i5 = libVar.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = rh0.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            lib libVar = this;
            if (rh0.a.compareAndSwapLong(libVar, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = libVar;
        }
    }

    public final lib c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = rh0.a;
            long j2 = g;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = rh0.a;
            long j3 = f;
            lib libVar = (lib) unsafe3.getObjectVolatile(this, j3);
            if (libVar != null) {
                return libVar;
            }
            lib libVar2 = new lib(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new kib(i);
                }
                libVar2.d.set(libVar2.c & i, obj);
                i++;
            }
            rh0.a.putLongVolatile(libVar2, g, j & (-1152921504606846977L));
            do {
                unsafe = rh0.a;
                if (unsafe.compareAndSwapObject(this, f, (Object) null, libVar2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d() {
        lib libVar = this;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(libVar, j);
            if ((longVolatile & 1152921504606846976L) != 0) {
                return e;
            }
            int i = (int) (longVolatile & 1073741823);
            int i2 = libVar.c;
            int i3 = ((int) ((1152921503533105152L & longVolatile) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = libVar.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z = libVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof kib) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (unsafe.compareAndSwapLong(libVar, j, longVolatile, (longVolatile & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                libVar = this;
                if (z) {
                    while (true) {
                        Unsafe unsafe2 = rh0.a;
                        long j3 = g;
                        long longVolatile2 = unsafe2.getLongVolatile(libVar, j3);
                        int i5 = (int) (longVolatile2 & 1073741823);
                        if ((longVolatile2 & 1152921504606846976L) != 0) {
                            libVar = libVar.c();
                        } else {
                            if (unsafe2.compareAndSwapLong(libVar, j3, longVolatile2, (longVolatile2 & (-1073741824)) | j2)) {
                                libVar.d.set(libVar.c & i5, null);
                                libVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (libVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
