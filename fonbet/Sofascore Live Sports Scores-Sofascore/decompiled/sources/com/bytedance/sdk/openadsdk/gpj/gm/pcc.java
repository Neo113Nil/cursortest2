package com.bytedance.sdk.openadsdk.gpj.gm;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public boolean gm;
    public boolean oo;
    public boolean pcc;
    public long qf;
    public boolean sf;
    public long vj;
    public long wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.gpj.gm.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0111pcc {
        pcc wh();
    }

    public static pcc pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        pcc pccVar = new pcc();
        pccVar.sf(jSONObject.optBoolean("isCompleted"));
        pccVar.gm(jSONObject.optBoolean("isFromVideoDetailPage"));
        pccVar.oo(jSONObject.optBoolean("isFromDetailPage"));
        pccVar.pcc(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
        pccVar.sf(jSONObject.optLong("totalPlayDuration"));
        pccVar.gm(jSONObject.optLong("currentPlayPosition"));
        pccVar.pcc(jSONObject.optBoolean("isAutoPlay"));
        return pccVar;
    }

    public pcc gm(boolean z) {
        this.sf = z;
        return this;
    }

    public pcc oo(boolean z) {
        this.gm = z;
        return this;
    }

    public pcc sf(boolean z) {
        this.pcc = z;
        return this;
    }

    public pcc gm(long j) {
        this.qf = j;
        return this;
    }

    public pcc sf(long j) {
        this.wh = j;
        return this;
    }

    public pcc pcc(long j) {
        this.vj = j;
        return this;
    }

    public JSONObject pcc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.pcc);
            jSONObject.put("isFromVideoDetailPage", this.sf);
            jSONObject.put("isFromDetailPage", this.gm);
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.vj);
            jSONObject.put("totalPlayDuration", this.wh);
            jSONObject.put("currentPlayPosition", this.qf);
            jSONObject.put("isAutoPlay", this.oo);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public pcc pcc(boolean z) {
        this.oo = z;
        return this;
    }
}
