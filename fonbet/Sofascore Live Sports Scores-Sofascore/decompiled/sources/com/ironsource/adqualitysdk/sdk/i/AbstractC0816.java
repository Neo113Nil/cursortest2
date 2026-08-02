package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴲ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0816 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2624 = StringFog.decrypt("pjuBwGS4pwabMLLYaLeg\n", "9F7nrAHb028=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2623 = new ConcurrentHashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m507(Class[] clsArr, List list) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= clsArr.length) {
                return true;
            }
            Object obj = list.get(i);
            if (obj == null && !Object.class.isAssignableFrom(clsArr[i])) {
                break;
            }
            if (obj != null) {
                Class cls = clsArr[i];
                Class<?> cls2 = obj.getClass();
                if (!cls.isAssignableFrom(Byte.TYPE) || !cls2.isAssignableFrom(Byte.class)) {
                    Class<?> cls3 = Short.TYPE;
                    if ((!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls3) || !cls2.isAssignableFrom(Byte.class))) {
                        Class<?> cls4 = Integer.TYPE;
                        if ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Byte.class)))) {
                            Class<?> cls5 = Long.TYPE;
                            if ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Byte.class))))) {
                                Class<?> cls6 = Float.TYPE;
                                if ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Byte.class)))))) {
                                    Class<?> cls7 = Double.TYPE;
                                    if ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Double.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Byte.class)) && (!cls.isAssignableFrom(Boolean.TYPE) || !cls2.isAssignableFrom(Boolean.class)))))))) {
                                        z = cls.isAssignableFrom(cls2);
                                    }
                                }
                            }
                        }
                    }
                }
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m503(Class cls, String str, List list, boolean z) {
        for (Method method : cls.getMethods()) {
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m507(method.getParameterTypes(), list)) {
                return method;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m505(Object obj, String str, List list) {
        Method m503;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 != null) {
                arrayList.add(obj2.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        C0828 c0828 = new C0828(obj, str, arrayList);
        ConcurrentHashMap concurrentHashMap = f2623;
        Method method = (Method) concurrentHashMap.get(c0828);
        if (method != null) {
            if (m507(method.getParameterTypes(), list)) {
                return method;
            }
            AbstractC0962.m595(f2624, StringFog.decrypt("nqHkPpswW26vp/8/jjBfari78zXJfVl/s7zycQ==\n", "29OWUekQPAs=\n") + c0828, null, null);
        }
        if (obj instanceof Class) {
            m503 = m503((Class) obj, str, list, true);
            if (m503 == null) {
                m503 = m503(Class.class.getClass(), str, list, false);
            }
        } else {
            m503 = m503(obj.getClass(), str, list, false);
        }
        if (m503 != null) {
            concurrentHashMap.put(c0828, m503);
        }
        return m503;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.reflect.Method] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m504(Object obj, String str, ArrayList arrayList) {
        try {
            Class<?>[] clsArr = new Class[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                clsArr[i] = (Class) arrayList.get(i);
            }
            if (obj instanceof Class) {
                try {
                    obj = ((Class) obj).getMethod(str, clsArr);
                    return obj;
                } catch (NoSuchMethodException unused) {
                    return Class.class.getMethod(str, clsArr);
                }
            }
            return obj.getClass().getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String str2 = f2624;
            StringBuilder m642 = AbstractC1072.m642("j1jxaA==\n", "wTfRT9NKDyg=\n", new StringBuilder(), str);
            m642.append(StringFog.decrypt("qAyuRmN2Af2vSqxWeXpO/+Be4w==\n", "jyzDIxcebpk=\n"));
            m642.append(obj);
            AbstractC0962.m595(str2, m642.toString(), e, null);
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m506(Class cls, List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ((str.equals("") && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                return true;
            }
        }
        return !AbstractC0816.class.getName().startsWith(StringFog.decrypt("xg9MJgEwNLDWD1R6Cyd1v8ERVGkEKy+n\n", "pWAhCGhCW94=\n")) && ((AbstractC0816.class.getPackage() == null && cls.getPackage() == null) || (AbstractC0816.class.getPackage() != null && AbstractC0816.class.getPackage().equals(cls.getPackage())));
    }
}
