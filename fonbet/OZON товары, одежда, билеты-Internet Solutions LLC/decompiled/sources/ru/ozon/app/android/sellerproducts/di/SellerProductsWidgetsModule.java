package ru.ozon.app.android.sellerproducts.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.sellerproducts.header.HeaderWidgetViewMapper;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.SellerProductsWidgetConfig;
import ru.ozon.app.android.sellerproducts.sellerProducts.presentation.SellerProductsViewMapper;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lru/ozon/app/android/sellerproducts/di/SellerProductsWidgetsModule;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "sellerProductsWidgetConfig", "Lru/ozon/app/android/sellerproducts/sellerProducts/data/SellerProductsWidgetConfig;", "sellerProductsViewMapper", "Lru/ozon/app/android/sellerproducts/sellerProducts/presentation/SellerProductsViewMapper;", "headerWidgetViewMapper", "Lru/ozon/app/android/sellerproducts/header/HeaderWidgetViewMapper;", "sellerproducts_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SellerProductsWidgetsModule {
    @NotNull
    public final Set<Widget2> provideWidget(@NotNull SellerProductsWidgetConfig sellerProductsWidgetConfig, @NotNull SellerProductsViewMapper sellerProductsViewMapper, @NotNull HeaderWidgetViewMapper headerWidgetViewMapper) {
        Intrinsics.checkNotNullParameter(sellerProductsWidgetConfig, "sellerProductsWidgetConfig");
        Intrinsics.checkNotNullParameter(sellerProductsViewMapper, "sellerProductsViewMapper");
        Intrinsics.checkNotNullParameter(headerWidgetViewMapper, "headerWidgetViewMapper");
        return e0.a(new Widget2("csma", "sellerProducts", sellerProductsWidgetConfig, new ViewMapper2[]{headerWidgetViewMapper, sellerProductsViewMapper}));
    }
}
