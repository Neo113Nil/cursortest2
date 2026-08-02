package com.vk.music.bottomsheets.onboarding.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.music.bottomsheets.di.RecommendationOnboardingComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.music.pref.MusicPrefsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e550;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.rka0;
import xsna.s6y;
import xsna.td80;
import xsna.zaf0;

/* compiled from: RecommendationOnboardingComponentImpl.kt */
/* loaded from: classes3.dex */
public final class RecommendationOnboardingComponentImpl implements RecommendationOnboardingComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final MusicPrefsComponent a;
    public final AudioModelsComponent b;
    public final nwy c = new nwy(new e550(this, 18));
    public final nwy d = new nwy(new s6y(this, 29));
    public final nwy e = new nwy(new rka0(this, 10));

    /* compiled from: RecommendationOnboardingComponentImpl.kt */
    public static final class a implements b7m<RecommendationOnboardingComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new RecommendationOnboardingComponentImpl((MusicPrefsComponent) e7mVar.a(fpf0.a(MusicPrefsComponent.class)), (AudioModelsComponent) e7mVar.a(fpf0.a(AudioModelsComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(RecommendationOnboardingComponentImpl.class, "repository", "getRepository()Lcom/vk/music/bottomsheets/onboarding/data/network/OnboardingRepositoryImpl;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, RecommendationOnboardingComponentImpl.class, "onboardingInteractor", "getOnboardingInteractor()Lcom/vk/music/bottomsheets/domain/OnboardingInteractor;", hpf0Var), ep.a(0, RecommendationOnboardingComponentImpl.class, "recommendationOnboardingController", "getRecommendationOnboardingController()Lcom/vk/music/bottomsheets/recommonboarding/RecommendationOnboardingController;", hpf0Var)};
    }

    public RecommendationOnboardingComponentImpl(MusicPrefsComponent musicPrefsComponent, AudioModelsComponent audioModelsComponent) {
        this.a = musicPrefsComponent;
        this.b = audioModelsComponent;
    }

    @Override // com.vk.music.bottomsheets.di.RecommendationOnboardingComponent
    public final zaf0 R8() {
        qcy<Object> qcyVar = f[2];
        return (zaf0) this.e.c();
    }

    @Override // com.vk.music.bottomsheets.di.RecommendationOnboardingComponent
    public final td80 W7() {
        qcy<Object> qcyVar = f[1];
        return (td80) this.d.c();
    }
}
