package io.ktor.util;

import io.ktor.utils.io.ByteChannel;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.pool.ByteArrayPoolKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: ByteChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1", f = "ByteChannels.kt", i = {0, 0, 1, 1}, l = {27, 32}, m = "invokeSuspend", n = {"$this$launch", "buffer", "$this$launch", "buffer"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class ByteChannelsKt$split$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteChannel $first;
    final /* synthetic */ ByteChannel $second;
    final /* synthetic */ ByteReadChannel $this_split;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ByteChannelsKt$split$1(ByteReadChannel byteReadChannel, ByteChannel byteChannel, ByteChannel byteChannel2, Continuation<? super ByteChannelsKt$split$1> continuation) {
        super(2, continuation);
        this.$this_split = byteReadChannel;
        this.$first = byteChannel;
        this.$second = byteChannel2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ByteChannelsKt$split$1 byteChannelsKt$split$1 = new ByteChannelsKt$split$1(this.$this_split, this.$first, this.$second, continuation);
        byteChannelsKt$split$1.L$0 = obj;
        return byteChannelsKt$split$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ByteChannelsKt$split$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if (kotlinx.coroutines.AwaitKt.awaitAll(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) r10), r12) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: all -> 0x00ce, TRY_LEAVE, TryCatch #1 {all -> 0x00ce, blocks: (B:10:0x0045, B:12:0x004d, B:22:0x00b3, B:28:0x00cd), top: B:9:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #2 {all -> 0x002f, blocks: (B:7:0x0016, B:15:0x0066, B:17:0x006e, B:42:0x002b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[Catch: all -> 0x00ce, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00ce, blocks: (B:10:0x0045, B:12:0x004d, B:22:0x00b3, B:28:0x00cd), top: B:9:0x0045 }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v6, types: [byte[], java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:8:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00ad -> B:8:0x00b0). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        byte[] bArr;
        CoroutineScope coroutineScope;
        byte[] borrow;
        CoroutineScope coroutineScope2;
        int intValue;
        Deferred async$default;
        Deferred async$default2;
        byte[] bArr2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
        } catch (Throwable th2) {
            th = th2;
            bArr = r1;
        }
        if (r1 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            borrow = ByteArrayPoolKt.getByteArrayPool().borrow();
            if (this.$this_split.isClosedForRead()) {
            }
        } else if (r1 == 1) {
            byte[] bArr3 = (byte[]) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            r1 = bArr3;
            intValue = ((Number) obj).intValue();
            bArr2 = r1;
            if (intValue > 0) {
            }
            borrow = bArr2;
            coroutineScope = coroutineScope2;
            if (this.$this_split.isClosedForRead()) {
            }
        } else {
            if (r1 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byte[] bArr4 = (byte[]) this.L$1;
            coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            bArr2 = bArr4;
            borrow = bArr2;
            coroutineScope = coroutineScope2;
            try {
            } catch (Throwable th3) {
                th = th3;
                bArr = borrow;
                try {
                    this.$this_split.cancel(th);
                    this.$first.cancel(th);
                    this.$second.cancel(th);
                    ByteArrayPoolKt.getByteArrayPool().recycle(bArr);
                    this.$first.close();
                    this.$second.close();
                    return Unit.INSTANCE;
                } catch (Throwable th4) {
                    ByteArrayPoolKt.getByteArrayPool().recycle(bArr);
                    this.$first.close();
                    this.$second.close();
                    throw th4;
                }
            }
            if (this.$this_split.isClosedForRead()) {
                this.L$0 = coroutineScope;
                this.L$1 = borrow;
                this.label = 1;
                Object readAvailable$default = ByteReadChannelOperationsKt.readAvailable$default(this.$this_split, borrow, 0, 0, this, 6, null);
                if (readAvailable$default != coroutine_suspended) {
                    coroutineScope2 = coroutineScope;
                    obj = readAvailable$default;
                    r1 = borrow;
                    intValue = ((Number) obj).intValue();
                    bArr2 = r1;
                    if (intValue > 0) {
                        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new AnonymousClass1(this.$first, r1, intValue, null), 3, null);
                        async$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new AnonymousClass2(this.$second, r1, intValue, null), 3, null);
                        Deferred[] deferredArr = {async$default, async$default2};
                        this.L$0 = coroutineScope2;
                        this.L$1 = r1;
                        this.label = 2;
                        bArr2 = r1;
                    }
                    borrow = bArr2;
                    coroutineScope = coroutineScope2;
                    if (this.$this_split.isClosedForRead()) {
                        Throwable closedCause = this.$this_split.getClosedCause();
                        if (closedCause != null) {
                            throw closedCause;
                        }
                        ByteArrayPoolKt.getByteArrayPool().recycle(borrow);
                        this.$first.close();
                        this.$second.close();
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            }
        }
    }

    /* compiled from: ByteChannels.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$1", f = "ByteChannels.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ ByteChannel $first;
        final /* synthetic */ int $read;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ByteChannel byteChannel, byte[] bArr, int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$first = byteChannel;
            this.$buffer = bArr;
            this.$read = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$first, this.$buffer, this.$read, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ByteWriteChannelOperationsKt.writeFully(this.$first, this.$buffer, 0, this.$read, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ByteChannels.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.util.ByteChannelsKt$split$1$2", f = "ByteChannels.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.util.ByteChannelsKt$split$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ byte[] $buffer;
        final /* synthetic */ int $read;
        final /* synthetic */ ByteChannel $second;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ByteChannel byteChannel, byte[] bArr, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$second = byteChannel;
            this.$buffer = bArr;
            this.$read = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$second, this.$buffer, this.$read, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ByteWriteChannelOperationsKt.writeFully(this.$second, this.$buffer, 0, this.$read, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
