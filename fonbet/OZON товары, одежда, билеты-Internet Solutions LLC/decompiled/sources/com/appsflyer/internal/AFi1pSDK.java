package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.Plugin;
import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class AFi1pSDK implements AFi1qSDK {

    @NotNull
    private PluginInfo AFInAppEventParameterName = new PluginInfo(Plugin.NATIVE, "6.13.1", null, 4, null);

    @Override // com.appsflyer.internal.AFi1qSDK
    public final void AFInAppEventType(@NotNull PluginInfo pluginInfo) {
        Intrinsics.checkNotNullParameter(pluginInfo, "");
        this.AFInAppEventParameterName = pluginInfo;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    @NotNull
    public final Map<String, Object> valueOf() {
        LinkedHashMap l11 = U.l(new Pair("platform", this.AFInAppEventParameterName.getPlugin().getPluginName()), new Pair("version", this.AFInAppEventParameterName.getVersion()));
        if (!this.AFInAppEventParameterName.getAdditionalParams().isEmpty()) {
            l11.put("extras", this.AFInAppEventParameterName.getAdditionalParams());
        }
        return l11;
    }
}
