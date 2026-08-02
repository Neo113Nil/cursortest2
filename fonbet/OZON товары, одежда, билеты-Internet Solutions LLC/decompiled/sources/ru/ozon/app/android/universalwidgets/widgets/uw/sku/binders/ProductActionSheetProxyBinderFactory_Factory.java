package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;

/* loaded from: classes2.dex */
public final class ProductActionSheetProxyBinderFactory_Factory implements e<ProductActionSheetProxyBinderFactory> {
    private final a<ActionSheetEventHandler> actionSheetEventHandlerProvider;
    private final a<SecondaryButtonMessageProcesser> messageProcesserProvider;
    private final a<TileActionSheetHandlerFactory> sheetHandlerFactoryProvider;
    private final a<ProductTopRightButtonsBinder> topRightButtonsBinderProvider;

    public ProductActionSheetProxyBinderFactory_Factory(a<SecondaryButtonMessageProcesser> aVar, a<ActionSheetEventHandler> aVar2, a<TileActionSheetHandlerFactory> aVar3, a<ProductTopRightButtonsBinder> aVar4) {
        this.messageProcesserProvider = aVar;
        this.actionSheetEventHandlerProvider = aVar2;
        this.sheetHandlerFactoryProvider = aVar3;
        this.topRightButtonsBinderProvider = aVar4;
    }

    public static ProductActionSheetProxyBinderFactory_Factory create(a<SecondaryButtonMessageProcesser> aVar, a<ActionSheetEventHandler> aVar2, a<TileActionSheetHandlerFactory> aVar3, a<ProductTopRightButtonsBinder> aVar4) {
        return new ProductActionSheetProxyBinderFactory_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static ProductActionSheetProxyBinderFactory newInstance(SecondaryButtonMessageProcesser secondaryButtonMessageProcesser, ActionSheetEventHandler actionSheetEventHandler, TileActionSheetHandlerFactory tileActionSheetHandlerFactory, ProductTopRightButtonsBinder productTopRightButtonsBinder) {
        return new ProductActionSheetProxyBinderFactory(secondaryButtonMessageProcesser, actionSheetEventHandler, tileActionSheetHandlerFactory, productTopRightButtonsBinder);
    }

    @Override // Pc.a
    public ProductActionSheetProxyBinderFactory get() {
        return newInstance(this.messageProcesserProvider.get(), this.actionSheetEventHandlerProvider.get(), this.sheetHandlerFactoryProvider.get(), this.topRightButtonsBinderProvider.get());
    }
}
