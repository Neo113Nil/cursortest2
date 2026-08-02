package ru.ozon.app.android.ugc.core.widgets.rowList.data;

import WZ.t;
import java.util.ArrayList;
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
import ru.ozon.app.android.ugc.core.widgets.rowList.data.RowListDTO;
import ru.ozon.app.android.ugc.core.widgets.rowList.presentation.RowListItemVO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/rowList/presentation/RowListItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/rowList/data/RowListDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RowListMapper implements Function2<RowListDTO, d, List<? extends RowListItemVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RowListItemVO> invoke(@NotNull RowListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<RowListDTO.Item> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (RowListDTO.Item item : items) {
            long hashCode = item.hashCode();
            boolean isSelected = item.isSelected();
            CellDTO normal = item.getNormal();
            CellDTO selected = item.getSelected();
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            t tVar = null;
            if (trackingInfo != null) {
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList.add(new RowListItemVO(hashCode, isSelected, normal, selected, tVar));
        }
        return arrayList;
    }
}
