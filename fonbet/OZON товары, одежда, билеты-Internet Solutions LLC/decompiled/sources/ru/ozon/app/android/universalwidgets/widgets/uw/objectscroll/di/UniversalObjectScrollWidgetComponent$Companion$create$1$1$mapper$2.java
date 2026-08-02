package ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.imageprefetch.BaseImagePrefetchInfoProvider;
import ru.ozon.app.android.composer.imageprefetch.PrefetchableImage;
import ru.ozon.app.android.composer.imageprefetch.StringImagePrefetchProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetchInfoProviderStorage;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.universalwidgets.widgets.uw.objectscroll.core.UniversalObjectScrollMapper;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/objectscroll/core/UniversalObjectScrollMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class UniversalObjectScrollWidgetComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<UniversalObjectScrollMapper> {
    final /* synthetic */ UniversalObjectScrollWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UniversalObjectScrollWidgetComponent$Companion$create$1$1$mapper$2(UniversalObjectScrollWidgetComponent$Companion$create$1$1 universalObjectScrollWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = universalObjectScrollWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UniversalObjectScrollMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        BaseImagePrefetchInfoProvider baseImagePrefetchInfoProvider = new BaseImagePrefetchInfoProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage.addProvider(N.b(ImageDTO.class), baseImagePrefetchInfoProvider);
        ImagePrefetcher imagePrefetcher = new ImagePrefetcher(1, imagePrefetchInfoProviderStorage);
        StringImagePrefetchProvider stringImagePrefetchProvider = new StringImagePrefetchProvider();
        ImagePrefetchInfoProviderStorage imagePrefetchInfoProviderStorage2 = new ImagePrefetchInfoProviderStorage();
        imagePrefetchInfoProviderStorage2.addProvider(N.b(PrefetchableImage.class), stringImagePrefetchProvider);
        return new UniversalObjectScrollMapper(context, imagePrefetcher, new ImagePrefetcher(1, imagePrefetchInfoProviderStorage2));
    }
}
