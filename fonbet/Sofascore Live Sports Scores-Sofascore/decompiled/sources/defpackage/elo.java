package defpackage;

import com.google.android.gms.internal.ads.zzhbr;
import com.mbridge.msdk.foundation.controller.a;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class elo extends w3a {
    public static final Unsafe h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;

    static {
        Unsafe f0;
        try {
            try {
                f0 = Unsafe.getUnsafe();
            } catch (Exception e) {
                vp2.e("Could not initialize intrinsics", e);
                return;
            }
        } catch (SecurityException unused) {
            try {
                f0 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, d4.c);
            } catch (Exception unused2) {
                f0 = f0();
            }
        }
        try {
            j = f0.objectFieldOffset(glo.class.getDeclaredField(a.q));
            i = f0.objectFieldOffset(glo.class.getDeclaredField("b"));
            k = f0.objectFieldOffset(glo.class.getDeclaredField("a"));
            l = f0.objectFieldOffset(flo.class.getDeclaredField("a"));
            m = f0.objectFieldOffset(flo.class.getDeclaredField("b"));
            h = f0;
        } catch (NoSuchFieldException e2) {
            is8.h(e2);
        }
    }

    public static /* synthetic */ Unsafe f0() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.w3a
    public final void X(flo floVar, Thread thread) {
        h.putObject(floVar, l, thread);
    }

    @Override // defpackage.w3a
    public final void Y(flo floVar, flo floVar2) {
        h.putObject(floVar, m, floVar2);
    }

    @Override // defpackage.w3a
    public final boolean Z(glo gloVar, flo floVar, flo floVar2) {
        while (true) {
            Unsafe unsafe = h;
            long j2 = j;
            glo gloVar2 = gloVar;
            flo floVar3 = floVar;
            flo floVar4 = floVar2;
            if (unsafe.compareAndSwapObject(gloVar2, j2, floVar3, floVar4)) {
                return true;
            }
            if (unsafe.getObject(gloVar2, j2) != floVar3) {
                return false;
            }
            gloVar = gloVar2;
            floVar = floVar3;
            floVar2 = floVar4;
        }
    }

    @Override // defpackage.w3a
    public final boolean a0(zzhbr zzhbrVar, zko zkoVar, zko zkoVar2) {
        while (true) {
            Unsafe unsafe = h;
            long j2 = i;
            zzhbr zzhbrVar2 = zzhbrVar;
            zko zkoVar3 = zkoVar;
            zko zkoVar4 = zkoVar2;
            if (unsafe.compareAndSwapObject(zzhbrVar2, j2, zkoVar3, zkoVar4)) {
                return true;
            }
            if (unsafe.getObject(zzhbrVar2, j2) != zkoVar3) {
                return false;
            }
            zzhbrVar = zzhbrVar2;
            zkoVar = zkoVar3;
            zkoVar2 = zkoVar4;
        }
    }

    @Override // defpackage.w3a
    public final flo b0(zzhbr zzhbrVar) {
        flo floVar;
        flo floVar2 = flo.c;
        do {
            floVar = zzhbrVar.c;
            if (floVar2 == floVar) {
                break;
            }
        } while (!Z(zzhbrVar, floVar, floVar2));
        return floVar;
    }

    @Override // defpackage.w3a
    public final zko d0(zzhbr zzhbrVar) {
        zko zkoVar;
        zko zkoVar2 = zko.d;
        do {
            zkoVar = zzhbrVar.b;
            if (zkoVar2 == zkoVar) {
                break;
            }
        } while (!a0(zzhbrVar, zkoVar, zkoVar2));
        return zkoVar;
    }

    @Override // defpackage.w3a
    public final boolean e0(glo gloVar, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = h;
            long j2 = k;
            glo gloVar2 = gloVar;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(gloVar2, j2, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(gloVar2, j2) != obj3) {
                return false;
            }
            gloVar = gloVar2;
            obj = obj3;
            obj2 = obj4;
        }
    }
}
