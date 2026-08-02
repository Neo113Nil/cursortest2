package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvBannerV4PlainViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AdvBannerV4PlainViewHolder> {
    final /* synthetic */ AdvBannerV4PlainViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4PlainViewMapper$holderProducer$1(AdvBannerV4PlainViewMapper advBannerV4PlainViewMapper) {
        super(2);
        this.this$0 = advBannerV4PlainViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AdvBannerV4PlainViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final AdvBannerV4PlainViewMapper advBannerV4PlainViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AdvBannerV4PlainViewModel advBannerV4PlainViewModel = AdvBannerV4PlainViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(advBannerV4PlainViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return advBannerV4PlainViewModel;
            }
        }).a(AdvBannerV4PlainViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new AdvBannerV4PlainViewHolder((AdvBannerV4PlainView) view, references, (AdvBannerV4PlainViewModel) a11, this.this$0.component().getFeatureChecker());
    }
}
