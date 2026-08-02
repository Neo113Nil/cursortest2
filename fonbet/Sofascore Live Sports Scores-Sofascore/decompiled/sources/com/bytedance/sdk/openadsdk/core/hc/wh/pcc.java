package com.bytedance.sdk.openadsdk.core.hc.wh;

import com.bytedance.adsdk.ugeno.core.lu;
import com.bytedance.sdk.component.adexpress.sf.hc;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends hc {
    private float gm;
    private float oo;
    private JSONObject pcc;
    private lu sf;
    private boolean vj;

    public pcc(C0084pcc c0084pcc) {
        super(c0084pcc);
        this.pcc = c0084pcc.pcc;
        this.sf = c0084pcc.sf;
        this.gm = c0084pcc.gm;
        this.oo = c0084pcc.oo;
        this.vj = c0084pcc.vj;
    }

    public float lq() {
        return this.oo;
    }

    public boolean mu() {
        return this.vj;
    }

    public lu pq() {
        return this.sf;
    }

    public float ye() {
        return this.gm;
    }

    public JSONObject zti() {
        return this.pcc;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.wh.pcc$pcc, reason: collision with other inner class name */
    public static class C0084pcc extends hc.pcc {
        private float gm;
        private float oo;
        private JSONObject pcc;
        private lu sf;
        private boolean vj;

        public C0084pcc qf(boolean z) {
            this.vj = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.sf.hc.pcc
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public pcc pcc() {
            return new pcc(this);
        }

        public C0084pcc pcc(JSONObject jSONObject) {
            this.pcc = jSONObject;
            return this;
        }

        public C0084pcc sf(float f) {
            this.oo = f;
            return this;
        }

        public C0084pcc pcc(lu luVar) {
            this.sf = luVar;
            return this;
        }

        public C0084pcc pcc(float f) {
            this.gm = f;
            return this;
        }
    }
}
