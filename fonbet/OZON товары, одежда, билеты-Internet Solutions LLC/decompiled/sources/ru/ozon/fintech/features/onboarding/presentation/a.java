package ru.ozon.fintech.features.onboarding.presentation;

import Sc.s;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.Y;

@e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingFragment$showOnboardingSlides$4", f = "OnboardingFragment.kt", l = {342}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f95960d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f95961e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Function0<Unit>> f95962f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(boolean z11, kotlin.jvm.internal.M<Function0<Unit>> m11, d<? super a> dVar) {
        super(2, dVar);
        this.f95961e = z11;
        this.f95962f = m11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new a(this.f95961e, this.f95962f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f95960d;
        if (i11 == 0) {
            s.b(obj);
            long j11 = this.f95961e ? 500L : 0L;
            this.f95960d = 1;
            if (Y.b(j11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        Function0<Unit> function0 = this.f95962f.f71787a;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f71690a;
    }
}
