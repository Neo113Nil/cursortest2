package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.IronSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface AdapterNetworkData {
    @NotNull
    JSONObject allData();

    @Nullable
    <T> T dataByKeyIgnoreCase(@NotNull String str, @NotNull Class<T> cls);

    @NotNull
    JSONObject networkDataByAdUnit(@NotNull IronSource.a aVar);
}
