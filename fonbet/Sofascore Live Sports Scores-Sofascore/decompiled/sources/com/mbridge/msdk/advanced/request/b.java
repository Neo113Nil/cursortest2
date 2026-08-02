package com.mbridge.msdk.advanced.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b extends d {
    private int d;

    public b(int i) {
        this.d = i;
    }

    public abstract void a(CampaignUnit campaignUnit, int i);

    @Override // com.mbridge.msdk.advanced.request.d
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.d);
    }

    public abstract void b(int i, String str);

    @Override // com.mbridge.msdk.advanced.request.d
    public void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.advanced.request.d
    public void a(int i, String str) {
        b(i, str);
    }
}
