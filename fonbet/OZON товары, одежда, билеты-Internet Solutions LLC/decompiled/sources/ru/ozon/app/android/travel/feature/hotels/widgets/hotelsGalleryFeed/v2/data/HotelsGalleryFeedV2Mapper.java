package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.data;

import Nk.a;
import WZ.x;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.data.HotelsGalleryFeedV2DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.presentation.HotelsGalleryFeedV2VI;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u0005*\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO$GalleryItem;", "widgetInfo", "", "position", "mapToVI", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO$GalleryItem;Ll20/d;I)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/presentation/HotelsGalleryFeedV2VI;", "state", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;Ll20/d;)Ljava/util/List;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsGalleryFeedV2Mapper implements Function2<HotelsGalleryFeedV2DTO, d, List<? extends HotelsGalleryFeedV2VI>> {
    /* JADX WARN: Multi-variable type inference failed */
    private final HotelsGalleryFeedV2VI mapToVI(HotelsGalleryFeedV2DTO.GalleryItem galleryItem, d dVar, int i11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Object item = galleryItem.getItem();
        if (item instanceof HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) {
            String d11 = dVar.d();
            String image = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getImage().getImage();
            CommonControlSettings common = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getCommon();
            long hashCode = (d11 + "_image_" + i11 + image + (common != null ? common.getTrackingInfo() : null)).hashCode();
            ImageDTO image2 = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getImage();
            IconDTO videoControlIcon = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getVideoControlIcon();
            boolean isLarge = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).isLarge();
            CommonControlSettings common2 = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getCommon();
            AtomAction atomAction = (common2 == null || (action = common2.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getCommon().getTrackingInfo());
            CommonControlSettings common3 = ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).getCommon();
            if (common3 != null && (trackingInfo = common3.getTrackingInfo()) != null) {
                r3 = x.d(trackingInfo, dVar);
            }
            return new HotelsGalleryFeedV2VI.GalleryImageItem(hashCode, image2, videoControlIcon, isLarge, atomAction, i11 == 0 && ((HotelsGalleryFeedV2DTO.GalleryItem.GalleryImage) galleryItem.getItem()).isLarge(), r3, false, UserVerificationMethods.USER_VERIFY_PATTERN, null);
        }
        if (!(item instanceof ButtonV3DTO)) {
            if (!(item instanceof TextDTO)) {
                throw new IllegalArgumentException(a.b("Unknown GalleryItem type: ", N.b(galleryItem.getItem().getClass()).u()));
            }
            String d12 = dVar.d();
            OzonSpannableString text = ((TextDTO) galleryItem.getItem()).getText();
            return new HotelsGalleryFeedV2VI.TagTextItem((d12 + "_text_" + i11 + ((Object) text)).hashCode(), (TextDTO) galleryItem.getItem());
        }
        String d13 = dVar.d();
        String title = ((ButtonV3DTO) galleryItem.getItem()).getTitle();
        CommonControlSettings common4 = ((ButtonV3DTO) galleryItem.getItem()).getCommon();
        r3 = common4 != null ? common4.getTrackingInfo() : null;
        return new HotelsGalleryFeedV2VI.MoreButtonItem((d13 + "_button_" + i11 + title + r3).hashCode(), (ButtonV3DTO) galleryItem.getItem());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsGalleryFeedV2VI> invoke(@NotNull HotelsGalleryFeedV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<HotelsGalleryFeedV2DTO.GalleryItem> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        int i11 = 0;
        for (Object obj : items) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapToVI((HotelsGalleryFeedV2DTO.GalleryItem) obj, widgetInfo, i11));
            i11 = i12;
        }
        return arrayList;
    }
}
