package com.vk.feed.settings.impl.presentation.filtered.tab;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.DefaultEmptyView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import java.io.Serializable;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.ayo;
import xsna.cn70;
import xsna.cty;
import xsna.ed;
import xsna.f4m;
import xsna.flu;
import xsna.fz60;
import xsna.gm50;
import xsna.km50;
import xsna.mk50;
import xsna.msy;
import xsna.n7w;
import xsna.oz50;
import xsna.pb00;
import xsna.qs6;
import xsna.si60;
import xsna.t2l;
import xsna.ti60;
import xsna.ui60;
import xsna.vi60;
import xsna.vk50;
import xsna.w8i;
import xsna.xi60;
import xsna.z34;
import xsna.zer;

/* compiled from: NewsfeedFilterListFragment2.kt */
/* loaded from: classes18.dex */
public final class NewsfeedFilterListFragment2 extends MviImplFragment<com.vk.feed.settings.impl.presentation.filtered.tab.c, g, com.vk.feed.settings.impl.presentation.filtered.tab.b> implements w8i {
    public static final /* synthetic */ int X = 0;
    public View Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public FilteredSourceType W;

    /* compiled from: NewsfeedFilterListFragment2.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: NewsfeedFilterListFragment2.kt */
    public static final class b implements AbstractPaginatedView.e {
        public final qs6 b;
        public int c = -1;
        public boolean d;

        public b(qs6 qs6Var) {
            this.b = qs6Var;
        }

        @Override // com.vk.lists.AbstractPaginatedView.e
        public final void b(int i) {
            if (this.c != i) {
                this.c = i;
                if (i != 8 || this.d) {
                    return;
                }
                this.d = true;
                f.e.b bVar = f.e.b.a;
                NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.b.c;
                int i2 = NewsfeedFilterListFragment2.X;
                newsfeedFilterListFragment2.getFeature().V(bVar);
            }
        }
    }

    /* compiled from: NewsfeedFilterListFragment2.kt */
    public static final class c extends AbstractPaginatedView.i {
        public final com.vk.movika.sdk.base.flow.binding.c a;

        public c(com.vk.movika.sdk.base.flow.binding.c cVar) {
            this.a = cVar;
        }

        @Override // com.vk.lists.AbstractPaginatedView.i
        public final void b() {
            f.e.a aVar = f.e.a.a;
            NewsfeedFilterListFragment2 newsfeedFilterListFragment2 = (NewsfeedFilterListFragment2) this.a.c;
            int i = NewsfeedFilterListFragment2.X;
            newsfeedFilterListFragment2.getFeature().V(aVar);
        }
    }

    /* compiled from: NewsfeedFilterListFragment2.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilteredSourceType.values().length];
            try {
                iArr[FilteredSourceType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NewsfeedFilterListFragment2() {
        t2l t2lVar = new t2l(this, 27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = msy.a(lazyThreadSafetyMode, t2lVar);
        this.S = msy.a(lazyThreadSafetyMode, new cty(this, 16));
        this.T = msy.a(lazyThreadSafetyMode, new n7w(this, 15));
        this.U = msy.a(lazyThreadSafetyMode, new z34(24));
        this.V = msy.a(lazyThreadSafetyMode, new flu(this, 24));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_filtered_list);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gm50.a.b(this, ((g) ao50Var).a, new pb00(this, 11));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.feed.settings.impl.presentation.filtered.tab.c) vk50Var).h.a(new ayo(this, 27), this);
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        c.m xi60Var;
        super.onViewCreated(view, bundle);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) view.findViewById(R.id.vk_rpb_list);
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        f4m.y(cn70.b(8), recyclerView);
        recyclerView.setClipToPadding(false);
        View emptyView = recyclerPaginatedView.getEmptyView();
        DefaultEmptyView defaultEmptyView = emptyView instanceof DefaultEmptyView ? (DefaultEmptyView) emptyView : null;
        if (defaultEmptyView != null) {
            defaultEmptyView.setDefaultText(0);
            defaultEmptyView.setDefaultImage(0);
            defaultEmptyView.a();
        }
        recyclerPaginatedView.setUiStateCallbacks(new c(new com.vk.movika.sdk.base.flow.binding.c(this, 27)));
        recyclerPaginatedView.setLoaderVisibilityChangeListener(new b(new qs6(this, 25)));
        recyclerPaginatedView.o = true;
        new AbstractPaginatedView.d(AbstractPaginatedView.LayoutType.LINEAR, recyclerPaginatedView).a();
        recyclerPaginatedView.setAdapter((zer) this.V.getValue());
        FilteredSourceType filteredSourceType = this.W;
        FilteredSourceType filteredSourceType2 = filteredSourceType != null ? filteredSourceType : null;
        fz60 fz60Var = (fz60) this.S.getValue();
        ed edVar = new ed(this, 29);
        si60 si60Var = new si60(this, 0);
        io.reactivex.rxjava3.disposables.b bVar = getFeature().e;
        int i = vi60.$EnumSwitchMapping$0[filteredSourceType2.ordinal()];
        if (i == 1) {
            xi60Var = new xi60(fz60Var, edVar, si60Var, bVar);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            xi60Var = new ui60(fz60Var, edVar, si60Var, bVar);
        }
        c.h hVar = new c.h(xi60Var);
        hVar.c = 10;
        com.vk.lists.f.a(hVar, recyclerPaginatedView);
        this.Q = view.findViewById(R.id.empty_view);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Serializable serializable = Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable("type", FilteredSourceType.class) : bundle.getSerializable("type");
        FilteredSourceType filteredSourceType = serializable instanceof FilteredSourceType ? (FilteredSourceType) serializable : null;
        if (filteredSourceType == null) {
            filteredSourceType = FilteredSourceType.USER;
        }
        this.W = filteredSourceType;
        fz60 fz60Var = (fz60) this.S.getValue();
        FilteredSourceType filteredSourceType2 = this.W;
        return new com.vk.feed.settings.impl.presentation.filtered.tab.c(fz60Var, filteredSourceType2 != null ? filteredSourceType2 : null, new e(ti60.f));
    }
}
