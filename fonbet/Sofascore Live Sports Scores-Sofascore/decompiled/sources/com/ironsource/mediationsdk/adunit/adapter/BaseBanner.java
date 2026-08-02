package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class BaseBanner<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter, BannerAdListener> implements AdapterBannerInterface<BannerAdListener> {
    public BaseBanner(NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.BANNER, networkSettings);
    }
}
