package com.bytedance.adsdk.pcc.sf.pcc;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private String pcc;
    private Object[] sf;

    public String pcc() {
        return this.pcc;
    }

    public Object[] sf() {
        return this.sf;
    }

    public String toString() {
        return "MethodResult{methodName='" + this.pcc + "', args=" + Arrays.toString(this.sf) + '}';
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(Object[] objArr) {
        this.sf = objArr;
    }
}
