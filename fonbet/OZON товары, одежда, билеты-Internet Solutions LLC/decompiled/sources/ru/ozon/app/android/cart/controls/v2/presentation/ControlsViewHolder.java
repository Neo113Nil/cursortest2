package ru.ozon.app.android.cart.controls.v2.presentation;

import AW.a;
import AW.b;
import Vg.c;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.scroll.ScrollUtilsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0018\u00010\fj\u0004\u0018\u0001`\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00120\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/cart/controls/v2/presentation/ControlsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsView;", "containerView", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function0;", "LVg/c;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStore;", "handlersStoreProvider", "<init>", "(Lru/ozon/app/android/cart/controls/v2/presentation/ControlsView;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function0;)V", "item", "", "processCheckBoxClick", "(Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;)Lkotlin/Unit;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cart/controls/v2/presentation/ControlsVO;Ll20/d;)V", "Lru/ozon/app/android/cart/controls/v2/presentation/ControlsView;", "getContainerView", "()Lru/ozon/app/android/cart/controls/v2/presentation/ControlsView;", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControlsViewHolder extends k<ControlsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ControlsView containerView;

    @NotNull
    private final HandlersInhibitor handlersInhibitor;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlsViewHolder(@NotNull ControlsView containerView, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs, @NotNull Function0<? extends c> handlersStoreProvider) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(handlersStoreProvider, "handlersStoreProvider");
        this.containerView = containerView;
        this.handlersInhibitor = handlersInhibitor;
        this.refs = refs;
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(handlersStoreProvider).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$0(ControlsViewHolder controlsViewHolder, ControlsVO controlsVO, View view) {
        HandlersInhibitor.run$default(controlsViewHolder.handlersInhibitor, 0L, new ControlsViewHolder$bind$1$1$1(controlsViewHolder, controlsVO), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$2$lambda$1(ControlsViewHolder controlsViewHolder, ControlsVO controlsVO, View view) {
        HandlersInhibitor.run$default(controlsViewHolder.handlersInhibitor, 0L, new ControlsViewHolder$bind$1$2$1(controlsViewHolder, controlsVO), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit processCheckBoxClick(ControlsVO item) {
        ControlsView containerView = getContainerView();
        if (item.getSelectAll().isSelected() != null) {
            containerView.getCheckboxTv().setSelected(!containerView.getCheckboxTv().isSelected());
        }
        AtomAction action = item.getSelectAll().getAction();
        if (!(action instanceof AtomAction.Refresh)) {
            this.actionHandler.invoke(action);
            return Unit.f71690a;
        }
        String link = ((AtomAction.Refresh) action).getLink();
        if (link == null) {
            return null;
        }
        ScrollUtilsKt.refreshWithScroll(this.refs, link);
        return Unit.f71690a;
    }

    @NotNull
    public ControlsView getContainerView() {
        return this.containerView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ControlsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        ControlsView containerView = getContainerView();
        containerView.bind(item);
        int i11 = 1;
        containerView.getCheckboxTv().setOnClickListener(new a(i11, this, item));
        containerView.getCheckbox().setOnCheckedChangeListener(null);
        containerView.getCheckbox().setOnClickListener(new b(i11, this, item));
        containerView.setOnActionBtnClick(new ControlsViewHolder$bind$1$3(this));
    }
}
