package com.google.android.gms.internal.play_billing;

import com.ironsource.U3;
import defpackage.fc6;
import defpackage.v7a;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
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
        byte[] bArr;
        String replace;
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
            String str2 = (String) obj;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt2 = str2.charAt(i3);
                if (charAt2 < ' ' || charAt2 > '~') {
                    replace = v7a.I(str2.getBytes(StandardCharsets.UTF_8));
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
            return;
        }
        if (obj instanceof zzfp) {
            sb.append(": \"");
            zzfp zzfpVar = (zzfp) obj;
            int m = zzfpVar.m();
            if (m == 0) {
                bArr = zzgv.a;
            } else {
                byte[] bArr2 = new byte[m];
                zzfpVar.o(m, bArr2);
                bArr = bArr2;
            }
            sb.append(v7a.I(bArr));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgp) {
            sb.append(" {");
            c((zzgp) obj, sb, i + 2);
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
        int i4 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i4, U3.i.W, entry.getKey());
        a(sb, i4, U3.i.X, entry.getValue());
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

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0180, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x018e, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a0, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b6, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ce, code lost:
    
        if (r13 != false) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(zzgp zzgpVar, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgpVar.getClass().getDeclaredMethods();
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
                    a(sb, i, substring.substring(0, substring.length() - 4), zzgp.n(method2, zzgpVar, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), zzgp.n(method, zzgpVar, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n = zzgp.n(method4, zzgpVar, new Object[0]);
                    if (method5 != null) {
                        booleanValue = ((Boolean) zzgp.n(method5, zzgpVar, new Object[0])).booleanValue();
                    } else if (!(n instanceof Boolean)) {
                        if (!(n instanceof Integer)) {
                            if (!(n instanceof Float)) {
                                if (!(n instanceof Double)) {
                                    if (n instanceof String) {
                                        equals = n.equals("");
                                    } else if (n instanceof zzfp) {
                                        equals = n.equals(zzfp.b);
                                    } else {
                                        booleanValue = !(n instanceof zzhr) ? true : true;
                                    }
                                }
                            }
                        }
                    }
                    if (booleanValue) {
                        a(sb, i, substring, n);
                    }
                }
            }
            i2 = i3;
        }
        if (zzgpVar instanceof zzgm) {
            Iterator d = ((zzgm) zzgpVar).zzb.d();
            if (d.hasNext()) {
                throw fc6.d((Map.Entry) d.next());
            }
        }
        zzir zzirVar = zzgpVar.zzc;
        if (zzirVar != null) {
            for (int i5 = 0; i5 < zzirVar.a; i5++) {
                a(sb, i, String.valueOf(zzirVar.b[i5] >>> 3), zzirVar.c[i5]);
            }
        }
    }
}
