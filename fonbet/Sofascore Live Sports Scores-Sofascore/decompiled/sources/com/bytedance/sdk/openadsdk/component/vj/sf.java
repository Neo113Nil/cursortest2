package com.bytedance.sdk.openadsdk.component.vj;

import defpackage.lnb;
import java.util.Comparator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static final Comparator<sf> pcc = new Comparator<sf>() { // from class: com.bytedance.sdk.openadsdk.component.vj.sf.1
        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(sf sfVar, sf sfVar2) {
            return sfVar.vj() != sfVar2.vj() ? Long.compare(sfVar2.vj(), sfVar.vj()) : Long.compare(sfVar2.gm(), sfVar.gm());
        }
    };
    private final String gm;
    private final long oo;
    private final String qf;
    private final String sf;
    private final long vj;
    private final long wh;

    public sf(String str, String str2, long j, long j2, long j3, String str3) {
        this.sf = str;
        this.gm = str2;
        this.oo = j;
        this.vj = j2;
        this.wh = j3;
        this.qf = str3;
    }

    public long gm() {
        return this.oo;
    }

    public long oo() {
        return this.vj;
    }

    public JSONObject pcc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("rit", this.sf);
            jSONObject.putOpt("material", this.gm);
            jSONObject.putOpt("expire_time", Long.valueOf(this.oo));
            jSONObject.putOpt("create_time", Long.valueOf(this.vj));
            jSONObject.putOpt("price", Long.valueOf(this.wh));
            jSONObject.putOpt("req_id", this.qf);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public String sf() {
        return this.gm;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AdCache{mRit=");
        sb.append(this.sf);
        sb.append(", mExpireTime=");
        sb.append(this.oo);
        sb.append(", mCreateTime=");
        sb.append(this.vj);
        sb.append(", mPrice=");
        sb.append(this.wh);
        sb.append(", mReqId='");
        return lnb.q(sb, this.qf, '}');
    }

    public long vj() {
        return this.wh;
    }

    public String wh() {
        return this.qf;
    }

    public static sf pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new sf(jSONObject.optString("rit"), jSONObject.optString("material"), jSONObject.optLong("expire_time"), jSONObject.optLong("create_time"), jSONObject.optLong("price"), jSONObject.optString("req_id"));
        } catch (Exception unused) {
            return null;
        }
    }
}
