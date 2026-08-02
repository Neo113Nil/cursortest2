package j$.time.format;

/* loaded from: classes2.dex */
public final class h implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17397a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17398b;

    public /* synthetic */ h(int i5, Object obj) {
        this.f17397a = i5;
        this.f17398b = obj;
    }

    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        switch (this.f17397a) {
            case 0:
                Long a7 = yVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (a7 != null) {
                    sb2.append("GMT");
                    int M = j$.com.android.tools.r8.a.M(a7.longValue());
                    if (M != 0) {
                        int abs = Math.abs((M / 3600) % 100);
                        int abs2 = Math.abs((M / 60) % 60);
                        int abs3 = Math.abs(M % 60);
                        sb2.append(M < 0 ? "-" : "+");
                        if (((g0) this.f17398b) == g0.FULL) {
                            a(sb2, abs);
                            sb2.append(':');
                            a(sb2, abs2);
                            if (abs3 != 0) {
                                sb2.append(':');
                                a(sb2, abs3);
                                break;
                            }
                        } else {
                            if (abs >= 10) {
                                sb2.append((char) ((abs / 10) + 48));
                            }
                            sb2.append((char) ((abs % 10) + 48));
                            if (abs2 != 0 || abs3 != 0) {
                                sb2.append(':');
                                a(sb2, abs2);
                                if (abs3 != 0) {
                                    sb2.append(':');
                                    a(sb2, abs3);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sb2.append((String) this.f17398b);
                break;
        }
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        int i10;
        int b10;
        int i11;
        int i12;
        int i13;
        int i14;
        switch (this.f17397a) {
            case 0:
                int length = charSequence.length();
                if (vVar.g(charSequence, i5, "GMT", 0, 3)) {
                    int i15 = i5 + 3;
                    if (i15 == length) {
                        return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i15);
                    }
                    char charAt = charSequence.charAt(i15);
                    if (charAt == '+') {
                        i10 = 1;
                    } else {
                        if (charAt != '-') {
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i15);
                        }
                        i10 = -1;
                    }
                    int i16 = i5 + 4;
                    int i17 = 0;
                    if (((g0) this.f17398b) == g0.FULL) {
                        int i18 = i5 + 5;
                        int b11 = b(charSequence, i16);
                        int i19 = i5 + 6;
                        int b12 = b(charSequence, i18);
                        if (b11 >= 0 && b12 >= 0) {
                            int i20 = i5 + 7;
                            if (charSequence.charAt(i19) == ':') {
                                b10 = (b11 * 10) + b12;
                                int b13 = b(charSequence, i20);
                                i14 = i5 + 9;
                                int b14 = b(charSequence, i5 + 8);
                                if (b13 >= 0 && b14 >= 0) {
                                    i13 = (b13 * 10) + b14;
                                    int i21 = i5 + 11;
                                    if (i21 < length && charSequence.charAt(i14) == ':') {
                                        int b15 = b(charSequence, i5 + 10);
                                        int b16 = b(charSequence, i21);
                                        if (b15 >= 0 && b16 >= 0) {
                                            i17 = (b15 * 10) + b16;
                                            i14 = i5 + 12;
                                        }
                                    }
                                    i11 = i17;
                                    i12 = i14;
                                }
                            }
                        }
                    } else {
                        int i22 = i5 + 5;
                        b10 = b(charSequence, i16);
                        if (b10 >= 0) {
                            if (i22 < length) {
                                int b17 = b(charSequence, i22);
                                if (b17 >= 0) {
                                    b10 = (b10 * 10) + b17;
                                    i22 = i5 + 6;
                                }
                                int i23 = i22 + 2;
                                if (i23 < length && charSequence.charAt(i22) == ':' && i23 < length && charSequence.charAt(i22) == ':') {
                                    int b18 = b(charSequence, i22 + 1);
                                    int b19 = b(charSequence, i23);
                                    if (b18 >= 0 && b19 >= 0) {
                                        i13 = (b18 * 10) + b19;
                                        int i24 = i22 + 3;
                                        int i25 = i22 + 5;
                                        if (i25 < length && charSequence.charAt(i24) == ':') {
                                            int b20 = b(charSequence, i22 + 4);
                                            int b21 = b(charSequence, i25);
                                            if (b20 >= 0 && b21 >= 0) {
                                                i17 = (b20 * 10) + b21;
                                                i14 = i22 + 6;
                                                i11 = i17;
                                                i12 = i14;
                                            }
                                        }
                                        i12 = i24;
                                        i11 = 0;
                                    }
                                }
                            }
                            i11 = 0;
                            i12 = i22;
                            return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i17 * 60) + (b10 * 3600) + i11) * i10, i5, i12);
                        }
                    }
                    i17 = i13;
                    return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i17 * 60) + (b10 * 3600) + i11) * i10, i5, i12);
                }
                return ~i5;
            default:
                String str = (String) this.f17398b;
                if (i5 > charSequence.length() || i5 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !vVar.g(charSequence, i5, str, 0, str.length()) ? ~i5 : str.length() + i5;
        }
    }

    public final String toString() {
        switch (this.f17397a) {
            case 0:
                return "LocalizedOffset(" + ((g0) this.f17398b) + ")";
            default:
                return "'" + ((String) this.f17398b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb2, int i5) {
        sb2.append((char) ((i5 / 10) + 48));
        sb2.append((char) ((i5 % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i5) {
        char charAt = charSequence.charAt(i5);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }
}
