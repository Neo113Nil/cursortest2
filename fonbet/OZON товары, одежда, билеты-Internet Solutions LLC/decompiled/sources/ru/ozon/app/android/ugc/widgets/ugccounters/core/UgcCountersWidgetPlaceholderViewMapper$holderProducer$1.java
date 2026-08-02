package ru.ozon.app.android.ugc.widgets.ugccounters.core;

import WZ.l;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.ugc.widgets.ugccounters.onboarding.UgcCountersOnboardingViewModel;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersWidgetPlaceholderViewHolder;
import ru.ozon.app.android.video.preload.PlayerPreloader;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersWidgetPlaceholderViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class UgcCountersWidgetPlaceholderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, UgcCountersWidgetPlaceholderViewHolder> {
    final /* synthetic */ UgcCountersWidgetPlaceholderViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersWidgetPlaceholderViewMapper$holderProducer$1(UgcCountersWidgetPlaceholderViewMapper ugcCountersWidgetPlaceholderViewMapper) {
        super(2);
        this.this$0 = ugcCountersWidgetPlaceholderViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final UgcCountersWidgetPlaceholderViewHolder invoke(View view, ComposerReferences refs) {
        UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig;
        boolean z11;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        FrameLayout frameLayout = (FrameLayout) view;
        ugcCountersImagesPreCreationConfig = this.this$0.imagesPreCreationConfig;
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        UgcCountersOnboardingViewModel onboardingViewModel = this.this$0.component().getOnboardingViewModel();
        PlayerPreloader playerPreloader = this.this$0.component().getPlayerPreloader();
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter = this.this$0.component().getWidgetImagePlaceholderAdapter();
        z11 = this.this$0.hasExpandingBlock;
        return new UgcCountersWidgetPlaceholderViewHolder(frameLayout, refs, tokenizedAnalytics, onboardingViewModel, playerPreloader, ugcCountersImagesPreCreationConfig, widgetImagePlaceholderAdapter, z11);
    }
}
