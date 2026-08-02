package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.taglist.common.TagListOnboardingViewModel;
import ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv.ScrollingTagListV3ViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.platform.viewutils.RecycledViewPoolViewNullifier;
import ru.ozon.app.android.storefront.domain.onboarding.CommonOnboardingRepository;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/rv/ScrollingTagListV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollingTagListV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ScrollingTagListV3ViewHolder> {
    final /* synthetic */ ScrollingTagListV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingTagListV3ViewMapper$holderProducer$1(ScrollingTagListV3ViewMapper scrollingTagListV3ViewMapper) {
        super(2);
        this.this$0 = scrollingTagListV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ScrollingTagListV3ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FeatureChecker featureChecker = this.this$0.component().featureChecker();
        RecycledViewPoolViewNullifier recycledViewPoolViewNullifier = this.this$0.component().recycledViewPoolViewNullifier();
        CommonOnboardingRepository onboardingRepository = this.this$0.component().onboardingRepository();
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final ScrollingTagListV3ViewMapper scrollingTagListV3ViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.ScrollingTagListV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TagListOnboardingViewModel tagListOnboardingViewModel = ScrollingTagListV3ViewMapper.this.component().onboardingViewModel().get();
                Intrinsics.g(tagListOnboardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tagListOnboardingViewModel;
            }
        }).a(TagListOnboardingViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new ScrollingTagListV3ViewHolder(view, featureChecker, refs, recycledViewPoolViewNullifier, onboardingRepository, (BaseOnBoardingViewModel) a12, this.this$0.component().deeplinkHandlersCache(), this.this$0.component().routeFactory(), this.this$0.component().customActionHandlersStoreFactory(), this.this$0.component().getAppType());
    }
}
