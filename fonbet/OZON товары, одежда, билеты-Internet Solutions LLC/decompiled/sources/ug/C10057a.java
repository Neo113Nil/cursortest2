package ug;

import android.annotation.SuppressLint;
import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"CustomX509TrustManager"})
/* renamed from: ug.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C10057a implements X509TrustManager {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final X509TrustManager[] f100776a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f100777b;

    public C10057a(@NotNull X509TrustManager[] delegates) {
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f100776a = delegates;
        ArrayList arrayList = new ArrayList(delegates.length);
        for (X509TrustManager x509TrustManager : delegates) {
            arrayList.add(new X509TrustManagerExtensions(x509TrustManager));
        }
        this.f100777b = arrayList;
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        for (X509TrustManager x509TrustManager : this.f100776a) {
            try {
                x509TrustManager.checkClientTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    public final void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        for (X509TrustManager x509TrustManager : this.f100776a) {
            try {
                x509TrustManager.checkServerTrusted(chain, authType);
                return;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }

    @Override // javax.net.ssl.X509TrustManager
    @NotNull
    public final X509Certificate[] getAcceptedIssuers() throws CertificateException {
        ArrayList arrayList = new ArrayList();
        for (X509TrustManager x509TrustManager : this.f100776a) {
            X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
            Intrinsics.checkNotNullExpressionValue(acceptedIssuers, "it.acceptedIssuers");
            C7714v.p(C7705l.f0(acceptedIssuers), arrayList);
        }
        Object[] array = arrayList.toArray(new X509Certificate[0]);
        Intrinsics.g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (X509Certificate[]) array;
    }

    @NotNull
    public final List<X509Certificate> checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType, @NotNull String host) throws CertificateException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(authType, "authType");
        Intrinsics.checkNotNullParameter(host, "host");
        Iterator it = this.f100777b.iterator();
        while (it.hasNext()) {
            try {
                List<X509Certificate> checkServerTrusted = ((X509TrustManagerExtensions) it.next()).checkServerTrusted(chain, authType, host);
                Intrinsics.checkNotNullExpressionValue(checkServerTrusted, "delegateExtension.checkS…ed(chain, authType, host)");
                return checkServerTrusted;
            } catch (CertificateException unused) {
            }
        }
        throw new CertificateException("None of the TrustManagers trust this certificate chain");
    }
}
