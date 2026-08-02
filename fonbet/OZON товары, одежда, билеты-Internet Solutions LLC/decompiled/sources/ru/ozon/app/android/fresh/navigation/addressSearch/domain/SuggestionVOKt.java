package ru.ozon.app.android.fresh.navigation.addressSearch.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressResponseDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/SuggestionVO;", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO;", "navigation_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuggestionVOKt {
    @NotNull
    public static final SuggestionVO toVO(@NotNull ValidateAddressResponseDTO validateAddressResponseDTO) {
        Intrinsics.checkNotNullParameter(validateAddressResponseDTO, "<this>");
        return new SuggestionVO(validateAddressResponseDTO.getSearchText(), validateAddressResponseDTO.getErrorText(), validateAddressResponseDTO.isExact(), validateAddressResponseDTO.getAction());
    }
}
