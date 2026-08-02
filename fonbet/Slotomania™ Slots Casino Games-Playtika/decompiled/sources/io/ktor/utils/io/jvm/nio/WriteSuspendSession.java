package io.ktor.utils.io.jvm.nio;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.core.OutputArraysJVMKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Sink;

/* compiled from: WriteSuspendSession.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\n \u0014*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "", "Lio/ktor/utils/io/ByteWriteChannel;", AppsFlyerProperties.CHANNEL, "<init>", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "", "count", "Ljava/nio/ByteBuffer;", "request", "(I)Ljava/nio/ByteBuffer;", "", "tryAwait", "(I)V", "rc", "written", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "getChannel", "()Lio/ktor/utils/io/ByteWriteChannel;", "kotlin.jvm.PlatformType", "byteBuffer", "Ljava/nio/ByteBuffer;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WriteSuspendSession {
    private final ByteBuffer byteBuffer;
    private final ByteWriteChannel channel;

    public WriteSuspendSession(ByteWriteChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        this.byteBuffer = ByteBuffer.allocate(8192);
    }

    public final ByteWriteChannel getChannel() {
        return this.channel;
    }

    public final ByteBuffer request(int count) {
        return this.byteBuffer;
    }

    public final void tryAwait(int count) {
        Sink writeBuffer = this.channel.getWriteBuffer();
        ByteBuffer byteBuffer = this.byteBuffer;
        Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
        OutputArraysJVMKt.writeByteBuffer(writeBuffer, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r7.flush(r6) != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperations_jvmKt.writeFully(r7, r1, r6) == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object written(int i, Continuation<? super Unit> continuation) {
        WriteSuspendSession$written$1 writeSuspendSession$written$1;
        int i2;
        if (continuation instanceof WriteSuspendSession$written$1) {
            writeSuspendSession$written$1 = (WriteSuspendSession$written$1) continuation;
            if ((writeSuspendSession$written$1.label & Integer.MIN_VALUE) != 0) {
                writeSuspendSession$written$1.label -= Integer.MIN_VALUE;
                Object obj = writeSuspendSession$written$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = writeSuspendSession$written$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.byteBuffer.flip();
                    ByteWriteChannel byteWriteChannel = this.channel;
                    ByteBuffer byteBuffer = this.byteBuffer;
                    Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
                    writeSuspendSession$written$1.label = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.byteBuffer.clear();
                ByteWriteChannel byteWriteChannel2 = this.channel;
                writeSuspendSession$written$1.label = 2;
            }
        }
        writeSuspendSession$written$1 = new WriteSuspendSession$written$1(this, continuation);
        Object obj2 = writeSuspendSession$written$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = writeSuspendSession$written$1.label;
        if (i2 != 0) {
        }
        this.byteBuffer.clear();
        ByteWriteChannel byteWriteChannel22 = this.channel;
        writeSuspendSession$written$1.label = 2;
    }
}
