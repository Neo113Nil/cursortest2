package ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.presentation.TextInfoCellsVO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellDTO;
import ru.ozon.app.android.travel.molecules.dto.textInfoCells.TextInfoCellsDTO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/textInfoCells/data/TextInfoCellsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/services/widgets/textInfoCells/presentation/TextInfoCellsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/molecules/dto/textInfoCells/TextInfoCellsDTO;Ll20/d;)Ljava/util/List;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextInfoCellsMapper implements Function2<TextInfoCellsDTO, d, List<? extends TextInfoCellsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TextInfoCellsVO> invoke(@NotNull TextInfoCellsDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<TextInfoCellDTO> cells = dto.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            arrayList.add(MapperExtKt.toVO((TextInfoCellDTO) it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new TextInfoCellsVO(hashCode, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
