package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* compiled from: BaseCampaignRequest.java */
/* loaded from: classes13.dex */
public class a extends c {
    public a(Context context) {
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
