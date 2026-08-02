package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class die extends fie {
    public final Method e;
    public final Method f;
    public final Method g;
    public final Class h;
    public final Class i;

    public die(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.e = method;
        this.f = method2;
        this.g = method3;
        this.h = cls;
        this.i = cls2;
    }

    @Override // defpackage.fie
    public final void a(SSLSocket sSLSocket) {
        try {
            this.g.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            ogj.b();
        } catch (InvocationTargetException e) {
            fie.b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }

    @Override // defpackage.fie
    public final void c(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            rff rffVar = (rff) list.get(i);
            if (rffVar != rff.HTTP_1_0) {
                arrayList.add(rffVar.a);
            }
        }
        try {
            this.e.invoke(null, sSLSocket, Proxy.newProxyInstance(fie.class.getClassLoader(), new Class[]{this.h, this.i}, new eie(arrayList)));
        } catch (IllegalAccessException e) {
            a70.j(e);
        } catch (InvocationTargetException e2) {
            a70.j(e2);
        }
    }

    @Override // defpackage.fie
    public final String d(SSLSocket sSLSocket) {
        try {
            eie eieVar = (eie) Proxy.getInvocationHandler(this.f.invoke(null, sSLSocket));
            boolean z = eieVar.b;
            if (!z && eieVar.c == null) {
                fie.b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (z) {
                return null;
            }
            return eieVar.c;
        } catch (IllegalAccessException unused) {
            ogj.b();
            return null;
        } catch (InvocationTargetException unused2) {
            ogj.b();
            return null;
        }
    }

    @Override // defpackage.fie
    public final int e() {
        return 1;
    }
}
