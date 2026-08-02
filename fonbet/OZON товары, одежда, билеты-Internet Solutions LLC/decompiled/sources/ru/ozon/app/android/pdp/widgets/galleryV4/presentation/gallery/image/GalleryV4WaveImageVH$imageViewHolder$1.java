package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.gallery.image;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class GalleryV4WaveImageVH$imageViewHolder$1 extends C7735q implements Function1<Integer, Unit> {
    GalleryV4WaveImageVH$imageViewHolder$1(Object obj) {
        super(1, obj, GalleryV4WaveImageView.class, "bind", "bind(Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        ((GalleryV4WaveImageView) this.receiver).bind(num);
    }
}
