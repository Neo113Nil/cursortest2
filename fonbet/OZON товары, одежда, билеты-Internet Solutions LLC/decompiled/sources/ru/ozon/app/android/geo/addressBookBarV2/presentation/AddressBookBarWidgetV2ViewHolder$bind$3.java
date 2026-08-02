package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "cell", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$bind$3", f = "AddressBookBarWidgetV2ViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AddressBookBarWidgetV2ViewHolder$bind$3 extends j implements Function2<AddressCell.RightLeftTitlesCell24Icon, d<? super Unit>, Object> {
    final /* synthetic */ AddressBookBarV2VO $item;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressBookBarWidgetV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookBarWidgetV2ViewHolder$bind$3(AddressBookBarV2VO addressBookBarV2VO, AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, d<? super AddressBookBarWidgetV2ViewHolder$bind$3> dVar) {
        super(2, dVar);
        this.$item = addressBookBarV2VO;
        this.this$0 = addressBookBarWidgetV2ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddressBookBarWidgetV2ViewHolder$bind$3 addressBookBarWidgetV2ViewHolder$bind$3 = new AddressBookBarWidgetV2ViewHolder$bind$3(this.$item, this.this$0, dVar);
        addressBookBarWidgetV2ViewHolder$bind$3.L$0 = obj;
        return addressBookBarWidgetV2ViewHolder$bind$3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddressCell.RightLeftTitlesCell24Icon.StyleColors styleColors;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        AddressCell.RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon = (AddressCell.RightLeftTitlesCell24Icon) this.L$0;
        AddressCell.RightLeftTitlesCell24Icon.StyleType styleType = this.$item.getCell().getStyleType();
        String name = styleType != null ? styleType.name() : null;
        Map<String, AddressCell.RightLeftTitlesCell24Icon.StyleColors> styleInfo = rightLeftTitlesCell24Icon.getStyleInfo();
        if (styleInfo == null || (styleColors = styleInfo.get(name)) == null) {
            return Unit.f71690a;
        }
        this.this$0.bindCell(rightLeftTitlesCell24Icon, (!this.$item.getSaleActive() || this.$item.getCell().getStyleType() == AddressCell.RightLeftTitlesCell24Icon.StyleType.STYLE_TYPE_CART) ? styleColors.getCommon() : styleColors.getSaleActive(), this.$item.getBackgroundColor(), this.$item.getIsEmbedded());
        this.this$0.trackViewEvent(rightLeftTitlesCell24Icon, this.$item.getId());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddressCell.RightLeftTitlesCell24Icon rightLeftTitlesCell24Icon, d<? super Unit> dVar) {
        return ((AddressBookBarWidgetV2ViewHolder$bind$3) create(rightLeftTitlesCell24Icon, dVar)).invokeSuspend(Unit.f71690a);
    }
}
