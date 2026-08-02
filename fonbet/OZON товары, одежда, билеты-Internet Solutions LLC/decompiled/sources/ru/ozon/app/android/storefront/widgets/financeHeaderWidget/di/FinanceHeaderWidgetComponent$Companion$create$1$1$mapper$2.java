package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.domain.flags.AccountMainPlaceholderRateOptimizationEnabled;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.storefront.utils.ImagePrefetcherWrapper;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.core.FinanceHeaderMapper;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/core/FinanceHeaderMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FinanceHeaderWidgetComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<FinanceHeaderMapper> {
    final /* synthetic */ FinanceHeaderWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FinanceHeaderWidgetComponent$Companion$create$1$1$mapper$2(FinanceHeaderWidgetComponent$Companion$create$1$1 financeHeaderWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = financeHeaderWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final FinanceHeaderMapper invoke() {
        AndroidPlatformComponentDependencies androidPlatformComponentDependencies;
        ContextComponentDependencies contextComponentDependencies;
        ImagePrefetchInfoProviderStorage providerStorage;
        FeatureChecker featureChecker;
        androidPlatformComponentDependencies = this.this$0.platformComponentDependencies;
        AppType appType = androidPlatformComponentDependencies.getAppType();
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        providerStorage = this.this$0.getProviderStorage();
        ImagePrefetcher imagePrefetcher = new ImagePrefetcher(1, providerStorage);
        featureChecker = this.this$0.getFeatureChecker();
        return new FinanceHeaderMapper(appType, context, new ImagePrefetcherWrapper(imagePrefetcher, featureChecker.isEnabled(AccountMainPlaceholderRateOptimizationEnabled.INSTANCE)));
    }
}
