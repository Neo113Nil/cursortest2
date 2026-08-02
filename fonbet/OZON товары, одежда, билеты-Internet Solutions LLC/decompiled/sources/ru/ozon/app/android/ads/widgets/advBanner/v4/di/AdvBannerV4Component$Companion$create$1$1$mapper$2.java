package ru.ozon.app.android.ads.widgets.advBanner.v4.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainMapper;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AdvBannerV4Component$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<AdvBannerV4PlainMapper> {
    final /* synthetic */ ContextComponentDependencies $contextComponentApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvBannerV4Component$Companion$create$1$1$mapper$2(ContextComponentDependencies contextComponentDependencies) {
        super(0);
        this.$contextComponentApi = contextComponentDependencies;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AdvBannerV4PlainMapper invoke() {
        return new AdvBannerV4PlainMapper(this.$contextComponentApi.getContext());
    }
}
