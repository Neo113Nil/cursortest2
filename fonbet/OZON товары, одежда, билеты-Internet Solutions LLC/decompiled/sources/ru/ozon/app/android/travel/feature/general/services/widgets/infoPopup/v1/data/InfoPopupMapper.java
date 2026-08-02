package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data;

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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data.InfoPopupDTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation.InfoPopupVO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO$InfoPopupImageDTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupVO$InfoPopupImageVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupDTO;Ll20/d;)Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupMapper implements Function2<InfoPopupDTO, d, List<? extends InfoPopupVO>> {
    private final InfoPopupVO.InfoPopupImageVO toVO(InfoPopupDTO.InfoPopupImageDTO infoPopupImageDTO) {
        return new InfoPopupVO.InfoPopupImageVO(infoPopupImageDTO.getSrc(), infoPopupImageDTO.getBackgroundColor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InfoPopupVO> invoke(@NotNull InfoPopupDTO dto, @NotNull d widgetInfo) {
        boolean z11;
        boolean z12;
        List list;
        List<TextInfoCellDTO> cells;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        InfoPopupDTO.InfoPopupImageDTO image = dto.getImage();
        InfoPopupVO.InfoPopupImageVO vo = image != null ? toVO(image) : null;
        InfoPopupDTO.InfoPopupImageDTO image2 = dto.getImage();
        boolean z13 = false;
        boolean z14 = true;
        if ((image2 != null ? image2.getBackgroundColor() : null) == null) {
            z11 = false;
            z13 = true;
        } else {
            z11 = false;
        }
        if (dto.getImage() == null) {
            z12 = true;
        } else {
            z12 = true;
            z14 = z11;
        }
        TextInfoCellsDTO textInfoCells = dto.getTextInfoCells();
        if (textInfoCells == null || (cells = textInfoCells.getCells()) == null) {
            list = K.f71697a;
        } else {
            List<TextInfoCellDTO> list2 = cells;
            list = new ArrayList(C7714v.z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                list.add(MapperExtKt.toVO((TextInfoCellDTO) it.next()));
            }
        }
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells2 = dto.getCells();
        if (cells2 == null) {
            cells2 = K.f71697a;
        }
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells3 = dto.getCells();
        if (cells3 == null || cells3.isEmpty()) {
            z11 = z12;
        }
        boolean z15 = z11 ^ z12;
        List<AtomDTO> buttons = dto.getButtons();
        if (buttons == null) {
            buttons = K.f71697a;
        }
        List<AtomDTO> list3 = buttons;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new InfoPopupVO(hashCode, vo, z13, z14, list, cells2, z15, list3, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
