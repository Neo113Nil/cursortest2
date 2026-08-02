package qf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: qf.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9050a implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    private final Method f82060a;

    /* renamed from: b, reason: collision with root package name */
    private final X509TrustManager f82061b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f82062c;

    public C9050a(@NotNull X509TrustManager delegate, @NotNull List<String> insecureHosts) {
        Method method;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(insecureHosts, "insecureHosts");
        this.f82061b = delegate;
        this.f82062c = insecureHosts;
        try {
            method = delegate.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.f82060a = method;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(X509Certificate[] chain, String str) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(X509Certificate[] chain, String authType) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.f82061b.getAcceptedIssuers();
        Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }

    @NotNull
    public final List<Certificate> checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(host, "host");
        if (this.f82062c.contains(host)) {
            return K.f71697a;
        }
        try {
            Method method = this.f82060a;
            if (method != null) {
                Object invoke = method.invoke(this.f82061b, chain, authType, host);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
            }
            throw new CertificateException("Failed to call checkServerTrusted");
        } catch (InvocationTargetException e11) {
            Throwable targetException = e11.getTargetException();
            Intrinsics.checkNotNullExpressionValue(targetException, "e.targetException");
            throw targetException;
        }
    }
}
