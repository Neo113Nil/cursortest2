package com.bytedance.sdk.component.wh.pcc.vj;

import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class vj implements Comparable<vj>, Runnable {
    private String gm;
    private int pcc = 5;
    private String sf = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public vj(String str) {
        this.gm = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj vjVar) {
        if (pcc() < vjVar.pcc()) {
            return 1;
        }
        return pcc() >= vjVar.pcc() ? -1 : 0;
    }

    public int pcc() {
        return this.pcc;
    }

    public void pcc(int i) {
        this.pcc = i;
    }
}
