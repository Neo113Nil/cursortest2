package com.google.android.gms.internal.ads;

import com.ironsource.X3;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.1.0 */
/* loaded from: classes8.dex */
final class zzife {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzifc zzifcVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzc(zzifcVar, sb, 0);
        return sb.toString();
    }

    static void zzb(StringBuilder sb, int i, String str, Object obj) {
        String replace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzd(i, sb);
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
        if (!(obj instanceof String)) {
            if (obj instanceof zzicn) {
                sb.append(": \"");
                sb.append(zzigd.zza(((zzicn) obj).zzA()));
                sb.append('\"');
                return;
            }
            if (obj instanceof zzidr) {
                sb.append(" {");
                zzc((zzidr) obj, sb, i + 2);
                sb.append("\n");
                zzd(i, sb);
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
            zzb(sb, i3, "key", entry.getKey());
            zzb(sb, i3, "value", entry.getValue());
            sb.append("\n");
            zzd(i, sb);
            sb.append("}");
            return;
        }
        sb.append(": \"");
        String str2 = (String) obj;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < str2.length(); i4++) {
            char charAt2 = str2.charAt(i4);
            if (charAt2 < ' ' || charAt2 > '~') {
                replace = zzigd.zza(str2.getBytes(zziee.zza));
                break;
            }
            if (charAt2 == '\"') {
                z3 = true;
            } else if (charAt2 == '\'') {
                z2 = true;
            } else if (charAt2 == '\\') {
                z = true;
            }
        }
        if (z) {
            str2 = str2.replace("\\", "\\\\");
        }
        replace = z2 ? str2.replace("'", "\\'") : str2;
        if (z3) {
            replace = replace.replace("\"", "\\\"");
        }
        sb.append(replace);
        sb.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x018f, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0191, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019f, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b1, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c7, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        if (r13 != false) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(zzifc zzifcVar, StringBuilder sb, int i) {
        int i2;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzifcVar.getClass().getDeclaredMethods();
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
                zzb(sb, i, substring.substring(0, substring.length() - 4), zzidr.zzbB(method2, zzifcVar, new Object[0]));
            } else if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                String.valueOf(substring);
                if (hashSet.contains("set".concat(String.valueOf(substring)))) {
                    if (substring.endsWith("Bytes")) {
                        String substring2 = substring.substring(0, substring.length() - 5);
                        String.valueOf(substring2);
                        if (treeMap.containsKey("get".concat(String.valueOf(substring2)))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    String.valueOf(substring);
                    Method method5 = (Method) hashMap.get("has".concat(String.valueOf(substring)));
                    if (method4 != null) {
                        Object zzbB = zzidr.zzbB(method4, zzifcVar, new Object[0]);
                        if (method5 != null) {
                            booleanValue = ((Boolean) zzidr.zzbB(method5, zzifcVar, new Object[0])).booleanValue();
                        } else if (!(zzbB instanceof Boolean)) {
                            if (!(zzbB instanceof Integer)) {
                                if (!(zzbB instanceof Float)) {
                                    if (!(zzbB instanceof Double)) {
                                        if (zzbB instanceof String) {
                                            equals = zzbB.equals("");
                                        } else if (zzbB instanceof zzicn) {
                                            equals = zzbB.equals(zzicn.zza);
                                        } else {
                                            booleanValue = !(zzbB instanceof zzifc) ? true : true;
                                        }
                                    }
                                }
                            }
                        }
                        if (booleanValue) {
                            zzb(sb, i, substring, zzbB);
                        }
                    }
                }
            } else {
                zzb(sb, i, substring.substring(0, substring.length() - 3), zzidr.zzbB(method, zzifcVar, new Object[0]));
            }
            i2 = 3;
        }
        if (zzifcVar instanceof zzidn) {
            Iterator zzc = ((zzidn) zzifcVar).zza.zzc();
            while (zzc.hasNext()) {
                Map.Entry entry2 = (Map.Entry) zzc.next();
                int i4 = ((zzido) entry2.getKey()).zza;
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 2);
                sb2.append(X3.j.d);
                sb2.append(i4);
                sb2.append(X3.j.e);
                zzb(sb, i, sb2.toString(), entry2.getValue());
            }
        }
        zzigi zzigiVar = ((zzidr) zzifcVar).zzt;
        if (zzigiVar != null) {
            zzigiVar.zzj(sb, i);
        }
    }

    private static void zzd(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }
}
