package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.ironsource.U3;
import defpackage.fc6;
import defpackage.i2a;
import defpackage.wv8;
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
public abstract class w1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
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
            sb.append(i2a.w(ByteString.copyFromUtf8((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(i2a.w((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            c((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
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
        b(sb, i3, U3.i.W, entry.getKey());
        b(sb, i3, U3.i.X, entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0186, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0188, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019b, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean booleanValue;
        boolean equals;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            java.lang.reflect.Method method3 = declaredMethods[i4];
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
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (java.lang.reflect.Method) entry.getValue()) == null || !method2.getReturnType().equals(List.class)) {
                if (!substring.endsWith("Map") || substring.equals("Map") || (method = (java.lang.reflect.Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                        java.lang.reflect.Method method4 = (java.lang.reflect.Method) entry.getValue();
                        java.lang.reflect.Method method5 = (java.lang.reflect.Method) hashMap.get("has".concat(substring));
                        if (method4 != null) {
                            Object invokeOrDie = GeneratedMessageLite.invokeOrDie(method4, generatedMessageLite, new Object[0]);
                            if (method5 == null) {
                                booleanValue = true;
                                if (invokeOrDie instanceof Boolean) {
                                    equals = !((Boolean) invokeOrDie).booleanValue();
                                } else if (!(invokeOrDie instanceof Integer)) {
                                    if (!(invokeOrDie instanceof Float)) {
                                        if (!(invokeOrDie instanceof Double)) {
                                            equals = invokeOrDie instanceof String ? invokeOrDie.equals("") : invokeOrDie instanceof ByteString ? invokeOrDie.equals(ByteString.EMPTY) : !(invokeOrDie instanceof MessageLite) ? false : false;
                                        }
                                    }
                                }
                                if (equals) {
                                    booleanValue = false;
                                }
                            } else {
                                booleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, generatedMessageLite, new Object[0])).booleanValue();
                            }
                            if (booleanValue) {
                                b(sb, i, substring, invokeOrDie);
                            }
                        }
                    }
                } else {
                    i3 = 3;
                    b(sb, i, wv8.h(3, 0, substring), GeneratedMessageLite.invokeOrDie(method, generatedMessageLite, new Object[0]));
                }
                i2 = i3;
            } else {
                b(sb, i, wv8.h(4, 0, substring), GeneratedMessageLite.invokeOrDie(method2, generatedMessageLite, new Object[0]));
                i2 = 3;
            }
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator l = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.l();
            while (l.hasNext()) {
                Map.Entry entry2 = (Map.Entry) l.next();
                b(sb, i, fc6.h(((h1) entry2.getKey()).b, U3.j.e, new StringBuilder(U3.j.d)), entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.printWithIndent(sb, i);
        }
    }
}
