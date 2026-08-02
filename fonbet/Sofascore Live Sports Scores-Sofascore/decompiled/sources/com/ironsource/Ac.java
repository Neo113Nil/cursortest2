package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ac implements InterfaceC4434zc {
    @Override // com.ironsource.InterfaceC4434zc
    public void a(@NotNull Activity activity, @NotNull J9 j9, @NotNull Map<String, String> map) {
        activity.getClass();
        j9.getClass();
        map.getClass();
        IronSourceNetwork.showAd(activity, j9, map);
    }

    @Override // com.ironsource.InterfaceC4434zc
    public boolean a(@NotNull J9 j9) {
        j9.getClass();
        return IronSourceNetwork.isAdAvailableForInstance(j9);
    }
}
