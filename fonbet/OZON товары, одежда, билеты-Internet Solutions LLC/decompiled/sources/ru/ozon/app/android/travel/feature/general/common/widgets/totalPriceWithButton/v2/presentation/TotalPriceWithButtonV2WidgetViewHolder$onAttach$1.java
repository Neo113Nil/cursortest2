package ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2WidgetViewHolder$onAttach$1", f = "TotalPriceWithButtonV2WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TotalPriceWithButtonV2WidgetViewHolder$onAttach$1 extends j implements Function2<M, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TotalPriceWithButtonV2WidgetViewHolder this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2WidgetViewHolder$onAttach$1$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7719a implements Function2<CharSequence, d<? super Unit>, Object> {
        AnonymousClass1(Object obj) {
            super(2, obj, TotalPriceWithButtonV2WidgetViewHolder.class, "updateTimerText", "updateTimerText(Ljava/lang/CharSequence;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CharSequence charSequence, d<? super Unit> dVar) {
            return TotalPriceWithButtonV2WidgetViewHolder$onAttach$1.invokeSuspend$updateTimerText((TotalPriceWithButtonV2WidgetViewHolder) this.receiver, charSequence, dVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.travel.feature.general.common.widgets.totalPriceWithButton.v2.presentation.TotalPriceWithButtonV2WidgetViewHolder$onAttach$1$2, reason: invalid class name */
    /* synthetic */ class AnonymousClass2 extends C7719a implements Function2<Boolean, d<? super Unit>, Object> {
        AnonymousClass2(Object obj) {
            super(2, obj, TotalPriceWithButtonV2WidgetViewHolder.class, "hideTimer", "hideTimer(Z)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return TotalPriceWithButtonV2WidgetViewHolder$onAttach$1.invokeSuspend$hideTimer((TotalPriceWithButtonV2WidgetViewHolder) this.receiver, z11, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalPriceWithButtonV2WidgetViewHolder$onAttach$1(TotalPriceWithButtonV2WidgetViewHolder totalPriceWithButtonV2WidgetViewHolder, d<? super TotalPriceWithButtonV2WidgetViewHolder$onAttach$1> dVar) {
        super(2, dVar);
        this.this$0 = totalPriceWithButtonV2WidgetViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$hideTimer(TotalPriceWithButtonV2WidgetViewHolder totalPriceWithButtonV2WidgetViewHolder, boolean z11, d dVar) {
        totalPriceWithButtonV2WidgetViewHolder.hideTimer(z11);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$updateTimerText(TotalPriceWithButtonV2WidgetViewHolder totalPriceWithButtonV2WidgetViewHolder, CharSequence charSequence, d dVar) {
        totalPriceWithButtonV2WidgetViewHolder.updateTimerText(charSequence);
        return Unit.f71690a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        TotalPriceWithButtonV2WidgetViewHolder$onAttach$1 totalPriceWithButtonV2WidgetViewHolder$onAttach$1 = new TotalPriceWithButtonV2WidgetViewHolder$onAttach$1(this.this$0, dVar);
        totalPriceWithButtonV2WidgetViewHolder$onAttach$1.L$0 = obj;
        return totalPriceWithButtonV2WidgetViewHolder$onAttach$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TotalPriceWithButtonV2ViewModel totalPriceWithButtonV2ViewModel;
        TotalPriceWithButtonV2ViewModel totalPriceWithButtonV2ViewModel2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        M m11 = (M) this.L$0;
        totalPriceWithButtonV2ViewModel = this.this$0.widgetViewModel;
        C2399j.C(new C2408n0(totalPriceWithButtonV2ViewModel.getFormattedTimeFlow(), new AnonymousClass1(this.this$0)), m11);
        totalPriceWithButtonV2ViewModel2 = this.this$0.widgetViewModel;
        C2399j.C(new C2408n0(totalPriceWithButtonV2ViewModel2.getFinishTimeFlow(), new AnonymousClass2(this.this$0)), m11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((TotalPriceWithButtonV2WidgetViewHolder$onAttach$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
