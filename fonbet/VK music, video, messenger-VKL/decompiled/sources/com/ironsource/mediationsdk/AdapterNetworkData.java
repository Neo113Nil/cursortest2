package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public interface AdapterNetworkData {
    JSONObject allData();

    <T> T dataByKeyIgnoreCase(String str, Class<T> cls);

    JSONObject networkDataByAdUnit(IronSource.a aVar);
}
