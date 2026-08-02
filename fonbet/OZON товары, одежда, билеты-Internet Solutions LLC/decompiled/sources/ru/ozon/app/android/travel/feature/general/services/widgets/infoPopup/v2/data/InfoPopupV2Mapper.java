package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.data.InfoPopupV2DTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.presentation.InfoPopupV2VO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.cell.IconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$Image;", "image", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "mapImage", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO$Image;)Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2VO$ImageInfo;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2DTO;Ll20/d;)Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV2Mapper implements Function2<InfoPopupV2DTO, d, List<? extends InfoPopupV2VO>> {
    private final InfoPopupV2VO.ImageInfo mapImage(InfoPopupV2DTO.Image image) {
        if (image == null) {
            return null;
        }
        String src = image.getSrc();
        String backgroundColor = image.getBackgroundColor();
        if (backgroundColor == null) {
            backgroundColor = "";
        }
        return new InfoPopupV2VO.ImageInfo(src, backgroundColor);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InfoPopupV2VO> invoke(@NotNull InfoPopupV2DTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        InfoPopupV2DTO.TextInfoCells textInfoCells = state.getTextInfoCells();
        List<TextInfoCellDTO> cells = textInfoCells != null ? textInfoCells.getCells() : null;
        List<IconTitleSubtitleCellDTO> cells2 = state.getCells();
        ArrayList arrayList2 = new ArrayList();
        IconButtonV3DTO deleteServiceButton = state.getDeleteServiceButton();
        if (deleteServiceButton != null) {
            arrayList2.add(deleteServiceButton);
        }
        List<ButtonV3DTO> buttons = state.getButtons();
        if (buttons != null) {
            arrayList2.addAll(buttons);
        }
        InfoPopupV2VO.ImageInfo mapImage = mapImage(state.getImage());
        if (cells != null) {
            List<TextInfoCellDTO> list = cells;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(MapperExtKt.toVO((TextInfoCellDTO) it.next()));
            }
        } else {
            arrayList = null;
        }
        List<IconTitleSubtitleCellDTO> list2 = cells2;
        boolean z11 = !(list2 == null || list2.isEmpty());
        if (cells2 == null) {
            cells2 = K.f71697a;
        }
        boolean z12 = !arrayList2.isEmpty();
        boolean z13 = state.getDeleteServiceButton() != null;
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new InfoPopupV2VO(hashCode, mapImage, arrayList, z11, cells2, z12, z13, arrayList2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
