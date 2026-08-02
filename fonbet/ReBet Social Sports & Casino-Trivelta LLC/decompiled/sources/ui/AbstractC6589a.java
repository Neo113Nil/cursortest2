package ui;

import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ti.AbstractC6475e;
import ti.C6468B;
import ti.C6478h;
import ti.J;
import ti.w;

/* renamed from: ui.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6589a {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = J.a("0123456789abcdef");

    public static final C6478h.a a(C6478h c6478h, C6478h.a unsafeCursor) {
        Intrinsics.checkNotNullParameter(c6478h, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        C6478h.a g10 = AbstractC6475e.g(unsafeCursor);
        if (g10.f65859a != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        g10.f65859a = c6478h;
        g10.f65860b = true;
        return g10;
    }

    public static final byte[] b() {
        return HEX_DIGIT_BYTES;
    }

    public static final boolean c(C6468B segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f65836b;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f65839e;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.f65835a;
                i13 = segment.f65836b;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String d(C6478h c6478h, long j10) {
        Intrinsics.checkNotNullParameter(c6478h, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (c6478h.A0(j11) == 13) {
                String c22 = c6478h.c2(j11);
                c6478h.skip(2L);
                return c22;
            }
        }
        String c23 = c6478h.c2(j10);
        c6478h.skip(1L);
        return c23;
    }

    public static final int e(C6478h c6478h, w options, boolean z10) {
        int i10;
        int i11;
        C6468B c6468b;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(c6478h, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        C6468B c6468b2 = c6478h.f65857a;
        if (c6468b2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = c6468b2.data;
        int i14 = c6468b2.f65835a;
        int i15 = c6468b2.f65836b;
        int[] f10 = options.f();
        C6468B c6468b3 = c6468b2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = f10[i17];
            int i20 = i17 + 2;
            int i21 = f10[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (c6468b3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & UByte.MAX_VALUE;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == f10[i20]) {
                        i11 = f10[i20 + i19];
                        if (i10 == i15) {
                            c6468b3 = c6468b3.f65839e;
                            Intrinsics.checkNotNull(c6468b3);
                            i10 = c6468b3.f65835a;
                            bArr = c6468b3.data;
                            i15 = c6468b3.f65836b;
                            if (c6468b3 == c6468b2) {
                                c6468b3 = null;
                            }
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        i17 = -i11;
                        i14 = i10;
                    } else {
                        i20++;
                    }
                }
                break loop0;
            }
            int i24 = i20 + (i19 * (-1));
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & UByte.MAX_VALUE) != f10[i20]) {
                    break loop0;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    Intrinsics.checkNotNull(c6468b3);
                    C6468B c6468b4 = c6468b3.f65839e;
                    Intrinsics.checkNotNull(c6468b4);
                    i13 = c6468b4.f65835a;
                    byte[] bArr2 = c6468b4.data;
                    i12 = c6468b4.f65836b;
                    if (c6468b4 != c6468b2) {
                        c6468b = c6468b4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        c6468b = null;
                    }
                } else {
                    c6468b = c6468b3;
                    i12 = i15;
                    i13 = i25;
                }
                if (z11) {
                    i11 = f10[i26];
                    i10 = i13;
                    i15 = i12;
                    c6468b3 = c6468b;
                    break;
                }
                i14 = i13;
                i15 = i12;
                c6468b3 = c6468b;
                i20 = i26;
            }
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int f(C6478h c6478h, w wVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e(c6478h, wVar, z10);
    }
}
