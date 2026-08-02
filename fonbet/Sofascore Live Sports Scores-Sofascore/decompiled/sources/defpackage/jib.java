package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class jib {
    public static final /* synthetic */ long a = rh0.a.objectFieldOffset(jib.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new lib(8, false);

    public final boolean a(Runnable runnable) {
        jib jibVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = a;
            lib libVar = (lib) unsafe.getObjectVolatile(this, j);
            int a2 = libVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                lib c = libVar.c();
                while (true) {
                    Unsafe unsafe2 = rh0.a;
                    jibVar = this;
                    if (!unsafe2.compareAndSwapObject(jibVar, a, libVar, c) && unsafe2.getObjectVolatile(jibVar, j) == libVar) {
                        this = jibVar;
                    }
                }
            } else {
                if (a2 == 2) {
                    return false;
                }
                jibVar = this;
            }
            this = jibVar;
        }
    }

    public final void b() {
        jib jibVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = a;
            lib libVar = (lib) unsafe.getObjectVolatile(this, j);
            if (libVar.b()) {
                return;
            }
            lib c = libVar.c();
            while (true) {
                jibVar = this;
                if (!rh0.a.compareAndSwapObject(jibVar, a, libVar, c) && rh0.a.getObjectVolatile(jibVar, j) == libVar) {
                    this = jibVar;
                }
            }
            this = jibVar;
        }
    }

    public final int c() {
        lib libVar = (lib) rh0.a.getObjectVolatile(this, a);
        libVar.getClass();
        long longVolatile = rh0.a.getLongVolatile(libVar, lib.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        jib jibVar;
        while (true) {
            Unsafe unsafe = rh0.a;
            long j = a;
            lib libVar = (lib) unsafe.getObjectVolatile(this, j);
            Object d = libVar.d();
            if (d != lib.e) {
                return d;
            }
            lib c = libVar.c();
            while (true) {
                jibVar = this;
                if (!rh0.a.compareAndSwapObject(jibVar, a, libVar, c) && rh0.a.getObjectVolatile(jibVar, j) == libVar) {
                    this = jibVar;
                }
            }
            this = jibVar;
        }
    }
}
