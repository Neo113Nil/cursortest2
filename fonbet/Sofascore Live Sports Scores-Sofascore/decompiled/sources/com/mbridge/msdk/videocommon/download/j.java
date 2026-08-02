package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import defpackage.w1l;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class j {
    private AtomicBoolean a;
    private AtomicBoolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        private static final j a = new j();
    }

    public boolean a(int i) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.b = new AtomicBoolean(s0.a().a("r_v_r_f_c_r", false));
        } catch (Exception e) {
            this.b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                w1l.v(e, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.b.get();
    }

    public boolean b(int i) {
        if (MBridgeConstans.DEBUG) {
            q0.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i != 94 && i != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.a = new AtomicBoolean(s0.a().a("r_v_r_f_l", false));
        } catch (Exception e) {
            this.a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                w1l.v(e, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.a.get();
    }

    private j() {
    }

    public static j a() {
        return b.a;
    }
}
