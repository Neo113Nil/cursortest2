package ru.ozon.app.android.storefront.widgets.feedback.result.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.feedback.common.RateMainButtonViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultConfig;
import ru.ozon.app.android.storefront.widgets.feedback.result.core.ResultViewMapper;
import ru.ozon.app.android.storefront.widgets.feedback.result.data.ResultDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/widgets/feedback/result/di/ResultModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "reviewSuccessConfig", "Lru/ozon/app/android/storefront/widgets/feedback/result/core/ResultConfig;", "reviewSuccessViewMapper", "Lru/ozon/app/android/storefront/widgets/feedback/result/core/ResultViewMapper;", "toHomeButtonViewMapper", "Lru/ozon/app/android/storefront/widgets/feedback/common/RateMainButtonViewMapper;", "Lru/ozon/app/android/storefront/widgets/feedback/result/data/ResultDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ResultModule {

    @NotNull
    public static final ResultModule INSTANCE = new ResultModule();

    private ResultModule() {
    }

    @NotNull
    public final Widget2 provideWidget(@NotNull ResultConfig reviewSuccessConfig, @NotNull ResultViewMapper reviewSuccessViewMapper, @NotNull RateMainButtonViewMapper<ResultDTO> toHomeButtonViewMapper) {
        Intrinsics.checkNotNullParameter(reviewSuccessConfig, "reviewSuccessConfig");
        Intrinsics.checkNotNullParameter(reviewSuccessViewMapper, "reviewSuccessViewMapper");
        Intrinsics.checkNotNullParameter(toHomeButtonViewMapper, "toHomeButtonViewMapper");
        return new Widget2("feedback", "result", reviewSuccessConfig, new ViewMapper2[]{reviewSuccessViewMapper, toHomeButtonViewMapper});
    }
}
