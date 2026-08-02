package com.vk.core.ui.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.lp0;

/* compiled from: BottomSwipePaginatedView.kt */
/* loaded from: classes17.dex */
public final class BottomSwipePaginatedView extends RecyclerPaginatedView {
    public static final /* synthetic */ int O = 0;
    public BottomSwipeRefreshLayout N;

    /* compiled from: BottomSwipePaginatedView.kt */
    public static final class a extends AbstractPaginatedView.h {
        public final WeakReference<BottomSwipeRefreshLayout> a;

        public a(BottomSwipeRefreshLayout bottomSwipeRefreshLayout) {
            this.a = new WeakReference<>(bottomSwipeRefreshLayout);
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void b(boolean z) {
            BottomSwipeRefreshLayout bottomSwipeRefreshLayout = this.a.get();
            if (bottomSwipeRefreshLayout != null) {
                bottomSwipeRefreshLayout.setEnabled(z);
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void c(SwipeDrawableRefreshLayout.g gVar) {
            BottomSwipeRefreshLayout bottomSwipeRefreshLayout = this.a.get();
            if (bottomSwipeRefreshLayout != null) {
                bottomSwipeRefreshLayout.setOnRefreshListener(gVar);
            }
        }

        @Override // com.vk.lists.AbstractPaginatedView.h
        public final void e(boolean z) {
            BottomSwipeRefreshLayout bottomSwipeRefreshLayout = this.a.get();
            if (bottomSwipeRefreshLayout != null) {
                bottomSwipeRefreshLayout.setRefreshing(z);
            }
        }
    }

    public BottomSwipePaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_recycler_paginated_swipe_bottom, (ViewGroup) this, false);
        this.N = (BottomSwipeRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        this.x = (RecyclerView) inflate.findViewById(R.id.list);
        BottomSwipeRefreshLayout bottomSwipeRefreshLayout = this.N;
        if (bottomSwipeRefreshLayout == null) {
            bottomSwipeRefreshLayout = null;
        }
        a aVar = new a(bottomSwipeRefreshLayout);
        this.w = aVar;
        aVar.c(new lp0(this, 6));
        BottomSwipeRefreshLayout bottomSwipeRefreshLayout2 = this.N;
        if (bottomSwipeRefreshLayout2 == null) {
            return null;
        }
        return bottomSwipeRefreshLayout2;
    }

    public final void setReversed(boolean z) {
        BottomSwipeRefreshLayout bottomSwipeRefreshLayout = this.N;
        if (bottomSwipeRefreshLayout == null) {
            bottomSwipeRefreshLayout = null;
        }
        bottomSwipeRefreshLayout.setReversed(z);
    }
}
