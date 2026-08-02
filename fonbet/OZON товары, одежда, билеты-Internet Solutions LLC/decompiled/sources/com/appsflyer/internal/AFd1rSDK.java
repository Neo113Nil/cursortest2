package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1rSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFInAppEventParameterName = 0;
    private static long AFKeystoreWrapper = 0;
    private static int AFLogger = 1;

    /* renamed from: e, reason: collision with root package name */
    private static char f57394e;
    private static int registerClient;
    private static long values;
    private final Map<String, Object> AFInAppEventType;
    private final Context valueOf;

    public static class AFa1tSDK {
        static byte[] AFInAppEventParameterName(@NonNull byte[] bArr) throws Exception {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                bArr[i11] = (byte) (bArr[i11] ^ ((i11 % 2) + 42));
            }
            return bArr;
        }

        @NonNull
        static byte[] AFInAppEventType(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }
    }

    static {
        AFInAppEventParameterName();
        AudioTrack.getMinVolume();
        Color.rgb(0, 0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        TextUtils.getOffsetBefore("", 0);
        Process.myTid();
        ExpandableListView.getPackedPositionForChild(0, 0);
        KeyEvent.getModifierMetaStateMask();
        ExpandableListView.getPackedPositionGroup(0L);
        SystemClock.elapsedRealtime();
        ExpandableListView.getPackedPositionForChild(0, 0);
        KeyEvent.getMaxKeyCode();
        int i11 = registerClient + 41;
        AFLogger = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public AFd1rSDK(Map<String, Object> map, Context context) {
        this.AFInAppEventType = map;
        this.valueOf = context;
        put(AFKeystoreWrapper(), AFInAppEventType());
    }

    static void AFInAppEventParameterName() {
        AFKeystoreWrapper = 5860418862183999110L;
        AFInAppEventParameterName = 686035784;
        f57394e = (char) 4936;
        values = 5462414849992894330L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0215, code lost:
    
        if (r0.contains(((java.lang.String) r3[0]).intern()) != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0307 A[Catch: Exception -> 0x019e, TRY_LEAVE, TryCatch #0 {Exception -> 0x019e, blocks: (B:7:0x0148, B:9:0x016d, B:11:0x01a3, B:16:0x01be, B:20:0x021a, B:22:0x0307, B:49:0x01eb), top: B:6:0x0148 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String AFInAppEventType() {
        String obj;
        long j11;
        int i11;
        int length;
        int i12;
        long j12 = 0;
        try {
            Map<String, Object> map = this.AFInAppEventType;
            Object[] objArr = new Object[1];
            a("駙灧䪕ⓧ㼵ै\ue38bﷄ퐄깘룯錻", 59833 - KeyEvent.normalizeMetaState(0), objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFInAppEventType;
            Object[] objArr2 = new Object[1];
            a("駞\ua7d4\ue5c0⏄懘꿭\uedc7⯮槾럶\uf5e2㏋燥뾍ﶛ", 15877 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b((char) (Color.alpha(0) + 44097), View.getDefaultSize(0, 0), "㐲䕁鸌\uf5c1", "⎭錬䄊궬", "\ufdca햊聝矼뗗끳", objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a("馕낿쬱\ue5c9㱆", 10614 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
            String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj2);
            sb2.append(obj3);
            sb2.append(replaceAll);
            String valueOf = AFb1mSDK.valueOf(sb2.toString());
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(valueOf.substring(0, 16));
            obj = sb3.toString();
        } catch (Exception e11) {
            Object[] objArr5 = new Object[1];
            b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-1) - TextUtils.lastIndexOf("", '0', 0, 0), "㐲䕁鸌\uf5c1", "\u244f㯄ꓪ訂", "⳪舣᪇\ue086㻄뙤թ㘱獩듈籽慴阌陟︫ૼ\ue2cf齛蚐刃듖涾롱䨫搱郌賊ʾ\udfc2䍞ߧ\uf715ꍫ䍬칧箕捠\ude37", objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e11);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b((char) (13962 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "㐲䕁鸌\uf5c1", "\uf73b㹿诇ꀶ", "ḋ踲\uedc7妒辵㔅ᘗⰘ䄓綒聯偾\uf2ee䖅\uf69c䵚蚔ඊ\ue653撝\u2d28蠴䧦伎\uf289\uf58a㜌砒瀈ॷ髴磦旱滛籫㖒遼舳憹퇊ඹՊ䍗쵟", objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e11);
            AFLogger.afRDLog(sb4.toString());
            StringBuilder sb5 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            b((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 37883), ViewConfiguration.getScrollBarFadeDuration() >> 16, "㐲䕁鸌\uf5c1", "狤讅ﳥ\udb93", "⏭윟㶸ᫀ䚳ᔫ쌹戴꧇\udf42铸乶\ude13ࢪ爯㧱䗽嚼", objArr7);
            sb5.append(((String) objArr7[0]).intern());
            obj = sb5.toString();
        }
        String str = obj;
        try {
            Context context = this.valueOf;
            Object[] objArr8 = new Object[1];
            a("駙\ude69ᚢ价蜫ｪ㞦澯ꐩᱡ咺賨씢㵿痤귨\ue22b婣銿쫺̺笽뎐\uebd0\u2004顋킛࣏䄅륄\uf199⧑渙ꙩạ因輠", ExpandableListView.getPackedPositionType(0L) + 18367, objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int i13 = -2700;
            if (registerReceiver != null) {
                Object[] objArr9 = new Object[1];
                b((char) (ViewConfiguration.getFadingEdgeLength() >> 16), View.MeasureSpec.getMode(0) + 1327408284, "㐲䕁鸌\uf5c1", "鳒Ấ\ud94f⢐", "\udba8Ꮣﴆ黚ﰸ㲭⍦ᚮ⼑匍烅", objArr9);
                i13 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
                registerClient = (AFLogger + 53) % UserVerificationMethods.USER_VERIFY_PATTERN;
            }
            String str2 = this.valueOf.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                int i14 = AFLogger + 61;
                registerClient = i14 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i14 % 2 != 0) {
                    Object[] objArr10 = new Object[1];
                    b((char) (31991 - TextUtils.indexOf((CharSequence) "", '+', 0, 0)), (-282810632) / (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "㐲䕁鸌\uf5c1", "\uf801⒦짯框", "啹⧥\ue765", objArr10);
                    if (str2.contains(((String) objArr10[0]).intern())) {
                        i11 = 1;
                    }
                } else {
                    Object[] objArr11 = new Object[1];
                    b((char) (18120 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (-282810632) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "㐲䕁鸌\uf5c1", "\uf801⒦짯框", "啹⧥\ue765", objArr11);
                }
                Context context2 = this.valueOf;
                Object[] objArr12 = new Object[1];
                a("駋妢ᤨ\ud8b6頫宱", 49279 - Color.red(0), objArr12);
                int size = ((SensorManager) context2.getSystemService(((String) objArr12[0]).intern())).getSensorList(-1).size();
                StringBuilder sb6 = new StringBuilder();
                Object[] objArr13 = new Object[1];
                b((char) ((-16761946) - Color.rgb(0, 0, 0)), Color.red(0) - 421377446, "㐲䕁鸌\uf5c1", "嫄\ue24aꛦ圻", "➱", objArr13);
                sb6.append(((String) objArr13[0]).intern());
                sb6.append(i13);
                Object[] objArr14 = new Object[1];
                a("馞⾗", 46679 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr14);
                sb6.append(((String) objArr14[0]).intern());
                sb6.append(i11);
                Object[] objArr15 = new Object[1];
                b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2407), KeyEvent.getMaxKeyCode() >> 16, "㐲䕁鸌\uf5c1", "瞰멥枑脉", "ꍵ膁", objArr15);
                sb6.append(((String) objArr15[0]).intern());
                sb6.append(size);
                Object[] objArr16 = new Object[1];
                b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 61793), View.resolveSize(0, 0), "㐲䕁鸌\uf5c1", "鐃䖷悫ꃱ", "띀愫", objArr16);
                sb6.append(((String) objArr16[0]).intern());
                sb6.append(this.AFInAppEventType.size());
                String obj4 = sb6.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                byte[] AFInAppEventParameterName2 = AFa1tSDK.AFInAppEventParameterName(AFa1tSDK.AFInAppEventType(obj4));
                StringBuilder sb8 = new StringBuilder();
                length = AFInAppEventParameterName2.length;
                i12 = 0;
                while (i12 < length) {
                    String hexString = Integer.toHexString(AFInAppEventParameterName2[i12]);
                    if (hexString.length() == 1) {
                        int i15 = registerClient + 41;
                        j11 = j12;
                        AFLogger = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
                        if (i15 % 2 == 0) {
                            "0".concat(hexString);
                            throw null;
                        }
                        try {
                            hexString = "0".concat(hexString);
                        } catch (Exception e12) {
                            e = e12;
                            Object[] objArr17 = new Object[1];
                            a("駟䢠㬶\ued99\udc7e躟焷⎿ሥ쒸띺馂䠖㪓\ued01\udf99", 53629 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr17);
                            AFLogger.afErrorLogForExcManagerOnly(((String) objArr17[0]).intern(), e);
                            StringBuilder sb9 = new StringBuilder();
                            Object[] objArr18 = new Object[1];
                            b((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 13963), Color.red(0), "㐲䕁鸌\uf5c1", "\uf73b㹿诇ꀶ", "ḋ踲\uedc7妒辵㔅ᘗⰘ䄓綒聯偾\uf2ee䖅\uf69c䵚蚔ඊ\ue653撝\u2d28蠴䧦伎\uf289\uf58a㜌砒瀈ॷ髴磦旱滛籫㖒遼舳憹퇊ඹՊ䍗쵟", objArr18);
                            sb9.append(((String) objArr18[0]).intern());
                            sb9.append(e);
                            AFLogger.afRDLog(sb9.toString());
                            StringBuilder sb10 = new StringBuilder();
                            sb10.append(str);
                            Object[] objArr19 = new Object[1];
                            b((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 19709), 1 - (SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)), "㐲䕁鸌\uf5c1", "왡\ue4c5ﶂꥌ", "\ue493걃琜ꞑ릢䇓皸ԅ떜東\uf41eセ䉕⺥Ȼ㾲", objArr19);
                            sb10.append(((String) objArr19[0]).intern());
                            return sb10.toString();
                        }
                    } else {
                        j11 = j12;
                    }
                    sb8.append(hexString);
                    i12++;
                    j12 = j11;
                }
                sb7.append(sb8.toString());
                String obj5 = sb7.toString();
                AFLogger = (registerClient + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
                return obj5;
            }
            i11 = 0;
            Context context22 = this.valueOf;
            Object[] objArr122 = new Object[1];
            a("駋妢ᤨ\ud8b6頫宱", 49279 - Color.red(0), objArr122);
            int size2 = ((SensorManager) context22.getSystemService(((String) objArr122[0]).intern())).getSensorList(-1).size();
            StringBuilder sb62 = new StringBuilder();
            Object[] objArr132 = new Object[1];
            b((char) ((-16761946) - Color.rgb(0, 0, 0)), Color.red(0) - 421377446, "㐲䕁鸌\uf5c1", "嫄\ue24aꛦ圻", "➱", objArr132);
            sb62.append(((String) objArr132[0]).intern());
            sb62.append(i13);
            Object[] objArr142 = new Object[1];
            a("馞⾗", 46679 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr142);
            sb62.append(((String) objArr142[0]).intern());
            sb62.append(i11);
            Object[] objArr152 = new Object[1];
            b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2407), KeyEvent.getMaxKeyCode() >> 16, "㐲䕁鸌\uf5c1", "瞰멥枑脉", "ꍵ膁", objArr152);
            sb62.append(((String) objArr152[0]).intern());
            sb62.append(size2);
            Object[] objArr162 = new Object[1];
            b((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 61793), View.resolveSize(0, 0), "㐲䕁鸌\uf5c1", "鐃䖷悫ꃱ", "띀愫", objArr162);
            sb62.append(((String) objArr162[0]).intern());
            sb62.append(this.AFInAppEventType.size());
            String obj42 = sb62.toString();
            StringBuilder sb72 = new StringBuilder();
            sb72.append(str);
            byte[] AFInAppEventParameterName22 = AFa1tSDK.AFInAppEventParameterName(AFa1tSDK.AFInAppEventType(obj42));
            StringBuilder sb82 = new StringBuilder();
            length = AFInAppEventParameterName22.length;
            i12 = 0;
            while (i12 < length) {
            }
            sb72.append(sb82.toString());
            String obj52 = sb72.toString();
            AFLogger = (registerClient + 79) % UserVerificationMethods.USER_VERIFY_PATTERN;
            return obj52;
        } catch (Exception e13) {
            e = e13;
            j11 = j12;
        }
    }

    private static StringBuilder AFKeystoreWrapper(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i11 = 0;
        while (i11 < 3) {
            arrayList.add(Integer.valueOf(strArr[i11].length()));
            i11++;
            registerClient = (AFLogger + 109) % UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        registerClient = (AFLogger + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
        for (int i12 = 0; i12 < intValue; i12++) {
            Integer num = null;
            for (int i13 = 0; i13 < 3; i13++) {
                int charAt = strArr[i13].charAt(i12);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb2.append(Integer.toHexString(num.intValue()));
        }
        return sb2;
    }

    private static void a(String str, int i11, Object[] objArr) {
        char[] cArr = str;
        if (str != null) {
            int i12 = $10 + 75;
            $11 = i12 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i12 % 2 == 0) {
                str.toCharArray();
                throw null;
            }
            char[] charArray = str.toCharArray();
            $11 = ($10 + 89) % UserVerificationMethods.USER_VERIFY_PATTERN;
            cArr = charArray;
        }
        char[] cArr2 = cArr;
        AFj1iSDK aFj1iSDK = new AFj1iSDK();
        aFj1iSDK.values = i11;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFj1iSDK.AFInAppEventType = 0;
        while (true) {
            int i13 = aFj1iSDK.AFInAppEventType;
            if (i13 >= cArr2.length) {
                break;
            }
            jArr[i13] = (cArr2[i13] ^ (i13 * aFj1iSDK.values)) ^ (AFKeystoreWrapper ^ 3448363977863888702L);
            aFj1iSDK.AFInAppEventType = i13 + 1;
        }
        char[] cArr3 = new char[length];
        aFj1iSDK.AFInAppEventType = 0;
        while (true) {
            int i14 = aFj1iSDK.AFInAppEventType;
            if (i14 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            }
            int i15 = $11 + 77;
            $10 = i15 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i15 % 2 != 0) {
                cArr3[i14] = (char) jArr[i14];
            } else {
                cArr3[i14] = (char) jArr[i14];
                i14++;
            }
            aFj1iSDK.AFInAppEventType = i14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void b(char c11, int i11, String str, String str2, String str3, Object[] objArr) {
        char[] cArr;
        char[] cArr2;
        int i12 = ($10 + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        $11 = i12;
        if (str3 != 0) {
            $10 = (i12 + 119) % UserVerificationMethods.USER_VERIFY_PATTERN;
            cArr = str3.toCharArray();
        } else {
            cArr = str3;
        }
        char[] cArr3 = cArr;
        char[] charArray = str2 != null ? str2.toCharArray() : str2;
        if (str != null) {
            $10 = ($11 + 51) % UserVerificationMethods.USER_VERIFY_PATTERN;
            cArr2 = str.toCharArray();
        } else {
            cArr2 = str;
        }
        char[] cArr4 = cArr2;
        AFj1jSDK aFj1jSDK = new AFj1jSDK();
        int length = charArray.length;
        char[] cArr5 = new char[length];
        int length2 = cArr4.length;
        char[] cArr6 = new char[length2];
        System.arraycopy(charArray, 0, cArr5, 0, length);
        System.arraycopy(cArr4, 0, cArr6, 0, length2);
        cArr5[0] = (char) (c11 ^ cArr5[0]);
        cArr6[2] = (char) (cArr6[2] + ((char) i11));
        int length3 = cArr3.length;
        char[] cArr7 = new char[length3];
        aFj1jSDK.AFKeystoreWrapper = 0;
        while (true) {
            int i13 = aFj1jSDK.AFKeystoreWrapper;
            if (i13 >= length3) {
                String str4 = new String(cArr7);
                $10 = ($11 + 1) % UserVerificationMethods.USER_VERIFY_PATTERN;
                objArr[0] = str4;
                return;
            }
            int i14 = (i13 + 3) % 4;
            int i15 = cArr5[i13 % 4] * 32718;
            char c12 = cArr6[(i13 + 2) % 4];
            char c13 = (char) ((i15 + c12) % 65535);
            aFj1jSDK.valueOf = c13;
            cArr6[i14] = (char) (((cArr5[i14] * 32718) + c12) / 65535);
            cArr5[i14] = c13;
            cArr7[i13] = (char) ((((cArr3[i13] ^ c13) ^ (values ^ (-4751302755855625400L))) ^ ((int) (AFInAppEventParameterName ^ (-4751302755855625400L)))) ^ ((char) (f57394e ^ (-4751302755855625400L))));
            aFj1jSDK.AFKeystoreWrapper = i13 + 1;
        }
    }

    @NonNull
    private String AFKeystoreWrapper() {
        registerClient = (AFLogger + 59) % UserVerificationMethods.USER_VERIFY_PATTERN;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.AFInAppEventType;
            Object[] objArr = new Object[1];
            a("駙灧䪕ⓧ㼵ै\ue38bﷄ퐄깘룯錻", 59833 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
            String obj = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.AFInAppEventType;
            Object[] objArr2 = new Object[1];
            a("駚ṏ雓ཙ蟈", 34693 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            String obj2 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj2 == null) {
                Object[] objArr3 = new Object[1];
                b((char) TextUtils.getOffsetBefore("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1, "㐲䕁鸌\uf5c1", "\ud898좐㤲愑", "蠂尊梁엯崗刕쿅綻", objArr3);
                obj2 = ((String) objArr3[0]).intern();
            }
            StringBuilder sb2 = new StringBuilder(obj);
            sb2.reverse();
            StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb2.toString());
            int length = AFKeystoreWrapper2.length();
            if (length > 4) {
                AFLogger = (registerClient + 71) % UserVerificationMethods.USER_VERIFY_PATTERN;
                AFKeystoreWrapper2.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    AFKeystoreWrapper2.append('1');
                }
            }
            Object[] objArr4 = new Object[1];
            b((char) (62579 - TextUtils.lastIndexOf("", '0', 0)), ExpandableListView.getPackedPositionGroup(0L) + 1872098710, "㐲䕁鸌\uf5c1", "陰闵瑯\uf0f4", "ꮐ촙ᤶ", objArr4);
            AFKeystoreWrapper2.insert(0, ((String) objArr4[0]).intern());
            String obj3 = AFKeystoreWrapper2.toString();
            int i11 = AFLogger + 49;
            registerClient = i11 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i11 % 2 == 0) {
                return obj3;
            }
            throw null;
        } catch (Exception e11) {
            Object[] objArr5 = new Object[1];
            a("馘岴ጋ즍豂䊝㥱ﰰ늙楛⿰\ue240\ud8d5龻切࢙켨藄硛㼧\uf581ꠍ滫║ᯙ\udea5锁䯑\u0e67쓂뭔繭㒳\ueb16ꇷ搹嫃ᆦ퐮誝", 50539 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e11);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b((char) (Gravity.getAbsoluteGravity(0, 0) + 23730), ExpandableListView.getPackedPositionChild(0L) + 1, "㐲䕁鸌\uf5c1", "叮既늎ⱜ", "釫虡땈쐿퀁\ue92f樔ⷶႥ瞘췟㹟옋\ue632颈鐼朢먝刻蛢汛榶ಓ顲\u09bbӎ儲ᘽ휛㐌䖶辨㓁䱧ቯꦙ⬕꠲ɑ냝ꑫꡔ", objArr6);
            sb3.append(((String) objArr6[0]).intern());
            sb3.append(e11);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr7 = new Object[1];
            a("駓瞾䔘动\u200d㹮࿓", 61026 - TextUtils.indexOf((CharSequence) "", '0'), objArr7);
            return ((String) objArr7[0]).intern();
        }
    }
}
