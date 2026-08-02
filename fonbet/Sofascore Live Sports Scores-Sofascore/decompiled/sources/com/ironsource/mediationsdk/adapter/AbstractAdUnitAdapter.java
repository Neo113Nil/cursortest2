package com.ironsource.mediationsdk.adapter;

import com.appsflyer.internal.i;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }

    @NotNull
    public final String getAdUnitIdMissingErrorString(@NotNull String str) {
        return i.h(str, "Missing params - ", str);
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    @NotNull
    public final String getConfigStringValueFromKey(@NotNull JSONObject jSONObject, @NotNull String str) {
        jSONObject.getClass();
        str.getClass();
        String optString = jSONObject.optString(str);
        optString.getClass();
        return optString;
    }

    public final void postBackgroundThread(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(@NotNull Runnable runnable) {
        runnable.getClass();
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String str) {
    }
}
