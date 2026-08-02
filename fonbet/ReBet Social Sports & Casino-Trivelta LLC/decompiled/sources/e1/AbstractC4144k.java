package e1;

import android.util.Pair;
import b1.AbstractC2335D;
import b1.C2357k;
import com.google.common.collect.AbstractC3445z;
import com.plaid.internal.EnumC3631g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: e1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4144k {
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", "A", "B", "C"};

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f45531a = Pattern.compile("^\\D?(\\d+)$");

    public static Pair A(String str, String[] strArr) {
        int i10 = 4;
        if (strArr.length < 4) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int parseInt = 1 << (Integer.parseInt(strArr[1]) + 16);
            String str2 = strArr[3];
            str2.getClass();
            switch (str2) {
                case "Opus":
                    i10 = 1;
                    break;
                case "fLaC":
                    break;
                case "ipcm":
                    i10 = 8;
                    break;
                case "mp4a":
                    i10 = 2;
                    break;
                default:
                    AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                    return null;
            }
            return new Pair(Integer.valueOf(16777216 | parseInt | i10), 0);
        } catch (NumberFormatException e10) {
            AbstractC4156x.j("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e10);
            return null;
        }
    }

    public static Pair B(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int J10 = J(parseInt);
            if (J10 == -1) {
                AbstractC4156x.i("CodecSpecificDataUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int I10 = I(parseInt2);
            if (I10 != -1) {
                return new Pair(Integer.valueOf(J10), Integer.valueOf(I10));
            }
            AbstractC4156x.i("CodecSpecificDataUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    public static Integer C(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static boolean D(byte[] bArr, int i10) {
        if (bArr.length - i10 <= NAL_START_CODE.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static int E(int i10) {
        int i11 = 17;
        if (i10 != 17) {
            i11 = 20;
            if (i10 != 20) {
                i11 = 23;
                if (i10 != 23) {
                    i11 = 29;
                    if (i10 != 29) {
                        i11 = 39;
                        if (i10 != 39) {
                            i11 = 42;
                            if (i10 != 42) {
                                switch (i10) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i11;
    }

    public static Pair F(byte[] bArr) {
        J j10 = new J(bArr);
        j10.b0(9);
        int M10 = j10.M();
        j10.b0(20);
        return Pair.create(Integer.valueOf(j10.Q()), Integer.valueOf(M10));
    }

    public static boolean G(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static byte[][] H(byte[] bArr) {
        if (!D(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            i10 = r(bArr, i10 + NAL_START_CODE.length);
        } while (i10 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int intValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }

    public static int I(int i10) {
        if (i10 == 10) {
            return 1;
        }
        if (i10 == 11) {
            return 2;
        }
        if (i10 == 20) {
            return 4;
        }
        if (i10 == 21) {
            return 8;
        }
        if (i10 == 30) {
            return 16;
        }
        if (i10 == 31) {
            return 32;
        }
        if (i10 == 40) {
            return 64;
        }
        if (i10 == 41) {
            return 128;
        }
        if (i10 == 50) {
            return 256;
        }
        if (i10 == 51) {
            return 512;
        }
        switch (i10) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    public static int J(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? -1 : 8;
        }
        return 4;
    }

    public static int a(int i10, int i11) {
        if (i10 == 0) {
            if (i11 == 0) {
                return EnumC3631g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            }
            return -1;
        }
        if (i10 == 1) {
            if (i11 == 0) {
                return 513;
            }
            return i11 == 1 ? 514 : -1;
        }
        if (i10 != 2) {
            return -1;
        }
        if (i11 == 1) {
            return 1026;
        }
        return i11 == 2 ? 1028 : -1;
    }

    public static int b(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 1) {
            return 2;
        }
        if (i10 == 2) {
            return 4;
        }
        if (i10 != 3) {
            return i10 != 4 ? -1 : 16;
        }
        return 8;
    }

    public static int c(int i10) {
        switch (i10) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return PKIFailureInfo.notAuthorized;
            case 17:
                return PKIFailureInfo.unsupportedVersion;
            case 18:
                return PKIFailureInfo.transactionIdInUse;
            case 19:
                return PKIFailureInfo.signerNotTrusted;
            case 20:
                return PKIFailureInfo.badCertTemplate;
            case 21:
                return PKIFailureInfo.badSenderNonce;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    public static int d(int i10) {
        switch (i10) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i10) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i10) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i10) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i10) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return PKIFailureInfo.notAuthorized;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    public static int e(int i10) {
        if (i10 == 66) {
            return 1;
        }
        if (i10 == 77) {
            return 2;
        }
        if (i10 == 88) {
            return 4;
        }
        if (i10 == 100) {
            return 8;
        }
        if (i10 == 110) {
            return 16;
        }
        if (i10 != 122) {
            return i10 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String f(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static List g(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    public static String h(int i10, int i11) {
        return i10 > 9 ? Z.G("dvh1.%02d.%02d", Integer.valueOf(i10), Integer.valueOf(i11)) : i10 > 8 ? Z.G("dvav.%02d.%02d", Integer.valueOf(i10), Integer.valueOf(i11)) : Z.G("dvhe.%02d.%02d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String i(int i10, int i11) {
        return Z.G("s263.%d.%d", Integer.valueOf(i10), Integer.valueOf(i11));
    }

    public static String j(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        StringBuilder sb2 = new StringBuilder(Z.G("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(z10 ? 'H' : Matrix.MATRIX_TYPE_RANDOM_LT), Integer.valueOf(i13)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static String k(byte[] bArr) {
        J j10 = new J(bArr);
        j10.d0();
        j10.c0(4);
        int M10 = j10.M();
        int M11 = j10.M();
        j10.c0(1);
        j10.d0();
        j10.d0();
        String J10 = j10.J(4);
        if (J10.equals("mp4a")) {
            j10.d0();
            j10.c0(2);
            I i10 = new I();
            i10.m(j10);
            int h10 = i10.h(5);
            if (h10 == 31) {
                h10 = i10.h(6) + 32;
            }
            J10 = J10 + ".40." + h10;
        }
        return Z.G("iamf.%03X.%03X.%s", Integer.valueOf(M10), Integer.valueOf(M11), J10);
    }

    public static byte[] l(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static AbstractC3445z m(byte b10, byte b11, byte b12, byte b13) {
        return AbstractC3445z.u(new byte[]{1, 1, b10, 2, 1, b11, 3, 1, b12, 4, 1, b13});
    }

    public static int n(int i10) {
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                switch (i10) {
                    case 4:
                        return 3;
                    case 8:
                        return 4;
                    case 16:
                        return 5;
                    case 32:
                        return 6;
                    case 64:
                        return 7;
                    case 128:
                        return 8;
                    case 256:
                        return 9;
                    case 512:
                        return 10;
                    case 1024:
                        return 11;
                    case 2048:
                        return 12;
                    case 4096:
                        return 13;
                    default:
                        throw new IllegalArgumentException("Unknown Dolby Vision level: " + i10);
                }
            }
        }
        return i11;
    }

    public static int o(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        if (i10 == 512) {
            return 9;
        }
        if (i10 == 1024) {
            return 10;
        }
        throw new IllegalArgumentException("Unknown Dolby Vision profile: " + i10);
    }

    public static Integer p(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static Integer q(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    public static int r(byte[] bArr, int i10) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i10 <= length) {
            if (D(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static Pair s(String str, String[] strArr) {
        int E10;
        if (strArr.length != 3) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(AbstractC2335D.h(Integer.parseInt(strArr[1], 16))) && (E10 = E(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair(Integer.valueOf(E10), 0);
            }
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    public static Pair t(String str, String[] strArr) {
        if (strArr.length != 4) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int parseInt3 = Integer.parseInt(strArr[3]);
            int a10 = a(parseInt, parseInt2);
            if (a10 == -1) {
                AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt + "." + parseInt2);
                return null;
            }
            int b10 = b(parseInt3);
            if (b10 != -1) {
                return new Pair(Integer.valueOf(a10), Integer.valueOf(b10));
            }
            AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AC-4 level: " + parseInt3);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    public static Pair u(String str, String[] strArr, C2357k c2357k) {
        int i10;
        if (strArr.length < 4) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            int i11 = parseInt3 != 8 ? (c2357k == null || !(c2357k.hdrStaticInfo != null || (i10 = c2357k.f24606c) == 7 || i10 == 6)) ? 2 : 4096 : 1;
            int c10 = c(parseInt2);
            if (c10 != -1) {
                return new Pair(Integer.valueOf(i11), Integer.valueOf(c10));
            }
            AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AV1 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    public static Pair v(String str, String[] strArr) {
        int parseInt;
        int i10;
        if (strArr.length < 2) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i10 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i10 = parseInt2;
            }
            int e10 = e(i10);
            if (e10 == -1) {
                AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AVC profile: " + i10);
                return null;
            }
            int d10 = d(parseInt);
            if (d10 != -1) {
                return new Pair(Integer.valueOf(e10), Integer.valueOf(d10));
            }
            AbstractC4156x.i("CodecSpecificDataUtil", "Unknown AVC level: " + parseInt);
            return null;
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009a, code lost:
    
        if (r3.equals("ac-4") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair w(androidx.media3.common.a aVar) {
        String str = aVar.f20539k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        if ("video/dolby-vision".equals(aVar.f20543o)) {
            return x(aVar.f20539k, split);
        }
        char c10 = 0;
        String str2 = split[0];
        str2.getClass();
        switch (str2.hashCode()) {
            case 2986313:
                break;
            case 3004662:
                if (str2.equals("av01")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 3006243:
                if (str2.equals("avc1")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3224753:
                if (str2.equals("iamf")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3356560:
                if (str2.equals("mp4a")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 3475740:
                if (str2.equals("s263")) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 3624515:
                if (str2.equals("vp09")) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                return t(aVar.f20539k, split);
            case 1:
                return u(aVar.f20539k, split, aVar.f20516D);
            case 2:
            case 3:
                return v(aVar.f20539k, split);
            case 4:
            case 5:
                return z(aVar.f20539k, split, aVar.f20516D);
            case 6:
                return A(aVar.f20539k, split);
            case 7:
                return s(aVar.f20539k, split);
            case '\b':
                return y(aVar.f20539k, split);
            case '\t':
                return B(aVar.f20539k, split);
            default:
                return null;
        }
    }

    public static Pair x(String str, String[] strArr) {
        if (strArr.length < 3) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f45531a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer q10 = q(group);
        if (q10 == null) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer p10 = p(str2);
        if (p10 != null) {
            return new Pair(q10, p10);
        }
        AbstractC4156x.i("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    public static Pair y(String str, String[] strArr) {
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    public static Pair z(String str, String[] strArr, C2357k c2357k) {
        if (strArr.length < 4) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i10 = 1;
        Matcher matcher = f45531a.matcher(strArr[1]);
        if (!matcher.matches()) {
            AbstractC4156x.i("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            i10 = 6;
            if ("2".equals(group)) {
                i10 = (c2357k == null || c2357k.f24606c != 6) ? 2 : 4096;
            } else if (!"6".equals(group)) {
                AbstractC4156x.i("CodecSpecificDataUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer C10 = C(str2);
        if (C10 != null) {
            return new Pair(Integer.valueOf(i10), C10);
        }
        AbstractC4156x.i("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
        return null;
    }
}
