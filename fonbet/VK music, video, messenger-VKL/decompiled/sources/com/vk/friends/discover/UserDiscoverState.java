package com.vk.friends.discover;

import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.zrp;

/* compiled from: UserDiscoverState.kt */
/* loaded from: classes13.dex */
public final class UserDiscoverState {
    public Status a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserDiscoverState.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status AutomaticRemoveAnimated;
        public static final Status AutomaticRemoveAnimating;
        public static final Status ButtonSwipeAnimated;
        public static final Status ButtonSwipeAnimating;
        public static final Status Dragging;
        public static final Status FinishManualSwipeAnimated;
        public static final Status FinishManualSwipeAnimating;
        public static final Status Idle;
        public static final Status ManualSwipeAnimated;
        public static final Status ManualSwipeAnimating;
        public static final Status OnBoardingAnimated;
        public static final Status OnBoardingAnimating;
        public static final Status OnBoardingCanceling;
        public static final Status PauseButtonSwipeAnimating;
        public static final Status PauseManualSwipeAnimating;
        public static final Status RewindAnimating;

        /* compiled from: UserDiscoverState.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                try {
                    iArr[Status.ManualSwipeAnimating.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Status.ButtonSwipeAnimating.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Status.FinishManualSwipeAnimating.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Status.OnBoardingAnimating.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Status.AutomaticRemoveAnimating.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            Status status = new Status("Idle", 0);
            Idle = status;
            Status status2 = new Status("Dragging", 1);
            Dragging = status2;
            Status status3 = new Status("RewindAnimating", 2);
            RewindAnimating = status3;
            Status status4 = new Status("ButtonSwipeAnimating", 3);
            ButtonSwipeAnimating = status4;
            Status status5 = new Status("ButtonSwipeAnimated", 4);
            ButtonSwipeAnimated = status5;
            Status status6 = new Status("FinishManualSwipeAnimating", 5);
            FinishManualSwipeAnimating = status6;
            Status status7 = new Status("FinishManualSwipeAnimated", 6);
            FinishManualSwipeAnimated = status7;
            Status status8 = new Status("ManualSwipeAnimating", 7);
            ManualSwipeAnimating = status8;
            Status status9 = new Status("ManualSwipeAnimated", 8);
            ManualSwipeAnimated = status9;
            Status status10 = new Status("PauseButtonSwipeAnimating", 9);
            PauseButtonSwipeAnimating = status10;
            Status status11 = new Status("PauseManualSwipeAnimating", 10);
            PauseManualSwipeAnimating = status11;
            Status status12 = new Status("OnBoardingAnimating", 11);
            OnBoardingAnimating = status12;
            Status status13 = new Status("OnBoardingAnimated", 12);
            OnBoardingAnimated = status13;
            Status status14 = new Status("OnBoardingCanceling", 13);
            OnBoardingCanceling = status14;
            Status status15 = new Status("AutomaticRemoveAnimating", 14);
            AutomaticRemoveAnimating = status15;
            Status status16 = new Status("AutomaticRemoveAnimated", 15);
            AutomaticRemoveAnimated = status16;
            Status[] statusArr = {status, status2, status3, status4, status5, status6, status7, status8, status9, status10, status11, status12, status13, status14, status15, status16};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status() {
            throw null;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final boolean h() {
            return this == PauseButtonSwipeAnimating || this == PauseManualSwipeAnimating;
        }
    }

    public final boolean a(int i, int i2) {
        if (i == this.f || i < 0 || i2 < i) {
            return false;
        }
        Status status = this.a;
        status.getClass();
        return !(status != Status.Idle);
    }

    public final Direction b() {
        return Math.abs(this.e) < Math.abs(this.d) ? ((float) this.d) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Direction.Left : Direction.Right : ((float) this.e) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Direction.Top : Direction.Bottom;
    }

    public final Direction c() {
        return ((float) this.d) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Direction.Left : Direction.Right;
    }
}
