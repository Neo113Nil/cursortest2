package ru.ozon.app.android.search.producttilebuttons.binders.multiButton;

import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.button.SwitchingButton;
import ru.ozon.app.android.cart.ui.CartAtomBinder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.model.MultiButtonModel;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.BaseSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonSingleAtomDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u00013\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0002\b\u00030\u0018j\u0006\u0012\u0002\b\u0003`\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010$\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!¢\u0006\u0004\b$\u0010%J1\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&2\u0006\u0010\u001d\u001a\u00020\u000f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010-R\u0016\u0010\u001e\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010.R\"\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00100!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonItemBinder;", "", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "cartAtomBinder", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonSingleAtomDelegate;", "switchingButtonBinder", "<init>", "(Lru/ozon/app/android/cart/ui/CartAtomBinder;Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonSingleAtomDelegate;)V", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "", "width", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;)I", "", "needClip", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;)Z", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "", "updateViewProperties", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;ZI)V", "onAttach", "()V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "vh", "init", "(Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "atomView", "composerReferences", "Landroidx/lifecycle/J;", "lifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "prepare", "(Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lru/ozon/app/android/composer/ComposerReferences;Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;", "model", "bind", "(Lru/ozon/app/android/search/searchscreen/presentation/components/searchresults/common/presentation/multiButton/model/MultiButtonModel$ButtonModel;Lru/ozon/uni/atoms/v3/containers/SingleAtom;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/cart/ui/CartAtomBinder;", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonSingleAtomDelegate;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "Landroidx/lifecycle/J;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttonModel", "Lru/ozon/uni/atoms/data/AtomDTO;", "ru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonItemBinder$observer$1", "observer", "Lru/ozon/app/android/search/producttilebuttons/binders/multiButton/MultiButtonItemBinder$observer$1;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MultiButtonItemBinder {
    private Function1<? super AtomAction, Unit> actionHandler;
    private SingleAtom atomView;
    private AtomDTO buttonModel;

    @NotNull
    private final CartAtomBinder cartAtomBinder;
    private ComposerReferences composerReferences;
    private J lifecycleOwner;

    @NotNull
    private final MultiButtonItemBinder$observer$1 observer;

    @NotNull
    private final SwitchingButtonSingleAtomDelegate switchingButtonBinder;

    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonItemBinder$observer$1] */
    public MultiButtonItemBinder(@NotNull CartAtomBinder cartAtomBinder, @NotNull SwitchingButtonSingleAtomDelegate switchingButtonBinder) {
        Intrinsics.checkNotNullParameter(cartAtomBinder, "cartAtomBinder");
        Intrinsics.checkNotNullParameter(switchingButtonBinder, "switchingButtonBinder");
        this.cartAtomBinder = cartAtomBinder;
        this.switchingButtonBinder = switchingButtonBinder;
        this.observer = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.search.producttilebuttons.binders.multiButton.MultiButtonItemBinder$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onCreate(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                MultiButtonItemBinder.this.onAttach();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                MultiButtonItemBinder.this.onDetach();
            }
        };
    }

    private final boolean needClip(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        return addToCartButtonWithQuantity.getButtonSizeMode() != ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL || addToCartButtonWithQuantity.getSellerIcon() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAttach() {
        AtomDTO atomDTO = this.buttonModel;
        if (!(atomDTO instanceof ButtonV3Atom.AddToCartAtom)) {
            if (atomDTO instanceof SwitchingButton) {
                SwitchingButtonSingleAtomDelegate switchingButtonSingleAtomDelegate = this.switchingButtonBinder;
                SingleAtom singleAtom = this.atomView;
                if (singleAtom != null) {
                    switchingButtonSingleAtomDelegate.attach(singleAtom);
                    return;
                } else {
                    Intrinsics.n("atomView");
                    throw null;
                }
            }
            return;
        }
        CartAtomBinder cartAtomBinder = this.cartAtomBinder;
        SingleAtom singleAtom2 = this.atomView;
        if (singleAtom2 == null) {
            Intrinsics.n("atomView");
            throw null;
        }
        ComposerReferences composerReferences = this.composerReferences;
        if (composerReferences != null) {
            cartAtomBinder.init(singleAtom2, composerReferences.getTokenizedAnalytics());
        } else {
            Intrinsics.n("composerReferences");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDetach() {
        this.cartAtomBinder.unbind();
        this.switchingButtonBinder.detach();
        this.cartAtomBinder.setAdultDialogCommitListener(null);
    }

    private final void updateViewProperties(SingleAtom singleAtom, boolean z11, int i11) {
        if (singleAtom.getClipChildren() != z11) {
            singleAtom.setClipChildren(z11);
        }
        if (singleAtom.getClipToPadding() != z11) {
            singleAtom.setClipToPadding(z11);
        }
        ViewGroup.LayoutParams layoutParams = singleAtom.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = null;
        }
        if (layoutParams == null || layoutParams.width != i11) {
            ViewGroup.LayoutParams layoutParams2 = singleAtom.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = i11;
            singleAtom.setLayoutParams(layoutParams2);
        }
    }

    private final int width(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        return addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL ? -1 : -2;
    }

    public final void bind(@NotNull MultiButtonModel.ButtonModel model, @NotNull SingleAtom atomView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(atomView, "atomView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.buttonModel = model.getButton();
        this.atomView = atomView;
        if (atomView == null) {
            Intrinsics.n("atomView");
            throw null;
        }
        ViewExtKt.showOrGoneByPresence(atomView, model);
        AtomDTO button = model.getButton();
        boolean z11 = true;
        if (button instanceof ButtonV3Atom.AddToCartAtom) {
            CartAtomBinder cartAtomBinder = this.cartAtomBinder;
            ComposerReferences composerReferences = this.composerReferences;
            if (composerReferences == null) {
                Intrinsics.n("composerReferences");
                throw null;
            }
            cartAtomBinder.init(atomView, composerReferences.getTokenizedAnalytics());
            CartAtomBinder cartAtomBinder2 = this.cartAtomBinder;
            SingleAtom singleAtom = this.atomView;
            if (singleAtom == null) {
                Intrinsics.n("atomView");
                throw null;
            }
            AtomDTO button2 = model.getButton();
            ComposerReferences composerReferences2 = this.composerReferences;
            if (composerReferences2 == null) {
                Intrinsics.n("composerReferences");
                throw null;
            }
            cartAtomBinder2.bind(singleAtom, button2, actionHandler, composerReferences2.getTokenizedAnalytics(), Long.valueOf(model.getWidgetId()));
            if (model.getButton() instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) {
                z11 = needClip((ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) model.getButton());
                r10 = width((ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) model.getButton());
            }
            this.cartAtomBinder.bindAdult(model.getIsAdult());
        } else if (button instanceof SwitchingButton) {
            BaseSwitchingButtonDelegate.bind$default(this.switchingButtonBinder, (SwitchingButton) model.getButton(), atomView, false, 4, null);
            this.switchingButtonBinder.attach(atomView);
        } else if (button instanceof ButtonV3Atom.ResizableSmallButton) {
            r10 = ((ButtonV3Atom.ResizableSmallButton) model.getButton()).getButtonSizeMode() == ButtonV3Atom.ResizableSmallButton.ButtonSizeMode.SIZE_MODE_FILL ? -1 : -2;
            SingleAtom singleAtom2 = this.atomView;
            if (singleAtom2 == null) {
                Intrinsics.n("atomView");
                throw null;
            }
            SingleAtom.bind$default(singleAtom2, model.getButton(), false, 2, null);
            SingleAtom singleAtom3 = this.atomView;
            if (singleAtom3 == null) {
                Intrinsics.n("atomView");
                throw null;
            }
            singleAtom3.setOnAction(actionHandler);
        } else {
            SingleAtom singleAtom4 = this.atomView;
            if (singleAtom4 == null) {
                Intrinsics.n("atomView");
                throw null;
            }
            SingleAtom.bind$default(singleAtom4, model.getButton(), false, 2, null);
            SingleAtom singleAtom5 = this.atomView;
            if (singleAtom5 == null) {
                Intrinsics.n("atomView");
                throw null;
            }
            singleAtom5.setOnAction(actionHandler);
        }
        updateViewProperties(atomView, z11, r10);
    }

    public final void init(@NotNull ComposerReferences refs, @NotNull k<?> vh2) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(vh2, "vh");
        this.switchingButtonBinder.init(refs, vh2);
    }

    public final void prepare(@NotNull SingleAtom atomView, @NotNull ComposerReferences composerReferences, @NotNull J lifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(atomView, "atomView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.atomView = atomView;
        this.lifecycleOwner = lifecycleOwner;
        this.composerReferences = composerReferences;
        this.actionHandler = actionHandler;
        if (atomView == null) {
            Intrinsics.n("atomView");
            throw null;
        }
        atomView.setOnAction(actionHandler);
        lifecycleOwner.getLifecycle().a(this.observer);
    }
}
