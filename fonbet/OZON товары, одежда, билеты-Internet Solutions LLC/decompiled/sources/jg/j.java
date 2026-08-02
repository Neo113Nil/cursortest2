package jg;

import Fm.C3051a;
import Gl.C3124a;
import Ij.C3261b;
import T7.E;
import com.google.protobuf.DescriptorProtos$Edition;
import ig.C7073b;
import ig.EnumC7074c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
public final class j extends AbstractC7422a<j> {

    /* renamed from: A, reason: collision with root package name */
    private static final Integer[] f70014A;

    /* renamed from: B, reason: collision with root package name */
    private static final Integer[] f70015B;

    /* renamed from: C, reason: collision with root package name */
    private static final Integer[] f70016C;

    /* renamed from: D, reason: collision with root package name */
    private static final Integer[] f70017D;

    /* renamed from: E, reason: collision with root package name */
    private static final Integer[] f70018E;

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f70019F = 0;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f70020i = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f70021j = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f70022k = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f70023l = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f70024m = {0, 1, 0, 1, 0, 1, 1};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f70025n = {1, DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE, 11, 51, 5, 29, 354};

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f70026o = {1, DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE, 11, 52, 6, 30, 355};

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f70027p = {0, 354, 709, 1063, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};

    /* renamed from: q, reason: collision with root package name */
    private static final char f70028q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f70029r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f70030s;

    /* renamed from: t, reason: collision with root package name */
    private static final HashMap<Integer, Integer[]> f70031t;

    /* renamed from: u, reason: collision with root package name */
    private static final HashMap<Integer, Integer[]> f70032u;

    /* renamed from: v, reason: collision with root package name */
    private static final HashMap<Integer, Integer[]> f70033v;

    /* renamed from: w, reason: collision with root package name */
    private static final Long[] f70034w;

    /* renamed from: x, reason: collision with root package name */
    private static final Integer[] f70035x;

    /* renamed from: y, reason: collision with root package name */
    private static final Integer[] f70036y;

    /* renamed from: z, reason: collision with root package name */
    private static final Integer[] f70037z;

    /* renamed from: b, reason: collision with root package name */
    private final transient k f70038b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f70039c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f70040d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f70041e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f70042f;

    /* renamed from: g, reason: collision with root package name */
    private final transient EnumC7074c f70043g;

    /* renamed from: h, reason: collision with root package name */
    private final long f70044h;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f70045a;

        static {
            int[] iArr = new int[EnumC8145a.values().length];
            f70045a = iArr;
            try {
                iArr[EnumC8145a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70045a[EnumC8145a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70045a[EnumC8145a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f70045a[EnumC8145a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f70045a[EnumC8145a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f70045a[EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f70045a[EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f70045a[EnumC8145a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f70045a[EnumC8145a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f70045a[EnumC8145a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f70045a[EnumC8145a.YEAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f70045a[EnumC8145a.ERA.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        int i11 = 0;
        char c11 = File.separatorChar;
        f70028q = c11;
        f70029r = File.pathSeparator;
        f70030s = "org" + c11 + "threeten" + c11 + "bp" + c11 + "chrono";
        f70031t = new HashMap<>();
        f70032u = new HashMap<>();
        f70033v = new HashMap<>();
        f70014A = new Integer[12];
        int i12 = 0;
        while (true) {
            int[] iArr = f70020i;
            if (i12 >= 12) {
                break;
            }
            f70014A[i12] = Integer.valueOf(iArr[i12]);
            i12++;
        }
        f70015B = new Integer[12];
        int i13 = 0;
        while (true) {
            int[] iArr2 = f70021j;
            if (i13 >= 12) {
                break;
            }
            f70015B[i13] = Integer.valueOf(iArr2[i13]);
            i13++;
        }
        f70016C = new Integer[12];
        int i14 = 0;
        while (true) {
            int[] iArr3 = f70022k;
            if (i14 >= 12) {
                break;
            }
            f70016C[i14] = Integer.valueOf(iArr3[i14]);
            i14++;
        }
        f70017D = new Integer[12];
        int i15 = 0;
        while (true) {
            int[] iArr4 = f70023l;
            if (i15 >= 12) {
                break;
            }
            f70017D[i15] = Integer.valueOf(iArr4[i15]);
            i15++;
        }
        f70018E = new Integer[30];
        int i16 = 0;
        while (true) {
            int[] iArr5 = f70027p;
            if (i16 >= 30) {
                break;
            }
            f70018E[i16] = Integer.valueOf(iArr5[i16]);
            i16++;
        }
        f70034w = new Long[334];
        int i17 = 0;
        while (true) {
            Long[] lArr = f70034w;
            if (i17 >= lArr.length) {
                break;
            }
            lArr[i17] = Long.valueOf(i17 * 10631);
            i17++;
        }
        f70035x = new Integer[7];
        int i18 = 0;
        while (true) {
            int[] iArr6 = f70024m;
            if (i18 >= 7) {
                break;
            }
            f70035x[i18] = Integer.valueOf(iArr6[i18]);
            i18++;
        }
        f70036y = new Integer[7];
        int i19 = 0;
        while (true) {
            int[] iArr7 = f70025n;
            if (i19 >= 7) {
                break;
            }
            f70036y[i19] = Integer.valueOf(iArr7[i19]);
            i19++;
        }
        f70037z = new Integer[7];
        while (true) {
            int[] iArr8 = f70026o;
            if (i11 >= 7) {
                try {
                    M1();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                f70037z[i11] = Integer.valueOf(iArr8[i11]);
                i11++;
            }
        }
    }

    private j(long j11) {
        int i11;
        int i12;
        int x12;
        int u12;
        int ordinal;
        k kVar;
        int i13;
        Long l11;
        Long[] lArr = f70034w;
        long j12 = j11 - (-492148);
        if (j12 >= 0) {
            int i14 = 0;
            while (true) {
                try {
                    if (i14 >= lArr.length) {
                        i13 = ((int) j12) / 10631;
                        break;
                    } else {
                        if (j12 < lArr[i14].longValue()) {
                            i13 = i14 - 1;
                            break;
                        }
                        i14++;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i13 = ((int) j12) / 10631;
                }
            }
            try {
                l11 = lArr[i13];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l11 = null;
            }
            int longValue = (int) (j12 - (l11 == null ? Long.valueOf(i13 * 10631) : l11).longValue());
            int y12 = y1(i13, longValue);
            Integer[] q12 = q1(i13);
            i12 = longValue > 0 ? longValue - q12[y12].intValue() : longValue + q12[y12].intValue();
            i11 = (i13 * 30) + y12 + 1;
            x12 = x1(i12, i11);
            u12 = u1(i12, x12, i11) + 1;
            ordinal = k.f70046AH.ordinal();
        } else {
            int i15 = (int) j12;
            int i16 = i15 / 10631;
            int i17 = i15 % 10631;
            if (i17 == 0) {
                i16++;
                i17 = -10631;
            }
            int y13 = y1(i16, i17);
            Integer[] q13 = q1(i16);
            int intValue = i17 > 0 ? i17 - q13[y13].intValue() : i17 + q13[y13].intValue();
            i11 = 1 - ((i16 * 30) - y13);
            i12 = B1((long) i11) ? intValue + 355 : intValue + 354;
            x12 = x1(i12, i11);
            u12 = u1(i12, x12, i11) + 1;
            ordinal = k.BEFORE_AH.ordinal();
        }
        int i18 = u12;
        int i19 = (int) ((j11 - (-492153)) % 7);
        int[] iArr = {ordinal, i11, x12 + 1, i18, i12 + 1, i19 + (i19 <= 0 ? 7 : 0)};
        int i21 = iArr[1];
        if (i21 < 1 || i21 > 9999) {
            throw new C7073b("Invalid year of Hijrah Era");
        }
        int i22 = iArr[2];
        if (i22 < 1 || i22 > 12) {
            throw new C7073b("Invalid month of Hijrah date");
        }
        n1(iArr[3]);
        int i23 = iArr[4];
        if (i23 < 1 || i23 > f70037z[6].intValue()) {
            throw new C7073b("Invalid day of year of Hijrah date");
        }
        int i24 = iArr[0];
        if (i24 == 0) {
            kVar = k.BEFORE_AH;
        } else {
            if (i24 != 1) {
                throw new C7073b("HijrahEra not valid");
            }
            kVar = k.f70046AH;
        }
        this.f70038b = kVar;
        this.f70039c = iArr[1];
        this.f70040d = iArr[2];
        this.f70041e = iArr[3];
        this.f70042f = iArr[4];
        this.f70043g = EnumC7074c.b(iArr[5]);
        this.f70044h = j11;
    }

    static boolean B1(long j11) {
        if (j11 <= 0) {
            j11 = -j11;
        }
        return ((j11 * 11) + 14) % 30 < 11;
    }

    static j E1(k kVar, int i11, int i12, int i13) {
        lg.c.e(kVar, "era");
        if (i11 < 1 || i11 > 9999) {
            throw new C7073b("Invalid year of Hijrah Era");
        }
        if (i12 < 1 || i12 > 12) {
            throw new C7073b("Invalid month of Hijrah date");
        }
        n1(i13);
        if (kVar != k.f70046AH) {
            i11 = 1 - i11;
        }
        return new j(v1(i11, i12, i13));
    }

    static j F1(long j11) {
        return new j(j11);
    }

    private static void J1(int i11, String str) throws ParseException {
        int i12;
        int i13;
        int i14;
        int i15;
        Long[] lArr;
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf == -1) {
                throw new ParseException(E.a(i11, "Offset has incorrect format at line ", "."), i11);
            }
            try {
                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                int indexOf2 = nextToken.indexOf(45);
                if (indexOf2 == -1) {
                    throw new ParseException(E.a(i11, "Start and end year/month has incorrect format at line ", "."), i11);
                }
                String substring = nextToken.substring(0, indexOf2);
                String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                int indexOf3 = substring.indexOf(47);
                int indexOf4 = substring2.indexOf(47);
                if (indexOf3 == -1) {
                    throw new ParseException(E.a(i11, "Start year/month has incorrect format at line ", "."), i11);
                }
                String substring3 = substring.substring(0, indexOf3);
                String substring4 = substring.substring(indexOf3 + 1, substring.length());
                try {
                    int parseInt2 = Integer.parseInt(substring3);
                    try {
                        int parseInt3 = Integer.parseInt(substring4);
                        if (indexOf4 == -1) {
                            throw new ParseException(E.a(i11, "End year/month has incorrect format at line ", "."), i11);
                        }
                        String substring5 = substring2.substring(0, indexOf4);
                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                        try {
                            int parseInt4 = Integer.parseInt(substring5);
                            try {
                                int parseInt5 = Integer.parseInt(substring6);
                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                    throw new ParseException(E.a(i11, "Unknown error at line ", "."), i11);
                                }
                                if (parseInt2 < 1) {
                                    throw new IllegalArgumentException("startYear < 1");
                                }
                                if (parseInt4 < 1) {
                                    throw new IllegalArgumentException("endYear < 1");
                                }
                                if (parseInt3 < 0 || parseInt3 > 11) {
                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                }
                                if (parseInt5 < 0 || parseInt5 > 11) {
                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                }
                                if (parseInt4 > 9999) {
                                    throw new IllegalArgumentException("endYear > 9999");
                                }
                                if (parseInt4 < parseInt2) {
                                    throw new IllegalArgumentException("startYear > endYear");
                                }
                                if (parseInt4 == parseInt2 && parseInt5 < parseInt3) {
                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                }
                                boolean B12 = B1(parseInt2);
                                Integer valueOf = Integer.valueOf(parseInt2);
                                HashMap<Integer, Integer[]> hashMap = f70031t;
                                Integer[] numArr = hashMap.get(valueOf);
                                int[] iArr = f70020i;
                                int[] iArr2 = f70021j;
                                if (numArr == null) {
                                    if (B12) {
                                        numArr = new Integer[iArr2.length];
                                        for (int i16 = 0; i16 < iArr2.length; i16++) {
                                            numArr[i16] = Integer.valueOf(iArr2[i16]);
                                        }
                                    } else {
                                        numArr = new Integer[iArr.length];
                                        for (int i17 = 0; i17 < iArr.length; i17++) {
                                            numArr[i17] = Integer.valueOf(iArr[i17]);
                                        }
                                    }
                                }
                                Integer[] numArr2 = new Integer[numArr.length];
                                for (int i18 = 0; i18 < 12; i18++) {
                                    if (i18 > parseInt3) {
                                        numArr2[i18] = Integer.valueOf(numArr[i18].intValue() - parseInt);
                                    } else {
                                        Integer num = numArr[i18];
                                        num.intValue();
                                        numArr2[i18] = num;
                                    }
                                }
                                hashMap.put(Integer.valueOf(parseInt2), numArr2);
                                Integer valueOf2 = Integer.valueOf(parseInt2);
                                HashMap<Integer, Integer[]> hashMap2 = f70032u;
                                Integer[] numArr3 = hashMap2.get(valueOf2);
                                int[] iArr3 = f70022k;
                                int[] iArr4 = f70023l;
                                if (numArr3 == null) {
                                    if (B12) {
                                        numArr3 = new Integer[iArr4.length];
                                        for (int i19 = 0; i19 < iArr4.length; i19++) {
                                            numArr3[i19] = Integer.valueOf(iArr4[i19]);
                                        }
                                    } else {
                                        numArr3 = new Integer[iArr3.length];
                                        for (int i21 = 0; i21 < iArr3.length; i21++) {
                                            numArr3[i21] = Integer.valueOf(iArr3[i21]);
                                        }
                                    }
                                }
                                Integer[] numArr4 = new Integer[numArr3.length];
                                StringTokenizer stringTokenizer2 = stringTokenizer;
                                for (int i22 = 0; i22 < 12; i22++) {
                                    if (i22 == parseInt3) {
                                        numArr4[i22] = Integer.valueOf(numArr3[i22].intValue() - parseInt);
                                    } else {
                                        Integer num2 = numArr3[i22];
                                        num2.intValue();
                                        numArr4[i22] = num2;
                                    }
                                }
                                hashMap2.put(Integer.valueOf(parseInt2), numArr4);
                                if (parseInt2 != parseInt4) {
                                    int i23 = parseInt2 - 1;
                                    int i24 = i23 / 30;
                                    int i25 = i23 % 30;
                                    Integer valueOf3 = Integer.valueOf(i24);
                                    HashMap<Integer, Integer[]> hashMap3 = f70033v;
                                    Integer[] numArr5 = hashMap3.get(valueOf3);
                                    int[] iArr5 = f70027p;
                                    if (numArr5 == null) {
                                        int length = iArr5.length;
                                        i12 = parseInt3;
                                        Integer[] numArr6 = new Integer[length];
                                        for (int i26 = 0; i26 < length; i26++) {
                                            numArr6[i26] = Integer.valueOf(iArr5[i26]);
                                        }
                                        numArr5 = numArr6;
                                    } else {
                                        i12 = parseInt3;
                                    }
                                    i13 = parseInt2;
                                    for (int i27 = i25 + 1; i27 < iArr5.length; i27++) {
                                        numArr5[i27] = Integer.valueOf(numArr5[i27].intValue() - parseInt);
                                    }
                                    hashMap3.put(Integer.valueOf(i24), numArr5);
                                    int i28 = parseInt4 - 1;
                                    int i29 = i28 / 30;
                                    if (i24 != i29) {
                                        int i31 = i24 + 1;
                                        while (true) {
                                            lArr = f70034w;
                                            i14 = i28;
                                            if (i31 >= lArr.length) {
                                                break;
                                            }
                                            int i32 = i31;
                                            lArr[i32] = Long.valueOf(lArr[i31].longValue() - parseInt);
                                            i31 = i32 + 1;
                                            i28 = i14;
                                        }
                                        int i33 = i29 + 1;
                                        while (i33 < lArr.length) {
                                            int i34 = i33;
                                            lArr[i34] = Long.valueOf(lArr[i33].longValue() + parseInt);
                                            i33 = i34 + 1;
                                        }
                                    } else {
                                        i14 = i28;
                                    }
                                    int i35 = i14 % 30;
                                    Integer[] numArr7 = hashMap3.get(Integer.valueOf(i29));
                                    if (numArr7 == null) {
                                        int length2 = iArr5.length;
                                        Integer[] numArr8 = new Integer[length2];
                                        i15 = i35;
                                        for (int i36 = 0; i36 < length2; i36++) {
                                            numArr8[i36] = Integer.valueOf(iArr5[i36]);
                                        }
                                        numArr7 = numArr8;
                                    } else {
                                        i15 = i35;
                                    }
                                    for (int i37 = i15 + 1; i37 < iArr5.length; i37++) {
                                        numArr7[i37] = Integer.valueOf(numArr7[i37].intValue() + parseInt);
                                    }
                                    hashMap3.put(Integer.valueOf(i29), numArr7);
                                } else {
                                    i12 = parseInt3;
                                    i13 = parseInt2;
                                }
                                boolean B13 = B1(parseInt4);
                                Integer[] numArr9 = hashMap.get(Integer.valueOf(parseInt4));
                                if (numArr9 == null) {
                                    if (B13) {
                                        numArr9 = new Integer[iArr2.length];
                                        for (int i38 = 0; i38 < iArr2.length; i38++) {
                                            numArr9[i38] = Integer.valueOf(iArr2[i38]);
                                        }
                                    } else {
                                        numArr9 = new Integer[iArr.length];
                                        for (int i39 = 0; i39 < iArr.length; i39++) {
                                            numArr9[i39] = Integer.valueOf(iArr[i39]);
                                        }
                                    }
                                }
                                Integer[] numArr10 = new Integer[numArr9.length];
                                for (int i41 = 0; i41 < 12; i41++) {
                                    if (i41 > parseInt5) {
                                        numArr10[i41] = Integer.valueOf(numArr9[i41].intValue() + parseInt);
                                    } else {
                                        Integer num3 = numArr9[i41];
                                        num3.intValue();
                                        numArr10[i41] = num3;
                                    }
                                }
                                hashMap.put(Integer.valueOf(parseInt4), numArr10);
                                Integer[] numArr11 = hashMap2.get(Integer.valueOf(parseInt4));
                                if (numArr11 == null) {
                                    if (B13) {
                                        numArr11 = new Integer[iArr4.length];
                                        for (int i42 = 0; i42 < iArr4.length; i42++) {
                                            numArr11[i42] = Integer.valueOf(iArr4[i42]);
                                        }
                                    } else {
                                        numArr11 = new Integer[iArr3.length];
                                        for (int i43 = 0; i43 < iArr3.length; i43++) {
                                            numArr11[i43] = Integer.valueOf(iArr3[i43]);
                                        }
                                    }
                                }
                                Integer[] numArr12 = new Integer[numArr11.length];
                                for (int i44 = 0; i44 < 12; i44++) {
                                    if (i44 == parseInt5) {
                                        numArr12[i44] = Integer.valueOf(numArr11[i44].intValue() + parseInt);
                                    } else {
                                        Integer num4 = numArr11[i44];
                                        num4.intValue();
                                        numArr12[i44] = num4;
                                    }
                                }
                                hashMap2.put(Integer.valueOf(parseInt4), numArr12);
                                Integer[] numArr13 = hashMap2.get(Integer.valueOf(i13));
                                Integer[] numArr14 = hashMap2.get(Integer.valueOf(parseInt4));
                                Integer[] numArr15 = hashMap.get(Integer.valueOf(i13));
                                Integer[] numArr16 = hashMap.get(Integer.valueOf(parseInt4));
                                int intValue = numArr13[i12].intValue();
                                int intValue2 = numArr14[parseInt5].intValue();
                                int intValue3 = numArr13[11].intValue() + numArr15[11].intValue();
                                int intValue4 = numArr14[11].intValue() + numArr16[11].intValue();
                                Integer[] numArr17 = f70037z;
                                int intValue5 = numArr17[5].intValue();
                                Integer[] numArr18 = f70036y;
                                int intValue6 = numArr18[5].intValue();
                                if (intValue5 < intValue) {
                                    intValue5 = intValue;
                                }
                                if (intValue5 < intValue2) {
                                    intValue5 = intValue2;
                                }
                                numArr17[5] = Integer.valueOf(intValue5);
                                if (intValue6 <= intValue) {
                                    intValue = intValue6;
                                }
                                if (intValue <= intValue2) {
                                    intValue2 = intValue;
                                }
                                numArr18[5] = Integer.valueOf(intValue2);
                                int intValue7 = numArr17[6].intValue();
                                int intValue8 = numArr18[6].intValue();
                                if (intValue7 < intValue3) {
                                    intValue7 = intValue3;
                                }
                                if (intValue7 < intValue4) {
                                    intValue7 = intValue4;
                                }
                                numArr17[6] = Integer.valueOf(intValue7);
                                if (intValue8 <= intValue3) {
                                    intValue3 = intValue8;
                                }
                                if (intValue3 <= intValue4) {
                                    intValue4 = intValue3;
                                }
                                numArr18[6] = Integer.valueOf(intValue4);
                                stringTokenizer = stringTokenizer2;
                            } catch (NumberFormatException unused) {
                                throw new ParseException(E.a(i11, "End month is not properly set at line ", "."), i11);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException(E.a(i11, "End year is not properly set at line ", "."), i11);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException(E.a(i11, "Start month is not properly set at line ", "."), i11);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException(E.a(i11, "Start year is not properly set at line ", "."), i11);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException(E.a(i11, "Offset is not properly set at line ", "."), i11);
            }
        }
    }

    private static void M1() throws IOException, ParseException {
        InputStream fileInputStream;
        ZipFile zipFile;
        String property = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigFile");
        if (property == null) {
            property = "hijrah_deviation.cfg";
        }
        String property2 = System.getProperty("org.threeten.bp.i18n.HijrahDate.deviationConfigDir");
        BufferedReader bufferedReader = null;
        char c11 = f70028q;
        if (property2 != null) {
            if (property2.length() != 0 || !property2.endsWith(System.getProperty("file.separator"))) {
                StringBuilder e11 = C3261b.e(property2);
                e11.append(System.getProperty("file.separator"));
                property2 = e11.toString();
            }
            File file = new File(property2 + c11 + property);
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
            }
            fileInputStream = null;
        } else {
            StringTokenizer stringTokenizer = new StringTokenizer(System.getProperty("java.class.path"), f70029r);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                File file2 = new File(nextToken);
                if (file2.exists()) {
                    boolean isDirectory = file2.isDirectory();
                    String str = f70030s;
                    if (isDirectory) {
                        if (new File(nextToken + c11 + str, property).exists()) {
                            fileInputStream = new FileInputStream(nextToken + c11 + str + c11 + property);
                            break;
                        }
                    } else {
                        try {
                            zipFile = new ZipFile(file2);
                        } catch (IOException unused) {
                            zipFile = null;
                        }
                        if (zipFile != null) {
                            String str2 = str + c11 + property;
                            ZipEntry entry = zipFile.getEntry(str2);
                            if (entry == null) {
                                if (c11 == '/') {
                                    str2 = str2.replace('/', '\\');
                                } else if (c11 == '\\') {
                                    str2 = str2.replace('\\', '/');
                                }
                                entry = zipFile.getEntry(str2);
                            }
                            if (entry != null) {
                                fileInputStream = zipFile.getInputStream(entry);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            return;
        }
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
            int i11 = 0;
            while (true) {
                try {
                    String readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        bufferedReader2.close();
                        return;
                    } else {
                        i11++;
                        J1(i11, readLine.trim());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static j R1(int i11, int i12, int i13) {
        int intValue = t1(i11)[i12 - 1].intValue();
        if (i13 > intValue) {
            i13 = intValue;
        }
        return i11 >= 1 ? E1(k.f70046AH, i11, i12, i13) : E1(k.BEFORE_AH, 1 - i11, i12, i13);
    }

    private static void n1(int i11) {
        Integer[] numArr = f70037z;
        if (i11 < 1 || i11 > numArr[5].intValue()) {
            StringBuilder f7 = P4.f.f(i11, "Invalid day of month of Hijrah date, day ", " greater than ");
            f7.append(numArr[5].intValue());
            f7.append(" or less than 1");
            throw new C7073b(f7.toString());
        }
    }

    private static Integer[] q1(int i11) {
        Integer[] numArr;
        try {
            numArr = f70033v.get(Integer.valueOf(i11));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? f70018E : numArr;
    }

    private Object readResolve() {
        return new j(this.f70044h);
    }

    private static Integer[] t1(int i11) {
        Integer[] numArr;
        try {
            numArr = f70031t.get(Integer.valueOf(i11));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? B1((long) i11) ? f70015B : f70014A : numArr;
    }

    private static int u1(int i11, int i12, int i13) {
        int intValue;
        Integer[] t12 = t1(i13);
        if (i11 < 0) {
            i11 = B1((long) i13) ? i11 + 355 : i11 + 354;
            if (i12 <= 0) {
                return i11;
            }
            intValue = t12[i12].intValue();
        } else {
            if (i12 <= 0) {
                return i11;
            }
            intValue = t12[i12].intValue();
        }
        return i11 - intValue;
    }

    private static long v1(int i11, int i12, int i13) {
        Long l11;
        int i14 = i11 - 1;
        int i15 = i14 / 30;
        int i16 = i14 % 30;
        int intValue = q1(i15)[Math.abs(i16)].intValue();
        if (i16 < 0) {
            intValue = -intValue;
        }
        try {
            l11 = f70034w[i15];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l11 = null;
        }
        if (l11 == null) {
            l11 = Long.valueOf(i15 * 10631);
        }
        return ((l11.longValue() + intValue) - 492149) + t1(i11)[i12 - 1].intValue() + i13;
    }

    private Object writeReplace() {
        return new t((byte) 3, this);
    }

    private static int x1(int i11, int i12) {
        Integer[] t12 = t1(i12);
        int i13 = 0;
        if (i11 >= 0) {
            while (i13 < t12.length) {
                if (i11 < t12[i13].intValue()) {
                    return i13 - 1;
                }
                i13++;
            }
            return 11;
        }
        int i14 = B1((long) i12) ? i11 + 355 : i11 + 354;
        while (i13 < t12.length) {
            if (i14 < t12[i13].intValue()) {
                return i13 - 1;
            }
            i13++;
        }
        return 11;
    }

    private static int y1(int i11, long j11) {
        Integer[] q12 = q1(i11);
        int i12 = 0;
        if (j11 == 0) {
            return 0;
        }
        if (j11 > 0) {
            while (i12 < q12.length) {
                if (j11 < q12[i12].intValue()) {
                    return i12 - 1;
                }
                i12++;
            }
            return 29;
        }
        long j12 = -j11;
        while (i12 < q12.length) {
            if (j12 <= q12[i12].intValue()) {
                return i12 - 1;
            }
            i12++;
        }
        return 29;
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b
    public final c<j> E0(ig.h hVar) {
        return d.j1(this, hVar);
    }

    @Override // jg.AbstractC7423b
    public final g L0() {
        return i.f70013c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // jg.AbstractC7422a
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public final j k1(long j11) {
        return new j(this.f70044h + j11);
    }

    @Override // jg.AbstractC7423b
    public final h M0() {
        return this.f70038b;
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b, mg.d
    /* renamed from: O */
    public final mg.d T0(long j11, mg.k kVar) {
        return (j) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: S1, reason: merged with bridge method [inline-methods] */
    public final j j1(long j11, mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return (j) hVar.e(this, j11);
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        enumC8145a.i(j11);
        int i11 = (int) j11;
        int i12 = a.f70045a[enumC8145a.ordinal()];
        int i13 = this.f70041e;
        int i14 = this.f70040d;
        int i15 = this.f70039c;
        switch (i12) {
            case 1:
                return R1(i15, i14, i11);
            case 2:
                int i16 = i11 - 1;
                return R1(i15, (i16 / 30) + 1, (i16 % 30) + 1);
            case 3:
                return k1((j11 - m(EnumC8145a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                if (i15 < 1) {
                    i11 = 1 - i11;
                }
                return R1(i11, i14, i13);
            case 5:
                return k1(j11 - this.f70043g.a());
            case 6:
                return k1(j11 - m(EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return k1(j11 - m(EnumC8145a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return new j(i11);
            case 9:
                return k1((j11 - m(EnumC8145a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 10:
                return R1(i15, i11, i13);
            case 11:
                return R1(i11, i14, i13);
            case 12:
                return R1(1 - i15, i14, i13);
            default:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
    }

    @Override // jg.AbstractC7423b
    /* renamed from: T0 */
    public final AbstractC7423b s(long j11, mg.k kVar) {
        return (j) super.s(j11, kVar);
    }

    @Override // jg.AbstractC7422a, jg.AbstractC7423b
    /* renamed from: W0 */
    public final AbstractC7423b T0(long j11, mg.k kVar) {
        return (j) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7423b
    public final long a1() {
        return v1(this.f70039c, this.f70040d, this.f70041e);
    }

    @Override // jg.AbstractC7423b
    /* renamed from: d1 */
    public final AbstractC7423b k1(mg.f fVar) {
        return (j) super.k1(fVar);
    }

    @Override // jg.AbstractC7423b, mg.d
    /* renamed from: j */
    public final mg.d k1(ig.f fVar) {
        return (j) super.k1(fVar);
    }

    @Override // jg.AbstractC7422a
    /* renamed from: j1 */
    public final AbstractC7422a<j> T0(long j11, mg.k kVar) {
        return (j) super.T0(j11, kVar);
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<j> l1(long j11) {
        if (j11 == 0) {
            return this;
        }
        int i11 = (this.f70040d - 1) + ((int) j11);
        int i12 = i11 / 12;
        int i13 = i11 % 12;
        while (i13 < 0) {
            i13 += 12;
            int i14 = i12 - 1;
            if ((i12 ^ i14) < 0 && (i12 ^ 1) < 0) {
                throw new ArithmeticException(E.a(i12, "Subtraction overflows an int: ", " - 1"));
            }
            i12 = i14;
        }
        return E1(this.f70038b, lg.c.f(this.f70039c, i12), i13 + 1, this.f70041e);
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.f(this);
        }
        int i11 = a.f70045a[((EnumC8145a) hVar).ordinal()];
        int i12 = this.f70039c;
        int i13 = this.f70041e;
        int i14 = this.f70042f;
        switch (i11) {
            case 1:
                return i13;
            case 2:
                return i14;
            case 3:
                return C3124a.a(i13, 1, 7, 1);
            case 4:
                return i12;
            case 5:
                return this.f70043g.a();
            case 6:
                return ((i13 - 1) % 7) + 1;
            case 7:
                return ((i14 - 1) % 7) + 1;
            case 8:
                return a1();
            case 9:
                return C3124a.a(i14, 1, 7, 1);
            case 10:
                return this.f70040d;
            case 11:
                return i12;
            case 12:
                return this.f70038b.ordinal();
            default:
                throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
    }

    @Override // jg.AbstractC7422a
    final AbstractC7422a<j> m1(long j11) {
        if (j11 == 0) {
            return this;
        }
        return E1(this.f70038b, lg.c.f(this.f70039c, (int) j11), this.f70040d, this.f70041e);
    }

    @Override // Lf.a, mg.e
    public final mg.m p(mg.h hVar) {
        int i11;
        if (!(hVar instanceof EnumC8145a)) {
            return hVar.g(this);
        }
        if (!L(hVar)) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        EnumC8145a enumC8145a = (EnumC8145a) hVar;
        int i12 = a.f70045a[enumC8145a.ordinal()];
        Integer[] numArr = null;
        int i13 = this.f70039c;
        if (i12 == 1) {
            int i14 = this.f70040d - 1;
            try {
                numArr = f70032u.get(Integer.valueOf(i13));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (numArr == null) {
                numArr = B1((long) i13) ? f70017D : f70016C;
            }
            return mg.m.h(1L, numArr[i14].intValue());
        }
        if (i12 != 2) {
            if (i12 == 3) {
                return mg.m.h(1L, 5L);
            }
            if (i12 == 4) {
                return mg.m.h(1L, 1000L);
            }
            i.f70013c.getClass();
            return enumC8145a.d();
        }
        int i15 = i13 - 1;
        int i16 = i15 / 30;
        try {
            numArr = f70033v.get(Integer.valueOf(i16));
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (numArr != null) {
            int i17 = i15 % 30;
            if (i17 == 29) {
                Long[] lArr = f70034w;
                i11 = (lArr[i16 + 1].intValue() - lArr[i16].intValue()) - numArr[i17].intValue();
            } else {
                i11 = numArr[i17 + 1].intValue() - numArr[i17].intValue();
            }
        } else {
            i11 = B1((long) i13) ? 355 : 354;
        }
        return mg.m.h(1L, i11);
    }

    @Override // jg.AbstractC7423b, lg.AbstractC7957b, mg.d
    public final mg.d s(long j11, mg.k kVar) {
        return (j) super.s(j11, kVar);
    }
}
