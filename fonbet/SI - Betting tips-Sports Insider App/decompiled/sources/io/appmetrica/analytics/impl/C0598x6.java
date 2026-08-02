package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.x6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0598x6 {

    /* renamed from: a, reason: collision with root package name */
    public final Tl f14908a = new Tl();

    /* renamed from: b, reason: collision with root package name */
    public Map f14909b = kotlin.collections.n0.c();

    /* renamed from: c, reason: collision with root package name */
    public Map f14910c = kotlin.collections.n0.c();

    /* renamed from: d, reason: collision with root package name */
    public IdentifiersResult f14911d;

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: all -> 0x0009, TRY_ENTER, TryCatch #3 {all -> 0x0009, blocks: (B:3:0x0001, B:5:0x0006, B:7:0x000f, B:10:0x0016, B:12:0x001a, B:18:0x0022, B:22:0x0059, B:23:0x006e, B:25:0x0074, B:29:0x0093, B:30:0x008e, B:33:0x00a6, B:34:0x00bd, B:36:0x00c3, B:40:0x00e5, B:42:0x00e7, B:49:0x00eb, B:51:0x00a2, B:52:0x002a), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(IdentifiersResult identifiersResult) {
        HashMap hashMap;
        Map c2;
        RandomAccess a7;
        try {
            IdentifiersResult identifiersResult2 = this.f14911d;
            String str = identifiersResult2 != null ? identifiersResult2.f15009id : null;
            if (str != null) {
                if (str.length() != 0) {
                    String str2 = identifiersResult.f15009id;
                    if (str2 != null) {
                        if (str2.length() == 0) {
                        }
                    }
                }
            }
            this.f14911d = identifiersResult;
            String str3 = identifiersResult.f15009id;
            if (str3 == null) {
                hashMap = null;
            } else {
                hashMap = new HashMap();
                try {
                    JSONObject jSONObject = new JSONObject(str3);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        try {
                            ArrayList a10 = AbstractC0176gb.a(new JSONArray(jSONObject.optString(next)));
                            if (a10 != null) {
                                hashMap.put(next, a10);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (hashMap != null) {
                c2 = new LinkedHashMap(kotlin.collections.m0.a(hashMap.size()));
                for (Map.Entry entry : hashMap.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    c2.put(key, new IdentifiersResult(String.valueOf(lo.a((Collection) list) ? null : new JSONArray((Collection) list)), identifiersResult.status, identifiersResult.errorExplanation));
                }
            } else {
                c2 = kotlin.collections.n0.c();
            }
            this.f14910c = c2;
            LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.m0.a(c2.size()));
            for (Map.Entry entry2 : c2.entrySet()) {
                Object key2 = entry2.getKey();
                String str4 = ((IdentifiersResult) entry2.getValue()).f15009id;
                if (str4 != null) {
                    try {
                        a7 = AbstractC0176gb.a(new JSONArray(str4));
                    } catch (Throwable unused3) {
                    }
                    if (a7 != null) {
                        a7 = kotlin.collections.e0.f19204a;
                    }
                    linkedHashMap.put(key2, a7);
                }
                a7 = null;
                if (a7 != null) {
                }
                linkedHashMap.put(key2, a7);
            }
            this.f14909b = linkedHashMap;
        } finally {
        }
    }

    public final synchronized void a(List list, HashMap hashMap) {
        IdentifierStatus identifierStatus;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                List list2 = (List) this.f14909b.get(str);
                if (list2 != null && !list2.isEmpty()) {
                    linkedHashMap.put(str, list2);
                }
            }
            Tl tl = this.f14908a;
            String a7 = AbstractC0176gb.a((Map) linkedHashMap);
            IdentifiersResult identifiersResult = this.f14911d;
            if (identifiersResult == null || (identifierStatus = identifiersResult.status) == null) {
                identifierStatus = IdentifierStatus.UNKNOWN;
            }
            hashMap.put("appmetrica_custom_sdk_hosts", tl.a(new IdentifiersResult(a7, identifierStatus, identifiersResult != null ? identifiersResult.errorExplanation : null)));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
