package com.vk.photos.root.photoflow.tags.presentation;

import android.os.Bundle;
import android.util.Size;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vkontakte.android.R;
import xsna.ao50;
import xsna.bpn0;
import xsna.cca0;
import xsna.fpf0;
import xsna.hca0;
import xsna.ida0;
import xsna.ikv0;
import xsna.jca0;
import xsna.jda0;
import xsna.k7m;
import xsna.k7y;
import xsna.kca0;
import xsna.km50;
import xsna.m7m;
import xsna.mgz;
import xsna.mk50;
import xsna.nuv;
import xsna.qfa0;
import xsna.qo0;
import xsna.s1x;
import xsna.tzv;
import xsna.vk50;
import xsna.w8i;

/* compiled from: PhotoTagsFragment.kt */
/* loaded from: classes.dex */
public final class PhotoTagsFragment extends MviImplFragment<hca0, jda0, cca0> implements w8i {
    public static final /* synthetic */ int U = 0;
    public final bpn0 Q = new bpn0(new nuv(this, 20));
    public final bpn0 R = new bpn0(new qo0(28));
    public final bpn0 S = new bpn0(new s1x(this, 22));
    public final bpn0 T = new bpn0(new tzv(this, 22));

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.fragment_photo_tags);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        new ida0(view, (UserId) this.Q.getValue(), getFeature(), getViewLifecycleOwner(), new jca0(this), new kca0(this), new k7y(this, 22)).a((jda0) ao50Var);
        getFeature().W().a(new mgz(this, 20), getViewLifecycleOwner());
    }

    public final void fo(String str) {
        ikv0.a aVar = new ikv0.a(requireContext());
        aVar.h(new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_filled_blue_24, (Integer) null, (Size) null, 14));
        aVar.i(new ikv0.d(str, (String) null, (ikv0.d.a) null, 6));
        aVar.n();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        return new hca0(requireArguments().getInt("PHOTO_TAGS_COUNT", -1), requireArguments().getInt("RECOGNITION_TAGS_COUNT", -1), ((PhotosComponent) ((k7m) m7m.f(this)).a(fpf0.a(PhotosComponent.class))).J3(), (qfa0.g) this.T.getValue());
    }
}
