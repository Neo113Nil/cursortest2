package com.bytedance.sdk.component.vj.sf.gm;

import com.bytedance.sdk.component.vj.vh;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo<T> implements vh {
    private T gm;
    private boolean kj;
    private T oo;
    private com.bytedance.sdk.component.vj.qf ork;
    private String pcc;
    private Map<String, String> qf;
    private String sf;
    private int vh;
    private int vj;
    private boolean vy;
    private int wh;

    @Override // com.bytedance.sdk.component.vj.vh
    public T gm() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public Map<String, String> oo() {
        return this.qf;
    }

    public oo pcc(gm gmVar, T t) {
        this.gm = t;
        this.pcc = gmVar.kj();
        this.sf = gmVar.pcc();
        this.vj = gmVar.sf();
        this.wh = gmVar.gm();
        this.vy = gmVar.tmg();
        this.ork = gmVar.gbb();
        this.vh = gmVar.jr();
        return this;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public int qf() {
        return this.vh;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public T sf() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public boolean vj() {
        return this.kj;
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public boolean wh() {
        return this.vy;
    }

    public oo pcc(gm gmVar, T t, Map<String, String> map, boolean z) {
        this.qf = map;
        this.kj = z;
        return pcc(gmVar, t);
    }

    @Override // com.bytedance.sdk.component.vj.vh
    public String pcc() {
        return this.sf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.component.vj.vh
    public void pcc(Object obj) {
        this.oo = this.gm;
        this.gm = obj;
    }
}
