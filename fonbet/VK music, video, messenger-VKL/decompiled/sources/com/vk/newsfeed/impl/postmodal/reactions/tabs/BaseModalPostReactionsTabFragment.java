package com.vk.newsfeed.impl.postmodal.reactions.tabs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.api.generated.likes.dto.LikesGetListFilterDto;
import com.vk.api.likes.LikesGetList;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.ListDataSet;
import com.vk.lists.c;
import com.vk.lists.f;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.impl.postmodal.reactions.tabs.b;
import com.vk.reactions.view.GridReactionsPaginatedView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import xsna.an10;
import xsna.ao50;
import xsna.c7z;
import xsna.dhr0;
import xsna.gh6;
import xsna.iah0;
import xsna.l7s;
import xsna.mk50;
import xsna.p00;
import xsna.p1;
import xsna.swe0;
import xsna.t130;
import xsna.u130;
import xsna.wtt;
import xsna.xn50;
import xsna.zrp;

/* compiled from: BaseModalPostReactionsTabFragment.kt */
/* loaded from: classes4.dex */
public abstract class BaseModalPostReactionsTabFragment<VS extends gh6> extends MviImplFragment<u130<VS>, VS, t130> {
    public static final /* synthetic */ int X = 0;
    public final ListDataSet<b> Q;
    public final a R;
    public final Set<UserId> S;
    public VkRecyclerPaginatedView T;
    public TextView U;
    public TextView V;
    public ProgressBar W;

    public BaseModalPostReactionsTabFragment() {
        ListDataSet<b> listDataSet = new ListDataSet<>();
        this.Q = listDataSet;
        this.R = new a(listDataSet);
        this.S = Collections.synchronizedSet(new LinkedHashSet());
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_modal_post_reactions_tab);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        go((gh6) ao50Var);
    }

    public final void fo(List<? extends b> list, boolean z) {
        ProgressBar progressBar = this.W;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(8);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.T;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setVisibility(0);
        }
        ListDataSet<b> listDataSet = this.Q;
        Set<UserId> set = this.S;
        if (z) {
            set.clear();
            listDataSet.setItems(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            b bVar = (b) obj;
            if (bVar instanceof b.a ? set.add(((b.a) bVar).a.c) : bVar instanceof b.c ? set.add(((b.c) bVar).a.c) : false) {
                arrayList.add(obj);
            }
        }
        listDataSet.n0(arrayList);
    }

    public abstract void go(VS vs);

    public final void ho() {
        ProgressBar progressBar = this.W;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.T;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setVisibility(8);
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.V;
        if (textView2 != null) {
            textView2.setText(getText(R.string.post_reactions_modal_no_reactions));
        }
    }

    public final void io() {
        ProgressBar progressBar = this.W;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        VkRecyclerPaginatedView vkRecyclerPaginatedView = this.T;
        if (vkRecyclerPaginatedView != null) {
            vkRecyclerPaginatedView.setVisibility(8);
        }
        TextView textView = this.V;
        if (textView != null) {
            textView.setVisibility(0);
        }
        TextView textView2 = this.V;
        if (textView2 != null) {
            textView2.setText(getText(R.string.no_internet_access));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        l7s l7sVar;
        LayoutInflater cloneInContext;
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Bundle arguments = getArguments();
        if (arguments != null ? arguments.getBoolean("ModalPostCommonFragment.isModalReactionsForceDarkTheme", false) : false) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                dhr0.a.getClass();
                l7sVar = new l7s(mo2getContext, dhr0.u().c);
            } else {
                l7sVar = null;
            }
            if (l7sVar != null && (cloneInContext = onGetLayoutInflater.cloneInContext(l7sVar)) != null) {
                return cloneInContext;
            }
        }
        return onGetLayoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        UserId userId;
        UserId userId2;
        String str;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z = arguments != null ? arguments.getBoolean("is_reposts_tab") : false;
        VkRecyclerPaginatedView vkRecyclerPaginatedView = (VkRecyclerPaginatedView) view.findViewById(R.id.post_modal_reactions_recycler);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        vkRecyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, vkRecyclerPaginatedView).a();
        vkRecyclerPaginatedView.setAdapter(this.R);
        vkRecyclerPaginatedView.setSwipeRefreshEnabled(false);
        p00 p00Var = new p00(this, 1);
        p1 p1Var = new p1(this, 9);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (userId = (UserId) arguments2.getParcelable("owner_id")) == null) {
            userId = UserId.d;
        }
        Bundle arguments3 = getArguments();
        long j = arguments3 != null ? arguments3.getLong("item_id") : 0L;
        zrp<LikesGetList.Type> h = LikesGetList.Type.h();
        Bundle arguments4 = getArguments();
        LikesGetList.Type type = (LikesGetList.Type) h.get(arguments4 != null ? arguments4.getInt("type") : 0);
        LikesGetListFilterDto likesGetListFilterDto = z ? LikesGetListFilterDto.COPIES : LikesGetListFilterDto.LIKES;
        Bundle arguments5 = getArguments();
        c.h hVar = new c.h(new wtt(p00Var, p1Var, new c7z(userId, j, type, likesGetListFilterDto, arguments5 != null ? (ReactionMeta) arguments5.getParcelable("reaction") : null), getFeature().e));
        float f = iah0.f().heightPixels / (GridReactionsPaginatedView.S + GridReactionsPaginatedView.T);
        if (f < 1.0f) {
            f = 1.0f;
        }
        hVar.i = swe0.g(an10.b(f) + 4, 10, 50);
        hVar.m = false;
        hVar.l = false;
        f.a(hVar, vkRecyclerPaginatedView).n(false);
        this.T = vkRecyclerPaginatedView;
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (userId2 = (UserId) arguments6.getParcelable("owner_id")) == null) {
            userId2 = UserId.d;
        }
        Bundle arguments7 = getArguments();
        long j2 = arguments7 != null ? arguments7.getLong("item_id") : 0L;
        Bundle arguments8 = getArguments();
        if (arguments8 == null || (str = arguments8.getString("track_code")) == null) {
            str = "";
        }
        xn50.a.c(this, new t130.b(j2, userId2, str));
        this.U = (TextView) view.findViewById(R.id.post_modal_reactions_reposts_count_title);
        this.V = (TextView) view.findViewById(R.id.post_modal_reactions_info_text);
        this.W = (ProgressBar) view.findViewById(R.id.post_modal_reactions_progress_indicator);
    }
}
