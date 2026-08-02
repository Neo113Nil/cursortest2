package ru.ozon.app.android.barcode.barcodeProductsList.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcode.barcodeProductsList.core.BarcodeProductsListConfig;
import ru.ozon.app.android.barcode.barcodeProductsList.presentation.viewMapper.BarcodeProductsListWidgetMapper;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/barcode/barcodeProductsList/di/BarcodeProductsListWidgetModule;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/barcode/barcodeProductsList/core/BarcodeProductsListConfig;", "mapper", "Lru/ozon/app/android/barcode/barcodeProductsList/presentation/viewMapper/BarcodeProductsListWidgetMapper;", "provideWidget$barcode_prodGoogleAllVendorsRelease", "barcode_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BarcodeProductsListWidgetModule {
    @NotNull
    public final Widget2 provideWidget$barcode_prodGoogleAllVendorsRelease(@NotNull BarcodeProductsListConfig config, @NotNull BarcodeProductsListWidgetMapper mapper) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new Widget2("csma", "barcodeProductsList", config, new ViewMapper2[]{mapper});
    }
}
