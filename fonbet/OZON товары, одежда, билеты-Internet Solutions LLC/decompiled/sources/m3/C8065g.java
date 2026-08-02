package m3;

import Ij.C3261b;
import J0.C3354v2;
import android.annotation.SuppressLint;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import j3.C7267i;
import j3.C7272n;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@SuppressLint({"InlinedApi"})
/* renamed from: m3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8065g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f74316a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f74317b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f74318c = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f74319d = 0;

    public static String a(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        Object[] objArr = {f74317b[i11], Integer.valueOf(i12), Integer.valueOf(i13), Character.valueOf(z11 ? 'H' : 'L'), Integer.valueOf(i14)};
        int i15 = N.f74289a;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i16 = 0; i16 < length; i16++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i16])));
        }
        return sb2.toString();
    }

    public static byte[] b(int i11, int i12, byte[] bArr) {
        byte[] bArr2 = new byte[i12 + 4];
        System.arraycopy(f74316a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i11, bArr2, 4, i12);
        return bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x06c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> c(C7272n c7272n) {
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int parseInt;
        int parseInt2;
        int i21;
        int i22;
        char c12;
        int i23;
        int i24;
        int i25;
        char c13;
        Integer num;
        char c14;
        Integer num2;
        String str = c7272n.f69123k;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        boolean equals = "video/dolby-vision".equals(c7272n.f69127o);
        String str2 = c7272n.f69123k;
        if (!equals) {
            String str3 = split[0];
            str3.getClass();
            switch (str3.hashCode()) {
                case 2986313:
                    if (str3.equals("ac-4")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3004662:
                    if (str3.equals("av01")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3006243:
                    if (str3.equals("avc1")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3006244:
                    if (str3.equals("avc2")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3199032:
                    if (str3.equals("hev1")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3214780:
                    if (str3.equals("hvc1")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3224753:
                    if (str3.equals("iamf")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3356560:
                    if (str3.equals("mp4a")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3475740:
                    if (str3.equals("s263")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3624515:
                    if (str3.equals("vp09")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    if (split.length != 4) {
                        C3354v2.f("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int parseInt5 = Integer.parseInt(split[3]);
                            if (parseInt3 == 0) {
                                if (parseInt4 == 0) {
                                    i11 = 257;
                                }
                                i11 = -1;
                            } else if (parseInt3 != 1) {
                                if (parseInt3 == 2) {
                                    if (parseInt4 == 1) {
                                        i11 = 1026;
                                    } else if (parseInt4 == 2) {
                                        i11 = 1028;
                                    }
                                }
                                i11 = -1;
                            } else if (parseInt4 == 0) {
                                i11 = 513;
                            } else {
                                if (parseInt4 == 1) {
                                    i11 = 514;
                                }
                                i11 = -1;
                            }
                            if (i11 == -1) {
                                s.f("CodecSpecificDataUtil", "Unknown AC-4 profile: " + parseInt3 + "." + parseInt4);
                                break;
                            } else {
                                if (parseInt5 != 0) {
                                    if (parseInt5 == 1) {
                                        i14 = 2;
                                    } else if (parseInt5 == 2) {
                                        i14 = 4;
                                    } else if (parseInt5 == 3) {
                                        i12 = 8;
                                    } else if (parseInt5 != 4) {
                                        i13 = -1;
                                        i12 = -1;
                                        if (i12 == i13) {
                                            break;
                                        } else {
                                            C3261b.f(parseInt5, "Unknown AC-4 level: ", "CodecSpecificDataUtil");
                                            break;
                                        }
                                    } else {
                                        i12 = 16;
                                    }
                                    i12 = i14;
                                } else {
                                    i12 = 1;
                                }
                                i13 = -1;
                                if (i12 == i13) {
                                }
                            }
                        } catch (NumberFormatException unused) {
                            C3354v2.f("Ignoring malformed AC-4 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 1:
                    if (split.length < 4) {
                        C3354v2.f("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt6 = Integer.parseInt(split[1]);
                            int parseInt7 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt8 = Integer.parseInt(split[3]);
                            if (parseInt6 == 0) {
                                if (parseInt8 != 8 && parseInt8 != 10) {
                                    C3261b.f(parseInt8, "Unknown AV1 bit depth: ", "CodecSpecificDataUtil");
                                    break;
                                } else {
                                    if (parseInt8 == 8) {
                                        i15 = 1;
                                    } else {
                                        C7267i c7267i = c7272n.f69100E;
                                        i15 = (c7267i == null || !(c7267i.f69070d != null || (i16 = c7267i.f69069c) == 7 || i16 == 6)) ? 2 : 4096;
                                    }
                                    switch (parseInt7) {
                                        case 0:
                                            i17 = -1;
                                            i18 = 1;
                                            break;
                                        case 1:
                                            i17 = -1;
                                            i18 = 2;
                                            break;
                                        case 2:
                                            i17 = -1;
                                            i18 = 4;
                                            break;
                                        case 3:
                                            i18 = 8;
                                            i17 = -1;
                                            break;
                                        case 4:
                                            i18 = 16;
                                            i17 = -1;
                                            break;
                                        case 5:
                                            i18 = 32;
                                            i17 = -1;
                                            break;
                                        case 6:
                                            i18 = 64;
                                            i17 = -1;
                                            break;
                                        case 7:
                                            i18 = 128;
                                            i17 = -1;
                                            break;
                                        case 8:
                                            i18 = 256;
                                            i17 = -1;
                                            break;
                                        case 9:
                                            i18 = 512;
                                            i17 = -1;
                                            break;
                                        case 10:
                                            i18 = 1024;
                                            i17 = -1;
                                            break;
                                        case 11:
                                            i18 = 2048;
                                            i17 = -1;
                                            break;
                                        case 12:
                                            i18 = 4096;
                                            i17 = -1;
                                            break;
                                        case 13:
                                            i18 = 8192;
                                            i17 = -1;
                                            break;
                                        case 14:
                                            i18 = 16384;
                                            i17 = -1;
                                            break;
                                        case 15:
                                            i18 = 32768;
                                            i17 = -1;
                                            break;
                                        case 16:
                                            i18 = 65536;
                                            i17 = -1;
                                            break;
                                        case 17:
                                            i18 = 131072;
                                            i17 = -1;
                                            break;
                                        case 18:
                                            i18 = 262144;
                                            i17 = -1;
                                            break;
                                        case 19:
                                            i18 = 524288;
                                            i17 = -1;
                                            break;
                                        case 20:
                                            i18 = 1048576;
                                            i17 = -1;
                                            break;
                                        case 21:
                                            i18 = 2097152;
                                            i17 = -1;
                                            break;
                                        case 22:
                                            i18 = 4194304;
                                            i17 = -1;
                                            break;
                                        case 23:
                                            i18 = 8388608;
                                            i17 = -1;
                                            break;
                                        default:
                                            i17 = -1;
                                            i18 = -1;
                                            break;
                                    }
                                    if (i18 != i17) {
                                        break;
                                    } else {
                                        C3261b.f(parseInt7, "Unknown AV1 level: ", "CodecSpecificDataUtil");
                                        break;
                                    }
                                }
                            } else {
                                C3261b.f(parseInt6, "Unknown AV1 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            C3354v2.f("Ignoring malformed AV1 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                    break;
                case 2:
                case 3:
                    if (split.length < 2) {
                        C3354v2.f("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            if (split[1].length() != 6) {
                                i19 = 16;
                                if (split.length < 3) {
                                    s.f("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str2);
                                    break;
                                } else {
                                    parseInt = Integer.parseInt(split[1]);
                                    parseInt2 = Integer.parseInt(split[2]);
                                }
                            } else {
                                i19 = 16;
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            }
                            int i26 = parseInt != 66 ? parseInt != 77 ? parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : 32 : i19 : 8 : 4 : 2 : 1;
                            if (i26 != -1) {
                                switch (parseInt2) {
                                    case 10:
                                        i21 = -1;
                                        i22 = 1;
                                        break;
                                    case 11:
                                        i21 = -1;
                                        i22 = 4;
                                        break;
                                    case 12:
                                        i22 = 8;
                                        i21 = -1;
                                        break;
                                    case 13:
                                        i22 = i19;
                                        i21 = -1;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 20:
                                                i22 = 32;
                                                i21 = -1;
                                                break;
                                            case 21:
                                                i22 = 64;
                                                i21 = -1;
                                                break;
                                            case 22:
                                                i22 = 128;
                                                i21 = -1;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                                                        i22 = 256;
                                                        i21 = -1;
                                                        break;
                                                    case DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                                                        i22 = 512;
                                                        i21 = -1;
                                                        break;
                                                    case 32:
                                                        i22 = 1024;
                                                        i21 = -1;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 40:
                                                                i22 = 2048;
                                                                i21 = -1;
                                                                break;
                                                            case 41:
                                                                i22 = 4096;
                                                                i21 = -1;
                                                                break;
                                                            case 42:
                                                                i22 = 8192;
                                                                i21 = -1;
                                                                break;
                                                            default:
                                                                switch (parseInt2) {
                                                                    case 50:
                                                                        i22 = 16384;
                                                                        i21 = -1;
                                                                        break;
                                                                    case 51:
                                                                        i22 = 32768;
                                                                        i21 = -1;
                                                                        break;
                                                                    case 52:
                                                                        i22 = 65536;
                                                                        i21 = -1;
                                                                        break;
                                                                    default:
                                                                        i21 = -1;
                                                                        i22 = -1;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
                                }
                                if (i22 != i21) {
                                    break;
                                } else {
                                    C3261b.f(parseInt2, "Unknown AVC level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                C3261b.f(parseInt, "Unknown AVC profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused3) {
                            C3354v2.f("Ignoring malformed AVC codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
                case 6:
                    if (split.length < 4) {
                        C3354v2.f("Ignoring malformed IAMF codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt9 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str4 = split[3];
                            str4.getClass();
                            switch (str4.hashCode()) {
                                case 2464863:
                                    if (str4.equals("Opus")) {
                                        c12 = 0;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 3114792:
                                    if (str4.equals("fLaC")) {
                                        c12 = 1;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 3238865:
                                    if (str4.equals("ipcm")) {
                                        c12 = 2;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                case 3356560:
                                    if (str4.equals("mp4a")) {
                                        c12 = 3;
                                        break;
                                    }
                                    c12 = 65535;
                                    break;
                                default:
                                    c12 = 65535;
                                    break;
                            }
                            switch (c12) {
                                case 0:
                                    i23 = 1;
                                    break;
                                case 1:
                                    i23 = 4;
                                    break;
                                case 2:
                                    i23 = 8;
                                    break;
                                case 3:
                                    i23 = 2;
                                    break;
                                default:
                                    s.f("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + split[3]);
                                    break;
                            }
                            break;
                        } catch (NumberFormatException e11) {
                            s.g("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + split[1], e11);
                            return null;
                        }
                    }
                case 7:
                    if (split.length == 3) {
                        try {
                            if ("audio/mp4a-latm".equals(j3.u.e(Integer.parseInt(split[1], 16)))) {
                                int parseInt10 = Integer.parseInt(split[2]);
                                int i27 = 17;
                                if (parseInt10 != 17) {
                                    i27 = 20;
                                    if (parseInt10 != 20) {
                                        i27 = 23;
                                        if (parseInt10 != 23) {
                                            i27 = 29;
                                            if (parseInt10 != 29) {
                                                i27 = 39;
                                                if (parseInt10 != 39) {
                                                    i27 = 42;
                                                    if (parseInt10 != 42) {
                                                        switch (parseInt10) {
                                                            case 1:
                                                                i27 = 1;
                                                                break;
                                                            case 2:
                                                                i27 = 2;
                                                                break;
                                                            case 3:
                                                                i27 = 3;
                                                                break;
                                                            case 4:
                                                                i27 = 4;
                                                                break;
                                                            case 5:
                                                                i27 = 5;
                                                                break;
                                                            case 6:
                                                                i27 = 6;
                                                                break;
                                                            default:
                                                                i27 = -1;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (i27 != -1) {
                                    break;
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            C3354v2.f("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                            break;
                        }
                    } else {
                        C3354v2.f("Ignoring malformed MP4A codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    }
                    break;
                case '\b':
                    Pair<Integer, Integer> pair = new Pair<>(1, 1);
                    if (split.length < 3) {
                        C3354v2.f("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            break;
                        } catch (NumberFormatException unused5) {
                            C3354v2.f("Ignoring malformed H263 codec string: ", str2, "CodecSpecificDataUtil");
                            return pair;
                        }
                    }
                case '\t':
                    if (split.length < 3) {
                        C3354v2.f("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                        break;
                    } else {
                        try {
                            int parseInt11 = Integer.parseInt(split[1]);
                            int parseInt12 = Integer.parseInt(split[2]);
                            int i28 = parseInt11 != 0 ? parseInt11 != 1 ? parseInt11 != 2 ? parseInt11 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i28 != -1) {
                                if (parseInt12 == 10) {
                                    i24 = -1;
                                    i25 = 1;
                                } else if (parseInt12 != 11) {
                                    if (parseInt12 == 20) {
                                        i25 = 4;
                                    } else if (parseInt12 == 21) {
                                        i25 = 8;
                                    } else if (parseInt12 == 30) {
                                        i25 = 16;
                                    } else if (parseInt12 == 31) {
                                        i25 = 32;
                                    } else if (parseInt12 == 40) {
                                        i25 = 64;
                                    } else if (parseInt12 == 41) {
                                        i25 = 128;
                                    } else if (parseInt12 == 50) {
                                        i25 = 256;
                                    } else if (parseInt12 != 51) {
                                        switch (parseInt12) {
                                            case 60:
                                                i25 = 2048;
                                                break;
                                            case 61:
                                                i25 = 4096;
                                                break;
                                            case 62:
                                                i25 = 8192;
                                                break;
                                            default:
                                                i24 = -1;
                                                i25 = -1;
                                                break;
                                        }
                                    } else {
                                        i25 = 512;
                                    }
                                    i24 = -1;
                                } else {
                                    i24 = -1;
                                    i25 = 2;
                                }
                                if (i25 != i24) {
                                    break;
                                } else {
                                    C3261b.f(parseInt12, "Unknown VP9 level: ", "CodecSpecificDataUtil");
                                    break;
                                }
                            } else {
                                C3261b.f(parseInt11, "Unknown VP9 profile: ", "CodecSpecificDataUtil");
                                break;
                            }
                        } catch (NumberFormatException unused6) {
                            C3354v2.f("Ignoring malformed VP9 codec string: ", str2, "CodecSpecificDataUtil");
                            return null;
                        }
                    }
            }
            return null;
        }
        if (split.length < 3) {
            C3354v2.f("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f74318c.matcher(split[1]);
        if (!matcher.matches()) {
            C3354v2.f("Ignoring malformed Dolby Vision codec string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            switch (group.hashCode()) {
                case 1536:
                    if (group.equals("00")) {
                        c13 = 0;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1537:
                    if (group.equals("01")) {
                        c13 = 1;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1538:
                    if (group.equals("02")) {
                        c13 = 2;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1539:
                    if (group.equals("03")) {
                        c13 = 3;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1540:
                    if (group.equals("04")) {
                        c13 = 4;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1541:
                    if (group.equals("05")) {
                        c13 = 5;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1542:
                    if (group.equals("06")) {
                        c13 = 6;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1543:
                    if (group.equals("07")) {
                        c13 = 7;
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1544:
                    if (group.equals("08")) {
                        c13 = '\b';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1545:
                    if (group.equals("09")) {
                        c13 = '\t';
                        break;
                    }
                    c13 = 65535;
                    break;
                case 1567:
                    if (group.equals("10")) {
                        c13 = '\n';
                        break;
                    }
                    c13 = 65535;
                    break;
                default:
                    c13 = 65535;
                    break;
            }
            switch (c13) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 2;
                    break;
                case 2:
                    num = 4;
                    break;
                case 3:
                    num = 8;
                    break;
                case 4:
                    num = 16;
                    break;
                case 5:
                    num = 32;
                    break;
                case 6:
                    num = 64;
                    break;
                case 7:
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
                    break;
                case '\b':
                    num = 256;
                    break;
                case '\t':
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                    break;
                case '\n':
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
                    break;
            }
            if (num != null) {
                C3354v2.f("Unknown Dolby Vision profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            String str5 = split[2];
            if (str5 != null) {
                switch (str5.hashCode()) {
                    case 1537:
                        if (str5.equals("01")) {
                            c14 = 0;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1538:
                        if (str5.equals("02")) {
                            c14 = 1;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1539:
                        if (str5.equals("03")) {
                            c14 = 2;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1540:
                        if (str5.equals("04")) {
                            c14 = 3;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1541:
                        if (str5.equals("05")) {
                            c14 = 4;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1542:
                        if (str5.equals("06")) {
                            c14 = 5;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1543:
                        if (str5.equals("07")) {
                            c14 = 6;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1544:
                        if (str5.equals("08")) {
                            c14 = 7;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1545:
                        if (str5.equals("09")) {
                            c14 = '\b';
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1567:
                        if (str5.equals("10")) {
                            c14 = '\t';
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1568:
                        if (str5.equals("11")) {
                            c14 = '\n';
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1569:
                        if (str5.equals("12")) {
                            c14 = 11;
                            break;
                        }
                        c14 = 65535;
                        break;
                    case 1570:
                        if (str5.equals("13")) {
                            c14 = '\f';
                            break;
                        }
                        c14 = 65535;
                        break;
                    default:
                        c14 = 65535;
                        break;
                }
                switch (c14) {
                    case 0:
                        num2 = 1;
                        break;
                    case 1:
                        num2 = 2;
                        break;
                    case 2:
                        num2 = 4;
                        break;
                    case 3:
                        num2 = 8;
                        break;
                    case 4:
                        num2 = 16;
                        break;
                    case 5:
                        num2 = 32;
                        break;
                    case 6:
                        num2 = 64;
                        break;
                    case 7:
                        num2 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
                        break;
                    case '\b':
                        num2 = 256;
                        break;
                    case '\t':
                        num2 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                        break;
                    case '\n':
                        num2 = Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
                        break;
                    case 11:
                        num2 = 2048;
                        break;
                    case '\f':
                        num2 = 4096;
                        break;
                }
                if (num2 == null) {
                    return new Pair<>(num, num2);
                }
                C3354v2.f("Unknown Dolby Vision level string: ", str5, "CodecSpecificDataUtil");
                return null;
            }
            num2 = null;
            if (num2 == null) {
            }
        }
        num = null;
        if (num != null) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x018b, code lost:
    
        if (r13.equals("H90") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> d(String str, String[] strArr, C7267i c7267i) {
        int i11;
        Integer num;
        char c11 = 3;
        if (strArr.length < 4) {
            C3354v2.f("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        Matcher matcher = f74318c.matcher(strArr[1]);
        if (!matcher.matches()) {
            C3354v2.f("Ignoring malformed HEVC codec string: ", str, "CodecSpecificDataUtil");
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i11 = 1;
        } else if ("2".equals(group)) {
            i11 = (c7267i == null || c7267i.f69069c != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                C3354v2.f("Unknown HEVC profile string: ", group, "CodecSpecificDataUtil");
                return null;
            }
            i11 = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 71007:
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c11 = 11;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c11 = '\f';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c11 = '\r';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c11 = 14;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c11 = 15;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c11 = 16;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c11 = 17;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c11 = 18;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312806:
                    if (str2.equals("L123")) {
                        c11 = 19;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c11 = 20;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c11 = 21;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c11 = 22;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c11 = 23;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c11 = 24;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c11 = 25;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    num = 2;
                    break;
                case 1:
                    num = 8;
                    break;
                case 2:
                    num = 32;
                    break;
                case 3:
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_PATTERN);
                    break;
                case 4:
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_NONE);
                    break;
                case 5:
                    num = 1;
                    break;
                case 6:
                    num = 4;
                    break;
                case 7:
                    num = 16;
                    break;
                case '\b':
                    num = 64;
                    break;
                case '\t':
                    num = 256;
                    break;
                case '\n':
                    num = 2048;
                    break;
                case 11:
                    num = 8192;
                    break;
                case '\f':
                    num = 32768;
                    break;
                case '\r':
                    num = 131072;
                    break;
                case 14:
                    num = 524288;
                    break;
                case 15:
                    num = 2097152;
                    break;
                case 16:
                    num = 8388608;
                    break;
                case 17:
                    num = 33554432;
                    break;
                case 18:
                    num = Integer.valueOf(UserVerificationMethods.USER_VERIFY_ALL);
                    break;
                case 19:
                    num = 4096;
                    break;
                case 20:
                    num = 16384;
                    break;
                case 21:
                    num = 65536;
                    break;
                case 22:
                    num = 262144;
                    break;
                case 23:
                    num = 1048576;
                    break;
                case 24:
                    num = 4194304;
                    break;
                case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    num = 16777216;
                    break;
            }
            if (num == null) {
                return new Pair<>(Integer.valueOf(i11), num);
            }
            C3354v2.f("Unknown HEVC level string: ", str2, "CodecSpecificDataUtil");
            return null;
        }
        num = null;
        if (num == null) {
        }
    }
}
