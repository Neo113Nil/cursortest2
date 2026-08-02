package com.facebook.internal;

import android.os.Bundle;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class f {
    public static final HashMap a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(Boolean.class, new e(0));
        hashMap.put(Integer.class, new e(1));
        hashMap.put(Long.class, new e(2));
        hashMap.put(Double.class, new e(3));
        hashMap.put(String.class, new e(4));
        hashMap.put(String[].class, new e(5));
        hashMap.put(JSONArray.class, new e(6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Bundle a(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    e eVar = (e) a.get(obj.getClass());
                    if (eVar == null) {
                        zzl.i(obj.getClass(), "Unsupported type: ");
                        return null;
                    }
                    next.getClass();
                    int i = eVar.a;
                    next.getClass();
                    switch (i) {
                        case 0:
                            bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                            break;
                        case 1:
                            bundle.putInt(next, ((Integer) obj).intValue());
                            break;
                        case 2:
                            bundle.putLong(next, ((Long) obj).longValue());
                            break;
                        case 3:
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                            break;
                        case 4:
                            bundle.putString(next, (String) obj);
                            break;
                        case 5:
                            throw new IllegalArgumentException("Unexpected type from JSON");
                        default:
                            JSONArray jSONArray = (JSONArray) obj;
                            ArrayList arrayList = new ArrayList();
                            if (jSONArray.length() != 0) {
                                int length = jSONArray.length();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        bundle.putStringArrayList(next, arrayList);
                                        break;
                                    } else {
                                        Object obj2 = jSONArray.get(i2);
                                        if (!(obj2 instanceof String)) {
                                            zzl.i(obj2.getClass(), "Unexpected type in an array: ");
                                            break;
                                        } else {
                                            arrayList.add(obj2);
                                            i2++;
                                        }
                                    }
                                }
                            } else {
                                bundle.putStringArrayList(next, arrayList);
                                break;
                            }
                    }
                }
            }
        }
        return bundle;
    }
}
