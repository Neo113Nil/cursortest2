package ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pikazon.preload.ImagePrefetcher;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaSearchResult.v4.data.AviaSearchResultV4LoadingMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaSearchResult/v4/data/AviaSearchResultV4LoadingMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
final class AviaSearchResultV4Component$aviaSearchResultV4LoadingMapper$2 extends AbstractC7737t implements Function0<AviaSearchResultV4LoadingMapper> {
    final /* synthetic */ AviaSearchResultV4Component this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaSearchResultV4Component$aviaSearchResultV4LoadingMapper$2(AviaSearchResultV4Component aviaSearchResultV4Component) {
        super(0);
        this.this$0 = aviaSearchResultV4Component;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AviaSearchResultV4LoadingMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        ImagePrefetcher imagePrefetcher;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        Context context = contextComponentDependencies.getContext();
        imagePrefetcher = this.this$0.imagePrefetcher;
        return new AviaSearchResultV4LoadingMapper(context, imagePrefetcher);
    }
}
