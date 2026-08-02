package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersLuggageButton.presentation.PassengersLuggageButtonButtonVO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/data/PassengersLuggageButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/data/PassengersLuggageButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/presentation/PassengersLuggageButtonButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersLuggageButton/data/PassengersLuggageButtonDTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersLuggageButtonMapper implements Function2<PassengersLuggageButtonDTO, d, List<? extends PassengersLuggageButtonButtonVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersLuggageButtonButtonVO> invoke(@NotNull PassengersLuggageButtonDTO dto, @NotNull d widgetInfo) {
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = dto.getTitle();
        if (!dto.isTotalPriceVisible()) {
            title = null;
        }
        IconButtonV3DTO iconButton = dto.isTotalPriceVisible() ? dto.getIconButton() : null;
        BadgeDTO milesBadge = dto.isTotalPriceVisible() ? dto.getMilesBadge() : null;
        PriceDTO price = dto.isTotalPriceVisible() ? dto.getPrice() : null;
        ButtonV3DTO button = dto.getButton();
        TextDTO termsTitle = dto.getTermsTitle();
        if (termsTitle != null) {
            termsTitle.setTagSupported(true);
            Unit unit = Unit.f71690a;
            textDTO = termsTitle;
        } else {
            textDTO = null;
        }
        return C7714v.a0(new PassengersLuggageButtonButtonVO(hashCode, title, iconButton, milesBadge, price, button, textDTO));
    }
}
