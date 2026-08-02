package ru.ozon.app.android.common.serviceCarousel.core;

import A00.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.events.StoriesUpdate;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselItemVO;
import ru.ozon.app.android.common.serviceCarousel.presentation.ServiceCarouselVO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselUpdateConsumer;", "Lkotlin/Function2;", "LA00/a$J$a;", "Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "<init>", "()V", "oldVO", "Lru/ozon/app/android/common/events/StoriesUpdate;", "update", "processStoriesViewedUpdate", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;Lru/ozon/app/android/common/events/StoriesUpdate;)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "Lru/ozon/app/android/common/serviceCarousel/core/ItemViewedUpdate;", "processItemViewedUpdate", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;Lru/ozon/app/android/common/serviceCarousel/core/ItemViewedUpdate;)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "Lru/ozon/app/android/common/serviceCarousel/core/LMStateSaveUpdate;", "processLayoutManagerStateUpdate", "(Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;Lru/ozon/app/android/common/serviceCarousel/core/LMStateSaveUpdate;)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "invoke", "(LA00/a$J$a;Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;)Lru/ozon/app/android/common/serviceCarousel/presentation/ServiceCarouselVO;", "service-carousel_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServiceCarouselUpdateConsumer implements Function2<a.J.InterfaceC0007a, ServiceCarouselVO, ServiceCarouselVO> {
    private final ServiceCarouselVO processItemViewedUpdate(ServiceCarouselVO oldVO, ItemViewedUpdate update) {
        List<ServiceCarouselItemVO> items = oldVO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (ServiceCarouselItemVO serviceCarouselItemVO : items) {
            if (serviceCarouselItemVO.getId() == update.getItemId()) {
                serviceCarouselItemVO = ServiceCarouselItemVO.copy$default(serviceCarouselItemVO, 0L, null, null, null, false, null, null, null, null, null, 1007, null);
            }
            arrayList.add(serviceCarouselItemVO);
        }
        return ServiceCarouselVO.copy$default(oldVO, 0L, arrayList, null, null, false, null, false, null, null, 509, null);
    }

    private final ServiceCarouselVO processLayoutManagerStateUpdate(ServiceCarouselVO oldVO, LMStateSaveUpdate update) {
        long id2 = oldVO.getId();
        Long carouselId = update.getCarouselId();
        return (carouselId != null && id2 == carouselId.longValue()) ? ServiceCarouselVO.copy$default(oldVO, 0L, null, null, null, false, update.getLayoutManagerState(), false, null, null, 479, null) : oldVO;
    }

    private final ServiceCarouselVO processStoriesViewedUpdate(ServiceCarouselVO oldVO, StoriesUpdate update) {
        List<ServiceCarouselItemVO> items = oldVO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        boolean z11 = false;
        for (ServiceCarouselItemVO serviceCarouselItemVO : items) {
            if (serviceCarouselItemVO.getStoryId() != null && update.isStoryViewed(Long.valueOf(serviceCarouselItemVO.getStoryId().intValue()))) {
                serviceCarouselItemVO = ServiceCarouselItemVO.copy$default(serviceCarouselItemVO, 0L, null, null, null, false, null, null, null, null, null, 1007, null);
                z11 = true;
            }
            arrayList.add(serviceCarouselItemVO);
        }
        return ServiceCarouselVO.copy$default(oldVO, 0L, arrayList, null, null, z11, null, false, null, null, 493, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public ServiceCarouselVO invoke(@NotNull a.J.InterfaceC0007a update, @NotNull ServiceCarouselVO oldVO) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldVO, "oldVO");
        return update instanceof StoriesUpdate ? processStoriesViewedUpdate(oldVO, (StoriesUpdate) update) : update instanceof ItemViewedUpdate ? processItemViewedUpdate(oldVO, (ItemViewedUpdate) update) : update instanceof LMStateSaveUpdate ? processLayoutManagerStateUpdate(oldVO, (LMStateSaveUpdate) update) : update instanceof PostponedTransitionStarted ? ServiceCarouselVO.copy$default(oldVO, 0L, null, null, null, false, null, false, null, null, 495, null) : oldVO;
    }
}
