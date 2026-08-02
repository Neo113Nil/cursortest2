package ru.ozon.app.android.regulardraw.ui.currencyBadge;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.ui.currencyBadge.MorkovskCurrencyBadgeVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"map", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO;", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeDTO;", "size", "Lru/ozon/app/android/regulardraw/ui/currencyBadge/MorkovskCurrencyBadgeVO$Size;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskCurrencyBadgeVOKt {
    @NotNull
    public static final MorkovskCurrencyBadgeVO map(@NotNull MorkovskCurrencyBadgeDTO morkovskCurrencyBadgeDTO, @NotNull MorkovskCurrencyBadgeVO.Size size) {
        Intrinsics.checkNotNullParameter(morkovskCurrencyBadgeDTO, "<this>");
        Intrinsics.checkNotNullParameter(size, "size");
        String value = morkovskCurrencyBadgeDTO.getValue();
        String image = morkovskCurrencyBadgeDTO.getImage();
        String bgColor = morkovskCurrencyBadgeDTO.getBgColor();
        String textColor = morkovskCurrencyBadgeDTO.getTextColor();
        AtomActionDTO action = morkovskCurrencyBadgeDTO.getAction();
        return new MorkovskCurrencyBadgeVO(value, image, bgColor, textColor, size, action != null ? AtomActionMapperKt.toAtomAction(action, morkovskCurrencyBadgeDTO.getTrackingInfo()) : null);
    }
}
