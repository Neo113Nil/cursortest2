package ru.ozon.app.android.fresh.navigation.addressSearch.data;

import Bc.w;
import Mc.a;
import com.google.android.gms.actions.SearchIntents;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.AddressValidationRepository;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/data/AddressValidationRepositoryImpl;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/AddressValidationRepository;", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressApi;", "api", "<init>", "(Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressApi;)V", "", SearchIntents.EXTRA_QUERY, "suggest", "", "index", "Lio/reactivex/y;", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressResponseDTO;", "validateSuggestion", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/y;", "Lru/ozon/app/android/fresh/navigation/addressSearch/data/ValidateAddressApi;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressValidationRepositoryImpl implements AddressValidationRepository {

    @NotNull
    private final ValidateAddressApi api;

    public AddressValidationRepositoryImpl(@NotNull ValidateAddressApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    @Override // ru.ozon.app.android.fresh.navigation.addressSearch.domain.AddressValidationRepository
    @NotNull
    public y<ValidateAddressResponseDTO> validateSuggestion(@NotNull String query, @NotNull String suggest, int index) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(suggest, "suggest");
        w j11 = this.api.validateAddress(new ValidateAddressRequestDTO(query, suggest, index)).j(a.b());
        Intrinsics.checkNotNullExpressionValue(j11, "subscribeOn(...)");
        return j11;
    }
}
