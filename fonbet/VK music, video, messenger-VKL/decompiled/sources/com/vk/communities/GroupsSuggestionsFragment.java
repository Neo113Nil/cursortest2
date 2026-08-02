package com.vk.communities;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.f2s;
import xsna.f3p0;
import xsna.fpf0;
import xsna.iah0;
import xsna.jru;
import xsna.m4w;
import xsna.m7m;
import xsna.n3i;
import xsna.n3t;
import xsna.oz50;
import xsna.pru;
import xsna.sg0;
import xsna.xwk;

/* compiled from: GroupsSuggestionsFragment.kt */
/* loaded from: classes17.dex */
public class GroupsSuggestionsFragment extends BaseMvpFragment<Object> {
    public static final int Y = iah0.a(9.5f);
    public RecyclerPaginatedView T;
    public Toolbar U;
    public final pru V;
    public final jru W;
    public io.reactivex.rxjava3.disposables.c X;

    /* compiled from: GroupsSuggestionsFragment.kt */
    public static class a extends oz50 {
        public a(Object obj) {
            super(GroupsSuggestionsFragment.class, null, null);
        }

        public final void A(String str) {
            if (str != null) {
                this.j.putString("track_code", str);
            }
        }

        public final void y(UserId userId) {
            this.j.putParcelable("group_id", userId);
        }

        public final void z(String str) {
            this.j.putString("title", str);
        }
    }

    /* compiled from: GroupsSuggestionsFragment.kt */
    public static final class b extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            super.getItemOffsets(rect, view, recyclerView, a0Var);
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top += GroupsSuggestionsFragment.Y;
            }
        }
    }

    /* compiled from: GroupsSuggestionsFragment.kt */
    public static final class c {
        public c() {
        }
    }

    public GroupsSuggestionsFragment() {
        pru pruVar = new pru(this);
        this.V = pruVar;
        this.W = new jru(pruVar.g, pruVar.c, (ProfileFragmentProviderComponent) m7m.d(this).a(fpf0.a(ProfileFragmentProviderComponent.class)));
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final Object io() {
        return this.V;
    }

    public final void m(String str) {
        Toolbar toolbar = this.U;
        if (toolbar != null) {
            toolbar.setTitle(str);
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        String string;
        super.onCreate(bundle);
        pru pruVar = this.V;
        if (pruVar != null) {
            Bundle arguments = getArguments();
            if (arguments == null || (userId = (UserId) arguments.getParcelable("group_id")) == null) {
                userId = UserId.d;
            }
            pruVar.e = userId;
            pruVar.f = arguments != null ? arguments.getString("title") : null;
            pruVar.d = arguments != null ? arguments.getString("track_code") : null;
            if (arguments != null && (string = arguments.getString("referrer")) != null) {
                pruVar.c = string;
            }
        }
        io.reactivex.rxjava3.disposables.c cVar = this.X;
        if (cVar != null) {
            cVar.dispose();
        }
        this.X = xwk.e().T().m().d.subscribe(new n3t(new f2s(this, 9), 2));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        View inflate = layoutInflater.inflate(R.layout.layout_base_fragment, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        this.U = toolbar;
        if (toolbar != null) {
            f3p0.a(toolbar, this, new n3i(this, 26));
        }
        Toolbar toolbar2 = this.U;
        if (toolbar2 != null) {
            toolbar2.setTitle(getString(R.string.loading));
        }
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView);
        dVar.f = 1;
        dVar.a();
        jru jruVar = this.W;
        recyclerPaginatedView.setAdapter(jruVar);
        Toolbar toolbar3 = this.U;
        if (toolbar3 != null) {
            toolbar3.setNavigationOnClickListener(new sg0(this, 7));
        }
        Toolbar toolbar4 = this.U;
        if (toolbar4 != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
            toolbar4.setOnClickListener(new m4w(new WeakReference(recyclerView), 4));
        }
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.setScrollbarFadingEnabled(false);
        }
        RecyclerView recyclerView3 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new b());
        }
        this.T = recyclerPaginatedView;
        jruVar.g = new c();
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.X;
        if (cVar != null) {
            cVar.dispose();
        }
        this.X = null;
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.T = null;
        this.U = null;
    }
}
