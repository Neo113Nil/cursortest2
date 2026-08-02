package y70;

import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.fintech.settings.models.FeatureValue;
import xe.C10720e0;
import xe.L0;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$loadOnboardingSlides$1", f = "OnboardingViewModel.kt", l = {467, 471}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    f f106246d;

    /* renamed from: e, reason: collision with root package name */
    f f106247e;

    /* renamed from: f, reason: collision with root package name */
    int f106248f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f f106249g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.onboarding.presentation.OnboardingViewModel$loadOnboardingSlides$1$1", f = "OnboardingViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f106250d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f106250d = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f106250d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            this.f106250d.F0();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(f fVar, kotlin.coroutines.d<? super g> dVar) {
        super(2, dVar);
        this.f106249g = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f106249g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (xe.C10727i.f(r7, r1, r6) != r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f fVar;
        f fVar2;
        FeatureValue featureValue;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f106248f;
        f fVar3 = this.f106249g;
        if (i11 == 0) {
            s.b(obj);
            try {
                Q90.c cVar = fVar3.f106216g;
                S90.d dVar = S90.d.MOB_NATIVE_ONBOARDING;
                this.f106246d = fVar3;
                this.f106247e = fVar3;
                this.f106248f = 1;
                obj = cVar.u(dVar, this);
                if (obj != aVar) {
                    fVar2 = fVar3;
                    fVar = fVar2;
                }
            } catch (Exception unused) {
                fVar = fVar3;
                fVar2 = fVar;
                featureValue = null;
                fVar2.K0(featureValue);
                C10720e0 c10720e0 = C10720e0.f105451a;
                L0 l02 = De.s.f6650a;
                a aVar2 = new a(fVar3, null);
                this.f106246d = null;
                this.f106247e = null;
                this.f106248f = 2;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            f.g0(fVar3);
            return Unit.f71690a;
        }
        fVar2 = this.f106247e;
        fVar = this.f106246d;
        try {
            s.b(obj);
        } catch (Exception unused2) {
            fVar2 = fVar;
            featureValue = null;
            fVar2.K0(featureValue);
            C10720e0 c10720e02 = C10720e0.f105451a;
            L0 l022 = De.s.f6650a;
            a aVar22 = new a(fVar3, null);
            this.f106246d = null;
            this.f106247e = null;
            this.f106248f = 2;
        }
        featureValue = (FeatureValue) obj;
        fVar2.K0(featureValue);
        C10720e0 c10720e022 = C10720e0.f105451a;
        L0 l0222 = De.s.f6650a;
        a aVar222 = new a(fVar3, null);
        this.f106246d = null;
        this.f106247e = null;
        this.f106248f = 2;
    }
}
