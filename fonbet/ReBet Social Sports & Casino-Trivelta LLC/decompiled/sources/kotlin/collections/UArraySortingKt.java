package kotlin.collections;

import com.facebook.react.uimanager.ViewProps;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", ViewProps.LEFT, ViewProps.RIGHT, "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UArraySortingKt {
    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @ExperimentalUnsignedTypes
    /* renamed from: partition--nroSd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m602partitionnroSd4(long[] jArr, int i10, int i11) {
        int compare;
        int compare2;
        long m381getsVKNKU = ULongArray.m381getsVKNKU(jArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (compare < 0) {
                i10++;
            }
            while (compare2 > 0) {
                i11--;
            }
            if (i10 <= i11) {
                long m381getsVKNKU2 = ULongArray.m381getsVKNKU(jArr, i10);
                ULongArray.m386setk8EXiF4(jArr, i10, ULongArray.m381getsVKNKU(jArr, i11));
                ULongArray.m386setk8EXiF4(jArr, i11, m381getsVKNKU2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m603partition4UcCI2c(byte[] bArr, int i10, int i11) {
        int i12;
        byte m223getw2LRezQ = UByteArray.m223getw2LRezQ(bArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m223getw2LRezQ2 = UByteArray.m223getw2LRezQ(bArr, i10) & UByte.MAX_VALUE;
                i12 = m223getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(m223getw2LRezQ2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UByteArray.m223getw2LRezQ(bArr, i11) & UByte.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                byte m223getw2LRezQ3 = UByteArray.m223getw2LRezQ(bArr, i10);
                UByteArray.m228setVurrAj0(bArr, i10, UByteArray.m223getw2LRezQ(bArr, i11));
                UByteArray.m228setVurrAj0(bArr, i11, m223getw2LRezQ3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m604partitionAa5vz7o(short[] sArr, int i10, int i11) {
        int i12;
        short m486getMh2AYeg = UShortArray.m486getMh2AYeg(sArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (true) {
                int m486getMh2AYeg2 = UShortArray.m486getMh2AYeg(sArr, i10) & UShort.MAX_VALUE;
                i12 = m486getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(m486getMh2AYeg2, i12) >= 0) {
                    break;
                }
                i10++;
            }
            while (Intrinsics.compare(UShortArray.m486getMh2AYeg(sArr, i11) & UShort.MAX_VALUE, i12) > 0) {
                i11--;
            }
            if (i10 <= i11) {
                short m486getMh2AYeg3 = UShortArray.m486getMh2AYeg(sArr, i10);
                UShortArray.m491set01HTLdE(sArr, i10, UShortArray.m486getMh2AYeg(sArr, i11));
                UShortArray.m491set01HTLdE(sArr, i11, m486getMh2AYeg3);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0012 */
    /* JADX WARN: Incorrect condition in loop: B:8:0x001f */
    @ExperimentalUnsignedTypes
    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final int m605partitionoBK06Vg(int[] iArr, int i10, int i11) {
        int compare;
        int compare2;
        int m302getpVg5ArA = UIntArray.m302getpVg5ArA(iArr, (i10 + i11) / 2);
        while (i10 <= i11) {
            while (compare < 0) {
                i10++;
            }
            while (compare2 > 0) {
                i11--;
            }
            if (i10 <= i11) {
                int m302getpVg5ArA2 = UIntArray.m302getpVg5ArA(iArr, i10);
                UIntArray.m307setVXSXFK8(iArr, i10, UIntArray.m302getpVg5ArA(iArr, i11));
                UIntArray.m307setVXSXFK8(iArr, i11, m302getpVg5ArA2);
                i10++;
                i11--;
            }
        }
        return i10;
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m606quickSortnroSd4(long[] jArr, int i10, int i11) {
        int m602partitionnroSd4 = m602partitionnroSd4(jArr, i10, i11);
        int i12 = m602partitionnroSd4 - 1;
        if (i10 < i12) {
            m606quickSortnroSd4(jArr, i10, i12);
        }
        if (m602partitionnroSd4 < i11) {
            m606quickSortnroSd4(jArr, m602partitionnroSd4, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m607quickSort4UcCI2c(byte[] bArr, int i10, int i11) {
        int m603partition4UcCI2c = m603partition4UcCI2c(bArr, i10, i11);
        int i12 = m603partition4UcCI2c - 1;
        if (i10 < i12) {
            m607quickSort4UcCI2c(bArr, i10, i12);
        }
        if (m603partition4UcCI2c < i11) {
            m607quickSort4UcCI2c(bArr, m603partition4UcCI2c, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m608quickSortAa5vz7o(short[] sArr, int i10, int i11) {
        int m604partitionAa5vz7o = m604partitionAa5vz7o(sArr, i10, i11);
        int i12 = m604partitionAa5vz7o - 1;
        if (i10 < i12) {
            m608quickSortAa5vz7o(sArr, i10, i12);
        }
        if (m604partitionAa5vz7o < i11) {
            m608quickSortAa5vz7o(sArr, m604partitionAa5vz7o, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m609quickSortoBK06Vg(int[] iArr, int i10, int i11) {
        int m605partitionoBK06Vg = m605partitionoBK06Vg(iArr, i10, i11);
        int i12 = m605partitionoBK06Vg - 1;
        if (i10 < i12) {
            m609quickSortoBK06Vg(iArr, i10, i12);
        }
        if (m605partitionoBK06Vg < i11) {
            m609quickSortoBK06Vg(iArr, m605partitionoBK06Vg, i11);
        }
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m610sortArraynroSd4(@NotNull long[] jArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(jArr, "$v$c$kotlin-ULongArray$-array$0");
        m606quickSortnroSd4(jArr, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m611sortArray4UcCI2c(@NotNull byte[] bArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(bArr, "$v$c$kotlin-UByteArray$-array$0");
        m607quickSort4UcCI2c(bArr, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m612sortArrayAa5vz7o(@NotNull short[] sArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sArr, "$v$c$kotlin-UShortArray$-array$0");
        m608quickSortAa5vz7o(sArr, i10, i11 - 1);
    }

    @ExperimentalUnsignedTypes
    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m613sortArrayoBK06Vg(@NotNull int[] iArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(iArr, "$v$c$kotlin-UIntArray$-array$0");
        m609quickSortoBK06Vg(iArr, i10, i11 - 1);
    }
}
