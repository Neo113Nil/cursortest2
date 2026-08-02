package com.bytedance.adsdk.pcc.sf.gm.pcc;

import java.util.Deque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class wh {
    public char pcc(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    public abstract int pcc(String str, int i, Deque<com.bytedance.adsdk.pcc.sf.sf.pcc> deque, com.bytedance.adsdk.pcc.sf.gm.pcc pccVar);

    public int sf(int i, String str) {
        while (com.bytedance.adsdk.pcc.sf.vj.pcc.pcc(pcc(i, str))) {
            i++;
        }
        return i;
    }
}
