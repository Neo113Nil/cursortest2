package ru.ozon.app.android.geo.addressBookBar.presentation.common;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.app.android.geo.addressBookBar.presentation.AddressBookBarDelegate;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarWidgetViewHolder$bind$1", f = "AddressBookBarWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AddressBookBarWidgetViewHolder$bind$1 extends j implements Function2<AddressCell, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressBookBarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookBarWidgetViewHolder$bind$1(AddressBookBarWidgetViewHolder addressBookBarWidgetViewHolder, d<? super AddressBookBarWidgetViewHolder$bind$1> dVar) {
        super(2, dVar);
        this.this$0 = addressBookBarWidgetViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddressBookBarWidgetViewHolder$bind$1 addressBookBarWidgetViewHolder$bind$1 = new AddressBookBarWidgetViewHolder$bind$1(this.this$0, dVar);
        addressBookBarWidgetViewHolder$bind$1.L$0 = obj;
        return addressBookBarWidgetViewHolder$bind$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddressBookBarDelegate addressBookBarDelegate;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddressCell addressCell = (AddressCell) this.L$0;
        addressBookBarDelegate = this.this$0.delegate;
        addressBookBarDelegate.bindCell(addressCell);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddressCell addressCell, d<? super Unit> dVar) {
        return ((AddressBookBarWidgetViewHolder$bind$1) create(addressCell, dVar)).invokeSuspend(Unit.f71690a);
    }
}
