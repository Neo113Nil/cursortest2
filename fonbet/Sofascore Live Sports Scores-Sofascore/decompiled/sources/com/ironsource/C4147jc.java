package com.ironsource;

import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4147jc {

    @NotNull
    private final ConcurrentHashMap<String, JSONObject> a;

    public /* synthetic */ C4147jc(ConcurrentHashMap concurrentHashMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : concurrentHashMap);
    }

    public final void a(@Nullable AdapterBaseWrapper adapterBaseWrapper) {
        Set<Map.Entry<String, JSONObject>> entrySet = this.a.entrySet();
        entrySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), adapterBaseWrapper)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            AdapterBaseInterface adapterBaseInterface = adapterBaseWrapper != null ? adapterBaseWrapper.getAdapterBaseInterface() : null;
            adapterBaseInterface.getClass();
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            ((AdapterNetworkDataInterface) adapterBaseInterface).setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4147jc) && Intrinsics.c(this.a, ((C4147jc) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "NetworkDataStore(networkDataMap=" + this.a + ")";
    }

    public C4147jc(@NotNull ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        concurrentHashMap.getClass();
        this.a = concurrentHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4147jc() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final C4147jc a(@NotNull ConcurrentHashMap<String, JSONObject> concurrentHashMap) {
        concurrentHashMap.getClass();
        return new C4147jc(concurrentHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4147jc a(C4147jc c4147jc, ConcurrentHashMap concurrentHashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            concurrentHashMap = c4147jc.a;
        }
        return c4147jc.a((ConcurrentHashMap<String, JSONObject>) concurrentHashMap);
    }

    public final void a(@NotNull com.ironsource.mediationsdk.t tVar) {
        tVar.getClass();
        boolean containsKey = this.a.containsKey(tVar.a());
        ConcurrentHashMap<String, JSONObject> concurrentHashMap = this.a;
        if (!containsKey) {
            concurrentHashMap.put(tVar.a(), tVar.allData());
            return;
        }
        try {
            String a = tVar.a();
            JSONObject jSONObject = this.a.get(tVar.a());
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject a2 = IronSourceUtils.a(jSONObject, tVar.allData());
            a2.getClass();
            concurrentHashMap.put(a, a2);
        } catch (Exception e) {
            IronLog.INTERNAL.error("error while merging network data: " + e.getMessage());
        }
    }

    public final void a(@NotNull AbstractAdapter abstractAdapter) {
        abstractAdapter.getClass();
        Set<Map.Entry<String, JSONObject>> entrySet = this.a.entrySet();
        entrySet.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            if (com.ironsource.mediationsdk.c.a((String) ((Map.Entry) obj).getKey(), abstractAdapter)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            abstractAdapter.setNetworkData(new com.ironsource.mediationsdk.t((String) key, (JSONObject) value));
        }
    }

    private final ConcurrentHashMap<String, JSONObject> a() {
        return this.a;
    }
}
