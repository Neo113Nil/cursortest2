package com.ironsource;

import android.app.Activity;
import com.ironsource.sdk.IronSourceNetwork;
import java.util.Map;

/* loaded from: classes13.dex */
public final class Bc implements Ac {
    @Override // com.ironsource.Ac
    public void a(Activity activity, K9 k9, Map<String, String> map) {
        IronSourceNetwork.showAd(activity, k9, map);
    }

    @Override // com.ironsource.Ac
    public boolean a(K9 k9) {
        return IronSourceNetwork.isAdAvailableForInstance(k9);
    }
}
