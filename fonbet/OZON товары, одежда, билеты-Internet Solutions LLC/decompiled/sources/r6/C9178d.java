package r6;

/* renamed from: r6.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9178d {

    /* renamed from: b, reason: collision with root package name */
    private static final float[] f82931b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};

    /* renamed from: c, reason: collision with root package name */
    private static final float[] f82932c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* renamed from: a, reason: collision with root package name */
    private int f82933a;

    final int a() {
        return this.f82933a;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x008a A[EDGE_INSN: B:117:0x008a->B:47:0x008a BREAK  A[LOOP:0: B:10:0x0034->B:17:0x0083], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final float b(int i11, int i12, String str) {
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        float f7;
        char charAt;
        int i18;
        boolean z13;
        boolean z14;
        char charAt2;
        this.f82933a = i11;
        if (i11 >= i12) {
            return Float.NaN;
        }
        char charAt3 = str.charAt(i11);
        if (charAt3 == '+') {
            z11 = false;
        } else {
            if (charAt3 != '-') {
                z11 = false;
                int i19 = this.f82933a;
                long j11 = 0;
                i13 = 0;
                i14 = 0;
                int i21 = 0;
                z12 = false;
                int i22 = 0;
                while (true) {
                    i15 = this.f82933a;
                    if (i15 >= i12) {
                        break;
                    }
                    char charAt4 = str.charAt(i15);
                    if (charAt4 == '0') {
                        if (i13 == 0) {
                            i21++;
                        } else {
                            i14++;
                        }
                    } else if (charAt4 >= '1' && charAt4 <= '9') {
                        int i23 = i13 + i14;
                        while (i14 > 0) {
                            if (j11 > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j11 *= 10;
                            i14--;
                        }
                        if (j11 > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j11 = (j11 * 10) + (charAt4 - '0');
                        i13 = i23 + 1;
                        if (j11 < 0) {
                            return Float.NaN;
                        }
                    } else {
                        if (charAt4 != '.' || z12) {
                            break;
                        }
                        i22 = this.f82933a - i19;
                        z12 = true;
                    }
                    this.f82933a++;
                }
                if (!z12 && this.f82933a == i22 + 1) {
                    return Float.NaN;
                }
                if (i13 == 0) {
                    if (i21 == 0) {
                        return Float.NaN;
                    }
                    i13 = 1;
                }
                if (z12) {
                    i14 = (i22 - i21) - i13;
                }
                i16 = this.f82933a;
                if (i16 < i12 && ((charAt = str.charAt(i16)) == 'E' || charAt == 'e')) {
                    i18 = this.f82933a + 1;
                    this.f82933a = i18;
                    if (i18 != i12) {
                        return Float.NaN;
                    }
                    char charAt5 = str.charAt(i18);
                    if (charAt5 == '+') {
                        z13 = false;
                    } else if (charAt5 != '-') {
                        switch (charAt5) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z13 = false;
                                z14 = false;
                                break;
                            default:
                                this.f82933a--;
                                z14 = true;
                                z13 = false;
                                break;
                        }
                        if (!z14) {
                            int i24 = this.f82933a;
                            int i25 = 0;
                            while (true) {
                                int i26 = this.f82933a;
                                if (i26 < i12 && (charAt2 = str.charAt(i26)) >= '0' && charAt2 <= '9') {
                                    if (i25 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i25 = (i25 * 10) + (charAt2 - '0');
                                    this.f82933a++;
                                }
                            }
                            if (this.f82933a == i24) {
                                return Float.NaN;
                            }
                            i14 = z13 ? i14 - i25 : i14 + i25;
                        }
                    } else {
                        z13 = true;
                    }
                    this.f82933a++;
                    z14 = false;
                    if (!z14) {
                    }
                }
                i17 = i13 + i14;
                if (i17 <= 39 || i17 < -44) {
                    return Float.NaN;
                }
                float f11 = j11;
                if (j11 != 0) {
                    if (i14 > 0) {
                        f7 = f82931b[i14];
                    } else if (i14 < 0) {
                        if (i14 < -38) {
                            f11 = (float) (f11 * 1.0E-20d);
                            i14 += 20;
                        }
                        f7 = f82932c[-i14];
                    }
                    f11 *= f7;
                }
                return z11 ? -f11 : f11;
            }
            z11 = true;
        }
        this.f82933a++;
        int i192 = this.f82933a;
        long j112 = 0;
        i13 = 0;
        i14 = 0;
        int i212 = 0;
        z12 = false;
        int i222 = 0;
        while (true) {
            i15 = this.f82933a;
            if (i15 >= i12) {
            }
            this.f82933a++;
        }
        if (!z12) {
        }
        if (i13 == 0) {
        }
        if (z12) {
        }
        i16 = this.f82933a;
        if (i16 < i12) {
            i18 = this.f82933a + 1;
            this.f82933a = i18;
            if (i18 != i12) {
            }
        }
        i17 = i13 + i14;
        if (i17 <= 39) {
        }
        return Float.NaN;
    }
}
