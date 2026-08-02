package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.FlightSeatsSchemeDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.passengers.FlightSeatsSchemePassengersBlockDTO;
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.presentation.passengers.FlightSeatsSchemePassengersBlockVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J8\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010 \u001a\u00020!H\u0002J,\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010\f\u001a\u0004\u0018\u00010$2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010&H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockMapper;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "map", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO;", "state", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/FlightSeatsSchemeDTO;", "select", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Passenger;", "item", "deselect", "addSeat", "number", "", "removeSeat", "helperSelection", "isSelected", "", "mapDefaultStyle", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$Style;", "style", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$TabStyle;", "mapSelectedStyle", "mapPassengers", "", "items", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$Passenger;", "defaultStyle", "selectedStyle", "selectedIndex", "", "mapPassengerSeat", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/presentation/passengers/FlightSeatsSchemePassengersBlockVO$SelectedSeat;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/passengers/FlightSeatsSchemePassengersBlockDTO$SelectedSeat;", "compound", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "withDestination", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemePassengersBlockMapper {

    @NotNull
    private final Context context;

    public FlightSeatsSchemePassengersBlockMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TextAtom compound(TextAtom title, TextAtom withDestination) {
        if (withDestination == null) {
            return title;
        }
        OzonSpannableString text = title.getText();
        OzonSpannableString text2 = withDestination.getText();
        SpannableStringBuilder append = new SpannableStringBuilder(text).append((CharSequence) " ").append((CharSequence) text2);
        int length = text.length() + 1;
        int length2 = text2.length() + length;
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(withDestination.getTextStyle());
        Integer parseColor = styleParser.parseColor(this.context, withDestination.getTextColor());
        if (parseTextStyle != null) {
            append.setSpan(new TextAppearanceSpan(this.context, parseTextStyle.intValue()), length, length2, 33);
        }
        if (parseColor != null) {
            append.setSpan(new ForegroundColorSpan(parseColor.intValue()), length, length2, 33);
        }
        Intrinsics.f(append);
        return TextAtom.copy$default(title, OzonSpannableStringKt.toOzonSpannableString(append), null, null, null, null, null, null, 126, null);
    }

    private final FlightSeatsSchemePassengersBlockVO.Passenger helperSelection(FlightSeatsSchemePassengersBlockVO.Passenger item, boolean isSelected) {
        FlightSeatsSchemePassengersBlockVO.Style selectedStyle = isSelected ? item.getSelectedStyle() : item.getDefaultStyle();
        int tabBackgroundColor = selectedStyle.getTabBackgroundColor();
        int tabTextColor = selectedStyle.getTabTextColor();
        FlightSeatsSchemePassengersBlockVO.SelectedSeat selectedSeat = item.getSelectedSeat();
        return FlightSeatsSchemePassengersBlockVO.Passenger.copy$default(item, 0, null, isSelected, null, tabBackgroundColor, tabTextColor, null, null, selectedSeat != null ? FlightSeatsSchemePassengersBlockVO.SelectedSeat.copy$default(selectedSeat, null, selectedStyle.getIndicatorBackgroundColor(), selectedStyle.getIndicatorTextColor(), 1, null) : null, null, 715, null);
    }

    private final FlightSeatsSchemePassengersBlockVO.Style mapDefaultStyle(FlightSeatsSchemePassengersBlockDTO.TabStyle style) {
        if (style == null) {
            return null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        return new FlightSeatsSchemePassengersBlockVO.Style(styleParser.parseColor(this.context, style.getTabDefaultColor(), UniColors.BG_SECONDARY.getResId()), styleParser.parseColor(this.context, style.getTabDefaultTextColor(), UniColors.TEXT_PRIMARY.getResId()), styleParser.parseColor(this.context, style.getIndicatorDefaultColor(), UniColors.GRAPHIC_PRIMARY.getResId()), styleParser.parseColor(this.context, style.getIndicatorDefaultTextColor(), UniColors.BG_LIGHT_KEY.getResId()));
    }

    private final FlightSeatsSchemePassengersBlockVO.SelectedSeat mapPassengerSeat(FlightSeatsSchemePassengersBlockDTO.SelectedSeat item, FlightSeatsSchemePassengersBlockVO.Style defaultStyle, FlightSeatsSchemePassengersBlockVO.Style selectedStyle, boolean isSelected) {
        if (item != null) {
            return new FlightSeatsSchemePassengersBlockVO.SelectedSeat(item.getNumber(), isSelected ? selectedStyle.getIndicatorBackgroundColor() : defaultStyle.getIndicatorBackgroundColor(), isSelected ? selectedStyle.getIndicatorTextColor() : defaultStyle.getIndicatorTextColor());
        }
        return null;
    }

    private final List<FlightSeatsSchemePassengersBlockVO.Passenger> mapPassengers(List<FlightSeatsSchemePassengersBlockDTO.Passenger> items, FlightSeatsSchemePassengersBlockVO.Style defaultStyle, FlightSeatsSchemePassengersBlockVO.Style selectedStyle, int selectedIndex) {
        FlightSeatsSchemePassengersBlockVO.Style style = defaultStyle;
        FlightSeatsSchemePassengersBlockVO.Style style2 = selectedStyle;
        if (style == null || style2 == null) {
            return K.f71697a;
        }
        List<FlightSeatsSchemePassengersBlockDTO.Passenger> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            FlightSeatsSchemePassengersBlockDTO.Passenger passenger = (FlightSeatsSchemePassengersBlockDTO.Passenger) obj;
            boolean z11 = selectedIndex == i11;
            arrayList.add(new FlightSeatsSchemePassengersBlockVO.Passenger(passenger.getId(), passenger.getName(), z11, passenger.getShortName(), z11 ? style2.getTabBackgroundColor() : style.getTabBackgroundColor(), z11 ? style2.getTabTextColor() : style.getTabTextColor(), style, style2, mapPassengerSeat(passenger.getSelectedSeat(), style, style2, z11), passenger.getPassengerSelectionTrackingInfo()));
            style = defaultStyle;
            style2 = selectedStyle;
            i11 = i12;
        }
        return arrayList;
    }

    private final FlightSeatsSchemePassengersBlockVO.Style mapSelectedStyle(FlightSeatsSchemePassengersBlockDTO.TabStyle style) {
        if (style == null) {
            return null;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        return new FlightSeatsSchemePassengersBlockVO.Style(styleParser.parseColor(this.context, style.getTabSelectionColor(), UniColors.GRAPHIC_PRIMARY.getResId()), styleParser.parseColor(this.context, style.getTabSelectionTextColor(), UniColors.BG_LIGHT_KEY.getResId()), styleParser.parseColor(this.context, style.getIndicatorSelectionColor(), UniColors.LAYER_FLOOR_1.getResId()), styleParser.parseColor(this.context, style.getIndicatorSelectionTextColor(), UniColors.TEXT_PRIMARY.getResId()));
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO.Passenger addSeat(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item, @NotNull String number) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(number, "number");
        return FlightSeatsSchemePassengersBlockVO.Passenger.copy$default(item, 0, null, false, null, 0, 0, null, null, new FlightSeatsSchemePassengersBlockVO.SelectedSeat(number, (item.getIsSelected() ? item.getSelectedStyle() : item.getDefaultStyle()).getIndicatorBackgroundColor(), (item.getIsSelected() ? item.getSelectedStyle() : item.getDefaultStyle()).getIndicatorTextColor()), null, 767, null);
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO.Passenger deselect(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return helperSelection(item, false);
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO map(@NotNull FlightSeatsSchemeDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        FlightSeatsSchemePassengersBlockDTO passengersBlock = state.getPassengersBlock();
        List<FlightSeatsSchemePassengersBlockDTO.Passenger> passengers = passengersBlock.getPassengers();
        Iterator<FlightSeatsSchemePassengersBlockDTO.Passenger> it = passengers.iterator();
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
        return new FlightSeatsSchemePassengersBlockVO(compound(passengersBlock.getTitle(), passengersBlock.getDestination()), mapPassengers(passengers, mapDefaultStyle(passengersBlock.getPassengerTabStyles()), mapSelectedStyle(passengersBlock.getPassengerTabStyles()), max), max, !passengersBlock.getHidePassengers());
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO.Passenger removeSeat(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return FlightSeatsSchemePassengersBlockVO.Passenger.copy$default(item, 0, null, false, null, 0, 0, null, null, null, null, 767, null);
    }

    @NotNull
    public final FlightSeatsSchemePassengersBlockVO.Passenger select(@NotNull FlightSeatsSchemePassengersBlockVO.Passenger item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return helperSelection(item, true);
    }
}
