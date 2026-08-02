package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Sc.s;
import Wc.a;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.ActionAddressBookBarGeoResponse;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$showPopup$1", f = "AddressBookBarWidgetV2ViewHolder.kt", l = {227}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AddressBookBarWidgetV2ViewHolder$showPopup$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ AddressBookBarWidgetV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookBarWidgetV2ViewHolder$showPopup$1(AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, d<? super AddressBookBarWidgetV2ViewHolder$showPopup$1> dVar) {
        super(2, dVar);
        this.this$0 = addressBookBarWidgetV2ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddressBookBarWidgetV2ViewHolder$showPopup$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        PopupWindow popupWindow;
        AddressUiInfoViewModel addressUiInfoViewModel;
        PopupWindow popupWindow2;
        RightLeftTitlesCellV2View rightLeftTitlesCellV2View;
        AddressBookBarWidgetV2ViewHolder.Companion companion;
        AddressBookBarWidgetV2ViewHolder.Companion companion2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            popupWindow = this.this$0.popup;
            if (popupWindow == null) {
                addressUiInfoViewModel = this.this$0.addressUiInfoViewModel;
                InterfaceC2395h<ActionAddressBookBarGeoResponse> actionAddressBookBarGeo = addressUiInfoViewModel.getActionAddressBookBarGeo();
                this.label = 1;
                obj = C2399j.u(actionAddressBookBarGeo, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (this.this$0.isInVisibleBounds() && popupWindow2 != null) {
                rightLeftTitlesCellV2View = this.this$0.view;
                companion = AddressBookBarWidgetV2ViewHolder.Companion;
                int popup_widget_offset = companion.getPOPUP_WIDGET_OFFSET();
                companion2 = AddressBookBarWidgetV2ViewHolder.Companion;
                popupWindow2.showAsDropDown(rightLeftTitlesCellV2View, popup_widget_offset, companion2.getPOPUP_WIDGET_OFFSET(), 0);
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ActionAddressBookBarGeoResponse actionAddressBookBarGeoResponse = (ActionAddressBookBarGeoResponse) obj;
        if (actionAddressBookBarGeoResponse != null) {
            this.this$0.createPopUp(actionAddressBookBarGeoResponse);
        }
        if (this.this$0.isInVisibleBounds()) {
            popupWindow2 = this.this$0.popup;
            rightLeftTitlesCellV2View = this.this$0.view;
            companion = AddressBookBarWidgetV2ViewHolder.Companion;
            int popup_widget_offset2 = companion.getPOPUP_WIDGET_OFFSET();
            companion2 = AddressBookBarWidgetV2ViewHolder.Companion;
            popupWindow2.showAsDropDown(rightLeftTitlesCellV2View, popup_widget_offset2, companion2.getPOPUP_WIDGET_OFFSET(), 0);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddressBookBarWidgetV2ViewHolder$showPopup$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
