package ru.ozon.app.android.pdp.widgets.galleryV3.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.databinding.PdpStubClassifiedGalleryV3Binding;
import ru.ozon.app.android.pdp.databinding.PdpWidgetProductGalleryV3Binding;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00070\u0001¢\u0006\u0002\b\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/databinding/PdpStubClassifiedGalleryV3Binding;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV3ViewHolder$classifiedBinding$2 extends AbstractC7737t implements Function0<PdpStubClassifiedGalleryV3Binding> {
    final /* synthetic */ GalleryV3ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV3ViewHolder$classifiedBinding$2(GalleryV3ViewHolder galleryV3ViewHolder) {
        super(0);
        this.this$0 = galleryV3ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PdpStubClassifiedGalleryV3Binding invoke() {
        PdpWidgetProductGalleryV3Binding pdpWidgetProductGalleryV3Binding;
        pdpWidgetProductGalleryV3Binding = this.this$0.binding;
        return PdpStubClassifiedGalleryV3Binding.bind(pdpWidgetProductGalleryV3Binding.classifiedStubV.inflate());
    }
}
