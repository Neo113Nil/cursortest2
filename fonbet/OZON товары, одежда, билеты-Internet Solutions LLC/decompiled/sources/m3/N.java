package m3;

import Ij.C3261b;
import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.recyclerview.widget.m;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f74289a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f74290b;

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f74291c;

    /* renamed from: d, reason: collision with root package name */
    public static final long[] f74292d;

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f74293e;

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f74294f;

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f74295g;

    /* renamed from: h, reason: collision with root package name */
    private static HashMap<String, String> f74296h;

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f74297i;

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f74298j;

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f74299k;

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f74300l;

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f74301m;

    static {
        int i11 = Build.VERSION.SDK_INT;
        f74289a = i11;
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        f74290b = str + ", " + Build.MODEL + ", " + str2 + ", " + i11;
        f74291c = new byte[0];
        f74292d = new long[0];
        f74293e = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f74294f = Pattern.compile("%([A-Fa-f0-9]{2})");
        f74295g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        f74297i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        f74298j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        f74299k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f74300l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f74301m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, UserVerificationMethods.USER_VERIFY_PATTERN, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, m.e.DEFAULT_DRAG_ANIMATION_DURATION, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, ModuleDescriptor.MODULE_VERSION, 194, 197, 204, 203, 230, 225, 232, 239, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 253, 244, 243};
    }

    public static String A(int i11) {
        if (i11 == 0) {
            return "NO";
        }
        if (i11 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i11 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i11 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i11 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static long B(float f7, long j11) {
        return f7 == 1.0f ? j11 : Math.round(j11 * f7);
    }

    public static int C(int i11, ByteOrder byteOrder) {
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i11 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i11 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long D(float f7, long j11) {
        return f7 == 1.0f ? j11 : Math.round(j11 / f7);
    }

    public static String E(StringBuilder sb2, Formatter formatter, long j11) {
        if (j11 == -9223372036854775807L) {
            j11 = 0;
        }
        String str = j11 < 0 ? "-" : "";
        long abs = (Math.abs(j11) + 500) / 1000;
        long j12 = abs % 60;
        long j13 = (abs / 60) % 60;
        long j14 = abs / 3600;
        sb2.setLength(0);
        return j14 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    private static String F(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e11) {
            s.d("Util", "Failed to read system property ".concat(str), e11);
            return null;
        }
    }

    public static String G(int i11) {
        switch (i11) {
            case -2:
                return DevicePublicKeyStringDef.NONE;
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i11 >= 10000 ? T7.E.a(i11, "custom (", ")") : "?";
        }
    }

    public static boolean H(j3.y yVar) {
        if (yVar == null || !yVar.l(1)) {
            return false;
        }
        yVar.pause();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean I(j3.y yVar) {
        boolean z11 = false;
        if (yVar == null) {
            return false;
        }
        int P11 = yVar.P();
        if (P11 != 1 || !yVar.l(2)) {
            if (P11 == 4 && yVar.l(4)) {
                yVar.B();
            }
            if (yVar.l(1)) {
                return z11;
            }
            yVar.play();
            return true;
        }
        yVar.prepare();
        z11 = true;
        if (yVar.l(1)) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int J(Uri uri, String str) {
        int i11;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!O7.b.a("rtsp", scheme) && !O7.b.a("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String b11 = O7.b.b(lastPathSegment.substring(lastIndexOf + 1));
                        b11.getClass();
                        switch (b11) {
                            case "ism":
                            case "isml":
                                i11 = 1;
                                break;
                            case "mpd":
                                i11 = 0;
                                break;
                            case "m3u8":
                                i11 = 2;
                                break;
                            default:
                                i11 = 4;
                                break;
                        }
                        if (i11 != 4) {
                            return i11;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = f74295g.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    return 2;
                                }
                            }
                            return 0;
                        }
                        return 1;
                    }
                }
                return 4;
            }
            return 3;
        }
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    break;
                }
                break;
        }
        /*  JADX ERROR: Method code generation error
            java.lang.NullPointerException: Switch insn not found in header
            	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.N.J(android.net.Uri, java.lang.String):int");
    }

    public static boolean K(C8050C c8050c, C8050C c8050c2, Inflater inflater) {
        if (c8050c.a() == 0) {
            return false;
        }
        if (c8050c2.b() < c8050c.a()) {
            c8050c2.d(c8050c.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(c8050c.e(), c8050c.f(), c8050c.a());
        int i11 = 0;
        while (true) {
            try {
                i11 += inflater.inflate(c8050c2.e(), i11, c8050c2.b() - i11);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i11 == c8050c2.b()) {
                        c8050c2.d(c8050c2.b() * 2);
                    }
                } else {
                    c8050c2.Q(i11);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    public static void L(int i11) {
        Integer.toString(i11, 36);
    }

    public static boolean M(int i11) {
        return i11 == 3 || i11 == 2 || i11 == 268435456 || i11 == 21 || i11 == 1342177280 || i11 == 22 || i11 == 1610612736 || i11 == 4;
    }

    public static boolean N(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i11 == 30) {
            String str = Build.MODEL;
            if (O7.b.a(str, "moto g(20)") || O7.b.a(str, "rmx3231")) {
                return true;
            }
        }
        return i11 == 34 && O7.b.a(Build.MODEL, "sm-x200");
    }

    public static boolean O(int i11) {
        return i11 == 10 || i11 == 13;
    }

    public static boolean P(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long Q(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 * 1000;
    }

    public static String R(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String b11 = O7.b.b(str);
        int i11 = 0;
        String str2 = b11.split("-", 2)[0];
        if (f74296h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f74297i;
            HashMap<String, String> hashMap = new HashMap<>(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i12 = 0; i12 < strArr.length; i12 += 2) {
                hashMap.put(strArr[i12], strArr[i12 + 1]);
            }
            f74296h = hashMap;
        }
        String str4 = f74296h.get(str2);
        if (str4 != null) {
            StringBuilder e11 = C3261b.e(str4);
            e11.append(b11.substring(str2.length()));
            b11 = e11.toString();
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return b11;
        }
        while (true) {
            String[] strArr2 = f74298j;
            if (i11 >= strArr2.length) {
                return b11;
            }
            if (b11.startsWith(strArr2[i11])) {
                return strArr2[i11 + 1] + b11.substring(strArr2[i11].length());
            }
            i11 += 2;
        }
    }

    public static Object[] S(int i11, Object[] objArr) {
        G10.a.c(i11 <= objArr.length);
        return Arrays.copyOf(objArr, i11);
    }

    public static long T(String str) throws j3.v {
        Matcher matcher = f74293e.matcher(str);
        if (!matcher.matches()) {
            throw j3.v.a(null, "Invalid date/time format: " + str);
        }
        int i11 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i11 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i11 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i11 != 0 ? timeInMillis - (i11 * 60000) : timeInMillis;
    }

    public static float U(long j11, long j12) {
        if (j12 == 0 || j11 != j12) {
            return (j11 / j12) * 100.0f;
        }
        return 100.0f;
    }

    public static void V(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void W(ArrayList arrayList, int i11, int i12) {
        if (i11 < 0 || i12 > arrayList.size() || i11 > i12) {
            throw new IllegalArgumentException();
        }
        if (i11 != i12) {
            arrayList.subList(i11, i12).clear();
        }
    }

    public static long X(int i11, long j11) {
        return Z(j11, 1000000L, i11, RoundingMode.DOWN);
    }

    public static void Y(long[] jArr, long j11) {
        long j12;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i11 = 0;
        if (j11 >= 1000000 && j11 % 1000000 == 0) {
            long b11 = Q7.d.b(j11, 1000000L, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = Q7.d.b(jArr[i11], b11, roundingMode);
                i11++;
            }
            return;
        }
        if (j11 < 1000000 && 1000000 % j11 == 0) {
            long b12 = Q7.d.b(1000000L, j11, RoundingMode.UNNECESSARY);
            while (i11 < jArr.length) {
                jArr[i11] = Q7.d.d(jArr[i11], b12);
                i11++;
            }
            return;
        }
        int i12 = 0;
        while (i12 < jArr.length) {
            long j13 = jArr[i12];
            if (j13 != 0) {
                if (j11 >= j13 && j11 % j13 == 0) {
                    jArr[i12] = Q7.d.b(1000000L, Q7.d.b(j11, j13, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j13 || j13 % j11 != 0) {
                    j12 = j11;
                    jArr[i12] = a0(j13, 1000000L, j12, roundingMode);
                    i12++;
                    j11 = j12;
                } else {
                    jArr[i12] = Q7.d.d(1000000L, Q7.d.b(j13, j11, RoundingMode.UNNECESSARY));
                }
            }
            j12 = j11;
            i12++;
            j11 = j12;
        }
    }

    public static long Z(long j11, long j12, long j13, RoundingMode roundingMode) {
        if (j11 == 0 || j12 == 0) {
            return 0L;
        }
        return (j13 < j12 || j13 % j12 != 0) ? (j13 >= j12 || j12 % j13 != 0) ? (j13 < j11 || j13 % j11 != 0) ? (j13 >= j11 || j11 % j13 != 0) ? a0(j11, j12, j13, roundingMode) : Q7.d.d(j12, Q7.d.b(j11, j13, RoundingMode.UNNECESSARY)) : Q7.d.b(j12, Q7.d.b(j13, j11, RoundingMode.UNNECESSARY), roundingMode) : Q7.d.d(j11, Q7.d.b(j12, j13, RoundingMode.UNNECESSARY)) : Q7.d.b(j11, Q7.d.b(j13, j12, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int a(long[] jArr, long j11, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i11 = binarySearch + 1;
            if (i11 >= jArr.length || jArr[i11] != j11) {
                break;
            }
            binarySearch = i11;
        }
        return z11 ? binarySearch : i11;
    }

    private static long a0(long j11, long j12, long j13, RoundingMode roundingMode) {
        long d11 = Q7.d.d(j11, j12);
        if (d11 != Long.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return Q7.d.b(d11, j13, roundingMode);
        }
        long c11 = Q7.d.c(Math.abs(j12), Math.abs(j13));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b11 = Q7.d.b(j12, c11, roundingMode2);
        long b12 = Q7.d.b(j13, c11, roundingMode2);
        long c12 = Q7.d.c(Math.abs(j11), Math.abs(b12));
        long b13 = Q7.d.b(j11, c12, roundingMode2);
        long b14 = Q7.d.b(b12, c12, roundingMode2);
        long d12 = Q7.d.d(b13, b11);
        if (d12 != Long.MAX_VALUE && d12 != Long.MIN_VALUE) {
            return Q7.d.b(d12, b14, roundingMode);
        }
        double d13 = b13 * (b11 / b14);
        if (d13 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d13 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return Q7.a.d(d13, roundingMode);
    }

    public static int b(AbstractC5880y abstractC5880y, Long l11, boolean z11) {
        int i11;
        int binarySearch = Collections.binarySearch(abstractC5880y, l11);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                int i12 = binarySearch - 1;
                if (i12 < 0 || ((Comparable) abstractC5880y.get(i12)).compareTo(l11) != 0) {
                    break;
                }
                binarySearch = i12;
            }
            i11 = binarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static boolean b0(j3.y yVar) {
        if (yVar == null || !yVar.l(1)) {
            return false;
        }
        return (yVar.l(17) && yVar.G().isEmpty()) ? false : true;
    }

    public static int c(t tVar, long j11) {
        int d11 = tVar.d() - 1;
        int i11 = 0;
        while (i11 <= d11) {
            int i12 = (i11 + d11) >>> 1;
            if (tVar.c(i12) < j11) {
                i11 = i12 + 1;
            } else {
                d11 = i12 - 1;
            }
        }
        int i13 = d11 + 1;
        if (i13 < tVar.d() && tVar.c(i13) == j11) {
            return i13;
        }
        if (d11 == -1) {
            return 0;
        }
        return d11;
    }

    public static boolean c0(j3.y yVar, boolean z11) {
        return yVar == null || !yVar.n() || yVar.P() == 1 || yVar.P() == 4 || !(!z11 || yVar.F() == 0 || yVar.F() == 4);
    }

    public static int d(int[] iArr, int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int binarySearch = Arrays.binarySearch(iArr, i11);
        if (binarySearch < 0) {
            i13 = -(binarySearch + 2);
        } else {
            while (true) {
                i12 = binarySearch - 1;
                if (i12 < 0 || iArr[i12] != i11) {
                    break;
                }
                binarySearch = i12;
            }
            i13 = z11 ? binarySearch : i12;
        }
        return z12 ? Math.max(0, i13) : i13;
    }

    public static String[] d0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int e(long[] jArr, long j11, boolean z11) {
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j11);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                int i12 = binarySearch - 1;
                if (i12 < 0 || jArr[i12] != j11) {
                    break;
                }
                binarySearch = i12;
            }
            i11 = binarySearch;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static boolean e0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static int f(int i11, int i12) {
        return ((i11 + i12) - 1) / i12;
    }

    public static String f0(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (str.charAt(i13) == '%') {
                i12++;
            }
        }
        if (i12 == 0) {
            return str;
        }
        int i14 = length - (i12 * 2);
        StringBuilder sb2 = new StringBuilder(i14);
        Matcher matcher = f74294f.matcher(str);
        while (i12 > 0 && matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            char parseInt = (char) Integer.parseInt(group, 16);
            sb2.append((CharSequence) str, i11, matcher.start());
            sb2.append(parseInt);
            i11 = matcher.end();
            i12--;
        }
        if (i11 < length) {
            sb2.append((CharSequence) str, i11, length);
        }
        if (sb2.length() != i14) {
            return null;
        }
        return sb2.toString();
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long g0(long j11) {
        return (j11 == -9223372036854775807L || j11 == Long.MIN_VALUE) ? j11 : j11 / 1000;
    }

    public static float h(float f7, float f11, float f12) {
        return Math.max(f11, Math.min(f7, f12));
    }

    public static int i(int i11, int i12, int i13) {
        return Math.max(i12, Math.min(i11, i13));
    }

    public static long j(long j11, long j12, long j13) {
        return Math.max(j12, Math.min(j11, j13));
    }

    public static <T> boolean k(SparseArray<T> sparseArray, int i11) {
        return sparseArray.indexOfKey(i11) >= 0;
    }

    public static boolean l(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int m(int i11, byte[] bArr) {
        int i12 = 65535;
        for (int i13 = 0; i13 < i11; i13++) {
            byte b11 = bArr[i13];
            int[] iArr = f74300l;
            int i14 = (((i12 << 4) & 65535) ^ iArr[(((b11 & 255) >> 4) ^ ((i12 >> 12) & 255)) & 255]) & 65535;
            i12 = (((i14 << 4) & 65535) ^ iArr[((b11 & 15) ^ ((i14 >> 12) & 255)) & 255]) & 65535;
        }
        return i12;
    }

    public static int n(int i11, byte[] bArr, int i12, int i13) {
        while (i11 < i12) {
            i13 = f74299k[((i13 >>> 24) ^ (bArr[i11] & 255)) & 255] ^ (i13 << 8);
            i11++;
        }
        return i13;
    }

    public static int o(int i11, int i12, byte[] bArr) {
        int i13 = 0;
        while (i11 < i12) {
            i13 = f74301m[i13 ^ (bArr[i11] & 255)];
            i11++;
        }
        return i13;
    }

    public static Handler p(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        G10.a.i(myLooper);
        return new Handler(myLooper, callback);
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i11) {
        if (i11 == 30) {
            return 34;
        }
        switch (i11) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i11) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i11) {
                            case 20:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    @SuppressLint({"InlinedApi"})
    public static int t(int i11) {
        if (i11 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i11 == 12) {
            return 743676;
        }
        if (i11 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i11) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int u(int i11) {
        if (i11 != 2) {
            if (i11 == 3) {
                return 1;
            }
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalArgumentException();
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int v(int i11, String str) {
        int i12 = 0;
        for (String str2 : d0(str)) {
            if (i11 == j3.u.h(j3.u.d(str2))) {
                i12++;
            }
        }
        return i12;
    }

    public static String w(int i11, String str) {
        String[] d02 = d0(str);
        if (d02.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : d02) {
            if (i11 == j3.u.h(j3.u.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static Point x(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && P(context)) {
            String F11 = Build.VERSION.SDK_INT < 28 ? F("sys.display-size") : F("vendor.display-size");
            if (!TextUtils.isEmpty(F11)) {
                try {
                    String[] split = F11.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                s.c("Util", "Invalid display size: " + F11);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static int y(int i11) {
        if (i11 == 2 || i11 == 4) {
            return 6005;
        }
        if (i11 == 10) {
            return 6004;
        }
        if (i11 == 7) {
            return 6005;
        }
        if (i11 == 8) {
            return 6003;
        }
        switch (i11) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i11) {
                    case 24:
                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                    case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int z(String str) {
        String[] split;
        int length;
        int i11 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z11 = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i11 = Integer.parseInt(str2);
            if (z11) {
                return -i11;
            }
        } catch (NumberFormatException unused) {
        }
        return i11;
    }
}
