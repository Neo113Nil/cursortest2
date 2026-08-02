package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pq implements Handler.Callback, pcc.InterfaceC0088pcc {
    private boolean kj;
    private final com.bytedance.sdk.openadsdk.core.model.of oo;
    private int ork;
    private boolean qf;
    private int tmg;
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf vj;
    private boolean vy;
    private boolean wh;
    private float pcc = 1.0f;
    private int sf = 1000;
    private final Handler gm = new Handler(Looper.getMainLooper(), this);
    private int vh = 0;

    public pq(@NonNull com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, @NonNull com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        this.ork = 0;
        this.tmg = 0;
        this.vj = sfVar;
        this.oo = ofVar;
        if (ofVar.tuy()) {
            if (ofVar.quq() >= 0) {
                this.tmg = ofVar.quq();
            } else {
                this.tmg = com.bytedance.sdk.openadsdk.core.lu.oo().vh(String.valueOf(ofVar.kot()));
            }
        } else if (ofVar.qra()) {
            if (ofVar.bm() >= 0) {
                this.tmg = ofVar.bm();
            } else {
                this.tmg = com.bytedance.sdk.openadsdk.core.lu.oo().lo(String.valueOf(ofVar.kot()));
            }
        }
        this.ork = (int) sfVar.fum.tsx();
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "totalTime: " + this.ork + ", skipTime=" + this.tmg);
    }

    public void gm() {
        if (this.wh) {
            this.gm.removeMessages(1024);
            this.gm.sendEmptyMessage(1024);
            this.qf = false;
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        if (message.what == 1024) {
            int i = this.ork;
            int i2 = this.vh;
            int i3 = i - i2;
            this.vj.fum.pcc(i2 * 1000);
            com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "handleMessage: currentTime= " + this.vh + ", mRemainTimeInSeconds=" + i3);
            if (i3 > 0) {
                Activity activity = this.vj.rnn;
                if (activity instanceof TTRewardVideoActivity) {
                    ((TTRewardVideoActivity) activity).gm(this.vh * 1000, this.ork);
                }
                com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.vj.yt;
                boolean z = false;
                if (vyVar != null && vyVar.pcc() != null) {
                    this.vj.yt.pcc().setTime(String.valueOf(i3), this.vh, 0, false);
                }
                if (this.oo.tuy()) {
                    com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar2 = this.vj.yt;
                    if (vyVar2 != null) {
                        if (vyVar2.vy() && this.tmg > 0) {
                            z = true;
                        }
                        this.vy = z;
                    }
                    if (!this.vy || this.vh < this.tmg || this.vj.sf.bg() == 5 || this.vj.sf.bg() == 33) {
                        this.vj.zti.pcc(String.valueOf(i3), null);
                    } else {
                        this.vj.pcc(true);
                        this.vj.zti.pcc(String.valueOf(i3), TTAdDislikeToast.getSkipText());
                        this.vj.zti.vj(true);
                    }
                } else if (this.oo.qra() && (this.vj.yt.vy() || this.vj.sf.nmd())) {
                    Activity activity2 = this.vj.rnn;
                    if (activity2 instanceof TTFullScreenVideoActivity) {
                        ((TTFullScreenVideoActivity) activity2).pcc(this.vh);
                    }
                    this.vj.zti.oo(true);
                    this.vj.zti.pcc(String.valueOf(i3), null);
                }
                this.vh++;
                if (this.vj.fum.gm()) {
                    com.bytedance.sdk.openadsdk.core.model.ye uk = this.vj.sf.uk();
                    if (uk != null) {
                        float pcc = uk.pcc();
                        this.pcc = pcc;
                        if (pcc <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            this.pcc = 1.0f;
                        }
                    }
                } else {
                    this.pcc = 1.0f;
                }
                int i4 = (int) (1000.0f / this.pcc);
                com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "handleMessage: next msg intervalInMillis = ".concat(String.valueOf(i4)));
                this.gm.sendEmptyMessageDelayed(message.what, i4);
            }
        }
        return true;
    }

    public void oo() {
        if (!this.wh || this.qf) {
            return;
        }
        this.gm.removeMessages(1024);
        this.qf = true;
    }

    public void pcc(long j) {
        int ceil = (int) Math.ceil(j / 1000.0d);
        if (this.qf && !this.kj) {
            this.vh = ceil;
            gm();
        } else {
            if (this.wh || this.kj) {
                return;
            }
            this.vh = ceil;
            this.wh = true;
            sf();
        }
    }

    public void sf() {
        this.gm.sendEmptyMessage(1024);
        this.qf = false;
    }

    public void vj() {
        this.gm.removeMessages(1024);
        this.wh = false;
        this.kj = true;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.vj;
        if (sfVar != null) {
            sfVar.fum.zti();
        }
    }

    public boolean pcc() {
        return this.wh;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.oo.pcc.InterfaceC0088pcc
    public void pcc(int i) {
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.TopLayoutHelper", "onPlayerStateChanged: ".concat(String.valueOf(i)));
        if (i == 1) {
            gm();
            return;
        }
        if (i == 2) {
            oo();
        } else if (i == 3 || i == 4) {
            vj();
        }
    }
}
