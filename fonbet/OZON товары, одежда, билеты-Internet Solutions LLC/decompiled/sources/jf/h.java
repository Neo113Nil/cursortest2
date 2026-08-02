package jf;

import We.F;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p002if.C7068b;
import p002if.j;

/* loaded from: classes6.dex */
public class h implements m {

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private static final g f69986f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f69987g = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Method f69988a;

    /* renamed from: b, reason: collision with root package name */
    private final Method f69989b;

    /* renamed from: c, reason: collision with root package name */
    private final Method f69990c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f69991d;

    /* renamed from: e, reason: collision with root package name */
    private final Class<? super SSLSocket> f69992e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f69986f = new g();
    }

    public h(@NotNull Class<? super SSLSocket> sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f69992e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f69988a = declaredMethod;
        this.f69989b = sslSocketClass.getMethod("setHostname", String.class);
        this.f69990c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f69991d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // jf.m
    public final boolean a(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f69992e.isInstance(sslSocket);
    }

    @Override // jf.m
    public final boolean b() {
        C7068b.f66373g.getClass();
        return C7068b.a.b();
    }

    @Override // jf.m
    public final String c(@NotNull SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f69990c.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e11) {
            throw new AssertionError(e11);
        } catch (NullPointerException e12) {
            if (Intrinsics.d(e12.getMessage(), "ssl == null")) {
                return null;
            }
            throw e12;
        } catch (InvocationTargetException e13) {
            throw new AssertionError(e13);
        }
    }

    @Override // jf.m
    public final void d(@NotNull SSLSocket sslSocket, String str, @NotNull List<? extends F> protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f69988a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f69989b.invoke(sslSocket, str);
                }
                Method method = this.f69991d;
                p002if.j.f66400c.getClass();
                method.invoke(sslSocket, j.a.b(protocols));
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (InvocationTargetException e12) {
                throw new AssertionError(e12);
            }
        }
    }
}
