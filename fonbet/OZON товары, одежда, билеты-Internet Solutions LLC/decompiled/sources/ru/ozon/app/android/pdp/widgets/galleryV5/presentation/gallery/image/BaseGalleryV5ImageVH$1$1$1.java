package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class BaseGalleryV5ImageVH$1$1$1 extends C7735q implements Function0<Unit> {
    BaseGalleryV5ImageVH$1$1$1(Object obj) {
        super(0, obj, BaseGalleryV5ImageVH.class, "onImageClick", "onImageClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BaseGalleryV5ImageVH) this.receiver).onImageClick();
    }
}
