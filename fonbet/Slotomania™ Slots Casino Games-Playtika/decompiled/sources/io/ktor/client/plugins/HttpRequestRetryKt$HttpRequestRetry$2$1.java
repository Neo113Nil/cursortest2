package io.ktor.client.plugins;

import androidx.core.app.NotificationCompat;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequest;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.util.AttributeKey;
import io.ktor.util.Attributes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.slf4j.Logger;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRequestRetryKt$HttpRequestRetry$2$1", f = "HttpRequestRetry.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {352, 355, 371}, m = "invokeSuspend", n = {"$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", NotificationCompat.CATEGORY_CALL, "subRequest", "retryCount", "maxRetries", "$this$on", "request", "shouldRetry", "shouldRetryOnException", "delayMillis", "modifyRequest", "lastRetryData", "retryCount", "maxRetries"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"})
/* loaded from: classes5.dex */
final class HttpRequestRetryKt$HttpRequestRetry$2$1 extends SuspendLambda implements Function3<Send.Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ Function2<Long, Continuation<? super Unit>, Object> $delay;
    final /* synthetic */ Function2<HttpRetryDelayContext, Integer, Long> $delayMillis;
    final /* synthetic */ int $maxRetries;
    final /* synthetic */ Function2<HttpRetryModifyRequestContext, HttpRequestBuilder, Unit> $modifyRequest;
    final /* synthetic */ Function3<HttpRetryShouldRetryContext, HttpRequest, HttpResponse, Boolean> $shouldRetry;
    final /* synthetic */ Function3<HttpRetryShouldRetryContext, HttpRequestBuilder, Throwable, Boolean> $shouldRetryOnException;
    final /* synthetic */ ClientPluginBuilder<HttpRequestRetryConfig> $this_createClientPlugin;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HttpRequestRetryKt$HttpRequestRetry$2$1(Function3<? super HttpRetryShouldRetryContext, ? super HttpRequest, ? super HttpResponse, Boolean> function3, Function3<? super HttpRetryShouldRetryContext, ? super HttpRequestBuilder, ? super Throwable, Boolean> function32, int i, Function2<? super HttpRetryDelayContext, ? super Integer, Long> function2, Function2<? super HttpRetryModifyRequestContext, ? super HttpRequestBuilder, Unit> function22, ClientPluginBuilder<HttpRequestRetryConfig> clientPluginBuilder, Function2<? super Long, ? super Continuation<? super Unit>, ? extends Object> function23, Continuation<? super HttpRequestRetryKt$HttpRequestRetry$2$1> continuation) {
        super(3, continuation);
        this.$shouldRetry = function3;
        this.$shouldRetryOnException = function32;
        this.$maxRetries = i;
        this.$delayMillis = function2;
        this.$modifyRequest = function22;
        this.$this_createClientPlugin = clientPluginBuilder;
        this.$delay = function23;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = new HttpRequestRetryKt$HttpRequestRetry$2$1(this.$shouldRetry, this.$shouldRetryOnException, this.$maxRetries, this.$delayMillis, this.$modifyRequest, this.$this_createClientPlugin, this.$delay, continuation);
        httpRequestRetryKt$HttpRequestRetry$2$1.L$0 = sender;
        httpRequestRetryKt$HttpRequestRetry$2$1.L$1 = httpRequestBuilder;
        return httpRequestRetryKt$HttpRequestRetry$2$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015c A[Catch: all -> 0x0193, TRY_LEAVE, TryCatch #2 {all -> 0x0193, blocks: (B:51:0x0121, B:21:0x0135, B:26:0x0154, B:28:0x015c), top: B:50:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x01fd -> B:19:0x011b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        HttpRequestBuilder httpRequestBuilder;
        Function2<HttpRetryModifyRequestContext, HttpRequestBuilder, Unit> function2;
        Function2<HttpRetryDelayContext, Integer, Long> function22;
        Function3<HttpRetryShouldRetryContext, HttpRequestBuilder, Throwable, Boolean> function3;
        Function3<HttpRetryShouldRetryContext, HttpRequest, HttpResponse, Boolean> function32;
        HttpRequestBuilder httpRequestBuilder2;
        Send.Sender sender;
        Object obj2;
        HttpRetryEventData httpRetryEventData;
        Logger logger;
        int i3;
        HttpRetryEventData httpRetryEventData2;
        Function2<Long, Continuation<? super Unit>, Object> function23;
        Long invoke;
        boolean HttpRequestRetry$lambda$1$shouldRetryOnException;
        boolean HttpRequestRetry$lambda$1$shouldRetry;
        Object throwOnInvalidResponseBody;
        AttributeKey attributeKey;
        AttributeKey attributeKey2;
        AttributeKey attributeKey3;
        AttributeKey attributeKey4;
        AttributeKey attributeKey5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 != 0) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = this.I$1;
                    int i6 = this.I$0;
                    HttpClientCall httpClientCall = (HttpClientCall) this.L$6;
                    ResultKt.throwOnFailure(obj);
                    return httpClientCall;
                }
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i7 = this.I$1;
                int i8 = this.I$0;
                HttpRetryEventData httpRetryEventData3 = (HttpRetryEventData) this.L$6;
                Function2<HttpRetryModifyRequestContext, HttpRequestBuilder, Unit> function24 = (Function2) this.L$5;
                Function2<HttpRetryDelayContext, Integer, Long> function25 = (Function2) this.L$4;
                Function3<HttpRetryShouldRetryContext, HttpRequestBuilder, Throwable, Boolean> function33 = (Function3) this.L$3;
                Function3<HttpRetryShouldRetryContext, HttpRequest, HttpResponse, Boolean> function34 = (Function3) this.L$2;
                HttpRequestBuilder httpRequestBuilder3 = (HttpRequestBuilder) this.L$1;
                Send.Sender sender2 = (Send.Sender) this.L$0;
                ResultKt.throwOnFailure(obj);
                i = i7;
                httpRetryEventData = httpRetryEventData3;
                i2 = i8;
                char c = 3;
                Send.Sender sender3 = sender2;
                httpRequestBuilder2 = httpRequestBuilder3;
                function32 = function34;
                function3 = function33;
                function22 = function25;
                function2 = function24;
                logger = HttpRequestRetryKt.LOGGER;
                logger.trace("Retrying request " + httpRequestBuilder2.getUrl() + " attempt: " + i2);
                sender = sender3;
                httpRequestBuilder = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder2);
                if (httpRetryEventData != null) {
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    function2.invoke(new HttpRetryModifyRequestContext(httpRequestBuilder2, httpRetryEventData.getResponse(), httpRetryEventData.getCause(), httpRetryEventData.getRetryCount()), httpRequestBuilder);
                }
                this.L$0 = sender;
                this.L$1 = httpRequestBuilder2;
                this.L$2 = function32;
                this.L$3 = function3;
                this.L$4 = function22;
                this.L$5 = function2;
                this.L$6 = httpRequestBuilder;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                obj2 = sender.proceed(httpRequestBuilder, this);
                if (obj2 == coroutine_suspended) {
                }
                HttpClientCall httpClientCall2 = (HttpClientCall) obj2;
                HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i, function32, httpClientCall2);
                if (HttpRequestRetry$lambda$1$shouldRetry) {
                    HttpResponse response = httpClientCall2.getResponse();
                    HttpRequestRetryKt$HttpRequestRetry$2$1 httpRequestRetryKt$HttpRequestRetry$2$1 = this;
                    this.L$0 = sender;
                    this.L$1 = httpRequestBuilder2;
                    this.L$2 = function32;
                    this.L$3 = function3;
                    this.L$4 = function22;
                    this.L$5 = function2;
                    this.L$6 = httpClientCall2;
                    this.L$7 = httpRequestBuilder;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 2;
                    throwOnInvalidResponseBody = HttpRequestRetryKt.throwOnInvalidResponseBody(response, httpRequestRetryKt$HttpRequestRetry$2$1);
                    return throwOnInvalidResponseBody == coroutine_suspended ? coroutine_suspended : httpClientCall2;
                }
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                i3 = i2 + 1;
                httpRetryEventData2 = new HttpRetryEventData(httpRequestBuilder, i3, httpClientCall2.getResponse(), null);
                int i9 = i;
                int i10 = i3;
                function24 = function2;
                function25 = function22;
                function33 = function3;
                function34 = function32;
                httpRequestBuilder3 = httpRequestBuilder2;
                sender2 = sender;
                HttpRetryEventData httpRetryEventData4 = httpRetryEventData2;
                this.$this_createClientPlugin.getClient().getMonitor().raise(HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData4);
                HttpRetryDelayContext httpRetryDelayContext = new HttpRetryDelayContext(httpRetryEventData4.getRequest(), httpRetryEventData4.getResponse(), httpRetryEventData4.getCause());
                function23 = this.$delay;
                invoke = function25.invoke(httpRetryDelayContext, Boxing.boxInt(i10));
                this.L$0 = sender2;
                this.L$1 = httpRequestBuilder3;
                this.L$2 = function34;
                this.L$3 = function33;
                this.L$4 = function25;
                this.L$5 = function24;
                this.L$6 = httpRetryEventData4;
                this.L$7 = null;
                this.I$0 = i10;
                this.I$1 = i9;
                c = 3;
                this.label = 3;
                if (function23.invoke(invoke, this) != coroutine_suspended) {
                    i = i9;
                    httpRetryEventData = httpRetryEventData4;
                    i2 = i10;
                    Send.Sender sender32 = sender2;
                    httpRequestBuilder2 = httpRequestBuilder3;
                    function32 = function34;
                    function3 = function33;
                    function22 = function25;
                    function2 = function24;
                    logger = HttpRequestRetryKt.LOGGER;
                    logger.trace("Retrying request " + httpRequestBuilder2.getUrl() + " attempt: " + i2);
                    sender = sender32;
                    httpRequestBuilder = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder2);
                    if (httpRetryEventData != null) {
                    }
                    this.L$0 = sender;
                    this.L$1 = httpRequestBuilder2;
                    this.L$2 = function32;
                    this.L$3 = function3;
                    this.L$4 = function22;
                    this.L$5 = function2;
                    this.L$6 = httpRequestBuilder;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 1;
                    obj2 = sender.proceed(httpRequestBuilder, this);
                    if (obj2 == coroutine_suspended) {
                    }
                    HttpClientCall httpClientCall22 = (HttpClientCall) obj2;
                    HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i, function32, httpClientCall22);
                    if (HttpRequestRetry$lambda$1$shouldRetry) {
                    }
                }
                th = th3;
                HttpRequestRetry$lambda$1$shouldRetryOnException = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i, function3, httpRequestBuilder, th);
                if (!HttpRequestRetry$lambda$1$shouldRetryOnException) {
                    throw th;
                }
                i3 = i2 + 1;
                httpRetryEventData2 = new HttpRetryEventData(httpRequestBuilder, i3, null, th);
                int i92 = i;
                int i102 = i3;
                function24 = function2;
                function25 = function22;
                function33 = function3;
                function34 = function32;
                httpRequestBuilder3 = httpRequestBuilder2;
                sender2 = sender;
                HttpRetryEventData httpRetryEventData42 = httpRetryEventData2;
                this.$this_createClientPlugin.getClient().getMonitor().raise(HttpRequestRetryKt.getHttpRequestRetryEvent(), httpRetryEventData42);
                HttpRetryDelayContext httpRetryDelayContext2 = new HttpRetryDelayContext(httpRetryEventData42.getRequest(), httpRetryEventData42.getResponse(), httpRetryEventData42.getCause());
                function23 = this.$delay;
                invoke = function25.invoke(httpRetryDelayContext2, Boxing.boxInt(i102));
                this.L$0 = sender2;
                this.L$1 = httpRequestBuilder3;
                this.L$2 = function34;
                this.L$3 = function33;
                this.L$4 = function25;
                this.L$5 = function24;
                this.L$6 = httpRetryEventData42;
                this.L$7 = null;
                this.I$0 = i102;
                this.I$1 = i92;
                c = 3;
                this.label = 3;
                if (function23.invoke(invoke, this) != coroutine_suspended) {
                }
            }
            i = this.I$1;
            i2 = this.I$0;
            httpRequestBuilder = (HttpRequestBuilder) this.L$6;
            function2 = (Function2) this.L$5;
            function22 = (Function2) this.L$4;
            function3 = (Function3) this.L$3;
            function32 = (Function3) this.L$2;
            httpRequestBuilder2 = (HttpRequestBuilder) this.L$1;
            sender = (Send.Sender) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            HttpClientCall httpClientCall222 = (HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i, function32, httpClientCall222);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
            th = th3;
            HttpRequestRetry$lambda$1$shouldRetryOnException = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i, function3, httpRequestBuilder, th);
            if (!HttpRequestRetry$lambda$1$shouldRetryOnException) {
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Send.Sender sender4 = (Send.Sender) this.L$0;
            HttpRequestBuilder httpRequestBuilder4 = (HttpRequestBuilder) this.L$1;
            Attributes attributes = httpRequestBuilder4.getAttributes();
            attributeKey = HttpRequestRetryKt.ShouldRetryPerRequestAttributeKey;
            Function3<HttpRetryShouldRetryContext, HttpRequest, HttpResponse, Boolean> function35 = (Function3) attributes.getOrNull(attributeKey);
            if (function35 == null) {
                function35 = this.$shouldRetry;
            }
            Attributes attributes2 = httpRequestBuilder4.getAttributes();
            attributeKey2 = HttpRequestRetryKt.ShouldRetryOnExceptionPerRequestAttributeKey;
            Function3<HttpRetryShouldRetryContext, HttpRequestBuilder, Throwable, Boolean> function36 = (Function3) attributes2.getOrNull(attributeKey2);
            if (function36 == null) {
                function36 = this.$shouldRetryOnException;
            }
            Attributes attributes3 = httpRequestBuilder4.getAttributes();
            attributeKey3 = HttpRequestRetryKt.MaxRetriesPerRequestAttributeKey;
            Integer num = (Integer) attributes3.getOrNull(attributeKey3);
            int intValue = num != null ? num.intValue() : this.$maxRetries;
            Attributes attributes4 = httpRequestBuilder4.getAttributes();
            attributeKey4 = HttpRequestRetryKt.RetryDelayPerRequestAttributeKey;
            function22 = (Function2) attributes4.getOrNull(attributeKey4);
            if (function22 == null) {
                function22 = this.$delayMillis;
            }
            Attributes attributes5 = httpRequestBuilder4.getAttributes();
            attributeKey5 = HttpRequestRetryKt.ModifyRequestPerRequestAttributeKey;
            Function2<HttpRetryModifyRequestContext, HttpRequestBuilder, Unit> function26 = (Function2) attributes5.getOrNull(attributeKey5);
            if (function26 == null) {
                function26 = this.$modifyRequest;
            }
            function32 = function35;
            i2 = 0;
            sender = sender4;
            httpRequestBuilder2 = httpRequestBuilder4;
            i = intValue;
            function2 = function26;
            httpRetryEventData = null;
            function3 = function36;
            httpRequestBuilder = HttpRequestRetryKt.HttpRequestRetry$lambda$1$prepareRequest(httpRequestBuilder2);
            if (httpRetryEventData != null) {
            }
            this.L$0 = sender;
            this.L$1 = httpRequestBuilder2;
            this.L$2 = function32;
            this.L$3 = function3;
            this.L$4 = function22;
            this.L$5 = function2;
            this.L$6 = httpRequestBuilder;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            obj2 = sender.proceed(httpRequestBuilder, this);
            if (obj2 == coroutine_suspended) {
            }
            HttpClientCall httpClientCall2222 = (HttpClientCall) obj2;
            HttpRequestRetry$lambda$1$shouldRetry = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetry(i2, i, function32, httpClientCall2222);
            if (HttpRequestRetry$lambda$1$shouldRetry) {
            }
            th = th3;
            HttpRequestRetry$lambda$1$shouldRetryOnException = HttpRequestRetryKt.HttpRequestRetry$lambda$1$shouldRetryOnException(i2, i, function3, httpRequestBuilder, th);
            if (!HttpRequestRetry$lambda$1$shouldRetryOnException) {
            }
        }
    }
}
