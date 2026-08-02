package defpackage;

import com.google.android.gms.internal.pal.zzjn;
import com.google.android.gms.internal.pal.zzjp;
import com.mbridge.msdk.foundation.controller.a;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tso extends haa {
    public static final Unsafe i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                vp2.e("Could not initialize intrinsics", e.getCause());
                return;
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new d4(16));
        }
        try {
            k = unsafe.objectFieldOffset(zzjn.class.getDeclaredField(a.q));
            j = unsafe.objectFieldOffset(zzjn.class.getDeclaredField("b"));
            l = unsafe.objectFieldOffset(zzjn.class.getDeclaredField("a"));
            m = unsafe.objectFieldOffset(uso.class.getDeclaredField("a"));
            n = unsafe.objectFieldOffset(uso.class.getDeclaredField("b"));
            i = unsafe;
        } catch (NoSuchFieldException e2) {
            is8.h(e2);
        } catch (RuntimeException e3) {
            throw e3;
        }
    }

    @Override // defpackage.haa
    public final qso O(zzjn zzjnVar) {
        qso qsoVar;
        qso qsoVar2 = qso.b;
        while (true) {
            qsoVar = zzjnVar.b;
            if (qsoVar2 == qsoVar) {
                break;
            }
            zzjn zzjnVar2 = zzjnVar;
            if (zzjp.a(i, zzjnVar2, j, qsoVar, qsoVar2)) {
                break;
            }
            zzjnVar = zzjnVar2;
        }
        return qsoVar;
    }

    @Override // defpackage.haa
    public final uso Q(zzjn zzjnVar) {
        uso usoVar;
        uso usoVar2 = uso.c;
        do {
            usoVar = zzjnVar.c;
            if (usoVar2 == usoVar) {
                break;
            }
        } while (!Y(zzjnVar, usoVar, usoVar2));
        return usoVar;
    }

    @Override // defpackage.haa
    public final void S(uso usoVar, uso usoVar2) {
        i.putObject(usoVar, n, usoVar2);
    }

    @Override // defpackage.haa
    public final void V(uso usoVar, Thread thread) {
        i.putObject(usoVar, m, thread);
    }

    @Override // defpackage.haa
    public final boolean X(zzjn zzjnVar, Object obj, Object obj2) {
        return zzjp.a(i, zzjnVar, l, obj, obj2);
    }

    @Override // defpackage.haa
    public final boolean Y(zzjn zzjnVar, uso usoVar, uso usoVar2) {
        return zzjp.a(i, zzjnVar, k, usoVar, usoVar2);
    }
}
