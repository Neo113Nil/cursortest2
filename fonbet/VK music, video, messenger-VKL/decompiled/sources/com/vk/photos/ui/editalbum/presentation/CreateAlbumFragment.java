package com.vk.photos.ui.editalbum.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.movika.sdk.base.logic.interactor.b;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.photos.ui.editalbum.domain.c;
import com.vk.photos.ui.editalbum.domain.d;
import com.vk.photos.ui.editalbum.domain.f;
import com.vk.photos.ui.editalbum.domain.h;
import com.vk.photos.ui.editalbum.domain.i;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.akh;
import xsna.ao50;
import xsna.bpn0;
import xsna.epx;
import xsna.eqd;
import xsna.fpf0;
import xsna.g6;
import xsna.gbh;
import xsna.gm50;
import xsna.jed0;
import xsna.k6k;
import xsna.km50;
import xsna.kzo;
import xsna.m7m;
import xsna.mag;
import xsna.mk50;
import xsna.ozf;
import xsna.ozl;
import xsna.pj1;
import xsna.qfa0;
import xsna.s0e0;
import xsna.sx0;
import xsna.vk50;
import xsna.w40;
import xsna.xn50;
import xsna.xyh;

/* compiled from: CreateAlbumFragment.kt */
/* loaded from: classes3.dex */
public final class CreateAlbumFragment extends MviImplFragment<c, i, a> {
    public static final /* synthetic */ int Z = 0;
    public final bpn0 Q = new bpn0(new ozf(this, 12));
    public final bpn0 R = new bpn0(new gbh(this, 4));
    public final bpn0 S = new bpn0(new k6k(this, 0));
    public final bpn0 T = new bpn0(new w40(this, 29));
    public final bpn0 U = new bpn0(new akh(this, 5));
    public final bpn0 V = new bpn0(new xyh(this, 2));
    public final bpn0 W = new bpn0(new mag(this, 9));
    public final bpn0 X = new bpn0(new sx0(this, 26));
    public final bpn0 Y = new bpn0(new b(this, 29));

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.photo_album_edit_redesign);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        kzo kzoVar = new kzo(view, getViewLifecycleOwner(), new pj1(1, this, CreateAlbumFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
        gm50.a.b(kzoVar, ((i) ao50Var).a, new eqd(kzoVar, 17));
        getFeature().g.a(new g6(8, this, kzoVar), getViewLifecycleOwner());
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Mf(int i, Intent intent) {
        if (getParentFragment() == null) {
            super.Mf(i, intent);
            return;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            parentFragment.onActivityResult(requireArguments().getInt("REQUEST_CODE"), i, intent);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, a.C1516a.b);
        return true;
    }

    public final PrivacySetting fo(PrivacySetting privacySetting) {
        if (!((s0e0) this.Y.getValue()).d()) {
            return privacySetting;
        }
        PrivacySetting privacySetting2 = new PrivacySetting();
        privacySetting2.b = privacySetting.b;
        privacySetting2.c = privacySetting.c;
        privacySetting2.d = privacySetting.d;
        privacySetting2.e.addAll(privacySetting.e);
        List<String> list = privacySetting2.f;
        List<String> list2 = privacySetting.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            String str = (String) obj;
            if (!epx.f(str, PrivacyRules.a.d) && !epx.f(str, PrivacyRules.j.d)) {
                arrayList.add(obj);
            }
        }
        list.addAll(arrayList);
        return privacySetting2;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    @ozl
    public final void onActivityResult(int i, int i2, Intent intent) {
        PrivacySetting privacySetting;
        PrivacySetting privacySetting2;
        if (i == 8295 && i2 == -1 && intent != null && (privacySetting2 = (PrivacySetting) intent.getParcelableExtra("setting")) != null) {
            getFeature().C(new a.k(privacySetting2));
        }
        if (i != 8296 || i2 != -1 || intent == null || (privacySetting = (PrivacySetting) intent.getParcelableExtra("setting")) == null) {
            return;
        }
        getFeature().C(new a.i(privacySetting));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        PhotoAlbum photoAlbum = (PhotoAlbum) this.Q.getValue();
        bpn0 bpn0Var = this.S;
        h hVar = null;
        if (km50Var == null) {
            if (!((Boolean) bpn0Var.getValue()).booleanValue()) {
                c.i = null;
            }
            hVar = c.i;
        } else if (km50Var instanceof h) {
            hVar = (h) km50Var;
        }
        bpn0 bpn0Var2 = this.R;
        if (hVar == null) {
            bpn0 bpn0Var3 = this.Y;
            if (photoAlbum == null) {
                List<String> list = h.m;
                hVar = h.a.c(requireContext(), (UserId) bpn0Var2.getValue(), ((Boolean) bpn0Var.getValue()).booleanValue(), ((s0e0) bpn0Var3.getValue()).d());
            } else {
                List<String> list2 = h.m;
                hVar = h.a.a(requireContext(), photoAlbum, (UserId) bpn0Var2.getValue(), ((s0e0) bpn0Var3.getValue()).d());
            }
        }
        return new c(new d(new f(hVar), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).i3(), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).t9(), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).r1(), new jed0(), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).d3(), ((PhotosComponent) m7m.d(this).a(fpf0.a(PhotosComponent.class))).o5(), new d.b(photoAlbum, (UserId) bpn0Var2.getValue(), (List) this.X.getValue()), new d.a((qfa0.a) this.W.getValue(), (CreateAlbumEntryPoint) this.T.getValue())));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = ((PhotoAlbum) this.Q.getValue()) == null ? MobileOfficialAppsCoreNavStat$EventScreen.PHOTO_ALBUM_CREATE : MobileOfficialAppsCoreNavStat$EventScreen.ALBUM_EDIT;
    }
}
