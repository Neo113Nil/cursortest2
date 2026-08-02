package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class uin extends haa {
    public static final Unsafe i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;

    static {
        Unsafe a0;
        try {
            try {
                a0 = Unsafe.getUnsafe();
            } catch (Exception e) {
                vp2.e("Could not initialize intrinsics", e);
                return;
            }
        } catch (SecurityException unused) {
            try {
                a0 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, d4.b);
            } catch (Exception unused2) {
                a0 = a0();
            }
        }
        try {
            k = a0.objectFieldOffset(yin.class.getDeclaredField(a.q));
            j = a0.objectFieldOffset(yin.class.getDeclaredField("b"));
            l = a0.objectFieldOffset(yin.class.getDeclaredField("a"));
            m = a0.objectFieldOffset(vin.class.getDeclaredField("a"));
            n = a0.objectFieldOffset(vin.class.getDeclaredField("b"));
            i = a0;
        } catch (NoSuchFieldException e2) {
            is8.h(e2);
        }
    }

    public static /* synthetic */ Unsafe a0() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.haa
    public final void P(vin vinVar, Thread thread) {
        i.putObject(vinVar, m, thread);
    }

    @Override // defpackage.haa
    public final void R(vin vinVar, vin vinVar2) {
        i.putObject(vinVar, n, vinVar2);
    }

    @Override // defpackage.haa
    public final boolean T(yin yinVar, vin vinVar, vin vinVar2) {
        while (true) {
            Unsafe unsafe = i;
            long j2 = k;
            yin yinVar2 = yinVar;
            vin vinVar3 = vinVar;
            vin vinVar4 = vinVar2;
            if (unsafe.compareAndSwapObject(yinVar2, j2, vinVar3, vinVar4)) {
                return true;
            }
            if (unsafe.getObject(yinVar2, j2) != vinVar3) {
                return false;
            }
            yinVar = yinVar2;
            vinVar = vinVar3;
            vinVar2 = vinVar4;
        }
    }

    @Override // defpackage.haa
    public final vin U(yin yinVar) {
        vin vinVar;
        vin vinVar2 = vin.c;
        do {
            vinVar = yinVar.c;
            if (vinVar2 == vinVar) {
                break;
            }
        } while (!T(yinVar, vinVar, vinVar2));
        return vinVar;
    }

    @Override // defpackage.haa
    public final jin W(yin yinVar) {
        jin jinVar;
        yin yinVar2;
        jin jinVar2 = jin.b;
        loop0: while (true) {
            jinVar = yinVar.b;
            if (jinVar2 != jinVar) {
                Unsafe unsafe = i;
                long j2 = j;
                yinVar2 = yinVar;
                while (!unsafe.compareAndSwapObject(yinVar2, j2, jinVar, jinVar2)) {
                    if (unsafe.getObject(yinVar2, j2) != jinVar) {
                        break;
                    }
                }
                break loop0;
            }
            break;
            yinVar = yinVar2;
        }
        return jinVar;
    }

    @Override // defpackage.haa
    public final boolean Z(yin yinVar, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = i;
            long j2 = l;
            yin yinVar2 = yinVar;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(yinVar2, j2, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(yinVar2, j2) != obj3) {
                return false;
            }
            yinVar = yinVar2;
            obj = obj3;
            obj2 = obj4;
        }
    }
}
