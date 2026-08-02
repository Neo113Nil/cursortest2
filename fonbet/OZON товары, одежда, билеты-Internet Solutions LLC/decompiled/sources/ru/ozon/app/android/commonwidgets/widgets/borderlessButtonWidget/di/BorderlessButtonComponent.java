package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.di;

import Vg.d;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper.BorderlessButtonMapper;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation.BorderlessButtonViewFactory;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u000fJ\u0013\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/di/BorderlessButtonComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/mapper/BorderlessButtonMapper;", "getMapper", "()Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/mapper/BorderlessButtonMapper;", "mapper", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonViewFactory;", "getViewFactory", "()Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonViewFactory;", "viewFactory", "Factory", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BorderlessButtonComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/di/BorderlessButtonComponent$Factory;", "", "create", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/di/BorderlessButtonComponent;", "customActionHandlersComponentApi", "Lru/ozon/app/android/action/custom/di/CustomActionHandlersComponentApi;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        BorderlessButtonComponent create(@NotNull CustomActionHandlersComponentApi customActionHandlersComponentApi);
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    BorderlessButtonMapper getMapper();

    @NotNull
    BorderlessButtonViewFactory getViewFactory();
}
