package vh;

import hh.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f24944a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(String str, int i5, int i10, String encodeSet, int i11) {
        int i12 = (i11 & 1) != 0 ? 0 : i5;
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        int i13 = i10;
        boolean z5 = (i11 & 8) == 0;
        boolean z7 = (i11 & 16) == 0;
        boolean z10 = (i11 & 32) == 0;
        boolean z11 = (i11 & 64) == 0;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        return b(str, i12, i13, encodeSet, z5, z7, z10, z11, 128);
    }

    public static String b(String input, int i5, int i10, String encodeSet, boolean z5, boolean z7, boolean z10, boolean z11, int i11) {
        int i12 = (i11 & 1) != 0 ? 0 : i5;
        int length = (i11 & 2) != 0 ? input.length() : i10;
        boolean z12 = (i11 & 8) != 0 ? false : z5;
        boolean z13 = (i11 & 16) != 0 ? false : z7;
        boolean z14 = (i11 & 64) == 0 ? z11 : false;
        Intrinsics.checkNotNullParameter(input, "<this>");
        Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
        int i13 = i12;
        while (i13 < length) {
            int codePointAt = input.codePointAt(i13);
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && !z14) || StringsKt.B(encodeSet, (char) codePointAt) || ((codePointAt == 37 && (!z12 || (z13 && !c(i13, length, input)))) || (codePointAt == 43 && z10)))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(input, i12, i13);
                Intrinsics.checkNotNullParameter(buffer, "<this>");
                Intrinsics.checkNotNullParameter(input, "input");
                Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
                Buffer buffer2 = null;
                while (i13 < length) {
                    int codePointAt2 = input.codePointAt(i13);
                    if (z12 && (codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        Unit unit = Unit.f19194a;
                    } else {
                        if (codePointAt2 == 32 && encodeSet == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            buffer.writeUtf8("+");
                        } else if (codePointAt2 == 43 && z10) {
                            buffer.writeUtf8(z12 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 >= 32 && codePointAt2 != 127) {
                                if ((codePointAt2 < 128 || z14) && !StringsKt.B(encodeSet, (char) codePointAt2) && (codePointAt2 != 37 || (z12 && (!z13 || c(i13, length, input))))) {
                                    buffer.writeUtf8CodePoint(codePointAt2);
                                    i13 += Character.charCount(codePointAt2);
                                }
                            }
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.writeUtf8CodePoint(codePointAt2);
                            while (!buffer2.exhausted()) {
                                byte readByte = buffer2.readByte();
                                buffer.writeByte(37);
                                char[] cArr = f24944a;
                                buffer.writeByte((int) cArr[((readByte & 255) >> 4) & 15]);
                                buffer.writeByte((int) cArr[readByte & 15]);
                            }
                            Unit unit2 = Unit.f19194a;
                            i13 += Character.charCount(codePointAt2);
                        }
                    }
                    i13 += Character.charCount(codePointAt2);
                }
                return buffer.readUtf8();
            }
            i13 += Character.charCount(codePointAt);
        }
        String substring = input.substring(i12, length);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean c(int i5, int i10, String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = i5 + 2;
        return i11 < i10 && str.charAt(i5) == '%' && e.k(str.charAt(i5 + 1)) != -1 && e.k(str.charAt(i11)) != -1;
    }

    public static String d(String encoded, int i5, int i10, int i11) {
        int i12;
        if ((i11 & 1) != 0) {
            i5 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = encoded.length();
        }
        boolean z5 = (i11 & 4) == 0;
        Intrinsics.checkNotNullParameter(encoded, "<this>");
        int i13 = i5;
        while (i13 < i10) {
            char charAt = encoded.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z5)) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(encoded, i5, i13);
                Intrinsics.checkNotNullParameter(buffer, "<this>");
                Intrinsics.checkNotNullParameter(encoded, "encoded");
                while (i13 < i10) {
                    int codePointAt = encoded.codePointAt(i13);
                    if (codePointAt != 37 || (i12 = i13 + 2) >= i10) {
                        if (codePointAt == 43 && z5) {
                            buffer.writeByte(32);
                            i13++;
                        }
                        buffer.writeUtf8CodePoint(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        int k6 = e.k(encoded.charAt(i13 + 1));
                        int k9 = e.k(encoded.charAt(i12));
                        if (k6 != -1 && k9 != -1) {
                            buffer.writeByte((k6 << 4) + k9);
                            i13 = Character.charCount(codePointAt) + i12;
                        }
                        buffer.writeUtf8CodePoint(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return buffer.readUtf8();
            }
            i13++;
        }
        String substring = encoded.substring(i5, i10);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
