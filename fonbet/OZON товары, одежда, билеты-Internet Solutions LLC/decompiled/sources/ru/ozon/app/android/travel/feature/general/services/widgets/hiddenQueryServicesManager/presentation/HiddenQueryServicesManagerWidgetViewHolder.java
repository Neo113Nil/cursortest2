package ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.presentation;

import Vg.d;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.G;
import androidx.fragment.app.ComponentCallbacksC5392m;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import l10.t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\rR\u0018\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/widgets/hiddenQueryServicesManager/presentation/HiddenQueryServicesManagerWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/services/widgets/hiddenQueryServicesManager/presentation/HiddenQueryServicesManagerVO;", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;LVg/d;)V", "item", "", "performActionAndRemoveWidget", "(Lru/ozon/app/android/travel/feature/general/services/widgets/hiddenQueryServicesManager/presentation/HiddenQueryServicesManagerVO;)V", "", "error", "showError", "(Ljava/lang/String;)V", "bind", "LVg/d;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "containerView", "Ll10/b;", "controller", "Ll10/b;", "Ll10/t;", "ownerContainer", "Ll10/t;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HiddenQueryServicesManagerWidgetViewHolder extends AbstractC6065b<HiddenQueryServicesManagerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final d customActionHandlersStoreFactory;
    private final View metricView;

    @NotNull
    private final t ownerContainer;

    public HiddenQueryServicesManagerWidgetViewHolder(@NotNull i container, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.containerView = container.Y();
        this.controller = container.M();
        this.ownerContainer = container.K();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new HiddenQueryServicesManagerWidgetViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performActionAndRemoveWidget(HiddenQueryServicesManagerVO item) {
        AtomAction action = item.getAction();
        if (action != null) {
            this.actionHandler.invoke(action);
        }
        String error = item.getError();
        if (error != null) {
            showError(error);
        }
        this.controller.m(item.getId());
    }

    private final void showError(String error) {
        ViewGroup rootView;
        ComponentCallbacksC5392m b11 = this.ownerContainer.b();
        if (b11 == null || (rootView = ContextExtKt.getRootView(b11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, error, null, null, null, this.ownerContainer.f(), 58, null).show();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull final HiddenQueryServicesManagerVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        final View view = this.containerView;
        G.a(view, new Runnable() { // from class: ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.presentation.HiddenQueryServicesManagerWidgetViewHolder$bind$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                this.performActionAndRemoveWidget(item);
            }
        });
    }
}
