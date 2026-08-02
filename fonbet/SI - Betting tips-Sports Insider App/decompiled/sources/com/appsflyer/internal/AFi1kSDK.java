package com.appsflyer.internal;

import com.appsflyer.internal.platform_extension.PluginInfo;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface AFi1kSDK {
    @NotNull
    Map<String, Object> getCurrencyIso4217Code();

    void getRevenue(@NotNull PluginInfo pluginInfo);
}
