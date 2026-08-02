package com.bytedance.sdk.component.vj.pcc;

import com.bytedance.sdk.component.vj.qf;
import com.bytedance.sdk.component.vj.wh;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm<T> implements wh {
    private T gm;
    private String oo;
    Map<String, String> pcc;
    private int sf;
    private qf vj;

    public gm(int i, T t, String str) {
        this.sf = i;
        this.gm = t;
        this.oo = str;
    }

    @Override // com.bytedance.sdk.component.vj.wh
    public String gm() {
        return this.oo;
    }

    public void pcc(qf qfVar) {
        this.vj = qfVar;
    }

    @Override // com.bytedance.sdk.component.vj.wh
    public T sf() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.component.vj.wh
    public int pcc() {
        return this.sf;
    }

    public gm(int i, T t, String str, Map<String, String> map) {
        this(i, t, str);
        this.pcc = map;
    }
}
