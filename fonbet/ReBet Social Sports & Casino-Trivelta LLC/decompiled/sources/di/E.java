package di;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final bi.f f45288a;

    /* renamed from: b, reason: collision with root package name */
    public final Function2 f45289b;

    /* renamed from: c, reason: collision with root package name */
    public long f45290c;

    @NotNull
    private final long[] highMarksArray;

    /* renamed from: d, reason: collision with root package name */
    public static final a f45287d = new a(null);

    @NotNull
    private static final long[] EMPTY_HIGH_MARKS = new long[0];

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public E(bi.f descriptor, Function2 readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f45288a = descriptor;
        this.f45289b = readIfAbsent;
        int d10 = descriptor.d();
        if (d10 <= 64) {
            this.f45290c = d10 != 64 ? (-1) << d10 : 0L;
            this.highMarksArray = EMPTY_HIGH_MARKS;
        } else {
            this.f45290c = 0L;
            this.highMarksArray = e(d10);
        }
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f45290c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    public final int c() {
        int length = this.highMarksArray.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.highMarksArray[i10];
            while (j10 != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << numberOfTrailingZeros;
                int i13 = numberOfTrailingZeros + i12;
                if (((Boolean) this.f45289b.invoke(this.f45288a, Integer.valueOf(i13))).booleanValue()) {
                    this.highMarksArray[i10] = j10;
                    return i13;
                }
            }
            this.highMarksArray[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    public final int d() {
        int numberOfTrailingZeros;
        int d10 = this.f45288a.d();
        do {
            long j10 = this.f45290c;
            if (j10 == -1) {
                if (d10 > 64) {
                    return c();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f45290c |= 1 << numberOfTrailingZeros;
        } while (!((Boolean) this.f45289b.invoke(this.f45288a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }

    public final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i10;
        }
        return jArr;
    }
}
