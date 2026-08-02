package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.CustomInfoManager;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.setting.m;
import com.mbridge.msdk.tracker.network.k;
import com.mbridge.msdk.tracker.network.l;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.u;
import defpackage.mz1;
import defpackage.w1l;
import defpackage.wv8;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static final String TAG = "c";
    protected Context mContext;

    public c(Context context) {
        if (context == null) {
            this.mContext = com.mbridge.msdk.foundation.controller.c.n().d();
        } else {
            this.mContext = context.getApplicationContext();
        }
    }

    private String asUrlParams(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    String str2 = map.get(str);
                    if (TextUtils.isEmpty(str2)) {
                        str2 = "";
                    }
                    sb.append(U3.j.c);
                    sb.append(str);
                    sb.append(U3.j.b);
                    sb.append(str2);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
            sb = null;
        }
        if (sb == null || sb.length() <= 0) {
            return null;
        }
        return (map.containsKey("rk") && map.containsKey("erk") && "1".equals(map.get("erk"))) ? v0.b(sb.toString(), "ebmclXzZOhtU2sRlZxGL8A") : sb.toString();
    }

    private static com.mbridge.msdk.tracker.network.h<?> createRequest(int i, int i2, String str, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        if (i == 0) {
            return new k(i2, str, str2, j, new i(bVar));
        }
        if (i != 1) {
            return null;
        }
        return new com.mbridge.msdk.tracker.network.i(i2, str, str2, j, new i(bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9 A[Catch: Exception -> 0x00e6, TRY_ENTER, TryCatch #1 {Exception -> 0x00e6, blocks: (B:29:0x00b9, B:31:0x00bf, B:49:0x00ca, B:53:0x00ee, B:58:0x010c), top: B:27:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.mbridge.msdk.foundation.same.net.wrapper.c] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [com.mbridge.msdk.foundation.same.net.wrapper.c] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.mbridge.msdk.tracker.network.h, com.mbridge.msdk.tracker.network.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x01b0 -> B:54:0x0209). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01f0 -> B:54:0x0209). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void post(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, boolean z2, String str2, long j) {
        String str3;
        com.mbridge.msdk.setting.a j2;
        int i2;
        ?? r10;
        ?? createRequest;
        int i3;
        String str4;
        int i4;
        String str5;
        if (eVar == null) {
            try {
                eVar = new e();
            } catch (Exception e) {
                q0.a(TAG, e.getMessage());
            }
        }
        if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
            String key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
            String isRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
            if (!TextUtils.isEmpty(key)) {
                eVar.a("rk", key);
                eVar.a("erk", isRKE);
            }
        }
        addExtraParams(str, eVar);
        f.k(eVar);
        com.mbridge.msdk.foundation.same.net.e a = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar);
        if (a != null && bVar != null) {
            bVar.onSuccess(a);
            return;
        }
        q0.c(TAG, "post url = " + str);
        String str6 = "";
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().d)) {
            com.mbridge.msdk.setting.g e2 = w1l.e(com.mbridge.msdk.setting.i.b());
            if (e2 != null) {
                i4 = e2.M();
                try {
                    str5 = eVar.a().get("data");
                    if (!z2) {
                        try {
                            if (!com.mbridge.msdk.foundation.same.report.b.a(e2, str5)) {
                                return;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            str4 = e2.k();
                            i3 = e2.E0();
                            eVar.a("a_stid", e2.a());
                            eVar.a("country_code", str4);
                            if (i4 != 2) {
                            }
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    str5 = "";
                }
                str4 = e2.k();
                i3 = e2.E0();
                eVar.a("a_stid", e2.a());
            } else {
                i3 = 0;
                str4 = "UNKNOWN";
                i4 = 1;
                str5 = "";
            }
            eVar.a("country_code", str4);
            try {
                if (i4 != 2) {
                    this = this;
                    i = i;
                    if (!TextUtils.isEmpty(str5)) {
                        this = this;
                        i = i;
                        if (com.mbridge.msdk.foundation.same.report.b.a(e2, str5)) {
                            if (i3 == 1 || i3 == 3) {
                                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n, eVar.toString(), false, bVar, false);
                                this = this;
                                i = i;
                            }
                        } else if (z2) {
                            if (i3 == 1 || i3 == 3) {
                                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n, eVar.toString(), false, bVar, false);
                                this = this;
                                i = i;
                            }
                        }
                    }
                } else if (i4 == 1) {
                    com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().j, com.mbridge.msdk.foundation.same.net.utils.d.h().n, eVar.toString(), false, bVar, false);
                    this = this;
                    i = i;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().h)) {
            com.mbridge.msdk.setting.g e6 = w1l.e(com.mbridge.msdk.setting.i.b());
            if (e6 != null && (j2 = e6.j()) != null && j2.h() == 1) {
                com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().l, com.mbridge.msdk.foundation.same.net.utils.d.h().p, eVar.toString(), false, bVar, false);
                return;
            }
        } else if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().d0)) {
            if (eVar != null) {
                StringBuilder r = mz1.r(str, "?");
                r.append(eVar.toString());
                str = r.toString();
            }
            JSONArray b = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (b != null) {
                String jSONArray = b.toString();
                e eVar2 = new e();
                eVar2.a(e.k, jSONArray);
                str3 = str;
                eVar = eVar2;
                this = this;
                i2 = i;
                createRequest = createRequest(i2, 1, str3, bVar, str2, j);
                this = r10;
                i = createRequest;
                if (createRequest != 0) {
                    if (eVar != null && eVar.a() != null) {
                        String str7 = eVar.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                        if (TextUtils.isEmpty(str7)) {
                            str7 = str6;
                        }
                        createRequest.a("local_id", str7);
                        String str8 = eVar.a().get("ad_type");
                        if (!TextUtils.isEmpty(str8)) {
                            str6 = str8;
                        }
                        createRequest.a("ad_type", str6);
                        createRequest.a(eVar.a());
                    }
                    createRequest.d(r10.canTrack());
                    str = "application/x-www-form-urlencoded";
                    createRequest.b("Content-Type", "application/x-www-form-urlencoded");
                    u b2 = l.a().b();
                    b2.a((t) createRequest);
                    this = b2;
                    i = createRequest;
                }
            }
        }
        str3 = str;
        r10 = this;
        i2 = i;
        createRequest = createRequest(i2, 1, str3, bVar, str2, j);
        this = r10;
        i = createRequest;
        if (createRequest != 0) {
        }
    }

    public void addExtraParams(String str, e eVar) {
        if (eVar == null) {
            q0.b(TAG, "addExtraParams error, params is null,frame work error");
            return;
        }
        String a = Aa.a();
        if (a == null) {
            a = "";
        }
        eVar.a("channel", a);
        eVar.a("band_width", com.mbridge.msdk.foundation.same.net.a.b().a() + "");
        eVar.a("open", com.mbridge.msdk.foundation.same.a.S);
        if (com.mbridge.msdk.util.b.a() && !TextUtils.isEmpty(str) && str.contains("setting")) {
            String b = Aa.b();
            if (!TextUtils.isEmpty(b)) {
                eVar.a("keyword", b);
            }
        }
        String str2 = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (str2 != null) {
            String customInfoByUnitId = CustomInfoManager.getInstance().getCustomInfoByUnitId(str2, str);
            if (!TextUtils.isEmpty(customInfoByUnitId)) {
                eVar.a("ch_info", customInfoByUnitId);
            }
            m e = com.mbridge.msdk.setting.i.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), str2);
            if (e != null && !TextUtils.isEmpty(e.a())) {
                eVar.a("u_stid", e.a());
            }
        }
        if (!com.mbridge.msdk.foundation.controller.authoritycontroller.b.i()) {
            eVar.a("dev_source", "2");
        }
        if (DomainNameUtils.getInstance().isExcludeCNDomain()) {
            eVar.a("re_domain", "1");
        }
    }

    public boolean canTrack() {
        return true;
    }

    public void choiceV3OrV5BySetting(int i, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str, long j) {
        e eVar2;
        com.mbridge.msdk.setting.g d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        int v0 = TextUtils.isEmpty(str) ? d.v0() : d.D();
        String a = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, v0);
        if (v0 < 2) {
            postV5(i, a, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j);
            return;
        }
        if (v0 % 2 == 0) {
            if (eVar == null) {
                eVar = new e();
            }
            eVar2 = eVar;
            JSONArray b = com.mbridge.msdk.foundation.db.middle.b.a().b();
            if (b != null) {
                String jSONArray = b.toString();
                int i2 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                if (i2 > 0 && jSONArray.length() > i2) {
                    post(i, a, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j);
                    return;
                }
                eVar2.a(e.k, jSONArray);
            }
        } else {
            eVar2 = eVar;
        }
        getLoadOrSetting(i, a, eVar2, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void get(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, boolean z2, String str2, long j) {
        e eVar2;
        e eVar3;
        String str3;
        com.mbridge.msdk.setting.g d;
        com.mbridge.msdk.tracker.network.h<?> createRequest;
        if (eVar == null) {
            try {
                eVar2 = new e();
            } catch (Exception e) {
                e = e;
                eVar2 = eVar;
                q0.a(TAG, e.getMessage());
                eVar3 = eVar2;
                if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i)) {
                }
                if (eVar3 != null) {
                }
                str3 = str;
                d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (str3.length() < d.s0()) {
                }
                if (str3.length() < d.N()) {
                }
                createRequest = createRequest(i, 0, str, bVar, str2, j);
                if (createRequest == null) {
                }
            }
        } else {
            eVar2 = eVar;
        }
        try {
            if (bVar instanceof com.mbridge.msdk.foundation.same.net.c) {
                String key = ((com.mbridge.msdk.foundation.same.net.c) bVar).getKey();
                String isRKE = ((com.mbridge.msdk.foundation.same.net.c) bVar).isRKE();
                if (!TextUtils.isEmpty(key)) {
                    eVar2.a("rk", key);
                    eVar2.a("erk", isRKE);
                }
            }
            addExtraParams(str, eVar2);
            f.k(eVar2);
            String str4 = eVar2.a().get("sign");
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            long currentTimeMillis = System.currentTimeMillis();
            eVar2.a("ts", currentTimeMillis + "");
            if (com.mbridge.msdk.util.b.a()) {
                eVar2.a("st", SameMD5.getMD5(str4 + currentTimeMillis));
            } else {
                eVar2.a("st", SameMD5.getMD5(currentTimeMillis + str4));
            }
            com.mbridge.msdk.foundation.same.net.e a = com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVar2);
            if (a != null && bVar != null) {
                bVar.onSuccess(a);
                return;
            }
        } catch (Exception e2) {
            e = e2;
            q0.a(TAG, e.getMessage());
            eVar3 = eVar2;
            if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i)) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("uri", com.mbridge.msdk.foundation.same.net.utils.d.h().m + Uri.parse(str).getPath());
                        jSONObject.put("data", eVar3.b());
                    } catch (Throwable th) {
                        q0.b(TAG, th.getMessage());
                    }
                    com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().m, com.mbridge.msdk.foundation.same.net.utils.d.h().q, jSONObject.toString(), true, bVar, eVar3 == null && !TextUtils.isEmpty(eVar3.c().optString("rk")) && eVar3.c().optString("erk").equals("1"));
                    return;
                } catch (Throwable th2) {
                    q0.b(TAG, th2.getMessage());
                }
            }
            if (eVar3 != null) {
            }
            str3 = str;
            d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (str3.length() < d.s0()) {
            }
            if (str3.length() < d.N()) {
            }
            createRequest = createRequest(i, 0, str, bVar, str2, j);
            if (createRequest == null) {
            }
        }
        eVar3 = eVar2;
        if (str.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i) && com.mbridge.msdk.foundation.same.net.utils.d.h().s) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uri", com.mbridge.msdk.foundation.same.net.utils.d.h().m + Uri.parse(str).getPath());
            jSONObject2.put("data", eVar3.b());
            com.mbridge.msdk.foundation.same.net.f.b().a(com.mbridge.msdk.foundation.same.net.utils.d.h().m, com.mbridge.msdk.foundation.same.net.utils.d.h().q, jSONObject2.toString(), true, bVar, eVar3 == null && !TextUtils.isEmpty(eVar3.c().optString("rk")) && eVar3.c().optString("erk").equals("1"));
            return;
        }
        if (eVar3 != null) {
            if (TextUtils.isEmpty(eVar3.c().optString("rk")) || !eVar3.c().optString("erk").equals("1")) {
                StringBuilder r = mz1.r(str, "?");
                r.append(eVar3.toString());
                str3 = r.toString();
            } else {
                try {
                    str3 = str + "?p=" + URLEncoder.encode(v0.b(eVar3.toString(), "ebmclXzZOhtU2sRlZxGL8A"), C.UTF8_NAME);
                } catch (Exception unused) {
                }
            }
            d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (str3.length() < d.s0() && str3.contains(com.mbridge.msdk.foundation.same.net.utils.d.h().i)) {
                post(i, str, eVar3, bVar, z2, false, str2, j);
                return;
            }
            if (str3.length() < d.N() && z) {
                post(i, str, eVar3, bVar, z2, false, str2, j);
                return;
            }
            createRequest = createRequest(i, 0, str, bVar, str2, j);
            if (createRequest == null) {
                if (eVar3 != null && eVar3.a() != null) {
                    String str5 = eVar3.a().get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
                    if (TextUtils.isEmpty(str5)) {
                        str5 = "";
                    }
                    createRequest.a("local_id", str5);
                    String str6 = eVar3.a().get("ad_type");
                    createRequest.a("ad_type", TextUtils.isEmpty(str6) ? "" : str6);
                    createRequest.a(eVar3.a());
                }
                createRequest.d(canTrack());
                l.a().b().a(createRequest);
                return;
            }
            return;
        }
        str3 = str;
        d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (str3.length() < d.s0()) {
        }
        if (str3.length() < d.N()) {
        }
        createRequest = createRequest(i, 0, str, bVar, str2, j);
        if (createRequest == null) {
        }
    }

    public void getCampaign(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, long j) {
        e eVar2;
        try {
            com.mbridge.msdk.setting.g d = com.mbridge.msdk.setting.i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            int v0 = TextUtils.isEmpty(str) ? d.v0() : d.D();
            String a = com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, v0);
            if (v0 < 2) {
                postV5(i, a, eVar, bVar, true, MBInterstitialActivity.INTENT_CAMAPIGN, j);
                return;
            }
            if (v0 % 2 == 0) {
                eVar2 = eVar == null ? new e() : eVar;
                JSONArray b = com.mbridge.msdk.foundation.db.middle.b.a().b();
                if (b != null) {
                    String jSONArray = b.toString();
                    int i2 = com.mbridge.msdk.foundation.same.net.utils.d.h().i();
                    if (i2 > 0 && jSONArray.length() > i2) {
                        post(i, a, eVar2, bVar, true, false, MBInterstitialActivity.INTENT_CAMAPIGN, j);
                        return;
                    }
                    eVar2.a(e.k, jSONArray);
                }
            } else {
                eVar2 = eVar;
            }
            get(i, a, eVar2, bVar, true, true, MBInterstitialActivity.INTENT_CAMAPIGN, j);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                q0.b(TAG, e.getMessage());
            }
        }
    }

    public void getLoadOrSetting(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, String str2, long j) {
        get(i, str, eVar, bVar, z, false, str2, j);
    }

    public void postFocusReport(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        post(i, str, eVar, bVar, false, true, str2, j);
    }

    public void postV5(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        String str3 = eVar.a().get("sign");
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i, str, eVar, bVar, false, false, str2, j);
    }

    public void getLoadOrSetting(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        getLoadOrSetting(i, str, eVar, bVar, true, str2, j);
    }

    public void postV5(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, boolean z, String str2, long j) {
        String str3 = eVar.a().get("sign");
        if (str3 == null) {
            str3 = "";
        }
        long currentTimeMillis = System.currentTimeMillis();
        eVar.a("ts", currentTimeMillis + "");
        eVar.a("st", SameMD5.getMD5(currentTimeMillis + str3));
        post(i, str, eVar, bVar, z, false, str2, j);
    }

    public void post(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        post(i, str, eVar, bVar, false, false, str2, j);
    }

    public void get(int i, String str, e eVar, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        get(i, str, eVar, bVar, false, false, str2, j);
    }

    public void get(int i, String str, Map<String, String> map, com.mbridge.msdk.foundation.same.net.b bVar, String str2, long j) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
        map.put("sdk_version", MBConfiguration.SDK_VERSION);
        map.put(L6.H, "1");
        String asUrlParams = asUrlParams(map);
        if (!TextUtils.isEmpty(asUrlParams)) {
            str = wv8.i(str, "?", asUrlParams);
        }
        String str3 = str;
        if (MBridgeConstans.DEBUG) {
            w1l.x("get wx scheme url = ", str3, "AppletsModel");
        }
        com.mbridge.msdk.tracker.network.h<?> createRequest = createRequest(i, 0, str3, bVar, str2, j);
        if (createRequest != null) {
            String str4 = map.get(CampaignEx.JSON_KEY_LOCAL_REQUEST_ID);
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            createRequest.a("local_id", str4);
            String str5 = map.get("ad_type");
            createRequest.a("ad_type", TextUtils.isEmpty(str5) ? "" : str5);
            createRequest.a(map);
            createRequest.d(canTrack());
            l.a().b().a(createRequest);
        }
    }
}
