package com.ironsource.adqualitysdk.sdk.i;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ia {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static boolean f2456 = true;

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f2457 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static boolean f2458 = true;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static int f2459 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2460 = 242;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char f2461 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f2462 = {286, 335, 300, 276, 302, 342, 359, 354, 304, 334, 252, 352, 358, 365, 337, 341, 350, 339, 357, 308, 343};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f2463 = 0;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2464 = -1464328076;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final List<String> f2466;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private final int f2469;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final Set<Object> f2467 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final Set<String> f2465 = new HashSet();

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int f2468 = 0;

    public ia(List<String> list, int i) {
        this.f2466 = list;
        this.f2469 = i;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m7917(Object obj) {
        int i = 2 % 2;
        int i2 = f2457 + 101;
        f2459 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            m7903(obj);
            super.hashCode();
            throw null;
        }
        Object m7903 = m7903(obj);
        if (m7903 == null) {
            return m7914((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 55186), "\u0000\u0000\u0000\u0000", "篁띸錌\uf7d7", "踙⇥윁ᗺ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
        }
        if (m7903 instanceof String) {
            return m7908((String) m7903);
        }
        if ((m7903 instanceof Number) || (m7903 instanceof Boolean)) {
            String valueOf = String.valueOf(m7903);
            int i3 = f2459 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f2457 = i3 % 128;
            if (i3 % 2 == 0) {
                return valueOf;
            }
            super.hashCode();
            throw null;
        }
        if (!(!(m7903 instanceof Character))) {
            int i4 = f2457 + 69;
            f2459 = i4 % 128;
            int i5 = i4 % 2;
            return m7912(String.valueOf(m7903));
        }
        if (m7903 instanceof JSONArray) {
            return m7905((Collection<?>) kj.m8411((JSONArray) m7903));
        }
        if (!(m7903 instanceof JSONObject)) {
            return m7903 instanceof Map ? m7906((Map<?, ?>) m7903) : m7903 instanceof Collection ? m7905((Collection<?>) m7903) : !(m7903.getClass().isArray() ^ true) ? m7905((Collection<?>) m7902(m7903)) : m7903 instanceof Bundle ? m7915((Bundle) m7903) : m7903 instanceof SharedPreferences ? m7904((SharedPreferences) m7903) : m7901(m7903) ? m7916(m7903) : m7912(new StringBuilder().append(m7903.getClass().getSimpleName()).append(m7914((char) (TextUtils.lastIndexOf("", '0', 0) + 62449), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", TextUtils.lastIndexOf("", '0', 0) + 1440875234).intern()).append(Integer.toHexString(m7903.hashCode())).toString());
        }
        int i6 = f2459 + 83;
        f2457 = i6 % 128;
        int i7 = i6 % 2;
        return m7906((Map<?, ?>) kj.m8413((JSONObject) m7903));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m7916(Object obj) {
        int i;
        boolean z;
        int i2 = 2;
        int i3 = 2 % 2;
        if (this.f2468 > this.f2469 || this.f2467.contains(obj)) {
            return m7912(new StringBuilder().append(obj.getClass().getSimpleName()).append(m7914((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 62447), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", 1440875233 - TextUtils.indexOf("", "")).intern()).append(Integer.toHexString(obj.hashCode())).toString());
        }
        this.f2467.add(obj);
        boolean z2 = true;
        this.f2468++;
        char c = '0';
        StringBuilder sb = new StringBuilder(m7914((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), "\u0000\u0000\u0000\u0000", "흠阡\u0083틘", "竉솒\uf21a鶏碷⢺\ue7aa\ue30f႙ぢ", AndroidCharacter.getMirror('0') - '0').intern());
        sb.append(m7912(obj.getClass().getSimpleName()));
        String m7911 = m7911(obj);
        if (!TextUtils.isEmpty(m7911)) {
            sb.append(m7914((char) (52799 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "穷\u13fe䁑ᓎ", "藭ಔ䩩彛墋\ue6c5혦씚\ueaa6莽㘧\ue7c5洶", View.MeasureSpec.getMode(0) + 1360264826).intern()).append(m7908(m7911));
        }
        try {
            Field[] m7910 = m7910(obj.getClass());
            int length = m7910.length;
            int i4 = 0;
            while (i4 < length) {
                Field field = m7910[i4];
                if (!m7907(field)) {
                    int i5 = f2457 + 77;
                    f2459 = i5 % 128;
                    int i6 = i5 % i2;
                    field.setAccessible(z2);
                    Object m7903 = m7903(field.get(obj));
                    if (!m7909(m7903)) {
                        i = i2;
                        z = z2;
                        try {
                            sb.append(m7914((char) (23710 - (ViewConfiguration.getJumpTapTimeout() >> 16)), "\u0000\u0000\u0000\u0000", "㙝ね麖\u1f5c", "ﭮዜ", KeyEvent.keyCodeFromString("")).intern()).append(field.getName()).append(m7914((char) (24068 - TextUtils.indexOf("", c, 0, 0)), "\u0000\u0000\u0000\u0000", "େ뒿ղ䍞", "ꏺ軁", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()).append(m7917(m7903));
                            i4++;
                            i2 = i;
                            z2 = z;
                            c = '0';
                        } catch (Throwable unused) {
                        }
                    }
                }
                i = i2;
                z = z2;
                i4++;
                i2 = i;
                z2 = z;
                c = '0';
            }
        } catch (Throwable unused2) {
        }
        this.f2468--;
        sb.append(m7914((char) (MotionEvent.axisFromString("") + 45577), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", (-1492151250) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
        String obj2 = sb.toString();
        int i7 = f2457 + 49;
        f2459 = i7 % 128;
        if (i7 % 2 != 0) {
            return obj2;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m7905(Collection<?> collection) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(m7914((char) (Process.getGidForName("") + 29307), "\u0000\u0000\u0000\u0000", "䃲坻章祲", "闅", (-531137728) - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        int i2 = f2459 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f2457 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 5 / 5;
        }
        boolean z = true;
        for (Object obj : collection) {
            int i4 = f2459 + 67;
            f2457 = i4 % 128;
            int i5 = i4 % 2;
            if (!m7909(obj)) {
                int i6 = f2457 + 83;
                f2459 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw null;
                }
                if (!z) {
                    sb.append(m7913(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0081").intern());
                }
                sb.append(m7917(obj));
                z = false;
            }
        }
        sb.append(m7913(null, (ViewConfiguration.getTouchSlop() >> 8) + 127, null, "\u0082").intern());
        return sb.toString();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m7906(Map<?, ?> map) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder(m7914((char) (TextUtils.indexOf((CharSequence) "", '0') + 53931), "\u0000\u0000\u0000\u0000", "\udd03㵡ꨳ껒", "画", ExpandableListView.getPackedPositionChild(0L) + 859660766).intern());
        int i2 = f2457 + 65;
        f2459 = i2 % 128;
        int i3 = i2 % 2;
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!m7909(entry.getValue())) {
                if (!z) {
                    int i4 = f2459 + 7;
                    f2457 = i4 % 128;
                    sb.append(m7913(null, i4 % 2 != 0 ? 15 % Color.blue(1) : Color.blue(0) + 127, null, "\u0081").intern());
                }
                sb.append(m7912(String.valueOf(entry.getKey()))).append(m7913(null, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, null, "\u0083").intern()).append(m7917(entry.getValue()));
                z = false;
            }
        }
        sb.append(m7914((char) (45575 - TextUtils.lastIndexOf("", '0', 0)), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", Process.getGidForName("") - 1492151249).intern());
        return sb.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private String m7908(String str) {
        int i = 2 % 2;
        int i2 = f2459 + 77;
        f2457 = i2 % 128;
        if (i2 % 2 == 0 ? str.length() > 30 : str.length() > 15) {
            if (!this.f2465.contains(str)) {
                this.f2465.add(str);
            } else {
                int i3 = f2459 + 81;
                f2457 = i3 % 128;
                return (i3 % 2 != 0 ? m7913(null, 76 / (ViewConfiguration.getScrollDefaultDelay() - 21), null, "\u0084\u0089\u0088\u0087\u0086\u0085\u0084") : m7913(null, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, "\u0084\u0089\u0088\u0087\u0086\u0085\u0084")).intern();
            }
        }
        return m7912(str);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7912(String str) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7913(null, MotionEvent.axisFromString("") + 128, null, "\u0084").intern()).append(str.replace(m7914((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 63935), "\u0000\u0000\u0000\u0000", "ኢ\uecb3뼩藹", "鳡", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 703378194).intern(), m7913(null, TextUtils.getCapsMode("", 0, 0) + 127, null, "\u008a\u008a").intern()).replace(m7913(null, 126 - TextUtils.indexOf((CharSequence) "", '0'), null, "\u0084").intern(), m7913(null, Drawable.resolveOpacity(0, 0) + 127, null, "\u0084\u008a").intern()).replace(m7913(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u008b").intern(), m7913(null, (Process.myPid() >> 22) + 127, null, "\u008c\u008a").intern()).replace(m7914((char) (36240 - ExpandableListView.getPackedPositionGroup(0L)), "\u0000\u0000\u0000\u0000", "髲說邭ﶍ", "쩛", (-1376161894) - TextUtils.indexOf("", "")).intern(), m7914((char) (61228 - MotionEvent.axisFromString("")), "\u0000\u0000\u0000\u0000", "爛鄱ⷭ迯", "ᔷ铃", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern()).replace(m7914((char) (40413 - ImageFormat.getBitsPerPixel(0)), "\u0000\u0000\u0000\u0000", "魔眚\udea8\udf9d", "\uf697", View.resolveSizeAndState(0, 0, 0) - 1468589413).intern(), m7913(null, 127 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), null, "\u008d\u008a").intern())).append(m7913(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0084").intern()).toString();
        int i2 = f2459 + 41;
        f2457 = i2 % 128;
        if (i2 % 2 == 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String m7915(Bundle bundle) {
        int i = 2 % 2;
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        int i2 = f2459 + 35;
        f2457 = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                break;
            }
            int i4 = f2459 + 79;
            f2457 = i4 % 128;
            int i5 = i4 % 2;
            String next = it.next();
            hashMap.put(next, bundle.get(next));
            i2 = f2457 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2459 = i2 % 128;
        }
        Object obj = null;
        String obj2 = new StringBuilder().append(m7913(null, 127 - TextUtils.indexOf("", "", 0, 0), null, "\u0083\u0084\u0092\u008d\u0092\u0086\u008f\u0084\u0081\u0084\u0095\u0091\u0086\u008c\u0087\u0094\u0084\u0083\u0084\u0093\u0093\u0092\u0091\u0090\u008f\u0084\u008e").intern()).append(m7906((Map<?, ?>) hashMap)).append(m7914((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45576), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", (ViewConfiguration.getScrollBarSize() >> 8) - 1492151250).intern()).toString();
        int i6 = f2459 + 103;
        f2457 = i6 % 128;
        if (i6 % 2 == 0) {
            return obj2;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private String m7904(SharedPreferences sharedPreferences) {
        int i = 2 % 2;
        String obj = new StringBuilder().append(m7914((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), "\u0000\u0000\u0000\u0000", "᭥蔦슬\ued8d", "ᏼ音䥮雥纽\u1f16\udbc7䞓豢ꄡ㠕ᆧ貺Ӫ蹒觳兰胵ᤢ䫳鱕ఈ薇ᒹ\u0e64ﵺ읬甽\ue9dd\uf405펕\udb21멷\ue22f･㺿캡몭", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern()).append(m7906((Map<?, ?>) sharedPreferences.getAll())).append(m7914((char) (45575 - TextUtils.lastIndexOf("", '0')), "\u0000\u0000\u0000\u0000", "⺿ྔࢧ쎲", "\ue6a4", ((Process.getThreadPriority(0) + 20) >> 6) - 1492151250).intern()).toString();
        int i2 = f2457 + 49;
        f2459 = i2 % 128;
        if (i2 % 2 != 0) {
            return obj;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Object m7903(Object obj) {
        int i = 2 % 2;
        int i2 = f2457;
        int i3 = i2 + 25;
        f2459 = i3 % 128;
        int i4 = i3 % 2;
        if (!(obj instanceof WeakReference)) {
            return obj instanceof AtomicReference ? ((AtomicReference) obj).get() : obj;
        }
        int i5 = i2 + 113;
        f2459 = i5 % 128;
        if (i5 % 2 != 0) {
            return ((WeakReference) obj).get();
        }
        int i6 = 13 / 0;
        return ((WeakReference) obj).get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.ia.f2459 + 77;
        com.ironsource.adqualitysdk.sdk.i.ia.f2457 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L22;
     */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7909(Object obj) {
        int i = 2 % 2;
        if (obj == null) {
            return true;
        }
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue() == 0.0d;
        }
        if (!(obj instanceof Boolean)) {
            if (!(obj instanceof Collection)) {
                Object obj2 = null;
                if (obj instanceof Map) {
                    int i2 = f2459 + 97;
                    f2457 = i2 % 128;
                    if (i2 % 2 == 0) {
                        boolean isEmpty = ((Map) obj).isEmpty();
                        int i3 = f2457 + 61;
                        f2459 = i3 % 128;
                        int i4 = i3 % 2;
                        return isEmpty;
                    }
                    ((Map) obj).isEmpty();
                    super.hashCode();
                    throw null;
                }
                if (!obj.getClass().isArray()) {
                    return false;
                }
                int i5 = f2457 + 3;
                f2459 = i5 % 128;
                if (i5 % 2 != 0) {
                    return Array.getLength(obj) == 0;
                }
                Array.getLength(obj);
                throw null;
            }
            int i6 = f2459 + 85;
            f2457 = i6 % 128;
            int i7 = i6 % 2;
            return ((Collection) obj).isEmpty();
        }
        int i8 = f2457 + 23;
        f2459 = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 15 / 0;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7911(Object obj) {
        int i = 2 % 2;
        int i2 = f2457 + 43;
        f2459 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                String obj2 = obj.toString();
                if (TextUtils.isEmpty(obj2)) {
                    return null;
                }
                String hexString = Integer.toHexString(obj.hashCode());
                if (obj2.equals(new StringBuilder().append(obj.getClass().getName()).append(m7914((char) (62448 - (ViewConfiguration.getEdgeSlop() >> 16)), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", View.getDefaultSize(0, 0) + 1440875233).intern()).append(hexString).toString()) || obj2.equals(new StringBuilder().append(obj.getClass().getSimpleName()).append(m7914((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 62448), "\u0000\u0000\u0000\u0000", "\ue131\ue202\uf055쫳", "슿", TextUtils.indexOf("", "", 0, 0) + 1440875233).intern()).append(hexString).toString())) {
                    return null;
                }
                int i3 = f2459 + 85;
                f2457 = i3 % 128;
                int i4 = i3 % 2;
                return obj2;
            }
            TextUtils.isEmpty(obj.toString());
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private boolean m7901(Object obj) {
        int i = 2 % 2;
        if (obj != null) {
            int i2 = f2457 + 61;
            f2459 = i2 % 128;
            int i3 = i2 % 2;
            if (kk.m8432(obj.getClass(), this.f2466)) {
                int i4 = f2459 + 65;
                f2457 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        int i6 = f2457 + 101;
        f2459 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if (r6 != java.lang.String.class) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
    
        r1 = r1 + 93;
        com.ironsource.adqualitysdk.sdk.i.ia.f2457 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0042, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if ((!java.lang.reflect.Modifier.isStatic(r6.getModifiers())) != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r6.getModifiers()) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        r6 = r6.getType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        if ((!r6.isPrimitive()) == true) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.i.ia.f2459;
        r4 = r1 + 83;
        com.ironsource.adqualitysdk.sdk.i.ia.f2457 = r4 % 128;
        r4 = r4 % 2;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m7907(Field field) {
        int i = 2 % 2;
        int i2 = f2459 + 25;
        f2457 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 15 / 0;
        }
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private Field[] m7910(Class<?> cls) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = f2457 + 17;
        f2459 = i2 % 128;
        int i3 = i2 % 2;
        while (cls != null) {
            int i4 = f2457 + 83;
            f2459 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 51 / 0;
                if (!kk.m8432(cls, this.f2466)) {
                    break;
                }
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            } else {
                if (!kk.m8432(cls, this.f2466)) {
                    break;
                }
                arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
                cls = cls.getSuperclass();
            }
        }
        return (Field[]) arrayList.toArray(new Field[0]);
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static List<Object> m7902(Object obj) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        int i2 = f2459 + 17;
        f2457 = i2 % 128;
        int i3 = i2 % 2;
        for (int i4 = 0; i4 < Array.getLength(obj); i4++) {
            int i5 = f2459 + 61;
            f2457 = i5 % 128;
            int i6 = i5 % 2;
            arrayList.add(Array.get(obj, i4));
        }
        int i7 = f2457 + 3;
        f2459 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 45 / 0;
        }
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7914(char c, String str, String str2, String str3, int i) {
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
                cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2463) ^ f2464) ^ f2461);
                f.f2041++;
            }
            str4 = new String(cArr9);
        }
        return str4;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7913(String str, int i, int[] iArr, String str2) {
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
            char[] cArr3 = f2462;
            int i2 = f2460;
            if (f2458) {
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
            if (f2456) {
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
