package com.bytedance.sdk.openadsdk.core.gbb;

import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.unity3d.services.UnityAdsConstants;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    protected pcc.EnumC0071pcc gm;
    protected String kj;
    protected pcc.sf oo;
    private String ork;
    protected int pcc;
    protected List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> qf;
    protected int sf;
    private of tmg;
    protected String vj;
    protected List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> wh;
    private final AtomicBoolean vh = new AtomicBoolean(false);
    protected String vy = "endcard_click";

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.gbb.gm$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[pcc.sf.values().length];
            pcc = iArr;
            try {
                iArr[pcc.sf.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[pcc.sf.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[pcc.sf.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public gm(int i, int i2, pcc.EnumC0071pcc enumC0071pcc, pcc.sf sfVar, String str, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list2, String str2) {
        this.wh = new ArrayList();
        this.qf = new ArrayList();
        this.pcc = i;
        this.sf = i2;
        this.gm = enumC0071pcc;
        this.oo = sfVar;
        this.vj = str;
        this.wh = list;
        this.qf = list2;
        this.kj = str2;
    }

    private static float pcc(pcc.sf sfVar, pcc.EnumC0071pcc enumC0071pcc) {
        int i = AnonymousClass1.pcc[sfVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1.2f;
            }
            if (i != 3) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            return 1.0f;
        }
        if (pcc.EnumC0071pcc.JAVASCRIPT.equals(enumC0071pcc)) {
            return 1.0f;
        }
        if (pcc.EnumC0071pcc.IMAGE.equals(enumC0071pcc)) {
            return 0.8f;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static gm sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", pcc.EnumC0071pcc.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", pcc.sf.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new gm.pcc(optJSONArray.optString(i)).pcc());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new gm.pcc(optJSONArray2.optString(i2)).pcc());
        }
        return new gm(optInt, optInt2, pcc.EnumC0071pcc.valueOf(optString), pcc.sf.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    public String gm() {
        int i = AnonymousClass1.pcc[this.oo.ordinal()];
        if (i == 1) {
            pcc.EnumC0071pcc enumC0071pcc = this.gm;
            if (enumC0071pcc == pcc.EnumC0071pcc.IMAGE) {
                return mz1.o(new StringBuilder("<html><head></head><body style=\"margin:0;padding:0\"><img src=\""), this.vj, "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>");
            }
            if (enumC0071pcc == pcc.EnumC0071pcc.JAVASCRIPT) {
                return mz1.o(new StringBuilder("<script src=\""), this.vj, "\"></script>");
            }
            return null;
        }
        if (i == 2) {
            return this.vj;
        }
        if (i != 3) {
            return null;
        }
        StringBuilder sb = new StringBuilder("<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"");
        sb.append(this.pcc);
        sb.append("\" height=\"");
        sb.append(this.sf);
        sb.append("\" src=\"");
        return mz1.o(sb, this.vj, "\"></iframe>");
    }

    public String oo() {
        if (this.oo == pcc.sf.STATIC_RESOURCE && this.gm == pcc.EnumC0071pcc.IMAGE) {
            return this.vj;
        }
        return null;
    }

    public String vj() {
        return this.vj;
    }

    public void pcc(long j) {
        com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(null, this.wh, null, j, this.ork, new gm.sf(this.vy, this.tmg), null);
    }

    public static float pcc(int i, int i2, int i3, int i4, pcc.sf sfVar, pcc.EnumC0071pcc enumC0071pcc) {
        if (i2 == 0 || i4 == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f = i;
        float f2 = i3;
        return pcc(sfVar, enumC0071pcc) / ((Math.abs((f - f2) / f) + Math.abs((f / i2) - (f2 / i4))) + 1.0f);
    }

    public int pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.ork = str;
    }

    public void pcc(of ofVar) {
        this.tmg = ofVar;
    }

    public void sf(long j) {
        if (this.vh.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.gbb.sf.gm.sf((of) null, this.qf, (com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc) null, j, this.ork, (String) null);
        }
    }

    public int sf() {
        return this.sf;
    }
}
