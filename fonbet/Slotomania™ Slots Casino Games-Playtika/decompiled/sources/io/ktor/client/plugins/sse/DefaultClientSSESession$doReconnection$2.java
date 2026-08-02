package io.ktor.client.plugins.sse;

import io.ktor.client.HttpClient;
import io.ktor.client.call.HttpClientCall;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.statement.HttpResponse;
import io.ktor.http.HttpStatusCode;
import io.ktor.util.logging.LoggerJvmKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.io.files.FileSystemKt;
import org.slf4j.Logger;

/* compiled from: DefaultClientSSESession.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.client.plugins.sse.DefaultClientSSESession$doReconnection$2", f = "DefaultClientSSESession.kt", i = {0, 1, 1}, l = {95, 102}, m = "invokeSuspend", n = {"retries", "retries", "reconnectionRequest"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
final class DefaultClientSSESession$doReconnection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DefaultClientSSESession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultClientSSESession$doReconnection$2(DefaultClientSSESession defaultClientSSESession, Continuation<? super DefaultClientSSESession$doReconnection$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultClientSSESession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultClientSSESession$doReconnection$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultClientSSESession$doReconnection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c5, code lost:
    
        if (r9 != r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c8, B:10:0x00d8, B:11:0x00f2, B:13:0x0105, B:14:0x010b, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00b2, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[Catch: all -> 0x002c, TRY_ENTER, TryCatch #0 {all -> 0x002c, blocks: (B:7:0x0016, B:8:0x00c8, B:10:0x00d8, B:11:0x00f2, B:13:0x0105, B:14:0x010b, B:31:0x0044, B:22:0x0064, B:24:0x0076, B:25:0x00b2, B:21:0x0028), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0176  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00c5 -> B:8:0x00c8). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        Ref.IntRef intRef;
        int i3;
        int i4;
        ByteReadChannel byteReadChannel;
        long j;
        HttpRequestBuilder requestForReconnection;
        Logger logger;
        HttpClient httpClient;
        int i5;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        try {
        } finally {
            if (i != i2) {
                i3 = intRef.element;
                i4 = this.this$0.maxReconnectionAttempts;
                if (i3 > i4) {
                }
            }
        }
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.IntRef intRef2 = new Ref.IntRef();
            intRef2.element = 1;
            intRef = intRef2;
            i3 = intRef.element;
            i4 = this.this$0.maxReconnectionAttempts;
            if (i3 > i4) {
                byteReadChannel = this.this$0.input;
                ByteReadChannelKt.cancel(byteReadChannel);
                j = this.this$0.reconnectionTimeMillis;
                this.L$0 = intRef;
                this.L$1 = null;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                requestForReconnection = this.this$0.getRequestForReconnection();
                logger = SSEKt.getLOGGER();
                DefaultClientSSESession defaultClientSSESession = this.this$0;
                if (LoggerJvmKt.isTraceEnabled(logger)) {
                }
                httpClient = this.this$0.clientForReconnection;
                this.L$0 = intRef;
                this.L$1 = requestForReconnection;
                this.label = 2;
                obj = httpClient.execute$ktor_client_core(requestForReconnection, this);
            } else {
                return Unit.INSTANCE;
            }
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                requestForReconnection = (HttpRequestBuilder) this.L$1;
                intRef = (Ref.IntRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                HttpResponse response = ((HttpClientCall) obj).getResponse();
                Logger logger2 = SSEKt.getLOGGER();
                if (LoggerJvmKt.isTraceEnabled(logger2)) {
                    logger2.trace("Receive response for reconnection SSE request to " + requestForReconnection.getUrl());
                }
                SSEKt.checkResponse(response);
                if (Intrinsics.areEqual(response.getStatus(), HttpStatusCode.INSTANCE.getNoContent())) {
                    this.this$0.needToReconnect = false;
                }
                this.this$0.input = response.getRawContent();
                return Unit.INSTANCE;
            }
            intRef = (Ref.IntRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            requestForReconnection = this.this$0.getRequestForReconnection();
            logger = SSEKt.getLOGGER();
            DefaultClientSSESession defaultClientSSESession2 = this.this$0;
            if (LoggerJvmKt.isTraceEnabled(logger)) {
                StringBuilder append = new StringBuilder().append("Sending SSE request ").append(requestForReconnection.getUrl()).append(" (attempt ").append(intRef.element + 1).append(FileSystemKt.UnixPathSeparator);
                i5 = defaultClientSSESession2.maxReconnectionAttempts;
                logger.trace(append.append(i5 + 1).append(')').toString());
            }
            httpClient = this.this$0.clientForReconnection;
            this.L$0 = intRef;
            this.L$1 = requestForReconnection;
            this.label = 2;
            obj = httpClient.execute$ktor_client_core(requestForReconnection, this);
        }
    }
}
