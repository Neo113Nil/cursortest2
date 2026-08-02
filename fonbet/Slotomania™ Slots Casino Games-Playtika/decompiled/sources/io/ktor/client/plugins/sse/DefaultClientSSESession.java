package io.ktor.client.plugins.sse;

import com.google.common.net.HttpHeaders;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.sse.ServerSentEvent;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelKt;
import io.ktor.utils.io.ClosedByteChannelException;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DefaultClientSSESession.kt */
@Deprecated(message = "It should be marked with `@InternalAPI`, please use `ClientSSESession` instead")
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u000b*\u00060\u0017j\u0002`\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0019*\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010!J\u0013\u0010#\u001a\u00020\u001f*\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010!R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010.R\u0014\u00104\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0013098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0013098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lio/ktor/client/plugins/sse/DefaultClientSSESession;", "Lio/ktor/client/plugins/sse/SSESession;", "Lio/ktor/client/plugins/sse/SSEClientContent;", "content", "Lio/ktor/utils/io/ByteReadChannel;", "input", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/CoroutineContext;)V", "(Lio/ktor/client/plugins/sse/SSEClientContent;Lio/ktor/utils/io/ByteReadChannel;)V", "", "doReconnection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/client/request/HttpRequestBuilder;", "getRequestForReconnection", "()Lio/ktor/client/request/HttpRequestBuilder;", "close", "()V", "Lio/ktor/sse/ServerSentEvent;", "tryParseEvent", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseEvent", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "comment", "appendComment", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "toText", "(Ljava/lang/StringBuilder;)Ljava/lang/String;", "", "isEmpty", "(Lio/ktor/sse/ServerSentEvent;)Z", "isCommentsEvent", "isRetryEvent", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lastEventId", "Ljava/lang/String;", "", "reconnectionTimeMillis", "J", "showCommentEvents", "Z", "showRetryEvents", "", "maxReconnectionAttempts", "I", "needToReconnect", "initialRequest", "Lio/ktor/client/request/HttpRequestBuilder;", "Lio/ktor/client/HttpClient;", "clientForReconnection", "Lio/ktor/client/HttpClient;", "Lkotlinx/coroutines/flow/Flow;", "_incoming", "Lkotlinx/coroutines/flow/Flow;", "getIncoming", "()Lkotlinx/coroutines/flow/Flow;", "incoming", "ktor-client-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultClientSSESession implements SSESession {
    private Flow<ServerSentEvent> _incoming;
    private final HttpClient clientForReconnection;
    private final CoroutineContext coroutineContext;
    private final HttpRequestBuilder initialRequest;
    private ByteReadChannel input;
    private String lastEventId;
    private final int maxReconnectionAttempts;
    private boolean needToReconnect;
    private long reconnectionTimeMillis;
    private final boolean showCommentEvents;
    private final boolean showRetryEvents;

    public DefaultClientSSESession(SSEClientContent content, ByteReadChannel input, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.input = input;
        this.coroutineContext = coroutineContext;
        this.reconnectionTimeMillis = Duration.m12538getInWholeMillisecondsimpl(content.getReconnectionTime());
        this.showCommentEvents = content.getShowCommentEvents();
        this.showRetryEvents = content.getShowRetryEvents();
        int maxReconnectionAttempts = content.getMaxReconnectionAttempts();
        this.maxReconnectionAttempts = maxReconnectionAttempts;
        this.needToReconnect = maxReconnectionAttempts > 0;
        HttpRequestBuilder initialRequest = content.getInitialRequest();
        this.initialRequest = initialRequest;
        this.clientForReconnection = (HttpClient) initialRequest.getAttributes().get(SSEKt.getSSEClientForReconnectionAttr());
        this._incoming = FlowKt.onCompletion(FlowKt.m12721catch(FlowKt.flow(new DefaultClientSSESession$_incoming$1(this, null)), new DefaultClientSSESession$_incoming$2(this, null)), new DefaultClientSSESession$_incoming$3(this, null));
        JobKt.getJob(getCoroutineContext()).invokeOnCompletion(new Function1() { // from class: io.ktor.client.plugins.sse.DefaultClientSSESession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit _init_$lambda$0;
                _init_$lambda$0 = DefaultClientSSESession._init_$lambda$0(DefaultClientSSESession.this, (Throwable) obj);
                return _init_$lambda$0;
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultClientSSESession(SSEClientContent content, ByteReadChannel input) {
        this(content, input, r0.plus(r1).plus(new CoroutineName("DefaultClientSSESession")));
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(input, "input");
        CoroutineContext callContext = content.getCallContext();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(DefaultClientSSESession defaultClientSSESession, Throwable th) {
        defaultClientSSESession.close();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object doReconnection(Continuation<? super Unit> continuation) {
        Object withContext = kotlinx.coroutines.BuildersKt.withContext(getCoroutineContext(), new DefaultClientSSESession$doReconnection$2(this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HttpRequestBuilder getRequestForReconnection() {
        HttpRequestBuilder takeFrom = new HttpRequestBuilder().takeFrom(this.initialRequest);
        takeFrom.getAttributes().remove(BuildersKt.getSseRequestAttr());
        takeFrom.getAttributes().put(SSEKt.getSSEReconnectionRequestAttr(), true);
        String str = this.lastEventId;
        if (str != null) {
            takeFrom.getHeaders().append(HttpHeaders.LAST_EVENT_ID, str);
        }
        return takeFrom;
    }

    @Override // io.ktor.client.plugins.sse.SSESession
    public Flow<ServerSentEvent> getIncoming() {
        return this._incoming;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close() {
        JobKt__JobKt.cancel$default(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        ByteReadChannelKt.cancel(this.input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryParseEvent(ByteReadChannel byteReadChannel, Continuation<? super ServerSentEvent> continuation) {
        DefaultClientSSESession$tryParseEvent$1 defaultClientSSESession$tryParseEvent$1;
        int i;
        try {
            if (continuation instanceof DefaultClientSSESession$tryParseEvent$1) {
                defaultClientSSESession$tryParseEvent$1 = (DefaultClientSSESession$tryParseEvent$1) continuation;
                if ((defaultClientSSESession$tryParseEvent$1.label & Integer.MIN_VALUE) != 0) {
                    defaultClientSSESession$tryParseEvent$1.label -= Integer.MIN_VALUE;
                    Object obj = defaultClientSSESession$tryParseEvent$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = defaultClientSSESession$tryParseEvent$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        defaultClientSSESession$tryParseEvent$1.label = 1;
                        obj = parseEvent(byteReadChannel, defaultClientSSESession$tryParseEvent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (ServerSentEvent) obj;
                }
            }
            if (i != 0) {
            }
            return (ServerSentEvent) obj;
        } catch (ClosedByteChannelException unused) {
            return null;
        }
        defaultClientSSESession$tryParseEvent$1 = new DefaultClientSSESession$tryParseEvent$1(this, continuation);
        Object obj2 = defaultClientSSESession$tryParseEvent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = defaultClientSSESession$tryParseEvent$1.label;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0215 -> B:12:0x021a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x00f5 -> B:67:0x00f9). Please report as a decompilation issue!!! */
    public final java.lang.Object parseEvent(io.ktor.utils.io.ByteReadChannel r21, kotlin.coroutines.Continuation<? super io.ktor.sse.ServerSentEvent> r22) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.plugins.sse.DefaultClientSSESession.parseEvent(io.ktor.utils.io.ByteReadChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final void appendComment(StringBuilder sb, String str) {
        sb.append(StringsKt.removePrefix(StringsKt.removePrefix(str, (CharSequence) ":"), (CharSequence) ServerSentEventKt.SPACE)).append(ServerSentEventKt.END_OF_LINE);
    }

    private final String toText(StringBuilder sb) {
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return StringsKt.removeSuffix(sb2, (CharSequence) ServerSentEventKt.END_OF_LINE);
    }

    private final boolean isEmpty(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getId() == null && serverSentEvent.getEvent() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCommentsEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getRetry() == null && serverSentEvent.getComments() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRetryEvent(ServerSentEvent serverSentEvent) {
        return serverSentEvent.getData() == null && serverSentEvent.getEvent() == null && serverSentEvent.getId() == null && serverSentEvent.getComments() == null && serverSentEvent.getRetry() != null;
    }
}
