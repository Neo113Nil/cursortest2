package com.bytedance.sdk.openadsdk.core.gm;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    public static int ork = 8;
    public float pcc = -1.0f;
    public float sf = -1.0f;
    public float gm = -1.0f;
    public float oo = -1.0f;
    public long vj = -1;
    public long wh = -1;
    public int qf = -1;
    public int kj = BackupConstant.UNFINISHED_FAIL_CODE;
    public int vy = -1;
    public boolean vh = true;
    public SparseArray<gm.pcc> tmg = new SparseArray<>();
    private float hc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float gbb = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float jr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float dax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private long nac = 0;
    private int lu = 0;
    private int gpj = 0;

    static {
        if (lu.pcc() != null) {
            ork = lu.sf();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r10.dax <= r3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(MotionEvent motionEvent) {
        int i;
        this.kj = motionEvent.getDeviceId();
        int i2 = 0;
        this.qf = motionEvent.getToolType(0);
        this.vy = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i3 = 1;
        if (actionMasked != 0) {
            i = 3;
            if (actionMasked == 1) {
                this.gm = motionEvent.getRawX();
                this.oo = motionEvent.getRawY();
                this.wh = System.currentTimeMillis();
                if (Math.abs(this.gm - this.lu) >= ork || Math.abs(this.oo - this.gpj) >= ork) {
                    this.vh = false;
                }
            } else if (actionMasked != 2) {
                i2 = actionMasked != 3 ? -1 : 4;
            } else {
                this.jr = Math.abs(motionEvent.getX() - this.hc) + this.jr;
                this.dax = Math.abs(motionEvent.getY() - this.gbb) + this.dax;
                this.hc = motionEvent.getX();
                this.gbb = motionEvent.getY();
                if (System.currentTimeMillis() - this.nac > 200) {
                    float f = this.jr;
                    int i4 = ork;
                    if (f <= i4) {
                    }
                    this.gm = motionEvent.getRawX();
                    this.oo = motionEvent.getRawY();
                    if (Math.abs(this.gm - this.lu) < ork || Math.abs(this.oo - this.gpj) >= ork) {
                        this.vh = false;
                    }
                    i = i3;
                }
                i3 = 2;
                this.gm = motionEvent.getRawX();
                this.oo = motionEvent.getRawY();
                if (Math.abs(this.gm - this.lu) < ork) {
                }
                this.vh = false;
                i = i3;
            }
            this.tmg.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.lu = (int) motionEvent.getRawX();
        this.gpj = (int) motionEvent.getRawY();
        this.pcc = motionEvent.getRawX();
        this.sf = motionEvent.getRawY();
        this.vj = System.currentTimeMillis();
        this.qf = motionEvent.getToolType(0);
        this.kj = motionEvent.getDeviceId();
        this.vy = motionEvent.getSource();
        this.jr = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.dax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.nac = System.currentTimeMillis();
        this.vh = true;
        this.hc = motionEvent.getX();
        this.gbb = motionEvent.getY();
        i = i2;
        this.tmg.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
