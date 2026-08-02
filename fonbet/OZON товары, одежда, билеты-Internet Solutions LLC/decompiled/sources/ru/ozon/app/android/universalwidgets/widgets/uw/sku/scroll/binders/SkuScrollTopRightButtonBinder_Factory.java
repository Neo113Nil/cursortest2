package ru.ozon.app.android.universalwidgets.widgets.uw.sku.scroll.binders;

import Jb.e;
import Pc.a;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;
import ru.ozon.app.android.universalwidgets.widgets.uw.topRightButtons.TopRightButtonsViewHolderUtils;

/* loaded from: classes2.dex */
public final class SkuScrollTopRightButtonBinder_Factory implements e<SkuScrollTopRightButtonBinder> {
    private final a<ActionSheetEventHandler> actionSheetEventHandlerProvider;
    private final a<SecondaryButtonMessageProcesser> messagesProcessorProvider;
    private final a<TileActionSheetHandlerFactory> sheetHandlerFactoryProvider;
    private final a<TopRightButtonsViewHolderUtils> topRightButtonsViewHolderUtilsProvider;

    public SkuScrollTopRightButtonBinder_Factory(a<TopRightButtonsViewHolderUtils> aVar, a<TileActionSheetHandlerFactory> aVar2, a<SecondaryButtonMessageProcesser> aVar3, a<ActionSheetEventHandler> aVar4) {
        this.topRightButtonsViewHolderUtilsProvider = aVar;
        this.sheetHandlerFactoryProvider = aVar2;
        this.messagesProcessorProvider = aVar3;
        this.actionSheetEventHandlerProvider = aVar4;
    }

    public static SkuScrollTopRightButtonBinder_Factory create(a<TopRightButtonsViewHolderUtils> aVar, a<TileActionSheetHandlerFactory> aVar2, a<SecondaryButtonMessageProcesser> aVar3, a<ActionSheetEventHandler> aVar4) {
        return new SkuScrollTopRightButtonBinder_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static SkuScrollTopRightButtonBinder newInstance(TopRightButtonsViewHolderUtils topRightButtonsViewHolderUtils, TileActionSheetHandlerFactory tileActionSheetHandlerFactory, SecondaryButtonMessageProcesser secondaryButtonMessageProcesser, ActionSheetEventHandler actionSheetEventHandler) {
        return new SkuScrollTopRightButtonBinder(topRightButtonsViewHolderUtils, tileActionSheetHandlerFactory, secondaryButtonMessageProcesser, actionSheetEventHandler);
    }

    @Override // Pc.a
    public SkuScrollTopRightButtonBinder get() {
        return newInstance(this.topRightButtonsViewHolderUtilsProvider.get(), this.sheetHandlerFactoryProvider.get(), this.messagesProcessorProvider.get(), this.actionSheetEventHandlerProvider.get());
    }
}
