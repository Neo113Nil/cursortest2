package com.bytedance.sdk.openadsdk.component.wh;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements Handler.Callback {
    private pcc gm;
    private long ork;
    private boolean qf;
    private final com.bytedance.sdk.openadsdk.component.kj.pcc sf;
    private boolean tmg;
    private long vh;
    private Handler pcc = new Handler(Looper.myLooper(), this);
    private int oo = 0;
    private int vj = 5;
    private int wh = 0;
    private final int kj = 1000;
    private int vy = 1000;

    public sf(com.bytedance.sdk.openadsdk.component.kj.pcc pccVar) {
        this.sf = pccVar;
    }

    public void gm() {
        if (this.pcc != null) {
            Message obtain = Message.obtain();
            obtain.what = 100;
            obtain.arg1 = this.oo;
            this.pcc.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 100 && this.pcc != null) {
            int i = message.arg1;
            pcc(i);
            if (i > 0) {
                Message obtain = Message.obtain();
                obtain.what = 100;
                obtain.arg1 = i - 1;
                this.pcc.sendMessageDelayed(obtain, this.vy);
            }
        }
        return true;
    }

    public void oo() {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.removeMessages(100);
        }
    }

    public void pcc(int i, float f, boolean z) {
        com.bytedance.sdk.openadsdk.component.kj.pcc pccVar;
        if ((i == 1 || i == 2) && this.tmg != z) {
            this.tmg = z;
            if (i == 1 && (pccVar = this.sf) != null) {
                pccVar.pcc(z);
            }
            if (z) {
                try {
                    this.vy = (int) (1000.0f / f);
                    this.vh = System.currentTimeMillis();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                long currentTimeMillis = (System.currentTimeMillis() - this.vh) + this.ork;
                this.ork = currentTimeMillis;
                com.bytedance.sdk.openadsdk.component.kj.pcc pccVar2 = this.sf;
                if (pccVar2 != null) {
                    pccVar2.pcc(currentTimeMillis);
                }
            }
            this.vy = 1000;
        }
    }

    public void sf() {
        Handler handler = this.pcc;
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(100, this.vj, 0));
        }
    }

    public void vj() {
        this.pcc.removeCallbacksAndMessages(null);
        this.pcc = null;
    }

    public void sf(int i) {
        this.wh = Math.min(i, this.vj);
    }

    public void pcc(float f) {
        int i = (int) f;
        this.vj = i;
        if (i <= 0) {
            this.vj = 5;
        }
    }

    public void pcc(pcc pccVar) {
        this.gm = pccVar;
    }

    public int pcc() {
        return this.wh;
    }

    public void pcc(int i) {
        this.oo = i;
        int i2 = this.vj - i;
        this.sf.sf(i2 * 1000);
        boolean z = true;
        if (i <= 0) {
            pcc pccVar = this.gm;
            if (pccVar != null && !this.qf) {
                pccVar.sf();
                this.qf = true;
            }
            i = 0;
        }
        pcc pccVar2 = this.gm;
        if (pccVar2 != null) {
            int max = Math.max(this.wh - i2, 0);
            if (i != 0 && i2 < this.wh) {
                z = false;
            }
            pccVar2.pcc(max, z);
        }
    }
}
