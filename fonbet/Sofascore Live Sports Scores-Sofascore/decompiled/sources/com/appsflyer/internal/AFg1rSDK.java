package com.appsflyer.internal;

import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFg1jSDK;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.yhk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFg1rSDK {
    private final LinkedHashMap<String, Object> d;
    public static final Object unregisterClient = new Object() { // from class: com.appsflyer.internal.AFg1rSDK.4
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "null";
        }
    };
    private static final Double AFLogger = Double.valueOf(-0.0d);

    private AFg1rSDK(Object obj) throws AFg1oSDK {
        try {
            Map map = AFb1ySDK.getInstance;
            Object obj2 = map.get(-409063895);
            if (obj2 == null) {
                obj2 = ((Class) AFb1ySDK.AFLogger(36 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 357, (char) TextUtils.getOffsetAfter("", 0))).getDeclaredMethod("AFLogger", null);
                map.put(-409063895, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFg1rSDK) {
                this.d = ((AFg1rSDK) invoke).d;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = map.get(330201076);
            if (obj3 == null) {
                obj3 = ((Class) AFb1ySDK.AFLogger(35 - TextUtils.indexOf((CharSequence) "", '0'), 285 - View.getDefaultSize(0, 0), (char) View.MeasureSpec.getMode(0))).getDeclaredMethod("AFKeystoreWrapper", Object.class, String.class);
                map.put(330201076, obj3);
            }
            throw ((Throwable) ((Method) obj3).invoke(null, objArr));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static String AFLogger(Number number) throws AFg1oSDK {
        if (number == null) {
            throw new AFg1oSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Map map = AFb1ySDK.getInstance;
            Object obj = map.get(576263871);
            if (obj == null) {
                obj = ((Class) AFb1ySDK.AFLogger(TextUtils.indexOf("", "") + 36, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 286, (char) View.MeasureSpec.getMode(0))).getDeclaredMethod("AFLogger", Double.TYPE);
                map.put(576263871, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).getClass();
            if (number.equals(AFLogger)) {
                return "-0";
            }
            long longValue = number.longValue();
            return doubleValue == ((double) longValue) ? Long.toString(longValue) : number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object registerClient(Object obj) {
        if (obj == null) {
            return unregisterClient;
        }
        if (((Class) AFb1ySDK.AFLogger(37 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).isInstance(obj)) {
            return obj;
        }
        if (obj instanceof AFg1rSDK) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Map map = AFb1ySDK.getInstance;
                Object obj2 = map.get(-396037635);
                if (obj2 == null) {
                    obj2 = ((Class) AFb1ySDK.AFLogger((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 36, TextUtils.lastIndexOf("", '0') + Sdk.SDKError.Reason.MRAID_UNRECOGNIZED_COMMAND_VALUE, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1))).getDeclaredConstructor(String.class);
                    map.put(-396037635, obj2);
                }
                obj = ((Constructor) obj2).newInstance(objArr);
                return obj;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (obj instanceof JSONObject) {
            return new AFg1rSDK(obj.toString());
        }
        if (obj.equals(unregisterClient)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Map map2 = AFb1ySDK.getInstance;
                Object obj3 = map2.get(728403638);
                if (obj3 == null) {
                    obj3 = ((Class) AFb1ySDK.AFLogger(View.combineMeasuredStates(0, 0) + 37, 320 - ImageFormat.getBitsPerPixel(0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getDeclaredConstructor(Collection.class);
                    map2.put(728403638, obj3);
                }
                return ((Constructor) obj3).newInstance(objArr2);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        if (obj.getClass().isArray()) {
            try {
                Object[] objArr3 = {obj};
                Map map3 = AFb1ySDK.getInstance;
                Object obj4 = map3.get(-2100551253);
                if (obj4 == null) {
                    obj4 = ((Class) AFb1ySDK.AFLogger((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36, 321 - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getDeclaredConstructor(Object.class);
                    map3.put(-2100551253, obj4);
                }
                return ((Constructor) obj4).newInstance(objArr3);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 != null) {
                    throw cause3;
                }
                throw th3;
            }
        }
        if (obj instanceof Map) {
            return new AFg1rSDK((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
        return null;
    }

    public final void d(AFg1jSDK aFg1jSDK) throws AFg1oSDK {
        aFg1jSDK.registerClient(AFg1jSDK.AFa1vSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.d.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new AFg1oSDK("Names must be non-null");
            }
            aFg1jSDK.registerClient();
            aFg1jSDK.AFKeystoreWrapper(key);
            aFg1jSDK.d(entry.getValue());
        }
        aFg1jSDK.d(AFg1jSDK.AFa1vSDK.EMPTY_OBJECT, AFg1jSDK.AFa1vSDK.NONEMPTY_OBJECT, "}");
    }

    public final String toString() {
        try {
            AFg1jSDK aFg1jSDK = new AFg1jSDK();
            d(aFg1jSDK);
            return aFg1jSDK.toString();
        } catch (AFg1oSDK unused) {
            return null;
        }
    }

    public final AFg1rSDK unregisterClient(String str, Object obj) throws AFg1oSDK {
        if (obj == null) {
            this.d.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Map map = AFb1ySDK.getInstance;
                Object obj2 = map.get(576263871);
                if (obj2 == null) {
                    obj2 = ((Class) AFb1ySDK.AFLogger((ViewConfiguration.getJumpTapTimeout() >> 16) + 36, 285 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("AFLogger", Double.TYPE);
                    map.put(576263871, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).getClass();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.d;
        if (str == null) {
            throw new AFg1oSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public AFg1rSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.d.put(str, registerClient(entry.getValue()));
            } else {
                yhk.s("key == null");
                throw null;
            }
        }
    }

    public AFg1rSDK() {
        this.d = new LinkedHashMap<>();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFg1rSDK(String str) throws AFg1oSDK {
        this(((Constructor) r2).newInstance(r7));
        try {
            Object[] objArr = {str};
            Map map = AFb1ySDK.getInstance;
            Object obj = map.get(384284092);
            if (obj == null) {
                obj = ((Class) AFb1ySDK.AFLogger((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35, (ViewConfiguration.getFadingEdgeLength() >> 16) + 358, (char) (ViewConfiguration.getScrollBarSize() >> 8))).getDeclaredConstructor(String.class);
                map.put(384284092, obj);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
