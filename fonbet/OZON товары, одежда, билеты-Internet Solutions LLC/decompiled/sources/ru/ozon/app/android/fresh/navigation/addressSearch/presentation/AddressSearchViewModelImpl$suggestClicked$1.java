package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressResponseDTO;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.SuggestionVO;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.SuggestionVOKt;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/SuggestionVO;", "kotlin.jvm.PlatformType", "item", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO;)Lru/ozon/app/android/fresh/navigation/addressSearch/domain/SuggestionVO;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressSearchViewModelImpl$suggestClicked$1 extends AbstractC7737t implements Function1<ValidateAddressResponseDTO, SuggestionVO> {
    public static final AddressSearchViewModelImpl$suggestClicked$1 INSTANCE = new AddressSearchViewModelImpl$suggestClicked$1();

    AddressSearchViewModelImpl$suggestClicked$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final SuggestionVO invoke(ValidateAddressResponseDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return SuggestionVOKt.toVO(item);
    }
}
