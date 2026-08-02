package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮂ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1050 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3337 = StringFog.decrypt("8sJdk9JqEq7TxFKE\n", "vaA39rEeVMc=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap f3336 = new HashMap();

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0264 m626(Object obj, C1091 c1091) {
        InterfaceC0264 interfaceC0264;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        Class<?> cls = obj.getClass();
        C1103 c1103 = c1091.f3400;
        c1103.f3480 = cls;
        C0796 c0796 = (C0796) this.f3336.get(c1103);
        if (c0796 != null) {
            try {
                Object obj2 = obj;
                C1179 c1179 = null;
                for (Field field : (List) c0796.f2544.get(0)) {
                    Object obj3 = WeakReference.class.isAssignableFrom(field.getType()) ? ((WeakReference) field.get(obj2)).get() : field.get(obj2);
                    C1179 c11792 = new C1179(field, obj2, c1179);
                    obj2 = obj3;
                    c1179 = c11792;
                }
                interfaceC0264 = m623(c1179, c0796, 1);
            } catch (Exception e) {
                String str = this.f3337;
                AbstractC0420.m252(str, str, StringFog.decrypt("yRS0jqgy4oT4Eq+PvTLKg+YDpZWce+CN6Eagk7V/pZHtEq4=\n", "jGbG4doSheE=\n"), e, null, false);
                interfaceC0264 = null;
            }
            if (interfaceC0264 != null) {
                try {
                    z = c1091.f3399.mo64(interfaceC0264);
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(StringFog.decrypt("os9OOlUD9IGrzRskUFf6063OGw==\n", "xKA7VDEjkvM=\n"));
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    m627(interfaceC0264, obj, AbstractC1133.m662("xtc=\n", "q6ROG4Kqi8I=\n", sb));
                    return interfaceC0264;
                }
            }
            AbstractC0420.m243(this.f3337, obj + StringFog.decrypt("9f9pSe7O4lemrGo=\n", "z98ZKJqmwjo=\n"));
            this.f3336.remove(c1103);
        }
        C1087 c1087 = new C1087(c1091);
        InterfaceC0264 m625 = m625(obj, c1087, 0, (C1179) null);
        if (m625 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("7EjB/J843CDmB9yy2Q==\n", "gie13PlXqU4=\n"));
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(StringFog.decrypt("535VsA==\n", "ig15kCOGvEc=\n"));
            sb2.append(c1087.f3392.size());
            m627((InterfaceC0264) null, obj, AbstractC1133.m662("G7sfJBGk9ZEbvRNuB6L1\n", "O9R9TnTHgeI=\n", sb2));
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(StringFog.decrypt("gKEl3qMWKmjG\n", "5s5QsMc2QwY=\n"));
        sb3.append(System.currentTimeMillis() - currentTimeMillis);
        sb3.append(StringFog.decrypt("EKZo9g==\n", "fdVE1rGJNYk=\n"));
        sb3.append(c1087.f3392.size());
        m627(m625, obj, AbstractC1133.m662("7plUQz3/1nnun1gJK/nW\n", "zvY2KVicogo=\n", sb3));
        this.f3336.put(c1103, c1087.f3393);
        return m625;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091 A[Catch: Exception -> 0x0043, TryCatch #0 {Exception -> 0x0043, blocks: (B:35:0x004f, B:37:0x0053, B:14:0x0087, B:15:0x008b, B:17:0x0091, B:19:0x00a3, B:21:0x00b2, B:22:0x00ae, B:27:0x00bc, B:38:0x005c, B:40:0x0060, B:41:0x0069, B:43:0x0073), top: B:34:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0043 A[SYNTHETIC] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0264 m623(InterfaceC0264 interfaceC0264, C0796 c0796, int i) {
        C1179 c1179;
        Object obj;
        if (i >= c0796.f2544.size()) {
            return interfaceC0264;
        }
        List<Field> list = (List) c0796.f2544.get(i);
        C1179 c11792 = (C1179) interfaceC0264;
        Object m665 = c11792.m665();
        ArrayList m622 = m622(m665, true, true, true);
        if (m622 == null) {
            AbstractC0420.m243(this.f3337, StringFog.decrypt("iX03yh1MQx/sRijDEl1FD6VqKY8RSgY2rXVrjwxdRR6lcyLLXg==\n", "zAVHr344Jns=\n") + m665.getClass());
            return null;
        }
        Iterator it = m622.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (m665 != null) {
                try {
                    if (m665 instanceof Collection) {
                        c1179 = new C1179((Collection) m665, next, c11792);
                    } else if (m665 instanceof Map) {
                        c1179 = new C1179((Map) m665, next, c11792);
                    } else if (m665.getClass().isArray()) {
                        c1179 = new C1179(new ArrayList(Arrays.asList(m665)), next, c11792);
                    }
                    for (Field field : list) {
                        if (WeakReference.class.isAssignableFrom(field.getType())) {
                            obj = ((WeakReference) field.get(next)).get();
                        } else {
                            obj = field.get(next);
                        }
                        C1179 c11793 = new C1179(field, next, c1179);
                        next = obj;
                        c1179 = c11793;
                    }
                } catch (Exception unused) {
                    continue;
                }
                if (c1179 == null) {
                    return this.m623(c1179, c0796, i + 1);
                }
                continue;
            }
            c1179 = null;
            while (r7.hasNext()) {
            }
            if (c1179 == null) {
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0264 m625(Object obj, C1087 c1087, int i, C1179 c1179) {
        Field[] fieldArr;
        if (i != c1087.f3394.f3400.f3476 && obj != null && !c1087.f3392.contains(obj) && (i <= 0 || !(obj instanceof Activity))) {
            c1087.f3392.add(obj);
            try {
                S s = c1087.f3394.f3398;
                if (s != null) {
                    C0805 c0805 = C0267.m139().f488;
                    fieldArr = C0805.m461(obj.getClass(), true, -1, s.f102);
                } else {
                    Class<?> cls = obj.getClass();
                    C1091 c1091 = c1087.f3394;
                    int i2 = C1091.m646(i, c1091.f3400.f3474) ? c1091.f3400.f3473 : 0;
                    Field[] declaredFields = cls.getDeclaredFields();
                    for (int i3 = 0; cls != null && i3 != i2; i3++) {
                        cls = cls.getSuperclass();
                        if (cls != null) {
                            Field[] declaredFields2 = cls.getDeclaredFields();
                            String str = AbstractC0816.f2624;
                            int length = declaredFields.length;
                            int length2 = declaredFields2.length;
                            Field[] fieldArr2 = new Field[length + length2];
                            System.arraycopy(declaredFields, 0, fieldArr2, 0, length);
                            System.arraycopy(declaredFields2, 0, fieldArr2, length, length2);
                            declaredFields = fieldArr2;
                        }
                    }
                    fieldArr = declaredFields;
                }
                C0796 c0796 = c1087.f3393;
                for (Field field : fieldArr) {
                    field.setAccessible(true);
                    ((List) c0796.f2544.get(c0796.f2543)).add(field);
                    InterfaceC0264 m624 = m624(new C1179(field, obj, c1179), c1087, i);
                    if (m624 != null && !c1087.f3391) {
                        return m624;
                    }
                    ((List) c0796.f2544.get(c0796.f2543)).remove(field);
                }
            } catch (Throwable th) {
                String str2 = this.f3337;
                AbstractC0420.m252(str2, str2, StringFog.decrypt("75H2ym+PKdHel+3Leo8B1sCG59FbxivYzg==\n", "quOEpR2vTrQ=\n"), th, null, false);
            }
        }
        return null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final InterfaceC0264 m624(C1179 c1179, C1087 c1087, int i) {
        C1179 c11792;
        boolean z;
        Object m665 = c1179.m665();
        if (c1087.f3392.contains(m665) || c1087.f3390.contains(m665)) {
            return null;
        }
        if (C1091.m646(i, c1087.f3394.f3400.f3475)) {
            try {
                z = c1087.f3394.f3399.mo64(c1179);
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                if (c1087.f3391) {
                    c1087.f3389.add(c1179);
                    c1087.f3390.add(m665);
                }
                return c1179;
            }
        }
        if (m665 instanceof WeakReference) {
            WeakReference weakReference = (WeakReference) m665;
            if (weakReference.get() != null && C1091.m646(i, c1087.f3394.f3400.f3472)) {
                Object obj = weakReference.get();
                if (obj != null ? AbstractC0816.m506(obj.getClass(), c1087.f3394.f3400.f3477) : false) {
                    return m625(weakReference.get(), c1087, i + 1, c1179);
                }
            }
        }
        if (m665 != null ? AbstractC0816.m506(m665.getClass(), c1087.f3394.f3400.f3477) : false) {
            return m625(m665, c1087, i + 1, c1179);
        }
        if (c1087.f3394.f3400.f3468 && m665 != null) {
            c1087.f3392.add(m665);
        }
        C1091 c1091 = c1087.f3394;
        ArrayList m622 = m622(m665, C1091.m646(i, c1091.f3400.f3471), C1091.m646(i, c1091.f3400.f3470), C1091.m646(i, c1091.f3400.f3469));
        C0796 c0796 = c1087.f3393;
        if (m622 == null) {
            return null;
        }
        InterfaceC0264 interfaceC0264 = null;
        for (Object obj2 : m622) {
            if (m665 != null) {
                if (m665 instanceof Collection) {
                    c11792 = new C1179((Collection) m665, obj2, c1179);
                } else if (m665 instanceof Map) {
                    c11792 = new C1179((Map) m665, obj2, c1179);
                } else if (m665.getClass().isArray()) {
                    c11792 = new C1179(new ArrayList(Arrays.asList(m665)), obj2, c1179);
                }
                int i2 = c0796.f2543 + 1;
                c0796.f2543 = i2;
                c0796.f2544.add(i2, new ArrayList());
                interfaceC0264 = m624(c11792, c1087, i);
                if (interfaceC0264 == null && !c1087.f3391) {
                    return interfaceC0264;
                }
                c0796.f2544.remove(c0796.f2543);
                c0796.f2543--;
            }
            c11792 = null;
            int i22 = c0796.f2543 + 1;
            c0796.f2543 = i22;
            c0796.f2544.add(i22, new ArrayList());
            interfaceC0264 = m624(c11792, c1087, i);
            if (interfaceC0264 == null) {
            }
            c0796.f2544.remove(c0796.f2543);
            c0796.f2543--;
        }
        return interfaceC0264;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m622(Object obj, boolean z, boolean z2, boolean z3) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Collection) && z) {
            return new ArrayList((Collection) obj);
        }
        if (obj.getClass().isArray() && z3) {
            return new ArrayList(Arrays.asList(obj));
        }
        if (!(obj instanceof Map) || !z2) {
            return null;
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.values());
        arrayList.addAll(map.keySet());
        return arrayList;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m621(Object obj, Class cls, String str) {
        if (cls == null || cls.equals(Object.class)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Field field : cls.getDeclaredFields()) {
            if (field.getType().equals(String.class)) {
                arrayList.add(field);
            }
        }
        for (Field field2 : (Field[]) arrayList.toArray(new Field[0])) {
            field2.setAccessible(true);
            try {
                String str2 = (String) field2.get(obj);
                if (str2 != null && Pattern.compile(str).matcher(str2).matches()) {
                    return str2;
                }
            } catch (Exception unused) {
            }
        }
        return m621(obj, cls.getSuperclass(), str);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m627(InterfaceC0264 interfaceC0264, Object obj, String str) {
        String str2 = this.f3337;
        if (interfaceC0264 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            StringBuilder m642 = AbstractC1072.m642("TSw=\n", "dwyMC639bJA=\n", sb, str);
            m642.append(StringFog.decrypt("1PgRm15NFr8=\n", "+Nhn+jI4c58=\n"));
            m642.append(((C1179) interfaceC0264).m665());
            AbstractC0420.m244(str2, m642.toString());
            return;
        }
        AbstractC0420.m244(str2, obj + StringFog.decrypt("s2U=\n", "iUU9RaVxgPY=\n") + str);
    }
}
