package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.data;

import WZ.t;
import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.data.HotelsGalleryFiltersDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFilters.presentation.HotelsGalleryFiltersVI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO$FiltersItem;", "widgetInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$FiltersItem;", "toItems", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO$FiltersItem;Ll20/d;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$FiltersItem;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "toStickyItems", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO$FiltersItem;Ll20/d;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/presentation/HotelsGalleryFiltersVI$StickyFiltersItem;", "state", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFilters/data/HotelsGalleryFiltersDTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFiltersMapper implements Function2<HotelsGalleryFiltersDTO, d, List<? extends HotelsGalleryFiltersVI>> {
    private final HotelsGalleryFiltersVI.FiltersItem toItems(HotelsGalleryFiltersDTO.FiltersItem filtersItem, d dVar) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        int hashCode = (filtersItem.getImage() + filtersItem.getTitle() + filtersItem.getAspect().getState()).hashCode();
        AspectDTO aspect = filtersItem.getAspect();
        String image = filtersItem.getImage();
        BadgeDTO badge = filtersItem.getBadge();
        TextDTO title = filtersItem.getTitle();
        CommonControlSettings common = filtersItem.getAspect().getCommon();
        t tVar = null;
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        CommonControlSettings common2 = filtersItem.getAspect().getCommon();
        if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
            tVar = x.d(trackingInfo, dVar);
        }
        return new HotelsGalleryFiltersVI.FiltersItem(hashCode, aspect, image, badge, title, atomAction, tVar, false, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }

    private final HotelsGalleryFiltersVI.StickyFiltersItem toStickyItems(HotelsGalleryFiltersDTO.FiltersItem filtersItem, d dVar) {
        String text = filtersItem.getTagButton().getText();
        Boolean isSelected = filtersItem.getTagButton().isSelected();
        IndicatorDTO indicator = filtersItem.getTagButton().getIndicator();
        int hashCode = (text + isSelected + (indicator != null ? indicator.getText() : null)).hashCode();
        TagButtonDTO tagButton = filtersItem.getTagButton();
        CommonControlSettings common = filtersItem.getTagButton().getCommon();
        AtomAction atomAction = common != null ? common.toAtomAction() : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = filtersItem.getTagButton().getTrackingInfo();
        return new HotelsGalleryFiltersVI.StickyFiltersItem(hashCode, tagButton, trackingInfo != null ? x.d(trackingInfo, dVar) : null, atomAction, false, 16, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsGalleryFiltersVI> invoke(@NotNull HotelsGalleryFiltersDTO state, @NotNull d widgetInfo) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<HotelsGalleryFiltersDTO.FiltersItem> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toItems((HotelsGalleryFiltersDTO.FiltersItem) it.next(), widgetInfo));
        }
        List<HotelsGalleryFiltersDTO.FiltersItem> items2 = state.getItems();
        ArrayList arrayList2 = new ArrayList(C7714v.z(items2, 10));
        Iterator<T> it2 = items2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(toStickyItems((HotelsGalleryFiltersDTO.FiltersItem) it2.next(), widgetInfo));
        }
        Iterator<T> it3 = state.getItems().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if (Intrinsics.d(((HotelsGalleryFiltersDTO.FiltersItem) obj).getTagButton().isSelected(), Boolean.TRUE)) {
                break;
            }
        }
        HotelsGalleryFiltersDTO.FiltersItem filtersItem = (HotelsGalleryFiltersDTO.FiltersItem) obj;
        TagButtonDTO tagButton = filtersItem != null ? filtersItem.getTagButton() : null;
        Iterator<T> it4 = state.getItems().iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it4.next();
            if (Intrinsics.d(((HotelsGalleryFiltersDTO.FiltersItem) obj2).getTagButton().isSelected(), Boolean.FALSE)) {
                break;
            }
        }
        HotelsGalleryFiltersDTO.FiltersItem filtersItem2 = (HotelsGalleryFiltersDTO.FiltersItem) obj2;
        TagButtonDTO tagButton2 = filtersItem2 != null ? filtersItem2.getTagButton() : null;
        Iterator<HotelsGalleryFiltersDTO.FiltersItem> it5 = state.getItems().iterator();
        int i11 = 0;
        while (true) {
            if (!it5.hasNext()) {
                i11 = -1;
                break;
            }
            if (Intrinsics.d(it5.next().getTagButton().isSelected(), Boolean.TRUE)) {
                break;
            }
            i11++;
        }
        return C7714v.a0(new HotelsGalleryFiltersVI(hashCode, arrayList, arrayList2, tagButton, tagButton2, i11));
    }
}
