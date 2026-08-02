package io.ktor.utils.io.jvm.nio;

import io.ktor.utils.io.ByteWriteChannel;
import java.nio.ByteBuffer;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: WriteSuspendSession.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a=\u0010\b\u001a\u00020\u0004*\u00020\u00002'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0087@¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086H¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "Lkotlin/Function2;", "Lio/ktor/utils/io/jvm/nio/WriteSuspendSession;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "writeSuspendSession", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Ljava/nio/ByteBuffer;", "", "writeWhile", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WriteSuspendSessionKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r7 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r8.invoke(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.utils.io.ByteWriteChannel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    @Deprecated(level = DeprecationLevel.WARNING, message = "writeSuspendSession deprecated, use writeWhile instead", replaceWith = @ReplaceWith(expression = "writeWhile { buffer -> }", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeSuspendSession(ByteWriteChannel byteWriteChannel, Function2<? super WriteSuspendSession, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        WriteSuspendSessionKt$writeSuspendSession$1 writeSuspendSessionKt$writeSuspendSession$1;
        Object coroutine_suspended;
        int i;
        ByteWriteChannel byteWriteChannel2;
        try {
            if (continuation instanceof WriteSuspendSessionKt$writeSuspendSession$1) {
                writeSuspendSessionKt$writeSuspendSession$1 = (WriteSuspendSessionKt$writeSuspendSession$1) continuation;
                if ((writeSuspendSessionKt$writeSuspendSession$1.label & Integer.MIN_VALUE) != 0) {
                    writeSuspendSessionKt$writeSuspendSession$1.label -= Integer.MIN_VALUE;
                    Object obj = writeSuspendSessionKt$writeSuspendSession$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = writeSuspendSessionKt$writeSuspendSession$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        WriteSuspendSession writeSuspendSession = new WriteSuspendSession(byteWriteChannel);
                        writeSuspendSessionKt$writeSuspendSession$1.L$0 = byteWriteChannel;
                        writeSuspendSessionKt$writeSuspendSession$1.label = 1;
                        byteWriteChannel2 = byteWriteChannel;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                ResultKt.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) writeSuspendSessionKt$writeSuspendSession$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            throw th;
                        }
                        ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) writeSuspendSessionKt$writeSuspendSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        byteWriteChannel2 = byteWriteChannel3;
                    }
                    writeSuspendSessionKt$writeSuspendSession$1.L$0 = null;
                    writeSuspendSessionKt$writeSuspendSession$1.label = 2;
                    byteWriteChannel = byteWriteChannel2.flush(writeSuspendSessionKt$writeSuspendSession$1);
                }
            }
            if (i != 0) {
            }
            writeSuspendSessionKt$writeSuspendSession$1.L$0 = null;
            writeSuspendSessionKt$writeSuspendSession$1.label = 2;
            byteWriteChannel = byteWriteChannel2.flush(writeSuspendSessionKt$writeSuspendSession$1);
        } catch (Throwable th2) {
            writeSuspendSessionKt$writeSuspendSession$1.L$0 = th2;
            writeSuspendSessionKt$writeSuspendSession$1.label = 3;
            if (byteWriteChannel.flush(writeSuspendSessionKt$writeSuspendSession$1) != coroutine_suspended) {
                throw th2;
            }
        }
        writeSuspendSessionKt$writeSuspendSession$1 = new WriteSuspendSessionKt$writeSuspendSession$1(continuation);
        Object obj2 = writeSuspendSessionKt$writeSuspendSession$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writeSuspendSessionKt$writeSuspendSession$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeWhile(ByteWriteChannel byteWriteChannel, Function1<? super ByteBuffer, Boolean> function1, Continuation<? super Unit> continuation) {
        WriteSuspendSessionKt$writeWhile$1 writeSuspendSessionKt$writeWhile$1;
        int i;
        ByteWriteChannel byteWriteChannel2;
        Ref.BooleanRef booleanRef;
        Function1<? super ByteBuffer, Boolean> function12;
        if (continuation instanceof WriteSuspendSessionKt$writeWhile$1) {
            writeSuspendSessionKt$writeWhile$1 = (WriteSuspendSessionKt$writeWhile$1) continuation;
            if ((writeSuspendSessionKt$writeWhile$1.label & Integer.MIN_VALUE) != 0) {
                writeSuspendSessionKt$writeWhile$1.label -= Integer.MIN_VALUE;
                Object obj = writeSuspendSessionKt$writeWhile$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = writeSuspendSessionKt$writeWhile$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byteWriteChannel2 = byteWriteChannel;
                    booleanRef = new Ref.BooleanRef();
                    function12 = function1;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = (Ref.BooleanRef) writeSuspendSessionKt$writeWhile$1.L$2;
                    Function1<? super ByteBuffer, Boolean> function13 = (Function1) writeSuspendSessionKt$writeWhile$1.L$1;
                    ByteWriteChannel byteWriteChannel3 = (ByteWriteChannel) writeSuspendSessionKt$writeWhile$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    function12 = function13;
                    byteWriteChannel2 = byteWriteChannel3;
                }
                while (!booleanRef.element) {
                    UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                    Buffer bufferField = byteWriteChannel2.getWriteBuffer().getBufferField();
                    Segment writableSegment = bufferField.writableSegment(1);
                    byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                    int limit = writableSegment.getLimit();
                    ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
                    Intrinsics.checkNotNull(wrap);
                    booleanRef.element = !function12.invoke(wrap).booleanValue();
                    int position = wrap.position() - limit;
                    if (position == 1) {
                        writableSegment.writeBackData(dataAsByteArray, position);
                        writableSegment.setLimit(writableSegment.getLimit() + position);
                        bufferField.setSizeMut(bufferField.getSizeMut() + position);
                    } else {
                        if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                            throw new IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                        }
                        if (position != 0) {
                            writableSegment.writeBackData(dataAsByteArray, position);
                            writableSegment.setLimit(writableSegment.getLimit() + position);
                            bufferField.setSizeMut(bufferField.getSizeMut() + position);
                        } else if (SegmentKt.isEmpty(writableSegment)) {
                            bufferField.recycleTail();
                        }
                    }
                    writeSuspendSessionKt$writeWhile$1.L$0 = byteWriteChannel2;
                    writeSuspendSessionKt$writeWhile$1.L$1 = function12;
                    writeSuspendSessionKt$writeWhile$1.L$2 = booleanRef;
                    writeSuspendSessionKt$writeWhile$1.label = 1;
                    if (byteWriteChannel2.flush(writeSuspendSessionKt$writeWhile$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        writeSuspendSessionKt$writeWhile$1 = new WriteSuspendSessionKt$writeWhile$1(continuation);
        Object obj2 = writeSuspendSessionKt$writeWhile$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = writeSuspendSessionKt$writeWhile$1.label;
        if (i != 0) {
        }
        while (!booleanRef.element) {
        }
        return Unit.INSTANCE;
    }

    private static final Object writeWhile$$forInline(ByteWriteChannel byteWriteChannel, Function1<? super ByteBuffer, Boolean> function1, Continuation<? super Unit> continuation) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        while (!booleanRef.element) {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Buffer bufferField = byteWriteChannel.getWriteBuffer().getBufferField();
            Segment writableSegment = bufferField.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            Integer valueOf = Integer.valueOf(writableSegment.getLimit());
            int intValue = Integer.valueOf(dataAsByteArray.length).intValue();
            int intValue2 = valueOf.intValue();
            ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, intValue2, intValue - intValue2);
            Intrinsics.checkNotNull(wrap);
            booleanRef.element = !function1.invoke(wrap).booleanValue();
            int intValue3 = Integer.valueOf(wrap.position() - intValue2).intValue();
            if (intValue3 == 1) {
                writableSegment.writeBackData(dataAsByteArray, intValue3);
                writableSegment.setLimit(writableSegment.getLimit() + intValue3);
                bufferField.setSizeMut(bufferField.getSizeMut() + intValue3);
            } else {
                if (intValue3 < 0 || intValue3 > writableSegment.getRemainingCapacity()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + intValue3 + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (intValue3 != 0) {
                    writableSegment.writeBackData(dataAsByteArray, intValue3);
                    writableSegment.setLimit(writableSegment.getLimit() + intValue3);
                    bufferField.setSizeMut(bufferField.getSizeMut() + intValue3);
                } else if (SegmentKt.isEmpty(writableSegment)) {
                    bufferField.recycleTail();
                }
            }
            byteWriteChannel.flush(continuation);
        }
        return Unit.INSTANCE;
    }
}
