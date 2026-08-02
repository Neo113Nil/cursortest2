package ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.imageprefetch.PrefetchableImage;
import ru.ozon.app.android.composer.imageprefetch.StringImagePrefetchProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.insuranceUpgradeBanner.data.InsuranceUpgradeBannerMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/insuranceUpgradeBanner/data/InsuranceUpgradeBannerMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class InsuranceUpgradeBannerComponent$insuranceUpgradeBannerMapper$2 extends AbstractC7737t implements Function0<InsuranceUpgradeBannerMapper> {
    final /* synthetic */ InsuranceUpgradeBannerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InsuranceUpgradeBannerComponent$insuranceUpgradeBannerMapper$2(InsuranceUpgradeBannerComponent insuranceUpgradeBannerComponent) {
        super(0);
        this.this$0 = insuranceUpgradeBannerComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InsuranceUpgradeBannerMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        StringImagePrefetchProvider stringImagePrefetchProvider = new StringImagePrefetchProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(PrefetchableImage.class), stringImagePrefetchProvider);
        return new InsuranceUpgradeBannerMapper(context, new ImagePrefetcher(1, imagePrefetchInfoProviderStorage));
    }
}
