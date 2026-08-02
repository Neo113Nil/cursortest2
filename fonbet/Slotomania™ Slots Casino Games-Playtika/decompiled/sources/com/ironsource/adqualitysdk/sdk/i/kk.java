package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class kk {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Map<d, Method> f3034 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f3035 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f3036;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f3037;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char f3038;

    /* renamed from: ﾒ, reason: contains not printable characters */
    static void m8444() {
        f3038 = (char) 6;
        f3037 = new char[]{'R', 'e', 'f', 'l', 'c', 't', 'i', 'o', 'n', 'U', GMTDateParser.SECONDS, 'C', 'a', ' ', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.DAY_OF_MONTH, 'E', 'r', 'g', GMTDateParser.HOURS, GMTDateParser.MINUTES, 'N', '\'', '.', 'q', 'y', 'S', 'T', 'V', 'W', 'X', GMTDateParser.YEAR, 'Z', AbstractJsonLexerKt.BEGIN_LIST, '\\', AbstractJsonLexerKt.END_LIST};
    }

    static {
        m8444();
        f3034 = new ConcurrentHashMap();
        int i = f3036 + 111;
        f3035 = i % 128;
        if (i % 2 == 0) {
            int i2 = 17 / 0;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Class m8433(String str, boolean z) {
        int i = 2 % 2;
        int i2 = f3035 + 57;
        f3036 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 == 0) {
                Class<?> cls = Class.forName(str);
                int i3 = f3036 + 97;
                f3035 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 10 / 0;
                }
                return cls;
            }
            Class.forName(str);
            super.hashCode();
            throw null;
        } catch (Throwable th) {
            if (z) {
                cn.m7268(m8438((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\b\t\u000b\u0003\t\u0000Ç", (byte) (TextUtils.indexOf("", "", 0) + 84)).intern(), new StringBuilder().append(m8438(Color.red(0) + 6, "\t\u0005\u0010\u0006\u0007\u0010", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 30)).intern()).append(str).append(m8438(10 - TextUtils.indexOf("", ""), "\u000e\u0007\u000b\u0001\u000e\u0001\b\r\t\u000e", (byte) (124 - TextUtils.getTrimmedLength(""))).intern()).toString(), th);
            }
            return null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static Object m8434(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i = 2 % 2;
        int i2 = f3036 + 55;
        f3035 = i2 % 128;
        int i3 = i2 % 2;
        Object newInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        int i4 = f3035 + 9;
        f3036 = i4 % 128;
        int i5 = i4 % 2;
        return newInstance;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m8437(Class cls, List<Object> list) throws Exception {
        int i = 2 % 2;
        int i2 = f3035 + 55;
        f3036 = i2 % 128;
        int i3 = i2 % 2;
        Object newInstance = m8440(cls, list).newInstance(list.toArray());
        int i4 = f3035 + 75;
        f3036 = i4 % 128;
        if (i4 % 2 == 0) {
            return newInstance;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if ((!m8427(r4, r9)) == true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.i.kk.f3035 + 71;
        com.ironsource.adqualitysdk.sdk.i.kk.f3036 = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
    
        if ((r8 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r8 = 46 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0033, code lost:
    
        if (r4.getParameterTypes().length == r9.size()) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r4.getParameterTypes().length == r9.size()) goto L11;
     */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Constructor m8440(Class cls, List<Object> list) {
        Constructor<?> constructor;
        int i = 2 % 2;
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f3035 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f3036 = i3 % 128;
            if (i3 % 2 != 0) {
                constructor = constructors[i2];
                int i4 = 16 / 0;
            } else {
                constructor = constructors[i2];
            }
            i2++;
            int i5 = f3036 + 105;
            f3035 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 / 5;
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Method m8442(Object obj, String str, List<Object> list) {
        Method m8431;
        int i = 2 % 2;
        d dVar = new d(obj, str, m8443(list));
        Method method = f3034.get(dVar);
        if (method != null) {
            if (m8428(method.getParameterTypes(), list)) {
                return method;
            }
            cn.m7273(m8438(15 - (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\b\t\u000b\u0003\t\u0000Ç", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 84)).intern(), new StringBuilder().append(m8438(TextUtils.indexOf("", "", 0) + 28, "\u0011\f\r\u000b\f\u000e\u0013\u0000~~\u0007\t\u0013\f\u0000\u0010\u0001\u0016\u0003\r\u000e\u0013\u0002\u0000\u0019\r\u0010\u000e", (byte) (10 - KeyEvent.normalizeMetaState(0))).intern()).append(dVar).toString());
        }
        if (!(obj instanceof Class)) {
            m8431 = m8431(obj, str, list);
        } else {
            int i2 = f3036 + 77;
            f3035 = i2 % 128;
            if (i2 % 2 != 0 ? (m8431 = m8441((Class) obj, str, list, true)) == null : (m8431 = m8441((Class) obj, str, list, false)) == null) {
                m8431 = m8431(Class.class, str, list);
            }
        }
        if (m8431 != null) {
            int i3 = f3035 + 21;
            f3036 = i3 % 128;
            if (i3 % 2 != 0) {
                f3034.put(dVar, m8431);
                int i4 = 73 / 0;
                return m8431;
            }
            f3034.put(dVar, m8431);
        }
        return m8431;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static List<Class> m8443(List<Object> list) {
        int i = 2 % 2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i2 = f3035 + 71;
            f3036 = i2 % 128;
            int i3 = i2 % 2;
            if (obj == null) {
                arrayList.add(Object.class);
            } else {
                int i4 = f3035 + 91;
                f3036 = i4 % 128;
                int i5 = i4 % 2;
                arrayList.add(obj.getClass());
            }
        }
        return arrayList;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static Method m8431(Object obj, String str, List<Object> list) {
        int i = 2 % 2;
        int i2 = f3035 + 81;
        f3036 = i2 % 128;
        int i3 = i2 % 2;
        return m8441(obj.getClass(), str, list, false);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static Method m8441(Class cls, String str, List<Object> list, boolean z) {
        Method[] methods;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = f3035 + 29;
        f3036 = i3 % 128;
        if (i3 % 2 != 0) {
            methods = cls.getMethods();
            length = methods.length;
            i = 1;
        } else {
            methods = cls.getMethods();
            length = methods.length;
            i = 0;
        }
        while (i < length) {
            Method method = methods[i];
            if (method.getName().equals(str)) {
                int i4 = f3036 + 47;
                f3035 = i4 % 128;
                if (i4 % 2 != 0) {
                    if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z && m8436(method, list)) {
                        return method;
                    }
                } else {
                    int length2 = method.getParameterTypes().length;
                    list.size();
                    throw null;
                }
            }
            i++;
        }
        return null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static boolean m8436(Method method, List<Object> list) {
        int i = 2 % 2;
        int i2 = f3036 + 31;
        f3035 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (i3 != 0) {
            return m8428(parameterTypes, list);
        }
        m8428(parameterTypes, list);
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m8427(Constructor constructor, List<Object> list) {
        int i = 2 % 2;
        int i2 = f3036 + 79;
        f3035 = i2 % 128;
        int i3 = i2 % 2;
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (i3 != 0) {
            return m8428(parameterTypes, list);
        }
        boolean m8428 = m8428(parameterTypes, list);
        int i4 = 24 / 0;
        return m8428;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m8428(Class[] clsArr, List<Object> list) {
        int i = 2 % 2;
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            Object obj = list.get(i2);
            if (obj == null) {
                int i3 = f3035 + 63;
                f3036 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 43 / 0;
                    if (!Object.class.isAssignableFrom(clsArr[i2])) {
                    }
                } else if (!Object.class.isAssignableFrom(clsArr[i2])) {
                }
                return false;
            }
            if (obj != null) {
                int i5 = f3036 + 37;
                f3035 = i5 % 128;
                if (i5 % 2 == 0) {
                    m8426(clsArr[i2], obj);
                    Object obj2 = null;
                    super.hashCode();
                    throw null;
                }
                if (!m8426(clsArr[i2], obj)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008d, code lost:
    
        if (r6.isAssignableFrom(java.lang.Long.class) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r6.isAssignableFrom(java.lang.Byte.class) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
    
        if (r6.isAssignableFrom(java.lang.Float.class) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011b, code lost:
    
        if (r6.isAssignableFrom(java.lang.Long.class) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0134, code lost:
    
        if (r6.isAssignableFrom(java.lang.Integer.class) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016d, code lost:
    
        if (r6.isAssignableFrom(java.lang.Double.class) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0198, code lost:
    
        if (r6.isAssignableFrom(java.lang.Long.class) == false) goto L101;
     */
    /* renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean m8426(Class cls, Object obj) {
        int i = 2 % 2;
        int i2 = f3036 + 23;
        f3035 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj.getClass();
            cls.isAssignableFrom(Byte.TYPE);
            throw null;
        }
        Class<?> cls2 = obj.getClass();
        if ((!cls.isAssignableFrom(Byte.TYPE) || !cls2.isAssignableFrom(Byte.class)) && ((!cls.isAssignableFrom(Short.TYPE) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(Short.TYPE) || !cls2.isAssignableFrom(Byte.class)) && ((!cls.isAssignableFrom(Integer.TYPE) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(Integer.TYPE) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(Integer.TYPE) || !cls2.isAssignableFrom(Byte.class))))))) {
            if (cls.isAssignableFrom(Long.TYPE)) {
                int i3 = f3035 + 49;
                f3036 = i3 % 128;
                if (i3 % 2 != 0) {
                    cls2.isAssignableFrom(Long.class);
                    super.hashCode();
                    throw null;
                }
            }
            if ((!cls.isAssignableFrom(Long.TYPE) || !cls2.isAssignableFrom(Integer.class)) && (!cls.isAssignableFrom(Long.TYPE) || !cls2.isAssignableFrom(Short.class))) {
                if (cls.isAssignableFrom(Long.TYPE)) {
                    int i4 = f3035 + 91;
                    f3036 = i4 % 128;
                    if (i4 % 2 != 0) {
                        cls2.isAssignableFrom(Byte.class);
                        super.hashCode();
                        throw null;
                    }
                }
                if (cls.isAssignableFrom(Float.TYPE)) {
                    int i5 = f3036 + 1;
                    f3035 = i5 % 128;
                    if (i5 % 2 == 0) {
                        cls2.isAssignableFrom(Float.class);
                        throw null;
                    }
                }
                if (cls.isAssignableFrom(Float.TYPE)) {
                    int i6 = f3035 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                    f3036 = i6 % 128;
                    if (i6 % 2 != 0) {
                        cls2.isAssignableFrom(Long.class);
                        throw null;
                    }
                }
                if (cls.isAssignableFrom(Float.TYPE)) {
                    int i7 = f3036 + 73;
                    f3035 = i7 % 128;
                    int i8 = i7 % 2;
                }
                if ((!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(Float.TYPE) || !cls2.isAssignableFrom(Byte.class))) {
                    if (cls.isAssignableFrom(Double.TYPE)) {
                        int i9 = f3035 + 1;
                        f3036 = i9 % 128;
                        int i10 = i9 % 2;
                    }
                    if (!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Float.class)) {
                        if (cls.isAssignableFrom(Double.TYPE)) {
                            int i11 = f3035 + 73;
                            f3036 = i11 % 128;
                            if (i11 % 2 != 0) {
                                cls2.isAssignableFrom(Long.class);
                                throw null;
                            }
                        }
                        if ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Short.class)) && ((!cls.isAssignableFrom(Double.TYPE) || !cls2.isAssignableFrom(Byte.class)) && (!cls.isAssignableFrom(Boolean.TYPE) || !cls2.isAssignableFrom(Boolean.class))))) {
                            if (cls != null) {
                                int i12 = f3036 + 115;
                                f3035 = i12 % 128;
                                int i13 = i12 % 2;
                                if (cls.isAssignableFrom(cls2)) {
                                    int i14 = f3036 + 13;
                                    f3035 = i14 % 128;
                                    return i14 % 2 != 0;
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.reflect.Method] */
    /* renamed from: ｋ, reason: contains not printable characters */
    public static Method m8435(Object obj, String str, List<Class> list) {
        int i = 2 % 2;
        int i2 = f3036 + 5;
        f3035 = i2 % 128;
        int i3 = i2 % 2;
        try {
            Class<?>[] m8429 = m8429(list);
            if (obj instanceof Class) {
                try {
                    obj = ((Class) obj).getMethod(str, m8429);
                    return obj;
                } catch (NoSuchMethodException unused) {
                    return Class.class.getMethod(str, m8429);
                }
            }
            Method method = obj.getClass().getMethod(str, m8429);
            int i4 = f3035 + 5;
            f3036 = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 51 / 0;
            }
            return method;
        } catch (NoSuchMethodException e) {
            cn.m7268(m8438(16 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), "\u0001\u0002\u0003\u0004\u0002\u0005\u0000\u000b\b\t\u000b\u0003\t\u0000Ç", (byte) (84 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), new StringBuilder().append(m8438((Process.myPid() >> 22) + 4, "\u0013\t\u0010\u0013", (byte) (81 - View.getDefaultSize(0, 0))).intern()).append(str).append(m8438(TextUtils.indexOf("", "", 0, 0) + 19, "\u0013\u0010\u0013\u0002\u0001\u0017\t\r\u000e\u0001\b\r\t\u000e\u000e\u0001\u000b\r'", (byte) (6 - ExpandableListView.getPackedPositionChild(0L))).intern()).append(obj).toString(), e);
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Field[] m8439(Field[] fieldArr, Field[] fieldArr2) {
        int i = 2 % 2;
        int i2 = f3036 + 95;
        f3035 = i2 % 128;
        if (i2 % 2 == 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length << length2];
            System.arraycopy(fieldArr, 1, fieldArr3, 0, length);
            System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        Field[] fieldArr4 = new Field[length3 + length4];
        System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static Method[] m8430(Method[] methodArr, Method[] methodArr2) {
        int i = 2 % 2;
        int i2 = f3036 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f3035 = i2 % 128;
        int i3 = i2 % 2;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        int i4 = f3036 + 95;
        f3035 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 26 / 0;
        }
        return methodArr3;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static Class[] m8429(List<Class> list) {
        int i = 2 % 2;
        int i2 = f3035 + 65;
        f3036 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        Class[] clsArr = new Class[list.size()];
        while (i4 < list.size()) {
            int i5 = f3035 + 61;
            f3036 = i5 % 128;
            if (i5 % 2 != 0) {
                clsArr[i4] = list.get(i4);
                i4 += 16;
            } else {
                clsArr[i4] = list.get(i4);
                i4++;
            }
        }
        int i6 = f3035 + 1;
        f3036 = i6 % 128;
        if (i6 % 2 == 0) {
            return clsArr;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m8432(Class cls, List<String> list) {
        int i = 2 % 2;
        if (cls != null) {
            if (list == null || list.isEmpty()) {
                return true;
            }
            for (String str : list) {
                int i2 = f3035 + 95;
                f3036 = i2 % 128;
                int i3 = i2 % 2;
                if (!str.equals("") || (cls.getPackage() != null && !cls.getPackage().getName().equals(""))) {
                    if (!str.equals("")) {
                        int i4 = f3035 + 67;
                        f3036 = i4 % 128;
                        if (i4 % 2 != 0) {
                            cls.getName().startsWith(str);
                            Object obj = null;
                            super.hashCode();
                            throw null;
                        }
                        if (cls.getName().startsWith(str)) {
                        }
                    }
                    int i5 = f3035 + 89;
                    f3036 = i5 % 128;
                    int i6 = i5 % 2;
                }
                return true;
            }
            if (!kk.class.getName().startsWith(m8438((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, "\u0001\n\u0015\u0012\u000b\f\b\t\u000b\b\u000f\f\u0005\u0002\u0012\u0011\f\u001b\u000f\r\u0000\t\u0001\u001d", (byte) (124 - TextUtils.getOffsetBefore("", 0))).intern())) {
                if (!(kk.class.getPackage() == null && cls.getPackage() == null) && (kk.class.getPackage() == null || !kk.class.getPackage().equals(cls.getPackage()))) {
                    return false;
                }
                int i7 = f3036 + 69;
                f3035 = i7 % 128;
                int i8 = i7 % 2;
                return true;
            }
        }
        return false;
    }

    static class d {

        /* renamed from: ﱡ, reason: contains not printable characters */
        private static int f3039 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static int f3040 = 0;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f3041 = 85;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private Class f3042;

        /* renamed from: ｋ, reason: contains not printable characters */
        private String f3043;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private List<Class> f3044;

        public d(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f3042 = (Class) obj;
            } else {
                this.f3042 = obj.getClass();
            }
            this.f3043 = str;
            this.f3044 = list;
        }

        public final boolean equals(Object obj) {
            int i = 2 % 2;
            int i2 = f3040 + 69;
            int i3 = i2 % 128;
            f3039 = i3;
            int i4 = i2 % 2;
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                int i5 = i3 + 85;
                f3040 = i5 % 128;
                int i6 = i5 % 2;
                if (getClass() == obj.getClass()) {
                    d dVar = (d) obj;
                    if (!this.f3042.equals(dVar.f3042) || !this.f3043.equals(dVar.f3043)) {
                        return false;
                    }
                    boolean equals = this.f3044.equals(dVar.f3044);
                    int i7 = f3040 + 107;
                    f3039 = i7 % 128;
                    int i8 = i7 % 2;
                    return equals;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = 2 % 2;
            int i2 = f3039 + 97;
            f3040 = i2 % 128;
            return i2 % 2 != 0 ? ((this.f3042.hashCode() >>> this.f3043.hashCode()) * 102) % this.f3044.hashCode() : (((this.f3042.hashCode() * 31) + this.f3043.hashCode()) * 31) + this.f3044.hashCode();
        }

        public final String toString() {
            int i = 2 % 2;
            StringBuilder sb = new StringBuilder(m8445(17 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, (-16777028) - Color.rgb(0, 0, 0), "\u0002\u0007\u0002\uffff\ufffe\uffdd�\b\u0001\r\ufffe￦\u0014\u0007\b\u0002\r", (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 12).intern());
            sb.append(m8445((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 12, true, 182 - ExpandableListView.getPackedPositionGroup(0L), "\u0012\u0000\u000b￢\u0013\u0002\u0004\t\u0001￮\fￜ\u0012", 12 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern()).append(this.f3042);
            sb.append(m8445((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, false, 170 - View.combineMeasuredStates(0, 0), "ￗￋ\u0018\ufff8\u0010\u001f\u0013\u001a\u000f\ufff9\f\u0018\u0010￨ￒ", 15 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).append(this.f3043).append('\'');
            sb.append(m8445(TextUtils.lastIndexOf("", '0', 0) + 15, false, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 174, "\u0013\b\u001a\u001a\f\u001a￤ￓￇ\u0014￨\u0019\u000e￪", 7 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern()).append(this.f3044);
            sb.append(AbstractJsonLexerKt.END_OBJ);
            String obj = sb.toString();
            int i2 = f3039 + 53;
            f3040 = i2 % 128;
            int i3 = i2 % 2;
            return obj;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static String m8445(int i, boolean z, int i2, String str, int i3) {
            String str2;
            char[] cArr = str;
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1644) {
                char[] cArr3 = new char[i];
                com.ironsource.adqualitysdk.sdk.i.d.f1641 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.d.f1641 < i) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1643 = cArr2[com.ironsource.adqualitysdk.sdk.i.d.f1641];
                    cArr3[com.ironsource.adqualitysdk.sdk.i.d.f1641] = (char) (com.ironsource.adqualitysdk.sdk.i.d.f1643 + i2);
                    int i4 = com.ironsource.adqualitysdk.sdk.i.d.f1641;
                    cArr3[i4] = (char) (cArr3[i4] - f3041);
                    com.ironsource.adqualitysdk.sdk.i.d.f1641++;
                }
                if (i3 > 0) {
                    com.ironsource.adqualitysdk.sdk.i.d.f1642 = i3;
                    char[] cArr4 = new char[i];
                    System.arraycopy(cArr3, 0, cArr4, 0, i);
                    System.arraycopy(cArr4, 0, cArr3, i - com.ironsource.adqualitysdk.sdk.i.d.f1642, com.ironsource.adqualitysdk.sdk.i.d.f1642);
                    System.arraycopy(cArr4, com.ironsource.adqualitysdk.sdk.i.d.f1642, cArr3, 0, i - com.ironsource.adqualitysdk.sdk.i.d.f1642);
                }
                if (z) {
                    char[] cArr5 = new char[i];
                    com.ironsource.adqualitysdk.sdk.i.d.f1641 = 0;
                    while (com.ironsource.adqualitysdk.sdk.i.d.f1641 < i) {
                        cArr5[com.ironsource.adqualitysdk.sdk.i.d.f1641] = cArr3[(i - com.ironsource.adqualitysdk.sdk.i.d.f1641) - 1];
                        com.ironsource.adqualitysdk.sdk.i.d.f1641++;
                    }
                    cArr3 = cArr5;
                }
                str2 = new String(cArr3);
            }
            return str2;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m8438(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f3037;
            char c = f3038;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
