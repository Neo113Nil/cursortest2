package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cie extends fie {
    public final Method e;
    public final Method f;

    public cie(Provider provider, Method method, Method method2) {
        super(provider);
        this.e = method;
        this.f = method2;
    }

    @Override // defpackage.fie
    public final void c(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rff rffVar = (rff) it.next();
            if (rffVar != rff.HTTP_1_0) {
                arrayList.add(rffVar.a);
            }
        }
        try {
            this.e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            is8.h(e);
        } catch (InvocationTargetException e2) {
            is8.h(e2);
        }
    }

    @Override // defpackage.fie
    public final String d(SSLSocket sSLSocket) {
        try {
            return (String) this.f.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            is8.h(e);
            return null;
        } catch (InvocationTargetException e2) {
            is8.h(e2);
            return null;
        }
    }

    @Override // defpackage.fie
    public final int e() {
        return 1;
    }
}
