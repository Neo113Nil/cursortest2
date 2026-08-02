package ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.presentation;

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
import ru.ozon.app.android.fresh.unsorted.widgets.brandzoneCarousel.data.BrandzoneCarouselDTO;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\tH\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/data/BrandzoneCarouselDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/data/BrandzoneCarouselDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneCarouselVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/data/BrandzoneCarouselDTO$BrandzoneItemDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneItemVO;", "toItem", "(Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/data/BrandzoneCarouselDTO$BrandzoneItemDTO;J)Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/presentation/BrandzoneItemVO;", "state", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/brandzoneCarousel/data/BrandzoneCarouselDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrandzoneCarouselMapper implements Function2<BrandzoneCarouselDTO, d, List<? extends BrandzoneCarouselVO>> {
    private final BrandzoneItemVO toItem(BrandzoneCarouselDTO.BrandzoneItemDTO brandzoneItemDTO, long j11) {
        long hashCode = brandzoneItemDTO.hashCode();
        String title = brandzoneItemDTO.getTitle();
        String logo = brandzoneItemDTO.getLogo();
        String image = brandzoneItemDTO.getImage();
        Map<String, TokenizedTrackingInfo> trackingInfo = brandzoneItemDTO.getTrackingInfo();
        return new BrandzoneItemVO(hashCode, image, logo, title, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent(trackingInfo, Long.valueOf(j11), ActionType.VIEW.INSTANCE.getType()) : null, AtomActionMapperKt.toAtomAction(brandzoneItemDTO.getAction(), brandzoneItemDTO.getTrackingInfo()));
    }

    private final BrandzoneCarouselVO toVO(BrandzoneCarouselDTO brandzoneCarouselDTO, d dVar) {
        long hashCode = dVar.d().hashCode();
        List<BrandzoneCarouselDTO.BrandzoneItemDTO> items = brandzoneCarouselDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toItem((BrandzoneCarouselDTO.BrandzoneItemDTO) it.next(), hashCode));
        }
        return new BrandzoneCarouselVO(hashCode, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BrandzoneCarouselVO> invoke(@NotNull BrandzoneCarouselDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }
}
