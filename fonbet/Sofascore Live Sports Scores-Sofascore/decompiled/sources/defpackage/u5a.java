package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u5a implements KSerializer {
    public static final u5a a = new u5a();
    public static final g7f b = new g7f("kotlin.time.Instant", d7f.n);

    @Override // defpackage.dy4
    public final Object deserialize(Decoder decoder) {
        int i;
        s5a i0;
        int i2;
        int c;
        int i3;
        int i4;
        char charAt;
        char charAt2;
        decoder.getClass();
        o5a o5aVar = o5a.c;
        String z = decoder.z();
        z.getClass();
        if (z.length() == 0) {
            i0 = new tm0("An empty string is not a valid Instant", z, 2, (byte) 0);
        } else {
            char charAt3 = z.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i = 1;
            } else {
                i = 0;
                charAt3 = ' ';
            }
            int i5 = 0;
            int i6 = i;
            while (i6 < z.length() && '0' <= (charAt2 = z.charAt(i6)) && charAt2 < ':') {
                i5 = (i5 * 10) + (z.charAt(i6) - '0');
                i6++;
            }
            int i7 = i6 - i;
            if (i7 > 10) {
                i0 = ml4.j0(z, "Expected at most 10 digits for the year number, got " + i7 + " digits");
            } else if (i7 == 10 && z.charAt(i) >= '2') {
                i0 = ml4.j0(z, "Expected at most 9 digits for the year number or year 1000000000, got " + i7 + " digits");
            } else if (i7 < 4) {
                i0 = ml4.j0(z, "The year number must be padded to 4 digits, got " + i7 + " digits");
            } else if (charAt3 == '+' && i7 == 4) {
                i0 = ml4.j0(z, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i7 == 4) {
                if (charAt3 == '-') {
                    i5 = -i5;
                }
                int i8 = i6 + 16;
                if (z.length() < i8) {
                    i0 = ml4.j0(z, "The input string is too short");
                } else {
                    i0 = ml4.i0(z, i6, "'-'", new yo9(13));
                    if (i0 == null && (i0 = ml4.i0(z, i6 + 3, "'-'", new yo9(14))) == null && (i0 = ml4.i0(z, i6 + 6, "'T' or 't'", new yo9(15))) == null && (i0 = ml4.i0(z, i6 + 9, "':'", new yo9(16))) == null && (i0 = ml4.i0(z, i6 + 12, "':'", new yo9(17))) == null) {
                        int[] iArr = ml4.m;
                        int i9 = 0;
                        while (true) {
                            if (i9 < 10) {
                                tm0 i02 = ml4.i0(z, i6 + iArr[i9], "an ASCII digit", new yo9(18));
                                if (i02 != null) {
                                    i0 = i02;
                                    break;
                                }
                                i9++;
                            } else {
                                int k0 = ml4.k0(i6 + 1, z);
                                int k02 = ml4.k0(i6 + 4, z);
                                int k03 = ml4.k0(i6 + 7, z);
                                int k04 = ml4.k0(i6 + 10, z);
                                int k05 = ml4.k0(i6 + 13, z);
                                int i10 = i6 + 15;
                                if (z.charAt(i10) == '.') {
                                    i10 = i8;
                                    int i11 = 0;
                                    while (i10 < z.length() && '0' <= (charAt = z.charAt(i10)) && charAt < ':') {
                                        i11 = (i11 * 10) + (z.charAt(i10) - '0');
                                        i10++;
                                    }
                                    int i12 = i10 - i8;
                                    if (1 > i12 || i12 >= 10) {
                                        i0 = ml4.j0(z, "1..9 digits are supported for the fraction of the second, got " + i12 + " digits");
                                    } else {
                                        i2 = i11 * ml4.l[9 - i12];
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (i10 >= z.length()) {
                                    i0 = ml4.j0(z, "The UTC offset at the end of the string is missing");
                                } else {
                                    char charAt4 = z.charAt(i10);
                                    if (charAt4 == '+' || charAt4 == '-') {
                                        int length = z.length() - i10;
                                        if (length > 9) {
                                            i0 = ml4.j0(z, "The UTC offset string \"" + ml4.t0(16, z.subSequence(i10, z.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            i0 = ml4.j0(z, "Invalid UTC offset string \"" + z.subSequence(i10, z.length()).toString() + '\"');
                                        } else {
                                            int[] iArr2 = ml4.n;
                                            for (int i13 = 0; i13 < 2 && (i4 = iArr2[i13] + i10) < z.length(); i13++) {
                                                if (z.charAt(i4) != ':') {
                                                    StringBuilder t = lnb.t(i4, "Expected ':' at index ", ", got '");
                                                    t.append(z.charAt(i4));
                                                    t.append('\'');
                                                    i0 = ml4.j0(z, t.toString());
                                                    break;
                                                }
                                            }
                                            int[] iArr3 = ml4.o;
                                            int i14 = 0;
                                            while (i14 < 6 && (i3 = iArr3[i14] + i10) < z.length()) {
                                                char charAt5 = z.charAt(i3);
                                                int[] iArr4 = iArr3;
                                                if ('0' > charAt5 || charAt5 >= ':') {
                                                    StringBuilder t2 = lnb.t(i3, "Expected an ASCII digit at index ", ", got '");
                                                    t2.append(z.charAt(i3));
                                                    t2.append('\'');
                                                    i0 = ml4.j0(z, t2.toString());
                                                    break;
                                                }
                                                i14++;
                                                iArr3 = iArr4;
                                            }
                                            int k06 = ml4.k0(i10 + 1, z);
                                            int k07 = length > 3 ? ml4.k0(i10 + 4, z) : 0;
                                            int k08 = length > 6 ? ml4.k0(i10 + 7, z) : 0;
                                            if (k07 > 59) {
                                                i0 = ml4.j0(z, "Expected offset-minute-of-hour in 0..59, got " + k07);
                                            } else if (k08 > 59) {
                                                i0 = ml4.j0(z, "Expected offset-second-of-minute in 0..59, got " + k08);
                                            } else if (k06 <= 17 || (k06 == 18 && k07 == 0 && k08 == 0)) {
                                                c = bf3.c(k07, 60, k06 * 3600, k08) * (charAt4 == '-' ? -1 : 1);
                                                if (1 <= k0 || k0 >= 13) {
                                                    i0 = ml4.j0(z, "Expected a month number in 1..12, got " + k0);
                                                } else {
                                                    if (1 <= k02) {
                                                        int i15 = i5 & 3;
                                                        if (k02 <= (k0 != 2 ? (k0 == 4 || k0 == 6 || k0 == 9 || k0 == 11) ? 30 : 31 : i15 == 0 && (i5 % 100 != 0 || i5 % 400 == 0) ? 29 : 28)) {
                                                            if (k03 > 23) {
                                                                i0 = ml4.j0(z, "Expected hour in 0..23, got " + k03);
                                                            } else if (k04 > 59) {
                                                                i0 = ml4.j0(z, "Expected minute-of-hour in 0..59, got " + k04);
                                                            } else if (k05 > 59) {
                                                                i0 = ml4.j0(z, "Expected second-of-minute in 0..59, got " + k05);
                                                            } else {
                                                                long j = i5;
                                                                long j2 = 365 * j;
                                                                long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + (((k0 * 367) - 362) / 12) + (k02 - 1);
                                                                if (k0 > 2) {
                                                                    j3 = (i15 != 0 || (i5 % 100 == 0 && i5 % 400 != 0)) ? j3 - 2 : (-1) + j3;
                                                                }
                                                                i0 = new r5a((((j3 - 719528) * 86400) + bf3.c(k04, 60, k03 * 3600, k05)) - c, i2);
                                                            }
                                                        }
                                                    }
                                                    StringBuilder s = lnb.s(k0, i5, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                    s.append(k02);
                                                    i0 = ml4.j0(z, s.toString());
                                                }
                                            } else {
                                                i0 = ml4.j0(z, "Expected an offset in -18:00..+18:00, got " + z.subSequence(i10, z.length()).toString());
                                            }
                                        }
                                    } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                        int i16 = i10 + 1;
                                        if (z.length() == i16) {
                                            c = 0;
                                            if (1 <= k0) {
                                            }
                                            i0 = ml4.j0(z, "Expected a month number in 1..12, got " + k0);
                                        } else {
                                            i0 = ml4.j0(z, "Extra text after the instant at position " + i16);
                                        }
                                    } else {
                                        i0 = ml4.j0(z, "Expected the UTC offset at position " + i10 + ", got '" + charAt4 + '\'');
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                i0 = ml4.j0(z, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return i0.toInstant();
    }

    @Override // defpackage.dy4
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o5a o5aVar = (o5a) obj;
        encoder.getClass();
        o5aVar.getClass();
        encoder.F(o5aVar.toString());
    }
}
