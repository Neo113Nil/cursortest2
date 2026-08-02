package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnBoardingButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5OnBoardingButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV5FullStateSingleButtonViewHolder$onBoardingButton$2 extends AbstractC7737t implements Function0<GalleryV5OnBoardingButtonView> {
    final /* synthetic */ GalleryV5FullStateSingleButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5FullStateSingleButtonViewHolder$onBoardingButton$2(GalleryV5FullStateSingleButtonViewHolder galleryV5FullStateSingleButtonViewHolder) {
        super(0);
        this.this$0 = galleryV5FullStateSingleButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryV5OnBoardingButtonView invoke() {
        GalleryV5FullStateView galleryV5FullStateView;
        GalleryV5FullStateView galleryV5FullStateView2;
        galleryV5FullStateView = this.this$0.view;
        Context context = galleryV5FullStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        galleryV5FullStateView2 = this.this$0.view;
        return new GalleryV5OnBoardingButtonView(context, galleryV5FullStateView2.getPreCreationGalleryResources(), true);
    }
}
