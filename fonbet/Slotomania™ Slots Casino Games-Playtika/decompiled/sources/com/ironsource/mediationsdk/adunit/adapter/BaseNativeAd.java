package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.C2455ha;
import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.adunit.adapter.utility.NativeAdProperties;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;

/* loaded from: classes6.dex */
public abstract class BaseNativeAd<NetworkAdapter extends BaseAdapter> extends BaseAdAdapter<NetworkAdapter, NativeAdListener> implements AdapterNativeAdInterface<NativeAdListener> {
    public BaseNativeAd(NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.NATIVE_AD, networkSettings);
    }

    public NativeAdProperties getNativeAdProperties(AdData adData) {
        return new NativeAdProperties(C2455ha.a(adData.getConfiguration()));
    }
}
