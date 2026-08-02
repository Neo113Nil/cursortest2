package com.socure.docv.capturesdk.common.network.interceptor;

import com.socure.docv.capturesdk.BuildConfig;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;

/* compiled from: CustomInterceptor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/interceptor/CustomInterceptor;", "Lokhttp3/Interceptor;", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CustomInterceptor implements Interceptor {
    public static final int $stable = 0;

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request().newBuilder().addHeader(ApiConstant.HEADER_CONTENT_TYPE, ApiConstant.HEADER_CONTENT_TYPE_VALUE).addHeader("User-Agent", ApiConstant.USER_AGENT_VALUE).addHeader(ApiConstant.HEADER_CLIENT_NAME, "native_android").addHeader(ApiConstant.HEADER_CLIENT_VERSION, BuildConfig.SDK_VERSION).build());
    }
}
