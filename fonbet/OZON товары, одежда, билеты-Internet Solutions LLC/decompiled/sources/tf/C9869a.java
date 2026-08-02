package tf;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import sf.C9674B;
import sf.C9681g;
import sf.H;

/* renamed from: tf.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9869a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final byte[] f99482a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f99483b = 0;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "<this>");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        f99482a = bytes;
    }

    @NotNull
    public static final byte[] a() {
        return f99482a;
    }

    public static final boolean b(@NotNull H segment, int i11, @NotNull byte[] bytes, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f98672c;
        byte[] bArr = segment.f98670a;
        for (int i14 = 1; i14 < i12; i14++) {
            if (i11 == i13) {
                segment = segment.f98675f;
                Intrinsics.f(segment);
                i11 = segment.f98671b;
                i13 = segment.f98672c;
                bArr = segment.f98670a;
            }
            if (bArr[i11] != bytes[i14]) {
                return false;
            }
            i11++;
        }
        return true;
    }

    @NotNull
    public static final String c(@NotNull C9681g c9681g, long j11) {
        Intrinsics.checkNotNullParameter(c9681g, "<this>");
        if (j11 > 0) {
            long j12 = j11 - 1;
            if (c9681g.o(j12) == 13) {
                String I11 = c9681g.I(j12, Charsets.UTF_8);
                c9681g.skip(2L);
                return I11;
            }
        }
        c9681g.getClass();
        String I12 = c9681g.I(j11, Charsets.UTF_8);
        c9681g.skip(1L);
        return I12;
    }

    public static final int d(@NotNull C9681g c9681g, @NotNull C9674B options, boolean z11) {
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        H h11;
        byte[] bArr2;
        int i14;
        Intrinsics.checkNotNullParameter(c9681g, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        H h12 = c9681g.f98708a;
        if (h12 == null) {
            return z11 ? -2 : -1;
        }
        int i15 = h12.f98671b;
        int i16 = h12.f98672c;
        int[] e11 = options.e();
        byte[] bArr3 = h12.f98670a;
        H h13 = h12;
        int i17 = -1;
        int i18 = 0;
        loop0: while (true) {
            int i19 = i18 + 1;
            int i21 = e11[i18];
            int i22 = i18 + 2;
            int i23 = e11[i19];
            if (i23 != -1) {
                i17 = i23;
            }
            if (h13 == null) {
                break;
            }
            if (i21 >= 0) {
                int i24 = i15 + 1;
                int i25 = bArr3[i15] & 255;
                int i26 = i22 + i21;
                while (i22 != i26) {
                    if (i25 == e11[i22]) {
                        i11 = e11[i22 + i21];
                        if (i24 == i16) {
                            h13 = h13.f98675f;
                            Intrinsics.f(h13);
                            i13 = h13.f98671b;
                            i12 = h13.f98672c;
                            bArr = h13.f98670a;
                            if (h13 == h12) {
                                h13 = null;
                            }
                        } else {
                            bArr = bArr3;
                            i12 = i16;
                            i13 = i24;
                        }
                        if (i11 >= 0) {
                            return i11;
                        }
                        byte[] bArr4 = bArr;
                        i18 = -i11;
                        i15 = i13;
                        i16 = i12;
                        bArr3 = bArr4;
                    } else {
                        i22++;
                    }
                }
                break loop0;
            }
            int i27 = (i21 * (-1)) + i22;
            while (true) {
                int i28 = i15 + 1;
                int i29 = i22 + 1;
                if ((bArr3[i15] & 255) != e11[i22]) {
                    break loop0;
                }
                boolean z12 = i29 == i27;
                if (i28 == i16) {
                    Intrinsics.f(h13);
                    H h14 = h13.f98675f;
                    Intrinsics.f(h14);
                    i14 = h14.f98671b;
                    int i31 = h14.f98672c;
                    bArr2 = h14.f98670a;
                    if (h14 != h12) {
                        h11 = h14;
                        i16 = i31;
                    } else {
                        if (!z12) {
                            break loop0;
                        }
                        i16 = i31;
                        h11 = null;
                    }
                } else {
                    h11 = h13;
                    bArr2 = bArr3;
                    i14 = i28;
                }
                if (z12) {
                    i11 = e11[i29];
                    int i32 = i14;
                    i12 = i16;
                    i13 = i32;
                    byte[] bArr5 = bArr2;
                    h13 = h11;
                    bArr = bArr5;
                    break;
                }
                i15 = i14;
                bArr3 = bArr2;
                h13 = h11;
                i22 = i29;
            }
        }
        if (z11) {
            return -2;
        }
        return i17;
    }
}
