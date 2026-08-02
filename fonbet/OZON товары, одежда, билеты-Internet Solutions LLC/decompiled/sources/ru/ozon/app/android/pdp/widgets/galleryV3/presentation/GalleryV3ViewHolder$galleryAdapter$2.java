package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class GalleryV3ViewHolder$galleryAdapter$2 extends C7719a implements Function1<GalleryV3VideoState, Unit> {
    GalleryV3ViewHolder$galleryAdapter$2(Object obj) {
        super(1, obj, GalleryV3ViewHolder.class, "updateVideoState", "updateVideoState(Lru/ozon/app/android/pdp/widgets/galleryV3/presentation/GalleryV3VideoState;)Lkotlin/Unit;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GalleryV3VideoState galleryV3VideoState) {
        invoke2(galleryV3VideoState);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GalleryV3VideoState p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((GalleryV3ViewHolder) this.receiver).updateVideoState(p02);
    }
}
