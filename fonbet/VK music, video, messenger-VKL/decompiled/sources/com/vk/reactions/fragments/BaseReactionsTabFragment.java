package com.vk.reactions.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.likes.LikesGetList;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.reactions.view.GridReactionsPaginatedView;
import com.vkontakte.android.R;
import java.io.Serializable;
import xsna.an10;
import xsna.bwt0;
import xsna.cn70;
import xsna.ey2;
import xsna.f4m;
import xsna.g6f0;
import xsna.h6f0;
import xsna.iah0;
import xsna.oz50;
import xsna.qhh0;
import xsna.rtt;
import xsna.t2f0;
import xsna.tr;
import xsna.u6f0;
import xsna.v6f0;

/* compiled from: BaseReactionsTabFragment.kt */
/* loaded from: classes5.dex */
public abstract class BaseReactionsTabFragment extends BaseMvpFragment<u6f0> implements v6f0, qhh0 {
    public static final int X = an10.b(cn70.a() * 12.0f);
    public static final int Y = an10.b(cn70.a() * 6.0f);
    public RecyclerPaginatedView T;
    public TextView U;
    public boolean V = true;
    public final b W = new b();

    /* compiled from: BaseReactionsTabFragment.kt */
    public static class a extends oz50 {
        public final void A(boolean z) {
            this.j.putBoolean("friends_only", z);
        }

        public final void B(Bundle bundle) {
            if (bundle == null) {
                return;
            }
            boolean containsKey = bundle.containsKey("owner_id");
            Bundle bundle2 = this.j;
            if (containsKey) {
                UserId userId = (UserId) bundle.getParcelable("owner_id");
                if (userId == null) {
                    userId = UserId.d;
                }
                bundle2.putParcelable("owner_id", userId);
            }
            if (bundle.containsKey("item_id")) {
                bundle2.putLong("item_id", bundle.getLong("item_id"));
            }
            if (bundle.containsKey("ltype")) {
                Serializable serializable = bundle.getSerializable("ltype");
                LikesGetList.Type type = serializable instanceof LikesGetList.Type ? (LikesGetList.Type) serializable : null;
                if (type == null) {
                    type = LikesGetList.Type.POST;
                }
                bundle2.putSerializable("ltype", type);
            }
            if (bundle.containsKey("lptype")) {
                Serializable serializable2 = bundle.getSerializable("lptype");
                LikesGetList.Type type2 = serializable2 instanceof LikesGetList.Type ? (LikesGetList.Type) serializable2 : null;
                if (type2 == null) {
                    type2 = LikesGetList.Type.POST;
                }
                bundle2.putSerializable("lptype", type2);
            }
        }

        public final void C(String str) {
            if (str == null || str.length() == 0) {
                return;
            }
            this.j.putString("title_message", str);
        }

        public final void y() {
            this.j.putString("filter", "copies");
        }

        public final void z(String str) {
            this.j.putString("fragment_id", str);
        }
    }

    /* compiled from: BaseReactionsTabFragment.kt */
    public static final class b extends GridLayoutManager.c {
        public b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            t2f0 adapter = BaseReactionsTabFragment.this.getAdapter();
            if (((g6f0) adapter.c.c(i)) instanceof g6f0.a) {
                return adapter.e;
            }
            return 1;
        }
    }

    public final void jo(h6f0 h6f0Var) {
        u6f0 io2 = io();
        if (io2 != null) {
            io2.a2(h6f0Var);
        }
    }

    public final void ko(rtt.a aVar) {
        if (aVar != null) {
            u6f0 io2 = io();
            if (io2 != null) {
                io2.j5(aVar);
                return;
            }
            return;
        }
        u6f0 io3 = io();
        if (io3 != null) {
            io3.c4();
        }
    }

    public final void lo(String str) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("title_message") : null;
        if (string == null || string.length() == 0) {
            TextView textView = this.U;
            if (textView != null) {
                bwt0.p0(textView, false);
            }
            RecyclerPaginatedView recyclerPaginatedView = this.T;
            if (recyclerPaginatedView != null) {
                f4m.t(0, recyclerPaginatedView);
                return;
            }
            return;
        }
        TextView textView2 = this.U;
        if (textView2 == null) {
            return;
        }
        ey2.i(textView2, str);
        ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        textView2.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, Math.min((iah0.f().widthPixels - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0)) - (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0), 1073741823)), Integer.MIN_VALUE), tr.a(0, 1073741823, 0, 0));
        int measuredHeight = textView2.getMeasuredHeight() + X + Y;
        RecyclerPaginatedView recyclerPaginatedView2 = this.T;
        if (recyclerPaginatedView2 != null) {
            f4m.t(measuredHeight, recyclerPaginatedView2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_grid_reactions_tab, viewGroup, false);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        if (recyclerPaginatedView != null) {
            GridReactionsPaginatedView gridReactionsPaginatedView = recyclerPaginatedView instanceof GridReactionsPaginatedView ? (GridReactionsPaginatedView) recyclerPaginatedView : null;
            if (gridReactionsPaginatedView != null) {
                gridReactionsPaginatedView.setCards(true);
            }
            AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.GRID, recyclerPaginatedView);
            dVar.e = this.W;
            dVar.a();
            recyclerPaginatedView.setAdapter(getAdapter());
            RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.setClipToPadding(false);
            }
            RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.setClipChildren(false);
            }
            recyclerPaginatedView.setSwipeRefreshEnabled(this.V);
        } else {
            recyclerPaginatedView = null;
        }
        this.T = recyclerPaginatedView;
        this.U = (TextView) inflate.findViewById(R.id.title_message);
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.T = null;
        this.U = null;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u6f0 io2 = io();
        if (io2 != null) {
            io2.F(getArguments());
        }
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        lo(arguments != null ? arguments.getString("title_message") : null);
        u6f0 io3 = io();
        if (io3 != null) {
            io3.E(view);
        }
    }

    @Override // xsna.qhh0
    public final boolean s() {
        RecyclerView recyclerView;
        RecyclerPaginatedView recyclerPaginatedView = this.T;
        if (recyclerPaginatedView == null || (recyclerView = recyclerPaginatedView.getRecyclerView()) == null) {
            return true;
        }
        recyclerView.scrollToPosition(0);
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        u6f0 io2 = io();
        if (io2 != null) {
            io2.y(uiTrackingScreen);
        }
    }
}
