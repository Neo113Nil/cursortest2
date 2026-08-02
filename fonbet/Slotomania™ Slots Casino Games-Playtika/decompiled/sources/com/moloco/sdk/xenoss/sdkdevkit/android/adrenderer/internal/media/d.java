package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.services.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpRequestRetryConfig;
import io.ktor.client.plugins.HttpRequestRetryKt;
import io.ktor.client.plugins.HttpRetryDelayContext;
import io.ktor.client.plugins.HttpRetryModifyRequestContext;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.HttpMethod;
import io.ktor.util.cio.FileChannelsKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;

/* loaded from: classes4.dex */
public final class d implements n {
    public static final int e = 8;
    public final u a;
    public final com.moloco.sdk.internal.error.b b;
    public final HttpClient c;
    public final String d;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.LegacyMediaDownloader$downloadMedia$2", f = "LegacyMediaDownloader.kt", i = {0, 1, 2, 2, 3, 3}, l = {42, 52, 63, 63}, m = "invokeSuspend", n = {"httpRequestComplete", "httpRequestComplete", "response", "httpRequestComplete", "response", "httpRequestComplete"}, s = {"I$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super i.a>, Object> {
        public int a;
        public Object b;
        public int c;
        public final /* synthetic */ String e;
        public final /* synthetic */ File f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, Continuation<? super a> continuation) {
            super(2, continuation);
            this.e = str;
            this.f = file;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super i.a> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new a(this.e, this.f, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0171  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x01f1  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01fb  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x021e  */
        /* JADX WARN: Type inference failed for: r2v26 */
        /* JADX WARN: Type inference failed for: r2v29, types: [int] */
        /* JADX WARN: Type inference failed for: r2v37, types: [int] */
        /* JADX WARN: Type inference failed for: r2v40 */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v8 */
        /* JADX WARN: Type inference failed for: r4v9, types: [int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a;
            ?? r4;
            Object a2;
            HttpResponse httpResponse;
            int value;
            int value2;
            Object bodyAsChannel;
            HttpResponse httpResponse2;
            ?? r2;
            Object copyAndClose;
            HttpResponse httpResponse3;
            String str = "Fetching asset from network: ";
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.c;
            try {
                try {
                    try {
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            try {
                                MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Fetching asset from network: " + this.e, null, false, 12, null);
                                u uVar = d.this.a;
                                this.a = 0;
                                this.c = 1;
                                a = uVar.a(5000L, this);
                                if (a != coroutine_suspended) {
                                    r4 = 0;
                                }
                                return coroutine_suspended;
                            } catch (TimeoutCancellationException unused) {
                                str = null;
                                b.a.a(d.this.b, d.this.a(str != null), null, 2, null);
                                if (str != null) {
                                }
                                throw new p();
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ?? r22 = this.a;
                                    httpResponse3 = (HttpResponse) this.b;
                                    ResultKt.throwOnFailure(obj);
                                    copyAndClose = obj;
                                    str = r22;
                                    MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse3) + " and saved to disk: " + ((Number) copyAndClose).longValue() + " bytes, file size: " + this.f.length(), null, false, 12, null);
                                    return new i.a.b(this.f);
                                }
                                int i2 = this.a;
                                HttpResponse httpResponse4 = (HttpResponse) this.b;
                                ResultKt.throwOnFailure(obj);
                                httpResponse2 = httpResponse4;
                                bodyAsChannel = obj;
                                r2 = i2;
                                ByteWriteChannel writeChannel$default = FileChannelsKt.writeChannel$default(this.f, null, 1, null);
                                this.b = httpResponse2;
                                this.a = r2;
                                this.c = 4;
                                copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default, this);
                                if (copyAndClose != coroutine_suspended) {
                                    httpResponse3 = httpResponse2;
                                    str = r2;
                                    MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Downloaded full response: " + HttpMessagePropertiesKt.contentLength(httpResponse3) + " and saved to disk: " + ((Number) copyAndClose).longValue() + " bytes, file size: " + this.f.length(), null, false, 12, null);
                                    return new i.a.b(this.f);
                                }
                                return coroutine_suspended;
                            }
                            int i3 = this.a;
                            ResultKt.throwOnFailure(obj);
                            a2 = obj;
                            httpResponse = (HttpResponse) a2;
                            try {
                                value = httpResponse.getStatus().getValue();
                                if (400 > value && value < 500) {
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Failed to fetch media from url: " + this.e + ", status: " + httpResponse.getStatus(), null, false, 12, null);
                                    return i.a.AbstractC0292a.e.c;
                                }
                                value2 = httpResponse.getStatus().getValue();
                                if (500 > value2 && value2 < 600) {
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Failed to fetch media from url: " + this.e + ", status: " + httpResponse.getStatus(), null, false, 12, null);
                                    return i.a.AbstractC0292a.h.c;
                                }
                                this.b = httpResponse;
                                this.a = 1;
                                this.c = 3;
                                bodyAsChannel = HttpResponseKt.bodyAsChannel(httpResponse, this);
                                if (bodyAsChannel != coroutine_suspended) {
                                    httpResponse2 = httpResponse;
                                    r2 = 1;
                                    ByteWriteChannel writeChannel$default2 = FileChannelsKt.writeChannel$default(this.f, null, 1, null);
                                    this.b = httpResponse2;
                                    this.a = r2;
                                    this.c = 4;
                                    copyAndClose = ByteReadChannelOperationsKt.copyAndClose((ByteReadChannel) bodyAsChannel, writeChannel$default2, this);
                                    if (copyAndClose != coroutine_suspended) {
                                    }
                                }
                                return coroutine_suspended;
                            } catch (TimeoutCancellationException unused2) {
                                str = 1;
                                b.a.a(d.this.b, d.this.a(str != null), null, 2, null);
                                if (str != null) {
                                }
                                throw new p();
                            }
                        }
                        int i4 = this.a;
                        ResultKt.throwOnFailure(obj);
                        r4 = i4;
                        a = obj;
                        if (!((Boolean) a).booleanValue()) {
                            return i.a.AbstractC0292a.n.c;
                        }
                        if (this.f.exists()) {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.d, "Deleting existing file and re-downloading it", null, false, 12, null);
                            this.f.delete();
                        }
                        d dVar = d.this;
                        String str2 = this.e;
                        this.a = r4;
                        this.c = 2;
                        a2 = dVar.a(str2, this);
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        httpResponse = (HttpResponse) a2;
                        value = httpResponse.getStatus().getValue();
                        if (400 > value) {
                        }
                        value2 = httpResponse.getStatus().getValue();
                        if (500 > value2) {
                        }
                        this.b = httpResponse;
                        this.a = 1;
                        this.c = 3;
                        bodyAsChannel = HttpResponseKt.bodyAsChannel(httpResponse, this);
                        if (bodyAsChannel != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    } catch (TimeoutCancellationException unused3) {
                        str = r4;
                        b.a.a(d.this.b, d.this.a(str != null), null, 2, null);
                        if (str != null) {
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Timeout occurred after request had completed: " + this.e, null, false, 12, null);
                        } else {
                            MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Timeout occurred when still waiting for request to complete: " + this.e, null, false, 12, null);
                        }
                        throw new p();
                    }
                } catch (TimeoutCancellationException unused4) {
                }
            } catch (Exception e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, d.this.d, "Failed to fetch media from url: " + this.e, e, false, 8, null);
                return o.a(e);
            }
        }
    }

    public d(u connectivityService, com.moloco.sdk.internal.error.b errorReportingService, HttpClient httpClient) {
        Intrinsics.checkNotNullParameter(connectivityService, "connectivityService");
        Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.a = connectivityService;
        this.b = errorReportingService;
        this.c = httpClient;
        this.d = "LegacyMediaDownloader";
    }

    public static final long a(HttpRetryDelayContext delayMillis, int i) {
        Intrinsics.checkNotNullParameter(delayMillis, "$this$delayMillis");
        return 100L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n
    public Object a(String str, File file, Continuation<? super i.a> continuation) {
        return BuildersKt.withContext(com.moloco.sdk.internal.scheduling.b.a().getIo(), new a(str, file, null), continuation);
    }

    public final Object a(String str, Continuation<? super HttpResponse> continuation) {
        HttpClient httpClient = this.c;
        HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
        HttpRequestKt.url(httpRequestBuilder, str);
        HttpRequestRetryKt.retry(httpRequestBuilder, new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return d.a(d.this, (HttpRequestRetryConfig) obj);
            }
        });
        httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
        return new HttpStatement(httpRequestBuilder, httpClient).execute(continuation);
    }

    public static final Unit a(final d dVar, HttpRequestRetryConfig retry) {
        Intrinsics.checkNotNullParameter(retry, "$this$retry");
        retry.setMaxRetries(10);
        HttpRequestRetryConfig.delayMillis$default(retry, false, new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(d.a((HttpRetryDelayContext) obj, ((Integer) obj2).intValue()));
            }
        }, 1, null);
        retry.retryOnException(10, true);
        retry.retryOnServerErrors(10);
        retry.modifyRequest(new Function2() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.d$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return d.a(d.this, (HttpRetryModifyRequestContext) obj, (HttpRequestBuilder) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit a(d dVar, HttpRetryModifyRequestContext modifyRequest, HttpRequestBuilder it) {
        Intrinsics.checkNotNullParameter(modifyRequest, "$this$modifyRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, dVar.d, "Retry attempt #" + modifyRequest.getRetryCount() + " for " + modifyRequest.getRequest().getUrl(), null, false, 12, null);
        return Unit.INSTANCE;
    }

    public final String a(boolean z) {
        if (z) {
            return e.a;
        }
        return e.b;
    }
}
