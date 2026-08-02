package com.bytedance.sdk.component.sf.pcc;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vj extends hc {
    List<String> pcc;
    List<String> sf;

    public vj(List<String> list, List<String> list2) {
        this.pcc = list;
        this.sf = list2;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        private final List<String> pcc = new ArrayList();
        private final List<String> sf = new ArrayList();

        public pcc pcc(String str, String str2) {
            this.pcc.add(str);
            this.sf.add(str2);
            return this;
        }

        public vj pcc() {
            return new vj(this.pcc, this.sf);
        }
    }
}
