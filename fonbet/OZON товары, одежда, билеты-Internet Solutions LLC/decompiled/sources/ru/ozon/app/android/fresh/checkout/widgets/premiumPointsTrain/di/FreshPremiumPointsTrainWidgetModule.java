package ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.data.FreshPremiumPointsTrainConfig;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.multipleCarriageTrain.FreshPremiumPointsTrainMultipleViewMapper;
import ru.ozon.app.android.fresh.checkout.widgets.premiumPointsTrain.presentation.singleCarriageTrain.FreshPremiumPointsTrainSingleViewMapper;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/di/FreshPremiumPointsTrainWidgetModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "premiumPointsTrainV2Config", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/data/FreshPremiumPointsTrainConfig;", "singlePointsTrainV2ViewMapper", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/singleCarriageTrain/FreshPremiumPointsTrainSingleViewMapper;", "multiplePointsTrainV2ViewMapper", "Lru/ozon/app/android/fresh/checkout/widgets/premiumPointsTrain/presentation/multipleCarriageTrain/FreshPremiumPointsTrainMultipleViewMapper;", "provideWidget$widgets_checkout_prodGoogleAllVendorsRelease", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshPremiumPointsTrainWidgetModule {

    @NotNull
    public static final FreshPremiumPointsTrainWidgetModule INSTANCE = new FreshPremiumPointsTrainWidgetModule();

    private FreshPremiumPointsTrainWidgetModule() {
    }

    @NotNull
    public final Set<Widget2> provideWidget$widgets_checkout_prodGoogleAllVendorsRelease(@NotNull FreshPremiumPointsTrainConfig premiumPointsTrainV2Config, @NotNull FreshPremiumPointsTrainSingleViewMapper singlePointsTrainV2ViewMapper, @NotNull FreshPremiumPointsTrainMultipleViewMapper multiplePointsTrainV2ViewMapper) {
        Intrinsics.checkNotNullParameter(premiumPointsTrainV2Config, "premiumPointsTrainV2Config");
        Intrinsics.checkNotNullParameter(singlePointsTrainV2ViewMapper, "singlePointsTrainV2ViewMapper");
        Intrinsics.checkNotNullParameter(multiplePointsTrainV2ViewMapper, "multiplePointsTrainV2ViewMapper");
        return e0.h(new Widget2("express", "premiumPointsTrain", premiumPointsTrainV2Config, new ViewMapper2[]{singlePointsTrainV2ViewMapper, multiplePointsTrainV2ViewMapper}));
    }
}
