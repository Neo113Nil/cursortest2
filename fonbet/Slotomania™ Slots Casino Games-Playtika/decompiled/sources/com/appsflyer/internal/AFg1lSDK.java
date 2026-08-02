package com.appsflyer.internal;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.appsflyer.internal.AFg1iSDK;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AFg1lSDK {
    public static final Object getCurrencyIso4217Code = new Object() { // from class: com.appsflyer.internal.AFg1lSDK.2
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final int hashCode() {
            return Objects.hashCode(null);
        }

        public final String toString() {
            return AbstractJsonLexerKt.NULL;
        }
    };
    private static final Double getMediationNetwork = Double.valueOf(-0.0d);
    private final LinkedHashMap<String, Object> getMonetizationNetwork;

    public AFg1lSDK() {
        this.getMonetizationNetwork = new LinkedHashMap<>();
    }

    public AFg1lSDK(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("key == null");
            }
            this.getMonetizationNetwork.put(str, getMediationNetwork(entry.getValue()));
        }
    }

    private AFg1lSDK(Object obj) throws AFg1jSDK {
        try {
            Object obj2 = AFa1gSDK.e.get(1136284116);
            if (obj2 == null) {
                obj2 = ((Class) AFa1gSDK.getMonetizationNetwork(36 - ExpandableListView.getPackedPositionChild(0L), 360 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (65339 - (Process.myPid() >> 22)))).getDeclaredMethod("getCurrencyIso4217Code", null);
                AFa1gSDK.e.put(1136284116, obj2);
            }
            Object invoke = ((Method) obj2).invoke(obj, null);
            if (invoke instanceof AFg1lSDK) {
                this.getMonetizationNetwork = ((AFg1lSDK) invoke).getMonetizationNetwork;
                return;
            }
            Object[] objArr = {invoke, "AFJsonObject"};
            Object obj3 = AFa1gSDK.e.get(1949727992);
            if (obj3 == null) {
                obj3 = ((Class) AFa1gSDK.getMonetizationNetwork(View.MeasureSpec.makeMeasureSpec(0, 0) + 37, 286 - (Process.myTid() >> 22), (char) ('0' - AndroidCharacter.getMirror('0')))).getDeclaredMethod("getRevenue", Object.class, String.class);
                AFa1gSDK.e.put(1949727992, obj3);
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
    private AFg1lSDK(String str) throws AFg1jSDK {
        this(((Constructor) r0).newInstance(r7));
        try {
            Object[] objArr = {str};
            Object obj = AFa1gSDK.e.get(770652301);
            if (obj == null) {
                obj = ((Class) AFa1gSDK.getMonetizationNetwork(ExpandableListView.getPackedPositionType(0L) + 37, 359 - ExpandableListView.getPackedPositionChild(0L), (char) (Gravity.getAbsoluteGravity(0, 0) + 65339))).getDeclaredConstructor(String.class);
                AFa1gSDK.e.put(770652301, obj);
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    static String getRevenue(Number number) throws AFg1jSDK {
        if (number == null) {
            throw new AFg1jSDK("Number must be non-null");
        }
        double doubleValue = number.doubleValue();
        try {
            Object[] objArr = {Double.valueOf(doubleValue)};
            Object obj = AFa1gSDK.e.get(1310360324);
            if (obj == null) {
                obj = ((Class) AFa1gSDK.getMonetizationNetwork(38 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 286 - Drawable.resolveOpacity(0, 0), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1))).getDeclaredMethod("getRevenue", Double.TYPE);
                AFa1gSDK.e.put(1310360324, obj);
            }
            ((Double) ((Method) obj).invoke(null, objArr)).doubleValue();
            if (number.equals(getMediationNetwork)) {
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

    public static Object getMediationNetwork(Object obj) {
        if (obj == null) {
            return getCurrencyIso4217Code;
        }
        if (((Class) AFa1gSDK.getMonetizationNetwork((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36, Color.argb(0, 0, 0, 0) + 323, (char) View.combineMeasuredStates(0, 0))).isInstance(obj) || (obj instanceof AFg1lSDK)) {
            return obj;
        }
        if (obj instanceof JSONArray) {
            try {
                Object[] objArr = {obj.toString()};
                Object obj2 = AFa1gSDK.e.get(-1437552995);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1gSDK.getMonetizationNetwork((ViewConfiguration.getTapTimeout() >> 16) + 37, TextUtils.lastIndexOf("", '0', 0) + 324, (char) ExpandableListView.getPackedPositionGroup(0L))).getDeclaredConstructor(String.class);
                    AFa1gSDK.e.put(-1437552995, obj2);
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
            return new AFg1lSDK(obj.toString());
        }
        if (obj.equals(getCurrencyIso4217Code)) {
            return obj;
        }
        if (obj instanceof Collection) {
            try {
                Object[] objArr2 = {(Collection) obj};
                Object obj3 = AFa1gSDK.e.get(1642527574);
                if (obj3 == null) {
                    obj3 = ((Class) AFa1gSDK.getMonetizationNetwork(37 - (ViewConfiguration.getScrollDefaultDelay() >> 16), KeyEvent.keyCodeFromString("") + 323, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getDeclaredConstructor(Collection.class);
                    AFa1gSDK.e.put(1642527574, obj3);
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
                Object obj4 = AFa1gSDK.e.get(1152900683);
                if (obj4 == null) {
                    obj4 = ((Class) AFa1gSDK.getMonetizationNetwork(37 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 323, (char) Color.green(0))).getDeclaredConstructor(Object.class);
                    AFa1gSDK.e.put(1152900683, obj4);
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
            return new AFg1lSDK((Map) obj);
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

    public final AFg1lSDK getRevenue(String str, Object obj) throws AFg1jSDK {
        if (obj == null) {
            this.getMonetizationNetwork.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            try {
                Object[] objArr = {Double.valueOf(((Number) obj).doubleValue())};
                Object obj2 = AFa1gSDK.e.get(1310360324);
                if (obj2 == null) {
                    obj2 = ((Class) AFa1gSDK.getMonetizationNetwork(37 - (Process.myTid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 286, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1))).getMethod("getRevenue", Double.TYPE);
                    AFa1gSDK.e.put(1310360324, obj2);
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
        LinkedHashMap<String, Object> linkedHashMap = this.getMonetizationNetwork;
        if (str == null) {
            throw new AFg1jSDK("Names must be non-null");
        }
        linkedHashMap.put(str, obj);
        return this;
    }

    public final String toString() {
        try {
            AFg1iSDK aFg1iSDK = new AFg1iSDK();
            getMonetizationNetwork(aFg1iSDK);
            return aFg1iSDK.toString();
        } catch (AFg1jSDK unused) {
            return null;
        }
    }

    final void getMonetizationNetwork(AFg1iSDK aFg1iSDK) throws AFg1jSDK {
        aFg1iSDK.getMediationNetwork(AFg1iSDK.AFa1zSDK.EMPTY_OBJECT, "{");
        for (Map.Entry<String, Object> entry : this.getMonetizationNetwork.entrySet()) {
            String key = entry.getKey();
            if (key == null) {
                throw new AFg1jSDK("Names must be non-null");
            }
            aFg1iSDK.getRevenue();
            aFg1iSDK.getRevenue(key);
            aFg1iSDK.getMonetizationNetwork(entry.getValue());
        }
        aFg1iSDK.getMediationNetwork(AFg1iSDK.AFa1zSDK.EMPTY_OBJECT, AFg1iSDK.AFa1zSDK.NONEMPTY_OBJECT, "}");
    }
}
