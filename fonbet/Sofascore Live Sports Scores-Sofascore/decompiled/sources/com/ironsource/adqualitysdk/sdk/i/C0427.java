package com.ironsource.adqualitysdk.sdk.i;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ԅ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0427 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int f1220;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List f1221;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final HashSet f1219 = new HashSet();

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f1218 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public int f1217 = 0;

    public C0427(List list, int i) {
        this.f1221 = list;
        this.f1220 = i;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m256(Object obj) {
        if (obj == null) {
            return true;
        }
        return obj instanceof String ? ((String) obj).isEmpty() : obj instanceof Number ? ((Number) obj).doubleValue() == 0.0d : obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Collection ? ((Collection) obj).isEmpty() : obj instanceof Map ? ((Map) obj).isEmpty() : obj.getClass().isArray() && Array.getLength(obj) == 0;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m258(Object obj) {
        String m257;
        if (obj instanceof WeakReference) {
            obj = ((WeakReference) obj).get();
        } else if (obj instanceof AtomicReference) {
            obj = ((AtomicReference) obj).get();
        }
        if (obj == null) {
            return StringFog.decrypt("G7KMNA==\n", "dcfgWIOEkf4=\n");
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() > 30) {
                if (this.f1218.contains(str)) {
                    return StringFog.decrypt("p/5fkmKBlg==\n", "hcI75xK/tH4=\n");
                }
                this.f1218.add(str);
            }
            return m257(str);
        }
        if ((obj instanceof Number) || (obj instanceof Boolean)) {
            return String.valueOf(obj);
        }
        if (obj instanceof Character) {
            return m257(String.valueOf(obj));
        }
        int i = 0;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            while (i < jSONArray.length()) {
                Object opt = jSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
                i++;
            }
            return m259((Collection) arrayList);
        }
        String str2 = null;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next, null));
            }
            return m260((Map) hashMap);
        }
        if (obj instanceof Map) {
            return m260((Map) obj);
        }
        if (obj instanceof Collection) {
            return m259((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            ArrayList arrayList2 = new ArrayList();
            while (i < Array.getLength(obj)) {
                arrayList2.add(Array.get(obj, i));
                i++;
            }
            return m259((Collection) arrayList2);
        }
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            HashMap hashMap2 = new HashMap();
            for (String str3 : bundle.keySet()) {
                hashMap2.put(str3, bundle.get(str3));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(StringFog.decrypt("QbVVewPzlO4YrShaGvyD8V+1Jjow9obpW7Uw\n", "OpcKGG+S550=\n"));
            sb.append(m260((Map) hashMap2));
            return AbstractC1133.m662("gg==\n", "/+gnqwmsoQU=\n", sb);
        }
        if (obj instanceof SharedPreferences) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(StringFog.decrypt("W/8SEkyAVbEC528iSIBUp0SNPxRGhFSnTr4oAgLNBJ1EvDkQAts=\n", "IN1NcSDhJsI=\n"));
            sb2.append(m260(((SharedPreferences) obj).getAll()));
            return AbstractC1133.m662("ag==\n", "F4Vt/YK7360=\n", sb2);
        }
        if (!AbstractC0816.m506(obj.getClass(), this.f1221)) {
            return m257(obj.getClass().getSimpleName() + StringFog.decrypt("cA==\n", "MNS2+w3MtwM=\n") + Integer.toHexString(obj.hashCode()));
        }
        if (this.f1217 > this.f1220 || this.f1219.contains(obj)) {
            return m257(obj.getClass().getSimpleName() + StringFog.decrypt("DQ==\n", "TRjY2M1Q/3U=\n") + Integer.toHexString(obj.hashCode()));
        }
        this.f1219.add(obj);
        this.f1217++;
        StringBuilder sb3 = new StringBuilder(StringFog.decrypt("ni/mI0D1gJzHNw==\n", "5Q25QCyU8+8=\n"));
        sb3.append(m257(obj.getClass().getSimpleName()));
        try {
            String obj2 = obj.toString();
            if (!TextUtils.isEmpty(obj2)) {
                String hexString = Integer.toHexString(obj.hashCode());
                if (!obj2.equals(obj.getClass().getName() + StringFog.decrypt("BA==\n", "RLyCZxv5e7w=\n") + hexString)) {
                    if (!obj2.equals(obj.getClass().getSimpleName() + StringFog.decrypt("HQ==\n", "XaMPMTbOqMk=\n") + hexString)) {
                        str2 = obj2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            sb3.append(StringFog.decrypt("Tco2r0EIQBkIhg75FA==\n", "Yehp2y5bNGs=\n"));
            if (str2.length() > 30) {
                if (this.f1218.contains(str2)) {
                    m257 = StringFog.decrypt("p/5fkmKBlg==\n", "hcI75xK/tH4=\n");
                    sb3.append(m257);
                } else {
                    this.f1218.add(str2);
                }
            }
            m257 = m257(str2);
            sb3.append(m257);
        }
        try {
            ArrayList arrayList3 = new ArrayList();
            for (Class<?> cls = obj.getClass(); cls != null && AbstractC0816.m506(cls, this.f1221); cls = cls.getSuperclass()) {
                arrayList3.addAll(Arrays.asList(cls.getDeclaredFields()));
            }
            Field[] fieldArr = (Field[]) arrayList3.toArray(new Field[0]);
            int length = fieldArr.length;
            while (i < length) {
                Field field = fieldArr[i];
                if (Modifier.isStatic(field.getModifiers())) {
                    Class<?> type = field.getType();
                    if (!type.isPrimitive()) {
                        if (type == String.class) {
                        }
                    }
                    i++;
                }
                field.setAccessible(true);
                Object obj3 = field.get(obj);
                if (obj3 instanceof WeakReference) {
                    obj3 = ((WeakReference) obj3).get();
                } else if (obj3 instanceof AtomicReference) {
                    obj3 = ((AtomicReference) obj3).get();
                }
                if (!m256(obj3)) {
                    sb3.append(StringFog.decrypt("w7w=\n", "7566V9bcoXI=\n"));
                    sb3.append(field.getName());
                    sb3.append(StringFog.decrypt("RnU=\n", "ZE8SPqW5Uo8=\n"));
                    sb3.append(m258(obj3));
                }
                i++;
            }
        } catch (Throwable unused2) {
        }
        this.f1217--;
        sb3.append(StringFog.decrypt("iQ==\n", "9E77Yx+8dvA=\n"));
        return sb3.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m260(Map map) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("+Q==\n", "grosmxQYwik=\n"));
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!m256(entry.getValue())) {
                if (!z) {
                    sb.append(StringFog.decrypt("iw==\n", "p0aYvpAVaZI=\n"));
                }
                sb.append(m257(String.valueOf(entry.getKey())));
                sb.append(StringFog.decrypt("GQ==\n", "IxdmSeHJJ2I=\n"));
                sb.append(m258(entry.getValue()));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("Bw==\n", "evi0eUbN8mI=\n"));
        return sb.toString();
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m257(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(StringFog.decrypt("1g==\n", "9I3cMhohhN4=\n"));
        sb.append(str.replace(StringFog.decrypt("9A==\n", "qBw1onIPRn8=\n"), StringFog.decrypt("nKk=\n", "wPWg/D0XSQU=\n")).replace(StringFog.decrypt("Ew==\n", "Mb1X7nHZI68=\n"), StringFog.decrypt("XQY=\n", "ASTZ3uVtgFA=\n")).replace("\n", StringFog.decrypt("arE=\n", "Nt98XEBCBms=\n")).replace("\r", StringFog.decrypt("3xI=\n", "g2ADyIIPJj8=\n")).replace("\t", StringFog.decrypt("uSU=\n", "5VH/bhFGX94=\n")));
        return AbstractC1133.m662("8g==\n", "0EgpmhPEKPI=\n", sb);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m259(Collection collection) {
        StringBuilder sb = new StringBuilder(StringFog.decrypt("jw==\n", "1C4Bi5qRAWU=\n"));
        boolean z = true;
        for (Object obj : collection) {
            if (!m256(obj)) {
                if (!z) {
                    sb.append(StringFog.decrypt("nQ==\n", "sUPnxZZJROg=\n"));
                }
                sb.append(m258(obj));
                z = false;
            }
        }
        sb.append(StringFog.decrypt("dw==\n", "KmuzieFo5ZY=\n"));
        return sb.toString();
    }
}
