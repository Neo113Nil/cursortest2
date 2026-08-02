package ru.ozon.app.android.geo.addressBookBar.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.addressBookBar.mapper.AddressBookBarMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/addressBookBar/mapper/AddressBookBarMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressBookBarComponent$Companion$create$1$1$addressBookBarMapper$2 extends AbstractC7737t implements Function0<AddressBookBarMapper> {
    final /* synthetic */ AddressBookBarComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressBookBarComponent$Companion$create$1$1$addressBookBarMapper$2(AddressBookBarComponent$Companion$create$1$1 addressBookBarComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = addressBookBarComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddressBookBarMapper invoke() {
        return new AddressBookBarMapper(this.this$0.getAddressUiInfoViewModel());
    }
}
