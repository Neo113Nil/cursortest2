package com.vk.clips.favorites.impl.ui.folders.content;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.favorites.impl.ui.folders.content.c;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.clips.viewer.api.di.ClipsViewerAdapterComponent;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.lists.DefaultErrorView;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ao50;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e3m;
import xsna.e4;
import xsna.eb;
import xsna.ey0;
import xsna.g3e;
import xsna.i3e;
import xsna.ihb;
import xsna.il1;
import xsna.izs;
import xsna.k3e;
import xsna.km50;
import xsna.m33;
import xsna.mk50;
import xsna.msy;
import xsna.nds;
import xsna.oz50;
import xsna.qb6;
import xsna.s3q0;
import xsna.tlo0;
import xsna.uds;
import xsna.vds;
import xsna.vk50;
import xsna.xn50;
import xsna.zt4;

/* compiled from: ClipsFavoriteFolderContentListFragment.kt */
/* loaded from: classes.dex */
public final class ClipsFavoriteFolderContentListFragment extends MviImplFragment<com.vk.clips.favorites.impl.ui.folders.content.b, ClipsFavoriteFolderContentListViewState, com.vk.clips.favorites.impl.ui.folders.content.a> implements nds, uds, vds {
    public static final int W = cn70.b(12);
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public b V;

    /* compiled from: ClipsFavoriteFolderContentListFragment.kt */
    /* loaded from: classes16.dex */
    public static final class a extends oz50 {
        public a(UserId userId, FavoriteFolderId favoriteFolderId, String str) {
            super(ClipsFavoriteFolderContentListFragment.class, null, null);
            s(true);
            this.j.putParcelable("owner_id", userId);
            this.j.putParcelable("folder_id", favoriteFolderId);
            this.j.putString("folder_name", str);
        }

        public final void y(boolean z) {
            this.j.putBoolean("force_dark_theme", z);
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListFragment.kt */
    /* loaded from: classes16.dex */
    public static final class b {
        public final ConstraintLayout a;
        public final VkTopBar b;
        public final SwipeRefreshLayout c;
        public final RecyclerView d;
        public final LinearLayout e;
        public final VkSpinner f;
        public final VkPlaceholder g;
        public final DefaultErrorView h;

        public b(View view) {
            this.a = (ConstraintLayout) view.findViewById(R.id.favorite_folder_content_root_layout);
            this.b = (VkTopBar) view.findViewById(R.id.favorite_folder_content_top_bar);
            this.c = (SwipeRefreshLayout) view.findViewById(R.id.favorite_folder_content_swipe_refresh);
            this.d = (RecyclerView) view.findViewById(R.id.favorite_folder_content_recycler);
            this.e = (LinearLayout) view.findViewById(R.id.favorite_folder_content_multi_select_container);
            this.f = (VkSpinner) view.findViewById(R.id.favorite_folder_content_progress_bar);
            this.g = (VkPlaceholder) view.findViewById(R.id.favorite_folder_empty_container);
            this.h = (DefaultErrorView) view.findViewById(R.id.favorite_folder_content_error_view);
        }

        public final LinearLayout a() {
            return this.e;
        }

        public final SwipeRefreshLayout b() {
            return this.c;
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListFragment.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsFavoriteFolderContentListViewState.EmptyViewState.Mode.values().length];
            try {
                iArr[ClipsFavoriteFolderContentListViewState.EmptyViewState.Mode.VIEW_CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsFavoriteFolderContentListViewState.EmptyViewState.Mode.ADD_CLIPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListFragment.kt */
    /* loaded from: classes16.dex */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<com.vk.clips.favorites.impl.ui.folders.content.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(com.vk.clips.favorites.impl.ui.folders.content.a aVar) {
            ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.receiver;
            clipsFavoriteFolderContentListFragment.getClass();
            xn50.a.c(clipsFavoriteFolderContentListFragment, aVar);
            return s3q0.a;
        }
    }

    public ClipsFavoriteFolderContentListFragment() {
        com.vk.movika.sdk.base.model.b bVar = new com.vk.movika.sdk.base.model.b(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, bVar);
        this.R = msy.a(lazyThreadSafetyMode, new ey0(this, 16));
        this.S = msy.a(lazyThreadSafetyMode, new eb(this, 18));
        this.T = msy.a(lazyThreadSafetyMode, new e4(this, 16));
        this.U = msy.a(lazyThreadSafetyMode, new il1(this, 19));
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.clips_favorite_folder_content_list_fragment);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        go(new qb6(4, this, (ClipsFavoriteFolderContentListViewState) ao50Var));
    }

    @Override // xsna.vds
    public final int Q0() {
        return 1;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((com.vk.clips.favorites.impl.ui.folders.content.b) vk50Var).V().a(new zt4(this, 15), this);
    }

    @Override // xsna.nds
    public final boolean W9() {
        return !dhr0.a.c(requireContext());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.b.b);
        return true;
    }

    public final void fo(tlo0 tlo0Var, int i, com.vk.clips.favorites.impl.ui.folders.content.a aVar) {
        d.a aVar2 = new d.a(requireContext());
        aVar2.l(R.layout.clips_favorite_folder_confirmation_dialog);
        androidx.appcompat.app.d m = aVar2.m();
        Window window = m.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        Window window2 = m.getWindow();
        if (window2 != null) {
            Context requireContext = requireContext();
            e3m.a aVar3 = e3m.a;
            window2.setBackgroundDrawable(m33.a(R.drawable.clips_favorites_confirmation_dialog_background, requireContext));
        }
        VkText vkText = (VkText) m.findViewById(R.id.clips_favorite_folder_confirmation_description);
        if (vkText != null) {
            vkText.setText(tlo0Var.a(requireContext()));
        }
        VkText vkText2 = (VkText) m.findViewById(R.id.clips_favorite_folder_confirmation_button_text);
        if (vkText2 != null) {
            vkText2.setText(i);
        }
        if (vkText2 != null) {
            bwt0.i0(vkText2, new ihb(m, this, aVar, 1));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        if (!((Boolean) this.T.getValue()).booleanValue()) {
            return super.mo2getContext();
        }
        Context mo2getContext = super.mo2getContext();
        if (mo2getContext != null) {
            return bwt0.u(mo2getContext);
        }
        return null;
    }

    public final void go(izs<? super b, s3q0> izsVar) {
        b bVar = this.V;
        if (bVar != null) {
            izsVar.invoke(bVar);
        }
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return e3m.f(R.attr.vk_ui_background_content, requireContext());
    }

    @Override // xsna.woo0
    public final int o7() {
        if (dhr0.a.c(requireContext())) {
            Context requireContext = requireContext();
            e3m.a aVar = e3m.a;
            return requireContext.getColor(R.color.vk_black);
        }
        Context requireContext2 = requireContext();
        e3m.a aVar2 = e3m.a;
        return requireContext2.getColor(R.color.vk_white);
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.V = onCreateView != null ? new b(onCreateView) : null;
        return onCreateView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.V = null;
        super.onDestroyView();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return super.onGetLayoutInflater(bundle).cloneInContext(requireContext());
    }

    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        com.vk.clips.favorites.impl.ui.folders.content.c bVar;
        Object parcelable4;
        Object parcelable5;
        Object parcelable6;
        Bundle requireArguments = requireArguments();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable6 = requireArguments.getParcelable("owner_id", UserId.class);
            parcelable = (Parcelable) parcelable6;
        } else {
            Parcelable parcelable7 = requireArguments.getParcelable("owner_id");
            if (!(parcelable7 instanceof UserId)) {
                parcelable7 = null;
            }
            parcelable = (UserId) parcelable7;
        }
        if (parcelable == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        UserId userId = (UserId) parcelable;
        Bundle requireArguments2 = requireArguments();
        if (i >= 33) {
            parcelable5 = requireArguments2.getParcelable("folder_id", FavoriteFolderId.class);
            parcelable2 = (Parcelable) parcelable5;
        } else {
            Parcelable parcelable8 = requireArguments2.getParcelable("folder_id");
            if (!(parcelable8 instanceof FavoriteFolderId)) {
                parcelable8 = null;
            }
            parcelable2 = (FavoriteFolderId) parcelable8;
        }
        if (parcelable2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        FavoriteFolderId favoriteFolderId = (FavoriteFolderId) parcelable2;
        String string = requireArguments().getString("folder_name");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Bundle requireArguments3 = requireArguments();
        if (i >= 33) {
            parcelable4 = requireArguments3.getParcelable("target_folder_id", FavoriteFolderId.class);
            parcelable3 = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable9 = requireArguments3.getParcelable("target_folder_id");
            parcelable3 = (FavoriteFolderId) (parcelable9 instanceof FavoriteFolderId ? parcelable9 : null);
        }
        FavoriteFolderId favoriteFolderId2 = (FavoriteFolderId) parcelable3;
        if (favoriteFolderId2 != null) {
            String string2 = requireArguments().getString("target_folder_name");
            if (string2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar = new c.a(userId, favoriteFolderId, string, favoriteFolderId2, string2);
        } else {
            bVar = new c.b(userId, favoriteFolderId, string);
        }
        com.vk.clips.favorites.impl.ui.folders.content.c cVar = bVar;
        ?? r1 = this.Q;
        return new com.vk.clips.favorites.impl.ui.folders.content.b(cVar, ((ClipsFavoritesComponentImpl) r1.getValue()).Ef(), ((ClipsFavoritesComponentImpl) r1.getValue()).b(), ((ClipsFavoritesComponentImpl) r1.getValue()).Df(), ((ClipsViewerAdapterComponent) this.S.getValue()).e0(), new f(cVar, new g3e(), new k3e(cVar), new i3e()));
    }
}
