package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFc1iSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long AFAdRevenueData = 0;
    private static int areAllFieldsValid = 0;
    private static int component1 = 1;
    private static long getCurrencyIso4217Code;
    private static char[] getMediationNetwork;
    private final Map<String, Object> getMonetizationNetwork;
    private final Context getRevenue;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public static class AFa1ySDK {
        @NonNull
        public static byte[] AFAdRevenueData(@NonNull String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        public static byte[] getMediationNetwork(@NonNull byte[] bArr) throws Exception {
            for (int i5 = 0; i5 < bArr.length; i5++) {
                bArr[i5] = (byte) (bArr[i5] ^ ((i5 % 2) + 42));
            }
            return bArr;
        }
    }

    static {
        getCurrencyIso4217Code();
        TypedValue.complexToFloat(0);
        Color.red(0);
        PointF.length(0.0f, 0.0f);
        SystemClock.elapsedRealtime();
        Process.getGidForName("");
        Color.alpha(0);
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getMaximumDrawingCacheSize();
        KeyEvent.getMaxKeyCode();
        ViewConfiguration.getFadingEdgeLength();
        AudioTrack.getMaxVolume();
        areAllFieldsValid = (component1 + 101) % 128;
    }

    public AFc1iSDK(Map<String, Object> map, Context context) {
        this.getMonetizationNetwork = map;
        this.getRevenue = context;
        put(AFAdRevenueData(), getMediationNetwork());
    }

    @NonNull
    private String AFAdRevenueData() {
        Object obj;
        areAllFieldsValid = (component1 + 87) % 128;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a(13 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), Process.myPid() >> 22, (char) (View.MeasureSpec.getSize(0) + 12973), objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b("\uf4f5噬뇤።绗", TextUtils.indexOf("", "") + 41609, objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj3 == null) {
                int i5 = component1 + 101;
                areAllFieldsValid = i5 % 128;
                if (i5 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(26 % (ViewConfiguration.getTapTimeout() >>> 67), 107 >>> Drawable.resolveOpacity(1, 0), (char) TextUtils.indexOf("", "", 0), objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(8 - (ViewConfiguration.getTapTimeout() >> 16), 12 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), objArr4);
                    obj = objArr4[0];
                }
                obj3 = ((String) obj).intern();
            }
            StringBuilder sb2 = new StringBuilder(obj2);
            sb2.reverse();
            StringBuilder currencyIso4217Code = getCurrencyIso4217Code(num, obj3, sb2.toString());
            int length = currencyIso4217Code.length();
            if (length > 4) {
                currencyIso4217Code.delete(4, length);
            } else {
                while (length < 4) {
                    length++;
                    currencyIso4217Code.append('1');
                    areAllFieldsValid = (component1 + 11) % 128;
                }
            }
            Object[] objArr5 = new Object[1];
            b("\uf4fc댯筋", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 18396, objArr5);
            currencyIso4217Code.insert(0, ((String) objArr5[0]).intern());
            return currencyIso4217Code.toString();
        } catch (Exception e7) {
            Object[] objArr6 = new Object[1];
            b("\uf4b7ᒵ㑸听痕闼땂픑\uf6c6ᛚ㙃嘁矂靺뜴탸\uf0e7ၥ〨処熖酌넘틐\uf286ቄ㏲台獰錣볧\udcecﱜᰗ㷄巘絔鴇뻝\ude7c", 57412 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e7);
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a(Color.green(0) + 42, 20 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr7);
            sb3.append(((String) objArr7[0]).intern());
            sb3.append(e7);
            AFLogger.afRDLog(sb3.toString());
            Object[] objArr8 = new Object[1];
            b("\uf4fc\uda8dꠏ翓䵒᳕\ue254", (ViewConfiguration.getTouchSlop() >> 8) + 11903, objArr8);
            return ((String) objArr8[0]).intern();
        }
    }

    private static void a(int i5, int i10, char c2, Object[] objArr) {
        int i11;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        long[] jArr = new long[i5];
        aFk1mSDK.getMediationNetwork = 0;
        $10 = ($11 + 111) % 128;
        while (true) {
            int i12 = aFk1mSDK.getMediationNetwork;
            if (i12 >= i5) {
                break;
            }
            jArr[i12] = (((char) (getMediationNetwork[i10 + i12] ^ (-2577524606577954075L))) ^ (i12 * ((-2577524606577954075L) ^ getCurrencyIso4217Code))) ^ c2;
            aFk1mSDK.getMediationNetwork = i12 + 1;
        }
        char[] cArr = new char[i5];
        aFk1mSDK.getMediationNetwork = 0;
        $10 = ($11 + 111) % 128;
        while (true) {
            int i13 = aFk1mSDK.getMediationNetwork;
            if (i13 >= i5) {
                objArr[0] = new String(cArr);
                return;
            }
            int i14 = $11 + 75;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                cArr[i13] = (char) jArr[i13];
                i11 = i13 / 0;
            } else {
                cArr[i13] = (char) jArr[i13];
                i11 = i13 + 1;
            }
            aFk1mSDK.getMediationNetwork = i11;
        }
    }

    private static void b(String str, int i5, Object[] objArr) {
        $11 = ($10 + 57) % 128;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1nSDK aFk1nSDK = new AFk1nSDK();
        aFk1nSDK.AFAdRevenueData = i5;
        int length = cArr2.length;
        long[] jArr = new long[length];
        aFk1nSDK.getRevenue = 0;
        $11 = ($10 + 29) % 128;
        while (true) {
            int i10 = aFk1nSDK.getRevenue;
            if (i10 >= cArr2.length) {
                break;
            }
            int i11 = ($11 + 85) % 128;
            $10 = i11;
            jArr[i10] = (cArr2[i10] ^ (i10 * aFk1nSDK.AFAdRevenueData)) ^ (AFAdRevenueData ^ (-4672045500807300752L));
            aFk1nSDK.getRevenue = i10 + 1;
            $11 = (i11 + 101) % 128;
        }
        char[] cArr3 = new char[length];
        aFk1nSDK.getRevenue = 0;
        while (true) {
            int i12 = aFk1nSDK.getRevenue;
            if (i12 >= cArr2.length) {
                objArr[0] = new String(cArr3);
                return;
            } else {
                cArr3[i12] = (char) jArr[i12];
                aFk1nSDK.getRevenue = i12 + 1;
            }
        }
    }

    private static StringBuilder getCurrencyIso4217Code(@NonNull String... strArr) throws Exception {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i5 = 0;
        while (i5 < 3) {
            arrayList.add(Integer.valueOf(strArr[i5].length()));
            i5++;
            component1 = (areAllFieldsValid + 87) % 128;
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < intValue) {
            Integer num = null;
            for (int i11 = 0; i11 < 3; i11++) {
                int charAt = strArr[i11].charAt(i10);
                if (num != null) {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb2.append(Integer.toHexString(num.intValue()));
            i10++;
            component1 = (areAllFieldsValid + 85) % 128;
        }
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0297  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getMediationNetwork() {
        String obj;
        int i5;
        int length;
        int i10;
        String hexString;
        try {
            Map<String, Object> map = this.getMonetizationNetwork;
            Object[] objArr = new Object[1];
            a(12 - (KeyEvent.getMaxKeyCode() >> 16), ViewConfiguration.getFadingEdgeLength() >> 16, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 12972), objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getMonetizationNetwork;
            Object[] objArr2 = new Object[1];
            b("\uf4f1㞛爯뻋亮␢您ꌡ\uefd1⩹唍醄\udc4aᣂ孴", Color.blue(0) + 50021, objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 6, 62 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (KeyEvent.getDeadChar(0, 0) + 8465), objArr3);
            String intern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            a('5' - AndroidCharacter.getMirror('0'), Color.rgb(0, 0, 0) + 16777284, (char) (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr4);
            String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj2);
            sb2.append(obj3);
            sb2.append(replaceAll);
            String currencyIso4217Code = AFj1dSDK.getCurrencyIso4217Code(sb2.toString());
            StringBuilder sb3 = new StringBuilder("");
            sb3.append(currencyIso4217Code.substring(0, 16));
            obj = sb3.toString();
        } catch (Exception e7) {
            Object[] objArr5 = new Object[1];
            b("\uf4f0ꞯ剙໖맑吐Ø데渊᪷딕怎Ც콇篭ᚁ섣続⡺\udb15瞽≓\udd1b覭\u245b탫莋㸿\uea9b蕵〔\uecb2鼗䨜\ue6ac酌䷶\uf883", 21341 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr5);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e7);
            StringBuilder sb4 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            a(44 - View.MeasureSpec.getSize(0), 73 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) Color.red(0), objArr6);
            sb4.append(((String) objArr6[0]).intern());
            sb4.append(e7);
            AFLogger.afRDLog(sb4.toString());
            StringBuilder sb5 = new StringBuilder("");
            Object[] objArr7 = new Object[1];
            b("\uf4f5ꑁ喛ۗ똪条ჭ솣焛⋈폕荳㰲\uedba麧丞ￖꢈ", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 20662, objArr7);
            sb5.append(((String) objArr7[0]).intern());
            obj = sb5.toString();
        }
        String str = obj;
        try {
            Context context = this.getRevenue;
            Object[] objArr8 = new Object[1];
            a(37 - (ViewConfiguration.getScrollBarSize() >> 8), 117 - (Process.myPid() >> 22), (char) TextUtils.getOffsetBefore("", 0), objArr8);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
            int i11 = -2700;
            if (registerReceiver != null) {
                Object[] objArr9 = new Object[1];
                a((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 10, View.combineMeasuredStates(0, 0) + 154, (char) Color.argb(0, 0, 0, 0), objArr9);
                i11 = registerReceiver.getIntExtra(((String) objArr9[0]).intern(), -2700);
            }
            String str2 = this.getRevenue.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                Object[] objArr10 = new Object[1];
                b("\uf4ef\udfc6ꉳ", 11112 - TextUtils.lastIndexOf("", '0'), objArr10);
                if (str2.contains(((String) objArr10[0]).intern())) {
                    i5 = 1;
                    Context context2 = this.getRevenue;
                    Object[] objArr11 = new Object[1];
                    b("\uf4e4霛㌫\udf5f筜ݨ", TextUtils.lastIndexOf("", '0') + 25578, objArr11);
                    int size = ((SensorManager) context2.getSystemService(((String) objArr11[0]).intern())).getSensorList(-1).size();
                    StringBuilder sb6 = new StringBuilder();
                    Object[] objArr12 = new Object[1];
                    a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, 165 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr12);
                    sb6.append(((String) objArr12[0]).intern());
                    sb6.append(i11);
                    Object[] objArr13 = new Object[1];
                    b("\uf4b1앾", Color.red(0) + 12689, objArr13);
                    sb6.append(((String) objArr13[0]).intern());
                    sb6.append(i5);
                    Object[] objArr14 = new Object[1];
                    a(View.combineMeasuredStates(0, 0) + 2, (-16777050) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51722), objArr14);
                    sb6.append(((String) objArr14[0]).intern());
                    sb6.append(size);
                    Object[] objArr15 = new Object[1];
                    b("\uf4b1诖", 32561 - View.resolveSizeAndState(0, 0, 0), objArr15);
                    sb6.append(((String) objArr15[0]).intern());
                    sb6.append(this.getMonetizationNetwork.size());
                    String obj4 = sb6.toString();
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    byte[] mediationNetwork = AFa1ySDK.getMediationNetwork(AFa1ySDK.AFAdRevenueData(obj4));
                    StringBuilder sb8 = new StringBuilder();
                    length = mediationNetwork.length;
                    for (i10 = 0; i10 < length; i10++) {
                        int i12 = component1 + 37;
                        areAllFieldsValid = i12 % 128;
                        if (i12 % 2 != 0) {
                            hexString = Integer.toHexString(mediationNetwork[i10]);
                            if (hexString.length() == 1) {
                                hexString = CommonUrlParts.Values.FALSE_INTEGER.concat(hexString);
                                areAllFieldsValid = (component1 + 69) % 128;
                                sb8.append(hexString);
                            } else {
                                sb8.append(hexString);
                            }
                        } else {
                            hexString = Integer.toHexString(mediationNetwork[i10]);
                            if (hexString.length() != 1) {
                                sb8.append(hexString);
                            }
                            hexString = CommonUrlParts.Values.FALSE_INTEGER.concat(hexString);
                            areAllFieldsValid = (component1 + 69) % 128;
                            sb8.append(hexString);
                        }
                    }
                    sb7.append(sb8.toString());
                    return sb7.toString();
                }
            }
            i5 = 0;
            Context context22 = this.getRevenue;
            Object[] objArr112 = new Object[1];
            b("\uf4e4霛㌫\udf5f筜ݨ", TextUtils.lastIndexOf("", '0') + 25578, objArr112);
            int size2 = ((SensorManager) context22.getSystemService(((String) objArr112[0]).intern())).getSensorList(-1).size();
            StringBuilder sb62 = new StringBuilder();
            Object[] objArr122 = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, 165 - View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), objArr122);
            sb62.append(((String) objArr122[0]).intern());
            sb62.append(i11);
            Object[] objArr132 = new Object[1];
            b("\uf4b1앾", Color.red(0) + 12689, objArr132);
            sb62.append(((String) objArr132[0]).intern());
            sb62.append(i5);
            Object[] objArr142 = new Object[1];
            a(View.combineMeasuredStates(0, 0) + 2, (-16777050) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 51722), objArr142);
            sb62.append(((String) objArr142[0]).intern());
            sb62.append(size2);
            Object[] objArr152 = new Object[1];
            b("\uf4b1诖", 32561 - View.resolveSizeAndState(0, 0, 0), objArr152);
            sb62.append(((String) objArr152[0]).intern());
            sb62.append(this.getMonetizationNetwork.size());
            String obj42 = sb62.toString();
            StringBuilder sb72 = new StringBuilder();
            sb72.append(str);
            byte[] mediationNetwork2 = AFa1ySDK.getMediationNetwork(AFa1ySDK.AFAdRevenueData(obj42));
            StringBuilder sb82 = new StringBuilder();
            length = mediationNetwork2.length;
            while (i10 < length) {
            }
            sb72.append(sb82.toString());
            return sb72.toString();
        } catch (Exception e9) {
            Object[] objArr16 = new Object[1];
            a(16 - View.MeasureSpec.getSize(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 168, (char) (ViewConfiguration.getLongPressTimeout() >> 16), objArr16);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr16[0]).intern(), e9);
            StringBuilder sb9 = new StringBuilder();
            Object[] objArr17 = new Object[1];
            a(KeyEvent.getDeadChar(0, 0) + 44, TextUtils.lastIndexOf("", '0') + 74, (char) View.MeasureSpec.makeMeasureSpec(0, 0), objArr17);
            sb9.append(((String) objArr17[0]).intern());
            sb9.append(e9);
            AFLogger.afRDLog(sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str);
            Object[] objArr18 = new Object[1];
            b("\uf4f1仦聤\uda64ᷢ埣ꥡ\ue361⛯磬눯\uf43f俳膮\udb78ᴵ", (ViewConfiguration.getJumpTapTimeout() >> 16) + 47681, objArr18);
            sb10.append(((String) objArr18[0]).intern());
            return sb10.toString();
        }
    }

    public static void getCurrencyIso4217Code() {
        getMediationNetwork = new char[]{32809, 60417, 22601, 50353, 12445, 40142, 2359, 30066, 57668, 19854, 47603, 9789, 45739, 56965, 27364, 63018, 523, 44623, 15281, 18408, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65156, 2745, 38644, 8786, 20052, 55929, 26549, 62430, 8007, 43825, 14205, 16521, 60606, 30968, 33805, 4167, 48240, 51618, 21895, 57666, 37826, 65525, 19355, 55118, 9062, 36650, 45768, 57016, 27352, 63046, 627, 45699, 57003, 27346, 62980, 572, 44650, 15327, 18379, 54264, 32556, 35670, 5266, 41136, 52466, 22558, 58442, 28786, 40410, 10688, 46589, 49455, 27934, 65177, 2749, 38625, 8711, 20038, 55856, 26550, 62431, 7955, 43836, 14117, 16527, 60579, 30955, 33820, 4190, 48235, 51621, 21970, 57612, 3433, 39200, 45700, 56996, 27359, 63002, 566, 44647, 15259, 18306, 54260, 32556, 35655, 5253, 41151, 52466, 22617, 58437, 28790, 40334, 10690, 46583, 49447, 27920, 65197, 2717, 38617, 8742, 20070, 55874, 26520, 62441, 7972, 43804, 14148, 16548, 60572, 30925, 33853, 45713, 57007, 27350, 63000, 572, 44668, 15262, 18392, 54248, 32560, 35670, 45703, 30921, 5299, 45698, 57007, 27343, 63038, 619, 44632, 15262, 18368, 54248, 32551, 35603, 5253, 41123, 52468, 22552, 58454};
        getCurrencyIso4217Code = 4920180562940649162L;
        AFAdRevenueData = 2584127450055626215L;
    }
}
