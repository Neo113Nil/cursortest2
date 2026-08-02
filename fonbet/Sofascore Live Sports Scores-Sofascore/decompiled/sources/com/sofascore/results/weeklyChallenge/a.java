package com.sofascore.results.weeklyChallenge;

import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[WeeklyChallengeViewModel.LeaderboardInfoType.values().length];
        try {
            iArr[WeeklyChallengeViewModel.LeaderboardInfoType.FULL_LEADERBOARD_INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[WeeklyChallengeViewModel.LeaderboardInfoType.POINTS_INFO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[WeeklyChallengeViewModel.LeaderboardInfoType.ZONE_INFO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[WeeklyChallengeViewModel.LeaderboardInfoType.TIME_INFO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
