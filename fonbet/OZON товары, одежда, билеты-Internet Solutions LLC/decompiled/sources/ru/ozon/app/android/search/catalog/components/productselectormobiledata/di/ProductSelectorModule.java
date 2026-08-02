package ru.ozon.app.android.search.catalog.components.productselectormobiledata.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.widgets.base.view.mapper.overlay.SingleNoUiViewMapper;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.allstep.ProductSelectorDataAllStepNoUiViewMapper;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.data.ProductSelectorMobileDataConfig;
import ru.ozon.app.android.search.catalog.components.productselectormobiledata.step.ProductSelectorDataConcreteStepNoUiViewMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/search/catalog/components/productselectormobiledata/di/ProductSelectorModule;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/data/ProductSelectorMobileDataConfig;", "allStepNoUiViewMapper", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/allstep/ProductSelectorDataAllStepNoUiViewMapper;", "concreteStepViewMapper", "Lru/ozon/app/android/search/catalog/components/productselectormobiledata/step/ProductSelectorDataConcreteStepNoUiViewMapper;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSelectorModule {

    @NotNull
    public static final ProductSelectorModule INSTANCE = new ProductSelectorModule();

    private ProductSelectorModule() {
    }

    @NotNull
    public static final Set<Widget> provideWidgets(@NotNull ProductSelectorMobileDataConfig config, @NotNull ProductSelectorDataAllStepNoUiViewMapper allStepNoUiViewMapper, @NotNull ProductSelectorDataConcreteStepNoUiViewMapper concreteStepViewMapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(allStepNoUiViewMapper, "allStepNoUiViewMapper");
        Intrinsics.checkNotNullParameter(concreteStepViewMapper, "concreteStepViewMapper");
        return e0.h(new Widget("catalog", "productSelectorMobileData", config, new SingleNoUiViewMapper[]{allStepNoUiViewMapper, concreteStepViewMapper}));
    }
}
