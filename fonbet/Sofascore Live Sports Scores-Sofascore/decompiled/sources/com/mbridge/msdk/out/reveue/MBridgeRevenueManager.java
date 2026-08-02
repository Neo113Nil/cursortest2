package com.mbridge.msdk.out.reveue;

import android.content.Context;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.same.report.metrics.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class MBridgeRevenueManager {
    public static void track(Context context, MBridgeRevenueParamsEntity mBridgeRevenueParamsEntity) {
        if (c.n().d() == null) {
            c.n().b(context);
        }
        try {
            e eVar = new e();
            eVar.a("name", mBridgeRevenueParamsEntity.getMediationName());
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.a("m_start_ad_rev", eVar);
            d.b().a("m_start_ad_rev", cVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
        com.mbridge.msdk.foundation.same.report.e.c().b(mBridgeRevenueParamsEntity.getReportData());
    }
}
