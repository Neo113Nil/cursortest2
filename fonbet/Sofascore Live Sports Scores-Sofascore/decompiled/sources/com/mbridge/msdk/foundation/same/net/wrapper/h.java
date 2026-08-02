package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class h extends c {
    public h(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        try {
            int a = v0.a();
            String c = v0.c();
            if (eVar != null) {
                eVar.a("misk_spt", String.valueOf(a));
                if (!TextUtils.isEmpty(c)) {
                    eVar.a("misk_spt_det", c);
                }
            }
        } catch (Exception e) {
            q0.a("CampaignRequest", e.getMessage());
        } finally {
            super.addExtraParams(str, eVar);
        }
    }
}
