package p002if;

import We.F;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p002if.j;

/* loaded from: classes10.dex */
public final class e extends j {

    /* renamed from: d, reason: collision with root package name */
    private final Method f66385d;

    /* renamed from: e, reason: collision with root package name */
    private final Method f66386e;

    /* renamed from: f, reason: collision with root package name */
    private final Method f66387f;

    /* renamed from: g, reason: collision with root package name */
    private final Class<?> f66388g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f66389h;

    private static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f66390a;

        /* renamed from: b, reason: collision with root package name */
        private String f66391b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f66392c;

        public a(@NotNull ArrayList protocols) {
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            this.f66392c = protocols;
        }

        public final String a() {
            return this.f66391b;
        }

        public final boolean b() {
            return this.f66390a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(@NotNull Object proxy, @NotNull Method method, Object[] objArr) throws Throwable {
            Intrinsics.checkNotNullParameter(proxy, "proxy");
            Intrinsics.checkNotNullParameter(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (Intrinsics.d(name, "supports") && Intrinsics.d(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (Intrinsics.d(name, "unsupported") && Intrinsics.d(Void.TYPE, returnType)) {
                this.f66390a = true;
                return null;
            }
            boolean d11 = Intrinsics.d(name, "protocols");
            ArrayList arrayList = this.f66392c;
            if (d11 && objArr.length == 0) {
                return arrayList;
            }
            if ((Intrinsics.d(name, "selectProtocol") || Intrinsics.d(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
                Object obj = objArr[0];
                if (obj instanceof List) {
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                    List list = (List) obj;
                    int size = list.size();
                    if (size >= 0) {
                        int i11 = 0;
                        while (true) {
                            Object obj2 = list.get(i11);
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            String str = (String) obj2;
                            if (!arrayList.contains(str)) {
                                if (i11 == size) {
                                    break;
                                }
                                i11++;
                            } else {
                                this.f66391b = str;
                                return str;
                            }
                        }
                    }
                    String str2 = (String) arrayList.get(0);
                    this.f66391b = str2;
                    return str2;
                }
            }
            if ((!Intrinsics.d(name, "protocolSelected") && !Intrinsics.d(name, "selected")) || objArr.length != 1) {
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
            Object obj3 = objArr[0];
            if (obj3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f66391b = (String) obj3;
            return null;
        }
    }

    public static final class b {
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        
            if (java.lang.Integer.parseInt(r1) >= 9) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static e a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                Intrinsics.checkNotNullExpressionValue(jvmVersion, "jvmVersion");
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod(ProductAction.ACTION_REMOVE, SSLSocket.class);
                Intrinsics.checkNotNullExpressionValue(putMethod, "putMethod");
                Intrinsics.checkNotNullExpressionValue(getMethod, "getMethod");
                Intrinsics.checkNotNullExpressionValue(removeMethod, "removeMethod");
                Intrinsics.checkNotNullExpressionValue(clientProviderClass, "clientProviderClass");
                Intrinsics.checkNotNullExpressionValue(serverProviderClass, "serverProviderClass");
                return new e(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public e(@NotNull Method putMethod, @NotNull Method getMethod, @NotNull Method removeMethod, @NotNull Class<?> clientProviderClass, @NotNull Class<?> serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f66385d = putMethod;
        this.f66386e = getMethod;
        this.f66387f = removeMethod;
        this.f66388g = clientProviderClass;
        this.f66389h = serverProviderClass;
    }

    @Override // p002if.j
    public final void b(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f66387f.invoke(null, sslSocket);
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError("failed to remove ALPN", e12);
        }
    }

    @Override // p002if.j
    public final void e(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        j.f66400c.getClass();
        try {
            this.f66385d.invoke(null, sslSocket, Proxy.newProxyInstance(j.class.getClassLoader(), new Class[]{this.f66388g, this.f66389h}, new a(j.a.a(protocols))));
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError("failed to set ALPN", e12);
        }
    }

    @Override // p002if.j
    public final String g(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f66386e.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                j.k(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (aVar.b()) {
                return null;
            }
            return aVar.a();
        } catch (IllegalAccessException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        } catch (InvocationTargetException e12) {
            throw new AssertionError("failed to get ALPN selected protocol", e12);
        }
    }
}
