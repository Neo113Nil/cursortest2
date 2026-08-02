package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class BaseGalleryV5ViewHolder$galleryAdapter$3 extends C7735q implements Function1<Integer, Boolean> {
    BaseGalleryV5ViewHolder$galleryAdapter$3(Object obj) {
        super(1, obj, BaseGalleryV5ViewHolder.class, "isViewFullVisible", "isViewFullVisible(I)Z", 0);
    }

    public final Boolean invoke(int i11) {
        boolean isViewFullVisible;
        isViewFullVisible = ((BaseGalleryV5ViewHolder) this.receiver).isViewFullVisible(i11);
        return Boolean.valueOf(isViewFullVisible);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }
}
