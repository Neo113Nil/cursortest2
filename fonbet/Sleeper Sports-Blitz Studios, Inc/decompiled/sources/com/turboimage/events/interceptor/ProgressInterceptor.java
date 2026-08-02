package com.turboimage.events.interceptor;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: ProgressInterceptor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/turboimage/events/interceptor/ProgressInterceptor;", "Lokhttp3/Interceptor;", "<init>", "()V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "Companion", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProgressInterceptor implements Interceptor {
    public static final String PROGRESS_ID_HEADER = "X-TurboImage-Progress-Id";

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        Request request = chain.request();
        final String header = request.header(PROGRESS_ID_HEADER);
        Response proceed = chain.proceed(request);
        if (header == null || proceed.body() == null) {
            return proceed;
        }
        ProgressListener progressListener = new ProgressListener() { // from class: com.turboimage.events.interceptor.ProgressInterceptor$$ExternalSyntheticLambda0
            @Override // com.turboimage.events.interceptor.ProgressListener
            public final void update(long j, long j2, boolean z) {
                ProgressInterceptor.intercept$lambda$0(header, j, j2, z);
            }
        };
        Response.Builder newBuilder = proceed.newBuilder();
        ResponseBody body = proceed.body();
        Intrinsics.checkNotNull(body);
        return newBuilder.body(new ProgressResponseBody(body, progressListener)).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void intercept$lambda$0(String str, long j, long j2, boolean z) {
        ProgressRegistry.INSTANCE.notify(str, j, j2, z);
    }
}
