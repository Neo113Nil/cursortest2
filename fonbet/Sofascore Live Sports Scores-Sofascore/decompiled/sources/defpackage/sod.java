package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sod extends tod {
    public static final ejg d;
    public static final ejg e;
    public static final ejg f;
    public static final ejg g;
    public static final ejg h;
    public static final ejg i;
    public static final Method j;
    public static final Method k;
    public static final Method l;
    public static final Method m;
    public static final Method n;
    public static final Method o;
    public static final Constructor p;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class<?> cls;
        Logger logger = tod.b;
        Class cls2 = Boolean.TYPE;
        Constructor<?> constructor = null;
        d = new ejg(14, (Object) null, "setUseSessionTickets", new Class[]{cls2});
        e = new ejg(14, (Object) null, "setHostname", new Class[]{String.class});
        f = new ejg(14, byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        g = new ejg(14, (Object) null, "setAlpnProtocols", new Class[]{byte[].class});
        h = new ejg(14, byte[].class, "getNpnSelectedProtocol", new Class[0]);
        i = new ejg(14, (Object) null, "setNpnProtocols", new Class[]{byte[].class});
        try {
            method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        method4 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                    } catch (ClassNotFoundException e2) {
                        e = e2;
                        method4 = null;
                    } catch (NoSuchMethodException e3) {
                        e = e3;
                        method4 = null;
                    }
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    l = method;
                    m = method2;
                    n = method3;
                    j = method4;
                    k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    try {
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        o = method6;
                        p = constructor;
                    } catch (NoSuchMethodException e6) {
                        e = e6;
                        logger.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                        o = method6;
                        p = constructor;
                    }
                    o = method6;
                    p = constructor;
                } catch (NoSuchMethodException e7) {
                    e = e7;
                    method3 = null;
                    method4 = method3;
                    logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                    method5 = null;
                    l = method;
                    m = method2;
                    n = method3;
                    j = method4;
                    k = method5;
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                    o = method6;
                    p = constructor;
                }
            } catch (ClassNotFoundException e8) {
                e = e8;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                l = method;
                m = method2;
                n = method3;
                j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                p = constructor;
            } catch (NoSuchMethodException e9) {
                e = e9;
                method2 = null;
                method3 = method2;
                method4 = method3;
                logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                l = method;
                m = method2;
                n = method3;
                j = method4;
                k = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method6;
                p = constructor;
            }
        } catch (ClassNotFoundException e10) {
            e = e10;
            method = null;
            method2 = null;
        } catch (NoSuchMethodException e11) {
            e = e11;
            method = null;
            method2 = null;
        }
        try {
            method5 = cls.getMethod("setUseSessionTickets", SSLSocket.class, cls2);
        } catch (ClassNotFoundException e12) {
            e = e12;
            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
            method5 = null;
            l = method;
            m = method2;
            n = method3;
            j = method4;
            k = method5;
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            o = method6;
            p = constructor;
        } catch (NoSuchMethodException e13) {
            e = e13;
            logger.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
            method5 = null;
            l = method;
            m = method2;
            n = method3;
            j = method4;
            k = method5;
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            o = method6;
            p = constructor;
        }
        l = method;
        m = method2;
        n = method3;
        j = method4;
        k = method5;
        try {
            method6 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e14) {
            e = e14;
            method6 = null;
        } catch (NoSuchMethodException e15) {
            e = e15;
            method6 = null;
        }
        o = method6;
        p = constructor;
    }

    @Override // defpackage.tod
    public final void a(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((rff) it.next()).a);
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (tod.c(str)) {
                        Method method2 = j;
                        if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                            d.s(sSLSocket, Boolean.TRUE);
                        } else {
                            k.invoke(null, sSLSocket, Boolean.TRUE);
                        }
                        Method method3 = o;
                        if (method3 == null || (constructor = p) == null) {
                            e.s(sSLSocket, str);
                        } else {
                            method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                        }
                    }
                } catch (InvocationTargetException e2) {
                    is8.h(e2);
                    return;
                }
            } catch (IllegalAccessException e3) {
                is8.h(e3);
                return;
            } catch (InstantiationException e4) {
                is8.h(e4);
                return;
            }
        }
        Method method4 = n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e5;
                }
                tod.b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {fie.b(list)};
        fie fieVar = this.a;
        if (fieVar.e() == 1) {
            g.v(sSLSocket, objArr);
        }
        if (fieVar.e() != 3) {
            i.v(sSLSocket, objArr);
        } else {
            cp4.h("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    @Override // defpackage.tod
    public final String b(SSLSocket sSLSocket) {
        Logger logger = tod.b;
        Method method = n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                is8.h(e2);
                return null;
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    is8.h(e3);
                    return null;
                }
                logger.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        fie fieVar = this.a;
        if (fieVar.e() == 1) {
            try {
                byte[] bArr = (byte[]) f.v(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, mik.b);
                }
            } catch (Exception e4) {
                logger.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (fieVar.e() != 3) {
            try {
                byte[] bArr2 = (byte[]) h.v(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, mik.b);
                }
            } catch (Exception e5) {
                logger.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.tod
    public final String d(SSLSocket sSLSocket, String str, List list) {
        String b = b(sSLSocket);
        return b == null ? super.d(sSLSocket, str, list) : b;
    }
}
