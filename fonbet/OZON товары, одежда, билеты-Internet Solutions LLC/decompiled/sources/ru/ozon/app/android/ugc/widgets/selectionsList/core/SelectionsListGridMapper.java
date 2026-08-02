package ru.ozon.app.android.ugc.widgets.selectionsList.core;

import WZ.t;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0013\u001a\u00020\u0005*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionsList/core/SelectionsListGridMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "getItemsVO", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$TileItem;", "", "voId", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "toTileItemVO", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO$SelectionsListItemDTO$TileItem;JLWZ/t;)Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListVI$SelectionsListItemVI$TileItem;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/selectionsList/data/SelectionsListDTO;Ll20/d;)Ljava/util/List;", "backgroundColor", "Ljava/lang/String;", "getBackgroundColor", "()Ljava/lang/String;", "setBackgroundColor", "(Ljava/lang/String;)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectionsListGridMapper implements Function2<SelectionsListDTO, d, List<? extends SelectionsListVI.SelectionsListItemVI.TileItem>> {
    private String backgroundColor;

    private final List<SelectionsListVI.SelectionsListItemVI.TileItem> getItemsVO(SelectionsListDTO selectionsListDTO, String str) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        List<SelectionsListDTO.SelectionsListItemDTO> items = selectionsListDTO.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof SelectionsListDTO.SelectionsListItemDTO.TileItem) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            t tVar = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            SelectionsListDTO.SelectionsListItemDTO.TileItem tileItem = (SelectionsListDTO.SelectionsListItemDTO.TileItem) obj2;
            long hashCode = (i11 + str).hashCode();
            if (i11 == 0 && (trackingInfo = selectionsListDTO.getTrackingInfo()) != null) {
                tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null);
            }
            arrayList2.add(toTileItemVO(tileItem, hashCode, tVar));
            i11 = i12;
        }
        return arrayList2;
    }

    private final SelectionsListVI.SelectionsListItemVI.TileItem toTileItemVO(SelectionsListDTO.SelectionsListItemDTO.TileItem tileItem, long j11, t tVar) {
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
        return new SelectionsListVI.SelectionsListItemVI.TileItem(j11, selectionItemCommon != null ? SelectionsListMapperKt.toVO(selectionItemCommon, j11) : null, tVar, arrayList, mediaContent, headerVO);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SelectionsListVI.SelectionsListItemVI.TileItem> invoke(@NotNull SelectionsListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.backgroundColor = state.getBackgroundColor();
        return getItemsVO(state, widgetInfo.d());
    }
}
