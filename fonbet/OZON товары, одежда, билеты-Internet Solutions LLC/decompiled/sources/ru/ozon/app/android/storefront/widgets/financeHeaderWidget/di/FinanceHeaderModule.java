package ru.ozon.app.android.storefront.widgets.financeHeaderWidget.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.core.FinanceHeaderConfig;
import ru.ozon.app.android.storefront.widgets.financeHeaderWidget.core.FinanceHeaderViewMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/di/FinanceHeaderModule;", "", "<init>", "()V", "provideFinanceHeader", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "financeHeaderConfig", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/core/FinanceHeaderConfig;", "financeHeaderViewMapper", "Lru/ozon/app/android/storefront/widgets/financeHeaderWidget/core/FinanceHeaderViewMapper;", "provideFinanceHeader$storefront_prodGoogleAllVendorsRelease", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FinanceHeaderModule {

    @NotNull
    public static final FinanceHeaderModule INSTANCE = new FinanceHeaderModule();

    private FinanceHeaderModule() {
    }

    @NotNull
    public final Widget2 provideFinanceHeader$storefront_prodGoogleAllVendorsRelease(@NotNull FinanceHeaderConfig financeHeaderConfig, @NotNull FinanceHeaderViewMapper financeHeaderViewMapper) {
        Intrinsics.checkNotNullParameter(financeHeaderConfig, "financeHeaderConfig");
        Intrinsics.checkNotNullParameter(financeHeaderViewMapper, "financeHeaderViewMapper");
        return new Widget2("myProfile", "financeHeaderWidget", financeHeaderConfig, new ViewMapper2[]{financeHeaderViewMapper});
    }
}
