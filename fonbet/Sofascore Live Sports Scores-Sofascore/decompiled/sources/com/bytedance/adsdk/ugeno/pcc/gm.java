package com.bytedance.adsdk.ugeno.pcc;

import defpackage.mz1;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm {
    private int gm;
    private String kj;
    private String oo;
    private JSONObject ork;
    private Map<String, TreeMap<Float, String>> pcc;
    private String qf;
    private long sf;
    private long vj;
    private int vy = 1;
    private pcc wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public String pcc;
        public String sf;
    }

    public long gm() {
        return this.sf;
    }

    public String kj() {
        return this.qf;
    }

    public int oo() {
        return this.gm;
    }

    public int ork() {
        return this.vy;
    }

    public JSONObject pcc() {
        return this.ork;
    }

    public pcc qf() {
        return this.wh;
    }

    public Map<String, TreeMap<Float, String>> sf() {
        return this.pcc;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnimationModel{mKeyFramesMap=");
        sb.append(this.pcc);
        sb.append(", mDuration=");
        sb.append(this.sf);
        sb.append(", mPlayCount=");
        sb.append(this.gm);
        sb.append(", mPlayDirection=");
        sb.append(this.oo);
        sb.append(", mDelay=");
        sb.append(this.vj);
        sb.append(", mName=");
        sb.append(this.kj);
        sb.append(", mPlayState=");
        sb.append(this.vy);
        sb.append(", mTransformOrigin='");
        sb.append(this.wh);
        sb.append("', mTimingFunction='");
        return mz1.o(sb, this.qf, "'}");
    }

    public String vj() {
        return this.oo;
    }

    public String vy() {
        return this.kj;
    }

    public long wh() {
        return this.vj;
    }

    public void gm(String str) {
        this.kj = str;
    }

    public void pcc(JSONObject jSONObject) {
        this.ork = jSONObject;
    }

    public void sf(long j) {
        this.vj = j;
    }

    public void pcc(Map<String, TreeMap<Float, String>> map) {
        this.pcc = map;
    }

    public void sf(String str) {
        this.qf = str;
    }

    public void pcc(long j) {
        this.sf = j;
    }

    public void sf(int i) {
        this.vy = i;
    }

    public void pcc(int i) {
        this.gm = i;
    }

    public void pcc(String str) {
        this.oo = str;
    }

    public void pcc(pcc pccVar) {
        this.wh = pccVar;
    }
}
