package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.product.common.core.ButtonSizeModel;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0002\u001a\u00020\u0003*\u0004\u0018\u00010\u0004H\u0000\u001a\u000e\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u0004H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\u0003*\u00020\u0004H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"buttonWidth140", "", "isSellerButton", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "getWidthModel", "Lru/ozon/app/android/product/common/core/ButtonSizeModel;", "getWidth", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$ResizableSmallButton;", "getClipFlag", "getWidthButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$AddToCartAtom$AddToCartButtonWithQuantity;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ButtonAtomUtilsKt {
    private static final int buttonWidth140 = UiExtKt.toPx(140);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonV3Atom.ResizableSmallButton.ButtonSizeMode.values().length];
            try {
                iArr[ButtonV3Atom.ResizableSmallButton.ButtonSizeMode.SIZE_MODE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3Atom.ResizableSmallButton.ButtonSizeMode.SIZE_MODE_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3Atom.ResizableSmallButton.ButtonSizeMode.SIZE_MODE_140.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.values().length];
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_140.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean getClipFlag(@NotNull AtomDTO atomDTO) {
        Intrinsics.checkNotNullParameter(atomDTO, "<this>");
        if (!(atomDTO instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity)) {
            return true;
        }
        ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atomDTO;
        return !(addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL || addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_140) || addToCartButtonWithQuantity.getSellerIcon() == null;
    }

    public static final int getWidth(@NotNull ButtonV3Atom.ResizableSmallButton resizableSmallButton) {
        Intrinsics.checkNotNullParameter(resizableSmallButton, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[resizableSmallButton.getButtonSizeMode().ordinal()];
        if (i11 == 1) {
            return -2;
        }
        if (i11 == 2) {
            return -1;
        }
        if (i11 == 3) {
            return buttonWidth140;
        }
        throw new o();
    }

    public static final int getWidthButton(@NotNull ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity) {
        Intrinsics.checkNotNullParameter(addToCartButtonWithQuantity, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[addToCartButtonWithQuantity.getButtonSizeMode().ordinal()];
        if (i11 == 1) {
            return -2;
        }
        if (i11 == 2) {
            return -1;
        }
        if (i11 == 3) {
            return buttonWidth140;
        }
        throw new o();
    }

    @NotNull
    public static final ButtonSizeModel getWidthModel(AtomDTO atomDTO) {
        return atomDTO instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity ? new ButtonSizeModel(getWidthButton((ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atomDTO), getClipFlag(atomDTO)) : atomDTO instanceof ButtonV3Atom.ResizableSmallButton ? new ButtonSizeModel(getWidth((ButtonV3Atom.ResizableSmallButton) atomDTO), true) : new ButtonSizeModel(-2, true);
    }

    public static final boolean isSellerButton(AtomDTO atomDTO) {
        if ((atomDTO instanceof ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity ? (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atomDTO : null) != null) {
            ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity addToCartButtonWithQuantity = (ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity) atomDTO;
            if (addToCartButtonWithQuantity.getButtonSizeMode() == ButtonV3Atom.AddToCartAtom.AddToCartButtonWithQuantity.ButtonSizeMode.SIZE_MODE_FILL && addToCartButtonWithQuantity.getSellerIcon() != null) {
                return true;
            }
        }
        return false;
    }
}
