package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$Action;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3WidgetViewHolder$observeActions$1", f = "CustomerContactsV3WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CustomerContactsV3WidgetViewHolder$observeActions$1 extends j implements Function2<CustomerContactsV3ViewModel.Action, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CustomerContactsV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerContactsV3WidgetViewHolder$observeActions$1(CustomerContactsV3WidgetViewHolder customerContactsV3WidgetViewHolder, d<? super CustomerContactsV3WidgetViewHolder$observeActions$1> dVar) {
        super(2, dVar);
        this.this$0 = customerContactsV3WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CustomerContactsV3WidgetViewHolder$observeActions$1 customerContactsV3WidgetViewHolder$observeActions$1 = new CustomerContactsV3WidgetViewHolder$observeActions$1(this.this$0, dVar);
        customerContactsV3WidgetViewHolder$observeActions$1.L$0 = obj;
        return customerContactsV3WidgetViewHolder$observeActions$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Function1 function1;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CustomerContactsV3ViewModel.Action action = (CustomerContactsV3ViewModel.Action) this.L$0;
        if (action instanceof CustomerContactsV3ViewModel.Action.HandleAction) {
            function1 = this.this$0.processedActionHandler;
            function1.invoke(((CustomerContactsV3ViewModel.Action.HandleAction) action).getAtomAction());
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CustomerContactsV3ViewModel.Action action, d<? super Unit> dVar) {
        return ((CustomerContactsV3WidgetViewHolder$observeActions$1) create(action, dVar)).invokeSuspend(Unit.f71690a);
    }
}
