package com.google.android.gms.internal.auth;

import com.ironsource.U3;
import defpackage.v2o;
import defpackage.z1a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class a {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(z1a.Z(new v2o(((String) obj).getBytes(zzfa.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzef) {
            sb.append(": \"");
            sb.append(z1a.Z((zzef) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb.append(" {");
            c((zzev) obj, sb, i + 2);
            sb.append("\n");
            b(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        a(sb, i3, U3.i.W, entry.getKey());
        a(sb, i3, U3.i.X, entry.getValue());
        sb.append("\n");
        b(i, sb);
        sb.append("}");
    }

    public static void b(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void c(zzev zzevVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzevVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), zzev.b(method2, zzevVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), zzev.b(method, zzevVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object b = zzev.b(method4, zzevVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzev.b(method5, zzevVar, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, b);
                    } else if (b instanceof Boolean) {
                        if (!((Boolean) b).booleanValue()) {
                        }
                        a(sb, i, substring, b);
                    } else if (b instanceof Integer) {
                        if (((Integer) b).intValue() == 0) {
                        }
                        a(sb, i, substring, b);
                    } else if (b instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) b).floatValue()) == 0) {
                        }
                        a(sb, i, substring, b);
                    } else if (b instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) b).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, b);
                    } else {
                        if (b instanceof String) {
                            equals = b.equals("");
                        } else if (b instanceof zzef) {
                            equals = b.equals(zzef.b);
                        } else if (b instanceof zzfx) {
                            if (b == ((zzfx) b).zze()) {
                            }
                            a(sb, i, substring, b);
                        } else {
                            if ((b instanceof Enum) && ((Enum) b).ordinal() == 0) {
                            }
                            a(sb, i, substring, b);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, b);
                    }
                }
            }
            i2 = i3;
        }
        if (zzevVar instanceof zzeu) {
            throw null;
        }
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != null) {
            for (int i5 = 0; i5 < zzhaVar.a; i5++) {
                a(sb, i, String.valueOf(zzhaVar.b[i5] >>> 3), zzhaVar.c[i5]);
            }
        }
    }
}
