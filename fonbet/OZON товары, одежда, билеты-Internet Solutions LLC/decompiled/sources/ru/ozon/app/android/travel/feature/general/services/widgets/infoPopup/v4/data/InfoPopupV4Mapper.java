package ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data;

import android.content.Context;
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
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data.InfoPopupV4DTO;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.InfoPopupV4VO;
import ru.ozon.app.android.travel.molecules.dto.copyInput.CopyInputDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.copyInput.CopyInputVO;
import ru.ozon.app.android.travel.molecules.view.textInfoCells.TextInfoCellVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004*\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\r\u001a\u00020\u0010*\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$TextInfoCells;", "Lru/ozon/app/android/travel/molecules/view/textInfoCells/TextInfoCellVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$TextInfoCells;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO$CellBlockDTO;)Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4VO$CellBlockVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InfoPopupV4Mapper implements Function2<InfoPopupV4DTO, d, List<? extends InfoPopupV4VO>> {

    @NotNull
    private final Context context;

    public InfoPopupV4Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final List<TextInfoCellVO> toVO(InfoPopupV4DTO.TextInfoCells textInfoCells) {
        List<TextInfoCellDTO> cells = textInfoCells.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            arrayList.add(MapperExtKt.toVO((TextInfoCellDTO) it.next()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InfoPopupV4VO> invoke(@NotNull InfoPopupV4DTO state, @NotNull d widgetInfo) {
        List<TextInfoCellVO> list;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        boolean isImageOutline = state.isImageOutline();
        ImageDTO image = state.getImage();
        InfoPopupV4DTO.TextInfoCells textInfoCells = state.getTextInfoCells();
        if (textInfoCells == null || (list = toVO(textInfoCells)) == null) {
            list = K.f71697a;
        }
        List<TextInfoCellVO> list2 = list;
        InfoPopupV4DTO.CellBlockDTO cellBlock = state.getCellBlock();
        List<CellDTO> cells = cellBlock != null ? cellBlock.getCells() : null;
        boolean z11 = true ^ (cells == null || cells.isEmpty());
        InfoPopupV4VO.CellBlockVO vo = toVO(state.getCellBlock());
        CopyInputDTO copyInput = state.getCopyInput();
        CopyInputVO vo2 = copyInput != null ? MapperExtKt.toVO(copyInput) : null;
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = state.getViewTrackingInfo();
        return C7714v.a0(new InfoPopupV4VO(hashCode, image, isImageOutline, list2, z11, vo, vo2, viewTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null, state.getDeleteServiceButton(), state.getNote(), state.getDetailsLinkBadge()));
    }

    private final InfoPopupV4VO.CellBlockVO toVO(InfoPopupV4DTO.CellBlockDTO cellBlockDTO) {
        if (cellBlockDTO == null) {
            return new InfoPopupV4VO.CellBlockVO(null, 0.0f, K.f71697a, null);
        }
        Iterator<T> it = cellBlockDTO.getCells().iterator();
        while (it.hasNext()) {
            ((CellDTO) it.next()).setTagSupported(cellBlockDTO.isHTMLParsingEnabled());
        }
        List<CellDTO> cells = cellBlockDTO.getCells();
        String backgroundColor = cellBlockDTO.getBackgroundColor();
        Integer radius = cellBlockDTO.getRadius();
        return new InfoPopupV4VO.CellBlockVO(backgroundColor, radius != null ? ResourceExtKt.toPxF(radius.intValue(), this.context) : 0.0f, cells, cellBlockDTO.getLabel());
    }
}
