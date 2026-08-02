package com.vk.music.onboarding.impl.phone;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.Artist;
import com.vk.music.onboarding.impl.MusicRecommendationOnboardingContract$Presenter;
import com.vk.music.onboarding.impl.model.RecommendationOnBoardingModel;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bpn0;
import xsna.by20;
import xsna.dcg0;
import xsna.gzs;
import xsna.i700;
import xsna.ies;
import xsna.j350;
import xsna.k350;
import xsna.k840;
import xsna.mhy;
import xsna.msy;
import xsna.oz50;
import xsna.q700;
import xsna.r5v0;
import xsna.s250;
import xsna.s3q0;
import xsna.w800;
import xsna.w8q;

/* compiled from: MusicRecommendationOnboardingFragment.kt */
/* loaded from: classes3.dex */
public final class MusicRecommendationOnboardingFragment extends BaseMvpFragment<MusicRecommendationOnboardingContract$Presenter> implements com.vk.music.onboarding.impl.a, ies {
    public static final /* synthetic */ int Y = 0;
    public com.vk.music.onboarding.impl.b V;
    public MusicRecommendationOnboardingContract$Presenter X;
    public final Object T = msy.a(LazyThreadSafetyMode.NONE, new w8q(this, 25));
    public final bpn0 U = new bpn0(new by20(this, 8));
    public final io.reactivex.rxjava3.disposables.b W = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: MusicRecommendationOnboardingFragment.kt */
    public static final class a extends oz50 {
        public a(String str, String str2) {
            super(MusicRecommendationOnboardingFragment.class, null, null);
            this.j.putString("SCENARIO", str);
            this.j.putString("REQUEST_ID", str2);
        }
    }

    /* compiled from: MusicRecommendationOnboardingFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((MusicRecommendationOnboardingFragment) this.receiver).e();
            return s3q0.a;
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void Em(List<Artist> list) {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            bVar.i.C0(list, true);
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void Kd(List<Artist> list) {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            if (bVar.c.g == MusicRecommendationOnboardingContract$Presenter.State.SEARCH) {
                bVar.i.C0(list, false);
            } else {
                bVar.h.C0(list, false);
            }
        }
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar == null) {
            return true;
        }
        bVar.c.g();
        return true;
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void e() {
        String string = requireArguments().getString("REQUEST_ID");
        r5v0 r5v0Var = k840.a.h;
        if (r5v0Var == null) {
            r5v0Var = null;
        }
        r5v0Var.b(new dcg0(string));
        finish();
    }

    @Override // com.vk.core.fragments.BaseMvpFragment
    public final MusicRecommendationOnboardingContract$Presenter io() {
        return this.X;
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void je(String str) {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            b bVar2 = new b(0, this, MusicRecommendationOnboardingFragment.class, "closeScreen", "closeScreen()V", 0);
            w800<i700> j = q700.j(bVar.b, str);
            j.a(new j350(bVar, bVar2));
            j.b(new k350(bVar, bVar2));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            if (!bVar.z) {
                bVar.A.setExpanded(false);
            }
            bVar.g(bVar.n);
            bVar.g(bVar.o);
        }
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.music_recommendation_onboarding, viewGroup, false);
        Context context = layoutInflater.getContext();
        ?? r11 = this.T;
        MusicRecommendationOnboardingContract$Presenter musicRecommendationOnboardingContract$Presenter = new MusicRecommendationOnboardingContract$Presenter(context, this, (RecommendationOnBoardingModel) r11.getValue(), this.W, this.U);
        this.V = new com.vk.music.onboarding.impl.b(kn(), inflate, musicRecommendationOnboardingContract$Presenter, (RecommendationOnBoardingModel) r11.getValue(), false);
        this.X = musicRecommendationOnboardingContract$Presenter;
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            bVar.u.W();
            bVar.v.W();
            bVar.f.e();
        }
        this.W.e();
        super.onDestroyView();
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void qe(MusicRecommendationOnboardingContract$Presenter.State state) {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            bVar.d(state);
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void ra(long j, String str, String str2) {
        mhy.d(getView());
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            bVar.c(j, str, str2);
        }
    }

    @Override // com.vk.music.onboarding.impl.a
    public final void x3(List<Artist> list, Artist artist) {
        com.vk.music.onboarding.impl.b bVar = this.V;
        if (bVar != null) {
            s250 s250Var = bVar.h;
            if (bVar.c.g == MusicRecommendationOnboardingContract$Presenter.State.SEARCH) {
                bVar.i.D0(list, artist);
                s250Var.i.F0(artist, artist);
            } else {
                s250Var.D0(list, artist);
            }
            bVar.p.setEnabled(bVar.d.D());
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_RECOMMENDATIONS_ONBOARDING;
    }
}
