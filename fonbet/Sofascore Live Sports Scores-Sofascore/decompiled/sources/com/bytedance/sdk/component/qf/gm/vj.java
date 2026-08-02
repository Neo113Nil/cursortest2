package com.bytedance.sdk.component.qf.gm;

import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    public boolean pcc = false;
    public int sf = 10;
    public long gm = 1800000;

    public String toString() {
        StringBuilder sb = new StringBuilder("NetDomainConfig{enable=");
        sb.append(this.pcc);
        sb.append(", failCount=");
        sb.append(this.sf);
        sb.append(", intervalMs=");
        return fn0.n(sb, this.gm, '}');
    }
}
