package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* loaded from: classes4.dex */
public interface AdapterNativeAdInterface<Listener extends AdapterAdListener> {
    void destroyAd(AdData adData);

    void loadAd(AdData adData, Context context, Listener listener);
}
