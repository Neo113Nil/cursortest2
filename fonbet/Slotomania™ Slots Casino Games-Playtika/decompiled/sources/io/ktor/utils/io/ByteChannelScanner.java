package io.ktor.utils.io;

import com.appsflyer.AppsFlyerProperties;
import io.ktor.utils.io.ByteReadChannel;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.io.Buffer;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesKt;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.bytestring.ByteStringKt;

/* compiled from: ByteChannelScanner.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0080@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\u00020\u001b*\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/utils/io/ByteChannelScanner;", "", "Lio/ktor/utils/io/ByteReadChannel;", AppsFlyerProperties.CHANNEL, "Lkotlinx/io/bytestring/ByteString;", "matchString", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "", "limit", "<init>", "(Lio/ktor/utils/io/ByteReadChannel;Lkotlinx/io/bytestring/ByteString;Lio/ktor/utils/io/ByteWriteChannel;J)V", "", "ignoreMissing", "findNext$ktor_io", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findNext", "", "buildPartialMatchTable", "()[I", "", "advanceToNextPotentialMatch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkFullMatch", "extra", "checkBounds", "(J)V", "", "toSingleLineString", "(Lkotlinx/io/bytestring/ByteString;)Ljava/lang/String;", "Lio/ktor/utils/io/ByteReadChannel;", "Lkotlinx/io/bytestring/ByteString;", "Lio/ktor/utils/io/ByteWriteChannel;", "J", "Lkotlinx/io/Source;", "input", "Lkotlinx/io/Source;", "partialMatchTable", "[I", "Lkotlinx/io/Buffer;", "partialMatchBuffer", "Lkotlinx/io/Buffer;", "bytesRead", "", "matchIndex", "I", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ByteChannelScanner {
    private long bytesRead;
    private final ByteReadChannel channel;
    private final Source input;
    private final long limit;
    private int matchIndex;
    private final ByteString matchString;
    private final Buffer partialMatchBuffer;
    private final int[] partialMatchTable;
    private final ByteWriteChannel writeChannel;

    public ByteChannelScanner(ByteReadChannel channel, ByteString matchString, ByteWriteChannel writeChannel, long j) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(matchString, "matchString");
        Intrinsics.checkNotNullParameter(writeChannel, "writeChannel");
        this.channel = channel;
        this.matchString = matchString;
        this.writeChannel = writeChannel;
        this.limit = j;
        if (matchString.getSize() <= 0) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning".toString());
        }
        this.input = channel.getReadBuffer();
        this.partialMatchTable = buildPartialMatchTable();
        this.partialMatchBuffer = new Buffer();
    }

    public /* synthetic */ ByteChannelScanner(ByteReadChannel byteReadChannel, ByteString byteString, ByteWriteChannel byteWriteChannel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteString, byteWriteChannel, (i & 8) != 0 ? Long.MAX_VALUE : j);
    }

    public static /* synthetic */ Object findNext$ktor_io$default(ByteChannelScanner byteChannelScanner, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return byteChannelScanner.findNext$ktor_io(z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r10.flush(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (advanceToNextPotentialMatch(r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d1 -> B:19:0x00d4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object findNext$ktor_io(boolean z, Continuation<? super Long> continuation) {
        ByteChannelScanner$findNext$1 byteChannelScanner$findNext$1;
        int i;
        if (continuation instanceof ByteChannelScanner$findNext$1) {
            byteChannelScanner$findNext$1 = (ByteChannelScanner$findNext$1) continuation;
            if ((byteChannelScanner$findNext$1.label & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$findNext$1.label -= Integer.MIN_VALUE;
                Object obj = byteChannelScanner$findNext$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$findNext$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.bytesRead = 0L;
                    if (this.input.exhausted()) {
                    }
                    byteChannelScanner$findNext$1.Z$0 = z;
                    byteChannelScanner$findNext$1.label = 2;
                } else if (i == 1) {
                    z = byteChannelScanner$findNext$1.Z$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        if (!z) {
                            throw new IOException("Expected \"" + toSingleLineString(this.matchString) + "\" but encountered end of input");
                        }
                        this.bytesRead += this.partialMatchBuffer.transferTo(this.writeChannel.getWriteBuffer());
                        ByteWriteChannel byteWriteChannel = this.writeChannel;
                        byteChannelScanner$findNext$1.label = 4;
                    }
                    byteChannelScanner$findNext$1.Z$0 = z;
                    byteChannelScanner$findNext$1.label = 2;
                } else if (i == 2) {
                    z = byteChannelScanner$findNext$1.Z$0;
                    ResultKt.throwOnFailure(obj);
                    byteChannelScanner$findNext$1.Z$0 = z;
                    byteChannelScanner$findNext$1.label = 3;
                    obj = checkFullMatch(byteChannelScanner$findNext$1);
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Boxing.boxLong(this.bytesRead);
                    }
                    z = byteChannelScanner$findNext$1.Z$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        return Boxing.boxLong(this.bytesRead);
                    }
                    if (this.input.exhausted()) {
                        ByteReadChannel byteReadChannel = this.channel;
                        byteChannelScanner$findNext$1.Z$0 = z;
                        byteChannelScanner$findNext$1.label = 1;
                        obj = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$findNext$1, 1, null);
                    }
                    byteChannelScanner$findNext$1.Z$0 = z;
                    byteChannelScanner$findNext$1.label = 2;
                }
            }
        }
        byteChannelScanner$findNext$1 = new ByteChannelScanner$findNext$1(this, continuation);
        Object obj2 = byteChannelScanner$findNext$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$findNext$1.label;
        if (i != 0) {
        }
    }

    private final int[] buildPartialMatchTable() {
        int[] iArr = new int[this.matchString.getSize()];
        int size = this.matchString.getSize();
        int i = 0;
        for (int i2 = 1; i2 < size; i2++) {
            while (i > 0 && this.matchString.get(i2) != this.matchString.get(i)) {
                i = iArr[i - 1];
            }
            if (this.matchString.get(i2) == this.matchString.get(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r1, r2) == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        if (r1 == r3) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelKt.flushIfNeeded(r1, r2) == r3) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ac -> B:26:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object advanceToNextPotentialMatch(Continuation<? super Unit> continuation) {
        ByteChannelScanner$advanceToNextPotentialMatch$1 byteChannelScanner$advanceToNextPotentialMatch$1;
        int i;
        long indexOf$default;
        if (continuation instanceof ByteChannelScanner$advanceToNextPotentialMatch$1) {
            byteChannelScanner$advanceToNextPotentialMatch$1 = (ByteChannelScanner$advanceToNextPotentialMatch$1) continuation;
            if ((byteChannelScanner$advanceToNextPotentialMatch$1.label & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$advanceToNextPotentialMatch$1.label -= Integer.MIN_VALUE;
                Object obj = byteChannelScanner$advanceToNextPotentialMatch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$advanceToNextPotentialMatch$1.label;
                if (i != 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        indexOf$default = SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
                        if (indexOf$default == -1) {
                            Source source = this.input;
                            Intrinsics.checkNotNull(source, "null cannot be cast to non-null type kotlinx.io.Buffer");
                            checkBounds(((Buffer) source).getSizeMut());
                            this.bytesRead += ((Buffer) this.input).transferTo(this.writeChannel.getWriteBuffer());
                            ByteWriteChannel byteWriteChannel = this.writeChannel;
                            byteChannelScanner$advanceToNextPotentialMatch$1.label = 2;
                        } else {
                            checkBounds(indexOf$default);
                            long j = this.bytesRead;
                            Source source2 = this.input;
                            Sink writeBuffer = this.writeChannel.getWriteBuffer();
                            Intrinsics.checkNotNull(writeBuffer, "null cannot be cast to non-null type kotlinx.io.Buffer");
                            this.bytesRead = j + source2.readAtMostTo((Buffer) writeBuffer, indexOf$default);
                            ByteWriteChannel byteWriteChannel2 = this.writeChannel;
                            byteChannelScanner$advanceToNextPotentialMatch$1.label = 3;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                }
                ResultKt.throwOnFailure(obj);
                if (this.input.exhausted()) {
                    ByteReadChannel byteReadChannel = this.channel;
                    byteChannelScanner$advanceToNextPotentialMatch$1.label = 1;
                    obj = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$advanceToNextPotentialMatch$1, 1, null);
                }
                indexOf$default = SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
                if (indexOf$default == -1) {
                }
                return coroutine_suspended;
            }
        }
        byteChannelScanner$advanceToNextPotentialMatch$1 = new ByteChannelScanner$advanceToNextPotentialMatch$1(this, continuation);
        Object obj2 = byteChannelScanner$advanceToNextPotentialMatch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$advanceToNextPotentialMatch$1.label;
        if (i != 0) {
        }
        ResultKt.throwOnFailure(obj2);
        if (this.input.exhausted()) {
        }
        indexOf$default = SourcesKt.indexOf$default(this.input, this.matchString.get(0), 0L, 0L, 6, null);
        if (indexOf$default == -1) {
        }
        return coroutine_suspended2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (io.ktor.utils.io.ByteWriteChannelOperationsKt.writeByte(r12.writeChannel, r13, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004f, code lost:
    
        if (r13 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0044 -> B:21:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x004f -> B:17:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object checkFullMatch(Continuation<? super Boolean> continuation) {
        ByteChannelScanner$checkFullMatch$1 byteChannelScanner$checkFullMatch$1;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (continuation instanceof ByteChannelScanner$checkFullMatch$1) {
            byteChannelScanner$checkFullMatch$1 = (ByteChannelScanner$checkFullMatch$1) continuation;
            if ((byteChannelScanner$checkFullMatch$1.label & Integer.MIN_VALUE) != 0) {
                byteChannelScanner$checkFullMatch$1.label -= Integer.MIN_VALUE;
                Object obj = byteChannelScanner$checkFullMatch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = byteChannelScanner$checkFullMatch$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.input.exhausted()) {
                    }
                    byte readByte = this.input.readByte();
                    i2 = this.matchIndex;
                    if (i2 > 0) {
                    }
                    i3 = this.matchIndex + 1;
                    this.matchIndex = i3;
                    if (i3 == this.matchString.getSize()) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        this.bytesRead++;
                        return Boxing.boxBoolean(false);
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        return Boxing.boxBoolean(false);
                    }
                    byte readByte2 = this.input.readByte();
                    i2 = this.matchIndex;
                    if (i2 > 0 && readByte2 != this.matchString.get(i2)) {
                        int i6 = this.matchIndex;
                        while (true) {
                            i4 = this.matchIndex;
                            if (i4 <= 0 || readByte2 == this.matchString.get(i4)) {
                                break;
                            }
                            this.matchIndex = this.partialMatchTable[this.matchIndex - 1];
                        }
                        long j = i6 - this.matchIndex;
                        checkBounds(j);
                        long j2 = this.bytesRead;
                        Buffer buffer = this.partialMatchBuffer;
                        Sink writeBuffer = this.writeChannel.getWriteBuffer();
                        Intrinsics.checkNotNull(writeBuffer, "null cannot be cast to non-null type kotlinx.io.Buffer");
                        this.bytesRead = j2 + buffer.readAtMostTo((Buffer) writeBuffer, j);
                        i5 = this.matchIndex;
                        if (i5 == 0 && readByte2 != this.matchString.get(i5)) {
                            byteChannelScanner$checkFullMatch$1.label = 2;
                        }
                    }
                    i3 = this.matchIndex + 1;
                    this.matchIndex = i3;
                    if (i3 == this.matchString.getSize()) {
                        return Boxing.boxBoolean(true);
                    }
                    this.partialMatchBuffer.writeByte(readByte2);
                    if (this.input.exhausted()) {
                        ByteReadChannel byteReadChannel = this.channel;
                        byteChannelScanner$checkFullMatch$1.label = 1;
                        obj = ByteReadChannel.DefaultImpls.awaitContent$default(byteReadChannel, 0, byteChannelScanner$checkFullMatch$1, 1, null);
                    }
                    byte readByte22 = this.input.readByte();
                    i2 = this.matchIndex;
                    if (i2 > 0) {
                        int i62 = this.matchIndex;
                        while (true) {
                            i4 = this.matchIndex;
                            if (i4 <= 0) {
                                break;
                            }
                            break;
                            this.matchIndex = this.partialMatchTable[this.matchIndex - 1];
                        }
                        long j3 = i62 - this.matchIndex;
                        checkBounds(j3);
                        long j22 = this.bytesRead;
                        Buffer buffer2 = this.partialMatchBuffer;
                        Sink writeBuffer2 = this.writeChannel.getWriteBuffer();
                        Intrinsics.checkNotNull(writeBuffer2, "null cannot be cast to non-null type kotlinx.io.Buffer");
                        this.bytesRead = j22 + buffer2.readAtMostTo((Buffer) writeBuffer2, j3);
                        i5 = this.matchIndex;
                        if (i5 == 0) {
                            byteChannelScanner$checkFullMatch$1.label = 2;
                        }
                    }
                    i3 = this.matchIndex + 1;
                    this.matchIndex = i3;
                    if (i3 == this.matchString.getSize()) {
                    }
                }
            }
        }
        byteChannelScanner$checkFullMatch$1 = new ByteChannelScanner$checkFullMatch$1(this, continuation);
        Object obj2 = byteChannelScanner$checkFullMatch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = byteChannelScanner$checkFullMatch$1.label;
        if (i != 0) {
        }
    }

    private final void checkBounds(long extra) {
        if (this.bytesRead + extra > this.limit) {
            throw new IOException("Limit of " + this.limit + " bytes exceeded while searching for \"" + toSingleLineString(this.matchString) + '\"');
        }
    }

    private final String toSingleLineString(ByteString byteString) {
        return StringsKt.replace$default(ByteStringKt.decodeToString(byteString), "\n", "\\n", false, 4, (Object) null);
    }
}
