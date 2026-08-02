package com.vk.photos.ui.postingpicker;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import xsna.aq2;
import xsna.b1a;
import xsna.ey50;
import xsna.fkl;
import xsna.ww50;

/* compiled from: PostingPhotoAlbumFragment.kt */
/* loaded from: classes3.dex */
public final class PostingPhotoAlbumFragment extends PhotoAlbumFragment {
    public final fkl s0 = new fkl();

    /* compiled from: PostingPhotoAlbumFragment.kt */
    public static final class a extends BasePhotoListFragment.a {
        public a(UserId userId, PhotoAlbum photoAlbum) {
            super(userId, PostingPhotoAlbumFragment.class);
            this.j.putParcelable("album", photoAlbum);
            this.j.putBoolean("select", true);
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        this.s0.b(this);
        return super.a0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.clear();
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        fkl fklVar = this.s0;
        fklVar.getClass();
        aq2Var.setLoaderVisibilityChangeListener(new fkl.a(this, new b1a(10, this, fklVar)));
        return onCreateView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        fkl fklVar = this.s0;
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(fklVar.a, fklVar.b));
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.s0.a(bundle);
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void oo(Photo photo) {
        ww50<?> Y;
        fkl fklVar = this.s0;
        fklVar.getClass();
        fklVar.b = Long.valueOf(SystemClock.elapsedRealtime());
        LayoutInflater.Factory activity = getActivity();
        FragmentImpl fragmentImpl = null;
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            fragmentImpl = Y.u();
        }
        Intent intent = new Intent();
        intent.putExtra("photo_vk_attach", photo);
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.containsKey("PICKER_TECH_METRICS_SESSION")) {
            fklVar.c(intent);
        } else {
            fkl fklVar2 = new fkl();
            fklVar2.a(arguments);
            intent.putExtra("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(fklVar2.a, fklVar.b));
        }
        if (fragmentImpl != null) {
            fragmentImpl.Mf(-1, intent);
        }
    }
}
