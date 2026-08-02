package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tileGrid2.presentation.views.galleryswipeview.view;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class GallerySwipeViewDelegate$init$1 extends C7735q implements Function1<Boolean, Boolean> {
    GallerySwipeViewDelegate$init$1(Object obj) {
        super(1, obj, GallerySwipeViewDelegate.class, "swipeToFirstImage", "swipeToFirstImage(Z)Z", 0);
    }

    public final Boolean invoke(boolean z11) {
        boolean swipeToFirstImage;
        swipeToFirstImage = ((GallerySwipeViewDelegate) this.receiver).swipeToFirstImage(z11);
        return Boolean.valueOf(swipeToFirstImage);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }
}
