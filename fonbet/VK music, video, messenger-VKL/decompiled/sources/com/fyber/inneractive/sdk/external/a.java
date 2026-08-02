package com.fyber.inneractive.sdk.external;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;

/* loaded from: classes12.dex */
public final class a implements IAConfigManager.OnConfigurationReadyAndValidListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ OnFyberMarketplaceInitializedListener b;

    public a(Context context, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        this.a = context;
        this.b = onFyberMarketplaceInitializedListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        if (this.a.getApplicationContext() != null) {
            IAConfigManager.removeListener(this);
            InneractiveAdManager.e = null;
            if (z) {
                InneractiveAdManager.a(this.b, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            } else {
                InneractiveAdManager.a(this.b, exc instanceof InvalidAppIdException ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, exc != null ? exc.getLocalizedMessage() : null);
            }
            if (d.a.a == null || !IAConfigManager.c() || d.a.d) {
                return;
            }
            d.a.d = true;
            w wVar = new w(u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED);
            IAConfigManager iAConfigManager2 = IAConfigManager.N;
            wVar.a("cmp_id", iAConfigManager2.C.f(), "cmp_version", iAConfigManager2.C.g()).a((String) null);
        }
    }
}
