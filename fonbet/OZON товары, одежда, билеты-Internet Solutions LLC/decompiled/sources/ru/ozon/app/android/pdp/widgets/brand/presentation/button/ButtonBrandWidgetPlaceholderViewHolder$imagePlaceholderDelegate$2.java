package ru.ozon.app.android.pdp.widgets.brand.presentation.button;

import Sc.InterfaceC4008j;
import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/brand/presentation/button/ButtonBrandBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2 extends AbstractC7737t implements Function0<ButtonBrandBinder> {
    final /* synthetic */ WidgetImagePlaceholderAdapter $widgetImagePlaceholderAdapter;
    final /* synthetic */ ButtonBrandWidgetPlaceholderViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonBrandWidgetPlaceholderViewHolder$imagePlaceholderDelegate$2(ButtonBrandWidgetPlaceholderViewHolder buttonBrandWidgetPlaceholderViewHolder, WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter) {
        super(0);
        this.this$0 = buttonBrandWidgetPlaceholderViewHolder;
        this.$widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ButtonBrandBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        l lVar;
        ComposerReferences composerReferences;
        PDPOnBoardingViewModel pDPOnBoardingViewModel;
        interfaceC4008j = this.this$0.mainView;
        ButtonV3View buttonV3View = (ButtonV3View) interfaceC4008j.getValue();
        lVar = this.this$0.tokenizedAnalytics;
        composerReferences = this.this$0.refs;
        pDPOnBoardingViewModel = this.this$0.viewModel;
        return new ButtonBrandBinder(buttonV3View, lVar, composerReferences, pDPOnBoardingViewModel, this.$widgetImagePlaceholderAdapter, this.this$0);
    }
}
