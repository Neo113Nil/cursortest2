package kotlin.text;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public class y extends x {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e(String str) {
        char c2;
        boolean z5;
        boolean z7;
        int charAt;
        int i5;
        boolean z10;
        boolean z11;
        boolean z12 = true;
        int length = str.length() - 1;
        int i10 = 0;
        while (true) {
            c2 = ' ';
            if (i10 > length || str.charAt(i10) > ' ') {
                break;
            }
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        while (length > i10 && str.charAt(length) <= ' ') {
            length--;
        }
        if (str.charAt(i10) == '+' || str.charAt(i10) == '-') {
            i10++;
        }
        if (i10 > length) {
            return false;
        }
        if (str.charAt(i10) == '0') {
            int i11 = i10 + 1;
            if (i11 > length) {
                return true;
            }
            if ((str.charAt(i11) | ' ') == 120) {
                int i12 = i10 + 2;
                int i13 = i12;
                while (true) {
                    if (i13 > length) {
                        z5 = z12;
                        break;
                    }
                    z5 = z12;
                    if (((str.charAt(i13) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                        break;
                    }
                    i13++;
                    z12 = z5;
                }
                boolean z13 = i12 != i13 ? z5 : false;
                if (i13 <= length) {
                    if (str.charAt(i13) == '.') {
                        int i14 = i13 + 1;
                        int i15 = i14;
                        while (i15 <= length) {
                            char c8 = c2;
                            if (((str.charAt(i15) - '0') & 65535) >= 10 && (((r15 | ' ') - 97) & 65535) >= 6) {
                                break;
                            }
                            i15++;
                            c2 = c8;
                        }
                        z11 = i14 != i15 ? z5 : false;
                        i13 = i15;
                    } else {
                        z11 = false;
                    }
                    if (z13 || z11) {
                        i10 = i13;
                        if (i10 != -1 || i10 > length) {
                            return false;
                        }
                        z7 = z5;
                        if (!z7) {
                            int i16 = i10;
                            while (i16 <= length && ((str.charAt(i16) - '0') & 65535) < 10) {
                                i16++;
                            }
                            boolean z14 = i10 != i16 ? z5 : false;
                            if (i16 > length) {
                                i10 = i16;
                            } else {
                                if (str.charAt(i16) == '.') {
                                    int i17 = i16 + 1;
                                    i5 = i17;
                                    while (i5 <= length && ((str.charAt(i5) - '0') & 65535) < 10) {
                                        i5++;
                                    }
                                    if (i17 != i5) {
                                        z10 = z5;
                                        if (!z14 || z10) {
                                            i10 = i5;
                                        } else {
                                            String str2 = length == i5 + 2 ? "NaN" : length == i5 + 7 ? "Infinity" : null;
                                            i10 = (str2 != null && StringsKt.E(i5, str, str2, false) == i5) ? length + 1 : -1;
                                        }
                                    }
                                } else {
                                    i5 = i16;
                                }
                                z10 = false;
                                if (z14) {
                                }
                                i10 = i5;
                            }
                            if (i10 == -1) {
                                return false;
                            }
                            if (i10 > length) {
                                return z5;
                            }
                        }
                        int i18 = i10 + 1;
                        charAt = str.charAt(i10) | ' ';
                        if (charAt == (!z7 ? 112 : 101)) {
                            if (z7 || (!(charAt == 102 || charAt == 100) || i18 <= length)) {
                                return false;
                            }
                            return z5;
                        }
                        if (i18 > length) {
                            return false;
                        }
                        if ((str.charAt(i18) == '+' || str.charAt(i18) == '-') && (i18 = i10 + 2) > length) {
                            return false;
                        }
                        while (i18 <= length && ((str.charAt(i18) - '0') & 65535) < 10) {
                            i18++;
                        }
                        if (i18 > length) {
                            return z5;
                        }
                        if (i18 != length) {
                            return false;
                        }
                        int charAt2 = str.charAt(i18) | ' ';
                        if (charAt2 == 102 || charAt2 == 100) {
                            return z5;
                        }
                        return false;
                    }
                }
                i10 = -1;
                if (i10 != -1) {
                }
                return false;
            }
        }
        z5 = true;
        z7 = false;
        if (!z7) {
        }
        int i182 = i10 + 1;
        charAt = str.charAt(i10) | ' ';
        if (charAt == (!z7 ? 112 : 101)) {
        }
    }
}
