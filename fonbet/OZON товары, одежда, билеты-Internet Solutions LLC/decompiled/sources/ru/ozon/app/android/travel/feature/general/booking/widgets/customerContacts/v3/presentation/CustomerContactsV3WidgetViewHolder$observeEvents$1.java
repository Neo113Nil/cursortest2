package ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation;

import Sc.o;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.i;
import ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3ViewModel;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/booking/widgets/customerContacts/v3/presentation/CustomerContactsV3ViewModel$UiEvent;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.travel.feature.general.booking.widgets.customerContacts.v3.presentation.CustomerContactsV3WidgetViewHolder$observeEvents$1", f = "CustomerContactsV3WidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CustomerContactsV3WidgetViewHolder$observeEvents$1 extends j implements Function2<CustomerContactsV3ViewModel.UiEvent, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CustomerContactsV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerContactsV3WidgetViewHolder$observeEvents$1(CustomerContactsV3WidgetViewHolder customerContactsV3WidgetViewHolder, d<? super CustomerContactsV3WidgetViewHolder$observeEvents$1> dVar) {
        super(2, dVar);
        this.this$0 = customerContactsV3WidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CustomerContactsV3WidgetViewHolder$observeEvents$1 customerContactsV3WidgetViewHolder$observeEvents$1 = new CustomerContactsV3WidgetViewHolder$observeEvents$1(this.this$0, dVar);
        customerContactsV3WidgetViewHolder$observeEvents$1.L$0 = obj;
        return customerContactsV3WidgetViewHolder$observeEvents$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        i iVar;
        i iVar2;
        i iVar3;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        CustomerContactsV3ViewModel.UiEvent uiEvent = (CustomerContactsV3ViewModel.UiEvent) this.L$0;
        if (uiEvent instanceof CustomerContactsV3ViewModel.UiEvent.NotifyPhoneNumberChanged) {
            iVar3 = this.this$0.container;
            iVar3.M().update(UpdateCustomerContactsV3PhoneNumber.m1173boximpl(UpdateCustomerContactsV3PhoneNumber.m1174constructorimpl(((CustomerContactsV3ViewModel.UiEvent.NotifyPhoneNumberChanged) uiEvent).getPhoneNumber())));
        } else if (uiEvent instanceof CustomerContactsV3ViewModel.UiEvent.NotifyEmailChanged) {
            iVar2 = this.this$0.container;
            iVar2.M().update(UpdateCustomerContactsV3Email.m1167boximpl(UpdateCustomerContactsV3Email.m1168constructorimpl(((CustomerContactsV3ViewModel.UiEvent.NotifyEmailChanged) uiEvent).getEmail())));
        } else {
            if (!(uiEvent instanceof CustomerContactsV3ViewModel.UiEvent.NotifyCheckboxStatusChanged)) {
                throw new o();
            }
            iVar = this.this$0.container;
            iVar.M().update(UpdateCustomerContactsV3CheckboxStatus.m1161boximpl(UpdateCustomerContactsV3CheckboxStatus.m1162constructorimpl(((CustomerContactsV3ViewModel.UiEvent.NotifyCheckboxStatusChanged) uiEvent).getCheckboxStatus())));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CustomerContactsV3ViewModel.UiEvent uiEvent, d<? super Unit> dVar) {
        return ((CustomerContactsV3WidgetViewHolder$observeEvents$1) create(uiEvent, dVar)).invokeSuspend(Unit.f71690a);
    }
}
