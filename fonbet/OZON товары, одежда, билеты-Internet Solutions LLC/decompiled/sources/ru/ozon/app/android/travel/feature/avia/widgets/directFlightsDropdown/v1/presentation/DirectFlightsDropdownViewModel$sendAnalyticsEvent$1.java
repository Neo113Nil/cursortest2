package ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation;

import Ae.w0;
import Sc.s;
import WZ.t;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownVO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.avia.widgets.directFlightsDropdown.v1.presentation.DirectFlightsDropdownViewModel$sendAnalyticsEvent$1", f = "DirectFlightsDropdownViewModel.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class DirectFlightsDropdownViewModel$sendAnalyticsEvent$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ DirectFlightsDropdownVO.ExpandCollapseButtonVO $expandCollapseButton;
    final /* synthetic */ boolean $expanded;
    int label;
    final /* synthetic */ DirectFlightsDropdownViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectFlightsDropdownViewModel$sendAnalyticsEvent$1(boolean z11, DirectFlightsDropdownVO.ExpandCollapseButtonVO expandCollapseButtonVO, DirectFlightsDropdownViewModel directFlightsDropdownViewModel, d<? super DirectFlightsDropdownViewModel$sendAnalyticsEvent$1> dVar) {
        super(2, dVar);
        this.$expanded = z11;
        this.$expandCollapseButton = expandCollapseButtonVO;
        this.this$0 = directFlightsDropdownViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new DirectFlightsDropdownViewModel$sendAnalyticsEvent$1(this.$expanded, this.$expandCollapseButton, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t clickCollapseTracking;
        w0 w0Var;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.$expanded) {
                clickCollapseTracking = this.$expandCollapseButton.getClickExpandTracking();
                if (clickCollapseTracking == null) {
                    return Unit.f71690a;
                }
            } else {
                clickCollapseTracking = this.$expandCollapseButton.getClickCollapseTracking();
                if (clickCollapseTracking == null) {
                    return Unit.f71690a;
                }
            }
            w0Var = this.this$0._widgetAnalyticsEvents;
            this.label = 1;
            if (w0Var.emit(clickCollapseTracking, this) == aVar) {
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
        return ((DirectFlightsDropdownViewModel$sendAnalyticsEvent$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
