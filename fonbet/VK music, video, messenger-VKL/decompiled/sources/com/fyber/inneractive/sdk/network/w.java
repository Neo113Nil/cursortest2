package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Track;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.huawei.hms.framework.common.BundleUtil;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class w {
    public static final SimpleDateFormat h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    public InneractiveAdRequest a;
    public t b;
    public u c;
    public JSONArray d;
    public final com.fyber.inneractive.sdk.response.e e;
    public final JSONArray f;
    public boolean g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.b = tVar;
        this.a = null;
        this.d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length - 1; i += 2) {
                String obj = objArr[i].toString();
                Object obj2 = objArr[i + 1];
                try {
                    jSONObject.put(obj, obj2);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", obj, obj2);
                }
            }
            this.f.put(jSONObject);
        }
        return this;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.b = tVar;
        this.a = inneractiveAdRequest;
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        UnitDisplayType unitDisplayType;
        InneractiveAdRequest inneractiveAdRequest;
        com.fyber.inneractive.sdk.response.e eVar;
        boolean isDeprecated;
        UnitDisplayType unitDisplayType2;
        UnitDisplayType unitDisplayType3;
        if (!u.IA_IAB_NO_CMP_FOUND.equals(this.c) && !u.INVALID_GDPR_APPLIES_FLAG.equals(this.c) && IAConfigManager.c() && !u.IA_IAB_GDPR_TCF_PURPOSE_1_DISABLED.equals(this.c)) {
            String a = IAlog.a(this);
            Object obj = this.c;
            if (obj == null) {
                obj = this.b;
            }
            IAlog.a("%sSdk event dispatcher - aborting dispatch: %s", a, obj);
            return;
        }
        com.fyber.inneractive.sdk.response.e eVar2 = this.e;
        if (eVar2 != null) {
            ImpressionData impressionData = eVar2.r;
            String impressionId = impressionData != null ? impressionData.getImpressionId() : null;
            ImpressionData impressionData2 = this.e.r;
            String demandSource = impressionData2 != null ? impressionData2.getDemandSource() : null;
            ImpressionData impressionData3 = this.e.r;
            Long demandId = impressionData3 != null ? impressionData3.getDemandId() : null;
            ImpressionData impressionData4 = this.e.r;
            String creativeId = impressionData4 != null ? impressionData4.getCreativeId() : null;
            ImpressionData impressionData5 = this.e.r;
            String advertiserDomain = impressionData5 != null ? impressionData5.getAdvertiserDomain() : null;
            ImpressionData impressionData6 = this.e.r;
            if (impressionData6 != null) {
                str2 = impressionId;
                str3 = demandSource;
                l = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
                str6 = impressionData6.getCampaignId();
            } else {
                str2 = impressionId;
                str6 = null;
                str3 = demandSource;
                l = demandId;
                str4 = creativeId;
                str5 = advertiserDomain;
            }
        } else {
            str2 = null;
            str3 = null;
            l = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        IAConfigManager iAConfigManager = IAConfigManager.N;
        y yVar = new y(iAConfigManager.c, str2, str3, l, str4, str5, str6, str);
        InneractiveAdRequest inneractiveAdRequest2 = this.a;
        com.fyber.inneractive.sdk.config.s0 selectedUnitConfig = inneractiveAdRequest2 == null ? null : inneractiveAdRequest2.getSelectedUnitConfig();
        if (selectedUnitConfig != null) {
            com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) selectedUnitConfig;
            com.fyber.inneractive.sdk.config.o0 o0Var = r0Var.d;
            Track track = Track.ERRORS;
            Set set = o0Var.a;
            if (!(set == null ? false : set.contains(track))) {
                return;
            }
            com.fyber.inneractive.sdk.config.l0 l0Var = r0Var.c;
            if (l0Var != null && (unitDisplayType3 = l0Var.b) != null) {
                isDeprecated = unitDisplayType3.isDeprecated();
            } else {
                com.fyber.inneractive.sdk.config.t0 t0Var = r0Var.f;
                isDeprecated = (t0Var == null || (unitDisplayType2 = t0Var.j) == null) ? false : unitDisplayType2.isDeprecated();
            }
            if (isDeprecated) {
                return;
            }
        }
        if (selectedUnitConfig == null && (eVar = this.e) != null) {
            com.fyber.inneractive.sdk.config.a.a(eVar.m);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = this.e;
        String str9 = eVar3 == null ? null : eVar3.d;
        String str10 = TextUtils.isEmpty(iAConfigManager.s) ? null : iAConfigManager.s;
        if (this.b == null && this.c == null) {
            IAlog.a("Sdk event dispatcher - error id or event id must be provided", new Object[0]);
            return;
        }
        InneractiveAdRequest inneractiveAdRequest3 = this.a;
        if (inneractiveAdRequest3 != null) {
            str8 = inneractiveAdRequest3.getSpotId();
        } else {
            com.fyber.inneractive.sdk.response.e eVar4 = this.e;
            if (eVar4 != null) {
                str8 = eVar4.z;
            } else {
                str7 = null;
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(iAConfigManager.l)) {
                    sb.append(iAConfigManager.l);
                    sb.append(BundleUtil.UNDERLINE_TAG);
                }
                com.fyber.inneractive.sdk.response.e eVar5 = this.e;
                unitDisplayType = eVar5 != null ? null : eVar5.n;
                if (unitDisplayType == null && (inneractiveAdRequest = this.a) != null && inneractiveAdRequest.getSpotId() != null) {
                    unitDisplayType = com.fyber.inneractive.sdk.serverapi.b.a(this.a.getSpotId());
                }
                sb.append(unitDisplayType == null ? unitDisplayType.name().toLowerCase(Locale.US) : "unknown");
                String sb2 = sb.toString();
                com.fyber.inneractive.sdk.response.e eVar6 = this.e;
                Integer valueOf = eVar6 != null ? Integer.valueOf(eVar6.g) : null;
                com.fyber.inneractive.sdk.response.e eVar7 = this.e;
                com.fyber.inneractive.sdk.util.r.a.execute(new v(this, yVar, str9, str10, sb2, str7, valueOf, eVar7 != null ? "" : eVar7.h));
            }
        }
        str7 = str8;
        StringBuilder sb3 = new StringBuilder();
        if (!TextUtils.isEmpty(iAConfigManager.l)) {
        }
        com.fyber.inneractive.sdk.response.e eVar52 = this.e;
        if (eVar52 != null) {
        }
        if (unitDisplayType == null) {
            unitDisplayType = com.fyber.inneractive.sdk.serverapi.b.a(this.a.getSpotId());
        }
        sb3.append(unitDisplayType == null ? unitDisplayType.name().toLowerCase(Locale.US) : "unknown");
        String sb22 = sb3.toString();
        com.fyber.inneractive.sdk.response.e eVar62 = this.e;
        Integer valueOf2 = eVar62 != null ? Integer.valueOf(eVar62.g) : null;
        com.fyber.inneractive.sdk.response.e eVar72 = this.e;
        com.fyber.inneractive.sdk.util.r.a.execute(new v(this, yVar, str9, str10, sb22, str7, valueOf2, eVar72 != null ? "" : eVar72.h));
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.c = uVar;
        this.a = null;
        this.d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.c = uVar;
        this.a = inneractiveAdRequest;
        this.d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.g = false;
        this.e = eVar;
        this.f = new JSONArray();
    }
}
