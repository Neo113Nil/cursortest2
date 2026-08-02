package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.h0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class InneractiveAdSpotManager {
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public static void destroy() {
        ConcurrentHashMap concurrentHashMap = get().a;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) concurrentHashMap.get((String) it.next());
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        concurrentHashMap.clear();
    }

    public static InneractiveAdSpotManager get() {
        return e.a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        h0 h0Var = new h0();
        this.a.put(h0Var.a, h0Var);
        return h0Var;
    }

    public InneractiveAdSpot getSpot(String str) {
        return (InneractiveAdSpot) this.a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
