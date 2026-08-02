package com.bytedance.sdk.component.wh.pcc.oo.pcc;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc implements com.bytedance.sdk.component.wh.pcc.oo.pcc {
    private byte gm;
    private String kj;
    private byte oo;
    private String ork;
    protected JSONObject pcc;
    private long qf;
    private sf sf;
    private int vh;
    private long vj;
    private byte vy;
    private long wh;

    public pcc(String str, JSONObject jSONObject) {
        this.kj = str;
        this.pcc = jSONObject;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public String gm() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public long kj() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public byte oo() {
        return this.gm;
    }

    public String ork() {
        return this.ork;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public sf pcc() {
        return this.sf;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public long qf() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public byte sf() {
        return this.vy;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public byte vj() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public int vy() {
        return this.vh;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public synchronized JSONObject wh() {
        JSONObject jSONObject;
        sf sfVar;
        jSONObject = this.pcc;
        if (jSONObject == null && (sfVar = this.sf) != null) {
            jSONObject = sfVar.pcc(ork());
            this.pcc = jSONObject;
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public void gm(long j) {
        this.qf = j;
    }

    public void pcc(byte b) {
        this.vy = b;
    }

    public void sf(byte b) {
        this.gm = b;
    }

    public void gm(byte b) {
        this.oo = b;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public void pcc(long j) {
        this.vj = j;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.oo.pcc
    public void sf(long j) {
        this.wh = j;
    }

    public void pcc(int i) {
        this.vh = i;
    }

    public pcc(String str, sf sfVar) {
        this.kj = str;
        this.sf = sfVar;
    }

    private pcc() {
    }
}
