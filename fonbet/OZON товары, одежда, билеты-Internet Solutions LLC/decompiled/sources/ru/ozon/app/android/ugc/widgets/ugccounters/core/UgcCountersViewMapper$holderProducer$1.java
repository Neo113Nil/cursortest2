package ru.ozon.app.android.ugc.widgets.ugccounters.core;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersImagesPreCreationConfig;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersLlViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersRvViewHolder;
import ru.ozon.app.android.ugc.widgets.ugccounters.presentation.UgcCountersVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/view/View;", "view", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersVO;", "invoke", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/k;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class UgcCountersViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, k<UgcCountersVO>> {
    final /* synthetic */ UgcCountersViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UgcCountersViewMapper$holderProducer$1(UgcCountersViewMapper ugcCountersViewMapper) {
        super(2);
        this.this$0 = ugcCountersViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<UgcCountersVO> invoke(View view, ComposerReferences refs) {
        boolean z11;
        UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig;
        UgcCountersImagesPreCreationConfig ugcCountersImagesPreCreationConfig2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        z11 = this.this$0.hasExpandingBlock;
        if (!z11) {
            ugcCountersImagesPreCreationConfig = this.this$0.imagesPreCreationConfig;
            return new UgcCountersRvViewHolder((RecyclerView) view, refs, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getOnboardingViewModel(), this.this$0.component().getPlayerPreloader(), ugcCountersImagesPreCreationConfig, this.this$0.component().getWidgetImagePlaceholderAdapter());
        }
        LinearLayout linearLayout = (LinearLayout) view;
        ugcCountersImagesPreCreationConfig2 = this.this$0.imagesPreCreationConfig;
        return new UgcCountersLlViewHolder(linearLayout, refs, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getOnboardingViewModel(), this.this$0.component().getPlayerPreloader(), ugcCountersImagesPreCreationConfig2, this.this$0.component().getWidgetImagePlaceholderAdapter());
    }
}
