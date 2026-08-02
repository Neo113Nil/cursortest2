package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper;

import Ih.a;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.AdditionalServiceDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.BonusDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.CarriageDetailsDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.PriceBlockDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.SelectedSeatDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TariffDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectFooterDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectFooterWrapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AtomDTOHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.BlockDividerVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.BonusVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.CarriageDetailsVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.IslandVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.LineDividerVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.PriceBlockVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.RailwayServicesVOHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.RoundedCellHolder;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TravelRailwaySeatSelectFooterVO;
import ru.ozon.app.android.travel.molecules.dto.railwayServices.RailwayServicesDTO;
import ru.ozon.app.android.travel.molecules.view.railwayServices.RailwayServicesVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u0003j\u0002`\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/mapper/TravelRailwaySeatSelectFooterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterWrapper;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterWrapper;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;", "footerDTO", "", "voId", "map", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterDTO;JLl20/d;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TravelRailwaySeatSelectFooterVO;", "Landroid/content/Context;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectFooterMapper implements Function2<TravelRailwaySeatSelectFooterWrapper, d, List<? extends TravelRailwaySeatSelectFooterVO>> {

    @NotNull
    private final Context context;

    public TravelRailwaySeatSelectFooterMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static /* synthetic */ TravelRailwaySeatSelectFooterVO map$default(TravelRailwaySeatSelectFooterMapper travelRailwaySeatSelectFooterMapper, TravelRailwaySeatSelectFooterDTO travelRailwaySeatSelectFooterDTO, long j11, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = -1;
        }
        if ((i11 & 4) != 0) {
            dVar = null;
        }
        return travelRailwaySeatSelectFooterMapper.map(travelRailwaySeatSelectFooterDTO, j11, dVar);
    }

    @NotNull
    public final TravelRailwaySeatSelectFooterVO map(@NotNull TravelRailwaySeatSelectFooterDTO footerDTO, long voId, d widgetInfo) {
        List<TariffDTO> tariffs;
        PriceBlockVO vo;
        BonusVO vo2;
        CarriageDetailsVO vo3;
        RailwayServicesVO vo4;
        Intrinsics.checkNotNullParameter(footerDTO, "footerDTO");
        ArrayList arrayList = new ArrayList();
        RailwayServicesDTO services = footerDTO.getServices();
        if (services != null && (vo4 = ru.ozon.app.android.travel.molecules.mapper.MapperExtKt.toVO(services)) != null) {
            arrayList.add(new RailwayServicesVOHolder(vo4.hashCode(), vo4));
        }
        CarriageDetailsDTO carriageDetails = footerDTO.getCarriageDetails();
        if (carriageDetails != null && (vo3 = MapperExtKt.toVO(carriageDetails, widgetInfo)) != null) {
            arrayList.add(vo3);
        }
        int i11 = 0;
        int i12 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        arrayList.add(new IslandVO(IslandVO.IslandType.BOTTOM, i11, i12, defaultConstructorMarker));
        arrayList.add(BlockDividerVO.INSTANCE);
        List<AdditionalServiceDTO> additionalServices = footerDTO.getAdditionalServices();
        if (additionalServices != null) {
            if (additionalServices.isEmpty()) {
                additionalServices = null;
            }
            if (additionalServices != null) {
                List<AdditionalServiceDTO> list = additionalServices;
                ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(MapperExtKt.toVO((AdditionalServiceDTO) it.next()));
                }
                arrayList.add(new IslandVO(IslandVO.IslandType.TOP, i11, i12, defaultConstructorMarker));
                arrayList.addAll(arrayList2);
                List<TariffDTO> tariffs2 = footerDTO.getTariffs();
                if (tariffs2 != null && !tariffs2.isEmpty()) {
                    arrayList.add(LineDividerVO.INSTANCE);
                }
            }
        }
        List<TariffDTO> tariffs3 = footerDTO.getTariffs();
        if (tariffs3 != null) {
            if (tariffs3.isEmpty()) {
                tariffs3 = null;
            }
            if (tariffs3 != null) {
                List<TariffDTO> list2 = tariffs3;
                ArrayList arrayList3 = new ArrayList(C7714v.z(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(MapperExtKt.toVO((TariffDTO) it2.next()));
                }
                List<AdditionalServiceDTO> additionalServices2 = footerDTO.getAdditionalServices();
                if (additionalServices2 == null || additionalServices2.isEmpty()) {
                    arrayList.add(new IslandVO(IslandVO.IslandType.TOP, i11, i12, defaultConstructorMarker));
                }
                arrayList.addAll(arrayList3);
            }
        }
        List<AdditionalServiceDTO> additionalServices3 = footerDTO.getAdditionalServices();
        if ((additionalServices3 != null && !additionalServices3.isEmpty()) || ((tariffs = footerDTO.getTariffs()) != null && !tariffs.isEmpty())) {
            arrayList.add(new IslandVO(IslandVO.IslandType.BOTTOM, i11, i12, defaultConstructorMarker));
            arrayList.add(BlockDividerVO.INSTANCE);
        }
        CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon premiumButton = footerDTO.getPremiumButton();
        if (premiumButton != null) {
            arrayList.add(new RoundedCellHolder(premiumButton.hashCode(), premiumButton));
            arrayList.add(BlockDividerVO.INSTANCE);
        }
        TextAtom orderTitle = footerDTO.getOrderTitle();
        if (orderTitle != null) {
            arrayList.add(new IslandVO(IslandVO.IslandType.TOP, i11, i12, defaultConstructorMarker));
            arrayList.add(new AtomDTOHolder(orderTitle.hashCode(), orderTitle));
            arrayList.add(LineDividerVO.INSTANCE);
        }
        List<SelectedSeatDTO> selectedSeats = footerDTO.getSelectedSeats();
        if (selectedSeats != null) {
            if (selectedSeats.isEmpty()) {
                selectedSeats = null;
            }
            if (selectedSeats != null) {
                List<SelectedSeatDTO> list3 = selectedSeats;
                ArrayList arrayList4 = new ArrayList(C7714v.z(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(MapperExtKt.toVO((SelectedSeatDTO) it3.next()));
                }
                arrayList.addAll(arrayList4);
                arrayList.add(LineDividerVO.INSTANCE);
            }
        }
        List<PriceBlockDTO> selectedOptions = footerDTO.getSelectedOptions();
        if (selectedOptions != null) {
            if (selectedOptions.isEmpty()) {
                selectedOptions = null;
            }
            if (selectedOptions != null) {
                List<PriceBlockDTO> list4 = selectedOptions;
                ArrayList arrayList5 = new ArrayList(C7714v.z(list4, 10));
                Iterator<T> it4 = list4.iterator();
                while (it4.hasNext()) {
                    arrayList5.add(MapperExtKt.toVO((PriceBlockDTO) it4.next()));
                }
                arrayList.addAll(arrayList5);
                arrayList.add(LineDividerVO.INSTANCE);
            }
        }
        BonusDTO bonuses = footerDTO.getBonuses();
        if (bonuses != null && (vo2 = MapperExtKt.toVO(bonuses, this.context)) != null) {
            arrayList.add(vo2);
            arrayList.add(LineDividerVO.INSTANCE);
        }
        if (footerDTO.getAlternativePriceBlock() != null) {
            arrayList.add(MapperExtKt.toVO(footerDTO.getAlternativePriceBlock()));
        } else {
            PriceBlockDTO orderPrice = footerDTO.getOrderPrice();
            if (orderPrice != null && (vo = MapperExtKt.toVO(orderPrice)) != null) {
                arrayList.add(vo);
            }
        }
        if (C7714v.Z(arrayList) instanceof LineDividerVO) {
            arrayList.remove(C7714v.P(arrayList));
        }
        arrayList.add(new IslandVO(IslandVO.IslandType.BOTTOM, i11, i12, defaultConstructorMarker));
        arrayList.add(BlockDividerVO.INSTANCE);
        return new TravelRailwaySeatSelectFooterVO(voId, arrayList, footerDTO.getSeatsLeft());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelRailwaySeatSelectFooterVO> invoke(@NotNull TravelRailwaySeatSelectFooterWrapper state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(map(state.getFooter(), a.a("Footer", widgetInfo.d()), widgetInfo));
    }
}
