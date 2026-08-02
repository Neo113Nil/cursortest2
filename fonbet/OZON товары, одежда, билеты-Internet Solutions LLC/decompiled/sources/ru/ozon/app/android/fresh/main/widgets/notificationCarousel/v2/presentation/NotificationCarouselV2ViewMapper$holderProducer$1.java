package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.di.NotificationCarouselV2Component;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO;", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class NotificationCarouselV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, k<NotificationCarouselV2VO>> {
    final /* synthetic */ NotificationCarouselV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationCarouselV2ViewMapper$holderProducer$1(NotificationCarouselV2ViewMapper notificationCarouselV2ViewMapper) {
        super(2);
        this.this$0 = notificationCarouselV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<NotificationCarouselV2VO> invoke(View view, ComposerReferences composerReferences) {
        NotificationCarouselV2ViewModel viewModel;
        NotificationCarouselV2ViewModelFF experimentalViewModel;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        if (((NotificationCarouselV2Component) this.this$0.component()).isFeatureFlagEnabled()) {
            RecyclerView recyclerView = (RecyclerView) view;
            experimentalViewModel = this.this$0.getExperimentalViewModel(composerReferences);
            return new NotificationCarouselV2ViewHolderFF(recyclerView, experimentalViewModel, composerReferences, ((NotificationCarouselV2Component) this.this$0.component()).getTokenizedAnalytics(), ((NotificationCarouselV2Component) this.this$0.component()).getCustomActionHandlersStoreFactory());
        }
        RecyclerView recyclerView2 = (RecyclerView) view;
        viewModel = this.this$0.getViewModel(composerReferences);
        return new NotificationCarouselV2ViewHolder(recyclerView2, viewModel, composerReferences, ((NotificationCarouselV2Component) this.this$0.component()).getTokenizedAnalytics(), ((NotificationCarouselV2Component) this.this$0.component()).getCustomActionHandlersStoreFactory());
    }
}
