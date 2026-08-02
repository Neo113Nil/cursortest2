package ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation;

import WZ.l;
import a00.C4908c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.navigationSliderV3.presentation.adapter.NavigationSliderV3Adapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/navigationSliderV3/presentation/adapter/NavigationSliderV3Adapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationSliderV3BaseWidgetViewHolder$sliderAdapter$2 extends AbstractC7737t implements Function0<NavigationSliderV3Adapter> {
    final /* synthetic */ NavigationSliderV3BaseWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3BaseWidgetViewHolder$sliderAdapter$2(NavigationSliderV3BaseWidgetViewHolder navigationSliderV3BaseWidgetViewHolder) {
        super(0);
        this.this$0 = navigationSliderV3BaseWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NavigationSliderV3Adapter invoke() {
        ComposerReferences composerReferences;
        Function1 actionHandler;
        l lVar;
        composerReferences = this.this$0.composerReferences;
        C4908c g10 = composerReferences.getContainer().g();
        actionHandler = this.this$0.getActionHandler();
        lVar = this.this$0.tokenizedAnalytics;
        return new NavigationSliderV3Adapter(g10, actionHandler, lVar);
    }
}
