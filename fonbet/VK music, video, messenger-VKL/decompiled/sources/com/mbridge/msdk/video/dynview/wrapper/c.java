package com.mbridge.msdk.video.dynview.wrapper;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ViewOptionWrapper.java */
/* loaded from: classes14.dex */
public class c {
    public com.mbridge.msdk.video.dynview.c a(Context context, List<CampaignEx> list) {
        String str;
        int i;
        int i2;
        int i3;
        if (list == null) {
            return null;
        }
        try {
            float g = v0.g(com.mbridge.msdk.foundation.controller.c.n().d());
            float f = v0.f(com.mbridge.msdk.foundation.controller.c.n().d());
            List<String> arrayList = new ArrayList<>();
            if (list.size() <= 0 || list.get(0) == null) {
                str = "";
                i = 1;
                i2 = 0;
                i3 = 0;
            } else {
                i = com.mbridge.msdk.video.dynview.util.a.a(list.get(0));
                i2 = list.get(0).getMof_tplid();
                str = list.get(0).getMof_template_url();
                i3 = list.get(0).getDynamicTempCode();
            }
            if (i2 != 0 && !TextUtils.isEmpty(str)) {
                arrayList = o0.a(z.a(0, i2 + "", str), "template_" + i2 + BundleUtil.UNDERLINE_TAG + i);
            }
            String str2 = "mbridge_same_choice_one_layout_portrait";
            if (i != 1) {
                if (i == 2) {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                } else if (com.mbridge.msdk.video.dynview.util.a.a(context)) {
                    str2 = "mbridge_same_choice_one_layout_landscape";
                    i = 2;
                } else {
                    i = 1;
                }
            }
            return com.mbridge.msdk.video.dynview.c.a().a(context).c(str2).b(1).b(f).a(g).a(list).orientation(i).fileDirs(arrayList).d(i3).a(i2).build();
        } catch (Exception e) {
            q0.b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:6:0x0008, B:9:0x001a, B:10:0x0030, B:17:0x0042, B:18:0x0051, B:20:0x0057, B:21:0x007b, B:23:0x0098, B:24:0x009c), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:6:0x0008, B:9:0x001a, B:10:0x0030, B:17:0x0042, B:18:0x0051, B:20:0x0057, B:21:0x007b, B:23:0x0098, B:24:0x009c), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.mbridge.msdk.video.dynview.c b(View view, CampaignEx campaignEx) {
        String str;
        int i;
        String str2;
        if (campaignEx == null) {
            return null;
        }
        try {
            List<String> arrayList = new ArrayList<>();
            String campaignUnitId = campaignEx.getCampaignUnitId();
            if (campaignEx.getRewardTemplateMode() != null) {
                i = campaignEx.getRewardTemplateMode().k();
                str = campaignEx.getRewardTemplateMode().j();
            } else {
                str = "";
                i = 0;
            }
            int a = v0.a(str, "ia_tp", -5);
            if (i != 0 && i != 102 && i != 202) {
                str2 = "mbridge_reward_layer_floor_" + i;
                if (!TextUtils.isEmpty(str)) {
                    String a2 = z.a(1, i + "", str);
                    StringBuilder sb = new StringBuilder("template_");
                    sb.append(i);
                    arrayList = o0.a(a2, sb.toString());
                }
                boolean a3 = com.mbridge.msdk.video.dynview.util.a.a(str);
                String a4 = com.mbridge.msdk.video.dynview.util.a.a(str, "whs_chn");
                com.mbridge.msdk.videocommon.setting.c a5 = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), campaignUnitId, false);
                int D = a5 != null ? a5.D() : 0;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(campaignEx);
                return com.mbridge.msdk.video.dynview.c.a().c(str2).b(2).a(arrayList2).a(view.getContext()).a(view).c(D).f(a).orientation(m0.G(view.getContext())).a(i).a(a3).b(a4).fileDirs(arrayList).d(campaignEx.getDynamicTempCode()).build();
            }
            str2 = "mbridge_reward_layer_floor";
            if (!TextUtils.isEmpty(str)) {
            }
            boolean a32 = com.mbridge.msdk.video.dynview.util.a.a(str);
            String a42 = com.mbridge.msdk.video.dynview.util.a.a(str, "whs_chn");
            com.mbridge.msdk.videocommon.setting.c a52 = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), campaignUnitId, false);
            if (a52 != null) {
            }
            ArrayList arrayList22 = new ArrayList();
            arrayList22.add(campaignEx);
            return com.mbridge.msdk.video.dynview.c.a().c(str2).b(2).a(arrayList22).a(view.getContext()).a(view).c(D).f(a).orientation(m0.G(view.getContext())).a(i).a(a32).b(a42).fileDirs(arrayList).d(campaignEx.getDynamicTempCode()).build();
        } catch (Exception e) {
            q0.b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    public com.mbridge.msdk.video.dynview.c a(View view, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            com.mbridge.msdk.videocommon.setting.c a = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId(), false);
            int D = a != null ? a.D() : 0;
            ArrayList arrayList = new ArrayList();
            arrayList.add(campaignEx);
            return com.mbridge.msdk.video.dynview.c.a().c("mbridge_reward_layer_floor_bottom").b(3).a(arrayList).a(view.getContext()).a(view).c(D).orientation(m0.G(view.getContext())).build();
        } catch (Exception e) {
            q0.b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }

    public com.mbridge.msdk.video.dynview.c b(Context context, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    float g = v0.g(com.mbridge.msdk.foundation.controller.c.n().d());
                    float f = v0.f(com.mbridge.msdk.foundation.controller.c.n().d());
                    List<String> arrayList = new ArrayList<>();
                    int dynamicTempCode = list.get(0).getDynamicTempCode();
                    int mof_tplid = list.get(0).getMof_tplid();
                    String mof_template_url = list.get(0).getMof_template_url();
                    int G = m0.G(context);
                    if (mof_tplid != 0 && !TextUtils.isEmpty(mof_template_url)) {
                        arrayList = o0.a(z.a(0, mof_tplid + "", mof_template_url), "template_" + mof_tplid + BundleUtil.UNDERLINE_TAG + G);
                    }
                    return com.mbridge.msdk.video.dynview.c.a().c(G == 1 ? "mbridge_order_layout_list_portrait" : "mbridge_order_layout_list_landscape").b(5).a(context).b(f).a(g).a(list).orientation(G).fileDirs(arrayList).d(dynamicTempCode).a(mof_tplid).build();
                }
            } catch (Exception e) {
                q0.b("ViewOptionWrapper", e.getMessage());
            }
        }
        return null;
    }

    public com.mbridge.msdk.video.dynview.c a(Context context, CampaignEx campaignEx, int i, String str) {
        String str2;
        String str3;
        StringBuilder sb;
        if (campaignEx == null) {
            return null;
        }
        try {
            long ecTemplateId = campaignEx.getEcTemplateId();
            int G = m0.G(context);
            int a = v0.a(campaignEx.getendcard_url(), "n_logo", 1);
            if (ecTemplateId == 1302) {
                if (G == 1) {
                    sb = new StringBuilder();
                    sb.append("mbridge_reward_end_card_layout_portrait_");
                } else {
                    sb = new StringBuilder();
                    sb.append("mbridge_reward_end_card_layout_landscape_");
                }
                sb.append(ecTemplateId);
                str2 = sb.toString();
                str3 = "template_" + str + G + BundleUtil.UNDERLINE_TAG + ecTemplateId;
            } else {
                str2 = G == 1 ? "mbridge_reward_end_card_layout_portrait" : "mbridge_reward_end_card_layout_landscape";
                str3 = "template_" + str + G;
            }
            List<String> arrayList = new ArrayList<>();
            if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                arrayList = o0.a(z.a(2, i + "", campaignEx.getendcard_url()), str3);
            }
            return com.mbridge.msdk.video.dynview.c.a().c(str2).b(4).a(context).orientation(m0.G(context)).fileDirs(arrayList).d(campaignEx.getDynamicTempCode()).a(i).a(str).e(a).build();
        } catch (Exception e) {
            q0.b("ViewOptionWrapper", e.getMessage());
            return null;
        }
    }
}
