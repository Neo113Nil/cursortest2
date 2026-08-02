package io.ktor.util;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;

/* compiled from: ByteChannels.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a%\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlin/Pair;", "split", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/coroutines/CoroutineScope;)Lkotlin/Pair;", "Lio/ktor/utils/io/ByteWriteChannel;", "first", "second", "", "copyToBoth", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;Lio/ktor/utils/io/ByteWriteChannel;)V", "", "CHUNK_BUFFER_SIZE", "J", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteChannelsKt {
    private static final long CHUNK_BUFFER_SIZE = 4096;

    public static final Pair<ByteReadChannel, ByteReadChannel> split(ByteReadChannel byteReadChannel, CoroutineScope coroutineScope) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        final ByteChannel byteChannel = new ByteChannel(true);
        final ByteChannel byteChannel2 = new ByteChannel(true);
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ByteChannelsKt$split$1(byteReadChannel, byteChannel, byteChannel2, null), 3, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.util.ByteChannelsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit split$lambda$0;
                split$lambda$0 = ByteChannelsKt.split$lambda$0(ByteChannel.this, byteChannel2, (Throwable) obj);
                return split$lambda$0;
            }
        });
        return TuplesKt.to(byteChannel, byteChannel2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit split$lambda$0(ByteChannel byteChannel, ByteChannel byteChannel2, Throwable th) {
        if (th == null) {
            return Unit.INSTANCE;
        }
        byteChannel.cancel(th);
        byteChannel2.cancel(th);
        return Unit.INSTANCE;
    }

    public static final void copyToBoth(ByteReadChannel byteReadChannel, final ByteWriteChannel first, final ByteWriteChannel second) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(byteReadChannel, "<this>");
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getDefault(), null, new ByteChannelsKt$copyToBoth$1(byteReadChannel, first, second, null), 2, null);
        launch$default.invokeOnCompletion(new Function1() { // from class: io.ktor.util.ByteChannelsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit copyToBoth$lambda$1;
                copyToBoth$lambda$1 = ByteChannelsKt.copyToBoth$lambda$1(ByteWriteChannel.this, second, (Throwable) obj);
                return copyToBoth$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copyToBoth$lambda$1(ByteWriteChannel byteWriteChannel, ByteWriteChannel byteWriteChannel2, Throwable th) {
        if (th == null) {
            return Unit.INSTANCE;
        }
        ByteWriteChannelOperationsKt.close(byteWriteChannel, th);
        ByteWriteChannelOperationsKt.close(byteWriteChannel2, th);
        return Unit.INSTANCE;
    }
}
