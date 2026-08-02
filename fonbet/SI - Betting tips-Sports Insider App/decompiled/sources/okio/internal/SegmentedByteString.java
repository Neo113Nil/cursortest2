package okio.internal;

import androidx.appcompat.widget.c1;
import d9.e;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C0691SegmentedByteString;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000L\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000f\u001a\u00020\r*\u00020\u00072\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aD\u0010\u000f\u001a\u00020\r*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\r0\u000bH\u0082\b¢\u0006\u0004\b\u000f\u0010\u0013\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\u00020\u0017*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\u001a\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\f*\u00020\u0007H\u0080\b¢\u0006\u0004\b\u001c\u0010\u001d\u001a,\u0010\"\u001a\u00020\r*\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b\"\u0010#\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010(\u001a4\u0010'\u001a\u00020&*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b'\u0010)\u001a4\u0010,\u001a\u00020\r*\u00020\u00072\u0006\u0010 \u001a\u00020\u00012\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001H\u0080\b¢\u0006\u0004\b,\u0010-\u001a\u001e\u0010/\u001a\u00020&*\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010.H\u0080\b¢\u0006\u0004\b/\u00100\u001a\u0014\u00101\u001a\u00020\u0001*\u00020\u0007H\u0080\b¢\u0006\u0004\b1\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00062"}, d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "([IIII)I", "Lokio/SegmentedByteString;", "pos", "segment", "(Lokio/SegmentedByteString;I)I", "Lkotlin/Function3;", "", "", "action", "forEachSegment", "(Lokio/SegmentedByteString;Lvf/a;)V", "beginIndex", "endIndex", "(Lokio/SegmentedByteString;IILvf/a;)V", "Lokio/ByteString;", "commonSubstring", "(Lokio/SegmentedByteString;II)Lokio/ByteString;", "", "commonInternalGet", "(Lokio/SegmentedByteString;I)B", "commonGetSize", "(Lokio/SegmentedByteString;)I", "commonToByteArray", "(Lokio/SegmentedByteString;)[B", "Lokio/Buffer;", "buffer", "offset", "byteCount", "commonWrite", "(Lokio/SegmentedByteString;Lokio/Buffer;II)V", "other", "otherOffset", "", "commonRangeEquals", "(Lokio/SegmentedByteString;ILokio/ByteString;II)Z", "(Lokio/SegmentedByteString;I[BII)Z", "target", "targetOffset", "commonCopyInto", "(Lokio/SegmentedByteString;I[BII)V", "", "commonEquals", "(Lokio/SegmentedByteString;Ljava/lang/Object;)Z", "commonHashCode", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i5, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i5) {
                i10 = i13 + 1;
            } else {
                if (i14 <= i5) {
                    return i13;
                }
                i12 = i13 - 1;
            }
        }
        return (-i10) - 1;
    }

    public static final void commonCopyInto(@NotNull C0691SegmentedByteString c0691SegmentedByteString, int i5, @NotNull byte[] target, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j = i11;
        okio.SegmentedByteString.checkOffsetAndCount(c0691SegmentedByteString.size(), i5, j);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i10, j);
        int i12 = i11 + i5;
        int segment = segment(c0691SegmentedByteString, i5);
        while (i5 < i12) {
            int i13 = segment == 0 ? 0 : c0691SegmentedByteString.getDirectory()[segment - 1];
            int i14 = c0691SegmentedByteString.getDirectory()[segment] - i13;
            int i15 = c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i12, i14 + i13) - i5;
            int i16 = (i5 - i13) + i15;
            o.f(c0691SegmentedByteString.getSegments()[segment], i10, target, i16, i16 + min);
            i10 += min;
            i5 += min;
            segment++;
        }
    }

    public static final boolean commonEquals(@NotNull C0691SegmentedByteString c0691SegmentedByteString, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        if (obj == c0691SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0691SegmentedByteString.size() && c0691SegmentedByteString.rangeEquals(0, byteString, 0, c0691SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C0691SegmentedByteString c0691SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        return c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C0691SegmentedByteString c0691SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        int hashCode = c0691SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c0691SegmentedByteString.getSegments().length;
        int i5 = 0;
        int i10 = 1;
        int i11 = 0;
        while (i5 < length) {
            int i12 = c0691SegmentedByteString.getDirectory()[length + i5];
            int i13 = c0691SegmentedByteString.getDirectory()[i5];
            byte[] bArr = c0691SegmentedByteString.getSegments()[i5];
            int i14 = (i13 - i11) + i12;
            while (i12 < i14) {
                i10 = (i10 * 31) + bArr[i12];
                i12++;
            }
            i5++;
            i11 = i13;
        }
        c0691SegmentedByteString.setHashCode$okio(i10);
        return i10;
    }

    public static final byte commonInternalGet(@NotNull C0691SegmentedByteString c0691SegmentedByteString, int i5) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length - 1], i5, 1L);
        int segment = segment(c0691SegmentedByteString, i5);
        return c0691SegmentedByteString.getSegments()[segment][(i5 - (segment == 0 ? 0 : c0691SegmentedByteString.getDirectory()[segment - 1])) + c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + segment]];
    }

    public static final boolean commonRangeEquals(@NotNull C0691SegmentedByteString c0691SegmentedByteString, int i5, @NotNull ByteString other, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i5 < 0 || i5 > c0691SegmentedByteString.size() - i11) {
            return false;
        }
        int i12 = i11 + i5;
        int segment = segment(c0691SegmentedByteString, i5);
        while (i5 < i12) {
            int i13 = segment == 0 ? 0 : c0691SegmentedByteString.getDirectory()[segment - 1];
            int i14 = c0691SegmentedByteString.getDirectory()[segment] - i13;
            int i15 = c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i12, i14 + i13) - i5;
            if (!other.rangeEquals(i10, c0691SegmentedByteString.getSegments()[segment], (i5 - i13) + i15, min)) {
                return false;
            }
            i10 += min;
            i5 += min;
            segment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C0691SegmentedByteString c0691SegmentedByteString, int i5, int i10) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c0691SegmentedByteString, i10);
        if (i5 < 0) {
            throw new IllegalArgumentException(e.f(i5, "beginIndex=", " < 0").toString());
        }
        if (resolveDefaultParameter > c0691SegmentedByteString.size()) {
            StringBuilder r5 = c1.r(resolveDefaultParameter, "endIndex=", " > length(");
            r5.append(c0691SegmentedByteString.size());
            r5.append(')');
            throw new IllegalArgumentException(r5.toString().toString());
        }
        int i11 = resolveDefaultParameter - i5;
        if (i11 < 0) {
            throw new IllegalArgumentException(c1.j(resolveDefaultParameter, "endIndex=", " < beginIndex=", i5).toString());
        }
        if (i5 == 0 && resolveDefaultParameter == c0691SegmentedByteString.size()) {
            return c0691SegmentedByteString;
        }
        if (i5 == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = segment(c0691SegmentedByteString, i5);
        int segment2 = segment(c0691SegmentedByteString, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) o.j(segment, segment2 + 1, c0691SegmentedByteString.getSegments());
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i12 = segment;
            int i13 = 0;
            while (true) {
                iArr[i13] = Math.min(c0691SegmentedByteString.getDirectory()[i12] - i5, i11);
                int i14 = i13 + 1;
                iArr[i13 + bArr.length] = c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + i12];
                if (i12 == segment2) {
                    break;
                }
                i12++;
                i13 = i14;
            }
        }
        int i15 = segment != 0 ? c0691SegmentedByteString.getDirectory()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i5 - i15) + iArr[length];
        return new C0691SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C0691SegmentedByteString c0691SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0691SegmentedByteString.size()];
        int length = c0691SegmentedByteString.getSegments().length;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i5 < length) {
            int i12 = c0691SegmentedByteString.getDirectory()[length + i5];
            int i13 = c0691SegmentedByteString.getDirectory()[i5];
            int i14 = i13 - i10;
            o.f(c0691SegmentedByteString.getSegments()[i5], i11, bArr, i12, i12 + i14);
            i11 += i14;
            i5++;
            i10 = i13;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C0691SegmentedByteString c0691SegmentedByteString, @NotNull Buffer buffer, int i5, int i10) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i11 = i5 + i10;
        int segment = segment(c0691SegmentedByteString, i5);
        while (i5 < i11) {
            int i12 = segment == 0 ? 0 : c0691SegmentedByteString.getDirectory()[segment - 1];
            int i13 = c0691SegmentedByteString.getDirectory()[segment] - i12;
            int i14 = c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i11, i13 + i12) - i5;
            int i15 = (i5 - i12) + i14;
            Segment segment2 = new Segment(c0691SegmentedByteString.getSegments()[segment], i15, i15 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                Intrinsics.checkNotNull(segment3);
                Segment segment4 = segment3.prev;
                Intrinsics.checkNotNull(segment4);
                segment4.push(segment2);
            }
            i5 += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i10);
    }

    public static final void forEachSegment(@NotNull C0691SegmentedByteString c0691SegmentedByteString, @NotNull vf.a action) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c0691SegmentedByteString.getSegments().length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            int i11 = c0691SegmentedByteString.getDirectory()[length + i5];
            int i12 = c0691SegmentedByteString.getDirectory()[i5];
            action.invoke(c0691SegmentedByteString.getSegments()[i5], Integer.valueOf(i11), Integer.valueOf(i12 - i10));
            i5++;
            i10 = i12;
        }
    }

    public static final int segment(@NotNull C0691SegmentedByteString c0691SegmentedByteString, int i5) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        int binarySearch = binarySearch(c0691SegmentedByteString.getDirectory(), i5 + 1, 0, c0691SegmentedByteString.getSegments().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    private static final void forEachSegment(C0691SegmentedByteString c0691SegmentedByteString, int i5, int i10, vf.a aVar) {
        int segment = segment(c0691SegmentedByteString, i5);
        while (i5 < i10) {
            int i11 = segment == 0 ? 0 : c0691SegmentedByteString.getDirectory()[segment - 1];
            int i12 = c0691SegmentedByteString.getDirectory()[segment] - i11;
            int i13 = c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i10, i12 + i11) - i5;
            aVar.invoke(c0691SegmentedByteString.getSegments()[segment], Integer.valueOf((i5 - i11) + i13), Integer.valueOf(min));
            i5 += min;
            segment++;
        }
    }

    public static final boolean commonRangeEquals(@NotNull C0691SegmentedByteString c0691SegmentedByteString, int i5, @NotNull byte[] other, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c0691SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i5 < 0 || i5 > c0691SegmentedByteString.size() - i11 || i10 < 0 || i10 > other.length - i11) {
            return false;
        }
        int i12 = i11 + i5;
        int segment = segment(c0691SegmentedByteString, i5);
        while (i5 < i12) {
            int i13 = segment == 0 ? 0 : c0691SegmentedByteString.getDirectory()[segment - 1];
            int i14 = c0691SegmentedByteString.getDirectory()[segment] - i13;
            int i15 = c0691SegmentedByteString.getDirectory()[c0691SegmentedByteString.getSegments().length + segment];
            int min = Math.min(i12, i14 + i13) - i5;
            if (!okio.SegmentedByteString.arrayRangeEquals(c0691SegmentedByteString.getSegments()[segment], (i5 - i13) + i15, other, i10, min)) {
                return false;
            }
            i10 += min;
            i5 += min;
            segment++;
        }
        return true;
    }
}
