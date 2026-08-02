package ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation;

import Ae.B0;
import Ae.InterfaceC2397i;
import S0.A1;
import Sc.C4005g;
import Sc.s;
import WZ.l;
import WZ.t;
import Wc.a;
import androidx.compose.ui.platform.P1;
import j1.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputContentKt$TravelInputContent$2$1", f = "TravelInputContent.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TravelInputContentKt$TravelInputContent$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ r $focusRequester;
    final /* synthetic */ P1 $keyboardController;
    final /* synthetic */ l $tokenizedAnalytics;
    final /* synthetic */ TravelInputViewModel $viewModel;
    final /* synthetic */ A1<WidgetState> $widgetState$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TravelInputContentKt$TravelInputContent$2$1(r rVar, P1 p12, TravelInputViewModel travelInputViewModel, Function1<? super AtomAction, Unit> function1, A1<WidgetState> a12, l lVar, d<? super TravelInputContentKt$TravelInputContent$2$1> dVar) {
        super(2, dVar);
        this.$focusRequester = rVar;
        this.$keyboardController = p12;
        this.$viewModel = travelInputViewModel;
        this.$actionHandler = function1;
        this.$widgetState$delegate = a12;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new TravelInputContentKt$TravelInputContent$2$1(this.$focusRequester, this.$keyboardController, this.$viewModel, this.$actionHandler, this.$widgetState$delegate, this.$tokenizedAnalytics, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.$focusRequester.d();
            P1 p12 = this.$keyboardController;
            if (p12 != null) {
                p12.show();
            }
            B0<AtomAction> event = this.$viewModel.getEvent();
            final Function1<AtomAction, Unit> function1 = this.$actionHandler;
            final A1<WidgetState> a12 = this.$widgetState$delegate;
            final l lVar = this.$tokenizedAnalytics;
            InterfaceC2397i<? super AtomAction> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.travel.feature.general.main.widgets.travelInput.presentation.TravelInputContentKt$TravelInputContent$2$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((AtomAction) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(AtomAction atomAction, d<? super Unit> dVar) {
                    WidgetState TravelInputContent$lambda$0;
                    t buttonClickEvent;
                    WidgetState TravelInputContent$lambda$02;
                    TravelInputContent$lambda$0 = TravelInputContentKt.TravelInputContent$lambda$0(a12);
                    TravelInputVI data = TravelInputContent$lambda$0.getData();
                    if (data != null && (buttonClickEvent = data.getButtonClickEvent()) != null) {
                        l lVar2 = lVar;
                        TravelInputContent$lambda$02 = TravelInputContentKt.TravelInputContent$lambda$0(a12);
                        TravelInputContentKt.processButtonClickWithInput(lVar2, buttonClickEvent, TravelInputContent$lambda$02.getInputText());
                    }
                    function1.invoke(atomAction);
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (event.collect(interfaceC2397i, this) == aVar) {
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
        return ((TravelInputContentKt$TravelInputContent$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
