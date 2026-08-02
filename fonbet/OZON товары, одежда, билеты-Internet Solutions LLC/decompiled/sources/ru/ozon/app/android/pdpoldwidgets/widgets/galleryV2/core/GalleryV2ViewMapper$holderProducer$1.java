package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core;

import GZ.g;
import Ib.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdpoldwidgets.databinding.PdpWidgetProductGalleryV2Binding;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.presentation.GalleryV2ViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/presentation/GalleryV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class GalleryV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, GalleryV2ViewHolder> {
    final /* synthetic */ GalleryV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV2ViewMapper$holderProducer$1(GalleryV2ViewMapper galleryV2ViewMapper) {
        super(2);
        this.this$0 = galleryV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final GalleryV2ViewHolder invoke(View view, ComposerReferences refs) {
        a aVar;
        g gVar;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        PdpWidgetProductGalleryV2Binding bind = PdpWidgetProductGalleryV2Binding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        aVar = this.this$0.handlersInhibitor;
        Object obj = aVar.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        gVar = this.this$0.ozonRouter;
        return new GalleryV2ViewHolder(bind, refs, (HandlersInhibitor) obj, gVar);
    }
}
