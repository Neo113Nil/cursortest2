package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class w3 {
    private static final HashMap d = new HashMap();
    private static final Object e = new Object();
    private static final HashMap f = new HashMap();
    private static final Object g = new Object();
    private static final HashMap h = new LinkedHashMap();
    private static final Object i = new Object();
    private final com.applovin.impl.sdk.l a;
    private final JSONObject b = a(t3.D8);
    private final JSONObject c = a(t3.C8);

    public w3(com.applovin.impl.sdk.l lVar) {
        this.a = lVar;
        a((String) c5.a(b5.K, (Object) null, com.applovin.impl.sdk.l.p()), v3.a.AD_UNIT_ID);
        a((String) c5.a(b5.L, (Object) null, com.applovin.impl.sdk.l.p()), v3.a.AD_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l, Long l2) {
        return l;
    }

    private JSONObject a(z4 z4Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.a.a(z4Var), new JSONObject());
    }

    private Map b(u3 u3Var, v3 v3Var, u3.b bVar) {
        if (!a(u3Var, v3Var, bVar) || !b(u3Var, v3Var)) {
            return null;
        }
        String b = v3Var.b();
        HashMap a = a(v3Var.a());
        Object b2 = b(v3Var.a());
        HashMap hashMap = new HashMap();
        synchronized (b2) {
            if (v3Var instanceof s3) {
                a((s3) v3Var, a);
            }
            HashMap hashMap2 = (HashMap) a.get(b);
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                a.put(b, hashMap2);
            }
            Iterator it = u3Var.b().iterator();
            while (it.hasNext()) {
                String b3 = ((u3.a) it.next()).b();
                HashMap hashMap3 = (HashMap) hashMap2.get(b3);
                if (hashMap3 == null) {
                    hashMap3 = new HashMap();
                    hashMap2.put(b3, hashMap3);
                }
                Object a2 = bVar.a(hashMap3.get(u3Var));
                hashMap3.put(u3Var, a2);
                hashMap.put(b3, a2);
            }
        }
        Boolean bool = (Boolean) this.a.a(t3.F8);
        if (u3Var.a(u3.a.INSTALL) && bool.booleanValue()) {
            b(v3Var);
        }
        return hashMap;
    }

    private b5 c(v3.a aVar) {
        if (aVar == v3.a.AD_UNIT_ID) {
            return b5.K;
        }
        if (aVar == v3.a.AD_FORMAT) {
            return b5.L;
        }
        return null;
    }

    public Map a(u3 u3Var, v3 v3Var) {
        return b(u3Var, v3Var, new u3.b() { // from class: com.applovin.impl.w3$$ExternalSyntheticLambda1
            @Override // com.applovin.impl.u3.b
            public final Object a(Object obj) {
                Long a;
                a = w3.a((Long) obj);
                return a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l) {
        return Long.valueOf(l != null ? 1 + l.longValue() : 1L);
    }

    public void a(u3 u3Var, v3 v3Var, final Long l) {
        b(u3Var, v3Var, new u3.b() { // from class: com.applovin.impl.w3$$ExternalSyntheticLambda0
            @Override // com.applovin.impl.u3.b
            public final Object a(Object obj) {
                Long a;
                a = w3.a(l, (Long) obj);
                return a;
            }
        });
    }

    public Map a(u3 u3Var, v3.a aVar) {
        return a(u3Var, aVar, u3.a.SESSION);
    }

    private Map a(u3 u3Var, v3.a aVar, u3.a aVar2) {
        HashMap a = a(aVar);
        Object b = b(aVar);
        HashMap hashMap = new HashMap();
        synchronized (b) {
            for (String str : a.keySet()) {
                HashMap hashMap2 = (HashMap) a.get(str);
                String b2 = aVar2.b();
                if (hashMap2 != null && hashMap2.containsKey(b2)) {
                    HashMap hashMap3 = (HashMap) hashMap2.get(b2);
                    if (aVar == v3.a.AD) {
                        hashMap.put(l3.a(str).b(), hashMap3.get(u3Var));
                    } else {
                        hashMap.put(str, hashMap3.get(u3Var));
                    }
                }
            }
        }
        return hashMap;
    }

    private void a(s3 s3Var, Map map) {
        MaxAdFormat a = s3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.c, a.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (l3.a((String) it.next()).a().equals(a)) {
                i2++;
            }
        }
        if (i2 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i2 >= integer.intValue()) {
            if (l3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(a)) {
                it2.remove();
                i2--;
            }
        }
    }

    private Object b(v3.a aVar) {
        if (aVar == v3.a.AD_UNIT_ID) {
            return e;
        }
        if (aVar == v3.a.AD_FORMAT) {
            return g;
        }
        return i;
    }

    private boolean b(u3 u3Var, v3 v3Var) {
        Iterator<String> keys = this.b.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next.equals(v3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.b, next, new JSONArray()), u3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(v3.a aVar) {
        if (aVar == v3.a.AD_UNIT_ID) {
            return d;
        }
        if (aVar == v3.a.AD_FORMAT) {
            return f;
        }
        return h;
    }

    private void b(v3 v3Var) {
        b5 c = c(v3Var.a());
        if (c == null) {
            return;
        }
        c5.b(c, a((Map) a(v3Var)), com.applovin.impl.sdk.l.p());
    }

    private boolean a(u3 u3Var, v3 v3Var, u3.b bVar) {
        if (u3Var == null) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (v3Var == null) {
            this.a.Q();
            if (com.applovin.impl.sdk.p.a()) {
                this.a.Q().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.a.Q();
        if (com.applovin.impl.sdk.p.a()) {
            this.a.Q().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private HashMap a(v3 v3Var) {
        HashMap hashMap = new HashMap();
        HashMap a = a(v3Var.a());
        synchronized (b(v3Var.a())) {
            for (Map.Entry entry : a.entrySet()) {
                String str = (String) entry.getKey();
                HashMap hashMap2 = (HashMap) entry.getValue();
                if (!CollectionUtils.isEmpty(hashMap2)) {
                    HashMap hashMap3 = (HashMap) hashMap2.get(u3.a.INSTALL.b());
                    if (!CollectionUtils.isEmpty(hashMap3)) {
                        hashMap.put(str, new HashMap(hashMap3));
                    }
                }
            }
        }
        return hashMap;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                u3 u3Var = (u3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, u3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, v3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap a = a(aVar);
            Object b = b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (b) {
                for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                    String key = entry.getKey();
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                        u3 a2 = u3.a((String) entry2.getKey());
                        if (a2 != null) {
                            hashMap.put(a2, a(entry2.getValue()));
                        }
                    }
                    if (!CollectionUtils.isEmpty(hashMap)) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(u3.a.INSTALL.b(), hashMap);
                        a.put(key, hashMap2);
                    }
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
