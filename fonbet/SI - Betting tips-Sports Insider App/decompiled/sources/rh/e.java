package rh;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class e implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final m8.a f22521f;

    /* renamed from: a, reason: collision with root package name */
    public final Class f22522a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f22523b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f22524c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f22525d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f22526e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", "packageName");
        f22521f = new m8.a(5);
    }

    public e(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f22522a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
        this.f22523b = declaredMethod;
        this.f22524c = sslSocketClass.getMethod("setHostname", String.class);
        this.f22525d = sslSocketClass.getMethod("getAlpnSelectedProtocol", null);
        this.f22526e = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // rh.n
    public final String a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (b(sslSocket)) {
            try {
                byte[] bArr = (byte[]) this.f22525d.invoke(sslSocket, null);
                if (bArr != null) {
                    return new String(bArr, Charsets.UTF_8);
                }
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e9) {
                Throwable cause = e9.getCause();
                if (!(cause instanceof NullPointerException) || !Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e9);
                }
            }
        }
        return null;
    }

    @Override // rh.n
    public final boolean b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f22522a.isInstance(sslSocket);
    }

    @Override // rh.n
    public final void c(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (b(sslSocket)) {
            try {
                this.f22523b.invoke(sslSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.f22524c.invoke(sslSocket, str);
                }
                Method method = this.f22526e;
                qh.e eVar = qh.e.f22190a;
                method.invoke(sslSocket, m8.a.e(protocols));
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            } catch (InvocationTargetException e9) {
                throw new AssertionError(e9);
            }
        }
    }

    @Override // rh.n
    public final boolean isSupported() {
        boolean z5 = qh.c.f22187e;
        return qh.c.f22187e;
    }
}
