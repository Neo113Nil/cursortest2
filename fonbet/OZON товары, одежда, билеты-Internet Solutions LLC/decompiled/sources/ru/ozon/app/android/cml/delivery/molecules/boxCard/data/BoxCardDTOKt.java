package ru.ozon.app.android.cml.delivery.molecules.boxCard.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.common.ext.CommonControlSettingsExtKt;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toVO", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/data/BoxCardDTO;", "widgetId", "", "delivery_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoxCardDTOKt {
    @NotNull
    public static final BoxCardVO toVO(@NotNull BoxCardDTO boxCardDTO, long j11) {
        Intrinsics.checkNotNullParameter(boxCardDTO, "<this>");
        return new BoxCardVO(boxCardDTO.getId(), boxCardDTO.getImage(), boxCardDTO.getTitle(), boxCardDTO.isSelected(), boxCardDTO.getPrice(), boxCardDTO.getDescriptions(), CommonControlSettingsExtKt.atomAction$default(boxCardDTO.getCommonControlSettings(), null, 1, null), CommonControlSettingsExtKt.getTokenizedEvent(boxCardDTO.getCommonControlSettings(), Long.valueOf(j11)));
    }
}
