package com.vk.friends.discover;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.friends.discover.Direction;
import com.vk.friends.discover.UserDiscoverSmoothScroller;
import com.vk.lists.c;
import com.vk.metrics.eventtracking.b;
import xsna.df90;
import xsna.ef90;
import xsna.gbg0;
import xsna.gxp;
import xsna.gzs;
import xsna.s3q0;
import xsna.shq0;
import xsna.uhq0;
import xsna.whp;

/* compiled from: UsersDiscoverListView.kt */
/* loaded from: classes13.dex */
public final class UsersDiscoverListView extends RecyclerView implements c.n {
    public uhq0 b;
    public final shq0 c;
    public boolean d;

    public UsersDiscoverListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.c = new shq0(this);
        this.d = true;
        new a().attachToRecyclerView(this);
        int a = gbg0.a(getResources(), 4.0f);
        int a2 = gbg0.a(getResources(), 20.0f);
        setPadding(a2, a, a2, gbg0.a(getResources(), 10.0f));
        setItemAnimator(null);
    }

    @Override // com.vk.lists.c.n
    public final void M9(df90 df90Var) {
        removeOnScrollListener(new ef90(df90Var));
    }

    @Override // com.vk.lists.c.n
    public final void Om(df90 df90Var) {
        addOnScrollListener(new ef90(df90Var));
    }

    public final void a() {
        RecyclerView.o layoutManager = getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager == null) {
            return;
        }
        UserDiscoverState userDiscoverState = usersDiscoverLayoutManager.f;
        int i = userDiscoverState.f;
        int i2 = i + 1;
        UserDiscoverSmoothScroller.ScrollType scrollType = UserDiscoverSmoothScroller.ScrollType.ButtonAccept;
        Direction.a aVar = Direction.Companion;
        uhq0 uhq0Var = usersDiscoverLayoutManager.c;
        if ((uhq0Var != null ? uhq0Var.b(i) : true) && userDiscoverState.a(i2, usersDiscoverLayoutManager.getItemCount())) {
            usersDiscoverLayoutManager.t(i2, scrollType);
        }
    }

    public final int getTopPosition() {
        RecyclerView.o layoutManager = getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager == null) {
            return -1;
        }
        return usersDiscoverLayoutManager.f.f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        shq0 shq0Var = this.c;
        if (getLayoutManager() == null) {
            setLayoutManager(new UsersDiscoverLayoutManager(adapter, this.b));
        }
        try {
            RecyclerView.Adapter adapter2 = getAdapter();
            if (adapter2 != null) {
                adapter2.unregisterAdapterDataObserver(shq0Var);
            }
        } catch (Exception e) {
            b.a.a(e);
        }
        RecyclerView.Adapter adapter3 = getAdapter();
        if (adapter3 != null) {
            adapter3.onDetachedFromRecyclerView(this);
        }
        RecyclerView.Adapter adapter4 = getAdapter();
        if (adapter4 != null) {
            adapter4.registerAdapterDataObserver(shq0Var);
        }
        super.setAdapter(adapter);
    }

    public final void setCanScrollVertical(boolean z) {
        RecyclerView.o layoutManager = getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager != null) {
            usersDiscoverLayoutManager.e = z;
        }
    }

    public final void setCardListener(uhq0 uhq0Var) {
        this.b = uhq0Var;
        RecyclerView.o layoutManager = getLayoutManager();
        UsersDiscoverLayoutManager usersDiscoverLayoutManager = layoutManager instanceof UsersDiscoverLayoutManager ? (UsersDiscoverLayoutManager) layoutManager : null;
        if (usersDiscoverLayoutManager != null) {
            usersDiscoverLayoutManager.c = uhq0Var;
        }
    }

    @Override // com.vk.lists.c.n
    public final void Fe() {
    }

    @Override // com.vk.lists.c.n
    public final void K9() {
    }

    @Override // com.vk.lists.c.n
    public final void Mk() {
    }

    @Override // com.vk.lists.c.n
    public final void e0() {
    }

    @Override // com.vk.lists.c.n
    public final void f0() {
    }

    @Override // com.vk.lists.c.n
    public final void gl() {
    }

    @Override // com.vk.lists.c.n
    public final void lb() {
    }

    @Override // com.vk.lists.c.n
    public final void qg(whp whpVar) {
    }

    @Override // com.vk.lists.c.n
    public void setDataObserver(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public void setOnLoadNextRetryClickListener(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public void setOnRefreshListener(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public void setOnReloadRetryClickListener(gzs<s3q0> gzsVar) {
    }

    @Override // com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
    }
}
