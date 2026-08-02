package com.facebook.hermes.intl;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class JSObjects {
    private static Object s_null;
    private static Object s_undefined;

    public static class NullObject {
        private NullObject() {
        }
    }

    public static class UndefinedObject {
        private UndefinedObject() {
        }
    }

    static {
        s_undefined = new UndefinedObject();
        s_null = new NullObject();
    }

    public static Object Get(Object obj, String str) {
        HashMap hashMap = (HashMap) obj;
        if (!hashMap.containsKey(str)) {
            return Undefined();
        }
        Object obj2 = hashMap.get(str);
        return obj2 == null ? Null() : obj2;
    }

    public static Object Null() {
        return s_null;
    }

    public static void Put(Object obj, String str, Object obj2) {
        ((HashMap) obj).put(str, obj2);
    }

    public static Object Undefined() {
        return s_undefined;
    }

    public static boolean getJavaBoolean(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public static double getJavaDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public static Map<String, Object> getJavaMap(Object obj) {
        return (HashMap) obj;
    }

    public static String getJavaString(Object obj) {
        return (String) obj;
    }

    public static boolean isArray(Object obj) {
        return obj instanceof Object[];
    }

    public static boolean isBoolean(Object obj) {
        return obj instanceof Boolean;
    }

    public static boolean isNull(Object obj) {
        return obj instanceof NullObject;
    }

    public static boolean isNumber(Object obj) {
        return obj instanceof Double;
    }

    public static boolean isObject(Object obj) {
        return obj instanceof HashMap;
    }

    public static boolean isString(Object obj) {
        return obj instanceof String;
    }

    public static boolean isUndefined(Object obj) {
        return obj instanceof UndefinedObject;
    }

    public static Object newBoolean() {
        return Boolean.FALSE;
    }

    public static Object newNumber(double d10) {
        return Double.valueOf(d10);
    }

    public static Object newObject() {
        return new HashMap();
    }

    public static Object newString(String str) {
        return str;
    }

    public static Object newBoolean(boolean z10) {
        return Boolean.valueOf(z10);
    }

    public static Object newString() {
        return new String();
    }

    public static Object newBoolean(String str) {
        return Boolean.valueOf(str);
    }
}
