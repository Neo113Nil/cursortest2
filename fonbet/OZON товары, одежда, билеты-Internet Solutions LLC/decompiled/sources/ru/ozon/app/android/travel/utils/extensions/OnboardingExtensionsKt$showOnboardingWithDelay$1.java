package ru.ozon.app.android.travel.utils.extensions;

import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import com.google.protobuf.DescriptorProtos$FileOptions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt$showOnboardingWithDelay$1", f = "OnboardingExtensions.kt", l = {DescriptorProtos$FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OnboardingExtensionsKt$showOnboardingWithDelay$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<OnBoardingDTO, Unit> $bindAction;
    final /* synthetic */ AbstractC5434v $lifecycle;
    final /* synthetic */ OnBoardingDTO $this_showOnboardingWithDelay;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt$showOnboardingWithDelay$1$1", f = "OnboardingExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.utils.extensions.OnboardingExtensionsKt$showOnboardingWithDelay$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ M $$this$launch;
        final /* synthetic */ Function1<OnBoardingDTO, Unit> $bindAction;
        final /* synthetic */ OnBoardingDTO $this_showOnboardingWithDelay;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super OnBoardingDTO, Unit> function1, OnBoardingDTO onBoardingDTO, M m11, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$bindAction = function1;
            this.$this_showOnboardingWithDelay = onBoardingDTO;
            this.$$this$launch = m11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$bindAction, this.$this_showOnboardingWithDelay, this.$$this$launch, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.$bindAction.invoke(this.$this_showOnboardingWithDelay);
            N.c(this.$$this$launch, null);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OnboardingExtensionsKt$showOnboardingWithDelay$1(AbstractC5434v abstractC5434v, Function1<? super OnBoardingDTO, Unit> function1, OnBoardingDTO onBoardingDTO, d<? super OnboardingExtensionsKt$showOnboardingWithDelay$1> dVar) {
        super(2, dVar);
        this.$lifecycle = abstractC5434v;
        this.$bindAction = function1;
        this.$this_showOnboardingWithDelay = onBoardingDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        OnboardingExtensionsKt$showOnboardingWithDelay$1 onboardingExtensionsKt$showOnboardingWithDelay$1 = new OnboardingExtensionsKt$showOnboardingWithDelay$1(this.$lifecycle, this.$bindAction, this.$this_showOnboardingWithDelay, dVar);
        onboardingExtensionsKt$showOnboardingWithDelay$1.L$0 = obj;
        return onboardingExtensionsKt$showOnboardingWithDelay$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (androidx.lifecycle.C5412d0.a(r9, r3, r4, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (xe.Y.b(300, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M m11;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            m11 = (M) this.L$0;
            this.L$0 = m11;
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            m11 = (M) this.L$0;
            s.b(obj);
        }
        AbstractC5434v abstractC5434v = this.$lifecycle;
        AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bindAction, this.$this_showOnboardingWithDelay, m11, null);
        this.L$0 = null;
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OnboardingExtensionsKt$showOnboardingWithDelay$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
