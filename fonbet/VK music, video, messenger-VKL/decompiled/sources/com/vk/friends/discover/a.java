package com.vk.friends.discover;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.friends.discover.UserDiscoverState;

/* compiled from: UsersDiscoverSnapHelper.kt */
/* loaded from: classes13.dex */
public final class a extends o0 {
    public int a;

    @Override // androidx.recyclerview.widget.o0
    public final int[] calculateDistanceToFinalSnap(RecyclerView.o oVar, View view) {
        if (!(oVar instanceof UsersDiscoverLayoutManager)) {
            return new int[2];
        }
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = (UsersDiscoverLayoutManager) oVar;
        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
        if (oVar.findViewByPosition(userDiscoverState.f) == null) {
            return new int[2];
        }
        if (userDiscoverState.a.h()) {
            return new int[2];
        }
        UserDiscoverState.Status status = userDiscoverState.a;
        if (status != UserDiscoverState.Status.OnBoardingAnimating) {
            status.getClass();
        } else if (!status.h()) {
            return new int[2];
        }
        int translationX = (int) view.getTranslationX();
        int translationY = (int) view.getTranslationY();
        if (translationX == 0 && translationY == 0) {
            return new int[2];
        }
        float abs = Math.abs(translationX) / oVar.getWidth();
        if (this.a < 5000) {
            usersDiscoverLayoutManager.g.getClass();
            if (0.3f >= abs) {
                UserDiscoverSmoothScroller userDiscoverSmoothScroller = new UserDiscoverSmoothScroller(UserDiscoverSmoothScroller.ScrollType.ManualCancel, usersDiscoverLayoutManager);
                userDiscoverSmoothScroller.setTargetPosition(userDiscoverState.f);
                usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller);
                return new int[2];
            }
        }
        this.a = 0;
        if (usersDiscoverLayoutManager.o(userDiscoverState.f, userDiscoverState)) {
            UserDiscoverSmoothScroller.ScrollType scrollType = userDiscoverState.a == UserDiscoverState.Status.AutomaticRemoveAnimating ? UserDiscoverSmoothScroller.ScrollType.AutomaticRemove : userDiscoverState.c() == Direction.Right ? userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating ? UserDiscoverSmoothScroller.ScrollType.ButtonAccept : UserDiscoverSmoothScroller.ScrollType.FinishManualAccept : userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating ? UserDiscoverSmoothScroller.ScrollType.ButtonDecline : UserDiscoverSmoothScroller.ScrollType.FinishManualDecline;
            UserDiscoverState userDiscoverState2 = usersDiscoverLayoutManager.f;
            userDiscoverState2.g = userDiscoverState2.f + 1;
            UserDiscoverSmoothScroller userDiscoverSmoothScroller2 = new UserDiscoverSmoothScroller(scrollType, usersDiscoverLayoutManager);
            userDiscoverSmoothScroller2.setTargetPosition(userDiscoverState2.f);
            usersDiscoverLayoutManager.startSmoothScroll(userDiscoverSmoothScroller2);
        } else if (userDiscoverState.a == UserDiscoverState.Status.ButtonSwipeAnimating) {
            userDiscoverState.a = UserDiscoverState.Status.PauseButtonSwipeAnimating;
        } else {
            userDiscoverState.a = UserDiscoverState.Status.PauseManualSwipeAnimating;
        }
        return new int[2];
    }

    @Override // androidx.recyclerview.widget.o0
    public final View findSnapView(RecyclerView.o oVar) {
        View findViewByPosition;
        if (!(oVar instanceof UsersDiscoverLayoutManager) || (findViewByPosition = oVar.findViewByPosition(((UsersDiscoverLayoutManager) oVar).f.f)) == null) {
            return null;
        }
        int translationX = (int) findViewByPosition.getTranslationX();
        int translationY = (int) findViewByPosition.getTranslationY();
        int width = oVar.getWidth();
        int height = oVar.getHeight();
        if (translationX > width || translationY > height || (translationX == 0 && translationY == 0)) {
            return null;
        }
        return findViewByPosition;
    }

    @Override // androidx.recyclerview.widget.o0
    public final int findTargetSnapPosition(RecyclerView.o oVar, int i, int i2) {
        this.a = Math.abs(i);
        Math.abs(i2);
        if (oVar instanceof UsersDiscoverLayoutManager) {
            return ((UsersDiscoverLayoutManager) oVar).f.f;
        }
        return -1;
    }
}
