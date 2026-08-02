package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import Ae.InterfaceC2397i;
import Ae.M0;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.model.RateItemsV2ViewState;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$observeItems$1", f = "RateItemsV2WidgetHolder.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RateItemsV2WidgetHolder$observeItems$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ RateItemsV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2WidgetHolder$observeItems$1(RateItemsV2WidgetHolder rateItemsV2WidgetHolder, d<? super RateItemsV2WidgetHolder$observeItems$1> dVar) {
        super(2, dVar);
        this.this$0 = rateItemsV2WidgetHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new RateItemsV2WidgetHolder$observeItems$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        RateItemsV2ViewModel rateItemsV2ViewModel;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            rateItemsV2ViewModel = this.this$0.viewModel;
            M0<RateItemsV2ViewState> viewState = rateItemsV2ViewModel.getViewState();
            final RateItemsV2WidgetHolder rateItemsV2WidgetHolder = this.this$0;
            InterfaceC2397i<? super RateItemsV2ViewState> interfaceC2397i = new InterfaceC2397i() { // from class: ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.RateItemsV2WidgetHolder$observeItems$1.1
                @Override // Ae.InterfaceC2397i
                public /* bridge */ /* synthetic */ Object emit(Object obj2, d dVar) {
                    return emit((RateItemsV2ViewState) obj2, (d<? super Unit>) dVar);
                }

                public final Object emit(RateItemsV2ViewState rateItemsV2ViewState, d<? super Unit> dVar) {
                    RateItemsV2View rateItemsV2View;
                    RateItemsV2View rateItemsV2View2;
                    RateItemsV2View rateItemsV2View3;
                    RateItemsV2View rateItemsV2View4;
                    if (rateItemsV2ViewState instanceof RateItemsV2ViewState.Content) {
                        rateItemsV2View2 = RateItemsV2WidgetHolder.this.rateItemsV2View;
                        if (rateItemsV2View2 != null) {
                            rateItemsV2View2.bind(((RateItemsV2ViewState.Content) rateItemsV2ViewState).getData());
                        }
                        rateItemsV2View3 = RateItemsV2WidgetHolder.this.rateItemsV2View;
                        if (rateItemsV2View3 != null) {
                            rateItemsV2View3.updateHeader(((RateItemsV2ViewState.Content) rateItemsV2ViewState).getCurrentHeader());
                        }
                        rateItemsV2View4 = RateItemsV2WidgetHolder.this.rateItemsV2View;
                        if (rateItemsV2View4 != null) {
                            rateItemsV2View4.clearSentViewedItems();
                        }
                    } else if (rateItemsV2ViewState instanceof RateItemsV2ViewState.Error) {
                        rateItemsV2View = RateItemsV2WidgetHolder.this.rateItemsV2View;
                        if (rateItemsV2View != null) {
                            rateItemsV2View.dismiss();
                        }
                    } else if (!Intrinsics.d(rateItemsV2ViewState, RateItemsV2ViewState.Idle.INSTANCE)) {
                        throw new o();
                    }
                    return Unit.f71690a;
                }
            };
            this.label = 1;
            if (viewState.collect(interfaceC2397i, this) == aVar) {
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
        return ((RateItemsV2WidgetHolder$observeItems$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
