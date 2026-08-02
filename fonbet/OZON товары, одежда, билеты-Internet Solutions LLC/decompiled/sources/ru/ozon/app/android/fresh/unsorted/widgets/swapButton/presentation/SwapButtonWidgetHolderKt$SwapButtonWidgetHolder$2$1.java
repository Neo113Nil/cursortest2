package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import An.C2439a;
import Sc.o;
import Sc.s;
import Wc.a;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1", f = "SwapButtonWidgetHolder.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $composerController;
    final /* synthetic */ ComposerNavigator $composerNavigator;
    final /* synthetic */ C4911f $localOwnerContainer;
    final /* synthetic */ SwapButtonViewModel $viewModel;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/presentation/SwapButtonViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1$1", f = "SwapButtonWidgetHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.widgets.swapButton.presentation.SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<SwapButtonViewModel.Action, d<? super Unit>, Object> {
        final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
        final /* synthetic */ InterfaceC7851b $composerController;
        final /* synthetic */ ComposerNavigator $composerNavigator;
        final /* synthetic */ C4911f $localOwnerContainer;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC7851b interfaceC7851b, C4911f c4911f, Function1<? super AtomAction, Unit> function1, ComposerNavigator composerNavigator, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$composerController = interfaceC7851b;
            this.$localOwnerContainer = c4911f;
            this.$actionHandler = function1;
            this.$composerNavigator = composerNavigator;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$composerController, this.$localOwnerContainer, this.$actionHandler, this.$composerNavigator, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            SwapButtonViewModel.Action action = (SwapButtonViewModel.Action) this.L$0;
            if (action instanceof SwapButtonViewModel.Action.SubscriptionSuccess) {
                this.$composerController.hideLoader();
                SwapButtonWidgetHolderKt.showNotification(Boolean.valueOf(((SwapButtonViewModel.Action.SubscriptionSuccess) action).getIsSubscribed()), this.$localOwnerContainer, this.$actionHandler);
            } else if (action instanceof SwapButtonViewModel.Action.SubscriptionError) {
                this.$composerController.hideLoader();
                SwapButtonWidgetHolderKt.showNotification(null, this.$localOwnerContainer, this.$actionHandler);
            } else if (action instanceof SwapButtonViewModel.Action.NeedAuth) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.$composerNavigator, "ozon://my/entry/credentials-required", null, 2, null);
            } else {
                if (!(action instanceof SwapButtonViewModel.Action.SubscriptionInProgress)) {
                    throw new o();
                }
                C2439a.b(0L, null, 3, this.$composerController);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SwapButtonViewModel.Action action, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(action, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1(SwapButtonViewModel swapButtonViewModel, InterfaceC7851b interfaceC7851b, C4911f c4911f, Function1<? super AtomAction, Unit> function1, ComposerNavigator composerNavigator, d<? super SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1> dVar) {
        super(2, dVar);
        this.$viewModel = swapButtonViewModel;
        this.$composerController = interfaceC7851b;
        this.$localOwnerContainer = c4911f;
        this.$actionHandler = function1;
        this.$composerNavigator = composerNavigator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1(this.$viewModel, this.$composerController, this.$localOwnerContainer, this.$actionHandler, this.$composerNavigator, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h<SwapButtonViewModel.Action> actions = this.$viewModel.getActions();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$composerController, this.$localOwnerContainer, this.$actionHandler, this.$composerNavigator, null);
            this.label = 1;
            if (C2399j.h(actions, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SwapButtonWidgetHolderKt$SwapButtonWidgetHolder$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
