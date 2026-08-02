package ru.ozon.app.android.account.orders.selectPayment.presentation;

import GI.c;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetSelectPaymentLayoutBinding;
import ru.ozon.app.android.delivery.customActionsHandlers.addcard.SelectPaymentViewModel;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetSelectPaymentLayoutBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "composerRefs", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "viewModel", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetSelectPaymentLayoutBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/selectPayment/presentation/SelectPaymentVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetSelectPaymentLayoutBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/delivery/customActionsHandlers/addcard/SelectPaymentViewModel;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "setAction", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lkotlin/Function1;", "handler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SelectPaymentWidgetViewHolder extends k<SelectPaymentVO> {
    public AtomAction action;

    @NotNull
    private final WidgetSelectPaymentLayoutBinding binding;

    @NotNull
    private final ComposerReferences composerRefs;

    @NotNull
    private final Function1<AtomAction, Unit> handler;

    @NotNull
    private final SelectPaymentViewModel viewModel;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SelectPaymentWidgetViewHolder(@NotNull WidgetSelectPaymentLayoutBinding binding, @NotNull ComposerReferences composerRefs, @NotNull SelectPaymentViewModel viewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.composerRefs = composerRefs;
        this.viewModel = viewModel;
        this.handler = new ActionHandler.Builder(composerRefs, this).onClick(new SelectPaymentWidgetViewHolder$handler$1(this)).onComposerAction(new SelectPaymentWidgetViewHolder$handler$2(this)).buildHandler();
        binding.getConstraintLayout().setOnClickListener(new c(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SelectPaymentWidgetViewHolder selectPaymentWidgetViewHolder, View view) {
        selectPaymentWidgetViewHolder.handler.invoke(selectPaymentWidgetViewHolder.getAction());
    }

    @NotNull
    public final AtomAction getAction() {
        AtomAction atomAction = this.action;
        if (atomAction != null) {
            return atomAction;
        }
        Intrinsics.n("action");
        throw null;
    }

    public final void setAction(@NotNull AtomAction atomAction) {
        Intrinsics.checkNotNullParameter(atomAction, "<set-?>");
        this.action = atomAction;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SelectPaymentVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetSelectPaymentLayoutBinding widgetSelectPaymentLayoutBinding = this.binding;
        setAction(item.getAction());
        ImageView iconIv = widgetSelectPaymentLayoutBinding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
        ImageViewExtKt.loadImageOrGone(iconIv, item.getIcon());
        widgetSelectPaymentLayoutBinding.titleTv.setText(item.getTitle());
        widgetSelectPaymentLayoutBinding.checkboxV.setSelected(item.getIsSelected());
        View checkboxV = widgetSelectPaymentLayoutBinding.checkboxV;
        Intrinsics.checkNotNullExpressionValue(checkboxV, "checkboxV");
        ViewExtKt.showOrGone(checkboxV, Boolean.valueOf(item.getIsSelected()));
    }
}
