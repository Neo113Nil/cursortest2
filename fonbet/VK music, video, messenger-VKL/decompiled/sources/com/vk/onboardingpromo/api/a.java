package com.vk.onboardingpromo.api;

import xsna.s3q0;
import xsna.spj;

/* compiled from: OnboardingPromoInteractor.kt */
/* loaded from: classes4.dex */
public interface a {
    Object a(long j, spj<? super s3q0> spjVar);

    void b();

    boolean c();

    boolean d();

    OnboardingPromoArguments e();

    /* compiled from: OnboardingPromoInteractor.kt */
    /* renamed from: com.vk.onboardingpromo.api.a$a, reason: collision with other inner class name */
    public static final class C1445a {
        public static final /* synthetic */ C1445a a = new C1445a();
        private static final a STUB = new C1446a();

        public final a getSTUB() {
            return STUB;
        }

        /* compiled from: OnboardingPromoInteractor.kt */
        /* renamed from: com.vk.onboardingpromo.api.a$a$a, reason: collision with other inner class name */
        public static final class C1446a implements a {
            @Override // com.vk.onboardingpromo.api.a
            public final Object a(long j, spj<? super s3q0> spjVar) {
                return s3q0.a;
            }

            @Override // com.vk.onboardingpromo.api.a
            public final boolean c() {
                return false;
            }

            @Override // com.vk.onboardingpromo.api.a
            public final boolean d() {
                return false;
            }

            @Override // com.vk.onboardingpromo.api.a
            public final OnboardingPromoArguments e() {
                return new OnboardingPromoInteractor$Companion$STUB$1$getPromoData$1();
            }

            @Override // com.vk.onboardingpromo.api.a
            public final void b() {
            }
        }
    }
}
