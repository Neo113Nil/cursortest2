package com.vk.friends.discover;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.friends.discover.Direction;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UserDiscoverState;
import com.vk.friends.discover.UsersDiscoverLayoutManager;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import xsna.au9;
import xsna.blr;
import xsna.fqo0;
import xsna.gmy;
import xsna.hmr;
import xsna.r0i0;
import xsna.thq0;
import xsna.uhq0;

/* compiled from: UsersDiscoverLayoutManager.kt */
/* loaded from: classes13.dex */
public final class UsersDiscoverLayoutManager extends RecyclerView.o implements RecyclerView.z.b, hmr, gmy {
    public final RecyclerView.Adapter<?> b;
    public uhq0 c;
    public final boolean d;
    public boolean e;
    public final UserDiscoverState f;
    public final thq0 g;
    public final List<Direction> h;
    public final Handler i;
    public final HashSet<Long> j;

    /* compiled from: UsersDiscoverLayoutManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UserDiscoverState.Status.values().length];
            try {
                iArr[UserDiscoverState.Status.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserDiscoverState.Status.RewindAnimating.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserDiscoverState.Status.ButtonSwipeAnimating.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserDiscoverState.Status.FinishManualSwipeAnimating.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserDiscoverState.Status.AutomaticRemoveAnimating.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserDiscoverState.Status.ManualSwipeAnimating.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UserDiscoverState.Status.OnBoardingAnimating.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UserDiscoverState.Status.OnBoardingCanceling.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UserDiscoverState.Status.Dragging.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[UserDiscoverState.Status.ButtonSwipeAnimated.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[UserDiscoverState.Status.FinishManualSwipeAnimated.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[UserDiscoverState.Status.AutomaticRemoveAnimated.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[UserDiscoverState.Status.ManualSwipeAnimated.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[UserDiscoverState.Status.OnBoardingAnimated.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UsersDiscoverLayoutManager() {
        throw null;
    }

    public UsersDiscoverLayoutManager(RecyclerView.Adapter adapter, uhq0 uhq0Var) {
        this.b = adapter;
        this.c = uhq0Var;
        this.d = true;
        this.e = true;
        UserDiscoverState userDiscoverState = new UserDiscoverState();
        userDiscoverState.a = UserDiscoverState.Status.Idle;
        userDiscoverState.g = -1;
        this.f = userDiscoverState;
        this.g = new thq0();
        this.h = Collections.singletonList(Direction.Right);
        this.i = new Handler();
        this.j = new HashSet<>();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollHorizontally() {
        return this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean canScrollVertically() {
        return this.e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF computeScrollVectorForPosition(int i) {
        return null;
    }

    @Override // xsna.hmr
    public final int d() {
        return this.f.f;
    }

    @Override // xsna.gmy
    public final int e() {
        int i = this.f.f;
        this.g.getClass();
        return Math.min(i + 3, Math.max(0, getItemCount() - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-1, -1);
    }

    public final boolean o(int i, UserDiscoverState userDiscoverState) {
        if (userDiscoverState.a != UserDiscoverState.Status.AutomaticRemoveAnimating && this.h.contains(userDiscoverState.b())) {
            uhq0 uhq0Var = this.c;
            if (!(uhq0Var != null ? uhq0Var.i(i) : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View s;
        uhq0 uhq0Var;
        v(vVar);
        if (a0Var == null || !a0Var.f || (s = s()) == null || (uhq0Var = this.c) == null) {
            return;
        }
        uhq0Var.d(this.f.f, s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onScrollStateChanged(int i) {
        UserDiscoverState userDiscoverState = this.f;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            userDiscoverState.a = UserDiscoverState.Status.Dragging;
            return;
        }
        if (userDiscoverState.a.h()) {
            return;
        }
        UserDiscoverState.Status status = userDiscoverState.a;
        if (status != UserDiscoverState.Status.OnBoardingAnimating) {
            status.getClass();
        } else if (!status.h()) {
            return;
        }
        if (userDiscoverState.a == UserDiscoverState.Status.OnBoardingCanceling) {
            userDiscoverState.a = UserDiscoverState.Status.Idle;
            return;
        }
        int i2 = userDiscoverState.g;
        if (i2 == -1) {
            userDiscoverState.a = UserDiscoverState.Status.Idle;
            userDiscoverState.g = -1;
            return;
        }
        int i3 = userDiscoverState.f;
        if (i3 == i2) {
            userDiscoverState.a = UserDiscoverState.Status.Idle;
            userDiscoverState.g = -1;
        } else {
            if (i3 >= i2) {
                u(i2);
                return;
            }
            if (o(i3, userDiscoverState)) {
                t(userDiscoverState.g, userDiscoverState.a == UserDiscoverState.Status.AutomaticRemoveAnimating ? UserDiscoverSmoothScroller.ScrollType.AutomaticRemove : userDiscoverState.c() == Direction.Right ? userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating ? UserDiscoverSmoothScroller.ScrollType.ButtonAccept : UserDiscoverSmoothScroller.ScrollType.FinishManualAccept : userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating ? UserDiscoverSmoothScroller.ScrollType.ButtonDecline : UserDiscoverSmoothScroller.ScrollType.FinishManualDecline);
            } else if (userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating) {
                userDiscoverState.a = UserDiscoverState.Status.PauseButtonSwipeAnimating;
            } else {
                userDiscoverState.a = UserDiscoverState.Status.PauseManualSwipeAnimating;
            }
        }
    }

    public final int p(Direction direction, UserDiscoverState userDiscoverState) {
        int i;
        this.g.getClass();
        int i2 = thq0.a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i2 == 1) {
            i = userDiscoverState.b;
        } else {
            if (i2 != 2) {
                return 0;
            }
            i = -userDiscoverState.b;
        }
        return i * 2;
    }

    public final int q(Direction direction, UserDiscoverState userDiscoverState) {
        thq0 thq0Var = this.g;
        thq0Var.getClass();
        int i = thq0.a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return (int) thq0Var.a(userDiscoverState);
        }
        if (i != 2) {
            return 0;
        }
        return -((int) thq0Var.a(userDiscoverState));
    }

    public final int r(Direction direction, UserDiscoverState userDiscoverState) {
        this.g.getClass();
        int i = thq0.a.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1 || i == 2) {
            return (int) (userDiscoverState.c * 0.05f);
        }
        return 0;
    }

    public final View s() {
        return findViewByPosition(this.f.f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        UserDiscoverState userDiscoverState = this.f;
        if (userDiscoverState.f == getItemCount()) {
            return 0;
        }
        switch (a.$EnumSwitchMapping$0[userDiscoverState.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                userDiscoverState.d -= i;
                v(vVar);
                break;
            case 9:
                int i2 = userDiscoverState.f;
                userDiscoverState.b();
                uhq0 uhq0Var = this.c;
                if (uhq0Var != null ? uhq0Var.f(i2) : true) {
                    userDiscoverState.d -= i;
                    v(vVar);
                    break;
                }
                break;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void scrollToPosition(int i) {
        int itemCount = getItemCount();
        UserDiscoverState userDiscoverState = this.f;
        if (userDiscoverState.a(i, itemCount)) {
            userDiscoverState.f = i;
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        UserDiscoverState userDiscoverState = this.f;
        if (userDiscoverState.f == getItemCount()) {
            return 0;
        }
        switch (a.$EnumSwitchMapping$0[userDiscoverState.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                userDiscoverState.e -= i;
                v(vVar);
                break;
            case 9:
                int i2 = userDiscoverState.f;
                userDiscoverState.b();
                uhq0 uhq0Var = this.c;
                if (uhq0Var != null ? uhq0Var.f(i2) : true) {
                    userDiscoverState.e -= i;
                    v(vVar);
                    break;
                }
                break;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        int itemCount = getItemCount();
        UserDiscoverState userDiscoverState = this.f;
        if (userDiscoverState.a(i, itemCount)) {
            if (userDiscoverState.f < i) {
                t(i, userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating ? UserDiscoverSmoothScroller.ScrollType.ButtonAccept : UserDiscoverSmoothScroller.ScrollType.FinishManualAccept);
            } else {
                u(i);
            }
        }
    }

    public final void t(int i, UserDiscoverSmoothScroller.ScrollType scrollType) {
        UserDiscoverState userDiscoverState = this.f;
        userDiscoverState.g = i;
        UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(scrollType, this);
        userDiscoverSmoothScroller.setTargetPosition(userDiscoverState.f);
        startSmoothScroll(userDiscoverSmoothScroller);
    }

    public final void u(int i) {
        View s = s();
        UserDiscoverState userDiscoverState = this.f;
        if (s != null && this.c != null) {
            int i2 = userDiscoverState.f;
        }
        userDiscoverState.g = i;
        userDiscoverState.f--;
        UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.AutomaticRewind, this);
        userDiscoverSmoothScroller.setTargetPosition(userDiscoverState.f);
        startSmoothScroll(userDiscoverSmoothScroller);
    }

    public final void v(RecyclerView.v vVar) {
        thq0 thq0Var;
        int i;
        View view;
        thq0 thq0Var2;
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = this;
        int width = usersDiscoverLayoutManager.getWidth();
        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
        userDiscoverState.b = width;
        userDiscoverState.c = usersDiscoverLayoutManager.getHeight();
        UserDiscoverState.Status status = userDiscoverState.a;
        status.getClass();
        int i2 = 3;
        if ((status == UserDiscoverState.Status.ManualSwipeAnimating || status == UserDiscoverState.Status.ButtonSwipeAnimating || status == UserDiscoverState.Status.FinishManualSwipeAnimating || status == UserDiscoverState.Status.AutomaticRemoveAnimating) && !status.h() && userDiscoverState.f < userDiscoverState.g && userDiscoverState.b * 2.0f < Math.abs(userDiscoverState.d)) {
            View s = usersDiscoverLayoutManager.s();
            if (s != null) {
                usersDiscoverLayoutManager.removeAndRecycleView(s, vVar);
            }
            final Direction b = userDiscoverState.b();
            final Direction c = userDiscoverState.c();
            final int i3 = userDiscoverState.f;
            final UserDiscoverState.Status status2 = userDiscoverState.a;
            status2.getClass();
            int i4 = UserDiscoverState.Status.a.$EnumSwitchMapping$0[status2.ordinal()];
            userDiscoverState.a = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? UserDiscoverState.Status.Idle : UserDiscoverState.Status.AutomaticRemoveAnimated : UserDiscoverState.Status.OnBoardingAnimated : UserDiscoverState.Status.FinishManualSwipeAnimated : UserDiscoverState.Status.ButtonSwipeAnimated : UserDiscoverState.Status.ManualSwipeAnimated;
            int i5 = userDiscoverState.f + 1;
            userDiscoverState.f = i5;
            userDiscoverState.d = 0;
            userDiscoverState.e = 0;
            if (i5 == userDiscoverState.g) {
                userDiscoverState.g = -1;
            }
            usersDiscoverLayoutManager = this;
            usersDiscoverLayoutManager.i.post(new Runnable(this, b, c, i3) { // from class: xsna.w0r0
                public final /* synthetic */ UsersDiscoverLayoutManager c;
                public final /* synthetic */ Direction d;
                public final /* synthetic */ int e;

                {
                    this.d = c;
                    this.e = i3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    uhq0 uhq0Var;
                    uhq0 uhq0Var2;
                    UserDiscoverState.Status status3 = UserDiscoverState.Status.ManualSwipeAnimating;
                    UserDiscoverState.Status status4 = UserDiscoverState.Status.this;
                    boolean z = status4 == status3 || status4 == UserDiscoverState.Status.FinishManualSwipeAnimating;
                    boolean z2 = status4 == UserDiscoverState.Status.ButtonSwipeAnimating;
                    UsersDiscoverLayoutManager usersDiscoverLayoutManager2 = this.c;
                    if ((z || z2) && (uhq0Var = usersDiscoverLayoutManager2.c) != null) {
                        uhq0Var.g(this.d, this.e, z);
                    }
                    View s2 = usersDiscoverLayoutManager2.s();
                    if (s2 == null || (uhq0Var2 = usersDiscoverLayoutManager2.c) == null) {
                        return;
                    }
                    uhq0Var2.d(usersDiscoverLayoutManager2.f.f, s2);
                }
            });
        }
        detachAndScrapAttachedViews(vVar);
        int paddingTop = usersDiscoverLayoutManager.getPaddingTop();
        int paddingLeft = usersDiscoverLayoutManager.getPaddingLeft();
        int width2 = usersDiscoverLayoutManager.getWidth() - usersDiscoverLayoutManager.getPaddingLeft();
        int height = usersDiscoverLayoutManager.getHeight() - usersDiscoverLayoutManager.getPaddingBottom();
        int i6 = userDiscoverState.f;
        while (true) {
            int i7 = userDiscoverState.f;
            thq0Var = usersDiscoverLayoutManager.g;
            thq0Var.getClass();
            if (i6 >= i7 + i2 || i6 >= usersDiscoverLayoutManager.getItemCount()) {
                break;
            }
            View f = vVar.f(i6);
            usersDiscoverLayoutManager.addView(f, 0);
            RecyclerView.Adapter<?> adapter = usersDiscoverLayoutManager.b;
            long itemId = adapter != null ? adapter.getItemId(i6) : 0L;
            int measuredHeight = f.getMeasuredHeight();
            HashSet<Long> hashSet = usersDiscoverLayoutManager.j;
            if (measuredHeight <= 0 || f.getMeasuredWidth() <= 0 || itemId == 0 || !hashSet.contains(Long.valueOf(itemId))) {
                usersDiscoverLayoutManager.measureChildWithMargins(f, 0, 0);
                int width3 = (((usersDiscoverLayoutManager.getWidth() - usersDiscoverLayoutManager.getPaddingLeft()) - usersDiscoverLayoutManager.getPaddingRight()) - f.getMeasuredWidth()) / 2;
                int height2 = (((usersDiscoverLayoutManager.getHeight() - usersDiscoverLayoutManager.getPaddingTop()) - usersDiscoverLayoutManager.getPaddingBottom()) - f.getMeasuredHeight()) / 2;
                i = i6;
                view = f;
                thq0Var2 = thq0Var;
                usersDiscoverLayoutManager.layoutDecoratedWithMargins(view, paddingLeft + width3, paddingTop + height2, width2 - width3, height - height2);
                hashSet.add(Long.valueOf(itemId));
            } else {
                i = i6;
                view = f;
                thq0Var2 = thq0Var;
            }
            thq0Var2.getClass();
            int i8 = i - userDiscoverState.f;
            if (i8 == 0) {
                blr blrVar = thq0Var2.q;
                blrVar.getClass();
                view.setTranslationX(userDiscoverState.d);
                view.setTranslationY(userDiscoverState.e);
                Drawable background = view.getBackground();
                if (background != null) {
                    background.setAlpha(255);
                }
                blrVar.z(view, userDiscoverState);
                blrVar.u(view, userDiscoverState);
                blrVar.A(view, i8, userDiscoverState);
                if (view instanceof au9) {
                    au9 au9Var = (au9) view;
                    View infoView = au9Var.getInfoView();
                    if (infoView != null) {
                        infoView.setAlpha(1.0f);
                    }
                    View foregroundView = au9Var.getForegroundView();
                    if (foregroundView != null) {
                        foregroundView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                }
            } else if (i8 == 1) {
                r0i0 r0i0Var = thq0Var2.r;
                thq0 thq0Var3 = (thq0) r0i0Var.a;
                float f2 = 1.0f - (i8 * 0.125f);
                float b2 = (thq0Var3.a + (((1.0f - ((thq0Var3.b(userDiscoverState) * ((1.0f - (0.125f * (i8 - 1))) - f2)) + f2)) * view.getMeasuredHeight()) / 2.0f)) * (1.0f - thq0Var3.c(userDiscoverState));
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(b2);
                Drawable background2 = view.getBackground();
                if (background2 != null) {
                    background2.setAlpha((int) (thq0Var3.b(userDiscoverState) * 255.0f));
                }
                r0i0Var.z(view, userDiscoverState);
                r0i0Var.u(view, userDiscoverState);
                r0i0Var.A(view, i8, userDiscoverState);
                thq0 thq0Var4 = (thq0) r0i0Var.a;
                if (view instanceof au9) {
                    au9 au9Var2 = (au9) view;
                    View infoView2 = au9Var2.getInfoView();
                    if (infoView2 != null) {
                        infoView2.setAlpha(thq0Var4.b(userDiscoverState));
                    }
                    View foregroundView2 = au9Var2.getForegroundView();
                    if (foregroundView2 != null) {
                        float max = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.abs(userDiscoverState.d) - thq0Var4.a(userDiscoverState));
                        float max2 = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Math.abs(userDiscoverState.e) - ((userDiscoverState.c * 100.0f) / 334.0f));
                        foregroundView2.setAlpha((1.0f - Math.min(max < max2 ? max2 / ((userDiscoverState.c * 183.0f) / 334.0f) : max / ((userDiscoverState.b * 183.0f) / 334.0f), 1.0f)) * 0.7f);
                    }
                }
            } else if (i8 == 2) {
                fqo0 fqo0Var = thq0Var2.s;
                thq0 thq0Var5 = (thq0) fqo0Var.a;
                float f3 = 1.0f - (i8 * 0.125f);
                float c2 = thq0Var5.c(userDiscoverState) * (thq0Var5.a + (((1.0f - ((thq0Var5.b(userDiscoverState) * ((1.0f - (0.125f * (i8 - 1))) - f3)) + f3)) * view.getMeasuredHeight()) / 2.0f));
                view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                view.setTranslationY(c2);
                Drawable background3 = view.getBackground();
                if (background3 != null) {
                    background3.setAlpha(0);
                }
                fqo0Var.z(view, userDiscoverState);
                fqo0Var.u(view, userDiscoverState);
                fqo0Var.A(view, i8, userDiscoverState);
                if (view instanceof au9) {
                    au9 au9Var3 = (au9) view;
                    View infoView3 = au9Var3.getInfoView();
                    if (infoView3 != null) {
                        infoView3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    View foregroundView3 = au9Var3.getForegroundView();
                    if (foregroundView3 != null) {
                        foregroundView3.setAlpha(0.7f);
                    }
                }
            }
            i6 = i + 1;
            i2 = 3;
        }
        UserDiscoverState.Status status3 = userDiscoverState.a;
        status3.getClass();
        if (status3 != UserDiscoverState.Status.Dragging || usersDiscoverLayoutManager.c == null) {
            return;
        }
        userDiscoverState.b();
        thq0Var.b(userDiscoverState);
    }
}
