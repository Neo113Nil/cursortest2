package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation;

import Ae.B0;
import Ae.InterfaceC2397i;
import Sc.C4005g;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.view.ButtonWithInformationV2View;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationV2IsVisibleViewModel;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1", f = "ButtonWithInformationV2WidgetViewHolder.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ ButtonWithInformationV2WidgetViewHolder this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1$1", f = "ButtonWithInformationV2WidgetViewHolder.kt", l = {61}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ ButtonWithInformationV2WidgetViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ButtonWithInformationV2WidgetViewHolder buttonWithInformationV2WidgetViewHolder, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = buttonWithInformationV2WidgetViewHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ButtonWithInformationV2IsVisibleViewModel buttonWithInformationV2IsVisibleViewModel;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                buttonWithInformationV2IsVisibleViewModel = this.this$0.viewModel;
                B0<Pair<Boolean, Boolean>> isLargeButtonVisibleFlow = buttonWithInformationV2IsVisibleViewModel.isLargeButtonVisibleFlow();
                final ButtonWithInformationV2WidgetViewHolder buttonWithInformationV2WidgetViewHolder = this.this$0;
                InterfaceC2397i<? super Pair<Boolean, Boolean>> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v2.presentation.ButtonWithInformationV2WidgetViewHolder.observeWidgetVisibility.1.1.1
                    @Override // Ae.InterfaceC2397i
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                        return emit((Pair<Boolean, Boolean>) obj2, (d<? super Unit>) dVar);
                    }

                    public final Object emit(Pair<Boolean, Boolean> pair, d<? super Unit> dVar) {
                        ButtonWithInformationV2View containerView;
                        boolean booleanValue = pair.a().booleanValue();
                        boolean booleanValue2 = pair.b().booleanValue();
                        containerView = ButtonWithInformationV2WidgetViewHolder.this.getContainerView();
                        if (containerView != null) {
                            containerView.animateState(booleanValue, booleanValue2 ? new Long(0L) : null);
                        }
                        return Unit.f71690a;
                    }
                };
                this.label = 1;
                if (isLargeButtonVisibleFlow.collect(interfaceC2397i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1(ButtonWithInformationV2WidgetViewHolder buttonWithInformationV2WidgetViewHolder, d<? super ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1> dVar) {
        super(2, dVar);
        this.this$0 = buttonWithInformationV2WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ButtonWithInformationV2WidgetViewHolder buttonWithInformationV2WidgetViewHolder = this.this$0;
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(buttonWithInformationV2WidgetViewHolder, null);
            this.label = 1;
            if (C5412d0.b(buttonWithInformationV2WidgetViewHolder, bVar, anonymousClass1, this) == aVar) {
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
        return ((ButtonWithInformationV2WidgetViewHolder$observeWidgetVisibility$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
