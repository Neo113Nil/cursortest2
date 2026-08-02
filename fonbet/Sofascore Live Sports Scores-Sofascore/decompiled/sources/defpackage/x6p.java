package defpackage;

import com.mbridge.msdk.foundation.controller.a;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x6p extends u6p {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

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
            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: a7p
                @Override // java.security.PrivilegedExceptionAction
                public final /* synthetic */ Object run() {
                    Unsafe unsafe2 = x6p.a;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
        try {
            c = unsafe.objectFieldOffset(z6p.class.getDeclaredField(a.q));
            b = unsafe.objectFieldOffset(z6p.class.getDeclaredField("b"));
            d = unsafe.objectFieldOffset(z6p.class.getDeclaredField("a"));
            e = unsafe.objectFieldOffset(y6p.class.getDeclaredField("a"));
            f = unsafe.objectFieldOffset(y6p.class.getDeclaredField("b"));
            a = unsafe;
        } catch (NoSuchFieldException e3) {
            is8.h(e3);
        }
    }

    private x6p() {
        throw null;
    }

    @Override // defpackage.u6p
    public final void a(y6p y6pVar, Thread thread) {
        a.putObject(y6pVar, e, thread);
    }

    @Override // defpackage.u6p
    public final void b(y6p y6pVar, y6p y6pVar2) {
        a.putObject(y6pVar, f, y6pVar2);
    }

    @Override // defpackage.u6p
    public final boolean c(z6p z6pVar, y6p y6pVar, y6p y6pVar2) {
        while (true) {
            Unsafe unsafe = a;
            long j = c;
            z6p z6pVar2 = z6pVar;
            y6p y6pVar3 = y6pVar;
            y6p y6pVar4 = y6pVar2;
            if (unsafe.compareAndSwapObject(z6pVar2, j, y6pVar3, y6pVar4)) {
                return true;
            }
            if (unsafe.getObject(z6pVar2, j) != y6pVar3) {
                return false;
            }
            z6pVar = z6pVar2;
            y6pVar = y6pVar3;
            y6pVar2 = y6pVar4;
        }
    }

    @Override // defpackage.u6p
    public final boolean d(t6p t6pVar, q6p q6pVar, q6p q6pVar2) {
        while (true) {
            Unsafe unsafe = a;
            long j = b;
            t6p t6pVar2 = t6pVar;
            q6p q6pVar3 = q6pVar;
            q6p q6pVar4 = q6pVar2;
            if (unsafe.compareAndSwapObject(t6pVar2, j, q6pVar3, q6pVar4)) {
                return true;
            }
            if (unsafe.getObject(t6pVar2, j) != q6pVar3) {
                return false;
            }
            t6pVar = t6pVar2;
            q6pVar = q6pVar3;
            q6pVar2 = q6pVar4;
        }
    }

    @Override // defpackage.u6p
    public final y6p e(t6p t6pVar) {
        y6p y6pVar;
        y6p y6pVar2 = y6p.c;
        do {
            y6pVar = t6pVar.c;
            if (y6pVar2 == y6pVar) {
                break;
            }
        } while (!c(t6pVar, y6pVar, y6pVar2));
        return y6pVar;
    }

    @Override // defpackage.u6p
    public final q6p f(t6p t6pVar, q6p q6pVar) {
        q6p q6pVar2;
        do {
            q6pVar2 = t6pVar.b;
            if (q6pVar == q6pVar2) {
                break;
            }
        } while (!d(t6pVar, q6pVar2, q6pVar));
        return q6pVar2;
    }

    @Override // defpackage.u6p
    public final boolean g(z6p z6pVar, Object obj, Object obj2) {
        while (true) {
            Unsafe unsafe = a;
            long j = d;
            z6p z6pVar2 = z6pVar;
            Object obj3 = obj;
            Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(z6pVar2, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(z6pVar2, j) != obj3) {
                return false;
            }
            z6pVar = z6pVar2;
            obj = obj3;
            obj2 = obj4;
        }
    }
}
