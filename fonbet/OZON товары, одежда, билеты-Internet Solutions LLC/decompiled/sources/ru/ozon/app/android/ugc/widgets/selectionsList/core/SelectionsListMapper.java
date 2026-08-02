package ru.ozon.app.android.ugc.widgets.selectionsList.core;

import Sc.o;
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
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionItemCommon;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListDTO;
import ru.ozon.app.android.ugc.widgets.selectionsList.data.SelectionsListVI;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$TileItem;", "", "voId", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "toTileItemVO", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$TileItem;J)Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;Ll20/d;)Ljava/util/List;", "toVO", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO;J)Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI;", "", "backgroundColor", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionsListMapper implements Function2<SelectionsListDTO, d, List<? extends SelectionsListVI>> {
    private String backgroundColor;

    private final SelectionsListVI.SelectionsListItemVI.TileItem toTileItemVO(SelectionsListDTO.SelectionsListItemDTO.TileItem tileItem, long j11) {
        List<Object> footerItems = tileItem.getFooterItems();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = footerItems.iterator();
        while (it.hasNext()) {
            SelectionsListVI.TileFooterContent vo = SelectionsListMapperKt.toVO(it.next());
            if (vo != null) {
                arrayList.add(vo);
            }
        }
        SelectionsListVI.MediaContent mediaContent = new SelectionsListVI.MediaContent(tileItem.getMediaContent().getImage());
        Object header = tileItem.getHeader();
        SelectionsListVI.HeaderVO headerVO = header != null ? SelectionsListMapperKt.toHeaderVO(header, j11) : null;
        SelectionItemCommon selectionItemCommon = tileItem.getSelectionItemCommon();
        return new SelectionsListVI.SelectionsListItemVI.TileItem(j11, selectionItemCommon != null ? SelectionsListMapperKt.toVO(selectionItemCommon, j11) : null, null, arrayList, mediaContent, headerVO, 4, null);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final List<SelectionsListVI> toVO(@NotNull SelectionsListDTO selectionsListDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(selectionsListDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<SelectionsListDTO.SelectionsListItemDTO> items = selectionsListDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SelectionsListDTO.SelectionsListItemDTO) it.next(), hashCode));
        }
        ArrayList W02 = C7714v.W0(arrayList);
        SelectionsListDTO.LayoutType layout = selectionsListDTO.getLayout();
        CommonCellSettings.LayoutPadding horizontalPadding = selectionsListDTO.getHorizontalPadding();
        Map<String, TokenizedTrackingInfo> trackingInfo = selectionsListDTO.getTrackingInfo();
        return C7714v.a0(new SelectionsListVI(hashCode, W02, horizontalPadding, layout, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, null, 32, null));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SelectionsListVI> invoke(@NotNull SelectionsListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.backgroundColor = state.getBackgroundColor();
        return toVO(state, widgetInfo);
    }

    @NotNull
    public final SelectionsListVI.SelectionsListItemVI toVO(@NotNull SelectionsListDTO.SelectionsListItemDTO selectionsListItemDTO, long j11) {
        Intrinsics.checkNotNullParameter(selectionsListItemDTO, "<this>");
        if (selectionsListItemDTO instanceof SelectionsListDTO.SelectionsListItemDTO.TileItem) {
            return toTileItemVO((SelectionsListDTO.SelectionsListItemDTO.TileItem) selectionsListItemDTO, j11);
        }
        if (selectionsListItemDTO instanceof SelectionsListDTO.SelectionsListItemDTO.EmptyItem) {
            return SelectionsListMapperKt.toEmptyItemVO((SelectionsListDTO.SelectionsListItemDTO.EmptyItem) selectionsListItemDTO, j11);
        }
        throw new o();
    }
}
