package com.google.android.gms.internal.consent_sdk;

import com.ironsource.U3;
import defpackage.fc6;
import defpackage.ufa;
import defpackage.v1p;
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
public abstract class c {
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
            v1p v1pVar = zzpm.b;
            sb.append(ufa.K(new v1p(((String) obj).getBytes(zzqs.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzpm) {
            sb.append(": \"");
            sb.append(ufa.K((zzpm) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzqm) {
            sb.append(" {");
            c((zzqm) obj, sb, i + 2);
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
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
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

    public static void c(zzqm zzqmVar, StringBuilder sb, int i) {
        int i2;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzqmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, i, substring.substring(0, substring.length() - 4), zzqm.j(method2, zzqmVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), zzqm.j(method, zzqmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object j = zzqm.j(method4, zzqmVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zzqm.j(method5, zzqmVar, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, j);
                    } else if (j instanceof Boolean) {
                        if (!((Boolean) j).booleanValue()) {
                        }
                        a(sb, i, substring, j);
                    } else if (j instanceof Integer) {
                        if (((Integer) j).intValue() == 0) {
                        }
                        a(sb, i, substring, j);
                    } else if (j instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) j).floatValue()) == 0) {
                        }
                        a(sb, i, substring, j);
                    } else if (j instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) j).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, j);
                    } else {
                        if (j instanceof String) {
                            equals = j.equals("");
                        } else if (j instanceof zzpm) {
                            equals = j.equals(zzpm.b);
                        } else if (j instanceof zzrq) {
                            if (j == ((zzrq) j).zzl()) {
                            }
                            a(sb, i, substring, j);
                        } else {
                            if ((j instanceof Enum) && ((Enum) j).ordinal() == 0) {
                            }
                            a(sb, i, substring, j);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, j);
                    }
                }
            }
            i2 = 3;
        }
        if (zzqmVar instanceof zzqk) {
            Iterator d = ((zzqk) zzqmVar).zzb.d();
            if (d.hasNext()) {
                throw fc6.d((Map.Entry) d.next());
            }
        }
    }
}
