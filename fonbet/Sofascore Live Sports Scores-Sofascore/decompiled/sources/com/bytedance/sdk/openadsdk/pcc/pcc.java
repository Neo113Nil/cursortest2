package com.bytedance.sdk.openadsdk.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.settings.qf;
import com.bytedance.sdk.openadsdk.core.vh.sf;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.lu.oo;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.wv8;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static void pcc(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!jr.vj() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static void pcc(final gm gmVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                if (!jr.vj()) {
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (!sf.pcc().vh() || !ork.sf().vh()) {
                    com.bytedance.sdk.openadsdk.lu.gm.pcc(new oo() { // from class: com.bytedance.sdk.openadsdk.pcc.pcc.1.1
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("load_ad");
                            e.gm(adSlot.getCodeId());
                            e.oo(kun.gm(adSlot.getDurationSlotType()));
                            e.qf(kun.pcc(adSlot).toString());
                            return e;
                        }
                    });
                    rnn.gm(gmVar);
                } else {
                    PAGLoadListener pAGLoadListener3 = PAGLoadListener.this;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(10004, vy.pcc(10004));
                    }
                }
            }
        };
        if (jr.vj()) {
            runnable.run();
        } else {
            jr.sf().post(runnable);
        }
    }

    public static boolean pcc(PAGLoadListener pAGLoadListener) {
        if (qf.pcc()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static boolean pcc(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
