package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.ads.AdError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.setting.i;
import com.unity3d.ads.BuildConfig;
import com.vungle.ads.internal.protos.Sdk;
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
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class nik {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static HashMap h;
    public static final String[] i;
    public static final String[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        a = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f = Pattern.compile("%([A-Fa-f0-9]{2})");
        g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 168, 175, 166, 161, 180, 179, 186, PsExtractor.PRIVATE_STREAM_1, 199, PsExtractor.AUDIO_STREAM, 201, 206, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, 255, 248, 241, 246, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, 228, 237, 234, 183, 176, ModuleDescriptor.MODULE_VERSION, 190, 171, 172, 165, 162, 143, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 170, 163, 164, 249, 254, 247, 240, 229, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 235, 236, 193, 198, 207, 200, Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 211, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, 105, 110, 103, 96, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 113, 120, Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 194, 197, 204, 203, 230, Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 232, 239, 250, 253, 244, 243};
    }

    public static int A(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i2) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
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
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    public static int B(String str) {
        String[] split;
        int length;
        int i2 = 0;
        if (str == null || (length = (split = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = split[length - 1];
        boolean z = length >= 3 && "neg".equals(split[length - 2]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static long C(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * f2);
    }

    public static long D(long j2) {
        return j2 == C.TIME_UNSET ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static int E(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long F(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static String G(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == C.TIME_UNSET) {
            j2 = 0;
        }
        String str = j2 < 0 ? "-" : "";
        long abs = (Math.abs(j2) + 500) / 1000;
        long j3 = abs % 60;
        long j4 = (abs / 60) % 60;
        long j5 = abs / 3600;
        sb.setLength(0);
        return j5 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j4), Long.valueOf(j3)).toString();
    }

    public static String[] H() {
        String[] split = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, -1);
        for (int i2 = 0; i2 < split.length; i2++) {
            split[i2] = U(split[i2]);
        }
        return split;
    }

    public static String I(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            tgj.A("Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String J(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return BuildConfig.FLAVOR;
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return TtmlNode.TAG_METADATA;
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? lnb.k(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean K(ale aleVar) {
        boolean z = false;
        if (aleVar == null) {
            return false;
        }
        int playbackState = aleVar.getPlaybackState();
        if (playbackState != 1 || !aleVar.k(2)) {
            if (playbackState == 4 && aleVar.k(4)) {
                aleVar.seekToDefaultPosition();
            }
            if (aleVar.k(1)) {
                return z;
            }
            aleVar.play();
            return true;
        }
        aleVar.a();
        z = true;
        if (aleVar.k(1)) {
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
    public static int L(Uri uri, String str) {
        int i2;
        if (str == null) {
            String scheme = uri.getScheme();
            if (scheme == null || (!rz8.C("rtsp", scheme) && !rz8.C("rtspt", scheme))) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String W = rz8.W(lastPathSegment.substring(lastIndexOf + 1));
                        W.getClass();
                        switch (W) {
                            case "ism":
                            case "isml":
                                i2 = 1;
                                break;
                            case "mpd":
                                i2 = 0;
                                break;
                            case "m3u8":
                                i2 = 2;
                                break;
                            default:
                                i2 = 4;
                                break;
                        }
                        if (i2 != 4) {
                            return i2;
                        }
                    }
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = g.matcher(path);
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
                if (str.equals(MimeTypes.APPLICATION_M3U8)) {
                    break;
                }
                break;
            case -156749520:
                if (str.equals(MimeTypes.APPLICATION_SS)) {
                    break;
                }
                break;
            case 64194685:
                if (str.equals(MimeTypes.APPLICATION_MPD)) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nik.L(android.net.Uri, java.lang.String):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean M(j9e j9eVar, j9e j9eVar2, Inflater inflater) {
        if (j9eVar.a() == 0) {
            return false;
        }
        if (j9eVar2.a.length < j9eVar.a()) {
            j9eVar2.c(j9eVar.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(j9eVar.a, j9eVar.b, j9eVar.a());
        int i2 = 0;
        while (true) {
            try {
                byte[] bArr = j9eVar2.a;
                i2 += inflater.inflate(bArr, i2, bArr.length - i2);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    byte[] bArr2 = j9eVar2.a;
                    if (i2 == bArr2.length) {
                        j9eVar2.c(bArr2.length * 2);
                    }
                } else {
                    j9eVar2.M(i2);
                    inflater.reset();
                    return true;
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
    }

    public static void N(int i2) {
        Integer.toString(i2, 36);
    }

    public static boolean O(int i2) {
        return i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1879048192;
    }

    public static boolean P(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4 || i2 == 1879048192;
    }

    public static boolean Q(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (rz8.C(str, "moto g(20)") || rz8.C(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && rz8.C(Build.MODEL, "sm-x200");
    }

    public static boolean R(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean S(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long T(long j2) {
        return (j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String U(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(C.LANGUAGE_UNDETERMINED)) {
            str = replace;
        }
        String W = rz8.W(str);
        int i2 = 0;
        String str2 = W.split("-", 2)[0];
        HashMap hashMap = h;
        if (hashMap == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = i;
            HashMap hashMap2 = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap2.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                hashMap2.put(strArr[i3], strArr[i3 + 1]);
            }
            h = hashMap2;
            hashMap = hashMap2;
        }
        String str4 = (String) hashMap.get(str2);
        if (str4 != null) {
            W = str4.concat(W.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !i.a.equals(str2) && !"zh".equals(str2)) {
            return W;
        }
        while (true) {
            String[] strArr2 = j;
            if (i2 >= strArr2.length) {
                return W;
            }
            if (W.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + W.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] V(Object[] objArr, int i2) {
        z1a.s(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long W(String str) {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw s9e.a(null, "Invalid date/time format: " + str);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int parseInt = Integer.parseInt(matcher.group(12)) * 60;
            String group = matcher.group(13);
            i2 = group != null ? Integer.parseInt(group) + parseInt : parseInt;
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) : timeInMillis;
    }

    public static void X(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void Y(ArrayList arrayList, int i2, int i3) {
        if (i2 < 0 || i3 > arrayList.size() || i2 > i3) {
            ilg.c();
        } else if (i2 != i3) {
            arrayList.subList(i2, i3).clear();
        }
    }

    public static long Z(int i2, long j2) {
        return b0(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static long a(long j2, long j3) {
        long j4 = j2 + j3;
        long j5 = (((j3 ^ j2) > 0L ? 1 : ((j3 ^ j2) == 0L ? 0 : -1)) < 0) | ((j2 ^ j4) >= 0) ? j4 : ((j4 >>> 63) ^ 1) + Long.MAX_VALUE;
        if ((j5 != Long.MIN_VALUE || j4 == Long.MIN_VALUE) && (j5 != Long.MAX_VALUE || j4 == Long.MAX_VALUE)) {
            return j5;
        }
        return Long.MAX_VALUE;
    }

    public static void a0(long[] jArr, long j2) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long x = i9a.x(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = i9a.x(jArr[i2], x, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long x2 = i9a.x(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = i9a.G(jArr[i2], x2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = i9a.x(1000000L, i9a.x(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = c0(j4, 1000000L, j3, roundingMode);
                    i3++;
                    j2 = j3;
                } else {
                    jArr[i3] = i9a.G(1000000L, i9a.x(j4, j2, RoundingMode.UNNECESSARY));
                }
            }
            j3 = j2;
            i3++;
            j2 = j3;
        }
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i2 = binarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            binarySearch = i2;
        }
        return z ? binarySearch : i2;
    }

    public static long b0(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        return (j4 < j3 || j4 % j3 != 0) ? (j4 >= j3 || j3 % j4 != 0) ? (j4 < j2 || j4 % j2 != 0) ? (j4 >= j2 || j2 % j4 != 0) ? c0(j2, j3, j4, roundingMode) : i9a.G(j3, i9a.x(j2, j4, RoundingMode.UNNECESSARY)) : i9a.x(j3, i9a.x(j4, j2, RoundingMode.UNNECESSARY), roundingMode) : i9a.G(j2, i9a.x(j3, j4, RoundingMode.UNNECESSARY)) : i9a.x(j2, i9a.x(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int c(ojb ojbVar, long j2) {
        int i2 = ojbVar.b - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            if (ojbVar.d(i4) < j2) {
                i3 = i4 + 1;
            } else {
                i2 = i4 - 1;
            }
        }
        int i5 = i2 + 1;
        if (i5 < ojbVar.b && ojbVar.d(i5) == j2) {
            return i5;
        }
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long c0(long j2, long j3, long j4, RoundingMode roundingMode) {
        double d2;
        long j5;
        long G = i9a.G(j2, j3);
        if (G != Long.MAX_VALUE && G != Long.MIN_VALUE) {
            return i9a.x(G, j4, roundingMode);
        }
        long z = i9a.z(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long x = i9a.x(j3, z, roundingMode2);
        long x2 = i9a.x(j4, z, roundingMode2);
        long z2 = i9a.z(Math.abs(j2), Math.abs(x2));
        long x3 = i9a.x(j2, z2, roundingMode2);
        long x4 = i9a.x(x2, z2, roundingMode2);
        long G2 = i9a.G(x3, x);
        if (G2 != Long.MAX_VALUE && G2 != Long.MIN_VALUE) {
            return i9a.x(G2, x4, roundingMode);
        }
        double d3 = x3 * (x / x4);
        if (d3 > 9.223372036854776E18d) {
            return Long.MAX_VALUE;
        }
        if (d3 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        int i2 = e75.a;
        if (!gz8.O(d3)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (d75.a[roundingMode.ordinal()]) {
            case 1:
                f6a.k(e75.a(d3));
                d2 = d3;
                if (!((-9.223372036854776E18d) - d2 >= 1.0d) || !(d2 < 9.223372036854776E18d)) {
                    return (long) d2;
                }
                throw new ArithmeticException("rounded value is out of range for input " + d3 + " and rounding mode " + roundingMode);
            case 2:
                if (d3 < 0.0d && !e75.a(d3)) {
                    j5 = ((long) d3) - 1;
                    d2 = j5;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 3:
                if (d3 > 0.0d && !e75.a(d3)) {
                    j5 = ((long) d3) + 1;
                    d2 = j5;
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 4:
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 5:
                if (!e75.a(d3)) {
                    d2 = ((long) d3) + (d3 > 0.0d ? 1 : -1);
                    if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                    }
                }
                d2 = d3;
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 6:
                d2 = Math.rint(d3);
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 7:
                d2 = Math.rint(d3);
                if (Math.abs(d3 - d2) == 0.5d) {
                    d2 = Math.copySign(0.5d, d3) + d3;
                }
                if (!(((-9.223372036854776E18d) - d2 >= 1.0d) & (d2 < 9.223372036854776E18d))) {
                }
                break;
            case 8:
                d2 = Math.rint(d3);
                break;
            default:
                ogj.b();
                return 0L;
        }
    }

    public static int d(List list, Long l2, boolean z) {
        int i2;
        int binarySearch = Collections.binarySearch(list, l2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static boolean d0(ale aleVar) {
        if (aleVar != null) {
            int playbackState = aleVar.getPlaybackState();
            boolean z = (aleVar.k(16) && aleVar.e() == null) ? false : true;
            boolean k2 = aleVar.k(1);
            boolean z2 = playbackState == 1 && aleVar.k(2);
            boolean z3 = playbackState == 4 && aleVar.k(4);
            if (z && (k2 || z2 || z3)) {
                return true;
            }
        }
        return false;
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i4 = -(binarySearch + 2);
        } else {
            while (true) {
                i3 = binarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                binarySearch = i3;
            }
            i4 = z ? binarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static boolean e0(ale aleVar, boolean z) {
        return aleVar == null || !aleVar.getPlayWhenReady() || aleVar.getPlaybackState() == 1 || aleVar.getPlaybackState() == 4 || !(!z || aleVar.m() == 0 || aleVar.m() == 4);
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            while (true) {
                int i3 = binarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                binarySearch = i3;
            }
            i2 = binarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static String[] f0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static String g0(int i2) {
        return new String(new byte[]{(byte) (i2 >> 24), (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2}, StandardCharsets.US_ASCII);
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long h0(long j2) {
        return (j2 == C.TIME_UNSET || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static float i(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int j(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean l(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static boolean m(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean n(SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentEquals(sparseArray2);
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!Objects.equals(sparseArray.valueAt(i2), sparseArray2.get(sparseArray.keyAt(i2)))) {
                return false;
            }
        }
        return true;
    }

    public static int o(SparseArray sparseArray) {
        if (Build.VERSION.SDK_INT >= 31) {
            return sparseArray.contentHashCode();
        }
        int i2 = 17;
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            i2 = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (i2 * 31)) * 31);
        }
        return i2;
    }

    public static int p(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = k[((i4 >>> 24) ^ (bArr[i2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static Handler q(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        return new Handler(myLooper, callback);
    }

    public static String r(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int s(int i2) {
        switch (i2) {
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
            case 15:
            case 16:
            case 17:
            case 18:
                return 28;
            case 13:
            case 19:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            default:
                return Integer.MAX_VALUE;
            case 14:
                return 25;
            case 20:
                return 30;
            case 21:
            case 22:
                return 31;
            case 30:
            case 31:
                return 34;
        }
    }

    public static int t(int i2) {
        if (i2 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i2 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i2 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i2) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                switch (i2) {
                    case 13:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                    case 14:
                        if (Build.VERSION.SDK_INT >= 32) {
                        }
                        break;
                }
        }
        return 0;
    }

    public static ske u(g51 g51Var, ske skeVar) {
        boolean isPlayingAd = g51Var.isPlayingAd();
        boolean K = g51Var.K();
        boolean G = g51Var.G();
        boolean F = g51Var.F();
        boolean J = g51Var.J();
        boolean I = g51Var.I();
        boolean p = g51Var.getCurrentTimeline().p();
        h78 h78Var = new h78(1);
        h78Var.b(skeVar.a);
        if (!isPlayingAd) {
            h78Var.a(4);
        }
        if (K && !isPlayingAd) {
            h78Var.a(5);
        }
        if (G && !isPlayingAd) {
            h78Var.a(6);
        }
        if (!p && (G || !J || K) && !isPlayingAd) {
            h78Var.a(7);
        }
        if (F && !isPlayingAd) {
            h78Var.a(8);
        }
        if (!p && (F || (J && I)) && !isPlayingAd) {
            h78Var.a(9);
        }
        if (!isPlayingAd) {
            h78Var.a(10);
        }
        if (K && !isPlayingAd) {
            h78Var.a(11);
        }
        if (K && !isPlayingAd) {
            h78Var.a(12);
        }
        return new ske(h78Var.d());
    }

    public static int v(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    if (i2 == 1879048192) {
                                        return 8;
                                    }
                                    ilg.c();
                                    return 0;
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

    public static int w(int i2, String str) {
        int i3 = 0;
        for (String str2 : f0(str)) {
            if (i2 == sjc.i(sjc.e(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String x(String str, int i2) {
        String[] f0 = f0(str);
        if (f0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : f0) {
            if (i2 == sjc.i(sjc.e(str2))) {
                if (sb.length() > 0) {
                    sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w13 y(String str, String str2, String str3) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (str == null || !sjc.l(str, str2)) {
            return null;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            i2 = 1;
        } else {
            if (str3 != null) {
                i2 = 2;
                if (!str3.equals("db1p")) {
                    if (str3.startsWith("db4")) {
                        i3 = 7;
                        i4 = 2;
                        i5 = 6;
                        if (i5 == -1) {
                            return null;
                        }
                        return new w13(i5, i4, i3, -1, -1, null);
                    }
                }
            }
            i5 = -1;
            i4 = -1;
            i3 = -1;
            if (i5 == -1) {
            }
        }
        i4 = i2;
        i5 = 6;
        i3 = 6;
        if (i5 == -1) {
        }
    }

    public static Point z(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(U3.i.d);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && S(context)) {
            String I = Build.VERSION.SDK_INT < 28 ? I("sys.display-size") : I("vendor.display-size");
            if (!TextUtils.isEmpty(I)) {
                try {
                    String[] split = I.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                tgj.z("Invalid display size: " + I);
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
}
