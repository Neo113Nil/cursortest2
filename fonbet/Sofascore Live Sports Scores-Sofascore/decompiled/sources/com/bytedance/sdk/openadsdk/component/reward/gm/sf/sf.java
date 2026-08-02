package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.os.Handler;
import android.os.Message;
import com.bytedance.sdk.component.utils.tsz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements tsz.pcc {
    private long gm;
    private long oo;
    private pcc sf;
    private Handler pcc = new tsz(this);
    private boolean vj = false;
    private boolean wh = false;
    private int qf = 10000;
    private int kj = 10000;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc();

        void pcc(EnumC0069sf enumC0069sf);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf$sf, reason: collision with other inner class name */
    public enum EnumC0069sf {
        NORMAL,
        TIMEOUT,
        DISCONNECTED
    }

    private void gm() {
        if (!this.vj || this.sf == null) {
            return;
        }
        this.gm = System.currentTimeMillis();
        this.wh = true;
        this.sf.pcc();
        this.pcc.removeMessages(2);
        this.pcc.sendEmptyMessageDelayed(2, this.kj);
        this.pcc.removeMessages(1);
        this.pcc.sendEmptyMessageDelayed(1, this.qf);
    }

    private void oo() {
        if (this.vj && this.wh && System.currentTimeMillis() - this.gm >= this.qf) {
            this.wh = false;
            pcc pccVar = this.sf;
            if (pccVar != null) {
                pccVar.pcc(EnumC0069sf.TIMEOUT);
            }
            pcc();
        }
    }

    public void pcc(pcc pccVar) {
        if (this.vj) {
            return;
        }
        this.sf = pccVar;
        this.vj = true;
        this.wh = false;
        this.pcc.sendEmptyMessage(1);
        if (pccVar != null) {
            pccVar.pcc(EnumC0069sf.NORMAL);
        }
    }

    public void sf() {
        if (this.vj && this.wh) {
            this.oo = System.currentTimeMillis();
            this.wh = false;
            this.pcc.removeMessages(2);
            pcc pccVar = this.sf;
            if (pccVar != null) {
                pccVar.pcc(EnumC0069sf.NORMAL);
            }
        }
    }

    public void pcc(int i) {
        this.qf = i;
    }

    public void pcc() {
        this.vj = false;
        this.wh = false;
        this.pcc.removeMessages(1);
        this.pcc.removeMessages(2);
        this.sf = null;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
        int i = message.what;
        if (i == 1) {
            gm();
        } else {
            if (i != 2) {
                return;
            }
            oo();
        }
    }

    public void sf(int i) {
        this.kj = i;
    }
}
