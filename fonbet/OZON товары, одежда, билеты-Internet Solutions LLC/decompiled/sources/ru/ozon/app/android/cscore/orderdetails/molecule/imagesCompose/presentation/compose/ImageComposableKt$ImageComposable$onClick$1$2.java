package ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.compose;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.cscore.orderdetails.molecule.imagesCompose.presentation.ComposableImageVO;
import ru.ozon.app.android.gallery.GalleryActivity;
import ru.ozon.app.android.gallery.GalleryRequest;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ImageComposableKt$ImageComposable$onClick$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ComposableImageVO $item;
    final /* synthetic */ int $position;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComposableKt$ImageComposable$onClick$1$2(ComposableImageVO composableImageVO, int i11, Context context) {
        super(0);
        this.$item = composableImageVO;
        this.$position = i11;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GalleryRequest galleryRequest = new GalleryRequest(this.$item.getGalleryItems(), this.$position);
        Context context = this.$context;
        context.startActivity(GalleryActivity.INSTANCE.newIntent(context, galleryRequest));
    }
}
