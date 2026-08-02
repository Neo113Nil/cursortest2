package ru.ozon.app.android.geo.addressBookBar.mapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.address.addressUiInfoService.AddressUiInfoViewModel;
import ru.ozon.app.android.geo.addressBookBar.data.AddressBookBarDTO;
import ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/mapper/AddressBookBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "addressUiInfoViewModel", "<init>", "(Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;)V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/checkoutgeo/address/addressUiInfoService/AddressUiInfoViewModel;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookBarMapper implements Function2<AddressBookBarDTO, d, List<? extends AddressBookBarVO>> {

    @NotNull
    private final AddressUiInfoViewModel addressUiInfoViewModel;

    public AddressBookBarMapper(@NotNull AddressUiInfoViewModel addressUiInfoViewModel) {
        Intrinsics.checkNotNullParameter(addressUiInfoViewModel, "addressUiInfoViewModel");
        this.addressUiInfoViewModel = addressUiInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressBookBarVO> invoke(@NotNull AddressBookBarDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.addressUiInfoViewModel.setAddressCell(state.getAddressCell());
        return C7714v.a0(AddressBookBarsKt.toVO(state, widgetInfo.d()));
    }
}
