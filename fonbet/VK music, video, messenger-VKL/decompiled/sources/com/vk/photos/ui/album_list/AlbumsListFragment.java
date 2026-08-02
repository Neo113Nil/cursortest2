package com.vk.photos.ui.album_list;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.observable.m;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import defpackage.g;
import xsna.aq2;
import xsna.bpn0;
import xsna.bwt0;
import xsna.dm1;
import xsna.gko;
import xsna.iah0;
import xsna.ji0;
import xsna.k60;
import xsna.lo1;
import xsna.mh;
import xsna.mo1;
import xsna.oz50;
import xsna.qb;
import xsna.qo1;
import xsna.s4;
import xsna.tlo0;
import xsna.tq;
import xsna.xg5;

/* compiled from: AlbumsListFragment.kt */
/* loaded from: classes3.dex */
public class AlbumsListFragment extends BaseMvpFragment<qo1> {
    public static final /* synthetic */ int a0 = 0;
    public aq2 T;
    public GridLayoutManager V;
    public dm1 Y;
    public int U = 1;
    public final qo1 W = new qo1(this);
    public final bpn0 X = new bpn0(new s4(this, 3));
    public UserId Z = UserId.d;

    /* compiled from: AlbumsListFragment.kt */
    public static class a extends oz50 {
        public /* synthetic */ a(UserId userId) {
            this(userId, AlbumsListFragment.class);
        }

        public final void y(String str) {
            this.j.putString("source", str);
        }

        public a(UserId userId, Class<? extends FragmentImpl> cls) {
            super(cls, null, null);
            this.j.putParcelable("uid", userId);
        }
    }

    /* compiled from: AlbumsListFragment.kt */
    public static final class b extends GridLayoutManager.c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int c(int i) {
            return 1;
        }
    }

    /* compiled from: AlbumsListFragment.kt */
    public static final class c extends RecyclerView.n {
        public final int b = iah0.a(6);

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i = this.b;
            rect.right = i;
            rect.bottom = i;
            rect.left = i;
            rect.top = i;
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final qo1 io() {
        return this.W;
    }

    public void jo(PhotoAlbum photoAlbum) {
        PhotoAlbumFragment.a aVar = new PhotoAlbumFragment.a(this.Z, photoAlbum, false);
        aVar.j.putBoolean("select", true);
        aVar.s(true);
        aVar.g(102, this);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        PhotoAlbum photoAlbum;
        super.onActivityResult(i, i2, intent);
        if (i != 8295 || i2 != -1) {
            if (i == 102 && i2 == -1) {
                Mf(-1, intent);
                return;
            }
            return;
        }
        if (intent == null || (photoAlbum = (PhotoAlbum) intent.getParcelableExtra("album")) == null) {
            return;
        }
        dm1 dm1Var = this.Y;
        if (dm1Var == null) {
            dm1Var = null;
        }
        dm1Var.K0(photoAlbum);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        UserId userId;
        super.onCreate(bundle);
        qo1 qo1Var = this.W;
        if (qo1Var != null) {
            Bundle requireArguments = requireArguments();
            qo1Var.e = requireArguments.getBoolean("select", false);
            qo1Var.f = requireArguments.getBoolean("select_album", false);
        }
        Bundle arguments = getArguments();
        if (arguments == null || (userId = (UserId) arguments.getParcelable("uid")) == null) {
            userId = UserId.d;
        }
        this.Z = userId;
        qo1Var.d = userId;
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString("source") : null;
        String str = userId.b >= 0 ? "photo_catalog_albums_user" : "photo_catalog_albums_community";
        b.d dVar = new b.d("open_screen");
        dVar.b(str, "name");
        dVar.b(userId, "owner_id");
        dVar.b(string, "source");
        dVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.photos_fragment, viewGroup, false);
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
        Object[] objArr = 0;
        vkTopBar.setBack(new VkTopBar.b(new mh(this, 4), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new mo1(0), 3), 14));
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(tq.h(tlo0.Companion, R.string.albums), null, null, null, com.vk.core.compose.component.semantics.b.a(null, new qb(1), 3), 14), null, null, null, 14));
        boolean d = xg5.a().d(this.Z);
        qo1 qo1Var = this.W;
        Object[] objArr2 = qo1Var != null && qo1Var.e;
        boolean z = qo1Var != null && qo1Var.f;
        int i2 = 6;
        vkTopBar.setAfter((!d || (objArr2 == true && !z)) ? null : VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_add_24), null, new g(this, 2), null, null, null, 58), null, 6));
        this.Y = new dm1(((PhotosComponent) this.X.getValue()).d3(), new k60(2), new m(this, 3));
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.recycler_container);
        aq2 aq2Var = new aq2(kn(), objArr == true ? 1 : 0, i2, i);
        this.T = aq2Var;
        viewGroup2.addView(aq2Var);
        int a2 = iah0.a(10);
        aq2 aq2Var2 = this.T;
        if (aq2Var2 == null) {
            aq2Var2 = null;
        }
        aq2Var2.getRecyclerView().setPadding(a2, a2, a2, a2);
        aq2 aq2Var3 = this.T;
        if (aq2Var3 == null) {
            aq2Var3 = null;
        }
        aq2Var3.getRecyclerView().setClipToPadding(false);
        aq2 aq2Var4 = this.T;
        if (aq2Var4 == null) {
            aq2Var4 = null;
        }
        RecyclerView recyclerView = aq2Var4.getRecyclerView();
        getActivity();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.U);
        gridLayoutManager.x = new b();
        this.V = gridLayoutManager;
        recyclerView.setLayoutManager(gridLayoutManager);
        aq2 aq2Var5 = this.T;
        if (aq2Var5 == null) {
            aq2Var5 = null;
        }
        bwt0.R(aq2Var5, new lo1(this, 0));
        aq2 aq2Var6 = this.T;
        if (aq2Var6 == null) {
            aq2Var6 = null;
        }
        aq2Var6.getRecyclerView().addItemDecoration(new c());
        aq2 aq2Var7 = this.T;
        if (aq2Var7 == null) {
            aq2Var7 = null;
        }
        dm1 dm1Var = this.Y;
        if (dm1Var == null) {
            dm1Var = null;
        }
        aq2Var7.setAdapter(dm1Var);
        aq2 aq2Var8 = this.T;
        (aq2Var8 != null ? aq2Var8 : null).setOnRefreshListener(new ji0(this, 1));
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.W.b(false);
    }
}
