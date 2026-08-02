package ru.ozon.app.android.universalwidgets.widgets.uw.sku.binders;

import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.product.TileActionSheetHandlerFactory;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.secondarybutton.SecondaryButtonMessageProcesser;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetProxyBinderFactory;", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;", "messageProcesser", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "actionSheetEventHandler", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "sheetHandlerFactory", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductTopRightButtonsBinder;", "topRightButtonsBinder", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;Lru/ozon/app/android/product/TileActionSheetHandlerFactory;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductTopRightButtonsBinder;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetProxyBinder;", "createWithoutSecondary", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductActionSheetProxyBinder;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/secondarybutton/SecondaryButtonMessageProcesser;", "Lru/ozon/app/android/action/sheet/ActionSheetEventHandler;", "Lru/ozon/app/android/product/TileActionSheetHandlerFactory;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/binders/ProductTopRightButtonsBinder;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductActionSheetProxyBinderFactory {

    @NotNull
    private final ActionSheetEventHandler actionSheetEventHandler;

    @NotNull
    private final SecondaryButtonMessageProcesser messageProcesser;

    @NotNull
    private final TileActionSheetHandlerFactory sheetHandlerFactory;

    @NotNull
    private final ProductTopRightButtonsBinder topRightButtonsBinder;

    public ProductActionSheetProxyBinderFactory(@NotNull SecondaryButtonMessageProcesser messageProcesser, @NotNull ActionSheetEventHandler actionSheetEventHandler, @NotNull TileActionSheetHandlerFactory sheetHandlerFactory, @NotNull ProductTopRightButtonsBinder topRightButtonsBinder) {
        Intrinsics.checkNotNullParameter(messageProcesser, "messageProcesser");
        Intrinsics.checkNotNullParameter(actionSheetEventHandler, "actionSheetEventHandler");
        Intrinsics.checkNotNullParameter(sheetHandlerFactory, "sheetHandlerFactory");
        Intrinsics.checkNotNullParameter(topRightButtonsBinder, "topRightButtonsBinder");
        this.messageProcesser = messageProcesser;
        this.actionSheetEventHandler = actionSheetEventHandler;
        this.sheetHandlerFactory = sheetHandlerFactory;
        this.topRightButtonsBinder = topRightButtonsBinder;
    }

    @NotNull
    public final ProductActionSheetProxyBinder createWithoutSecondary() {
        return new ProductActionSheetProxyBinder(this.messageProcesser, this.actionSheetEventHandler, this.sheetHandlerFactory, e0.h(this.topRightButtonsBinder));
    }
}
