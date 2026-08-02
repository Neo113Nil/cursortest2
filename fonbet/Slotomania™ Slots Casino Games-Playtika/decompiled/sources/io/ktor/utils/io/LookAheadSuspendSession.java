package io.ktor.utils.io;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.utils.io.core.ByteReadPacketKt;
import io.sentry.protocol.MetricSummary;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;

/* compiled from: LookAheadSession.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/utils/io/LookAheadSuspendSession;", "", "Lio/ktor/utils/io/ByteReadChannel;", AppsFlyerProperties.CHANNEL, "<init>", "(Lio/ktor/utils/io/ByteReadChannel;)V", "", "skip", "atLeast", "Ljava/nio/ByteBuffer;", "request", "(II)Ljava/nio/ByteBuffer;", MetricSummary.JsonKeys.MIN, "", "awaitAtLeast", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "count", "", "consumed", "(I)V", "Lio/ktor/utils/io/ByteReadChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class LookAheadSuspendSession {
    private final ByteReadChannel channel;

    public LookAheadSuspendSession(ByteReadChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
    }

    public final ByteBuffer request(int skip, int atLeast) {
        if (ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) < atLeast + skip) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) ByteReadPacketKt.preview(this.channel.getReadBuffer(), new Function1() { // from class: io.ktor.utils.io.LookAheadSuspendSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ByteBuffer request$lambda$0;
                request$lambda$0 = LookAheadSuspendSession.request$lambda$0((Source) obj);
                return request$lambda$0;
            }
        });
        if (skip > 0) {
            byteBuffer.position(byteBuffer.position() + skip);
        }
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteBuffer request$lambda$0(Source it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ByteBuffer.wrap(SourcesKt.readByteArray(it));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitAtLeast(int i, Continuation<? super Boolean> continuation) {
        LookAheadSuspendSession$awaitAtLeast$1 lookAheadSuspendSession$awaitAtLeast$1;
        int i2;
        if (continuation instanceof LookAheadSuspendSession$awaitAtLeast$1) {
            lookAheadSuspendSession$awaitAtLeast$1 = (LookAheadSuspendSession$awaitAtLeast$1) continuation;
            if ((lookAheadSuspendSession$awaitAtLeast$1.label & Integer.MIN_VALUE) != 0) {
                lookAheadSuspendSession$awaitAtLeast$1.label -= Integer.MIN_VALUE;
                Object obj = lookAheadSuspendSession$awaitAtLeast$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = lookAheadSuspendSession$awaitAtLeast$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) >= i) {
                        return Boxing.boxBoolean(true);
                    }
                    ByteReadChannel byteReadChannel = this.channel;
                    lookAheadSuspendSession$awaitAtLeast$1.I$0 = i;
                    lookAheadSuspendSession$awaitAtLeast$1.label = 1;
                    if (byteReadChannel.awaitContent(i, lookAheadSuspendSession$awaitAtLeast$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = lookAheadSuspendSession$awaitAtLeast$1.I$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) >= ((long) i));
            }
        }
        lookAheadSuspendSession$awaitAtLeast$1 = new LookAheadSuspendSession$awaitAtLeast$1(this, continuation);
        Object obj2 = lookAheadSuspendSession$awaitAtLeast$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = lookAheadSuspendSession$awaitAtLeast$1.label;
        if (i2 != 0) {
        }
        return Boxing.boxBoolean(ByteReadPacketKt.getRemaining(this.channel.getReadBuffer()) >= ((long) i));
    }

    public final void consumed(int count) {
        ByteReadPacketKt.discard(this.channel.getReadBuffer(), count);
    }
}
