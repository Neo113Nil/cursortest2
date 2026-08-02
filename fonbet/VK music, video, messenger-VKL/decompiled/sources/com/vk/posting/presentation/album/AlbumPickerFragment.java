package com.vk.posting.presentation.album;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.posting.di.PostingComponent;
import com.vk.posting.presentation.album.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.ak1;
import xsna.ao50;
import xsna.bpn0;
import xsna.djl;
import xsna.dk1;
import xsna.ek1;
import xsna.fkq0;
import xsna.fpf0;
import xsna.gm50;
import xsna.ha;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.oj1;
import xsna.oz50;
import xsna.rj1;
import xsna.sj1;
import xsna.tfa0;
import xsna.vk50;
import xsna.vs;
import xsna.w8i;
import xsna.wf90;
import xsna.xj1;
import xsna.xn50;
import xsna.y6;
import xsna.yj1;

/* compiled from: AlbumPickerFragment.kt */
/* loaded from: classes5.dex */
public final class AlbumPickerFragment extends MviImplFragment<oj1, ek1, com.vk.posting.presentation.album.a> implements w8i {
    public static final /* synthetic */ int V = 0;
    public dk1 Q;
    public final b R = new b();
    public final bpn0 S = new bpn0(new y6(this, 2));
    public final Object T = msy.a(LazyThreadSafetyMode.NONE, new rj1(this, 0));
    public final Handler U = new Handler(Looper.getMainLooper());

    /* compiled from: AlbumPickerFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        dk1 dk1Var = new dk1(requireContext(), this, this);
        this.Q = dk1Var;
        return new mk50.c(dk1Var.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ek1 ek1Var = (ek1) ao50Var;
        dk1 dk1Var = this.Q;
        if (dk1Var == null) {
            dk1Var = null;
        }
        dk1Var.getClass();
        gm50.a.b(dk1Var, ek1Var.a, new vs(dk1Var, 2));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((oj1) vk50Var).k.a(new ha(this, 3), this);
        this.U.post(new sj1(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        ((djl) this.T.getValue()).g(this);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            ((djl) this.T.getValue()).f(bundle);
        }
        this.o = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        djl djlVar = (djl) this.T.getValue();
        djlVar.b.e();
        djlVar.c = false;
        super.onDestroyView();
        xn50.a.c(this, a.c.C1524a.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        djl djlVar = (djl) this.T.getValue();
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(djlVar.d, djlVar.e));
    }

    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        yj1 Fa = ((PostingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(PostingComponent.class))).Fa();
        wf90 wf90Var = new wf90();
        tfa0 tfa0Var = tfa0.a;
        bpn0 bpn0Var = this.S;
        return new oj1(new xj1(new ak1((UserId) bpn0Var.getValue(), null, false, null)), (UserId) bpn0Var.getValue(), Fa, wf90Var, tfa0Var, (djl) this.T.getValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = !requireArguments().getBoolean("community_posting_key", false) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ALBUM : fkq0.d((UserId) this.S.getValue()) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ALBUM_PROFILE : MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ALBUM_COMMUNITY;
    }
}
