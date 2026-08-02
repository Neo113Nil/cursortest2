package com.vk.music.stickyplayer.domain.onboarding;

import xsna.asp;
import xsna.q9k;
import xsna.vby;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingStrategy.kt */
/* loaded from: classes3.dex */
public final class OnboardingStrategy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ OnboardingStrategy[] $VALUES;
    public static final OnboardingStrategy ChipsAnimation;
    public static final a Companion;
    public static final OnboardingStrategy CrossfadeAnimation;
    public static final OnboardingStrategy LikeAnimation;
    public static final OnboardingStrategy None;
    public static final long ONBOARDING_ANIMATION_START_DELAY = 600;
    public static final OnboardingStrategy SheetAnimation;
    private final b incrementalCount;
    private final b preciseCount;

    /* compiled from: OnboardingStrategy.kt */
    public static final class a {
    }

    /* compiled from: OnboardingStrategy.kt */
    public interface b {

        /* compiled from: OnboardingStrategy.kt */
        @vby
        public static final class a implements b {
            public final long a;

            public /* synthetic */ a(long j) {
                this.a = j;
            }

            public final boolean equals(Object obj) {
                if (obj instanceof a) {
                    return this.a == ((a) obj).a;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return q9k.d("Number(value=", this.a, ')');
            }
        }

        /* compiled from: OnboardingStrategy.kt */
        /* renamed from: com.vk.music.stickyplayer.domain.onboarding.OnboardingStrategy$b$b, reason: collision with other inner class name */
        public static final class C1357b implements b {
            public static final C1357b a = new C1357b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1357b);
            }

            public final int hashCode() {
                return 1375193860;
            }

            public final String toString() {
                return "Skip";
            }
        }
    }

    static {
        b.C1357b c1357b = b.C1357b.a;
        OnboardingStrategy onboardingStrategy = new OnboardingStrategy("None", 0, c1357b, c1357b);
        None = onboardingStrategy;
        OnboardingStrategy onboardingStrategy2 = new OnboardingStrategy("SheetAnimation", 1, new b.a(1L), c1357b);
        SheetAnimation = onboardingStrategy2;
        OnboardingStrategy onboardingStrategy3 = new OnboardingStrategy("ChipsAnimation", 2, new b.a(3L), c1357b);
        ChipsAnimation = onboardingStrategy3;
        OnboardingStrategy onboardingStrategy4 = new OnboardingStrategy("LikeAnimation", 3, new b.a(4L), new b.a(5L));
        LikeAnimation = onboardingStrategy4;
        OnboardingStrategy onboardingStrategy5 = new OnboardingStrategy("CrossfadeAnimation", 4, c1357b, c1357b);
        CrossfadeAnimation = onboardingStrategy5;
        OnboardingStrategy[] onboardingStrategyArr = {onboardingStrategy, onboardingStrategy2, onboardingStrategy3, onboardingStrategy4, onboardingStrategy5};
        $VALUES = onboardingStrategyArr;
        $ENTRIES = new asp(onboardingStrategyArr);
        Companion = new a();
    }

    public OnboardingStrategy(String str, int i, b bVar, b bVar2) {
        this.preciseCount = bVar;
        this.incrementalCount = bVar2;
    }

    public static zrp<OnboardingStrategy> h() {
        return $ENTRIES;
    }

    public static OnboardingStrategy valueOf(String str) {
        return (OnboardingStrategy) Enum.valueOf(OnboardingStrategy.class, str);
    }

    public static OnboardingStrategy[] values() {
        return (OnboardingStrategy[]) $VALUES.clone();
    }
}
