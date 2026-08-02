package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.HashMap;
import kotlin.Pair;
import xsna.on00;

/* loaded from: classes13.dex */
public final class Tc {
    private final F0 a;

    public Tc(F0 f0) {
        this.a = f0;
    }

    public final void a() {
        this.a.a(C0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.a.a(C0.PAUSE_AD, null);
    }

    public final void c() {
        this.a.a(C0.RESUME_AD, null);
    }

    public final void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        this.a.a(C0.OPERATIONAL_LOAD_SUCCESS, hashMap);
    }

    public final void a(long j, int i, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("errorCode", Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put("duration", Long.valueOf(j));
        this.a.a(C0.OPERATIONAL_LOAD_FAILED, hashMap);
    }

    public final void a(double d) {
        this.a.a(C0.OPERATIONAL_SET_CONFIGURATIONS, on00.f(new Pair(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }

    public static /* synthetic */ void a(Tc tc, LevelPlayReward levelPlayReward, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        tc.a(levelPlayReward, str, str2);
    }

    public final void a(LevelPlayReward levelPlayReward, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, levelPlayReward.getName());
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(levelPlayReward.getAmount()));
        if (str != null) {
            hashMap.put("placement", str);
        }
        if (str2 != null) {
            hashMap.put("reason", str2);
        }
        this.a.a(C0.OPERATIONAL_GET_REWARD, hashMap);
    }
}
