package com.socure.docv.reactnative;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: Api.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/socure/docv/reactnative/OkHttpBuilder;", "", "<init>", "()V", "getBuilder", "Lokhttp3/OkHttpClient;", "socure-inc_docv-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OkHttpBuilder {
    public final OkHttpClient getBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.readTimeout(120L, TimeUnit.SECONDS);
        builder.connectTimeout(120L, TimeUnit.SECONDS);
        builder.writeTimeout(120L, TimeUnit.SECONDS);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.HEADERS);
        builder.addInterceptor(httpLoggingInterceptor);
        return builder.build();
    }
}
