package com.vk.friends.requests.impl.requests.presentation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.f4m;
import xsna.u1e0;

/* compiled from: FriendsRequestsPaginatedView.kt */
/* loaded from: classes16.dex */
public final class FriendsRequestsPaginatedView extends RecyclerPaginatedView {
    public u1e0 N;

    public FriendsRequestsPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final void n(Context context, AttributeSet attributeSet, int i) {
        super.n(context, attributeSet, i);
        u1e0 u1e0Var = new u1e0(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.requests_list_progress_bar_refresh, (ViewGroup) u1e0Var, true);
        u1e0Var.setClickable(true);
        this.N = u1e0Var;
        u1e0Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        u1e0 u1e0Var2 = this.N;
        if (u1e0Var2 == null) {
            u1e0Var2 = null;
        }
        f4m.j(u1e0Var2);
        u1e0 u1e0Var3 = this.N;
        addView(u1e0Var3 != null ? u1e0Var3 : null);
    }
}
