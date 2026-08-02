package kotlinx.io;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.io.internal._Utf8Kt;
import kotlinx.io.unsafe.SegmentReadContext;
import kotlinx.io.unsafe.SegmentWriteContext;
import kotlinx.io.unsafe.UnsafeBufferOperations;
import kotlinx.io.unsafe.UnsafeBufferOperationsKt;

/* compiled from: Utf8.kt */
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0004\u001a&\u0010\n\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a&\u0010\n\u001a\u00020\u0007*\u00020\b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a\n\u0010\u000e\u001a\u00020\u0002*\u00020\u000f\u001a\n\u0010\u000e\u001a\u00020\u0002*\u00020\u0010\u001a\u0012\u0010\u000e\u001a\u00020\u0002*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0001\u001a\n\u0010\u0012\u001a\u00020\u0004*\u00020\u000f\u001a\f\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u000f\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u0001\u001a\f\u0010\u0016\u001a\u00020\u0004*\u00020\u0010H\u0002\u001a1\u0010\u0017\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082\b\u001a\u0014\u0010\u001c\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\t\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u001d\u001a\u00020\u0002*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0001H\u0002¨\u0006\u001e"}, d2 = {"utf8Size", "", "", "startIndex", "", "endIndex", "writeCodePointValue", "", "Lkotlinx/io/Sink;", "codePoint", "writeString", "string", "chars", "", "readString", "Lkotlinx/io/Source;", "Lkotlinx/io/Buffer;", "byteCount", "readCodePointValue", "readLine", "readLineStrict", "limit", "commonReadUtf8CodePoint", "commonWriteUtf8", "beginIndex", "charAt", "Lkotlin/Function1;", "", "commonWriteUtf8CodePoint", "commonReadUtf8", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Utf8Kt {
    public static /* synthetic */ long utf8Size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return utf8Size(str, i, i2);
    }

    public static final long utf8Size(String str, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(str, "<this>");
        _UtilKt.checkBounds(str.length(), i, i2);
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += i3;
            }
            i++;
        }
        return j;
    }

    public static /* synthetic */ void writeString$default(Sink sink, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        writeString(sink, str, i, i2);
    }

    public static final void writeString(Sink sink, String string, int i, int i2) {
        SegmentWriteContext segmentWriteContext;
        int i3;
        SegmentWriteContext segmentWriteContext2;
        SegmentWriteContext segmentWriteContext3;
        SegmentWriteContext segmentWriteContext4;
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        int i4 = i;
        _UtilKt.checkBounds(string.length(), i4, i2);
        Buffer bufferField = sink.getBufferField();
        while (i4 < i2) {
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = Character.valueOf(string.charAt(i4)).charValue();
            if (intRef.element < 128) {
                UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                Segment writableSegment = bufferField.writableSegment(1);
                segmentWriteContext = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                int i5 = -i4;
                int min = Math.min(i2, writableSegment.getRemainingCapacity() + i4);
                int i6 = i4 + 1;
                segmentWriteContext.setUnchecked(writableSegment, i4 + i5, (byte) intRef.element);
                while (true) {
                    i4 = i6;
                    if (i4 >= min) {
                        break;
                    }
                    intRef.element = Character.valueOf(string.charAt(i4)).charValue();
                    if (intRef.element >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    segmentWriteContext.setUnchecked(writableSegment, i4 + i5, (byte) intRef.element);
                }
                int i7 = i5 + i4;
                if (i7 == 1) {
                    writableSegment.setLimit(writableSegment.getLimit() + i7);
                    bufferField.setSizeMut(bufferField.getSizeMut() + i7);
                } else {
                    if (i7 < 0 || i7 > writableSegment.getRemainingCapacity()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i7 + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                    }
                    if (i7 != 0) {
                        writableSegment.setLimit(writableSegment.getLimit() + i7);
                        bufferField.setSizeMut(bufferField.getSizeMut() + i7);
                    } else if (SegmentKt.isEmpty(writableSegment)) {
                        bufferField.recycleTail();
                    }
                }
            } else {
                if (intRef.element < 2048) {
                    UnsafeBufferOperations unsafeBufferOperations2 = UnsafeBufferOperations.INSTANCE;
                    i3 = 2;
                    Segment writableSegment2 = bufferField.writableSegment(2);
                    segmentWriteContext2 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext2.setUnchecked(writableSegment2, 0, (byte) ((intRef.element >> 6) | PsExtractor.AUDIO_STREAM), (byte) ((intRef.element & 63) | 128));
                    writableSegment2.setLimit(writableSegment2.getLimit() + 2);
                } else if (intRef.element < 55296 || intRef.element > 57343) {
                    UnsafeBufferOperations unsafeBufferOperations3 = UnsafeBufferOperations.INSTANCE;
                    i3 = 3;
                    Segment writableSegment3 = bufferField.writableSegment(3);
                    segmentWriteContext3 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext3.setUnchecked(writableSegment3, 0, (byte) ((intRef.element >> 12) | 224), (byte) (((intRef.element >> 6) & 63) | 128), (byte) ((intRef.element & 63) | 128));
                    writableSegment3.setLimit(writableSegment3.getLimit() + 3);
                } else {
                    int i8 = i4 + 1;
                    char charAt = i8 < i2 ? string.charAt(i8) : (char) 0;
                    if (intRef.element > 56319 || 56320 > charAt || charAt >= 57344) {
                        bufferField.writeByte((byte) 63);
                        i4 = i8;
                    } else {
                        int i9 = (((intRef.element & 1023) << 10) | (charAt & 1023)) + 65536;
                        UnsafeBufferOperations unsafeBufferOperations4 = UnsafeBufferOperations.INSTANCE;
                        Segment writableSegment4 = bufferField.writableSegment(4);
                        segmentWriteContext4 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                        segmentWriteContext4.setUnchecked(writableSegment4, 0, (byte) ((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK), (byte) (((i9 >> 12) & 63) | 128), (byte) (((i9 >> 6) & 63) | 128), (byte) ((i9 & 63) | 128));
                        writableSegment4.setLimit(writableSegment4.getLimit() + 4);
                        bufferField.setSizeMut(bufferField.getSizeMut() + 4);
                        i4 += 2;
                    }
                }
                bufferField.setSizeMut(bufferField.getSizeMut() + i3);
                i4++;
            }
        }
        sink.hintEmit();
    }

    public static /* synthetic */ void writeString$default(Sink sink, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        writeString(sink, charSequence, i, i2);
    }

    public static final void writeString(Sink sink, CharSequence chars, int i, int i2) {
        SegmentWriteContext segmentWriteContext;
        int i3;
        SegmentWriteContext segmentWriteContext2;
        SegmentWriteContext segmentWriteContext3;
        SegmentWriteContext segmentWriteContext4;
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(chars, "chars");
        int i4 = i;
        _UtilKt.checkBounds(chars.length(), i4, i2);
        Buffer bufferField = sink.getBufferField();
        while (i4 < i2) {
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = Character.valueOf(chars.charAt(i4)).charValue();
            if (intRef.element < 128) {
                UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                Segment writableSegment = bufferField.writableSegment(1);
                segmentWriteContext = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                int i5 = -i4;
                int min = Math.min(i2, writableSegment.getRemainingCapacity() + i4);
                int i6 = i4 + 1;
                segmentWriteContext.setUnchecked(writableSegment, i4 + i5, (byte) intRef.element);
                while (true) {
                    i4 = i6;
                    if (i4 >= min) {
                        break;
                    }
                    intRef.element = Character.valueOf(chars.charAt(i4)).charValue();
                    if (intRef.element >= 128) {
                        break;
                    }
                    i6 = i4 + 1;
                    segmentWriteContext.setUnchecked(writableSegment, i4 + i5, (byte) intRef.element);
                }
                int i7 = i5 + i4;
                if (i7 == 1) {
                    writableSegment.setLimit(writableSegment.getLimit() + i7);
                    bufferField.setSizeMut(bufferField.getSizeMut() + i7);
                } else {
                    if (i7 < 0 || i7 > writableSegment.getRemainingCapacity()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i7 + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                    }
                    if (i7 != 0) {
                        writableSegment.setLimit(writableSegment.getLimit() + i7);
                        bufferField.setSizeMut(bufferField.getSizeMut() + i7);
                    } else if (SegmentKt.isEmpty(writableSegment)) {
                        bufferField.recycleTail();
                    }
                }
            } else {
                if (intRef.element < 2048) {
                    UnsafeBufferOperations unsafeBufferOperations2 = UnsafeBufferOperations.INSTANCE;
                    i3 = 2;
                    Segment writableSegment2 = bufferField.writableSegment(2);
                    segmentWriteContext2 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext2.setUnchecked(writableSegment2, 0, (byte) ((intRef.element >> 6) | PsExtractor.AUDIO_STREAM), (byte) ((intRef.element & 63) | 128));
                    writableSegment2.setLimit(writableSegment2.getLimit() + 2);
                } else if (intRef.element < 55296 || intRef.element > 57343) {
                    UnsafeBufferOperations unsafeBufferOperations3 = UnsafeBufferOperations.INSTANCE;
                    i3 = 3;
                    Segment writableSegment3 = bufferField.writableSegment(3);
                    segmentWriteContext3 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext3.setUnchecked(writableSegment3, 0, (byte) ((intRef.element >> 12) | 224), (byte) (((intRef.element >> 6) & 63) | 128), (byte) ((intRef.element & 63) | 128));
                    writableSegment3.setLimit(writableSegment3.getLimit() + 3);
                } else {
                    int i8 = i4 + 1;
                    char charAt = i8 < i2 ? chars.charAt(i8) : (char) 0;
                    if (intRef.element > 56319 || 56320 > charAt || charAt >= 57344) {
                        bufferField.writeByte((byte) 63);
                        i4 = i8;
                    } else {
                        int i9 = (((intRef.element & 1023) << 10) | (charAt & 1023)) + 65536;
                        UnsafeBufferOperations unsafeBufferOperations4 = UnsafeBufferOperations.INSTANCE;
                        Segment writableSegment4 = bufferField.writableSegment(4);
                        segmentWriteContext4 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                        segmentWriteContext4.setUnchecked(writableSegment4, 0, (byte) ((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK), (byte) (((i9 >> 12) & 63) | 128), (byte) (((i9 >> 6) & 63) | 128), (byte) ((i9 & 63) | 128));
                        writableSegment4.setLimit(writableSegment4.getLimit() + 4);
                        bufferField.setSizeMut(bufferField.getSizeMut() + 4);
                        i4 += 2;
                    }
                }
                bufferField.setSizeMut(bufferField.getSizeMut() + i3);
                i4++;
            }
        }
        sink.hintEmit();
    }

    public static final String readString(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.request(Long.MAX_VALUE);
        return commonReadUtf8(source.getBufferField(), source.getBufferField().getSizeMut());
    }

    public static final String readString(Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return commonReadUtf8(buffer, buffer.getSizeMut());
    }

    public static final String readString(Source source, long j) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.require(j);
        return commonReadUtf8(source.getBufferField(), j);
    }

    public static final int readCodePointValue(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        if (source instanceof Buffer) {
            return commonReadUtf8CodePoint((Buffer) source);
        }
        source.require(1L);
        byte b = source.getBufferField().get(0L);
        if ((b & 224) == 192) {
            source.require(2L);
        } else if ((b & 240) == 224) {
            source.require(3L);
        } else if ((b & 248) == 240) {
            source.require(4L);
        }
        return commonReadUtf8CodePoint(source.getBufferField());
    }

    public static final String readLine(Source source) {
        int i;
        Intrinsics.checkNotNullParameter(source, "<this>");
        if (!source.request(1L)) {
            return null;
        }
        long indexOf$default = SourcesKt.indexOf$default(source, (byte) 10, 0L, 0L, 6, null);
        if (indexOf$default == -1) {
            return readString(source);
        }
        if (indexOf$default == 0) {
            source.skip(1L);
            return "";
        }
        long j = indexOf$default - 1;
        if (source.getBufferField().get(j) == 13) {
            i = 2;
            indexOf$default = j;
        } else {
            i = 1;
        }
        String readString = readString(source, indexOf$default);
        source.skip(i);
        return readString;
    }

    public static /* synthetic */ String readLineStrict$default(Source source, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return readLineStrict(source, j);
    }

    public static final String readLineStrict(Source source, long j) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit (" + j + ") < 0").toString());
        }
        long j2 = 1;
        source.require(1L);
        long indexOf = SourcesKt.indexOf(source, (byte) 10, 0L, j);
        if (indexOf == 0) {
            source.skip(1L);
            return "";
        }
        if (indexOf > 0) {
            long j3 = indexOf - 1;
            if (source.getBufferField().get(j3) == 13) {
                j2 = 2;
                indexOf = j3;
            }
            String readString = readString(source, indexOf);
            source.skip(j2);
            return readString;
        }
        if (source.getBufferField().getSizeMut() < j) {
            throw new EOFException();
        }
        if (j == Long.MAX_VALUE) {
            throw new EOFException();
        }
        long j4 = j + 1;
        if (!source.request(j4)) {
            throw new EOFException();
        }
        byte b = source.getBufferField().get(j);
        if (b == 10) {
            String readString2 = readString(source, j);
            source.skip(1L);
            return readString2;
        }
        if (b != 13 || !source.request(2 + j)) {
            throw new EOFException();
        }
        if (source.getBufferField().get(j4) != 10) {
            throw new EOFException();
        }
        String readString3 = readString(source, j);
        source.skip(2L);
        return readString3;
    }

    private static final int commonReadUtf8CodePoint(Buffer buffer) {
        int i;
        int i2;
        int i3;
        buffer.require(1L);
        byte b = buffer.get(0L);
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & Ascii.US;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & Ascii.SI;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return 65533;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.getSizeMut() < j) {
            throw new EOFException("size < " + i2 + ": " + buffer.getSizeMut() + " (to read code point prefixed 0x" + _UtilKt.toHexString(b) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = buffer.get(j2);
            if ((b2 & 192) != 128) {
                buffer.skip(j2);
                return 65533;
            }
            i = (i << 6) | (b2 & 63);
        }
        buffer.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    private static final void commonWriteUtf8(Buffer buffer, int i, int i2, Function1<? super Integer, Character> function1) {
        SegmentWriteContext segmentWriteContext;
        char charValue;
        SegmentWriteContext segmentWriteContext2;
        SegmentWriteContext segmentWriteContext3;
        SegmentWriteContext segmentWriteContext4;
        while (i < i2) {
            char charValue2 = function1.invoke(Integer.valueOf(i)).charValue();
            if (charValue2 < 128) {
                UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                Segment writableSegment = buffer.writableSegment(1);
                segmentWriteContext = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                int i3 = -i;
                int min = Math.min(i2, writableSegment.getRemainingCapacity() + i);
                int i4 = i + 1;
                segmentWriteContext.setUnchecked(writableSegment, i + i3, (byte) charValue2);
                while (true) {
                    i = i4;
                    if (i >= min || (charValue = function1.invoke(Integer.valueOf(i)).charValue()) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    segmentWriteContext.setUnchecked(writableSegment, i + i3, (byte) charValue);
                }
                int i5 = i3 + i;
                if (i5 == 1) {
                    writableSegment.setLimit(writableSegment.getLimit() + i5);
                    buffer.setSizeMut(buffer.getSizeMut() + i5);
                } else {
                    if (i5 < 0 || i5 > writableSegment.getRemainingCapacity()) {
                        throw new IllegalStateException(("Invalid number of bytes written: " + i5 + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                    }
                    if (i5 != 0) {
                        writableSegment.setLimit(writableSegment.getLimit() + i5);
                        buffer.setSizeMut(buffer.getSizeMut() + i5);
                    } else if (SegmentKt.isEmpty(writableSegment)) {
                        buffer.recycleTail();
                    }
                }
            } else {
                if (charValue2 < 2048) {
                    UnsafeBufferOperations unsafeBufferOperations2 = UnsafeBufferOperations.INSTANCE;
                    Segment writableSegment2 = buffer.writableSegment(2);
                    segmentWriteContext2 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext2.setUnchecked(writableSegment2, 0, (byte) ((charValue2 >> 6) | PsExtractor.AUDIO_STREAM), (byte) ((charValue2 & '?') | 128));
                    writableSegment2.setLimit(writableSegment2.getLimit() + 2);
                    buffer.setSizeMut(buffer.getSizeMut() + 2);
                } else if (charValue2 < 55296 || charValue2 > 57343) {
                    UnsafeBufferOperations unsafeBufferOperations3 = UnsafeBufferOperations.INSTANCE;
                    Segment writableSegment3 = buffer.writableSegment(3);
                    segmentWriteContext3 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                    segmentWriteContext3.setUnchecked(writableSegment3, 0, (byte) ((charValue2 >> '\f') | 224), (byte) (((charValue2 >> 6) & 63) | 128), (byte) ((charValue2 & '?') | 128));
                    writableSegment3.setLimit(writableSegment3.getLimit() + 3);
                    buffer.setSizeMut(buffer.getSizeMut() + 3);
                } else {
                    int i6 = i + 1;
                    char charValue3 = i6 < i2 ? function1.invoke(Integer.valueOf(i6)).charValue() : (char) 0;
                    if (charValue2 > 56319 || 56320 > charValue3 || charValue3 >= 57344) {
                        buffer.writeByte((byte) 63);
                        i = i6;
                    } else {
                        int i7 = (((charValue2 & 1023) << 10) | (charValue3 & 1023)) + 65536;
                        UnsafeBufferOperations unsafeBufferOperations4 = UnsafeBufferOperations.INSTANCE;
                        Segment writableSegment4 = buffer.writableSegment(4);
                        segmentWriteContext4 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
                        segmentWriteContext4.setUnchecked(writableSegment4, 0, (byte) ((i7 >> 18) | PsExtractor.VIDEO_STREAM_MASK), (byte) (((i7 >> 12) & 63) | 128), (byte) (((i7 >> 6) & 63) | 128), (byte) ((i7 & 63) | 128));
                        writableSegment4.setLimit(writableSegment4.getLimit() + 4);
                        buffer.setSizeMut(buffer.getSizeMut() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    private static final void commonWriteUtf8CodePoint(Buffer buffer, int i) {
        SegmentWriteContext segmentWriteContext;
        SegmentWriteContext segmentWriteContext2;
        SegmentWriteContext segmentWriteContext3;
        if (i < 0 || i > 1114111) {
            throw new IllegalArgumentException("Code point value is out of Unicode codespace 0..0x10ffff: 0x" + _UtilKt.toHexString(i) + " (" + i + ')');
        }
        if (i < 128) {
            buffer.writeByte((byte) i);
            return;
        }
        if (i < 2048) {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Segment writableSegment = buffer.writableSegment(2);
            segmentWriteContext3 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
            segmentWriteContext3.setUnchecked(writableSegment, 0, (byte) ((i >> 6) | PsExtractor.AUDIO_STREAM));
            segmentWriteContext3.setUnchecked(writableSegment, 1, (byte) ((i & 63) | 128));
            writableSegment.setLimit(writableSegment.getLimit() + 2);
            buffer.setSizeMut(buffer.getSizeMut() + 2);
            return;
        }
        if (55296 <= i && i < 57344) {
            buffer.writeByte((byte) 63);
            return;
        }
        if (i < 65536) {
            UnsafeBufferOperations unsafeBufferOperations2 = UnsafeBufferOperations.INSTANCE;
            Segment writableSegment2 = buffer.writableSegment(3);
            segmentWriteContext2 = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
            segmentWriteContext2.setUnchecked(writableSegment2, 0, (byte) ((i >> 12) | 224));
            segmentWriteContext2.setUnchecked(writableSegment2, 1, (byte) (((i >> 6) & 63) | 128));
            segmentWriteContext2.setUnchecked(writableSegment2, 2, (byte) ((i & 63) | 128));
            writableSegment2.setLimit(writableSegment2.getLimit() + 3);
            buffer.setSizeMut(buffer.getSizeMut() + 3);
            return;
        }
        UnsafeBufferOperations unsafeBufferOperations3 = UnsafeBufferOperations.INSTANCE;
        Segment writableSegment3 = buffer.writableSegment(4);
        segmentWriteContext = UnsafeBufferOperationsKt.SegmentWriteContextImpl;
        segmentWriteContext.setUnchecked(writableSegment3, 0, (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK));
        segmentWriteContext.setUnchecked(writableSegment3, 1, (byte) (((i >> 12) & 63) | 128));
        segmentWriteContext.setUnchecked(writableSegment3, 2, (byte) (((i >> 6) & 63) | 128));
        segmentWriteContext.setUnchecked(writableSegment3, 3, (byte) ((i & 63) | 128));
        writableSegment3.setLimit(writableSegment3.getLimit() + 4);
        buffer.setSizeMut(buffer.getSizeMut() + 4);
    }

    private static final String commonReadUtf8(Buffer buffer, long j) {
        SegmentReadContext unused;
        if (j == 0) {
            return "";
        }
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Segment head = buffer.getHead();
        if (head != null) {
            unused = UnsafeBufferOperationsKt.SegmentReadContextImpl;
            if (head.getSize() < j) {
                return _Utf8Kt.commonToUtf8String$default(SourcesKt.readByteArray(buffer, (int) j), 0, 0, 3, null);
            }
            byte[] dataAsByteArray = head.dataAsByteArray(true);
            int pos = head.getPos();
            String commonToUtf8String = _Utf8Kt.commonToUtf8String(dataAsByteArray, pos, Math.min(head.getLimit(), ((int) j) + pos));
            buffer.skip(j);
            return commonToUtf8String;
        }
        throw new IllegalStateException("Unreacheable".toString());
    }

    public static final void writeCodePointValue(Sink sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        commonWriteUtf8CodePoint(sink.getBufferField(), i);
        sink.hintEmit();
    }
}
