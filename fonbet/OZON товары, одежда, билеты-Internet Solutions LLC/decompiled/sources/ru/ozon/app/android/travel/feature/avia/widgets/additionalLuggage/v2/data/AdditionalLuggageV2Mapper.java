package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.avia.R$string;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateVO;
import ru.ozon.app.android.travel.utils.PriceFormatter;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J-\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J'\u0010*\u001a\u00020)2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+J+\u0010/\u001a\u0004\u0018\u00010.2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J'\u00102\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\u0002062\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J+\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00042\u0006\u0010\u001d\u001a\u00020\u00182\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002090\u0004H\u0002¢\u0006\u0004\b;\u0010<J+\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\b\u0010=\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020A2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002¢\u0006\u0004\bB\u0010CJ*\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010E\u001a\u00060\u0003j\u0002`DH\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010\rR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "<init>", "()V", "state", "mapLuggageContent", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageContent;", "item", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "mapAppBar", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$AppBarVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$Passenger;", "items", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$PassengerTabVO;", "mapPassengerTabs", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;", "", "totalPrice", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "mapActionPane", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$ActionPane;I)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$ActionPaneVO;", "passengerIndex", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "mapFlight", "(ILru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$Passenger;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$FlightVO;", "segmentIndex", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;", "segment", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageItem;", "mapLuggageItems", "(IILru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "route", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageRouteItem;", "mapRouteItem", "(IILru/ozon/uni/atoms/data/texts/TextAtom;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageRouteItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;", "baseTariff", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBaseTariffInfoItem;", "mapBaseTariffInfoItem", "(IILru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBaseTariffInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageHeaderItem;", "mapLuggageHeaderItem", "(IILru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageHeaderItem;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "info", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageInfoItem;", "mapLuggageInfoItem", "(IILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageInfoItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$LuggageItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "mapLuggageOptionItems", "(ILjava/util/List;)Ljava/util/List;", "transportation", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageTransportationItem;", "mapLuggageTransportationItem", "(IILru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageTransportationItem;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBottomItem;", "mapLuggageBottomItem", "(II)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageBottomItem;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Lru/ozon/app/android/travel/utils/PriceFormatter;", "priceFormatter", "Lru/ozon/app/android/travel/utils/PriceFormatter;", "", "currencySign", "Ljava/lang/String;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2Mapper implements Function2<AdditionalLuggageV2DTO, d, List<? extends AdditionalLuggageV2VO>>, AsyncWidgetStateMapper<AdditionalLuggageV2DTO, AdditionalLuggageV2VO.LuggageContent> {

    @NotNull
    private final PriceFormatter priceFormatter = new PriceFormatter();

    @NotNull
    private final String currencySign = StringProvider.getString(R$string.additional_luggage_v2_price);

    private final AdditionalLuggageV2VO.ActionPaneVO mapActionPane(AdditionalLuggageV2DTO.ActionPane item, int totalPrice) {
        return new AdditionalLuggageV2VO.ActionPaneVO(PriceFormatter.format$default(this.priceFormatter, Integer.valueOf(totalPrice), this.currencySign, null, false, 12, null), item.getPriceDescription(), item.getSaveButton(), item.getDetailsButton());
    }

    private final AdditionalLuggageV2VO.AppBarVO mapAppBar(AdditionalLuggageV2DTO item) {
        return new AdditionalLuggageV2VO.AppBarVO(item.getTitle(), item.getShouldFetchState(), item.getPassengers().size() > 1, mapPassengerTabs(item.getPassengers()));
    }

    private final AdditionalLuggageV2VO.LuggageBaseTariffInfoItem mapBaseTariffInfoItem(int passengerIndex, int segmentIndex, AdditionalLuggageV2DTO.BaseTariff baseTariff) {
        if (baseTariff == null) {
            return null;
        }
        return new AdditionalLuggageV2VO.LuggageBaseTariffInfoItem((passengerIndex + "-" + segmentIndex + "-" + ((Object) baseTariff.getBaseTariffTitle().getText())).hashCode(), baseTariff.getBaseTariffTitle(), baseTariff.getBaseTariffSubtitle(), baseTariff.getTextHandCarry(), baseTariff.getTextLuggage(), baseTariff.getHandCarry(), baseTariff.getLuggage());
    }

    private final AdditionalLuggageV2VO.FlightVO mapFlight(int passengerIndex, AdditionalLuggageV2DTO.Passenger item) {
        int hashCode = item.getTitle().getText().hashCode();
        List<AdditionalLuggageV2DTO.FlightSegment> flightsSegments = item.getFlightsSegments();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : flightsSegments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            C7714v.p(mapLuggageItems(passengerIndex, i11, (AdditionalLuggageV2DTO.FlightSegment) obj), arrayList);
            i11 = i12;
        }
        return new AdditionalLuggageV2VO.FlightVO(hashCode, arrayList);
    }

    private final AdditionalLuggageV2VO.LuggageBottomItem mapLuggageBottomItem(int passengerIndex, int segmentIndex) {
        return new AdditionalLuggageV2VO.LuggageBottomItem((passengerIndex + "-" + segmentIndex).hashCode());
    }

    private final AdditionalLuggageV2VO.LuggageContent mapLuggageContent(AdditionalLuggageV2DTO state) {
        EmptyStateVO vo;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = state.getPassengers().iterator();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                int i14 = 1;
                if (state.getShouldFetchState()) {
                    arrayList.add(new AdditionalLuggageV2VO.SkeletonVO(i11, i14, defaultConstructorMarker));
                } else {
                    List<AdditionalLuggageV2DTO.Passenger> passengers = state.getPassengers();
                    ArrayList arrayList2 = new ArrayList(C7714v.z(passengers, 10));
                    int i15 = 0;
                    for (Object obj : passengers) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            C7714v.O0();
                            throw null;
                        }
                        arrayList2.add(mapFlight(i15, (AdditionalLuggageV2DTO.Passenger) obj));
                        i15 = i16;
                    }
                    arrayList.addAll(arrayList2);
                }
                AdditionalLuggageV2VO.AppBarVO mapAppBar = mapAppBar(state);
                EmptyStateDTO emptyState = state.getEmptyState();
                return new AdditionalLuggageV2VO.LuggageContent(mapAppBar, arrayList, (emptyState == null || (vo = MapperExtKt.toVO(emptyState)) == null) ? null : new AdditionalLuggageV2VO.LuggageEmptyStateVO(i11, vo, i14, defaultConstructorMarker), mapActionPane(state.getActionPane(), i13), linkedHashMap, 0, i13, state.getShouldFetchState());
            }
            Object next = it.next();
            int i17 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            Iterator<T> it2 = ((AdditionalLuggageV2DTO.Passenger) next).getFlightsSegments().iterator();
            while (it2.hasNext()) {
                for (AdditionalLuggageV2DTO.LuggageItem luggageItem : ((AdditionalLuggageV2DTO.FlightSegment) it2.next()).getLuggageItems()) {
                    if (luggageItem.getCell().isSelected()) {
                        i13 += luggageItem.getPrice();
                        Set set = (Set) linkedHashMap.get(Integer.valueOf(i12));
                        if (set == null) {
                            linkedHashMap.put(Integer.valueOf(i12), e0.e(luggageItem.getLuggageItemId()));
                        } else {
                            set.add(luggageItem.getLuggageItemId());
                        }
                    }
                }
            }
            i12 = i17;
        }
    }

    private final AdditionalLuggageV2VO.LuggageHeaderItem mapLuggageHeaderItem(int passengerIndex, int segmentIndex, AdditionalLuggageV2DTO.FlightSegment segment) {
        return new AdditionalLuggageV2VO.LuggageHeaderItem((passengerIndex + "-" + segmentIndex + "-" + ((Object) segment.getAdditionalLuggageTitle().getText())).hashCode(), segment.getAdditionalLuggageTitle(), segment.getAdditionalLuggageSubtitle());
    }

    private final AdditionalLuggageV2VO.LuggageInfoItem mapLuggageInfoItem(int passengerIndex, int segmentIndex, DisclaimerAtom info) {
        return new AdditionalLuggageV2VO.LuggageInfoItem((passengerIndex + "-" + segmentIndex + "-" + ((Object) info.getBody().getText())).hashCode(), info);
    }

    private final List<AdditionalLuggageV2VO.LuggageItem> mapLuggageItems(int passengerIndex, int segmentIndex, AdditionalLuggageV2DTO.FlightSegment segment) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mapRouteItem(passengerIndex, segmentIndex, segment.getRoute()));
        AdditionalLuggageV2VO.LuggageBaseTariffInfoItem mapBaseTariffInfoItem = mapBaseTariffInfoItem(passengerIndex, segmentIndex, segment.getBaseTariff());
        if (mapBaseTariffInfoItem != null) {
            arrayList.add(mapBaseTariffInfoItem);
        }
        arrayList.add(mapLuggageHeaderItem(passengerIndex, segmentIndex, segment));
        if (segment.getNoExtraLuggageInfo() != null) {
            arrayList.add(mapLuggageInfoItem(passengerIndex, segmentIndex, segment.getNoExtraLuggageInfo()));
        } else {
            arrayList.addAll(mapLuggageOptionItems(passengerIndex, segment.getLuggageItems()));
        }
        arrayList.add(mapLuggageBottomItem(passengerIndex, segmentIndex));
        AdditionalLuggageV2VO.LuggageTransportationItem mapLuggageTransportationItem = mapLuggageTransportationItem(passengerIndex, segmentIndex, segment.getLuggageTransportation());
        if (mapLuggageTransportationItem != null) {
            arrayList.add(mapLuggageTransportationItem);
        }
        return arrayList;
    }

    private final List<AdditionalLuggageV2VO.LuggageOptionItem> mapLuggageOptionItems(int passengerIndex, List<AdditionalLuggageV2DTO.LuggageItem> items) {
        List<AdditionalLuggageV2DTO.LuggageItem> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AdditionalLuggageV2DTO.LuggageItem luggageItem : list) {
            arrayList.add(new AdditionalLuggageV2VO.LuggageOptionItem(luggageItem.getLuggageItemId().hashCode(), luggageItem.getLuggageItemId(), passengerIndex, luggageItem.getPrice(), luggageItem.getCell()));
        }
        return arrayList;
    }

    private final AdditionalLuggageV2VO.LuggageTransportationItem mapLuggageTransportationItem(int passengerIndex, int segmentIndex, DisclaimerAtom transportation) {
        if (transportation == null) {
            return null;
        }
        return new AdditionalLuggageV2VO.LuggageTransportationItem((passengerIndex + "-" + segmentIndex + "-" + ((Object) transportation.getBody().getText())).hashCode(), transportation);
    }

    private final List<AdditionalLuggageV2VO.PassengerTabVO> mapPassengerTabs(List<AdditionalLuggageV2DTO.Passenger> items) {
        boolean z11;
        List<AdditionalLuggageV2DTO.Passenger> list = items;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AdditionalLuggageV2DTO.Passenger passenger = (AdditionalLuggageV2DTO.Passenger) obj;
            List<AdditionalLuggageV2DTO.FlightSegment> flightsSegments = passenger.getFlightsSegments();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = flightsSegments.iterator();
            while (it.hasNext()) {
                C7714v.p(((AdditionalLuggageV2DTO.FlightSegment) it.next()).getLuggageItems(), arrayList2);
            }
            boolean z12 = true;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    if (((AdditionalLuggageV2DTO.LuggageItem) it2.next()).getCell().isSelected()) {
                        z11 = true;
                        break;
                    }
                }
            }
            z11 = false;
            String obj2 = passenger.getTitle().getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj2, "toString(...)");
            TextAtom title = passenger.getTitle();
            if (i11 != 0) {
                z12 = false;
            }
            arrayList.add(new AdditionalLuggageV2VO.PassengerTabVO(obj2, title, z12, z11));
            i11 = i12;
        }
        return arrayList;
    }

    private final AdditionalLuggageV2VO.LuggageRouteItem mapRouteItem(int passengerIndex, int segmentIndex, TextAtom route) {
        return new AdditionalLuggageV2VO.LuggageRouteItem((passengerIndex + "-" + segmentIndex + "-" + ((Object) route.getText())).hashCode(), route);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalLuggageV2VO> invoke(@NotNull AdditionalLuggageV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new AdditionalLuggageV2VO(widgetInfo.d().hashCode(), mapLuggageContent(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AdditionalLuggageV2VO.LuggageContent mapAsyncState(@NotNull AdditionalLuggageV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapLuggageContent(state);
    }
}
