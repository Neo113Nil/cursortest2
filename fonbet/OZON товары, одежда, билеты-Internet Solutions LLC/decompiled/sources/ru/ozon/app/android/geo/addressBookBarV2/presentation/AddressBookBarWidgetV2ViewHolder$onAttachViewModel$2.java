package ru.ozon.app.android.geo.addressBookBarV2.presentation;

import Sc.s;
import WZ.t;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.ActionAddressBookBarGeoResponse;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/ActionAddressBookBarGeoResponse;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@e(c = "ru.ozon.app.android.geo.addressBookBarV2.presentation.AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2", f = "AddressBookBarWidgetV2ViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2 extends j implements Function2<ActionAddressBookBarGeoResponse, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AddressBookBarWidgetV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2(AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder, d<? super AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2> dVar) {
        super(2, dVar);
        this.this$0 = addressBookBarWidgetV2ViewHolder;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2 addressBookBarWidgetV2ViewHolder$onAttachViewModel$2 = new AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2(this.this$0, dVar);
        addressBookBarWidgetV2ViewHolder$onAttachViewModel$2.L$0 = obj;
        return addressBookBarWidgetV2ViewHolder$onAttachViewModel$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        AddressUiInfoViewModel addressUiInfoViewModel;
        AddressUiInfoViewModel addressUiInfoViewModel2;
        ComposerReferences composerReferences;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        ActionAddressBookBarGeoResponse actionAddressBookBarGeoResponse = (ActionAddressBookBarGeoResponse) this.L$0;
        if ((actionAddressBookBarGeoResponse != null ? actionAddressBookBarGeoResponse.getTooltip() : null) == null) {
            return Unit.f71690a;
        }
        this.this$0.createPopUp(actionAddressBookBarGeoResponse);
        addressUiInfoViewModel = this.this$0.addressUiInfoViewModel;
        if (addressUiInfoViewModel.getIsTooltipTracked()) {
            return Unit.f71690a;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = actionAddressBookBarGeoResponse.getTrackingInfo();
        if (trackingInfo != null) {
            AddressBookBarV2VO boundedData = this.this$0.getBoundedData();
            t tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, boundedData != null ? new Long(boundedData.getId()) : null, null, 2, null);
            if (tokenizedEvent$default != null) {
                AddressBookBarWidgetV2ViewHolder addressBookBarWidgetV2ViewHolder = this.this$0;
                addressUiInfoViewModel2 = addressBookBarWidgetV2ViewHolder.addressUiInfoViewModel;
                addressUiInfoViewModel2.setTooltipTracked(true);
                composerReferences = addressBookBarWidgetV2ViewHolder.refs;
                TokenizedAnalyticsExtensionsKt.processViewEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent$default, null, 2, null);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ActionAddressBookBarGeoResponse actionAddressBookBarGeoResponse, d<? super Unit> dVar) {
        return ((AddressBookBarWidgetV2ViewHolder$onAttachViewModel$2) create(actionAddressBookBarGeoResponse, dVar)).invokeSuspend(Unit.f71690a);
    }
}
