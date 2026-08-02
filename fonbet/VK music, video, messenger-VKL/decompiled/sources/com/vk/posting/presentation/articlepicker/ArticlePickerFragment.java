package com.vk.posting.presentation.articlepicker;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.posting.data.PickerTechMetricsSession;
import com.vk.posting.di.PostingComponent;
import com.vk.posting.presentation.articlepicker.a;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.LazyThreadSafetyMode;
import xsna.ao50;
import xsna.bp3;
import xsna.bpn0;
import xsna.cp3;
import xsna.djl;
import xsna.ep3;
import xsna.fkq0;
import xsna.fp3;
import xsna.fpf0;
import xsna.gm50;
import xsna.gp3;
import xsna.i50;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.msy;
import xsna.n52;
import xsna.no;
import xsna.op1;
import xsna.oz50;
import xsna.rj1;
import xsna.vk50;
import xsna.w8i;
import xsna.wf90;
import xsna.wo3;
import xsna.xn50;

/* compiled from: ArticlePickerFragment.kt */
/* loaded from: classes5.dex */
public final class ArticlePickerFragment extends MviImplFragment<wo3, gp3, com.vk.posting.presentation.articlepicker.a> implements w8i {
    public static final /* synthetic */ int V = 0;
    public fp3 Q;
    public final b R = new b();
    public final bpn0 S = new bpn0(new rj1(this, 3));
    public final Object T = msy.a(LazyThreadSafetyMode.NONE, new no(this, 2));
    public final Handler U = new Handler(Looper.getMainLooper());

    /* compiled from: ArticlePickerFragment.kt */
    public static final class a extends oz50 {
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        fp3 fp3Var = new fp3(requireContext(), getViewLifecycleOwner(), this);
        this.Q = fp3Var;
        return new mk50.c(fp3Var.e);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        gp3 gp3Var = (gp3) ao50Var;
        fp3 fp3Var = this.Q;
        if (fp3Var == null) {
            fp3Var = null;
        }
        fp3Var.getClass();
        gm50.a.b(fp3Var, gp3Var.a, new i50(fp3Var, 3));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((wo3) vk50Var).k.a(new op1(this, 2), this);
        this.U.post(new n52(this, 1));
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
        xn50.a.c(this, a.c.C1528a.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        djl djlVar = (djl) this.T.getValue();
        bundle.putParcelable("PICKER_TECH_METRICS_SESSION", new PickerTechMetricsSession(djlVar.d, djlVar.e));
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        cp3 d0 = ((PostingComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(PostingComponent.class))).d0();
        wf90 wf90Var = new wf90();
        bpn0 bpn0Var = this.S;
        return new wo3(new bp3(new ep3((UserId) bpn0Var.getValue(), null, false, null)), (UserId) bpn0Var.getValue(), d0, wf90Var, (djl) this.T.getValue());
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = !requireArguments().getBoolean("community_posting_key", false) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ARTICLE : fkq0.d((UserId) this.S.getValue()) ? MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ARTICLE_PROFILE : MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_ARTICLE_COMMUNITY;
    }
}
