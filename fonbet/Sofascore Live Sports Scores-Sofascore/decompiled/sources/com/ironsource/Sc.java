package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import defpackage.sub;
import java.util.HashMap;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Sc {

    @NotNull
    private final E0 a;

    public Sc(@NotNull E0 e0) {
        e0.getClass();
        this.a = e0;
    }

    public final void a(@NotNull LevelPlayReward levelPlayReward, @Nullable String str, @Nullable String str2) {
        levelPlayReward.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, levelPlayReward.getName());
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(levelPlayReward.getAmount()));
        if (str != null) {
            hashMap.put("placement", str);
        }
        if (str2 != null) {
            hashMap.put("reason", str2);
        }
        this.a.a(B0.OPERATIONAL_GET_REWARD, hashMap);
    }

    public final void b() {
        this.a.a(B0.PAUSE_AD, null);
    }

    public final void c() {
        this.a.a(B0.RESUME_AD, null);
    }

    public final void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(B0.OPERATIONAL_LOAD_SUCCESS, hashMap);
    }

    public final void a(long j, int i, @NotNull String str) {
        str.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.a.a(B0.OPERATIONAL_LOAD_FAILED, hashMap);
    }

    public final void a(double d) {
        this.a.a(B0.OPERATIONAL_SET_CONFIGURATIONS, sub.d(new Pair(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
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

    public final void a() {
        this.a.a(B0.OPERATIONAL_LOAD_AD, new HashMap());
    }
}
