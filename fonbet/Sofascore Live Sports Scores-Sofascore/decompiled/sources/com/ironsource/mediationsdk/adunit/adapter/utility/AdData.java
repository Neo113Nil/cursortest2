package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.ironsource.C4110ha;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.o;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class AdData {
    private final Map<String, Object> mAdUnitData;
    private final Map<String, Object> mConfiguration;
    private final String mServerData;

    public AdData(String str, Map<String, Object> map, Map<String, Object> map2) {
        this.mServerData = str;
        this.mConfiguration = map;
        this.mAdUnitData = map2;
    }

    public static AdData createAdDataForNetworkAdapter(@NotNull JSONObject jSONObject, @NotNull IronSource.a aVar, @Nullable String str, @Nullable o oVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adUnit", aVar);
        if (str != null) {
            hashMap.put("userId", str);
        }
        if (oVar != null) {
            hashMap.put("bannerSize", oVar.getSize());
        }
        return new AdData(null, C4110ha.a(jSONObject), hashMap);
    }

    public Map<String, Object> getAdUnitData() {
        return this.mAdUnitData;
    }

    public Boolean getBoolean(String str) {
        return (Boolean) this.mConfiguration.get(str);
    }

    public Map<String, Object> getConfiguration() {
        return this.mConfiguration;
    }

    public Integer getInt(String str) {
        return (Integer) this.mConfiguration.get(str);
    }

    public String getServerData() {
        return this.mServerData;
    }

    public String getString(String str) {
        return (String) this.mConfiguration.get(str);
    }

    public static AdData createAdDataForNetworkAdapter(@NotNull JSONObject jSONObject, @NotNull IronSource.a aVar, @Nullable String str) {
        return createAdDataForNetworkAdapter(jSONObject, aVar, str, null);
    }
}
