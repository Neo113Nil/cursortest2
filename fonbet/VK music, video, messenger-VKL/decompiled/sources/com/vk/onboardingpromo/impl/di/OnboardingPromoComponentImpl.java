package com.vk.onboardingpromo.impl.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.app.AppContextDiComponent;
import com.vk.onboardingpromo.api.OnboardingPromoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.wp40;
import xsna.ye80;

/* compiled from: OnboardingPromoComponentImpl.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoComponentImpl implements OnboardingPromoComponent {
    public static final /* synthetic */ qcy<Object>[] c = {new PropertyReference1Impl(OnboardingPromoComponentImpl.class, "interactor", "getInteractor()Lcom/vk/onboardingpromo/api/OnboardingPromoInteractor;", 0), fp.c(0, OnboardingPromoComponentImpl.class, "launcher", "getLauncher()Lcom/vk/onboardingpromo/api/OnboardingPromoLauncher;", fpf0.a)};
    public final AppContextDiComponent a;
    public final nwy b = new nwy(new wp40(this, 7));

    /* compiled from: OnboardingPromoComponentImpl.kt */
    public static final class a implements c8m<OnboardingPromoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new OnboardingPromoComponentImpl((AppContextDiComponent) g8mVar.a(fpf0.a(AppContextDiComponent.class)));
        }
    }

    public OnboardingPromoComponentImpl(AppContextDiComponent appContextDiComponent) {
        this.a = appContextDiComponent;
        new nwy(new ye80(this, 0));
    }

    @Override // com.vk.onboardingpromo.api.OnboardingPromoComponent
    public final com.vk.onboardingpromo.api.a b() {
        qcy<Object> qcyVar = c[0];
        return (com.vk.onboardingpromo.api.a) this.b.c();
    }
}
