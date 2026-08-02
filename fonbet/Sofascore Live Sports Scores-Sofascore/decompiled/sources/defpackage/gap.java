package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class gap extends sha {
    public static final Unsafe e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e2) {
                vp2.e("Could not initialize intrinsics", e2.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(d4.d);
        }
        try {
            g = unsafe.objectFieldOffset(iap.class.getDeclaredField(a.q));
            f = unsafe.objectFieldOffset(iap.class.getDeclaredField("b"));
            h = unsafe.objectFieldOffset(iap.class.getDeclaredField("a"));
            i = unsafe.objectFieldOffset(hap.class.getDeclaredField("a"));
            j = unsafe.objectFieldOffset(hap.class.getDeclaredField("b"));
            e = unsafe;
        } catch (NoSuchFieldException e3) {
            is8.h(e3);
        }
    }

    @Override // defpackage.sha
    public final void a0(hap hapVar, Thread thread) {
        e.putObject(hapVar, i, thread);
    }

    @Override // defpackage.sha
    public final void b0(hap hapVar, hap hapVar2) {
        e.putObject(hapVar, j, hapVar2);
    }

    @Override // defpackage.sha
    public final boolean c0(iap iapVar, hap hapVar, hap hapVar2) {
        while (true) {
            Unsafe unsafe = e;
            long j2 = g;
            iap iapVar2 = iapVar;
            hap hapVar3 = hapVar;
            hap hapVar4 = hapVar2;
            if (unsafe.compareAndSwapObject(iapVar2, j2, hapVar3, hapVar4)) {
                return true;
            }
            if (unsafe.getObject(iapVar2, j2) != hapVar3) {
                return false;
            }
            iapVar = iapVar2;
            hapVar = hapVar3;
            hapVar2 = hapVar4;
        }
    }

    @Override // defpackage.sha
    public final boolean d0(iap iapVar, dap dapVar, dap dapVar2) {
        while (true) {
            Unsafe unsafe = e;
            long j2 = f;
            iap iapVar2 = iapVar;
            dap dapVar3 = dapVar;
            dap dapVar4 = dapVar2;
            if (unsafe.compareAndSwapObject(iapVar2, j2, dapVar3, dapVar4)) {
                return true;
            }
            if (unsafe.getObject(iapVar2, j2) != dapVar3) {
                return false;
            }
            iapVar = iapVar2;
            dapVar = dapVar3;
            dapVar2 = dapVar4;
        }
    }

    @Override // defpackage.sha
    public final hap e0(iap iapVar) {
        hap hapVar;
        hap hapVar2 = hap.c;
        do {
            hapVar = iapVar.c;
            if (hapVar2 == hapVar) {
                break;
            }
        } while (!c0(iapVar, hapVar, hapVar2));
        return hapVar;
    }

    @Override // defpackage.sha
    public final dap g0(iap iapVar) {
        dap dapVar;
        dap dapVar2 = dap.d;
        do {
            dapVar = iapVar.b;
            if (dapVar2 == dapVar) {
                break;
            }
        } while (!d0(iapVar, dapVar, dapVar2));
        return dapVar;
    }

    @Override // defpackage.sha
    public final boolean h0(iap iapVar, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = e;
            long j2 = h;
            iap iapVar2 = iapVar;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(iapVar2, j2, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(iapVar2, j2) != obj3) {
                return false;
            }
            iapVar = iapVar2;
            obj = obj3;
            obj2 = obj4;
        }
    }
}
