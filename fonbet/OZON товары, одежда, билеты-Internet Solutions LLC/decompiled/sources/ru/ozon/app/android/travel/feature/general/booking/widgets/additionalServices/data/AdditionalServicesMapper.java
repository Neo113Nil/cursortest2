package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data.AdditionalServicesDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.AdditionalServicesVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0013\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0017J7\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001cH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0019\u001a\u00020 2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0004H\u0002¢\u0006\u0004\b%\u0010&J&\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u000e¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "<init>", "()V", "state", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "mapState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO;", "", "index", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO;I)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO$TariffDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO$CellDTO$TariffDTO;I)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "", "control", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "controlAction", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "mapControl", "(Ljava/lang/Object;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "tariffs", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "mapCellType", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;Ljava/util/List;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/data/AdditionalServicesDTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesMapper implements Function2<AdditionalServicesDTO, d, List<? extends AdditionalServicesVO>>, AsyncWidgetStateMapper<AdditionalServicesDTO, AdditionalServicesVO.State> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c A[RETURN] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v17, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AdditionalServicesCellVO.CellType mapCellType(AdditionalServicesCellVO.ControlType control, List<AdditionalServicesDTO.CellDTO.TariffDTO> tariffs) {
        List<? extends AdditionalServicesTariffAspectVO> list;
        Set set;
        ?? r52;
        AdditionalServicesCellVO.ControlType.Toggle toggle = control instanceof AdditionalServicesCellVO.ControlType.Toggle ? (AdditionalServicesCellVO.ControlType.Toggle) control : null;
        if (toggle != null) {
            AtomAction action = toggle.getAction();
            AtomAction.Click click = action instanceof AtomAction.Click ? (AtomAction.Click) action : null;
            if (click != null) {
                Map<String, String> params = click.getParams();
                String str = params != null ? params.get("service") : null;
                if (str != null) {
                    set = AdditionalServicesMapperKt.ACTION_PARAMS_VALUES_TOGGLE;
                    if (!set.contains(str)) {
                        str = null;
                    }
                    if (str != null) {
                        if (tariffs != null) {
                            List<AdditionalServicesDTO.CellDTO.TariffDTO> list2 = tariffs;
                            r52 = new ArrayList(C7714v.z(list2, 10));
                            int i11 = 0;
                            for (Object obj : list2) {
                                int i12 = i11 + 1;
                                if (i11 < 0) {
                                    C7714v.O0();
                                    throw null;
                                }
                                r52.add(toVO((AdditionalServicesDTO.CellDTO.TariffDTO) obj, i11));
                                i11 = i12;
                            }
                        } else {
                            r52 = 0;
                        }
                        if (r52 == 0) {
                            r52 = K.f71697a;
                        }
                        list = AdditionalServicesCellVO.CellType.WithTariffs.m1102constructorimpl(r52);
                        if (list == null) {
                            return AdditionalServicesCellVO.CellType.WithTariffs.m1101boximpl(list);
                        }
                        return null;
                    }
                }
            }
        }
        list = null;
        if (list == null) {
        }
    }

    private final AdditionalServicesCellVO.ControlType mapControl(Object control, AtomActionDTO controlAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
        if (control instanceof ButtonV3DTO) {
            return new AdditionalServicesCellVO.ControlType.Button((ButtonV3DTO) control, false);
        }
        if (control instanceof ToggleDTO) {
            return new AdditionalServicesCellVO.ControlType.Toggle((ToggleDTO) control, AtomActionMapperKt.toAtomAction(controlAction, trackingInfo));
        }
        if (control instanceof CounterInputV2DTO) {
            return new AdditionalServicesCellVO.ControlType.Counter((CounterInputV2DTO) control, false, false);
        }
        return null;
    }

    private final AdditionalServicesVO.State.Loaded mapState(AdditionalServicesDTO state) {
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        List<AdditionalServicesDTO.CellDTO> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        int i11 = 0;
        for (Object obj : cells) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((AdditionalServicesDTO.CellDTO) obj, i11));
            i11 = i12;
        }
        return new AdditionalServicesVO.State.Loaded(title, subtitle, arrayList, state.getCellsCount(), state.getShowMoreButton(), state.getTrackingInfo());
    }

    private final AdditionalServicesCellVO toVO(AdditionalServicesDTO.CellDTO cellDTO, int i11) {
        AdditionalServicesCellVO.CellType cellType;
        AdditionalServicesCellVO.ControlType mapControl = mapControl(cellDTO.getControl(), cellDTO.getControlAction(), cellDTO.getTrackingInfo());
        TextDTO title = cellDTO.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(title);
        sb2.append(i11);
        int hashCode = sb2.toString().hashCode();
        ImageDTO image = cellDTO.getImage();
        TextDTO title2 = cellDTO.getTitle();
        IconButtonV3DTO titleInfoButton = cellDTO.getTitleInfoButton();
        TextDTO subtitle = cellDTO.getSubtitle();
        if (mapControl == null || (cellType = mapCellType(mapControl, cellDTO.getTariffs())) == null) {
            cellType = AdditionalServicesCellVO.CellType.WithoutTariffs.INSTANCE;
        }
        AdditionalServicesCellVO.CellType cellType2 = cellType;
        List<AdditionalServicesDTO.CellDTO.TariffDTO> tariffs = cellDTO.getTariffs();
        boolean z11 = !(tariffs == null || tariffs.isEmpty());
        Boolean hideSeparator = cellDTO.getHideSeparator();
        return new AdditionalServicesCellVO(hashCode, image, title2, titleInfoButton, subtitle, false, mapControl, cellType2, z11, false, hideSeparator != null ? hideSeparator.booleanValue() : false, cellDTO.getTrackingInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AdditionalServicesVO> invoke(@NotNull AdditionalServicesDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new AdditionalServicesVO(widgetInfo.d().hashCode(), mapState(state), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public AdditionalServicesVO.State.Loaded mapAsyncState(@NotNull AdditionalServicesDTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return mapState(state);
    }

    private final AdditionalServicesTariffAspectVO toVO(AdditionalServicesDTO.CellDTO.TariffDTO tariffDTO, int i11) {
        TextDTO title = tariffDTO.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(title);
        sb2.append(i11);
        return new AdditionalServicesTariffAspectVO(sb2.toString().hashCode(), tariffDTO.getAspect(), tariffDTO.getTitle(), tariffDTO.getSubtitle());
    }
}
