package ru.ozon.app.android.checkoutgeo.address.addressUiInfoService;

import Ae.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.location.ComposerLocationRepository;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoResponse;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoResponse;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressUiInfoViewModelImpl$updateAddressCell$2 extends AbstractC7737t implements Function1<AddressUiInfoResponse, Unit> {
    final /* synthetic */ AddressUiInfoViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressUiInfoViewModelImpl$updateAddressCell$2(AddressUiInfoViewModelImpl addressUiInfoViewModelImpl) {
        super(1);
        this.this$0 = addressUiInfoViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressUiInfoResponse addressUiInfoResponse) {
        invoke2(addressUiInfoResponse);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressUiInfoResponse addressUiInfoResponse) {
        ComposerLocationRepository composerLocationRepository;
        x0 x0Var;
        x0 x0Var2;
        composerLocationRepository = this.this$0.locationRepository;
        composerLocationRepository.initLocation();
        x0Var = this.this$0._addressCellFlow;
        x0Var.setValue(addressUiInfoResponse.getAddressCell());
        x0Var2 = this.this$0._addressCellV2Flow;
        x0Var2.setValue(addressUiInfoResponse.getAddressCellV2());
    }
}
