package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class GalleryV5FullStateViewHolder$onGalleryElementsVisible$1 extends C7735q implements Function1<Boolean, Unit> {
    GalleryV5FullStateViewHolder$onGalleryElementsVisible$1(Object obj) {
        super(1, obj, GalleryV5FullStateViewHolder.class, "setGalleryElementsVisible", "setGalleryElementsVisible(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        ((GalleryV5FullStateViewHolder) this.receiver).setGalleryElementsVisible(z11);
    }
}
