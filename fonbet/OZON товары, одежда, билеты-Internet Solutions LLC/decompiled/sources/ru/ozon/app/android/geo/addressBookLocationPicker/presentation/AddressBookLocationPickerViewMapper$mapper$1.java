package ru.ozon.app.android.geo.addressBookLocationPicker.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.geo.addressBookBar.data.AddressBookBarDTO;
import ru.ozon.app.android.geo.addressBookBar.mapper.AddressBookBarsKt;
import ru.ozon.app.android.geo.addressBookBar.presentation.common.AddressBookBarVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/geo/addressBookBar/presentation/common/AddressBookBarVO;", "invoke", "(Lru/ozon/app/android/geo/addressBookBar/data/AddressBookBarDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddressBookLocationPickerViewMapper$mapper$1 extends AbstractC7737t implements Function2<AddressBookBarDTO, d, List<? extends AddressBookBarVO>> {
    public static final AddressBookLocationPickerViewMapper$mapper$1 INSTANCE = new AddressBookLocationPickerViewMapper$mapper$1();

    AddressBookLocationPickerViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<AddressBookBarVO> invoke(AddressBookBarDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(AddressBookBarsKt.toVO(dto, info.d()));
    }
}
