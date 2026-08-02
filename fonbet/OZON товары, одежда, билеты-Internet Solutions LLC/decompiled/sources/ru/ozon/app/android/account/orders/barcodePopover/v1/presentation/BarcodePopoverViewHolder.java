package ru.ozon.app.android.account.orders.barcodePopover.v1.presentation;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.barcodePopover.v1.viewObject.BarcodePopoverVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import xe.C10727i;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverWidgetView;", "barcodeView", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverWidgetView;Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "setBarcode", "(Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/barcodePopover/v1/viewObject/BarcodePopoverVO;Ll20/d;)V", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverWidgetView;", "Lru/ozon/app/android/account/orders/barcodePopover/v1/presentation/BarcodePopoverViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodePopoverViewHolder extends k<BarcodePopoverVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final BarcodePopoverWidgetView barcodeView;

    @NotNull
    private final BarcodePopoverViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BarcodePopoverViewHolder(@NotNull BarcodePopoverWidgetView barcodeView, @NotNull BarcodePopoverViewModel viewModel, @NotNull ComposerReferences refs) {
        super(barcodeView);
        View view;
        RecyclerView composerRecyclerView;
        Intrinsics.checkNotNullParameter(barcodeView, "barcodeView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.barcodeView = barcodeView;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        if (c11 == null || (view = c11.getView()) == null || (composerRecyclerView = ComposerViewExtensionKt.composerRecyclerView(view)) == null) {
            return;
        }
        composerRecyclerView.setOverScrollMode(2);
    }

    private final void setBarcode(BarcodePopoverVO item) {
        C10727i.c(K.a(this), null, null, new BarcodePopoverViewHolder$setBarcode$1(this, item, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull BarcodePopoverVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        BarcodePopoverWidgetView barcodePopoverWidgetView = this.barcodeView;
        TextHolderKt.bind$default(barcodePopoverWidgetView.getTitleTav(), item.getTitle(), null, 2, null);
        IconButtonV3HolderKt.bind(barcodePopoverWidgetView.getIconButtonView(), item.getCloseButton(), this.actionHandler);
        setBarcode(item);
        this.barcodeView.requestLayout();
    }
}
