package ru.ozon.app.android.atoms.v3.holders.buttons.cart;

import android.content.Context;
import gk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityListener;
import ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.UpdateMode;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001dB\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J\b\u0010\u000f\u001a\u00020\rH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0002J\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\u0002H\u0002J\f\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0002¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/atoms/v3/holders/buttons/cart/AddToCartButtonWithQuantityHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/uikit/view/atoms/buttons/addtocart/AddToCartButtonWithQuantityView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "onRecycle", "determineStepChange", "", "updateMode", "Lru/ozon/uni/atoms/data/button/UpdateMode;", "currentQuantity", "initChangeCountClickListeners", "sendPlusAction", "sendMinusAction", "extractIcon", "extractSellerIcon", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity$SellerIcon;", "extractQtyIsDisabled", "", "Companion", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddToCartButtonWithQuantityHolder extends AtomV3<ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity, AddToCartButtonWithQuantityView> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateMode.values().length];
            try {
                iArr[UpdateMode.UPDATE_MODE_MIN_ITEMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateMode.UPDATE_MODE_STEP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToCartButtonWithQuantityHolder(@NotNull AddToCartButtonWithQuantityView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final int determineStepChange(UpdateMode updateMode, int currentQuantity) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[updateMode.ordinal()];
        if (i11 == 1 || i11 != 2) {
            return 1;
        }
        return currentQuantity;
    }

    private final String extractIcon(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        if (addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT) {
            return null;
        }
        return addToCartButtonWithQuantity.getButtonIconId();
    }

    private final boolean extractQtyIsDisabled(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        if (addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT) {
            return false;
        }
        return addToCartButtonWithQuantity.getQtyTextDisabled();
    }

    private final ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.SellerIcon extractSellerIcon(ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        if (addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT) {
            return null;
        }
        return addToCartButtonWithQuantity.getSellerIcon();
    }

    private final void initChangeCountClickListeners() {
        getContainerView().setClickListener(new AddToCartButtonWithQuantityListener() { // from class: ru.ozon.app.android.atoms.v3.holders.buttons.cart.AddToCartButtonWithQuantityHolder$initChangeCountClickListeners$1
            @Override // ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityListener
            public void onCartClick() {
                AddToCartButtonWithQuantityHolder.this.getContainerView().onCartClick();
                AddToCartButtonWithQuantityHolder.this.sendPlusAction();
            }

            @Override // ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityListener
            public void onMinusClick() {
                AddToCartButtonWithQuantityHolder.this.getContainerView().onMinusClick();
                AddToCartButtonWithQuantityHolder.this.sendMinusAction();
            }

            @Override // ru.ozon.app.android.uikit.view.atoms.buttons.addtocart.AddToCartButtonWithQuantityListener
            public void onPlusClick() {
                AddToCartButtonWithQuantityHolder.this.getContainerView().onPlusClick();
                AddToCartButtonWithQuantityHolder.this.sendPlusAction();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void sendMinusAction() {
        String str;
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) getData();
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        ButtonV3Atom.AddToCartAtom.Action action = addToCartButtonWithQuantity.getAction();
        if (action == null || (str = action.getId()) == null) {
            str = "";
        }
        handleAction(AtomActionMapperKt.toAtomAction(new AtomActionDTO(behavior, null, "minusButtonClick", U.j(new Pair("product_id", str), new Pair("count", String.valueOf(getContainerView().getCount())), new Pair("minCount", String.valueOf(getContainerView().getMinCount()))), 2, null), U.c()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void sendPlusAction() {
        String str;
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) getData();
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        ButtonV3Atom.AddToCartAtom.Action action = addToCartButtonWithQuantity.getAction();
        if (action == null || (str = action.getId()) == null) {
            str = "";
        }
        handleAction(AtomActionMapperKt.toAtomAction(new AtomActionDTO(behavior, null, "plusButtonClick", U.j(new Pair("product_id", str), new Pair("count", String.valueOf(getContainerView().getCount())), new Pair("minCount", String.valueOf(getContainerView().getMinCount()))), 2, null), U.c()));
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setClickListener(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AddToCartButtonWithQuantityHolder(@NotNull Context context, String str) {
        this(r0 == null ? new AddToCartButtonWithQuantityView(context, null, 0, 6, null) : r0, str);
        Intrinsics.checkNotNullParameter(context, "context");
        AddToCartButtonWithQuantityView addToCartButtonWithQuantityView = (AddToCartButtonWithQuantityView) q.f64554a.i(N.b(AddToCartButtonWithQuantityView.class), context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity item) {
        Integer quantity;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((AddToCartButtonWithQuantityHolder) item);
        ButtonV3Atom.AddToCartAtom.Action action = item.getAction();
        int intValue = (action == null || (quantity = action.getQuantity()) == null) ? 1 : quantity.intValue();
        int determineStepChange = determineStepChange(item.getMode(), intValue);
        initChangeCountClickListeners();
        AddToCartButtonWithQuantityView containerView = getContainerView();
        containerView.setMinCount(intValue);
        containerView.setAvailableCount(item.getMaxItems());
        containerView.setChangeStep(determineStepChange);
        OzonSpannableString text = item.getText();
        ButtonV3Atom.AddToCartAtom.AddToCartStyle theme = item.getTheme();
        if (theme == null) {
            theme = item.getStyle();
        }
        containerView.bindToCartButton(text, theme, item.getAction() != null, extractIcon(item), extractSellerIcon(item), item.getButtonSizeMode(), extractQtyIsDisabled(item));
        containerView.setCount(item.getCurrentItems());
    }
}
