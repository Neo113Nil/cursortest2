package io.ktor.http.cio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.appsflyer.AppsFlyerProperties;
import com.google.common.net.HttpHeaders;
import io.ktor.http.ContentDisposition;
import io.ktor.http.cio.MultipartEvent;
import io.ktor.http.content.MultiPartData;
import io.ktor.http.content.PartData;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.DeprecationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.io.Source;

/* compiled from: CIOMultipartDataBase.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lio/ktor/http/cio/CIOMultipartDataBase;", "Lio/ktor/http/content/MultiPartData;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", AppsFlyerProperties.CHANNEL, "", "contentType", "", "contentLength", "formFieldLimit", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/ByteReadChannel;Ljava/lang/CharSequence;Ljava/lang/Long;J)V", "Lio/ktor/http/content/PartData;", "readPart", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readPartSuspend", "Lio/ktor/http/cio/MultipartEvent;", "event", "eventToData", "(Lio/ktor/http/cio/MultipartEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/http/cio/MultipartEvent$MultipartPart;", "part", "partToData", "(Lio/ktor/http/cio/MultipartEvent$MultipartPart;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "previousPart", "Lio/ktor/http/content/PartData;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "events", "Lkotlinx/coroutines/channels/ReceiveChannel;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CIOMultipartDataBase implements MultiPartData, CoroutineScope {
    private final CoroutineContext coroutineContext;
    private final ReceiveChannel<MultipartEvent> events;
    private PartData previousPart;

    public CIOMultipartDataBase(CoroutineContext coroutineContext, ByteReadChannel channel, CharSequence contentType, Long l, long j) {
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.coroutineContext = coroutineContext;
        this.events = MultipartKt.parseMultipart(this, channel, contentType, l, j);
    }

    public /* synthetic */ CIOMultipartDataBase(CoroutineContext coroutineContext, ByteReadChannel byteReadChannel, CharSequence charSequence, Long l, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineContext, byteReadChannel, charSequence, l, (i & 16) != 0 ? PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH : j);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0067 -> B:16:0x006a). Please report as a decompilation issue!!! */
    @Override // io.ktor.http.content.MultiPartData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readPart(Continuation<? super PartData> continuation) {
        CIOMultipartDataBase$readPart$1 cIOMultipartDataBase$readPart$1;
        int i;
        Function0<Unit> dispose;
        MultipartEvent multipartEvent;
        if (continuation instanceof CIOMultipartDataBase$readPart$1) {
            cIOMultipartDataBase$readPart$1 = (CIOMultipartDataBase$readPart$1) continuation;
            if ((cIOMultipartDataBase$readPart$1.label & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$readPart$1.label -= Integer.MIN_VALUE;
                Object obj = cIOMultipartDataBase$readPart$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOMultipartDataBase$readPart$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    PartData partData = this.previousPart;
                    if (partData != null && (dispose = partData.getDispose()) != null) {
                        dispose.invoke();
                    }
                    multipartEvent = (MultipartEvent) ChannelResult.m12704getOrNullimpl(this.events.mo12692tryReceivePtdJZtk());
                    if (multipartEvent == null) {
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                PartData partData2 = (PartData) obj;
                if (partData2 != null) {
                    this.previousPart = partData2;
                    return partData2;
                }
                multipartEvent = (MultipartEvent) ChannelResult.m12704getOrNullimpl(this.events.mo12692tryReceivePtdJZtk());
                if (multipartEvent == null) {
                    cIOMultipartDataBase$readPart$1.label = 1;
                    obj = eventToData(multipartEvent, cIOMultipartDataBase$readPart$1);
                } else {
                    cIOMultipartDataBase$readPart$1.label = 2;
                    Object readPartSuspend = readPartSuspend(cIOMultipartDataBase$readPart$1);
                    if (readPartSuspend != coroutine_suspended) {
                        return readPartSuspend;
                    }
                }
                return coroutine_suspended;
            }
        }
        cIOMultipartDataBase$readPart$1 = new CIOMultipartDataBase$readPart$1(this, continuation);
        Object obj2 = cIOMultipartDataBase$readPart$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$readPart$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004f -> B:12:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readPartSuspend(Continuation<? super PartData> continuation) {
        CIOMultipartDataBase$readPartSuspend$1 cIOMultipartDataBase$readPartSuspend$1;
        int i;
        try {
            if (continuation instanceof CIOMultipartDataBase$readPartSuspend$1) {
                cIOMultipartDataBase$readPartSuspend$1 = (CIOMultipartDataBase$readPartSuspend$1) continuation;
                if ((cIOMultipartDataBase$readPartSuspend$1.label & Integer.MIN_VALUE) != 0) {
                    cIOMultipartDataBase$readPartSuspend$1.label -= Integer.MIN_VALUE;
                    Object obj = cIOMultipartDataBase$readPartSuspend$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cIOMultipartDataBase$readPartSuspend$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ReceiveChannel<MultipartEvent> receiveChannel = this.events;
                        cIOMultipartDataBase$readPartSuspend$1.label = 1;
                        obj = receiveChannel.receive(cIOMultipartDataBase$readPartSuspend$1);
                        if (obj == coroutine_suspended) {
                        }
                        cIOMultipartDataBase$readPartSuspend$1.label = 2;
                        obj = eventToData((MultipartEvent) obj, cIOMultipartDataBase$readPartSuspend$1);
                    } else if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        cIOMultipartDataBase$readPartSuspend$1.label = 2;
                        obj = eventToData((MultipartEvent) obj, cIOMultipartDataBase$readPartSuspend$1);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        PartData partData = (PartData) obj;
                        if (partData != null) {
                            return partData;
                        }
                        ReceiveChannel<MultipartEvent> receiveChannel2 = this.events;
                        cIOMultipartDataBase$readPartSuspend$1.label = 1;
                        obj = receiveChannel2.receive(cIOMultipartDataBase$readPartSuspend$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        cIOMultipartDataBase$readPartSuspend$1.label = 2;
                        obj = eventToData((MultipartEvent) obj, cIOMultipartDataBase$readPartSuspend$1);
                    }
                }
            }
            if (i != 0) {
            }
        } catch (ClosedReceiveChannelException unused) {
            return null;
        }
        cIOMultipartDataBase$readPartSuspend$1 = new CIOMultipartDataBase$readPartSuspend$1(this, continuation);
        Object obj2 = cIOMultipartDataBase$readPartSuspend$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$readPartSuspend$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object eventToData(MultipartEvent multipartEvent, Continuation<? super PartData> continuation) {
        CIOMultipartDataBase$eventToData$1 cIOMultipartDataBase$eventToData$1;
        int i;
        try {
            if (continuation instanceof CIOMultipartDataBase$eventToData$1) {
                cIOMultipartDataBase$eventToData$1 = (CIOMultipartDataBase$eventToData$1) continuation;
                if ((cIOMultipartDataBase$eventToData$1.label & Integer.MIN_VALUE) != 0) {
                    cIOMultipartDataBase$eventToData$1.label -= Integer.MIN_VALUE;
                    Object obj = cIOMultipartDataBase$eventToData$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = cIOMultipartDataBase$eventToData$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!(multipartEvent instanceof MultipartEvent.MultipartPart)) {
                            return null;
                        }
                        cIOMultipartDataBase$eventToData$1.L$0 = multipartEvent;
                        cIOMultipartDataBase$eventToData$1.label = 1;
                        obj = partToData((MultipartEvent.MultipartPart) multipartEvent, cIOMultipartDataBase$eventToData$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return (PartData) obj;
                }
            }
            if (i != 0) {
            }
            return (PartData) obj;
        } finally {
            multipartEvent.release();
        }
        cIOMultipartDataBase$eventToData$1 = new CIOMultipartDataBase$eventToData$1(this, continuation);
        Object obj2 = cIOMultipartDataBase$eventToData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$eventToData$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object partToData(final MultipartEvent.MultipartPart multipartPart, Continuation<? super PartData> continuation) {
        CIOMultipartDataBase$partToData$1 cIOMultipartDataBase$partToData$1;
        int i;
        String parameter;
        final MultipartEvent.MultipartPart multipartPart2;
        HttpHeadersMap httpHeadersMap;
        if (continuation instanceof CIOMultipartDataBase$partToData$1) {
            cIOMultipartDataBase$partToData$1 = (CIOMultipartDataBase$partToData$1) continuation;
            if ((cIOMultipartDataBase$partToData$1.label & Integer.MIN_VALUE) != 0) {
                cIOMultipartDataBase$partToData$1.label -= Integer.MIN_VALUE;
                Object obj = cIOMultipartDataBase$partToData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cIOMultipartDataBase$partToData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred<HttpHeadersMap> headers = multipartPart.getHeaders();
                    cIOMultipartDataBase$partToData$1.L$0 = multipartPart;
                    cIOMultipartDataBase$partToData$1.label = 1;
                    obj = headers.await(cIOMultipartDataBase$partToData$1);
                } else if (i == 1) {
                    multipartPart = (MultipartEvent.MultipartPart) cIOMultipartDataBase$partToData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    httpHeadersMap = (HttpHeadersMap) cIOMultipartDataBase$partToData$1.L$1;
                    multipartPart2 = (MultipartEvent.MultipartPart) cIOMultipartDataBase$partToData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Source source = (Source) obj;
                    try {
                        PartData.FormItem formItem = new PartData.FormItem(DeprecationKt.readText(source), new Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit partToData$lambda$4$lambda$3;
                                partToData$lambda$4$lambda$3 = CIOMultipartDataBase.partToData$lambda$4$lambda$3(MultipartEvent.MultipartPart.this);
                                return partToData$lambda$4$lambda$3;
                            }
                        }, new CIOHeaders(httpHeadersMap));
                        AutoCloseableKt.closeFinally(source, null);
                        return formItem;
                    } finally {
                    }
                }
                HttpHeadersMap httpHeadersMap2 = (HttpHeadersMap) obj;
                CharSequence charSequence = httpHeadersMap2.get(HttpHeaders.CONTENT_DISPOSITION);
                ContentDisposition parse = charSequence == null ? ContentDisposition.INSTANCE.parse(charSequence.toString()) : null;
                parameter = parse == null ? parse.parameter("filename") : null;
                ByteReadChannel body = multipartPart.getBody();
                if (parameter != null) {
                    cIOMultipartDataBase$partToData$1.L$0 = multipartPart;
                    cIOMultipartDataBase$partToData$1.L$1 = httpHeadersMap2;
                    cIOMultipartDataBase$partToData$1.label = 2;
                    Object readRemaining = ByteReadChannelOperationsKt.readRemaining(body, cIOMultipartDataBase$partToData$1);
                    if (readRemaining != coroutine_suspended) {
                        multipartPart2 = multipartPart;
                        httpHeadersMap = httpHeadersMap2;
                        obj = readRemaining;
                        Source source2 = (Source) obj;
                        PartData.FormItem formItem2 = new PartData.FormItem(DeprecationKt.readText(source2), new Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit partToData$lambda$4$lambda$3;
                                partToData$lambda$4$lambda$3 = CIOMultipartDataBase.partToData$lambda$4$lambda$3(MultipartEvent.MultipartPart.this);
                                return partToData$lambda$4$lambda$3;
                            }
                        }, new CIOHeaders(httpHeadersMap));
                        AutoCloseableKt.closeFinally(source2, null);
                        return formItem2;
                    }
                    return coroutine_suspended;
                }
                return new PartData.FileItem(new Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ByteReadChannel body2;
                        body2 = MultipartEvent.MultipartPart.this.getBody();
                        return body2;
                    }
                }, new Function0() { // from class: io.ktor.http.cio.CIOMultipartDataBase$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit partToData$lambda$6;
                        partToData$lambda$6 = CIOMultipartDataBase.partToData$lambda$6(MultipartEvent.MultipartPart.this);
                        return partToData$lambda$6;
                    }
                }, new CIOHeaders(httpHeadersMap2));
            }
        }
        cIOMultipartDataBase$partToData$1 = new CIOMultipartDataBase$partToData$1(this, continuation);
        Object obj2 = cIOMultipartDataBase$partToData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cIOMultipartDataBase$partToData$1.label;
        if (i != 0) {
        }
        HttpHeadersMap httpHeadersMap22 = (HttpHeadersMap) obj2;
        CharSequence charSequence2 = httpHeadersMap22.get(HttpHeaders.CONTENT_DISPOSITION);
        if (charSequence2 == null) {
        }
        if (parse == null) {
        }
        ByteReadChannel body2 = multipartPart.getBody();
        if (parameter != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit partToData$lambda$4$lambda$3(MultipartEvent.MultipartPart multipartPart) {
        multipartPart.release();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit partToData$lambda$6(MultipartEvent.MultipartPart multipartPart) {
        multipartPart.release();
        return Unit.INSTANCE;
    }
}
