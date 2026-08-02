package com.google.android.gms.internal.pal;

import com.ironsource.U3;
import defpackage.i2a;
import defpackage.r7n;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class b {
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            r7n r7nVar = zzaby.b;
            sb.append(i2a.L(new r7n(((String) obj).getBytes(zzadg.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzaby) {
            sb.append(": \"");
            sb.append(i2a.L((zzaby) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzacz) {
            sb.append(" {");
            c((zzacz) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
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
        int i4 = i + 2;
        a(sb, i4, U3.i.W, entry.getKey());
        a(sb, i4, U3.i.X, entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void c(zzacz zzaczVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : zzaczVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(substring.substring(1, substring.length() - 4));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, i, b(concat), zzacz.d(method2, zzaczVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(substring.substring(1, substring.length() - 3));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, i, b(concat2), zzacz.d(method3, zzaczVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(substring.substring(1));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object d = zzacz.d(method4, zzaczVar, new Object[0]);
                    if (method5 == null) {
                        if (d instanceof Boolean) {
                            if (((Boolean) d).booleanValue()) {
                                a(sb, i, b(concat3), d);
                            }
                        } else if (d instanceof Integer) {
                            if (((Integer) d).intValue() != 0) {
                                a(sb, i, b(concat3), d);
                            }
                        } else if (d instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) d).floatValue()) != 0) {
                                a(sb, i, b(concat3), d);
                            }
                        } else if (!(d instanceof Double)) {
                            if (d instanceof String) {
                                equals = d.equals("");
                            } else if (d instanceof zzaby) {
                                equals = d.equals(zzaby.b);
                            } else if (!(d instanceof zzaef)) {
                                if ((d instanceof Enum) && ((Enum) d).ordinal() == 0) {
                                }
                                a(sb, i, b(concat3), d);
                            } else if (d != ((zzaef) d).n()) {
                                a(sb, i, b(concat3), d);
                            }
                            if (!equals) {
                                a(sb, i, b(concat3), d);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) d).doubleValue()) != 0) {
                            a(sb, i, b(concat3), d);
                        }
                    } else if (((Boolean) zzacz.d(method5, zzaczVar, new Object[0])).booleanValue()) {
                        a(sb, i, b(concat3), d);
                    }
                }
            }
        }
        if (zzaczVar instanceof zzacw) {
            throw null;
        }
        zzafj zzafjVar = zzaczVar.zzc;
        if (zzafjVar != null) {
            for (int i2 = 0; i2 < zzafjVar.a; i2++) {
                a(sb, i, String.valueOf(zzafjVar.b[i2] >>> 3), zzafjVar.c[i2]);
            }
        }
    }
}
