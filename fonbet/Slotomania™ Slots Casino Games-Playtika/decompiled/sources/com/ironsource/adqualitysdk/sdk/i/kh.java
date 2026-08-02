package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class kh {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f3007 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f3008 = {-19, -7, Ascii.US, -69, -99, -40, -46, -43, -30, Ascii.SUB, -57, -107, -44, -47, -34, Ascii.US, -122, -48, 41, -112, -51, -31, -56, 35, -112, -45, -37, -53, -35, -41, -58, 37, -125, -30, -50, -43, -32, -62, -42, -38, -38, Ascii.RS, -111, -43, -40, Ascii.SYN, -127, 34, -114, -33, -51, -52, -37, 1, -19, 4, -19, -17, 9, 82, 49, 93, 58, 97, Ascii.FS, 74, 80, SignedBytes.MAX_POWER_OF_TWO, 94, 108, 1, 82, 49, 93, 58, 65, -121, Ascii.SI, 118, -1, 74, 80, SignedBytes.MAX_POWER_OF_TWO, 62, -116, 6, 67, 81, -20, 39, -98, -91, -107, -92, -88, -112, -101, -46, 121, -89, -95, -98, -100, -95, -95, -114, -67, -110, -108, -98, -99, -97, -69, -60, 91, -88, -89, -46, 98, -90, -112, -28, 98, -90, -112, -103, -92, -86, -100, -86, -117, -93, -84, -94, -46, 104, -95, -112, -100, -91, -101, -92, -98, -100, -88, -38, 96, -99, -85, -20, -20};

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static short[] f3009 = null;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f3010 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f3011 = -1613416188;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f3012 = 619369809;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f3013 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3014 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char f3015 = 29867;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f3016 = 21;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m8391(Context context, String str) {
        int i = 2 % 2;
        int i2 = f3007 + 59;
        f3010 = i2 % 128;
        if (i2 % 2 == 0) {
            context.checkCallingOrSelfPermission(str);
            throw null;
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        int i3 = f3010 + 93;
        f3007 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8388(Context context, JSONObject jSONObject) {
        int i;
        long j;
        int i2 = 2 % 2;
        int i3 = f3007 + 5;
        f3010 = i3 % 128;
        int i4 = i3 % 2;
        String intern = m8392((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "鑗ᡄ\ue960졽", "ꗺ옷崉\ueba2꽢⛿ﰭ捳", Color.alpha(0)).intern();
        String packageName = context.getPackageName();
        try {
            jSONObject.put(m8392((char) (63635 - KeyEvent.keyCodeFromString("")), "\u0000\u0000\u0000\u0000", "韩湫鎝ᇸ", "Ԉ寷", TextUtils.getOffsetBefore("", 0)).intern(), packageName);
            int i5 = f3007 + 37;
            f3010 = i5 % 128;
            int i6 = i5 % 2;
        } catch (JSONException e) {
            m.m8535(intern, m8392((char) TextUtils.indexOf("", "", 0, 0), "\u0000\u0000\u0000\u0000", "☭\ue45d仮䤴", "檭ࢧ묤换\ueee4곙弡沸㚱⸱䜺㍅耘\ue1ef⳱㮑㠎頵蝦ꁇ≮維곸䶶톃⼛᱂ǡ갹ﬞ\uf68b쯢菘丩", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), e);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(m8387((short) (10 - View.resolveSize(0, 0)), KeyEvent.getDeadChar(0, 0) + 1613416287, (ViewConfiguration.getDoubleTapTimeout() >> 16) - 22, TextUtils.getOffsetBefore("", 0) - 619369809, (byte) View.resolveSize(0, 0)).intern(), packageManager.getInstallerPackageName(packageName));
            i = 0;
        } catch (JSONException e2) {
            i = 0;
            m.m8520(intern, new StringBuilder().append(m8387((short) (43 - TextUtils.indexOf("", "", 0)), TextUtils.indexOf((CharSequence) "", '0') + 1613416256, (ViewConfiguration.getKeyRepeatDelay() >> 16) - 22, (-619369807) - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) Color.alpha(0)).intern()).append(e2.getLocalizedMessage()).toString());
        }
        int i7 = i;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, i7);
            j = 0;
            try {
                jSONObject.put(m8387((short) ((-23) - Color.green(i7)), 1613416306 - TextUtils.getCapsMode("", i7, i7), (-22) - TextUtils.getTrimmedLength(""), (-619369755) - TextUtils.indexOf("", "", i7, i7), (byte) (ViewConfiguration.getEdgeSlop() >> 16)).intern(), Integer.toString(packageInfo.versionCode));
                jSONObject.put(m8392((char) (((Process.getThreadPriority(0) + 20) >> 6) + 35288), "\u0000\u0000\u0000\u0000", "틏ώ\ud85b讉", "阦\uda32", View.MeasureSpec.getMode(0)).intern(), packageInfo.versionName);
            } catch (PackageManager.NameNotFoundException e3) {
                e = e3;
                m.m8520(intern, new StringBuilder().append(m8392((char) View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", "ꆛ≉\uea7a\udeb7", "ﻡ㫈贷钂⥡۩㷸⭒⣔踄䯤볤앜莪ㅮ䢜羭镏ꗳ᧡瘰笛꜠ᖋ톉玹䎍臮䯸埏涣∔섉", Color.rgb(0, 0, 0) + 2065844641).intern()).append(packageName).append(m8392((char) ((Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)) - 1), "\u0000\u0000\u0000\u0000", "蠚䟫⡡凱", "\uda55둯膣✖㈬鬸崿㔮㌽\uf1d0", 1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))).intern()).append(e.getLocalizedMessage()).toString());
                jSONObject.put(m8387((short) (27 - (ViewConfiguration.getEdgeSlop() >> 16)), 1613416288 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 22, (-619369753) - Color.red(0), (byte) (AndroidCharacter.getMirror('0') - '0')).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            } catch (JSONException e4) {
                e = e4;
                m.m8520(intern, new StringBuilder().append(m8392((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), "\u0000\u0000\u0000\u0000", "耂\udaf4菴鳍", "䭬茫죾出ꐶ쮥본Ł早텵햨獒\udaa2⟩ⴹ坞ӳ腰뾌᥌摀鹹뺆䓖⟔颜\uddbf닆ᝡწ\ude65\ue4e5౪婦ꝺŧ뙥ⓘ겥덜䑩\ue0c2\ue5f9甅㓜\uf66d", 1 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1))).intern()).append(e.getLocalizedMessage()).toString());
                jSONObject.put(m8387((short) (27 - (ViewConfiguration.getEdgeSlop() >> 16)), 1613416288 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 22, (-619369753) - Color.red(0), (byte) (AndroidCharacter.getMirror('0') - '0')).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
            }
        } catch (PackageManager.NameNotFoundException e5) {
            e = e5;
            j = 0;
        } catch (JSONException e6) {
            e = e6;
            j = 0;
        }
        try {
            jSONObject.put(m8387((short) (27 - (ViewConfiguration.getEdgeSlop() >> 16)), 1613416288 - (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) - 22, (-619369753) - Color.red(0), (byte) (AndroidCharacter.getMirror('0') - '0')).intern(), packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
        } catch (PackageManager.NameNotFoundException e7) {
            m.m8520(intern, new StringBuilder().append(m8392((char) View.resolveSizeAndState(0, 0, 0), "\u0000\u0000\u0000\u0000", "ꆛ≉\uea7a\udeb7", "ﻡ㫈贷钂⥡۩㷸⭒⣔踄䯤볤앜莪ㅮ䢜羭镏ꗳ᧡瘰笛꜠ᖋ톉玹䎍臮䯸埏涣∔섉", (ViewConfiguration.getScrollBarSize() >> 8) + 2049067425).intern()).append(packageName).append(m8392((char) View.resolveSize(0, 0), "\u0000\u0000\u0000\u0000", "蠚䟫⡡凱", "\uda55둯膣✖㈬鬸崿㔮㌽\uf1d0", '0' - AndroidCharacter.getMirror('0')).intern()).append(e7.getLocalizedMessage()).toString());
        } catch (JSONException e8) {
            m.m8520(intern, new StringBuilder().append(m8392((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 50927), "\u0000\u0000\u0000\u0000", "ੱ꽇\uef5b燆", "슽ꂴ\ue93e\ue128ᝡꃝ颷籆㲆烤㒃玐䇮쇳懭㧜ඎ瑶腅僎\uf719㖞簄ࢩ袭ףּ攏䍿覢湽\uf2ec綌釪硰䬳蛡筨呴剳淶퍕兩䖫", 1538213641 - MotionEvent.axisFromString("")).intern()).append(e8.getLocalizedMessage()).toString());
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m8390(Context context) {
        int i = 2 % 2;
        int i2 = f3010 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3007 = i2 % 128;
        int i3 = i2 % 2;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Object obj = null;
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName;
            int i4 = f3010 + 111;
            f3007 = i4 % 128;
            if (i4 % 2 == 0) {
                return str;
            }
            super.hashCode();
            throw null;
        } catch (PackageManager.NameNotFoundException e) {
            m.m8520(m8392((char) (ViewConfiguration.getJumpTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "鑗ᡄ\ue960졽", "ꗺ옷崉\ueba2꽢⛿ﰭ捳", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern(), new StringBuilder().append(m8392((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), "\u0000\u0000\u0000\u0000", "ꆛ≉\uea7a\udeb7", "ﻡ㫈贷钂⥡۩㷸⭒⣔踄䯤볤앜莪ㅮ䢜羭镏ꗳ᧡瘰笛꜠ᖋ톉玹䎍臮䯸埏涣∔섉", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2049067424).intern()).append(packageName).append(m8392((char) (TextUtils.lastIndexOf("", '0') + 1), "\u0000\u0000\u0000\u0000", "蠚䟫⡡凱", "\uda55둯膣✖㈬鬸崿㔮㌽\uf1d0", Gravity.getAbsoluteGravity(0, 0)).intern()).append(e.getLocalizedMessage()).toString());
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static String m8389() {
        int i = 2 % 2;
        int i2 = f3007 + 39;
        f3010 = i2 % 128;
        int i3 = i2 % 2;
        try {
            try {
                Class.forName(m8387((short) ((-68) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 1613416288 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 23, ((Process.getThreadPriority(0) + 20) >> 6) - 619369751, (byte) Gravity.getAbsoluteGravity(0, 0)).intern());
                String intern = m8387((short) (78 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1613416306 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-21) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (-619369721) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) TextUtils.getCapsMode("", 0, 0)).intern();
                int i4 = f3007 + 5;
                f3010 = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 0 / 0;
                }
                return intern;
            } catch (ClassNotFoundException unused) {
                Class.forName(m8387((short) (98 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1613416287 - ExpandableListView.getPackedPositionGroup(0L), KeyEvent.getDeadChar(0, 0) - 22, (-619369720) - ExpandableListView.getPackedPositionType(0L), (byte) Color.red(0)).intern());
                return m8387((short) ((-93) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 1613416285 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-22) - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 619369660, (byte) TextUtils.getTrimmedLength("")).intern();
            }
        } catch (ClassNotFoundException unused2) {
            return m8387((short) (View.MeasureSpec.getSize(0) + 41), 1613416298 - (Process.myTid() >> 22), (-22) - KeyEvent.normalizeMetaState(0), MotionEvent.axisFromString("") - 619369658, (byte) Gravity.getAbsoluteGravity(0, 0)).intern();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8392(char c, String str, String str2, String str3, int i) {
        String str4;
        char[] cArr = str3;
        if (str3 != null) {
            cArr = str3.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = str2;
        if (str2 != null) {
            cArr3 = str2.toCharArray();
        }
        char[] cArr4 = cArr3;
        char[] cArr5 = str;
        if (str != null) {
            cArr5 = str.toCharArray();
        }
        char[] cArr6 = cArr5;
        synchronized (f.f2042) {
            char[] cArr7 = (char[]) cArr4.clone();
            char[] cArr8 = (char[]) cArr6.clone();
            cArr7[0] = (char) (c ^ cArr7[0]);
            cArr8[2] = (char) (cArr8[2] + ((char) i));
            int length = cArr2.length;
            char[] cArr9 = new char[length];
            f.f2041 = 0;
            while (f.f2041 < length) {
                int i2 = (f.f2041 + 2) % 4;
                int i3 = (f.f2041 + 3) % 4;
                f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                cArr7[i3] = f.f2043;
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f3013) ^ f3014) ^ f3015);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8387(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f3016;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f3008;
                if (bArr != null) {
                    i5 = (byte) (bArr[f3012 + i3] + i4);
                } else {
                    i5 = (short) (f3009[f3012 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f3012 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f3011);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f3008;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f3009;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
