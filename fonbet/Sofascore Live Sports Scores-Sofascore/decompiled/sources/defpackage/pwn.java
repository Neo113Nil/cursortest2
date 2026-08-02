package defpackage;

import com.google.android.gms.internal.play_billing.zzcu;
import com.google.android.gms.internal.play_billing.zzcx;
import com.mbridge.msdk.foundation.controller.a;
import defpackage.pwn;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pwn extends wca {
    public static final Unsafe c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;

    static {
        Unsafe U;
        try {
            try {
                U = Unsafe.getUnsafe();
            } catch (Exception e2) {
                vp2.e("Could not initialize intrinsics", e2);
                return;
            }
        } catch (SecurityException unused) {
            try {
                U = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.zzcy
                    @Override // java.security.PrivilegedExceptionAction
                    public final Object run() {
                        return pwn.U();
                    }
                });
            } catch (Exception unused2) {
                U = U();
            }
        }
        try {
            e = U.objectFieldOffset(twn.class.getDeclaredField(a.q));
            d = U.objectFieldOffset(twn.class.getDeclaredField("b"));
            f = U.objectFieldOffset(twn.class.getDeclaredField("a"));
            g = U.objectFieldOffset(qwn.class.getDeclaredField("a"));
            h = U.objectFieldOffset(qwn.class.getDeclaredField("b"));
            c = U;
        } catch (NoSuchFieldException e3) {
            is8.h(e3);
        }
    }

    public static /* synthetic */ Unsafe U() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // defpackage.wca
    public final iwn L(zzcu zzcuVar) {
        iwn iwnVar;
        iwn iwnVar2 = iwn.d;
        do {
            iwnVar = zzcuVar.b;
            if (iwnVar2 == iwnVar) {
                break;
            }
        } while (!R(zzcuVar, iwnVar, iwnVar2));
        return iwnVar;
    }

    @Override // defpackage.wca
    public final qwn M(zzcu zzcuVar) {
        qwn qwnVar;
        qwn qwnVar2 = qwn.c;
        do {
            qwnVar = zzcuVar.c;
            if (qwnVar2 == qwnVar) {
                break;
            }
        } while (!T(zzcuVar, qwnVar, qwnVar2));
        return qwnVar;
    }

    @Override // defpackage.wca
    public final void N(qwn qwnVar, qwn qwnVar2) {
        c.putObject(qwnVar, h, qwnVar2);
    }

    @Override // defpackage.wca
    public final void P(qwn qwnVar, Thread thread) {
        c.putObject(qwnVar, g, thread);
    }

    @Override // defpackage.wca
    public final boolean R(zzcu zzcuVar, iwn iwnVar, iwn iwnVar2) {
        return zzcx.a(c, zzcuVar, d, iwnVar, iwnVar2);
    }

    @Override // defpackage.wca
    public final boolean S(twn twnVar, Object obj, Object obj2) {
        return zzcx.a(c, twnVar, f, obj, obj2);
    }

    @Override // defpackage.wca
    public final boolean T(twn twnVar, qwn qwnVar, qwn qwnVar2) {
        return zzcx.a(c, twnVar, e, qwnVar, qwnVar2);
    }
}
