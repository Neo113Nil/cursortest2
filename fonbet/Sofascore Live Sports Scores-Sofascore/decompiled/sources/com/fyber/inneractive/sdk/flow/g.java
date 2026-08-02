package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.FyberReportAdActivity;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierFactory;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal;
import com.fyber.inneractive.sdk.ui.FyberAdIdentifierRemote;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class g implements IFyberAdIdentifier.ClickListener, h {
    public final Context a;
    public final InneractiveAdRequest b;
    public final com.fyber.inneractive.sdk.response.e c;
    public final IFyberAdIdentifier d;

    public g(Context context, boolean z, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.config.global.r rVar) {
        this.a = context;
        this.b = inneractiveAdRequest;
        this.c = eVar;
        new FyberAdIdentifierFactory();
        IFyberAdIdentifier fyberAdIdentifierRemote = z ? new FyberAdIdentifierRemote(rVar) : new FyberAdIdentifierLocal(rVar);
        this.d = fyberAdIdentifierRemote;
        fyberAdIdentifierRemote.a = this;
    }

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier.ClickListener
    public final void a() {
        Long l;
        String str;
        com.fyber.inneractive.sdk.response.e eVar = this.c;
        String str2 = null;
        if (eVar != null) {
            ImpressionData impressionData = eVar.r;
            String advertiserDomain = impressionData != null ? impressionData.getAdvertiserDomain() : null;
            ImpressionData impressionData2 = this.c.r;
            str = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.c.r;
            str2 = advertiserDomain;
            l = impressionData3 != null ? impressionData3.getDemandId() : null;
        } else {
            l = null;
            str = null;
        }
        FyberReportAdActivity.start(this.a, this, str2, str, l);
    }
}
