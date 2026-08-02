package ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"hasAction", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "getHasAction", "(Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;)Z", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DynamicElementVOV2Kt {
    public static final boolean getHasAction(@NotNull DynamicElementVOV2 dynamicElementVOV2) {
        Intrinsics.checkNotNullParameter(dynamicElementVOV2, "<this>");
        if (!(dynamicElementVOV2 instanceof DynamicElementVOV2.Atom)) {
            if (dynamicElementVOV2 instanceof DynamicElementVOV2.ProgressiveText) {
                return ((DynamicElementVOV2.ProgressiveText) dynamicElementVOV2).getProgressiveText().getAction() != null;
            }
            if ((dynamicElementVOV2 instanceof DynamicElementVOV2.Badges) || (dynamicElementVOV2 instanceof DynamicElementVOV2.PriceList) || (dynamicElementVOV2 instanceof DynamicElementVOV2.VerticalSpacer)) {
                return false;
            }
            throw new o();
        }
        DynamicElementVOV2.Atom atom = (DynamicElementVOV2.Atom) dynamicElementVOV2;
        AtomDTO atom2 = atom.getAtom();
        if (atom2 instanceof DisclaimerAtom) {
            return ((DisclaimerAtom) atom.getAtom()).getButtons() != null;
        }
        if (atom2 instanceof CellDTO) {
            CommonControlSettings common = ((CellDTO) atom.getAtom()).getCommon();
            if ((common != null ? common.getAction() : null) != null) {
                return true;
            }
        }
        return false;
    }
}
