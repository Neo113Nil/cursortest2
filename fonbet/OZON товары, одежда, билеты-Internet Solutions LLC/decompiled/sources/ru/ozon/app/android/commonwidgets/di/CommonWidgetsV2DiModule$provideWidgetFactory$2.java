package ru.ozon.app.android.commonwidgets.di;

import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.actions.ActionHandlersFactory;
import ru.ozon.app.android.platform.customActionHandlers.commonActionHandlersFactory.CommonActionHandlersFactoryComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk20/g;", "Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "invoke", "(Lk20/g;)Lru/ozon/android/composerCommonViewKit/actions/ActionHandlersFactory;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonWidgetsV2DiModule$provideWidgetFactory$2 extends AbstractC7737t implements Function1<C7475g, ActionHandlersFactory> {
    public static final CommonWidgetsV2DiModule$provideWidgetFactory$2 INSTANCE = new CommonWidgetsV2DiModule$provideWidgetFactory$2();

    CommonWidgetsV2DiModule$provideWidgetFactory$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActionHandlersFactory invoke(C7475g EmptyStateWidget) {
        Intrinsics.checkNotNullParameter(EmptyStateWidget, "$this$EmptyStateWidget");
        return ((CommonActionHandlersFactoryComponentApi) EmptyStateWidget.getComponent(CommonActionHandlersFactoryComponentApi.class)).getActionHandlersFactory();
    }
}
