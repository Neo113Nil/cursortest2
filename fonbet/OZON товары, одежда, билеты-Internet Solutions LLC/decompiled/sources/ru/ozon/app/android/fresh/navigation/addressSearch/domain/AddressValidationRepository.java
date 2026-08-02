package ru.ozon.app.android.fresh.navigation.addressSearch.domain;

import com.google.android.gms.actions.SearchIntents;
import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.data.ValidateAddressResponseDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/domain/AddressValidationRepository;", "", "", SearchIntents.EXTRA_QUERY, "suggest", "", "index", "Lio/reactivex/y;", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO;", "validateSuggestion", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/y;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddressValidationRepository {
    @NotNull
    y<ValidateAddressResponseDTO> validateSuggestion(@NotNull String query, @NotNull String suggest, int index);
}
