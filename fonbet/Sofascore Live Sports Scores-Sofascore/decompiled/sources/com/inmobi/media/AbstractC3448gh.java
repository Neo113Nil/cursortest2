package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.ironsource.U3;
import defpackage.dmi;
import defpackage.joa;
import defpackage.llf;
import defpackage.n1k;
import defpackage.oh0;
import defpackage.tub;
import defpackage.v6a;
import defpackage.wv8;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.gh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3448gh {
    public static final Map a = tub.h(new Pair("revenue", "getRevenue"), new Pair("revenue_precision", "getRevenuePrecision"), new Pair("network_name", "getNetworkName"), new Pair("dsp_name", "getDspName"), new Pair("max_ad_unit_id", "getAdUnitId"), new Pair("network_placement", "getNetworkPlacement"));
    public static final Map b = tub.h(new Pair(com.ironsource.mediationsdk.j.a, "ban"), new Pair("MREC", "ban"), new Pair("LEADER", "ban"), new Pair("INTER", "int"), new Pair("REWARDED", "rew"), new Pair("REWARDED_INTER", "rew"), new Pair("NATIVE", "nat"));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static final LinkedHashMap a(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        Object valueOf;
        Object valueOf2;
        jSONObject.getClass();
        publisherConfig.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (jSONObject.has(key)) {
                switch (value.hashCode()) {
                    case -1325958191:
                        if (value.equals("double")) {
                            valueOf2 = Double.valueOf(jSONObject.optDouble(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case -891985903:
                        if (value.equals("string")) {
                            valueOf2 = jSONObject.optString(key);
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 104431:
                        if (value.equals("int")) {
                            valueOf2 = Integer.valueOf(jSONObject.optInt(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3029738:
                        if (value.equals("bool")) {
                            valueOf2 = Boolean.valueOf(jSONObject.optBoolean(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                    case 3327612:
                        if (value.equals("long")) {
                            valueOf2 = Long.valueOf(jSONObject.optLong(key));
                            linkedHashMap.put(key, valueOf2);
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            JSONArray optJSONArray = jSONObject.optJSONArray(key2);
            if (optJSONArray != null) {
                String[] strArr = {"ban", "int", "rew", "nat"};
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String i2 = wv8.i(key2, "_", strArr[i]);
                    switch (value2.hashCode()) {
                        case -1325958191:
                            if (value2.equals("double")) {
                                valueOf = Double.valueOf(optJSONArray.optDouble(i));
                                linkedHashMap.put(i2, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case -891985903:
                            if (value2.equals("string")) {
                                valueOf = optJSONArray.optString(i);
                                linkedHashMap.put(i2, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 104431:
                            if (value2.equals("int")) {
                                valueOf = Integer.valueOf(optJSONArray.optInt(i));
                                linkedHashMap.put(i2, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3029738:
                            if (value2.equals("bool")) {
                                valueOf = Boolean.valueOf(optJSONArray.optBoolean(i));
                                linkedHashMap.put(i2, valueOf);
                                break;
                            } else {
                                break;
                            }
                        case 3327612:
                            if (value2.equals("long")) {
                                valueOf = Long.valueOf(optJSONArray.optLong(i));
                                linkedHashMap.put(i2, valueOf);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r7.isAssignableFrom(r6) != false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final n1k b(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        Object obj;
        Class<?> cls;
        boolean z;
        String str;
        Object obj2;
        Object invoke;
        String str2;
        map.getClass();
        publisherConfig.getClass();
        if (map.containsKey("obj_max") && (obj = map.get("obj_max")) != null) {
            cls = obj.getClass();
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    classLoader = ClassLoader.getSystemClassLoader();
                }
                Class<?> cls2 = Class.forName("com.applovin.mediation.MaxAd", false, classLoader);
                if (!cls2.isInstance(obj)) {
                }
                z = true;
            } catch (Throwable unused) {
            }
            if (z) {
                Object obj3 = map.get("obj_max");
                obj3.getClass();
                obj3.getClass();
                try {
                    invoke = obj3.getClass().getMethod("getFormat", null).invoke(obj3, null);
                } catch (Exception unused2) {
                    str = null;
                }
                if (invoke != null) {
                    Object invoke2 = invoke.getClass().getMethod("getLabel", null).invoke(invoke, null);
                    if (invoke2 instanceof String) {
                        str2 = (String) invoke2;
                        Map map2 = b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        str = (String) map2.get(str2);
                        if (str != null) {
                            Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid format for MaxAd object: " + obj3);
                            return new n1k("", null, "");
                        }
                        obj3.getClass();
                        publisherConfig.getClass();
                        JSONObject jSONObject = new JSONObject();
                        Class<?> cls3 = obj3.getClass();
                        for (Map.Entry<String, SignalsConfig.PublisherConfig.KeyData> entry : publisherConfig.getObj().getAllowedKeysAnd().entrySet()) {
                            String key = entry.getKey();
                            SignalsConfig.PublisherConfig.KeyData value = entry.getValue();
                            String str3 = (String) a.get(key);
                            if (str3 != null) {
                                try {
                                    obj2 = cls3.getMethod(str3, null).invoke(obj3, null);
                                } catch (Exception unused3) {
                                    obj2 = null;
                                }
                                if (obj2 != null) {
                                    String name = value.getName();
                                    Object a2 = a(obj2, value.getType(), publisherConfig.getObj().getPrecision(), publisherConfig.getObj().getStrLen());
                                    if (a2 == null) {
                                        a2 = a(value.getType());
                                    }
                                    jSONObject.put(name, a2);
                                } else {
                                    jSONObject.put(value.getName(), a(value.getType()));
                                }
                            }
                        }
                        jSONObject.put(b("obj_"), System.currentTimeMillis());
                        return new n1k("obj_".concat(str), jSONObject, str);
                    }
                }
                str2 = null;
                Map map22 = b;
                if (str2 == null) {
                }
                str = (String) map22.get(str2);
                if (str != null) {
                }
            }
        }
        Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new n1k("", null, "");
        z = a(cls);
        if (z) {
        }
        Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid obj_max for obj signal: " + map);
        return new n1k("", null, "");
    }

    public static final n1k c(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        map.getClass();
        publisherConfig.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = map.get("dir_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            Xb.a((byte) 1, "PubSignalsUtils", "Missing or invalid dir_type for Publisher signals");
            return new n1k("", null, "");
        }
        n1k a2 = a(map, publisherConfig.getDirect().getAllowedKeys(), publisherConfig.getDirect().getPrecision(), publisherConfig.getDirect().getStrLen());
        JSONObject jSONObject = (JSONObject) a2.a;
        List list = (List) a2.b;
        List list2 = (List) a2.c;
        jSONObject.put(b("dir_"), System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!Intrinsics.c((String) obj2, "dir_type")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Xb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it.next()) + " not supported");
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Xb.a((byte) 1, "PubSignalsUtils", "Publisher signal: " + ((String) it2.next()) + " invalid type");
        }
        String concat = "dir_".concat(str2);
        linkedHashMap.put(concat, jSONObject);
        return new n1k(concat, jSONObject, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r1.remove(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashMap d(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        Object a2;
        map.getClass();
        publisherConfig.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.putAll(map);
        for (Map.Entry<String, String> entry : publisherConfig.getGeneralKeys().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Object obj = map.get(key);
            if (obj != null && (a2 = a(obj, value)) != null) {
                linkedHashMap2.remove(key);
                linkedHashMap.put(key, a2);
            }
        }
        for (Map.Entry<String, String> entry2 : publisherConfig.getAdSpecificKeys().entrySet()) {
            String key2 = entry2.getKey();
            String value2 = entry2.getValue();
            String y = dmi.y(key2, "_ban");
            String y2 = dmi.y(key2, "_int");
            String y3 = dmi.y(key2, "_rew");
            String y4 = dmi.y(key2, "_nat");
            Object obj2 = map.get(y);
            Object a3 = obj2 != null ? a(obj2, value2) : null;
            Object obj3 = map.get(y2);
            Object a4 = obj3 != null ? a(obj3, value2) : null;
            Object obj4 = map.get(y3);
            Object a5 = obj4 != null ? a(obj4, value2) : null;
            Object obj5 = map.get(y4);
            Object a6 = obj5 != null ? a(obj5, value2) : null;
            if (a3 != null || a4 != null || a5 != null || a6 != null) {
                if (a4 != null) {
                    linkedHashMap2.remove(y2);
                }
                if (a5 != null) {
                    linkedHashMap2.remove(y3);
                }
                if (a6 != null) {
                    linkedHashMap2.remove(y4);
                }
                JSONArray jSONArray = new JSONArray();
                if (a3 == null) {
                    a3 = a(value2);
                }
                JSONArray put = jSONArray.put(a3);
                if (a4 == null) {
                    a4 = a(value2);
                }
                JSONArray put2 = put.put(a4);
                if (a5 == null) {
                    a5 = a(value2);
                }
                JSONArray put3 = put2.put(a5);
                if (a6 == null) {
                    a6 = a(value2);
                }
                linkedHashMap.put(key2, put3.put(a6));
            }
        }
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            Xb.a((byte) 1, "PubSignalsUtils", "Publisher Signal, " + ((String) entry3.getKey()) + U3.j.b + entry3.getValue() + " Not supported");
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap c(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            SignalsConfig.PublisherConfig.KeyData keyData = (SignalsConfig.PublisherConfig.KeyData) ((Map.Entry) it.next()).getValue();
            linkedHashMap.put(keyData.getName(), keyData.getType());
        }
        return linkedHashMap;
    }

    public static final n1k a(Map map, SignalsConfig.PublisherConfig publisherConfig) {
        map.getClass();
        publisherConfig.getClass();
        Object obj = map.get("auto_type");
        String str = obj instanceof String ? (String) obj : null;
        Map map2 = b;
        if (str == null) {
            str = "";
        }
        String str2 = (String) map2.get(str);
        if (str2 == null) {
            map.toString();
            return new n1k("", null, "");
        }
        JSONObject jSONObject = (JSONObject) a(map, c(publisherConfig.getAuto().getAllowedKeys()), publisherConfig.getAuto().getPrecision(), publisherConfig.getAuto().getStrLen()).a;
        jSONObject.put(b("auto_"), System.currentTimeMillis());
        return new n1k("auto_".concat(str2), jSONObject, str2);
    }

    public static final boolean a(Class cls) {
        cls.getClass();
        Class<?>[] interfaces = cls.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls2 : interfaces) {
            if (cls2.getName().equals("com.applovin.mediation.MaxAd") || a(cls2)) {
                return true;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        return a(superclass);
    }

    public static final n1k a(Map map, Map map2, int i, int i2) {
        map.getClass();
        map2.getClass();
        JSONObject jSONObject = new JSONObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            Object obj = map.get(str);
            if (obj != null) {
                Object a2 = a(obj, str2, i, i2);
                if (a2 != null) {
                    jSONObject.put(str, a2);
                    linkedHashMap.remove(str);
                } else {
                    jSONObject.put(str, a(str2));
                    arrayList.add(str);
                }
            }
        }
        return new n1k(jSONObject, CollectionsKt.S0(linkedHashMap.keySet()), arrayList);
    }

    public static final Pair b(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (!kotlin.text.c.v(str, "obj_", false) && !kotlin.text.c.v(str, "auto_", false) && !kotlin.text.c.v(str, "dir_", false)) {
                linkedHashMap.put(str, value);
            } else {
                linkedHashMap2.put(str, value);
            }
        }
        return new Pair(linkedHashMap, linkedHashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(Object obj, String str, int i, int i2) {
        obj.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -1881759115:
                if (str.equals("stringf") && (obj instanceof String)) {
                    return (String) obj;
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    Number number = obj instanceof Number ? (Number) obj : null;
                    if (number == null) {
                        return null;
                    }
                    double doubleValue = number.doubleValue();
                    if (Math.abs(doubleValue) <= Double.MAX_VALUE) {
                        int c = llf.c(i, 0, 15);
                        if (c == 0) {
                            doubleValue = doubleValue > 0.0d ? Math.floor(doubleValue) : Math.ceil(doubleValue);
                        } else {
                            doubleValue = BigDecimal.valueOf(doubleValue).movePointRight(c).setScale(0, RoundingMode.DOWN).movePointLeft(c).doubleValue();
                        }
                    }
                    return Double.valueOf(doubleValue);
                }
                return null;
            case -891985903:
                if (str.equals("string")) {
                    String str2 = obj instanceof String ? (String) obj : null;
                    if (str2 != null) {
                        return str2.length() > i2 ? str2.substring(0, i2) : str2;
                    }
                    return null;
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    Number number2 = obj instanceof Number ? (Number) obj : null;
                    if (number2 != null) {
                        return Integer.valueOf(number2.intValue());
                    }
                    return null;
                }
                return null;
            case 3029738:
                if (str.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    Number number3 = obj instanceof Number ? (Number) obj : null;
                    if (number3 != null) {
                        return Long.valueOf(number3.longValue());
                    }
                    return null;
                }
                return null;
            default:
                return null;
        }
    }

    public static final JSONObject b(JSONObject jSONObject, SignalsConfig.PublisherConfig publisherConfig) {
        jSONObject.getClass();
        publisherConfig.getClass();
        if (jSONObject.toString().length() <= publisherConfig.getPayloadSize()) {
            return jSONObject;
        }
        Xb.a((byte) 1, "PubSignalsUtils", "Publisher Signal payload size exceeded.");
        joa joaVar = AbstractC3286aa.a;
        AbstractC3286aa.a(new Q2(new IllegalStateException("Publisher signals size exceeds the limit")));
        return null;
    }

    public static final String b(String str) {
        str.getClass();
        if (Intrinsics.c(str, "auto_")) {
            return "auto_sts";
        }
        return Intrinsics.c(str, "obj_") ? "obj_ts" : "dir_ts";
    }

    public static final JSONObject a(JSONObject jSONObject, String str, JSONObject jSONObject2, int i) {
        jSONObject.getClass();
        str.getClass();
        jSONObject2.getClass();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        optJSONArray.put(jSONObject2);
        while (optJSONArray.length() > i) {
            optJSONArray.remove(0);
        }
        jSONObject.put(str, optJSONArray);
        return jSONObject;
    }

    public static final void a(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, Set set) {
        jSONObject.getClass();
        jSONObject2.getClass();
        str.getClass();
        str2.getClass();
        set.getClass();
        JSONArray optJSONArray = jSONObject2.optJSONArray(str2 + str);
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            JSONArray jSONArray = new JSONArray();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Object opt = optJSONObject.opt(str3);
                    if (opt == null) {
                        opt = com.ironsource.Y1.f;
                    }
                    jSONArray.put(opt);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(str3);
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            jSONObject.put(str3, optJSONArray2.put(jSONArray));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        if (r10.equals("string") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e8, code lost:
    
        r11 = r5.optString(r9, com.ironsource.Y1.f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        if (r10.equals("stringf") == false) goto L40;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map a(Map map, JSONObject jSONObject, String str, String str2, Map map2) {
        LinkedHashMap linkedHashMap;
        map.getClass();
        jSONObject.getClass();
        str.getClass();
        str2.getClass();
        map2.getClass();
        String concat = str.concat(str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
        linkedHashMap2.put(b(str), "long");
        JSONArray optJSONArray = jSONObject.optJSONArray(concat);
        if (optJSONArray != null) {
            IntRange j = llf.j(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList();
            v6a it = j.iterator();
            while (it.c) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(it.nextInt());
                if (optJSONObject != null) {
                    oh0 N = CollectionsKt.N(linkedHashMap2.keySet());
                    linkedHashMap = new LinkedHashMap();
                    for (Object obj : (Iterable) N.b) {
                        String str3 = (String) obj;
                        String str4 = (String) map2.get(str3);
                        Object obj2 = com.ironsource.Y1.f;
                        if (str4 != null) {
                            switch (str4.hashCode()) {
                                case -1881759115:
                                    break;
                                case -1325958191:
                                    if (str4.equals("double")) {
                                        obj2 = Double.valueOf(optJSONObject.optDouble(str3, Double.parseDouble(com.ironsource.Y1.f)));
                                        break;
                                    }
                                    break;
                                case -891985903:
                                    break;
                                case 104431:
                                    if (str4.equals("int")) {
                                        obj2 = Integer.valueOf(optJSONObject.optInt(str3, Integer.parseInt(com.ironsource.Y1.f)));
                                        break;
                                    }
                                    break;
                                case 3029738:
                                    if (str4.equals("bool")) {
                                        obj2 = Boolean.valueOf(optJSONObject.optBoolean(str3, Boolean.parseBoolean(com.ironsource.Y1.f)));
                                        break;
                                    }
                                    break;
                                case 3327612:
                                    if (str4.equals("long")) {
                                        obj2 = Long.valueOf(optJSONObject.optLong(str3, Long.parseLong(com.ironsource.Y1.f)));
                                        break;
                                    }
                                    break;
                            }
                            linkedHashMap.put(obj, obj2);
                        }
                        Object opt = optJSONObject.opt(str3);
                        if (opt != null) {
                            obj2 = opt;
                        }
                        linkedHashMap.put(obj, obj2);
                    }
                } else {
                    linkedHashMap = null;
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
            }
            if (!arrayList.isEmpty()) {
                map.put(str.concat(str2), arrayList);
            }
        }
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
    
        if (r3.equals("string") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if ((r2 instanceof java.lang.String) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        return (java.lang.String) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        if (r3.equals("stringf") == false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Object obj, String str) {
        obj.getClass();
        str.getClass();
        switch (str.hashCode()) {
            case -1881759115:
                break;
            case -1325958191:
                if (str.equals("double")) {
                    if (obj instanceof Double) {
                        return (Double) obj;
                    }
                    if (obj instanceof Integer) {
                        return Double.valueOf(((Number) obj).intValue());
                    }
                    if (obj instanceof Float) {
                        return Double.valueOf(((Number) obj).floatValue());
                    }
                    return null;
                }
                return null;
            case -891985903:
                break;
            case 104431:
                if (str.equals("int") && (obj instanceof Integer)) {
                    return (Integer) obj;
                }
                return null;
            case 3029738:
                if (str.equals("bool") && (obj instanceof Boolean)) {
                    return (Boolean) obj;
                }
                return null;
            case 3327612:
                if (str.equals("long") && (obj instanceof Long)) {
                    return (Long) obj;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1881759115:
                str.equals("stringf");
                return com.ironsource.Y1.f;
            case -1325958191:
                if (str.equals("double")) {
                    return Double.valueOf(Double.parseDouble(com.ironsource.Y1.f));
                }
                return com.ironsource.Y1.f;
            case -891985903:
                str.equals("string");
                return com.ironsource.Y1.f;
            case 104431:
                if (str.equals("int")) {
                    return Integer.valueOf(Integer.parseInt(com.ironsource.Y1.f));
                }
                return com.ironsource.Y1.f;
            case 3029738:
                str.equals("bool");
                return com.ironsource.Y1.f;
            case 3327612:
                if (str.equals("long")) {
                    return Long.valueOf(Long.parseLong(com.ironsource.Y1.f));
                }
                return com.ironsource.Y1.f;
            default:
                return com.ironsource.Y1.f;
        }
    }

    public static final JSONObject a(Map map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                jSONObject.put(str, value);
            } else if (value instanceof Integer) {
                jSONObject.put(str, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                jSONObject.put(str, ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                jSONObject.put(str, ((Number) value).doubleValue());
            } else if (value instanceof JSONArray) {
                jSONObject.put(str, value);
            } else if (value instanceof List) {
                JSONArray jSONArray = new JSONArray();
                for (Object obj : (Iterable) value) {
                    if (obj instanceof String) {
                        jSONArray.put(obj);
                    } else if (obj instanceof Integer) {
                        jSONArray.put(((Number) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        jSONArray.put(((Boolean) obj).booleanValue());
                    } else if (obj instanceof Double) {
                        jSONArray.put(((Number) obj).doubleValue());
                    } else if (obj instanceof Map) {
                        jSONArray.put(a((Map) obj));
                    }
                }
                jSONObject.put(str, jSONArray);
            } else {
                Unit unit = Unit.a;
            }
        }
        return jSONObject;
    }

    public static final JSONObject a(JSONObject jSONObject, String str, int i) {
        int i2;
        int i3;
        jSONObject.getClass();
        str.getClass();
        if (i <= 0) {
            return jSONObject;
        }
        String[] strArr = {"ban", "int", "rew", "nat"};
        int i4 = 0;
        while (i4 < 4) {
            String y = dmi.y(str, strArr[i4]);
            JSONArray optJSONArray = jSONObject.optJSONArray(y);
            if (optJSONArray == null) {
                i2 = i4;
            } else {
                JSONArray jSONArray = new JSONArray();
                String b2 = b(str);
                long currentTimeMillis = System.currentTimeMillis() - (i * 1000);
                int length = optJSONArray.length();
                int i5 = 0;
                while (i5 < length) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i5);
                    if (optJSONObject == null || !optJSONObject.has(b2)) {
                        i3 = i4;
                    } else {
                        b2.getClass();
                        i3 = i4;
                        if (optJSONObject.optLong(b2, 0L) >= currentTimeMillis) {
                            jSONArray.put(optJSONObject);
                        }
                    }
                    i5++;
                    i4 = i3;
                }
                i2 = i4;
                jSONObject.put(y, jSONArray);
            }
            i4 = i2 + 1;
        }
        return jSONObject;
    }
}
