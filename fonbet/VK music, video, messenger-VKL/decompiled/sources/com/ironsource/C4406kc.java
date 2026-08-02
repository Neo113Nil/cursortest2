package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import xsna.epx;
import xsna.zcl;

/* renamed from: com.ironsource.kc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4406kc {
    private final ConcurrentHashMap<String, JSONObject> a;

    /* JADX WARN: Multi-variable type inference failed */
    public C4406kc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4406kc) && epx.f(this.a, ((C4406kc) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.a + ")";
    }

    public C4406kc(ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public final C4406kc a(ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        return new C4406kc(concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4406kc a(C4406kc c4406kc, ConcurrentHashMap concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c4406kc.a;
        }
        return c4406kc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public /* synthetic */ C4406kc(ConcurrentHashMap concurrentHashMap, int i, zcl zclVar) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(com.ironsource.mediationsdk.t tVar) {
        if (!this.a.containsKey(tVar.a())) {
            this.a.put(tVar.a(), tVar.allData());
            return;
        }
        try {
            ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.a;
            String a = tVar.a();
            JSONObject jSONObject = this.a.get(tVar.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            concurrentHashMap.put(a, IronSourceUtils.a(jSONObject, tVar.allData()));
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    public final void a(AbstractAdapter abstractAdapter) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.a.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), abstractAdapter)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            abstractAdapter.setNetworkData(new com.ironsource.mediationsdk.t((String) entry.getKey(), (JSONObject) entry.getValue()));
        }
    }

    public final void a(AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.a.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((AdapterNetworkDataInterface) (adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null)).setNetworkData(new com.ironsource.mediationsdk.t((String) entry.getKey(), (JSONObject) entry.getValue()));
        }
    }
}
