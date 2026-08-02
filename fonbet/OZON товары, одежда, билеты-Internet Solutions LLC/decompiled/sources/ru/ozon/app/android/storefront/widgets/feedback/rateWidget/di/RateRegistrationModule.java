package ru.ozon.app.android.storefront.widgets.feedback.rateWidget.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateConfig;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.core.RateViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.rateWidget.data.RateDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/di/RateRegistrationModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "rateConfig", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateConfig;", "rateViewMapper", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/core/RateViewMapper;", "rateMainButtonViewMapper", "Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonViewMapper;", "Lru/ozon/app/android/storefront/widgets/feedback/rateWidget/data/RateDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RateRegistrationModule {

    @NotNull
    public static final RateRegistrationModule INSTANCE = new RateRegistrationModule();

    private RateRegistrationModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull RateConfig rateConfig, @NotNull RateViewMapper rateViewMapper, @NotNull RateMainButtonViewMapper<RateDTO> rateMainButtonViewMapper) {
        Intrinsics.checkNotNullParameter(rateConfig, "rateConfig");
        Intrinsics.checkNotNullParameter(rateViewMapper, "rateViewMapper");
        Intrinsics.checkNotNullParameter(rateMainButtonViewMapper, "rateMainButtonViewMapper");
        return new Widget2("feedback", "rateWidget", rateConfig, new ViewMapper2[]{rateViewMapper, rateMainButtonViewMapper});
    }
}
