package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.SupplicantState;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.telephony.TelephonyManager;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class kf {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static int f2992 = 1;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f2993;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2994;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2995;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2996;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char f2997;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f2998;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static char f2999;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f3000;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char f3001;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject f3002;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject f3003;

    /* renamed from: ｋ, reason: contains not printable characters */
    static void m8374() {
        f3000 = (char) 46552;
        f2999 = (char) 7714;
        f2997 = (char) 30205;
        f3001 = (char) 17426;
        f2994 = true;
        f2995 = true;
        f2996 = 235;
        f2998 = new char[]{339, 303, 336, 353, 340, 334, 320, 351, 343, 350, 304, 349, 346, 267, 345, 338, 347, 332, 356, 312, 337, 344, 355, 354, 352, 293, 333, 335};
    }

    static {
        m8374();
        f3002 = null;
        int i = f2992 + 87;
        f2993 = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static String m8368() {
        int i = 2 % 2;
        int i2 = f2993 + 65;
        f2992 = i2 % 128;
        int i3 = i2 % 2;
        String str = Build.VERSION.RELEASE;
        if (i3 != 0) {
            return str;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8377(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2992 + 75;
        f2993 = i2 % 128;
        int i3 = i2 % 2;
        try {
            jSONObject.put(m8373("䦱㱞᱙㚙", '4' - AndroidCharacter.getMirror('0')).intern(), m8364());
            int i4 = f2993 + 43;
            f2992 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m8384(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = f2992 + 47;
        f2993 = i4 % 128;
        int i5 = i4 % 2;
        if (i < 0 || i2 < 0 || i > m8378()) {
            return false;
        }
        int i6 = f2992 + 105;
        f2993 = i6 % 128;
        int i7 = i6 % 2;
        if (i2 > m8381()) {
            return false;
        }
        int i8 = f2993 + 17;
        f2992 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int m8378() {
        int i = 2 % 2;
        int i2 = f2993 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f2992 = i2 % 128;
        int i3 = i2 % 2;
        int optInt = m8364().optInt(m8373("ࡅ붌", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
        int i4 = f2993 + 73;
        f2992 = i4 % 128;
        if (i4 % 2 != 0) {
            return optInt;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int m8381() {
        int i = 2 % 2;
        int i2 = f2993 + 45;
        f2992 = i2 % 128;
        int i3 = i2 % 2;
        int optInt = m8364().optInt(m8382(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u0081").intern());
        int i4 = f2992 + 31;
        f2993 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 33 / 0;
        }
        return optInt;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m8364() {
        int i = 2 % 2;
        int i2 = f2992 + 59;
        f2993 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8417 = kj.m8417(m8361());
        int i4 = f2993 + 17;
        f2992 = i4 % 128;
        if (i4 % 2 != 0) {
            return m8417;
        }
        throw null;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static synchronized JSONObject m8361() {
        JSONObject jSONObject;
        synchronized (kf.class) {
            int i = 2 % 2;
            int i2 = f2992 + 45;
            f2993 = i2 % 128;
            int i3 = i2 % 2;
            if (f3002 == null) {
                JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
                f3002 = jsonObjectInit;
                try {
                    jsonObjectInit.put(m8373("ࡅ붌", 1 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), -1);
                    f3002.put(m8382(null, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 127, null, "\u0081").intern(), -1);
                    int i4 = f2993 + 77;
                    f2992 = i4 % 128;
                    if (i4 % 2 != 0) {
                        int i5 = 2 % 2;
                    }
                } catch (JSONException unused) {
                }
            }
            jSONObject = f3002;
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r4 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        m8376(r4.getApplicationContext());
        r4 = com.ironsource.adqualitysdk.sdk.i.kf.f2993 + 103;
        com.ironsource.adqualitysdk.sdk.i.kf.f2992 = r4 % 128;
        r4 = r4 % 2;
        r1 = 2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x001a, code lost:
    
        if (r4 != null) goto L14;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void m8369(Activity activity) {
        synchronized (kf.class) {
            int i = 2 % 2;
            int i2 = f2992 + 103;
            f2993 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 47 / 0;
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m8375(Application application) {
        int i = 2 % 2;
        int i2 = f2993 + 85;
        f2992 = i2 % 128;
        int i3 = i2 % 2;
        if (application != null) {
            m8376(application.getApplicationContext());
        }
        int i4 = f2993 + 25;
        f2992 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0057, code lost:
    
        if (r2 != null) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #0 {all -> 0x00c6, blocks: (B:11:0x001e, B:14:0x0059, B:31:0x0090, B:32:0x00b7, B:34:0x00bd, B:36:0x003c, B:40:0x00ca, B:41:0x00cd, B:20:0x006a, B:23:0x0082, B:28:0x0078), top: B:6:0x0011, outer: #1, inners: #2 }] */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static synchronized void m8376(Context context) {
        WindowManager windowManager;
        Resources resources;
        Rect bounds;
        synchronized (kf.class) {
            int i = 2 % 2;
            int i2 = f2992;
            int i3 = i2 + 13;
            f2993 = i3 % 128;
            Object obj = null;
            try {
                if (i3 % 2 != 0) {
                    super.hashCode();
                    throw null;
                }
                if (context != null) {
                    int i4 = i2 + 77;
                    f2993 = i4 % 128;
                    if (i4 % 2 != 0) {
                        windowManager = (WindowManager) context.getSystemService(m8373("辽瓔䎫⨙諑ꟾ", (ExpandableListView.getPackedPositionForGroup(0) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 1L ? 0 : -1)) * 70).intern());
                        if (windowManager != null) {
                        }
                        resources = context.getResources();
                        if (resources != null) {
                            m8383(resources.getDisplayMetrics());
                            int i5 = 2 % 2;
                        }
                    } else {
                        windowManager = (WindowManager) context.getSystemService(m8373("辽瓔䎫⨙諑ꟾ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6).intern());
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        int i6 = f2993 + 5;
                        f2992 = i6 % 128;
                        try {
                            if (i6 % 2 == 0) {
                                bounds = windowManager.getCurrentWindowMetrics().getBounds();
                                int i7 = 89 / 0;
                                if (bounds != null) {
                                }
                            } else {
                                bounds = windowManager.getCurrentWindowMetrics().getBounds();
                            }
                            m8365(bounds.height(), bounds.width());
                            return;
                        } catch (Throwable th) {
                            m.m8535(m8382(null, KeyEvent.keyCodeFromString("") + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8373("똂\ue061ꏪ᳗Ṧ咣㵹氚㉜ȇꈸ⛖凤蜮ꕨႈ\uf75d粙㵹氚⏒揕⚙앁ꈸ⛖⊪澪┗ୱ빅\uf4fcꏪ᳗\uef9cꬉ辽瓔䎫⨙諑ꟾ귱ᛦꕨႈ监\ue153", View.combineMeasuredStates(0, 0) + 48).intern(), th);
                        }
                    }
                    resources = context.getResources();
                    if (resources != null) {
                    }
                }
            } catch (Throwable th2) {
                m.m8535(m8382(null, (ViewConfiguration.getJumpTapTimeout() >> 16) + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8382(null, View.getDefaultSize(0, 0) + 127, null, "\u0088\u0097\u0083\u0088\u008f\u008d\u0086\u008e\u0096\u008d\u008c\u0095\u008e\u008a\u0086\u0085\u008c\u0088\u0083\u0094\u0093\u0092\u0089\u0091\u008a\u0085\u0082\u008e\u0090\u008f\u0085\u0088\u0088\u0083\u0090\u008e\u008f\u0085\u008e\u008c\u008d\u008c\u008c\u008b").intern(), th2);
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8383(DisplayMetrics displayMetrics) {
        int i = 2 % 2;
        int i2 = f2993;
        int i3 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2992 = i3 % 128;
        int i4 = i3 % 2;
        if (displayMetrics != null) {
            int i5 = i2 + 89;
            f2992 = i5 % 128;
            int i6 = i5 % 2;
            m8365(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        int i7 = f2992 + 65;
        f2993 = i7 % 128;
        int i8 = i7 % 2;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static void m8365(int i, int i2) {
        int i3 = 2 % 2;
        if (i > 0) {
            int i4 = f2993;
            int i5 = i4 + 11;
            f2992 = i5 % 128;
            int i6 = i5 % 2;
            if (i2 > 0) {
                int i7 = i4 + 97;
                f2992 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    JSONObject m8361 = m8361();
                    m8361.put(m8373("ࡅ붌", (-16777215) - Color.rgb(0, 0, 0)).intern(), i2);
                    m8361.put(m8382(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0081").intern(), i);
                } catch (Throwable th) {
                    m.m8535(m8382(null, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8373("똂\ue061ꏪ᳗Ṧ咣풼ⴀ灒|㵹氚棋⚷씿轠ᛒ⻒밄䎠秨ꈿ莻䑳썔ꘕ", 26 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), th);
                }
            }
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8370(Context context, JSONObject jSONObject) {
        int i = 2 % 2;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(m8373("⥀줸凤蜮邅柙\u0ebe㗏", TextUtils.getCapsMode("", 0, 0) + 8).intern());
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            jSONObject.put(m8382(null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), null, "\u0084\u0092\u0096\u0096").intern(), memoryInfo.availMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            jSONObject.put(m8373("䙓侠力縣", 3 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern(), memoryInfo.threshold / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
            if (memoryInfo.lowMemory) {
                int i2 = f2993 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                f2992 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m8382(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u0098\u0089\u0096\u0096").intern(), memoryInfo.lowMemory);
                int i4 = f2993 + 15;
                f2992 = i4 % 128;
                int i5 = i4 % 2;
            }
            jSONObject.put(m8382(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0088\u0088\u0096\u0096").intern(), memoryInfo.totalMem / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable th) {
            m.m8527(m8382(null, 127 - (Process.myTid() >> 22), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), new StringBuilder().append(m8382(null, (KeyEvent.getMaxKeyCode() >> 16) + 127, null, "\u008e\u009a\u0083\u0090\u0092\u008a\u0099\u008e\u0093\u008c\u008d\u0096\u0083\u0096\u008e\u0090\u008f\u0085\u0088\u0088\u0083\u0090\u008e\u008c\u008d\u008c\u008c\u008b").intern()).append(th.getLocalizedMessage()).toString());
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8372(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2993 + 7;
        f2992 = i2 % 128;
        int i3 = i2 % 2;
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long currentTimeMillis = System.currentTimeMillis();
            long currentTimeMillis2 = System.currentTimeMillis();
            if (totalRxBytes != -1) {
                int i4 = f2993 + 33;
                f2992 = i4 % 128;
                int i5 = i4 % 2;
                long totalRxBytes2 = TrafficStats.getTotalRxBytes();
                jSONObject.put(m8382(null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), null, "\u0091\u008a\u0098\u008f").intern(), Math.round((totalRxBytes2 - totalRxBytes) * (1000.0f / (currentTimeMillis2 - currentTimeMillis))));
                jSONObject.put(m8382(null, (Process.myTid() >> 22) + 127, null, "\u0097\u008c\u0098\u008f").intern(), totalRxBytes2);
            }
        } catch (Throwable th) {
            m.m8535(m8382(null, 126 - TextUtils.indexOf((CharSequence) "", '0', 0), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8373("똂\ue061ꏪ᳗Ṧ咣㊦\ue817灒|㵹氚棋⚷\u0dceݮ࢙뤝馫멄颠邃ౡ⚭霛靿\uf688└\u0e60륿禍엘䨺萙썔ꘕ", 35 - KeyEvent.getDeadChar(0, 0)).intern(), th);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8380(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2992 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f2993 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8362 = m8362();
        if (m8362 != null) {
            int i4 = f2992 + 45;
            f2993 = i4 % 128;
            int i5 = i4 % 2;
            kj.m8425(jSONObject, m8362);
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static void m8366(Context context, JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(m8373("礶︈⏒뙩訵ﳰ凤蜮邅柙\u0ebe㗏", 13 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern());
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(m8373("㭣匏\u192d䀄썔ꘕ", 4 - TextUtils.indexOf((CharSequence) "", '0')).intern());
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            if (networkInfo != null) {
                int i2 = f2992 + 87;
                f2993 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m8382(null, ExpandableListView.getPackedPositionType(0L) + 127, null, "\u0088\u008a\u009b\u0096").intern(), networkInfo.getState());
                if (networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    int i4 = f2993 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
                    f2992 = i4 % 128;
                    int i5 = i4 % 2;
                    jSONObject.put(m8373("㫈쨺⾂\u173a趪逌", 5 - View.resolveSizeAndState(0, 0, 0)).intern(), networkInfo.getType());
                    jSONObject.put(m8373("㫈쨺⾂\u173a", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4).intern(), networkInfo.getTypeName());
                    jSONObject.put(m8373("㫈쨺\uf3d3\uea1e趪逌", 5 - Gravity.getAbsoluteGravity(0, 0)).intern(), networkInfo.getSubtype());
                    jSONObject.put(m8373("㫈쨺\uf3d3\uea1e", 4 - KeyEvent.normalizeMetaState(0)).intern(), networkInfo.getSubtypeName());
                    jSONObject.put(m8382(null, 128 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), null, "\u008d\u008f\u009b\u0096").intern(), telephonyManager.getNetworkOperator());
                    jSONObject.put(m8373("㫈쨺\u192d䀄", 3 - MotionEvent.axisFromString("")).intern(), telephonyManager.getNetworkOperatorName());
                    jSONObject.put(m8373("㫈쨺⸾튳", 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), telephonyManager.getNetworkCountryIso());
                    if (z) {
                        int i6 = f2993 + 109;
                        f2992 = i6 % 128;
                        int i7 = i6 % 2;
                        jSONObject.put(m8382(null, Color.argb(0, 0, 0, 0) + 127, null, "\u008d\u008a\u009b\u0096").intern(), telephonyManager.getSimOperator());
                        jSONObject.put(m8373("㫈쨺쮀\ue095", 4 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), telephonyManager.getSimOperatorName());
                    }
                }
            }
            int i8 = f2993 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f2992 = i8 % 128;
            if (i8 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            m.m8535(m8382(null, 128 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8382(null, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, "\u0088\u008f\u0083\u0084\u0083\u008e\u008d\u0088\u008e\u008d\u0095\u008f\u0085\u008e\u0083\u0089\u0085\u009b\u008d\u0096\u008e\u0090\u008f\u0085\u009c\u009c\u0092\u008e\u008c\u008d\u008c\u008c\u008b").intern(), th);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8379(Context context, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f2993 + 85;
        f2992 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (kh.m8391(context, m8373("馫멄겅焊\uffef⟴진\u16fe슸ࠪ㾠㎝ꔸ䲨䦱㱞\u192d䀄廟ꕟ崮꽿鹼\ue921纄厉Ǵ場銆瘇훰搋䜻悡蠏ᛶ", (Process.myTid() >> 22) + 36).intern())) {
                int i4 = f2992 + 75;
                f2993 = i4 % 128;
                int i5 = i4 % 2;
                WifiInfo connectionInfo = ((WifiManager) context.getSystemService(m8373("辽瓔綂憄", 3 - ExpandableListView.getPackedPositionChild(0L)).intern())).getConnectionInfo();
                jSONObject.put(m8373("䙺Ἐꅔ婁", 4 - View.resolveSize(0, 0)).intern(), connectionInfo.getSupplicantState());
                if (connectionInfo.getSupplicantState() == SupplicantState.COMPLETED) {
                    int i6 = f2992 + 97;
                    f2993 = i6 % 128;
                    int i7 = i6 % 2;
                    jSONObject.put(m8382(null, 175 - AndroidCharacter.getMirror('0'), null, "\u008a\u008c\u0095\u0098").intern(), connectionInfo.getRssi());
                    jSONObject.put(m8373("䙺Ἐ\uf3d3\uea1e", (ViewConfiguration.getScrollBarSize() >> 8) + 4).intern(), connectionInfo.getLinkSpeed());
                }
            }
        } catch (Throwable th) {
            m.m8535(m8382(null, 127 - TextUtils.getOffsetAfter("", 0), null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), m8373("똂\ue061ꏪ᳗Ṧ咣\ued40鋕ᥳ\udbe3ꕨႈ\uf75d粙띭㍳\uf3e9弿㵹氚毌⑩帐䗲慱᷈鴪唀밄䎠粳髷", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32).intern(), th);
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m8371(Intent intent) {
        int i;
        int i2 = 2 % 2;
        JSONObject jsonObjectInit = IronSourceNetworkBridge.jsonObjectInit();
        Object obj = null;
        if (intent != null) {
            try {
                int i3 = -1;
                jsonObjectInit.put(m8373("躷\ue6c5埦\udb8b", TextUtils.getOffsetAfter("", 0) + 4).intern(), intent.hasExtra(m8382(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u009c\u0083\u0090\u0090\u0099\u0089\u0091").intern()) ? intent.getIntExtra(m8382(null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, "\u009c\u0083\u0090\u0090\u0099\u0089\u0091").intern(), -1) : -1);
                if (intent.hasExtra(m8382(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u0089\u0083\u0084\u0083\u0089").intern())) {
                    int i4 = f2993 + 37;
                    f2992 = i4 % 128;
                    int i5 = i4 % 2;
                    i = intent.getIntExtra(m8382(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u0089\u0083\u0084\u0083\u0089").intern(), -1);
                } else {
                    i = -1;
                }
                if (intent.hasExtra(m8373("씿轠䉈陙썔ꘕ", 5 - KeyEvent.keyCodeFromString("")).intern())) {
                    int i6 = f2992 + 109;
                    f2993 = i6 % 128;
                    int i7 = i6 % 2;
                    i3 = intent.getIntExtra(m8373("씿轠䉈陙썔ꘕ", 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), -1);
                }
                jsonObjectInit.put(m8382(null, 127 - View.resolveSize(0, 0), null, "\u0084\u0089\u0088\u009b").intern(), Math.round((i * 100.0f) / i3));
            } catch (Throwable th) {
                m.m8527(m8382(null, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, null, "\u008a\u0089\u0085\u0088\u0087\u0083\u0086\u0085\u0084\u0083\u0082").intern(), new StringBuilder().append(m8373("똂\ue061ꏪ᳗Ṧ咣\ued40鋕ᥳ\udbe3ꕨႈ\ue051뺈鑄㉚쀅헓㠝䘑炞綻鴪唀፸뎄퓴薷\uf6e2즱䋓笩\ue527껒僞忤ငㆿ", TextUtils.indexOf("", "", 0, 0) + 37).intern()).append(th.getLocalizedMessage()).toString());
            }
        }
        m8367(jsonObjectInit);
        int i8 = f2992 + 71;
        f2993 = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static JSONObject m8362() {
        int i = 2 % 2;
        int i2 = f2992 + 3;
        f2993 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m8363 = m8363();
        if (i3 == 0) {
            return kj.m8417(m8363);
        }
        kj.m8417(m8363);
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static synchronized JSONObject m8363() {
        JSONObject jSONObject;
        synchronized (kf.class) {
            int i = 2 % 2;
            int i2 = f2992;
            int i3 = i2 + 99;
            f2993 = i3 % 128;
            int i4 = i3 % 2;
            jSONObject = f3003;
            int i5 = i2 + 47;
            f2993 = i5 % 128;
            int i6 = i5 % 2;
        }
        return jSONObject;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static synchronized void m8367(JSONObject jSONObject) {
        synchronized (kf.class) {
            int i = 2 % 2;
            int i2 = f2993;
            int i3 = i2 + 63;
            f2992 = i3 % 128;
            if (i3 % 2 == 0) {
                f3003 = jSONObject;
                Object obj = null;
                super.hashCode();
                throw null;
            }
            f3003 = jSONObject;
            int i4 = i2 + 47;
            f2992 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m8373(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (o.f3094) {
            char[] cArr3 = new char[cArr2.length];
            o.f3095 = 0;
            char[] cArr4 = new char[2];
            while (o.f3095 < cArr2.length) {
                cArr4[0] = cArr2[o.f3095];
                cArr4[1] = cArr2[o.f3095 + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    char c = cArr4[1];
                    char c2 = cArr4[0];
                    char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + f3000)) ^ ((c2 >>> 5) + f2997)));
                    cArr4[1] = c3;
                    cArr4[0] = (char) (c2 - (((c3 >>> 5) + f2999) ^ ((c3 + i2) ^ ((c3 << 4) + f3001))));
                    i2 -= 40503;
                }
                cArr3[o.f3095] = cArr4[0];
                cArr3[o.f3095 + 1] = cArr4[1];
                o.f3095 += 2;
            }
            str2 = new String(cArr3, 0, i);
        }
        return str2;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m8382(String str, int i, int[] iArr, String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (k.f2956) {
            char[] cArr3 = f2998;
            int i2 = f2996;
            if (f2995) {
                int length = bArr2.length;
                k.f2955 = length;
                char[] cArr4 = new char[length];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr4[k.f2957] = (char) (cArr3[bArr2[(k.f2955 - 1) - k.f2957] + i] - i2);
                    k.f2957++;
                }
                return new String(cArr4);
            }
            if (f2994) {
                int length2 = cArr2.length;
                k.f2955 = length2;
                char[] cArr5 = new char[length2];
                k.f2957 = 0;
                while (k.f2957 < k.f2955) {
                    cArr5[k.f2957] = (char) (cArr3[cArr2[(k.f2955 - 1) - k.f2957] - i] - i2);
                    k.f2957++;
                }
                return new String(cArr5);
            }
            int length3 = iArr.length;
            k.f2955 = length3;
            char[] cArr6 = new char[length3];
            k.f2957 = 0;
            while (k.f2957 < k.f2955) {
                cArr6[k.f2957] = (char) (cArr3[iArr[(k.f2955 - 1) - k.f2957] - i] - i2);
                k.f2957++;
            }
            return new String(cArr6);
        }
    }
}
