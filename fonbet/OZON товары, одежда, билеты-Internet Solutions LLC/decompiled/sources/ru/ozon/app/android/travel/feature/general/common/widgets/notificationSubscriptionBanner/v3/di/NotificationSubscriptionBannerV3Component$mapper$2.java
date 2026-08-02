package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.imageprefetch.BaseImagePrefetchInfoProvider;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.data.NotificationSubscriptionBackgroundImagePrefetchInfoProvider;
import ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscriptionBanner.v3.data.NotificationSubscriptionBannerV3Mapper;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscriptionBanner/v3/data/NotificationSubscriptionBannerV3Mapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NotificationSubscriptionBannerV3Component$mapper$2 extends AbstractC7737t implements Function0<NotificationSubscriptionBannerV3Mapper> {
    final /* synthetic */ NotificationSubscriptionBannerV3Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionBannerV3Component$mapper$2(NotificationSubscriptionBannerV3Component notificationSubscriptionBannerV3Component) {
        super(0);
        this.this$0 = notificationSubscriptionBannerV3Component;
    }

    @Override // kotlin.jvm.functions.Function0
    public final NotificationSubscriptionBannerV3Mapper invoke() {
        Context context = this.this$0.getContext();
        BaseImagePrefetchInfoProvider baseImagePrefetchInfoProvider = new BaseImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageDTO.class), baseImagePrefetchInfoProvider);
        ImagePrefetcher imagePrefetcher = new ImagePrefetcher(1, imagePrefetchInfoProviderStorage);
        NotificationSubscriptionBackgroundImagePrefetchInfoProvider notificationSubscriptionBackgroundImagePrefetchInfoProvider = new NotificationSubscriptionBackgroundImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage2 = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage2.addProvider(N.b(String.class), notificationSubscriptionBackgroundImagePrefetchInfoProvider);
        return new NotificationSubscriptionBannerV3Mapper(context, imagePrefetcher, new ImagePrefetcher(1, imagePrefetchInfoProviderStorage2));
    }
}
