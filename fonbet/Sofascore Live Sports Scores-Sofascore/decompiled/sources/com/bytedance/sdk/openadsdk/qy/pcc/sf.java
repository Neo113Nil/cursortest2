package com.bytedance.sdk.openadsdk.qy.pcc;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private final of sf;
    private int pcc = gm.sf;
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final AtomicBoolean oo = new AtomicBoolean(true);
    private final AtomicInteger vj = new AtomicInteger(0);
    private long wh = 0;
    private long qf = 0;
    private final Runnable kj = new Runnable() { // from class: com.bytedance.sdk.openadsdk.qy.pcc.sf.3
        @Override // java.lang.Runnable
        public void run() {
            sf.this.oo();
        }
    };

    public sf(of ofVar) {
        this.sf = ofVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        if (this.gm.compareAndSet(false, true)) {
            sf();
            final long elapsedRealtime = (SystemClock.elapsedRealtime() - this.wh) + this.qf;
            this.qf = elapsedRealtime;
            rnn.sf(new com.bytedance.sdk.component.kj.sf.gm("ev_tracker") { // from class: com.bytedance.sdk.openadsdk.qy.pcc.sf.1
                @Override // java.lang.Runnable
                public void run() {
                    String pcc = kun.pcc(sf.this.sf);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("ev_wait_time_server", sf.this.sf.mo() * 1000);
                        jSONObject.put("ev_wait_time_client", elapsedRealtime);
                    } catch (JSONException e) {
                        lo.gm("EvTracker", e.getMessage());
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.sf(sf.this.sf, pcc, sf.this.sf.hk(), jSONObject);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vj() {
        if (this.vj.get() == 2) {
            this.wh = SystemClock.elapsedRealtime();
            Handler pcc = pcc.pcc();
            if (pcc != null) {
                pcc.postDelayed(this.kj, this.pcc - this.qf);
            }
            this.vj.set(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() {
        if (this.vj.get() != 1 || this.wh == 0) {
            return;
        }
        Handler pcc = pcc.pcc();
        if (pcc != null) {
            pcc.removeCallbacks(this.kj);
        }
        this.qf = (SystemClock.elapsedRealtime() - this.wh) + this.qf;
        this.wh = 0L;
        this.vj.set(2);
    }

    public boolean gm() {
        return this.vj.get() == 3;
    }

    public void pcc() {
        if (this.vj.get() != 0) {
            return;
        }
        this.pcc = this.sf.mo() * 1000;
        this.vj.set(1);
        this.wh = SystemClock.elapsedRealtime();
        Handler pcc = pcc.pcc();
        if (pcc != null) {
            pcc.postDelayed(this.kj, this.pcc);
        }
    }

    public void sf() {
        this.vj.set(3);
        Handler pcc = pcc.pcc();
        if (pcc != null) {
            pcc.removeCallbacks(this.kj);
        }
    }

    public void pcc(final int i) {
        Handler pcc;
        if (this.vj.get() == 3 || (pcc = pcc.pcc()) == null) {
            return;
        }
        pcc.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.qy.pcc.sf.2
            @Override // java.lang.Runnable
            public void run() {
                if (i == 4 && sf.this.oo.get()) {
                    sf.this.vj();
                    return;
                }
                int i2 = i;
                if (i2 == 8) {
                    sf.this.wh();
                } else if (i2 == 5) {
                    sf.this.oo();
                }
            }
        });
    }

    public void pcc(boolean z) {
        this.oo.set(z);
    }
}
