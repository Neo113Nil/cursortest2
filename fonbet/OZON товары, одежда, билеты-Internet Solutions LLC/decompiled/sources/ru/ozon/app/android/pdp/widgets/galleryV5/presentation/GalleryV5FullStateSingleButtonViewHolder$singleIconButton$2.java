package ru.ozon.app.android.pdp.widgets.galleryV5.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5ImageButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/galleryV5/presentation/buttons/GalleryV5ImageButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV5FullStateSingleButtonViewHolder$singleIconButton$2 extends AbstractC7737t implements Function0<GalleryV5ImageButtonView> {
    final /* synthetic */ GalleryV5FullStateSingleButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5FullStateSingleButtonViewHolder$singleIconButton$2(GalleryV5FullStateSingleButtonViewHolder galleryV5FullStateSingleButtonViewHolder) {
        super(0);
        this.this$0 = galleryV5FullStateSingleButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final GalleryV5ImageButtonView invoke() {
        GalleryV5FullStateView galleryV5FullStateView;
        GalleryV5FullStateView galleryV5FullStateView2;
        galleryV5FullStateView = this.this$0.view;
        Context context = galleryV5FullStateView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        GalleryV5ImageButtonView galleryV5ImageButtonView = new GalleryV5ImageButtonView(context, false, 2, null);
        galleryV5FullStateView2 = this.this$0.view;
        galleryV5ImageButtonView.setBackground(galleryV5FullStateView2.getPreCreationGalleryResources().getBgRoundButtons());
        return galleryV5ImageButtonView;
    }
}
