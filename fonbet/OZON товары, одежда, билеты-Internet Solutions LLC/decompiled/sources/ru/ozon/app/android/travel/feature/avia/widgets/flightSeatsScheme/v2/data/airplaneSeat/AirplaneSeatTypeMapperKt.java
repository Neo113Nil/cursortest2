package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.airplaneSeat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.airplaneSeat.AirplaneSeatTypeV2VI;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a6\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, d2 = {"toVo", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/airplaneSeat/AirplaneSeatTypeV2DTO;", "number", "", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "fuselageType", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/airplaneSeat/AirplaneSeatTypeV2VI$FuselageType;", "isPriceInvisible", "", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AirplaneSeatTypeMapperKt {
    @NotNull
    public static final AirplaneSeatTypeV2VI toVo(@NotNull AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO, String str, TextDTO textDTO, @NotNull AirplaneSeatTypeV2VI.FuselageType fuselageType, boolean z11) {
        Intrinsics.checkNotNullParameter(airplaneSeatTypeV2DTO, "<this>");
        Intrinsics.checkNotNullParameter(fuselageType, "fuselageType");
        return new AirplaneSeatTypeV2VI(airplaneSeatTypeV2DTO.getId(), airplaneSeatTypeV2DTO.getBackgroundColor(), airplaneSeatTypeV2DTO.isSelectable(), airplaneSeatTypeV2DTO.getText(), airplaneSeatTypeV2DTO.getSeatBackrestColor(), str, textDTO, z11, fuselageType);
    }

    public static /* synthetic */ AirplaneSeatTypeV2VI toVo$default(AirplaneSeatTypeV2DTO airplaneSeatTypeV2DTO, String str, TextDTO textDTO, AirplaneSeatTypeV2VI.FuselageType fuselageType, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            textDTO = null;
        }
        if ((i11 & 8) != 0) {
            z11 = false;
        }
        return toVo(airplaneSeatTypeV2DTO, str, textDTO, fuselageType, z11);
    }
}
