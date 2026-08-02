package com.google.android.gms.internal.ads;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzdp {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    public static zzgvz zza(byte b, byte b2, byte b3, byte b4) {
        return zzgvz.zzj(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
    }

    public static String zzb(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? 'L' : 'H'), Integer.valueOf(i4)};
        String str = zzfk.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzgsw.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        zzgsw.zzd(b == 1, "Invalid APV CSD version: %s", b);
        Object[] objArr = {Integer.valueOf(bArr[5]), Integer.valueOf(bArr[6]), Integer.valueOf(bArr[7])};
        String str = zzfk.zza;
        return String.format(Locale.US, "apv1.apvf%d.apvl%d.apvb%d", objArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0717, code lost:
    
        if (r1.equals("L48") != false) goto L429;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x081b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zze(zzv zzvVar) {
        int i;
        char c;
        int i2;
        int parseInt;
        int parseInt2;
        int i3;
        int i4;
        Integer num;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num2;
        Integer num3;
        String str = zzvVar.zzk;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i9 = 16;
        int i10 = 8;
        int i11 = 3;
        int i12 = 2;
        if (!MimeTypes.VIDEO_DOLBY_VISION.equals(zzvVar.zzp)) {
            int i13 = 0;
            String str2 = split[0];
            char c2 = 65535;
            switch (str2.hashCode()) {
                case 2986313:
                    i = 32;
                    if (str2.equals("ac-4")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 3001066:
                    i = 32;
                    if (str2.equals("apv1")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 3004662:
                    i = 32;
                    if (str2.equals("av01")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 3006243:
                    i = 32;
                    if (str2.equals("avc1")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3006244:
                    i = 32;
                    if (str2.equals("avc2")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3199032:
                    i = 32;
                    if (str2.equals("hev1")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3214780:
                    i = 32;
                    if (str2.equals("hvc1")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3224753:
                    i = 32;
                    if (str2.equals("iamf")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    i = 32;
                    if (str2.equals("mp4a")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 3475740:
                    i = 32;
                    if (str2.equals("s263")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3624515:
                    i = 32;
                    if (str2.equals("vp09")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3631854:
                    i = 32;
                    if (str2.equals("vvc1")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3632040:
                    i = 32;
                    if (str2.equals("vvi1")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    i = 32;
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String str3 = zzvVar.zzk;
                    Pair pair = new Pair(1, 1);
                    if (split.length < 3) {
                        String.valueOf(str3);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                        return pair;
                    }
                    try {
                        return new Pair(Integer.valueOf(Integer.parseInt(split[1])), Integer.valueOf(Integer.parseInt(split[2])));
                    } catch (NumberFormatException unused) {
                        String.valueOf(str3);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: ".concat(String.valueOf(str3)));
                        return pair;
                    }
                case 1:
                case 2:
                    String str4 = zzvVar.zzk;
                    int length = split.length;
                    if (length >= 2) {
                        try {
                            if (split[1].length() == 6) {
                                parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                                i2 = 4;
                                parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                            } else {
                                i2 = 4;
                                if (length < 3) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 37);
                                    sb.append("Ignoring malformed AVC codec string: ");
                                    sb.append(str4);
                                    zzef.zzc("CodecSpecificDataUtil", sb.toString());
                                    return null;
                                }
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                            if (parseInt == 66) {
                                i12 = 1;
                            } else if (parseInt != 77) {
                                i12 = parseInt != 88 ? parseInt != 100 ? parseInt != 110 ? parseInt != 122 ? parseInt != 244 ? -1 : 64 : i : 16 : 8 : i2;
                            }
                            if (i12 == -1) {
                                StringBuilder sb2 = new StringBuilder(String.valueOf(parseInt).length() + 21);
                                sb2.append("Unknown AVC profile: ");
                                sb2.append(parseInt);
                                zzef.zzc("CodecSpecificDataUtil", sb2.toString());
                                return null;
                            }
                            switch (parseInt2) {
                                case 10:
                                    i3 = 1;
                                    break;
                                case 11:
                                    i3 = i2;
                                    break;
                                case 12:
                                    i3 = 8;
                                    break;
                                case 13:
                                    i3 = 16;
                                    break;
                                default:
                                    switch (parseInt2) {
                                        case 20:
                                            i3 = i;
                                            break;
                                        case 21:
                                            i3 = 64;
                                            break;
                                        case 22:
                                            i3 = 128;
                                            break;
                                        default:
                                            switch (parseInt2) {
                                                case 30:
                                                    i3 = 256;
                                                    break;
                                                case 31:
                                                    i3 = 512;
                                                    break;
                                                case 32:
                                                    i3 = 1024;
                                                    break;
                                                default:
                                                    switch (parseInt2) {
                                                        case 40:
                                                            i3 = 2048;
                                                            break;
                                                        case 41:
                                                            i3 = 4096;
                                                            break;
                                                        case 42:
                                                            i3 = 8192;
                                                            break;
                                                        default:
                                                            switch (parseInt2) {
                                                                case 50:
                                                                    i3 = 16384;
                                                                    break;
                                                                case 51:
                                                                    i3 = 32768;
                                                                    break;
                                                                case 52:
                                                                    i3 = 65536;
                                                                    break;
                                                                default:
                                                                    i3 = -1;
                                                                    break;
                                                            }
                                                    }
                                            }
                                    }
                            }
                            if (i3 != -1) {
                                return new Pair(Integer.valueOf(i12), Integer.valueOf(i3));
                            }
                            StringBuilder sb3 = new StringBuilder(String.valueOf(parseInt2).length() + 19);
                            sb3.append("Unknown AVC level: ");
                            sb3.append(parseInt2);
                            zzef.zzc("CodecSpecificDataUtil", sb3.toString());
                            return null;
                        } catch (NumberFormatException unused2) {
                            String.valueOf(str4);
                            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                            break;
                        }
                    } else {
                        String.valueOf(str4);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: ".concat(String.valueOf(str4)));
                        return null;
                    }
                case 3:
                    String str5 = zzvVar.zzk;
                    if (split.length >= 3) {
                        try {
                            int parseInt3 = Integer.parseInt(split[1]);
                            int parseInt4 = Integer.parseInt(split[2]);
                            int i14 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                            if (i14 == -1) {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(parseInt3).length() + 21);
                                sb4.append("Unknown VP9 profile: ");
                                sb4.append(parseInt3);
                                zzef.zzc("CodecSpecificDataUtil", sb4.toString());
                                return null;
                            }
                            if (parseInt4 == 10) {
                                i12 = 1;
                            } else if (parseInt4 != 11) {
                                if (parseInt4 == 20) {
                                    i12 = 4;
                                } else if (parseInt4 == 21) {
                                    i12 = 8;
                                } else if (parseInt4 == 30) {
                                    i12 = 16;
                                } else if (parseInt4 == 31) {
                                    i12 = i;
                                } else if (parseInt4 == 40) {
                                    i12 = 64;
                                } else if (parseInt4 == 41) {
                                    i12 = 128;
                                } else if (parseInt4 == 50) {
                                    i12 = 256;
                                } else if (parseInt4 != 51) {
                                    switch (parseInt4) {
                                        case 60:
                                            i12 = 2048;
                                            break;
                                        case 61:
                                            i12 = 4096;
                                            break;
                                        case 62:
                                            i12 = 8192;
                                            break;
                                        default:
                                            i12 = -1;
                                            break;
                                    }
                                } else {
                                    i12 = 512;
                                }
                            }
                            if (i12 != -1) {
                                return new Pair(Integer.valueOf(i14), Integer.valueOf(i12));
                            }
                            StringBuilder sb5 = new StringBuilder(String.valueOf(parseInt4).length() + 19);
                            sb5.append("Unknown VP9 level: ");
                            sb5.append(parseInt4);
                            zzef.zzc("CodecSpecificDataUtil", sb5.toString());
                            return null;
                        } catch (NumberFormatException unused3) {
                            String.valueOf(str5);
                            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                            break;
                        }
                    } else {
                        String.valueOf(str5);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str5)));
                        return null;
                    }
                case 4:
                case 5:
                    return zzf(zzvVar.zzk, split, zzvVar.zzF);
                case 6:
                case 7:
                    String str6 = zzvVar.zzk;
                    zzi zziVar = zzvVar.zzF;
                    if (split.length >= 3) {
                        try {
                            int parseInt5 = Integer.parseInt(split[1]);
                            if (parseInt5 == 1) {
                                i4 = (zziVar == null || zziVar.zzd != 6) ? (zziVar == null || zziVar.zzf != 8) ? 2 : 1 : 4096;
                            } else {
                                if (parseInt5 != 65) {
                                    String str7 = split[1];
                                    String.valueOf(str7);
                                    zzef.zzc("CodecSpecificDataUtil", "Unknown VVC profile IDC: ".concat(String.valueOf(str7)));
                                    return null;
                                }
                                i4 = 4;
                            }
                            String str8 = split[2];
                            if (str8 != null) {
                                switch (str8.hashCode()) {
                                    case 70918:
                                        if (str8.equals("H64")) {
                                            i11 = 6;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 70921:
                                        if (str8.equals("H67")) {
                                            i11 = 8;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 70976:
                                        if (str8.equals("H80")) {
                                            i11 = 10;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 70979:
                                        if (str8.equals("H83")) {
                                            i11 = 12;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 70982:
                                        if (str8.equals("H86")) {
                                            i11 = 14;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 71013:
                                        if (str8.equals("H96")) {
                                            i11 = 16;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74609:
                                        if (str8.equals("L16")) {
                                            i11 = 0;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74667:
                                        if (str8.equals("L32")) {
                                            i11 = 1;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74670:
                                        if (str8.equals("L35")) {
                                            i11 = 2;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74704:
                                        break;
                                    case 74728:
                                        if (str8.equals("L51")) {
                                            i11 = 4;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74762:
                                        if (str8.equals("L64")) {
                                            i11 = 5;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74765:
                                        if (str8.equals("L67")) {
                                            i11 = 7;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74820:
                                        if (str8.equals("L80")) {
                                            i11 = 9;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74823:
                                        if (str8.equals("L83")) {
                                            i11 = 11;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74826:
                                        if (str8.equals("L86")) {
                                            i11 = 13;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 74857:
                                        if (str8.equals("L96")) {
                                            i11 = 15;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 2193610:
                                        if (str8.equals("H112")) {
                                            i11 = 18;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 2193647:
                                        if (str8.equals("H128")) {
                                            i11 = 20;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 2193705:
                                        if (str8.equals("H144")) {
                                            i11 = 22;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 2312774:
                                        if (str8.equals("L112")) {
                                            i11 = 17;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 2312811:
                                        if (str8.equals("L128")) {
                                            i11 = 19;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    case 2312869:
                                        if (str8.equals("L144")) {
                                            i11 = 21;
                                            break;
                                        }
                                        i11 = -1;
                                        break;
                                    default:
                                        i11 = -1;
                                        break;
                                }
                                switch (i11) {
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
                                        num = Integer.valueOf(i);
                                        break;
                                    case 6:
                                        num = 64;
                                        break;
                                    case 7:
                                        num = 128;
                                        break;
                                    case 8:
                                        num = 256;
                                        break;
                                    case 9:
                                        num = 512;
                                        break;
                                    case 10:
                                        num = 1024;
                                        break;
                                    case 11:
                                        num = 2048;
                                        break;
                                    case 12:
                                        num = 4096;
                                        break;
                                    case 13:
                                        num = 8192;
                                        break;
                                    case 14:
                                        num = 16384;
                                        break;
                                    case 15:
                                        num = 32768;
                                        break;
                                    case 16:
                                        num = 65536;
                                        break;
                                    case 17:
                                        num = 131072;
                                        break;
                                    case 18:
                                        num = 262144;
                                        break;
                                    case 19:
                                        num = 524288;
                                        break;
                                    case 20:
                                        num = 1048576;
                                        break;
                                    case 21:
                                        num = 2097152;
                                        break;
                                    case 22:
                                        num = 4194304;
                                        break;
                                }
                                if (num == null) {
                                    return new Pair(Integer.valueOf(i4), num);
                                }
                                String.valueOf(str8);
                                zzef.zzc("CodecSpecificDataUtil", "Unknown VVC level string: ".concat(String.valueOf(str8)));
                                return null;
                            }
                            num = null;
                            if (num == null) {
                            }
                        } catch (NumberFormatException unused4) {
                            String.valueOf(str6);
                            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(String.valueOf(str6)));
                            break;
                        }
                    } else {
                        String.valueOf(str6);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed VVC codec string: ".concat(String.valueOf(str6)));
                        return null;
                    }
                    break;
                case '\b':
                    String str9 = zzvVar.zzk;
                    zzi zziVar2 = zzvVar.zzF;
                    if (split.length >= 4) {
                        try {
                            int parseInt6 = Integer.parseInt(split[1]);
                            int parseInt7 = Integer.parseInt(split[2].substring(0, 2));
                            int parseInt8 = Integer.parseInt(split[3]);
                            if (parseInt6 != 0) {
                                StringBuilder sb6 = new StringBuilder(String.valueOf(parseInt6).length() + 21);
                                sb6.append("Unknown AV1 profile: ");
                                sb6.append(parseInt6);
                                zzef.zzc("CodecSpecificDataUtil", sb6.toString());
                                return null;
                            }
                            if (parseInt8 == 8) {
                                i5 = 1;
                            } else {
                                if (parseInt8 != 10) {
                                    StringBuilder sb7 = new StringBuilder(String.valueOf(parseInt8).length() + 23);
                                    sb7.append("Unknown AV1 bit depth: ");
                                    sb7.append(parseInt8);
                                    zzef.zzc("CodecSpecificDataUtil", sb7.toString());
                                    return null;
                                }
                                i5 = (zziVar2 == null || !(zziVar2.zze != null || (i6 = zziVar2.zzd) == 7 || i6 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt7) {
                                case 0:
                                    i12 = 1;
                                    break;
                                case 1:
                                    break;
                                case 2:
                                    i12 = 4;
                                    break;
                                case 3:
                                    i12 = 8;
                                    break;
                                case 4:
                                    i12 = 16;
                                    break;
                                case 5:
                                    i12 = i;
                                    break;
                                case 6:
                                    i12 = 64;
                                    break;
                                case 7:
                                    i12 = 128;
                                    break;
                                case 8:
                                    i12 = 256;
                                    break;
                                case 9:
                                    i12 = 512;
                                    break;
                                case 10:
                                    i12 = 1024;
                                    break;
                                case 11:
                                    i12 = 2048;
                                    break;
                                case 12:
                                    i12 = 4096;
                                    break;
                                case 13:
                                    i12 = 8192;
                                    break;
                                case 14:
                                    i12 = 16384;
                                    break;
                                case 15:
                                    i12 = 32768;
                                    break;
                                case 16:
                                    i12 = 65536;
                                    break;
                                case 17:
                                    i12 = 131072;
                                    break;
                                case 18:
                                    i12 = 262144;
                                    break;
                                case 19:
                                    i12 = 524288;
                                    break;
                                case 20:
                                    i12 = 1048576;
                                    break;
                                case 21:
                                    i12 = 2097152;
                                    break;
                                case 22:
                                    i12 = 4194304;
                                    break;
                                case 23:
                                    i12 = 8388608;
                                    break;
                                default:
                                    i12 = -1;
                                    break;
                            }
                            if (i12 != -1) {
                                return new Pair(Integer.valueOf(i5), Integer.valueOf(i12));
                            }
                            StringBuilder sb8 = new StringBuilder(String.valueOf(parseInt7).length() + 19);
                            sb8.append("Unknown AV1 level: ");
                            sb8.append(parseInt7);
                            zzef.zzc("CodecSpecificDataUtil", sb8.toString());
                            return null;
                        } catch (NumberFormatException unused5) {
                            String.valueOf(str9);
                            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                            break;
                        }
                    } else {
                        String.valueOf(str9);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str9)));
                        return null;
                    }
                    break;
                case '\t':
                    String str10 = zzvVar.zzk;
                    if (split.length >= 4) {
                        try {
                            int parseInt9 = Integer.parseInt(split[1].substring(4));
                            int parseInt10 = Integer.parseInt(split[2].substring(4));
                            int parseInt11 = Integer.parseInt(split[3].substring(4));
                            if (parseInt9 == 33) {
                                i7 = 1;
                            } else {
                                if (parseInt9 != 44) {
                                    StringBuilder sb9 = new StringBuilder(String.valueOf(parseInt9).length() + 30);
                                    sb9.append("Ignoring invalid APV profile: ");
                                    sb9.append(parseInt9);
                                    zzef.zzc("CodecSpecificDataUtil", sb9.toString());
                                    return null;
                                }
                                i7 = 8192;
                            }
                            int i15 = parseInt10 / 30;
                            int i16 = i15 + i15;
                            if (parseInt10 % 30 == 0) {
                                i16--;
                            }
                            return new Pair(Integer.valueOf(i7), Integer.valueOf((256 << (i16 - 1)) | (1 << parseInt11)));
                        } catch (NumberFormatException e) {
                            String.valueOf(str10);
                            zzef.zzd("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str10)), e);
                            break;
                        }
                    } else {
                        String.valueOf(str10);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed APV codec string: ".concat(String.valueOf(str10)));
                        return null;
                    }
                case '\n':
                    String str11 = zzvVar.zzk;
                    if (split.length == 3) {
                        try {
                            if (MimeTypes.AUDIO_AAC.equals(zzas.zze(Integer.parseInt(split[1], 16)))) {
                                int parseInt12 = Integer.parseInt(split[2]);
                                if (parseInt12 == 17) {
                                    i11 = 17;
                                } else if (parseInt12 == 20) {
                                    i11 = 20;
                                } else if (parseInt12 == 23) {
                                    i11 = 23;
                                } else if (parseInt12 == 29) {
                                    i11 = 29;
                                } else if (parseInt12 == 39) {
                                    i11 = 39;
                                } else if (parseInt12 != 42) {
                                    switch (parseInt12) {
                                        case 1:
                                            i11 = 1;
                                            break;
                                        case 2:
                                            i11 = 2;
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            i11 = 4;
                                            break;
                                        case 5:
                                            i11 = 5;
                                            break;
                                        case 6:
                                            i11 = 6;
                                            break;
                                        default:
                                            i11 = -1;
                                            break;
                                    }
                                } else {
                                    i11 = 42;
                                }
                                if (i11 != -1) {
                                    return new Pair(Integer.valueOf(i11), 0);
                                }
                            }
                            return null;
                        } catch (NumberFormatException unused6) {
                            String.valueOf(str11);
                            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str11)));
                            break;
                        }
                    } else {
                        String.valueOf(str11);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str11)));
                        return null;
                    }
                case 11:
                    String str12 = zzvVar.zzk;
                    if (split.length == 4) {
                        try {
                            int parseInt13 = Integer.parseInt(split[1]);
                            int parseInt14 = Integer.parseInt(split[2]);
                            int parseInt15 = Integer.parseInt(split[3]);
                            if (parseInt13 != 0) {
                                if (parseInt13 != 1) {
                                    if (parseInt13 == 2) {
                                        if (parseInt14 == 1) {
                                            i8 = 1026;
                                            i13 = 1;
                                        } else if (parseInt14 == 2) {
                                            i8 = 1028;
                                            i13 = 2;
                                        }
                                    }
                                    i13 = parseInt14;
                                    i8 = -1;
                                } else if (parseInt14 == 0) {
                                    i8 = InputDeviceCompat.SOURCE_DPAD;
                                } else {
                                    if (parseInt14 == 1) {
                                        i8 = 514;
                                        i13 = 1;
                                    }
                                    i13 = parseInt14;
                                    i8 = -1;
                                }
                                if (i8 == -1) {
                                    StringBuilder sb10 = new StringBuilder(String.valueOf(parseInt13).length() + 23 + String.valueOf(i13).length());
                                    sb10.append("Unknown AC-4 profile: ");
                                    sb10.append(parseInt13);
                                    sb10.append(".");
                                    sb10.append(i13);
                                    zzef.zzc("CodecSpecificDataUtil", sb10.toString());
                                    return null;
                                }
                                if (parseInt15 == 0) {
                                    i9 = 1;
                                } else if (parseInt15 == 1) {
                                    i9 = 2;
                                } else if (parseInt15 == 2) {
                                    i9 = 4;
                                } else if (parseInt15 == 3) {
                                    i9 = 8;
                                } else if (parseInt15 != 4) {
                                    i9 = -1;
                                }
                                if (i9 != -1) {
                                    return new Pair(Integer.valueOf(i8), Integer.valueOf(i9));
                                }
                                StringBuilder sb11 = new StringBuilder(String.valueOf(parseInt15).length() + 20);
                                sb11.append("Unknown AC-4 level: ");
                                sb11.append(parseInt15);
                                zzef.zzc("CodecSpecificDataUtil", sb11.toString());
                                return null;
                            }
                            if (parseInt14 == 0) {
                                i8 = 257;
                                if (i8 == -1) {
                                }
                            }
                            i13 = parseInt14;
                            i8 = -1;
                            if (i8 == -1) {
                            }
                        } catch (NumberFormatException unused7) {
                            String.valueOf(str12);
                            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str12)));
                            break;
                        }
                    } else {
                        String.valueOf(str12);
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: ".concat(String.valueOf(str12)));
                        return null;
                    }
                case '\f':
                    if (split.length >= 4) {
                        try {
                            int parseInt16 = 1 << (Integer.parseInt(split[1]) + 16);
                            String str13 = split[3];
                            switch (str13.hashCode()) {
                                case 2464863:
                                    if (str13.equals("Opus")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case 3114792:
                                    if (str13.equals("fLaC")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                                case 3238865:
                                    if (str13.equals("ipcm")) {
                                        c2 = 3;
                                        break;
                                    }
                                    break;
                                case 3356560:
                                    if (str13.equals("mp4a")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 == 0) {
                                i10 = 1;
                            } else if (c2 == 1) {
                                i10 = 2;
                            } else if (c2 == 2) {
                                i10 = 4;
                            } else if (c2 != 3) {
                                String.valueOf(str13);
                                zzef.zzc("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: ".concat(String.valueOf(str13)));
                                return null;
                            }
                            return new Pair(Integer.valueOf(parseInt16 | 16777216 | i10), 0);
                        } catch (NumberFormatException e2) {
                            String str14 = split[1];
                            String.valueOf(str14);
                            zzef.zzd("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: ".concat(String.valueOf(str14)), e2);
                            break;
                        }
                    } else {
                        zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: ".concat(str));
                        return null;
                    }
                default:
                    return null;
            }
            return null;
        }
        if (split.length < 3) {
            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        Matcher matcher = zzd.matcher(split[1]);
        if (!matcher.matches()) {
            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: ".concat(str));
            return null;
        }
        String group = matcher.group(1);
        if (group != null) {
            int hashCode = group.hashCode();
            if (hashCode != 1567) {
                switch (hashCode) {
                    case 1536:
                        if (group.equals("00")) {
                            num2 = 1;
                            break;
                        }
                        break;
                    case 1537:
                        if (group.equals("01")) {
                            num2 = 2;
                            break;
                        }
                        break;
                    case 1538:
                        if (group.equals("02")) {
                            num2 = 4;
                            break;
                        }
                        break;
                    case 1539:
                        if (group.equals("03")) {
                            num2 = 8;
                            break;
                        }
                        break;
                    case 1540:
                        if (group.equals("04")) {
                            num2 = 16;
                            break;
                        }
                        break;
                    case 1541:
                        if (group.equals("05")) {
                            num2 = 32;
                            break;
                        }
                        break;
                    case 1542:
                        if (group.equals("06")) {
                            num2 = 64;
                            break;
                        }
                        break;
                    case 1543:
                        if (group.equals("07")) {
                            num2 = 128;
                            break;
                        }
                        break;
                    case 1544:
                        if (group.equals("08")) {
                            num2 = 256;
                            break;
                        }
                        break;
                    case 1545:
                        if (group.equals("09")) {
                            num2 = 512;
                            break;
                        }
                        break;
                }
                if (num2 == null) {
                    String.valueOf(group);
                    zzef.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: ".concat(String.valueOf(group)));
                    return null;
                }
                String str15 = split[2];
                if (str15 != null) {
                    int hashCode2 = str15.hashCode();
                    switch (hashCode2) {
                        case 1537:
                            if (str15.equals("01")) {
                                num3 = 1;
                                break;
                            }
                            break;
                        case 1538:
                            if (str15.equals("02")) {
                                num3 = 2;
                                break;
                            }
                            break;
                        case 1539:
                            if (str15.equals("03")) {
                                num3 = 4;
                                break;
                            }
                            break;
                        case 1540:
                            if (str15.equals("04")) {
                                num3 = 8;
                                break;
                            }
                            break;
                        case 1541:
                            if (str15.equals("05")) {
                                num3 = 16;
                                break;
                            }
                            break;
                        case 1542:
                            if (str15.equals("06")) {
                                num3 = 32;
                                break;
                            }
                            break;
                        case 1543:
                            if (str15.equals("07")) {
                                num3 = 64;
                                break;
                            }
                            break;
                        case 1544:
                            if (str15.equals("08")) {
                                num3 = 128;
                                break;
                            }
                            break;
                        case 1545:
                            if (str15.equals("09")) {
                                num3 = 256;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode2) {
                                case 1567:
                                    if (str15.equals("10")) {
                                        num3 = 512;
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (str15.equals("11")) {
                                        num3 = 1024;
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (str15.equals("12")) {
                                        num3 = 2048;
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (str15.equals("13")) {
                                        num3 = 4096;
                                        break;
                                    }
                                    break;
                            }
                    }
                    if (num3 == null) {
                        return new Pair(num2, num3);
                    }
                    String.valueOf(str15);
                    zzef.zzc("CodecSpecificDataUtil", "Unknown Dolby Vision level string: ".concat(String.valueOf(str15)));
                    return null;
                }
                num3 = null;
                if (num3 == null) {
                }
            } else if (group.equals("10")) {
                num2 = 1024;
                if (num2 == null) {
                }
            }
        }
        num2 = null;
        if (num2 == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c4, code lost:
    
        if (r11.equals("L123") != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zzf(String str, String[] strArr, zzi zziVar) {
        int i;
        Integer num;
        if (strArr.length < 4) {
            String.valueOf(str);
            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = zzd.matcher(strArr[1]);
        if (!matcher.matches()) {
            String.valueOf(str);
            zzef.zzc("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        char c = 6;
        if ("1".equals(group)) {
            i = 1;
        } else if ("2".equals(group)) {
            i = (zziVar == null || zziVar.zzd != 6) ? 2 : 4096;
        } else {
            if (!"6".equals(group)) {
                String.valueOf(group);
                zzef.zzc("CodecSpecificDataUtil", "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            i = 6;
        }
        String str2 = strArr[3];
        if (str2 != null) {
            switch (str2.hashCode()) {
                case 70821:
                    if (str2.equals("H30")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 70914:
                    if (str2.equals("H60")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case 70917:
                    if (str2.equals("H63")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case 71007:
                    if (str2.equals("H90")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 71010:
                    if (str2.equals("H93")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 74665:
                    if (str2.equals("L30")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 74758:
                    if (str2.equals("L60")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 74761:
                    if (str2.equals("L63")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 74851:
                    if (str2.equals("L90")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 74854:
                    if (str2.equals("L93")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193639:
                    if (str2.equals("H120")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193642:
                    if (str2.equals("H123")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193732:
                    if (str2.equals("H150")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193735:
                    if (str2.equals("H153")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193738:
                    if (str2.equals("H156")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193825:
                    if (str2.equals("H180")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193828:
                    if (str2.equals("H183")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 2193831:
                    if (str2.equals("H186")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312803:
                    if (str2.equals("L120")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312806:
                    break;
                case 2312896:
                    if (str2.equals("L150")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312899:
                    if (str2.equals("L153")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 2312902:
                    if (str2.equals("L156")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 2312989:
                    if (str2.equals("L180")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 2312992:
                    if (str2.equals("L183")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 2312995:
                    if (str2.equals("L186")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    num = 1;
                    break;
                case 1:
                    num = 4;
                    break;
                case 2:
                    num = 16;
                    break;
                case 3:
                    num = 64;
                    break;
                case 4:
                    num = 256;
                    break;
                case 5:
                    num = 1024;
                    break;
                case 6:
                    num = 4096;
                    break;
                case 7:
                    num = 16384;
                    break;
                case '\b':
                    num = 65536;
                    break;
                case '\t':
                    num = 262144;
                    break;
                case '\n':
                    num = 1048576;
                    break;
                case 11:
                    num = 4194304;
                    break;
                case '\f':
                    num = 16777216;
                    break;
                case '\r':
                    num = 2;
                    break;
                case 14:
                    num = 8;
                    break;
                case 15:
                    num = 32;
                    break;
                case 16:
                    num = 128;
                    break;
                case 17:
                    num = 512;
                    break;
                case 18:
                    num = 2048;
                    break;
                case 19:
                    num = 8192;
                    break;
                case 20:
                    num = 32768;
                    break;
                case 21:
                    num = 131072;
                    break;
                case 22:
                    num = 524288;
                    break;
                case 23:
                    num = 2097152;
                    break;
                case 24:
                    num = 8388608;
                    break;
                case 25:
                    num = 33554432;
                    break;
            }
            if (num == null) {
                return new Pair(Integer.valueOf(i), num);
            }
            String.valueOf(str2);
            zzef.zzc("CodecSpecificDataUtil", "Unknown HEVC level string: ".concat(String.valueOf(str2)));
            return null;
        }
        num = null;
        if (num == null) {
        }
    }

    public static byte[] zzg(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }
}
