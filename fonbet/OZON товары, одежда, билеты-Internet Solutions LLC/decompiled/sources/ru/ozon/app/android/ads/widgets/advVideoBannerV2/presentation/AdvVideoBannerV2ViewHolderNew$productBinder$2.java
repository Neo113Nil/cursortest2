package ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.product.preview.AdvVideoBannerV2PreviewBinderNew;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/product/preview/AdvVideoBannerV2PreviewBinderNew;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2ViewHolderNew$productBinder$2 extends AbstractC7737t implements Function0<AdvVideoBannerV2PreviewBinderNew> {
    final /* synthetic */ AdvVideoBannerV2ViewHolderNew this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2ViewHolderNew$productBinder$2(AdvVideoBannerV2ViewHolderNew advVideoBannerV2ViewHolderNew) {
        super(0);
        this.this$0 = advVideoBannerV2ViewHolderNew;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdvVideoBannerV2PreviewBinderNew invoke() {
        View view;
        ComposerReferences composerReferences;
        AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew;
        Context context = this.this$0.getContext();
        view = this.this$0.containerView;
        composerReferences = this.this$0.refs;
        advVideoBannerV2ViewModelNew = this.this$0.viewModel;
        return new AdvVideoBannerV2PreviewBinderNew(context, this.this$0, view, composerReferences, advVideoBannerV2ViewModelNew);
    }
}
