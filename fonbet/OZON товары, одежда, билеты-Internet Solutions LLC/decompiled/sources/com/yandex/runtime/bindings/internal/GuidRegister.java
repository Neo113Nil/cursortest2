package com.yandex.runtime.bindings.internal;

import Nk.a;
import com.yandex.runtime.bindings.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class GuidRegister {
    private static final Map<String, Class<? extends Serializable>> guidsToClassesMap = new HashMap();
    private static final Map<Class<? extends Serializable>, String> classesToGuidsMap = new HashMap();

    public static Class<? extends Serializable> getClass(String str) {
        Class<? extends Serializable> cls = guidsToClassesMap.get(str);
        if (cls != null) {
            return cls;
        }
        throw new RuntimeException(a.b("Unregistered guid ", str));
    }

    public static String getGuid(Class<? extends Serializable> cls) {
        String str = classesToGuidsMap.get(cls);
        if (str != null) {
            return str;
        }
        throw new RuntimeException("Unknown guid for class ".concat(cls.getName()));
    }

    public static void registerGuid(Class<? extends Serializable> cls, String str) {
        guidsToClassesMap.put(str, cls);
        classesToGuidsMap.put(cls, str);
    }
}
