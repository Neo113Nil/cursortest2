package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.pdp.gallery.v3.GalleryV3VO;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class GalleryV3ViewHolder$galleryAdapter$1 extends C7735q implements Function1<GalleryV3VO.Item, Unit> {
    GalleryV3ViewHolder$galleryAdapter$1(Object obj) {
        super(1, obj, GalleryV3ViewHolder.class, "onItemClickListener", "onItemClickListener(Lru/ozon/app/android/pdp/ui/configurators/pdp/gallery/v3/GalleryV3VO$Item;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryV3VO.Item item) {
        invoke2(item);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryV3VO.Item p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((GalleryV3ViewHolder) this.receiver).onItemClickListener(p02);
    }
}
