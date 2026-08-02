package com.ironsource;

import android.content.Context;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.pc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4255pc implements InterfaceC4237oc {
    @Override // com.ironsource.InterfaceC4237oc
    public void a(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        context.getClass();
        str.getClass();
        str2.getClass();
        map.getClass();
        IronSourceNetwork.initSDK(context, str, str2, map);
    }

    @Override // com.ironsource.InterfaceC4237oc
    public void b(@NotNull String str) {
        str.getClass();
        SDKUtils.setControllerUrl(str);
    }

    @Override // com.ironsource.InterfaceC4237oc
    public void a(@NotNull Lc lc) {
        lc.getClass();
        IronSourceNetwork.addInitListener(lc);
    }

    @Override // com.ironsource.InterfaceC4237oc
    public void a(@NotNull String str) {
        str.getClass();
        SDKUtils.setControllerConfig(str);
    }

    @Override // com.ironsource.InterfaceC4237oc
    public void a(int i) {
        SDKUtils.setDebugMode(i);
    }
}
