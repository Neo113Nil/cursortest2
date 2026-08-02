package z;

import kotlin.ULong;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends p {

    /* renamed from: c, reason: collision with root package name */
    public int f68459c;

    public /* synthetic */ m(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 6 : i10);
    }

    public final boolean f(Object obj) {
        int c10 = c();
        this.elements[h(obj)] = obj;
        return c() != c10;
    }

    public final void g() {
        int compare;
        if (this.f68463a > 8) {
            compare = Long.compare(ULong.m321constructorimpl(ULong.m321constructorimpl(this.f68464b) * 32) ^ Long.MIN_VALUE, ULong.m321constructorimpl(ULong.m321constructorimpl(this.f68463a) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                m();
                return;
            }
        }
        n(o.b(this.f68463a));
    }

    public final int h(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = hashCode ^ (hashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f68463a;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            for (long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int numberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.elements[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int i19 = i(i11);
                if (this.f68459c == 0 && ((this.metadata[i19 >> 3] >> ((i19 & 7) << 3)) & 255) != 254) {
                    g();
                    i19 = i(i11);
                }
                this.f68464b++;
                int i20 = this.f68459c;
                long[] jArr2 = this.metadata;
                int i21 = i19 >> 3;
                long j14 = jArr2[i21];
                int i22 = (i19 & 7) << 3;
                this.f68459c = i20 - (((j14 >> i22) & 255) == 128 ? 1 : 0);
                jArr2[i21] = (j14 & (~(255 << i22))) | (j11 << i22);
                int i23 = this.f68463a;
                int i24 = ((i19 - 7) & i23) + (i23 & 7);
                int i25 = i24 >> 3;
                int i26 = (i24 & 7) << 3;
                jArr2[i25] = ((~(255 << i26)) & jArr2[i25]) | (j11 << i26);
                return i19;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final int i(int i10) {
        int i11 = this.f68463a;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void j() {
        this.f68459c = o.a(b()) - this.f68464b;
    }

    public final void k(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = o.EmptyGroup;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            jArr = jArr2;
        }
        this.metadata = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        j();
    }

    public final void l(int i10) {
        int max = i10 > 0 ? Math.max(7, o.c(i10)) : 0;
        this.f68463a = max;
        k(max);
        this.elements = new Object[max];
    }

    public final void m() {
        long[] jArr = this.metadata;
        int i10 = this.f68463a;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 >> 3;
            int i14 = (i12 & 7) << 3;
            if (((jArr[i13] >> i14) & 255) == 254) {
                long[] jArr2 = this.metadata;
                jArr2[i13] = (128 << i14) | (jArr2[i13] & (~(255 << i14)));
                int i15 = this.f68463a;
                int i16 = ((i12 - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = ((~(255 << i18)) & jArr2[i17]) | (128 << i18);
                i11++;
            }
        }
        this.f68459c += i11;
    }

    public final void n(int i10) {
        int i11;
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i12 = this.f68463a;
        l(i10);
        Object[] objArr2 = this.elements;
        int i13 = 0;
        while (i13 < i12) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i14 = hashCode ^ (hashCode << 16);
                int i15 = i(i14 >>> 7);
                long j10 = i14 & 127;
                long[] jArr2 = this.metadata;
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                i11 = i13;
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j10 << i17);
                int i18 = this.f68463a;
                int i19 = ((i15 - 7) & i18) + (i18 & 7);
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                jArr2[i20] = ((~(255 << i21)) & jArr2[i20]) | (j10 << i21);
                objArr2[i15] = obj;
            } else {
                i11 = i13;
            }
            i13 = i11 + 1;
        }
    }

    public m(int i10) {
        super(null);
        if (i10 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        l(o.d(i10));
    }
}
