package ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose;

import S0.InterfaceC3970l0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import m0.C7980b;
import m0.C8004n;
import m0.C8008p;
import m0.T0;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderVI;
import ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.presentation.BonusExpirationRemainderViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BonusExpirationRemainderKt$ShowContent$6$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ M $scope;
    final /* synthetic */ BonusExpirationRemainderVI $state;
    final /* synthetic */ C7980b<Float, C8008p> $translationY;
    final /* synthetic */ InterfaceC3970l0 $viewHeight$delegate;
    final /* synthetic */ BonusExpirationRemainderViewModel $viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose.BonusExpirationRemainderKt$ShowContent$6$1$1$1", f = "BonusExpirationRemainder.kt", l = {151}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.bonusExpirationRemainder.v1.compose.BonusExpirationRemainderKt$ShowContent$6$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ AtomAction $it;
        final /* synthetic */ BonusExpirationRemainderVI $state;
        final /* synthetic */ C7980b<Float, C8008p> $translationY;
        final /* synthetic */ InterfaceC3970l0 $viewHeight$delegate;
        final /* synthetic */ BonusExpirationRemainderViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(C7980b<Float, C8008p> c7980b, BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, BonusExpirationRemainderVI bonusExpirationRemainderVI, AtomAction atomAction, InterfaceC3970l0 interfaceC3970l0, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$translationY = c7980b;
            this.$viewModel = bonusExpirationRemainderViewModel;
            this.$state = bonusExpirationRemainderVI;
            this.$it = atomAction;
            this.$viewHeight$delegate = interfaceC3970l0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$translationY, this.$viewModel, this.$state, this.$it, this.$viewHeight$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float floatValue;
            AnonymousClass1 anonymousClass1;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                C7980b<Float, C8008p> c7980b = this.$translationY;
                floatValue = this.$viewHeight$delegate.getFloatValue();
                Float f7 = new Float(floatValue);
                T0 d11 = C8004n.d(0, 0, null, 7);
                this.label = 1;
                anonymousClass1 = this;
                if (C7980b.f(c7980b, f7, d11, null, anonymousClass1, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                anonymousClass1 = this;
            }
            anonymousClass1.$viewModel.onCloseClicked(anonymousClass1.$state.getId(), anonymousClass1.$it.getParams());
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BonusExpirationRemainderKt$ShowContent$6$1$1(M m11, C7980b<Float, C8008p> c7980b, BonusExpirationRemainderViewModel bonusExpirationRemainderViewModel, BonusExpirationRemainderVI bonusExpirationRemainderVI, InterfaceC3970l0 interfaceC3970l0) {
        super(1);
        this.$scope = m11;
        this.$translationY = c7980b;
        this.$viewModel = bonusExpirationRemainderViewModel;
        this.$state = bonusExpirationRemainderVI;
        this.$viewHeight$delegate = interfaceC3970l0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C10727i.c(this.$scope, null, null, new AnonymousClass1(this.$translationY, this.$viewModel, this.$state, it, this.$viewHeight$delegate, null), 3);
    }
}
