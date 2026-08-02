package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.facebook.appevents.AppEventsConstants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class AFd1oSDK extends HashMap<String, Object> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AFAdRevenueData = null;
    private static char component2 = 0;
    private static int component3 = 0;
    private static int component4 = 1;
    private static char[] getCurrencyIso4217Code;
    private static long getMediationNetwork;
    private final Context getMonetizationNetwork;
    private final Map<String, Object> getRevenue;

    public AFd1oSDK(Map<String, Object> map, Context context) {
        this.getRevenue = map;
        this.getMonetizationNetwork = context;
        put(getCurrencyIso4217Code(), getMonetizationNetwork());
    }

    private static StringBuilder getMediationNetwork(String... strArr) throws Exception {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = component4 + 1;
            component3 = i3 % 128;
            int i4 = i3 % 2;
            arrayList.add(Integer.valueOf(strArr[i2].length()));
        }
        Collections.sort(arrayList);
        int intValue = ((Integer) arrayList.get(0)).intValue();
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        while (true) {
            Integer num = null;
            if (i5 >= intValue) {
                break;
            }
            int length2 = strArr.length;
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = component4 + 19;
                component3 = i7 % 128;
                int i8 = i7 % 2;
                int charAt = strArr[i6].charAt(i5);
                if (num == null) {
                    int i9 = component4 + 17;
                    component3 = i9 % 128;
                    int i10 = i9 % 2;
                } else {
                    charAt ^= num.intValue();
                }
                num = Integer.valueOf(charAt);
            }
            sb.append(Integer.toHexString(num.intValue()));
            i5++;
        }
        int i11 = component4 + 107;
        component3 = i11 % 128;
        if (i11 % 2 == 0) {
            return sb;
        }
        throw null;
    }

    private static void a(int i, char c, int i2, Object[] objArr) {
        int i3 = 2 % 2;
        AFk1tSDK aFk1tSDK = new AFk1tSDK();
        long[] jArr = new long[i];
        aFk1tSDK.getMonetizationNetwork = 0;
        int i4 = $11 + 111;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (aFk1tSDK.getMonetizationNetwork < i) {
            jArr[aFk1tSDK.getMonetizationNetwork] = (((char) (getCurrencyIso4217Code[aFk1tSDK.getMonetizationNetwork + i2] ^ (-4561870454477838480L))) ^ (aFk1tSDK.getMonetizationNetwork * ((-4561870454477838480L) ^ getMediationNetwork))) ^ c;
            aFk1tSDK.getMonetizationNetwork++;
        }
        char[] cArr = new char[i];
        aFk1tSDK.getMonetizationNetwork = 0;
        while (aFk1tSDK.getMonetizationNetwork < i) {
            cArr[aFk1tSDK.getMonetizationNetwork] = (char) jArr[aFk1tSDK.getMonetizationNetwork];
            aFk1tSDK.getMonetizationNetwork++;
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private String getCurrencyIso4217Code() {
        Object obj;
        int i = 2 % 2;
        int i2 = component4 + 51;
        component3 = i2 % 128;
        int i3 = i2 % 2;
        try {
            String num = Integer.toString(Build.VERSION.SDK_INT);
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            a(12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (TextUtils.indexOf("", "") + 21384), TextUtils.getTrimmedLength(""), objArr);
            String obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getRevenue;
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getTapTimeout() >> 16) + 5, (char) KeyEvent.getDeadChar(0, 0), 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
            String obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            if (obj3 == null) {
                int i4 = component4 + 21;
                component3 = i4 % 128;
                if (i4 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a(TextUtils.lastIndexOf("", 'E') * 79, (char) TextUtils.indexOf("", "", 1, 1), 66 - Drawable.resolveOpacity(1, 0), objArr3);
                    obj = objArr3[0];
                } else {
                    Object[] objArr4 = new Object[1];
                    a(TextUtils.lastIndexOf("", '0') + 9, (char) TextUtils.indexOf("", "", 0, 0), Drawable.resolveOpacity(0, 0) + 17, objArr4);
                    obj = objArr4[0];
                }
                obj3 = ((String) obj).intern();
            }
            StringBuilder sb = new StringBuilder(obj2);
            sb.reverse();
            StringBuilder mediationNetwork = getMediationNetwork(num, obj3, sb.toString());
            int length = mediationNetwork.length();
            if (length > 4) {
                mediationNetwork.delete(4, length);
            } else {
                while (length < 4) {
                    int i5 = component4 + 33;
                    component3 = i5 % 128;
                    int i6 = i5 % 2;
                    length++;
                    mediationNetwork.append('1');
                }
            }
            Object[] objArr5 = new Object[1];
            b((Process.myTid() >> 22) + 3, "\u0001<㙡", (byte) (Drawable.resolveOpacity(0, 0) + 101), objArr5);
            mediationNetwork.insert(0, ((String) objArr5[0]).intern());
            String obj4 = mediationNetwork.toString();
            int i7 = component3 + 91;
            component4 = i7 % 128;
            if (i7 % 2 == 0) {
                int i8 = 83 / 0;
            }
            return obj4;
        } catch (Exception e) {
            Object[] objArr6 = new Object[1];
            b(40 - (ViewConfiguration.getScrollBarSize() >> 8), "\u0005\u000f<\t/\t9\u00017\u000f\u001e.:\f:1\u0005\u000f81<1$\u000e84\u000f\u0005\u0001<\u0017\u0006\u0001<7\u000f\u001c=\u000b,", (byte) (43 - (ViewConfiguration.getTapTimeout() >> 16)), objArr6);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr6[0]).intern(), e);
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr7 = new Object[1];
            a(42 - Color.blue(0), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 45087), 25 - TextUtils.getTrimmedLength(""), objArr7);
            sb2.append(((String) objArr7[0]).intern());
            sb2.append(e);
            AFLogger.afRDLog(sb2.toString());
            Object[] objArr8 = new Object[1];
            b(7 - View.resolveSizeAndState(0, 0, 0), "\u0001<\u0013>㗴㗴㗴", (byte) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 81), objArr8);
            return ((String) objArr8[0]).intern();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0208, code lost:
    
        if (r0.contains(((java.lang.String) r13[0]).intern()) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x018f A[Catch: Exception -> 0x032a, TryCatch #0 {Exception -> 0x032a, blocks: (B:10:0x0161, B:12:0x018f, B:13:0x01b1, B:17:0x01c9, B:21:0x020d, B:25:0x0301, B:27:0x030d, B:29:0x0317, B:32:0x031d, B:36:0x01ea), top: B:9:0x0161 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String getMonetizationNetwork() {
        String obj;
        String str;
        Intent registerReceiver;
        String str2;
        int i;
        String obj2;
        String obj3;
        String intern;
        int i2 = 2 % 2;
        try {
            Map<String, Object> map = this.getRevenue;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getTapTimeout() >> 16) + 12, (char) (TextUtils.getOffsetAfter("", 0) + 21384), KeyEvent.keyCodeFromString(""), objArr);
            obj2 = map.get(((String) objArr[0]).intern()).toString();
            Map<String, Object> map2 = this.getRevenue;
            Object[] objArr2 = new Object[1];
            b(15 - View.resolveSizeAndState(0, 0, 0), "\u0014>56\u00144'!17/\u001b$\u000e㘓", (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 19), objArr2);
            obj3 = map2.get(((String) objArr2[0]).intern()).toString();
            Object[] objArr3 = new Object[1];
            b(6 - (Process.myTid() >> 22), "\n9(\u001a\u00022", (byte) KeyEvent.keyCodeFromString(""), objArr3);
            intern = ((String) objArr3[0]).intern();
        } catch (Exception e) {
            e = e;
        }
        try {
            try {
                Object[] objArr4 = new Object[1];
                b(6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u001c62>㗲", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 66), objArr4);
                String replaceAll = intern.replaceAll(((String) objArr4[0]).intern(), "");
                StringBuilder sb = new StringBuilder();
                sb.append(obj2);
                sb.append(obj3);
                sb.append(replaceAll);
                String monetizationNetwork = AFb1kSDK.getMonetizationNetwork(sb.toString());
                StringBuilder sb2 = new StringBuilder("");
                sb2.append(monetizationNetwork.substring(0, 16));
                obj = sb2.toString();
                int i3 = component4 + 109;
                component3 = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                e = e2;
                Object[] objArr5 = new Object[1];
                b((ViewConfiguration.getScrollDefaultDelay() >> 16) + 38, "\t=\t,\t/\"\u000e!8\u0006\u0017$>\t:7\u0002\t=186$\u0014\u00045\b\u0000\u0005>\u0011\u000f/\"\u000e!8", (byte) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 126), objArr5);
                AFLogger.afErrorLogForExcManagerOnly(((String) objArr5[0]).intern(), e);
                StringBuilder sb3 = new StringBuilder();
                Object[] objArr6 = new Object[1];
                b((-16777172) - Color.rgb(0, 0, 0), "\u001e.:\f:1\u0005\u000f81<1$\u000e84\u000f\u0005\u0001<\u0017\u0006 '\b\"?\u0001\u001c=\u000b,\u0001?\u00161;\t\u0014\u0004\u00002\u0007\u000f", (byte) (12 - ExpandableListView.getPackedPositionType(0L)), objArr6);
                sb3.append(((String) objArr6[0]).intern());
                sb3.append(e);
                AFLogger.afRDLog(sb3.toString());
                StringBuilder sb4 = new StringBuilder("");
                Object[] objArr7 = new Object[1];
                a(18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((ViewConfiguration.getTapTimeout() >> 16) + 47900), 67 - (KeyEvent.getMaxKeyCode() >> 16), objArr7);
                sb4.append(((String) objArr7[0]).intern());
                obj = sb4.toString();
                str = obj;
                Context context = this.getMonetizationNetwork;
                Object[] objArr8 = new Object[1];
                b(37 - Gravity.getAbsoluteGravity(0, 0), " 635\u0004::\u000284\t<4\b>\"4\u000e:\u000428%+㘔㘔\u0015\";6!\u001a./\u0014\u0013㘤", (byte) (AndroidCharacter.getMirror('0') + 22), objArr8);
                registerReceiver = context.registerReceiver(null, new IntentFilter(((String) objArr8[0]).intern()));
                int i5 = -2700;
                if (registerReceiver != null) {
                }
                str2 = this.getMonetizationNetwork.getApplicationInfo().nativeLibraryDir;
                if (str2 != null) {
                }
                Context context2 = this.getMonetizationNetwork;
                Object[] objArr9 = new Object[1];
                b(6 - (KeyEvent.getMaxKeyCode() >> 16), "1=16\u00042", (byte) (TextUtils.getOffsetBefore("", 0) + 37), objArr9);
                int size = ((SensorManager) context2.getSystemService(((String) objArr9[0]).intern())).getSensorList(-1).size();
                StringBuilder sb5 = new StringBuilder();
                Object[] objArr10 = new Object[1];
                b(-((byte) KeyEvent.getModifierMetaStateMask()), "㘌", (byte) (View.MeasureSpec.getSize(0) + 20), objArr10);
                sb5.append(((String) objArr10[0]).intern());
                sb5.append(i5);
                Object[] objArr11 = new Object[1];
                b((ViewConfiguration.getTouchSlop() >> 8) + 2, "\t\u0016", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 52), objArr11);
                sb5.append(((String) objArr11[0]).intern());
                sb5.append(i);
                Object[] objArr12 = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0) + 2, (char) (60624 - TextUtils.getCapsMode("", 0, 0)), 86 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr12);
                sb5.append(((String) objArr12[0]).intern());
                sb5.append(size);
                Object[] objArr13 = new Object[1];
                b(View.combineMeasuredStates(0, 0) + 2, "\u000f\f", (byte) (AndroidCharacter.getMirror('0') - ' '), objArr13);
                sb5.append(((String) objArr13[0]).intern());
                sb5.append(this.getRevenue.size());
                String obj4 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                byte[] AFAdRevenueData2 = AFa1tSDK.AFAdRevenueData(AFa1tSDK.getMonetizationNetwork(obj4));
                StringBuilder sb7 = new StringBuilder();
                while (r12 < r7) {
                }
                sb6.append(sb7.toString());
                return sb6.toString();
            }
            Context context3 = this.getMonetizationNetwork;
            Object[] objArr82 = new Object[1];
            b(37 - Gravity.getAbsoluteGravity(0, 0), " 635\u0004::\u000284\t<4\b>\"4\u000e:\u000428%+㘔㘔\u0015\";6!\u001a./\u0014\u0013㘤", (byte) (AndroidCharacter.getMirror('0') + 22), objArr82);
            registerReceiver = context3.registerReceiver(null, new IntentFilter(((String) objArr82[0]).intern()));
            int i52 = -2700;
            if (registerReceiver != null) {
                Object[] objArr14 = new Object[1];
                b(11 - TextUtils.indexOf("", "", 0, 0), "\t<\u0013\f<1$\u000e$0㘆", (byte) (7 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr14);
                i52 = registerReceiver.getIntExtra(((String) objArr14[0]).intern(), -2700);
            }
            str2 = this.getMonetizationNetwork.getApplicationInfo().nativeLibraryDir;
            if (str2 != null) {
                int i6 = component3 + 3;
                component4 = i6 % 128;
                if (i6 % 2 == 0) {
                    Object[] objArr15 = new Object[1];
                    b(5 - TextUtils.getTrimmedLength(""), "\u0010)㗓", (byte) (Color.green(0) + 55), objArr15);
                    i = str2.contains(((String) objArr15[0]).intern()) ? 1 : 0;
                } else {
                    Object[] objArr16 = new Object[1];
                    b(TextUtils.getTrimmedLength("") + 3, "\u0010)㗓", (byte) (39 - Color.green(0)), objArr16);
                }
                Context context22 = this.getMonetizationNetwork;
                Object[] objArr92 = new Object[1];
                b(6 - (KeyEvent.getMaxKeyCode() >> 16), "1=16\u00042", (byte) (TextUtils.getOffsetBefore("", 0) + 37), objArr92);
                int size2 = ((SensorManager) context22.getSystemService(((String) objArr92[0]).intern())).getSensorList(-1).size();
                StringBuilder sb52 = new StringBuilder();
                Object[] objArr102 = new Object[1];
                b(-((byte) KeyEvent.getModifierMetaStateMask()), "㘌", (byte) (View.MeasureSpec.getSize(0) + 20), objArr102);
                sb52.append(((String) objArr102[0]).intern());
                sb52.append(i52);
                Object[] objArr112 = new Object[1];
                b((ViewConfiguration.getTouchSlop() >> 8) + 2, "\t\u0016", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 52), objArr112);
                sb52.append(((String) objArr112[0]).intern());
                sb52.append(i);
                Object[] objArr122 = new Object[1];
                a(View.MeasureSpec.makeMeasureSpec(0, 0) + 2, (char) (60624 - TextUtils.getCapsMode("", 0, 0)), 86 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr122);
                sb52.append(((String) objArr122[0]).intern());
                sb52.append(size2);
                Object[] objArr132 = new Object[1];
                b(View.combineMeasuredStates(0, 0) + 2, "\u000f\f", (byte) (AndroidCharacter.getMirror('0') - ' '), objArr132);
                sb52.append(((String) objArr132[0]).intern());
                sb52.append(this.getRevenue.size());
                String obj42 = sb52.toString();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(str);
                byte[] AFAdRevenueData22 = AFa1tSDK.AFAdRevenueData(AFa1tSDK.getMonetizationNetwork(obj42));
                StringBuilder sb72 = new StringBuilder();
                for (byte b : AFAdRevenueData22) {
                    int i7 = component3 + 103;
                    component4 = i7 % 128;
                    int i8 = i7 % 2;
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = AppEventsConstants.EVENT_PARAM_VALUE_NO.concat(String.valueOf(hexString));
                    }
                    sb72.append(hexString);
                }
                sb62.append(sb72.toString());
                return sb62.toString();
            }
            Context context222 = this.getMonetizationNetwork;
            Object[] objArr922 = new Object[1];
            b(6 - (KeyEvent.getMaxKeyCode() >> 16), "1=16\u00042", (byte) (TextUtils.getOffsetBefore("", 0) + 37), objArr922);
            int size22 = ((SensorManager) context222.getSystemService(((String) objArr922[0]).intern())).getSensorList(-1).size();
            StringBuilder sb522 = new StringBuilder();
            Object[] objArr1022 = new Object[1];
            b(-((byte) KeyEvent.getModifierMetaStateMask()), "㘌", (byte) (View.MeasureSpec.getSize(0) + 20), objArr1022);
            sb522.append(((String) objArr1022[0]).intern());
            sb522.append(i52);
            Object[] objArr1122 = new Object[1];
            b((ViewConfiguration.getTouchSlop() >> 8) + 2, "\t\u0016", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 52), objArr1122);
            sb522.append(((String) objArr1122[0]).intern());
            sb522.append(i);
            Object[] objArr1222 = new Object[1];
            a(View.MeasureSpec.makeMeasureSpec(0, 0) + 2, (char) (60624 - TextUtils.getCapsMode("", 0, 0)), 86 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr1222);
            sb522.append(((String) objArr1222[0]).intern());
            sb522.append(size22);
            Object[] objArr1322 = new Object[1];
            b(View.combineMeasuredStates(0, 0) + 2, "\u000f\f", (byte) (AndroidCharacter.getMirror('0') - ' '), objArr1322);
            sb522.append(((String) objArr1322[0]).intern());
            sb522.append(this.getRevenue.size());
            String obj422 = sb522.toString();
            StringBuilder sb622 = new StringBuilder();
            sb622.append(str);
            byte[] AFAdRevenueData222 = AFa1tSDK.AFAdRevenueData(AFa1tSDK.getMonetizationNetwork(obj422));
            StringBuilder sb722 = new StringBuilder();
            while (r12 < r7) {
            }
            sb622.append(sb722.toString());
            return sb622.toString();
        } catch (Exception e3) {
            Object[] objArr17 = new Object[1];
            b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, "\t=\t,\t/\"\u000e!8\u0001?㙌㙌\u00042", (byte) ((-16777116) - Color.rgb(0, 0, 0)), objArr17);
            AFLogger.afErrorLogForExcManagerOnly(((String) objArr17[0]).intern(), e3);
            StringBuilder sb8 = new StringBuilder();
            Object[] objArr18 = new Object[1];
            b((ViewConfiguration.getFadingEdgeLength() >> 16) + 44, "\u001e.:\f:1\u0005\u000f81<1$\u000e84\u000f\u0005\u0001<\u0017\u0006 '\b\"?\u0001\u001c=\u000b,\u0001?\u00161;\t\u0014\u0004\u00002\u0007\u000f", (byte) (12 - (ViewConfiguration.getLongPressTimeout() >> 16)), objArr18);
            sb8.append(((String) objArr18[0]).intern());
            sb8.append(e3);
            AFLogger.afRDLog(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            Object[] objArr19 = new Object[1];
            a((ViewConfiguration.getJumpTapTimeout() >> 16) + 16, (char) (5703 - TextUtils.getOffsetAfter("", 0)), 135 - AndroidCharacter.getMirror('0'), objArr19);
            sb9.append(((String) objArr19[0]).intern());
            return sb9.toString();
        }
        str = obj;
    }

    public static class AFa1tSDK {
        static byte[] getMonetizationNetwork(String str) throws Exception {
            return str.getBytes(Charset.defaultCharset());
        }

        static byte[] AFAdRevenueData(byte[] bArr) throws Exception {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
            }
            return bArr;
        }
    }

    private static void b(int i, String str, byte b, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        AFk1rSDK aFk1rSDK = new AFk1rSDK();
        char[] cArr3 = AFAdRevenueData;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i4 = $10 + 13;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 % 4;
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 83;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr4[i6] = (char) (cArr3[i6] - (-8395188795697443055L));
                } else {
                    cArr4[i6] = (char) (cArr3[i6] ^ (-8395188795697443055L));
                    i6++;
                }
            }
            cArr3 = cArr4;
        }
        char c = (char) ((-8395188795697443055L) ^ component2);
        char[] cArr5 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr5[i2] = (char) (cArr2[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 107;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            aFk1rSDK.AFAdRevenueData = 0;
            while (aFk1rSDK.AFAdRevenueData < i2) {
                aFk1rSDK.getMonetizationNetwork = cArr2[aFk1rSDK.AFAdRevenueData];
                aFk1rSDK.getRevenue = cArr2[aFk1rSDK.AFAdRevenueData + 1];
                if (aFk1rSDK.getMonetizationNetwork == aFk1rSDK.getRevenue) {
                    cArr5[aFk1rSDK.AFAdRevenueData] = (char) (aFk1rSDK.getMonetizationNetwork - b);
                    cArr5[aFk1rSDK.AFAdRevenueData + 1] = (char) (aFk1rSDK.getRevenue - b);
                } else {
                    aFk1rSDK.getCurrencyIso4217Code = aFk1rSDK.getMonetizationNetwork / c;
                    aFk1rSDK.component3 = aFk1rSDK.getMonetizationNetwork % c;
                    aFk1rSDK.getMediationNetwork = aFk1rSDK.getRevenue / c;
                    aFk1rSDK.component4 = aFk1rSDK.getRevenue % c;
                    if (aFk1rSDK.component3 == aFk1rSDK.component4) {
                        int i10 = $10 + 5;
                        $11 = i10 % 128;
                        int i11 = i10 % 2;
                        aFk1rSDK.getCurrencyIso4217Code = ((aFk1rSDK.getCurrencyIso4217Code + c) - 1) % c;
                        aFk1rSDK.getMediationNetwork = ((aFk1rSDK.getMediationNetwork + c) - 1) % c;
                        int i12 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component3;
                        int i13 = (aFk1rSDK.getMediationNetwork * c) + aFk1rSDK.component4;
                        cArr5[aFk1rSDK.AFAdRevenueData] = cArr3[i12];
                        cArr5[aFk1rSDK.AFAdRevenueData + 1] = cArr3[i13];
                    } else if (aFk1rSDK.getCurrencyIso4217Code == aFk1rSDK.getMediationNetwork) {
                        int i14 = $11 + 17;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                        aFk1rSDK.component3 = ((aFk1rSDK.component3 + c) - 1) % c;
                        aFk1rSDK.component4 = ((aFk1rSDK.component4 + c) - 1) % c;
                        int i16 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component3;
                        int i17 = (aFk1rSDK.getMediationNetwork * c) + aFk1rSDK.component4;
                        cArr5[aFk1rSDK.AFAdRevenueData] = cArr3[i16];
                        cArr5[aFk1rSDK.AFAdRevenueData + 1] = cArr3[i17];
                    } else {
                        int i18 = (aFk1rSDK.getCurrencyIso4217Code * c) + aFk1rSDK.component4;
                        int i19 = (aFk1rSDK.getMediationNetwork * c) + aFk1rSDK.component3;
                        cArr5[aFk1rSDK.AFAdRevenueData] = cArr3[i18];
                        cArr5[aFk1rSDK.AFAdRevenueData + 1] = cArr3[i19];
                    }
                }
                aFk1rSDK.AFAdRevenueData += 2;
            }
        }
        int i20 = 0;
        while (i20 < i) {
            int i21 = $11 + 109;
            $10 = i21 % 128;
            if (i21 % 2 != 0) {
                cArr5[i20] = (char) (cArr5[i20] ^ 25333);
                i20 += 78;
            } else {
                cArr5[i20] = (char) (cArr5[i20] ^ 13722);
                i20++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    static void getRevenue() {
        getCurrencyIso4217Code = new char[]{62617, 55011, 45149, 37883, 32101, 22756, 14963, 1504, 59236, 49916, 44151, 36823, 42770, 34175, 58347, 49257, 12000, 42814, 34114, 58325, 49221, 11990, 2880, 27088, 22111, 5897, 13683, 21500, 28788, 40702, 47994, 55713, 58979, 1250, 8548, 20456, 27714, 35538, 55106, 62928, 4690, 12504, 23810, 31694, 38989, 42701, 49934, 57786, 3633, 11438, 18810, 38826, 46121, 53943, 65326, 7657, 14889, 22711, 25873, 33680, 40968, 52879, 60183, 2446, 22026, 29917, 37194, 7182, 15984, 22772, 31614, 38393, 45176, 53938, 60722, 4016, 10809, 17642, 26378, 33153, 56403, 65160, 6415, 15245, 22041, 19334, 27054, 45393, 37754, 62908, 54896, 14514, 7543, 32681, 16493, 41647, 34656, 59879, 51723, 11395, 28954, 21376, 46089};
        getMediationNetwork = 576572205790496013L;
        AFAdRevenueData = new char[]{20246, 20244, 31460, 31455, 31456, 31465, 20245, 31403, 20255, 31421, 31463, 31483, 31487, 31468, 31405, 31417, 31393, 31475, 31438, 31436, 31462, 20247, 31469, 20243, 31422, 31427, 20252, 20249, 20248, 31484, 31398, 31439, 31486, 20253, 31432, 31433, 20242, 31449, 31466, 31485, 31411, 31453, 31418, 31459, 31431, 31434, 31429, 31474, 31461, 31424, 31471, 31444, 31481, 31480, 31464, 20250, 20251, 31470, 31397, 31410, 31458, 20240, 31442, 31409};
        component2 = (char) 20249;
    }

    static {
        getRevenue();
        ViewConfiguration.getMinimumFlingVelocity();
        TextUtils.indexOf("", "", 0);
        ViewConfiguration.getTouchSlop();
        ViewConfiguration.getFadingEdgeLength();
        View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewConfiguration.getLongPressTimeout();
        View.MeasureSpec.getMode(0);
        TextUtils.getOffsetBefore("", 0);
        ViewConfiguration.getJumpTapTimeout();
        Color.blue(0);
        ViewConfiguration.getDoubleTapTimeout();
        View.resolveSize(0, 0);
        Process.getElapsedCpuTime();
        View.resolveSizeAndState(0, 0, 0);
        Color.alpha(0);
        KeyEvent.getModifierMetaStateMask();
        Color.green(0);
        ExpandableListView.getPackedPositionForGroup(0);
        TextUtils.lastIndexOf("", '0', 0);
        int i = component3 + 45;
        component4 = i % 128;
        int i2 = i % 2;
    }
}
