package ru.ozon.app.android.pdp.widgets.sellerV7.presentation;

import Sc.InterfaceC4008j;
import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7View;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/IslandsCellBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerV7IslandsCellWidgetPlaceholderVH$imagePlaceholderDelegate$1 extends AbstractC7737t implements Function0<IslandsCellBinder> {
    final /* synthetic */ SellerV7IslandsCellWidgetPlaceholderVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerV7IslandsCellWidgetPlaceholderVH$imagePlaceholderDelegate$1(SellerV7IslandsCellWidgetPlaceholderVH sellerV7IslandsCellWidgetPlaceholderVH) {
        super(0);
        this.this$0 = sellerV7IslandsCellWidgetPlaceholderVH;
    }

    @Override // kotlin.jvm.functions.Function0
    public final IslandsCellBinder invoke() {
        InterfaceC4008j interfaceC4008j;
        ComposerReferences composerReferences;
        BaseOnBoardingViewModel baseOnBoardingViewModel;
        l lVar;
        WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;
        interfaceC4008j = this.this$0.mainView;
        SellerV7View sellerV7View = (SellerV7View) interfaceC4008j.getValue();
        composerReferences = this.this$0.refs;
        baseOnBoardingViewModel = this.this$0.onBoardingViewModel;
        lVar = this.this$0.tokenizedAnalytics;
        widgetImagePlaceholderAdapter = this.this$0.widgetImagePlaceholderAdapter;
        return new IslandsCellBinder(sellerV7View, composerReferences, lVar, baseOnBoardingViewModel, widgetImagePlaceholderAdapter, this.this$0);
    }
}
