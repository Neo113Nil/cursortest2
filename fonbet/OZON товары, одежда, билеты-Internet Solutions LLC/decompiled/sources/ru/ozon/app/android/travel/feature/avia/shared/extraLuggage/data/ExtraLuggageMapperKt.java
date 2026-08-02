package ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.shared.extraLuggage.presentation.ExtraLuggageVO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/presentation/ExtraLuggageVO;", "Lru/ozon/app/android/travel/feature/avia/shared/extraLuggage/data/ExtraLuggageDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtraLuggageMapperKt {
    @NotNull
    public static final ExtraLuggageVO toVO(@NotNull ExtraLuggageDTO extraLuggageDTO) {
        Intrinsics.checkNotNullParameter(extraLuggageDTO, "<this>");
        return new ExtraLuggageVO(extraLuggageDTO.getFlightRoute().getText().hashCode(), extraLuggageDTO.getFlightRoute(), extraLuggageDTO.getLuggageItems());
    }
}
