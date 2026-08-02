package com.socure.idplus.device.internal.api;

import com.socure.docv.capturesdk.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f841a;
    public final boolean b;
    public final c c;
    public a d;
    public a e;
    public a f;

    public b(String str, boolean z, d retrofitFactory) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "retrofitFactory");
        this.f841a = str;
        this.b = z;
        this.c = retrofitFactory;
    }

    public final a a(String url) {
        ((d) this.c).getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        CertificatePinner build = new CertificatePinner.Builder().add(BuildConfig.CERT_PIN_DOMAIN, BuildConfig.CERT_PIN_SOCURE).add(BuildConfig.CERT_PIN_DOMAIN, BuildConfig.CERT_PIN_AMAZON_INTERMEDIATE).add(BuildConfig.CERT_PIN_DOMAIN, BuildConfig.CERT_PIN_AMAZON_ROOT).build();
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(50L, timeUnit);
        builder.readTimeout(50L, timeUnit);
        builder.writeTimeout(50L, timeUnit);
        builder.certificatePinner(build);
        Retrofit build2 = new Retrofit.Builder().baseUrl(url).addConverterFactory(GsonConverterFactory.create()).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        Object create = build2.create(a.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (a) create;
    }
}
