package com.mbridge.msdk.foundation.same;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.g;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: SameCommon.java */
/* loaded from: classes13.dex */
public class c {

    /* compiled from: SameCommon.java */
    public static abstract class a {
        public abstract void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);
    }

    public static long a(long j, long j2) {
        return j >= 0 ? j : j2;
    }

    public static String b(List<CampaignEx> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null && campaignEx.getCreativeId() != 0) {
                arrayList.add(campaignEx);
            }
        }
        if (arrayList.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            try {
                CampaignEx campaignEx2 = (CampaignEx) arrayList.get(i);
                if (campaignEx2 != null) {
                    long creativeId = campaignEx2.getCreativeId();
                    if (i == arrayList.size() - 1) {
                        sb.append(creativeId);
                    } else {
                        sb.append(creativeId);
                        sb.append(StringUtils.COMMA);
                    }
                }
            } catch (Exception e) {
                q0.b("SameCommon", "getCreativeID", e);
            }
        }
        return sb.toString();
    }

    public static boolean a(Context context, CampaignEx campaignEx) {
        if (context == null || campaignEx == null) {
            return false;
        }
        boolean c = v0.c(context, campaignEx.getPackageName());
        boolean c2 = v0.c(campaignEx);
        return campaignEx.getWtick() == 1 || (c2 && c) || !(c2 || c);
    }

    public static void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, a aVar) {
        a(campaignEx, context, cVar, aVar, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.c cVar, a aVar, int i) {
        int i2;
        if (campaignEx == null || aVar == null) {
            return;
        }
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                    return;
                }
                return;
            }
        }
        boolean c = v0.c(campaignEx);
        int d = v0.d(context, campaignEx.getPackageName());
        if (context != null) {
            try {
                i2 = g.b(context) ? 1 : 2;
            } catch (Exception e2) {
                q0.b("SameCommon", e2.getMessage());
            }
            e eVar = new e();
            eVar.a(BidResponsedEx.KEY_CID, campaignEx.getId());
            eVar.a(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
            eVar.a(CampaignEx.JSON_KEY_RETARGET_OFFER, Integer.valueOf(campaignEx.getRetarget_offer()));
            eVar.a("ind", Integer.valueOf(d));
            eVar.a(X3.i.q, Integer.valueOf(i));
            eVar.a(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, 0);
            eVar.a("per", Integer.valueOf(i2));
            if (!c) {
                if (d != 1) {
                    cVar.a("m_campaign_filtered", eVar);
                    aVar.a("m_campaign_filtered", cVar);
                }
                cVar.a("m_campaign_ind_retarget", eVar);
                aVar.a("m_campaign_ind_retarget", cVar);
                return;
            }
            if (d == 1) {
                cVar.a("m_campaign_filtered", eVar);
                aVar.a("m_campaign_filtered", cVar);
            }
            cVar.a("m_campaign_ind_unretarget", eVar);
            aVar.a("m_campaign_ind_unretarget", cVar);
            return;
        }
        i2 = 0;
        e eVar2 = new e();
        eVar2.a(BidResponsedEx.KEY_CID, campaignEx.getId());
        eVar2.a(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
        eVar2.a(CampaignEx.JSON_KEY_RETARGET_OFFER, Integer.valueOf(campaignEx.getRetarget_offer()));
        eVar2.a("ind", Integer.valueOf(d));
        eVar2.a(X3.i.q, Integer.valueOf(i));
        eVar2.a(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, 0);
        eVar2.a("per", Integer.valueOf(i2));
        if (!c) {
        }
    }

    public static boolean b(Context context, CampaignEx campaignEx) {
        if (context == null || campaignEx == null) {
            return false;
        }
        return v0.c(campaignEx) || campaignEx.getWtick() == 1 || !v0.c(context, campaignEx.getPackageName());
    }

    public static byte[] b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split("\\.");
            if (split.length != 4) {
                return null;
            }
            byte[] bArr = new byte[4];
            for (int i = 0; i < 4; i++) {
                int parseInt = Integer.parseInt(split[i]);
                if (parseInt >= 0 && parseInt <= 255) {
                    bArr[i] = (byte) parseInt;
                }
                return null;
            }
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : str.split("&")) {
                String[] split = str2.split("=");
                String str3 = "";
                if (split.length == 2) {
                    String str4 = split[0];
                    if (!TextUtils.isEmpty(str4)) {
                        String str5 = split[1];
                        if (str5 != null) {
                            str3 = str5;
                        }
                        jSONObject.put(str4, str3);
                    }
                } else if (split.length == 1) {
                    String str6 = split[0];
                    if (!TextUtils.isEmpty(str6)) {
                        jSONObject.put(str6, "");
                    }
                }
            }
            return jSONObject;
        } catch (Exception e) {
            q0.a("SameCommon", "coverReportMessage", e);
            return null;
        } catch (Throwable th) {
            q0.a("SameCommon", "coverReportMessage", th);
            return null;
        }
    }

    public static String a(List<CampaignEx> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                try {
                    CampaignEx campaignEx = list.get(i);
                    if (campaignEx != null) {
                        String id = campaignEx.getId();
                        if (i == list.size() - 1) {
                            sb.append(id);
                        } else {
                            sb.append(id);
                            sb.append(StringUtils.COMMA);
                        }
                    }
                } catch (Exception unused) {
                }
            }
            return sb.toString();
        }
        return "";
    }

    public static String a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            byte[] bArr = new byte[1024];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    sb.append(new String(bArr, 0, read));
                } else {
                    return sb.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
