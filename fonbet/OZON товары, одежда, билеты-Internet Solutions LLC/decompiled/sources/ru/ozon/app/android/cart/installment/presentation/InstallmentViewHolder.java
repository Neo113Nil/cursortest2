package ru.ozon.app.android.cart.installment.presentation;

import Ae.C2399j;
import Vg.d;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.K;
import d20.AbstractC6064a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/cart/installment/presentation/InstallmentViewHolder;", "Ld20/a;", "Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "Ll10/i;", "container", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lkotlin/Function1;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "viewFactory", "<init>", "(Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;Ll10/i;LVg/d;Lkotlin/jvm/functions/Function1;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/cart/installment/presentation/InstallmentVO;)V", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstallmentViewHolder extends AbstractC6064a<InstallmentVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final TotalVisibilityViewModel totalVisibilityViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallmentViewHolder(@NotNull TotalVisibilityViewModel totalVisibilityViewModel, @NotNull i container, @NotNull d customActionHandlersStoreFactory, @NotNull Function1<? super LinearLayout, ? extends View> viewFactory) {
        super(container, new InstallmentViewHolder$sam$ru_ozon_composer_ui_widget_overlay_holder_ViewFactory$0(viewFactory));
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.totalVisibilityViewModel = totalVisibilityViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new InstallmentViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(this.totalVisibilityViewModel.isVisibleFlow(), getView(), null, new InstallmentViewHolder$onWidgetCreated$1(null), 2, null), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull InstallmentVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        View view = getView();
        Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.app.android.cart.installment.presentation.InstallmentView");
        InstallmentView installmentView = (InstallmentView) view;
        CellHolderKt.bind(installmentView.getCell(), item.getCell(), this.actionHandler);
        installmentView.updateMargins(item.getMargins());
        installmentView.configureWidgetContainerSettings(item.getWidgetContainerSettings());
        installmentView.setVisibility(this.totalVisibilityViewModel.isVisibleFlow().getValue().booleanValue() ? 8 : 0);
    }
}
