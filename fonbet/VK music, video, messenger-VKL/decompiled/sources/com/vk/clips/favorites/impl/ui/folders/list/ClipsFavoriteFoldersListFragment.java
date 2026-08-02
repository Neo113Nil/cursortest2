package com.vk.clips.favorites.impl.ui.folders.list;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.list.ClipsFavoriteFoldersListFragment;
import com.vk.clips.favorites.impl.ui.folders.list.a;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.dto.common.id.UserId;
import com.vk.lists.DefaultErrorView;
import com.vk.movika.sdk.base.ui.g;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bwt0;
import xsna.cv1;
import xsna.dm7;
import xsna.gd5;
import xsna.hvt0;
import xsna.izs;
import xsna.j1;
import xsna.jd;
import xsna.kd;
import xsna.km50;
import xsna.m1;
import xsna.m3e;
import xsna.mk50;
import xsna.msy;
import xsna.n40;
import xsna.oz50;
import xsna.r3e;
import xsna.s3e;
import xsna.s3q0;
import xsna.vk50;
import xsna.w8i;
import xsna.xn50;
import xsna.ye90;
import xsna.z3e;

/* compiled from: ClipsFavoriteFoldersListFragment.kt */
/* loaded from: classes.dex */
public final class ClipsFavoriteFoldersListFragment extends MviImplFragment<com.vk.clips.favorites.impl.ui.folders.list.b, e, com.vk.clips.favorites.impl.ui.folders.list.a> implements SwipeDrawableRefreshLayout.g, w8i {
    public static final /* synthetic */ int U = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;

    /* compiled from: ClipsFavoriteFoldersListFragment.kt */
    /* loaded from: classes16.dex */
    public static final class a extends oz50 {
    }

    /* compiled from: ClipsFavoriteFoldersListFragment.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<com.vk.clips.favorites.impl.ui.folders.list.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.clips.favorites.impl.ui.folders.list.a aVar) {
            ClipsFavoriteFoldersListFragment clipsFavoriteFoldersListFragment = (ClipsFavoriteFoldersListFragment) this.receiver;
            clipsFavoriteFoldersListFragment.getClass();
            xn50.a.c(clipsFavoriteFoldersListFragment, aVar);
            return s3q0.a;
        }
    }

    public ClipsFavoriteFoldersListFragment() {
        g gVar = new g(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, gVar);
        this.R = msy.a(lazyThreadSafetyMode, new m1(this, 26));
        this.S = msy.a(lazyThreadSafetyMode, new jd(this, 27));
        this.T = msy.a(lazyThreadSafetyMode, new kd(this, 22));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_favorite_folders_list_fragment);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        e eVar = (e) ao50Var;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) hvt0.c(R.id.favorite_folders_swipe_refresh, view);
        RecyclerView recyclerView = (RecyclerView) hvt0.c(R.id.favorite_folders_recycler, view);
        ProgressBar progressBar = (ProgressBar) hvt0.c(R.id.favorite_folders_progress_bar, view);
        DefaultErrorView defaultErrorView = (DefaultErrorView) hvt0.c(R.id.favorite_folders_error_view, view);
        swipeRefreshLayout.setEnabled(requireArguments().getBoolean("pull_to_refresh"));
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.f() { // from class: xsna.q3e
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
            public final void h() {
                int i = ClipsFavoriteFoldersListFragment.U;
                ClipsFavoriteFoldersListFragment.this.h();
            }
        });
        requireContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(((Number) this.S.getValue()).intValue());
        gridLayoutManager.Y(new s3e(this));
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter((m3e) this.T.getValue());
        recyclerView.addOnScrollListener(new ye90(new j1(this, 26)));
        defaultErrorView.getErrorButton().setOnClickListener(new dm7(this, 1));
        xn50.a.b(this, eVar.c(), new cv1(swipeRefreshLayout, progressBar, defaultErrorView, 3));
        xn50.a.b(this, eVar.a(), new r3e(swipeRefreshLayout, progressBar, defaultErrorView, this, 0));
        xn50.a.b(this, eVar.b(), new gd5(swipeRefreshLayout, progressBar, defaultErrorView, 3));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.clips.favorites.impl.ui.folders.list.b) vk50Var).U().a(new n40(this, 22), this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        if (!((Boolean) this.R.getValue()).booleanValue()) {
            return super.mo2getContext();
        }
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            return bwt0.u(mo2getContext);
        }
        return null;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public final void h() {
        xn50.a.c(this, a.c.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(requireContext());
    }

    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("owner_id", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("owner_id");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UserId userId = (UserId) parcelable;
        ?? r9 = this.Q;
        return new com.vk.clips.favorites.impl.ui.folders.list.b(userId, ((ClipsFavoritesComponentImpl) r9.getValue()).Ef(), ((ClipsFavoritesComponentImpl) r9.getValue()).Df(), ((ClipsFavoritesComponentImpl) r9.getValue()).Ff(), new d(new z3e(), requireArguments().getBoolean("create_folder_button_visible", true)));
    }
}
