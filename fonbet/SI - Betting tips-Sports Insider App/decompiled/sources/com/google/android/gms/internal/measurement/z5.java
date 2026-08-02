package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f5379a;

    static {
        char[] cArr = new char[80];
        f5379a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i5, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i5, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i5, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i5, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            w4 w4Var = w4.f5334c;
            sb2.append(h8.b.T(new w4(((String) obj).getBytes(n5.f5148a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof w4) {
            sb2.append(": \"");
            sb2.append(h8.b.T((w4) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof g5) {
            sb2.append(" {");
            b((g5) obj, sb2, i5 + 2);
            sb2.append("\n");
            c(i5, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i11 = i5 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i11, "key", entry.getKey());
        a(sb2, i11, "value", entry.getValue());
        sb2.append("\n");
        c(i5, sb2);
        sb2.append("}");
    }

    public static void b(g5 g5Var, StringBuilder sb2, int i5) {
        int i10;
        int i11;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = g5Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i10 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
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
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i10);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i11 = i10;
            } else {
                i11 = i10;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i5, substring.substring(0, substring.length() - 4), g5.n(method2, g5Var, new Object[0]));
                    i10 = i11;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i5, substring.substring(0, substring.length() - 3), g5.n(method, g5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n9 = g5.n(method4, g5Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) g5.n(method5, g5Var, new Object[0])).booleanValue()) {
                        }
                        a(sb2, i5, substring, n9);
                    } else if (n9 instanceof Boolean) {
                        if (!((Boolean) n9).booleanValue()) {
                        }
                        a(sb2, i5, substring, n9);
                    } else if (n9 instanceof Integer) {
                        if (((Integer) n9).intValue() == 0) {
                        }
                        a(sb2, i5, substring, n9);
                    } else if (n9 instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) n9).floatValue()) == 0) {
                        }
                        a(sb2, i5, substring, n9);
                    } else if (n9 instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) n9).doubleValue()) == 0) {
                        }
                        a(sb2, i5, substring, n9);
                    } else {
                        if (n9 instanceof String) {
                            equals = n9.equals("");
                        } else if (n9 instanceof w4) {
                            equals = n9.equals(w4.f5334c);
                        } else if (n9 instanceof q4) {
                            if (n9 == ((g5) ((g5) ((q4) n9)).o(6))) {
                            }
                            a(sb2, i5, substring, n9);
                        } else {
                            if ((n9 instanceof Enum) && ((Enum) n9).ordinal() == 0) {
                            }
                            a(sb2, i5, substring, n9);
                        }
                        if (equals) {
                        }
                        a(sb2, i5, substring, n9);
                    }
                }
            }
            i10 = i11;
        }
        l6 l6Var = g5Var.zzc;
        if (l6Var != null) {
            for (int i13 = 0; i13 < l6Var.f5127a; i13++) {
                a(sb2, i5, String.valueOf(l6Var.f5128b[i13] >>> 3), l6Var.f5129c[i13]);
            }
        }
    }

    public static void c(int i5, StringBuilder sb2) {
        while (i5 > 0) {
            int i10 = 80;
            if (i5 <= 80) {
                i10 = i5;
            }
            sb2.append(f5379a, 0, i10);
            i5 -= i10;
        }
    }
}
