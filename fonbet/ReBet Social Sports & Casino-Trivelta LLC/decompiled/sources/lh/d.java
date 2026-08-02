package lh;

import com.plaid.internal.EnumC3631g;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;
import kotlin.UShort;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes3.dex */
public abstract class d {
    public static final int a(char c10, char c11) {
        return ((c10 - 55232) << 10) | (c11 - CharCompanionObject.MIN_LOW_SURROGATE);
    }

    public static final int b(ByteBuffer encodeUTF8, CharSequence text, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(encodeUTF8, "$this$encodeUTF8");
        Intrinsics.checkNotNullParameter(text, "text");
        int min = Math.min(i11, i10 + 65535);
        int coerceAtMost = RangesKt.coerceAtMost(i13, 65535);
        int i14 = i10;
        int i15 = i12;
        while (i15 < coerceAtMost && i14 < min) {
            int i16 = i14 + 1;
            char charAt = text.charAt(i14);
            int i17 = charAt & CharCompanionObject.MAX_VALUE;
            if ((charAt & 65408) != 0) {
                return c(encodeUTF8, text, i14, min, i10, i15, coerceAtMost, i12);
            }
            encodeUTF8.put(i15, (byte) i17);
            i14 = i16;
            i15++;
        }
        return b.d(UShort.m428constructorimpl((short) (i14 - i10)), UShort.m428constructorimpl((short) (i15 - i12)));
    }

    public static final int c(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18 = i14 - 3;
        while (i18 - i13 > 0 && i10 < i11) {
            int i19 = i10 + 1;
            char charAt = charSequence.charAt(i10);
            if (!Character.isHighSurrogate(charAt)) {
                i10 = i19;
                i16 = charAt;
            } else if (i19 == i11 || !Character.isLowSurrogate(charSequence.charAt(i19))) {
                i10 = i19;
                i16 = 63;
            } else {
                i10 += 2;
                i16 = a(charAt, charSequence.charAt(i19));
            }
            if (i16 >= 0 && i16 < 128) {
                byteBuffer.put(i13, (byte) i16);
                i17 = 1;
            } else if (128 <= i16 && i16 < 2048) {
                byteBuffer.put(i13, (byte) (((i16 >> 6) & 31) | 192));
                byteBuffer.put(i13 + 1, (byte) (128 | (i16 & 63)));
                i17 = 2;
            } else if (2048 <= i16 && i16 < 65536) {
                byteBuffer.put(i13, (byte) (((i16 >> 12) & 15) | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE));
                byteBuffer.put(i13 + 1, (byte) ((63 & (i16 >> 6)) | 128));
                byteBuffer.put(i13 + 2, (byte) (128 | (i16 & 63)));
                i17 = 3;
            } else {
                if (65536 > i16 || i16 >= 1114112) {
                    j(i16);
                    throw new KotlinNothingValueException();
                }
                byteBuffer.put(i13, (byte) (((i16 >> 18) & 7) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i13 + 1, (byte) (((i16 >> 12) & 63) | 128));
                byteBuffer.put(i13 + 2, (byte) ((63 & (i16 >> 6)) | 128));
                byteBuffer.put(i13 + 3, (byte) (128 | (i16 & 63)));
                i17 = 4;
            }
            i13 += i17;
        }
        return i13 == i18 ? d(byteBuffer, charSequence, i10, i11, i12, i13, i14, i15) : b.d(UShort.m428constructorimpl((short) (i10 - i12)), UShort.m428constructorimpl((short) (i13 - i15)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00fd, code lost:
    
        return lh.b.d(kotlin.UShort.m428constructorimpl((short) (r3 - r20)), kotlin.UShort.m428constructorimpl((short) (r4 - r23)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
    
        j(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int d(ByteBuffer byteBuffer, CharSequence charSequence, int i10, int i11, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18;
        int i19 = i10;
        int i20 = i13;
        while (true) {
            int i21 = i14 - i20;
            if (i21 <= 0 || i19 >= i11) {
                break;
            }
            int i22 = i19 + 1;
            char charAt = charSequence.charAt(i19);
            if (!Character.isHighSurrogate(charAt)) {
                i19 = i22;
                i16 = charAt;
            } else if (i22 == i11 || !Character.isLowSurrogate(charSequence.charAt(i22))) {
                i19 = i22;
                i16 = 63;
            } else {
                i19 += 2;
                i16 = a(charAt, charSequence.charAt(i22));
            }
            if (1 <= i16 && i16 < 128) {
                i17 = 1;
            } else if (128 <= i16 && i16 < 2048) {
                i17 = 2;
            } else if (2048 <= i16 && i16 < 65536) {
                i17 = 3;
            } else {
                if (65536 > i16 || i16 >= 1114112) {
                    break;
                }
                i17 = 4;
            }
            if (i17 > i21) {
                i19--;
                break;
            }
            if (i16 >= 0 && i16 < 128) {
                byteBuffer.put(i20, (byte) i16);
                i18 = 1;
            } else if (128 <= i16 && i16 < 2048) {
                byteBuffer.put(i20, (byte) (((i16 >> 6) & 31) | 192));
                byteBuffer.put(i20 + 1, (byte) ((i16 & 63) | 128));
                i18 = 2;
            } else if (2048 <= i16 && i16 < 65536) {
                byteBuffer.put(i20, (byte) (((i16 >> 12) & 15) | EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE));
                byteBuffer.put(i20 + 1, (byte) (((i16 >> 6) & 63) | 128));
                byteBuffer.put(i20 + 2, (byte) ((i16 & 63) | 128));
                i18 = 3;
            } else {
                if (65536 > i16 || i16 >= 1114112) {
                    break;
                }
                byteBuffer.put(i20, (byte) (((i16 >> 18) & 7) | EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                byteBuffer.put(i20 + 1, (byte) (((i16 >> 12) & 63) | 128));
                byteBuffer.put(i20 + 2, (byte) (((i16 >> 6) & 63) | 128));
                byteBuffer.put(i20 + 3, (byte) ((i16 & 63) | 128));
                i18 = 4;
            }
            i20 += i18;
        }
        j(i16);
        throw new KotlinNothingValueException();
    }

    public static final int e(int i10) {
        return (i10 >>> 10) + 55232;
    }

    public static final boolean f(int i10) {
        return (i10 >>> 16) == 0;
    }

    public static final boolean g(int i10) {
        return i10 <= 1114111;
    }

    public static final int h(int i10) {
        return (i10 & 1023) + 56320;
    }

    public static final Void i(int i10) {
        throw new c("Expected " + i10 + " more character bytes");
    }

    public static final Void j(int i10) {
        throw new IllegalArgumentException("Malformed code-point " + i10 + " found");
    }
}
