package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.tracker.m;
import com.mbridge.msdk.tracker.network.toolbox.i;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SameMetricsReport.java */
/* loaded from: classes13.dex */
public class f {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r0 == 295) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x0028, B:5:0x0034, B:9:0x003e, B:11:0x004a, B:19:0x00be, B:21:0x00c4, B:22:0x00e0, B:24:0x00e6, B:26:0x00eb, B:29:0x010e, B:31:0x0114, B:40:0x0143, B:42:0x0147, B:43:0x014a, B:44:0x014e, B:46:0x0154, B:49:0x015d, B:51:0x01a4, B:52:0x01eb, B:54:0x01f5, B:56:0x0208, B:57:0x0211, B:58:0x0224, B:60:0x0233, B:61:0x0240, B:64:0x024c, B:66:0x027b, B:68:0x0281, B:70:0x0287, B:71:0x02a5, B:72:0x02b0, B:74:0x02ba, B:76:0x02c0, B:77:0x02f3, B:79:0x02fb, B:81:0x0301, B:82:0x031f, B:83:0x032a, B:85:0x0332, B:87:0x0338, B:88:0x0356, B:89:0x0361, B:91:0x0369, B:93:0x036f, B:94:0x038d, B:95:0x0398, B:98:0x03ad, B:100:0x03b7, B:101:0x03bd, B:102:0x03c2, B:104:0x03c8, B:106:0x03d6, B:109:0x03e6, B:111:0x03ec, B:112:0x0434, B:114:0x043e, B:117:0x044a, B:119:0x0450, B:120:0x0469, B:121:0x046d, B:123:0x0473, B:124:0x048c, B:125:0x048f, B:127:0x0499, B:129:0x04a8, B:130:0x04c8, B:131:0x04d1, B:134:0x04da, B:136:0x04e0, B:137:0x051f, B:140:0x052b, B:142:0x0543, B:144:0x056b, B:146:0x0571, B:147:0x0596, B:149:0x059a, B:151:0x05aa, B:152:0x05af, B:154:0x05b9, B:155:0x05c2, B:157:0x05c8, B:158:0x05d5, B:160:0x05f3, B:162:0x05fa, B:163:0x0607, B:165:0x0611, B:166:0x061a, B:168:0x0622, B:170:0x0629, B:171:0x0636, B:173:0x0640, B:174:0x0649, B:175:0x0656, B:177:0x065e, B:181:0x0671, B:184:0x067f, B:186:0x06a5, B:188:0x06ab, B:189:0x06b0, B:190:0x06ae, B:191:0x06b7, B:193:0x06bf, B:195:0x06c5, B:196:0x06ca, B:197:0x06c8, B:198:0x06d1, B:201:0x06db, B:203:0x06e3, B:204:0x06eb, B:206:0x06fb, B:208:0x0701, B:209:0x0706, B:211:0x0715, B:213:0x071b, B:214:0x0720, B:217:0x0732, B:220:0x0752, B:222:0x075b, B:223:0x0773, B:225:0x077f, B:230:0x078e, B:232:0x079a, B:234:0x07a4, B:236:0x07bb, B:237:0x07ce, B:239:0x07d4, B:240:0x07d9, B:241:0x07d7, B:242:0x07c5, B:243:0x07ad, B:245:0x07b3, B:247:0x0814, B:248:0x07e1, B:250:0x07ef, B:251:0x0802, B:253:0x0808, B:254:0x080d, B:255:0x080b, B:256:0x07f9, B:260:0x0761, B:261:0x074e, B:263:0x071e, B:264:0x0704, B:270:0x058f, B:271:0x0563, B:273:0x04f9, B:274:0x04fd, B:276:0x0503, B:277:0x051c, B:278:0x0407, B:279:0x040d, B:281:0x0415, B:282:0x042e, B:284:0x02e1, B:286:0x026c, B:287:0x021b, B:288:0x01da, B:295:0x00cc, B:297:0x00d2, B:299:0x00dd, B:300:0x00d7, B:301:0x0078, B:306:0x008c, B:308:0x0097, B:310:0x009d, B:312:0x00a8, B:314:0x00ae, B:316:0x00a2, B:318:0x00b4, B:329:0x006f, B:13:0x0051, B:15:0x0057, B:34:0x0122, B:36:0x013d), top: B:2:0x0028, inners: #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00eb A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #1 {Exception -> 0x0039, blocks: (B:3:0x0028, B:5:0x0034, B:9:0x003e, B:11:0x004a, B:19:0x00be, B:21:0x00c4, B:22:0x00e0, B:24:0x00e6, B:26:0x00eb, B:29:0x010e, B:31:0x0114, B:40:0x0143, B:42:0x0147, B:43:0x014a, B:44:0x014e, B:46:0x0154, B:49:0x015d, B:51:0x01a4, B:52:0x01eb, B:54:0x01f5, B:56:0x0208, B:57:0x0211, B:58:0x0224, B:60:0x0233, B:61:0x0240, B:64:0x024c, B:66:0x027b, B:68:0x0281, B:70:0x0287, B:71:0x02a5, B:72:0x02b0, B:74:0x02ba, B:76:0x02c0, B:77:0x02f3, B:79:0x02fb, B:81:0x0301, B:82:0x031f, B:83:0x032a, B:85:0x0332, B:87:0x0338, B:88:0x0356, B:89:0x0361, B:91:0x0369, B:93:0x036f, B:94:0x038d, B:95:0x0398, B:98:0x03ad, B:100:0x03b7, B:101:0x03bd, B:102:0x03c2, B:104:0x03c8, B:106:0x03d6, B:109:0x03e6, B:111:0x03ec, B:112:0x0434, B:114:0x043e, B:117:0x044a, B:119:0x0450, B:120:0x0469, B:121:0x046d, B:123:0x0473, B:124:0x048c, B:125:0x048f, B:127:0x0499, B:129:0x04a8, B:130:0x04c8, B:131:0x04d1, B:134:0x04da, B:136:0x04e0, B:137:0x051f, B:140:0x052b, B:142:0x0543, B:144:0x056b, B:146:0x0571, B:147:0x0596, B:149:0x059a, B:151:0x05aa, B:152:0x05af, B:154:0x05b9, B:155:0x05c2, B:157:0x05c8, B:158:0x05d5, B:160:0x05f3, B:162:0x05fa, B:163:0x0607, B:165:0x0611, B:166:0x061a, B:168:0x0622, B:170:0x0629, B:171:0x0636, B:173:0x0640, B:174:0x0649, B:175:0x0656, B:177:0x065e, B:181:0x0671, B:184:0x067f, B:186:0x06a5, B:188:0x06ab, B:189:0x06b0, B:190:0x06ae, B:191:0x06b7, B:193:0x06bf, B:195:0x06c5, B:196:0x06ca, B:197:0x06c8, B:198:0x06d1, B:201:0x06db, B:203:0x06e3, B:204:0x06eb, B:206:0x06fb, B:208:0x0701, B:209:0x0706, B:211:0x0715, B:213:0x071b, B:214:0x0720, B:217:0x0732, B:220:0x0752, B:222:0x075b, B:223:0x0773, B:225:0x077f, B:230:0x078e, B:232:0x079a, B:234:0x07a4, B:236:0x07bb, B:237:0x07ce, B:239:0x07d4, B:240:0x07d9, B:241:0x07d7, B:242:0x07c5, B:243:0x07ad, B:245:0x07b3, B:247:0x0814, B:248:0x07e1, B:250:0x07ef, B:251:0x0802, B:253:0x0808, B:254:0x080d, B:255:0x080b, B:256:0x07f9, B:260:0x0761, B:261:0x074e, B:263:0x071e, B:264:0x0704, B:270:0x058f, B:271:0x0563, B:273:0x04f9, B:274:0x04fd, B:276:0x0503, B:277:0x051c, B:278:0x0407, B:279:0x040d, B:281:0x0415, B:282:0x042e, B:284:0x02e1, B:286:0x026c, B:287:0x021b, B:288:0x01da, B:295:0x00cc, B:297:0x00d2, B:299:0x00dd, B:300:0x00d7, B:301:0x0078, B:306:0x008c, B:308:0x0097, B:310:0x009d, B:312:0x00a8, B:314:0x00ae, B:316:0x00a2, B:318:0x00b4, B:329:0x006f, B:13:0x0051, B:15:0x0057, B:34:0x0122, B:36:0x013d), top: B:2:0x0028, inners: #2, #3 }] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.mbridge.msdk.foundation.same.report.metrics.e] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Map<String, String> c(String str, c cVar) {
        String str2;
        CampaignEx campaignEx;
        CampaignEx.c cVar2;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        String str7 = "vtid";
        String str8 = CampaignEx.KEY_LOCAL_CHECK_STATE;
        int i = 1;
        ?? eVar = new e();
        try {
        } catch (Exception e) {
            e = e;
        }
        if (Arrays.asList(b.g).contains(str6)) {
            return eVar.a();
        }
        if (cVar == null) {
            eVar.a("metrics_data_reason", "metrics 上报时意外为空");
            return eVar.a();
        }
        String str9 = "rid_n";
        ?? arrayList = new ArrayList();
        try {
            if (cVar.n() != null) {
                int adType = cVar.n().getAdType();
                str2 = BidResponsedEx.KEY_CID;
            } else {
                str2 = BidResponsedEx.KEY_CID;
            }
        } catch (Throwable th) {
            str2 = BidResponsedEx.KEY_CID;
            q0.b("SameMetricsReport", th.getMessage());
        }
        if (Arrays.asList(b.f).contains(str6)) {
            try {
                if ("m_download_start".equals(str6) || "m_download_end".equals(str6)) {
                    arrayList = a(cVar, str6);
                } else {
                    List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                    if (o != null && o.size() > 0) {
                        arrayList.addAll(o);
                    }
                }
            } catch (Exception e2) {
                e = e2;
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                return eVar.a();
            }
            if (!arrayList.isEmpty()) {
                return eVar.a();
            }
            Map<String, Map<String, String>> w = cVar.w();
            StringBuilder sb = new StringBuilder();
            List<CampaignEx> list = arrayList;
            sb.append(cVar.t());
            sb.append(str6);
            String sb2 = sb.toString();
            if (w.containsKey(sb2) && w.get(sb2) != null && w.get(sb2).containsKey("126_exclude")) {
                try {
                    String str10 = w.get(sb2).get("126_exclude");
                    w.get(sb2).remove("126_exclude");
                    if ("1".equals(str10)) {
                        return eVar.a();
                    }
                } catch (Exception e3) {
                    if (MBridgeConstans.DEBUG) {
                        e3.printStackTrace();
                    }
                }
            }
            for (CampaignEx campaignEx2 : list) {
                if (campaignEx2 != null) {
                    eVar.a(CampaignEx.KEY_SECOND_REQUEST_CALLBACK_STATE, Integer.valueOf(campaignEx2.getFilterCallBackState()));
                    eVar.a("r_index", Integer.valueOf(campaignEx2.getSecondRequestIndex()));
                    eVar.a("s_show_index", Integer.valueOf(campaignEx2.getSecondShowIndex()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_VIDEO_CALL_STATE, Integer.valueOf(campaignEx2.getFilterAdsVideoCallState()));
                    eVar.a(CampaignEx.KEY_SECOND_FILTER_AD_SHOW_CALL_STATE, Integer.valueOf(campaignEx2.getFilterAdsShowCallState()));
                    ArrayList<Integer> rsIgnoreCheckRule = campaignEx2.getRsIgnoreCheckRule();
                    if (rsIgnoreCheckRule != null) {
                        campaignEx = campaignEx2;
                        eVar.a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                        eVar.a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                        eVar.a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                    } else {
                        campaignEx = campaignEx2;
                        eVar.a("ignore_video", 1);
                        eVar.a("ignore_template", 1);
                        eVar.a("ignore_ec", 1);
                    }
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    } else {
                        eVar.a("n_lrid", campaignEx.getNLRid());
                        if (!TextUtils.isEmpty(campaignEx.getNRid())) {
                            eVar.a("n_rid", campaignEx.getNRid());
                        }
                        eVar.a("lrid", campaignEx.getLocalRequestId());
                    }
                    eVar.a("rid", campaignEx.getRequestId());
                    if (campaignEx.getMof_tplid() != 0) {
                        eVar.a("stid", Integer.valueOf(campaignEx.getMof_tplid()));
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                    if (eVar.a(str8)) {
                        StringBuilder sb3 = new StringBuilder();
                        cVar2 = rewardTemplateMode;
                        sb3.append(eVar.b(str8));
                        sb3.append(StringUtils.COMMA);
                        sb3.append(campaignEx.getLocalCheckShow());
                        eVar.a(str8, sb3.toString());
                    } else {
                        cVar2 = rewardTemplateMode;
                        eVar.a(str8, Integer.valueOf(campaignEx.getLocalCheckShow()));
                    }
                    if (cVar2 != null && cVar2.k() != 0) {
                        if (eVar.a(str7)) {
                            eVar.a(str7, eVar.b(str7) + StringUtils.COMMA + cVar2.k());
                        } else {
                            eVar.a(str7, Integer.valueOf(cVar2.k()));
                        }
                    }
                    if (campaignEx.getCreativeId() == 0) {
                        str3 = str7;
                        str4 = str8;
                    } else if (eVar.a("crid")) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(eVar.b("crid"));
                        sb4.append(StringUtils.COMMA);
                        str3 = str7;
                        str4 = str8;
                        sb4.append(campaignEx.getCreativeId());
                        eVar.a("crid", sb4.toString());
                    } else {
                        str3 = str7;
                        str4 = str8;
                        eVar.a("crid", Long.valueOf(campaignEx.getCreativeId()));
                    }
                    if (campaignEx.getVidCrtvId() != 0) {
                        if (eVar.a("video_crid")) {
                            eVar.a("video_crid", eVar.b("video_crid") + StringUtils.COMMA + campaignEx.getVidCrtvId());
                        } else {
                            eVar.a("video_crid", Long.valueOf(campaignEx.getVidCrtvId()));
                        }
                    }
                    if (campaignEx.getEcCrtvId() != 0) {
                        if (eVar.a("endcard_crid")) {
                            eVar.a("endcard_crid", eVar.b("endcard_crid") + StringUtils.COMMA + campaignEx.getEcCrtvId());
                        } else {
                            eVar.a("endcard_crid", Long.valueOf(campaignEx.getEcCrtvId()));
                        }
                    }
                    if (campaignEx.getEcTemplateId() != 0) {
                        if (eVar.a(CampaignEx.JSON_KEY_EC_TEMP_ID)) {
                            eVar.a(CampaignEx.JSON_KEY_EC_TEMP_ID, eVar.b(CampaignEx.JSON_KEY_EC_TEMP_ID) + StringUtils.COMMA + campaignEx.getEcTemplateId());
                        } else {
                            eVar.a(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
                        }
                    }
                    eVar.a("bid_tk", campaignEx.getBidToken());
                    if (!TextUtils.isEmpty(campaignEx.getMof_template_url())) {
                        if (v0.i(campaignEx.getMof_template_url())) {
                            eVar.a("sdyv", "1");
                        } else {
                            eVar.a("sdyv", "2");
                        }
                    }
                    if (campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                        str5 = str3;
                    } else if (!v0.i(campaignEx.getRewardTemplateMode().j())) {
                        str5 = str3;
                        if (eVar.a("vdyv")) {
                            eVar.a("vdyv", eVar.b("vdyv") + ",2");
                        } else {
                            eVar.a("vdyv", "2");
                        }
                    } else if (eVar.a("vdyv")) {
                        StringBuilder sb5 = new StringBuilder();
                        str5 = str3;
                        sb5.append(eVar.b("vdyv"));
                        sb5.append(",1");
                        eVar.a("vdyv", sb5.toString());
                    } else {
                        str5 = str3;
                        eVar.a("vdyv", "1");
                    }
                    if (!TextUtils.isEmpty(campaignEx.getendcard_url())) {
                        if (v0.i(campaignEx.getendcard_url())) {
                            if (eVar.a("edyv")) {
                                eVar.a("edyv", eVar.b("edyv") + ",1");
                            } else {
                                eVar.a("edyv", "1");
                            }
                        } else if (eVar.a("edyv")) {
                            eVar.a("edyv", eVar.b("edyv") + ",2");
                        } else {
                            eVar.a("edyv", "2");
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getExt_data())) {
                        JSONObject jSONObject = new JSONObject(campaignEx.getExt_data());
                        if (eVar.a("dspid")) {
                            eVar.a("dspid", eVar.b("dspid") + StringUtils.COMMA + jSONObject.optString("par_dspid"));
                        } else {
                            eVar.a("dspid", jSONObject.optString("par_dspid"));
                        }
                    }
                    if (campaignEx.getPlayable_ads_without_video() == 2) {
                        if (eVar.a("only_ec")) {
                            eVar.a("only_ec", eVar.b("only_ec") + ",2");
                        } else {
                            eVar.a("only_ec", "2");
                        }
                    } else if (eVar.a("only_ec")) {
                        eVar.a("only_ec", eVar.b("only_ec") + ",1");
                    } else {
                        eVar.a("only_ec", "1");
                    }
                    eVar.a(CampaignEx.JSON_KEY_HB, campaignEx.isBidCampaign() ? "1" : "0");
                    eVar.a(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
                    String str11 = str2;
                    if (eVar.a(str11)) {
                        eVar.a(str11, eVar.b(str11) + StringUtils.COMMA + campaignEx.getId());
                    } else {
                        eVar.a(str11, campaignEx.getId());
                    }
                    String str12 = str9;
                    if (eVar.a(str12)) {
                        eVar.a(str12, eVar.b(str12) + StringUtils.COMMA + campaignEx.getRequestIdNotice());
                    } else {
                        eVar.a(str12, campaignEx.getRequestIdNotice());
                    }
                    HashMap<String, String> hashMap = com.mbridge.msdk.foundation.controller.a.r;
                    if (hashMap != null) {
                        String str13 = hashMap.get(campaignEx.getCampaignUnitId());
                        if (!TextUtils.isEmpty(str13)) {
                            eVar.a("u_stid", str13);
                        }
                    }
                    if (!TextUtils.isEmpty(campaignEx.getCampaignUnitId())) {
                        eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignEx.getCampaignUnitId());
                    }
                    if (campaignEx.getAdType() != 0) {
                        eVar.a("adtp", Integer.valueOf(campaignEx.getAdType()));
                    }
                    eVar.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(campaignEx.isBidCampaign() ? 1 : 0));
                    eVar.a(CampaignEx.URL_KEY_EXP_IDS, campaignEx.getExpIds());
                    if ("2000047".contains(str6)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type_d", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason_d", campaignEx.getReasond());
                        }
                    }
                    if ("2000048".contains(str6)) {
                        if (campaignEx.getTyped() != -1) {
                            eVar.a("type", Integer.valueOf(campaignEx.getTyped()));
                        }
                        if (!TextUtils.isEmpty(campaignEx.getReasond())) {
                            eVar.a("reason", campaignEx.getReasond());
                        }
                        eVar.a(CampaignEx.JSON_KEY_RETARGET_TYPE, Integer.valueOf(campaignEx.getRtinsType()));
                    }
                    if (campaignEx.getAdType() != 94 && campaignEx.getAdType() != 287) {
                        str2 = str11;
                        str9 = str12;
                        str8 = str4;
                        str7 = str5;
                    }
                    if (Arrays.asList(b.j).contains(str6)) {
                        eVar.a(CampaignEx.KEY_SHOW_INDEX, Integer.valueOf(campaignEx.getShowIndex()));
                        eVar.a("trigger_show_type", Integer.valueOf(campaignEx.getShowType()));
                        if (Arrays.asList(b.l).contains(str6)) {
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                        }
                        if (str6.equals("2000147")) {
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                        }
                    }
                    if (TextUtils.equals(str6, "2000130")) {
                        String j = campaignEx.getRewardTemplateMode() != null ? campaignEx.getRewardTemplateMode().j() : "";
                        str2 = str11;
                        String str14 = campaignEx.getendcard_url();
                        str9 = str12;
                        eVar.a("ec_full_screen_click", Integer.valueOf((TextUtils.isEmpty(str14) || !str14.contains("alecfc=1")) ? a.h : a.g));
                        eVar.a("temp_full_screen_click", Integer.valueOf((TextUtils.isEmpty(j) || !j.contains("alecfc=1")) ? a.h : a.g));
                        int i2 = campaignEx.getPlayable_ads_without_video() == 2 ? i : 0;
                        com.mbridge.msdk.videocommon.setting.c c = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), cVar.B());
                        eVar.a("video_skip_result", Integer.valueOf(c == null ? 2 : c.E()));
                        if (i2 != 0) {
                            eVar.a(CampaignEx.VIDEO_END_TYPE, 2);
                        } else {
                            eVar.a(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
                        }
                    } else {
                        str2 = str11;
                        str9 = str12;
                    }
                    if (Arrays.asList(b.k).contains(str6)) {
                        int clickTempSource = campaignEx.getClickTempSource();
                        if (clickTempSource == i) {
                            if (campaignEx.getRewardTemplateMode().j().contains("alecfc=1")) {
                                eVar.a("full_screen_click", Integer.valueOf(a.g));
                            } else {
                                eVar.a("full_screen_click", Integer.valueOf(a.h));
                            }
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isTemplateRenderSucc() ? a.e : a.f));
                        } else if (clickTempSource == 2) {
                            String str15 = campaignEx.getendcard_url();
                            if ((campaignEx.getMof_tplid() != 501 || TextUtils.isEmpty(campaignEx.getMof_template_url())) ? !TextUtils.isEmpty(str15) ? str15.contains("alecfc=1") : false : campaignEx.getMof_template_url().contains("alecfc=1")) {
                                eVar.a("full_screen_click", Integer.valueOf(a.g));
                            } else {
                                eVar.a("full_screen_click", Integer.valueOf(a.h));
                            }
                            eVar.a("temp_display_type", Integer.valueOf(campaignEx.isECTemplateRenderSucc() ? a.e : a.f));
                        }
                        eVar.a(CampaignEx.KEY_CLICK_TEMP_SOURCE, Integer.valueOf(campaignEx.getClickTempSource()));
                        eVar.a("trigger_click_type", Integer.valueOf(campaignEx.getClickType()));
                        eVar.a(CampaignEx.KEY_TRIGGER_CLICK_SOURCE, Integer.valueOf(campaignEx.getTriggerClickSource()));
                    }
                    str6 = str;
                    str8 = str4;
                    str7 = str5;
                    i = 1;
                }
            }
            return eVar.a();
        }
        if (cVar.n() != null) {
            arrayList.add(cVar.n());
        } else {
            List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
            if (o2 != null) {
                arrayList.addAll(o2);
            }
        }
        if (!arrayList.isEmpty()) {
        }
    }

    private Map<String, String> d(String str, c cVar) {
        return (cVar == null || TextUtils.isEmpty(str)) ? new HashMap() : cVar.c(str);
    }

    private Map<String, String> e(String str, c cVar) {
        e eVar = new e();
        try {
            if (str.equals("2000125")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000126")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000125")));
            } else if (str.equals("2000127")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000154")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000126")));
            } else if (str.equals("2000047")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000048")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000123")));
            } else if (str.equals("2000155")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000154")));
            } else if (str.equals("2000146")) {
                eVar.a("duration", Long.valueOf(cVar.b("2000130")));
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        Map<String, String> e;
        HashMap hashMap = new HashMap();
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            cVar.j(str);
            Map<String, String> c = c(str, cVar);
            if (c != null) {
                hashMap.putAll(c);
            }
            Map<String, String> a = a(str, cVar.B(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            if (Arrays.asList(b.d).contains(str) && (e = e(str, cVar)) != null) {
                hashMap.putAll(e);
            }
            Map<String, String> a2 = a(str, cVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            if (!hashMap.containsKey("lrid") || TextUtils.isEmpty((CharSequence) hashMap.get("lrid"))) {
                hashMap.put("lrid", cVar.t());
            }
            if (hashMap.containsKey("lrid")) {
                String str2 = (String) hashMap.get("lrid");
                if (!TextUtils.isEmpty(str2) && str2.contains("label_second")) {
                    hashMap.put("lrid", str2.replace("label_second", ""));
                }
            }
            if (hashMap.containsKey("n_lrid")) {
                String str3 = (String) hashMap.get("n_lrid");
                if (!TextUtils.isEmpty(str3) && str3.contains("label_second")) {
                    hashMap.put("n_lrid", str3.replace("n_lrid", ""));
                }
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            String str4 = "1";
            if (cVar.j() == null || !cVar.j().equals("1") || !Arrays.asList(b.b).contains(str) || cVar.g() == 296) {
                if (Arrays.asList(b.m).contains(str)) {
                    hashMap.put("use_local_dns", i.b().e() ? "1" : "0");
                    if (!i.b().d()) {
                        str4 = "0";
                    }
                    hashMap.put("local_dns_available", str4);
                }
                com.mbridge.msdk.tracker.e a3 = a(str, hashMap);
                if (mVar != null && a3 != null) {
                    mVar.d(a3);
                }
                if (aVar != null) {
                    aVar.a();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void b(String str, m mVar, c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        if (cVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            cVar.j(str);
            Map<String, String> a = a(str, cVar.B(), mVar);
            if (a != null) {
                hashMap.putAll(a);
            }
            Map<String, String> a2 = a(str, cVar);
            if (a2 != null) {
                hashMap.putAll(a2);
            }
            Map<String, String> b = b(str, cVar);
            if (b != null) {
                hashMap.putAll(b);
            }
            Map<String, String> d = d(str, cVar);
            if (d != null) {
                hashMap.putAll(d);
            }
            com.mbridge.msdk.tracker.e a3 = a(str, hashMap);
            if (mVar != null && a3 != null) {
                mVar.d(a3);
            }
            if (aVar != null) {
                aVar.a();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public Map<String, String> b(String str, c cVar) {
        HashMap hashMap = new HashMap();
        if (cVar == null) {
            return hashMap;
        }
        return cVar.a(cVar.t() + str);
    }

    private com.mbridge.msdk.tracker.e a(String str, Map<String, String> map) {
        if (map == null || TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e(str);
        try {
            JSONObject jSONObject = new JSONObject(map);
            Boolean a = com.mbridge.msdk.foundation.same.b.b().a();
            if (a != null) {
                jSONObject.put("r_v_r", a.booleanValue() ? 1 : 0);
            }
            eVar.a(jSONObject);
            eVar.b(0);
            eVar.a(0);
            return eVar;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return eVar;
        }
    }

    private Map<String, String> a(String str, String str2, m mVar) {
        e eVar = new e();
        try {
            g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f == null) {
                f = com.mbridge.msdk.setting.i.b().a();
            }
            if (!TextUtils.isEmpty(f.q0())) {
                eVar.a("as_rid", f.q0());
            }
            String L = f.L();
            JSONArray K = f.K();
            if (K != null) {
                int i = 0;
                while (true) {
                    if (i >= K.length()) {
                        break;
                    }
                    if (str.equals(K.getString(i))) {
                        L = "1.0";
                        break;
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(L)) {
                eVar.a("log_rate", L);
            } else {
                eVar.a("log_rate", -1);
            }
            if (!TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.setting.m d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
                if (d != null && !TextUtils.isEmpty(d.I())) {
                    eVar.a("us_rid", d.I());
                }
                if (d != null && !TextUtils.isEmpty(d.a())) {
                    eVar.a("u_stid", d.a());
                }
                e c = d.b().c(str2);
                if (c != null) {
                    if (mVar != null && mVar.c() != null) {
                        try {
                            mVar.c().put("r_stid", c.b("r_stid"));
                            c.c("r_stid");
                        } catch (JSONException unused) {
                        }
                    }
                    eVar.a(c);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x0007, B:8:0x0020, B:11:0x0026, B:13:0x0036, B:16:0x0057, B:18:0x005d, B:20:0x0068, B:22:0x006e, B:23:0x0062, B:24:0x0072, B:26:0x0078, B:27:0x0080, B:29:0x0086, B:31:0x0091, B:33:0x0097, B:34:0x008b, B:36:0x0041, B:38:0x0045, B:41:0x004c, B:43:0x0050), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:6:0x0007, B:8:0x0020, B:11:0x0026, B:13:0x0036, B:16:0x0057, B:18:0x005d, B:20:0x0068, B:22:0x006e, B:23:0x0062, B:24:0x0072, B:26:0x0078, B:27:0x0080, B:29:0x0086, B:31:0x0091, B:33:0x0097, B:34:0x008b, B:36:0x0041, B:38:0x0045, B:41:0x004c, B:43:0x0050), top: B:5:0x0007, inners: #1 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x004e -> B:44:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0050 -> B:44:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<CampaignEx> a(c cVar, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            try {
                String str2 = cVar.t() + str;
                Map<String, Map<String, String>> w = cVar.w();
                if (w != null && w.containsKey(str2)) {
                    try {
                        Object obj = w.get(str2).get("resource_type");
                        if (obj instanceof String) {
                            i = Integer.parseInt((String) obj);
                        } else if (obj instanceof Integer) {
                            i = ((Integer) obj).intValue();
                        }
                    } catch (NumberFormatException e) {
                        if (MBridgeConstans.DEBUG) {
                            e.printStackTrace();
                        }
                    }
                    if (i != 1) {
                        List<CampaignEx> o = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o != null && o.size() > 0) {
                            arrayList.addAll(o);
                        }
                    } else if (cVar.n() != null) {
                        arrayList.add(cVar.n());
                    } else {
                        List<CampaignEx> o2 = cVar.o() != null ? cVar.o() : cVar.m();
                        if (o2 != null && o2.size() > 0) {
                            arrayList.addAll(o2);
                        }
                    }
                }
                i = -1;
                if (i != 1) {
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public Map<String, String> a(String str, c cVar) {
        HashMap hashMap = new HashMap();
        try {
            if (Arrays.asList(b.e).contains(str)) {
                String str2 = "";
                if (cVar != null) {
                    str2 = cVar.j();
                }
                hashMap.put("auto_load", str2);
            }
            if (cVar != null) {
                Map<String, Map<String, String>> w = cVar.w();
                String str3 = cVar.t() + str;
                if (w.containsKey(str3) && w.get(str3) != null) {
                    hashMap.putAll(w.get(str3));
                }
                try {
                    Map<String, Map<String, String>> v = cVar.v();
                    String str4 = cVar.t() + BundleUtil.UNDERLINE_TAG + cVar.q() + BundleUtil.UNDERLINE_TAG + str;
                    if (v.containsKey(str4) && v.get(str4) != null) {
                        hashMap.putAll(v.get(str4));
                        return hashMap;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }
}
