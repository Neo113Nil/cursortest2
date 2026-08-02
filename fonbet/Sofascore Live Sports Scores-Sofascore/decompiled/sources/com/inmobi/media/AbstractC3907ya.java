package com.inmobi.media;

import defpackage.hz8;
import defpackage.lnb;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ya, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3907ya {
    public static final /* synthetic */ int a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:114:0x03e8, code lost:
    
        if (a(r12.getClass()) == true) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0313 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(JSONObject jSONObject, Class cls, Object obj, Object obj2) {
        Constructor<?> constructor;
        Object newInstance;
        Object obj3;
        Class cls2;
        Class cls3;
        int i;
        Object obj4;
        boolean z;
        Class cls4;
        Class cls5;
        Object valueOf;
        cls.getClass();
        cls.toString();
        Objects.toString(obj);
        Class cls6 = Boolean.TYPE;
        Class cls7 = Float.TYPE;
        Class cls8 = Double.TYPE;
        Class cls9 = Long.TYPE;
        Class cls10 = Integer.TYPE;
        int i2 = 0;
        Object obj5 = null;
        boolean z2 = true;
        if (obj2 == null) {
            try {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                declaredConstructors.getClass();
                if (declaredConstructors.length == 0) {
                    newInstance = cls.newInstance();
                } else {
                    int length = declaredConstructors.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = declaredConstructors[i3];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0) {
                            break;
                        }
                        i3++;
                    }
                    if (constructor == null) {
                        constructor = declaredConstructors[0];
                    }
                    constructor.setAccessible(true);
                    int length2 = constructor.getParameterTypes().length;
                    if (length2 == 0) {
                        newInstance = constructor.newInstance(null);
                    } else {
                        Object[] objArr = new Object[length2];
                        defpackage.r4 P = hz8.P(constructor.getParameterTypes());
                        int i4 = 0;
                        while (P.hasNext()) {
                            Class cls11 = (Class) P.next();
                            int i5 = i4 + 1;
                            cls11.getClass();
                            if (!Intrinsics.c(cls10, cls11) && !Intrinsics.c(cls9, cls11)) {
                                if (Intrinsics.c(cls6, cls11)) {
                                    obj3 = Boolean.FALSE;
                                } else {
                                    if (!Intrinsics.c(cls8, cls11) && !Intrinsics.c(cls7, cls11)) {
                                        obj3 = null;
                                    }
                                    obj3 = Double.valueOf(0.0d);
                                }
                                objArr[i4] = obj3;
                                i4 = i5;
                            }
                            obj3 = 0;
                            objArr[i4] = obj3;
                            i4 = i5;
                        }
                        newInstance = constructor.newInstance(Arrays.copyOf(objArr, length2));
                    }
                }
            } catch (Exception e) {
                e.getMessage();
                cls.toString();
                return null;
            }
        } else {
            newInstance = obj2;
        }
        if (cls.getSuperclass() != null) {
            Class superclass = cls.getSuperclass();
            superclass.getClass();
            newInstance = a(jSONObject, superclass, obj, newInstance);
        }
        defpackage.r4 P2 = hz8.P(cls.getDeclaredFields());
        while (P2.hasNext()) {
            Field field = (Field) P2.next();
            field.setAccessible(z2);
            String name = field.getName();
            if (!Intrinsics.c(name, "shadow$_klass_") && !Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(I8.class)) {
                if (!jSONObject.has(name) || jSONObject.isNull(name)) {
                    cls2 = cls6;
                    cls3 = cls7;
                    i = i2;
                    obj4 = obj5;
                    z = z2 ? 1 : 0;
                    if (field.isAnnotationPresent(Cif.class)) {
                        throw new JSONException(lnb.o("NonNullable field ", name, " is not present or null in the JSONObject"));
                    }
                } else {
                    Class<?> type = field.getType();
                    if (Intrinsics.c(cls10, type) || Intrinsics.c(cls10, type) || Integer.class.equals(type)) {
                        cls2 = cls6;
                        cls3 = cls7;
                        i = i2;
                        obj4 = obj5;
                        z = z2 ? 1 : 0;
                        d(field, newInstance, jSONObject);
                    } else if (Intrinsics.c(cls6, type) || Intrinsics.c(cls6, type) || Boolean.class.equals(type)) {
                        cls2 = cls6;
                        cls3 = cls7;
                        i = i2;
                        obj4 = obj5;
                        z = z2 ? 1 : 0;
                        a(field, newInstance, a(jSONObject, field));
                    } else if (Intrinsics.c(cls8, type) || Intrinsics.c(cls8, type) || Double.class.equals(type)) {
                        cls2 = cls6;
                        cls3 = cls7;
                        i = i2;
                        obj4 = obj5;
                        z = z2 ? 1 : 0;
                        b(field, newInstance, jSONObject);
                    } else if (Intrinsics.c(cls7, type) || Intrinsics.c(cls7, type) || Float.class.equals(type)) {
                        cls2 = cls6;
                        cls3 = cls7;
                        i = i2;
                        obj4 = obj5;
                        z = z2 ? 1 : 0;
                        c(field, newInstance, jSONObject);
                    } else if (Intrinsics.c(cls9, type) || Intrinsics.c(cls9, type) || Long.class.equals(type)) {
                        cls2 = cls6;
                        cls3 = cls7;
                        i = i2;
                        obj4 = obj5;
                        z = z2 ? 1 : 0;
                        e(field, newInstance, jSONObject);
                    } else {
                        Class cls12 = Byte.TYPE;
                        if (Intrinsics.c(cls12, type) || Intrinsics.c(cls12, type) || Byte.class.equals(type)) {
                            cls2 = cls6;
                            cls3 = cls7;
                            i = i2;
                            obj4 = obj5;
                            z = z2 ? 1 : 0;
                            a(field, newInstance, jSONObject);
                        } else if (String.class.equals(type)) {
                            field.set(newInstance, jSONObject.getString(name));
                        } else {
                            Class cls13 = Short.TYPE;
                            if (Intrinsics.c(cls13, type) || Intrinsics.c(cls13, type)) {
                                cls2 = cls6;
                                cls3 = cls7;
                                i = i2;
                            } else {
                                i = i2;
                                if (Short.class.equals(type)) {
                                    cls2 = cls6;
                                    cls3 = cls7;
                                } else {
                                    if (JSONObject.class.equals(type)) {
                                        JSONObject jSONObject2 = jSONObject.getJSONObject(field.getName());
                                        JSONObject jSONObject3 = new JSONObject();
                                        if (jSONObject2 == null) {
                                            jSONObject2 = jSONObject3;
                                        }
                                        field.set(newInstance, jSONObject2);
                                    } else if (JSONArray.class.equals(type)) {
                                        field.set(newInstance, jSONObject.getJSONArray(name));
                                    } else {
                                        if (Map.class.isAssignableFrom(type)) {
                                            JSONObject jSONObject4 = jSONObject.getJSONObject(name);
                                            Objects.toString(jSONObject4);
                                            HashMap hashMap = new HashMap();
                                            Iterator<String> keys = jSONObject4.keys();
                                            ?? r8 = z2;
                                            while (keys.hasNext()) {
                                                String next = keys.next();
                                                next.getClass();
                                                Type genericType = field.getGenericType();
                                                genericType.getClass();
                                                Type type2 = ((ParameterizedType) genericType).getActualTypeArguments()[r8];
                                                type2.getClass();
                                                Class cls14 = (Class) type2;
                                                if (Intrinsics.c(cls10, cls14)) {
                                                    valueOf = Integer.valueOf(jSONObject4.getInt(next));
                                                } else if (Intrinsics.c(cls8, cls14)) {
                                                    valueOf = Double.valueOf(jSONObject4.getDouble(next));
                                                } else {
                                                    if (Intrinsics.c(cls7, cls14)) {
                                                        cls4 = cls6;
                                                        cls5 = cls7;
                                                        valueOf = Float.valueOf((float) jSONObject4.getDouble(next));
                                                    } else {
                                                        cls4 = cls6;
                                                        cls5 = cls7;
                                                        valueOf = Intrinsics.c(cls9, cls14) ? Long.valueOf(jSONObject4.getLong(next)) : Intrinsics.c(cls12, cls14) ? Byte.valueOf((byte) jSONObject4.getInt(next)) : Intrinsics.c(cls13, cls14) ? Short.valueOf((short) jSONObject4.getInt(next)) : jSONObject4.get(next);
                                                    }
                                                    valueOf.getClass();
                                                    if (!a(valueOf.getClass())) {
                                                        JSONObject jSONObject5 = jSONObject4.getJSONObject(next);
                                                        jSONObject5.getClass();
                                                        Type genericType2 = field.getGenericType();
                                                        genericType2.getClass();
                                                        Type type3 = ((ParameterizedType) genericType2).getActualTypeArguments()[1];
                                                        type3.getClass();
                                                        valueOf = a(jSONObject5, (Class) type3, null, null);
                                                    }
                                                    if (valueOf == null) {
                                                        hashMap.put(next, valueOf);
                                                    }
                                                    cls6 = cls4;
                                                    cls7 = cls5;
                                                    r8 = 1;
                                                }
                                                cls4 = cls6;
                                                cls5 = cls7;
                                                valueOf.getClass();
                                                if (!a(valueOf.getClass())) {
                                                }
                                                if (valueOf == null) {
                                                }
                                                cls6 = cls4;
                                                cls7 = cls5;
                                                r8 = 1;
                                            }
                                            field.set(newInstance, hashMap);
                                            i2 = i;
                                        } else {
                                            cls2 = cls6;
                                            cls3 = cls7;
                                            if (List.class.isAssignableFrom(type)) {
                                                JSONArray jSONArray = jSONObject.getJSONArray(name);
                                                List linkedList = (Intrinsics.c(field.getType(), LinkedList.class) || Intrinsics.c(field.getType(), LinkedList.class)) ? new LinkedList() : new ArrayList();
                                                int length3 = jSONArray.length();
                                                for (int i6 = i; i6 < length3; i6++) {
                                                    Type genericType3 = field.getGenericType();
                                                    genericType3.getClass();
                                                    Type type4 = ((ParameterizedType) genericType3).getActualTypeArguments()[i];
                                                    type4.getClass();
                                                    Object a2 = a(jSONArray, i6, (Class) type4);
                                                    if (a2 == null || !a(a2.getClass())) {
                                                        JSONObject jSONObject6 = jSONArray.getJSONObject(i6);
                                                        jSONObject6.getClass();
                                                        Type genericType4 = field.getGenericType();
                                                        genericType4.getClass();
                                                        Type type5 = ((ParameterizedType) genericType4).getActualTypeArguments()[i];
                                                        type5.getClass();
                                                        a2 = a(jSONObject6, (Class) type5, null, null);
                                                    }
                                                    if (a2 != null) {
                                                        linkedList.add(a2);
                                                    }
                                                }
                                                field.set(newInstance, linkedList);
                                                i2 = i;
                                                cls6 = cls2;
                                                cls7 = cls3;
                                            } else if (type.isArray()) {
                                                JSONArray jSONArray2 = jSONObject.getJSONArray(name);
                                                Class<?> componentType = type.getComponentType();
                                                int length4 = jSONArray2.length();
                                                Object newInstance2 = Array.newInstance(componentType, length4);
                                                for (int i7 = i; i7 < length4; i7++) {
                                                    componentType.getClass();
                                                    Object a3 = a(jSONArray2, i7, componentType);
                                                    if (a3 == null) {
                                                    }
                                                    JSONObject jSONObject7 = jSONArray2.getJSONObject(i7);
                                                    jSONObject7.getClass();
                                                    a3 = a(jSONObject7, componentType, null, null);
                                                    if (a3 != null) {
                                                        Array.set(newInstance2, i7, a3);
                                                    }
                                                }
                                                field.set(newInstance, newInstance2);
                                                z2 = true;
                                                i2 = i;
                                                cls6 = cls2;
                                                cls7 = cls3;
                                                obj5 = null;
                                            } else {
                                                z = true;
                                                JSONObject jSONObject8 = jSONObject.getJSONObject(name);
                                                Objects.toString(newInstance);
                                                jSONObject8.getClass();
                                                obj4 = null;
                                                field.set(newInstance, a(jSONObject8, type, newInstance, null));
                                            }
                                        }
                                        obj5 = null;
                                        z2 = true;
                                    }
                                    i2 = i;
                                }
                            }
                            obj4 = obj5;
                            z = z2 ? 1 : 0;
                            f(field, newInstance, jSONObject);
                        }
                    }
                }
                obj5 = obj4;
                z2 = z;
                i2 = i;
                cls6 = cls2;
                cls7 = cls3;
            }
        }
        return newInstance;
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) {
        double d = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) {
        int i = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) {
        long j = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getClass();
            Class superclass = cls.getSuperclass();
            if (superclass == null || Object.class.equals(superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getClass();
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            defpackage.r4 P = hz8.P(cls.getDeclaredFields());
            while (P.hasNext()) {
                Field field = (Field) P.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(I8.class)) {
                        type.getClass();
                        if (Modifier.isStatic(cls.getModifiers()) || !Intrinsics.c(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (!Intrinsics.c(cls2, type) && !Intrinsics.c(cls2, type) && !Integer.class.equals(type)) {
                                Class cls3 = Boolean.TYPE;
                                if (!Intrinsics.c(cls3, type) && !Intrinsics.c(cls3, type) && !Boolean.class.equals(type)) {
                                    Class cls4 = Double.TYPE;
                                    if (!Intrinsics.c(cls4, type) && !Intrinsics.c(cls4, type) && !Double.class.equals(type)) {
                                        Class cls5 = Float.TYPE;
                                        if (!Intrinsics.c(cls5, type) && !Intrinsics.c(cls5, type) && !Float.class.equals(type)) {
                                            Class cls6 = Long.TYPE;
                                            if (!Intrinsics.c(cls6, type) && !Intrinsics.c(cls6, type) && !Long.class.equals(type)) {
                                                Class cls7 = Byte.TYPE;
                                                if (!Intrinsics.c(cls7, type) && !Intrinsics.c(cls7, type) && !Byte.class.equals(type)) {
                                                    if (!String.class.equals(type) && !JSONObject.class.equals(type) && !JSONArray.class.equals(type)) {
                                                        Class cls8 = Short.TYPE;
                                                        if (!Intrinsics.c(cls8, type) && !Intrinsics.c(cls8, type) && !Short.class.equals(type)) {
                                                            if (Map.class.isAssignableFrom(type)) {
                                                                JSONObject jSONObject2 = new JSONObject();
                                                                Object obj2 = field.get(obj);
                                                                if (obj2 != null) {
                                                                    Map map = (Map) obj2;
                                                                    for (Object obj3 : map.keySet()) {
                                                                        Object obj4 = map.get(obj3);
                                                                        if (obj4 != null) {
                                                                            if (!a(obj4.getClass())) {
                                                                                obj4 = a(obj4, obj4.getClass());
                                                                            }
                                                                            jSONObject2.put(String.valueOf(obj3), obj4);
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONObject2);
                                                            } else if (List.class.isAssignableFrom(type)) {
                                                                JSONArray jSONArray = new JSONArray();
                                                                Object obj5 = field.get(obj);
                                                                if (obj5 != null) {
                                                                    for (Object obj6 : (List) obj5) {
                                                                        if (obj6 != null) {
                                                                            Object a2 = a(obj6.getClass()) ? obj6 : a(obj6, obj6.getClass());
                                                                            if (a2 == null) {
                                                                                obj6.getClass().toString();
                                                                            } else {
                                                                                jSONArray.put(a2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray);
                                                            } else if (type.isArray()) {
                                                                JSONArray jSONArray2 = new JSONArray();
                                                                Object obj7 = field.get(obj);
                                                                if (obj7 != null) {
                                                                    int length = Array.getLength(obj7);
                                                                    for (int i = 0; i < length; i++) {
                                                                        Object obj8 = Array.get(obj7, i);
                                                                        if (obj8 != null) {
                                                                            Object a3 = a(obj8.getClass()) ? obj8 : a(obj8, obj8.getClass());
                                                                            if (a3 == null) {
                                                                                obj8.getClass().toString();
                                                                            } else {
                                                                                jSONArray2.put(a3);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                jSONObject.put(name, jSONArray2);
                                                            } else {
                                                                Object obj9 = field.get(obj);
                                                                if (obj9 != null) {
                                                                    jSONObject.put(name, a(obj9, obj9.getClass()));
                                                                } else {
                                                                    Unit unit = Unit.a;
                                                                }
                                                            }
                                                        }
                                                        Object obj10 = field.get(obj);
                                                        obj10.getClass();
                                                        jSONObject.put(name, (Short) obj10);
                                                    }
                                                    jSONObject.put(name, field.get(obj));
                                                }
                                                Object obj11 = field.get(obj);
                                                obj11.getClass();
                                                jSONObject.put(name, (Byte) obj11);
                                            }
                                            Object obj12 = field.get(obj);
                                            obj12.getClass();
                                            jSONObject.put(name, ((Long) obj12).longValue());
                                        }
                                        Object obj13 = field.get(obj);
                                        obj13.getClass();
                                        jSONObject.put(name, (Float) obj13);
                                    }
                                    Object obj14 = field.get(obj);
                                    obj14.getClass();
                                    jSONObject.put(name, ((Double) obj14).doubleValue());
                                }
                                Object obj15 = field.get(obj);
                                obj15.getClass();
                                jSONObject.put(name, ((Boolean) obj15).booleanValue());
                            }
                            Object obj16 = field.get(obj);
                            obj16.getClass();
                            jSONObject.put(name, ((Integer) obj16).intValue());
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z;
        String name = field.getName();
        try {
            z = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z = jSONObject.getInt(name) != 0 && jSONObject.getInt(name) == 1;
        }
        return Boolean.valueOf(z);
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b));
            }
        } catch (Exception e) {
            field.getName();
            e.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (Intrinsics.c(cls2, cls) || Intrinsics.c(cls2, cls) || Integer.class.equals(cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (Intrinsics.c(cls3, cls) || Intrinsics.c(cls3, cls) || Boolean.class.equals(cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (Intrinsics.c(cls4, cls) || Intrinsics.c(cls4, cls) || Double.class.equals(cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (Intrinsics.c(cls5, cls) || Intrinsics.c(cls5, cls) || Float.class.equals(cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (Intrinsics.c(cls6, cls) || Intrinsics.c(cls6, cls) || Long.class.equals(cls) || String.class.equals(cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (Intrinsics.c(cls7, cls) || Intrinsics.c(cls7, cls) || Byte.class.equals(cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return Intrinsics.c(cls8, cls) || Intrinsics.c(cls8, cls) || Short.class.equals(cls);
    }

    public static Object a(JSONArray jSONArray, int i, Class cls) {
        Object obj;
        if (Intrinsics.c(Integer.TYPE, cls)) {
            obj = Integer.valueOf(jSONArray.getInt(i));
        } else if (Intrinsics.c(Double.TYPE, cls)) {
            obj = Double.valueOf(jSONArray.getDouble(i));
        } else if (Intrinsics.c(Float.TYPE, cls)) {
            obj = Float.valueOf((float) jSONArray.getDouble(i));
        } else if (Intrinsics.c(Long.TYPE, cls)) {
            obj = Long.valueOf(jSONArray.getLong(i));
        } else if (Intrinsics.c(Byte.TYPE, cls)) {
            obj = Byte.valueOf((byte) jSONArray.getInt(i));
        } else if (Intrinsics.c(Short.TYPE, cls)) {
            obj = Short.valueOf((short) jSONArray.getInt(i));
        } else {
            obj = jSONArray.get(i);
        }
        obj.getClass();
        return obj;
    }
}
