package com.vk.newsfeed.posting.mediapicker.videovk.presentation;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.repositories.VideoApiHelperRepository;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.a3t0;
import xsna.ao50;
import xsna.b2t0;
import xsna.b3m;
import xsna.bhc0;
import xsna.bpn0;
import xsna.c3t0;
import xsna.efc0;
import xsna.f3t0;
import xsna.f4z;
import xsna.i3t0;
import xsna.km50;
import xsna.ksg0;
import xsna.l2t0;
import xsna.lqs0;
import xsna.mk50;
import xsna.msy;
import xsna.oz50;
import xsna.pyr0;
import xsna.q2t0;
import xsna.qcs;
import xsna.qhh0;
import xsna.uft0;
import xsna.v0q0;
import xsna.vk50;
import xsna.x1t0;
import xsna.x2j0;
import xsna.x2t0;
import xsna.x9l0;
import xsna.xf90;
import xsna.xn50;
import xsna.y1t0;

/* compiled from: VkVideoPickerFragment.kt */
/* loaded from: classes.dex */
public final class VkVideoPickerFragment extends MviImplFragment<l2t0, i3t0, x1t0> implements b2t0, bhc0, v0q0, qhh0, qcs {
    public static final /* synthetic */ int V = 0;
    public f3t0 R;
    public final bpn0 Q = new bpn0(new pyr0(this, 18));
    public final Object S = msy.a(LazyThreadSafetyMode.NONE, new x9l0(this, 25));
    public final Handler T = new Handler(Looper.getMainLooper());
    public final bpn0 U = new bpn0(new lqs0(this, 11));

    /* compiled from: VkVideoPickerFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        f3t0 f3t0Var = new f3t0(requireContext(), getViewLifecycleOwner(), this);
        this.R = f3t0Var;
        return new mk50.c(f3t0Var.getView());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        i3t0 i3t0Var = (i3t0) ao50Var;
        f3t0 f3t0Var = this.R;
        if (f3t0Var != null) {
            f3t0Var.b(i3t0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        l2t0 l2t0Var = (l2t0) vk50Var;
        ((f4z) l2t0Var.x()).a(new ksg0(this, 26), this);
        this.T.post(new b3m(this, 9));
        l2t0Var.P().b(((q2t0) this.S.getValue()).b());
    }

    @Override // xsna.b2t0
    public final void Vh(x1t0.d dVar) {
        xn50.a.c(this, dVar);
    }

    @Override // xsna.qcs
    public final void Vk() {
        xn50.a.c(this, y1t0.b);
    }

    public final efc0 fo() {
        Fragment parentFragment = getParentFragment();
        PostingFragment postingFragment = parentFragment instanceof PostingFragment ? (PostingFragment) parentFragment : null;
        if (postingFragment != null) {
            return postingFragment.getFeature();
        }
        return null;
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = false;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        xn50.a.c(this, x1t0.b.a.b);
    }

    @Override // xsna.qhh0
    public final boolean s() {
        f3t0 f3t0Var = this.R;
        if (f3t0Var == null) {
            return true;
        }
        f3t0Var.c();
        return true;
    }

    @Override // xsna.v0q0
    public final boolean sk() {
        return false;
    }

    @Override // xsna.bhc0
    public final void tb(float f, int i) {
        f3t0 f3t0Var = this.R;
        if (f3t0Var != null) {
            f3t0Var.a(f);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        a3t0 a3t0Var = new a3t0(new uft0(), (VideoApiHelperRepository) this.Q.getValue());
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("playlist_id_key")) : null;
        xf90 xf90Var = new xf90();
        bpn0 bpn0Var = this.U;
        return new l2t0(new x2t0(c3t0.a.a((UserId) bpn0Var.getValue(), ((q2t0) this.S.getValue()).a())), (UserId) bpn0Var.getValue(), xf90Var, a3t0Var, valueOf, new x2j0(this, 23));
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_VIDEO;
    }
}
