package ru.ozon.app.android.orderdetails.productsToPay.di;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.core.ProductsToPayConfig;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewMapper.ProductsToPayCellViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewMapper.ProductsToPayViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewMapper.SeparatorViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/di/ProductsToPayModule;", "", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ProductsToPayModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/productsToPay/di/ProductsToPayModule$Companion;", "", "<init>", "()V", "provideProductsToPay", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "config", "Lru/ozon/app/android/orderdetails/productsToPay/core/ProductsToPayConfig;", "productsToPayViewMapper", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/productstopay/viewMapper/ProductsToPayViewMapper;", "productsToPayCellViewMapper", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/cell/viewMapper/ProductsToPayCellViewMapper;", "horizontalScrollImagesViewMapper", "Lru/ozon/app/android/orderdetails/modalConstructor/presentation/imageList/HorizontalScrollImagesViewMapper;", "separatorViewMapper", "Lru/ozon/app/android/orderdetails/productsToPay/presentation/separator/viewMapper/SeparatorViewMapper;", "provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget2 provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease(@NotNull ProductsToPayConfig config, @NotNull ProductsToPayViewMapper productsToPayViewMapper, @NotNull ProductsToPayCellViewMapper productsToPayCellViewMapper, @NotNull HorizontalScrollImagesViewMapper horizontalScrollImagesViewMapper, @NotNull SeparatorViewMapper separatorViewMapper) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(productsToPayViewMapper, "productsToPayViewMapper");
            Intrinsics.checkNotNullParameter(productsToPayCellViewMapper, "productsToPayCellViewMapper");
            Intrinsics.checkNotNullParameter(horizontalScrollImagesViewMapper, "horizontalScrollImagesViewMapper");
            Intrinsics.checkNotNullParameter(separatorViewMapper, "separatorViewMapper");
            return new Widget2("csma", "productsToPay", config, new ViewMapper2[]{productsToPayViewMapper, productsToPayCellViewMapper, horizontalScrollImagesViewMapper, separatorViewMapper});
        }

        private Companion() {
        }
    }
}
