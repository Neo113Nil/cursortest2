package com.bytedance.sdk.component.wh.pcc.gm;

import com.bytedance.sdk.component.wh.pcc.qf;
import com.bytedance.sdk.component.wh.pcc.vj;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    public static void pcc(AtomicLong atomicLong, int i) {
        vj jr = qf.wh().jr();
        if (jr == null || !jr.qf() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i);
    }
}
