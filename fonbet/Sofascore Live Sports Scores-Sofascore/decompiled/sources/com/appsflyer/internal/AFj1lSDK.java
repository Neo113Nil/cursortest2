package com.appsflyer.internal;

import com.appsflyer.share.platform_extension.Plugin;
import com.appsflyer.share.platform_extension.PluginInfo;
import com.ironsource.L6;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import defpackage.joa;
import defpackage.tub;
import defpackage.ypa;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1lSDK implements AFj1mSDK {

    @NotNull
    private final joa AFKeystoreWrapper = ypa.b(new com.appsflyer.c(5));

    @Nullable
    private PluginInfo AFLogger;

    /* JADX INFO: Access modifiers changed from: private */
    public static final PluginInfo AFKeystoreWrapper() {
        return new PluginInfo(Plugin.NATIVE, "7.0.0", null, 4, null);
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    @NotNull
    public final String d() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        return pluginInfo.getPlugin().getPluginName();
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    @NotNull
    public final Map<String, Object> registerClient() {
        PluginInfo pluginInfo = this.AFLogger;
        if (pluginInfo == null) {
            pluginInfo = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        Pair pair = new Pair(L6.H, pluginInfo.getPlugin().getPluginName());
        PluginInfo pluginInfo2 = this.AFLogger;
        if (pluginInfo2 == null) {
            pluginInfo2 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        LinkedHashMap i = tub.i(pair, new Pair("version", pluginInfo2.getVersion()));
        PluginInfo pluginInfo3 = this.AFLogger;
        if (pluginInfo3 == null) {
            pluginInfo3 = (PluginInfo) this.AFKeystoreWrapper.getValue();
        }
        if (!pluginInfo3.getAdditionalParams().isEmpty()) {
            PluginInfo pluginInfo4 = this.AFLogger;
            if (pluginInfo4 == null) {
                pluginInfo4 = (PluginInfo) this.AFKeystoreWrapper.getValue();
            }
            i.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, pluginInfo4.getAdditionalParams());
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFj1mSDK
    public final void unregisterClient(@NotNull PluginInfo pluginInfo) {
        pluginInfo.getClass();
        this.AFLogger = pluginInfo;
    }
}
