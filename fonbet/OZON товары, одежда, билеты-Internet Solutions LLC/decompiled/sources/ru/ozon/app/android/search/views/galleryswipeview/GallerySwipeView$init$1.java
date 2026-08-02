package ru.ozon.app.android.search.views.galleryswipeview;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class GallerySwipeView$init$1 extends C7735q implements Function1<Boolean, Boolean> {
    GallerySwipeView$init$1(Object obj) {
        super(1, obj, GallerySwipeView.class, "swipeToFirstImage", "swipeToFirstImage(Z)Z", 0);
    }

    public final Boolean invoke(boolean z11) {
        boolean swipeToFirstImage;
        swipeToFirstImage = ((GallerySwipeView) this.receiver).swipeToFirstImage(z11);
        return Boolean.valueOf(swipeToFirstImage);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
