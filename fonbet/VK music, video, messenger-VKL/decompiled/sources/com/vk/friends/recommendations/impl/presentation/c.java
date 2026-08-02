package com.vk.friends.recommendations.impl.presentation;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseFragment;
import com.vk.friends.recommendations.impl.presentation.SearchFriendsItem;
import com.vkontakte.android.R;
import xsna.hrv;
import xsna.kw5;
import xsna.vif0;
import xsna.zoj0;

/* compiled from: SearchFriendsAdapter.kt */
/* loaded from: classes16.dex */
public final class c extends zoj0<SearchFriendsItem, vif0<?>> {
    public final BaseFragment e;

    public c(BaseFragment baseFragment) {
        this.e = baseFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        SearchFriendsItem.Type type;
        SearchFriendsItem searchFriendsItem = (SearchFriendsItem) this.c.c(i);
        if (searchFriendsItem == null || (type = searchFriendsItem.a) == null) {
            return 0;
        }
        return type.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        vif0 vif0Var = (vif0) e0Var;
        SearchFriendsItem searchFriendsItem = (SearchFriendsItem) this.c.c(i);
        if (searchFriendsItem == null || searchFriendsItem.a.ordinal() == SearchFriendsItem.Type.SPACE.ordinal()) {
            return;
        }
        vif0Var.V5(searchFriendsItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == SearchFriendsItem.Type.ICON_TEXT.ordinal()) {
            return new hrv(this.e, viewGroup);
        }
        if (i != SearchFriendsItem.Type.SPACE.ordinal()) {
            throw new IllegalStateException("Unsupported type");
        }
        kw5 kw5Var = new kw5(viewGroup);
        kw5Var.itemView.setBackgroundResource(R.drawable.apps_top_padding_white_12);
        return kw5Var;
    }
}
