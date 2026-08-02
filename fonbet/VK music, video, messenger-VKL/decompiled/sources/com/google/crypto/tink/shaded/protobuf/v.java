package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.huawei.hms.framework.common.BundleUtil;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import xsna.d02;
import xsna.ka20;

/* compiled from: MessageLiteToString.java */
/* loaded from: classes13.dex */
public final class v {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append(BundleUtil.UNDERLINE_TAG);
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
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
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            ByteString.g gVar = ByteString.b;
            sb.append(d02.s(new ByteString.g(((String) obj).getBytes(q.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(d02.s((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            c((GeneratedMessageLite) obj, sb, i + 2);
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
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ad, code lost:
    
        if (((java.lang.Integer) r4).intValue() == 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01af, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c1, code lost:
    
        if (((java.lang.Float) r4).floatValue() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d3, code lost:
    
        if (((java.lang.Double) r4).doubleValue() == ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker.DEFAULT_UPLINK_BITRATE) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(GeneratedMessageLite generatedMessageLite, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : generatedMessageLite.getClass().getDeclaredMethods()) {
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
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, a(str2), GeneratedMessageLite.k(method2, generatedMessageLite, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, a(str3), GeneratedMessageLite.k(method3, generatedMessageLite, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object k = GeneratedMessageLite.k(method4, generatedMessageLite, new Object[0]);
                    if (method5 == null) {
                        if (k instanceof Boolean) {
                            equals = !((Boolean) k).booleanValue();
                        } else if (!(k instanceof Integer)) {
                            if (!(k instanceof Float)) {
                                if (!(k instanceof Double)) {
                                    equals = k instanceof String ? k.equals("") : k instanceof ByteString ? k.equals(ByteString.b) : !(k instanceof ka20) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            z = false;
                        }
                    } else {
                        z = ((Boolean) GeneratedMessageLite.k(method5, generatedMessageLite, new Object[0])).booleanValue();
                    }
                    if (z) {
                        b(sb, i, a(str4), k);
                    }
                }
            }
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.c) {
            Iterator<Map.Entry<GeneratedMessageLite.d, Object>> i2 = ((GeneratedMessageLite.c) generatedMessageLite).extensions.i();
            while (i2.hasNext()) {
                Map.Entry<GeneratedMessageLite.d, Object> next = i2.next();
                next.getKey().getClass();
                b(sb, i, "[0]", next.getValue());
            }
        }
        f0 f0Var = generatedMessageLite.unknownFields;
        if (f0Var != null) {
            for (int i3 = 0; i3 < f0Var.a; i3++) {
                b(sb, i, String.valueOf(f0Var.b[i3] >>> 3), f0Var.c[i3]);
            }
        }
    }

    public static String d(GeneratedMessageLite generatedMessageLite, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(generatedMessageLite, sb, 0);
        return sb.toString();
    }
}
