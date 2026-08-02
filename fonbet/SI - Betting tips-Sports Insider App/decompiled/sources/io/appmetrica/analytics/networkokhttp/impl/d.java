package io.appmetrica.analytics.networkokhttp.impl;

import gh.f0;
import gh.g0;
import gh.h0;
import gh.z;
import hh.g;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemPropertiesHelper;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkokhttp.internal.InterceptorSupplier;
import j$.util.DesugarCollections;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class d {
    public static g0 a(NetworkClientSettings networkClientSettings) {
        z interceptor;
        f0 f0Var = new f0();
        h0 h0Var = h0.f10199d;
        List protocols = u.f(h0.f10201f, h0Var);
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList X = CollectionsKt.X(protocols);
        h0 h0Var2 = h0.f10202g;
        if (!X.contains(h0Var2) && !X.contains(h0Var)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + X).toString());
        }
        if (X.contains(h0Var2) && X.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + X).toString());
        }
        if (X.contains(h0.f10198c)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + X).toString());
        }
        Intrinsics.checkNotNull(X, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Protocol?>");
        if (X.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        X.remove(h0.f10200e);
        Intrinsics.areEqual(X, f0Var.f10163r);
        List unmodifiableList = DesugarCollections.unmodifiableList(X);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        f0Var.f10163r = unmodifiableList;
        Integer readTimeout = networkClientSettings.getReadTimeout();
        if (readTimeout != null) {
            long intValue = readTimeout.intValue();
            TimeUnit unit = TimeUnit.MILLISECONDS;
            Intrinsics.checkNotNullParameter(unit, "unit");
            f0Var.f10168w = g.b(intValue);
        }
        Integer connectTimeout = networkClientSettings.getConnectTimeout();
        if (connectTimeout != null) {
            long intValue2 = connectTimeout.intValue();
            TimeUnit unit2 = TimeUnit.MILLISECONDS;
            Intrinsics.checkNotNullParameter(unit2, "unit");
            f0Var.f10167v = g.b(intValue2);
        }
        Boolean instanceFollowRedirects = networkClientSettings.getInstanceFollowRedirects();
        if (instanceFollowRedirects != null) {
            f0Var.f10156i = instanceFollowRedirects.booleanValue();
        }
        try {
            String readSystemProperty = SystemPropertiesHelper.readSystemProperty("debug.yndx.iaa.okhttp.mock");
            InterceptorSupplier interceptorSupplier = StringsKt.H(readSystemProperty) ? null : (InterceptorSupplier) ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(readSystemProperty, InterceptorSupplier.class);
            if (interceptorSupplier != null && (interceptor = interceptorSupplier.get()) != null) {
                Intrinsics.checkNotNullParameter(interceptor, "interceptor");
                f0Var.f10150c.add(interceptor);
            }
        } catch (Throwable unused) {
        }
        SSLSocketFactory sslSocketFactory = networkClientSettings.getSslSocketFactory();
        if (sslSocketFactory != null) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                ArrayList arrayList = new ArrayList();
                for (TrustManager trustManager : trustManagers) {
                    if (trustManager instanceof X509TrustManager) {
                        arrayList.add(trustManager);
                    }
                }
                X509TrustManager x509TrustManager = (X509TrustManager) CollectionsKt.firstOrNull(arrayList);
                if (x509TrustManager != null) {
                    f0Var.a(sslSocketFactory, x509TrustManager);
                }
            } catch (Throwable unused2) {
            }
        }
        networkClientSettings.getUseCaches();
        return new g0(f0Var);
    }
}
