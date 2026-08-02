package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public class l30 implements poh {
    public static final dti e = new dti(15);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public l30(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.poh
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.poh
    public final String b(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e2) {
                a70.j(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    a70.j(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.poh
    public final void c(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                gie gieVar = gie.a;
                method.invoke(sSLSocket, kpg.p(list));
            } catch (IllegalAccessException e2) {
                a70.j(e2);
            } catch (InvocationTargetException e3) {
                a70.j(e3);
            }
        }
    }

    @Override // defpackage.poh
    public final boolean isSupported() {
        boolean z = g20.e;
        return g20.e;
    }
}
