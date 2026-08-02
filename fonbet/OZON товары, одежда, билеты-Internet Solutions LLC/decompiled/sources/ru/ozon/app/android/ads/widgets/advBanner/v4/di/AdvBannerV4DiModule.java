package ru.ozon.app.android.ads.widgets.advBanner.v4.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advBanner.v4.data.AdvBannerV4Config;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.AdvBannerV4PlainViewMapper;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.single.AdvBannerV4PlainSingleViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/di/AdvBannerV4DiModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "advBannerConfig", "Lru/ozon/app/android/ads/widgets/advBanner/v4/data/AdvBannerV4Config;", "advBannerPlainViewMapper", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/AdvBannerV4PlainViewMapper;", "advBannerPlainSingleViewMapper", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/single/AdvBannerV4PlainSingleViewMapper;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4DiModule {

    @NotNull
    public static final AdvBannerV4DiModule INSTANCE = new AdvBannerV4DiModule();

    private AdvBannerV4DiModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull AdvBannerV4Config advBannerConfig, @NotNull AdvBannerV4PlainViewMapper advBannerPlainViewMapper, @NotNull AdvBannerV4PlainSingleViewMapper advBannerPlainSingleViewMapper) {
        Intrinsics.checkNotNullParameter(advBannerConfig, "advBannerConfig");
        Intrinsics.checkNotNullParameter(advBannerPlainViewMapper, "advBannerPlainViewMapper");
        Intrinsics.checkNotNullParameter(advBannerPlainSingleViewMapper, "advBannerPlainSingleViewMapper");
        return new Widget2("rtb", "advBanner", advBannerConfig, new ViewMapper2[]{advBannerPlainViewMapper, advBannerPlainSingleViewMapper});
    }
}
