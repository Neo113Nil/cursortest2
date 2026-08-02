package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.gallery.image;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isVisible", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BaseGalleryV5ImageVH$1$1$3 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ BaseGalleryV5ImageVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseGalleryV5ImageVH$1$1$3(BaseGalleryV5ImageVH baseGalleryV5ImageVH) {
        super(1);
        this.this$0 = baseGalleryV5ImageVH;
    }

    public final void invoke(boolean z11) {
        Function1<Boolean, Unit> onGalleryElementsVisible = this.this$0.getOnGalleryElementsVisible();
        if (onGalleryElementsVisible != null) {
            onGalleryElementsVisible.invoke(Boolean.valueOf(z11));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }
}
