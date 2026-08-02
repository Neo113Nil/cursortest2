package ru.ozon.app.android.storefront.widgets.navigationSliderV3.di;

import Vg.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "invoke", "()LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavigationSliderV3WidgetComponent$actionHandlersStore$2 extends AbstractC7737t implements Function0<c> {
    final /* synthetic */ NavigationSliderV3WidgetComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV3WidgetComponent$actionHandlersStore$2(NavigationSliderV3WidgetComponent navigationSliderV3WidgetComponent) {
        super(0);
        this.this$0 = navigationSliderV3WidgetComponent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final c invoke() {
        CustomActionHandlersComponentApi customActionHandlersComponentApi;
        customActionHandlersComponentApi = this.this$0.getCustomActionHandlersComponentApi();
        return customActionHandlersComponentApi.getCustomActionHandlersStoreFactory().create(ComposerActionWithActionHandler.class);
    }
}
