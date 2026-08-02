package com.huawei.hms.health;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
enum aabu {
    PARCELABLE,
    BINDER,
    STRING_LIST,
    LIST,
    BUNDLE,
    PARCELABLE_ARRAY,
    STRING_ARRAY,
    BYTE_ARRAY,
    INTERFACE,
    INT_ARRAY,
    LONG_ARRAY,
    FLOAT_ARRAY,
    DOUBLE_ARRAY,
    CHAR_ARRAY,
    BOOLEAN_ARRAY,
    INTEGER_TYPE,
    LONG_TYPE,
    CHARACTER_TYPE,
    BOOLEAN_TYPE,
    FLOAT_TYPE,
    DOUBLE_TYPE,
    STRING_TYPE,
    MAP_TYPE,
    BYTE_TYPE,
    SHORT_TYPE,
    INTEGER_OBJECT,
    LONG_OBJECT,
    FLOAT_OBJECT,
    DOUBLE_OBJECT,
    BOOLEAN_OBJECT;

    public static aabu aab(Field field) {
        Class<?> type = field.getType();
        Class<?> componentType = type.getComponentType();
        boolean isArray = type.isArray();
        Class<?> cls = Boolean.TYPE;
        Class<?> cls2 = Character.TYPE;
        Class<?> cls3 = Double.TYPE;
        Class<?> cls4 = Float.TYPE;
        Class<?> cls5 = Long.TYPE;
        Class<?> cls6 = Integer.TYPE;
        Class<?> cls7 = Byte.TYPE;
        aabu aabuVar = null;
        if (isArray && componentType != null) {
            aabu aabuVar2 = Parcelable.class.isAssignableFrom(componentType) ? PARCELABLE_ARRAY : String.class.isAssignableFrom(componentType) ? STRING_ARRAY : cls7.isAssignableFrom(componentType) ? BYTE_ARRAY : cls6.isAssignableFrom(componentType) ? INT_ARRAY : cls5.isAssignableFrom(componentType) ? LONG_ARRAY : cls4.isAssignableFrom(componentType) ? FLOAT_ARRAY : cls3.isAssignableFrom(componentType) ? DOUBLE_ARRAY : cls2.isAssignableFrom(componentType) ? CHAR_ARRAY : cls.isAssignableFrom(componentType) ? BOOLEAN_ARRAY : null;
            if (aabuVar2 != null) {
                return aabuVar2;
            }
        }
        aabu aabuVar3 = Bundle.class.isAssignableFrom(type) ? BUNDLE : Parcelable.class.isAssignableFrom(type) ? PARCELABLE : IBinder.class.isAssignableFrom(type) ? BINDER : IInterface.class.isAssignableFrom(type) ? INTERFACE : (type == List.class || type == ArrayList.class) ? aabs.aab(field, 0) == String.class ? STRING_LIST : LIST : (type == Map.class || type == HashMap.class) ? MAP_TYPE : null;
        if (aabuVar3 != null) {
            return aabuVar3;
        }
        aabu aabuVar4 = type == Integer.class ? INTEGER_OBJECT : type == Long.class ? LONG_OBJECT : type == Float.class ? FLOAT_OBJECT : type == Double.class ? DOUBLE_OBJECT : type == Boolean.class ? BOOLEAN_OBJECT : null;
        if (aabuVar4 != null) {
            return aabuVar4;
        }
        if (type == cls7 || type == Byte.class) {
            aabuVar = BYTE_TYPE;
        } else if (type == Short.TYPE || type == Short.class) {
            aabuVar = SHORT_TYPE;
        } else if (type == cls6) {
            aabuVar = INTEGER_TYPE;
        } else if (type == cls5) {
            aabuVar = LONG_TYPE;
        } else if (type == cls4) {
            aabuVar = FLOAT_TYPE;
        } else if (type == cls3) {
            aabuVar = DOUBLE_TYPE;
        } else if (type == cls2 || type == Character.class) {
            aabuVar = CHARACTER_TYPE;
        } else if (type == cls) {
            aabuVar = BOOLEAN_TYPE;
        } else if (type == String.class) {
            aabuVar = STRING_TYPE;
        }
        if (aabuVar != null) {
            return aabuVar;
        }
        StringBuilder aab = aab.aab("Type of ");
        aab.append(field.getName());
        aab.append(" not find match enum value : ");
        aab.append(type);
        aabz.aab("SafeParcelUtil", aab.toString());
        StringBuilder aab2 = aab.aab("Type of ");
        aab2.append(field.getName());
        aab2.append(" not find match enum value : ");
        aab2.append(type);
        throw new IllegalStateException(aab2.toString());
    }
}
