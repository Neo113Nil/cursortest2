package ru.ozon.app.android.checkoutcomposer.addressPartsInput.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.AddressPartsInputRepositoryImpl;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.data.api.AddressPartsInputApi;
import ru.ozon.app.android.checkoutcomposer.addressPartsInput.presentation.AddressPartsInputViewModel;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/addressPartsInput/presentation/AddressPartsInputViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AddressPartsInputComponent$Companion$create$1$1$viewModel$2 extends AbstractC7737t implements Function0<AddressPartsInputViewModel> {
    final /* synthetic */ AddressPartsInputComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressPartsInputComponent$Companion$create$1$1$viewModel$2(AddressPartsInputComponent$Companion$create$1$1 addressPartsInputComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = addressPartsInputComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AddressPartsInputViewModel invoke() {
        NetworkComponentApi networkComponentApi;
        networkComponentApi = this.this$0.networkComponentApi;
        Object create = networkComponentApi.getRetrofit().create(AddressPartsInputApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return new AddressPartsInputViewModel(new AddressPartsInputRepositoryImpl((AddressPartsInputApi) create));
    }
}
