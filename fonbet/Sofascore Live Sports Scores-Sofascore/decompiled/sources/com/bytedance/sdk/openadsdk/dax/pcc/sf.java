package com.bytedance.sdk.openadsdk.dax.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private String gm;
    private int oo;
    private String pcc;
    private int qf;
    private of sf;
    private boolean vj;
    private String wh;
    private int kj = 0;
    private int vy = 0;

    public String gm() {
        of ofVar;
        if (TextUtils.isEmpty(this.gm) && (ofVar = this.sf) != null) {
            this.gm = kun.pcc(ofVar);
        }
        return this.gm;
    }

    public int kj() {
        return this.kj;
    }

    public int oo() {
        return this.oo;
    }

    public String pcc() {
        return this.pcc;
    }

    public int qf() {
        return this.qf;
    }

    public of sf() {
        return this.sf;
    }

    public boolean vj() {
        return this.vj;
    }

    public int vy() {
        return this.vy;
    }

    public String wh() {
        return this.wh;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void sf(String str) {
        this.gm = str;
    }

    public void pcc(of ofVar) {
        this.sf = ofVar;
    }

    public void sf(int i) {
        this.qf = i;
    }

    public void pcc(int i) {
        this.oo = i;
    }

    public void pcc(boolean z) {
        this.vj = z;
    }

    public void gm(String str) {
        this.wh = str;
    }
}
