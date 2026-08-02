package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.client.plugins.HttpSend;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.http.HttpMessageBuilder;
import io.ktor.http.HttpMessagePropertiesKt;
import io.ktor.http.content.NullBody;
import io.ktor.http.content.OutgoingContent;
import io.ktor.util.pipeline.PipelineContext;
import io.ktor.util.reflect.TypeInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.StringsKt;

/* compiled from: HttpSend.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/util/pipeline/PipelineContext;", "", "Lio/ktor/client/request/HttpRequestBuilder;", "content"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.HttpSend$Plugin$install$1", f = "HttpSend.kt", i = {0}, l = {98, 99}, m = "invokeSuspend", n = {"$this$intercept"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class HttpSend$Plugin$install$1 extends SuspendLambda implements Function3<PipelineContext<Object, HttpRequestBuilder>, Object, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpSend $plugin;
    final /* synthetic */ HttpClient $scope;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HttpSend$Plugin$install$1(HttpSend httpSend, HttpClient httpClient, Continuation<? super HttpSend$Plugin$install$1> continuation) {
        super(3, continuation);
        this.$plugin = httpSend;
        this.$scope = httpClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PipelineContext<Object, HttpRequestBuilder> pipelineContext, Object obj, Continuation<? super Unit> continuation) {
        HttpSend$Plugin$install$1 httpSend$Plugin$install$1 = new HttpSend$Plugin$install$1(this.$plugin, this.$scope, continuation);
        httpSend$Plugin$install$1.L$0 = pipelineContext;
        httpSend$Plugin$install$1.L$1 = obj;
        return httpSend$Plugin$install$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:
    
        if (r1.proceedWith((io.ktor.client.call.HttpClientCall) r9, r8) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00be, code lost:
    
        if (r9 == r0) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PipelineContext pipelineContext;
        KType kType;
        int i;
        List list;
        KType kType2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            pipelineContext = (PipelineContext) this.L$0;
            Object obj2 = this.L$1;
            boolean z = obj2 instanceof OutgoingContent;
            if (!z) {
                throw new IllegalStateException(StringsKt.trimMargin$default("\n|Fail to prepare request body for sending. \n|The body type is: " + Reflection.getOrCreateKotlinClass(obj2.getClass()) + ", with Content-Type: " + HttpMessagePropertiesKt.contentType((HttpMessageBuilder) pipelineContext.getContext()) + ".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.", null, 1, null).toString());
            }
            HttpRequestBuilder httpRequestBuilder = (HttpRequestBuilder) pipelineContext.getContext();
            if (obj2 == null) {
                httpRequestBuilder.setBody(NullBody.INSTANCE);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OutgoingContent.class);
                try {
                    kType2 = Reflection.typeOf(OutgoingContent.class);
                } catch (Throwable unused) {
                    kType2 = null;
                }
                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass, kType2));
            } else if (z) {
                httpRequestBuilder.setBody(obj2);
                httpRequestBuilder.setBodyType(null);
            } else {
                httpRequestBuilder.setBody(obj2);
                KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(OutgoingContent.class);
                try {
                    kType = Reflection.typeOf(OutgoingContent.class);
                } catch (Throwable unused2) {
                    kType = null;
                }
                httpRequestBuilder.setBodyType(new TypeInfo(orCreateKotlinClass2, kType));
            }
            i = this.$plugin.maxSendCount;
            HttpSend.InterceptedSender defaultSender = new HttpSend.DefaultSender(i, this.$scope);
            list = this.$plugin.interceptors;
            Iterator it = CollectionsKt.reversed(list).iterator();
            while (it.hasNext()) {
                defaultSender = new HttpSend.InterceptedSender((Function3) it.next(), defaultSender);
            }
            this.L$0 = pipelineContext;
            this.label = 1;
            obj = defaultSender.execute((HttpRequestBuilder) pipelineContext.getContext(), this);
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            pipelineContext = (PipelineContext) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        this.L$0 = null;
        this.label = 2;
    }
}
