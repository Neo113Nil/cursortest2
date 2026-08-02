package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer;

import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.FlightSeatsSchemeV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.presentation.footer.FlightSeatsSchemeV2FooterBlockVI;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020!H\u0002J,\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FlightSeatsSchemeV2FooterMapper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "map", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/FlightSeatsSchemeV2DTO;", "removeSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$PassengerV2VI;", "item", "addSeat", "number", "", "select", "deselect", "mapPassengers", "", "items", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$PassengerV2DTO;", "defaultStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$TabStyleV2VI;", "selectedStyle", "selectedPassengerIndex", "", "mapDefaultStyle", "style", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "mapSelectedStyle", "helperSelection", "isSelected", "", "mapPassengerSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/presentation/footer/FlightSeatsSchemeV2FooterBlockVI$SelectedSeatV2VI;", "selectedSeatNumber", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeV2FooterMapper {

    @NotNull
    private final Context context;

    public FlightSeatsSchemeV2FooterMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI helperSelection(FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item, boolean isSelected) {
        FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI selectedStyle = isSelected ? item.getSelectedStyle() : item.getDefaultStyle();
        int tabBackgroundColor = selectedStyle.getTabBackgroundColor();
        int tabTextColor = selectedStyle.getTabTextColor();
        FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI selectedSeat = item.getSelectedSeat();
        return FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI.copy$default(item, 0, null, isSelected, null, tabBackgroundColor, tabTextColor, null, null, selectedSeat != null ? FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI.copy$default(selectedSeat, null, selectedStyle.getIndicatorBackgroundColor(), selectedStyle.getIndicatorTextColor(), 1, null) : null, null, null, 1739, null);
    }

    private final FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI mapDefaultStyle(FooterBlockV2DTO.TabStyleV2DTO style) {
        if (style == null) {
            return null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.context;
        String tabDefaultColor = style.getTabDefaultColor();
        UniColors uniColors = UniColors.BG_SECONDARY;
        int parseColor = styleParser.parseColor(context, tabDefaultColor, uniColors.getResId());
        Context context2 = this.context;
        String tabDefaultTextColor = style.getTabDefaultTextColor();
        UniColors uniColors2 = UniColors.TEXT_PRIMARY;
        return new FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI(parseColor, styleParser.parseColor(context2, tabDefaultTextColor, uniColors2.getResId()), styleParser.parseColor(this.context, style.getIndicatorDefaultColor(), uniColors.getResId()), styleParser.parseColor(this.context, style.getIndicatorDefaultTextColor(), uniColors2.getResId()));
    }

    private final FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI mapPassengerSeat(String selectedSeatNumber, FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI defaultStyle, FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI selectedStyle, boolean isSelected) {
        if (selectedSeatNumber != null) {
            return new FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI(selectedSeatNumber, isSelected ? selectedStyle.getIndicatorBackgroundColor() : defaultStyle.getIndicatorBackgroundColor(), isSelected ? selectedStyle.getIndicatorTextColor() : defaultStyle.getIndicatorTextColor());
        }
        return null;
    }

    private final FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI mapSelectedStyle(FooterBlockV2DTO.TabStyleV2DTO style) {
        if (style == null) {
            return null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        return new FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI(styleParser.parseColor(this.context, style.getTabSelectionColor(), UniColors.BG_PREMIUM_PRIMARY_INVERTED.getResId()), styleParser.parseColor(this.context, style.getTabSelectionTextColor(), UniColors.TEXT_PRIMARY_INVERTED.getResId()), styleParser.parseColor(this.context, style.getIndicatorSelectionColor(), UniColors.BG_PRIMARY.getResId()), styleParser.parseColor(this.context, style.getIndicatorSelectionTextColor(), UniColors.TEXT_PRIMARY.getResId()));
    }

    @NotNull
    public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI addSeat(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item, @NotNull String number) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(number, "number");
        return FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI.copy$default(item, 0, null, false, null, 0, 0, null, null, new FlightSeatsSchemeV2FooterBlockVI.SelectedSeatV2VI(number, (item.getIsSelected() ? item.getSelectedStyle() : item.getDefaultStyle()).getIndicatorBackgroundColor(), (item.getIsSelected() ? item.getSelectedStyle() : item.getDefaultStyle()).getIndicatorTextColor()), null, null, 1791, null);
    }

    @NotNull
    public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI deselect(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return helperSelection(item, false);
    }

    @NotNull
    public final FlightSeatsSchemeV2FooterBlockVI map(@NotNull FlightSeatsSchemeV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator<FooterBlockV2DTO.PassengerV2DTO> it = state.getFooterBlock().getPassengers().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().isCurrent()) {
                break;
            }
            i11++;
        }
        int max = Math.max(0, i11);
        FooterBlockV2DTO footerBlock = state.getFooterBlock();
        List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> mapPassengers = mapPassengers(state.getFooterBlock().getPassengers(), mapDefaultStyle(footerBlock.getPassengerTabStyles()), mapSelectedStyle(footerBlock.getPassengerTabStyles()), max);
        TextDTO caption = footerBlock.getCaption();
        TextDTO price = footerBlock.getPrice();
        ButtonV3DTO submitButton = footerBlock.getSubmitButton();
        CommonAtomIconDTO infoIcon = footerBlock.getInfoIcon();
        CommonControlSettings common = footerBlock.getCommon();
        return new FlightSeatsSchemeV2FooterBlockVI(mapPassengers, max, caption, price, submitButton, infoIcon, common != null ? common.toAtomAction() : null, false, footerBlock.getSkipButton() != null, footerBlock.getSkipButton(), UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    @NotNull
    public final List<FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI> mapPassengers(@NotNull List<FooterBlockV2DTO.PassengerV2DTO> items, FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI defaultStyle, FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI selectedStyle, int selectedPassengerIndex) {
        FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI tabStyleV2VI = defaultStyle;
        FlightSeatsSchemeV2FooterBlockVI.TabStyleV2VI tabStyleV2VI2 = selectedStyle;
        Intrinsics.checkNotNullParameter(items, "items");
        if (tabStyleV2VI == null || tabStyleV2VI2 == null) {
            return K.f71697a;
        }
        List<FooterBlockV2DTO.PassengerV2DTO> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FooterBlockV2DTO.PassengerV2DTO passengerV2DTO = (FooterBlockV2DTO.PassengerV2DTO) obj;
            boolean z11 = selectedPassengerIndex == i11;
            arrayList.add(new FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI(passengerV2DTO.getId(), passengerV2DTO.getName(), z11, passengerV2DTO.getShortName(), z11 ? tabStyleV2VI2.getTabBackgroundColor() : tabStyleV2VI.getTabBackgroundColor(), z11 ? tabStyleV2VI2.getTabTextColor() : tabStyleV2VI.getTabTextColor(), tabStyleV2VI, tabStyleV2VI2, mapPassengerSeat(passengerV2DTO.getSelectedSeatNumber(), tabStyleV2VI, tabStyleV2VI2, z11), passengerV2DTO.getSubtitleName(), passengerV2DTO.getPassengerSelectionTrackingInfo()));
            tabStyleV2VI = defaultStyle;
            tabStyleV2VI2 = selectedStyle;
            i11 = i12;
        }
        return arrayList;
    }

    @NotNull
    public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI removeSeat(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI.copy$default(item, 0, null, false, null, 0, 0, null, null, null, null, null, 1791, null);
    }

    @NotNull
    public final FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI select(@NotNull FlightSeatsSchemeV2FooterBlockVI.PassengerV2VI item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return helperSelection(item, true);
    }
}
