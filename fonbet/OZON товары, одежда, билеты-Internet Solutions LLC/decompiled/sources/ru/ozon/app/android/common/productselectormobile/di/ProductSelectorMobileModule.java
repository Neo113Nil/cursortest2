package ru.ozon.app.android.common.productselectormobile.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileConfig;
import ru.ozon.app.android.common.productselectormobile.core.ProductSelectorMobileViewMapper;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/di/ProductSelectorMobileModule;", "", "<init>", "()V", "provideExportWidgets", "", "Lru/ozon/app/android/composer/di/Widget;", "productSelectorMobileConfig", "Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileConfig;", "productSelectorMobileViewMapper", "Lru/ozon/app/android/common/productselectormobile/core/ProductSelectorMobileViewMapper;", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProductSelectorMobileModule {

    @NotNull
    public static final ProductSelectorMobileModule INSTANCE = new ProductSelectorMobileModule();

    private ProductSelectorMobileModule() {
    }

    @NotNull
    public final Set<Widget> provideExportWidgets(@NotNull ProductSelectorMobileConfig productSelectorMobileConfig, @NotNull ProductSelectorMobileViewMapper productSelectorMobileViewMapper) {
        Intrinsics.checkNotNullParameter(productSelectorMobileConfig, "productSelectorMobileConfig");
        Intrinsics.checkNotNullParameter(productSelectorMobileViewMapper, "productSelectorMobileViewMapper");
        return e0.h(new Widget("common", FormPageDTO.Field.FIELD_TYPE_PICKER, productSelectorMobileConfig, new ProductSelectorMobileViewMapper[]{productSelectorMobileViewMapper}));
    }
}
