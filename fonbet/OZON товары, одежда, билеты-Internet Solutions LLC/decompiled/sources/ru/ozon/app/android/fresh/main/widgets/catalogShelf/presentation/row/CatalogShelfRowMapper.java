package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row;

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
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.catalogShelf.data.CatalogShelfDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0010\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;Ll20/d;)Ljava/util/List;", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfRow;J)Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowVO;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfItem;", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;", "(Lru/ozon/app/android/fresh/main/widgets/catalogShelf/data/CatalogShelfDTO$CatalogShelfSection$CatalogShelfItem;J)Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfItemVO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogShelfRowMapper implements Function2<CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow, d, List<? extends CatalogShelfRowVO>> {
    @NotNull
    public final CatalogShelfRowVO toVO(@NotNull CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow catalogShelfRow, long j11) {
        Intrinsics.checkNotNullParameter(catalogShelfRow, "<this>");
        boolean topCorners = catalogShelfRow.getTopCorners();
        boolean bottomCorners = catalogShelfRow.getBottomCorners();
        List<CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem> list = catalogShelfRow.getList();
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem) it.next(), j11));
        }
        String scrollKey = catalogShelfRow.getScrollKey();
        return new CatalogShelfRowVO(j11, scrollKey != null ? Integer.valueOf(scrollKey.hashCode()) : null, catalogShelfRow.getCatalogueTabsConnectionTag(), topCorners, bottomCorners, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CatalogShelfRowVO> invoke(@NotNull CatalogShelfDTO.CatalogShelfSection.CatalogShelfRow state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    @NotNull
    public final CatalogShelfItemVO toVO(@NotNull CatalogShelfDTO.CatalogShelfSection.CatalogShelfItem catalogShelfItem, long j11) {
        Intrinsics.checkNotNullParameter(catalogShelfItem, "<this>");
        TextAtom title = catalogShelfItem.getTitle();
        Badge soldOut = catalogShelfItem.getSoldOut();
        BadgeDTO advBadgeV2 = catalogShelfItem.getAdvBadgeV2();
        String image = catalogShelfItem.getImage();
        AtomActionDTO action = catalogShelfItem.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, catalogShelfItem.getTrackingInfo()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = catalogShelfItem.getTrackingInfo();
        return new CatalogShelfItemVO(title, soldOut, image, atomAction, advBadgeV2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }
}
