package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.imageprefetch.BaseImagePrefetchInfoProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersBannerBackgroundImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyers.data.MilesForBuyersMapper;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyers/data/MilesForBuyersMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MilesForBuyersComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<MilesForBuyersMapper> {
    final /* synthetic */ MilesForBuyersComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MilesForBuyersComponent$Companion$create$1$1$mapper$2(MilesForBuyersComponent$Companion$create$1$1 milesForBuyersComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = milesForBuyersComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MilesForBuyersMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        MilesForBuyersBannerBackgroundImagePrefetchInfoProvider milesForBuyersBannerBackgroundImagePrefetchInfoProvider = new MilesForBuyersBannerBackgroundImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageDTO.class), milesForBuyersBannerBackgroundImagePrefetchInfoProvider);
        ImagePrefetcher imagePrefetcher = new ImagePrefetcher(1, imagePrefetchInfoProviderStorage);
        BaseImagePrefetchInfoProvider baseImagePrefetchInfoProvider = new BaseImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage2 = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage2.addProvider(N.b(ImageDTO.class), baseImagePrefetchInfoProvider);
        ImagePrefetcher imagePrefetcher2 = new ImagePrefetcher(1, imagePrefetchInfoProviderStorage2);
        BaseImagePrefetchInfoProvider baseImagePrefetchInfoProvider2 = new BaseImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage3 = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage3.addProvider(N.b(ImageDTO.class), baseImagePrefetchInfoProvider2);
        ImagePrefetcher imagePrefetcher3 = new ImagePrefetcher(1, imagePrefetchInfoProviderStorage3);
        BaseImagePrefetchInfoProvider baseImagePrefetchInfoProvider3 = new BaseImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage4 = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage4.addProvider(N.b(ImageDTO.class), baseImagePrefetchInfoProvider3);
        return new MilesForBuyersMapper(context, imagePrefetcher, imagePrefetcher2, imagePrefetcher3, new ImagePrefetcher(1, imagePrefetchInfoProviderStorage4));
    }
}
