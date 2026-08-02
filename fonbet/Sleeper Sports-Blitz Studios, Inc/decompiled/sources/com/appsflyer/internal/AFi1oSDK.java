package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFi1oSDK implements AFi1lSDK {
    private PluginInfo getRevenue = new PluginInfo(Plugin.NATIVE, "6.15.1", null, 4, null);

    @Override // com.appsflyer.internal.AFi1lSDK
    public final void AFAdRevenueData(PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.getRevenue = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1lSDK
    public final Map<String, Object> getRevenue() {
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("platform", this.getRevenue.getPlugin().getPluginName()), TuplesKt.to("version", this.getRevenue.getVersion()));
        if (!this.getRevenue.getAdditionalParams().isEmpty()) {
            mutableMapOf.put("extras", this.getRevenue.getAdditionalParams());
        }
        return mutableMapOf;
    }
}
