package com.mbridge.msdk.reward.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class a extends c {
    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit);
    }

    public abstract void b(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    @Override // com.mbridge.msdk.reward.request.c
    public void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.reward.request.c
    public void a(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        b(i, str, cVar);
    }
}
