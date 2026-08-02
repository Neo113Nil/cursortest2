package com.mbridge.msdk.nativex.listener;

import android.content.Context;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import defpackage.guk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class RollingPagerListenrt implements guk {
    private NativeListener.FilpListener FilpListening;
    private List<Frame> frames;
    private List<Integer> list = new ArrayList();
    private h reportController;
    private String unit_id;

    @Override // defpackage.guk
    public void onPageSelected(int i) {
        reportRollBC(i);
    }

    public void reportRollBC(int i) {
        try {
            NativeListener.FilpListener filpListener = this.FilpListening;
            if (filpListener != null) {
                filpListener.filpEvent(i);
            }
            if (this.list.contains(Integer.valueOf(i))) {
                return;
            }
            this.list.add(Integer.valueOf(i));
            Frame frame = this.frames.get(i);
            List<CampaignEx> campaigns = frame.getCampaigns();
            if (campaigns == null || campaigns.isEmpty()) {
                return;
            }
            CampaignEx campaignEx = campaigns.get(0);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < campaigns.size(); i2++) {
                campaignEx = campaigns.get(i2);
                if (i2 == campaigns.size() - 1) {
                    sb.append(campaignEx.getId());
                } else {
                    sb.append(campaignEx.getId() + BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("rid", campaignEx.getRequestId());
            hashMap.put("rid_n", campaignEx.getRequestIdNotice());
            hashMap.put("frame_id", (i + 1) + "");
            hashMap.put("template", Integer.valueOf(frame.getTemplate()));
            hashMap.put("cids", sb.toString());
            hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.unit_id);
            d.b().a(j.a("2000005", hashMap));
        } catch (Throwable th) {
            q0.b("RollingPagerListener", th.getMessage());
        }
    }

    public void setCampList(List<Frame> list, Context context, String str) {
        this.frames = list;
        this.reportController = new h(context, 2);
        this.unit_id = str;
        this.list.clear();
        reportRollBC(0);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        this.FilpListening = filpListener;
    }

    @Override // defpackage.guk
    public void onPageScrollStateChanged(int i) {
    }

    @Override // defpackage.guk
    public void onPageScrolled(int i, float f, int i2) {
    }
}
