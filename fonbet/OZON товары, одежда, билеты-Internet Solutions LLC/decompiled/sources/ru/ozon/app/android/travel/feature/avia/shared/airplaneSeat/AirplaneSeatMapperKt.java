package ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;", "", "number", "", "topCornerRadius", "bottomCornerRadius", "Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "toVo", "(Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatDTO;Ljava/lang/String;II)Lru/ozon/app/android/travel/feature/avia/shared/airplaneSeat/AirplaneSeatVO;", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AirplaneSeatMapperKt {
    @NotNull
    public static final AirplaneSeatVO toVo(@NotNull AirplaneSeatDTO airplaneSeatDTO, String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(airplaneSeatDTO, "<this>");
        return new AirplaneSeatVO(airplaneSeatDTO.getId(), airplaneSeatDTO.getBackgroundColor(), airplaneSeatDTO.isSelectable(), i11, i12, airplaneSeatDTO.getText(), airplaneSeatDTO.getSeatBackrestColor(), str);
    }

    public static /* synthetic */ AirplaneSeatVO toVo$default(AirplaneSeatDTO airplaneSeatDTO, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = null;
        }
        if ((i13 & 2) != 0) {
            i11 = 6;
        }
        if ((i13 & 4) != 0) {
            i12 = 2;
        }
        return toVo(airplaneSeatDTO, str, i11, i12);
    }
}
