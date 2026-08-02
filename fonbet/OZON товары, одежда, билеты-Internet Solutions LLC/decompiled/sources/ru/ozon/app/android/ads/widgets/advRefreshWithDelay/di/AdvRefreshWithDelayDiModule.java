package ru.ozon.app.android.ads.widgets.advRefreshWithDelay.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.data.AdvRefreshWithDelayConfig;
import ru.ozon.app.android.ads.widgets.advRefreshWithDelay.presentation.AdvRefreshWithDelayViewMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/di/AdvRefreshWithDelayDiModule;", "", "<init>", "()V", "provideAdvRefreshWithDelay", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "advRefreshWithDelayConfig", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/data/AdvRefreshWithDelayConfig;", "advRefreshWithDelayViewMapper", "Lru/ozon/app/android/ads/widgets/advRefreshWithDelay/presentation/AdvRefreshWithDelayViewMapper;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvRefreshWithDelayDiModule {

    @NotNull
    public static final AdvRefreshWithDelayDiModule INSTANCE = new AdvRefreshWithDelayDiModule();

    private AdvRefreshWithDelayDiModule() {
    }

    @NotNull
    public final Widget2 provideAdvRefreshWithDelay(@NotNull AdvRefreshWithDelayConfig advRefreshWithDelayConfig, @NotNull AdvRefreshWithDelayViewMapper advRefreshWithDelayViewMapper) {
        Intrinsics.checkNotNullParameter(advRefreshWithDelayConfig, "advRefreshWithDelayConfig");
        Intrinsics.checkNotNullParameter(advRefreshWithDelayViewMapper, "advRefreshWithDelayViewMapper");
        return new Widget2("rtb", "advRefreshWithDelay", advRefreshWithDelayConfig, new ViewMapper2[]{advRefreshWithDelayViewMapper});
    }
}
