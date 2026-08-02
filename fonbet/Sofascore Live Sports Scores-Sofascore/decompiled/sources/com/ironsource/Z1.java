package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Z1 {
    public static final int c = -1;
    public static final int d = 0;
    private ConcurrentHashMap<String, ArrayList<a>> a = new ConcurrentHashMap<>();
    private int b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public Z1(List<NetworkSettings> list, int i) {
        this.b = i;
        for (NetworkSettings networkSettings : list) {
            this.a.put(networkSettings.getProviderName(), new ArrayList<>());
        }
    }

    public String a(String str) {
        ArrayList<a> arrayList = this.a.get(str);
        String str2 = "";
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<a> it = arrayList.iterator();
            str2 = "" + it.next().ordinal();
            while (it.hasNext()) {
                str2 = str2.concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR) + it.next().ordinal();
            }
        }
        return str2;
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.b == 0) {
            return;
        }
        for (String str : this.a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList<a> arrayList = this.a.get(str);
            if (this.b != -1 && arrayList.size() == this.b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
