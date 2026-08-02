package sg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class c0 implements og.a {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f23612a = new c0();

    /* renamed from: b, reason: collision with root package name */
    public static final y0 f23613b = new y0("kotlin.time.Instant", qg.e.f22164m);

    @Override // og.a
    public final Object a(rg.b decoder) {
        int i5;
        cg.l b10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j;
        char charAt;
        char charAt2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        io.sentry.hints.j jVar = cg.g.f3925c;
        String input = decoder.s();
        Intrinsics.checkNotNullParameter(input, "input");
        if (input.length() == 0) {
            b10 = new l1.a("An empty string is not a valid Instant", input);
        } else {
            char charAt3 = input.charAt(0);
            if (charAt3 == '+' || charAt3 == '-') {
                i5 = 1;
            } else {
                i5 = 0;
                charAt3 = ' ';
            }
            int i16 = 0;
            int i17 = i5;
            while (i17 < input.length() && '0' <= (charAt2 = input.charAt(i17)) && charAt2 < ':') {
                i16 = (i16 * 10) + (input.charAt(i17) - '0');
                i17++;
            }
            int i18 = i17 - i5;
            if (i18 > 10) {
                b10 = cg.j.c(input, "Expected at most 10 digits for the year number, got " + i18 + " digits");
            } else if (i18 == 10 && Intrinsics.compare((int) input.charAt(i5), 50) >= 0) {
                b10 = cg.j.c(input, "Expected at most 9 digits for the year number or year 1000000000, got " + i18 + " digits");
            } else if (i18 < 4) {
                b10 = cg.j.c(input, "The year number must be padded to 4 digits, got " + i18 + " digits");
            } else if (charAt3 == '+' && i18 == 4) {
                b10 = cg.j.c(input, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 != ' ' || i18 == 4) {
                if (charAt3 == '-') {
                    i16 = -i16;
                }
                int i19 = i17 + 16;
                if (input.length() >= i19) {
                    l1.a b11 = cg.j.b(input, "'-'", i17, new a2.j(11));
                    if (b11 == null) {
                        b10 = cg.j.b(input, "'-'", i17 + 3, new a2.j(12));
                        if (b10 == null && (b10 = cg.j.b(input, "'T' or 't'", i17 + 6, new a2.j(13))) == null && (b10 = cg.j.b(input, "':'", i17 + 9, new a2.j(14))) == null) {
                            char c2 = 15;
                            b10 = cg.j.b(input, "':'", i17 + 12, new a2.j(15));
                            if (b10 == null) {
                                int i20 = 0;
                                while (i20 < 10) {
                                    char c8 = c2;
                                    b11 = cg.j.b(input, "an ASCII digit", cg.j.f3932b[i20] + i17, new a2.j(16));
                                    if (b11 == null) {
                                        i20++;
                                        c2 = c8;
                                    }
                                }
                                int d10 = cg.j.d(i17 + 1, input);
                                int d11 = cg.j.d(i17 + 4, input);
                                int d12 = cg.j.d(i17 + 7, input);
                                int d13 = cg.j.d(i17 + 10, input);
                                int d14 = cg.j.d(i17 + 13, input);
                                int i21 = i17 + 15;
                                if (input.charAt(i21) == '.') {
                                    i21 = i19;
                                    int i22 = 0;
                                    while (i21 < input.length() && '0' <= (charAt = input.charAt(i21)) && charAt < ':') {
                                        i22 = (i22 * 10) + (input.charAt(i21) - '0');
                                        i21++;
                                    }
                                    int i23 = i21 - i19;
                                    if (1 > i23 || i23 >= 10) {
                                        b10 = cg.j.c(input, "1..9 digits are supported for the fraction of the second, got " + i23 + " digits");
                                    } else {
                                        i10 = i22 * cg.j.f3931a[9 - i23];
                                    }
                                } else {
                                    i10 = 0;
                                }
                                if (i21 >= input.length()) {
                                    b10 = cg.j.c(input, "The UTC offset at the end of the string is missing");
                                } else {
                                    char charAt4 = input.charAt(i21);
                                    if (charAt4 == '+' || charAt4 == '-') {
                                        int length = input.length() - i21;
                                        if (length > 9) {
                                            b10 = cg.j.c(input, "The UTC offset string \"" + cg.j.e(16, input.subSequence(i21, input.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            b10 = cg.j.c(input, "Invalid UTC offset string \"" + input.subSequence(i21, input.length()).toString() + '\"');
                                        } else {
                                            int i24 = 0;
                                            for (int i25 = 2; i24 < i25; i25 = 2) {
                                                int i26 = i21 + cg.j.f3933c[i24];
                                                if (i26 >= input.length()) {
                                                    break;
                                                }
                                                if (input.charAt(i26) != ':') {
                                                    StringBuilder r5 = androidx.appcompat.widget.c1.r(i26, "Expected ':' at index ", ", got '");
                                                    r5.append(input.charAt(i26));
                                                    r5.append('\'');
                                                    b10 = cg.j.c(input, r5.toString());
                                                    break;
                                                }
                                                i24++;
                                            }
                                            int i27 = 0;
                                            while (i27 < 6 && (i12 = cg.j.f3934d[i27] + i21) < input.length()) {
                                                char charAt5 = input.charAt(i12);
                                                int i28 = i27;
                                                if ('0' > charAt5 || charAt5 >= ':') {
                                                    StringBuilder r6 = androidx.appcompat.widget.c1.r(i12, "Expected an ASCII digit at index ", ", got '");
                                                    r6.append(input.charAt(i12));
                                                    r6.append('\'');
                                                    b10 = cg.j.c(input, r6.toString());
                                                    break;
                                                }
                                                i27 = i28 + 1;
                                            }
                                            int d15 = cg.j.d(i21 + 1, input);
                                            int d16 = length > 3 ? cg.j.d(i21 + 4, input) : 0;
                                            int d17 = length > 6 ? cg.j.d(i21 + 7, input) : 0;
                                            if (d16 > 59) {
                                                b10 = cg.j.c(input, "Expected offset-minute-of-hour in 0..59, got " + d16);
                                            } else if (d17 > 59) {
                                                b10 = cg.j.c(input, "Expected offset-second-of-minute in 0..59, got " + d17);
                                            } else if (d15 <= 17 || (d15 == 18 && d16 == 0 && d17 == 0)) {
                                                i11 = ((d16 * 60) + (d15 * 3600) + d17) * (charAt4 == '-' ? -1 : 1);
                                                if (1 <= d10 || d10 >= 13) {
                                                    b10 = cg.j.c(input, "Expected a month number in 1..12, got " + d10);
                                                } else {
                                                    if (1 <= d11) {
                                                        int i29 = i16 & 3;
                                                        if (d11 <= (d10 != 2 ? (d10 == 4 || d10 == 6 || d10 == 9 || d10 == 11) ? 30 : 31 : i29 == 0 && (i16 % 100 != 0 || i16 % 400 == 0) ? 29 : 28)) {
                                                            if (d12 > 23) {
                                                                b10 = cg.j.c(input, "Expected hour in 0..23, got " + d12);
                                                            } else if (d13 > 59) {
                                                                b10 = cg.j.c(input, "Expected minute-of-hour in 0..59, got " + d13);
                                                            } else if (d14 > 59) {
                                                                b10 = cg.j.c(input, "Expected second-of-minute in 0..59, got " + d14);
                                                            } else {
                                                                long j6 = i16;
                                                                long j10 = 365 * j6;
                                                                if (j6 >= 0) {
                                                                    i15 = i11;
                                                                    i13 = d14;
                                                                    i14 = i29;
                                                                    j = ((j6 + 399) / 400) + (((3 + j6) / 4) - ((99 + j6) / 100)) + j10;
                                                                } else {
                                                                    i13 = d14;
                                                                    i14 = i29;
                                                                    i15 = i11;
                                                                    j = j10 - ((j6 / (-400)) + ((j6 / (-4)) - (j6 / (-100))));
                                                                }
                                                                long j11 = j + (((d10 * 367) - 362) / 12) + (d11 - 1);
                                                                if (d10 > 2) {
                                                                    j11 = (i14 != 0 || (i16 % 100 == 0 && i16 % 400 != 0)) ? j11 - 2 : (-1) + j11;
                                                                }
                                                                b10 = new cg.k((((j11 - 719528) * 86400) + (((d13 * 60) + (d12 * 3600)) + i13)) - i15, i10);
                                                            }
                                                        }
                                                    }
                                                    b10 = cg.j.c(input, "Expected a valid day-of-month for month " + d10 + " of year " + i16 + ", got " + d11);
                                                }
                                            } else {
                                                b10 = cg.j.c(input, "Expected an offset in -18:00..+18:00, got " + input.subSequence(i21, input.length()).toString());
                                            }
                                        }
                                    } else if (charAt4 == 'Z' || charAt4 == 'z') {
                                        int i30 = i21 + 1;
                                        if (input.length() == i30) {
                                            i11 = 0;
                                            if (1 <= d10) {
                                            }
                                            b10 = cg.j.c(input, "Expected a month number in 1..12, got " + d10);
                                        } else {
                                            b10 = cg.j.c(input, "Extra text after the instant at position " + i30);
                                        }
                                    } else {
                                        b10 = cg.j.c(input, "Expected the UTC offset at position " + i21 + ", got '" + charAt4 + '\'');
                                    }
                                }
                            }
                        }
                    }
                    b10 = b11;
                    break;
                }
                b10 = cg.j.c(input, "The input string is too short");
            } else {
                b10 = cg.j.c(input, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            }
        }
        return b10.toInstant();
    }

    @Override // og.a
    public final void c(ug.s encoder, Object obj) {
        cg.g value = (cg.g) obj;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.r(value.toString());
    }

    @Override // og.a
    public final qg.g d() {
        return f23613b;
    }
}
