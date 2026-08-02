package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import E0.C2942q;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes9.dex */
final class zbvo {
    private static final char[] zba;

    static {
        char[] cArr = new char[80];
        zba = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zba(zbvm zbvmVar, String str) {
        StringBuilder e11 = C2942q.e("# ", str);
        zbd(zbvmVar, e11, 0);
        return e11.toString();
    }

    static void zbb(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zbb(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zbb(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zbc(i11, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
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
            sb2.append(zbwj.zba(new zbtb(((String) obj).getBytes(zbuo.zba))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zbtc) {
            sb2.append(": \"");
            sb2.append(zbwj.zba((zbtc) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zbuf) {
            sb2.append(" {");
            zbd((zbuf) obj, sb2, i11 + 2);
            sb2.append("\n");
            zbc(i11, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i13 = i11 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zbb(sb2, i13, "key", entry.getKey());
        zbb(sb2, i13, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
        sb2.append("\n");
        zbc(i11, sb2);
        sb2.append("}");
    }

    private static void zbc(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(zba, 0, i12);
            i11 -= i12;
        }
    }

    private static void zbd(zbvm zbvmVar, StringBuilder sb2, int i11) {
        int i12;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zbvmVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
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
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i12);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zbb(sb2, i11, substring.substring(0, substring.length() - 4), zbuf.zbz(method2, zbvmVar, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zbb(sb2, i11, substring.substring(0, substring.length() - 3), zbuf.zbz(method, zbvmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zbz = zbuf.zbz(method4, zbvmVar, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) zbuf.zbz(method5, zbvmVar, new Object[0])).booleanValue()) {
                        }
                        zbb(sb2, i11, substring, zbz);
                    } else if (zbz instanceof Boolean) {
                        if (!((Boolean) zbz).booleanValue()) {
                        }
                        zbb(sb2, i11, substring, zbz);
                    } else if (zbz instanceof Integer) {
                        if (((Integer) zbz).intValue() == 0) {
                        }
                        zbb(sb2, i11, substring, zbz);
                    } else if (zbz instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) zbz).floatValue()) == 0) {
                        }
                        zbb(sb2, i11, substring, zbz);
                    } else if (zbz instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) zbz).doubleValue()) == 0) {
                        }
                        zbb(sb2, i11, substring, zbz);
                    } else {
                        if (zbz instanceof String) {
                            equals = zbz.equals("");
                        } else if (zbz instanceof zbtc) {
                            equals = zbz.equals(zbtc.zbb);
                        } else if (zbz instanceof zbvm) {
                            if (zbz == ((zbvm) zbz).zbm()) {
                            }
                            zbb(sb2, i11, substring, zbz);
                        } else {
                            if ((zbz instanceof Enum) && ((Enum) zbz).ordinal() == 0) {
                            }
                            zbb(sb2, i11, substring, zbz);
                        }
                        if (equals) {
                        }
                        zbb(sb2, i11, substring, zbz);
                    }
                }
            }
            i12 = 3;
        }
        if (zbvmVar instanceof zbub) {
            Iterator zbg = ((zbub) zbvmVar).zbb.zbg();
            while (zbg.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zbg.next();
                zbb(sb2, i11, "[32149011]", entry2.getValue());
            }
        }
        zbwm zbwmVar = ((zbuf) zbvmVar).zbc;
        if (zbwmVar != null) {
            zbwmVar.zbi(sb2, i11);
        }
    }
}
