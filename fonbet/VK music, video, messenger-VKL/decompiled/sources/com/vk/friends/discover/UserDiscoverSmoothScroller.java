package com.vk.friends.discover;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.friends.discover.UserDiscoverState;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.thq0;
import xsna.uhq0;
import xsna.zrp;

/* compiled from: UserDiscoverSmoothScroller.kt */
/* loaded from: classes13.dex */
public final class UserDiscoverSmoothScroller extends RecyclerView.z {
    public final ScrollType a;
    public final UsersDiscoverLayoutManager b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserDiscoverSmoothScroller.kt */
    public static final class ScrollType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScrollType[] $VALUES;
        public static final ScrollType AutomaticRemove;
        public static final ScrollType AutomaticRewind;
        public static final ScrollType ButtonAccept;
        public static final ScrollType ButtonDecline;
        public static final ScrollType FinishManualAccept;
        public static final ScrollType FinishManualDecline;
        public static final ScrollType ManualCancel;
        public static final ScrollType ManualSwipe;
        public static final ScrollType OnBoardingCancel;
        public static final ScrollType OnBoardingCancelLeft;
        public static final ScrollType OnBoardingCancelRight;
        public static final ScrollType OnBoardingLeft;
        public static final ScrollType OnBoardingRight;

        static {
            ScrollType scrollType = new ScrollType("ButtonAccept", 0);
            ButtonAccept = scrollType;
            ScrollType scrollType2 = new ScrollType("ButtonDecline", 1);
            ButtonDecline = scrollType2;
            ScrollType scrollType3 = new ScrollType("FinishManualAccept", 2);
            FinishManualAccept = scrollType3;
            ScrollType scrollType4 = new ScrollType("FinishManualDecline", 3);
            FinishManualDecline = scrollType4;
            ScrollType scrollType5 = new ScrollType("AutomaticRewind", 4);
            AutomaticRewind = scrollType5;
            ScrollType scrollType6 = new ScrollType("AutomaticRemove", 5);
            AutomaticRemove = scrollType6;
            ScrollType scrollType7 = new ScrollType("ManualSwipe", 6);
            ManualSwipe = scrollType7;
            ScrollType scrollType8 = new ScrollType("ManualCancel", 7);
            ManualCancel = scrollType8;
            ScrollType scrollType9 = new ScrollType("OnBoardingLeft", 8);
            OnBoardingLeft = scrollType9;
            ScrollType scrollType10 = new ScrollType("OnBoardingRight", 9);
            OnBoardingRight = scrollType10;
            ScrollType scrollType11 = new ScrollType("OnBoardingCancelLeft", 10);
            OnBoardingCancelLeft = scrollType11;
            ScrollType scrollType12 = new ScrollType("OnBoardingCancelRight", 11);
            OnBoardingCancelRight = scrollType12;
            ScrollType scrollType13 = new ScrollType("OnBoardingCancel", 12);
            OnBoardingCancel = scrollType13;
            ScrollType[] scrollTypeArr = {scrollType, scrollType2, scrollType3, scrollType4, scrollType5, scrollType6, scrollType7, scrollType8, scrollType9, scrollType10, scrollType11, scrollType12, scrollType13};
            $VALUES = scrollTypeArr;
            $ENTRIES = new asp(scrollTypeArr);
        }

        public ScrollType() {
            throw null;
        }

        public static ScrollType valueOf(String str) {
            return (ScrollType) Enum.valueOf(ScrollType.class, str);
        }

        public static ScrollType[] values() {
            return (ScrollType[]) $VALUES.clone();
        }
    }

    /* compiled from: UserDiscoverSmoothScroller.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollType.values().length];
            try {
                iArr[ScrollType.AutomaticRewind.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollType.ButtonAccept.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScrollType.FinishManualAccept.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScrollType.AutomaticRemove.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScrollType.ButtonDecline.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScrollType.FinishManualDecline.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ScrollType.ManualSwipe.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ScrollType.ManualCancel.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ScrollType.OnBoardingCancel.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ScrollType.OnBoardingLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ScrollType.OnBoardingRight.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ScrollType.OnBoardingCancelRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ScrollType.OnBoardingCancelLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserDiscoverSmoothScroller(ScrollType scrollType, UsersDiscoverLayoutManager usersDiscoverLayoutManager) {
        this.a = scrollType;
        this.b = usersDiscoverLayoutManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final void onSeekTargetStep(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        if (a.$EnumSwitchMapping$0[this.a.ordinal()] == 1) {
            Direction direction = Direction.Left;
            UsersDiscoverLayoutManager usersDiscoverLayoutManager = this.b;
            UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
            thq0 thq0Var = usersDiscoverLayoutManager.g;
            int p = usersDiscoverLayoutManager.p(direction, userDiscoverState);
            thq0Var.getClass();
            aVar.b(p, i2, thq0Var.e, thq0Var.d);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final void onStart() {
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = this.b;
        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
        UserDiscoverState userDiscoverState2 = usersDiscoverLayoutManager.f;
        switch (a.$EnumSwitchMapping$0[this.a.ordinal()]) {
            case 1:
                userDiscoverState.a = UserDiscoverState.Status.RewindAnimating;
                return;
            case 2:
            case 5:
                userDiscoverState.a = UserDiscoverState.Status.ButtonSwipeAnimating;
                if (usersDiscoverLayoutManager.s() == null || usersDiscoverLayoutManager.c == null) {
                    return;
                }
                int i = userDiscoverState2.f;
                return;
            case 3:
            case 6:
                userDiscoverState.a = UserDiscoverState.Status.FinishManualSwipeAnimating;
                if (usersDiscoverLayoutManager.s() == null || usersDiscoverLayoutManager.c == null) {
                    return;
                }
                int i2 = userDiscoverState2.f;
                return;
            case 4:
                userDiscoverState.a = UserDiscoverState.Status.AutomaticRemoveAnimating;
                if (usersDiscoverLayoutManager.s() == null || usersDiscoverLayoutManager.c == null) {
                    return;
                }
                int i3 = userDiscoverState2.f;
                return;
            case 7:
                userDiscoverState.a = UserDiscoverState.Status.ManualSwipeAnimating;
                if (usersDiscoverLayoutManager.s() == null || usersDiscoverLayoutManager.c == null) {
                    return;
                }
                int i4 = userDiscoverState2.f;
                return;
            case 8:
                userDiscoverState.a = UserDiscoverState.Status.RewindAnimating;
                return;
            case 9:
                userDiscoverState.a = UserDiscoverState.Status.OnBoardingCanceling;
                return;
            case 10:
            case 11:
                userDiscoverState.a = UserDiscoverState.Status.OnBoardingAnimating;
                return;
            case 12:
            case 13:
                userDiscoverState.a = UserDiscoverState.Status.OnBoardingAnimating;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final void onStop() {
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = this.b;
        uhq0 uhq0Var = usersDiscoverLayoutManager.c;
        switch (a.$EnumSwitchMapping$0[this.a.ordinal()]) {
            case 1:
                View s = usersDiscoverLayoutManager.s();
                if (s == null || uhq0Var == null) {
                    return;
                }
                uhq0Var.d(usersDiscoverLayoutManager.f.f, s);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
            case 9:
                return;
            case 10:
                if (uhq0Var != null) {
                    uhq0Var.h();
                    return;
                }
                return;
            case 11:
                if (uhq0Var != null) {
                    uhq0Var.c();
                    return;
                }
                return;
            case 12:
                if (uhq0Var != null) {
                    uhq0Var.a();
                    return;
                }
                return;
            case 13:
                if (uhq0Var != null) {
                    uhq0Var.e();
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z
    public final void onTargetFound(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        int i = a.$EnumSwitchMapping$0[this.a.ordinal()];
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = this.b;
        switch (i) {
            case 1:
                thq0 thq0Var = usersDiscoverLayoutManager.g;
                aVar.b(translationX, translationY, thq0Var.e, thq0Var.d);
                return;
            case 2:
            case 3:
            case 4:
                Direction direction = Direction.Right;
                UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
                thq0 thq0Var2 = usersDiscoverLayoutManager.g;
                int p = usersDiscoverLayoutManager.p(direction, userDiscoverState);
                thq0Var2.getClass();
                aVar.b(p, translationY, thq0Var2.c, thq0Var2.b);
                return;
            case 5:
            case 6:
                Direction direction2 = Direction.Left;
                UserDiscoverState userDiscoverState2 = usersDiscoverLayoutManager.f;
                thq0 thq0Var3 = usersDiscoverLayoutManager.g;
                int p2 = usersDiscoverLayoutManager.p(direction2, userDiscoverState2);
                thq0Var3.getClass();
                aVar.b(p2, translationY, thq0Var3.c, thq0Var3.b);
                return;
            case 7:
                thq0 thq0Var4 = usersDiscoverLayoutManager.g;
                aVar.b(translationX * (-3), translationY * (-3), thq0Var4.c, thq0Var4.b);
                return;
            case 8:
                thq0 thq0Var5 = usersDiscoverLayoutManager.g;
                aVar.b(translationX, translationY, thq0Var5.e, thq0Var5.d);
                return;
            case 9:
                thq0 thq0Var6 = usersDiscoverLayoutManager.g;
                aVar.b(translationX, translationY, thq0Var6.e, thq0Var6.d);
                return;
            case 10:
                Direction direction3 = Direction.Left;
                int q = usersDiscoverLayoutManager.q(direction3, usersDiscoverLayoutManager.f);
                int r = usersDiscoverLayoutManager.r(direction3, usersDiscoverLayoutManager.f);
                thq0 thq0Var7 = usersDiscoverLayoutManager.g;
                aVar.b(q, r, thq0Var7.k, thq0Var7.j);
                return;
            case 11:
                Direction direction4 = Direction.Right;
                int q2 = usersDiscoverLayoutManager.q(direction4, usersDiscoverLayoutManager.f);
                int r2 = usersDiscoverLayoutManager.r(direction4, usersDiscoverLayoutManager.f);
                thq0 thq0Var8 = usersDiscoverLayoutManager.g;
                aVar.b(q2, r2, thq0Var8.g, thq0Var8.f);
                return;
            case 12:
                thq0 thq0Var9 = usersDiscoverLayoutManager.g;
                aVar.b(translationX, translationY, thq0Var9.i, thq0Var9.h);
                return;
            case 13:
                thq0 thq0Var10 = usersDiscoverLayoutManager.g;
                aVar.b(translationX, translationY, thq0Var10.m, thq0Var10.l);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
