package ru.ozon.app.android.ads.widgets.advVideoBannerV2.data;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewHolderNew;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.presentation.AdvVideoBannerV2ViewModelNew;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.video.playerV2.videoController.VideoController;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/presentation/AdvVideoBannerV2ViewHolderNew;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvVideoBannerV2NewViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AdvVideoBannerV2ViewHolderNew> {
    final /* synthetic */ AdvVideoBannerV2NewViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvVideoBannerV2NewViewMapper$holderProducer$1(AdvVideoBannerV2NewViewMapper advVideoBannerV2NewViewMapper) {
        super(2);
        this.this$0 = advVideoBannerV2NewViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AdvVideoBannerV2ViewHolderNew invoke(View view, ComposerReferences references) {
        VideoController videoController;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        videoController = this.this$0.getVideoController();
        B0 a11 = references.getViewModelOwnerProvider().a();
        final AdvVideoBannerV2NewViewMapper advVideoBannerV2NewViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2NewViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AdvVideoBannerV2ViewModelNew advVideoBannerV2ViewModelNew = AdvVideoBannerV2NewViewMapper.this.component().getViewModelProviderNew().get();
                Intrinsics.g(advVideoBannerV2ViewModelNew, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return advVideoBannerV2ViewModelNew;
            }
        }).a(AdvVideoBannerV2ViewModelNew.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new AdvVideoBannerV2ViewHolderNew(view, references, videoController, (AdvVideoBannerV2ViewModelNew) a12);
    }
}
