package com.bytedance.sdk.openadsdk.core.ork;

import android.os.SystemClock;
import com.ironsource.U3;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class of implements com.bytedance.sdk.openadsdk.core.hc.qf.gm {
    private String wh;
    private long pcc = 0;
    private long sf = 0;
    private int gm = 0;
    private String oo = null;
    private String vj = null;
    private final AtomicBoolean qf = new AtomicBoolean(false);

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, String str) {
        boolean z = this.qf.get();
        long j = this.sf;
        if (z) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, false, str, "success", j - this.pcc, this.vj, this.wh, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, false, str, U3.g.e, j - this.pcc, this.vj, this.wh, this.gm, this.oo);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
    public void sf(String str) {
        this.vj = str;
        this.sf = SystemClock.elapsedRealtime();
        this.qf.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
    public void pcc(int i, String str, String str2) {
        this.gm = i;
        this.oo = str;
        this.vj = str2;
        this.sf = SystemClock.elapsedRealtime();
        this.qf.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.qf.gm
    public void pcc(String str) {
        this.wh = str;
        this.pcc = SystemClock.elapsedRealtime();
    }
}
