package j$.time.format;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class j implements e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f17412d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    public static final j f17413e = new j("+HH:MM:ss", "Z");

    /* renamed from: f, reason: collision with root package name */
    public static final j f17414f = new j("+HH:MM:ss", CommonUrlParts.Values.FALSE_INTEGER);

    /* renamed from: a, reason: collision with root package name */
    public final String f17415a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17416b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17417c;

    public j(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        Objects.requireNonNull(str2, "noOffsetText");
        for (int i5 = 0; i5 < 22; i5++) {
            if (f17412d[i5].equals(str)) {
                this.f17416b = i5;
                this.f17417c = i5 % 11;
                this.f17415a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: " + str);
    }

    @Override // j$.time.format.e
    public final boolean i(y yVar, StringBuilder sb2) {
        Long a7 = yVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z5 = false;
        if (a7 == null) {
            return false;
        }
        int M = j$.com.android.tools.r8.a.M(a7.longValue());
        String str = this.f17415a;
        if (M == 0) {
            sb2.append(str);
            return true;
        }
        int abs = Math.abs((M / 3600) % 100);
        int abs2 = Math.abs((M / 60) % 60);
        int abs3 = Math.abs(M % 60);
        int length = sb2.length();
        sb2.append(M < 0 ? "-" : "+");
        if (this.f17416b < 11 || abs >= 10) {
            a(false, abs, sb2);
        } else {
            sb2.append((char) (abs + 48));
        }
        int i5 = this.f17417c;
        if ((i5 >= 3 && i5 <= 8) || ((i5 >= 9 && abs3 > 0) || (i5 >= 1 && abs2 > 0))) {
            a(i5 > 0 && i5 % 2 == 0, abs2, sb2);
            abs += abs2;
            if (i5 == 7 || i5 == 8 || (i5 >= 5 && abs3 > 0)) {
                if (i5 > 0 && i5 % 2 == 0) {
                    z5 = true;
                }
                a(z5, abs3, sb2);
                abs += abs3;
            }
        }
        if (abs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z5, int i5, StringBuilder sb2) {
        sb2.append(z5 ? StringUtils.PROCESS_POSTFIX_DELIMITER : "");
        sb2.append((char) ((i5 / 10) + 48));
        sb2.append((char) ((i5 % 10) + 48));
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i5) {
        CharSequence charSequence2;
        int i10;
        int i11;
        int i12;
        int i13;
        int length = charSequence.length();
        int length2 = this.f17415a.length();
        if (length2 == 0) {
            if (i5 == length) {
                return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i5);
            }
            charSequence2 = charSequence;
        } else {
            if (i5 == length) {
                return ~i5;
            }
            charSequence2 = charSequence;
            if (vVar.g(charSequence2, i5, this.f17415a, 0, length2)) {
                return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i5 + length2);
            }
        }
        char charAt = charSequence.charAt(i5);
        if (charAt == '+' || charAt == '-') {
            int i14 = charAt == '-' ? -1 : 1;
            int i15 = this.f17417c;
            boolean z5 = i15 > 0 && i15 % 2 == 0;
            int i16 = this.f17416b;
            boolean z7 = i16 < 11;
            int[] iArr = new int[4];
            iArr[0] = i5 + 1;
            if (!vVar.f17460c) {
                if (z7) {
                    if (z5 || (i16 == 0 && length > (i13 = i5 + 3) && charSequence2.charAt(i13) == ':')) {
                        i16 = 10;
                        z5 = true;
                    } else {
                        i16 = 9;
                    }
                } else if (z5 || (i16 == 11 && length > (i12 = i5 + 3) && (charSequence2.charAt(i5 + 2) == ':' || charSequence2.charAt(i12) == ':'))) {
                    i16 = 21;
                    z5 = true;
                } else {
                    i16 = 20;
                }
            }
            switch (i16) {
                case 0:
                case 11:
                    c(charSequence2, z7, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    c(charSequence2, z7, iArr);
                    d(charSequence2, z5, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    c(charSequence2, z7, iArr);
                    d(charSequence2, z5, true, iArr);
                    break;
                case 5:
                case 6:
                case 17:
                    c(charSequence2, z7, iArr);
                    d(charSequence2, z5, true, iArr);
                    b(charSequence2, z5, 3, iArr);
                    break;
                case 7:
                case 8:
                case 19:
                    c(charSequence2, z7, iArr);
                    d(charSequence2, z5, true, iArr);
                    if (!b(charSequence2, z5, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case 21:
                    c(charSequence2, z7, iArr);
                    if (b(charSequence2, z5, 2, iArr)) {
                        b(charSequence2, z5, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    e(charSequence2, 3, 6, iArr);
                    break;
                case 18:
                    e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i17 = iArr[0];
            if (i17 > 0) {
                int i18 = iArr[1];
                if (i18 > 23 || (i10 = iArr[2]) > 59 || (i11 = iArr[3]) > 59) {
                    throw new j$.time.b("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return vVar.f(j$.time.temporal.a.OFFSET_SECONDS, ((i10 * 60) + (i18 * 3600) + i11) * i14, i5, i17);
            }
        }
        return length2 == 0 ? vVar.f(j$.time.temporal.a.OFFSET_SECONDS, 0L, i5, i5) : ~i5;
    }

    public static void c(CharSequence charSequence, boolean z5, int[] iArr) {
        if (z5) {
            if (b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        e(charSequence, 1, 2, iArr);
    }

    public static void d(CharSequence charSequence, boolean z5, boolean z7, int[] iArr) {
        if (b(charSequence, z5, 2, iArr) || !z7) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    public static boolean b(CharSequence charSequence, boolean z5, int i5, int[] iArr) {
        int i10 = iArr[0];
        if (i10 < 0) {
            return true;
        }
        if (z5 && i5 != 1) {
            int i11 = i10 + 1;
            if (i11 <= charSequence.length() && charSequence.charAt(i10) == ':') {
                i10 = i11;
            }
            return false;
        }
        int i12 = i10 + 2;
        if (i12 <= charSequence.length()) {
            int i13 = i10 + 1;
            char charAt = charSequence.charAt(i10);
            char charAt2 = charSequence.charAt(i13);
            if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
                int i14 = (charAt2 - '0') + ((charAt - '0') * 10);
                if (i14 >= 0 && i14 <= 59) {
                    iArr[i5] = i14;
                    iArr[0] = i12;
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        r12[0] = ~r12[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(CharSequence charSequence, int i5, int i10, int[] iArr) {
        int i11;
        char charAt;
        int i12 = iArr[0];
        char[] cArr = new char[i10];
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10 && (i11 = i12 + 1) <= charSequence.length() && (charAt = charSequence.charAt(i12)) >= '0' && charAt <= '9') {
            cArr[i13] = charAt;
            i14++;
            i13++;
            i12 = i11;
        }
        switch (i14) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i12;
    }

    public final String toString() {
        String replace = this.f17415a.replace("'", "''");
        return "Offset(" + f17412d[this.f17416b] + ",'" + replace + "')";
    }
}
