package com.mbridge.msdk.reward.report;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.d;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.scheme.StatCustomFieldKey;

/* compiled from: RewardReport.java */
/* loaded from: classes14.dex */
public class a {
    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n a = n.a(g.a(context));
                if (TextUtils.isEmpty(str) || a == null || a.d() <= 0) {
                    return;
                }
                List<com.mbridge.msdk.foundation.entity.n> a2 = a.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> a3 = a.a("2000021");
                List<com.mbridge.msdk.foundation.entity.n> a4 = a.a("2000039");
                List<com.mbridge.msdk.foundation.entity.n> a5 = a.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> a6 = a.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> a7 = a.a("2000044");
                o.e(a3);
                o.a(a2);
                o.c(a4);
                o.b(a5);
                o.f(a6);
                o.d(a7);
            } catch (Exception e) {
                q0.b("RewardReport", e.getMessage());
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str) {
        int a;
        if (context == null || campaignEx == null) {
            return;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000048");
            jSONObject.put("st", System.currentTimeMillis());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            jSONObject.put(StatCustomFieldKey.NETWORK_TYPE, m0.s(context));
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            if (v0.c(campaignEx)) {
                jSONObject.put(CampaignEx.JSON_KEY_RETARGET_TYPE, campaignEx.getRtinsType());
            }
            jSONObject.put(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? 1 : 0);
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, campaignEx.getAdSpaceT());
            if (campaignEx.getRewardTemplateMode() != null && (a = d.a(campaignEx, campaignEx.getRewardTemplateMode().j())) != -1) {
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, a);
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
        } catch (Throwable th) {
            q0.b("RewardReport", th.getMessage());
        }
    }
}
