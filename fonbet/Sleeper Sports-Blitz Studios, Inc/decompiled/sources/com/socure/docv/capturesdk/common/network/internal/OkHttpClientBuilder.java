package com.socure.docv.capturesdk.common.network.internal;

import com.socure.docv.capturesdk.common.network.interceptor.CustomInterceptor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.OkHttpClient;

/* compiled from: OkHttpClientBuilder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/internal/OkHttpClientBuilder;", "", "enableSslPinning", "", "(Z)V", "getEnableSslPinning", "()Z", "setEnableSslPinning", "getBuilder", "Lokhttp3/OkHttpClient;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OkHttpClientBuilder {
    public static final int $stable = 8;
    private boolean enableSslPinning;

    public OkHttpClientBuilder() {
        this(false, 1, null);
    }

    public OkHttpClientBuilder(boolean z) {
        this.enableSslPinning = z;
    }

    public /* synthetic */ OkHttpClientBuilder(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public final boolean getEnableSslPinning() {
        return this.enableSslPinning;
    }

    public final void setEnableSslPinning(boolean z) {
        this.enableSslPinning = z;
    }

    public final OkHttpClient getBuilder() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new CustomInterceptor());
        builder.connectTimeout(50L, TimeUnit.SECONDS);
        builder.readTimeout(50L, TimeUnit.SECONDS);
        builder.writeTimeout(50L, TimeUnit.SECONDS);
        if (this.enableSslPinning) {
            builder.certificatePinner(CertPinnerBuilder.INSTANCE.getBuilder());
        }
        return builder.build();
    }
}
