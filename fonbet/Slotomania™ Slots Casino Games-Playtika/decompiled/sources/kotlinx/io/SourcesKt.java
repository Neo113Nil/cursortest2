package kotlinx.io;

import io.sentry.profilemeasurements.ProfileMeasurement;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sources.kt */
@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\t\u001a\u00020\u0006*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u0006*\u00020\u0002\u001a&\u0010\u000b\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u001a\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0004\u001a\u0014\u0010\u0013\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0002\u001a&\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u001a\u000f\u0010\u0018\u001a\u00020\u0019*\u00020\u0002¢\u0006\u0002\u0010\u001a\u001a\u000f\u0010\u001b\u001a\u00020\u001c*\u00020\u0002¢\u0006\u0002\u0010\u001d\u001a\u000f\u0010\u001e\u001a\u00020\u001f*\u00020\u0002¢\u0006\u0002\u0010 \u001a\u000f\u0010!\u001a\u00020\"*\u00020\u0002¢\u0006\u0002\u0010#\u001a\u000f\u0010$\u001a\u00020\u001c*\u00020\u0002¢\u0006\u0002\u0010\u001d\u001a\u000f\u0010%\u001a\u00020\u001f*\u00020\u0002¢\u0006\u0002\u0010 \u001a\u000f\u0010&\u001a\u00020\"*\u00020\u0002¢\u0006\u0002\u0010#\u001a\n\u0010'\u001a\u00020(*\u00020\u0002\u001a\n\u0010)\u001a\u00020**\u00020\u0002\u001a\n\u0010+\u001a\u00020(*\u00020\u0002\u001a\n\u0010,\u001a\u00020**\u00020\u0002\u001a\u0012\u0010-\u001a\u00020.*\u00020\u00022\u0006\u0010\f\u001a\u00020\r\"\u000e\u0010\u0007\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"readShortLe", "", "Lkotlinx/io/Source;", "readIntLe", "", "readLongLe", "", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "readDecimalLong", "readHexadecimalUnsignedLong", "indexOf", ProfileMeasurement.UNIT_BYTES, "", "startIndex", "endIndex", "readByteArray", "", "byteCount", "readByteArrayImpl", "size", "readTo", "", "sink", "readUByte", "Lkotlin/UByte;", "(Lkotlinx/io/Source;)B", "readUShort", "Lkotlin/UShort;", "(Lkotlinx/io/Source;)S", "readUInt", "Lkotlin/UInt;", "(Lkotlinx/io/Source;)I", "readULong", "Lkotlin/ULong;", "(Lkotlinx/io/Source;)J", "readUShortLe", "readUIntLe", "readULongLe", "readFloat", "", "readDouble", "", "readFloatLe", "readDoubleLe", "startsWith", "", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SourcesKt {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;

    public static final short readShortLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return _UtilsJvmKt.reverseBytes(source.readShort());
    }

    public static final int readIntLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return _UtilsJvmKt.reverseBytes(source.readInt());
    }

    public static final long readLongLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return _UtilsJvmKt.reverseBytes(source.readLong());
    }

    public static final long readDecimalLong(Source source) {
        long j;
        long j2;
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.require(1L);
        byte b = source.getBufferField().get(0L);
        byte b2 = 58;
        byte b3 = 48;
        if (b == 45) {
            source.require(2L);
            byte b4 = source.getBufferField().get(1L);
            if (48 > b4 || b4 >= 58) {
                throw new NumberFormatException("Expected a digit but was 0x" + _UtilKt.toHexString(source.getBufferField().get(1L)));
            }
            j2 = -8;
            z = true;
            j = 0;
        } else {
            if (48 > b || b >= 58) {
                throw new NumberFormatException("Expected a digit or '-' but was 0x" + _UtilKt.toHexString(b));
            }
            j = 48 - b;
            j2 = -7;
            z = false;
        }
        long j3 = 1;
        while (source.request(j3 + 1)) {
            Buffer bufferField = source.getBufferField();
            if (bufferField.getHead() == null) {
                Segment segment = null;
                Intrinsics.checkNotNull(null);
                segment.getSize();
                throw null;
            }
            if (bufferField.getSizeMut() - j3 < j3) {
                Segment tail = bufferField.getTail();
                long sizeMut = bufferField.getSizeMut();
                while (tail != null && sizeMut > j3) {
                    sizeMut -= tail.getLimit() - tail.getPos();
                    if (sizeMut <= j3) {
                        break;
                    }
                    tail = tail.getPrev();
                }
                Intrinsics.checkNotNull(tail);
                int i = (int) (j3 - sizeMut);
                int size = tail.getSize();
                while (i < size) {
                    byte unchecked$kotlinx_io_core = tail.getUnchecked$kotlinx_io_core(i);
                    if (b3 <= unchecked$kotlinx_io_core && unchecked$kotlinx_io_core < b2) {
                        int i2 = 48 - unchecked$kotlinx_io_core;
                        if (j < -922337203685477580L || (j == -922337203685477580L && i2 < j2)) {
                            Buffer buffer = new Buffer();
                            SinksKt.writeDecimalLong(buffer, j);
                            buffer.writeByte(unchecked$kotlinx_io_core);
                            if (!z) {
                                buffer.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + Utf8Kt.readString(buffer));
                        }
                        j = (j * 10) + i2;
                        i++;
                        j3++;
                        b3 = 48;
                    }
                    z2 = true;
                    break;
                }
                z2 = false;
            } else {
                Segment head = bufferField.getHead();
                long j4 = 0;
                while (head != null) {
                    long limit = (head.getLimit() - head.getPos()) + j4;
                    if (limit > j3) {
                        break;
                    }
                    head = head.getNext();
                    j4 = limit;
                }
                Intrinsics.checkNotNull(head);
                int i3 = (int) (j3 - j4);
                int size2 = head.getSize();
                while (i3 < size2) {
                    byte unchecked$kotlinx_io_core2 = head.getUnchecked$kotlinx_io_core(i3);
                    if (48 <= unchecked$kotlinx_io_core2 && unchecked$kotlinx_io_core2 < b2) {
                        int i4 = 48 - unchecked$kotlinx_io_core2;
                        if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                            Buffer buffer2 = new Buffer();
                            SinksKt.writeDecimalLong(buffer2, j);
                            buffer2.writeByte(unchecked$kotlinx_io_core2);
                            if (!z) {
                                buffer2.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + Utf8Kt.readString(buffer2));
                        }
                        j = (j * 10) + i4;
                        i3++;
                        j3++;
                        b2 = 58;
                    }
                    z2 = true;
                    break;
                }
                z2 = false;
            }
            if (z2) {
                break;
            }
            b2 = 58;
            b3 = 48;
        }
        source.skip(j3);
        return z ? j : -j;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0145 A[LOOP:4: B:61:0x0117->B:69:0x0145, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long readHexadecimalUnsignedLong(Source source) {
        int i;
        long j;
        byte b;
        byte b2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(source, "<this>");
        source.require(1L);
        long j2 = 0;
        byte b3 = source.getBufferField().get(0L);
        byte b4 = 71;
        byte b5 = 65;
        byte b6 = 103;
        if (48 <= b3 && b3 < 58) {
            i = b3 - 48;
        } else if (97 <= b3 && b3 < 103) {
            i = b3 - 87;
        } else {
            if (65 > b3 || b3 >= 71) {
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + _UtilKt.toHexString(b3));
            }
            i = b3 - 55;
        }
        long j3 = i;
        long j4 = 1;
        while (source.request(j4 + 1)) {
            Buffer bufferField = source.getBufferField();
            if (bufferField.getHead() == null) {
                Segment segment = null;
                Intrinsics.checkNotNull(null);
                segment.getSize();
                throw null;
            }
            boolean z = false;
            if (bufferField.getSizeMut() - j4 < j4) {
                Segment tail = bufferField.getTail();
                long sizeMut = bufferField.getSizeMut();
                while (tail != null && sizeMut > j4) {
                    j = j2;
                    sizeMut -= tail.getLimit() - tail.getPos();
                    if (sizeMut <= j4) {
                        break;
                    }
                    tail = tail.getPrev();
                    j2 = j;
                }
                j = j2;
                Intrinsics.checkNotNull(tail);
                int i4 = (int) (j4 - sizeMut);
                int size = tail.getSize();
                while (i4 < size) {
                    byte unchecked$kotlinx_io_core = tail.getUnchecked$kotlinx_io_core(i4);
                    if (48 <= unchecked$kotlinx_io_core && unchecked$kotlinx_io_core < 58) {
                        i3 = unchecked$kotlinx_io_core - 48;
                    } else if (97 <= unchecked$kotlinx_io_core && unchecked$kotlinx_io_core < b6) {
                        i3 = unchecked$kotlinx_io_core - 87;
                    } else {
                        if (b5 > unchecked$kotlinx_io_core || unchecked$kotlinx_io_core >= b4) {
                            z = true;
                            break;
                        }
                        i3 = unchecked$kotlinx_io_core - 55;
                    }
                    int i5 = i3;
                    if ((j3 & (-1152921504606846976L)) != j) {
                        Buffer buffer = new Buffer();
                        SinksKt.writeHexadecimalUnsignedLong(buffer, j3);
                        buffer.writeByte(unchecked$kotlinx_io_core);
                        throw new NumberFormatException("Number too large: " + Utf8Kt.readString(buffer));
                    }
                    j3 = (j3 << 4) + i5;
                    j4++;
                    i4++;
                    b4 = 71;
                }
                b = b6;
            } else {
                j = j2;
                Segment head = bufferField.getHead();
                while (head != null) {
                    long limit = (head.getLimit() - head.getPos()) + j2;
                    if (limit > j4) {
                        break;
                    }
                    head = head.getNext();
                    j2 = limit;
                }
                Intrinsics.checkNotNull(head);
                int size2 = head.getSize();
                for (int i6 = (int) (j4 - j2); i6 < size2; i6++) {
                    byte unchecked$kotlinx_io_core2 = head.getUnchecked$kotlinx_io_core(i6);
                    if (48 > unchecked$kotlinx_io_core2 || unchecked$kotlinx_io_core2 >= 58) {
                        b = 103;
                        if (97 > unchecked$kotlinx_io_core2 || unchecked$kotlinx_io_core2 >= 103) {
                            b2 = 71;
                            if (65 > unchecked$kotlinx_io_core2 || unchecked$kotlinx_io_core2 >= 71) {
                                z = true;
                                break;
                            }
                            i2 = unchecked$kotlinx_io_core2 - 55;
                            if ((j3 & (-1152921504606846976L)) == j) {
                                Buffer buffer2 = new Buffer();
                                SinksKt.writeHexadecimalUnsignedLong(buffer2, j3);
                                buffer2.writeByte(unchecked$kotlinx_io_core2);
                                throw new NumberFormatException("Number too large: " + Utf8Kt.readString(buffer2));
                            }
                            j3 = (j3 << 4) + i2;
                            j4++;
                        } else {
                            i2 = unchecked$kotlinx_io_core2 - 87;
                        }
                    } else {
                        i2 = unchecked$kotlinx_io_core2 - 48;
                    }
                    if ((j3 & (-1152921504606846976L)) == j) {
                    }
                }
                b = 103;
            }
            b2 = 71;
            if (z) {
                break;
            }
            b4 = b2;
            j2 = j;
            b6 = b;
            b5 = 65;
        }
        source.skip(j4);
        return j3;
    }

    public static /* synthetic */ long indexOf$default(Source source, byte b, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = Long.MAX_VALUE;
        }
        return indexOf(source, b, j3, j2);
    }

    public static final long indexOf(Source source, byte b, long j, long j2) {
        String str;
        Intrinsics.checkNotNullParameter(source, "<this>");
        if (0 > j || j > j2) {
            if (j2 < 0) {
                str = "startIndex (" + j + ") and endIndex (" + j2 + ") should be non negative";
            } else {
                str = "startIndex (" + j + ") is not within the range [0..endIndex(" + j2 + "))";
            }
            throw new IllegalArgumentException(str.toString());
        }
        if (j == j2) {
            return -1L;
        }
        long j3 = j;
        while (j3 < j2 && source.request(1 + j3)) {
            byte b2 = b;
            long indexOf = BuffersKt.indexOf(source.getBufferField(), b2, j3, Math.min(j2, source.getBufferField().getSizeMut()));
            if (indexOf != -1) {
                return indexOf;
            }
            j3 = source.getBufferField().getSizeMut();
            b = b2;
        }
        return -1L;
    }

    public static final byte[] readByteArray(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return readByteArrayImpl(source, -1);
    }

    public static final byte[] readByteArray(Source source, int i) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        long j = i;
        if (j >= 0) {
            return readByteArrayImpl(source, i);
        }
        throw new IllegalArgumentException(("byteCount (" + j + ") < 0").toString());
    }

    private static final byte[] readByteArrayImpl(Source source, int i) {
        if (i == -1) {
            for (long j = 2147483647L; source.getBufferField().getSizeMut() < 2147483647L && source.request(j); j *= 2) {
            }
            if (source.getBufferField().getSizeMut() >= 2147483647L) {
                throw new IllegalStateException(("Can't create an array of size " + source.getBufferField().getSizeMut()).toString());
            }
            i = (int) source.getBufferField().getSizeMut();
        } else {
            source.require(i);
        }
        byte[] bArr = new byte[i];
        readTo$default(source.getBufferField(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static /* synthetic */ void readTo$default(Source source, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        readTo(source, bArr, i, i2);
    }

    public static final void readTo(Source source, byte[] sink, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        _UtilKt.checkBounds(sink.length, i, i2);
        int i3 = i;
        while (i3 < i2) {
            int readAtMostTo = source.readAtMostTo(sink, i3, i2);
            if (readAtMostTo == -1) {
                throw new EOFException("Source exhausted before reading " + (i2 - i) + " bytes. Only " + readAtMostTo + " bytes were read.");
            }
            i3 += readAtMostTo;
        }
    }

    public static final byte readUByte(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UByte.m11198constructorimpl(source.readByte());
    }

    public static final short readUShort(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UShort.m11463constructorimpl(source.readShort());
    }

    public static final int readUInt(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UInt.m11277constructorimpl(source.readInt());
    }

    public static final long readULong(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return ULong.m11356constructorimpl(source.readLong());
    }

    public static final short readUShortLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UShort.m11463constructorimpl(readShortLe(source));
    }

    public static final int readUIntLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UInt.m11277constructorimpl(readIntLe(source));
    }

    public static final long readULongLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return ULong.m11356constructorimpl(readLongLe(source));
    }

    public static final float readFloat(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(source.readInt());
    }

    public static final double readDouble(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(source.readLong());
    }

    public static final float readFloatLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
        return Float.intBitsToFloat(readIntLe(source));
    }

    public static final double readDoubleLe(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        DoubleCompanionObject doubleCompanionObject = DoubleCompanionObject.INSTANCE;
        return Double.longBitsToDouble(readLongLe(source));
    }

    public static final boolean startsWith(Source source, byte b) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return source.request(1L) && source.getBufferField().get(0L) == b;
    }
}
