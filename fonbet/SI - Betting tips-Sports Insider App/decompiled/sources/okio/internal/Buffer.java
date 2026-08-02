package okio.internal;

import androidx.appcompat.widget.c1;
import d9.e;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.io.EOFException;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C0691SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0016\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a?\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00122\u001a\u0010\u0016\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\u00140\u0017H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\u001e\u0010\u0019\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u0007H\u0000\u001a%\u0010\u001d\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\r\u0010!\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010\"\u001a\u00020#*\u00020\u0010H\u0080\b\u001a\r\u0010$\u001a\u00020%*\u00020\u0010H\u0080\b\u001a\r\u0010&\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a\r\u0010'\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\u0015\u0010(\u001a\u00020#*\u00020\u00102\u0006\u0010)\u001a\u00020\u0012H\u0080\b\u001a\r\u0010*\u001a\u00020+*\u00020\u0010H\u0080\b\u001a\u0015\u0010,\u001a\u00020+*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a)\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u0010.\u001a\u00020/2\b\b\u0002\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u0010\u00102\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0012H\u0002\u001a\u0015\u00105\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u0015\u00106\u001a\u00020\t*\u00020\u00102\u0006\u00107\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020\u0001H\u0080\b\u001a%\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\r\u00109\u001a\u00020\u0001*\u00020\u0010H\u0080\b\u001a\u0015\u00109\u001a\u00020\u0001*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010:\u001a\u00020\u0005*\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010<\u001a\u00020+*\u00020\u00102\u0006\u0010;\u001a\u00020\u0001H\u0080\b\u001a%\u0010:\u001a\u00020\u0005*\u00020\u00102\u0006\u0010;\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\r\u0010?\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010@\u001a\u00020\u0012*\u00020\u0010H\u0080\b\u001a\r\u0010A\u001a\u00020/*\u00020\u0010H\u0080\b\u001a\u0015\u0010A\u001a\u00020/*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010B\u001a\u00020\u0005*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u001bH\u0080\b\u001a\u001d\u0010<\u001a\u00020+*\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010C\u001a\u00020\u0012*\u00020\u00102\u0006\u0010;\u001a\u00020DH\u0080\b\u001a\u0015\u0010E\u001a\u00020\u000f*\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u000f\u0010F\u001a\u0004\u0018\u00010\u000f*\u00020\u0010H\u0080\b\u001a\u0015\u0010G\u001a\u00020\u000f*\u00020\u00102\u0006\u0010H\u001a\u00020\u0012H\u0080\b\u001a\r\u0010I\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a%\u0010J\u001a\u00020\u0010*\u00020\u00102\u0006\u0010K\u001a\u00020\u000f2\u0006\u0010L\u001a\u00020\u00052\u0006\u0010M\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010N\u001a\u00020\u0010*\u00020\u00102\u0006\u0010O\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010P\u001a\u00020\u0012*\u00020\u00102\u0006\u00108\u001a\u00020QH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0010*\u00020\u00102\u0006\u00108\u001a\u00020Q2\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010R\u001a\u00020\u0010*\u00020\u00102\u0006\u0010S\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010T\u001a\u00020\u0010*\u00020\u00102\u0006\u0010U\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010V\u001a\u00020\u0010*\u00020\u00102\u0006\u0010W\u001a\u00020\u0005H\u0080\b\u001a\u0015\u0010X\u001a\u00020\u0010*\u00020\u00102\u0006\u00101\u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010-\u001a\u00020+*\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a\u001d\u0010:\u001a\u00020\u0012*\u00020\u00102\u0006\u0010;\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0012H\u0080\b\u001a%\u0010Y\u001a\u00020\u0012*\u00020\u00102\u0006\u0010S\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010Z\u001a\u00020\u0012H\u0080\b\u001a:\u0010Y\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u000b\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010Z\u001a\u00020\u00122\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010 \u001a\u00020\u0005H\u0000\u001a\u001d\u0010[\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\\\u001a\u00020/2\u0006\u0010\u0015\u001a\u00020\u0012H\u0080\b\u001a-\u0010]\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020/2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0017\u0010^\u001a\u00020\u0007*\u00020\u00102\b\u0010_\u001a\u0004\u0018\u00010`H\u0080\b\u001a\r\u0010a\u001a\u00020\u0005*\u00020\u0010H\u0080\b\u001a\r\u0010b\u001a\u00020\u0010*\u00020\u0010H\u0080\b\u001a\r\u0010c\u001a\u00020/*\u00020\u0010H\u0080\b\u001a\u0015\u0010c\u001a\u00020/*\u00020\u00102\u0006\u0010 \u001a\u00020\u0005H\u0080\b\u001a\u0014\u0010d\u001a\u00020e*\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0000\u001a\u0014\u0010g\u001a\u00020e*\u00020\u00102\u0006\u0010f\u001a\u00020eH\u0000\u001a\r\u0010h\u001a\u00020\u0005*\u00020eH\u0080\b\u001a\u0015\u0010i\u001a\u00020\u0005*\u00020e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010j\u001a\u00020\u0012*\u00020e2\u0006\u0010k\u001a\u00020\u0012H\u0080\b\u001a\u0015\u0010l\u001a\u00020\u0012*\u00020e2\u0006\u0010m\u001a\u00020\u0005H\u0080\b\u001a\r\u0010n\u001a\u00020+*\u00020eH\u0080\b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0012X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006o"}, d2 = {"HEX_DIGIT_BYTES", "", "getHEX_DIGIT_BYTES", "()[B", "SEGMENTING_THRESHOLD", "", "rangeEquals", "", "segment", "Lokio/Segment;", "segmentPos", "bytes", "bytesOffset", "bytesLimit", "readUtf8Line", "", "Lokio/Buffer;", "newline", "", "seek", "T", "fromIndex", "lambda", "Lkotlin/Function2;", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "selectPrefix", "options", "Lokio/Options;", "selectTruncated", "commonCopyTo", "out", "offset", "byteCount", "commonCompleteSegmentByteCount", "commonReadByte", "", "commonReadShort", "", "commonReadInt", "commonReadLong", "commonGet", "pos", "commonClear", "", "commonSkip", "commonWrite", "byteString", "Lokio/ByteString;", "commonWriteDecimalLong", "v", "countDigitsIn", "DigitCountToLargestValue", "", "commonWriteHexadecimalUnsignedLong", "commonWritableSegment", "minimumCapacity", AdRevenueConstants.SOURCE_KEY, "commonReadByteArray", "commonRead", "sink", "commonReadFully", "OVERFLOW_ZONE", "OVERFLOW_DIGIT_START", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "commonSelect", "commonReadAll", "Lokio/Sink;", "commonReadUtf8", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonReadUtf8CodePoint", "commonWriteUtf8", "string", "beginIndex", "endIndex", "commonWriteUtf8CodePoint", "codePoint", "commonWriteAll", "Lokio/Source;", "commonWriteByte", "b", "commonWriteShort", "s", "commonWriteInt", "i", "commonWriteLong", "commonIndexOf", "toIndex", "commonIndexOfElement", "targetBytes", "commonRangeEquals", "commonEquals", "other", "", "commonHashCode", "commonCopy", "commonSnapshot", "commonReadUnsafe", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadAndWriteUnsafe", "commonNext", "commonSeek", "commonResizeBuffer", "newSize", "commonExpandBuffer", "minByteCount", "commonClose", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1712:1\n110#1,20:1735\n110#1,20:1768\n110#1:1788\n112#1,18:1790\n110#1,20:1808\n73#2:1713\n73#2:1714\n73#2:1715\n73#2:1716\n73#2:1717\n73#2:1718\n73#2:1719\n73#2:1720\n73#2:1721\n73#2:1722\n73#2:1723\n73#2:1724\n82#2:1725\n82#2:1726\n76#2:1727\n76#2:1728\n76#2:1729\n76#2:1730\n76#2:1731\n76#2:1732\n76#2:1733\n76#2:1734\n85#2:1755\n88#2:1757\n73#2:1758\n73#2:1759\n73#2:1760\n73#2:1761\n73#2:1762\n73#2:1763\n73#2:1764\n73#2:1765\n73#2:1766\n73#2:1767\n88#2:1789\n85#2:1828\n1#3:1756\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n413#1:1735,20\n1262#1:1768,20\n1305#1:1788\n1305#1:1790,18\n1341#1:1808,20\n176#1:1713\n200#1:1714\n319#1:1715\n324#1:1716\n347#1:1717\n348#1:1718\n349#1:1719\n350#1:1720\n356#1:1721\n357#1:1722\n358#1:1723\n359#1:1724\n383#1:1725\n384#1:1726\n390#1:1727\n391#1:1728\n392#1:1729\n393#1:1730\n394#1:1731\n395#1:1732\n396#1:1733\n397#1:1734\n425#1:1755\n858#1:1757\n876#1:1758\n878#1:1759\n882#1:1760\n884#1:1761\n888#1:1762\n890#1:1763\n894#1:1764\n896#1:1765\n916#1:1766\n919#1:1767\n1317#1:1789\n1658#1:1828\n*E\n"})
/* renamed from: okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Buffer {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");

    @NotNull
    private static final long[] DigitCountToLargestValue = {-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, LongCompanionObject.MAX_VALUE};

    public static final void commonClear(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    @NotNull
    public static final okio.Buffer commonCopy(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final okio.Buffer commonCopyTo(@NotNull okio.Buffer buffer, @NotNull okio.Buffer out, long j, long j6) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        long j10 = j;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j10, j6);
        if (j6 != 0) {
            out.setSize$okio(out.size() + j6);
            Segment segment = buffer.head;
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i5 = segment.limit;
                int i10 = segment.pos;
                if (j10 < i5 - i10) {
                    break;
                }
                j10 -= i5 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j11 = j6;
            while (j11 > 0) {
                Intrinsics.checkNotNull(segment2);
                Segment sharedCopy = segment2.sharedCopy();
                int i11 = sharedCopy.pos + ((int) j10);
                sharedCopy.pos = i11;
                sharedCopy.limit = Math.min(i11 + ((int) j11), sharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    sharedCopy.prev = sharedCopy;
                    sharedCopy.next = sharedCopy;
                    out.head = sharedCopy;
                } else {
                    Intrinsics.checkNotNull(segment3);
                    Segment segment4 = segment3.prev;
                    Intrinsics.checkNotNull(segment4);
                    segment4.push(sharedCopy);
                }
                j11 -= sharedCopy.limit - sharedCopy.pos;
                segment2 = segment2.next;
                j10 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull okio.Buffer buffer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i5 = segment.pos;
        int i10 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
            long min = Math.min(segment.limit - i5, segment2.limit - i10);
            long j6 = 0;
            while (j6 < min) {
                int i11 = i5 + 1;
                int i12 = i10 + 1;
                if (segment.data[i5] != segment2.data[i10]) {
                    return false;
                }
                j6++;
                i5 = i11;
                i10 = i12;
            }
            if (i5 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i5 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i10 = segment2.pos;
            }
            j += min;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, int i5) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i5 <= 0) {
            throw new IllegalArgumentException(c1.i(i5, "minByteCount <= 0: ").toString());
        }
        if (i5 > 8192) {
            throw new IllegalArgumentException(c1.i(i5, "minByteCount > Segment.SIZE: ").toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment writableSegment$okio = buffer.writableSegment$okio(i5);
        int i10 = 8192 - writableSegment$okio.limit;
        writableSegment$okio.limit = Segment.SIZE;
        long j = i10;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(writableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = writableSegment$okio.data;
        unsafeCursor.start = 8192 - i10;
        unsafeCursor.end = Segment.SIZE;
        return j;
    }

    public static final byte commonGet(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j6 = 0;
        while (true) {
            long j10 = (segment.limit - segment.pos) + j6;
            if (j10 > j) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((segment.pos + j) - j6)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j6 = j10;
        }
    }

    public static final int commonHashCode(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i5 = (i5 * 31) + segment.data[i11];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i5;
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, byte b10, long j, long j6) {
        Segment segment;
        int i5;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long j10 = 0;
        if (0 > j || j > j6) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j6).toString());
        }
        if (j6 > buffer.size()) {
            j6 = buffer.size();
        }
        if (j == j6 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            j10 = buffer.size();
            while (j10 > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                j10 -= segment.limit - segment.pos;
            }
            while (j10 < j6) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j6) - j10);
                i5 = (int) ((segment.pos + j) - j10);
                while (i5 < min) {
                    if (bArr[i5] != b10) {
                        i5++;
                    }
                }
                j10 += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = j10;
            }
            return -1L;
        }
        while (true) {
            long j11 = (segment.limit - segment.pos) + j10;
            if (j11 > j) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = j11;
        }
        while (j10 < j6) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j6) - j10);
            i5 = (int) ((segment.pos + j) - j10);
            while (i5 < min2) {
                if (bArr2[i5] != b10) {
                    i5++;
                }
            }
            j10 += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j = j10;
        }
        return -1L;
        return (i5 - segment.pos) + j10;
    }

    public static /* synthetic */ long commonIndexOf$default(okio.Buffer buffer, ByteString byteString, long j, long j6, int i5, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j6 = LongCompanionObject.MAX_VALUE;
        }
        return commonIndexOf(buffer, byteString, j, j6, (i11 & 8) != 0 ? 0 : i5, (i11 & 16) != 0 ? byteString.size() : i10);
    }

    public static final long commonIndexOfElement(@NotNull okio.Buffer buffer, @NotNull ByteString targetBytes, long j) {
        int i5;
        int i10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j6 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(e.g(j, "fromIndex < 0: ").toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            j6 = buffer.size();
            while (j6 > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                j6 -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (j6 < buffer.size()) {
                    byte[] bArr = segment.data;
                    i5 = (int) ((segment.pos + j) - j6);
                    int i11 = segment.limit;
                    while (i5 < i11) {
                        byte b12 = bArr[i5];
                        if (b12 != b10 && b12 != b11) {
                            i5++;
                        }
                        i10 = segment.pos;
                    }
                    j6 += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j = j6;
                }
            } else {
                byte[] internalArray$okio = targetBytes.internalArray$okio();
                while (j6 < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i5 = (int) ((segment.pos + j) - j6);
                    int i12 = segment.limit;
                    while (i5 < i12) {
                        byte b13 = bArr2[i5];
                        for (byte b14 : internalArray$okio) {
                            if (b13 == b14) {
                                i10 = segment.pos;
                            }
                        }
                        i5++;
                    }
                    j6 += segment.limit - segment.pos;
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j = j6;
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = (segment.limit - segment.pos) + j6;
            if (j10 > j) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j6 = j10;
        }
        if (targetBytes.size() == 2) {
            byte b15 = targetBytes.getByte(0);
            byte b16 = targetBytes.getByte(1);
            while (j6 < buffer.size()) {
                byte[] bArr3 = segment.data;
                i5 = (int) ((segment.pos + j) - j6);
                int i13 = segment.limit;
                while (i5 < i13) {
                    byte b17 = bArr3[i5];
                    if (b17 != b15 && b17 != b16) {
                        i5++;
                    }
                    i10 = segment.pos;
                }
                j6 += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = j6;
            }
        } else {
            byte[] internalArray$okio2 = targetBytes.internalArray$okio();
            while (j6 < buffer.size()) {
                byte[] bArr4 = segment.data;
                i5 = (int) ((segment.pos + j) - j6);
                int i14 = segment.limit;
                while (i5 < i14) {
                    byte b18 = bArr4[i5];
                    for (byte b19 : internalArray$okio2) {
                        if (b18 == b19) {
                            i10 = segment.pos;
                        }
                    }
                    i5++;
                }
                j6 += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j = j6;
            }
        }
        return -1L;
        return (i5 - i10) + j6;
    }

    public static final int commonNext(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j6 = unsafeCursor.offset;
        return unsafeCursor.seek(j6 == -1 ? 0L : j6 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(@NotNull okio.Buffer buffer, long j, @NotNull ByteString bytes, int i5, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return i10 >= 0 && j >= 0 && ((long) i10) + j <= buffer.size() && i5 >= 0 && i5 + i10 <= bytes.size() && (i10 == 0 || commonIndexOf(buffer, bytes, j, 1 + j, i5, i10) != -1);
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(@NotNull okio.Buffer buffer, @NotNull Sink sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = true;
        return resolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        int i11 = i5 + 1;
        byte b10 = segment.data[i5];
        buffer.setSize$okio(buffer.size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b10;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a4, code lost:
    
        r19.setSize$okio(r19.size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ad, code lost:
    
        if (r2 == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00af, code lost:
    
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b2, code lost:
    
        if (r1 >= r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
    
        if (r19.size() == r17) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r2 == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c3, code lost:
    
        r1 = v.f.c(r1, " but was 0x");
        r1.append(okio.SegmentedByteString.toHexString(r19.getByte(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00df, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e5, code lost:
    
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (r2 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e8, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ea, code lost:
    
        return -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b1, code lost:
    
        r14 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadDecimalLong(@NotNull okio.Buffer buffer) {
        long j;
        byte b10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long j6 = 0;
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i5 = 0;
        boolean z5 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z7 = false;
        loop0: while (true) {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            int i11 = segment.limit;
            while (i10 < i11) {
                b10 = bArr[i10];
                if (b10 >= 48 && b10 <= 57) {
                    int i12 = 48 - b10;
                    if (j10 < OVERFLOW_ZONE) {
                        break loop0;
                    }
                    j = j6;
                    if (j10 == OVERFLOW_ZONE && i12 < j11) {
                        break loop0;
                    }
                    j10 = (j10 * 10) + i12;
                } else {
                    j = j6;
                    if (b10 != 45 || i5 != 0) {
                        z7 = true;
                        break;
                    }
                    j11--;
                    z5 = true;
                }
                i10++;
                i5++;
                j6 = j;
            }
            j = j6;
            if (i10 == i11) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i10;
            }
            if (z7 || buffer.head == null) {
                break;
            }
            j6 = j;
        }
        okio.Buffer writeByte = new okio.Buffer().writeDecimalLong(j10).writeByte((int) b10);
        if (!z5) {
            writeByte.readByte();
        }
        throw new NumberFormatException("Number too large: " + writeByte.readUtf8());
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i5 = 0;
        while (i5 < sink.length) {
            int read = buffer.read(sink, i5, sink.length - i5);
            if (read == -1) {
                throw new EOFException();
            }
            i5 += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EDGE_INSN: B:40:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long commonReadHexadecimalUnsignedLong(@NotNull okio.Buffer buffer) {
        int i5;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z5 = false;
        long j = 0;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    i5 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i5 = b10 - 87;
                } else if (b10 >= 65 && b10 <= 70) {
                    i5 = b10 - 55;
                } else {
                    if (i10 == 0) {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b10));
                    }
                    z5 = true;
                    if (i11 != i12) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    } else {
                        segment.pos = i11;
                    }
                    if (!z5) {
                        break;
                    }
                }
                if (((-1152921504606846976L) & j) != 0) {
                    throw new NumberFormatException("Number too large: " + new okio.Buffer().writeHexadecimalUnsignedLong(j).writeByte((int) b10).readUtf8());
                }
                j = (j << 4) | i5;
                i11++;
                i10++;
            }
            if (i11 != i12) {
            }
            if (!z5) {
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i10);
        return j;
    }

    public static final int commonReadInt(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 3;
        int i12 = ((bArr[i5 + 1] & 255) << 16) | ((bArr[i5] & 255) << 24) | ((bArr[i5 + 2] & 255) << 8);
        int i13 = i5 + 4;
        int i14 = (bArr[i11] & 255) | i12;
        buffer.setSize$okio(buffer.size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    public static final long commonReadLong(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 7;
        long j = ((bArr[i5 + 3] & 255) << 32) | ((bArr[i5] & 255) << 56) | ((bArr[i5 + 1] & 255) << 48) | ((bArr[i5 + 2] & 255) << 40) | ((bArr[i5 + 4] & 255) << 24) | ((bArr[i5 + 5] & 255) << 16) | ((bArr[i5 + 6] & 255) << 8);
        int i12 = i5 + 8;
        long j6 = j | (bArr[i11] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j6;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j6;
    }

    public static final short commonReadShort(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 1;
        int i12 = (bArr[i5] & 255) << 8;
        int i13 = i5 + 2;
        int i14 = (bArr[i11] & 255) | i12;
        buffer.setSize$okio(buffer.size() - 2);
        if (i13 == i10) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor resolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = false;
        return resolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(e.g(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i5 = segment.pos;
        if (i5 + j > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i10 = (int) j;
        String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i5, i5 + i10);
        segment.pos += i10;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return commonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.Buffer buffer) {
        int i5;
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b10 = buffer.getByte(0L);
        if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
            i5 = b10 & ByteCompanionObject.MAX_VALUE;
            i11 = 0;
            i10 = 1;
        } else if ((b10 & 224) == 192) {
            i5 = b10 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((b10 & 240) == 224) {
            i5 = b10 & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i5 = b10 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j = i10;
        if (buffer.size() < j) {
            StringBuilder r5 = c1.r(i10, "size < ", ": ");
            r5.append(buffer.size());
            r5.append(" (to read code point prefixed 0x");
            r5.append(SegmentedByteString.toHexString(b10));
            r5.append(')');
            throw new EOFException(r5.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j6 = i12;
            byte b11 = buffer.getByte(j6);
            if ((b11 & 192) != 128) {
                buffer.skip(j6);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i5 = (i5 << 6) | (b11 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j);
        return i5 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i5 || i5 >= 57344) && i5 >= i11) ? i5 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(e.g(j, "limit < 0: ").toString());
        }
        long j6 = LongCompanionObject.MAX_VALUE;
        if (j != LongCompanionObject.MAX_VALUE) {
            j6 = j + 1;
        }
        long j10 = j6;
        long indexOf = buffer.indexOf((byte) 10, 0L, j10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (j10 < buffer.size() && buffer.getByte(j10 - 1) == 13 && buffer.getByte(j10) == 10) {
            return readUtf8Line(buffer, j10);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, long j) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j <= size) {
            if (j < 0) {
                throw new IllegalArgumentException(e.g(j, "newSize < 0: ").toString());
            }
            long j6 = size - j;
            while (true) {
                if (j6 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i5 = segment2.limit;
                long j10 = i5 - segment2.pos;
                if (j10 > j6) {
                    segment2.limit = i5 - ((int) j6);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j6 -= j10;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j11 = j - size;
            boolean z5 = true;
            while (j11 > 0) {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int min = (int) Math.min(j11, 8192 - writableSegment$okio.limit);
                writableSegment$okio.limit += min;
                j11 -= min;
                if (z5) {
                    unsafeCursor.setSegment$okio(writableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = writableSegment$okio.data;
                    int i10 = writableSegment$okio.limit;
                    unsafeCursor.start = i10 - min;
                    unsafeCursor.end = i10;
                    z5 = false;
                }
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final int commonSeek(@NotNull Buffer.UnsafeCursor unsafeCursor, long j) {
        Segment segment;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j < -1 || j > buffer.size()) {
            StringBuilder p10 = k.p(j, "offset=", " > size=");
            p10.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(p10.toString());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment2 = buffer.head;
        long j6 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j10 = unsafeCursor.offset;
            int i5 = unsafeCursor.start;
            Intrinsics.checkNotNull(unsafeCursor.getSegment());
            long j11 = j10 - (i5 - r9.pos);
            if (j11 > j) {
                segment = segment2;
                segment2 = unsafeCursor.getSegment();
                size = j11;
            } else {
                segment = unsafeCursor.getSegment();
                j6 = j11;
            }
        } else {
            segment = segment2;
        }
        if (size - j > j - j6) {
            while (true) {
                Intrinsics.checkNotNull(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j < (i10 - i11) + j6) {
                    break;
                }
                j6 += i10 - i11;
                segment = segment.next;
            }
        } else {
            while (size > j) {
                Intrinsics.checkNotNull(segment2);
                segment2 = segment2.prev;
                Intrinsics.checkNotNull(segment2);
                size -= segment2.limit - segment2.pos;
            }
            j6 = size;
            segment = segment2;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segment);
            if (segment.shared) {
                Segment unsharedCopy = segment.unsharedCopy();
                if (buffer.head == segment) {
                    buffer.head = unsharedCopy;
                }
                segment = segment.push(unsharedCopy);
                Segment segment3 = segment.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segment);
        unsafeCursor.offset = j;
        Intrinsics.checkNotNull(segment);
        unsafeCursor.data = segment.data;
        int i12 = segment.pos + ((int) (j - j6));
        unsafeCursor.start = i12;
        int i13 = segment.limit;
        unsafeCursor.end = i13;
        return i13 - i12;
    }

    public static final int commonSelect(@NotNull okio.Buffer buffer, @NotNull Options options) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j6 = min;
            buffer.setSize$okio(buffer.size() - j6);
            j -= j6;
            int i5 = segment.pos + min;
            segment.pos = i5;
            if (i5 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull okio.Buffer buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i5 < 1 || i5 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i5 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment take = SegmentPool.take();
        buffer.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, int i5, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i5, i10);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i5, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i5 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i5, i10);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull okio.Buffer buffer, @NotNull Source source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(buffer, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @NotNull
    public static final okio.Buffer commonWriteByte(@NotNull okio.Buffer buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i10 = writableSegment$okio.limit;
        writableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i5;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteDecimalLong(@NotNull okio.Buffer buffer, long j) {
        boolean z5;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z5 = true;
        } else {
            z5 = false;
        }
        int countDigitsIn = countDigitsIn(j);
        if (z5) {
            countDigitsIn++;
        }
        Segment writableSegment$okio = buffer.writableSegment$okio(countDigitsIn);
        byte[] bArr = writableSegment$okio.data;
        int i5 = writableSegment$okio.limit + countDigitsIn;
        while (j != 0) {
            long j6 = 10;
            i5--;
            bArr[i5] = getHEX_DIGIT_BYTES()[(int) (j % j6)];
            j /= j6;
        }
        if (z5) {
            bArr[i5 - 1] = 45;
        }
        writableSegment$okio.limit += countDigitsIn;
        buffer.setSize$okio(buffer.size() + countDigitsIn);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j6 = (j >>> 1) | j;
        long j10 = j6 | (j6 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i5 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = buffer.writableSegment$okio(i5);
        byte[] bArr = writableSegment$okio.data;
        int i10 = writableSegment$okio.limit;
        for (int i11 = (i10 + i5) - 1; i11 >= i10; i11--) {
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i5;
        buffer.setSize$okio(buffer.size() + i5);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteInt(@NotNull okio.Buffer buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i10 = writableSegment$okio.limit;
        bArr[i10] = (byte) ((i5 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 1] = (byte) ((i5 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 2] = (byte) ((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 3] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        writableSegment$okio.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteLong(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i5 = writableSegment$okio.limit;
        bArr[i5] = (byte) ((j >>> 56) & 255);
        bArr[i5 + 1] = (byte) ((j >>> 48) & 255);
        bArr[i5 + 2] = (byte) ((j >>> 40) & 255);
        bArr[i5 + 3] = (byte) ((j >>> 32) & 255);
        bArr[i5 + 4] = (byte) ((j >>> 24) & 255);
        bArr[i5 + 5] = (byte) ((j >>> 16) & 255);
        bArr[i5 + 6] = (byte) ((j >>> 8) & 255);
        bArr[i5 + 7] = (byte) (j & 255);
        writableSegment$okio.limit = i5 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteShort(@NotNull okio.Buffer buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i10 = writableSegment$okio.limit;
        bArr[i10] = (byte) ((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[i10 + 1] = (byte) (i5 & KotlinVersion.MAX_COMPONENT_VALUE);
        writableSegment$okio.limit = i10 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8(@NotNull okio.Buffer buffer, @NotNull String string, int i5, int i10) {
        char charAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i5 < 0) {
            throw new IllegalArgumentException(c1.i(i5, "beginIndex < 0: ").toString());
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(c1.j(i10, "endIndex < beginIndex: ", " < ", i5).toString());
        }
        if (i10 > string.length()) {
            StringBuilder r5 = c1.r(i10, "endIndex > string.length: ", " > ");
            r5.append(string.length());
            throw new IllegalArgumentException(r5.toString().toString());
        }
        while (i5 < i10) {
            char charAt2 = string.charAt(i5);
            if (charAt2 < 128) {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                int i11 = writableSegment$okio.limit - i5;
                int min = Math.min(i10, 8192 - i11);
                int i12 = i5 + 1;
                bArr[i5 + i11] = (byte) charAt2;
                while (true) {
                    i5 = i12;
                    if (i5 >= min || (charAt = string.charAt(i5)) >= 128) {
                        break;
                    }
                    i12 = i5 + 1;
                    bArr[i5 + i11] = (byte) charAt;
                }
                int i13 = writableSegment$okio.limit;
                int i14 = (i11 + i5) - i13;
                writableSegment$okio.limit = i13 + i14;
                buffer.setSize$okio(buffer.size() + i14);
            } else {
                if (charAt2 < 2048) {
                    Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = writableSegment$okio2.data;
                    int i15 = writableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit = i15 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    Segment writableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = writableSegment$okio3.data;
                    int i16 = writableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i16 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit = i16 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i17 = i5 + 1;
                    char charAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        buffer.writeByte(63);
                        i5 = i17;
                    } else {
                        int i18 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        Segment writableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i19 = writableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        writableSegment$okio4.limit = i19 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@NotNull okio.Buffer buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i5 < 128) {
            buffer.writeByte(i5);
            return buffer;
        }
        if (i5 < 2048) {
            Segment writableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i10 = writableSegment$okio.limit;
            bArr[i10] = (byte) ((i5 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i5 & 63) | 128);
            writableSegment$okio.limit = i10 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i5 && i5 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i5 < 65536) {
            Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i11 = writableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i5 >> 12) | 224);
            bArr2[i11 + 1] = (byte) (((i5 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i5 & 63) | 128);
            writableSegment$okio2.limit = i11 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i5 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i5));
        }
        Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = writableSegment$okio3.data;
        int i12 = writableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i5 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i5 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i5 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i5 & 63) | 128);
        writableSegment$okio3.limit = i12 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int countDigitsIn(long j) {
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        return numberOfLeadingZeros + (j > DigitCountToLargestValue[numberOfLeadingZeros] ? 1 : 0);
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i5, @NotNull byte[] bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i12 = segment.limit;
        byte[] bArr = segment.data;
        while (i10 < i11) {
            if (i5 == i12) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i5 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr[i5] != bytes[i10]) {
                return false;
            }
            i5++;
            i10++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j > 0) {
            long j6 = j - 1;
            if (buffer.getByte(j6) == 13) {
                String readUtf8 = buffer.readUtf8(j6);
                buffer.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return readUtf82;
    }

    public static final <T> T seek(@NotNull okio.Buffer buffer, long j, @NotNull Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= segment.limit - segment.pos;
            }
            return (T) lambda.invoke(segment, Long.valueOf(size));
        }
        long j6 = 0;
        while (true) {
            long j10 = (segment.limit - segment.pos) + j6;
            if (j10 > j) {
                return (T) lambda.invoke(segment, Long.valueOf(j6));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j6 = j10;
        }
    }

    public static final int selectPrefix(@NotNull okio.Buffer buffer, @NotNull Options options, boolean z5) {
        int i5;
        int i10;
        Segment segment;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z5 ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i13 = segment2.pos;
        int i14 = segment2.limit;
        int[] trie = options.getTrie();
        Segment segment3 = segment2;
        int i15 = -1;
        int i16 = 0;
        loop0: while (true) {
            int i17 = i16 + 1;
            int i18 = trie[i16];
            int i19 = i16 + 2;
            int i20 = trie[i17];
            if (i20 != -1) {
                i15 = i20;
            }
            if (segment3 == null) {
                break;
            }
            if (i18 >= 0) {
                i5 = i13 + 1;
                int i21 = bArr[i13] & 255;
                int i22 = i19 + i18;
                while (i19 != i22) {
                    if (i21 == trie[i19]) {
                        i10 = trie[i19 + i18];
                        if (i5 == i14) {
                            segment3 = segment3.next;
                            Intrinsics.checkNotNull(segment3);
                            i5 = segment3.pos;
                            bArr = segment3.data;
                            i14 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                        if (i10 >= 0) {
                            return i10;
                        }
                        i16 = -i10;
                        i13 = i5;
                    } else {
                        i19++;
                    }
                }
                break loop0;
            }
            int i23 = (i18 * (-1)) + i19;
            while (true) {
                int i24 = i13 + 1;
                int i25 = i19 + 1;
                if ((bArr[i13] & 255) != trie[i19]) {
                    break loop0;
                }
                boolean z7 = i25 == i23;
                if (i24 == i14) {
                    Intrinsics.checkNotNull(segment3);
                    Segment segment4 = segment3.next;
                    Intrinsics.checkNotNull(segment4);
                    i12 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i11 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else {
                        if (!z7) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    segment = segment3;
                    i11 = i14;
                    i12 = i24;
                }
                if (z7) {
                    i10 = trie[i25];
                    i5 = i12;
                    i14 = i11;
                    segment3 = segment;
                    break;
                }
                i13 = i12;
                i14 = i11;
                segment3 = segment;
                i19 = i25;
            }
        }
        if (z5) {
            return -2;
        }
        return i15;
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z5 = false;
        }
        return selectPrefix(buffer, options, z5);
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink, int i5, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i5, i10);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i11 = segment.pos;
        o.f(bArr, i5, sink, i11, i11 + min);
        segment.pos += min;
        buffer.setSize$okio(buffer.size() - min);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(e.g(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(e.g(j, "byteCount: ").toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(buffer.readByteArray(j));
        }
        ByteString snapshot = buffer.snapshot((int) j);
        buffer.skip(j);
        return snapshot;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source, int i5, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j = i10;
        SegmentedByteString.checkOffsetAndCount(source.length, i5, j);
        int i11 = i10 + i5;
        while (i5 < i11) {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = Math.min(i11 - i5, 8192 - writableSegment$okio.limit);
            int i12 = i5 + min;
            o.f(source, writableSegment$okio.limit, writableSegment$okio.data, i5, i12);
            writableSegment$okio.limit += min;
            i5 = i12;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j) {
            sink.write(buffer, j);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer, int i5) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i5 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i5);
        Segment segment = buffer.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5) {
            Intrinsics.checkNotNull(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = buffer.head;
        int i15 = 0;
        while (i10 < i5) {
            Intrinsics.checkNotNull(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, i5);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C0691SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull Source source, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j > 0) {
            long read = source.read(buffer, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(e.g(j, "byteCount < 0: ").toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        sink.write(buffer, j);
        return j;
    }

    public static final void commonWrite(@NotNull okio.Buffer buffer, @NotNull okio.Buffer source, long j) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i5 = segment2.limit;
                Intrinsics.checkNotNull(source.head);
                if (j < i5 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        Intrinsics.checkNotNull(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            Intrinsics.checkNotNull(segment4);
                            segment4.writeTo(segment, (int) j);
                            source.setSize$okio(source.size() - j);
                            buffer.setSize$okio(buffer.size() + j);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    Intrinsics.checkNotNull(segment5);
                    source.head = segment5.split((int) j);
                }
                Segment segment6 = source.head;
                Intrinsics.checkNotNull(segment6);
                long j6 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    Intrinsics.checkNotNull(segment7);
                    Segment segment8 = segment7.prev;
                    Intrinsics.checkNotNull(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j6);
                buffer.setSize$okio(buffer.size() + j6);
                j -= j6;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, @NotNull ByteString bytes, long j, long j6, int i5, int i10) {
        Segment segment;
        int i11;
        long j10 = j;
        long j11 = j6;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        long j12 = i10;
        SegmentedByteString.checkOffsetAndCount(bytes.size(), i5, j12);
        if (i10 <= 0) {
            throw new IllegalArgumentException("byteCount == 0");
        }
        long j13 = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(e.g(j10, "fromIndex < 0: ").toString());
        }
        if (j10 > j11) {
            StringBuilder p10 = k.p(j10, "fromIndex > toIndex: ", " > ");
            p10.append(j11);
            throw new IllegalArgumentException(p10.toString().toString());
        }
        if (j11 > buffer.size()) {
            j11 = buffer.size();
        }
        long j14 = -1;
        if (j10 == j11 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            j13 = buffer.size();
            while (j13 > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                j13 -= segment.limit - segment.pos;
                j14 = j14;
            }
            long j15 = j14;
            byte[] internalArray$okio = bytes.internalArray$okio();
            byte b10 = internalArray$okio[i5];
            long min = Math.min(j11, (buffer.size() - j12) + 1);
            while (j13 < min) {
                byte[] bArr = segment.data;
                int min2 = (int) Math.min(segment.limit, (segment.pos + min) - j13);
                i11 = (int) ((segment.pos + j10) - j13);
                while (i11 < min2) {
                    if (bArr[i11] != b10 || !rangeEquals(segment, i11 + 1, internalArray$okio, i5 + 1, i10)) {
                        i11++;
                    }
                }
                j13 += segment.limit - segment.pos;
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j10 = j13;
            }
            return j15;
        }
        while (true) {
            long j16 = (segment.limit - segment.pos) + j13;
            if (j16 > j10) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j13 = j16;
        }
        byte[] internalArray$okio2 = bytes.internalArray$okio();
        byte b11 = internalArray$okio2[i5];
        long min3 = Math.min(j11, (buffer.size() - j12) + 1);
        while (j13 < min3) {
            byte[] bArr2 = segment.data;
            int min4 = (int) Math.min(segment.limit, (segment.pos + min3) - j13);
            i11 = (int) ((segment.pos + j10) - j13);
            while (i11 < min4) {
                if (bArr2[i11] != b11 || !rangeEquals(segment, i11 + 1, internalArray$okio2, i5 + 1, i10)) {
                    i11++;
                }
            }
            j13 += segment.limit - segment.pos;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = j13;
        }
        return -1L;
        return (i11 - segment.pos) + j13;
    }
}
