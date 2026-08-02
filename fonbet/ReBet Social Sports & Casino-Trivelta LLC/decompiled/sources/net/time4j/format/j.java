package net.time4j.format;

import io.agora.rtc2.video.FaceShapeAreaOptions;
import java.util.Locale;
import li.AbstractC5469c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public abstract class j {
    private static final /* synthetic */ j[] $VALUES;
    private static final int[] D_FACTORS;
    private static final String[] LETTERS;
    private static final int[] NUMBERS;

    /* renamed from: a, reason: collision with root package name */
    public static final j f58081a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f58082b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f58083c;

    /* renamed from: d, reason: collision with root package name */
    public static final j f58084d;

    /* renamed from: e, reason: collision with root package name */
    public static final j f58085e;

    /* renamed from: f, reason: collision with root package name */
    public static final j f58086f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f58087g;

    /* renamed from: h, reason: collision with root package name */
    public static final j f58088h;

    /* renamed from: i, reason: collision with root package name */
    public static final j f58089i;

    /* renamed from: j, reason: collision with root package name */
    public static final j f58090j;

    /* renamed from: k, reason: collision with root package name */
    public static final j f58091k;

    /* renamed from: l, reason: collision with root package name */
    public static final j f58092l;

    /* renamed from: m, reason: collision with root package name */
    public static final j f58093m;

    /* renamed from: n, reason: collision with root package name */
    public static final j f58094n;

    /* renamed from: o, reason: collision with root package name */
    public static final j f58095o;
    private final String code;

    public enum g extends j {
        public g(String str, int i10, String str2) {
            super(str, i10, str2, null);
        }

        @Override // net.time4j.format.j
        public boolean h(char c10) {
            return c10 >= '0' && c10 <= '9';
        }

        @Override // net.time4j.format.j
        public String j() {
            return "0123456789";
        }

        @Override // net.time4j.format.j
        public boolean l() {
            return true;
        }

        @Override // net.time4j.format.j
        public int n(String str, net.time4j.format.g gVar) {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0) {
                return parseInt;
            }
            throw new NumberFormatException("Cannot convert negative number: " + str);
        }

        @Override // net.time4j.format.j
        public String p(int i10) {
            if (i10 >= 0) {
                return Integer.toString(i10);
            }
            throw new IllegalArgumentException("Cannot convert: " + i10);
        }
    }

    static {
        g gVar = new g("ARABIC", 0, "latn");
        f58081a = gVar;
        j jVar = new j("ARABIC_INDIC", 1, "arab") { // from class: net.time4j.format.j.h
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "٠١٢٣٤٥٦٧٨٩";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58082b = jVar;
        j jVar2 = new j("ARABIC_INDIC_EXT", 2, "arabext") { // from class: net.time4j.format.j.i
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "۰۱۲۳۴۵۶۷۸۹";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58083c = jVar2;
        j jVar3 = new j("BENGALI", 3, "beng") { // from class: net.time4j.format.j.j
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "০১২৩৪৫৬৭৮৯";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58084d = jVar3;
        j jVar4 = new j("DEVANAGARI", 4, "deva") { // from class: net.time4j.format.j.k
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "०१२३४५६७८९";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58085e = jVar4;
        j jVar5 = new j("DOZENAL", 5, "dozenal") { // from class: net.time4j.format.j.l
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean h(char c10) {
                return (c10 >= '0' && c10 <= '9') || c10 == 8586 || c10 == 8587;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "0123456789↊↋";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return false;
            }

            @Override // net.time4j.format.j
            public int n(String str, net.time4j.format.g gVar2) {
                int parseInt = Integer.parseInt(str.replace((char) 8586, 'a').replace((char) 8587, 'b'), 12);
                if (parseInt >= 0) {
                    return parseInt;
                }
                throw new NumberFormatException("Cannot convert negative number: " + str);
            }

            @Override // net.time4j.format.j
            public int o(int i10, Appendable appendable) {
                if (i10 >= 0) {
                    int i11 = 1;
                    while (true) {
                        if (i11 > 4) {
                            i11 = 0;
                            break;
                        }
                        if (i10 < j.D_FACTORS[i11]) {
                            break;
                        }
                        i11++;
                    }
                    if (i11 > 0) {
                        int i12 = i11 - 1;
                        do {
                            int i13 = i10 / j.D_FACTORS[i12];
                            appendable.append(i13 == 11 ? (char) 8587 : i13 == 10 ? (char) 8586 : (char) (i13 + 48));
                            i10 -= i13 * j.D_FACTORS[i12];
                            i12--;
                        } while (i12 >= 0);
                        return i11;
                    }
                }
                return super.o(i10, appendable);
            }

            @Override // net.time4j.format.j
            public String p(int i10) {
                if (i10 >= 0) {
                    return Integer.toString(i10, 12).replace('a', (char) 8586).replace('b', (char) 8587);
                }
                throw new IllegalArgumentException("Cannot convert: " + i10);
            }
        };
        f58086f = jVar5;
        j jVar6 = new j("ETHIOPIC", 6, "ethiopic") { // from class: net.time4j.format.j.m
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean h(char c10) {
                return c10 >= 4969 && c10 <= 4988;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "፩፪፫፬፭፮፯፰፱፲፳፴፵፶፷፸፹፺፻፼";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return false;
            }

            @Override // net.time4j.format.j
            public int n(String str, net.time4j.format.g gVar2) {
                int i10;
                int i11 = 1;
                boolean z10 = false;
                boolean z11 = false;
                int i12 = 0;
                int i13 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt >= 4969 && charAt < 4978) {
                        i10 = charAt - 4968;
                    } else if (charAt < 4978 || charAt >= 4987) {
                        if (charAt == 4988) {
                            if (z10 && i13 == 0) {
                                i13 = 1;
                            }
                            i12 = j.g(i12, i13, i11);
                            i11 = z10 ? i11 * 100 : i11 * 10000;
                            z11 = true;
                            z10 = false;
                            i13 = 0;
                        } else if (charAt == 4987) {
                            i12 = j.g(i12, i13, i11);
                            i11 *= 100;
                            z10 = true;
                            z11 = false;
                            i13 = 0;
                        }
                    } else {
                        i10 = (charAt - 4977) * 10;
                    }
                    i13 += i10;
                }
                return j.g(i12, ((z10 || z11) && i13 == 0) ? 1 : i13, i11);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[SYNTHETIC] */
            @Override // net.time4j.format.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public String p(int i10) {
                char c10;
                if (i10 < 1) {
                    throw new IllegalArgumentException("Can only convert positive numbers: " + i10);
                }
                String valueOf = String.valueOf(i10);
                int length = valueOf.length();
                int i11 = length - 1;
                if (i11 % 2 == 0) {
                    valueOf = "0" + valueOf;
                } else {
                    length = i11;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i12 = length; i12 >= 0; i12 -= 2) {
                    char charAt = valueOf.charAt(length - i12);
                    int i13 = i12 - 1;
                    char charAt2 = valueOf.charAt(length - i13);
                    char c11 = 0;
                    char c12 = charAt2 != '0' ? (char) (charAt2 + 4920) : (char) 0;
                    char c13 = charAt != '0' ? (char) (charAt + 4929) : (char) 0;
                    int i14 = (i13 % 4) / 2;
                    if (i13 != 0) {
                        if (i14 == 0) {
                            c10 = 4988;
                        } else if (c12 != 0 || c13 != 0) {
                            c10 = 4987;
                        }
                        if (c12 == 4969 || c13 != 0 || length <= 1 || (c10 != 4987 && i12 != length)) {
                            c11 = c12;
                        }
                        if (c13 != 0) {
                            sb2.append(c13);
                        }
                        if (c11 != 0) {
                            sb2.append(c11);
                        }
                        if (c10 == 0) {
                            sb2.append(c10);
                        }
                    }
                    c10 = 0;
                    if (c12 == 4969) {
                    }
                    c11 = c12;
                    if (c13 != 0) {
                    }
                    if (c11 != 0) {
                    }
                    if (c10 == 0) {
                    }
                }
                return sb2.toString();
            }
        };
        f58087g = jVar6;
        j jVar7 = new j("GUJARATI", 7, "gujr") { // from class: net.time4j.format.j.n
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "૦૧૨૩૪૫૬૭૮૯";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58088h = jVar7;
        j jVar8 = new j("JAPANESE", 8, "jpan") { // from class: net.time4j.format.j.o
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "一二三四五六七八九十百千";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return false;
            }

            @Override // net.time4j.format.j
            public int n(String str, net.time4j.format.g gVar2) {
                boolean z10;
                String j10 = j();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                for (int length = str.length() - 1; length >= 0; length--) {
                    char charAt = str.charAt(length);
                    if (charAt == 21313) {
                        if (i10 != 0 || i12 != 0 || i13 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                        i10++;
                    } else if (charAt == 21315) {
                        if (i13 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                        i13++;
                    } else if (charAt != 30334) {
                        int i14 = 0;
                        while (true) {
                            if (i14 >= 9) {
                                z10 = false;
                                break;
                            }
                            if (j10.charAt(i14) == charAt) {
                                int i15 = i14 + 1;
                                if (i13 == 1) {
                                    i11 += i15 * 1000;
                                    i13 = -1;
                                } else if (i12 == 1) {
                                    i11 += i15 * 100;
                                    i12 = -1;
                                } else if (i10 == 1) {
                                    i11 += i15 * 10;
                                    i10 = -1;
                                } else {
                                    i11 += i15;
                                }
                                z10 = true;
                            } else {
                                i14++;
                            }
                        }
                        if (!z10) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                    } else {
                        if (i12 != 0 || i13 != 0) {
                            throw new IllegalArgumentException("Invalid Japanese numeral: " + str);
                        }
                        i12++;
                    }
                }
                if (i10 == 1) {
                    i11 += 10;
                }
                if (i12 == 1) {
                    i11 += 100;
                }
                return i13 == 1 ? i11 + 1000 : i11;
            }

            @Override // net.time4j.format.j
            public String p(int i10) {
                if (i10 < 1 || i10 > 9999) {
                    throw new IllegalArgumentException("Cannot convert: " + i10);
                }
                String j10 = j();
                int i11 = i10 / 1000;
                int i12 = i10 % 1000;
                int i13 = i12 / 100;
                int i14 = i12 % 100;
                int i15 = i14 / 10;
                int i16 = i14 % 10;
                StringBuilder sb2 = new StringBuilder();
                if (i11 >= 1) {
                    if (i11 > 1) {
                        sb2.append(j10.charAt(i11 - 1));
                    }
                    sb2.append((char) 21315);
                }
                if (i13 >= 1) {
                    if (i13 > 1) {
                        sb2.append(j10.charAt(i13 - 1));
                    }
                    sb2.append((char) 30334);
                }
                if (i15 >= 1) {
                    if (i15 > 1) {
                        sb2.append(j10.charAt(i15 - 1));
                    }
                    sb2.append((char) 21313);
                }
                if (i16 > 0) {
                    sb2.append(j10.charAt(i16 - 1));
                }
                return sb2.toString();
            }
        };
        f58089i = jVar8;
        j jVar9 = new j("KHMER", 9, "khmr") { // from class: net.time4j.format.j.a
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "០១២៣៤៥៦៧៨៩";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58090j = jVar9;
        j jVar10 = new j("MYANMAR", 10, "mymr") { // from class: net.time4j.format.j.b
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "၀၁၂၃၄၅၆၇၈၉";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58091k = jVar10;
        j jVar11 = new j("ORYA", 11, "orya") { // from class: net.time4j.format.j.c
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "୦୧୨୩୪୫୬୭୮୯";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58092l = jVar11;
        j jVar12 = new j("ROMAN", 12, "roman") { // from class: net.time4j.format.j.d
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public boolean h(char c10) {
                char upperCase = Character.toUpperCase(c10);
                return upperCase == 'I' || upperCase == 'V' || upperCase == 'X' || upperCase == 'L' || upperCase == 'C' || upperCase == 'D' || upperCase == 'M';
            }

            @Override // net.time4j.format.j
            public String j() {
                return "IVXLCDM";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return false;
            }

            /* JADX WARN: Code restructure failed: missing block: B:42:0x0016, code lost:
            
                continue;
             */
            @Override // net.time4j.format.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public int n(String str, net.time4j.format.g gVar2) {
                if (str.isEmpty()) {
                    throw new NumberFormatException("Empty Roman numeral.");
                }
                String upperCase = str.toUpperCase(Locale.US);
                boolean c10 = gVar2.c();
                int length = str.length();
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    char charAt = upperCase.charAt(i10);
                    int k10 = j.k(charAt);
                    i10++;
                    if (i10 != length) {
                        int i12 = 1;
                        while (true) {
                            if (i10 < length) {
                                char charAt2 = upperCase.charAt(i10);
                                int i13 = i10 + 1;
                                if (charAt2 == charAt) {
                                    i12++;
                                    if (i12 >= 4 && c10) {
                                        throw new NumberFormatException("Roman numeral contains more than 3 equal letters in sequence: " + str);
                                    }
                                    if (i13 == length) {
                                        i11 += k10 * i12;
                                    }
                                    i10 = i13;
                                } else {
                                    int k11 = j.k(charAt2);
                                    if (k11 < k10) {
                                        k10 *= i12;
                                    } else {
                                        if (c10 && (i12 > 1 || !j.m(charAt, charAt2))) {
                                            throw new NumberFormatException("Not conform with modern usage: " + str);
                                        }
                                        i11 = (i11 + k11) - (k10 * i12);
                                        i10 = i13;
                                    }
                                }
                            }
                        }
                    }
                    i11 += k10;
                }
                if (i11 > 3999) {
                    throw new NumberFormatException("Roman numbers bigger than 3999 not supported.");
                }
                if (c10) {
                    if (i11 >= 900 && upperCase.contains("DCD")) {
                        throw new NumberFormatException("Roman number contains invalid sequence DCD.");
                    }
                    if (i11 >= 90 && upperCase.contains("LXL")) {
                        throw new NumberFormatException("Roman number contains invalid sequence LXL.");
                    }
                    if (i11 >= 9 && upperCase.contains("VIV")) {
                        throw new NumberFormatException("Roman number contains invalid sequence VIV.");
                    }
                }
                return i11;
            }

            @Override // net.time4j.format.j
            public String p(int i10) {
                if (i10 < 1 || i10 > 3999) {
                    throw new IllegalArgumentException("Out of range (1-3999): " + i10);
                }
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < j.NUMBERS.length; i11++) {
                    while (i10 >= j.NUMBERS[i11]) {
                        sb2.append(j.LETTERS[i11]);
                        i10 -= j.NUMBERS[i11];
                    }
                }
                return sb2.toString();
            }
        };
        f58093m = jVar12;
        j jVar13 = new j("TELUGU", 13, "telu") { // from class: net.time4j.format.j.e
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "౦౧౨౩౪౫౬౭౮౯";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58094n = jVar13;
        j jVar14 = new j("THAI", 14, "thai") { // from class: net.time4j.format.j.f
            {
                g gVar2 = null;
            }

            @Override // net.time4j.format.j
            public String j() {
                return "๐๑๒๓๔๕๖๗๘๙";
            }

            @Override // net.time4j.format.j
            public boolean l() {
                return true;
            }
        };
        f58095o = jVar14;
        $VALUES = new j[]{gVar, jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14};
        NUMBERS = new int[]{1000, 900, FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        LETTERS = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        D_FACTORS = new int[]{1, 12, 144, 1728, 20736};
    }

    public /* synthetic */ j(String str, int i10, String str2, g gVar) {
        this(str, i10, str2);
    }

    public static int g(int i10, int i11, int i12) {
        return AbstractC5469c.e(i10, AbstractC5469c.h(i11, i12));
    }

    public static int k(char c10) {
        if (c10 == 'C') {
            return 100;
        }
        if (c10 == 'D') {
            return FaceShapeAreaOptions.FACE_SHAPE_AREA_EYEBROWPOSITION;
        }
        if (c10 == 'I') {
            return 1;
        }
        if (c10 == 'V') {
            return 5;
        }
        if (c10 == 'X') {
            return 10;
        }
        if (c10 == 'L') {
            return 50;
        }
        if (c10 == 'M') {
            return 1000;
        }
        throw new NumberFormatException("Invalid Roman digit: " + c10);
    }

    public static boolean m(char c10, char c11) {
        if (c10 == 'C') {
            return c11 == 'M' || c11 == 'D';
        }
        if (c10 == 'I') {
            return c11 == 'X' || c11 == 'V';
        }
        if (c10 != 'X') {
            return false;
        }
        return c11 == 'C' || c11 == 'L';
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public boolean h(char c10) {
        String j10 = j();
        int length = j10.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (j10.charAt(i10) == c10) {
                return true;
            }
        }
        return false;
    }

    public String i() {
        return this.code;
    }

    public abstract String j();

    public abstract boolean l();

    public int n(String str, net.time4j.format.g gVar) {
        if (!l()) {
            throw new NumberFormatException("Cannot convert: " + str);
        }
        int charAt = j().charAt(0) - '0';
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            sb2.append((char) (str.charAt(i10) - charAt));
        }
        int parseInt = Integer.parseInt(sb2.toString());
        if (parseInt >= 0) {
            return parseInt;
        }
        throw new NumberFormatException("Cannot convert negative number: " + str);
    }

    public int o(int i10, Appendable appendable) {
        String p10 = p(i10);
        appendable.append(p10);
        return p10.length();
    }

    public String p(int i10) {
        if (!l() || i10 < 0) {
            throw new IllegalArgumentException("Cannot convert: " + i10);
        }
        int charAt = j().charAt(0) - '0';
        String num = Integer.toString(i10);
        StringBuilder sb2 = new StringBuilder();
        int length = num.length();
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append((char) (num.charAt(i11) + charAt));
        }
        return sb2.toString();
    }

    public j(String str, int i10, String str2) {
        this.code = str2;
    }
}
