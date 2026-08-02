package io.ktor.client.plugins;

import io.ktor.client.call.HttpClientCall;
import io.ktor.client.plugins.api.ClientPluginBuilder;
import io.ktor.client.plugins.api.Send;
import io.ktor.client.request.HttpRequestBuilder;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* compiled from: HttpRedirect.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lio/ktor/client/call/HttpClientCall;", "Lio/ktor/client/plugins/api/Send$Sender;", "request", "Lio/ktor/client/request/HttpRequestBuilder;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpRedirectKt$HttpRedirect$2$1", f = "HttpRedirect.kt", i = {0, 0}, l = {103, 108}, m = "invokeSuspend", n = {"$this$on", "request"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
final class HttpRedirectKt$HttpRedirect$2$1 extends SuspendLambda implements Function3<Send.Sender, HttpRequestBuilder, Continuation<? super HttpClientCall>, Object> {
    final /* synthetic */ boolean $allowHttpsDowngrade;
    final /* synthetic */ boolean $checkHttpMethod;
    final /* synthetic */ ClientPluginBuilder<HttpRedirectConfig> $this_createClientPlugin;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpRedirectKt$HttpRedirect$2$1(boolean z, boolean z2, ClientPluginBuilder<HttpRedirectConfig> clientPluginBuilder, Continuation<? super HttpRedirectKt$HttpRedirect$2$1> continuation) {
        super(3, continuation);
        this.$checkHttpMethod = z;
        this.$allowHttpsDowngrade = z2;
        this.$this_createClientPlugin = clientPluginBuilder;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Send.Sender sender, HttpRequestBuilder httpRequestBuilder, Continuation<? super HttpClientCall> continuation) {
        HttpRedirectKt$HttpRedirect$2$1 httpRedirectKt$HttpRedirect$2$1 = new HttpRedirectKt$HttpRedirect$2$1(this.$checkHttpMethod, this.$allowHttpsDowngrade, this.$this_createClientPlugin, continuation);
        httpRedirectKt$HttpRedirect$2$1.L$0 = sender;
        httpRedirectKt$HttpRedirect$2$1.L$1 = httpRequestBuilder;
        return httpRedirectKt$HttpRedirect$2$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HttpRequestBuilder httpRequestBuilder;
        Send.Sender sender;
        Object HttpRedirect$lambda$2$handleCall;
        Set set;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Send.Sender sender2 = (Send.Sender) this.L$0;
            httpRequestBuilder = (HttpRequestBuilder) this.L$1;
            this.L$0 = sender2;
            this.L$1 = httpRequestBuilder;
            this.label = 1;
            Object proceed = sender2.proceed(httpRequestBuilder, this);
            if (proceed != coroutine_suspended) {
                sender = sender2;
                obj = proceed;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        httpRequestBuilder = (HttpRequestBuilder) this.L$1;
        sender = (Send.Sender) this.L$0;
        ResultKt.throwOnFailure(obj);
        HttpRequestBuilder httpRequestBuilder2 = httpRequestBuilder;
        HttpClientCall httpClientCall = (HttpClientCall) obj;
        if (this.$checkHttpMethod) {
            set = HttpRedirectKt.ALLOWED_FOR_REDIRECT;
            if (!set.contains(httpClientCall.getRequest().getMethod())) {
                return httpClientCall;
            }
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        HttpRedirect$lambda$2$handleCall = HttpRedirectKt.HttpRedirect$lambda$2$handleCall(sender, httpRequestBuilder2, httpClientCall, this.$allowHttpsDowngrade, this.$this_createClientPlugin.getClient(), this);
        return HttpRedirect$lambda$2$handleCall == coroutine_suspended ? coroutine_suspended : HttpRedirect$lambda$2$handleCall;
    }
}
