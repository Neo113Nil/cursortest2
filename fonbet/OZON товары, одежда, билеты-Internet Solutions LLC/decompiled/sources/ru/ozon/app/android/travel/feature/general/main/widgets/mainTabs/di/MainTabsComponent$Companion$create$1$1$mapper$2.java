package ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.imageprefetch.BaseImagePrefetchInfoProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.general.main.widgets.mainTabs.data.MainTabsMapper;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/general/main/widgets/mainTabs/data/MainTabsMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class MainTabsComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<MainTabsMapper> {
    final /* synthetic */ MainTabsComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainTabsComponent$Companion$create$1$1$mapper$2(MainTabsComponent$Companion$create$1$1 mainTabsComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = mainTabsComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MainTabsMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        BaseImagePrefetchInfoProvider baseImagePrefetchInfoProvider = new BaseImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageDTO.class), baseImagePrefetchInfoProvider);
        return new MainTabsMapper(context, new ImagePrefetcher(5, imagePrefetchInfoProviderStorage));
    }
}
