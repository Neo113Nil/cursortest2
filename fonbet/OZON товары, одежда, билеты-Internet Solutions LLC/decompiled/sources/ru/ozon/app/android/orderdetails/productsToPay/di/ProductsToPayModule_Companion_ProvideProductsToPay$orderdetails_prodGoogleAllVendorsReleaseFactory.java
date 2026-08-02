package ru.ozon.app.android.orderdetails.productsToPay.di;

import Jb.e;
import Jb.j;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.orderdetails.modalConstructor.presentation.imageList.HorizontalScrollImagesViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.core.ProductsToPayConfig;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.cell.viewMapper.ProductsToPayCellViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.productstopay.viewMapper.ProductsToPayViewMapper;
import ru.ozon.app.android.orderdetails.productsToPay.presentation.separator.viewMapper.SeparatorViewMapper;

/* loaded from: classes6.dex */
public final class ProductsToPayModule_Companion_ProvideProductsToPay$orderdetails_prodGoogleAllVendorsReleaseFactory implements e<Widget2> {
    public static Widget2 provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease(ProductsToPayConfig productsToPayConfig, ProductsToPayViewMapper productsToPayViewMapper, ProductsToPayCellViewMapper productsToPayCellViewMapper, HorizontalScrollImagesViewMapper horizontalScrollImagesViewMapper, SeparatorViewMapper separatorViewMapper) {
        Widget2 provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease = ProductsToPayModule.INSTANCE.provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease(productsToPayConfig, productsToPayViewMapper, productsToPayCellViewMapper, horizontalScrollImagesViewMapper, separatorViewMapper);
        j.d(provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease);
        return provideProductsToPay$orderdetails_prodGoogleAllVendorsRelease;
    }
}
