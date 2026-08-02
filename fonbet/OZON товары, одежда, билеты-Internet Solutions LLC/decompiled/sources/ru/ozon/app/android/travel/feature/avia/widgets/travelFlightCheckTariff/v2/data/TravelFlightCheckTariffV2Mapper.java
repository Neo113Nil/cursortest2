package ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.data.TravelFlightCheckTariffV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.travelFlightCheckTariff.v2.presentation.TravelFlightCheckTariffV2VO;
import ru.ozon.app.android.travel.utils.utils.CompoundTextAtomKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0010\u0010\u0015\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`\u00120\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00192\n\u0010\u0018\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010!\u001a\u00060\u001fj\u0002` 2\n\u0010\r\u001a\u00060\u001dj\u0002`\u001eH\u0002¢\u0006\u0004\b!\u0010\"J*\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010#\u001a\u00020\u00022\n\u0010%\u001a\u00060\u0003j\u0002`$H\u0096\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TariffDTO;", "dto", "", "isSelectable", "shouldMathParent", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TariffVO;", "mapTariff", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff;ZZ)Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "tariffs", "findTallestTariff", "(Ljava/util/List;)Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;", "tariff", "", "countChars", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff;)I", "countFeatures", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff$Direction;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/DirectionDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff$Direction;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/DirectionVO;", "mapDirection", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO$Tariff$Direction;)Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/presentation/TravelFlightCheckTariffV2VO$Tariff$Direction;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelFlightCheckTariff/v2/data/TravelFlightCheckTariffV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TravelFlightCheckTariffV2Mapper implements Function2<TravelFlightCheckTariffV2DTO, d, List<? extends TravelFlightCheckTariffV2VO>> {

    @NotNull
    private final Context context;

    public TravelFlightCheckTariffV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final int countChars(TravelFlightCheckTariffV2VO.Tariff tariff) {
        OzonSpannableString text;
        int i11 = 0;
        for (TravelFlightCheckTariffV2VO.Tariff.Direction direction : tariff.getDirections()) {
            TextAtom compoundRoute = direction.getCompoundRoute();
            int length = (compoundRoute == null || (text = compoundRoute.getText()) == null) ? 0 : text.length();
            Iterator<T> it = direction.getFeatures().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                i12 += ((TextAtomWithIcon) it.next()).getText().length();
            }
            i11 += length + i12;
        }
        return i11;
    }

    private final int countFeatures(TravelFlightCheckTariffV2VO.Tariff tariff) {
        Iterator<T> it = tariff.getDirections().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((TravelFlightCheckTariffV2VO.Tariff.Direction) it.next()).getFeatures().size();
        }
        return i11;
    }

    private final TravelFlightCheckTariffV2VO.Tariff findTallestTariff(List<TravelFlightCheckTariffV2VO.Tariff> tariffs) {
        TravelFlightCheckTariffV2VO.Tariff tariff = null;
        if (tariffs.size() <= 2) {
            return null;
        }
        int i11 = 0;
        int i12 = 0;
        for (TravelFlightCheckTariffV2VO.Tariff tariff2 : tariffs) {
            int countFeatures = countFeatures(tariff2);
            int countChars = countChars(tariff2);
            if (countFeatures > i11) {
                tariff = tariff2;
                i11 = countFeatures;
            } else if (countFeatures == i11 && countChars > i12) {
                tariff = tariff2;
            }
            i12 = countChars;
        }
        return tariff;
    }

    private final TravelFlightCheckTariffV2VO.Tariff.Direction mapDirection(TravelFlightCheckTariffV2DTO.Tariff.Direction dto) {
        return new TravelFlightCheckTariffV2VO.Tariff.Direction(CompoundTextAtomKt.compoundTextAtom(dto.getDirectionName(), dto.getRoute(), " ", this.context), dto.getAirlineIcon(), dto.getFeatures());
    }

    private final TravelFlightCheckTariffV2VO.Tariff mapTariff(TravelFlightCheckTariffV2DTO.Tariff dto, boolean isSelectable, boolean shouldMathParent) {
        TextAtom title = dto.getTitle();
        Price price = dto.getPrice();
        TextAtom discount = dto.getDiscount();
        Badge premiumBadge = dto.getPremiumBadge();
        AtomActionDTO selectAction = dto.getSelectAction();
        Badge badge = dto.getBadge();
        TextAtom priceLabel = dto.getPriceLabel();
        String borderColor = dto.getBorderColor();
        Integer parseColor = borderColor != null ? StyleParser.INSTANCE.parseColor(this.context, borderColor) : null;
        boolean isSelected = dto.isSelected();
        List<TravelFlightCheckTariffV2DTO.Tariff.Direction> directions = dto.getDirections();
        ArrayList arrayList = new ArrayList(C7714v.z(directions, 10));
        Iterator<T> it = directions.iterator();
        while (it.hasNext()) {
            arrayList.add(mapDirection((TravelFlightCheckTariffV2DTO.Tariff.Direction) it.next()));
        }
        return new TravelFlightCheckTariffV2VO.Tariff(title, price, discount, premiumBadge, selectAction, badge, priceLabel, parseColor, isSelected, isSelectable, shouldMathParent, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelFlightCheckTariffV2VO> invoke(@NotNull TravelFlightCheckTariffV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<TravelFlightCheckTariffV2DTO.Tariff> tariffs = state.getTariffs();
        int i11 = 0;
        boolean z11 = tariffs.size() > 1;
        boolean z12 = tariffs.size() == 1;
        List<TravelFlightCheckTariffV2DTO.Tariff> list = tariffs;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mapTariff((TravelFlightCheckTariffV2DTO.Tariff) it.next(), z11, z12));
        }
        long hashCode = widgetInfo.d().hashCode();
        boolean z13 = state.getRefreshAction() != null;
        TravelFlightCheckTariffV2VO.Tariff findTallestTariff = findTallestTariff(arrayList);
        Iterator<TravelFlightCheckTariffV2DTO.Tariff> it2 = tariffs.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            if (it2.next().isSelected()) {
                break;
            }
            i11++;
        }
        return C7714v.a0(new TravelFlightCheckTariffV2VO(hashCode, z13, arrayList, findTallestTariff, i11, state.getRefreshAction()));
    }
}
