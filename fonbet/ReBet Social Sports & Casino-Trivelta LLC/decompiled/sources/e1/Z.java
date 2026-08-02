package e1;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.media.AudioFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.a;
import b1.AbstractC2335D;
import b1.AbstractC2356j;
import b1.C2338G;
import b1.InterfaceC2341J;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.plaid.internal.EnumC3631g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
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
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.LongCompanionObject;
import lb.C5444x;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes.dex */
public abstract class Z {
    private static final int[] CRC16_BYTES_MSBF;
    private static final int[] CRC32_BYTES_MSBF;
    private static final int[] CRC8_BYTES_MSBF;
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final long[] EMPTY_LONG_ARRAY;

    /* renamed from: a, reason: collision with root package name */
    public static final int f45503a;
    private static final String[] additionalIsoLanguageReplacements;

    /* renamed from: b, reason: collision with root package name */
    public static final String f45504b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f45505c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f45506d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f45507e;

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f45508f;

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f45509g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f45510h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f45511i;
    private static final String[] isoLegacyTagReplacements;

    /* renamed from: j, reason: collision with root package name */
    public static HashMap f45512j;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f45503a = i10;
        String str = Build.DEVICE;
        f45504b = str;
        String str2 = Build.MANUFACTURER;
        f45505c = str2;
        String str3 = Build.MODEL;
        f45506d = str3;
        f45507e = str + ", " + str3 + ", " + str2 + ", " + i10;
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_LONG_ARRAY = new long[0];
        f45508f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        f45509g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f45510h = Pattern.compile("%([A-Fa-f0-9]{2})");
        f45511i = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        additionalIsoLanguageReplacements = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", StackTraceHelper.ID_KEY, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        isoLegacyTagReplacements = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        CRC32_BYTES_MSBF = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        CRC16_BYTES_MSBF = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        CRC8_BYTES_MSBF = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 252, 251, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 216, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ICON_PIN_VALUE, EnumC3631g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC3631g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 202, 205, 144, 151, EnumC3631g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 130, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 180, EnumC3631g.SDK_ASSET_ILLUSTRATION_VERIFICATION_IN_PROGRESS_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC3631g.SDK_ASSET_ICON_CANCEL_VALUE, 192, 201, 206, EnumC3631g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC3631g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC3631g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 255, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 165, EnumC3631g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC3631g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 136, EnumC3631g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 134, 147, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 157, EnumC3631g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 128, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 155, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE, EnumC3631g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, EnumC3631g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 254, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC3631g.SDK_ASSET_ICON_COMMENT_VALUE, 200, EnumC3631g.SDK_ASSET_ICON_SUBMIT_VALUE, 218, 211, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, 105, 110, 103, 96, 117, 114, 123, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC3631g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 167, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_IDENTITY_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 188, EnumC3631g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, EnumC3631g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 131, EnumC3631g.SDK_ASSET_ICON_SUBTRACT_VALUE, 217, 208, 215, EnumC3631g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 204, 203, EnumC3631g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 225, EnumC3631g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, 250, 253, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE};
    }

    public static Handler A(Handler.Callback callback) {
        return y((Looper) AbstractC4134a.i(Looper.myLooper()), callback);
    }

    public static String A0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") AndroidXMedia3/1.8.0";
    }

    public static String[] A1(String str, String str2) {
        return str.split(str2, -1);
    }

    public static Handler B() {
        return C(null);
    }

    public static byte[] B0(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static String[] B1(String str, String str2) {
        return str.split(str2, 2);
    }

    public static Handler C(Handler.Callback callback) {
        return y(a0(), callback);
    }

    public static boolean C0(InterfaceC2341J interfaceC2341J) {
        if (interfaceC2341J == null || !interfaceC2341J.E(1)) {
            return false;
        }
        interfaceC2341J.pause();
        return true;
    }

    public static String[] C1(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : A1(str.trim(), "(\\s*,\\s*)");
    }

    public static HashMap D() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap hashMap = new HashMap(iSOLanguages.length + additionalIsoLanguageReplacements.length);
        int i10 = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = additionalIsoLanguageReplacements;
            if (i10 >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i10], strArr[i10 + 1]);
            i10 += 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean D0(InterfaceC2341J interfaceC2341J) {
        boolean z10 = false;
        if (interfaceC2341J == null) {
            return false;
        }
        int g02 = interfaceC2341J.g0();
        if (g02 != 1 || !interfaceC2341J.E(2)) {
            if (g02 == 4 && interfaceC2341J.E(4)) {
                interfaceC2341J.n();
            }
            if (interfaceC2341J.E(1)) {
                return z10;
            }
            interfaceC2341J.play();
            return true;
        }
        interfaceC2341J.g();
        z10 = true;
        if (interfaceC2341J.E(1)) {
        }
    }

    public static long D1(long j10, long j11, long j12) {
        long j13 = j10 - j11;
        return ((j10 ^ j13) & (j11 ^ j10)) < 0 ? j12 : j13;
    }

    public static long E(long j10, int i10) {
        return s1(j10, i10, 1000000L, RoundingMode.UP);
    }

    public static boolean E0(InterfaceC2341J interfaceC2341J, boolean z10) {
        return x1(interfaceC2341J, z10) ? D0(interfaceC2341J) : C0(interfaceC2341J);
    }

    public static boolean E1(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static Uri F(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f45511i.matcher(path);
        return (matcher.matches() && matcher.group(1) == null) ? Uri.withAppendedPath(uri, "Manifest") : uri;
    }

    public static int F0(Uri uri) {
        int H02;
        String scheme = uri.getScheme();
        if (scheme != null && (Ra.c.a("rtsp", scheme) || Ra.c.a("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (H02 = H0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return H02;
        }
        Matcher matcher = f45511i.matcher((CharSequence) AbstractC4134a.e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    public static String F1(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            sb2.append(Character.forDigit((bArr[i10] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i10] & 15, 16));
        }
        return sb2.toString();
    }

    public static String G(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int G0(String str) {
        return F0(Uri.parse("file:///" + str));
    }

    public static long G1(int i10, int i11) {
        return H1(i11) | (H1(i10) << 32);
    }

    public static String H(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int H0(String str) {
        String e10 = Ra.c.e(str);
        e10.getClass();
        switch (e10) {
            case "ism":
            case "isml":
                return 1;
            case "mpd":
                return 0;
            case "m3u8":
                return 2;
            default:
                return 4;
        }
    }

    public static long H1(int i10) {
        return i10 & BodyPartID.bodyIdMax;
    }

    public static String I(byte[] bArr, int i10, int i11) {
        return new String(bArr, i10, i11, StandardCharsets.UTF_8);
    }

    public static int I0(Uri uri, String str) {
        if (str == null) {
            return F0(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static String I1(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            if (str.charAt(i12) == '%') {
                i11++;
            }
        }
        if (i11 == 0) {
            return str;
        }
        int i13 = length - (i11 * 2);
        StringBuilder sb2 = new StringBuilder(i13);
        Matcher matcher = f45510h.matcher(str);
        while (i11 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt((String) AbstractC4134a.e(matcher.group(1)), 16);
            sb2.append((CharSequence) str, i10, matcher.start());
            sb2.append(parseInt);
            i10 = matcher.end();
            i11--;
        }
        if (i10 < length) {
            sb2.append((CharSequence) str, i10, length);
        }
        if (sb2.length() != i13) {
            return null;
        }
        return sb2.toString();
    }

    public static int J(Context context) {
        return c1.m.c(context).generateAudioSessionId();
    }

    public static boolean J0(J j10, J j11, Inflater inflater) {
        if (j10.a() == 0) {
            return false;
        }
        if (j11.b() < j10.a()) {
            j11.d(j10.a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(j10.f(), j10.g(), j10.a());
        int i10 = 0;
        while (true) {
            try {
                i10 += inflater.inflate(j11.f(), i10, j11.b() - i10);
                if (!inflater.finished()) {
                    if (inflater.needsDictionary() || inflater.needsInput()) {
                        break;
                    }
                    if (i10 == j11.b()) {
                        j11.d(j11.b() * 2);
                    }
                } else {
                    j11.a0(i10);
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

    public static long J1(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }

    public static int K(int i10) {
        if (i10 == 30) {
            return 34;
        }
        switch (i10) {
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
                switch (i10) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i10) {
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

    public static String K0(int i10) {
        return Integer.toString(i10, 36);
    }

    public static int L(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2 || i10 == 4 || i10 == 5 || i10 == 8) {
                return 4;
            }
            if (i10 != 10) {
                return 2;
            }
        }
        return 1;
    }

    public static boolean L0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    public static AudioFormat M(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean M0(String str) {
        str.getClass();
        switch (str) {
            case "image/avif":
                return Build.VERSION.SDK_INT >= 34;
            case "image/heic":
            case "image/heif":
                return Build.VERSION.SDK_INT >= 26;
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return true;
            default:
                return false;
        }
    }

    public static int N(int i10) {
        if (i10 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i10 == 12) {
            return 743676;
        }
        if (i10 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i10) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return EnumC3631g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE;
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

    public static boolean N0(int i10) {
        return i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static int O(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 13;
        }
        if (i10 == 2) {
            return 6;
        }
        int i11 = 4;
        if (i10 != 4) {
            i11 = 5;
            if (i10 != 5) {
                if (i10 != 8) {
                    return i10 != 10 ? 1 : 11;
                }
                return 3;
            }
        }
        return i11;
    }

    public static boolean O0(int i10) {
        return i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 21 || i10 == 1342177280 || i10 == 22 || i10 == 1610612736 || i10 == 4;
    }

    public static String P(int i10) {
        if (i10 == 0) {
            return "undefined";
        }
        if (i10 == 1) {
            return "original";
        }
        if (i10 == 2) {
            return "depth-linear";
        }
        if (i10 == 3) {
            return "depth-inverse";
        }
        if (i10 == 4) {
            return "depth metadata";
        }
        throw new IllegalStateException("Unsupported auxiliary track type");
    }

    public static boolean P0(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i10 == 30) {
            String str = Build.MODEL;
            if (Ra.c.a(str, "moto g(20)") || Ra.c.a(str, "rmx3231")) {
                return true;
            }
        }
        return i10 == 34 && Ra.c.a(Build.MODEL, "sm-x200");
    }

    public static InterfaceC2341J.b Q(InterfaceC2341J interfaceC2341J, InterfaceC2341J.b bVar) {
        boolean j10 = interfaceC2341J.j();
        boolean f02 = interfaceC2341J.f0();
        boolean a02 = interfaceC2341J.a0();
        boolean B10 = interfaceC2341J.B();
        boolean s02 = interfaceC2341J.s0();
        boolean G10 = interfaceC2341J.G();
        boolean q10 = interfaceC2341J.I().q();
        boolean z10 = false;
        InterfaceC2341J.b.a d10 = new InterfaceC2341J.b.a().b(bVar).d(4, !j10).d(5, f02 && !j10).d(6, a02 && !j10).d(7, !q10 && (a02 || !s02 || f02) && !j10).d(8, B10 && !j10).d(9, !q10 && (B10 || (s02 && G10)) && !j10).d(10, !j10).d(11, f02 && !j10);
        if (f02 && !j10) {
            z10 = true;
        }
        return d10.d(12, z10).e();
    }

    public static boolean Q0(int i10) {
        return i10 == 10 || i10 == 13;
    }

    public static int R(ByteBuffer byteBuffer, int i10) {
        int i11 = byteBuffer.getInt(i10);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i11 : Integer.reverseBytes(i11);
    }

    public static boolean R0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    public static int S(int i10) {
        if (i10 != 2) {
            if (i10 == 3) {
                return 1;
            }
            if (i10 != 4) {
                if (i10 != 21) {
                    if (i10 != 22) {
                        if (i10 != 268435456) {
                            if (i10 != 1342177280) {
                                if (i10 != 1610612736) {
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

    public static boolean S0() {
        String e10 = Ra.c.e(Build.DEVICE);
        return e10.contains("emulator") || e10.contains("emu64a") || e10.contains("emu64x") || e10.contains("generic");
    }

    public static byte[] T(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static boolean T0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static int U(String str, int i10) {
        int i11 = 0;
        for (String str2 : C1(str)) {
            if (i10 == AbstractC2335D.m(str2)) {
                i11++;
            }
        }
        return i11;
    }

    public static boolean U0(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static String V(String str, int i10) {
        String[] C12 = C1(str);
        if (C12.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : C12) {
            if (i10 == AbstractC2335D.m(str2)) {
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

    public static int V0(int[] iArr, int i10) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static String W(String str, int i10) {
        String[] C12 = C1(str);
        if (C12.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : C12) {
            if (i10 != AbstractC2335D.m(str2)) {
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

    public static String W0(Context context, String str) {
        InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return H(Sa.a.d(inputStream));
        } finally {
            m(inputStream);
        }
    }

    public static String X(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return Ra.c.f(networkCountryIso);
            }
        }
        return Ra.c.f(Locale.getDefault().getCountry());
    }

    public static boolean X0(J j10, J j11, Inflater inflater) {
        return j10.a() > 0 && j10.n() == 120 && J0(j10, j11, inflater);
    }

    public static Point Y(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            display = ((WindowManager) AbstractC4134a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        }
        return Z(context, display);
    }

    public static String Y0(String str) {
        int i10 = 0;
        while (true) {
            String[] strArr = isoLegacyTagReplacements;
            if (i10 >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i10])) {
                return strArr[i10 + 1] + str.substring(strArr[i10].length());
            }
            i10 += 2;
        }
    }

    public static Point Z(Context context, Display display) {
        if (display.getDisplayId() == 0 && T0(context)) {
            String y02 = Build.VERSION.SDK_INT < 28 ? y0("sys.display-size") : y0("vendor.display-size");
            if (!TextUtils.isEmpty(y02)) {
                try {
                    String[] A12 = A1(y02.trim(), C5444x.f55808b);
                    if (A12.length == 2) {
                        int parseInt = Integer.parseInt(A12[0]);
                        int parseInt2 = Integer.parseInt(A12[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC4156x.d("Util", "Invalid display size: " + y02);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        c0(display, point);
        return point;
    }

    public static long Z0(SparseLongArray sparseLongArray) {
        if (sparseLongArray.size() == 0) {
            throw new NoSuchElementException();
        }
        long j10 = LongCompanionObject.MAX_VALUE;
        for (int i10 = 0; i10 < sparseLongArray.size(); i10++) {
            j10 = Math.min(j10, sparseLongArray.valueAt(i10));
        }
        return j10;
    }

    public static /* synthetic */ Thread a(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Looper a0() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    public static long a1(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 * 1000;
    }

    public static /* synthetic */ Thread b(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    public static Locale b0() {
        return Locale.getDefault(Locale.Category.DISPLAY);
    }

    public static ExecutorService b1(final String str) {
        return Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: e1.X
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Z.b(str, runnable);
            }
        });
    }

    public static long c(long j10, long j11, long j12) {
        long j13 = j10 + j11;
        return ((j10 ^ j13) & (j11 ^ j13)) < 0 ? j12 : j13;
    }

    public static void c0(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static ScheduledExecutorService c1(final String str) {
        return Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: e1.Y
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Z.a(str, runnable);
            }
        });
    }

    public static int d(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i11 = ~binarySearch;
        } else {
            while (true) {
                i10 = binarySearch + 1;
                if (i10 >= jArr.length || jArr[i10] != j10) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.min(jArr.length - 1, i11) : i11;
    }

    public static Drawable d0(Context context, Resources resources, int i10) {
        return resources.getDrawable(i10, context.getTheme());
    }

    public static String d1(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e10 = Ra.c.e(str);
        String str2 = B1(e10, "-")[0];
        if (f45512j == null) {
            f45512j = D();
        }
        String str3 = (String) f45512j.get(str2);
        if (str3 != null) {
            e10 = str3 + e10.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || com.google.android.material.shape.i.f35755A.equals(str2) || "zh".equals(str2)) ? Y0(e10) : e10;
    }

    public static int e(C4157y c4157y, long j10, boolean z10, boolean z11) {
        int i10;
        int d10 = c4157y.d() - 1;
        int i11 = 0;
        while (i11 <= d10) {
            int i12 = (i11 + d10) >>> 1;
            if (c4157y.c(i12) < j10) {
                i11 = i12 + 1;
            } else {
                d10 = i12 - 1;
            }
        }
        if (z10 && (i10 = d10 + 1) < c4157y.d() && c4157y.c(i10) == j10) {
            return i10;
        }
        if (z11 && d10 == -1) {
            return 0;
        }
        return d10;
    }

    public static UUID e0(String str) {
        String e10 = Ra.c.e(str);
        e10.getClass();
        switch (e10) {
            case "playready":
                return AbstractC2356j.f24595e;
            case "widevine":
                return AbstractC2356j.f24594d;
            case "clearkey":
                return AbstractC2356j.f24593c;
            default:
                try {
                    return UUID.fromString(str);
                } catch (RuntimeException unused) {
                    return null;
                }
        }
    }

    public static Object[] e1(Object[] objArr, Object obj) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        copyOf[objArr.length] = obj;
        return j(copyOf);
    }

    public static int f(List list, Comparable comparable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Collections.binarySearch(list, comparable);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || ((Comparable) list.get(i10)).compareTo(comparable) != 0) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static int f0(int i10) {
        if (i10 == 2 || i10 == 4) {
            return 6005;
        }
        if (i10 == 10) {
            return 6004;
        }
        if (i10 == 7) {
            return 6005;
        }
        if (i10 == 8) {
            return 6003;
        }
        switch (i10) {
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
                switch (i10) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static Object[] f1(Object[] objArr, Object[] objArr2) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + objArr2.length);
        System.arraycopy(objArr2, 0, copyOf, objArr.length, objArr2.length);
        return copyOf;
    }

    public static int g(int[] iArr, int i10, boolean z10, boolean z11) {
        int i11;
        int i12;
        int binarySearch = Arrays.binarySearch(iArr, i10);
        if (binarySearch < 0) {
            i12 = -(binarySearch + 2);
        } else {
            while (true) {
                i11 = binarySearch - 1;
                if (i11 < 0 || iArr[i11] != i10) {
                    break;
                }
                binarySearch = i11;
            }
            i12 = z10 ? binarySearch : i11;
        }
        return z11 ? Math.max(0, i12) : i12;
    }

    public static int g0(String str) {
        String[] A12;
        int length;
        int i10 = 0;
        if (str == null || (length = (A12 = A1(str, "_")).length) < 2) {
            return 0;
        }
        String str2 = A12[length - 1];
        boolean z10 = length >= 3 && "neg".equals(A12[length - 2]);
        try {
            i10 = Integer.parseInt((String) AbstractC4134a.e(str2));
            if (z10) {
                return -i10;
            }
        } catch (NumberFormatException unused) {
        }
        return i10;
    }

    public static Object[] g1(Object[] objArr, int i10) {
        AbstractC4134a.a(i10 <= objArr.length);
        return Arrays.copyOf(objArr, i10);
    }

    public static int h(long[] jArr, long j10, boolean z10, boolean z11) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(jArr, j10);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j10) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z10 ? binarySearch : i10;
        }
        return z11 ? Math.max(0, i11) : i11;
    }

    public static String h0(int i10) {
        if (i10 == 0) {
            return "NO";
        }
        if (i10 == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i10 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i10 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i10 == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    public static Object[] h1(Object[] objArr, int i10, int i11) {
        AbstractC4134a.a(i10 >= 0);
        AbstractC4134a.a(i11 <= objArr.length);
        return Arrays.copyOfRange(objArr, i10, i11);
    }

    public static int i0(ByteBuffer byteBuffer, int i10) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte b10 = byteBuffer.get(order == byteOrder ? i10 : i10 + 2);
        byte b11 = byteBuffer.get(i10 + 1);
        if (byteBuffer.order() == byteOrder) {
            i10 += 2;
        }
        return (((byteBuffer.get(i10) << 8) & 65280) | (((b10 << 24) & (-16777216)) | ((b11 << Tnaf.POW_2_WIDTH) & 16711680))) >> 8;
    }

    public static long i1(String str) {
        Matcher matcher = f45508f.matcher(str);
        if (!matcher.matches()) {
            throw C2338G.a("Invalid date/time format: " + str, null);
        }
        int i10 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i10 = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
            if ("-".equals(matcher.group(11))) {
                i10 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i10 != 0 ? timeInMillis - (i10 * 60000) : timeInMillis;
    }

    public static String j0(Locale locale) {
        return locale.toLanguageTag();
    }

    public static long j1(String str) {
        Matcher matcher = f45509g.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return !isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static int k(int i10, int i11) {
        return ((i10 + i11) - 1) / i11;
    }

    public static int k0(Context context) {
        return P0(context) ? 1 : 5;
    }

    public static int k1(long j10, long j11) {
        long d10 = com.google.common.math.e.d(j10, 100L);
        return com.google.common.primitives.f.e((d10 == LongCompanionObject.MAX_VALUE || d10 == Long.MIN_VALUE) ? j10 / (j11 / 100) : d10 / j11);
    }

    public static long l(long j10, long j11) {
        return ((j10 + j11) - 1) / j11;
    }

    public static long l0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 * f10);
    }

    public static boolean l1(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (!looper.getThread().isAlive()) {
            return false;
        }
        if (looper != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long m0(long j10) {
        return j10 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j10;
    }

    public static void m1(ByteBuffer byteBuffer, int i10) {
        AbstractC4134a.b(((-16777216) & i10) == 0 || (i10 & (-8388608)) == -8388608, "Value out of range of 24-bit integer: " + Integer.toHexString(i10));
        AbstractC4134a.a(byteBuffer.remaining() >= 3);
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byteBuffer.put((byte) (order == byteOrder ? (i10 & 16711680) >> 16 : i10 & 255)).put((byte) ((65280 & i10) >> 8)).put((byte) (byteBuffer.order() == byteOrder ? i10 & 255 : (i10 & 16711680) >> 16));
    }

    public static float n(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int n0(int i10) {
        return o0(i10, ByteOrder.LITTLE_ENDIAN);
    }

    public static void n1(List list, int i10, int i11) {
        if (i10 < 0 || i11 > list.size() || i10 > i11) {
            throw new IllegalArgumentException();
        }
        if (i10 != i11) {
            list.subList(i10, i11).clear();
        }
    }

    public static int o(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i10, i12));
    }

    public static int o0(int i10, ByteOrder byteOrder) {
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i10 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i10 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long o1(long j10, int i10) {
        return s1(j10, 1000000L, i10, RoundingMode.DOWN);
    }

    public static long p(long j10, long j11, long j12) {
        return Math.max(j11, Math.min(j10, j12));
    }

    public static androidx.media3.common.a p0(int i10, int i11, int i12) {
        return new a.b().y0("audio/raw").T(i11).z0(i12).s0(i10).P();
    }

    public static long p1(long j10, long j11, long j12) {
        return s1(j10, j11, j12, RoundingMode.DOWN);
    }

    public static boolean q(SparseArray sparseArray, int i10) {
        return sparseArray.indexOfKey(i10) >= 0;
    }

    public static int q0(int i10, int i11) {
        return S(i10) * i11;
    }

    public static long[] q1(List list, long j10, long j11) {
        return u1(list, j10, j11, RoundingMode.DOWN);
    }

    public static boolean r(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static long r0(long j10, float f10) {
        return f10 == 1.0f ? j10 : Math.round(j10 / f10);
    }

    public static void r1(long[] jArr, long j10, long j11) {
        v1(jArr, j10, j11, RoundingMode.DOWN);
    }

    public static boolean s(SparseArray sparseArray, SparseArray sparseArray2) {
        boolean contentEquals;
        if (sparseArray == null) {
            return sparseArray2 == null;
        }
        if (sparseArray2 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            contentEquals = sparseArray.contentEquals(sparseArray2);
            return contentEquals;
        }
        int size = sparseArray.size();
        if (size != sparseArray2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!Objects.equals(sparseArray.valueAt(i10), sparseArray2.get(sparseArray.keyAt(i10)))) {
                return false;
            }
        }
        return true;
    }

    public static List s0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            arrayList.add("main");
        }
        if ((i10 & 2) != 0) {
            arrayList.add("alt");
        }
        if ((i10 & 4) != 0) {
            arrayList.add("supplementary");
        }
        if ((i10 & 8) != 0) {
            arrayList.add("commentary");
        }
        if ((i10 & 16) != 0) {
            arrayList.add("dub");
        }
        if ((i10 & 32) != 0) {
            arrayList.add("emergency");
        }
        if ((i10 & 64) != 0) {
            arrayList.add("caption");
        }
        if ((i10 & 128) != 0) {
            arrayList.add("subtitle");
        }
        if ((i10 & 256) != 0) {
            arrayList.add("sign");
        }
        if ((i10 & 512) != 0) {
            arrayList.add("describes-video");
        }
        if ((i10 & 1024) != 0) {
            arrayList.add("describes-music");
        }
        if ((i10 & 2048) != 0) {
            arrayList.add("enhanced-intelligibility");
        }
        if ((i10 & 4096) != 0) {
            arrayList.add("transcribes-dialog");
        }
        if ((i10 & 8192) != 0) {
            arrayList.add("easy-read");
        }
        if ((i10 & 16384) != 0) {
            arrayList.add("trick-play");
        }
        if ((i10 & 32768) != 0) {
            arrayList.add("auxiliary");
        }
        return arrayList;
    }

    public static long s1(long j10, long j11, long j12, RoundingMode roundingMode) {
        if (j10 == 0 || j11 == 0) {
            return 0L;
        }
        return (j12 < j11 || j12 % j11 != 0) ? (j12 >= j11 || j11 % j12 != 0) ? (j12 < j10 || j12 % j10 != 0) ? (j12 >= j10 || j10 % j12 != 0) ? t1(j10, j11, j12, roundingMode) : com.google.common.math.e.d(j11, com.google.common.math.e.b(j10, j12, RoundingMode.UNNECESSARY)) : com.google.common.math.e.b(j11, com.google.common.math.e.b(j12, j10, RoundingMode.UNNECESSARY), roundingMode) : com.google.common.math.e.d(j10, com.google.common.math.e.b(j11, j12, RoundingMode.UNNECESSARY)) : com.google.common.math.e.b(j10, com.google.common.math.e.b(j12, j11, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int t(SparseArray sparseArray) {
        int contentHashCode;
        if (Build.VERSION.SDK_INT >= 31) {
            contentHashCode = sparseArray.contentHashCode();
            return contentHashCode;
        }
        int i10 = 17;
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            i10 = (((i10 * 31) + sparseArray.keyAt(i11)) * 31) + Objects.hashCode(sparseArray.valueAt(i11));
        }
        return i10;
    }

    public static List t0(int i10) {
        ArrayList arrayList = new ArrayList();
        if ((i10 & 4) != 0) {
            arrayList.add("auto");
        }
        if ((i10 & 1) != 0) {
            arrayList.add(Constants.COLLATION_DEFAULT);
        }
        if ((i10 & 2) != 0) {
            arrayList.add("forced");
        }
        return arrayList;
    }

    public static long t1(long j10, long j11, long j12, RoundingMode roundingMode) {
        long d10 = com.google.common.math.e.d(j10, j11);
        if (d10 != LongCompanionObject.MAX_VALUE && d10 != Long.MIN_VALUE) {
            return com.google.common.math.e.b(d10, j12, roundingMode);
        }
        long c10 = com.google.common.math.e.c(Math.abs(j11), Math.abs(j12));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long b10 = com.google.common.math.e.b(j11, c10, roundingMode2);
        long b11 = com.google.common.math.e.b(j12, c10, roundingMode2);
        long c11 = com.google.common.math.e.c(Math.abs(j10), Math.abs(b11));
        long b12 = com.google.common.math.e.b(j10, c11, roundingMode2);
        long b13 = com.google.common.math.e.b(b11, c11, roundingMode2);
        long d11 = com.google.common.math.e.d(b12, b10);
        if (d11 != LongCompanionObject.MAX_VALUE && d11 != Long.MIN_VALUE) {
            return com.google.common.math.e.b(d11, b13, roundingMode);
        }
        double d12 = b12 * (b10 / b13);
        if (d12 > 9.223372036854776E18d) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (d12 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return com.google.common.math.b.f(d12, roundingMode);
    }

    public static int u(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            int b10 = com.google.common.primitives.i.b(bArr[i10]);
            i12 = v(b10 & 15, v(b10 >> 4, i12));
            i10++;
        }
        return i12;
    }

    public static String u0(StringBuilder sb2, Formatter formatter, long j10) {
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        String str = j10 < 0 ? "-" : "";
        long abs = (Math.abs(j10) + 500) / 1000;
        long j11 = abs % 60;
        long j12 = (abs / 60) % 60;
        long j13 = abs / 3600;
        sb2.setLength(0);
        return j13 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j12), Long.valueOf(j11)).toString();
    }

    public static long[] u1(List list, long j10, long j11, RoundingMode roundingMode) {
        long j12 = j10;
        long j13 = j11;
        RoundingMode roundingMode2 = roundingMode;
        int size = list.size();
        long[] jArr = new long[size];
        if (j12 != 0) {
            int i10 = 0;
            if (j13 >= j12 && j13 % j12 == 0) {
                long b10 = com.google.common.math.e.b(j13, j12, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = com.google.common.math.e.b(((Long) list.get(i10)).longValue(), b10, roundingMode2);
                    i10++;
                }
            } else if (j13 >= j12 || j12 % j13 != 0) {
                int i11 = 0;
                while (i11 < size) {
                    long longValue = ((Long) list.get(i11)).longValue();
                    if (longValue != 0) {
                        if (j13 >= longValue && j13 % longValue == 0) {
                            jArr[i11] = com.google.common.math.e.b(j12, com.google.common.math.e.b(j13, longValue, RoundingMode.UNNECESSARY), roundingMode2);
                        } else if (j13 >= longValue || longValue % j13 != 0) {
                            jArr[i11] = t1(longValue, j12, j13, roundingMode2);
                        } else {
                            jArr[i11] = com.google.common.math.e.d(j12, com.google.common.math.e.b(longValue, j13, RoundingMode.UNNECESSARY));
                        }
                    }
                    i11++;
                    j12 = j10;
                    j13 = j11;
                    roundingMode2 = roundingMode;
                }
            } else {
                long b11 = com.google.common.math.e.b(j12, j13, RoundingMode.UNNECESSARY);
                while (i10 < size) {
                    jArr[i10] = com.google.common.math.e.d(((Long) list.get(i10)).longValue(), b11);
                    i10++;
                }
            }
        }
        return jArr;
    }

    public static int v(int i10, int i11) {
        return (CRC16_BYTES_MSBF[(i10 ^ ((i11 >> 12) & 255)) & 255] ^ ((i11 << 4) & 65535)) & 65535;
    }

    public static String[] v0() {
        String[] w02 = w0();
        for (int i10 = 0; i10 < w02.length; i10++) {
            w02[i10] = d1(w02[i10]);
        }
        return w02;
    }

    public static void v1(long[] jArr, long j10, long j11, RoundingMode roundingMode) {
        if (j10 == 0) {
            Arrays.fill(jArr, 0L);
            return;
        }
        int i10 = 0;
        if (j11 >= j10 && j11 % j10 == 0) {
            long b10 = com.google.common.math.e.b(j11, j10, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = com.google.common.math.e.b(jArr[i10], b10, roundingMode);
                i10++;
            }
            return;
        }
        if (j11 < j10 && j10 % j11 == 0) {
            long b11 = com.google.common.math.e.b(j10, j11, RoundingMode.UNNECESSARY);
            while (i10 < jArr.length) {
                jArr[i10] = com.google.common.math.e.d(jArr[i10], b11);
                i10++;
            }
            return;
        }
        for (int i11 = 0; i11 < jArr.length; i11++) {
            long j12 = jArr[i11];
            if (j12 != 0) {
                if (j11 >= j12 && j11 % j12 == 0) {
                    jArr[i11] = com.google.common.math.e.b(j10, com.google.common.math.e.b(j11, j12, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j11 >= j12 || j12 % j11 != 0) {
                    jArr[i11] = t1(j12, j10, j11, roundingMode);
                } else {
                    jArr[i11] = com.google.common.math.e.d(j10, com.google.common.math.e.b(j12, j11, RoundingMode.UNNECESSARY));
                }
            }
        }
    }

    public static int w(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = CRC32_BYTES_MSBF[((i12 >>> 24) ^ (bArr[i10] & 255)) & 255] ^ (i12 << 8);
            i10++;
        }
        return i12;
    }

    public static String[] w0() {
        return x0(Resources.getSystem().getConfiguration());
    }

    public static boolean w1(InterfaceC2341J interfaceC2341J) {
        if (interfaceC2341J == null || !interfaceC2341J.E(1)) {
            return false;
        }
        return (interfaceC2341J.E(17) && interfaceC2341J.I().q()) ? false : true;
    }

    public static int x(byte[] bArr, int i10, int i11, int i12) {
        while (i10 < i11) {
            i12 = CRC8_BYTES_MSBF[i12 ^ (bArr[i10] & 255)];
            i10++;
        }
        return i12;
    }

    public static String[] x0(Configuration configuration) {
        return A1(configuration.getLocales().toLanguageTags(), ",");
    }

    public static boolean x1(InterfaceC2341J interfaceC2341J, boolean z10) {
        return interfaceC2341J == null || !interfaceC2341J.S() || interfaceC2341J.g0() == 1 || interfaceC2341J.g0() == 4 || !(!z10 || interfaceC2341J.H() == 0 || interfaceC2341J.H() == 4);
    }

    public static Handler y(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public static String y0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e10) {
            AbstractC4156x.e("Util", "Failed to read system property " + str, e10);
            return null;
        }
    }

    public static void y1(Throwable th2) {
        z1(th2);
    }

    public static Handler z() {
        return A(null);
    }

    public static String z0(int i10) {
        switch (i10) {
            case -2:
                return ViewProps.NONE;
            case -1:
                return "unknown";
            case 0:
                return Constants.COLLATION_DEFAULT;
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
                if (i10 < 10000) {
                    return "?";
                }
                return "custom (" + i10 + ")";
        }
    }

    public static Object i(Object obj) {
        return obj;
    }

    public static Object[] j(Object[] objArr) {
        return objArr;
    }

    public static void z1(Throwable th2) {
        throw th2;
    }
}
