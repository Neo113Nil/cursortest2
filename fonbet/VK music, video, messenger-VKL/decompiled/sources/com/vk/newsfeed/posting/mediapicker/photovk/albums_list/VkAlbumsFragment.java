package com.vk.newsfeed.posting.mediapicker.photovk.albums_list;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.PickerRecyclerPaginatedView;
import com.vk.photos.root.di.PhotosComponent;
import com.vkontakte.android.R;
import xsna.bhc0;
import xsna.bwt0;
import xsna.cn70;
import xsna.em1;
import xsna.f4m;
import xsna.fpf0;
import xsna.fvq0;
import xsna.iah0;
import xsna.icn0;
import xsna.m7m;
import xsna.oz50;
import xsna.ro1;
import xsna.s0r;
import xsna.wcs0;

/* compiled from: VkAlbumsFragment.kt */
/* loaded from: classes4.dex */
public final class VkAlbumsFragment extends BaseMvpFragment<ro1> implements bhc0 {
    public static final /* synthetic */ int Y = 0;
    public PickerRecyclerPaginatedView T;
    public em1 U;
    public GridLayoutManager W;
    public int V = 1;
    public final ro1 X = new ro1(this);

    /* compiled from: VkAlbumsFragment.kt */
    public static class a extends oz50 {
    }

    /* compiled from: VkAlbumsFragment.kt */
    public static final class b extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            return 1;
        }
    }

    public VkAlbumsFragment() {
        UserId.b bVar = UserId.c;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final ro1 io() {
        return this.X;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        super.onCreate(bundle);
        ro1 ro1Var = this.X;
        if (ro1Var != null) {
            requireArguments().getBoolean("select_album", false);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        if (ro1Var != null) {
            ro1Var.d = userId;
        }
        this.o = false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.media_picker_photos_vk_fragment, viewGroup, false);
        this.U = new em1(((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).d3(), true, new fvq0(this, 12));
        this.T = (PickerRecyclerPaginatedView) inflate.findViewById(R.id.rpb_list);
        int a2 = iah0.a(10);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.T;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        pickerRecyclerPaginatedView.getRecyclerView().setPadding(a2, 0, a2, a2);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = this.T;
        if (pickerRecyclerPaginatedView2 == null) {
            pickerRecyclerPaginatedView2 = null;
        }
        pickerRecyclerPaginatedView2.getRecyclerView().setClipToPadding(false);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView3 = this.T;
        if (pickerRecyclerPaginatedView3 == null) {
            pickerRecyclerPaginatedView3 = null;
        }
        RecyclerView recyclerView = pickerRecyclerPaginatedView3.getRecyclerView();
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.V);
        gridLayoutManager.x = new b();
        this.W = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView4 = this.T;
        if (pickerRecyclerPaginatedView4 == null) {
            pickerRecyclerPaginatedView4 = null;
        }
        bwt0.R(pickerRecyclerPaginatedView4, new s0r(this, 4));
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView5 = this.T;
        if (pickerRecyclerPaginatedView5 == null) {
            pickerRecyclerPaginatedView5 = null;
        }
        pickerRecyclerPaginatedView5.setSwipeRefreshEnabled(false);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView6 = this.T;
        if (pickerRecyclerPaginatedView6 == null) {
            pickerRecyclerPaginatedView6 = null;
        }
        em1 em1Var = this.U;
        if (em1Var == null) {
            em1Var = null;
        }
        pickerRecyclerPaginatedView6.setAdapter(em1Var);
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView7 = this.T;
        if (pickerRecyclerPaginatedView7 == null) {
            pickerRecyclerPaginatedView7 = null;
        }
        pickerRecyclerPaginatedView7.setOnRefreshListener(new wcs0(this, 8));
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView8 = this.T;
        (pickerRecyclerPaginatedView8 != null ? pickerRecyclerPaginatedView8 : null).setOnReloadRetryClickListener(new icn0(this, 17));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ro1 ro1Var = this.X;
        if (ro1Var != null) {
            ro1Var.b(false);
        }
    }

    @Override // xsna.bhc0
    public final void tb(float f, int i) {
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView = this.T;
        PickerRecyclerPaginatedView pickerRecyclerPaginatedView2 = pickerRecyclerPaginatedView != null ? pickerRecyclerPaginatedView : null;
        if (pickerRecyclerPaginatedView == null) {
            pickerRecyclerPaginatedView = null;
        }
        if (pickerRecyclerPaginatedView2.x.computeVerticalScrollOffset() == 0) {
            f4m.y((int) ((1.0f - f) * cn70.b(23)), pickerRecyclerPaginatedView);
        } else {
            f4m.y(0, pickerRecyclerPaginatedView);
        }
    }
}
