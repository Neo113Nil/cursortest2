package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Sc {
    private final F0 a;

    public Sc(F0 eventsWrapper) {
        Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.a = eventsWrapper;
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

    public final void a(long j, int i, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", reason);
        hashMap.put("duration", Long.valueOf(j));
        this.a.a(C0.OPERATIONAL_LOAD_FAILED, hashMap);
    }

    public final void a(double d) {
        this.a.a(C0.OPERATIONAL_SET_CONFIGURATIONS, MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }

    public static /* synthetic */ void a(Sc sc, LevelPlayReward levelPlayReward, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        sc.a(levelPlayReward, str, str2);
    }

    public final void a(LevelPlayReward reward, String str, String str2) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, reward.getName());
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(reward.getAmount()));
        if (str != null) {
            hashMap.put("placement", str);
        }
        if (str2 != null) {
            hashMap.put("reason", str2);
        }
        this.a.a(C0.OPERATIONAL_GET_REWARD, hashMap);
    }
}
