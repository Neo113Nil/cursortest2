package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGallery.presentation.HotelsGalleryVO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
/* synthetic */ class HotelsGalleryWidgetViewHolder$galleryAdapter$1 extends C7735q implements Function1<HotelsGalleryVO.Photo, Unit> {
    HotelsGalleryWidgetViewHolder$galleryAdapter$1(Object obj) {
        super(1, obj, HotelsGalleryWidgetViewHolder.class, "onPhotoItemClicked", "onPhotoItemClicked(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGallery/presentation/HotelsGalleryVO$Photo;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HotelsGalleryVO.Photo photo) {
        invoke2(photo);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HotelsGalleryVO.Photo p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((HotelsGalleryWidgetViewHolder) this.receiver).onPhotoItemClicked(p02);
    }
}
