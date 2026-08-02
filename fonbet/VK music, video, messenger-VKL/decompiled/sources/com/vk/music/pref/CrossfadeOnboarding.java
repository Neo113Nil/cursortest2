package com.vk.music.pref;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicPrefs.kt */
/* loaded from: classes3.dex */
public final class CrossfadeOnboarding {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CrossfadeOnboarding[] $VALUES;
    public static final CrossfadeOnboarding BothOnboardings;
    public static final CrossfadeOnboarding MenuOnboarding;
    public static final CrossfadeOnboarding None;
    private final int num;

    static {
        CrossfadeOnboarding crossfadeOnboarding = new CrossfadeOnboarding("None", 0, 0);
        None = crossfadeOnboarding;
        CrossfadeOnboarding crossfadeOnboarding2 = new CrossfadeOnboarding("BothOnboardings", 1, 3);
        BothOnboardings = crossfadeOnboarding2;
        CrossfadeOnboarding crossfadeOnboarding3 = new CrossfadeOnboarding("MenuOnboarding", 2, 1);
        MenuOnboarding = crossfadeOnboarding3;
        CrossfadeOnboarding[] crossfadeOnboardingArr = {crossfadeOnboarding, crossfadeOnboarding2, crossfadeOnboarding3};
        $VALUES = crossfadeOnboardingArr;
        $ENTRIES = new asp(crossfadeOnboardingArr);
    }

    public CrossfadeOnboarding(String str, int i, int i2) {
        this.num = i2;
    }

    public static CrossfadeOnboarding valueOf(String str) {
        return (CrossfadeOnboarding) Enum.valueOf(CrossfadeOnboarding.class, str);
    }

    public static CrossfadeOnboarding[] values() {
        return (CrossfadeOnboarding[]) $VALUES.clone();
    }
}
