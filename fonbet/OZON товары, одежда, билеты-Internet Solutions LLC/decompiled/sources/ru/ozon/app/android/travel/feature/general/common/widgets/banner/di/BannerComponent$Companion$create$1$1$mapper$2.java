package ru.ozon.app.android.travel.feature.general.common.widgets.banner.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.data.BannerMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.prefetch.BannerLeftImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.widgets.banner.prefetch.BannerRightImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.molecules.view.banner.BannerVO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/banner/data/BannerMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class BannerComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<BannerMapper> {
    final /* synthetic */ BannerComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BannerComponent$Companion$create$1$1$mapper$2(BannerComponent$Companion$create$1$1 bannerComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = bannerComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final BannerMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextApi;
        Context context = contextComponentDependencies.getContext();
        BannerLeftImagePrefetchInfoProvider bannerLeftImagePrefetchInfoProvider = new BannerLeftImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(BannerVO.class), bannerLeftImagePrefetchInfoProvider);
        ImagePrefetcher imagePrefetcher = new ImagePrefetcher(1, imagePrefetchInfoProviderStorage);
        BannerRightImagePrefetchInfoProvider bannerRightImagePrefetchInfoProvider = new BannerRightImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage2 = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage2.addProvider(N.b(BannerVO.class), bannerRightImagePrefetchInfoProvider);
        return new BannerMapper(context, imagePrefetcher, new ImagePrefetcher(1, imagePrefetchInfoProviderStorage2));
    }
}
