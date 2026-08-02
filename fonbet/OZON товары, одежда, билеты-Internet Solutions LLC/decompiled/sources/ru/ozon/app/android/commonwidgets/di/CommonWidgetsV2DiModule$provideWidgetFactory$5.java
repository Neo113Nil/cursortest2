package ru.ozon.app.android.commonwidgets.di;

import Vg.c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk20/g;", "LVg/c;", "invoke", "(Lk20/g;)LVg/c;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class CommonWidgetsV2DiModule$provideWidgetFactory$5 extends AbstractC7737t implements Function1<C7475g, c> {
    public static final CommonWidgetsV2DiModule$provideWidgetFactory$5 INSTANCE = new CommonWidgetsV2DiModule$provideWidgetFactory$5();

    CommonWidgetsV2DiModule$provideWidgetFactory$5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final c invoke(C7475g commonButtonStackWidget) {
        Intrinsics.checkNotNullParameter(commonButtonStackWidget, "$this$commonButtonStackWidget");
        return ((CommonActionHandlersFactoryComponent) commonButtonStackWidget.getComponent(CommonActionHandlersFactoryComponent.class)).getCommonActionHandlersStore();
    }
}
