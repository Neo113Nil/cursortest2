package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.internal.AFa1lSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class AFa1jSDK {
    public static final Object AFAdRevenueData = new Object() { // from class: com.appsflyer.internal.AFa1jSDK.1
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return AbstractJsonLexerKt.NULL;
        }
    };
    private static final Double getRevenue = Double.valueOf(-0.0d);
    final LinkedHashMap<String, Object> getMediationNetwork;

    public AFa1jSDK() {
        this.getMediationNetwork = new LinkedHashMap<>();
    }

    public AFa1jSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("key == null");
            }
            this.getMediationNetwork.put(str, getCurrencyIso4217Code(entry.getValue()));
        }
    }

    private AFa1jSDK(Object obj) throws AFa1hSDK {
        try {
            Object obj2 = AFa1vSDK.AFLogger.get(18605854);
            if (obj2 == null) {
                obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 200 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 37)).getDeclaredMethod("getMonetizationNetwork", null);
                AFa1vSDK.AFLogger.put(18605854, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFa1jSDK) {
                this.getMediationNetwork = ((AFa1jSDK) invoke).getMediationNetwork;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = AFa1vSDK.AFLogger.get(231349088);
            if (obj3 == null) {
                obj3 = ((Class) AFa1vSDK.AFAdRevenueData((char) (60826 - View.MeasureSpec.getMode(0)), KeyEvent.keyCodeFromString("") + 126, (KeyEvent.getMaxKeyCode() >> 16) + 37)).getDeclaredMethod("getMonetizationNetwork", Object.class, String.class);
                AFa1vSDK.AFLogger.put(231349088, obj3);
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private AFa1jSDK(String str) throws AFa1hSDK {
        this(((Constructor) r0).newInstance(r6));
        try {
            Object[] objArr = {str};
            Object obj = AFa1vSDK.AFLogger.get(-1900847977);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.AFAdRevenueData((char) View.resolveSizeAndState(0, 0, 0), (-16777016) - Color.rgb(0, 0, 0), Color.green(0) + 37)).getDeclaredConstructor(String.class);
                AFa1vSDK.AFLogger.put(-1900847977, obj);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static String getMediationNetwork(Number number) throws AFa1hSDK {
        if (number == null) {
            throw new AFa1hSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Object obj = AFa1vSDK.AFLogger.get(-595315585);
            if (obj == null) {
                obj = ((Class) AFa1vSDK.AFAdRevenueData((char) (View.resolveSize(0, 0) + 60826), 125 - MotionEvent.axisFromString(""), 37 - Color.alpha(0))).getDeclaredMethod("AFAdRevenueData", Double.TYPE);
                AFa1vSDK.AFLogger.put(-595315585, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).doubleValue();
            if (number.equals(getRevenue)) {
                return "-0";
            }
            long longValue = number.longValue();
            if (doubleValue == longValue) {
                return Long.toString(longValue);
            }
            return number.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getCurrencyIso4217Code(Object obj) {
        if (obj == null) {
            return AFAdRevenueData;
        }
        if (((Class) AFa1vSDK.AFAdRevenueData((char) (MotionEvent.axisFromString("") + 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + Opcodes.IF_ICMPGT, TextUtils.getCapsMode("", 0, 0) + 37)).isInstance(obj) || (obj instanceof AFa1jSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Object obj2 = AFa1vSDK.AFLogger.get(2144819140);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + Opcodes.IF_ICMPGT, TextUtils.getTrimmedLength("") + 37)).getDeclaredConstructor(String.class);
                    AFa1vSDK.AFLogger.put(2144819140, obj2);
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
            return new AFa1jSDK(obj.toString());
        }
        if (obj.equals(AFAdRevenueData)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Object obj3 = AFa1vSDK.AFLogger.get(1410775293);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1vSDK.AFAdRevenueData((char) TextUtils.getTrimmedLength(""), 162 - Process.getGidForName(""), 37 - (Process.myTid() >> 22))).getDeclaredConstructor(Collection.class);
                    AFa1vSDK.AFLogger.put(1410775293, obj3);
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
                Object obj4 = AFa1vSDK.AFLogger.get(440305522);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1vSDK.AFAdRevenueData((char) (KeyEvent.getMaxKeyCode() >> 16), 163 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), Process.getGidForName("") + 38)).getDeclaredConstructor(Object.class);
                    AFa1vSDK.AFLogger.put(440305522, obj4);
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
            return new AFa1jSDK((Map) obj);
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

    public final AFa1jSDK getMonetizationNetwork(String str, Object obj) throws AFa1hSDK {
        if (obj == null) {
            this.getMediationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Object obj2 = AFa1vSDK.AFLogger.get(-595315585);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1vSDK.AFAdRevenueData((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 60826), 126 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37)).getMethod("AFAdRevenueData", Double.TYPE);
                    AFa1vSDK.AFLogger.put(-595315585, obj2);
                }
                ((Double) ((Method) obj2).invoke(null, objArr)).doubleValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        LinkedHashMap<String, Object> linkedHashMap = this.getMediationNetwork;
        if (str == null) {
            throw new AFa1hSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    static String getRevenue(String str) throws AFa1hSDK {
        if (str != null) {
            return str;
        }
        throw new AFa1hSDK("Names must be non-null");
    }

    public final String toString() {
        try {
            AFa1lSDK aFa1lSDK = new AFa1lSDK();
            getCurrencyIso4217Code(aFa1lSDK);
            return aFa1lSDK.toString();
        } catch (AFa1hSDK unused) {
            return null;
        }
    }

    final void getCurrencyIso4217Code(AFa1lSDK aFa1lSDK) throws AFa1hSDK {
        aFa1lSDK.getRevenue(AFa1lSDK.AFa1vSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMediationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new AFa1hSDK("Names must be non-null");
            }
            aFa1lSDK.getMediationNetwork();
            aFa1lSDK.getCurrencyIso4217Code(key);
            aFa1lSDK.getCurrencyIso4217Code(entry.getValue());
        }
        aFa1lSDK.getCurrencyIso4217Code(AFa1lSDK.AFa1vSDK.EMPTY_OBJECT, AFa1lSDK.AFa1vSDK.NONEMPTY_OBJECT, "}");
    }
}
