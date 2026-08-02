package ru.ozon.app.android.returns.actionModal.di;

import Ae.B0;
import Ae.C2399j;
import Sc.o;
import Sc.s;
import Tg.b;
import Wc.a;
import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionEffect;
import ru.ozon.app.android.returns.actionModal.presentation.viewModel.ReturnActionModalViewModel;
import ru.ozon.app.android.returns.actionModal.viewMapper.update.MarkRequiredFields;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.core.UniColors;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1", f = "ReturnActionModalWidget.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<b, Unit> $actionHandler;
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ C4911f $currentContainer;
    final /* synthetic */ ViewGroup $rootView;
    final /* synthetic */ ReturnActionModalViewModel $viewModel;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "event", "Lru/ozon/app/android/returns/actionModal/presentation/viewModel/ReturnActionEffect;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1$1", f = "ReturnActionModalWidget.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.returns.actionModal.di.ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<ReturnActionEffect, d<? super Unit>, Object> {
        final /* synthetic */ Function1<b, Unit> $actionHandler;
        final /* synthetic */ InterfaceC7851b $controller;
        final /* synthetic */ C4911f $currentContainer;
        final /* synthetic */ ViewGroup $rootView;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(InterfaceC7851b interfaceC7851b, ViewGroup viewGroup, C4911f c4911f, Function1<? super b, Unit> function1, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$controller = interfaceC7851b;
            this.$rootView = viewGroup;
            this.$currentContainer = c4911f;
            this.$actionHandler = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$controller, this.$rootView, this.$currentContainer, this.$actionHandler, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AtomAction atomAction;
            ViewGroup rootView;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ReturnActionEffect returnActionEffect = (ReturnActionEffect) this.L$0;
            if (returnActionEffect instanceof ReturnActionEffect.RequiredFields) {
                this.$controller.update(new MarkRequiredFields(((ReturnActionEffect.RequiredFields) returnActionEffect).getKeys()));
            } else if (returnActionEffect instanceof ReturnActionEffect.ShowError) {
                if (this.$rootView != null) {
                    ReturnActionModalWidgetKt.showMessage(((ReturnActionEffect.ShowError) returnActionEffect).getError(), this.$rootView, R$drawable.ic_warning, UniColors.GRAPHIC_WARNING_PRIMARY, this.$currentContainer.g());
                }
            } else {
                if (!(returnActionEffect instanceof ReturnActionEffect.ExecuteAction)) {
                    throw new o();
                }
                r a11 = this.$currentContainer.a();
                if (a11 != null && (rootView = ContextExtKt.getRootView(a11)) != null) {
                    ReturnActionModalWidgetKt.showMessage(((ReturnActionEffect.ExecuteAction) returnActionEffect).getDto().getMessage(), rootView, R$drawable.ic_check_green, UniColors.GRAPHIC_POSITIVE_PRIMARY, a11);
                }
                AtomActionDTO nextAction = ((ReturnActionEffect.ExecuteAction) returnActionEffect).getDto().getNextAction();
                if (nextAction != null && (atomAction = AtomActionMapperKt.toAtomAction(nextAction, null)) != null) {
                    this.$actionHandler.invoke(atomAction);
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ReturnActionEffect returnActionEffect, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(returnActionEffect, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1(ReturnActionModalViewModel returnActionModalViewModel, InterfaceC7851b interfaceC7851b, ViewGroup viewGroup, C4911f c4911f, Function1<? super b, Unit> function1, d<? super ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1> dVar) {
        super(2, dVar);
        this.$viewModel = returnActionModalViewModel;
        this.$controller = interfaceC7851b;
        this.$rootView = viewGroup;
        this.$currentContainer = c4911f;
        this.$actionHandler = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1(this.$viewModel, this.$controller, this.$rootView, this.$currentContainer, this.$actionHandler, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            B0<ReturnActionEffect> effects = this.$viewModel.getEffects();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$controller, this.$rootView, this.$currentContainer, this.$actionHandler, null);
            this.label = 1;
            if (C2399j.h(effects, anonymousClass1, this) == aVar) {
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
        return ((ReturnActionModalWidgetKt$ReturnActionModalWidget$1$2$6$1$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
