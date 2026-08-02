package ru.ozon.app.android.cart.alltocart.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.alltocart.core.AllToCartDTO;
import ru.ozon.app.android.cart.feature.databinding.WidgetAllToCartBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR#\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00100\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/cart/alltocart/presentation/AllToCartHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Landroid/view/View;Lru/ozon/app/android/cart/alltocart/presentation/AllToCartViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "isActive", "", "bindButton", "(Z)V", "observeButtonState", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "extractButton", "(Z)Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/cart/alltocart/presentation/AllToCartVO;Ll20/d;)V", "Lru/ozon/app/android/cart/alltocart/presentation/AllToCartViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/feature/databinding/WidgetAllToCartBinding;", "binding", "Lru/ozon/app/android/cart/feature/databinding/WidgetAllToCartBinding;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AllToCartHolder extends k<AllToCartVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetAllToCartBinding binding;

    @NotNull
    private final AllToCartViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllToCartHolder(@NotNull View containerView, @NotNull AllToCartViewModel viewModel, @NotNull ComposerReferences references, @NotNull HandlersInhibitor inhibitor) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(references, this).enableClickThrottling(inhibitor).onComposerAction(new AllToCartHolder$actionHandler$1(this)).buildHandler();
        WidgetAllToCartBinding bind = WidgetAllToCartBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        viewModel.attachTokenizedAnalytics(references.getTokenizedAnalytics());
        observeButtonState(references);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(boolean isActive) {
        LargeButtonView btnAllToCart = this.binding.btnAllToCart;
        Intrinsics.checkNotNullExpressionValue(btnAllToCart, "btnAllToCart");
        LargeButtonHolderKt.bindOrGone(btnAllToCart, extractButton(isActive), this.actionHandler);
    }

    private final ButtonV3Atom.LargeButton extractButton(boolean z11) {
        AllToCartDTO.CartSwitchingButton button;
        AllToCartDTO.CartSwitchingButton button2;
        if (z11) {
            AllToCartVO boundedData = getBoundedData();
            if (boundedData == null || (button2 = boundedData.getButton()) == null) {
                return null;
            }
            return button2.getActiveButton();
        }
        AllToCartVO boundedData2 = getBoundedData();
        if (boundedData2 == null || (button = boundedData2.getButton()) == null) {
            return null;
        }
        return button.getDefaultButton();
    }

    private final void observeButtonState(ComposerReferences references) {
        this.viewModel.getAllToCartButtonState().observe(references.getContainer().g(), new AllToCartHolder$sam$androidx_lifecycle_Observer$0(new AllToCartHolder$observeButtonState$1(this)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AllToCartVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.viewModel.updateVo(item);
    }
}
