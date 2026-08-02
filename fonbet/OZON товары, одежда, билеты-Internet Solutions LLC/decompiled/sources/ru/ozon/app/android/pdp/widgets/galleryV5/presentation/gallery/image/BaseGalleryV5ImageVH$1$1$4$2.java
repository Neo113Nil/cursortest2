package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BaseGalleryV5ImageVH$1$1$4$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ BaseGalleryV5ImageVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseGalleryV5ImageVH$1$1$4$2(BaseGalleryV5ImageVH baseGalleryV5ImageVH) {
        super(0);
        this.this$0 = baseGalleryV5ImageVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ImageView imageView;
        GalleryV5VO.Item.Image boundData = this.this$0.getBoundData();
        if (boundData != null) {
            imageView = this.this$0.imageView;
            ImageViewExtKt.load$default(imageView, boundData.getUrl(), null, null, null, null, false, null, 126, null);
        }
    }
}
