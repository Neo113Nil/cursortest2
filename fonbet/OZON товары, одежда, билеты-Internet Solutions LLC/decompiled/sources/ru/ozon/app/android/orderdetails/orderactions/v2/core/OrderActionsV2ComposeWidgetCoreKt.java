package ru.ozon.app.android.orderdetails.orderactions.v2.core;

import d00.C6020f;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.FetchCancelReasonsActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.gocheckout.GoCheckoutActionHandler;
import ru.ozon.app.android.delivery.customActionsHandlers.reorder.ReorderActionHandler;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionHandler;
import ru.ozon.composer.compose.widget.k;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\"\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln20/i;", "orderActionsV2WidgetFactory", "()Ln20/i;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "SUPPORTED_ACTIONS", "Ljava/util/Set;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OrderActionsV2ComposeWidgetCoreKt {

    @NotNull
    private static final Set<Class<? extends CustomActionHandler>> SUPPORTED_ACTIONS;

    static {
        Class[] elements = {ReorderActionHandler.class, FetchCancelReasonsActionHandler.class, GoCheckoutActionHandler.class, ComposerActionWithActionHandler.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        SUPPORTED_ACTIONS = C7705l.j0(elements);
    }

    @NotNull
    public static final i orderActionsV2WidgetFactory() {
        return C6020f.a("csma", "orderActions", k.a(2), OrderActionsV2ComposeWidgetCoreKt$orderActionsV2WidgetFactory$1.INSTANCE);
    }
}
