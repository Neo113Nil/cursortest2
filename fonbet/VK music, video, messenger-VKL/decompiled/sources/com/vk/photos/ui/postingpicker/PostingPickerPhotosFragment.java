package com.vk.photos.ui.postingpicker;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.photos.ui.base.BasePhotoListFragment;
import com.vk.photos.ui.postingpicker.PostingAlbumsListFragment;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.aq2;
import xsna.b1a;
import xsna.bwt0;
import xsna.ey50;
import xsna.fkl;
import xsna.fkq0;
import xsna.izs;
import xsna.r9c0;
import xsna.s3q0;
import xsna.ww50;

/* compiled from: PostingPickerPhotosFragment.kt */
/* loaded from: classes3.dex */
public final class PostingPickerPhotosFragment extends ProfileMainPhotosFragment {
    public static final /* synthetic */ int I0 = 0;
    public final fkl G0 = new fkl();
    public final r9c0 H0 = new r9c0(this, 1);

    /* compiled from: PostingPickerPhotosFragment.kt */
    public static final class a extends BasePhotoListFragment.a {
        public a(UserId userId, boolean z) {
            super(userId, PostingPickerPhotosFragment.class);
            this.j.putBoolean("community_posting_key", z);
            this.j.putBoolean("need_system", true);
            this.j.putString("user_name_ins", null);
            this.j.putBoolean("can_view_user_photos", false);
            this.j.putBoolean("show_new_tags", false);
            this.j.putBoolean("open_for_add", false);
            this.j.putBoolean("select", true);
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        this.G0.b(this);
        return super.a0();
    }

    @Override // com.vk.photos.ui.profile.ProfileMainPhotosFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable parcelable;
        ww50<?> Y;
        Object parcelableExtra;
        if (i != 44 || i2 != -1 || intent == null || !intent.hasExtra("photo_vk_attach")) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        Photo photo = (Photo) intent.getParcelableExtra("photo_vk_attach");
        if (photo == null) {
            return;
        }
        fkl fklVar = new fkl();
        FragmentImpl fragmentImpl = null;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("PICKER_TECH_METRICS_SESSION", PickerTechMetricsSession.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("PICKER_TECH_METRICS_SESSION");
            if (!(parcelableExtra2 instanceof PickerTechMetricsSession)) {
                parcelableExtra2 = null;
            }
            parcelable = (PickerTechMetricsSession) parcelableExtra2;
        }
        PickerTechMetricsSession pickerTechMetricsSession = (PickerTechMetricsSession) parcelable;
        if (pickerTechMetricsSession != null) {
            fklVar.a = pickerTechMetricsSession.b;
            fklVar.b = pickerTechMetricsSession.c;
        }
        LayoutInflater.Factory activity = getActivity();
        ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
        if (ey50Var != null && (Y = ey50Var.Y()) != null) {
            fragmentImpl = Y.u();
        }
        Intent intent2 = new Intent();
        intent2.putExtra("photo_vk_attach", photo);
        intent2.putExtra("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(this.G0.a, fklVar.b));
        if (fragmentImpl != null) {
            fragmentImpl.Mf(-1, intent2);
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkTopBar vkTopBar;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getArguments() != null && (vkTopBar = this.X) != null) {
            bwt0.p0(vkTopBar, !r5.getBoolean("select", false));
        }
        aq2 aq2Var = this.Y;
        if (aq2Var == null) {
            aq2Var = null;
        }
        fkl fklVar = this.G0;
        fklVar.getClass();
        aq2Var.setLoaderVisibilityChangeListener(new fkl.a(this, new b1a(10, this, fklVar)));
        return onCreateView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        fkl fklVar = this.G0;
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(fklVar.a, fklVar.b));
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.G0.a(bundle);
        }
    }

    @Override // com.vk.photos.ui.base.BasePhotoListFragment
    public final void oo(Photo photo) {
        ww50<?> Y;
        fkl fklVar = this.G0;
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
        fklVar.c(intent);
        if (fragmentImpl != null) {
            fragmentImpl.Mf(-1, intent);
        }
    }

    @Override // com.vk.photos.ui.profile.ProfileMainPhotosFragment
    public final izs<PhotoAlbum, s3q0> wo() {
        return this.H0;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        UserId userId = (UserId) requireArguments().getParcelable("uid");
        uiTrackingScreen.a = !requireArguments().getBoolean("community_posting_key", false) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO : (userId == null || !fkq0.d(userId)) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO_COMMUNITY : MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_PHOTO_PROFILE;
    }

    @Override // com.vk.photos.ui.profile.ProfileMainPhotosFragment
    public final void zo() {
        PostingAlbumsListFragment.a aVar = new PostingAlbumsListFragment.a(this.y0.f, PostingAlbumsListFragment.class);
        aVar.j.putBoolean("select", true);
        aVar.g(44, this);
    }
}
