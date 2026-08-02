package ru.ozon.app.android.ads.widgets.advVideoBannerV2.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2Config;
import ru.ozon.app.android.ads.widgets.advVideoBannerV2.data.AdvVideoBannerV2NewViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/widgets/advVideoBannerV2/di/AdvVideoBannerV2WidgetDiModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "advVideoBannerV2Config", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2Config;", "advVideoBannerV2NewViewMapper", "Lru/ozon/app/android/ads/widgets/advVideoBannerV2/data/AdvVideoBannerV2NewViewMapper;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvVideoBannerV2WidgetDiModule {

    @NotNull
    public static final AdvVideoBannerV2WidgetDiModule INSTANCE = new AdvVideoBannerV2WidgetDiModule();

    private AdvVideoBannerV2WidgetDiModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull AdvVideoBannerV2Config advVideoBannerV2Config, @NotNull AdvVideoBannerV2NewViewMapper advVideoBannerV2NewViewMapper) {
        Intrinsics.checkNotNullParameter(advVideoBannerV2Config, "advVideoBannerV2Config");
        Intrinsics.checkNotNullParameter(advVideoBannerV2NewViewMapper, "advVideoBannerV2NewViewMapper");
        return new Widget2("rtb", "advVideoBannerMobile", advVideoBannerV2Config, new ViewMapper2[]{advVideoBannerV2NewViewMapper});
    }
}
