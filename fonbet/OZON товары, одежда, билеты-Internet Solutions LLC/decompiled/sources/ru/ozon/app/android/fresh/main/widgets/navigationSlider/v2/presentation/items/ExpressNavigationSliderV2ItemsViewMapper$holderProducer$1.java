package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultDelegate;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.network.abtool.FeatureChecker;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemsViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ExpressNavigationSliderV2ItemsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ExpressNavigationSliderV2ItemsViewHolder> {
    final /* synthetic */ ExpressNavigationSliderV2ItemsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressNavigationSliderV2ItemsViewMapper$holderProducer$1(ExpressNavigationSliderV2ItemsViewMapper expressNavigationSliderV2ItemsViewMapper) {
        super(2);
        this.this$0 = expressNavigationSliderV2ItemsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ExpressNavigationSliderV2ItemsViewHolder invoke(View view, ComposerReferences composerReferences) {
        AdultHandler adultHandler;
        AdultHandler adultHandler2;
        FeatureChecker featureChecker;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        adultHandler = this.this$0.getAdultHandler();
        adultHandler2 = this.this$0.getAdultHandler();
        featureChecker = this.this$0.getFeatureChecker();
        return new ExpressNavigationSliderV2ItemsViewHolder(composerReferences, tokenizedAnalytics, adultHandler, new AdultDelegate(adultHandler2, featureChecker), view);
    }
}
