package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.Gf;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.c;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class BaseAdAdapter<NetworkAdapter extends AdapterBaseInterface, Listener> {

    @NotNull
    private final LevelPlay.AdFormat mAdFormat;

    @Nullable
    protected final UUID mAdUnitObjectId;

    @NotNull
    protected final NetworkSettings mNetworkSettings;

    public BaseAdAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings, @NotNull UUID uuid) {
        this.mAdFormat = adFormat;
        this.mNetworkSettings = networkSettings;
        this.mAdUnitObjectId = uuid;
    }

    @Nullable
    public NetworkAdapter getNetworkAdapter() {
        NetworkAdapter networkadapter = (NetworkAdapter) c.d().b(this.mNetworkSettings, Gf.b(this.mAdFormat), this.mAdUnitObjectId);
        if (networkadapter != null) {
            return networkadapter;
        }
        return null;
    }

    @NotNull
    public NetworkSettings getNetworkSettings() {
        return this.mNetworkSettings;
    }

    public BaseAdAdapter(@NotNull LevelPlay.AdFormat adFormat, @NotNull NetworkSettings networkSettings) {
        this(adFormat, networkSettings, null);
    }
}
