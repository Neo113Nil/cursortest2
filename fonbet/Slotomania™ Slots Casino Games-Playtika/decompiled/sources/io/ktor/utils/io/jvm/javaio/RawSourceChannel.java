package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.CloseToken;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.sentry.protocol.MetricSummary;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;
import kotlinx.io.Source;

/* compiled from: Reading.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020'8VX\u0097\u0004¢\u0006\f\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/RawSourceChannel;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/RawSource;", "source", "Lkotlin/coroutines/CoroutineContext;", "parent", "<init>", "(Lkotlinx/io/RawSource;Lkotlin/coroutines/CoroutineContext;)V", "", MetricSummary.JsonKeys.MIN, "", "awaitContent", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)V", "Lkotlinx/io/RawSource;", "Lkotlin/coroutines/CoroutineContext;", "Lio/ktor/utils/io/CloseToken;", "closedToken", "Lio/ktor/utils/io/CloseToken;", "Lkotlinx/io/Buffer;", "buffer", "Lkotlinx/io/Buffer;", "getClosedCause", "()Ljava/lang/Throwable;", "closedCause", "isClosedForRead", "()Z", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlinx/coroutines/CompletableJob;", "getJob", "()Lkotlinx/coroutines/CompletableJob;", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/io/Source;", "getReadBuffer", "()Lkotlinx/io/Source;", "getReadBuffer$annotations", "()V", "readBuffer", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RawSourceChannel implements ByteReadChannel {
    private final Buffer buffer;
    private CloseToken closedToken;
    private final CoroutineContext coroutineContext;
    private final CompletableJob job;
    private final CoroutineContext parent;
    private final RawSource source;

    public static /* synthetic */ void getReadBuffer$annotations() {
    }

    public RawSourceChannel(RawSource source, CoroutineContext parent) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.source = source;
        this.parent = parent;
        this.buffer = new Buffer();
        CompletableJob Job = JobKt.Job((Job) parent.get(Job.INSTANCE));
        this.job = Job;
        this.coroutineContext = parent.plus(Job).plus(new CoroutineName("RawSourceChannel"));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public Throwable getClosedCause() {
        CloseToken closeToken = this.closedToken;
        if (closeToken != null) {
            return CloseToken.wrapCause$default(closeToken, null, 1, null);
        }
        return null;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public boolean isClosedForRead() {
        return this.closedToken != null && this.buffer.exhausted();
    }

    public final CompletableJob getJob() {
        return this.job;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.utils.io.ByteReadChannel
    public Source getReadBuffer() {
        return this.buffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.utils.io.ByteReadChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object awaitContent(int i, Continuation<? super Boolean> continuation) {
        RawSourceChannel$awaitContent$1 rawSourceChannel$awaitContent$1;
        int i2;
        if (continuation instanceof RawSourceChannel$awaitContent$1) {
            rawSourceChannel$awaitContent$1 = (RawSourceChannel$awaitContent$1) continuation;
            if ((rawSourceChannel$awaitContent$1.label & Integer.MIN_VALUE) != 0) {
                rawSourceChannel$awaitContent$1.label -= Integer.MIN_VALUE;
                Object obj = rawSourceChannel$awaitContent$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = rawSourceChannel$awaitContent$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.closedToken != null) {
                        return Boxing.boxBoolean(true);
                    }
                    CoroutineContext coroutineContext = this.coroutineContext;
                    RawSourceChannel$awaitContent$2 rawSourceChannel$awaitContent$2 = new RawSourceChannel$awaitContent$2(this, i, null);
                    rawSourceChannel$awaitContent$1.I$0 = i;
                    rawSourceChannel$awaitContent$1.label = 1;
                    if (BuildersKt.withContext(coroutineContext, rawSourceChannel$awaitContent$2, rawSourceChannel$awaitContent$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = rawSourceChannel$awaitContent$1.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(ByteReadPacketKt.getRemaining(this.buffer) >= ((long) i));
            }
        }
        rawSourceChannel$awaitContent$1 = new RawSourceChannel$awaitContent$1(this, continuation);
        Object obj2 = rawSourceChannel$awaitContent$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = rawSourceChannel$awaitContent$1.label;
        if (i2 != 0) {
        }
        return Boxing.boxBoolean(ByteReadPacketKt.getRemaining(this.buffer) >= ((long) i));
    }

    @Override // io.ktor.utils.io.ByteReadChannel, io.ktor.utils.io.ByteWriteChannel
    public void cancel(Throwable cause) {
        String str;
        String message;
        if (this.closedToken != null) {
            return;
        }
        CompletableJob completableJob = this.job;
        String str2 = "Channel was cancelled";
        if (cause == null || (str = cause.getMessage()) == null) {
            str = "Channel was cancelled";
        }
        JobKt.cancel(completableJob, str, cause);
        this.source.close();
        if (cause != null && (message = cause.getMessage()) != null) {
            str2 = message;
        }
        this.closedToken = new CloseToken(new IOException(str2, cause));
    }
}
