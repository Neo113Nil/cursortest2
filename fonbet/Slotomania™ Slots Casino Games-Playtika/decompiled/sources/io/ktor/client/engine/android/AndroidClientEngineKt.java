package io.ktor.client.engine.android;

import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.http.content.OutgoingContent;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.jvm.javaio.WritingKt;
import java.io.Closeable;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;

/* compiled from: AndroidClientEngine.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a$\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/content/OutgoingContent;", "Ljava/io/OutputStream;", "stream", "Lkotlin/coroutines/CoroutineContext;", "callContext", "", "writeTo", "(Lio/ktor/http/content/OutgoingContent;Ljava/io/OutputStream;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidClientEngineKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeTo(OutgoingContent outgoingContent, OutputStream outputStream, CoroutineContext coroutineContext, Continuation<? super Unit> continuation) {
        AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$1;
        int i;
        OutputStream outputStream2;
        OutputStream outputStream3;
        OutputStream outputStream4;
        OutputStream outputStream5 = outputStream;
        try {
            if (continuation instanceof AndroidClientEngineKt$writeTo$1) {
                androidClientEngineKt$writeTo$1 = (AndroidClientEngineKt$writeTo$1) continuation;
                if ((androidClientEngineKt$writeTo$1.label & Integer.MIN_VALUE) != 0) {
                    androidClientEngineKt$writeTo$1.label -= Integer.MIN_VALUE;
                    AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$12 = androidClientEngineKt$writeTo$1;
                    Object obj = androidClientEngineKt$writeTo$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidClientEngineKt$writeTo$12.label;
                    if (i == 0) {
                        if (i == 1) {
                            ?? r1 = (Closeable) androidClientEngineKt$writeTo$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            outputStream4 = r1;
                            Unit unit = Unit.INSTANCE;
                            outputStream5 = outputStream4;
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream5, null);
                            return Unit.INSTANCE;
                        }
                        if (i == 2) {
                            ?? r12 = (Closeable) androidClientEngineKt$writeTo$12.L$0;
                            ResultKt.throwOnFailure(obj);
                            outputStream5 = r12;
                            Unit unit22 = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream5, null);
                            return Unit.INSTANCE;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = (Closeable) androidClientEngineKt$writeTo$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        outputStream3 = r13;
                        Unit unit3 = Unit.INSTANCE;
                        outputStream5 = outputStream3;
                        Unit unit222 = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream5, null);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    outputStream2 = outputStream5;
                    try {
                        OutputStream outputStream6 = outputStream2;
                        if (!(outgoingContent instanceof OutgoingContent.ByteArrayContent)) {
                            if (outgoingContent instanceof OutgoingContent.ReadChannelContent) {
                                ByteReadChannel readFrom = ((OutgoingContent.ReadChannelContent) outgoingContent).readFrom();
                                androidClientEngineKt$writeTo$12.L$0 = outputStream2;
                                androidClientEngineKt$writeTo$12.label = 1;
                                if (WritingKt.copyTo$default(readFrom, outputStream6, 0L, androidClientEngineKt$writeTo$12, 2, null) != coroutine_suspended) {
                                    outputStream4 = outputStream2;
                                    Unit unit4 = Unit.INSTANCE;
                                    outputStream5 = outputStream4;
                                    Unit unit2222 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(outputStream5, null);
                                    return Unit.INSTANCE;
                                }
                            } else {
                                if (outgoingContent instanceof OutgoingContent.WriteChannelContent) {
                                    ByteReadChannel channel = ByteWriteChannelOperationsKt.writer$default((CoroutineScope) GlobalScope.INSTANCE, coroutineContext, false, (Function2) new AndroidClientEngineKt$writeTo$2$channel$1(outgoingContent, null), 2, (Object) null).getChannel();
                                    androidClientEngineKt$writeTo$12.L$0 = outputStream2;
                                    androidClientEngineKt$writeTo$12.label = 2;
                                    if (WritingKt.copyTo$default(channel, outputStream6, 0L, androidClientEngineKt$writeTo$12, 2, null) == coroutine_suspended) {
                                    }
                                } else if (outgoingContent instanceof OutgoingContent.NoContent) {
                                    Unit unit5 = Unit.INSTANCE;
                                } else {
                                    if (!(outgoingContent instanceof OutgoingContent.ContentWrapper)) {
                                        if (outgoingContent instanceof OutgoingContent.ProtocolUpgrade) {
                                            throw new UnsupportedContentTypeException(outgoingContent);
                                        }
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    OutgoingContent delegate = ((OutgoingContent.ContentWrapper) outgoingContent).getDelegate();
                                    androidClientEngineKt$writeTo$12.L$0 = outputStream2;
                                    androidClientEngineKt$writeTo$12.label = 3;
                                    if (writeTo(delegate, outputStream5, coroutineContext, androidClientEngineKt$writeTo$12) != coroutine_suspended) {
                                        outputStream3 = outputStream2;
                                        Unit unit32 = Unit.INSTANCE;
                                        outputStream5 = outputStream3;
                                    }
                                }
                                Unit unit22222 = Unit.INSTANCE;
                                CloseableKt.closeFinally(outputStream5, null);
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        outputStream6.write(((OutgoingContent.ByteArrayContent) outgoingContent).getBytes());
                        Unit unit6 = Unit.INSTANCE;
                        outputStream5 = outputStream2;
                        Unit unit222222 = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream5, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(outputStream2, th2);
                            throw th3;
                        }
                    }
                }
            }
            if (i == 0) {
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream2 = outputStream5;
        }
        androidClientEngineKt$writeTo$1 = new AndroidClientEngineKt$writeTo$1(continuation);
        AndroidClientEngineKt$writeTo$1 androidClientEngineKt$writeTo$122 = androidClientEngineKt$writeTo$1;
        Object obj2 = androidClientEngineKt$writeTo$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidClientEngineKt$writeTo$122.label;
    }
}
